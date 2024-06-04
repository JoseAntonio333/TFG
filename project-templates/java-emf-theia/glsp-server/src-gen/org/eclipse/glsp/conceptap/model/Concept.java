/**
 */
package org.eclipse.glsp.conceptap.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.conceptap.model.Concept#getConcept_name <em>Concept name</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.Concept#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.Concept#getUses <em>Uses</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.Concept#getSpecializes <em>Specializes</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.Concept#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getConcept()
 * @model
 * @generated
 */
public interface Concept extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Concept name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept name</em>' attribute.
	 * @see #setConcept_name(String)
	 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getConcept_Concept_name()
	 * @model required="true"
	 * @generated
	 */
	String getConcept_name();

	/**
	 * Sets the value of the '{@link org.eclipse.glsp.conceptap.model.Concept#getConcept_name <em>Concept name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept name</em>' attribute.
	 * @see #getConcept_name()
	 * @generated
	 */
	void setConcept_name(String value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' attribute.
	 * @see #setAnnotations(String)
	 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getConcept_Annotations()
	 * @model
	 * @generated
	 */
	String getAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.glsp.conceptap.model.Concept#getAnnotations <em>Annotations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' attribute.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(String value);

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.glsp.conceptap.model.Uses}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' containment reference list.
	 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getConcept_Uses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Uses> getUses();

	/**
	 * Returns the value of the '<em><b>Specializes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.glsp.conceptap.model.Specializes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializes</em>' containment reference list.
	 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getConcept_Specializes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specializes> getSpecializes();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.glsp.conceptap.model.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference list.
	 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getConcept_Feature()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeature();

} // Concept
