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

import org.eclipse.glsp.example.javaemf.action.ConceptMapChangeBoundsOperation;
import org.eclipse.glsp.example.javaemf.editname.EditNameValidator;
import org.eclipse.glsp.example.javaemf.handler.ConceptMapRequestContextActionsHandler;
import org.eclipse.glsp.example.javaemf.handler.CreateAfterEdgeHandler;
import org.eclipse.glsp.example.javaemf.handler.CreateConceptNodeHandler;
import org.eclipse.glsp.example.javaemf.handler.CreateFeatureNodeHandler;
import org.eclipse.glsp.example.javaemf.handler.CreateImportedConceptHandler;
import org.eclipse.glsp.example.javaemf.handler.CreateLegendNodeHandler;
import org.eclipse.glsp.example.javaemf.handler.CreatePropertiesNodeHandler;
import org.eclipse.glsp.example.javaemf.handler.CreateSpecializesEdgeHandler;
import org.eclipse.glsp.example.javaemf.handler.CreateTopicNodeHandler;
import org.eclipse.glsp.example.javaemf.handler.CreateUsesEdgeHandler;
import org.eclipse.glsp.example.javaemf.handler.DeleteConceptNodeHandler;
import org.eclipse.glsp.example.javaemf.handler.DeleteCourseNodeHandler;
import org.eclipse.glsp.example.javaemf.handler.DeleteFeatureNodeHandler;
import org.eclipse.glsp.example.javaemf.handler.DeleteImportedConceptNodeHandler;
import org.eclipse.glsp.example.javaemf.handler.DeleteLegendNodeHandler;
import org.eclipse.glsp.example.javaemf.handler.DeletePropertiesNodeHandler;
import org.eclipse.glsp.example.javaemf.handler.DeleteSpecializesEdgeHandler;
import org.eclipse.glsp.example.javaemf.handler.DeleteTopicNodeHandler;
import org.eclipse.glsp.example.javaemf.handler.DeleteUsesEdgeHandler;
import org.eclipse.glsp.example.javaemf.handler.DeleteUsesTopicEdgeHandler;
import org.eclipse.glsp.example.javaemf.handler.EditNameHandler;
import org.eclipse.glsp.example.javaemf.handler.LogActionHandler;
import org.eclipse.glsp.example.javaemf.marker.ConceptMapValidator;
import org.eclipse.glsp.example.javaemf.model.ConceptMapGModelFactory;
import org.eclipse.glsp.example.javaemf.model.ConceptMapSourceModelStorage;
import org.eclipse.glsp.example.javaemf.operations.ConceptMapChangeRoutingPointsOperationHandler;
import org.eclipse.glsp.example.javaemf.palette.ConceptMapToolPaletteItemProvider;
import org.eclipse.glsp.server.actions.ActionHandler;
import org.eclipse.glsp.server.di.MultiBinding;
import org.eclipse.glsp.server.diagram.DiagramConfiguration;
import org.eclipse.glsp.server.emf.EMFIdGenerator;
import org.eclipse.glsp.server.emf.EMFSourceModelStorage;
import org.eclipse.glsp.server.emf.idgen.AttributeIdGenerator;
import org.eclipse.glsp.server.emf.notation.EMFNotationDiagramModule;
import org.eclipse.glsp.server.features.contextactions.RequestContextActionsHandler;
import org.eclipse.glsp.server.features.core.model.GModelFactory;
import org.eclipse.glsp.server.features.directediting.LabelEditValidator;
import org.eclipse.glsp.server.features.toolpalette.ToolPaletteItemProvider;
import org.eclipse.glsp.server.features.validation.ModelValidator;
import org.eclipse.glsp.server.operations.OperationHandler;

public class ConceptMapDiagramModule extends EMFNotationDiagramModule {

   @Override
   protected Class<? extends DiagramConfiguration> bindDiagramConfiguration() {
      // define what operations are allowed with our elements
      return ConceptMapDiagramConfiguration.class;
   }

   @Override
   protected Class<? extends EMFSourceModelStorage> bindSourceModelStorage() {
      // ensure our custom package is registered when loading our models
      return ConceptMapSourceModelStorage.class;
   }

   @Override
   public Class<? extends GModelFactory> bindGModelFactory() {
      // custom factory to convert tasks into nodes
      return ConceptMapGModelFactory.class;
   }

   @Override
   protected Class<? extends EMFIdGenerator> bindEMFIdGenerator() {
      // all our elements inherit from Identifiable and have an ID attribute set
      return AttributeIdGenerator.class;
   }

   @Override
   protected Class<? extends ToolPaletteItemProvider> bindToolPaletteItemProvider() {
      return ConceptMapToolPaletteItemProvider.class;
   }

   @Override
   protected void configureOperationHandlers(final MultiBinding<OperationHandler<?>> binding) {
      super.configureOperationHandlers(binding);
      // binding.add(CreateCourseNodeHandler.class);
      binding.add(DeleteCourseNodeHandler.class);
      binding.add(CreateImportedConceptHandler.class);
      binding.add(DeleteImportedConceptNodeHandler.class);
      binding.add(CreateLegendNodeHandler.class);
      binding.add(DeleteLegendNodeHandler.class);
      binding.add(DeleteTopicNodeHandler.class);
      binding.add(CreateTopicNodeHandler.class);
      binding.add(CreatePropertiesNodeHandler.class);
      binding.add(DeletePropertiesNodeHandler.class);
      binding.add(CreateConceptNodeHandler.class);
      binding.add(DeleteConceptNodeHandler.class);
      binding.add(CreateAfterEdgeHandler.class);
      binding.add(DeleteUsesTopicEdgeHandler.class);
      binding.add(CreateUsesEdgeHandler.class);
      binding.add(DeleteUsesEdgeHandler.class);
      binding.add(CreateSpecializesEdgeHandler.class);
      binding.add(DeleteSpecializesEdgeHandler.class);
      binding.add(CreateFeatureNodeHandler.class);
      binding.add(DeleteFeatureNodeHandler.class);
      binding.add(ConceptMapChangeRoutingPointsOperationHandler.class);
      binding.add(EditNameHandler.class);
      binding.add(ConceptMapChangeBoundsOperation.class);
   }

   @Override
   protected Class<? extends ModelValidator> bindModelValidator() {
      return ConceptMapValidator.class;
   }

   @Override
   protected Class<? extends LabelEditValidator> bindLabelEditValidator() {
      return EditNameValidator.class;
   }

   @Override
   protected void configureActionHandlers(final MultiBinding<ActionHandler> binding) {
      super.configureActionHandlers(binding);
      binding.rebind(RequestContextActionsHandler.class, ConceptMapRequestContextActionsHandler.class);
      binding.add(LogActionHandler.class);

   }

   @Override
   public String getDiagramType() { return "conceptmap-diagram"; }

}
