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
import { ContainerConfiguration } from '@eclipse-glsp/protocol';
import { GLSPDiagramConfiguration } from '@eclipse-glsp/theia-integration/lib/browser';
import { Container, injectable } from '@theia/core/shared/inversify';
import { initializeConceptMapDiagramContainer } from '../../../../conceptmap-glsp';
import { ConceptMapLanguage } from '../../common/conceptmap-language';

@injectable()
export class ConceptMapDiagramConfiguration extends GLSPDiagramConfiguration {
    readonly diagramType = ConceptMapLanguage.diagramType;

    override configureContainer(container: Container, ...containerConfiguration: ContainerConfiguration): void {
        initializeConceptMapDiagramContainer(container, ...containerConfiguration);
    }
}
