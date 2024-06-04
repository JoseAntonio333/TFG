package org.eclipse.glsp.example.javaemf.handler;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.glsp.conceptap.model.Concept;
import org.eclipse.glsp.conceptap.model.Course;
import org.eclipse.glsp.conceptap.model.Feature;
import org.eclipse.glsp.conceptap.model.ModelFactory;
import org.eclipse.glsp.conceptap.model.ModelPackage;
import org.eclipse.glsp.conceptap.model.Topic;
import org.eclipse.glsp.example.javaemf.ConceptMapModelTypes;
import org.eclipse.glsp.graph.GModelElement;
import org.eclipse.glsp.graph.GPoint;
import org.eclipse.glsp.graph.GraphPackage;
import org.eclipse.glsp.graph.util.GraphUtil;
import org.eclipse.glsp.server.emf.EMFCreateOperationHandler;
import org.eclipse.glsp.server.emf.EMFIdGenerator;
import org.eclipse.glsp.server.emf.model.notation.Diagram;
import org.eclipse.glsp.server.emf.model.notation.NotationFactory;
import org.eclipse.glsp.server.emf.model.notation.NotationPackage;
import org.eclipse.glsp.server.emf.model.notation.SemanticElementReference;
import org.eclipse.glsp.server.emf.model.notation.Shape;
import org.eclipse.glsp.server.emf.notation.EMFNotationModelState;
import org.eclipse.glsp.server.operations.CreateNodeOperation;
import org.eclipse.glsp.server.utils.LayoutUtil;

import com.google.inject.Inject;

public class CreateFeatureNodeHandler extends EMFCreateOperationHandler<CreateNodeOperation> {
   @Inject
   protected EMFNotationModelState modelState;

   @Inject
   protected EMFIdGenerator idGenerator;

   public CreateFeatureNodeHandler() {
      super(ConceptMapModelTypes.FEATURE);
   }

   @Override
   public Optional<Command> createCommand(final CreateNodeOperation operation) {
      GModelElement container = modelState.getIndex().get(operation.getContainerId()).orElseGet(modelState::getRoot);
      Optional<GPoint> absoluteLocation = operation.getLocation();
      Optional<GPoint> relativeLocation = absoluteLocation
         .map(location -> LayoutUtil.getRelativeLocation(location, container));
      return Optional.of(createFeatureAndShape(relativeLocation, container));
   }

   @Override
   public String getLabel() { return "Feature"; }

   protected Command createFeatureAndShape(final Optional<GPoint> relativeLocation, final GModelElement container) {
      Course course = modelState.getSemanticModel(Course.class).orElseThrow();
      Diagram diagram = modelState.getNotationModel();
      EditingDomain editingDomain = modelState.getEditingDomain();

      CompoundCommand compoundCommand = new CompoundCommand();

      List<Topic> topics = course.getTopic();

      if (topics.isEmpty()) {
         return compoundCommand;
      }

      for (Topic topic : topics) {

         List<Concept> concepts = topic.getConcept();

         if (concepts.isEmpty()) {
            return compoundCommand;
         }

         for (Concept concept : concepts) {
            // throw new IllegalArgumentException("Element with provided ID cannot be found or is not a GLabel " +
            // container.getId()+ " " + concept.getId());
            if (container.getId() == concept.getId()) {
               Feature newFeature = createFeature();
               Command conceptCommand = AddCommand.create(editingDomain, concept,
                  ModelPackage.Literals.CONCEPT__FEATURE, newFeature);

               Shape featureShape = createShape(idGenerator.getOrCreateId(newFeature), relativeLocation);
               Command shapeCommand = AddCommand.create(editingDomain, diagram,
                  NotationPackage.Literals.DIAGRAM__ELEMENTS, featureShape);

               compoundCommand.append(conceptCommand);
               compoundCommand.append(shapeCommand);

            }

         }

      }

      return compoundCommand;
   }

   protected int setName(Concept concept, EMFNotationModelState modelState) {
      Function<Integer, String> nameProvider = i -> "new" + concept.eClass().getName() + i;
      int nodeCounter = modelState.getIndex().getCounter(GraphPackage.Literals.GLABEL, nameProvider);
      concept.setConcept_name(nameProvider.apply(nodeCounter));
      return nodeCounter;
   }

   protected Feature createFeature() {
      Feature newFeature = ModelFactory.eINSTANCE.createFeature();
      newFeature.setId(UUID.randomUUID().toString());
      setFeatureName(newFeature);
      return newFeature;
   }

   protected void setFeatureName(final Feature feature) {
      // Function<Integer, String> nameProvider = i -> "New" + feature.eClass().getName() + i;
      // int nodeCounter = modelState.getIndex().getCounter(GraphPackage.Literals.GNODE, nameProvider);
      feature.setFeature_name("New Feature");
   }

   protected Shape createShape(final String elementId, final Optional<GPoint> relativeLocation) {
      Shape newFeature = NotationFactory.eINSTANCE.createShape();
      newFeature.setPosition(relativeLocation.orElse(GraphUtil.point(0, 0)));
      newFeature.setSize(GraphUtil.dimension(60, 25));
      SemanticElementReference reference = NotationFactory.eINSTANCE.createSemanticElementReference();
      reference.setElementId(elementId);
      newFeature.setSemanticElement(reference);
      return newFeature;
   }

}
