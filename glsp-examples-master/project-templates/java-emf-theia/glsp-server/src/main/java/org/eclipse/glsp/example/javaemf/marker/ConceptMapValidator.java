package org.eclipse.glsp.example.javaemf.marker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


import org.eclipse.glsp.server.features.validation.ModelValidator;
import org.eclipse.glsp.server.model.GModelState;

import org.eclipse.glsp.graph.GModelElement;
import org.eclipse.glsp.graph.GEdge;
import org.eclipse.glsp.server.features.validation.Marker;
import org.eclipse.glsp.server.features.validation.MarkerKind;


import com.google.inject.Inject;

public class ConceptMapValidator implements ModelValidator{
    
    @Inject
   protected GModelState modelState;


    @Override
   public List<Marker> doBatchValidation(final GModelElement element) {
      List<Marker> markers = new ArrayList<>();
      
         if (element.getType() == "node:topic") {
            markers.add(validateTopic(element));
         }
         
         if (element.getType() == "node:concept"){
            markers.add(validateConcept(element));
         }

         if(element.getType() == "node:imported_concept"){
            markers.add(validateIMPORTED_CONCEPT(element));
         }
      return markers;
   }
    
   @Override
   public List<Marker> doLiveValidation(final GModelElement element) {
      List<Marker> markers = new ArrayList<>();
      if ((element.getType() == "node:topic") || (element.getType() == "node:concept") || (element.getType() == "node:imported_concept")) {
         markers.add(selfElement(element));
      }
      
      return markers;
   }


   protected Marker validateTopic(final GModelElement topic) {
        Collection<GEdge> incomingEdges = modelState.getIndex().getIncomingEdges(topic);
        Collection<GEdge> outgoingEdges = modelState.getIndex().getOutgoingEdges(topic);

        boolean check = true;

        for(GEdge edge_i : incomingEdges){
            for(GEdge edge_o : outgoingEdges){
                if(edge_i.getSourceId() == edge_o.getTargetId()){
                    check = false;
                }
            }
        }

        if(check == true){
            if((incomingEdges.size() == 0) && (outgoingEdges.size() == 0)){
                return new Marker("Topic", "There cannot be a topic without any type of connections (Origin/Destination)", topic.getId(), MarkerKind.ERROR);
            }
            return new Marker("Topic", "This is a Valid Topic" , topic.getId(), MarkerKind.INFO);
        }
        
        return new Marker("Topic", "This is an Invalid Topic, The topics have to follow a logical order"  , topic.getId(), MarkerKind.ERROR);
          
   }

   protected Marker selfElement(final GModelElement element){
        Collection<GEdge> outgoingEdges = modelState.getIndex().getOutgoingEdges(element);

        for(GEdge edge_o: outgoingEdges){
            if((edge_o.getSource() == element) &&(edge_o.getTarget() == element)){
                return new Marker("Bad Connection", "A topic cannot connect to itself", element.getId(), MarkerKind.ERROR);
            }
        }
        return null;

    }

   protected Marker validateConcept(final GModelElement concept){
        Collection<GEdge> incomingEdges = modelState.getIndex().getIncomingEdges(concept);
        Collection<GEdge> outgoingEdges = modelState.getIndex().getOutgoingEdges(concept);

        boolean check = true;

        for(GEdge edge_i : incomingEdges){
            for(GEdge edge_o : outgoingEdges){
                if(edge_i.getSourceId() == edge_o.getTargetId()){
                    check = false;
                }
            }
        }

        if(check == true){
            if(incomingEdges.size() == 0 && (outgoingEdges.size() == 0)){

                return new Marker("Concept", "The concept should have logical connections with the others concepts/imported concepts",
                 concept.getId(), MarkerKind.WARNING);

            }
            
            return new Marker("Concept", "This is a Valid Concept" , concept.getId(), MarkerKind.INFO);
        }
        
        return new Marker("Concept", "This is an Invalid Concept, The inportedconcepts/concepts have to follow a logical order"  , concept.getId(), MarkerKind.ERROR);
   }

   protected Marker validateIMPORTED_CONCEPT(final GModelElement IMPORTED_CONCEPT){
    Collection<GEdge> incomingEdges = modelState.getIndex().getIncomingEdges(IMPORTED_CONCEPT);
    Collection<GEdge> outgoingEdges = modelState.getIndex().getOutgoingEdges(IMPORTED_CONCEPT);

    boolean check = true;

    for(GEdge edge_i : incomingEdges){
        for(GEdge edge_o : outgoingEdges){
            if(edge_i.getSourceId() == edge_o.getTargetId()){
                check = false;
            }
        }
    }

    if(check == true){
        if((incomingEdges.size() == 0) && (outgoingEdges.size() == 0)){
            return new Marker("Imported Concept", "The Imported Concept must have connections with others concepts into the model",
            IMPORTED_CONCEPT.getId(), MarkerKind.ERROR);
        }
            
        return new Marker("IMPORTED_CONCEPT", "This is a Valid Imported Concept" , IMPORTED_CONCEPT.getId(), MarkerKind.INFO);

    }
    
    return new Marker("IMPORTED_CONCEPT", "This is an Invalid Imported Concept, The inportedconcepts/concepts have to follow a logical order"  , IMPORTED_CONCEPT.getId(), MarkerKind.ERROR);
    
    }

   //VER COMO QUEDA MEJOR EN LA VALIDACION, SI AQUI O EN UN FICHERO APARTE

   }

