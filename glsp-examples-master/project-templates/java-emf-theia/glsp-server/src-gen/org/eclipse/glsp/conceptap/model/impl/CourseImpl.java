/**
 */
package org.eclipse.glsp.conceptap.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.glsp.conceptap.model.Course;
import org.eclipse.glsp.conceptap.model.Legend;
import org.eclipse.glsp.conceptap.model.ModelPackage;
import org.eclipse.glsp.conceptap.model.Properties;
import org.eclipse.glsp.conceptap.model.Topic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.CourseImpl#getCourse_name <em>Course name</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.CourseImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.CourseImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.CourseImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.CourseImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.CourseImpl#getLegend <em>Legend</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends IdentifiableImpl implements Course {
	/**
	 * The default value of the '{@link #getCourse_name() <em>Course name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse_name()
	 * @generated
	 * @ordered
	 */
	protected static final String COURSE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCourse_name() <em>Course name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse_name()
	 * @generated
	 * @ordered
	 */
	protected String course_name = COURSE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected String context = CONTEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Properties> properties;

	/**
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected EList<Topic> topic;

	/**
	 * The cached value of the '{@link #getLegend() <em>Legend</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegend()
	 * @generated
	 * @ordered
	 */
	protected EList<Legend> legend;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCourse_name() {
		return course_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourse_name(String newCourse_name) {
		String oldCourse_name = course_name;
		course_name = newCourse_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COURSE__COURSE_NAME, oldCourse_name,
					course_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COURSE__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(String newContext) {
		String oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COURSE__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Properties> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Properties>(Properties.class, this,
					ModelPackage.COURSE__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Topic> getTopic() {
		if (topic == null) {
			topic = new EObjectContainmentEList<Topic>(Topic.class, this, ModelPackage.COURSE__TOPIC);
		}
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Legend> getLegend() {
		if (legend == null) {
			legend = new EObjectContainmentEList<Legend>(Legend.class, this, ModelPackage.COURSE__LEGEND);
		}
		return legend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.COURSE__PROPERTIES:
			return ((InternalEList<?>) getProperties()).basicRemove(otherEnd, msgs);
		case ModelPackage.COURSE__TOPIC:
			return ((InternalEList<?>) getTopic()).basicRemove(otherEnd, msgs);
		case ModelPackage.COURSE__LEGEND:
			return ((InternalEList<?>) getLegend()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.COURSE__COURSE_NAME:
			return getCourse_name();
		case ModelPackage.COURSE__AUTHOR:
			return getAuthor();
		case ModelPackage.COURSE__CONTEXT:
			return getContext();
		case ModelPackage.COURSE__PROPERTIES:
			return getProperties();
		case ModelPackage.COURSE__TOPIC:
			return getTopic();
		case ModelPackage.COURSE__LEGEND:
			return getLegend();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModelPackage.COURSE__COURSE_NAME:
			setCourse_name((String) newValue);
			return;
		case ModelPackage.COURSE__AUTHOR:
			setAuthor((String) newValue);
			return;
		case ModelPackage.COURSE__CONTEXT:
			setContext((String) newValue);
			return;
		case ModelPackage.COURSE__PROPERTIES:
			getProperties().clear();
			getProperties().addAll((Collection<? extends Properties>) newValue);
			return;
		case ModelPackage.COURSE__TOPIC:
			getTopic().clear();
			getTopic().addAll((Collection<? extends Topic>) newValue);
			return;
		case ModelPackage.COURSE__LEGEND:
			getLegend().clear();
			getLegend().addAll((Collection<? extends Legend>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ModelPackage.COURSE__COURSE_NAME:
			setCourse_name(COURSE_NAME_EDEFAULT);
			return;
		case ModelPackage.COURSE__AUTHOR:
			setAuthor(AUTHOR_EDEFAULT);
			return;
		case ModelPackage.COURSE__CONTEXT:
			setContext(CONTEXT_EDEFAULT);
			return;
		case ModelPackage.COURSE__PROPERTIES:
			getProperties().clear();
			return;
		case ModelPackage.COURSE__TOPIC:
			getTopic().clear();
			return;
		case ModelPackage.COURSE__LEGEND:
			getLegend().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ModelPackage.COURSE__COURSE_NAME:
			return COURSE_NAME_EDEFAULT == null ? course_name != null : !COURSE_NAME_EDEFAULT.equals(course_name);
		case ModelPackage.COURSE__AUTHOR:
			return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
		case ModelPackage.COURSE__CONTEXT:
			return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
		case ModelPackage.COURSE__PROPERTIES:
			return properties != null && !properties.isEmpty();
		case ModelPackage.COURSE__TOPIC:
			return topic != null && !topic.isEmpty();
		case ModelPackage.COURSE__LEGEND:
			return legend != null && !legend.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (course_name: ");
		result.append(course_name);
		result.append(", author: ");
		result.append(author);
		result.append(", context: ");
		result.append(context);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
