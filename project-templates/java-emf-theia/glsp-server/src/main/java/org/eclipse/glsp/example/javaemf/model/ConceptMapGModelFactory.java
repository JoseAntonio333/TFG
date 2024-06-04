/********************************************************************************
 * Copyright (c) 2022 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License v. 2.0 are satisfied:
 * -- GNU General Public License, version 2 with the GNU Classpath Exception
 * which is available at https://www.gnu.org/software/classpath/license.html
 * -- MIT License which is available at https://opensource.org/license/mit.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0 OR MIT
 ********************************************************************************/
package org.eclipse.glsp.example.javaemf.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.glsp.conceptap.model.After;
import org.eclipse.glsp.conceptap.model.Concept;
import org.eclipse.glsp.conceptap.model.Course;
import org.eclipse.glsp.conceptap.model.Feature;
import org.eclipse.glsp.conceptap.model.Imported_Concept;
import org.eclipse.glsp.conceptap.model.Legend;
import org.eclipse.glsp.conceptap.model.Properties;
import org.eclipse.glsp.conceptap.model.Specializes;
import org.eclipse.glsp.conceptap.model.Topic;
import org.eclipse.glsp.conceptap.model.Uses;
import org.eclipse.glsp.example.javaemf.ConceptMapModelTypes;
import org.eclipse.glsp.graph.DefaultTypes;
import org.eclipse.glsp.graph.GCompartment;
import org.eclipse.glsp.graph.GEdge;
import org.eclipse.glsp.graph.GGraph;
import org.eclipse.glsp.graph.GModelElement;
import org.eclipse.glsp.graph.GModelRoot;
import org.eclipse.glsp.graph.GNode;
import org.eclipse.glsp.graph.builder.impl.GCompartmentBuilder;
import org.eclipse.glsp.graph.builder.impl.GEdgeBuilder;
import org.eclipse.glsp.graph.builder.impl.GEdgePlacementBuilder;
import org.eclipse.glsp.graph.builder.impl.GLabelBuilder;
import org.eclipse.glsp.graph.builder.impl.GLayoutOptions;
import org.eclipse.glsp.graph.builder.impl.GNodeBuilder;
import org.eclipse.glsp.graph.util.GConstants;
import org.eclipse.glsp.server.emf.EMFIdGenerator;
import org.eclipse.glsp.server.emf.model.notation.Diagram;
import org.eclipse.glsp.server.emf.model.notation.NotationElement;
import org.eclipse.glsp.server.emf.notation.EMFNotationGModelFactory;
import org.eclipse.glsp.server.emf.notation.EMFNotationModelState;

import com.google.inject.Inject;

public class ConceptMapGModelFactory extends EMFNotationGModelFactory {

   @Inject
   protected EMFNotationModelState modelState;

   @Inject
   protected EMFIdGenerator idGenerator;

   @Override
   protected void fillRootElement(final EObject semanticModel, final Diagram notationModel, final GModelRoot newRoot) {
      Course course = Course.class.cast(semanticModel);
      GGraph graph = GGraph.class.cast(newRoot);
      if (notationModel.getSemanticElement() != null
         && notationModel.getSemanticElement().getResolvedSemanticElement() != null) {

         course.getLegend().stream()
            .map(this::createCaptionNode)
            .forEachOrdered(graph.getChildren()::add);

         course.getTopic().stream()
            .map(this::createTopicNode)
            .forEachOrdered(graph.getChildren()::add);

         course.getProperties().stream()
            .map(properties -> createPropertiesNode(properties, course))
            .forEachOrdered(graph.getChildren()::add);

         List<Topic> topics = course.getTopic();

         for (Topic topic : topics) {

            topic.getAfter().stream()
               .map(usesTopic -> createAfterEdge(graph, usesTopic))
               .forEachOrdered(graph.getChildren()::add);

            List<Imported_Concept> importeds = topic.getImported_concept();

            for (Imported_Concept imported : importeds) {
               imported.getUses().stream()
                  .map(uses -> createUsesEdge(graph, uses, newRoot))
                  .forEachOrdered(graph.getChildren()::add);

               imported.getSpecializes().stream()
                  .map(specializes -> createSpecializesEdge(graph, specializes, newRoot))
                  .forEachOrdered(graph.getChildren()::add);
            }

            List<Concept> concepts = topic.getConcept();

            for (Concept concept : concepts) {

               concept.getUses().stream()
                  .map(uses -> createUsesEdge(graph, uses, newRoot))
                  .forEachOrdered(graph.getChildren()::add);

               concept.getSpecializes().stream()
                  .map(specializes -> createSpecializesEdge(graph, specializes, newRoot))
                  .forEachOrdered(graph.getChildren()::add);

            }

         }

      }
   }

