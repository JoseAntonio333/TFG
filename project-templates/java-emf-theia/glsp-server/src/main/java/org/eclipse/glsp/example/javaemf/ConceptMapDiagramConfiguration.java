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
package org.eclipse.glsp.example.javaemf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.glsp.graph.DefaultTypes;
import org.eclipse.glsp.graph.GraphPackage;
import org.eclipse.glsp.server.diagram.BaseDiagramConfiguration;
import org.eclipse.glsp.server.types.EdgeTypeHint;
import org.eclipse.glsp.server.types.ShapeTypeHint;

public class ConceptMapDiagramConfiguration extends BaseDiagramConfiguration {

   @Override
   public List<ShapeTypeHint> getShapeTypeHints() {

      List<ShapeTypeHint> hints = new ArrayList<>();

      hints.add(new ShapeTypeHint(DefaultTypes.GRAPH, true, true, true, true,
         List.of(
            ConceptMapModelTypes.COURSE,
            ConceptMapModelTypes.TOPIC,
            ConceptMapModelTypes.PROPERTIES,
            ConceptMapModelTypes.CONCEPT,
            ConceptMapModelTypes.IMPORTED_CONCEPT,
            ConceptMapModelTypes.LEGEND,
            ConceptMapModelTypes.FEATURE)));

      hints.add(new ShapeTypeHint(ConceptMapModelTypes.COURSE, true, true, true, true));

      hints.add(new ShapeTypeHint(ConceptMapModelTypes.TOPIC, true, true, true, true,
         List.of(
            ConceptMapModelTypes.CONCEPT,
            ConceptMapModelTypes.IMPORTED_CONCEPT)));

      hints.add(new ShapeTypeHint(ConceptMapModelTypes.CONCEPT, true, true, true, true,
         List.of(
            ConceptMapModelTypes.FEATURE)));

      hints.add(new ShapeTypeHint(ConceptMapModelTypes.IMPORTED_CONCEPT, true, true, false, true));
      hints.add(new ShapeTypeHint(ConceptMapModelTypes.LEGEND, true, false, false, true));
      hints.add(new ShapeTypeHint(ConceptMapModelTypes.PROPERTIES, true, false, false, true));
      hints.add(new ShapeTypeHint(ConceptMapModelTypes.FEATURE, false, true, true, true));

      return hints;
   }

   @Override
   public Map<String, EClass> getTypeMappings() {
      Map<String, EClass> mapping = new HashMap<>(super.getTypeMappings());
      mapping.put(ConceptMapModelTypes.TOPIC, GraphPackage.Literals.GNODE);
      mapping.put(ConceptMapModelTypes.COURSE, GraphPackage.Literals.GNODE);
      mapping.put(ConceptMapModelTypes.LEGEND, GraphPackage.Literals.GNODE);
      mapping.put(ConceptMapModelTypes.IMPORTED_CONCEPT, GraphPackage.Literals.GNODE);
      mapping.put(ConceptMapModelTypes.CONCEPT, GraphPackage.Literals.GNODE);
      mapping.put(ConceptMapModelTypes.FEATURE, GraphPackage.Literals.GCOMPARTMENT);
      mapping.put(ConceptMapModelTypes.PROPERTIES, GraphPackage.Literals.GNODE);
      mapping.put(ConceptMapModelTypes.USES, GraphPackage.Literals.GEDGE);
      mapping.put(ConceptMapModelTypes.SPECIALIZES, GraphPackage.Literals.GEDGE);
      mapping.put(ConceptMapModelTypes.AFTER, GraphPackage.Literals.GEDGE);
      mapping.put(ConceptMapModelTypes.NAME, GraphPackage.Literals.GLABEL);
      mapping.put(ConceptMapModelTypes.AUTHOR, GraphPackage.Literals.GLABEL);
      mapping.put(ConceptMapModelTypes.IMPORTED_CONCEPT_NAME, GraphPackage.Literals.GLABEL);
      mapping.put(ConceptMapModelTypes.TOPIC_NAME, GraphPackage.Literals.GLABEL);
      mapping.put(ConceptMapModelTypes.TOPIC_ANNOTATIONS, GraphPackage.Literals.GLABEL);
      mapping.put(ConceptMapModelTypes.BIBLIOGRAPHY, GraphPackage.Literals.GLABEL);
      mapping.put(ConceptMapModelTypes.PREVIOUS_REQUIREMENTS, GraphPackage.Literals.GLABEL);
      mapping.put(ConceptMapModelTypes.SKILLS, GraphPackage.Literals.GLABEL);
      mapping.put(ConceptMapModelTypes.ASSESMENT_CRITERIA, GraphPackage.Literals.GLABEL);
      mapping.put(ConceptMapModelTypes.SUBJECT, GraphPackage.Literals.GLABEL);
      mapping.put(ConceptMapModelTypes.AREA, GraphPackage.Literals.GLABEL);
      mapping.put(ConceptMapModelTypes.OFFER, GraphPackage.Literals.GLABEL);
      mapping.put(ConceptMapModelTypes.SEMESTER, GraphPackage.Literals.GLABEL);
      mapping.put(ConceptMapModelTypes.CREDITS, GraphPackage.Literals.GLABEL);
      mapping.put(ConceptMapModelTypes.SMALL_GROUP_HOURS, GraphPackage.Literals.GLABEL);
      mapping.put(ConceptMapModelTypes.LARGE_GROUP_HOURS, GraphPackage.Literals.GLABEL);
      mapping.put(ConceptMapModelTypes.COORDINATOR, GraphPackage.Literals.GLABEL);
      mapping.put(ConceptMapModelTypes.CONCEPT_NAME, GraphPackage.Literals.GLABEL);
      mapping.put(ConceptMapModelTypes.ANNOTATIONS, GraphPackage.Literals.GLABEL);
      mapping.put(ConceptMapModelTypes.AFTER_LABEL, GraphPackage.Literals.GLABEL);
      mapping.put(ConceptMapModelTypes.USES_LABEL, GraphPackage.Literals.GLABEL);
      mapping.put(ConceptMapModelTypes.SPECIALIZES_LABEL, GraphPackage.Literals.GLABEL);
      mapping.put(ConceptMapModelTypes.FEATURE_NAME, GraphPackage.Literals.GLABEL);
      mapping.put(ConceptMapModelTypes.COMP_NAME, GraphPackage.Literals.GCOMPARTMENT);
      return mapping;
   }

   @Override
   public List<EdgeTypeHint> getEdgeTypeHints() {

      return List.of(
         new EdgeTypeHint(ConceptMapModelTypes.USES, true, true, true, true,
            List.of(ConceptMapModelTypes.CONCEPT, ConceptMapModelTypes.IMPORTED_CONCEPT),
            List.of(ConceptMapModelTypes.CONCEPT, ConceptMapModelTypes.IMPORTED_CONCEPT)),
         new EdgeTypeHint(ConceptMapModelTypes.AFTER, true, true, true, true, List.of(ConceptMapModelTypes.TOPIC),
            List.of(ConceptMapModelTypes.TOPIC)),
         new EdgeTypeHint(ConceptMapModelTypes.SPECIALIZES, true, true, true, true,
            List.of(ConceptMapModelTypes.CONCEPT, ConceptMapModelTypes.IMPORTED_CONCEPT),
            List.of(ConceptMapModelTypes.CONCEPT, ConceptMapModelTypes.IMPORTED_CONCEPT)));

   }

}
