/**
 */
package org.eclipse.glsp.conceptap.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.conceptap.model.Topic#getTopic_name <em>Topic name</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.Topic#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.Topic#getAfter <em>After</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.Topic#getConcept <em>Concept</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.Topic#getImported_concept <em>Imported concept</em>}</li>
 * </ul>
 *
 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getTopic()
 * @model
 * @generated
 */
public interface Topic extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Topic name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic name</em>' attribute.
	 * @see #setTopic_name(String)
	 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getTopic_Topic_name()
	 * @model required="true"
	 * @generated
	 */
	String getTopic_name();

	/**
	 * Sets the value of the '{@link org.eclipse.glsp.conceptap.model.Topic#getTopic_name <em>Topic name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic name</em>' attribute.
	 * @see #getTopic_name()
	 * @generated
	 */
	void setTopic_name(String value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' attribute.
	 * @see #setAnnotations(String)
	 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getTopic_Annotations()
	 * @model
	 * @generated
	 */
	String getAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.glsp.conceptap.model.Topic#getAnnotations <em>Annotations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' attribute.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(String value);

	/**
	 * Returns the value of the '<em><b>After</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.glsp.conceptap.model.After}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After</em>' containment reference list.
	 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getTopic_After()
	 * @model containment="true"
	 * @generated
	 */
	EList<After> getAfter();

	/**
	 * Returns the value of the '<em><b>Concept</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.glsp.conceptap.model.Concept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept</em>' containment reference list.
	 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getTopic_Concept()
	 * @model containment="true"
	 * @generated
	 */
	EList<Concept> getConcept();

	/**
	 * Returns the value of the '<em><b>Imported concept</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.glsp.conceptap.model.Imported_Concept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported concept</em>' containment reference list.
	 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getTopic_Imported_concept()
	 * @model containment="true"
	 * @generated
	 */
	EList<Imported_Concept> getImported_concept();

} // Topic
