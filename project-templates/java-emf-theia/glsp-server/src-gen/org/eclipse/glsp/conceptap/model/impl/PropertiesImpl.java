/**
 */
package org.eclipse.glsp.conceptap.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.glsp.conceptap.model.ModelPackage;
import org.eclipse.glsp.conceptap.model.Properties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.PropertiesImpl#getBibliography <em>Bibliography</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.PropertiesImpl#getPrevious_requirements <em>Previous requirements</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.PropertiesImpl#getSkills <em>Skills</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.PropertiesImpl#getAssessment_criteria <em>Assessment criteria</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.PropertiesImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.PropertiesImpl#getArea <em>Area</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.PropertiesImpl#getOffer <em>Offer</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.PropertiesImpl#getSemester <em>Semester</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.PropertiesImpl#getCredits <em>Credits</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.PropertiesImpl#getLarge_group_hours <em>Large group hours</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.PropertiesImpl#getSmall_group_hours <em>Small group hours</em>}</li>
 *   <li>{@link org.eclipse.glsp.conceptap.model.impl.PropertiesImpl#getCoordinator <em>Coordinator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertiesImpl extends IdentifiableImpl implements Properties {
	/**
	 * The default value of the '{@link #getBibliography() <em>Bibliography</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBibliography()
	 * @generated
	 * @ordered
	 */
	protected static final String BIBLIOGRAPHY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBibliography() <em>Bibliography</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBibliography()
	 * @generated
	 * @ordered
	 */
	protected String bibliography = BIBLIOGRAPHY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrevious_requirements() <em>Previous requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious_requirements()
	 * @generated
	 * @ordered
	 */
	protected static final String PREVIOUS_REQUIREMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrevious_requirements() <em>Previous requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious_requirements()
	 * @generated
	 * @ordered
	 */
	protected String previous_requirements = PREVIOUS_REQUIREMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSkills() <em>Skills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkills()
	 * @generated
	 * @ordered
	 */
	protected static final String SKILLS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSkills() <em>Skills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkills()
	 * @generated
	 * @ordered
	 */
	protected String skills = SKILLS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssessment_criteria() <em>Assessment criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessment_criteria()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSESSMENT_CRITERIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssessment_criteria() <em>Assessment criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessment_criteria()
	 * @generated
	 * @ordered
	 */
	protected String assessment_criteria = ASSESSMENT_CRITERIA_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected String subject = SUBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getArea() <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected static final String AREA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArea() <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected String area = AREA_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffer() <em>Offer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffer()
	 * @generated
	 * @ordered
	 */
	protected static final String OFFER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOffer() <em>Offer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffer()
	 * @generated
	 * @ordered
	 */
	protected String offer = OFFER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSemester() <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMESTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemester() <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected String semester = SEMESTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected static final String CREDITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected String credits = CREDITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLarge_group_hours() <em>Large group hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLarge_group_hours()
	 * @generated
	 * @ordered
	 */
	protected static final String LARGE_GROUP_HOURS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLarge_group_hours() <em>Large group hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLarge_group_hours()
	 * @generated
	 * @ordered
	 */
	protected String large_group_hours = LARGE_GROUP_HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSmall_group_hours() <em>Small group hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmall_group_hours()
	 * @generated
	 * @ordered
	 */
	protected static final String SMALL_GROUP_HOURS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSmall_group_hours() <em>Small group hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmall_group_hours()
	 * @generated
	 * @ordered
	 */
	protected String small_group_hours = SMALL_GROUP_HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoordinator() <em>Coordinator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinator()
	 * @generated
	 * @ordered
	 */
	protected static final String COORDINATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoordinator() <em>Coordinator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinator()
	 * @generated
	 * @ordered
	 */
	protected String coordinator = COORDINATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBibliography() {
		return bibliography;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBibliography(String newBibliography) {
		String oldBibliography = bibliography;
		bibliography = newBibliography;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROPERTIES__BIBLIOGRAPHY,
					oldBibliography, bibliography));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrevious_requirements() {
		return previous_requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrevious_requirements(String newPrevious_requirements) {
		String oldPrevious_requirements = previous_requirements;
		previous_requirements = newPrevious_requirements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROPERTIES__PREVIOUS_REQUIREMENTS,
					oldPrevious_requirements, previous_requirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSkills() {
		return skills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkills(String newSkills) {
		String oldSkills = skills;
		skills = newSkills;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROPERTIES__SKILLS, oldSkills, skills));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssessment_criteria() {
		return assessment_criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssessment_criteria(String newAssessment_criteria) {
		String oldAssessment_criteria = assessment_criteria;
		assessment_criteria = newAssessment_criteria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROPERTIES__ASSESSMENT_CRITERIA,
					oldAssessment_criteria, assessment_criteria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubject(String newSubject) {
		String oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROPERTIES__SUBJECT, oldSubject,
					subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArea() {
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArea(String newArea) {
		String oldArea = area;
		area = newArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROPERTIES__AREA, oldArea, area));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOffer() {
		return offer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOffer(String newOffer) {
		String oldOffer = offer;
		offer = newOffer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROPERTIES__OFFER, oldOffer, offer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSemester() {
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemester(String newSemester) {
		String oldSemester = semester;
		semester = newSemester;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROPERTIES__SEMESTER, oldSemester,
					semester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCredits() {
		return credits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCredits(String newCredits) {
		String oldCredits = credits;
		credits = newCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROPERTIES__CREDITS, oldCredits,
					credits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLarge_group_hours() {
		return large_group_hours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLarge_group_hours(String newLarge_group_hours) {
		String oldLarge_group_hours = large_group_hours;
		large_group_hours = newLarge_group_hours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROPERTIES__LARGE_GROUP_HOURS,
					oldLarge_group_hours, large_group_hours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSmall_group_hours() {
		return small_group_hours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSmall_group_hours(String newSmall_group_hours) {
		String oldSmall_group_hours = small_group_hours;
		small_group_hours = newSmall_group_hours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROPERTIES__SMALL_GROUP_HOURS,
					oldSmall_group_hours, small_group_hours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCoordinator() {
		return coordinator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoordinator(String newCoordinator) {
		String oldCoordinator = coordinator;
		coordinator = newCoordinator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROPERTIES__COORDINATOR, oldCoordinator,
					coordinator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.PROPERTIES__BIBLIOGRAPHY:
			return getBibliography();
		case ModelPackage.PROPERTIES__PREVIOUS_REQUIREMENTS:
			return getPrevious_requirements();
		case ModelPackage.PROPERTIES__SKILLS:
			return getSkills();
		case ModelPackage.PROPERTIES__ASSESSMENT_CRITERIA:
			return getAssessment_criteria();
		case ModelPackage.PROPERTIES__SUBJECT:
			return getSubject();
		case ModelPackage.PROPERTIES__AREA:
			return getArea();
		case ModelPackage.PROPERTIES__OFFER:
			return getOffer();
		case ModelPackage.PROPERTIES__SEMESTER:
			return getSemester();
		case ModelPackage.PROPERTIES__CREDITS:
			return getCredits();
		case ModelPackage.PROPERTIES__LARGE_GROUP_HOURS:
			return getLarge_group_hours();
		case ModelPackage.PROPERTIES__SMALL_GROUP_HOURS:
			return getSmall_group_hours();
		case ModelPackage.PROPERTIES__COORDINATOR:
			return getCoordinator();
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
		case ModelPackage.PROPERTIES__BIBLIOGRAPHY:
			setBibliography((String) newValue);
			return;
		case ModelPackage.PROPERTIES__PREVIOUS_REQUIREMENTS:
			setPrevious_requirements((String) newValue);
			return;
		case ModelPackage.PROPERTIES__SKILLS:
			setSkills((String) newValue);
			return;
		case ModelPackage.PROPERTIES__ASSESSMENT_CRITERIA:
			setAssessment_criteria((String) newValue);
			return;
		case ModelPackage.PROPERTIES__SUBJECT:
			setSubject((String) newValue);
			return;
		case ModelPackage.PROPERTIES__AREA:
			setArea((String) newValue);
			return;
		case ModelPackage.PROPERTIES__OFFER:
			setOffer((String) newValue);
			return;
		case ModelPackage.PROPERTIES__SEMESTER:
			setSemester((String) newValue);
			return;
		case ModelPackage.PROPERTIES__CREDITS:
			setCredits((String) newValue);
			return;
		case ModelPackage.PROPERTIES__LARGE_GROUP_HOURS:
			setLarge_group_hours((String) newValue);
			return;
		case ModelPackage.PROPERTIES__SMALL_GROUP_HOURS:
			setSmall_group_hours((String) newValue);
			return;
		case ModelPackage.PROPERTIES__COORDINATOR:
			setCoordinator((String) newValue);
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
		case ModelPackage.PROPERTIES__BIBLIOGRAPHY:
			setBibliography(BIBLIOGRAPHY_EDEFAULT);
			return;
		case ModelPackage.PROPERTIES__PREVIOUS_REQUIREMENTS:
			setPrevious_requirements(PREVIOUS_REQUIREMENTS_EDEFAULT);
			return;
		case ModelPackage.PROPERTIES__SKILLS:
			setSkills(SKILLS_EDEFAULT);
			return;
		case ModelPackage.PROPERTIES__ASSESSMENT_CRITERIA:
			setAssessment_criteria(ASSESSMENT_CRITERIA_EDEFAULT);
			return;
		case ModelPackage.PROPERTIES__SUBJECT:
			setSubject(SUBJECT_EDEFAULT);
			return;
		case ModelPackage.PROPERTIES__AREA:
			setArea(AREA_EDEFAULT);
			return;
		case ModelPackage.PROPERTIES__OFFER:
			setOffer(OFFER_EDEFAULT);
			return;
		case ModelPackage.PROPERTIES__SEMESTER:
			setSemester(SEMESTER_EDEFAULT);
			return;
		case ModelPackage.PROPERTIES__CREDITS:
			setCredits(CREDITS_EDEFAULT);
			return;
		case ModelPackage.PROPERTIES__LARGE_GROUP_HOURS:
			setLarge_group_hours(LARGE_GROUP_HOURS_EDEFAULT);
			return;
		case ModelPackage.PROPERTIES__SMALL_GROUP_HOURS:
			setSmall_group_hours(SMALL_GROUP_HOURS_EDEFAULT);
			return;
		case ModelPackage.PROPERTIES__COORDINATOR:
			setCoordinator(COORDINATOR_EDEFAULT);
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
		case ModelPackage.PROPERTIES__BIBLIOGRAPHY:
			return BIBLIOGRAPHY_EDEFAULT == null ? bibliography != null : !BIBLIOGRAPHY_EDEFAULT.equals(bibliography);
		case ModelPackage.PROPERTIES__PREVIOUS_REQUIREMENTS:
			return PREVIOUS_REQUIREMENTS_EDEFAULT == null ? previous_requirements != null
					: !PREVIOUS_REQUIREMENTS_EDEFAULT.equals(previous_requirements);
		case ModelPackage.PROPERTIES__SKILLS:
			return SKILLS_EDEFAULT == null ? skills != null : !SKILLS_EDEFAULT.equals(skills);
		case ModelPackage.PROPERTIES__ASSESSMENT_CRITERIA:
			return ASSESSMENT_CRITERIA_EDEFAULT == null ? assessment_criteria != null
					: !ASSESSMENT_CRITERIA_EDEFAULT.equals(assessment_criteria);
		case ModelPackage.PROPERTIES__SUBJECT:
			return SUBJECT_EDEFAULT == null ? subject != null : !SUBJECT_EDEFAULT.equals(subject);
		case ModelPackage.PROPERTIES__AREA:
			return AREA_EDEFAULT == null ? area != null : !AREA_EDEFAULT.equals(area);
		case ModelPackage.PROPERTIES__OFFER:
			return OFFER_EDEFAULT == null ? offer != null : !OFFER_EDEFAULT.equals(offer);
		case ModelPackage.PROPERTIES__SEMESTER:
			return SEMESTER_EDEFAULT == null ? semester != null : !SEMESTER_EDEFAULT.equals(semester);
		case ModelPackage.PROPERTIES__CREDITS:
			return CREDITS_EDEFAULT == null ? credits != null : !CREDITS_EDEFAULT.equals(credits);
		case ModelPackage.PROPERTIES__LARGE_GROUP_HOURS:
			return LARGE_GROUP_HOURS_EDEFAULT == null ? large_group_hours != null
					: !LARGE_GROUP_HOURS_EDEFAULT.equals(large_group_hours);
		case ModelPackage.PROPERTIES__SMALL_GROUP_HOURS:
			return SMALL_GROUP_HOURS_EDEFAULT == null ? small_group_hours != null
					: !SMALL_GROUP_HOURS_EDEFAULT.equals(small_group_hours);
		case ModelPackage.PROPERTIES__COORDINATOR:
			return COORDINATOR_EDEFAULT == null ? coordinator != null : !COORDINATOR_EDEFAULT.equals(coordinator);
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
		result.append(" (bibliography: ");
		result.append(bibliography);
		result.append(", previous_requirements: ");
		result.append(previous_requirements);
		result.append(", skills: ");
		result.append(skills);
		result.append(", assessment_criteria: ");
		result.append(assessment_criteria);
		result.append(", subject: ");
		result.append(subject);
		result.append(", area: ");
		result.append(area);
		result.append(", offer: ");
		result.append(offer);
		result.append(", semester: ");
		result.append(semester);
		result.append(", credits: ");
		result.append(credits);
		result.append(", large_group_hours: ");
		result.append(large_group_hours);
		result.append(", small_group_hours: ");
		result.append(small_group_hours);
		result.append(", coordinator: ");
		result.append(coordinator);
		result.append(')');
		return result.toString();
	}

} //PropertiesImpl
