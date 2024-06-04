package org.eclipse.glsp.example.javaemf.handler;

import java.util.List;
import java.util.Optional;

import org.eclipse.emf.common.command.Command;
import org.eclipse.glsp.conceptap.model.Concept;
import org.eclipse.glsp.conceptap.model.Course;
import org.eclipse.glsp.conceptap.model.Feature;
import org.eclipse.glsp.conceptap.model.Imported_Concept;
import org.eclipse.glsp.conceptap.model.Properties;
import org.eclipse.glsp.conceptap.model.Topic;
import org.eclipse.glsp.example.javaemf.ConceptMapModelTypes;
import org.eclipse.glsp.graph.GCompartment;
import org.eclipse.glsp.graph.GLabel;
import org.eclipse.glsp.graph.GModelElement;
import org.eclipse.glsp.graph.GNode;
import org.eclipse.glsp.server.emf.notation.EMFNotationModelState;
import org.eclipse.glsp.server.features.directediting.ApplyLabelEditOperation;
import org.eclipse.glsp.server.operations.GModelOperationHandler;

import com.google.inject.Inject;

public class EditNameHandler extends GModelOperationHandler<ApplyLabelEditOperation> {

   @Inject
   protected EMFNotationModelState modelState;

   public void executeOperation(final ApplyLabelEditOperation operation) {
      Optional<GModelElement> element = modelState.getIndex().get(operation.getLabelId());
      if (!element.isPresent() && !(element.get() instanceof GLabel)) {
         throw new IllegalArgumentException("Element with provided ID cannot be found or is not a GLabel");
      }

      Optional<GNode> _gNodeElement = modelState.getIndex().findElementByClass(operation.getLabelId(), GNode.class);
      GNode gNodeElement = _gNodeElement.orElse(null);

      GLabel sLabel = (GLabel) element.get();
      sLabel.setText(operation.getText());

      Optional<GCompartment> _gCompartment = modelState.getIndex().findElementByClass(operation.getLabelId(),
         GCompartment.class);
      GCompartment gCompartment = _gCompartment.orElse(null);

      if (gNodeElement.getType() == ConceptMapModelTypes.PROPERTIES) {
         modifyProperties(sLabel, gNodeElement, operation);
      } else if ((gNodeElement.getType() == ConceptMapModelTypes.CONCEPT)
         || (gNodeElement.getType() == ConceptMapModelTypes.FEATURE)) {
         modifyConcept(sLabel, gNodeElement, gCompartment, operation);
      } else if (gNodeElement.getType() == ConceptMapModelTypes.IMPORTED_CONCEPT) {
         modifyImportedConcept(sLabel, gNodeElement, operation);
      } else if (gNodeElement.getType() == ConceptMapModelTypes.TOPIC) {
         modifyTopic(sLabel, gNodeElement, operation);
      }

   }

   @Override
   public Optional<Command> createCommand(ApplyLabelEditOperation operation) {
      return commandOf(() -> executeOperation(operation));
   }

