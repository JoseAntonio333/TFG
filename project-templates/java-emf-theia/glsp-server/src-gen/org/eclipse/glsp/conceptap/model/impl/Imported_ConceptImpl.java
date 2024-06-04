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

import org.eclipse.glsp.conceptap.model.Imported_Concept;
import org.eclipse.glsp.conceptap.model.ModelPackage;
import org.eclipse.glsp.conceptap.model.Specializes;
import org.eclipse.glsp.conceptap.model.Uses;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imported Concept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.Imported_ConceptImpl#getConcept_name <em>Concept name</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.Imported_ConceptImpl#getUbication <em>Ubication</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.Imported_ConceptImpl#getSpecializes <em>Specializes</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.Imported_ConceptImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.Imported_ConceptImpl#getRelatedTopic <em>Related Topic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Imported_ConceptImpl extends IdentifiableImpl implements Imported_Concept {
	/**
	 * The default value of the '{@link #getConcept_name() <em>Concept name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcept_name()
	 * @generated
	 * @ordered
	 */
	protected static final String CONCEPT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConcept_name() <em>Concept name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcept_name()
	 * @generated
	 * @ordered
	 */
	protected String concept_name = CONCEPT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUbication() <em>Ubication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUbication()
	 * @generated
	 * @ordered
	 */
	protected static final String UBICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUbication() <em>Ubication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUbication()
	 * @generated
	 * @ordered
	 */
	protected String ubication = UBICATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecializes() <em>Specializes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializes()
	 * @generated
	 * @ordered
	 */
	protected EList<Specializes> specializes;

	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<Uses> uses;

	/**
	 * The default value of the '{@link #getRelatedTopic() <em>Related Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedTopic()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATED_TOPIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelatedTopic() <em>Related Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedTopic()
	 * @generated
	 * @ordered
	 */
	protected String relatedTopic = RELATED_TOPIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Imported_ConceptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.IMPORTED_CONCEPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConcept_name() {
		return concept_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConcept_name(String newConcept_name) {
		String oldConcept_name = concept_name;
		concept_name = newConcept_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.IMPORTED_CONCEPT__CONCEPT_NAME,
					oldConcept_name, concept_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUbication() {
		return ubication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUbication(String newUbication) {
		String oldUbication = ubication;
		ubication = newUbication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.IMPORTED_CONCEPT__UBICATION,
					oldUbication, ubication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specializes> getSpecializes() {
		if (specializes == null) {
			specializes = new EObjectContainmentEList<Specializes>(Specializes.class, this,
					ModelPackage.IMPORTED_CONCEPT__SPECIALIZES);
		}
		return specializes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Uses> getUses() {
		if (uses == null) {
			uses = new EObjectContainmentEList<Uses>(Uses.class, this, ModelPackage.IMPORTED_CONCEPT__USES);
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRelatedTopic() {
		return relatedTopic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelatedTopic(String newRelatedTopic) {
		String oldRelatedTopic = relatedTopic;
		relatedTopic = newRelatedTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.IMPORTED_CONCEPT__RELATED_TOPIC,
					oldRelatedTopic, relatedTopic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.IMPORTED_CONCEPT__SPECIALIZES:
			return ((InternalEList<?>) getSpecializes()).basicRemove(otherEnd, msgs);
		case ModelPackage.IMPORTED_CONCEPT__USES:
			return ((InternalEList<?>) getUses()).basicRemove(otherEnd, msgs);
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
		case ModelPackage.IMPORTED_CONCEPT__CONCEPT_NAME:
			return getConcept_name();
		case ModelPackage.IMPORTED_CONCEPT__UBICATION:
			return getUbication();
		case ModelPackage.IMPORTED_CONCEPT__SPECIALIZES:
			return getSpecializes();
		case ModelPackage.IMPORTED_CONCEPT__USES:
			return getUses();
		case ModelPackage.IMPORTED_CONCEPT__RELATED_TOPIC:
			return getRelatedTopic();
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
		case ModelPackage.IMPORTED_CONCEPT__CONCEPT_NAME:
			setConcept_name((String) newValue);
			return;
		case ModelPackage.IMPORTED_CONCEPT__UBICATION:
			setUbication((String) newValue);
			return;
		case ModelPackage.IMPORTED_CONCEPT__SPECIALIZES:
			getSpecializes().clear();
			getSpecializes().addAll((Collection<? extends Specializes>) newValue);
			return;
		case ModelPackage.IMPORTED_CONCEPT__USES:
			getUses().clear();
			getUses().addAll((Collection<? extends Uses>) newValue);
			return;
		case ModelPackage.IMPORTED_CONCEPT__RELATED_TOPIC:
			setRelatedTopic((String) newValue);
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
		case ModelPackage.IMPORTED_CONCEPT__CONCEPT_NAME:
			setConcept_name(CONCEPT_NAME_EDEFAULT);
			return;
		case ModelPackage.IMPORTED_CONCEPT__UBICATION:
			setUbication(UBICATION_EDEFAULT);
			return;
		case ModelPackage.IMPORTED_CONCEPT__SPECIALIZES:
			getSpecializes().clear();
			return;
		case ModelPackage.IMPORTED_CONCEPT__USES:
			getUses().clear();
			return;
		case ModelPackage.IMPORTED_CONCEPT__RELATED_TOPIC:
			setRelatedTopic(RELATED_TOPIC_EDEFAULT);
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
		case ModelPackage.IMPORTED_CONCEPT__CONCEPT_NAME:
			return CONCEPT_NAME_EDEFAULT == null ? concept_name != null : !CONCEPT_NAME_EDEFAULT.equals(concept_name);
		case ModelPackage.IMPORTED_CONCEPT__UBICATION:
			return UBICATION_EDEFAULT == null ? ubication != null : !UBICATION_EDEFAULT.equals(ubication);
		case ModelPackage.IMPORTED_CONCEPT__SPECIALIZES:
			return specializes != null && !specializes.isEmpty();
		case ModelPackage.IMPORTED_CONCEPT__USES:
			return uses != null && !uses.isEmpty();
		case ModelPackage.IMPORTED_CONCEPT__RELATED_TOPIC:
			return RELATED_TOPIC_EDEFAULT == null ? relatedTopic != null : !RELATED_TOPIC_EDEFAULT.equals(relatedTopic);
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
		result.append(" (concept_name: ");
		result.append(concept_name);
		result.append(", ubication: ");
		result.append(ubication);
		result.append(", relatedTopic: ");
		result.append(relatedTopic);
		result.append(')');
		return result.toString();
	}

} //Imported_ConceptImpl
