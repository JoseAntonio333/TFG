/**
 */
package org.eclipse.glsp.conceptap.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.conceptap.model.Course#getCourse_name <em>Course name</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.Course#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.Course#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.Course#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.Course#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.Course#getLegend <em>Legend</em>}</li>
 * </ul>
 *
 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Course name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course name</em>' attribute.
	 * @see #setCourse_name(String)
	 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getCourse_Course_name()
	 * @model required="true"
	 * @generated
	 */
	String getCourse_name();

	/**
	 * Sets the value of the '{@link org.eclipse.glsp.conceptap.model.Course#getCourse_name <em>Course name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course name</em>' attribute.
	 * @see #getCourse_name()
	 * @generated
	 */
	void setCourse_name(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getCourse_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link org.eclipse.glsp.conceptap.model.Course#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(String)
	 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getCourse_Context()
	 * @model
	 * @generated
	 */
	String getContext();

	/**
	 * Sets the value of the '{@link org.eclipse.glsp.conceptap.model.Course#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.glsp.conceptap.model.Properties}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getCourse_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Properties> getProperties();

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.glsp.conceptap.model.Topic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' containment reference list.
	 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getCourse_Topic()
	 * @model containment="true"
	 * @generated
	 */
	EList<Topic> getTopic();

	/**
	 * Returns the value of the '<em><b>Legend</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.glsp.conceptap.model.Legend}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legend</em>' containment reference list.
	 * @see org.eclipse.glsp.conceptap.model.ModelPackage#getCourse_Legend()
	 * @model containment="true"
	 * @generated
	 */
	EList<Legend> getLegend();

} // Course
