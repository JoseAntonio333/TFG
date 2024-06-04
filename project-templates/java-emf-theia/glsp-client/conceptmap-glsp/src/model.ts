/********************************************************************************
 * Copyright (c) 2020-2023 EclipseSource and others.
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
import {
    Deletable,
    EditableLabel,
    GChildElement,
    GCompartment,
    GModelElement,
    Hoverable,
    Nameable,
    RectangularNode,
    Selectable,
    WithEditableLabel,
    boundsFeature,
    connectableFeature,
    deletableFeature,
    fadeFeature,
    hoverFeedbackFeature,
    isEditableLabel,
    layoutContainerFeature,
    moveFeature,
    nameFeature,
    popupFeature,
    selectFeature,
    withEditLabelFeature
} from '@eclipse-glsp/client';

export class CourseNode extends RectangularNode implements Nameable, WithEditableLabel {
    static override readonly DEFAULT_FEATURES = [
        connectableFeature,
        deletableFeature,
        selectFeature,
        boundsFeature,
        moveFeature,
        layoutContainerFeature,
        fadeFeature,
        hoverFeedbackFeature,
        popupFeature,
        nameFeature,
        withEditLabelFeature
    ];

    get editableLabel(): (GChildElement & EditableLabel) | undefined {
        const label = this.children.find(element => element.type === 'label:name');
        if (label && isEditableLabel(label)) {
            return label;
        }
        return undefined;
    }

    get name(): string {
        const labelText = this.editableLabel?.text;
        return labelText ? labelText : '<unknown>';
    }
}

export function isCourseNode(element: GModelElement): element is CourseNode {
    return element instanceof CourseNode || false;
}

export class IconLabelCompartment extends GCompartment implements Selectable, Deletable, Hoverable {
    selected = false;
    hoverFeedback = false;

    override hasFeature(feature: symbol): boolean {
        return super.hasFeature(feature) || feature === selectFeature || feature === deletableFeature || feature === hoverFeedbackFeature;
    }
}

export class LabeledNode extends RectangularNode implements WithEditableLabel, Nameable {
    get editableLabel(): (GChildElement & EditableLabel) | undefined {
        const headerNode = this.children.find(element => element.type === 'node:feature');
        if (headerNode) {
            const label = headerNode.children.find(element => element.type === 'label:feature_name');
            if (label && isEditableLabel(label)) {
                return label;
            }
        }
        return undefined;
    }

    get name(): string {
        if (this.editableLabel) {
            return this.editableLabel.text;
        }
        return this.id;
    }
    override hasFeature(feature: symbol): boolean {
        return super.hasFeature(feature) || feature === nameFeature || feature === withEditLabelFeature;
    }
}