   protected GNode createCourseNode(final Course course) {

      String nodeId = idGenerator.getOrCreateId(course);

      GNodeBuilder courseNodeBuilder = new GNodeBuilder(ConceptMapModelTypes.COURSE)
         .id(nodeId)
         .addCssClass("course-node")
         .layout(GConstants.Layout.VBOX)
         .add(new GCompartmentBuilder(ConceptMapModelTypes.COMP_NAME)
            .id(nodeId + "_header")
            .layout(GConstants.Layout.VBOX)
            .add(new GLabelBuilder(ConceptMapModelTypes.NAME)
               .id(nodeId + "_classname")
               .text("NAME: " + course.getName())
               .id(nodeId + "_label")
               .build())
            .build())
         .add(new GLabelBuilder(ConceptMapModelTypes.AUTHOR)
            .text("AUTHOR: " + course.getAuthor())
            .id(nodeId + "_author_label")
            .build());

      applyShapeData(course, courseNodeBuilder);
      return courseNodeBuilder.build();
   }

   protected GNode createImportedConcept(final EObject object) {
      Imported_Concept importedConcept = (Imported_Concept) object;

      GNodeBuilder importedConceptNodeBuilder = new GNodeBuilder(ConceptMapModelTypes.IMPORTED_CONCEPT)
         .id(idGenerator.getOrCreateId(importedConcept))
         .addCssClass("imported-concept-node")
         .layout(GConstants.Layout.VBOX, Map.of(GLayoutOptions.KEY_PADDING_LEFT, 5))
         .add(new GCompartmentBuilder(DefaultTypes.COMPARTMENT)
            .layout(GConstants.Layout.HBOX)
            .addCssClass("border")
            .add(new GLabelBuilder(ConceptMapModelTypes.ICON_IMPORTED).build())
            .add(new GLabelBuilder(DefaultTypes.LABEL).text("<IMPORTED CONCEPT>").addCssClass("header").build())
            .build())
         .add(new GCompartmentBuilder()
            .layout(GConstants.Layout.VBOX)
            .add(new GLabelBuilder(ConceptMapModelTypes.IMPORTED_CONCEPT_NAME)
               .text("Name: " + importedConcept.getConcept_name()).build())
            .add(new GLabelBuilder(ConceptMapModelTypes.UBICATION).text("Ubication: " + importedConcept.getUbication())
               .build())
            .add(new GLabelBuilder(ConceptMapModelTypes.RELATED_TOPIC)
               .text("Related Topic: " + importedConcept.getRelatedTopic()).build())
            .build());

      applyShapeData(importedConcept, importedConceptNodeBuilder);
      return importedConceptNodeBuilder.build();
   }

   protected GNode createCaptionNode(final Legend legend) {

      GNodeBuilder captionNodeBuilder = new GNodeBuilder(ConceptMapModelTypes.LEGEND)
         .id(idGenerator.getOrCreateId(legend))
         .addCssClass("caption-node");

      applyShapeData(legend, captionNodeBuilder);
      return captionNodeBuilder.build();
   }

   protected GNode createTopicNode(final Topic topic) {
      GNodeBuilder topicNodeBuilder = new GNodeBuilder(ConceptMapModelTypes.TOPIC)
         .id(idGenerator.getOrCreateId(topic))
         .addCssClass("topic-node")
         .add(new GCompartmentBuilder().layout(GConstants.Layout.HBOX)
            .add(new GLabelBuilder(ConceptMapModelTypes.ICON_TOPIC).build())
            .add(new GLabelBuilder().text("<TOPIC>").build())
            .add(new GLabelBuilder(ConceptMapModelTypes.TOPIC_NAME).text(topic.getTopic_name())
               .id(topic.getId() + "_name").build())
            .addCssClass("header")
            .build())
         .add(new GLabelBuilder(ConceptMapModelTypes.TOPIC_ANNOTATIONS).text("Annotations: " + topic.getAnnotations())
            .build())
         .layout(GConstants.Layout.VBOX, Map.of(GLayoutOptions.KEY_PADDING_LEFT, 5))
         .add(createLabeledChildrenNodeTopic(topic.getConcept(), topic.getImported_concept(), topic));

      applyShapeData(topic, topicNodeBuilder);
      return topicNodeBuilder.build();
   }

