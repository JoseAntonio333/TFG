package org.eclipse.glsp.example.javaemf.action;

import org.eclipse.glsp.server.actions.Action;
import org.eclipse.glsp.server.types.Severity;

public class LogAction extends Action {
   public static final String KIND = "logAction";

   private Severity severity;
   private String message;

   public LogAction() {
      super(KIND);
   }

   public LogAction(final Severity severity, final String message) {
      this();
      this.severity = severity;
      this.message = message;
   }

   public void setSeverity(final Severity severity) { this.severity = severity; }

   public Severity getSeverity() { return severity; }

   public void setMessage(final String message) { this.message = message; }

   public String getMessage() { return message; }

}