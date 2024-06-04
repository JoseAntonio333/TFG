package org.eclipse.glsp.example.javaemf.handler;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.glsp.example.javaemf.ConceptMapModelTypes;
import org.eclipse.glsp.conceptap.model.Concept;
import org.eclipse.glsp.conceptap.model.Course;
import org.eclipse.glsp.conceptap.model.Imported_Concept;
import org.eclipse.glsp.conceptap.model.ModelFactory;
import org.eclipse.glsp.conceptap.model.ModelPackage;
import org.eclipse.glsp.conceptap.model.Topic;
import org.eclipse.glsp.conceptap.model.Uses;
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

//MODIFICACION DE EL MODO DE UNION POR EL IMPORTADO
//HACER LO MISMO EN EL OTRO Y PROBAR!
public class CreateUsesEdgeHandler extends EMFCreateOperationHandler<CreateEdgeOperation>{

    @Inject
    protected EMFNotationModelState modelState;

    @Inject
    protected EMFIdGenerator idGenerator;

    public CreateUsesEdgeHandler() {
        super(ConceptMapModelTypes.USES);
    }

    @Override
    public Optional<Command> createCommand(final CreateEdgeOperation operation) {
        String sourceId = operation.getSourceElementId();
        String targetId = operation.getTargetElementId();

        return Optional.of(createUsesEdge(sourceId, targetId));
    }

    @Override
    public String getLabel() { return "uses"; }

    protected Command createUsesEdge(final String source, final String target) {
        Course course = modelState.getSemanticModel(Course.class).orElseThrow();
        Diagram diagram = modelState.getNotationModel();
        EditingDomain editingDomain = modelState.getEditingDomain();

        boolean imported_origin = false;
        boolean imported_destination = false;

        if(findConceptById(source, course) == null){
            imported_origin = true;
        }

        if(findConceptById(target, course) == null){
            imported_destination = true;
        }  

        CompoundCommand compoundCommand = new CompoundCommand();

        Uses uses = createUsesEdge();

        if(imported_origin == true){
                    
                    List<Topic> topics = course.getTopic();

                    if(topics.isEmpty()){
                        return compoundCommand;
                    }

                    for(Topic topic: topics){
                        
                        List<Imported_Concept> importeds = topic.getImported_concept();

                        for(Imported_Concept imported: importeds){

                            if(imported.getId().equals(source)){
                                uses.setImportedOrigin(findImportedConceptById(source, course));
                                uses.setOrigin(null);
                                if(imported_destination == true){
                                    uses.setImportedDestination(findImportedConceptById(target, course));
                                    uses.setDestination(findConceptById(target, course));
                                }else{
                                    uses.setDestination(findConceptById(target, course));
                                    uses.setImportedDestination(findImportedConceptById(target, course));
                                }
                                

                                Command usesCommand = AddCommand.create(editingDomain, imported,
                                ModelPackage.Literals.IMPORTED_CONCEPT__USES, uses);

                                Edge edge = createEdge(uses.getId());

                                Command edgeCommand = AddCommand.create(editingDomain, diagram,
                                NotationPackage.Literals.DIAGRAM__ELEMENTS, edge);
                                compoundCommand.append(usesCommand);
                                compoundCommand.append(edgeCommand);
                                return compoundCommand;
                            }
                            
                        }

                    }

        }else{
           

                List<Topic> topics = course.getTopic();

                if(topics.isEmpty()){
                    return compoundCommand;
                }

                for(Topic topic: topics){

                    List<Concept> concepts = topic.getConcept();

                    if(concepts.isEmpty()){
                        return compoundCommand;
                    }

                    for(Concept concept: concepts){
                        
                        if(concept.getId().equals(source)){
                            uses.setOrigin(findConceptById(source, course));
                            uses.setImportedOrigin(null);
                            if(imported_destination == true){
                                uses.setImportedDestination(findImportedConceptById(target, course));
                                uses.setDestination(null);
                            }else{
                                uses.setDestination(findConceptById(target, course));
                                uses.setImportedDestination(null);
                            }

                            Command usesCommand = AddCommand.create(editingDomain,concept,
                            ModelPackage.Literals.CONCEPT__USES, uses);

                            Edge edge = createEdge(uses.getId());

                            Command edgeCommand = AddCommand.create(editingDomain, diagram,
                            NotationPackage.Literals.DIAGRAM__ELEMENTS, edge);
                            compoundCommand.append(usesCommand);
                            compoundCommand.append(edgeCommand);
                            return compoundCommand;
                        }
                        
                    }

                    
                }
            
        }

        return compoundCommand;
    }

    protected Uses createUsesEdge() {
        Uses newUses = ModelFactory.eINSTANCE.createUses();
        newUses.setId(UUID.randomUUID().toString());
        return newUses;
    }

    protected Edge createEdge(final String elementId) {
        Edge newUses = NotationFactory.eINSTANCE.createEdge();
        SemanticElementReference reference = NotationFactory.eINSTANCE.createSemanticElementReference();
        reference.setElementId(elementId);
        newUses.setSemanticElement(reference);
        return newUses;
    }

    protected Concept findConceptById(final String conceptId, final Course course) {
       
            List<Topic> topics = course.getTopic();
            for(Topic topic: topics){
                if(topic.getConcept().stream()
                .filter(concept -> conceptId.equals(concept.getId()))
                .findFirst().orElse(null) != null){

                    return topic.getConcept().stream()
                    .filter(concept -> conceptId.equals(concept.getId()))
                    .findFirst().get();
            }
            }
        
        return null;
    }

    protected Imported_Concept findImportedConceptById(final String importedId, final Course course){
            
            List<Topic> topics = course.getTopic();
            for(Topic topic: topics){
                if(topic.getImported_concept().stream()
                .filter(imported -> importedId.equals(imported.getId()))
                .findFirst().orElse(null) != null){

                    return topic.getImported_concept().stream()
                    .filter(imported -> importedId.equals(imported.getId()))
                    .findFirst().get();
            }
            }
            

        return null;
    }
    
}