package org.eclipse.glsp.example.javaemf.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.common.command.Command;
import org.eclipse.glsp.conceptap.model.Concept;
import org.eclipse.glsp.conceptap.model.Course;
import org.eclipse.glsp.conceptap.model.Topic;
import org.eclipse.glsp.graph.GDimension;
import org.eclipse.glsp.graph.GPoint;
import org.eclipse.glsp.graph.impl.GDimensionImpl;
import org.eclipse.glsp.graph.impl.GPointImpl;
import org.eclipse.glsp.server.emf.EMFOperationHandler;
import org.eclipse.glsp.server.emf.model.notation.Shape;
import org.eclipse.glsp.server.emf.notation.EMFNotationModelState;
import org.eclipse.glsp.server.operations.ChangeBoundsOperation;
import org.eclipse.glsp.server.types.ElementAndBounds;

import com.google.inject.Inject;

public class ConceptMapChangeBoundsOperation extends EMFOperationHandler<ChangeBoundsOperation> {

    @Inject
    protected EMFNotationModelState modelState;

    @Override
    public Optional<Command> createCommand(ChangeBoundsOperation operation) {
        System.out.println("ChangeBoundsOperation received: " + operation);

        Map<Shape, ElementAndBounds> changeBoundsMap = new HashMap<>();
        for (ElementAndBounds element : operation.getNewBounds()) {
            modelState.getIndex().getNotation(element.getElementId(), Shape.class).ifPresent(notationElement -> {
                changeBoundsMap.put(notationElement, element);
            });
        }

        Course course = modelState.getSemanticModel(Course.class).orElseThrow();
        List<Topic> topics = course.getTopic();

        for (Topic topic : topics) {
            for (Concept concept : topic.getConcept()) {
                if (changeBoundsMap.containsKey(concept)) {
                    ElementAndBounds elementAndBounds = changeBoundsMap.get(concept);
                    ElementAndBounds topicElementAndBounds = changeBoundsMap.get(topic);
                    if (!isWithinBounds(elementAndBounds, topicElementAndBounds)) {
                        adjustBoundsToTopic(topicElementAndBounds, elementAndBounds);
                    }
                }
            }

        }
        return Optional.empty();
    }

    @Override
    public String getLabel() { return "Change bounds"; }

    private void adjustBoundsToTopic(ElementAndBounds topicElementAndBounds, ElementAndBounds elementAndBounds) {
        double topicX = topicElementAndBounds.getNewPosition().getX();
        double topicY = topicElementAndBounds.getNewPosition().getY();
        double topicWidth = topicElementAndBounds.getNewSize().getWidth();
        double topicHeight = topicElementAndBounds.getNewSize().getHeight();

        double conceptX = elementAndBounds.getNewPosition().getX();
        double conceptY = elementAndBounds.getNewPosition().getY();
        double conceptWidth = elementAndBounds.getNewSize().getWidth();
        double conceptHeight = elementAndBounds.getNewSize().getHeight();

        if (conceptX < topicX) {
            conceptX = topicX;
        }
        if (conceptY < topicY) {
            conceptY = topicY;
        }
        if ((conceptX + conceptWidth) > (topicX + topicWidth)) {
            conceptX = (topicX + topicWidth) - conceptWidth;
        }
        if ((conceptY + conceptHeight) > (topicY + topicHeight)) {
            conceptY = (topicY + topicHeight) - conceptHeight;
        }

        GPoint newPosition = new GPointImpl();
        GDimension newDimension = new GDimensionImpl();
        newPosition.setX(conceptX);
        newPosition.setY(conceptY);
        newDimension.setWidth(conceptWidth);
        newDimension.setHeight(conceptHeight);
        elementAndBounds.setNewPosition(newPosition);
        elementAndBounds.setNewSize(newDimension);

    }

    private boolean isWithinBounds(ElementAndBounds elementAndBounds, ElementAndBounds topicElementAndBounds) {
        double topicX = topicElementAndBounds.getNewPosition().getX();
        double topicY = topicElementAndBounds.getNewPosition().getY();
        double topicWidth = topicElementAndBounds.getNewSize().getWidth();
        double topicHeight = topicElementAndBounds.getNewSize().getHeight();
        double conceptX = elementAndBounds.getNewPosition().getX();
        double conceptY = elementAndBounds.getNewPosition().getY();
        double conceptWidth = elementAndBounds.getNewSize().getWidth();
        double conceptHeight = elementAndBounds.getNewSize().getHeight();
        return (conceptX >= topicX &&
            conceptY >= topicY &&
            (conceptX + conceptWidth) <= (topicX + topicWidth) &&
            (conceptY + conceptHeight) <= (topicY + topicHeight));
    }
}
