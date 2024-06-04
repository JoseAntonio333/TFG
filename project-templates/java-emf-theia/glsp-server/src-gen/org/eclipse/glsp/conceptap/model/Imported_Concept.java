/**
 */
package org.eclipse.glsp.conceptap.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imported Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.conceptap.model.Imported_Concept#getConcept_name <em>Concept name</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.Imported_Concept#getUbication <em>Ubication</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.Imported_Concept#getSpecializes <em>Specializes</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.Imported_Concept#getUses <em>Uses</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.Imported_Concept#getRelatedTopic <em>Related Topic</em>}</li>
 * </ul>
 *
 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getImported_Concept()
 * @model
 * @generated
 */
public interface Imported_Concept extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Concept name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept name</em>' attribute.
	 * @see #setConcept_name(String)
	 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getImported_Concept_Concept_name()
	 * @model required="true"
	 * @generated
	 */
	String getConcept_name();

	/**
	 * Sets the value of the '{@link org.eclipse.glsp.conceptap.model.Imported_Concept#getConcept_name <em>Concept name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept name</em>' attribute.
	 * @see #getConcept_name()
	 * @generated
	 */
	void setConcept_name(String value);

	/**
	 * Returns the value of the '<em><b>Ubication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ubication</em>' attribute.
	 * @see #setUbication(String)
	 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getImported_Concept_Ubication()
	 * @model required="true"
	 * @generated
	 */
	String getUbication();

	/**
	 * Sets the value of the '{@link org.eclipse.glsp.conceptap.model.Imported_Concept#getUbication <em>Ubication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ubication</em>' attribute.
	 * @see #getUbication()
	 * @generated
	 */
	void setUbication(String value);

	/**
	 * Returns the value of the '<em><b>Specializes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.glsp.conceptap.model.Specializes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializes</em>' containment reference list.
	 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getImported_Concept_Specializes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specializes> getSpecializes();

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.glsp.conceptap.model.Uses}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' containment reference list.
	 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getImported_Concept_Uses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Uses> getUses();

	/**
	 * Returns the value of the '<em><b>Related Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Topic</em>' attribute.
	 * @see #setRelatedTopic(String)
	 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getImported_Concept_RelatedTopic()
	 * @model required="true"
	 * @generated
	 */
	String getRelatedTopic();

	/**
	 * Sets the value of the '{@link org.eclipse.glsp.conceptap.model.Imported_Concept#getRelatedTopic <em>Related Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Topic</em>' attribute.
	 * @see #getRelatedTopic()
	 * @generated
	 */
	void setRelatedTopic(String value);

} // Imported_Concept
