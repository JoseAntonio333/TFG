/**
 */
package org.eclipse.glsp.conceptap.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>After</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.conceptap.model.After#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.After#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getAfter()
 * @model
 * @generated
 */
public interface After extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(Topic)
	 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getAfter_Origin()
	 * @model required="true"
	 * @generated
	 */
	Topic getOrigin();

	/**
	 * Sets the value of the '{@link org.eclipse.glsp.conceptap.model.After#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Topic value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Topic)
	 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getAfter_Destination()
	 * @model required="true"
	 * @generated
	 */
	Topic getDestination();

	/**
	 * Sets the value of the '{@link org.eclipse.glsp.conceptap.model.After#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Topic value);

} // After
