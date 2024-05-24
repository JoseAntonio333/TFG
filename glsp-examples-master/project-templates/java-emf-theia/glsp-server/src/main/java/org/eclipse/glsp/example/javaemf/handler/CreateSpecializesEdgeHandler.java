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
import org.eclipse.glsp.conceptap.model.ConceptMap;
import org.eclipse.glsp.conceptap.model.Course;
import org.eclipse.glsp.conceptap.model.Imported_Concept;
import org.eclipse.glsp.conceptap.model.ModelFactory;
import org.eclipse.glsp.conceptap.model.ModelPackage;
import org.eclipse.glsp.conceptap.model.Specializes;
import org.eclipse.glsp.conceptap.model.Topic;
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
public class CreateSpecializesEdgeHandler extends EMFCreateOperationHandler<CreateEdgeOperation>{

    @Inject
    protected EMFNotationModelState modelState;

    @Inject
    protected EMFIdGenerator idGenerator;

    public CreateSpecializesEdgeHandler() {
        super(ConceptMapModelTypes.SPECIALIZES);
    }

    @Override
    public Optional<Command> createCommand(final CreateEdgeOperation operation) {
        String sourceId = operation.getSourceElementId();
        String targetId = operation.getTargetElementId();

        return Optional.of(createSpecializesEdge(sourceId, targetId));
    }

    @Override
    public String getLabel() { return "specializes"; }

    protected Command createSpecializesEdge(final String source, final String target) {
        ConceptMap conceptMap = modelState.getSemanticModel(ConceptMap.class).orElseThrow();
        Diagram diagram = modelState.getNotationModel();
        EditingDomain editingDomain = modelState.getEditingDomain();

        boolean imported_origin = false;
        boolean imported_destination = false;

        if(findConceptById(source, conceptMap) == null){
            imported_origin = true;
        }

        if(findConceptById(target, conceptMap) == null){
            imported_destination = true;
        }  

        CompoundCommand compoundCommand = new CompoundCommand();

        Specializes specializes = createSpecializesEdge();

        if(imported_origin == true){

            List<Course> courses = conceptMap.getCourse();

            if(courses.isEmpty()){
                return null;
            }

            for(Course course : courses){
                    
                    List<Topic> topics = course.getTopic();

                    if(topics.isEmpty()){
                        return null;
                    }

                    for(Topic topic: topics){
                        
                        List<Imported_Concept> importeds = topic.getImported_concept();
                        
                        for(Imported_Concept imported: importeds){
                            
                            if(imported.getId().equals(source)){
                                specializes.setImportedOrigin(findImportedConceptById(source, conceptMap));
                                specializes.setOrigin(findConceptById(source, conceptMap));
                                if(imported_destination == true){
                                    specializes.setImportedDestination(findImportedConceptById(target, conceptMap));
                                    specializes.setDestination(findConceptById(target, conceptMap));
                                }else{
                                    specializes.setDestination(findConceptById(target, conceptMap));
                                    specializes.setImportedDestination(findImportedConceptById(target, conceptMap));
                                }
                                

                                Command specializesCommand = AddCommand.create(editingDomain, imported,
                                ModelPackage.Literals.IMPORTED_CONCEPT__SPECIALIZES, specializes);

                                Edge edge = createEdge(specializes.getId());

                                Command edgeCommand = AddCommand.create(editingDomain, diagram,
                                NotationPackage.Literals.DIAGRAM__ELEMENTS, edge);
                                compoundCommand.append(specializesCommand);
                                compoundCommand.append(edgeCommand);
                                return compoundCommand;
                            }
                            
                        }

                        
                    }

                    
            }

        }else{
            List<Course> courses = conceptMap.getCourse();

            if(courses.isEmpty()){
                return null;
            }

            for(Course course : courses){

                List<Topic> topics = course.getTopic();

                if(topics.isEmpty()){
                    return null;
                }

                for(Topic topic: topics){

                    List<Concept> concepts = topic.getConcept();

                    if(concepts.isEmpty()){
                        return null;
                    }

                    for(Concept concept: concepts){
                        
                        if(concept.getId().equals(source)){
                            specializes.setOrigin(findConceptById(source, conceptMap));
                            specializes.setImportedOrigin(null);
                            if(imported_destination == true){
                                specializes.setImportedDestination(findImportedConceptById(target, conceptMap));
                                specializes.setDestination(null);
                            }else{
                                specializes.setDestination(findConceptById(target, conceptMap));
                                specializes.setImportedDestination(null);
                            }

                            Command specializesCommand = AddCommand.create(editingDomain,concept,
                            ModelPackage.Literals.CONCEPT__SPECIALIZES, specializes);

                            Edge edge = createEdge(specializes.getId());

                            Command edgeCommand = AddCommand.create(editingDomain, diagram,
                            NotationPackage.Literals.DIAGRAM__ELEMENTS, edge);
                            compoundCommand.append(specializesCommand);
                            compoundCommand.append(edgeCommand);
                            return compoundCommand;
                        }
                        
                    }

                    
                }
            }
        }

        return null;
    }

    protected Specializes createSpecializesEdge() {
        Specializes newSpecializes = ModelFactory.eINSTANCE.createSpecializes();
        newSpecializes.setId(UUID.randomUUID().toString());
        return newSpecializes;
    }

    protected Edge createEdge(final String elementId) {
        Edge newSecializes = NotationFactory.eINSTANCE.createEdge();
        SemanticElementReference reference = NotationFactory.eINSTANCE.createSemanticElementReference();
        reference.setElementId(elementId);
        newSecializes.setSemanticElement(reference);
        return newSecializes;
    }

    protected Concept findConceptById(final String conceptId, final ConceptMap conceptMap) {
        List<Course> courses = conceptMap.getCourse();

        for(Course course: courses){
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
        }
        
        return null;
    }

    protected Imported_Concept findImportedConceptById(final String importedId, final ConceptMap conceptMap){
        List<Course> courses = conceptMap.getCourse();

        for(Course course: courses){
            
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
            
        }

        return null;
    }
    
}