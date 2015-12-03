/**
 */
package de.silvawb.java.modifiers;

import de.silvawb.java.commons.CommonsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see de.silvawb.java.modifiers.ModifiersFactory
 * @model kind="package"
 * @generated
 */
public interface ModifiersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modifiers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.emftext.org/java/modifiers";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modifiers";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModifiersPackage eINSTANCE = de.silvawb.java.modifiers.impl.ModifiersPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.silvawb.java.modifiers.impl.AnnotationInstanceOrModifierImpl <em>Annotation Instance Or Modifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.modifiers.impl.AnnotationInstanceOrModifierImpl
	 * @see de.silvawb.java.modifiers.impl.ModifiersPackageImpl#getAnnotationInstanceOrModifier()
	 * @generated
	 */
	int ANNOTATION_INSTANCE_OR_MODIFIER = 1;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_OR_MODIFIER__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Annotation Instance Or Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_OR_MODIFIER_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_OR_MODIFIER___GET_CONCRETE_CLASSIFIER__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_OR_MODIFIER___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_OR_MODIFIER___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_OR_MODIFIER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_OR_MODIFIER___GET_LIB_CLASS__STRING = CommonsPackage.COMMENTABLE___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_OR_MODIFIER___GET_LIB_INTERFACE__STRING = CommonsPackage.COMMENTABLE___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_OR_MODIFIER___GET_CLASS_CLASS = CommonsPackage.COMMENTABLE___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_OR_MODIFIER___GET_OBJECT_CLASS = CommonsPackage.COMMENTABLE___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_OR_MODIFIER___GET_STRING_CLASS = CommonsPackage.COMMENTABLE___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_OR_MODIFIER___GET_ANNOTATION_INTERFACE = CommonsPackage.COMMENTABLE___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_OR_MODIFIER___GET_CONTAINING_ANNOTATION_INSTANCE = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_OR_MODIFIER___GET_CONTAINING_ANONYMOUS_CLASS = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_OR_MODIFIER___GET_CONTAINING_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_OR_MODIFIER___GET_CONTAINING_COMPILATION_UNIT = CommonsPackage.COMMENTABLE___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_OR_MODIFIER___GET_CONTAINING_PACKAGE_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_OR_MODIFIER___GET_PARENT_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_OR_MODIFIER___GET_PARENT_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_OR_MODIFIER___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_OR_MODIFIER___GET_PARENT_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_OR_MODIFIER___GET_FIRST_CHILD_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_OR_MODIFIER___GET_CHILDREN_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_OR_MODIFIER___GET_CHILDREN_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_OR_MODIFIER___GET_COMMENTS = CommonsPackage.COMMENTABLE___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_OR_MODIFIER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_OR_MODIFIER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Annotation Instance Or Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_OR_MODIFIER_OPERATION_COUNT = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.modifiers.impl.ModifierImpl <em>Modifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.modifiers.impl.ModifierImpl
	 * @see de.silvawb.java.modifiers.impl.ModifiersPackageImpl#getModifier()
	 * @generated
	 */
	int MODIFIER = 0;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__LAYOUT_INFORMATIONS = ANNOTATION_INSTANCE_OR_MODIFIER__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_FEATURE_COUNT = ANNOTATION_INSTANCE_OR_MODIFIER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER___GET_CONCRETE_CLASSIFIER__STRING = ANNOTATION_INSTANCE_OR_MODIFIER___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ANNOTATION_INSTANCE_OR_MODIFIER___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ANNOTATION_INSTANCE_OR_MODIFIER___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ANNOTATION_INSTANCE_OR_MODIFIER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER___GET_LIB_CLASS__STRING = ANNOTATION_INSTANCE_OR_MODIFIER___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER___GET_LIB_INTERFACE__STRING = ANNOTATION_INSTANCE_OR_MODIFIER___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER___GET_CLASS_CLASS = ANNOTATION_INSTANCE_OR_MODIFIER___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER___GET_OBJECT_CLASS = ANNOTATION_INSTANCE_OR_MODIFIER___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER___GET_STRING_CLASS = ANNOTATION_INSTANCE_OR_MODIFIER___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER___GET_ANNOTATION_INTERFACE = ANNOTATION_INSTANCE_OR_MODIFIER___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER___GET_CONTAINING_ANNOTATION_INSTANCE = ANNOTATION_INSTANCE_OR_MODIFIER___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER___GET_CONTAINING_ANONYMOUS_CLASS = ANNOTATION_INSTANCE_OR_MODIFIER___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER___GET_CONTAINING_CONCRETE_CLASSIFIER = ANNOTATION_INSTANCE_OR_MODIFIER___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER___GET_CONTAINING_COMPILATION_UNIT = ANNOTATION_INSTANCE_OR_MODIFIER___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER___GET_CONTAINING_PACKAGE_NAME = ANNOTATION_INSTANCE_OR_MODIFIER___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER___GET_PARENT_CONCRETE_CLASSIFIER = ANNOTATION_INSTANCE_OR_MODIFIER___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER___GET_PARENT_BY_ETYPE__ECLASS = ANNOTATION_INSTANCE_OR_MODIFIER___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ANNOTATION_INSTANCE_OR_MODIFIER___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER___GET_PARENT_BY_TYPE__CLASS = ANNOTATION_INSTANCE_OR_MODIFIER___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER___GET_FIRST_CHILD_BY_TYPE__CLASS = ANNOTATION_INSTANCE_OR_MODIFIER___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER___GET_CHILDREN_BY_ETYPE__ECLASS = ANNOTATION_INSTANCE_OR_MODIFIER___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER___GET_CHILDREN_BY_TYPE__CLASS = ANNOTATION_INSTANCE_OR_MODIFIER___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER___GET_COMMENTS = ANNOTATION_INSTANCE_OR_MODIFIER___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ANNOTATION_INSTANCE_OR_MODIFIER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ANNOTATION_INSTANCE_OR_MODIFIER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_OPERATION_COUNT = ANNOTATION_INSTANCE_OR_MODIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.modifiers.impl.AnnotableAndModifiableImpl <em>Annotable And Modifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.modifiers.impl.AnnotableAndModifiableImpl
	 * @see de.silvawb.java.modifiers.impl.ModifiersPackageImpl#getAnnotableAndModifiable()
	 * @generated
	 */
	int ANNOTABLE_AND_MODIFIABLE = 2;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

	/**
	 * The feature id for the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Annotable And Modifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___GET_CONCRETE_CLASSIFIER__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___GET_LIB_CLASS__STRING = CommonsPackage.COMMENTABLE___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___GET_LIB_INTERFACE__STRING = CommonsPackage.COMMENTABLE___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___GET_CLASS_CLASS = CommonsPackage.COMMENTABLE___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___GET_OBJECT_CLASS = CommonsPackage.COMMENTABLE___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___GET_STRING_CLASS = CommonsPackage.COMMENTABLE___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___GET_ANNOTATION_INTERFACE = CommonsPackage.COMMENTABLE___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___GET_CONTAINING_ANNOTATION_INSTANCE = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___GET_CONTAINING_ANONYMOUS_CLASS = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___GET_CONTAINING_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___GET_CONTAINING_COMPILATION_UNIT = CommonsPackage.COMMENTABLE___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___GET_CONTAINING_PACKAGE_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___GET_PARENT_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___GET_PARENT_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___GET_PARENT_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___GET_FIRST_CHILD_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___GET_CHILDREN_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___GET_CHILDREN_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___GET_COMMENTS = CommonsPackage.COMMENTABLE___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Is Hidden</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___IS_HIDDEN__COMMENTABLE = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Static</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___IS_STATIC = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Remove Modifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___REMOVE_MODIFIER__CLASS = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Make Public</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___MAKE_PUBLIC = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Make Private</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___MAKE_PRIVATE = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Make Protected</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___MAKE_PROTECTED = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Modifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___GET_MODIFIERS = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Remove All Modifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___REMOVE_ALL_MODIFIERS = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Has Modifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___HAS_MODIFIER__CLASS = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Is Public</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___IS_PUBLIC = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Private</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___IS_PRIVATE = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Is Protected</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___IS_PROTECTED = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Add Modifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE___ADD_MODIFIER__MODIFIER = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 12;

	/**
	 * The number of operations of the '<em>Annotable And Modifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_AND_MODIFIABLE_OPERATION_COUNT = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link de.silvawb.java.modifiers.impl.ModifiableImpl <em>Modifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.modifiers.impl.ModifiableImpl
	 * @see de.silvawb.java.modifiers.impl.ModifiersPackageImpl#getModifiable()
	 * @generated
	 */
	int MODIFIABLE = 3;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE__MODIFIERS = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Modifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE___GET_CONCRETE_CLASSIFIER__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE___GET_LIB_CLASS__STRING = CommonsPackage.COMMENTABLE___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE___GET_LIB_INTERFACE__STRING = CommonsPackage.COMMENTABLE___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE___GET_CLASS_CLASS = CommonsPackage.COMMENTABLE___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE___GET_OBJECT_CLASS = CommonsPackage.COMMENTABLE___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE___GET_STRING_CLASS = CommonsPackage.COMMENTABLE___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE___GET_ANNOTATION_INTERFACE = CommonsPackage.COMMENTABLE___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE___GET_CONTAINING_ANNOTATION_INSTANCE = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE___GET_CONTAINING_ANONYMOUS_CLASS = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE___GET_CONTAINING_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE___GET_CONTAINING_COMPILATION_UNIT = CommonsPackage.COMMENTABLE___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE___GET_CONTAINING_PACKAGE_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE___GET_PARENT_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE___GET_PARENT_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE___GET_PARENT_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE___GET_FIRST_CHILD_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE___GET_CHILDREN_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE___GET_CHILDREN_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE___GET_COMMENTS = CommonsPackage.COMMENTABLE___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Modifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE_OPERATION_COUNT = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.modifiers.impl.AbstractImpl <em>Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.modifiers.impl.AbstractImpl
	 * @see de.silvawb.java.modifiers.impl.ModifiersPackageImpl#getAbstract()
	 * @generated
	 */
	int ABSTRACT = 4;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__LAYOUT_INFORMATIONS = MODIFIER__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT___GET_CONCRETE_CLASSIFIER__STRING = MODIFIER___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT___GET_CONCRETE_CLASSIFIER_PROXY__STRING = MODIFIER___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT___GET_CONCRETE_CLASSIFIERS__STRING_STRING = MODIFIER___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = MODIFIER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT___GET_LIB_CLASS__STRING = MODIFIER___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT___GET_LIB_INTERFACE__STRING = MODIFIER___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT___GET_CLASS_CLASS = MODIFIER___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT___GET_OBJECT_CLASS = MODIFIER___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT___GET_STRING_CLASS = MODIFIER___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT___GET_ANNOTATION_INTERFACE = MODIFIER___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT___GET_CONTAINING_ANNOTATION_INSTANCE = MODIFIER___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT___GET_CONTAINING_ANONYMOUS_CLASS = MODIFIER___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT___GET_CONTAINING_CONCRETE_CLASSIFIER = MODIFIER___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT___GET_CONTAINING_COMPILATION_UNIT = MODIFIER___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT___GET_CONTAINING_PACKAGE_NAME = MODIFIER___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT___GET_PARENT_CONCRETE_CLASSIFIER = MODIFIER___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT___GET_PARENT_BY_ETYPE__ECLASS = MODIFIER___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT___GET_FIRST_CHILD_BY_ETYPE__ECLASS = MODIFIER___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT___GET_PARENT_BY_TYPE__CLASS = MODIFIER___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT___GET_FIRST_CHILD_BY_TYPE__CLASS = MODIFIER___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT___GET_CHILDREN_BY_ETYPE__ECLASS = MODIFIER___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT___GET_CHILDREN_BY_TYPE__CLASS = MODIFIER___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT___GET_COMMENTS = MODIFIER___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = MODIFIER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = MODIFIER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPERATION_COUNT = MODIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.modifiers.impl.FinalImpl <em>Final</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.modifiers.impl.FinalImpl
	 * @see de.silvawb.java.modifiers.impl.ModifiersPackageImpl#getFinal()
	 * @generated
	 */
	int FINAL = 5;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__LAYOUT_INFORMATIONS = MODIFIER__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Final</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___GET_CONCRETE_CLASSIFIER__STRING = MODIFIER___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING = MODIFIER___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING = MODIFIER___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = MODIFIER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___GET_LIB_CLASS__STRING = MODIFIER___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___GET_LIB_INTERFACE__STRING = MODIFIER___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___GET_CLASS_CLASS = MODIFIER___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___GET_OBJECT_CLASS = MODIFIER___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___GET_STRING_CLASS = MODIFIER___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___GET_ANNOTATION_INTERFACE = MODIFIER___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___GET_CONTAINING_ANNOTATION_INSTANCE = MODIFIER___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___GET_CONTAINING_ANONYMOUS_CLASS = MODIFIER___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___GET_CONTAINING_CONCRETE_CLASSIFIER = MODIFIER___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___GET_CONTAINING_COMPILATION_UNIT = MODIFIER___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___GET_CONTAINING_PACKAGE_NAME = MODIFIER___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___GET_PARENT_CONCRETE_CLASSIFIER = MODIFIER___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___GET_PARENT_BY_ETYPE__ECLASS = MODIFIER___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS = MODIFIER___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___GET_PARENT_BY_TYPE__CLASS = MODIFIER___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___GET_FIRST_CHILD_BY_TYPE__CLASS = MODIFIER___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___GET_CHILDREN_BY_ETYPE__ECLASS = MODIFIER___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___GET_CHILDREN_BY_TYPE__CLASS = MODIFIER___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___GET_COMMENTS = MODIFIER___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = MODIFIER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = MODIFIER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Final</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_OPERATION_COUNT = MODIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.modifiers.impl.NativeImpl <em>Native</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.modifiers.impl.NativeImpl
	 * @see de.silvawb.java.modifiers.impl.ModifiersPackageImpl#getNative()
	 * @generated
	 */
	int NATIVE = 6;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE__LAYOUT_INFORMATIONS = MODIFIER__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Native</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE___GET_CONCRETE_CLASSIFIER__STRING = MODIFIER___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = MODIFIER___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = MODIFIER___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = MODIFIER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE___GET_LIB_CLASS__STRING = MODIFIER___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE___GET_LIB_INTERFACE__STRING = MODIFIER___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE___GET_CLASS_CLASS = MODIFIER___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE___GET_OBJECT_CLASS = MODIFIER___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE___GET_STRING_CLASS = MODIFIER___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE___GET_ANNOTATION_INTERFACE = MODIFIER___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE___GET_CONTAINING_ANNOTATION_INSTANCE = MODIFIER___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE___GET_CONTAINING_ANONYMOUS_CLASS = MODIFIER___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE___GET_CONTAINING_CONCRETE_CLASSIFIER = MODIFIER___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE___GET_CONTAINING_COMPILATION_UNIT = MODIFIER___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE___GET_CONTAINING_PACKAGE_NAME = MODIFIER___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE___GET_PARENT_CONCRETE_CLASSIFIER = MODIFIER___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE___GET_PARENT_BY_ETYPE__ECLASS = MODIFIER___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = MODIFIER___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE___GET_PARENT_BY_TYPE__CLASS = MODIFIER___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE___GET_FIRST_CHILD_BY_TYPE__CLASS = MODIFIER___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE___GET_CHILDREN_BY_ETYPE__ECLASS = MODIFIER___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE___GET_CHILDREN_BY_TYPE__CLASS = MODIFIER___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE___GET_COMMENTS = MODIFIER___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = MODIFIER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = MODIFIER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Native</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_OPERATION_COUNT = MODIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.modifiers.impl.ProtectedImpl <em>Protected</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.modifiers.impl.ProtectedImpl
	 * @see de.silvawb.java.modifiers.impl.ModifiersPackageImpl#getProtected()
	 * @generated
	 */
	int PROTECTED = 7;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED__LAYOUT_INFORMATIONS = MODIFIER__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Protected</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED___GET_CONCRETE_CLASSIFIER__STRING = MODIFIER___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED___GET_CONCRETE_CLASSIFIER_PROXY__STRING = MODIFIER___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED___GET_CONCRETE_CLASSIFIERS__STRING_STRING = MODIFIER___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = MODIFIER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED___GET_LIB_CLASS__STRING = MODIFIER___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED___GET_LIB_INTERFACE__STRING = MODIFIER___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED___GET_CLASS_CLASS = MODIFIER___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED___GET_OBJECT_CLASS = MODIFIER___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED___GET_STRING_CLASS = MODIFIER___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED___GET_ANNOTATION_INTERFACE = MODIFIER___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED___GET_CONTAINING_ANNOTATION_INSTANCE = MODIFIER___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED___GET_CONTAINING_ANONYMOUS_CLASS = MODIFIER___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED___GET_CONTAINING_CONCRETE_CLASSIFIER = MODIFIER___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED___GET_CONTAINING_COMPILATION_UNIT = MODIFIER___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED___GET_CONTAINING_PACKAGE_NAME = MODIFIER___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED___GET_PARENT_CONCRETE_CLASSIFIER = MODIFIER___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED___GET_PARENT_BY_ETYPE__ECLASS = MODIFIER___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED___GET_FIRST_CHILD_BY_ETYPE__ECLASS = MODIFIER___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED___GET_PARENT_BY_TYPE__CLASS = MODIFIER___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED___GET_FIRST_CHILD_BY_TYPE__CLASS = MODIFIER___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED___GET_CHILDREN_BY_ETYPE__ECLASS = MODIFIER___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED___GET_CHILDREN_BY_TYPE__CLASS = MODIFIER___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED___GET_COMMENTS = MODIFIER___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = MODIFIER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = MODIFIER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Protected</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_OPERATION_COUNT = MODIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.modifiers.impl.PublicImpl <em>Public</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.modifiers.impl.PublicImpl
	 * @see de.silvawb.java.modifiers.impl.ModifiersPackageImpl#getPublic()
	 * @generated
	 */
	int PUBLIC = 8;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC__LAYOUT_INFORMATIONS = MODIFIER__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Public</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC___GET_CONCRETE_CLASSIFIER__STRING = MODIFIER___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC___GET_CONCRETE_CLASSIFIER_PROXY__STRING = MODIFIER___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC___GET_CONCRETE_CLASSIFIERS__STRING_STRING = MODIFIER___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = MODIFIER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC___GET_LIB_CLASS__STRING = MODIFIER___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC___GET_LIB_INTERFACE__STRING = MODIFIER___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC___GET_CLASS_CLASS = MODIFIER___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC___GET_OBJECT_CLASS = MODIFIER___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC___GET_STRING_CLASS = MODIFIER___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC___GET_ANNOTATION_INTERFACE = MODIFIER___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC___GET_CONTAINING_ANNOTATION_INSTANCE = MODIFIER___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC___GET_CONTAINING_ANONYMOUS_CLASS = MODIFIER___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC___GET_CONTAINING_CONCRETE_CLASSIFIER = MODIFIER___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC___GET_CONTAINING_COMPILATION_UNIT = MODIFIER___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC___GET_CONTAINING_PACKAGE_NAME = MODIFIER___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC___GET_PARENT_CONCRETE_CLASSIFIER = MODIFIER___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC___GET_PARENT_BY_ETYPE__ECLASS = MODIFIER___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC___GET_FIRST_CHILD_BY_ETYPE__ECLASS = MODIFIER___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC___GET_PARENT_BY_TYPE__CLASS = MODIFIER___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC___GET_FIRST_CHILD_BY_TYPE__CLASS = MODIFIER___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC___GET_CHILDREN_BY_ETYPE__ECLASS = MODIFIER___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC___GET_CHILDREN_BY_TYPE__CLASS = MODIFIER___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC___GET_COMMENTS = MODIFIER___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = MODIFIER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = MODIFIER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Public</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_OPERATION_COUNT = MODIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.modifiers.impl.PrivateImpl <em>Private</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.modifiers.impl.PrivateImpl
	 * @see de.silvawb.java.modifiers.impl.ModifiersPackageImpl#getPrivate()
	 * @generated
	 */
	int PRIVATE = 9;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE__LAYOUT_INFORMATIONS = MODIFIER__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Private</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE___GET_CONCRETE_CLASSIFIER__STRING = MODIFIER___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = MODIFIER___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = MODIFIER___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = MODIFIER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE___GET_LIB_CLASS__STRING = MODIFIER___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE___GET_LIB_INTERFACE__STRING = MODIFIER___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE___GET_CLASS_CLASS = MODIFIER___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE___GET_OBJECT_CLASS = MODIFIER___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE___GET_STRING_CLASS = MODIFIER___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE___GET_ANNOTATION_INTERFACE = MODIFIER___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE___GET_CONTAINING_ANNOTATION_INSTANCE = MODIFIER___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE___GET_CONTAINING_ANONYMOUS_CLASS = MODIFIER___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE___GET_CONTAINING_CONCRETE_CLASSIFIER = MODIFIER___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE___GET_CONTAINING_COMPILATION_UNIT = MODIFIER___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE___GET_CONTAINING_PACKAGE_NAME = MODIFIER___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE___GET_PARENT_CONCRETE_CLASSIFIER = MODIFIER___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE___GET_PARENT_BY_ETYPE__ECLASS = MODIFIER___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = MODIFIER___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE___GET_PARENT_BY_TYPE__CLASS = MODIFIER___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE___GET_FIRST_CHILD_BY_TYPE__CLASS = MODIFIER___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE___GET_CHILDREN_BY_ETYPE__ECLASS = MODIFIER___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE___GET_CHILDREN_BY_TYPE__CLASS = MODIFIER___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE___GET_COMMENTS = MODIFIER___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = MODIFIER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = MODIFIER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Private</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_OPERATION_COUNT = MODIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.modifiers.impl.StaticImpl <em>Static</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.modifiers.impl.StaticImpl
	 * @see de.silvawb.java.modifiers.impl.ModifiersPackageImpl#getStatic()
	 * @generated
	 */
	int STATIC = 10;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC__LAYOUT_INFORMATIONS = MODIFIER__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Static</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC___GET_CONCRETE_CLASSIFIER__STRING = MODIFIER___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC___GET_CONCRETE_CLASSIFIER_PROXY__STRING = MODIFIER___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC___GET_CONCRETE_CLASSIFIERS__STRING_STRING = MODIFIER___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = MODIFIER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC___GET_LIB_CLASS__STRING = MODIFIER___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC___GET_LIB_INTERFACE__STRING = MODIFIER___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC___GET_CLASS_CLASS = MODIFIER___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC___GET_OBJECT_CLASS = MODIFIER___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC___GET_STRING_CLASS = MODIFIER___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC___GET_ANNOTATION_INTERFACE = MODIFIER___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC___GET_CONTAINING_ANNOTATION_INSTANCE = MODIFIER___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC___GET_CONTAINING_ANONYMOUS_CLASS = MODIFIER___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC___GET_CONTAINING_CONCRETE_CLASSIFIER = MODIFIER___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC___GET_CONTAINING_COMPILATION_UNIT = MODIFIER___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC___GET_CONTAINING_PACKAGE_NAME = MODIFIER___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC___GET_PARENT_CONCRETE_CLASSIFIER = MODIFIER___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC___GET_PARENT_BY_ETYPE__ECLASS = MODIFIER___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC___GET_FIRST_CHILD_BY_ETYPE__ECLASS = MODIFIER___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC___GET_PARENT_BY_TYPE__CLASS = MODIFIER___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC___GET_FIRST_CHILD_BY_TYPE__CLASS = MODIFIER___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC___GET_CHILDREN_BY_ETYPE__ECLASS = MODIFIER___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC___GET_CHILDREN_BY_TYPE__CLASS = MODIFIER___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC___GET_COMMENTS = MODIFIER___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = MODIFIER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = MODIFIER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Static</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_OPERATION_COUNT = MODIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.modifiers.impl.StrictfpImpl <em>Strictfp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.modifiers.impl.StrictfpImpl
	 * @see de.silvawb.java.modifiers.impl.ModifiersPackageImpl#getStrictfp()
	 * @generated
	 */
	int STRICTFP = 11;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTFP__LAYOUT_INFORMATIONS = MODIFIER__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Strictfp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTFP_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTFP___GET_CONCRETE_CLASSIFIER__STRING = MODIFIER___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTFP___GET_CONCRETE_CLASSIFIER_PROXY__STRING = MODIFIER___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTFP___GET_CONCRETE_CLASSIFIERS__STRING_STRING = MODIFIER___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTFP___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = MODIFIER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTFP___GET_LIB_CLASS__STRING = MODIFIER___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTFP___GET_LIB_INTERFACE__STRING = MODIFIER___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTFP___GET_CLASS_CLASS = MODIFIER___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTFP___GET_OBJECT_CLASS = MODIFIER___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTFP___GET_STRING_CLASS = MODIFIER___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTFP___GET_ANNOTATION_INTERFACE = MODIFIER___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTFP___GET_CONTAINING_ANNOTATION_INSTANCE = MODIFIER___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTFP___GET_CONTAINING_ANONYMOUS_CLASS = MODIFIER___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTFP___GET_CONTAINING_CONCRETE_CLASSIFIER = MODIFIER___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTFP___GET_CONTAINING_COMPILATION_UNIT = MODIFIER___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTFP___GET_CONTAINING_PACKAGE_NAME = MODIFIER___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTFP___GET_PARENT_CONCRETE_CLASSIFIER = MODIFIER___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTFP___GET_PARENT_BY_ETYPE__ECLASS = MODIFIER___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTFP___GET_FIRST_CHILD_BY_ETYPE__ECLASS = MODIFIER___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTFP___GET_PARENT_BY_TYPE__CLASS = MODIFIER___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTFP___GET_FIRST_CHILD_BY_TYPE__CLASS = MODIFIER___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTFP___GET_CHILDREN_BY_ETYPE__ECLASS = MODIFIER___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTFP___GET_CHILDREN_BY_TYPE__CLASS = MODIFIER___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTFP___GET_COMMENTS = MODIFIER___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTFP___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = MODIFIER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTFP___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = MODIFIER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Strictfp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICTFP_OPERATION_COUNT = MODIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.modifiers.impl.SynchronizedImpl <em>Synchronized</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.modifiers.impl.SynchronizedImpl
	 * @see de.silvawb.java.modifiers.impl.ModifiersPackageImpl#getSynchronized()
	 * @generated
	 */
	int SYNCHRONIZED = 12;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED__LAYOUT_INFORMATIONS = MODIFIER__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Synchronized</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED___GET_CONCRETE_CLASSIFIER__STRING = MODIFIER___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED___GET_CONCRETE_CLASSIFIER_PROXY__STRING = MODIFIER___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED___GET_CONCRETE_CLASSIFIERS__STRING_STRING = MODIFIER___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = MODIFIER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED___GET_LIB_CLASS__STRING = MODIFIER___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED___GET_LIB_INTERFACE__STRING = MODIFIER___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED___GET_CLASS_CLASS = MODIFIER___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED___GET_OBJECT_CLASS = MODIFIER___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED___GET_STRING_CLASS = MODIFIER___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED___GET_ANNOTATION_INTERFACE = MODIFIER___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED___GET_CONTAINING_ANNOTATION_INSTANCE = MODIFIER___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED___GET_CONTAINING_ANONYMOUS_CLASS = MODIFIER___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED___GET_CONTAINING_CONCRETE_CLASSIFIER = MODIFIER___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED___GET_CONTAINING_COMPILATION_UNIT = MODIFIER___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED___GET_CONTAINING_PACKAGE_NAME = MODIFIER___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED___GET_PARENT_CONCRETE_CLASSIFIER = MODIFIER___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED___GET_PARENT_BY_ETYPE__ECLASS = MODIFIER___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED___GET_FIRST_CHILD_BY_ETYPE__ECLASS = MODIFIER___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED___GET_PARENT_BY_TYPE__CLASS = MODIFIER___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED___GET_FIRST_CHILD_BY_TYPE__CLASS = MODIFIER___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED___GET_CHILDREN_BY_ETYPE__ECLASS = MODIFIER___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED___GET_CHILDREN_BY_TYPE__CLASS = MODIFIER___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED___GET_COMMENTS = MODIFIER___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = MODIFIER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = MODIFIER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Synchronized</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED_OPERATION_COUNT = MODIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.modifiers.impl.TransientImpl <em>Transient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.modifiers.impl.TransientImpl
	 * @see de.silvawb.java.modifiers.impl.ModifiersPackageImpl#getTransient()
	 * @generated
	 */
	int TRANSIENT = 13;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT__LAYOUT_INFORMATIONS = MODIFIER__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Transient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT___GET_CONCRETE_CLASSIFIER__STRING = MODIFIER___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT___GET_CONCRETE_CLASSIFIER_PROXY__STRING = MODIFIER___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT___GET_CONCRETE_CLASSIFIERS__STRING_STRING = MODIFIER___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = MODIFIER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT___GET_LIB_CLASS__STRING = MODIFIER___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT___GET_LIB_INTERFACE__STRING = MODIFIER___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT___GET_CLASS_CLASS = MODIFIER___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT___GET_OBJECT_CLASS = MODIFIER___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT___GET_STRING_CLASS = MODIFIER___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT___GET_ANNOTATION_INTERFACE = MODIFIER___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT___GET_CONTAINING_ANNOTATION_INSTANCE = MODIFIER___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT___GET_CONTAINING_ANONYMOUS_CLASS = MODIFIER___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT___GET_CONTAINING_CONCRETE_CLASSIFIER = MODIFIER___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT___GET_CONTAINING_COMPILATION_UNIT = MODIFIER___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT___GET_CONTAINING_PACKAGE_NAME = MODIFIER___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT___GET_PARENT_CONCRETE_CLASSIFIER = MODIFIER___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT___GET_PARENT_BY_ETYPE__ECLASS = MODIFIER___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT___GET_FIRST_CHILD_BY_ETYPE__ECLASS = MODIFIER___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT___GET_PARENT_BY_TYPE__CLASS = MODIFIER___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT___GET_FIRST_CHILD_BY_TYPE__CLASS = MODIFIER___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT___GET_CHILDREN_BY_ETYPE__ECLASS = MODIFIER___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT___GET_CHILDREN_BY_TYPE__CLASS = MODIFIER___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT___GET_COMMENTS = MODIFIER___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = MODIFIER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = MODIFIER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Transient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT_OPERATION_COUNT = MODIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.modifiers.impl.VolatileImpl <em>Volatile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.modifiers.impl.VolatileImpl
	 * @see de.silvawb.java.modifiers.impl.ModifiersPackageImpl#getVolatile()
	 * @generated
	 */
	int VOLATILE = 14;

	/**
	 * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLATILE__LAYOUT_INFORMATIONS = MODIFIER__LAYOUT_INFORMATIONS;

	/**
	 * The number of structural features of the '<em>Volatile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLATILE_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLATILE___GET_CONCRETE_CLASSIFIER__STRING = MODIFIER___GET_CONCRETE_CLASSIFIER__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLATILE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = MODIFIER___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLATILE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = MODIFIER___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLATILE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = MODIFIER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Lib Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLATILE___GET_LIB_CLASS__STRING = MODIFIER___GET_LIB_CLASS__STRING;

	/**
	 * The operation id for the '<em>Get Lib Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLATILE___GET_LIB_INTERFACE__STRING = MODIFIER___GET_LIB_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Get Class Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLATILE___GET_CLASS_CLASS = MODIFIER___GET_CLASS_CLASS;

	/**
	 * The operation id for the '<em>Get Object Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLATILE___GET_OBJECT_CLASS = MODIFIER___GET_OBJECT_CLASS;

	/**
	 * The operation id for the '<em>Get String Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLATILE___GET_STRING_CLASS = MODIFIER___GET_STRING_CLASS;

	/**
	 * The operation id for the '<em>Get Annotation Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLATILE___GET_ANNOTATION_INTERFACE = MODIFIER___GET_ANNOTATION_INTERFACE;

	/**
	 * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLATILE___GET_CONTAINING_ANNOTATION_INSTANCE = MODIFIER___GET_CONTAINING_ANNOTATION_INSTANCE;

	/**
	 * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLATILE___GET_CONTAINING_ANONYMOUS_CLASS = MODIFIER___GET_CONTAINING_ANONYMOUS_CLASS;

	/**
	 * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLATILE___GET_CONTAINING_CONCRETE_CLASSIFIER = MODIFIER___GET_CONTAINING_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLATILE___GET_CONTAINING_COMPILATION_UNIT = MODIFIER___GET_CONTAINING_COMPILATION_UNIT;

	/**
	 * The operation id for the '<em>Get Containing Package Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLATILE___GET_CONTAINING_PACKAGE_NAME = MODIFIER___GET_CONTAINING_PACKAGE_NAME;

	/**
	 * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLATILE___GET_PARENT_CONCRETE_CLASSIFIER = MODIFIER___GET_PARENT_CONCRETE_CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Parent By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLATILE___GET_PARENT_BY_ETYPE__ECLASS = MODIFIER___GET_PARENT_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get First Child By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLATILE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = MODIFIER___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Parent By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLATILE___GET_PARENT_BY_TYPE__CLASS = MODIFIER___GET_PARENT_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get First Child By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLATILE___GET_FIRST_CHILD_BY_TYPE__CLASS = MODIFIER___GET_FIRST_CHILD_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Children By EType</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLATILE___GET_CHILDREN_BY_ETYPE__ECLASS = MODIFIER___GET_CHILDREN_BY_ETYPE__ECLASS;

	/**
	 * The operation id for the '<em>Get Children By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLATILE___GET_CHILDREN_BY_TYPE__CLASS = MODIFIER___GET_CHILDREN_BY_TYPE__CLASS;

	/**
	 * The operation id for the '<em>Get Comments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLATILE___GET_COMMENTS = MODIFIER___GET_COMMENTS;

	/**
	 * The operation id for the '<em>Add Before Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLATILE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = MODIFIER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The operation id for the '<em>Add After Containing Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLATILE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = MODIFIER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

	/**
	 * The number of operations of the '<em>Volatile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLATILE_OPERATION_COUNT = MODIFIER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.silvawb.java.modifiers.Modifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modifier</em>'.
	 * @see de.silvawb.java.modifiers.Modifier
	 * @generated
	 */
	EClass getModifier();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.modifiers.AnnotationInstanceOrModifier <em>Annotation Instance Or Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Instance Or Modifier</em>'.
	 * @see de.silvawb.java.modifiers.AnnotationInstanceOrModifier
	 * @generated
	 */
	EClass getAnnotationInstanceOrModifier();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.modifiers.AnnotableAndModifiable <em>Annotable And Modifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotable And Modifiable</em>'.
	 * @see de.silvawb.java.modifiers.AnnotableAndModifiable
	 * @generated
	 */
	EClass getAnnotableAndModifiable();

	/**
	 * Returns the meta object for the containment reference list '{@link de.silvawb.java.modifiers.AnnotableAndModifiable#getAnnotationsAndModifiers <em>Annotations And Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations And Modifiers</em>'.
	 * @see de.silvawb.java.modifiers.AnnotableAndModifiable#getAnnotationsAndModifiers()
	 * @see #getAnnotableAndModifiable()
	 * @generated
	 */
	EReference getAnnotableAndModifiable_AnnotationsAndModifiers();

	/**
	 * Returns the meta object for the '{@link de.silvawb.java.modifiers.AnnotableAndModifiable#isHidden(de.silvawb.java.commons.Commentable) <em>Is Hidden</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Hidden</em>' operation.
	 * @see de.silvawb.java.modifiers.AnnotableAndModifiable#isHidden(de.silvawb.java.commons.Commentable)
	 * @generated
	 */
	EOperation getAnnotableAndModifiable__IsHidden__Commentable();

	/**
	 * Returns the meta object for the '{@link de.silvawb.java.modifiers.AnnotableAndModifiable#isStatic() <em>Is Static</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Static</em>' operation.
	 * @see de.silvawb.java.modifiers.AnnotableAndModifiable#isStatic()
	 * @generated
	 */
	EOperation getAnnotableAndModifiable__IsStatic();

	/**
	 * Returns the meta object for the '{@link de.silvawb.java.modifiers.AnnotableAndModifiable#removeModifier(java.lang.Class) <em>Remove Modifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Modifier</em>' operation.
	 * @see de.silvawb.java.modifiers.AnnotableAndModifiable#removeModifier(java.lang.Class)
	 * @generated
	 */
	EOperation getAnnotableAndModifiable__RemoveModifier__Class();

	/**
	 * Returns the meta object for the '{@link de.silvawb.java.modifiers.AnnotableAndModifiable#makePublic() <em>Make Public</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Public</em>' operation.
	 * @see de.silvawb.java.modifiers.AnnotableAndModifiable#makePublic()
	 * @generated
	 */
	EOperation getAnnotableAndModifiable__MakePublic();

	/**
	 * Returns the meta object for the '{@link de.silvawb.java.modifiers.AnnotableAndModifiable#makePrivate() <em>Make Private</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Private</em>' operation.
	 * @see de.silvawb.java.modifiers.AnnotableAndModifiable#makePrivate()
	 * @generated
	 */
	EOperation getAnnotableAndModifiable__MakePrivate();

	/**
	 * Returns the meta object for the '{@link de.silvawb.java.modifiers.AnnotableAndModifiable#makeProtected() <em>Make Protected</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Protected</em>' operation.
	 * @see de.silvawb.java.modifiers.AnnotableAndModifiable#makeProtected()
	 * @generated
	 */
	EOperation getAnnotableAndModifiable__MakeProtected();

	/**
	 * Returns the meta object for the '{@link de.silvawb.java.modifiers.AnnotableAndModifiable#getModifiers() <em>Get Modifiers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Modifiers</em>' operation.
	 * @see de.silvawb.java.modifiers.AnnotableAndModifiable#getModifiers()
	 * @generated
	 */
	EOperation getAnnotableAndModifiable__GetModifiers();

	/**
	 * Returns the meta object for the '{@link de.silvawb.java.modifiers.AnnotableAndModifiable#removeAllModifiers() <em>Remove All Modifiers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove All Modifiers</em>' operation.
	 * @see de.silvawb.java.modifiers.AnnotableAndModifiable#removeAllModifiers()
	 * @generated
	 */
	EOperation getAnnotableAndModifiable__RemoveAllModifiers();

	/**
	 * Returns the meta object for the '{@link de.silvawb.java.modifiers.AnnotableAndModifiable#hasModifier(java.lang.Class) <em>Has Modifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Modifier</em>' operation.
	 * @see de.silvawb.java.modifiers.AnnotableAndModifiable#hasModifier(java.lang.Class)
	 * @generated
	 */
	EOperation getAnnotableAndModifiable__HasModifier__Class();

	/**
	 * Returns the meta object for the '{@link de.silvawb.java.modifiers.AnnotableAndModifiable#isPublic() <em>Is Public</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Public</em>' operation.
	 * @see de.silvawb.java.modifiers.AnnotableAndModifiable#isPublic()
	 * @generated
	 */
	EOperation getAnnotableAndModifiable__IsPublic();

	/**
	 * Returns the meta object for the '{@link de.silvawb.java.modifiers.AnnotableAndModifiable#isPrivate() <em>Is Private</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Private</em>' operation.
	 * @see de.silvawb.java.modifiers.AnnotableAndModifiable#isPrivate()
	 * @generated
	 */
	EOperation getAnnotableAndModifiable__IsPrivate();

	/**
	 * Returns the meta object for the '{@link de.silvawb.java.modifiers.AnnotableAndModifiable#isProtected() <em>Is Protected</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Protected</em>' operation.
	 * @see de.silvawb.java.modifiers.AnnotableAndModifiable#isProtected()
	 * @generated
	 */
	EOperation getAnnotableAndModifiable__IsProtected();

	/**
	 * Returns the meta object for the '{@link de.silvawb.java.modifiers.AnnotableAndModifiable#addModifier(de.silvawb.java.modifiers.Modifier) <em>Add Modifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Modifier</em>' operation.
	 * @see de.silvawb.java.modifiers.AnnotableAndModifiable#addModifier(de.silvawb.java.modifiers.Modifier)
	 * @generated
	 */
	EOperation getAnnotableAndModifiable__AddModifier__Modifier();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.modifiers.Modifiable <em>Modifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modifiable</em>'.
	 * @see de.silvawb.java.modifiers.Modifiable
	 * @generated
	 */
	EClass getModifiable();

	/**
	 * Returns the meta object for the containment reference list '{@link de.silvawb.java.modifiers.Modifiable#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modifiers</em>'.
	 * @see de.silvawb.java.modifiers.Modifiable#getModifiers()
	 * @see #getModifiable()
	 * @generated
	 */
	EReference getModifiable_Modifiers();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.modifiers.Abstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract</em>'.
	 * @see de.silvawb.java.modifiers.Abstract
	 * @generated
	 */
	EClass getAbstract();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.modifiers.Final <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final</em>'.
	 * @see de.silvawb.java.modifiers.Final
	 * @generated
	 */
	EClass getFinal();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.modifiers.Native <em>Native</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Native</em>'.
	 * @see de.silvawb.java.modifiers.Native
	 * @generated
	 */
	EClass getNative();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.modifiers.Protected <em>Protected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protected</em>'.
	 * @see de.silvawb.java.modifiers.Protected
	 * @generated
	 */
	EClass getProtected();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.modifiers.Public <em>Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public</em>'.
	 * @see de.silvawb.java.modifiers.Public
	 * @generated
	 */
	EClass getPublic();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.modifiers.Private <em>Private</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Private</em>'.
	 * @see de.silvawb.java.modifiers.Private
	 * @generated
	 */
	EClass getPrivate();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.modifiers.Static <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static</em>'.
	 * @see de.silvawb.java.modifiers.Static
	 * @generated
	 */
	EClass getStatic();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.modifiers.Strictfp <em>Strictfp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strictfp</em>'.
	 * @see de.silvawb.java.modifiers.Strictfp
	 * @generated
	 */
	EClass getStrictfp();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.modifiers.Synchronized <em>Synchronized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronized</em>'.
	 * @see de.silvawb.java.modifiers.Synchronized
	 * @generated
	 */
	EClass getSynchronized();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.modifiers.Transient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transient</em>'.
	 * @see de.silvawb.java.modifiers.Transient
	 * @generated
	 */
	EClass getTransient();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.modifiers.Volatile <em>Volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volatile</em>'.
	 * @see de.silvawb.java.modifiers.Volatile
	 * @generated
	 */
	EClass getVolatile();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModifiersFactory getModifiersFactory();

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
		 * The meta object literal for the '{@link de.silvawb.java.modifiers.impl.ModifierImpl <em>Modifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.modifiers.impl.ModifierImpl
		 * @see de.silvawb.java.modifiers.impl.ModifiersPackageImpl#getModifier()
		 * @generated
		 */
		EClass MODIFIER = eINSTANCE.getModifier();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.modifiers.impl.AnnotationInstanceOrModifierImpl <em>Annotation Instance Or Modifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.modifiers.impl.AnnotationInstanceOrModifierImpl
		 * @see de.silvawb.java.modifiers.impl.ModifiersPackageImpl#getAnnotationInstanceOrModifier()
		 * @generated
		 */
		EClass ANNOTATION_INSTANCE_OR_MODIFIER = eINSTANCE.getAnnotationInstanceOrModifier();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.modifiers.impl.AnnotableAndModifiableImpl <em>Annotable And Modifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.modifiers.impl.AnnotableAndModifiableImpl
		 * @see de.silvawb.java.modifiers.impl.ModifiersPackageImpl#getAnnotableAndModifiable()
		 * @generated
		 */
		EClass ANNOTABLE_AND_MODIFIABLE = eINSTANCE.getAnnotableAndModifiable();

		/**
		 * The meta object literal for the '<em><b>Annotations And Modifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS = eINSTANCE.getAnnotableAndModifiable_AnnotationsAndModifiers();

		/**
		 * The meta object literal for the '<em><b>Is Hidden</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANNOTABLE_AND_MODIFIABLE___IS_HIDDEN__COMMENTABLE = eINSTANCE.getAnnotableAndModifiable__IsHidden__Commentable();

		/**
		 * The meta object literal for the '<em><b>Is Static</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANNOTABLE_AND_MODIFIABLE___IS_STATIC = eINSTANCE.getAnnotableAndModifiable__IsStatic();

		/**
		 * The meta object literal for the '<em><b>Remove Modifier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANNOTABLE_AND_MODIFIABLE___REMOVE_MODIFIER__CLASS = eINSTANCE.getAnnotableAndModifiable__RemoveModifier__Class();

		/**
		 * The meta object literal for the '<em><b>Make Public</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANNOTABLE_AND_MODIFIABLE___MAKE_PUBLIC = eINSTANCE.getAnnotableAndModifiable__MakePublic();

		/**
		 * The meta object literal for the '<em><b>Make Private</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANNOTABLE_AND_MODIFIABLE___MAKE_PRIVATE = eINSTANCE.getAnnotableAndModifiable__MakePrivate();

		/**
		 * The meta object literal for the '<em><b>Make Protected</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANNOTABLE_AND_MODIFIABLE___MAKE_PROTECTED = eINSTANCE.getAnnotableAndModifiable__MakeProtected();

		/**
		 * The meta object literal for the '<em><b>Get Modifiers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANNOTABLE_AND_MODIFIABLE___GET_MODIFIERS = eINSTANCE.getAnnotableAndModifiable__GetModifiers();

		/**
		 * The meta object literal for the '<em><b>Remove All Modifiers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANNOTABLE_AND_MODIFIABLE___REMOVE_ALL_MODIFIERS = eINSTANCE.getAnnotableAndModifiable__RemoveAllModifiers();

		/**
		 * The meta object literal for the '<em><b>Has Modifier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANNOTABLE_AND_MODIFIABLE___HAS_MODIFIER__CLASS = eINSTANCE.getAnnotableAndModifiable__HasModifier__Class();

		/**
		 * The meta object literal for the '<em><b>Is Public</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANNOTABLE_AND_MODIFIABLE___IS_PUBLIC = eINSTANCE.getAnnotableAndModifiable__IsPublic();

		/**
		 * The meta object literal for the '<em><b>Is Private</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANNOTABLE_AND_MODIFIABLE___IS_PRIVATE = eINSTANCE.getAnnotableAndModifiable__IsPrivate();

		/**
		 * The meta object literal for the '<em><b>Is Protected</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANNOTABLE_AND_MODIFIABLE___IS_PROTECTED = eINSTANCE.getAnnotableAndModifiable__IsProtected();

		/**
		 * The meta object literal for the '<em><b>Add Modifier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANNOTABLE_AND_MODIFIABLE___ADD_MODIFIER__MODIFIER = eINSTANCE.getAnnotableAndModifiable__AddModifier__Modifier();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.modifiers.impl.ModifiableImpl <em>Modifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.modifiers.impl.ModifiableImpl
		 * @see de.silvawb.java.modifiers.impl.ModifiersPackageImpl#getModifiable()
		 * @generated
		 */
		EClass MODIFIABLE = eINSTANCE.getModifiable();

		/**
		 * The meta object literal for the '<em><b>Modifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIABLE__MODIFIERS = eINSTANCE.getModifiable_Modifiers();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.modifiers.impl.AbstractImpl <em>Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.modifiers.impl.AbstractImpl
		 * @see de.silvawb.java.modifiers.impl.ModifiersPackageImpl#getAbstract()
		 * @generated
		 */
		EClass ABSTRACT = eINSTANCE.getAbstract();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.modifiers.impl.FinalImpl <em>Final</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.modifiers.impl.FinalImpl
		 * @see de.silvawb.java.modifiers.impl.ModifiersPackageImpl#getFinal()
		 * @generated
		 */
		EClass FINAL = eINSTANCE.getFinal();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.modifiers.impl.NativeImpl <em>Native</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.modifiers.impl.NativeImpl
		 * @see de.silvawb.java.modifiers.impl.ModifiersPackageImpl#getNative()
		 * @generated
		 */
		EClass NATIVE = eINSTANCE.getNative();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.modifiers.impl.ProtectedImpl <em>Protected</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.modifiers.impl.ProtectedImpl
		 * @see de.silvawb.java.modifiers.impl.ModifiersPackageImpl#getProtected()
		 * @generated
		 */
		EClass PROTECTED = eINSTANCE.getProtected();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.modifiers.impl.PublicImpl <em>Public</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.modifiers.impl.PublicImpl
		 * @see de.silvawb.java.modifiers.impl.ModifiersPackageImpl#getPublic()
		 * @generated
		 */
		EClass PUBLIC = eINSTANCE.getPublic();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.modifiers.impl.PrivateImpl <em>Private</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.modifiers.impl.PrivateImpl
		 * @see de.silvawb.java.modifiers.impl.ModifiersPackageImpl#getPrivate()
		 * @generated
		 */
		EClass PRIVATE = eINSTANCE.getPrivate();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.modifiers.impl.StaticImpl <em>Static</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.modifiers.impl.StaticImpl
		 * @see de.silvawb.java.modifiers.impl.ModifiersPackageImpl#getStatic()
		 * @generated
		 */
		EClass STATIC = eINSTANCE.getStatic();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.modifiers.impl.StrictfpImpl <em>Strictfp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.modifiers.impl.StrictfpImpl
		 * @see de.silvawb.java.modifiers.impl.ModifiersPackageImpl#getStrictfp()
		 * @generated
		 */
		EClass STRICTFP = eINSTANCE.getStrictfp();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.modifiers.impl.SynchronizedImpl <em>Synchronized</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.modifiers.impl.SynchronizedImpl
		 * @see de.silvawb.java.modifiers.impl.ModifiersPackageImpl#getSynchronized()
		 * @generated
		 */
		EClass SYNCHRONIZED = eINSTANCE.getSynchronized();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.modifiers.impl.TransientImpl <em>Transient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.modifiers.impl.TransientImpl
		 * @see de.silvawb.java.modifiers.impl.ModifiersPackageImpl#getTransient()
		 * @generated
		 */
		EClass TRANSIENT = eINSTANCE.getTransient();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.modifiers.impl.VolatileImpl <em>Volatile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.modifiers.impl.VolatileImpl
		 * @see de.silvawb.java.modifiers.impl.ModifiersPackageImpl#getVolatile()
		 * @generated
		 */
		EClass VOLATILE = eINSTANCE.getVolatile();

	}

} //ModifiersPackage