   private GCompartment createLabeledChildrenNodeTopic(Collection<? extends EObject> conceptChildren,
      Collection<? extends EObject> importedChildren, Topic topic) {
      List<GModelElement> gModelElements = conceptChildren.stream()
         .map(child -> createConceptNode(child))
         .collect(Collectors.toList());

      List<GModelElement> importedGModelElements = importedChildren.stream()
         .map(child -> createImportedConcept(child))
         .collect(Collectors.toList());

      return new GCompartmentBuilder(DefaultTypes.COMPARTMENT)
         .id(topic.getId() + "_childCompartment")
         .layout(GConstants.Layout.VBOX)
         .addCssClass("border-starts")
         .layoutOptions(new GLayoutOptions().hAlign(GConstants.HAlign.LEFT))
         .addAll(gModelElements)
         .addAll(importedGModelElements)
         .build();
   }

   protected GNode createPropertiesNode(final Properties properties, final Course course) {

      String nodeId = idGenerator.getOrCreateId(properties);
      course.setAuthor("Set your name here...");
      course.setCourse_name("Set the name of the course here...");

      GNodeBuilder prropertiesNodeBuilder = new GNodeBuilder(ConceptMapModelTypes.PROPERTIES)
         .id(nodeId)
         .addCssClass("properties-node")
         .add(new GCompartmentBuilder()
            .layout(GConstants.Layout.HBOX)
            .add(new GLabelBuilder(ConceptMapModelTypes.ICON_PROPERTIES)
               .build())
            .add(new GLabelBuilder(DefaultTypes.LABEL)
               .text("PROPERTIES")
               .addCssClass("header").build())
            .build())
         .layout(GConstants.Layout.VBOX, Map.of(GLayoutOptions.KEY_PADDING_LEFT, 5))
         .add(new GCompartmentBuilder().build())
         .add(new GLabelBuilder(ConceptMapModelTypes.BIBLIOGRAPHY)
            .text("Bibliography: " + properties.getBibliography())
            .id(nodeId + "_bibliography_label")
            .build())
         .add(new GLabelBuilder(ConceptMapModelTypes.PREVIOUS_REQUIREMENTS)
            .text("Previous Requirements: " + properties.getPrevious_requirements())
            .id(nodeId + "_previous_requirements_label")
            .build())
         .add(new GLabelBuilder(ConceptMapModelTypes.SKILLS)
            .text("Skills: " + properties.getSkills())
            .id(nodeId + "_skills_label")
            .build())
         .add(new GLabelBuilder(ConceptMapModelTypes.ASSESMENT_CRITERIA)
            .text("Assesment Criteria: " + properties.getAssessment_criteria())
            .id(nodeId + "_assesment_criteria_label")
            .build())
         .add(new GLabelBuilder(ConceptMapModelTypes.SUBJECT)
            .text("Subject: " + properties.getSubject())
            .id(nodeId + "_subject_label")
            .build())
         .add(new GLabelBuilder(ConceptMapModelTypes.AREA)
            .text("Area: " + properties.getArea())
            .id(nodeId + "_area_label")
            .build())
         .add(new GLabelBuilder(ConceptMapModelTypes.OFFER)
            .text("Offer: " + properties.getOffer())
            .id(nodeId + "_offer_label")
            .build())
         .add(new GLabelBuilder(ConceptMapModelTypes.SEMESTER)
            .text("Semester: " + properties.getSemester())
            .id(nodeId + "_semester_label")
            .build())
         .add(new GLabelBuilder(ConceptMapModelTypes.CREDITS)
            .text("Credits: " + properties.getCredits())
            .id(nodeId + "_credits_label")
            .build())
         .add(new GLabelBuilder(ConceptMapModelTypes.LARGE_GROUP_HOURS)
            .text("Large Group Hours: " + properties.getLarge_group_hours())
            .id(nodeId + "_large_group_hours_label")
            .build())
         .add(new GLabelBuilder(ConceptMapModelTypes.SMALL_GROUP_HOURS)
            .text("Small Group Hours: " + properties.getSmall_group_hours())
            .id(nodeId + "_small_group_hours_label")
            .build())
         .add(new GLabelBuilder(ConceptMapModelTypes.COORDINATOR)
            .text("Coordinator: " + properties.getCoordinator())
            .id(nodeId + "_cooordinator_label")
            .build())
         .add(new GLabelBuilder(ConceptMapModelTypes.NAME)
            .text("Course Name: " + course.getCourse_name())
            .id(nodeId + "_course_name_label")
            .build())
         .add(new GLabelBuilder(ConceptMapModelTypes.AUTHOR)
            .text("Author: " + course.getAuthor())
            .id(nodeId + "_author_label")
            .build());
      applyShapeData(properties, prropertiesNodeBuilder);
      return prropertiesNodeBuilder.build();
   }

