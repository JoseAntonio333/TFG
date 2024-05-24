/**
 */
package org.eclipse.glsp.conceptap.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specializes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.conceptap.model.Specializes#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.Specializes#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.Specializes#getImportedOrigin <em>Imported Origin</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.Specializes#getImportedDestination <em>Imported Destination</em>}</li>
 * </ul>
 *
 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getSpecializes()
 * @model
 * @generated
 */
public interface Specializes extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(Concept)
	 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getSpecializes_Origin()
	 * @model
	 * @generated
	 */
	Concept getOrigin();

	/**
	 * Sets the value of the '{@link org.eclipse.glsp.conceptap.model.Specializes#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Concept value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Concept)
	 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getSpecializes_Destination()
	 * @model
	 * @generated
	 */
	Concept getDestination();

	/**
	 * Sets the value of the '{@link org.eclipse.glsp.conceptap.model.Specializes#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Concept value);

	/**
	 * Returns the value of the '<em><b>Imported Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Origin</em>' reference.
	 * @see #setImportedOrigin(Imported_Concept)
	 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getSpecializes_ImportedOrigin()
	 * @model
	 * @generated
	 */
	Imported_Concept getImportedOrigin();

	/**
	 * Sets the value of the '{@link org.eclipse.glsp.conceptap.model.Specializes#getImportedOrigin <em>Imported Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Origin</em>' reference.
	 * @see #getImportedOrigin()
	 * @generated
	 */
	void setImportedOrigin(Imported_Concept value);

	/**
	 * Returns the value of the '<em><b>Imported Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Destination</em>' reference.
	 * @see #setImportedDestination(Imported_Concept)
	 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getSpecializes_ImportedDestination()
	 * @model
	 * @generated
	 */
	Imported_Concept getImportedDestination();

	/**
	 * Sets the value of the '{@link org.eclipse.glsp.conceptap.model.Specializes#getImportedDestination <em>Imported Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Destination</em>' reference.
	 * @see #getImportedDestination()
	 * @generated
	 */
	void setImportedDestination(Imported_Concept value);

} // Specializes
