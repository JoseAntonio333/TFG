/**
 */
package org.eclipse.glsp.conceptap.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.conceptap.model.Feature#getFeature_name <em>Feature name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Feature name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature name</em>' attribute.
	 * @see #setFeature_name(String)
	 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getFeature_Feature_name()
	 * @model required="true"
	 * @generated
	 */
	String getFeature_name();

	/**
	 * Sets the value of the '{@link org.eclipse.glsp.conceptap.model.Feature#getFeature_name <em>Feature name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature name</em>' attribute.
	 * @see #getFeature_name()
	 * @generated
	 */
	void setFeature_name(String value);

} // Feature
