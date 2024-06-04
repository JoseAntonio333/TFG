/********************************************************************************
 * Copyright (c) 2019-2023 EclipseSource and others.
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
    GEdge,
    GLabel,
    GLabelView,
    GNode,
    Point,
    PolylineEdgeViewWithGapsOnIntersections,
    RectangularNode,
    RectangularNodeView,
    RenderingContext,
    RoundedCornerNodeView,
    angleOfPoint,
    getSubType,
    setAttr,
    svg,
    toDegrees
} from '@eclipse-glsp/client';
import { injectable } from 'inversify';
import { VNode } from 'snabbdom';

// eslint-disable-next-line @typescript-eslint/no-unused-vars
const JSX = { createElement: svg };

@injectable()
export class ConceptMapUsesTopicEdgeView extends PolylineEdgeViewWithGapsOnIntersections {
    protected override renderAdditionals(edge: GEdge, segments: Point[], context: RenderingContext): VNode[] {
        const additionals = super.renderAdditionals(edge, segments, context);
        const p1 = segments[segments.length - 2];
        const p2 = segments[segments.length - 1];
        const arrow = (
            <path
                class-uses-topic-edge={true}
                class-arrow-uses-topic={true}
                d='M 1,0 L 10,-4 L 10,4 Z'
                transform={`rotate(${toDegrees(angleOfPoint(Point.subtract(p1, p2)))} ${p2.x} ${p2.y}) translate(${p2.x} ${p2.y})`}
            />
        );
        const labelVnode = context.renderChildren(edge);
        additionals.push(arrow);
        return (
            <g>
                {additionals}
                {labelVnode}
            </g>
        );
    }
}

@injectable()
export class ConceptMapUsesEdgeView extends PolylineEdgeViewWithGapsOnIntersections {
    protected override renderAdditionals(edge: GEdge, segments: Point[], context: RenderingContext): VNode[] {
        const additionals = super.renderAdditionals(edge, segments, context);
        const p1 = segments[segments.length - 2];
        const p2 = segments[segments.length - 1];
        const arrow = (
            <path
                class-uses-edge={true}
                class-uses-arrow={true}
                d='M 1,0 L 10,-4 L 10,4 Z'
                transform={`rotate(${toDegrees(angleOfPoint(Point.subtract(p1, p2)))} ${p2.x} ${p2.y}) translate(${p2.x} ${p2.y})`}
            />
        );
        additionals.push(arrow);
        return additionals;
    }
}

@injectable()
export class ConceptMapSpecializesEdgeView extends PolylineEdgeViewWithGapsOnIntersections {
    protected override renderAdditionals(edge: GEdge, segments: Point[], context: RenderingContext): VNode[] {
        const additionals = super.renderAdditionals(edge, segments, context);
        const p1 = segments[segments.length - 2];
        const p2 = segments[segments.length - 1];
        const arrow = (
            <path
                class-specializes-edge={true}
                class-specializes-arrow={true}
                d='M 1,0 L 10,-4 L 10,4 Z'
                transform={`rotate(${toDegrees(angleOfPoint(Point.subtract(p1, p2)))} ${p2.x} ${p2.y}) translate(${p2.x} ${p2.y})`}
            />
        );
        additionals.push(arrow);
        return additionals;
    }
}

@injectable()
export class TopicNodeView extends RoundedCornerNodeView {
    override render(node: RectangularNode, context: RenderingContext): VNode {
        const rhombStr = 'M 0,38  L ' + node.bounds.width + ',38';

        const classNode: any = (
            <g class-node={true}>
                <defs>
                    <filter id='dropShadow'>
                        <feDropShadow dx='0.5' dy='0.5' stdDeviation='0.4' />
                    </filter>
                </defs>

                <rect
                    class-sprotty-node={true}
                    class-selected={node.selected}
                    class-mouseover={node.hoverFeedback}
                    x={0}
                    y={0}
                    rx={6}
                    ry={6}
                    width={Math.max(0, node.bounds.width)}
                    height={Math.max(0, node.bounds.height)}
                />
                {context.renderChildren(node)}
                {node.children[1] && node.children[1].children.length > 0 ? <path class-sprotty-edge={true} d={rhombStr}></path> : ''}
            </g>
        );
        return classNode;
    }
}

@injectable()
export class CaptionNodeView extends RoundedCornerNodeView {
    override render(node: RectangularNode, context: RenderingContext): VNode {
        const rhombStr = 'M 0,38  L ' + node.bounds.width + ',38';
        const initialWidth = 370;
        const initialHeight = 70;

        const d =
            'M14 2H8L7 3v3h1V3h6v5h-4v1h4l1-1V3l-1-1zM9 6h4v1H9.41L9 6.59V6zM7 7H2L1 8v5l1 1h6l1-1V8L8 7H7zm1 6H2V8h6v5zM3 9h4v1H3V9zm0 2h4v1H3v-1zm6-7h4v1H9V4z';

        const image = (
            <svg
                width='16'
                height='16'
                viewBox='0 0 16 16'
                xmlns='http://www.w3.org/2000/svg'
                fill='black'
                x={5}
                y={5} // Aquí estableces la posición de la imagen
            >
                <path fill-rule='evenodd' clip-rule='evenodd' d={d} />
            </svg>
        );

        const classNode: any = (
            <g class-node={true}>
                <defs>
                    <filter id='dropShadow'>
                        <feDropShadow dx='0.5' dy='0.5' stdDeviation='0.4' />
                    </filter>
                </defs>

                <rect
                    class-sprotty-node={true}
                    class-selected={node.selected}
                    class-mouseover={node.hoverFeedback}
                    x={0}
                    y={0}
                    rx={6}
                    ry={6}
                    width={initialWidth}
                    height={initialHeight}
                    stroke='black'
                    stroke-width='3'
                    fill='white'
                />

                {context.renderChildren(node)}

                {image}

                {node.children[1] && node.children[1].children.length > 0 ? <path class-sprotty-edge={true} d={rhombStr}></path> : ''}

                <text x='190' y='20' class-header={true}>
                    LEGEND
                </text>

                <text x='60' y='40' class-caption='true'>
                    Uses (For Concepts)
                </text>

                <line x1='20' y1='55' x2='110' y2='55' class-line-uses={true} />
                <polygon points='100,50 110,55 100,60' fill='black' />

                <text x='200' y='40' class-caption='true'>
                    Specializes (For Concepts)
                </text>

                <line x1='160' y1='55' x2='255' y2='55' class-line-specializes={true} />
                <polygon points='255,50 265,55 255,60' fill='gray' />

                <text x='320' y='40' class-caption='true'>
                    After (For Topics)
                </text>

                <line x1='280' y1='55' x2='340' y2='55' class-uses-topic-edge={true} />
                <polygon points='340,50 350,55 340,60' fill='black' />
            </g>
        );

        return classNode;
    }
}

@injectable()
export class ClassNodeView extends RectangularNodeView {
    override render(node: GNode, context: RenderingContext): VNode {
        const rhombStr = 'M 0,38  L ' + node.bounds.width + ',38';

        const classNode: any = (
            <g class-node={true}>
                <defs>
                    <filter id='dropShadow'>
                        <feDropShadow dx='0.5' dy='0.5' stdDeviation='0.4' />
                    </filter>
                </defs>

                <rect
                    class-sprotty-node={true}
                    class-selected={node.selected}
                    class-mouseover={node.hoverFeedback}
                    x={0}
                    y={0}
                    rx={6}
                    ry={6}
                    width={Math.max(0, node.bounds.width)}
                    height={Math.max(0, node.bounds.height)}
                />
                {context.renderChildren(node)}
                {node.children[1] && node.children[1].children.length > 0 ? <path class-sprotty-edge={true} d={rhombStr}></path> : ''}
            </g>
        );
        return classNode;
    }
}

@injectable()
export class FeatureLabelNodeView extends GLabelView {
    override render(labelNode: Readonly<GLabel>, context: RenderingContext): VNode {
        const d = 'M9.595 6.252L8 1 6.405 6.252H1l4.373 3.4L3.75 15 8 11.695 12.25 15l-1.623-5.348L15 6.252H9.595z';

        const image = (
            <svg width='16' height='16' viewBox='0 0 16 16' xmlns='http://www.w3.org/2000/svg' fill='black'>
                <path fill-rule='evenodd' clip-rule='evenodd' d={d} />
            </svg>
        );

        const vnode: VNode = (
            <g class-selected={labelNode.selected} class-mouseover={true} class-sprotty-label-node={true}>
                {image}
                <text class-sprotty-label={true} x={20}>
                    {labelNode.text}
                </text>
            </g>
        );

        const subType = getSubType(labelNode);
        if (subType) {
            setAttr(vnode, 'class', subType);
        }
        return vnode;
    }
}

@injectable()
export class IconPropertiesLabelNodeView extends GLabelView {
    override render(labelNode: Readonly<GLabel>, context: RenderingContext): VNode {
        const d =
            'M2.807 14.975a1.75 1.75 0 0 1-1.255-.556 1.684 1.684 0 0 1-.544-1.1A1.72 1.72 0 0 1 1.36 12.1c1.208-1.27 3.587-3.65 5.318-5.345a4.257 4.257 0 0 1 .048-3.078 4.095 4.095 0 0 1 1.665-1.969 4.259 4.259 0 0 1 4.04-.36l.617.268-2.866 2.951 1.255 1.259 2.944-2.877.267.619a4.295 4.295 0 0 1 .04 3.311 4.198 4.198 0 0 1-.923 1.392 4.27 4.27 0 0 1-.743.581 4.217 4.217 0 0 1-3.812.446c-1.098 1.112-3.84 3.872-5.32 5.254a1.63 1.63 0 0 1-1.084.423zm7.938-13.047a3.32 3.32 0 0 0-1.849.557c-.213.13-.412.284-.591.458a3.321 3.321 0 0 0-.657 3.733l.135.297-.233.227c-1.738 1.697-4.269 4.22-5.485 5.504a.805.805 0 0 0 .132 1.05.911.911 0 0 0 .298.22c.1.044.209.069.319.072a.694.694 0 0 0 .45-.181c1.573-1.469 4.612-4.539 5.504-5.44l.23-.232.294.135a3.286 3.286 0 0 0 3.225-.254 3.33 3.33 0 0 0 .591-.464 3.28 3.28 0 0 0 .964-2.358c0-.215-.021-.43-.064-.642L11.43 7.125 8.879 4.578l2.515-2.59a3.286 3.286 0 0 0-.65-.06z';

        const image = (
            <svg width='16' height='16' viewBox='0 0 16 16' xmlns='http://www.w3.org/2000/svg' fill='black'>
                <path fill-rule='evenodd' clip-rule='evenodd' d={d} />
            </svg>
        );

        const vnode: VNode = (
            <g class-selected={labelNode.selected} class-mouseover={true} class-sprotty-label-node={true}>
                {image}
                <text class-sprotty-label={true} x={20}>
                    {labelNode.text}
                </text>
            </g>
        );

        const subType = getSubType(labelNode);
        if (subType) {
            setAttr(vnode, 'class', subType);
        }
        return vnode;
    }
}

@injectable()
export class IconImportedLabelNodeView extends GLabelView {
    override render(labelNode: Readonly<GLabel>, context: RenderingContext): VNode {
        const d =
            'M10.57 1.14l3.28 3.3.15.36v9.7l-.5.5H10v-1h3V6H9.5L9 5.5V2H3v4H2V1.5l.5-.5h7.72l.35.14zM10 5h3l-3-3v3zM8.5 7h-7l-.5.5v7l.5.5h7l.5-.5v-7L8.5 7zM8 14H2V8h6v6zM7 9.5v3H6v-1.793l-2.646 2.647-.708-.708L5.293 10H3.53V9H6.5l.5.5z';

        const image = (
            <svg width='16' height='16' viewBox='0 0 16 16' xmlns='http://www.w3.org/2000/svg' fill='black'>
                <path fill-rule='evenodd' clip-rule='evenodd' d={d} />
            </svg>
        );

        const vnode: VNode = (
            <g class-selected={labelNode.selected} class-mouseover={true} class-sprotty-label-node={true}>
                {image}
                <text class-sprotty-label={true} x={20}>
                    {labelNode.text}
                </text>
            </g>
        );

        const subType = getSubType(labelNode);
        if (subType) {
            setAttr(vnode, 'class', subType);
        }
        return vnode;
    }
}

@injectable()
export class IconConceptLabelNodeView extends GLabelView {
    override render(labelNode: Readonly<GLabel>, context: RenderingContext): VNode {
        const d = 'M1.5 1h13l.5.5v12l-.5.5h-13l-.5-.5v-12l.5-.5zM2 5v8h12V5H2zm0-1h12V2H2v2z';

        const image = (
            <svg width='16' height='16' viewBox='0 0 16 16' xmlns='http://www.w3.org/2000/svg' fill='black'>
                <path fill-rule='evenodd' clip-rule='evenodd' d={d} />
            </svg>
        );

        const vnode: VNode = (
            <g class-selected={labelNode.selected} class-mouseover={true} class-sprotty-label-node={true}>
                {image}
                <text class-sprotty-label={true} x={20}>
                    {labelNode.text}
                </text>
            </g>
        );

        const subType = getSubType(labelNode);
        if (subType) {
            setAttr(vnode, 'class', subType);
        }
        return vnode;
    }
}

@injectable()
export class ConceptNodeView extends RoundedCornerNodeView {
    override render(model: GNode, context: RenderingContext): VNode {
        const vnode = (
            <rect
                class-sprotty-node={true}
                class-concept-node={true}
                x={0}
                y={0}
                width={model.size.width}
                height={model.size.height}
            ></rect>
        );
        const labelVnode = context.renderChildren(model);
        return (
            <g>
                {vnode}
                {labelVnode}
            </g>
        );
    }
}

@injectable()
export class IconTopicLabelNodeView extends GLabelView {
    override render(labelNode: Readonly<GLabel>, context: RenderingContext): VNode {
        const d =
            'M13.5 2h-12l-.5.5v11l.5.5h12l.5-.5v-11l-.5-.5zM2 3h11v1H2V3zm7 4H6V5h3v2zm0 1v2H6V8h3zM2 5h3v2H2V5zm0 3h3v2H2V8zm0 5v-2h3v2H2zm4 0v-2h3v2H6zm7 0h-3v-2h3v2zm0-3h-3V8h3v2zm-3-3V5h3v2h-3z';

        const image = (
            <svg width='16' height='16' viewBox='0 0 16 16' xmlns='http://www.w3.org/2000/svg' fill='black'>
                <path fill-rule='evenodd' clip-rule='evenodd' d={d} />
            </svg>
        );

        const vnode: VNode = (
            <g class-selected={labelNode.selected} class-mouseover={true} class-sprotty-label-node={true}>
                {image}
                <text class-sprotty-label={true} x={20}>
                    {labelNode.text}
                </text>
            </g>
        );

        const subType = getSubType(labelNode);
        if (subType) {
            setAttr(vnode, 'class', subType);
        }
        return vnode;
    }
}
