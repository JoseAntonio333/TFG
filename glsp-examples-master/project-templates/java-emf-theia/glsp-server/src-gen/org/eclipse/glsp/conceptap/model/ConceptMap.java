/**
 */
package org.eclipse.glsp.conceptap.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.conceptap.model.ConceptMap#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getConceptMap()
 * @model
 * @generated
 */
public interface ConceptMap extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Course</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.glsp.conceptap.model.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' containment reference list.
	 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getConceptMap_Course()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourse();

} // ConceptMap
