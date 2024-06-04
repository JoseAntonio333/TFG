package org.eclipse.glsp.example.javaemf.handler;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.glsp.conceptap.model.Concept;
import org.eclipse.glsp.conceptap.model.Course;
import org.eclipse.glsp.conceptap.model.ModelFactory;
import org.eclipse.glsp.conceptap.model.ModelPackage;
import org.eclipse.glsp.conceptap.model.Topic;
import org.eclipse.glsp.example.javaemf.ConceptMapModelTypes;
import org.eclipse.glsp.graph.GModelElement;
import org.eclipse.glsp.graph.GPoint;
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

public class CreateConceptNodeHandler extends EMFCreateOperationHandler<CreateNodeOperation> {
   @Inject
   protected EMFNotationModelState modelState;

   @Inject
   protected EMFIdGenerator idGenerator;

   public CreateConceptNodeHandler() {
      super(ConceptMapModelTypes.CONCEPT);
   }

   @Override
   public Optional<Command> createCommand(final CreateNodeOperation operation) {
      GModelElement container = modelState.getIndex().get(operation.getContainerId()).orElseGet(modelState::getRoot);
      Optional<GPoint> absoluteLocation = operation.getLocation();
      Optional<GPoint> relativeLocation = absoluteLocation
         .map(location -> LayoutUtil.getRelativeLocation(location, container));

      return Optional.of(createConceptAndShape(relativeLocation, container));
   }

   @Override
   public String getLabel() { return "Concept"; }

   protected Command createConceptAndShape(final Optional<GPoint> relativeLocation, GModelElement container) {
      Course course = modelState.getSemanticModel(Course.class).orElseThrow();
      Diagram diagram = modelState.getNotationModel();
      EditingDomain editingDomain = modelState.getEditingDomain();

      CompoundCommand compoundCommand = new CompoundCommand();

      List<Topic> topics = course.getTopic();

      if (topics.isEmpty()) {
         return compoundCommand;
      }

      for (Topic topic : topics) {
         if (container.getId() == topic.getId()) {
            Concept newConcept = createConcept();
            Command conceptCommand = AddCommand.create(editingDomain, topic,
               ModelPackage.Literals.TOPIC__CONCEPT, newConcept);

            Shape shape = createShape(idGenerator.getOrCreateId(newConcept), relativeLocation);
            Command shapeCommand = AddCommand.create(editingDomain, diagram,
               NotationPackage.Literals.DIAGRAM__ELEMENTS, shape);

            compoundCommand.append(conceptCommand);
            compoundCommand.append(shapeCommand);
         }
      }

      return compoundCommand;

   }

   protected Concept createConcept() {
      Concept newConcept = ModelFactory.eINSTANCE.createConcept();
      newConcept.setId(UUID.randomUUID().toString());
      setInitialName(newConcept);
      return newConcept;
   }

   protected void setInitialName(final Concept concept) {
      concept.setConcept_name("New Concept ");
      concept.setAnnotations("Your annotations here...");
   }

   protected Shape createShape(final String elementId, final Optional<GPoint> relativeLocation) {
      Shape newConcept = NotationFactory.eINSTANCE.createShape();
      newConcept.setPosition(relativeLocation.orElse(GraphUtil.point(0, 0)));
      newConcept.setSize(GraphUtil.dimension(60, 25));
      SemanticElementReference reference = NotationFactory.eINSTANCE.createSemanticElementReference();
      reference.setElementId(elementId);
      newConcept.setSemanticElement(reference);
      return newConcept;
   }

}
