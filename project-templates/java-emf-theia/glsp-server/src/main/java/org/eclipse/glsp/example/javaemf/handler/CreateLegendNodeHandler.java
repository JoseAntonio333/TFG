package org.eclipse.glsp.example.javaemf.handler;

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

public class CreateLegendNodeHandler extends EMFCreateOperationHandler<CreateNodeOperation>{
    @Inject
   protected EMFNotationModelState modelState;

   @Inject
   protected EMFIdGenerator idGenerator;

   public CreateLegendNodeHandler() {
      super(ConceptMapModelTypes.LEGEND);
   }

   @Override
   public Optional<Command> createCommand(final CreateNodeOperation operation) {
      GModelElement container = modelState.getIndex().get(operation.getContainerId()).orElseGet(modelState::getRoot);
      Optional<GPoint> absoluteLocation = operation.getLocation();
      Optional<GPoint> relativeLocation = absoluteLocation.map(location->LayoutUtil.getRelativeLocation(location, container));

      return Optional.of(createLegendAndShape(relativeLocation));
   }

   @Override
   public String getLabel() { return "Legend"; }

   protected Command createLegendAndShape(final Optional<GPoint> relativeLocation) {
      Course course = modelState.getSemanticModel(Course.class).orElseThrow();
      Diagram diagram = modelState.getNotationModel();
      EditingDomain editingDomain = modelState.getEditingDomain();
         
      CompoundCommand compoundCommand = new CompoundCommand();

         if(course.getLegend().size() < 1){
            
  
            Legend newLegend = createLegend();
            Command captionCommand = AddCommand.create(editingDomain, course,
               ModelPackage.Literals.COURSE__LEGEND, newLegend);
      
            Shape shape = createShape(idGenerator.getOrCreateId(newLegend), relativeLocation);
            Command shapeCommand = AddCommand.create(editingDomain, diagram,
               NotationPackage.Literals.DIAGRAM__ELEMENTS, shape);
      
            compoundCommand.append(captionCommand);
            compoundCommand.append(shapeCommand);
            
         }

         return compoundCommand;
        
   }

   protected Legend createLegend() {
      Legend newCaption = ModelFactory.eINSTANCE.createLegend();
      newCaption.setId(UUID.randomUUID().toString());
      setInitialName(newCaption);
      return newCaption;
   }

   protected void setInitialName(final Legend legend) {
      Function<Integer, String> nameProvider = i -> "New" + legend.eClass().getName() + i;
      int nodeCounter = modelState.getIndex().getCounter(GraphPackage.Literals.GNODE, nameProvider);
      legend.setName(nameProvider.apply(nodeCounter));
   }

   protected Shape createShape(final String elementId, final Optional<GPoint> relativeLocation) {
      Shape newLegend = NotationFactory.eINSTANCE.createShape();
      newLegend.setPosition(relativeLocation.orElse(GraphUtil.point(0, 0)));
      newLegend.setSize(GraphUtil.dimension(60, 25));
      SemanticElementReference reference = NotationFactory.eINSTANCE.createSemanticElementReference();
      reference.setElementId(elementId);
      newLegend.setSemanticElement(reference);
      return newLegend;
   }
}
