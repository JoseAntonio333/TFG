
package org.eclipse.glsp.example.javaemf.editname;

import java.util.List;

import org.eclipse.glsp.conceptap.model.Concept;
import org.eclipse.glsp.conceptap.model.Course;
import org.eclipse.glsp.conceptap.model.Imported_Concept;
import org.eclipse.glsp.conceptap.model.Topic;
import org.eclipse.glsp.graph.GModelElement;
import org.eclipse.glsp.server.emf.notation.EMFNotationModelState;
import org.eclipse.glsp.server.features.directediting.LabelEditValidator;
import org.eclipse.glsp.server.features.directediting.ValidationStatus;

import com.google.inject.Inject;

public class EditNameValidator implements LabelEditValidator {
    @Inject
    protected EMFNotationModelState modelState;

    @Override
    public ValidationStatus validate(String label, GModelElement element) {
        if (label.length() < 1) {
            return ValidationStatus.error("El nombre del curso no puede estar vacio");
        }

        Course course = modelState.getSemanticModel(Course.class).orElseThrow();

        int dups_topic = 0;
        int dups_concept_imported = 0;

        List<Topic> topics = course.getTopic();

        for (Topic topic : topics) {
            if (topic.getTopic_name().equals(label)) {
                dups_topic++;
            }

            List<Concept> concepts = topic.getConcept();
            List<Imported_Concept> importeds = topic.getImported_concept();

            for (Concept concept : concepts) {
                if (concept.getConcept_name().equals(label)) {
                    dups_concept_imported++;
                }
            }

            for (Imported_Concept imported : importeds) {
                if (imported.getConcept_name().equals(label)) {
                    dups_concept_imported++;
                }
            }
        }

        if (dups_topic >= 1) {
            return ValidationStatus.error("There cannot be topic with the same name");
        }

        if (dups_concept_imported >= 1) {
            return ValidationStatus.error("There cannot be concepts or imported concepts with the same name");
        }

        return ValidationStatus.ok();

    }
}