   protected GNode createConceptNode(final EObject object) {
      Concept concept = (Concept) object;

      GNodeBuilder conceptNodeBuilder = new GNodeBuilder(ConceptMapModelTypes.CONCEPT)
         .id(idGenerator.getOrCreateId(concept))
         .addCssClass("concept-node")
         .add(new GCompartmentBuilder().layout(GConstants.Layout.HBOX)
            .add(new GLabelBuilder(ConceptMapModelTypes.ICON_CONCEPT).build())
            .add(new GLabelBuilder().text("<CONCEPT>").addCssClass("header").build())
            .add(new GLabelBuilder(ConceptMapModelTypes.CONCEPT_NAME).text(concept.getConcept_name())
               .id(concept.getId() + "_name").build())
            .build())
         .add(new GLabelBuilder(ConceptMapModelTypes.ANNOTATIONS).text("Annotations: " + concept.getAnnotations())
            .build())
         .layout(GConstants.Layout.VBOX, Map.of(GLayoutOptions.KEY_PADDING_LEFT, 5))
         .add(createLabeledChildrenNode(concept.getFeature(), concept));
      applyShapeData(concept, conceptNodeBuilder);
      return conceptNodeBuilder.build();
   }

   private GCompartment createLabeledChildrenNode(Collection<? extends EObject> children, Concept concept) {
      List<GModelElement> gModelElements = children.stream()
         .map(child -> createFeatureElement(child))
         .collect(Collectors.toList());

      return new GCompartmentBuilder(ConceptMapModelTypes.FEATURE)
         .id(concept.getId() + "_childCompartment")
         .layout(GConstants.Layout.VBOX)
         .addCssClass("border-starts")
         .layoutOptions(new GLayoutOptions().hAlign(GConstants.HAlign.LEFT))
         .addAll(gModelElements)
         .build();
   }

   private GModelElement createFeatureElement(EObject child) {

      if (child instanceof Feature) {
         Feature feature = (Feature) child;
         return new GCompartmentBuilder(ConceptMapModelTypes.FEATURE)
            .id(feature.getId())
            .add(new GCompartmentBuilder(DefaultTypes.COMPARTMENT)
               .layout(GConstants.Layout.HBOX)
               .add(new GLabelBuilder(ConceptMapModelTypes.FEATURE_IMAGE)
                  .build())
               .add(new GLabelBuilder(ConceptMapModelTypes.FEATURE_NAME)
                  .text(feature.getFeature_name())
                  .id(feature.getId() + "_feature_name")
                  .build())
               .build())
            .build();
      }
      throw new IllegalArgumentException("Unsupported child element type: " + child.getClass().getName());
   }

   protected GEdge createAfterEdge(final GGraph graph, final After after) {
      String sourceId = after.getOrigin().getId();
      String targetId = after.getDestination().getId();
      GModelElement sourceNode = findGNodeById(graph.getChildren(), sourceId);
      GModelElement targetNode = findGNodeById(graph.getChildren(), targetId);

      GEdgeBuilder builder = new GEdgeBuilder(ConceptMapModelTypes.AFTER)
         .source(sourceNode)
         .target(targetNode)
         .addCssClass("uses-topic-edge")
         .add(new GLabelBuilder(DefaultTypes.LABEL)
            .edgePlacement(new GEdgePlacementBuilder()
               .side(GConstants.EdgeSide.BOTTOM)
               .position(0.5d)
               .offset(2d)
               .rotate(false)
               .build())
            .text("After: " + after.getDestination().getTopic_name()).build())
         .addCssClass("label-edge")
         .id(idGenerator.getOrCreateId(after));
      applyEdgeData(after, builder);
      return builder.build();

      // return null;
   }

