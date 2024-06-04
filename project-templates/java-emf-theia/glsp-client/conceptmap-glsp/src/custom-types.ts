/********************************************************************************
 * Copyright (c) 2024 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 ********************************************************************************/
import { DefaultTypes } from '@eclipse-glsp/client';

export namespace CustomTypes {
    export const COURSE = DefaultTypes.NODE + ':course';
    export const COMP_NAME = DefaultTypes.COMPARTMENT + ':name';
    export const NAME = DefaultTypes.LABEL + ':name';
    export const COMP_AUTHOR = DefaultTypes.COMPARTMENT + ':author';
    export const AUTHOR = DefaultTypes.LABEL + ':author';

    export const IMPORTED_CONCEPT = DefaultTypes.NODE + ':imported_concept';
    export const IMPORTED_CONCEPT_NAME = DefaultTypes.LABEL + ':imported_concept_name';
    export const UBICATION = DefaultTypes.LABEL + ':ubication';
    export const RELATED_TOPIC = DefaultTypes.LABEL + ':related_topic';
    export const ICON_IMPORTED = DefaultTypes.LABEL + ':icon_imported';

    export const LEGEND = DefaultTypes.NODE + ':legend';

    export const TOPIC = DefaultTypes.NODE + ':topic';
    export const TOPIC_NAME = DefaultTypes.LABEL + ':topic_name';
    export const TOPIC_ANNOTATIONS = DefaultTypes.LABEL + ':topic_annotations';
    export const ICON_TOPIC = DefaultTypes.LABEL + ':icon_topic';

    export const PROPERTIES = DefaultTypes.NODE + ':properties';
    export const ICON_PROPERTIES = DefaultTypes.LABEL + ':icon_properties';
    export const BIBLIOGRAPHY = DefaultTypes.LABEL + ':bibliography';
    export const PREVIOUS_REQUIREMENTS = DefaultTypes.LABEL + ':previous_requirements';
    export const SKILLS = DefaultTypes.LABEL + ':skills';
    export const ASSESMENT_CRITERIA = DefaultTypes.LABEL + ':assesment_criteria';
    export const SUBJECT = DefaultTypes.LABEL + ':subject';
    export const AREA = DefaultTypes.LABEL + ':area';
    export const OFFER = DefaultTypes.LABEL + ':offer';
    export const SEMESTER = DefaultTypes.LABEL + ':semester';
    export const CREDITS = DefaultTypes.LABEL + ':credits';
    export const LARGE_GROUP_HOURS = DefaultTypes.LABEL + ':large_group_hours';
    export const SMALL_GROUP_HOURS = DefaultTypes.LABEL + ':small_group_hours';
    export const COORDINATOR = DefaultTypes.LABEL + ':coordinator';

    export const CONCEPT = DefaultTypes.NODE + ':concept';
    export const CONCEPT_NAME = DefaultTypes.LABEL + ':concept_name';
    export const ANNOTATIONS = DefaultTypes.LABEL + ':annotations';
    export const ICON_CONCEPT = DefaultTypes.LABEL + ':icon_concept';

    export const AFTER = DefaultTypes.EDGE + ':after';
    export const AFTER_LABEL = DefaultTypes.LABEL + ':after_label';

    export const USES = DefaultTypes.EDGE + ':uses';
    export const USES_LABEL = DefaultTypes + ':uses_label';

    export const SPECIALIZES = DefaultTypes.EDGE + ':specializes';
    export const SPECIALIZES_LABEL = DefaultTypes.LABEL + ':specializes_label';

    export const FEATURE = DefaultTypes.COMPARTMENT + ':feature';
    export const FEATURE_NAME = DefaultTypes.LABEL + ':feature_name';
    export const FEATURE_IMAGE = DefaultTypes.LABEL + ':feature_image';

    // eslint-disable-next-line eol-last
}
