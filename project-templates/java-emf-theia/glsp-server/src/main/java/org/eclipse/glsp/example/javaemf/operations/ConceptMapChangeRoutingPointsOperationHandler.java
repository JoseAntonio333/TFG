package org.eclipse.glsp.example.javaemf.operations;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.eclipse.emf.common.command.Command;
import org.eclipse.glsp.graph.GEdge;
import org.eclipse.glsp.graph.GPoint;
import org.eclipse.glsp.server.emf.notation.EMFNotationModelState;
import org.eclipse.glsp.server.operations.ChangeRoutingPointsOperation;
import org.eclipse.glsp.server.operations.GModelOperationHandler;
import org.eclipse.glsp.server.types.ElementAndRoutingPoints;

import com.google.inject.Inject;

public class ConceptMapChangeRoutingPointsOperationHandler extends GModelOperationHandler<ChangeRoutingPointsOperation>{
   
    private static Logger logger = Logger.getLogger(ConceptMapChangeRoutingPointsOperationHandler.class.getName());
   
    @Inject
    protected EMFNotationModelState modelState;

    @Override
    public Optional<Command> createCommand(ChangeRoutingPointsOperation operation) {
        return commandOf(() -> executeOperation(operation));
    }

    private void executeOperation(final ChangeRoutingPointsOperation operation) {

        List<ElementAndRoutingPoints> routingPoints = operation.getNewRoutingPoints();
        logger.fine("=== ChangeRoutingPointsOperation - " + routingPoints.size() + " routing points");
        try {
            for (ElementAndRoutingPoints routingPoint : routingPoints) {
                String id = routingPoint.getElementId();
                List<GPoint> newGLSPRoutingPoints = routingPoint.getNewRoutingPoints();
                // update the GModel.
                GEdge edge = (GEdge) modelState.getIndex().get(id).orElse(null);
                if (edge != null) {
                    logger.fine("===== Updating GLSP RoutingPoints =======");
                    edge.getRoutingPoints().clear();
                    edge.getRoutingPoints().addAll(newGLSPRoutingPoints);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}