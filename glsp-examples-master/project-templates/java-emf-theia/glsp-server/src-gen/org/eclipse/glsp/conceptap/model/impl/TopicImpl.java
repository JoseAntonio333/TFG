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

import org.eclipse.glsp.conceptap.model.After;
import org.eclipse.glsp.conceptap.model.Concept;
import org.eclipse.glsp.conceptap.model.Imported_Concept;
import org.eclipse.glsp.conceptap.model.ModelPackage;
import org.eclipse.glsp.conceptap.model.Topic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.TopicImpl#getTopic_name <em>Topic name</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.TopicImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.TopicImpl#getAfter <em>After</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.TopicImpl#getConcept <em>Concept</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.TopicImpl#getImported_concept <em>Imported concept</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopicImpl extends IdentifiableImpl implements Topic {
	/**
	 * The default value of the '{@link #getTopic_name() <em>Topic name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic_name()
	 * @generated
	 * @ordered
	 */
	protected static final String TOPIC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopic_name() <em>Topic name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic_name()
	 * @generated
	 * @ordered
	 */
	protected String topic_name = TOPIC_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnnotations() <em>Annotations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected static final String ANNOTATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected String annotations = ANNOTATIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAfter() <em>After</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfter()
	 * @generated
	 * @ordered
	 */
	protected EList<After> after;

	/**
	 * The cached value of the '{@link #getConcept() <em>Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcept()
	 * @generated
	 * @ordered
	 */
	protected EList<Concept> concept;

	/**
	 * The cached value of the '{@link #getImported_concept() <em>Imported concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImported_concept()
	 * @generated
	 * @ordered
	 */
	protected EList<Imported_Concept> imported_concept;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.TOPIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTopic_name() {
		return topic_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopic_name(String newTopic_name) {
		String oldTopic_name = topic_name;
		topic_name = newTopic_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TOPIC__TOPIC_NAME, oldTopic_name,
					topic_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnnotations(String newAnnotations) {
		String oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TOPIC__ANNOTATIONS, oldAnnotations,
					annotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<After> getAfter() {
		if (after == null) {
			after = new EObjectContainmentEList<After>(After.class, this, ModelPackage.TOPIC__AFTER);
		}
		return after;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Concept> getConcept() {
		if (concept == null) {
			concept = new EObjectContainmentEList<Concept>(Concept.class, this, ModelPackage.TOPIC__CONCEPT);
		}
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Imported_Concept> getImported_concept() {
		if (imported_concept == null) {
			imported_concept = new EObjectContainmentEList<Imported_Concept>(Imported_Concept.class, this,
					ModelPackage.TOPIC__IMPORTED_CONCEPT);
		}
		return imported_concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.TOPIC__AFTER:
			return ((InternalEList<?>) getAfter()).basicRemove(otherEnd, msgs);
		case ModelPackage.TOPIC__CONCEPT:
			return ((InternalEList<?>) getConcept()).basicRemove(otherEnd, msgs);
		case ModelPackage.TOPIC__IMPORTED_CONCEPT:
			return ((InternalEList<?>) getImported_concept()).basicRemove(otherEnd, msgs);
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
		case ModelPackage.TOPIC__TOPIC_NAME:
			return getTopic_name();
		case ModelPackage.TOPIC__ANNOTATIONS:
			return getAnnotations();
		case ModelPackage.TOPIC__AFTER:
			return getAfter();
		case ModelPackage.TOPIC__CONCEPT:
			return getConcept();
		case ModelPackage.TOPIC__IMPORTED_CONCEPT:
			return getImported_concept();
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
		case ModelPackage.TOPIC__TOPIC_NAME:
			setTopic_name((String) newValue);
			return;
		case ModelPackage.TOPIC__ANNOTATIONS:
			setAnnotations((String) newValue);
			return;
		case ModelPackage.TOPIC__AFTER:
			getAfter().clear();
			getAfter().addAll((Collection<? extends After>) newValue);
			return;
		case ModelPackage.TOPIC__CONCEPT:
			getConcept().clear();
			getConcept().addAll((Collection<? extends Concept>) newValue);
			return;
		case ModelPackage.TOPIC__IMPORTED_CONCEPT:
			getImported_concept().clear();
			getImported_concept().addAll((Collection<? extends Imported_Concept>) newValue);
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
		case ModelPackage.TOPIC__TOPIC_NAME:
			setTopic_name(TOPIC_NAME_EDEFAULT);
			return;
		case ModelPackage.TOPIC__ANNOTATIONS:
			setAnnotations(ANNOTATIONS_EDEFAULT);
			return;
		case ModelPackage.TOPIC__AFTER:
			getAfter().clear();
			return;
		case ModelPackage.TOPIC__CONCEPT:
			getConcept().clear();
			return;
		case ModelPackage.TOPIC__IMPORTED_CONCEPT:
			getImported_concept().clear();
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
		case ModelPackage.TOPIC__TOPIC_NAME:
			return TOPIC_NAME_EDEFAULT == null ? topic_name != null : !TOPIC_NAME_EDEFAULT.equals(topic_name);
		case ModelPackage.TOPIC__ANNOTATIONS:
			return ANNOTATIONS_EDEFAULT == null ? annotations != null : !ANNOTATIONS_EDEFAULT.equals(annotations);
		case ModelPackage.TOPIC__AFTER:
			return after != null && !after.isEmpty();
		case ModelPackage.TOPIC__CONCEPT:
			return concept != null && !concept.isEmpty();
		case ModelPackage.TOPIC__IMPORTED_CONCEPT:
			return imported_concept != null && !imported_concept.isEmpty();
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
		result.append(" (topic_name: ");
		result.append(topic_name);
		result.append(", annotations: ");
		result.append(annotations);
		result.append(')');
		return result.toString();
	}

} //TopicImpl
