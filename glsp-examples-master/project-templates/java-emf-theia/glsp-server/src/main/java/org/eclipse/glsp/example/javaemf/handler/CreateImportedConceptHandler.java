package org.eclipse.glsp.example.javaemf.handler;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.glsp.example.javaemf.ConceptMapModelTypes;
import org.eclipse.glsp.conceptap.model.*;

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

public class CreateImportedConceptHandler extends EMFCreateOperationHandler<CreateNodeOperation>{
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
      Optional<GPoint> relativeLocation = absoluteLocation.map(location->LayoutUtil.getRelativeLocation(location, container));

      return Optional.of(createImportedConceptAndShape(relativeLocation));
   }

   @Override
   public String getLabel() { return "Imported Concept"; }

   protected Command createImportedConceptAndShape(final Optional<GPoint> relativeLocation) {
      ConceptMap conceptMap = modelState.getSemanticModel(ConceptMap.class).orElseThrow();
      Diagram diagram = modelState.getNotationModel();
      EditingDomain editingDomain = modelState.getEditingDomain();

      List<Course> courses = conceptMap.getCourse();

      if (courses.isEmpty()) {
        return null; 
      }

      CompoundCommand compoundCommand = new CompoundCommand();

      for(Course course: courses){

        List<Topic> topics = course.getTopic();

        if(topics.isEmpty()){
         return null;
        }

        for(Topic topic: topics){
         
            Imported_Concept newImportedConcept = createImportedConcept();
            Command ImportedConceptCommand = AddCommand.create(editingDomain, topic,
            ModelPackage.Literals.TOPIC__IMPORTED_CONCEPT, newImportedConcept);
   
            Shape shape = createShape(idGenerator.getOrCreateId(newImportedConcept), relativeLocation);
            Command shapeCommand = AddCommand.create(editingDomain, diagram,
            NotationPackage.Literals.DIAGRAM__ELEMENTS, shape);
   
            compoundCommand.append(ImportedConceptCommand);
            compoundCommand.append(shapeCommand);
            return compoundCommand;
        }
        
        }

        return null;
      
   }

   protected Imported_Concept createImportedConcept() {
      Imported_Concept newImportedConcept = ModelFactory.eINSTANCE.createImported_Concept();
      newImportedConcept.setId(UUID.randomUUID().toString());
      setInitialName(newImportedConcept);
      return newImportedConcept;
   }

   protected void setInitialName(final Imported_Concept importedConcept) {
      Function<Integer, String> nameProvider = i -> "New" + importedConcept.eClass().getName() + i;
      int nodeCounter = modelState.getIndex().getCounter(GraphPackage.Literals.GNODE, nameProvider);
      importedConcept.setName(nameProvider.apply(nodeCounter));
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
