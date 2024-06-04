package org.eclipse.glsp.example.javaemf.handler;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.glsp.conceptap.model.Course;
import org.eclipse.glsp.conceptap.model.Imported_Concept;
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

public class CreateImportedConceptHandler extends EMFCreateOperationHandler<CreateNodeOperation> {
   @Inject
   protected EMFNotationModelState modelState;

   @Inject
   protected EMFIdGenerator idGenerator;

   public CreateImportedConceptHandler() {
      super(ConceptMapModelTypes.IMPORTED_CONCEPT);
   }

   @Override
   public Optional<Command> createCommand(final CreateNodeOperation operation) {
      GModelElement container = modelState.getIndex().get(operation.getContainerId()).orElseGet(modelState::getRoot);
      Optional<GPoint> absoluteLocation = operation.getLocation();
      Optional<GPoint> relativeLocation = absoluteLocation
         .map(location -> LayoutUtil.getRelativeLocation(location, container));

      return Optional.of(createImportedConceptAndShape(relativeLocation, container));
   }

   @Override
   public String getLabel() { return "Imported Concept"; }

   protected Command createImportedConceptAndShape(final Optional<GPoint> relativeLocation,
      final GModelElement container) {
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
            Imported_Concept newImportedConcept = createImportedConcept();
            Command importedConceptCommand = AddCommand.create(editingDomain, topic,
               ModelPackage.Literals.TOPIC__IMPORTED_CONCEPT, newImportedConcept);

            Shape shape = createShape(idGenerator.getOrCreateId(newImportedConcept), relativeLocation);
            Command shapeCommand = AddCommand.create(editingDomain, diagram,
               NotationPackage.Literals.DIAGRAM__ELEMENTS, shape);

            compoundCommand.append(importedConceptCommand);
            compoundCommand.append(shapeCommand);
         }
      }

      return compoundCommand;

   }

   protected Imported_Concept createImportedConcept() {
      Imported_Concept newImportedConcept = ModelFactory.eINSTANCE.createImported_Concept();
      newImportedConcept.setId(UUID.randomUUID().toString());
      setInitialName(newImportedConcept);
      return newImportedConcept;
   }

   protected void setInitialName(final Imported_Concept importedConcept) {

      importedConcept.setConcept_name("New Imported Concept");
      importedConcept.setRelatedTopic("Set the name of the related topic here...");
      importedConcept.setUbication("Set de ubication here");
   }

   protected Shape createShape(final String elementId, final Optional<GPoint> relativeLocation) {
      Shape newImportedConcept = NotationFactory.eINSTANCE.createShape();
      newImportedConcept.setPosition(relativeLocation.orElse(GraphUtil.point(0, 0)));
      newImportedConcept.setSize(GraphUtil.dimension(60, 25));
      SemanticElementReference reference = NotationFactory.eINSTANCE.createSemanticElementReference();
      reference.setElementId(elementId);
      newImportedConcept.setSemanticElement(reference);
      return newImportedConcept;
   }

}