   public void modifyProperties(GLabel sLabel, GNode gNodeELement, ApplyLabelEditOperation operation) {
      Course course = modelState.getSemanticModel(Course.class).orElseThrow();

      List<Properties> properties = course.getProperties();

      for (Properties propertie : properties) {
         //
         if (propertie.getId() == gNodeELement.getId()) {
            switch (sLabel.getType()) {
               case ConceptMapModelTypes.BIBLIOGRAPHY:
                  propertie.setBibliography(operation.getText());
                  break;
               case ConceptMapModelTypes.PREVIOUS_REQUIREMENTS:
                  propertie.setPrevious_requirements(operation.getText());
                  break;
               case ConceptMapModelTypes.SKILLS:
                  propertie.setSkills(operation.getText());
                  break;
               case ConceptMapModelTypes.ASSESMENT_CRITERIA:
                  propertie.setAssessment_criteria(operation.getText());
                  break;
               case ConceptMapModelTypes.SUBJECT:
                  propertie.setSubject(operation.getText());
                  break;
               case ConceptMapModelTypes.AREA:
                  propertie.setArea(operation.getText());
                  break;
               case ConceptMapModelTypes.OFFER:
                  propertie.setOffer(operation.getText());
                  break;
               case ConceptMapModelTypes.SEMESTER:
                  propertie.setSemester(operation.getText());
                  break;
               case ConceptMapModelTypes.CREDITS:
                  propertie.setCredits(operation.getText());
                  break;
               case ConceptMapModelTypes.SMALL_GROUP_HOURS:
                  propertie.setSmall_group_hours(operation.getText());
                  break;
               case ConceptMapModelTypes.LARGE_GROUP_HOURS:
                  propertie.setLarge_group_hours(operation.getText());
                  break;
               case ConceptMapModelTypes.COORDINATOR:
                  propertie.setCoordinator(operation.getText());
                  break;
               case ConceptMapModelTypes.NAME:
                  course.setCourse_name(operation.getText());
                  throw new IllegalArgumentException("Element with provided ID cannot be found or is not a GLabel " +
                     propertie.getId() + " " + sLabel.getType() + " " + ConceptMapModelTypes.FEATURE + " " +
                     gNodeELement.getId());
               // break;
               case ConceptMapModelTypes.AUTHOR:
                  course.setAuthor(operation.getText());
                  break;
            }
         }
      }

   }

   public void modifyConcept(GLabel sLabel, GNode gNodeELement, GCompartment gCompartment,
      ApplyLabelEditOperation operation) {
      Course course = modelState.getSemanticModel(Course.class).orElseThrow();

      List<Topic> topics = course.getTopic();

      for (Topic topic : topics) {

         List<Concept> concepts = topic.getConcept();
         for (Concept concept : concepts) {

            if (concept.getId() == gNodeELement.getId()) {
               switch (sLabel.getType()) {
                  case ConceptMapModelTypes.CONCEPT_NAME:
                     concept.setConcept_name(operation.getText());
                     break;
                  case ConceptMapModelTypes.ANNOTATIONS:
                     concept.setAnnotations(operation.getText());
                     break;
               }
            } else {
               List<Feature> features = concept.getFeature();
               for (Feature feature : features) {

                  if (gNodeELement.getId().equals(feature.getId())) {
                     feature.setFeature_name(operation.getText());
                  }
               }
            }
         }

      }
   }

   public void modifyImportedConcept(GLabel sLabel, GNode gNodeELement, ApplyLabelEditOperation operation) {
      Course course = modelState.getSemanticModel(Course.class).orElseThrow();

      List<Topic> topics = course.getTopic();

      for (Topic topic : topics) {

         List<Imported_Concept> importedConcepts = topic.getImported_concept();

         for (Imported_Concept importedConcept : importedConcepts) {
            if (importedConcept.getId() == gNodeELement.getId()) {
               switch (sLabel.getType()) {
                  case ConceptMapModelTypes.IMPORTED_CONCEPT_NAME:
                     importedConcept.setConcept_name(operation.getText());
                     break;
                  case ConceptMapModelTypes.UBICATION:
                     importedConcept.setUbication(operation.getText());
                     break;
                  case ConceptMapModelTypes.RELATED_TOPIC:
                     importedConcept.setRelatedTopic(operation.getText());
                     break;
               }
            }
         }

      }
   }

   public void modifyTopic(GLabel sLabel, GNode gNodeELement, ApplyLabelEditOperation operation) {
      Course course = modelState.getSemanticModel(Course.class).orElseThrow();
      List<Topic> topics = course.getTopic();

      for (Topic topic : topics) {

         if (topic.getId().equals(gNodeELement.getId())) {
            switch (sLabel.getType()) {
               case ConceptMapModelTypes.TOPIC_NAME:
                  topic.setTopic_name(operation.getText());
                  break;
               case ConceptMapModelTypes.TOPIC_ANNOTATIONS:
                  topic.setAnnotations(operation.getText());
                  break;
            }
         }

      }

   }

}
