package org.eclipse.glsp.example.javaemf.handler;

import java.util.Optional;
import java.util.UUID;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
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

public class CreateTopicNodeHandler extends EMFCreateOperationHandler<CreateNodeOperation> {
   @Inject
   protected EMFNotationModelState modelState;

   @Inject
   protected EMFIdGenerator idGenerator;

   public CreateTopicNodeHandler() {
      super(ConceptMapModelTypes.TOPIC);
   }

   @Override
   public Optional<Command> createCommand(final CreateNodeOperation operation) {
      GModelElement container = modelState.getIndex().get(operation.getContainerId()).orElseGet(modelState::getRoot);
      Optional<GPoint> absoluteLocation = operation.getLocation();
      Optional<GPoint> relativeLocation = absoluteLocation
         .map(location -> LayoutUtil.getRelativeLocation(location, container));

      return Optional.of(createTaskAndShape(relativeLocation));
   }

   @Override
   public String getLabel() { return "Topic"; }

   protected Command createTaskAndShape(final Optional<GPoint> relativeLocation) {
      Course course = modelState.getSemanticModel(Course.class).orElseThrow();
      Diagram diagram = modelState.getNotationModel();
      EditingDomain editingDomain = modelState.getEditingDomain();

      CompoundCommand compoundCommand = new CompoundCommand();

      Topic newTopic = createTopic();
      Command importedConceptCommand = AddCommand.create(editingDomain, course,
         ModelPackage.Literals.COURSE__TOPIC, newTopic);

      Shape shape = createShape(idGenerator.getOrCreateId(newTopic), relativeLocation);
      Command shapeCommand = AddCommand.create(editingDomain, diagram,
         NotationPackage.Literals.DIAGRAM__ELEMENTS, shape);

      compoundCommand.append(importedConceptCommand);
      compoundCommand.append(shapeCommand);
      return compoundCommand;

   }

   protected Topic createTopic() {
      Topic newTopic = ModelFactory.eINSTANCE.createTopic();
      newTopic.setId(UUID.randomUUID().toString());
      setInitialName(newTopic);
      return newTopic;
   }

   protected void setInitialName(final Topic topic) {
      // Function<Integer, String> nameProvider = i -> "New" + topic.eClass().getName() + i;
      // int nodeCounter = modelState.getIndex().getCounter(GraphPackage.Literals.GNODE, nameProvider);
      topic.setTopic_name("New Topic");
      topic.setAnnotations("Set your annotations here...");
   }

   protected Shape createShape(final String elementId, final Optional<GPoint> relativeLocation) {
      Shape newTopic = NotationFactory.eINSTANCE.createShape();
      newTopic.setPosition(relativeLocation.orElse(GraphUtil.point(0, 0)));
      newTopic.setSize(GraphUtil.dimension(450, 450));
      SemanticElementReference reference = NotationFactory.eINSTANCE.createSemanticElementReference();
      reference.setElementId(elementId);
      newTopic.setSemanticElement(reference);
      return newTopic;
   }
}
