package org.eclipse.glsp.example.javaemf.handler;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.glsp.example.javaemf.ConceptMapModelTypes;
import org.eclipse.glsp.conceptap.model.Course;
import org.eclipse.glsp.conceptap.model.ModelFactory;
import org.eclipse.glsp.conceptap.model.ModelPackage;
import org.eclipse.glsp.conceptap.model.Topic;
import org.eclipse.glsp.conceptap.model.After;
import org.eclipse.glsp.server.emf.EMFCreateOperationHandler;
import org.eclipse.glsp.server.emf.EMFIdGenerator;
import org.eclipse.glsp.server.emf.model.notation.Diagram;
import org.eclipse.glsp.server.emf.model.notation.Edge;
import org.eclipse.glsp.server.emf.model.notation.NotationFactory;
import org.eclipse.glsp.server.emf.model.notation.NotationPackage;
import org.eclipse.glsp.server.emf.model.notation.SemanticElementReference;
import org.eclipse.glsp.server.emf.notation.EMFNotationModelState;
import org.eclipse.glsp.server.operations.CreateEdgeOperation;

import com.google.inject.Inject;

public class CreateAfterEdgeHandler extends EMFCreateOperationHandler<CreateEdgeOperation>{

   
    @Inject
    protected EMFNotationModelState modelState;

    @Inject
    protected EMFIdGenerator idGenerator;

    public CreateAfterEdgeHandler() {
        super(ConceptMapModelTypes.AFTER);
    }

    @Override
    public Optional<Command> createCommand(final CreateEdgeOperation operation) {
        String sourceId = operation.getSourceElementId();
        String targetId = operation.getTargetElementId();

        return Optional.of(createAfterEdge(sourceId, targetId));
    }

    @Override
    public String getLabel() { return "after"; }

    protected Command createAfterEdge(final String source, final String target) {
            Course course = modelState.getSemanticModel(Course.class).orElseThrow();
            Diagram diagram = modelState.getNotationModel();
            EditingDomain editingDomain = modelState.getEditingDomain();
        
            CompoundCommand compoundCommand = new CompoundCommand();
        
            
        
                List<Topic> topics = course.getTopic();
        
                if (topics.isEmpty()) {
                    return null; 
                }
                
                for(Topic topic: topics){
                    
                    if(topic.getId().equals(source)){
                        After after = createAfterEdge();

                        after.setOrigin(findTopicById(source, course));
                        after.setDestination(findTopicById(target, course));

                        Command afterCommand = AddCommand.create(editingDomain, topic,
                        ModelPackage.Literals.TOPIC__AFTER, after);

                        Edge edge = createEdge(after.getId());

                        Command edgeCommand = AddCommand.create(editingDomain, diagram,
                        NotationPackage.Literals.DIAGRAM__ELEMENTS, edge);
                        compoundCommand.append(afterCommand);
                        compoundCommand.append(edgeCommand);
                        
                    }
                }  

                return compoundCommand;

    }

    protected After createAfterEdge() {
        After newAfter = ModelFactory.eINSTANCE.createAfter();
        newAfter.setId(UUID.randomUUID().toString());
        return newAfter;
    }

    protected Edge createEdge(final String elementId) {
        Edge newAfter = NotationFactory.eINSTANCE.createEdge();
        SemanticElementReference reference = NotationFactory.eINSTANCE.createSemanticElementReference();
        reference.setElementId(elementId);
        newAfter.setSemanticElement(reference);
        return newAfter;
    }

    protected Topic findTopicById(final String topicId, final Course course) {
        
            if(course.getTopic().stream()
                .filter(topic -> topicId.equals(topic.getId()))
                .findFirst().orElse(null) != null){

                    return course.getTopic().stream()
                    .filter(topic -> topicId.equals(topic.getId()))
                    .findFirst().get();
            }
        return null;
    }
}