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
    Point,
    PolylineEdgeViewWithGapsOnIntersections,
    RenderingContext,
    angleOfPoint,
    svg,
    toDegrees,
    RoundedCornerNodeView,
    RectangularNode,
    RectangularNodeView,
    GNode
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
        additionals.push(arrow);
        return additionals;
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

        const rhombStr = "M 0,38  L " + node.bounds.width + ",38";

        const classNode: any = (<g class-node={true}>
            <defs>
                <filter id="dropShadow">
                    <feDropShadow dx="0.5" dy="0.5" stdDeviation="0.4" />
                </filter>
            </defs>

            <rect class-sprotty-node={true} class-selected={node.selected} class-mouseover={node.hoverFeedback}
                x={0} y={0} rx={6} ry={6}
                width={Math.max(0, node.bounds.width)} height={Math.max(0, node.bounds.height)} />
            {context.renderChildren(node)}
            {(node.children[1] && node.children[1].children.length > 0) ?
                <path class-sprotty-edge={true} d={rhombStr}></path> : ""}
        </g>);
        return classNode;
    }
}

@injectable()
export class CaptionNodeView extends RoundedCornerNodeView {
    override render(node: RectangularNode, context: RenderingContext): VNode {  
        const rhombStr = "M 0,38  L " + node.bounds.width + ",38";
        const initialWidth = 370;
        const initialHeight = 70;

        const classNode: any = (
            <g class-node={true}>
                <defs>
                    <filter id="dropShadow">
                        <feDropShadow dx="0.5" dy="0.5" stdDeviation="0.4" />
                    </filter>
                </defs>

                <rect class-sprotty-node={true} class-selected={node.selected} class-mouseover={node.hoverFeedback}
                    x={0} y={0} rx={6} ry={6}
                    width={initialWidth} height={initialHeight}
                    stroke="black" stroke-width="3" fill="white" />

                {context.renderChildren(node)}
                
                {(node.children[1] && node.children[1].children.length > 0) ?
                    <path class-sprotty-edge={true} d={rhombStr}></path> : ""}

                <text x="190" y="20" class-header={true} >
                    Legend
                </text>

                <text x="60" y="40" class-caption="true">
                    Uses (For Concepts)
                </text>
                
                <line x1="20" y1="55" x2="110" y2="55" class-line-uses={true}/>
                <polygon points="100,50 110,55 100,60" fill="black" />

                <text x="200" y="40" class-caption="true">
                    Specializes (For Concepts)
                </text>
                
                <line x1="160" y1="55" x2="255" y2="55" class-line-specializes={true}/>
                <polygon points="255,50 265,55 255,60" fill="gray" />

                <text x="320" y="40" class-caption="true">
                    After (For Topics)
                </text>
                
                <line x1="280" y1="55" x2="340" y2="55" class-uses-topic-edge={true}/>
                <polygon points="340,50 350,55 340,60" fill="black" />
        </g>
    );

    return classNode;
    }
}


@injectable()
export class ClassNodeView extends RectangularNodeView {
    override render(node: GNode, context: RenderingContext): VNode {

        const rhombStr = "M 0,38  L " + node.bounds.width + ",38";

        const classNode: any = (<g class-node={true}>
            <defs>
                <filter id="dropShadow">
                    <feDropShadow dx="0.5" dy="0.5" stdDeviation="0.4" />
                </filter>
            </defs>

            <rect class-sprotty-node={true} class-selected={node.selected} class-mouseover={node.hoverFeedback}
                x={0} y={0} rx={6} ry={6}
                width={Math.max(0, node.bounds.width)} height={Math.max(0, node.bounds.height)} />
            {context.renderChildren(node)}
            {(node.children[1] && node.children[1].children.length > 0) ?
                <path class-sprotty-edge={true} d={rhombStr}></path> : ""}
        </g>);
        return classNode;
    }
}