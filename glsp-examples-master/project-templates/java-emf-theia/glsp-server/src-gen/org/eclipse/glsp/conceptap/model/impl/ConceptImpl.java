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

import org.eclipse.glsp.conceptap.model.Concept;
import org.eclipse.glsp.conceptap.model.Feature;
import org.eclipse.glsp.conceptap.model.ModelPackage;
import org.eclipse.glsp.conceptap.model.Specializes;
import org.eclipse.glsp.conceptap.model.Uses;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.ConceptImpl#getConcept_name <em>Concept name</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.ConceptImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.ConceptImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.ConceptImpl#getSpecializes <em>Specializes</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.ConceptImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptImpl extends IdentifiableImpl implements Concept {
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
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<Uses> uses;

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
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> feature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CONCEPT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONCEPT__CONCEPT_NAME, oldConcept_name,
					concept_name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONCEPT__ANNOTATIONS, oldAnnotations,
					annotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Uses> getUses() {
		if (uses == null) {
			uses = new EObjectContainmentEList<Uses>(Uses.class, this, ModelPackage.CONCEPT__USES);
		}
		return uses;
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
					ModelPackage.CONCEPT__SPECIALIZES);
		}
		return specializes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getFeature() {
		if (feature == null) {
			feature = new EObjectContainmentEList<Feature>(Feature.class, this, ModelPackage.CONCEPT__FEATURE);
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.CONCEPT__USES:
			return ((InternalEList<?>) getUses()).basicRemove(otherEnd, msgs);
		case ModelPackage.CONCEPT__SPECIALIZES:
			return ((InternalEList<?>) getSpecializes()).basicRemove(otherEnd, msgs);
		case ModelPackage.CONCEPT__FEATURE:
			return ((InternalEList<?>) getFeature()).basicRemove(otherEnd, msgs);
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
		case ModelPackage.CONCEPT__CONCEPT_NAME:
			return getConcept_name();
		case ModelPackage.CONCEPT__ANNOTATIONS:
			return getAnnotations();
		case ModelPackage.CONCEPT__USES:
			return getUses();
		case ModelPackage.CONCEPT__SPECIALIZES:
			return getSpecializes();
		case ModelPackage.CONCEPT__FEATURE:
			return getFeature();
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
		case ModelPackage.CONCEPT__CONCEPT_NAME:
			setConcept_name((String) newValue);
			return;
		case ModelPackage.CONCEPT__ANNOTATIONS:
			setAnnotations((String) newValue);
			return;
		case ModelPackage.CONCEPT__USES:
			getUses().clear();
			getUses().addAll((Collection<? extends Uses>) newValue);
			return;
		case ModelPackage.CONCEPT__SPECIALIZES:
			getSpecializes().clear();
			getSpecializes().addAll((Collection<? extends Specializes>) newValue);
			return;
		case ModelPackage.CONCEPT__FEATURE:
			getFeature().clear();
			getFeature().addAll((Collection<? extends Feature>) newValue);
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
		case ModelPackage.CONCEPT__CONCEPT_NAME:
			setConcept_name(CONCEPT_NAME_EDEFAULT);
			return;
		case ModelPackage.CONCEPT__ANNOTATIONS:
			setAnnotations(ANNOTATIONS_EDEFAULT);
			return;
		case ModelPackage.CONCEPT__USES:
			getUses().clear();
			return;
		case ModelPackage.CONCEPT__SPECIALIZES:
			getSpecializes().clear();
			return;
		case ModelPackage.CONCEPT__FEATURE:
			getFeature().clear();
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
		case ModelPackage.CONCEPT__CONCEPT_NAME:
			return CONCEPT_NAME_EDEFAULT == null ? concept_name != null : !CONCEPT_NAME_EDEFAULT.equals(concept_name);
		case ModelPackage.CONCEPT__ANNOTATIONS:
			return ANNOTATIONS_EDEFAULT == null ? annotations != null : !ANNOTATIONS_EDEFAULT.equals(annotations);
		case ModelPackage.CONCEPT__USES:
			return uses != null && !uses.isEmpty();
		case ModelPackage.CONCEPT__SPECIALIZES:
			return specializes != null && !specializes.isEmpty();
		case ModelPackage.CONCEPT__FEATURE:
			return feature != null && !feature.isEmpty();
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
		result.append(", annotations: ");
		result.append(annotations);
		result.append(')');
		return result.toString();
	}

} //ConceptImpl
