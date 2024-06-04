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

import org.eclipse.glsp.graph.DefaultTypes;

public final class ConceptMapModelTypes {
   private ConceptMapModelTypes() {}

   public static final String COURSE = DefaultTypes.NODE + ":course";
   // PRUEBAS --> LAS COSAS DE COURSE NO DEBER´IA ESTAR EN UN PRINCIPIO
   public static final String NAME = DefaultTypes.LABEL + ":name";
   public static final String COMP_NAME = DefaultTypes.COMPARTMENT + ":name";
   public static final String AUTHOR = DefaultTypes.LABEL + ":author";

   public static final String IMPORTED_CONCEPT = DefaultTypes.NODE + ":imported_concept";
   public static final String IMPORTED_CONCEPT_NAME = DefaultTypes.LABEL + ":imported_concept_name";
   public static final String RELATED_TOPIC = DefaultTypes.LABEL + ":related_topic";
   public static final String ICON_IMPORTED = DefaultTypes.LABEL + ":icon_imported";
   public static final String UBICATION = DefaultTypes.LABEL + ":ubication";

   public static final String LEGEND = DefaultTypes.NODE + ":legend";

   public static final String TOPIC = DefaultTypes.NODE + ":topic";
   public static final String TOPIC_NAME = DefaultTypes.LABEL + ":topic_name";
   public static final String TOPIC_ANNOTATIONS = DefaultTypes.LABEL + ":topic_annotations";
   public static final String ICON_TOPIC = DefaultTypes.LABEL + ":icon_topic";

   public static final String PROPERTIES = DefaultTypes.NODE + ":properties";
   public static final String ICON_PROPERTIES = DefaultTypes.LABEL + ":icon_properties";
   public static final String BIBLIOGRAPHY = DefaultTypes.LABEL + ":bibliography";
   public static final String PREVIOUS_REQUIREMENTS = DefaultTypes.LABEL + ":previous_requirements";
   public static final String SKILLS = DefaultTypes.LABEL + ":skills";
   public static final String ASSESMENT_CRITERIA = DefaultTypes.LABEL + ":assesment_criteria";
   public static final String SUBJECT = DefaultTypes.LABEL + ":subject";
   public static final String AREA = DefaultTypes.LABEL + ":area";
   public static final String OFFER = DefaultTypes.LABEL + ":offer";
   public static final String SEMESTER = DefaultTypes.LABEL + ":semester";
   public static final String CREDITS = DefaultTypes.LABEL + ":credits";
   public static final String LARGE_GROUP_HOURS = DefaultTypes.LABEL + ":large_group_hours";
   public static final String SMALL_GROUP_HOURS = DefaultTypes.LABEL + ":small_group_hours";
   public static final String COORDINATOR = DefaultTypes.LABEL + ":coordinator";

   public static final String CONCEPT = DefaultTypes.NODE + ":concept";
   public static final String CONCEPT_NAME = DefaultTypes.LABEL + ":concept_name";
   public static final String ANNOTATIONS = DefaultTypes.LABEL + ":annotations";
   public static final String ICON_CONCEPT = DefaultTypes.LABEL + ":icon_concept";

   public static final String AFTER = DefaultTypes.EDGE + ":after";
   public static final String AFTER_LABEL = DefaultTypes.LABEL + ":after_label";

   public static final String USES = DefaultTypes.EDGE + ":uses";
   public static final String USES_LABEL = DefaultTypes.LABEL + ":uses_label";

   public static final String SPECIALIZES = DefaultTypes.EDGE + ":specializes";
   public static final String SPECIALIZES_LABEL = DefaultTypes.LABEL + ":specializes_label";

   public static final String FEATURE = DefaultTypes.COMPARTMENT + ":feature";
   public static final String FEATURE_NAME = DefaultTypes.LABEL + ":feature_name";
   public static final String FEATURE_IMAGE = DefaultTypes.LABEL + ":feature_image";

}
