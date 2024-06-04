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

public class CreatePropertiesNodeHandler extends EMFCreateOperationHandler<CreateNodeOperation>{
    @Inject
   protected EMFNotationModelState modelState;

   @Inject
   protected EMFIdGenerator idGenerator;

   public CreatePropertiesNodeHandler() {
      super(ConceptMapModelTypes.PROPERTIES);
   }

   @Override
   public Optional<Command> createCommand(final CreateNodeOperation operation) {
      GModelElement container = modelState.getIndex().get(operation.getContainerId()).orElseGet(modelState::getRoot);
      Optional<GPoint> absoluteLocation = operation.getLocation();
      Optional<GPoint> relativeLocation = absoluteLocation.map(location->LayoutUtil.getRelativeLocation(location, container));

      return Optional.of(createPropertiesAndShape(relativeLocation));
   }

   @Override
   public String getLabel() { return "Properties"; }

   protected Command createPropertiesAndShape(final Optional<GPoint> relativeLocation) {
      Course course = modelState.getSemanticModel(Course.class).orElseThrow();
      Diagram diagram = modelState.getNotationModel();
      EditingDomain editingDomain = modelState.getEditingDomain();

      CompoundCommand compoundCommand = new CompoundCommand();
        
      if(course.getProperties().size() < 1){
         Properties newProperties = createProperties();
         Command propertiesCommand = AddCommand.create(editingDomain, course,
         ModelPackage.Literals.COURSE__PROPERTIES, newProperties);
 
         Shape shape = createShape(idGenerator.getOrCreateId(newProperties), relativeLocation);
         Command shapeCommand = AddCommand.create(editingDomain, diagram,
         NotationPackage.Literals.DIAGRAM__ELEMENTS, shape);
 
         compoundCommand.append(propertiesCommand);
         compoundCommand.append(shapeCommand);
      }  
        return compoundCommand;
        
   }

   protected Properties createProperties() {
      Properties newProperties = ModelFactory.eINSTANCE.createProperties();
      newProperties.setId(UUID.randomUUID().toString());
      setInitialPropertie(newProperties);
      return newProperties;
   }

   protected void setInitialPropertie(final Properties properties) {
      Function<Integer, String> nameProvider = i -> "New" + properties.eClass().getName() + i;
      int nodeCounter = modelState.getIndex().getCounter(GraphPackage.Literals.GNODE, nameProvider);
      properties.setName(nameProvider.apply(nodeCounter));
      properties.setBibliography("Introduce your bibliography here...");
      properties.setPrevious_requirements("Introduce the previous requirements here...");
      properties.setSkills("Introduce the skills here...");
      properties.setAssessment_criteria("Introduce the assesment criteria here...");
      properties.setSubject("Introduce the subject here...");
      properties.setArea("Introduce the area here...");
      properties.setOffer("Introduce the offer here...");
      properties.setSemester("Introduce the semester here...");
      properties.setCredits("Introduce the credits here...");
      properties.setLarge_group_hours("Introduce the Large group Hours here...");
      properties.setSmall_group_hours("Introduce the Small group Hours here...");
      properties.setCoordinator("Introduce the coordinator here...");
   }

   protected Shape createShape(final String elementId, final Optional<GPoint> relativeLocation) {
      Shape newProperties = NotationFactory.eINSTANCE.createShape();
      newProperties.setPosition(relativeLocation.orElse(GraphUtil.point(0, 0)));
      newProperties.setSize(GraphUtil.dimension(60, 25));
      SemanticElementReference reference = NotationFactory.eINSTANCE.createSemanticElementReference();
      reference.setElementId(elementId);
      newProperties.setSemanticElement(reference);
      return newProperties;
   }

   
}