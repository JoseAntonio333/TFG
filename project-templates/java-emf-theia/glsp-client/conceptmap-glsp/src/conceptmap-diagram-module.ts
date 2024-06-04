/********************************************************************************
 * Copyright (c) 2022 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
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
import {
    ConsoleLogger,
    ContainerConfiguration,
    DefaultTypes,
    GCompartment,
    GCompartmentView,
    GEdge,
    GLabel,
    GLabelView,
    GNode,
    GRoutingHandle,
    GRoutingHandleView,
    LogLevel,
    RoundedCornerNodeView,
    TYPES,
    configureDefaultModelElements,
    configureModelElement,
    editFeature,
    editLabelFeature,
    initializeDiagramContainer
} from '@eclipse-glsp/client';
import { Container, ContainerModule } from 'inversify';
import '../css/diagram.css';
import { CustomTypes } from './custom-types';
import { CourseNode, IconLabelCompartment, LabeledNode } from './model';
import {
    CaptionNodeView,
    ConceptMapSpecializesEdgeView,
    ConceptMapUsesEdgeView,
    ConceptMapUsesTopicEdgeView,
    ConceptNodeView,
    FeatureLabelNodeView,
    IconImportedLabelNodeView,
    IconPropertiesLabelNodeView,
    IconTopicLabelNodeView,
    TopicNodeView
} from './views';

const conceptMapDiagramModule = new ContainerModule((bind, unbind, isBound, rebind) => {
    rebind(TYPES.ILogger).to(ConsoleLogger).inSingletonScope();
    rebind(TYPES.LogLevel).toConstantValue(LogLevel.warn);
    const context = { bind, unbind, isBound, rebind };
    configureDefaultModelElements(context);
    configureModelElement(context, CustomTypes.COURSE, CourseNode, RoundedCornerNodeView, { enable: [editFeature] });
    configureModelElement(context, CustomTypes.IMPORTED_CONCEPT, GNode, RoundedCornerNodeView);
    configureModelElement(context, CustomTypes.IMPORTED_CONCEPT_NAME, GLabel, GLabelView, { enable: [editLabelFeature] });
    configureModelElement(context, CustomTypes.RELATED_TOPIC, GLabel, GLabelView, { enable: [editLabelFeature] });
    configureModelElement(context, CustomTypes.LEGEND, GNode, CaptionNodeView);
    configureModelElement(context, CustomTypes.TOPIC, GNode, TopicNodeView);
    configureModelElement(context, CustomTypes.TOPIC_NAME, GLabel, GLabelView, { enable: [editLabelFeature] });
    configureModelElement(context, CustomTypes.TOPIC_ANNOTATIONS, GLabel, GLabelView, { enable: [editLabelFeature] });
    configureModelElement(context, CustomTypes.PROPERTIES, GNode, RoundedCornerNodeView);
    configureModelElement(context, CustomTypes.BIBLIOGRAPHY, GLabel, GLabelView, { enable: [editLabelFeature] });
    configureModelElement(context, CustomTypes.ICON_PROPERTIES, GLabel, IconPropertiesLabelNodeView);
    configureModelElement(context, CustomTypes.PREVIOUS_REQUIREMENTS, GLabel, GLabelView, { enable: [editLabelFeature] });
    configureModelElement(context, CustomTypes.SKILLS, GLabel, GLabelView, { enable: [editLabelFeature] });
    configureModelElement(context, CustomTypes.ASSESMENT_CRITERIA, GLabel, GLabelView, { enable: [editLabelFeature] });
    configureModelElement(context, CustomTypes.SUBJECT, GLabel, GLabelView, { enable: [editLabelFeature] });
    configureModelElement(context, CustomTypes.AREA, GLabel, GLabelView, { enable: [editLabelFeature] });
    configureModelElement(context, CustomTypes.OFFER, GLabel, GLabelView, { enable: [editLabelFeature] });
    configureModelElement(context, CustomTypes.SEMESTER, GLabel, GLabelView, { enable: [editLabelFeature] });
    configureModelElement(context, CustomTypes.CREDITS, GLabel, GLabelView, { enable: [editLabelFeature] });
    configureModelElement(context, CustomTypes.LARGE_GROUP_HOURS, GLabel, GLabelView, { enable: [editLabelFeature] });
    configureModelElement(context, CustomTypes.SMALL_GROUP_HOURS, GLabel, GLabelView, { enable: [editLabelFeature] });
    configureModelElement(context, CustomTypes.COORDINATOR, GLabel, GLabelView, { enable: [editLabelFeature] });
    configureModelElement(context, CustomTypes.CONCEPT, LabeledNode, ConceptNodeView);
    configureModelElement(context, CustomTypes.CONCEPT_NAME, GLabel, GLabelView, { enable: [editLabelFeature] });
    configureModelElement(context, CustomTypes.ANNOTATIONS, GLabel, GLabelView, { enable: [editLabelFeature] });
    configureModelElement(context, CustomTypes.AFTER, GEdge, ConceptMapUsesTopicEdgeView);
    configureModelElement(context, CustomTypes.AFTER_LABEL, GLabel, GLabelView);
    configureModelElement(context, CustomTypes.USES, GEdge, ConceptMapUsesEdgeView);
    configureModelElement(context, CustomTypes.USES_LABEL, GLabel, GLabelView);
    configureModelElement(context, CustomTypes.SPECIALIZES, GEdge, ConceptMapSpecializesEdgeView);
    configureModelElement(context, CustomTypes.SPECIALIZES_LABEL, GLabel, GLabelView);
    configureModelElement(context, DefaultTypes.ROUTING_POINT, GRoutingHandle, GRoutingHandleView);
    configureModelElement(context, CustomTypes.COMP_NAME, GCompartment, GCompartmentView);
    configureModelElement(context, CustomTypes.FEATURE, IconLabelCompartment, GCompartmentView);
    configureModelElement(context, CustomTypes.NAME, GLabel, GLabelView, { enable: [editLabelFeature] });
    configureModelElement(context, CustomTypes.FEATURE_NAME, GLabel, GLabelView, { enable: [editLabelFeature] });
    configureModelElement(context, CustomTypes.FEATURE_IMAGE, GLabel, FeatureLabelNodeView);
    configureModelElement(context, CustomTypes.COMP_AUTHOR, GCompartment, GCompartmentView);
    configureModelElement(context, CustomTypes.AUTHOR, GLabel, GLabelView, { enable: [editLabelFeature] });
    configureModelElement(context, CustomTypes.UBICATION, GLabel, GLabelView, { enable: [editLabelFeature] });
    configureModelElement(context, CustomTypes.ICON_IMPORTED, GLabel, IconImportedLabelNodeView);
    configureModelElement(context, CustomTypes.ICON_CONCEPT, GLabel, IconImportedLabelNodeView);
    configureModelElement(context, CustomTypes.ICON_TOPIC, GLabel, IconTopicLabelNodeView);
});

export function initializeConceptMapDiagramContainer(container: Container, ...containerConfiguration: ContainerConfiguration): Container {
    return initializeDiagramContainer(container, conceptMapDiagramModule, ...containerConfiguration);
}
