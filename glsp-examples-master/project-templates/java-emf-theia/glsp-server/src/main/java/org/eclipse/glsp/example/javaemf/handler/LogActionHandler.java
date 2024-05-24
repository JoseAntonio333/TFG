package org.eclipse.glsp.example.javaemf.handler;

import java.util.Collections;
import java.util.List;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.glsp.example.javaemf.action.LogAction;
import org.eclipse.glsp.server.actions.AbstractActionHandler;
import org.eclipse.glsp.server.actions.Action;
import org.eclipse.glsp.server.types.Severity;

public class LogActionHandler extends AbstractActionHandler<LogAction> {
   private static Logger LOGGER = LogManager.getLogger(LogActionHandler.class);

   @Override
   protected List<Action> executeAction(final LogAction action) {
      LOGGER.log(toLevel(action.getSeverity()), action.getMessage());
      return Collections.emptyList();
   }

   private static Level toLevel(final Severity severity) {
      return Level.toLevel(severity.toString(), Level.DEBUG);
   }

}