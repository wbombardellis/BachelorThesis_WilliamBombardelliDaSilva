/**
 */
package de.silvawb.java.operators;

import de.silvawb.java.commons.CommonsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see de.silvawb.java.operators.OperatorsFactory
 * @model kind="package"
 * @generated
 */
public interface OperatorsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "operators";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.emftext.org/java/operators";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "operators";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OperatorsPackage eINSTANCE = de.silvawb.java.operators.impl.OperatorsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.OperatorImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_CONCRETE_CLASSIFIER__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_LIB_CLASS__STRING = CommonsPackage.COMMENTABLE___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_LIB_INTERFACE__STRING = CommonsPackage.COMMENTABLE___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_CLASS_CLASS = CommonsPackage.COMMENTABLE___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_OBJECT_CLASS = CommonsPackage.COMMENTABLE___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_STRING_CLASS = CommonsPackage.COMMENTABLE___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_ANNOTATION_INTERFACE = CommonsPackage.COMMENTABLE___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_CONTAINING_COMPILATION_UNIT = CommonsPackage.COMMENTABLE___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_CONTAINING_PACKAGE_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_PARENT_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_PARENT_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_CHILDREN_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_COMMENTS = CommonsPackage.COMMENTABLE___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OPERATION_COUNT = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.AdditiveOperatorImpl <em>Additive Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.AdditiveOperatorImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getAdditiveOperator()
	 * @generated
	 */
	int ADDITIVE_OPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_OPERATOR__LAYOUT_INFORMATIONS = OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Additive Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING = OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING = OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING = OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_OPERATOR___GET_LIB_CLASS__STRING = OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_OPERATOR___GET_LIB_INTERFACE__STRING = OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_OPERATOR___GET_CLASS_CLASS = OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_OPERATOR___GET_OBJECT_CLASS = OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_OPERATOR___GET_STRING_CLASS = OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_OPERATOR___GET_ANNOTATION_INTERFACE = OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE = OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS = OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER = OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_OPERATOR___GET_CONTAINING_COMPILATION_UNIT = OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_OPERATOR___GET_CONTAINING_PACKAGE_NAME = OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER = OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS = OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS = OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_OPERATOR___GET_PARENT_BY_TYPE__CLASS = OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS = OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS = OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS = OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_OPERATOR___GET_COMMENTS = OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Additive Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.AssignmentOperatorImpl <em>Assignment Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.AssignmentOperatorImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getAssignmentOperator()
	 * @generated
	 */
	int ASSIGNMENT_OPERATOR = 2;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATOR__LAYOUT_INFORMATIONS = OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Assignment Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING = OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING = OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING = OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATOR___GET_LIB_CLASS__STRING = OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATOR___GET_LIB_INTERFACE__STRING = OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATOR___GET_CLASS_CLASS = OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATOR___GET_OBJECT_CLASS = OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATOR___GET_STRING_CLASS = OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATOR___GET_ANNOTATION_INTERFACE = OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE = OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS = OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER = OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATOR___GET_CONTAINING_COMPILATION_UNIT = OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATOR___GET_CONTAINING_PACKAGE_NAME = OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER = OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS = OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS = OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATOR___GET_PARENT_BY_TYPE__CLASS = OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS = OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS = OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS = OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATOR___GET_COMMENTS = OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Assignment Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.EqualityOperatorImpl <em>Equality Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.EqualityOperatorImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getEqualityOperator()
	 * @generated
	 */
	int EQUALITY_OPERATOR = 3;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATOR__LAYOUT_INFORMATIONS = OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Equality Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING = OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING = OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING = OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATOR___GET_LIB_CLASS__STRING = OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATOR___GET_LIB_INTERFACE__STRING = OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATOR___GET_CLASS_CLASS = OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATOR___GET_OBJECT_CLASS = OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATOR___GET_STRING_CLASS = OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATOR___GET_ANNOTATION_INTERFACE = OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE = OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS = OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER = OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATOR___GET_CONTAINING_COMPILATION_UNIT = OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATOR___GET_CONTAINING_PACKAGE_NAME = OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER = OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS = OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS = OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATOR___GET_PARENT_BY_TYPE__CLASS = OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS = OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS = OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS = OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATOR___GET_COMMENTS = OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Equality Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.MultiplicativeOperatorImpl <em>Multiplicative Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.MultiplicativeOperatorImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getMultiplicativeOperator()
	 * @generated
	 */
	int MULTIPLICATIVE_OPERATOR = 4;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_OPERATOR__LAYOUT_INFORMATIONS = OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Multiplicative Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING = OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING = OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING = OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_OPERATOR___GET_LIB_CLASS__STRING = OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_OPERATOR___GET_LIB_INTERFACE__STRING = OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_OPERATOR___GET_CLASS_CLASS = OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_OPERATOR___GET_OBJECT_CLASS = OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_OPERATOR___GET_STRING_CLASS = OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_OPERATOR___GET_ANNOTATION_INTERFACE = OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE = OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS = OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER = OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_OPERATOR___GET_CONTAINING_COMPILATION_UNIT = OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_OPERATOR___GET_CONTAINING_PACKAGE_NAME = OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER = OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS = OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS = OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_OPERATOR___GET_PARENT_BY_TYPE__CLASS = OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS = OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS = OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS = OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_OPERATOR___GET_COMMENTS = OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Multiplicative Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.RelationOperatorImpl <em>Relation Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.RelationOperatorImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getRelationOperator()
	 * @generated
	 */
	int RELATION_OPERATOR = 5;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATOR__LAYOUT_INFORMATIONS = OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Relation Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING = OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING = OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING = OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATOR___GET_LIB_CLASS__STRING = OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATOR___GET_LIB_INTERFACE__STRING = OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATOR___GET_CLASS_CLASS = OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATOR___GET_OBJECT_CLASS = OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATOR___GET_STRING_CLASS = OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATOR___GET_ANNOTATION_INTERFACE = OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE = OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS = OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER = OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATOR___GET_CONTAINING_COMPILATION_UNIT = OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATOR___GET_CONTAINING_PACKAGE_NAME = OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER = OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS = OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS = OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATOR___GET_PARENT_BY_TYPE__CLASS = OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS = OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS = OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS = OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATOR___GET_COMMENTS = OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Relation Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.ShiftOperatorImpl <em>Shift Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.ShiftOperatorImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getShiftOperator()
	 * @generated
	 */
	int SHIFT_OPERATOR = 6;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OPERATOR__LAYOUT_INFORMATIONS = OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Shift Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING = OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING = OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING = OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OPERATOR___GET_LIB_CLASS__STRING = OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OPERATOR___GET_LIB_INTERFACE__STRING = OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OPERATOR___GET_CLASS_CLASS = OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OPERATOR___GET_OBJECT_CLASS = OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OPERATOR___GET_STRING_CLASS = OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OPERATOR___GET_ANNOTATION_INTERFACE = OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE = OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS = OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER = OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OPERATOR___GET_CONTAINING_COMPILATION_UNIT = OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OPERATOR___GET_CONTAINING_PACKAGE_NAME = OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER = OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS = OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS = OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OPERATOR___GET_PARENT_BY_TYPE__CLASS = OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS = OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS = OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS = OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OPERATOR___GET_COMMENTS = OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Shift Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.UnaryOperatorImpl <em>Unary Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.UnaryOperatorImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getUnaryOperator()
	 * @generated
	 */
	int UNARY_OPERATOR = 7;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR__LAYOUT_INFORMATIONS = OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Unary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING = OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING = OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING = OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR___GET_LIB_CLASS__STRING = OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR___GET_LIB_INTERFACE__STRING = OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR___GET_CLASS_CLASS = OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR___GET_OBJECT_CLASS = OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR___GET_STRING_CLASS = OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR___GET_ANNOTATION_INTERFACE = OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE = OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS = OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER = OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR___GET_CONTAINING_COMPILATION_UNIT = OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR___GET_CONTAINING_PACKAGE_NAME = OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER = OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS = OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS = OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR___GET_PARENT_BY_TYPE__CLASS = OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS = OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS = OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS = OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR___GET_COMMENTS = OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Unary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.UnaryModificationOperatorImpl <em>Unary Modification Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.UnaryModificationOperatorImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getUnaryModificationOperator()
	 * @generated
	 */
	int UNARY_MODIFICATION_OPERATOR = 8;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MODIFICATION_OPERATOR__LAYOUT_INFORMATIONS = OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Unary Modification Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MODIFICATION_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MODIFICATION_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING = OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MODIFICATION_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING = OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MODIFICATION_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING = OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MODIFICATION_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MODIFICATION_OPERATOR___GET_LIB_CLASS__STRING = OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MODIFICATION_OPERATOR___GET_LIB_INTERFACE__STRING = OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MODIFICATION_OPERATOR___GET_CLASS_CLASS = OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MODIFICATION_OPERATOR___GET_OBJECT_CLASS = OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MODIFICATION_OPERATOR___GET_STRING_CLASS = OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MODIFICATION_OPERATOR___GET_ANNOTATION_INTERFACE = OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MODIFICATION_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE = OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MODIFICATION_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS = OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MODIFICATION_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER = OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MODIFICATION_OPERATOR___GET_CONTAINING_COMPILATION_UNIT = OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MODIFICATION_OPERATOR___GET_CONTAINING_PACKAGE_NAME = OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MODIFICATION_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER = OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MODIFICATION_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS = OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MODIFICATION_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS = OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MODIFICATION_OPERATOR___GET_PARENT_BY_TYPE__CLASS = OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MODIFICATION_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS = OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MODIFICATION_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS = OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MODIFICATION_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS = OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MODIFICATION_OPERATOR___GET_COMMENTS = OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MODIFICATION_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MODIFICATION_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Unary Modification Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MODIFICATION_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.AssignmentImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 9;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__LAYOUT_INFORMATIONS = ASSIGNMENT_OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = ASSIGNMENT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT___GET_CONCRETE_CLASSIFIER__STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT___GET_LIB_CLASS__STRING = ASSIGNMENT_OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT___GET_LIB_INTERFACE__STRING = ASSIGNMENT_OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT___GET_CLASS_CLASS = ASSIGNMENT_OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT___GET_OBJECT_CLASS = ASSIGNMENT_OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT___GET_STRING_CLASS = ASSIGNMENT_OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT___GET_ANNOTATION_INTERFACE = ASSIGNMENT_OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT___GET_CONTAINING_ANNOTATION_INSTANCE = ASSIGNMENT_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT___GET_CONTAINING_ANONYMOUS_CLASS = ASSIGNMENT_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT___GET_CONTAINING_CONCRETE_CLASSIFIER = ASSIGNMENT_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT___GET_CONTAINING_COMPILATION_UNIT = ASSIGNMENT_OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT___GET_CONTAINING_PACKAGE_NAME = ASSIGNMENT_OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT___GET_PARENT_CONCRETE_CLASSIFIER = ASSIGNMENT_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT___GET_PARENT_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT___GET_PARENT_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT___GET_FIRST_CHILD_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT___GET_CHILDREN_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT___GET_CHILDREN_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT___GET_COMMENTS = ASSIGNMENT_OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ASSIGNMENT_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ASSIGNMENT_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_COUNT = ASSIGNMENT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.AssignmentAndImpl <em>Assignment And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.AssignmentAndImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getAssignmentAnd()
	 * @generated
	 */
	int ASSIGNMENT_AND = 10;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_AND__LAYOUT_INFORMATIONS = ASSIGNMENT_OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Assignment And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_AND_FEATURE_COUNT = ASSIGNMENT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_AND___GET_CONCRETE_CLASSIFIER__STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_AND___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_AND___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_AND___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_AND___GET_LIB_CLASS__STRING = ASSIGNMENT_OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_AND___GET_LIB_INTERFACE__STRING = ASSIGNMENT_OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_AND___GET_CLASS_CLASS = ASSIGNMENT_OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_AND___GET_OBJECT_CLASS = ASSIGNMENT_OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_AND___GET_STRING_CLASS = ASSIGNMENT_OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_AND___GET_ANNOTATION_INTERFACE = ASSIGNMENT_OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_AND___GET_CONTAINING_ANNOTATION_INSTANCE = ASSIGNMENT_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_AND___GET_CONTAINING_ANONYMOUS_CLASS = ASSIGNMENT_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_AND___GET_CONTAINING_CONCRETE_CLASSIFIER = ASSIGNMENT_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_AND___GET_CONTAINING_COMPILATION_UNIT = ASSIGNMENT_OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_AND___GET_CONTAINING_PACKAGE_NAME = ASSIGNMENT_OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_AND___GET_PARENT_CONCRETE_CLASSIFIER = ASSIGNMENT_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_AND___GET_PARENT_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_AND___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_AND___GET_PARENT_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_AND___GET_FIRST_CHILD_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_AND___GET_CHILDREN_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_AND___GET_CHILDREN_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_AND___GET_COMMENTS = ASSIGNMENT_OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_AND___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ASSIGNMENT_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_AND___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ASSIGNMENT_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Assignment And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_AND_OPERATION_COUNT = ASSIGNMENT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.AssignmentDivisionImpl <em>Assignment Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.AssignmentDivisionImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getAssignmentDivision()
	 * @generated
	 */
	int ASSIGNMENT_DIVISION = 11;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_DIVISION__LAYOUT_INFORMATIONS = ASSIGNMENT_OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Assignment Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_DIVISION_FEATURE_COUNT = ASSIGNMENT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_DIVISION___GET_CONCRETE_CLASSIFIER__STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_DIVISION___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_DIVISION___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_DIVISION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_DIVISION___GET_LIB_CLASS__STRING = ASSIGNMENT_OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_DIVISION___GET_LIB_INTERFACE__STRING = ASSIGNMENT_OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_DIVISION___GET_CLASS_CLASS = ASSIGNMENT_OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_DIVISION___GET_OBJECT_CLASS = ASSIGNMENT_OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_DIVISION___GET_STRING_CLASS = ASSIGNMENT_OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_DIVISION___GET_ANNOTATION_INTERFACE = ASSIGNMENT_OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_DIVISION___GET_CONTAINING_ANNOTATION_INSTANCE = ASSIGNMENT_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_DIVISION___GET_CONTAINING_ANONYMOUS_CLASS = ASSIGNMENT_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_DIVISION___GET_CONTAINING_CONCRETE_CLASSIFIER = ASSIGNMENT_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_DIVISION___GET_CONTAINING_COMPILATION_UNIT = ASSIGNMENT_OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_DIVISION___GET_CONTAINING_PACKAGE_NAME = ASSIGNMENT_OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_DIVISION___GET_PARENT_CONCRETE_CLASSIFIER = ASSIGNMENT_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_DIVISION___GET_PARENT_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_DIVISION___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_DIVISION___GET_PARENT_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_DIVISION___GET_FIRST_CHILD_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_DIVISION___GET_CHILDREN_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_DIVISION___GET_CHILDREN_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_DIVISION___GET_COMMENTS = ASSIGNMENT_OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_DIVISION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ASSIGNMENT_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_DIVISION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ASSIGNMENT_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Assignment Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_DIVISION_OPERATION_COUNT = ASSIGNMENT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.AssignmentExclusiveOrImpl <em>Assignment Exclusive Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.AssignmentExclusiveOrImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getAssignmentExclusiveOr()
	 * @generated
	 */
	int ASSIGNMENT_EXCLUSIVE_OR = 12;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXCLUSIVE_OR__LAYOUT_INFORMATIONS = ASSIGNMENT_OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Assignment Exclusive Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXCLUSIVE_OR_FEATURE_COUNT = ASSIGNMENT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXCLUSIVE_OR___GET_CONCRETE_CLASSIFIER__STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXCLUSIVE_OR___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXCLUSIVE_OR___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXCLUSIVE_OR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXCLUSIVE_OR___GET_LIB_CLASS__STRING = ASSIGNMENT_OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXCLUSIVE_OR___GET_LIB_INTERFACE__STRING = ASSIGNMENT_OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXCLUSIVE_OR___GET_CLASS_CLASS = ASSIGNMENT_OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXCLUSIVE_OR___GET_OBJECT_CLASS = ASSIGNMENT_OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXCLUSIVE_OR___GET_STRING_CLASS = ASSIGNMENT_OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXCLUSIVE_OR___GET_ANNOTATION_INTERFACE = ASSIGNMENT_OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXCLUSIVE_OR___GET_CONTAINING_ANNOTATION_INSTANCE = ASSIGNMENT_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXCLUSIVE_OR___GET_CONTAINING_ANONYMOUS_CLASS = ASSIGNMENT_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXCLUSIVE_OR___GET_CONTAINING_CONCRETE_CLASSIFIER = ASSIGNMENT_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXCLUSIVE_OR___GET_CONTAINING_COMPILATION_UNIT = ASSIGNMENT_OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXCLUSIVE_OR___GET_CONTAINING_PACKAGE_NAME = ASSIGNMENT_OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXCLUSIVE_OR___GET_PARENT_CONCRETE_CLASSIFIER = ASSIGNMENT_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXCLUSIVE_OR___GET_PARENT_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXCLUSIVE_OR___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXCLUSIVE_OR___GET_PARENT_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXCLUSIVE_OR___GET_FIRST_CHILD_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXCLUSIVE_OR___GET_CHILDREN_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXCLUSIVE_OR___GET_CHILDREN_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXCLUSIVE_OR___GET_COMMENTS = ASSIGNMENT_OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXCLUSIVE_OR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ASSIGNMENT_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXCLUSIVE_OR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ASSIGNMENT_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Assignment Exclusive Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXCLUSIVE_OR_OPERATION_COUNT = ASSIGNMENT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.AssignmentMinusImpl <em>Assignment Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.AssignmentMinusImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getAssignmentMinus()
	 * @generated
	 */
	int ASSIGNMENT_MINUS = 13;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MINUS__LAYOUT_INFORMATIONS = ASSIGNMENT_OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Assignment Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MINUS_FEATURE_COUNT = ASSIGNMENT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MINUS___GET_CONCRETE_CLASSIFIER__STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MINUS___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MINUS___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MINUS___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MINUS___GET_LIB_CLASS__STRING = ASSIGNMENT_OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MINUS___GET_LIB_INTERFACE__STRING = ASSIGNMENT_OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MINUS___GET_CLASS_CLASS = ASSIGNMENT_OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MINUS___GET_OBJECT_CLASS = ASSIGNMENT_OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MINUS___GET_STRING_CLASS = ASSIGNMENT_OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MINUS___GET_ANNOTATION_INTERFACE = ASSIGNMENT_OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MINUS___GET_CONTAINING_ANNOTATION_INSTANCE = ASSIGNMENT_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MINUS___GET_CONTAINING_ANONYMOUS_CLASS = ASSIGNMENT_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MINUS___GET_CONTAINING_CONCRETE_CLASSIFIER = ASSIGNMENT_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MINUS___GET_CONTAINING_COMPILATION_UNIT = ASSIGNMENT_OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MINUS___GET_CONTAINING_PACKAGE_NAME = ASSIGNMENT_OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MINUS___GET_PARENT_CONCRETE_CLASSIFIER = ASSIGNMENT_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MINUS___GET_PARENT_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MINUS___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MINUS___GET_PARENT_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MINUS___GET_FIRST_CHILD_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MINUS___GET_CHILDREN_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MINUS___GET_CHILDREN_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MINUS___GET_COMMENTS = ASSIGNMENT_OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MINUS___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ASSIGNMENT_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MINUS___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ASSIGNMENT_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Assignment Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MINUS_OPERATION_COUNT = ASSIGNMENT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.AssignmentModuloImpl <em>Assignment Modulo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.AssignmentModuloImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getAssignmentModulo()
	 * @generated
	 */
	int ASSIGNMENT_MODULO = 14;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MODULO__LAYOUT_INFORMATIONS = ASSIGNMENT_OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Assignment Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MODULO_FEATURE_COUNT = ASSIGNMENT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MODULO___GET_CONCRETE_CLASSIFIER__STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MODULO___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MODULO___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MODULO___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MODULO___GET_LIB_CLASS__STRING = ASSIGNMENT_OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MODULO___GET_LIB_INTERFACE__STRING = ASSIGNMENT_OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MODULO___GET_CLASS_CLASS = ASSIGNMENT_OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MODULO___GET_OBJECT_CLASS = ASSIGNMENT_OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MODULO___GET_STRING_CLASS = ASSIGNMENT_OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MODULO___GET_ANNOTATION_INTERFACE = ASSIGNMENT_OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MODULO___GET_CONTAINING_ANNOTATION_INSTANCE = ASSIGNMENT_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MODULO___GET_CONTAINING_ANONYMOUS_CLASS = ASSIGNMENT_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MODULO___GET_CONTAINING_CONCRETE_CLASSIFIER = ASSIGNMENT_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MODULO___GET_CONTAINING_COMPILATION_UNIT = ASSIGNMENT_OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MODULO___GET_CONTAINING_PACKAGE_NAME = ASSIGNMENT_OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MODULO___GET_PARENT_CONCRETE_CLASSIFIER = ASSIGNMENT_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MODULO___GET_PARENT_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MODULO___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MODULO___GET_PARENT_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MODULO___GET_FIRST_CHILD_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MODULO___GET_CHILDREN_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MODULO___GET_CHILDREN_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MODULO___GET_COMMENTS = ASSIGNMENT_OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MODULO___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ASSIGNMENT_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MODULO___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ASSIGNMENT_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Assignment Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MODULO_OPERATION_COUNT = ASSIGNMENT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.AssignmentMultiplicationImpl <em>Assignment Multiplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.AssignmentMultiplicationImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getAssignmentMultiplication()
	 * @generated
	 */
	int ASSIGNMENT_MULTIPLICATION = 15;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MULTIPLICATION__LAYOUT_INFORMATIONS = ASSIGNMENT_OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Assignment Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MULTIPLICATION_FEATURE_COUNT = ASSIGNMENT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MULTIPLICATION___GET_CONCRETE_CLASSIFIER__STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MULTIPLICATION___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MULTIPLICATION___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MULTIPLICATION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MULTIPLICATION___GET_LIB_CLASS__STRING = ASSIGNMENT_OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MULTIPLICATION___GET_LIB_INTERFACE__STRING = ASSIGNMENT_OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MULTIPLICATION___GET_CLASS_CLASS = ASSIGNMENT_OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MULTIPLICATION___GET_OBJECT_CLASS = ASSIGNMENT_OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MULTIPLICATION___GET_STRING_CLASS = ASSIGNMENT_OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MULTIPLICATION___GET_ANNOTATION_INTERFACE = ASSIGNMENT_OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MULTIPLICATION___GET_CONTAINING_ANNOTATION_INSTANCE = ASSIGNMENT_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MULTIPLICATION___GET_CONTAINING_ANONYMOUS_CLASS = ASSIGNMENT_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MULTIPLICATION___GET_CONTAINING_CONCRETE_CLASSIFIER = ASSIGNMENT_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MULTIPLICATION___GET_CONTAINING_COMPILATION_UNIT = ASSIGNMENT_OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MULTIPLICATION___GET_CONTAINING_PACKAGE_NAME = ASSIGNMENT_OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MULTIPLICATION___GET_PARENT_CONCRETE_CLASSIFIER = ASSIGNMENT_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MULTIPLICATION___GET_PARENT_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MULTIPLICATION___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MULTIPLICATION___GET_PARENT_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MULTIPLICATION___GET_FIRST_CHILD_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MULTIPLICATION___GET_CHILDREN_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MULTIPLICATION___GET_CHILDREN_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MULTIPLICATION___GET_COMMENTS = ASSIGNMENT_OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MULTIPLICATION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ASSIGNMENT_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MULTIPLICATION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ASSIGNMENT_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Assignment Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_MULTIPLICATION_OPERATION_COUNT = ASSIGNMENT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.AssignmentLeftShiftImpl <em>Assignment Left Shift</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.AssignmentLeftShiftImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getAssignmentLeftShift()
	 * @generated
	 */
	int ASSIGNMENT_LEFT_SHIFT = 16;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LEFT_SHIFT__LAYOUT_INFORMATIONS = ASSIGNMENT_OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Assignment Left Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LEFT_SHIFT_FEATURE_COUNT = ASSIGNMENT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LEFT_SHIFT___GET_CONCRETE_CLASSIFIER__STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LEFT_SHIFT___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LEFT_SHIFT___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LEFT_SHIFT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LEFT_SHIFT___GET_LIB_CLASS__STRING = ASSIGNMENT_OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LEFT_SHIFT___GET_LIB_INTERFACE__STRING = ASSIGNMENT_OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LEFT_SHIFT___GET_CLASS_CLASS = ASSIGNMENT_OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LEFT_SHIFT___GET_OBJECT_CLASS = ASSIGNMENT_OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LEFT_SHIFT___GET_STRING_CLASS = ASSIGNMENT_OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LEFT_SHIFT___GET_ANNOTATION_INTERFACE = ASSIGNMENT_OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LEFT_SHIFT___GET_CONTAINING_ANNOTATION_INSTANCE = ASSIGNMENT_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LEFT_SHIFT___GET_CONTAINING_ANONYMOUS_CLASS = ASSIGNMENT_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LEFT_SHIFT___GET_CONTAINING_CONCRETE_CLASSIFIER = ASSIGNMENT_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LEFT_SHIFT___GET_CONTAINING_COMPILATION_UNIT = ASSIGNMENT_OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LEFT_SHIFT___GET_CONTAINING_PACKAGE_NAME = ASSIGNMENT_OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LEFT_SHIFT___GET_PARENT_CONCRETE_CLASSIFIER = ASSIGNMENT_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LEFT_SHIFT___GET_PARENT_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LEFT_SHIFT___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LEFT_SHIFT___GET_PARENT_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LEFT_SHIFT___GET_FIRST_CHILD_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LEFT_SHIFT___GET_CHILDREN_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LEFT_SHIFT___GET_CHILDREN_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LEFT_SHIFT___GET_COMMENTS = ASSIGNMENT_OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LEFT_SHIFT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ASSIGNMENT_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LEFT_SHIFT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ASSIGNMENT_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Assignment Left Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_LEFT_SHIFT_OPERATION_COUNT = ASSIGNMENT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.AssignmentOrImpl <em>Assignment Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.AssignmentOrImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getAssignmentOr()
	 * @generated
	 */
	int ASSIGNMENT_OR = 17;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OR__LAYOUT_INFORMATIONS = ASSIGNMENT_OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Assignment Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OR_FEATURE_COUNT = ASSIGNMENT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OR___GET_CONCRETE_CLASSIFIER__STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OR___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OR___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OR___GET_LIB_CLASS__STRING = ASSIGNMENT_OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OR___GET_LIB_INTERFACE__STRING = ASSIGNMENT_OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OR___GET_CLASS_CLASS = ASSIGNMENT_OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OR___GET_OBJECT_CLASS = ASSIGNMENT_OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OR___GET_STRING_CLASS = ASSIGNMENT_OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OR___GET_ANNOTATION_INTERFACE = ASSIGNMENT_OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OR___GET_CONTAINING_ANNOTATION_INSTANCE = ASSIGNMENT_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OR___GET_CONTAINING_ANONYMOUS_CLASS = ASSIGNMENT_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OR___GET_CONTAINING_CONCRETE_CLASSIFIER = ASSIGNMENT_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OR___GET_CONTAINING_COMPILATION_UNIT = ASSIGNMENT_OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OR___GET_CONTAINING_PACKAGE_NAME = ASSIGNMENT_OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OR___GET_PARENT_CONCRETE_CLASSIFIER = ASSIGNMENT_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OR___GET_PARENT_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OR___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OR___GET_PARENT_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OR___GET_FIRST_CHILD_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OR___GET_CHILDREN_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OR___GET_CHILDREN_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OR___GET_COMMENTS = ASSIGNMENT_OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ASSIGNMENT_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ASSIGNMENT_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Assignment Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OR_OPERATION_COUNT = ASSIGNMENT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.AssignmentPlusImpl <em>Assignment Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.AssignmentPlusImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getAssignmentPlus()
	 * @generated
	 */
	int ASSIGNMENT_PLUS = 18;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_PLUS__LAYOUT_INFORMATIONS = ASSIGNMENT_OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Assignment Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_PLUS_FEATURE_COUNT = ASSIGNMENT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_PLUS___GET_CONCRETE_CLASSIFIER__STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_PLUS___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_PLUS___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_PLUS___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_PLUS___GET_LIB_CLASS__STRING = ASSIGNMENT_OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_PLUS___GET_LIB_INTERFACE__STRING = ASSIGNMENT_OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_PLUS___GET_CLASS_CLASS = ASSIGNMENT_OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_PLUS___GET_OBJECT_CLASS = ASSIGNMENT_OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_PLUS___GET_STRING_CLASS = ASSIGNMENT_OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_PLUS___GET_ANNOTATION_INTERFACE = ASSIGNMENT_OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_PLUS___GET_CONTAINING_ANNOTATION_INSTANCE = ASSIGNMENT_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_PLUS___GET_CONTAINING_ANONYMOUS_CLASS = ASSIGNMENT_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_PLUS___GET_CONTAINING_CONCRETE_CLASSIFIER = ASSIGNMENT_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_PLUS___GET_CONTAINING_COMPILATION_UNIT = ASSIGNMENT_OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_PLUS___GET_CONTAINING_PACKAGE_NAME = ASSIGNMENT_OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_PLUS___GET_PARENT_CONCRETE_CLASSIFIER = ASSIGNMENT_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_PLUS___GET_PARENT_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_PLUS___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_PLUS___GET_PARENT_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_PLUS___GET_FIRST_CHILD_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_PLUS___GET_CHILDREN_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_PLUS___GET_CHILDREN_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_PLUS___GET_COMMENTS = ASSIGNMENT_OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_PLUS___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ASSIGNMENT_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_PLUS___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ASSIGNMENT_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Assignment Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_PLUS_OPERATION_COUNT = ASSIGNMENT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.AssignmentRightShiftImpl <em>Assignment Right Shift</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.AssignmentRightShiftImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getAssignmentRightShift()
	 * @generated
	 */
	int ASSIGNMENT_RIGHT_SHIFT = 19;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RIGHT_SHIFT__LAYOUT_INFORMATIONS = ASSIGNMENT_OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Assignment Right Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RIGHT_SHIFT_FEATURE_COUNT = ASSIGNMENT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RIGHT_SHIFT___GET_CONCRETE_CLASSIFIER__STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RIGHT_SHIFT___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RIGHT_SHIFT___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RIGHT_SHIFT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RIGHT_SHIFT___GET_LIB_CLASS__STRING = ASSIGNMENT_OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RIGHT_SHIFT___GET_LIB_INTERFACE__STRING = ASSIGNMENT_OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RIGHT_SHIFT___GET_CLASS_CLASS = ASSIGNMENT_OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RIGHT_SHIFT___GET_OBJECT_CLASS = ASSIGNMENT_OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RIGHT_SHIFT___GET_STRING_CLASS = ASSIGNMENT_OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RIGHT_SHIFT___GET_ANNOTATION_INTERFACE = ASSIGNMENT_OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RIGHT_SHIFT___GET_CONTAINING_ANNOTATION_INSTANCE = ASSIGNMENT_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RIGHT_SHIFT___GET_CONTAINING_ANONYMOUS_CLASS = ASSIGNMENT_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RIGHT_SHIFT___GET_CONTAINING_CONCRETE_CLASSIFIER = ASSIGNMENT_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RIGHT_SHIFT___GET_CONTAINING_COMPILATION_UNIT = ASSIGNMENT_OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RIGHT_SHIFT___GET_CONTAINING_PACKAGE_NAME = ASSIGNMENT_OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RIGHT_SHIFT___GET_PARENT_CONCRETE_CLASSIFIER = ASSIGNMENT_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RIGHT_SHIFT___GET_PARENT_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RIGHT_SHIFT___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RIGHT_SHIFT___GET_PARENT_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RIGHT_SHIFT___GET_FIRST_CHILD_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RIGHT_SHIFT___GET_CHILDREN_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RIGHT_SHIFT___GET_CHILDREN_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RIGHT_SHIFT___GET_COMMENTS = ASSIGNMENT_OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RIGHT_SHIFT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ASSIGNMENT_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RIGHT_SHIFT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ASSIGNMENT_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Assignment Right Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RIGHT_SHIFT_OPERATION_COUNT = ASSIGNMENT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.AssignmentUnsignedRightShiftImpl <em>Assignment Unsigned Right Shift</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.AssignmentUnsignedRightShiftImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getAssignmentUnsignedRightShift()
	 * @generated
	 */
	int ASSIGNMENT_UNSIGNED_RIGHT_SHIFT = 20;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_UNSIGNED_RIGHT_SHIFT__LAYOUT_INFORMATIONS = ASSIGNMENT_OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Assignment Unsigned Right Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_UNSIGNED_RIGHT_SHIFT_FEATURE_COUNT = ASSIGNMENT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_UNSIGNED_RIGHT_SHIFT___GET_CONCRETE_CLASSIFIER__STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_UNSIGNED_RIGHT_SHIFT___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_UNSIGNED_RIGHT_SHIFT___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_UNSIGNED_RIGHT_SHIFT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ASSIGNMENT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_UNSIGNED_RIGHT_SHIFT___GET_LIB_CLASS__STRING = ASSIGNMENT_OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_UNSIGNED_RIGHT_SHIFT___GET_LIB_INTERFACE__STRING = ASSIGNMENT_OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_UNSIGNED_RIGHT_SHIFT___GET_CLASS_CLASS = ASSIGNMENT_OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_UNSIGNED_RIGHT_SHIFT___GET_OBJECT_CLASS = ASSIGNMENT_OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_UNSIGNED_RIGHT_SHIFT___GET_STRING_CLASS = ASSIGNMENT_OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_UNSIGNED_RIGHT_SHIFT___GET_ANNOTATION_INTERFACE = ASSIGNMENT_OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_UNSIGNED_RIGHT_SHIFT___GET_CONTAINING_ANNOTATION_INSTANCE = ASSIGNMENT_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_UNSIGNED_RIGHT_SHIFT___GET_CONTAINING_ANONYMOUS_CLASS = ASSIGNMENT_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_UNSIGNED_RIGHT_SHIFT___GET_CONTAINING_CONCRETE_CLASSIFIER = ASSIGNMENT_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_UNSIGNED_RIGHT_SHIFT___GET_CONTAINING_COMPILATION_UNIT = ASSIGNMENT_OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_UNSIGNED_RIGHT_SHIFT___GET_CONTAINING_PACKAGE_NAME = ASSIGNMENT_OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_UNSIGNED_RIGHT_SHIFT___GET_PARENT_CONCRETE_CLASSIFIER = ASSIGNMENT_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_UNSIGNED_RIGHT_SHIFT___GET_PARENT_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_UNSIGNED_RIGHT_SHIFT___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_UNSIGNED_RIGHT_SHIFT___GET_PARENT_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_UNSIGNED_RIGHT_SHIFT___GET_FIRST_CHILD_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_UNSIGNED_RIGHT_SHIFT___GET_CHILDREN_BY_ETYPE__ECLASS = ASSIGNMENT_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_UNSIGNED_RIGHT_SHIFT___GET_CHILDREN_BY_TYPE__CLASS = ASSIGNMENT_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_UNSIGNED_RIGHT_SHIFT___GET_COMMENTS = ASSIGNMENT_OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_UNSIGNED_RIGHT_SHIFT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ASSIGNMENT_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_UNSIGNED_RIGHT_SHIFT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ASSIGNMENT_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Assignment Unsigned Right Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_UNSIGNED_RIGHT_SHIFT_OPERATION_COUNT = ASSIGNMENT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.EqualImpl <em>Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.EqualImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getEqual()
	 * @generated
	 */
	int EQUAL = 21;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL__LAYOUT_INFORMATIONS = EQUALITY_OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_FEATURE_COUNT = EQUALITY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL___GET_CONCRETE_CLASSIFIER__STRING = EQUALITY_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING = EQUALITY_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING = EQUALITY_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = EQUALITY_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL___GET_LIB_CLASS__STRING = EQUALITY_OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL___GET_LIB_INTERFACE__STRING = EQUALITY_OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL___GET_CLASS_CLASS = EQUALITY_OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL___GET_OBJECT_CLASS = EQUALITY_OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL___GET_STRING_CLASS = EQUALITY_OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL___GET_ANNOTATION_INTERFACE = EQUALITY_OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL___GET_CONTAINING_ANNOTATION_INSTANCE = EQUALITY_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL___GET_CONTAINING_ANONYMOUS_CLASS = EQUALITY_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL___GET_CONTAINING_CONCRETE_CLASSIFIER = EQUALITY_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL___GET_CONTAINING_COMPILATION_UNIT = EQUALITY_OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL___GET_CONTAINING_PACKAGE_NAME = EQUALITY_OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL___GET_PARENT_CONCRETE_CLASSIFIER = EQUALITY_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL___GET_PARENT_BY_ETYPE__ECLASS = EQUALITY_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS = EQUALITY_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL___GET_PARENT_BY_TYPE__CLASS = EQUALITY_OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL___GET_FIRST_CHILD_BY_TYPE__CLASS = EQUALITY_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL___GET_CHILDREN_BY_ETYPE__ECLASS = EQUALITY_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL___GET_CHILDREN_BY_TYPE__CLASS = EQUALITY_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL___GET_COMMENTS = EQUALITY_OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = EQUALITY_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = EQUALITY_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_OPERATION_COUNT = EQUALITY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.NotEqualImpl <em>Not Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.NotEqualImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getNotEqual()
	 * @generated
	 */
	int NOT_EQUAL = 22;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL__LAYOUT_INFORMATIONS = EQUALITY_OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Not Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL_FEATURE_COUNT = EQUALITY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL___GET_CONCRETE_CLASSIFIER__STRING = EQUALITY_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING = EQUALITY_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING = EQUALITY_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = EQUALITY_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL___GET_LIB_CLASS__STRING = EQUALITY_OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL___GET_LIB_INTERFACE__STRING = EQUALITY_OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL___GET_CLASS_CLASS = EQUALITY_OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL___GET_OBJECT_CLASS = EQUALITY_OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL___GET_STRING_CLASS = EQUALITY_OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL___GET_ANNOTATION_INTERFACE = EQUALITY_OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL___GET_CONTAINING_ANNOTATION_INSTANCE = EQUALITY_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL___GET_CONTAINING_ANONYMOUS_CLASS = EQUALITY_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL___GET_CONTAINING_CONCRETE_CLASSIFIER = EQUALITY_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL___GET_CONTAINING_COMPILATION_UNIT = EQUALITY_OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL___GET_CONTAINING_PACKAGE_NAME = EQUALITY_OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL___GET_PARENT_CONCRETE_CLASSIFIER = EQUALITY_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL___GET_PARENT_BY_ETYPE__ECLASS = EQUALITY_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS = EQUALITY_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL___GET_PARENT_BY_TYPE__CLASS = EQUALITY_OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL___GET_FIRST_CHILD_BY_TYPE__CLASS = EQUALITY_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL___GET_CHILDREN_BY_ETYPE__ECLASS = EQUALITY_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL___GET_CHILDREN_BY_TYPE__CLASS = EQUALITY_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL___GET_COMMENTS = EQUALITY_OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = EQUALITY_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = EQUALITY_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Not Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL_OPERATION_COUNT = EQUALITY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.GreaterThanImpl <em>Greater Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.GreaterThanImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getGreaterThan()
	 * @generated
	 */
	int GREATER_THAN = 23;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__LAYOUT_INFORMATIONS = RELATION_OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_FEATURE_COUNT = RELATION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN___GET_CONCRETE_CLASSIFIER__STRING = RELATION_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN___GET_CONCRETE_CLASSIFIER_PROXY__STRING = RELATION_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN___GET_CONCRETE_CLASSIFIERS__STRING_STRING = RELATION_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = RELATION_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN___GET_LIB_CLASS__STRING = RELATION_OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN___GET_LIB_INTERFACE__STRING = RELATION_OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN___GET_CLASS_CLASS = RELATION_OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN___GET_OBJECT_CLASS = RELATION_OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN___GET_STRING_CLASS = RELATION_OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN___GET_ANNOTATION_INTERFACE = RELATION_OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN___GET_CONTAINING_ANNOTATION_INSTANCE = RELATION_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN___GET_CONTAINING_ANONYMOUS_CLASS = RELATION_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN___GET_CONTAINING_CONCRETE_CLASSIFIER = RELATION_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN___GET_CONTAINING_COMPILATION_UNIT = RELATION_OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN___GET_CONTAINING_PACKAGE_NAME = RELATION_OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN___GET_PARENT_CONCRETE_CLASSIFIER = RELATION_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN___GET_PARENT_BY_ETYPE__ECLASS = RELATION_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN___GET_FIRST_CHILD_BY_ETYPE__ECLASS = RELATION_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN___GET_PARENT_BY_TYPE__CLASS = RELATION_OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN___GET_FIRST_CHILD_BY_TYPE__CLASS = RELATION_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN___GET_CHILDREN_BY_ETYPE__ECLASS = RELATION_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN___GET_CHILDREN_BY_TYPE__CLASS = RELATION_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN___GET_COMMENTS = RELATION_OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = RELATION_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = RELATION_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OPERATION_COUNT = RELATION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.GreaterThanOrEqualImpl <em>Greater Than Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.GreaterThanOrEqualImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getGreaterThanOrEqual()
	 * @generated
	 */
	int GREATER_THAN_OR_EQUAL = 24;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL__LAYOUT_INFORMATIONS = RELATION_OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Greater Than Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL_FEATURE_COUNT = RELATION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL___GET_CONCRETE_CLASSIFIER__STRING = RELATION_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING = RELATION_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING = RELATION_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = RELATION_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL___GET_LIB_CLASS__STRING = RELATION_OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL___GET_LIB_INTERFACE__STRING = RELATION_OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL___GET_CLASS_CLASS = RELATION_OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL___GET_OBJECT_CLASS = RELATION_OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL___GET_STRING_CLASS = RELATION_OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL___GET_ANNOTATION_INTERFACE = RELATION_OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL___GET_CONTAINING_ANNOTATION_INSTANCE = RELATION_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL___GET_CONTAINING_ANONYMOUS_CLASS = RELATION_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL___GET_CONTAINING_CONCRETE_CLASSIFIER = RELATION_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL___GET_CONTAINING_COMPILATION_UNIT = RELATION_OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL___GET_CONTAINING_PACKAGE_NAME = RELATION_OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL___GET_PARENT_CONCRETE_CLASSIFIER = RELATION_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL___GET_PARENT_BY_ETYPE__ECLASS = RELATION_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS = RELATION_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL___GET_PARENT_BY_TYPE__CLASS = RELATION_OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL___GET_FIRST_CHILD_BY_TYPE__CLASS = RELATION_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL___GET_CHILDREN_BY_ETYPE__ECLASS = RELATION_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL___GET_CHILDREN_BY_TYPE__CLASS = RELATION_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL___GET_COMMENTS = RELATION_OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = RELATION_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = RELATION_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Greater Than Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL_OPERATION_COUNT = RELATION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.LessThanImpl <em>Less Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.LessThanImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getLessThan()
	 * @generated
	 */
	int LESS_THAN = 25;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__LAYOUT_INFORMATIONS = RELATION_OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Less Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_FEATURE_COUNT = RELATION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN___GET_CONCRETE_CLASSIFIER__STRING = RELATION_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN___GET_CONCRETE_CLASSIFIER_PROXY__STRING = RELATION_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN___GET_CONCRETE_CLASSIFIERS__STRING_STRING = RELATION_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = RELATION_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN___GET_LIB_CLASS__STRING = RELATION_OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN___GET_LIB_INTERFACE__STRING = RELATION_OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN___GET_CLASS_CLASS = RELATION_OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN___GET_OBJECT_CLASS = RELATION_OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN___GET_STRING_CLASS = RELATION_OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN___GET_ANNOTATION_INTERFACE = RELATION_OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN___GET_CONTAINING_ANNOTATION_INSTANCE = RELATION_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN___GET_CONTAINING_ANONYMOUS_CLASS = RELATION_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN___GET_CONTAINING_CONCRETE_CLASSIFIER = RELATION_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN___GET_CONTAINING_COMPILATION_UNIT = RELATION_OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN___GET_CONTAINING_PACKAGE_NAME = RELATION_OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN___GET_PARENT_CONCRETE_CLASSIFIER = RELATION_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN___GET_PARENT_BY_ETYPE__ECLASS = RELATION_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN___GET_FIRST_CHILD_BY_ETYPE__ECLASS = RELATION_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN___GET_PARENT_BY_TYPE__CLASS = RELATION_OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN___GET_FIRST_CHILD_BY_TYPE__CLASS = RELATION_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN___GET_CHILDREN_BY_ETYPE__ECLASS = RELATION_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN___GET_CHILDREN_BY_TYPE__CLASS = RELATION_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN___GET_COMMENTS = RELATION_OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = RELATION_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = RELATION_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Less Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OPERATION_COUNT = RELATION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.LessThanOrEqualImpl <em>Less Than Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.LessThanOrEqualImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getLessThanOrEqual()
	 * @generated
	 */
	int LESS_THAN_OR_EQUAL = 26;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL__LAYOUT_INFORMATIONS = RELATION_OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Less Than Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL_FEATURE_COUNT = RELATION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL___GET_CONCRETE_CLASSIFIER__STRING = RELATION_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING = RELATION_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING = RELATION_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = RELATION_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL___GET_LIB_CLASS__STRING = RELATION_OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL___GET_LIB_INTERFACE__STRING = RELATION_OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL___GET_CLASS_CLASS = RELATION_OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL___GET_OBJECT_CLASS = RELATION_OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL___GET_STRING_CLASS = RELATION_OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL___GET_ANNOTATION_INTERFACE = RELATION_OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL___GET_CONTAINING_ANNOTATION_INSTANCE = RELATION_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL___GET_CONTAINING_ANONYMOUS_CLASS = RELATION_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL___GET_CONTAINING_CONCRETE_CLASSIFIER = RELATION_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL___GET_CONTAINING_COMPILATION_UNIT = RELATION_OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL___GET_CONTAINING_PACKAGE_NAME = RELATION_OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL___GET_PARENT_CONCRETE_CLASSIFIER = RELATION_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL___GET_PARENT_BY_ETYPE__ECLASS = RELATION_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS = RELATION_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL___GET_PARENT_BY_TYPE__CLASS = RELATION_OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL___GET_FIRST_CHILD_BY_TYPE__CLASS = RELATION_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL___GET_CHILDREN_BY_ETYPE__ECLASS = RELATION_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL___GET_CHILDREN_BY_TYPE__CLASS = RELATION_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL___GET_COMMENTS = RELATION_OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = RELATION_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = RELATION_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Less Than Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL_OPERATION_COUNT = RELATION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.AdditionImpl <em>Addition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.AdditionImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getAddition()
	 * @generated
	 */
	int ADDITION = 27;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__LAYOUT_INFORMATIONS = ADDITIVE_OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_FEATURE_COUNT = ADDITIVE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___GET_CONCRETE_CLASSIFIER__STRING = ADDITIVE_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ADDITIVE_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ADDITIVE_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ADDITIVE_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___GET_LIB_CLASS__STRING = ADDITIVE_OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___GET_LIB_INTERFACE__STRING = ADDITIVE_OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___GET_CLASS_CLASS = ADDITIVE_OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___GET_OBJECT_CLASS = ADDITIVE_OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___GET_STRING_CLASS = ADDITIVE_OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___GET_ANNOTATION_INTERFACE = ADDITIVE_OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___GET_CONTAINING_ANNOTATION_INSTANCE = ADDITIVE_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___GET_CONTAINING_ANONYMOUS_CLASS = ADDITIVE_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___GET_CONTAINING_CONCRETE_CLASSIFIER = ADDITIVE_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___GET_CONTAINING_COMPILATION_UNIT = ADDITIVE_OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___GET_CONTAINING_PACKAGE_NAME = ADDITIVE_OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___GET_PARENT_CONCRETE_CLASSIFIER = ADDITIVE_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___GET_PARENT_BY_ETYPE__ECLASS = ADDITIVE_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ADDITIVE_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___GET_PARENT_BY_TYPE__CLASS = ADDITIVE_OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___GET_FIRST_CHILD_BY_TYPE__CLASS = ADDITIVE_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___GET_CHILDREN_BY_ETYPE__ECLASS = ADDITIVE_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___GET_CHILDREN_BY_TYPE__CLASS = ADDITIVE_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___GET_COMMENTS = ADDITIVE_OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ADDITIVE_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ADDITIVE_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_OPERATION_COUNT = ADDITIVE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.SubtractionImpl <em>Subtraction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.SubtractionImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getSubtraction()
	 * @generated
	 */
	int SUBTRACTION = 28;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION__LAYOUT_INFORMATIONS = ADDITIVE_OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Subtraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION_FEATURE_COUNT = ADDITIVE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION___GET_CONCRETE_CLASSIFIER__STRING = ADDITIVE_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ADDITIVE_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ADDITIVE_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ADDITIVE_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION___GET_LIB_CLASS__STRING = ADDITIVE_OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION___GET_LIB_INTERFACE__STRING = ADDITIVE_OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION___GET_CLASS_CLASS = ADDITIVE_OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION___GET_OBJECT_CLASS = ADDITIVE_OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION___GET_STRING_CLASS = ADDITIVE_OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION___GET_ANNOTATION_INTERFACE = ADDITIVE_OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION___GET_CONTAINING_ANNOTATION_INSTANCE = ADDITIVE_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION___GET_CONTAINING_ANONYMOUS_CLASS = ADDITIVE_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION___GET_CONTAINING_CONCRETE_CLASSIFIER = ADDITIVE_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION___GET_CONTAINING_COMPILATION_UNIT = ADDITIVE_OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION___GET_CONTAINING_PACKAGE_NAME = ADDITIVE_OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION___GET_PARENT_CONCRETE_CLASSIFIER = ADDITIVE_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION___GET_PARENT_BY_ETYPE__ECLASS = ADDITIVE_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ADDITIVE_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION___GET_PARENT_BY_TYPE__CLASS = ADDITIVE_OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION___GET_FIRST_CHILD_BY_TYPE__CLASS = ADDITIVE_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION___GET_CHILDREN_BY_ETYPE__ECLASS = ADDITIVE_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION___GET_CHILDREN_BY_TYPE__CLASS = ADDITIVE_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION___GET_COMMENTS = ADDITIVE_OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ADDITIVE_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ADDITIVE_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Subtraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION_OPERATION_COUNT = ADDITIVE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.DivisionImpl <em>Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.DivisionImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getDivision()
	 * @generated
	 */
	int DIVISION = 29;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__LAYOUT_INFORMATIONS = MULTIPLICATIVE_OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_FEATURE_COUNT = MULTIPLICATIVE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION___GET_CONCRETE_CLASSIFIER__STRING = MULTIPLICATIVE_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION___GET_CONCRETE_CLASSIFIER_PROXY__STRING = MULTIPLICATIVE_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION___GET_CONCRETE_CLASSIFIERS__STRING_STRING = MULTIPLICATIVE_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = MULTIPLICATIVE_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION___GET_LIB_CLASS__STRING = MULTIPLICATIVE_OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION___GET_LIB_INTERFACE__STRING = MULTIPLICATIVE_OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION___GET_CLASS_CLASS = MULTIPLICATIVE_OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION___GET_OBJECT_CLASS = MULTIPLICATIVE_OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION___GET_STRING_CLASS = MULTIPLICATIVE_OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION___GET_ANNOTATION_INTERFACE = MULTIPLICATIVE_OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION___GET_CONTAINING_ANNOTATION_INSTANCE = MULTIPLICATIVE_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION___GET_CONTAINING_ANONYMOUS_CLASS = MULTIPLICATIVE_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION___GET_CONTAINING_CONCRETE_CLASSIFIER = MULTIPLICATIVE_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION___GET_CONTAINING_COMPILATION_UNIT = MULTIPLICATIVE_OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION___GET_CONTAINING_PACKAGE_NAME = MULTIPLICATIVE_OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION___GET_PARENT_CONCRETE_CLASSIFIER = MULTIPLICATIVE_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION___GET_PARENT_BY_ETYPE__ECLASS = MULTIPLICATIVE_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION___GET_FIRST_CHILD_BY_ETYPE__ECLASS = MULTIPLICATIVE_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION___GET_PARENT_BY_TYPE__CLASS = MULTIPLICATIVE_OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION___GET_FIRST_CHILD_BY_TYPE__CLASS = MULTIPLICATIVE_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION___GET_CHILDREN_BY_ETYPE__ECLASS = MULTIPLICATIVE_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION___GET_CHILDREN_BY_TYPE__CLASS = MULTIPLICATIVE_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION___GET_COMMENTS = MULTIPLICATIVE_OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = MULTIPLICATIVE_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = MULTIPLICATIVE_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_OPERATION_COUNT = MULTIPLICATIVE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.MultiplicationImpl <em>Multiplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.MultiplicationImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getMultiplication()
	 * @generated
	 */
	int MULTIPLICATION = 30;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__LAYOUT_INFORMATIONS = MULTIPLICATIVE_OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION_FEATURE_COUNT = MULTIPLICATIVE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION___GET_CONCRETE_CLASSIFIER__STRING = MULTIPLICATIVE_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION___GET_CONCRETE_CLASSIFIER_PROXY__STRING = MULTIPLICATIVE_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION___GET_CONCRETE_CLASSIFIERS__STRING_STRING = MULTIPLICATIVE_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = MULTIPLICATIVE_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION___GET_LIB_CLASS__STRING = MULTIPLICATIVE_OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION___GET_LIB_INTERFACE__STRING = MULTIPLICATIVE_OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION___GET_CLASS_CLASS = MULTIPLICATIVE_OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION___GET_OBJECT_CLASS = MULTIPLICATIVE_OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION___GET_STRING_CLASS = MULTIPLICATIVE_OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION___GET_ANNOTATION_INTERFACE = MULTIPLICATIVE_OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION___GET_CONTAINING_ANNOTATION_INSTANCE = MULTIPLICATIVE_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION___GET_CONTAINING_ANONYMOUS_CLASS = MULTIPLICATIVE_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION___GET_CONTAINING_CONCRETE_CLASSIFIER = MULTIPLICATIVE_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION___GET_CONTAINING_COMPILATION_UNIT = MULTIPLICATIVE_OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION___GET_CONTAINING_PACKAGE_NAME = MULTIPLICATIVE_OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION___GET_PARENT_CONCRETE_CLASSIFIER = MULTIPLICATIVE_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION___GET_PARENT_BY_ETYPE__ECLASS = MULTIPLICATIVE_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION___GET_FIRST_CHILD_BY_ETYPE__ECLASS = MULTIPLICATIVE_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION___GET_PARENT_BY_TYPE__CLASS = MULTIPLICATIVE_OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION___GET_FIRST_CHILD_BY_TYPE__CLASS = MULTIPLICATIVE_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION___GET_CHILDREN_BY_ETYPE__ECLASS = MULTIPLICATIVE_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION___GET_CHILDREN_BY_TYPE__CLASS = MULTIPLICATIVE_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION___GET_COMMENTS = MULTIPLICATIVE_OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = MULTIPLICATIVE_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = MULTIPLICATIVE_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION_OPERATION_COUNT = MULTIPLICATIVE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.RemainderImpl <em>Remainder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.RemainderImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getRemainder()
	 * @generated
	 */
	int REMAINDER = 31;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAINDER__LAYOUT_INFORMATIONS = MULTIPLICATIVE_OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Remainder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAINDER_FEATURE_COUNT = MULTIPLICATIVE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAINDER___GET_CONCRETE_CLASSIFIER__STRING = MULTIPLICATIVE_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAINDER___GET_CONCRETE_CLASSIFIER_PROXY__STRING = MULTIPLICATIVE_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAINDER___GET_CONCRETE_CLASSIFIERS__STRING_STRING = MULTIPLICATIVE_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAINDER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = MULTIPLICATIVE_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAINDER___GET_LIB_CLASS__STRING = MULTIPLICATIVE_OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAINDER___GET_LIB_INTERFACE__STRING = MULTIPLICATIVE_OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAINDER___GET_CLASS_CLASS = MULTIPLICATIVE_OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAINDER___GET_OBJECT_CLASS = MULTIPLICATIVE_OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAINDER___GET_STRING_CLASS = MULTIPLICATIVE_OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAINDER___GET_ANNOTATION_INTERFACE = MULTIPLICATIVE_OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAINDER___GET_CONTAINING_ANNOTATION_INSTANCE = MULTIPLICATIVE_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAINDER___GET_CONTAINING_ANONYMOUS_CLASS = MULTIPLICATIVE_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAINDER___GET_CONTAINING_CONCRETE_CLASSIFIER = MULTIPLICATIVE_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAINDER___GET_CONTAINING_COMPILATION_UNIT = MULTIPLICATIVE_OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAINDER___GET_CONTAINING_PACKAGE_NAME = MULTIPLICATIVE_OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAINDER___GET_PARENT_CONCRETE_CLASSIFIER = MULTIPLICATIVE_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAINDER___GET_PARENT_BY_ETYPE__ECLASS = MULTIPLICATIVE_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAINDER___GET_FIRST_CHILD_BY_ETYPE__ECLASS = MULTIPLICATIVE_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAINDER___GET_PARENT_BY_TYPE__CLASS = MULTIPLICATIVE_OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAINDER___GET_FIRST_CHILD_BY_TYPE__CLASS = MULTIPLICATIVE_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAINDER___GET_CHILDREN_BY_ETYPE__ECLASS = MULTIPLICATIVE_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAINDER___GET_CHILDREN_BY_TYPE__CLASS = MULTIPLICATIVE_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAINDER___GET_COMMENTS = MULTIPLICATIVE_OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAINDER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = MULTIPLICATIVE_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAINDER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = MULTIPLICATIVE_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Remainder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAINDER_OPERATION_COUNT = MULTIPLICATIVE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.ComplementImpl <em>Complement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.ComplementImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getComplement()
	 * @generated
	 */
	int COMPLEMENT = 32;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT__LAYOUT_INFORMATIONS = UNARY_OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Complement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT___GET_CONCRETE_CLASSIFIER__STRING = UNARY_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT___GET_CONCRETE_CLASSIFIER_PROXY__STRING = UNARY_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT___GET_CONCRETE_CLASSIFIERS__STRING_STRING = UNARY_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = UNARY_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT___GET_LIB_CLASS__STRING = UNARY_OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT___GET_LIB_INTERFACE__STRING = UNARY_OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT___GET_CLASS_CLASS = UNARY_OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT___GET_OBJECT_CLASS = UNARY_OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT___GET_STRING_CLASS = UNARY_OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT___GET_ANNOTATION_INTERFACE = UNARY_OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT___GET_CONTAINING_ANNOTATION_INSTANCE = UNARY_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT___GET_CONTAINING_ANONYMOUS_CLASS = UNARY_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT___GET_CONTAINING_CONCRETE_CLASSIFIER = UNARY_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT___GET_CONTAINING_COMPILATION_UNIT = UNARY_OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT___GET_CONTAINING_PACKAGE_NAME = UNARY_OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT___GET_PARENT_CONCRETE_CLASSIFIER = UNARY_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT___GET_PARENT_BY_ETYPE__ECLASS = UNARY_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT___GET_FIRST_CHILD_BY_ETYPE__ECLASS = UNARY_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT___GET_PARENT_BY_TYPE__CLASS = UNARY_OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT___GET_FIRST_CHILD_BY_TYPE__CLASS = UNARY_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT___GET_CHILDREN_BY_ETYPE__ECLASS = UNARY_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT___GET_CHILDREN_BY_TYPE__CLASS = UNARY_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT___GET_COMMENTS = UNARY_OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = UNARY_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = UNARY_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Complement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_OPERATION_COUNT = UNARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.MinusMinusImpl <em>Minus Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.MinusMinusImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getMinusMinus()
	 * @generated
	 */
	int MINUS_MINUS = 33;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_MINUS__LAYOUT_INFORMATIONS = UNARY_MODIFICATION_OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Minus Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_MINUS_FEATURE_COUNT = UNARY_MODIFICATION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_MINUS___GET_CONCRETE_CLASSIFIER__STRING = UNARY_MODIFICATION_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_MINUS___GET_CONCRETE_CLASSIFIER_PROXY__STRING = UNARY_MODIFICATION_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_MINUS___GET_CONCRETE_CLASSIFIERS__STRING_STRING = UNARY_MODIFICATION_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_MINUS___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = UNARY_MODIFICATION_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_MINUS___GET_LIB_CLASS__STRING = UNARY_MODIFICATION_OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_MINUS___GET_LIB_INTERFACE__STRING = UNARY_MODIFICATION_OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_MINUS___GET_CLASS_CLASS = UNARY_MODIFICATION_OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_MINUS___GET_OBJECT_CLASS = UNARY_MODIFICATION_OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_MINUS___GET_STRING_CLASS = UNARY_MODIFICATION_OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_MINUS___GET_ANNOTATION_INTERFACE = UNARY_MODIFICATION_OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_MINUS___GET_CONTAINING_ANNOTATION_INSTANCE = UNARY_MODIFICATION_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_MINUS___GET_CONTAINING_ANONYMOUS_CLASS = UNARY_MODIFICATION_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_MINUS___GET_CONTAINING_CONCRETE_CLASSIFIER = UNARY_MODIFICATION_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_MINUS___GET_CONTAINING_COMPILATION_UNIT = UNARY_MODIFICATION_OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_MINUS___GET_CONTAINING_PACKAGE_NAME = UNARY_MODIFICATION_OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_MINUS___GET_PARENT_CONCRETE_CLASSIFIER = UNARY_MODIFICATION_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_MINUS___GET_PARENT_BY_ETYPE__ECLASS = UNARY_MODIFICATION_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_MINUS___GET_FIRST_CHILD_BY_ETYPE__ECLASS = UNARY_MODIFICATION_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_MINUS___GET_PARENT_BY_TYPE__CLASS = UNARY_MODIFICATION_OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_MINUS___GET_FIRST_CHILD_BY_TYPE__CLASS = UNARY_MODIFICATION_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_MINUS___GET_CHILDREN_BY_ETYPE__ECLASS = UNARY_MODIFICATION_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_MINUS___GET_CHILDREN_BY_TYPE__CLASS = UNARY_MODIFICATION_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_MINUS___GET_COMMENTS = UNARY_MODIFICATION_OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_MINUS___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = UNARY_MODIFICATION_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_MINUS___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = UNARY_MODIFICATION_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Minus Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_MINUS_OPERATION_COUNT = UNARY_MODIFICATION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.NegateImpl <em>Negate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.NegateImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getNegate()
	 * @generated
	 */
	int NEGATE = 34;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE__LAYOUT_INFORMATIONS = UNARY_OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Negate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE___GET_CONCRETE_CLASSIFIER__STRING = UNARY_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = UNARY_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = UNARY_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = UNARY_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE___GET_LIB_CLASS__STRING = UNARY_OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE___GET_LIB_INTERFACE__STRING = UNARY_OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE___GET_CLASS_CLASS = UNARY_OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE___GET_OBJECT_CLASS = UNARY_OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE___GET_STRING_CLASS = UNARY_OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE___GET_ANNOTATION_INTERFACE = UNARY_OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE___GET_CONTAINING_ANNOTATION_INSTANCE = UNARY_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE___GET_CONTAINING_ANONYMOUS_CLASS = UNARY_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE___GET_CONTAINING_CONCRETE_CLASSIFIER = UNARY_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE___GET_CONTAINING_COMPILATION_UNIT = UNARY_OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE___GET_CONTAINING_PACKAGE_NAME = UNARY_OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE___GET_PARENT_CONCRETE_CLASSIFIER = UNARY_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE___GET_PARENT_BY_ETYPE__ECLASS = UNARY_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = UNARY_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE___GET_PARENT_BY_TYPE__CLASS = UNARY_OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE___GET_FIRST_CHILD_BY_TYPE__CLASS = UNARY_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE___GET_CHILDREN_BY_ETYPE__ECLASS = UNARY_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE___GET_CHILDREN_BY_TYPE__CLASS = UNARY_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE___GET_COMMENTS = UNARY_OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = UNARY_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = UNARY_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Negate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE_OPERATION_COUNT = UNARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.PlusPlusImpl <em>Plus Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.PlusPlusImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getPlusPlus()
	 * @generated
	 */
	int PLUS_PLUS = 35;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_PLUS__LAYOUT_INFORMATIONS = UNARY_MODIFICATION_OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Plus Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_PLUS_FEATURE_COUNT = UNARY_MODIFICATION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_PLUS___GET_CONCRETE_CLASSIFIER__STRING = UNARY_MODIFICATION_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_PLUS___GET_CONCRETE_CLASSIFIER_PROXY__STRING = UNARY_MODIFICATION_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_PLUS___GET_CONCRETE_CLASSIFIERS__STRING_STRING = UNARY_MODIFICATION_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_PLUS___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = UNARY_MODIFICATION_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_PLUS___GET_LIB_CLASS__STRING = UNARY_MODIFICATION_OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_PLUS___GET_LIB_INTERFACE__STRING = UNARY_MODIFICATION_OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_PLUS___GET_CLASS_CLASS = UNARY_MODIFICATION_OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_PLUS___GET_OBJECT_CLASS = UNARY_MODIFICATION_OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_PLUS___GET_STRING_CLASS = UNARY_MODIFICATION_OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_PLUS___GET_ANNOTATION_INTERFACE = UNARY_MODIFICATION_OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_PLUS___GET_CONTAINING_ANNOTATION_INSTANCE = UNARY_MODIFICATION_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_PLUS___GET_CONTAINING_ANONYMOUS_CLASS = UNARY_MODIFICATION_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_PLUS___GET_CONTAINING_CONCRETE_CLASSIFIER = UNARY_MODIFICATION_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_PLUS___GET_CONTAINING_COMPILATION_UNIT = UNARY_MODIFICATION_OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_PLUS___GET_CONTAINING_PACKAGE_NAME = UNARY_MODIFICATION_OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_PLUS___GET_PARENT_CONCRETE_CLASSIFIER = UNARY_MODIFICATION_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_PLUS___GET_PARENT_BY_ETYPE__ECLASS = UNARY_MODIFICATION_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_PLUS___GET_FIRST_CHILD_BY_ETYPE__ECLASS = UNARY_MODIFICATION_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_PLUS___GET_PARENT_BY_TYPE__CLASS = UNARY_MODIFICATION_OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_PLUS___GET_FIRST_CHILD_BY_TYPE__CLASS = UNARY_MODIFICATION_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_PLUS___GET_CHILDREN_BY_ETYPE__ECLASS = UNARY_MODIFICATION_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_PLUS___GET_CHILDREN_BY_TYPE__CLASS = UNARY_MODIFICATION_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_PLUS___GET_COMMENTS = UNARY_MODIFICATION_OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_PLUS___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = UNARY_MODIFICATION_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_PLUS___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = UNARY_MODIFICATION_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Plus Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_PLUS_OPERATION_COUNT = UNARY_MODIFICATION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.LeftShiftImpl <em>Left Shift</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.LeftShiftImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getLeftShift()
	 * @generated
	 */
	int LEFT_SHIFT = 36;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHIFT__LAYOUT_INFORMATIONS = SHIFT_OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Left Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHIFT_FEATURE_COUNT = SHIFT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHIFT___GET_CONCRETE_CLASSIFIER__STRING = SHIFT_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHIFT___GET_CONCRETE_CLASSIFIER_PROXY__STRING = SHIFT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHIFT___GET_CONCRETE_CLASSIFIERS__STRING_STRING = SHIFT_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHIFT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = SHIFT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHIFT___GET_LIB_CLASS__STRING = SHIFT_OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHIFT___GET_LIB_INTERFACE__STRING = SHIFT_OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHIFT___GET_CLASS_CLASS = SHIFT_OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHIFT___GET_OBJECT_CLASS = SHIFT_OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHIFT___GET_STRING_CLASS = SHIFT_OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHIFT___GET_ANNOTATION_INTERFACE = SHIFT_OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHIFT___GET_CONTAINING_ANNOTATION_INSTANCE = SHIFT_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHIFT___GET_CONTAINING_ANONYMOUS_CLASS = SHIFT_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHIFT___GET_CONTAINING_CONCRETE_CLASSIFIER = SHIFT_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHIFT___GET_CONTAINING_COMPILATION_UNIT = SHIFT_OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHIFT___GET_CONTAINING_PACKAGE_NAME = SHIFT_OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHIFT___GET_PARENT_CONCRETE_CLASSIFIER = SHIFT_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHIFT___GET_PARENT_BY_ETYPE__ECLASS = SHIFT_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHIFT___GET_FIRST_CHILD_BY_ETYPE__ECLASS = SHIFT_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHIFT___GET_PARENT_BY_TYPE__CLASS = SHIFT_OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHIFT___GET_FIRST_CHILD_BY_TYPE__CLASS = SHIFT_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHIFT___GET_CHILDREN_BY_ETYPE__ECLASS = SHIFT_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHIFT___GET_CHILDREN_BY_TYPE__CLASS = SHIFT_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHIFT___GET_COMMENTS = SHIFT_OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHIFT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = SHIFT_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHIFT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = SHIFT_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Left Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHIFT_OPERATION_COUNT = SHIFT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.RightShiftImpl <em>Right Shift</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.RightShiftImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getRightShift()
	 * @generated
	 */
	int RIGHT_SHIFT = 37;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHIFT__LAYOUT_INFORMATIONS = SHIFT_OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Right Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHIFT_FEATURE_COUNT = SHIFT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHIFT___GET_CONCRETE_CLASSIFIER__STRING = SHIFT_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHIFT___GET_CONCRETE_CLASSIFIER_PROXY__STRING = SHIFT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHIFT___GET_CONCRETE_CLASSIFIERS__STRING_STRING = SHIFT_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHIFT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = SHIFT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHIFT___GET_LIB_CLASS__STRING = SHIFT_OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHIFT___GET_LIB_INTERFACE__STRING = SHIFT_OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHIFT___GET_CLASS_CLASS = SHIFT_OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHIFT___GET_OBJECT_CLASS = SHIFT_OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHIFT___GET_STRING_CLASS = SHIFT_OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHIFT___GET_ANNOTATION_INTERFACE = SHIFT_OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHIFT___GET_CONTAINING_ANNOTATION_INSTANCE = SHIFT_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHIFT___GET_CONTAINING_ANONYMOUS_CLASS = SHIFT_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHIFT___GET_CONTAINING_CONCRETE_CLASSIFIER = SHIFT_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHIFT___GET_CONTAINING_COMPILATION_UNIT = SHIFT_OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHIFT___GET_CONTAINING_PACKAGE_NAME = SHIFT_OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHIFT___GET_PARENT_CONCRETE_CLASSIFIER = SHIFT_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHIFT___GET_PARENT_BY_ETYPE__ECLASS = SHIFT_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHIFT___GET_FIRST_CHILD_BY_ETYPE__ECLASS = SHIFT_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHIFT___GET_PARENT_BY_TYPE__CLASS = SHIFT_OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHIFT___GET_FIRST_CHILD_BY_TYPE__CLASS = SHIFT_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHIFT___GET_CHILDREN_BY_ETYPE__ECLASS = SHIFT_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHIFT___GET_CHILDREN_BY_TYPE__CLASS = SHIFT_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHIFT___GET_COMMENTS = SHIFT_OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHIFT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = SHIFT_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHIFT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = SHIFT_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Right Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHIFT_OPERATION_COUNT = SHIFT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.operators.impl.UnsignedRightShiftImpl <em>Unsigned Right Shift</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.operators.impl.UnsignedRightShiftImpl
	 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getUnsignedRightShift()
	 * @generated
	 */
	int UNSIGNED_RIGHT_SHIFT = 38;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_RIGHT_SHIFT__LAYOUT_INFORMATIONS = SHIFT_OPERATOR__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Unsigned Right Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_RIGHT_SHIFT_FEATURE_COUNT = SHIFT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_RIGHT_SHIFT___GET_CONCRETE_CLASSIFIER__STRING = SHIFT_OPERATOR___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_RIGHT_SHIFT___GET_CONCRETE_CLASSIFIER_PROXY__STRING = SHIFT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_RIGHT_SHIFT___GET_CONCRETE_CLASSIFIERS__STRING_STRING = SHIFT_OPERATOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_RIGHT_SHIFT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = SHIFT_OPERATOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_RIGHT_SHIFT___GET_LIB_CLASS__STRING = SHIFT_OPERATOR___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_RIGHT_SHIFT___GET_LIB_INTERFACE__STRING = SHIFT_OPERATOR___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_RIGHT_SHIFT___GET_CLASS_CLASS = SHIFT_OPERATOR___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_RIGHT_SHIFT___GET_OBJECT_CLASS = SHIFT_OPERATOR___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_RIGHT_SHIFT___GET_STRING_CLASS = SHIFT_OPERATOR___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_RIGHT_SHIFT___GET_ANNOTATION_INTERFACE = SHIFT_OPERATOR___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_RIGHT_SHIFT___GET_CONTAINING_ANNOTATION_INSTANCE = SHIFT_OPERATOR___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_RIGHT_SHIFT___GET_CONTAINING_ANONYMOUS_CLASS = SHIFT_OPERATOR___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_RIGHT_SHIFT___GET_CONTAINING_CONCRETE_CLASSIFIER = SHIFT_OPERATOR___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_RIGHT_SHIFT___GET_CONTAINING_COMPILATION_UNIT = SHIFT_OPERATOR___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_RIGHT_SHIFT___GET_CONTAINING_PACKAGE_NAME = SHIFT_OPERATOR___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_RIGHT_SHIFT___GET_PARENT_CONCRETE_CLASSIFIER = SHIFT_OPERATOR___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_RIGHT_SHIFT___GET_PARENT_BY_ETYPE__ECLASS = SHIFT_OPERATOR___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_RIGHT_SHIFT___GET_FIRST_CHILD_BY_ETYPE__ECLASS = SHIFT_OPERATOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_RIGHT_SHIFT___GET_PARENT_BY_TYPE__CLASS = SHIFT_OPERATOR___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_RIGHT_SHIFT___GET_FIRST_CHILD_BY_TYPE__CLASS = SHIFT_OPERATOR___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_RIGHT_SHIFT___GET_CHILDREN_BY_ETYPE__ECLASS = SHIFT_OPERATOR___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_RIGHT_SHIFT___GET_CHILDREN_BY_TYPE__CLASS = SHIFT_OPERATOR___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_RIGHT_SHIFT___GET_COMMENTS = SHIFT_OPERATOR___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_RIGHT_SHIFT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = SHIFT_OPERATOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_RIGHT_SHIFT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = SHIFT_OPERATOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Unsigned Right Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_RIGHT_SHIFT_OPERATION_COUNT = SHIFT_OPERATOR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see de.silvawb.java.operators.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.AdditiveOperator <em>Additive Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additive Operator</em>'.
	 * @see de.silvawb.java.operators.AdditiveOperator
	 * @generated
	 */
	EClass getAdditiveOperator();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.AssignmentOperator <em>Assignment Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Operator</em>'.
	 * @see de.silvawb.java.operators.AssignmentOperator
	 * @generated
	 */
	EClass getAssignmentOperator();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.EqualityOperator <em>Equality Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equality Operator</em>'.
	 * @see de.silvawb.java.operators.EqualityOperator
	 * @generated
	 */
	EClass getEqualityOperator();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.MultiplicativeOperator <em>Multiplicative Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicative Operator</em>'.
	 * @see de.silvawb.java.operators.MultiplicativeOperator
	 * @generated
	 */
	EClass getMultiplicativeOperator();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.RelationOperator <em>Relation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Operator</em>'.
	 * @see de.silvawb.java.operators.RelationOperator
	 * @generated
	 */
	EClass getRelationOperator();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.ShiftOperator <em>Shift Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shift Operator</em>'.
	 * @see de.silvawb.java.operators.ShiftOperator
	 * @generated
	 */
	EClass getShiftOperator();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Operator</em>'.
	 * @see de.silvawb.java.operators.UnaryOperator
	 * @generated
	 */
	EClass getUnaryOperator();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.UnaryModificationOperator <em>Unary Modification Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Modification Operator</em>'.
	 * @see de.silvawb.java.operators.UnaryModificationOperator
	 * @generated
	 */
	EClass getUnaryModificationOperator();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see de.silvawb.java.operators.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.AssignmentAnd <em>Assignment And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment And</em>'.
	 * @see de.silvawb.java.operators.AssignmentAnd
	 * @generated
	 */
	EClass getAssignmentAnd();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.AssignmentDivision <em>Assignment Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Division</em>'.
	 * @see de.silvawb.java.operators.AssignmentDivision
	 * @generated
	 */
	EClass getAssignmentDivision();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.AssignmentExclusiveOr <em>Assignment Exclusive Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Exclusive Or</em>'.
	 * @see de.silvawb.java.operators.AssignmentExclusiveOr
	 * @generated
	 */
	EClass getAssignmentExclusiveOr();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.AssignmentMinus <em>Assignment Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Minus</em>'.
	 * @see de.silvawb.java.operators.AssignmentMinus
	 * @generated
	 */
	EClass getAssignmentMinus();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.AssignmentModulo <em>Assignment Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Modulo</em>'.
	 * @see de.silvawb.java.operators.AssignmentModulo
	 * @generated
	 */
	EClass getAssignmentModulo();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.AssignmentMultiplication <em>Assignment Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Multiplication</em>'.
	 * @see de.silvawb.java.operators.AssignmentMultiplication
	 * @generated
	 */
	EClass getAssignmentMultiplication();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.AssignmentLeftShift <em>Assignment Left Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Left Shift</em>'.
	 * @see de.silvawb.java.operators.AssignmentLeftShift
	 * @generated
	 */
	EClass getAssignmentLeftShift();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.AssignmentOr <em>Assignment Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Or</em>'.
	 * @see de.silvawb.java.operators.AssignmentOr
	 * @generated
	 */
	EClass getAssignmentOr();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.AssignmentPlus <em>Assignment Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Plus</em>'.
	 * @see de.silvawb.java.operators.AssignmentPlus
	 * @generated
	 */
	EClass getAssignmentPlus();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.AssignmentRightShift <em>Assignment Right Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Right Shift</em>'.
	 * @see de.silvawb.java.operators.AssignmentRightShift
	 * @generated
	 */
	EClass getAssignmentRightShift();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.AssignmentUnsignedRightShift <em>Assignment Unsigned Right Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Unsigned Right Shift</em>'.
	 * @see de.silvawb.java.operators.AssignmentUnsignedRightShift
	 * @generated
	 */
	EClass getAssignmentUnsignedRightShift();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.Equal <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal</em>'.
	 * @see de.silvawb.java.operators.Equal
	 * @generated
	 */
	EClass getEqual();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.NotEqual <em>Not Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Equal</em>'.
	 * @see de.silvawb.java.operators.NotEqual
	 * @generated
	 */
	EClass getNotEqual();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.GreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than</em>'.
	 * @see de.silvawb.java.operators.GreaterThan
	 * @generated
	 */
	EClass getGreaterThan();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.GreaterThanOrEqual <em>Greater Than Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than Or Equal</em>'.
	 * @see de.silvawb.java.operators.GreaterThanOrEqual
	 * @generated
	 */
	EClass getGreaterThanOrEqual();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.LessThan <em>Less Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than</em>'.
	 * @see de.silvawb.java.operators.LessThan
	 * @generated
	 */
	EClass getLessThan();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.LessThanOrEqual <em>Less Than Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than Or Equal</em>'.
	 * @see de.silvawb.java.operators.LessThanOrEqual
	 * @generated
	 */
	EClass getLessThanOrEqual();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.Addition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition</em>'.
	 * @see de.silvawb.java.operators.Addition
	 * @generated
	 */
	EClass getAddition();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.Subtraction <em>Subtraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtraction</em>'.
	 * @see de.silvawb.java.operators.Subtraction
	 * @generated
	 */
	EClass getSubtraction();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Division</em>'.
	 * @see de.silvawb.java.operators.Division
	 * @generated
	 */
	EClass getDivision();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.Multiplication <em>Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplication</em>'.
	 * @see de.silvawb.java.operators.Multiplication
	 * @generated
	 */
	EClass getMultiplication();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.Remainder <em>Remainder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remainder</em>'.
	 * @see de.silvawb.java.operators.Remainder
	 * @generated
	 */
	EClass getRemainder();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.Complement <em>Complement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complement</em>'.
	 * @see de.silvawb.java.operators.Complement
	 * @generated
	 */
	EClass getComplement();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.MinusMinus <em>Minus Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minus Minus</em>'.
	 * @see de.silvawb.java.operators.MinusMinus
	 * @generated
	 */
	EClass getMinusMinus();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.Negate <em>Negate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negate</em>'.
	 * @see de.silvawb.java.operators.Negate
	 * @generated
	 */
	EClass getNegate();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.PlusPlus <em>Plus Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus Plus</em>'.
	 * @see de.silvawb.java.operators.PlusPlus
	 * @generated
	 */
	EClass getPlusPlus();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.LeftShift <em>Left Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left Shift</em>'.
	 * @see de.silvawb.java.operators.LeftShift
	 * @generated
	 */
	EClass getLeftShift();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.RightShift <em>Right Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Shift</em>'.
	 * @see de.silvawb.java.operators.RightShift
	 * @generated
	 */
	EClass getRightShift();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.operators.UnsignedRightShift <em>Unsigned Right Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unsigned Right Shift</em>'.
	 * @see de.silvawb.java.operators.UnsignedRightShift
	 * @generated
	 */
	EClass getUnsignedRightShift();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OperatorsFactory getOperatorsFactory();

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
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.OperatorImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.AdditiveOperatorImpl <em>Additive Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.AdditiveOperatorImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getAdditiveOperator()
		 * @generated
		 */
		EClass ADDITIVE_OPERATOR = eINSTANCE.getAdditiveOperator();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.AssignmentOperatorImpl <em>Assignment Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.AssignmentOperatorImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getAssignmentOperator()
		 * @generated
		 */
		EClass ASSIGNMENT_OPERATOR = eINSTANCE.getAssignmentOperator();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.EqualityOperatorImpl <em>Equality Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.EqualityOperatorImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getEqualityOperator()
		 * @generated
		 */
		EClass EQUALITY_OPERATOR = eINSTANCE.getEqualityOperator();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.MultiplicativeOperatorImpl <em>Multiplicative Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.MultiplicativeOperatorImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getMultiplicativeOperator()
		 * @generated
		 */
		EClass MULTIPLICATIVE_OPERATOR = eINSTANCE.getMultiplicativeOperator();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.RelationOperatorImpl <em>Relation Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.RelationOperatorImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getRelationOperator()
		 * @generated
		 */
		EClass RELATION_OPERATOR = eINSTANCE.getRelationOperator();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.ShiftOperatorImpl <em>Shift Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.ShiftOperatorImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getShiftOperator()
		 * @generated
		 */
		EClass SHIFT_OPERATOR = eINSTANCE.getShiftOperator();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.UnaryOperatorImpl <em>Unary Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.UnaryOperatorImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getUnaryOperator()
		 * @generated
		 */
		EClass UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.UnaryModificationOperatorImpl <em>Unary Modification Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.UnaryModificationOperatorImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getUnaryModificationOperator()
		 * @generated
		 */
		EClass UNARY_MODIFICATION_OPERATOR = eINSTANCE.getUnaryModificationOperator();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.AssignmentImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.AssignmentAndImpl <em>Assignment And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.AssignmentAndImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getAssignmentAnd()
		 * @generated
		 */
		EClass ASSIGNMENT_AND = eINSTANCE.getAssignmentAnd();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.AssignmentDivisionImpl <em>Assignment Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.AssignmentDivisionImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getAssignmentDivision()
		 * @generated
		 */
		EClass ASSIGNMENT_DIVISION = eINSTANCE.getAssignmentDivision();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.AssignmentExclusiveOrImpl <em>Assignment Exclusive Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.AssignmentExclusiveOrImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getAssignmentExclusiveOr()
		 * @generated
		 */
		EClass ASSIGNMENT_EXCLUSIVE_OR = eINSTANCE.getAssignmentExclusiveOr();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.AssignmentMinusImpl <em>Assignment Minus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.AssignmentMinusImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getAssignmentMinus()
		 * @generated
		 */
		EClass ASSIGNMENT_MINUS = eINSTANCE.getAssignmentMinus();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.AssignmentModuloImpl <em>Assignment Modulo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.AssignmentModuloImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getAssignmentModulo()
		 * @generated
		 */
		EClass ASSIGNMENT_MODULO = eINSTANCE.getAssignmentModulo();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.AssignmentMultiplicationImpl <em>Assignment Multiplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.AssignmentMultiplicationImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getAssignmentMultiplication()
		 * @generated
		 */
		EClass ASSIGNMENT_MULTIPLICATION = eINSTANCE.getAssignmentMultiplication();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.AssignmentLeftShiftImpl <em>Assignment Left Shift</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.AssignmentLeftShiftImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getAssignmentLeftShift()
		 * @generated
		 */
		EClass ASSIGNMENT_LEFT_SHIFT = eINSTANCE.getAssignmentLeftShift();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.AssignmentOrImpl <em>Assignment Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.AssignmentOrImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getAssignmentOr()
		 * @generated
		 */
		EClass ASSIGNMENT_OR = eINSTANCE.getAssignmentOr();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.AssignmentPlusImpl <em>Assignment Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.AssignmentPlusImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getAssignmentPlus()
		 * @generated
		 */
		EClass ASSIGNMENT_PLUS = eINSTANCE.getAssignmentPlus();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.AssignmentRightShiftImpl <em>Assignment Right Shift</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.AssignmentRightShiftImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getAssignmentRightShift()
		 * @generated
		 */
		EClass ASSIGNMENT_RIGHT_SHIFT = eINSTANCE.getAssignmentRightShift();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.AssignmentUnsignedRightShiftImpl <em>Assignment Unsigned Right Shift</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.AssignmentUnsignedRightShiftImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getAssignmentUnsignedRightShift()
		 * @generated
		 */
		EClass ASSIGNMENT_UNSIGNED_RIGHT_SHIFT = eINSTANCE.getAssignmentUnsignedRightShift();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.EqualImpl <em>Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.EqualImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getEqual()
		 * @generated
		 */
		EClass EQUAL = eINSTANCE.getEqual();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.NotEqualImpl <em>Not Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.NotEqualImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getNotEqual()
		 * @generated
		 */
		EClass NOT_EQUAL = eINSTANCE.getNotEqual();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.GreaterThanImpl <em>Greater Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.GreaterThanImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getGreaterThan()
		 * @generated
		 */
		EClass GREATER_THAN = eINSTANCE.getGreaterThan();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.GreaterThanOrEqualImpl <em>Greater Than Or Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.GreaterThanOrEqualImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getGreaterThanOrEqual()
		 * @generated
		 */
		EClass GREATER_THAN_OR_EQUAL = eINSTANCE.getGreaterThanOrEqual();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.LessThanImpl <em>Less Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.LessThanImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getLessThan()
		 * @generated
		 */
		EClass LESS_THAN = eINSTANCE.getLessThan();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.LessThanOrEqualImpl <em>Less Than Or Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.LessThanOrEqualImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getLessThanOrEqual()
		 * @generated
		 */
		EClass LESS_THAN_OR_EQUAL = eINSTANCE.getLessThanOrEqual();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.AdditionImpl <em>Addition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.AdditionImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getAddition()
		 * @generated
		 */
		EClass ADDITION = eINSTANCE.getAddition();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.SubtractionImpl <em>Subtraction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.SubtractionImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getSubtraction()
		 * @generated
		 */
		EClass SUBTRACTION = eINSTANCE.getSubtraction();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.DivisionImpl <em>Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.DivisionImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getDivision()
		 * @generated
		 */
		EClass DIVISION = eINSTANCE.getDivision();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.MultiplicationImpl <em>Multiplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.MultiplicationImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getMultiplication()
		 * @generated
		 */
		EClass MULTIPLICATION = eINSTANCE.getMultiplication();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.RemainderImpl <em>Remainder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.RemainderImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getRemainder()
		 * @generated
		 */
		EClass REMAINDER = eINSTANCE.getRemainder();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.ComplementImpl <em>Complement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.ComplementImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getComplement()
		 * @generated
		 */
		EClass COMPLEMENT = eINSTANCE.getComplement();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.MinusMinusImpl <em>Minus Minus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.MinusMinusImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getMinusMinus()
		 * @generated
		 */
		EClass MINUS_MINUS = eINSTANCE.getMinusMinus();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.NegateImpl <em>Negate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.NegateImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getNegate()
		 * @generated
		 */
		EClass NEGATE = eINSTANCE.getNegate();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.PlusPlusImpl <em>Plus Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.PlusPlusImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getPlusPlus()
		 * @generated
		 */
		EClass PLUS_PLUS = eINSTANCE.getPlusPlus();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.LeftShiftImpl <em>Left Shift</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.LeftShiftImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getLeftShift()
		 * @generated
		 */
		EClass LEFT_SHIFT = eINSTANCE.getLeftShift();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.RightShiftImpl <em>Right Shift</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.RightShiftImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getRightShift()
		 * @generated
		 */
		EClass RIGHT_SHIFT = eINSTANCE.getRightShift();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.operators.impl.UnsignedRightShiftImpl <em>Unsigned Right Shift</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.operators.impl.UnsignedRightShiftImpl
		 * @see de.silvawb.java.operators.impl.OperatorsPackageImpl#getUnsignedRightShift()
		 * @generated
		 */
		EClass UNSIGNED_RIGHT_SHIFT = eINSTANCE.getUnsignedRightShift();

	}

} //OperatorsPackage
