/**
 */
package org.eclipse.glsp.conceptap.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.glsp.conceptap.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.uma.es/course_model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "course_model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = org.eclipse.glsp.conceptap.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.glsp.conceptap.model.impl.IdentifiableImpl <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.glsp.conceptap.model.impl.IdentifiableImpl
	 * @see org.eclipse.glsp.conceptap.model.impl.ModelPackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.glsp.conceptap.model.impl.ConceptMapImpl <em>Concept Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.glsp.conceptap.model.impl.ConceptMapImpl
	 * @see org.eclipse.glsp.conceptap.model.impl.ModelPackageImpl#getConceptMap()
	 * @generated
	 */
	int CONCEPT_MAP = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_MAP__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_MAP__NAME = IDENTIFIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Course</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_MAP__COURSE = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concept Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_MAP_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Concept Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_MAP_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.glsp.conceptap.model.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.glsp.conceptap.model.impl.CourseImpl
	 * @see org.eclipse.glsp.conceptap.model.impl.ModelPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = IDENTIFIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Course name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_NAME = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__AUTHOR = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CONTEXT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__PROPERTIES = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__TOPIC = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Legend</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__LEGEND = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.glsp.conceptap.model.impl.PropertiesImpl <em>Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.glsp.conceptap.model.impl.PropertiesImpl
	 * @see org.eclipse.glsp.conceptap.model.impl.ModelPackageImpl#getProperties()
	 * @generated
	 */
	int PROPERTIES = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__NAME = IDENTIFIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Bibliography</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__BIBLIOGRAPHY = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Previous requirements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__PREVIOUS_REQUIREMENTS = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__SKILLS = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assessment criteria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__ASSESSMENT_CRITERIA = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__SUBJECT = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__AREA = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Offer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__OFFER = IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__SEMESTER = IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__CREDITS = IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Large group hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__LARGE_GROUP_HOURS = IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Small group hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__SMALL_GROUP_HOURS = IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Coordinator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__COORDINATOR = IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.glsp.conceptap.model.impl.Imported_ConceptImpl <em>Imported Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.glsp.conceptap.model.impl.Imported_ConceptImpl
	 * @see org.eclipse.glsp.conceptap.model.impl.ModelPackageImpl#getImported_Concept()
	 * @generated
	 */
	int IMPORTED_CONCEPT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_CONCEPT__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_CONCEPT__NAME = IDENTIFIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Concept name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_CONCEPT__CONCEPT_NAME = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ubication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_CONCEPT__UBICATION = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_CONCEPT__SPECIALIZES = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_CONCEPT__USES = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Related Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_CONCEPT__RELATED_TOPIC = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Imported Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_CONCEPT_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Imported Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_CONCEPT_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.glsp.conceptap.model.impl.TopicImpl <em>Topic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.glsp.conceptap.model.impl.TopicImpl
	 * @see org.eclipse.glsp.conceptap.model.impl.ModelPackageImpl#getTopic()
	 * @generated
	 */
	int TOPIC = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__NAME = IDENTIFIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Topic name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__TOPIC_NAME = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__ANNOTATIONS = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>After</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__AFTER = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__CONCEPT = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Imported concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__IMPORTED_CONCEPT = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.glsp.conceptap.model.impl.AfterImpl <em>After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.glsp.conceptap.model.impl.AfterImpl
	 * @see org.eclipse.glsp.conceptap.model.impl.ModelPackageImpl#getAfter()
	 * @generated
	 */
	int AFTER = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER__NAME = IDENTIFIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER__ORIGIN = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER__DESTINATION = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.glsp.conceptap.model.impl.ConceptImpl <em>Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.glsp.conceptap.model.impl.ConceptImpl
	 * @see org.eclipse.glsp.conceptap.model.impl.ModelPackageImpl#getConcept()
	 * @generated
	 */
	int CONCEPT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__NAME = IDENTIFIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Concept name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__CONCEPT_NAME = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__ANNOTATIONS = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__USES = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__SPECIALIZES = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__FEATURE = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.glsp.conceptap.model.impl.UsesImpl <em>Uses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.glsp.conceptap.model.impl.UsesImpl
	 * @see org.eclipse.glsp.conceptap.model.impl.ModelPackageImpl#getUses()
	 * @generated
	 */
	int USES = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__NAME = IDENTIFIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__ORIGIN = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__DESTINATION = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Imported Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__IMPORTED_ORIGIN = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Imported Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__IMPORTED_DESTINATION = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Uses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Uses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.glsp.conceptap.model.impl.SpecializesImpl <em>Specializes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.glsp.conceptap.model.impl.SpecializesImpl
	 * @see org.eclipse.glsp.conceptap.model.impl.ModelPackageImpl#getSpecializes()
	 * @generated
	 */
	int SPECIALIZES = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZES__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZES__NAME = IDENTIFIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZES__ORIGIN = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZES__DESTINATION = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Imported Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZES__IMPORTED_ORIGIN = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Imported Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZES__IMPORTED_DESTINATION = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Specializes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZES_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Specializes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZES_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.glsp.conceptap.model.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.glsp.conceptap.model.impl.FeatureImpl
	 * @see org.eclipse.glsp.conceptap.model.impl.ModelPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = IDENTIFIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Feature name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FEATURE_NAME = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.glsp.conceptap.model.impl.LegendImpl <em>Legend</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.glsp.conceptap.model.impl.LegendImpl
	 * @see org.eclipse.glsp.conceptap.model.impl.ModelPackageImpl#getLegend()
	 * @generated
	 */
	int LEGEND = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND__NAME = IDENTIFIABLE__NAME;

	/**
	 * The number of structural features of the '<em>Legend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Legend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGEND_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.glsp.conceptap.model.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.glsp.conceptap.model.Identifiable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Identifiable#getId()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.glsp.conceptap.model.Identifiable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Identifiable#getName()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.glsp.conceptap.model.ConceptMap <em>Concept Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Map</em>'.
	 * @see org.eclipse.glsp.conceptap.model.ConceptMap
	 * @generated
	 */
	EClass getConceptMap();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.glsp.conceptap.model.ConceptMap#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course</em>'.
	 * @see org.eclipse.glsp.conceptap.model.ConceptMap#getCourse()
	 * @see #getConceptMap()
	 * @generated
	 */
	EReference getConceptMap_Course();

	/**
	 * Returns the meta object for class '{@link org.eclipse.glsp.conceptap.model.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.glsp.conceptap.model.Course#getCourse_name <em>Course name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course name</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Course#getCourse_name()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Course_name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.glsp.conceptap.model.Course#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Course#getAuthor()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.glsp.conceptap.model.Course#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Course#getContext()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Context();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.glsp.conceptap.model.Course#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Course#getProperties()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.glsp.conceptap.model.Course#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Topic</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Course#getTopic()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Topic();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.glsp.conceptap.model.Course#getLegend <em>Legend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Legend</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Course#getLegend()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Legend();

	/**
	 * Returns the meta object for class '{@link org.eclipse.glsp.conceptap.model.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Properties
	 * @generated
	 */
	EClass getProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.glsp.conceptap.model.Properties#getBibliography <em>Bibliography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bibliography</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Properties#getBibliography()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_Bibliography();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.glsp.conceptap.model.Properties#getPrevious_requirements <em>Previous requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous requirements</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Properties#getPrevious_requirements()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_Previous_requirements();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.glsp.conceptap.model.Properties#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skills</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Properties#getSkills()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_Skills();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.glsp.conceptap.model.Properties#getAssessment_criteria <em>Assessment criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assessment criteria</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Properties#getAssessment_criteria()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_Assessment_criteria();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.glsp.conceptap.model.Properties#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Properties#getSubject()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_Subject();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.glsp.conceptap.model.Properties#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Properties#getArea()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_Area();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.glsp.conceptap.model.Properties#getOffer <em>Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offer</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Properties#getOffer()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_Offer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.glsp.conceptap.model.Properties#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semester</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Properties#getSemester()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_Semester();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.glsp.conceptap.model.Properties#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Properties#getCredits()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_Credits();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.glsp.conceptap.model.Properties#getLarge_group_hours <em>Large group hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Large group hours</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Properties#getLarge_group_hours()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_Large_group_hours();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.glsp.conceptap.model.Properties#getSmall_group_hours <em>Small group hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Small group hours</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Properties#getSmall_group_hours()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_Small_group_hours();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.glsp.conceptap.model.Properties#getCoordinator <em>Coordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordinator</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Properties#getCoordinator()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_Coordinator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.glsp.conceptap.model.Imported_Concept <em>Imported Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imported Concept</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Imported_Concept
	 * @generated
	 */
	EClass getImported_Concept();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.glsp.conceptap.model.Imported_Concept#getConcept_name <em>Concept name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concept name</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Imported_Concept#getConcept_name()
	 * @see #getImported_Concept()
	 * @generated
	 */
	EAttribute getImported_Concept_Concept_name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.glsp.conceptap.model.Imported_Concept#getUbication <em>Ubication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ubication</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Imported_Concept#getUbication()
	 * @see #getImported_Concept()
	 * @generated
	 */
	EAttribute getImported_Concept_Ubication();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.glsp.conceptap.model.Imported_Concept#getSpecializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specializes</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Imported_Concept#getSpecializes()
	 * @see #getImported_Concept()
	 * @generated
	 */
	EReference getImported_Concept_Specializes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.glsp.conceptap.model.Imported_Concept#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Imported_Concept#getUses()
	 * @see #getImported_Concept()
	 * @generated
	 */
	EReference getImported_Concept_Uses();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.glsp.conceptap.model.Imported_Concept#getRelatedTopic <em>Related Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Related Topic</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Imported_Concept#getRelatedTopic()
	 * @see #getImported_Concept()
	 * @generated
	 */
	EAttribute getImported_Concept_RelatedTopic();

	/**
	 * Returns the meta object for class '{@link org.eclipse.glsp.conceptap.model.Topic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Topic
	 * @generated
	 */
	EClass getTopic();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.glsp.conceptap.model.Topic#getTopic_name <em>Topic name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic name</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Topic#getTopic_name()
	 * @see #getTopic()
	 * @generated
	 */
	EAttribute getTopic_Topic_name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.glsp.conceptap.model.Topic#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotations</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Topic#getAnnotations()
	 * @see #getTopic()
	 * @generated
	 */
	EAttribute getTopic_Annotations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.glsp.conceptap.model.Topic#getAfter <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>After</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Topic#getAfter()
	 * @see #getTopic()
	 * @generated
	 */
	EReference getTopic_After();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.glsp.conceptap.model.Topic#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concept</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Topic#getConcept()
	 * @see #getTopic()
	 * @generated
	 */
	EReference getTopic_Concept();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.glsp.conceptap.model.Topic#getImported_concept <em>Imported concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imported concept</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Topic#getImported_concept()
	 * @see #getTopic()
	 * @generated
	 */
	EReference getTopic_Imported_concept();

	/**
	 * Returns the meta object for class '{@link org.eclipse.glsp.conceptap.model.After <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>After</em>'.
	 * @see org.eclipse.glsp.conceptap.model.After
	 * @generated
	 */
	EClass getAfter();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.glsp.conceptap.model.After#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see org.eclipse.glsp.conceptap.model.After#getOrigin()
	 * @see #getAfter()
	 * @generated
	 */
	EReference getAfter_Origin();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.glsp.conceptap.model.After#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see org.eclipse.glsp.conceptap.model.After#getDestination()
	 * @see #getAfter()
	 * @generated
	 */
	EReference getAfter_Destination();

	/**
	 * Returns the meta object for class '{@link org.eclipse.glsp.conceptap.model.Concept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Concept
	 * @generated
	 */
	EClass getConcept();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.glsp.conceptap.model.Concept#getConcept_name <em>Concept name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concept name</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Concept#getConcept_name()
	 * @see #getConcept()
	 * @generated
	 */
	EAttribute getConcept_Concept_name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.glsp.conceptap.model.Concept#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotations</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Concept#getAnnotations()
	 * @see #getConcept()
	 * @generated
	 */
	EAttribute getConcept_Annotations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.glsp.conceptap.model.Concept#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Concept#getUses()
	 * @see #getConcept()
	 * @generated
	 */
	EReference getConcept_Uses();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.glsp.conceptap.model.Concept#getSpecializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specializes</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Concept#getSpecializes()
	 * @see #getConcept()
	 * @generated
	 */
	EReference getConcept_Specializes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.glsp.conceptap.model.Concept#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Concept#getFeature()
	 * @see #getConcept()
	 * @generated
	 */
	EReference getConcept_Feature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.glsp.conceptap.model.Uses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uses</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Uses
	 * @generated
	 */
	EClass getUses();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.glsp.conceptap.model.Uses#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Uses#getOrigin()
	 * @see #getUses()
	 * @generated
	 */
	EReference getUses_Origin();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.glsp.conceptap.model.Uses#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Uses#getDestination()
	 * @see #getUses()
	 * @generated
	 */
	EReference getUses_Destination();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.glsp.conceptap.model.Uses#getImportedOrigin <em>Imported Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imported Origin</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Uses#getImportedOrigin()
	 * @see #getUses()
	 * @generated
	 */
	EReference getUses_ImportedOrigin();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.glsp.conceptap.model.Uses#getImportedDestination <em>Imported Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imported Destination</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Uses#getImportedDestination()
	 * @see #getUses()
	 * @generated
	 */
	EReference getUses_ImportedDestination();

	/**
	 * Returns the meta object for class '{@link org.eclipse.glsp.conceptap.model.Specializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specializes</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Specializes
	 * @generated
	 */
	EClass getSpecializes();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.glsp.conceptap.model.Specializes#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Specializes#getOrigin()
	 * @see #getSpecializes()
	 * @generated
	 */
	EReference getSpecializes_Origin();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.glsp.conceptap.model.Specializes#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Specializes#getDestination()
	 * @see #getSpecializes()
	 * @generated
	 */
	EReference getSpecializes_Destination();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.glsp.conceptap.model.Specializes#getImportedOrigin <em>Imported Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imported Origin</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Specializes#getImportedOrigin()
	 * @see #getSpecializes()
	 * @generated
	 */
	EReference getSpecializes_ImportedOrigin();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.glsp.conceptap.model.Specializes#getImportedDestination <em>Imported Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imported Destination</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Specializes#getImportedDestination()
	 * @see #getSpecializes()
	 * @generated
	 */
	EReference getSpecializes_ImportedDestination();

	/**
	 * Returns the meta object for class '{@link org.eclipse.glsp.conceptap.model.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.glsp.conceptap.model.Feature#getFeature_name <em>Feature name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature name</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Feature#getFeature_name()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Feature_name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.glsp.conceptap.model.Legend <em>Legend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legend</em>'.
	 * @see org.eclipse.glsp.conceptap.model.Legend
	 * @generated
	 */
	EClass getLegend();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.glsp.conceptap.model.impl.IdentifiableImpl <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.glsp.conceptap.model.impl.IdentifiableImpl
		 * @see org.eclipse.glsp.conceptap.model.impl.ModelPackageImpl#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__ID = eINSTANCE.getIdentifiable_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__NAME = eINSTANCE.getIdentifiable_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.glsp.conceptap.model.impl.ConceptMapImpl <em>Concept Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.glsp.conceptap.model.impl.ConceptMapImpl
		 * @see org.eclipse.glsp.conceptap.model.impl.ModelPackageImpl#getConceptMap()
		 * @generated
		 */
		EClass CONCEPT_MAP = eINSTANCE.getConceptMap();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT_MAP__COURSE = eINSTANCE.getConceptMap_Course();

		/**
		 * The meta object literal for the '{@link org.eclipse.glsp.conceptap.model.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.glsp.conceptap.model.impl.CourseImpl
		 * @see org.eclipse.glsp.conceptap.model.impl.ModelPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Course name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE_NAME = eINSTANCE.getCourse_Course_name();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__AUTHOR = eINSTANCE.getCourse_Author();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CONTEXT = eINSTANCE.getCourse_Context();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__PROPERTIES = eINSTANCE.getCourse_Properties();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__TOPIC = eINSTANCE.getCourse_Topic();

		/**
		 * The meta object literal for the '<em><b>Legend</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__LEGEND = eINSTANCE.getCourse_Legend();

		/**
		 * The meta object literal for the '{@link org.eclipse.glsp.conceptap.model.impl.PropertiesImpl <em>Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.glsp.conceptap.model.impl.PropertiesImpl
		 * @see org.eclipse.glsp.conceptap.model.impl.ModelPackageImpl#getProperties()
		 * @generated
		 */
		EClass PROPERTIES = eINSTANCE.getProperties();

		/**
		 * The meta object literal for the '<em><b>Bibliography</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__BIBLIOGRAPHY = eINSTANCE.getProperties_Bibliography();

		/**
		 * The meta object literal for the '<em><b>Previous requirements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__PREVIOUS_REQUIREMENTS = eINSTANCE.getProperties_Previous_requirements();

		/**
		 * The meta object literal for the '<em><b>Skills</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__SKILLS = eINSTANCE.getProperties_Skills();

		/**
		 * The meta object literal for the '<em><b>Assessment criteria</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__ASSESSMENT_CRITERIA = eINSTANCE.getProperties_Assessment_criteria();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__SUBJECT = eINSTANCE.getProperties_Subject();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__AREA = eINSTANCE.getProperties_Area();

		/**
		 * The meta object literal for the '<em><b>Offer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__OFFER = eINSTANCE.getProperties_Offer();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__SEMESTER = eINSTANCE.getProperties_Semester();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__CREDITS = eINSTANCE.getProperties_Credits();

		/**
		 * The meta object literal for the '<em><b>Large group hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__LARGE_GROUP_HOURS = eINSTANCE.getProperties_Large_group_hours();

		/**
		 * The meta object literal for the '<em><b>Small group hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__SMALL_GROUP_HOURS = eINSTANCE.getProperties_Small_group_hours();

		/**
		 * The meta object literal for the '<em><b>Coordinator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__COORDINATOR = eINSTANCE.getProperties_Coordinator();

		/**
		 * The meta object literal for the '{@link org.eclipse.glsp.conceptap.model.impl.Imported_ConceptImpl <em>Imported Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.glsp.conceptap.model.impl.Imported_ConceptImpl
		 * @see org.eclipse.glsp.conceptap.model.impl.ModelPackageImpl#getImported_Concept()
		 * @generated
		 */
		EClass IMPORTED_CONCEPT = eINSTANCE.getImported_Concept();

		/**
		 * The meta object literal for the '<em><b>Concept name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_CONCEPT__CONCEPT_NAME = eINSTANCE.getImported_Concept_Concept_name();

		/**
		 * The meta object literal for the '<em><b>Ubication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_CONCEPT__UBICATION = eINSTANCE.getImported_Concept_Ubication();

		/**
		 * The meta object literal for the '<em><b>Specializes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_CONCEPT__SPECIALIZES = eINSTANCE.getImported_Concept_Specializes();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_CONCEPT__USES = eINSTANCE.getImported_Concept_Uses();

		/**
		 * The meta object literal for the '<em><b>Related Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_CONCEPT__RELATED_TOPIC = eINSTANCE.getImported_Concept_RelatedTopic();

		/**
		 * The meta object literal for the '{@link org.eclipse.glsp.conceptap.model.impl.TopicImpl <em>Topic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.glsp.conceptap.model.impl.TopicImpl
		 * @see org.eclipse.glsp.conceptap.model.impl.ModelPackageImpl#getTopic()
		 * @generated
		 */
		EClass TOPIC = eINSTANCE.getTopic();

		/**
		 * The meta object literal for the '<em><b>Topic name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC__TOPIC_NAME = eINSTANCE.getTopic_Topic_name();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC__ANNOTATIONS = eINSTANCE.getTopic_Annotations();

		/**
		 * The meta object literal for the '<em><b>After</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC__AFTER = eINSTANCE.getTopic_After();

		/**
		 * The meta object literal for the '<em><b>Concept</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC__CONCEPT = eINSTANCE.getTopic_Concept();

		/**
		 * The meta object literal for the '<em><b>Imported concept</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC__IMPORTED_CONCEPT = eINSTANCE.getTopic_Imported_concept();

		/**
		 * The meta object literal for the '{@link org.eclipse.glsp.conceptap.model.impl.AfterImpl <em>After</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.glsp.conceptap.model.impl.AfterImpl
		 * @see org.eclipse.glsp.conceptap.model.impl.ModelPackageImpl#getAfter()
		 * @generated
		 */
		EClass AFTER = eINSTANCE.getAfter();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFTER__ORIGIN = eINSTANCE.getAfter_Origin();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFTER__DESTINATION = eINSTANCE.getAfter_Destination();

		/**
		 * The meta object literal for the '{@link org.eclipse.glsp.conceptap.model.impl.ConceptImpl <em>Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.glsp.conceptap.model.impl.ConceptImpl
		 * @see org.eclipse.glsp.conceptap.model.impl.ModelPackageImpl#getConcept()
		 * @generated
		 */
		EClass CONCEPT = eINSTANCE.getConcept();

		/**
		 * The meta object literal for the '<em><b>Concept name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPT__CONCEPT_NAME = eINSTANCE.getConcept_Concept_name();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPT__ANNOTATIONS = eINSTANCE.getConcept_Annotations();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT__USES = eINSTANCE.getConcept_Uses();

		/**
		 * The meta object literal for the '<em><b>Specializes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT__SPECIALIZES = eINSTANCE.getConcept_Specializes();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT__FEATURE = eINSTANCE.getConcept_Feature();

		/**
		 * The meta object literal for the '{@link org.eclipse.glsp.conceptap.model.impl.UsesImpl <em>Uses</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.glsp.conceptap.model.impl.UsesImpl
		 * @see org.eclipse.glsp.conceptap.model.impl.ModelPackageImpl#getUses()
		 * @generated
		 */
		EClass USES = eINSTANCE.getUses();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USES__ORIGIN = eINSTANCE.getUses_Origin();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USES__DESTINATION = eINSTANCE.getUses_Destination();

		/**
		 * The meta object literal for the '<em><b>Imported Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USES__IMPORTED_ORIGIN = eINSTANCE.getUses_ImportedOrigin();

		/**
		 * The meta object literal for the '<em><b>Imported Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USES__IMPORTED_DESTINATION = eINSTANCE.getUses_ImportedDestination();

		/**
		 * The meta object literal for the '{@link org.eclipse.glsp.conceptap.model.impl.SpecializesImpl <em>Specializes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.glsp.conceptap.model.impl.SpecializesImpl
		 * @see org.eclipse.glsp.conceptap.model.impl.ModelPackageImpl#getSpecializes()
		 * @generated
		 */
		EClass SPECIALIZES = eINSTANCE.getSpecializes();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZES__ORIGIN = eINSTANCE.getSpecializes_Origin();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZES__DESTINATION = eINSTANCE.getSpecializes_Destination();

		/**
		 * The meta object literal for the '<em><b>Imported Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZES__IMPORTED_ORIGIN = eINSTANCE.getSpecializes_ImportedOrigin();

		/**
		 * The meta object literal for the '<em><b>Imported Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZES__IMPORTED_DESTINATION = eINSTANCE.getSpecializes_ImportedDestination();

		/**
		 * The meta object literal for the '{@link org.eclipse.glsp.conceptap.model.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.glsp.conceptap.model.impl.FeatureImpl
		 * @see org.eclipse.glsp.conceptap.model.impl.ModelPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Feature name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__FEATURE_NAME = eINSTANCE.getFeature_Feature_name();

		/**
		 * The meta object literal for the '{@link org.eclipse.glsp.conceptap.model.impl.LegendImpl <em>Legend</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.glsp.conceptap.model.impl.LegendImpl
		 * @see org.eclipse.glsp.conceptap.model.impl.ModelPackageImpl#getLegend()
		 * @generated
		 */
		EClass LEGEND = eINSTANCE.getLegend();

	}

} //ModelPackage
