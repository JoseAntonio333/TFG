package org.eclipse.glsp.example.javaemf.handler;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.glsp.example.javaemf.action.LogAction;
import org.eclipse.glsp.server.actions.Action;
import org.eclipse.glsp.server.features.contextactions.RequestContextActions;
import org.eclipse.glsp.server.features.contextactions.RequestContextActionsHandler;
import org.eclipse.glsp.server.features.contextactions.SetContextActions;
import org.eclipse.glsp.server.types.Severity;

public class ConceptMapRequestContextActionsHandler extends RequestContextActionsHandler {
   @Override
   public List<Action> executeAction(final RequestContextActions action) {
      List<Action> actions = new ArrayList<>(super.executeAction(action));
      actions.stream()
         .filter(SetContextActions.class::isInstance)
         .map(SetContextActions.class::cast)
         .findAny()
         .ifPresent(response -> actions.add(createLogAction(action, response)));
      return actions;
   }

   private LogAction createLogAction(final RequestContextActions request, final SetContextActions response) {
      return new LogAction(Severity.OK,
         "create " + response.getActions().size() + " server actions for " + request.getContextId() + ".");
   }
}