   protected GEdge createUsesEdge(final GGraph graph, final Uses uses, final GModelRoot newRoot) {
      String sourceId;
      String targetId;

      String origin;
      String destination;

      if (uses.getImportedOrigin() == null) {
         sourceId = uses.getOrigin().getId();
         origin = uses.getOrigin().getConcept_name();
      } else {
         sourceId = uses.getImportedOrigin().getId();
         origin = uses.getImportedOrigin().getConcept_name();
      }

      if (uses.getImportedDestination() == null) {
         targetId = uses.getDestination().getId();
         destination = uses.getDestination().getConcept_name();
      } else {
         targetId = uses.getImportedDestination().getId();
         destination = uses.getImportedDestination().getConcept_name();
      }

      GModelElement sourceNode = findElementById(sourceId);
      GModelElement targetNode = findElementById(targetId);
      GEdgeBuilder builder = new GEdgeBuilder(ConceptMapModelTypes.USES)
         .source(sourceNode)
         .target(targetNode)
         .addCssClass("uses-edge")
         .add(new GLabelBuilder(DefaultTypes.LABEL)
            .edgePlacement(new GEdgePlacementBuilder()
               .side(GConstants.EdgeSide.BOTTOM)
               .position(0.5d)
               .offset(10d)
               .rotate(false)
               .build())
            .text(origin + " uses " + destination).build())
         .id(idGenerator.getOrCreateId(uses));
      applyEdgeData(uses, builder);
      return builder.build();
   }

   protected GEdge createSpecializesEdge(final GGraph graph, final Specializes specializes, final GModelRoot newRoot) {
      String sourceId;
      String targetId;

      String origin;
      String destination;

      if (specializes.getImportedOrigin() == null) {
         sourceId = specializes.getOrigin().getId();
         origin = specializes.getOrigin().getConcept_name();
      } else {
         sourceId = specializes.getImportedOrigin().getId();
         origin = specializes.getImportedOrigin().getConcept_name();
      }

      if (specializes.getImportedDestination() == null) {
         targetId = specializes.getDestination().getId();
         destination = specializes.getDestination().getConcept_name();
      } else {
         targetId = specializes.getImportedDestination().getId();
         destination = specializes.getImportedDestination().getConcept_name();
      }

      GModelElement sourceNode = findElementById(sourceId);
      GModelElement targetNode = findElementById(targetId);

      GEdgeBuilder builder = new GEdgeBuilder(ConceptMapModelTypes.SPECIALIZES)
         .source(sourceNode)
         .target(targetNode)
         .addCssClass("specializes-edge")
         .add(new GLabelBuilder(DefaultTypes.LABEL)
            .edgePlacement(new GEdgePlacementBuilder()
               .side(GConstants.EdgeSide.BOTTOM)
               .position(0.7d)
               .offset(10d)
               .rotate(false)
               .build())
            .text(origin + " specializes " + destination).build())
         .id(idGenerator.getOrCreateId(specializes));
      applyEdgeData(specializes, builder);
      return builder.build();
   }

   protected GModelElement findElementById(final String elementId) {
      Optional<GModelElement> oElement = modelState.getIndex().get(elementId);
      GModelElement element = oElement.orElse(null);
      return element;
   }

   protected GModelElement findGNodeById(final EList<GModelElement> eList, final String elementId) {
      for (GModelElement element : eList) {
         if (elementId.equals(element.getId())) {
            return element;
         }
         if (element instanceof GGraph) {
            GModelElement found = findGNodeById(((GGraph) element).getChildren(), elementId);
            if (found != null) {
               return found;
            }
         }
      }

      return null;
   }

   protected boolean isIdPresentSourceInUsesTopic(String topicIdOrigin, String topicIdDestination, List<After> afters) {

      boolean found = false;

      for (After after : afters) {

         String originId = after.getOrigin().getId();
         String destinationId = after.getDestination().getId();

         if ((originId == topicIdDestination) && (destinationId == topicIdOrigin)) {
            return true;
         }
      }

      return found;
   }

   protected List<After> getAllUsesTopics(Diagram diagram) {
      List<After> allUsesTopics = new ArrayList<>();

      for (NotationElement element : diagram.getElements()) {

         if (element instanceof After) {

            allUsesTopics.add((After) element);
         }
      }

      return allUsesTopics;
   }

}
