/**
 */
package org.eclipse.glsp.conceptap.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.glsp.conceptap.model.Concept;
import org.eclipse.glsp.conceptap.model.Imported_Concept;
import org.eclipse.glsp.conceptap.model.ModelPackage;
import org.eclipse.glsp.conceptap.model.Uses;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uses</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.UsesImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.UsesImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.UsesImpl#getImportedOrigin <em>Imported Origin</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.UsesImpl#getImportedDestination <em>Imported Destination</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsesImpl extends IdentifiableImpl implements Uses {
	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected Concept origin;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected Concept destination;

	/**
	 * The cached value of the '{@link #getImportedOrigin() <em>Imported Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedOrigin()
	 * @generated
	 * @ordered
	 */
	protected Imported_Concept importedOrigin;

	/**
	 * The cached value of the '{@link #getImportedDestination() <em>Imported Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedDestination()
	 * @generated
	 * @ordered
	 */
	protected Imported_Concept importedDestination;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.USES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Concept getOrigin() {
		if (origin != null && origin.eIsProxy()) {
			InternalEObject oldOrigin = (InternalEObject) origin;
			origin = (Concept) eResolveProxy(oldOrigin);
			if (origin != oldOrigin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.USES__ORIGIN, oldOrigin,
							origin));
			}
		}
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept basicGetOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigin(Concept newOrigin) {
		Concept oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USES__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Concept getDestination() {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject) destination;
			destination = (Concept) eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.USES__DESTINATION,
							oldDestination, destination));
			}
		}
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestination(Concept newDestination) {
		Concept oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USES__DESTINATION, oldDestination,
					destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Imported_Concept getImportedOrigin() {
		if (importedOrigin != null && importedOrigin.eIsProxy()) {
			InternalEObject oldImportedOrigin = (InternalEObject) importedOrigin;
			importedOrigin = (Imported_Concept) eResolveProxy(oldImportedOrigin);
			if (importedOrigin != oldImportedOrigin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.USES__IMPORTED_ORIGIN,
							oldImportedOrigin, importedOrigin));
			}
		}
		return importedOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Imported_Concept basicGetImportedOrigin() {
		return importedOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImportedOrigin(Imported_Concept newImportedOrigin) {
		Imported_Concept oldImportedOrigin = importedOrigin;
		importedOrigin = newImportedOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USES__IMPORTED_ORIGIN, oldImportedOrigin,
					importedOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Imported_Concept getImportedDestination() {
		if (importedDestination != null && importedDestination.eIsProxy()) {
			InternalEObject oldImportedDestination = (InternalEObject) importedDestination;
			importedDestination = (Imported_Concept) eResolveProxy(oldImportedDestination);
			if (importedDestination != oldImportedDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.USES__IMPORTED_DESTINATION,
							oldImportedDestination, importedDestination));
			}
		}
		return importedDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Imported_Concept basicGetImportedDestination() {
		return importedDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImportedDestination(Imported_Concept newImportedDestination) {
		Imported_Concept oldImportedDestination = importedDestination;
		importedDestination = newImportedDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USES__IMPORTED_DESTINATION,
					oldImportedDestination, importedDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.USES__ORIGIN:
			if (resolve)
				return getOrigin();
			return basicGetOrigin();
		case ModelPackage.USES__DESTINATION:
			if (resolve)
				return getDestination();
			return basicGetDestination();
		case ModelPackage.USES__IMPORTED_ORIGIN:
			if (resolve)
				return getImportedOrigin();
			return basicGetImportedOrigin();
		case ModelPackage.USES__IMPORTED_DESTINATION:
			if (resolve)
				return getImportedDestination();
			return basicGetImportedDestination();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModelPackage.USES__ORIGIN:
			setOrigin((Concept) newValue);
			return;
		case ModelPackage.USES__DESTINATION:
			setDestination((Concept) newValue);
			return;
		case ModelPackage.USES__IMPORTED_ORIGIN:
			setImportedOrigin((Imported_Concept) newValue);
			return;
		case ModelPackage.USES__IMPORTED_DESTINATION:
			setImportedDestination((Imported_Concept) newValue);
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
		case ModelPackage.USES__ORIGIN:
			setOrigin((Concept) null);
			return;
		case ModelPackage.USES__DESTINATION:
			setDestination((Concept) null);
			return;
		case ModelPackage.USES__IMPORTED_ORIGIN:
			setImportedOrigin((Imported_Concept) null);
			return;
		case ModelPackage.USES__IMPORTED_DESTINATION:
			setImportedDestination((Imported_Concept) null);
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
		case ModelPackage.USES__ORIGIN:
			return origin != null;
		case ModelPackage.USES__DESTINATION:
			return destination != null;
		case ModelPackage.USES__IMPORTED_ORIGIN:
			return importedOrigin != null;
		case ModelPackage.USES__IMPORTED_DESTINATION:
			return importedDestination != null;
		}
		return super.eIsSet(featureID);
	}

} //UsesImpl
