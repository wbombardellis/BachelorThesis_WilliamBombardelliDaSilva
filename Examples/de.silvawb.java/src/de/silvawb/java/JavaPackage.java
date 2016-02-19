/**
 */
package de.silvawb.java;

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
 * @see de.silvawb.java.JavaFactory
 * @model kind="package"
 * @generated
 */
public interface JavaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "java";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tu-berlin.de/silvawb/java";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.silvawb.java";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaPackage eINSTANCE = de.silvawb.java.impl.JavaPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.silvawb.java.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.impl.SystemImpl
	 * @see de.silvawb.java.impl.JavaPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PACKAGES = 1;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link de.silvawb.java.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.impl.ContainerImpl
	 * @see de.silvawb.java.impl.JavaPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 14;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTAINED_ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.impl.PackageImpl
	 * @see de.silvawb.java.impl.JavaPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CONTAINED_ELEMENTS = CONTAINER__CONTAINED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SYSTEM = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.impl.ClassifierImpl
	 * @see de.silvawb.java.impl.JavaPackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 5;

	/**
	 * The meta object id for the '{@link de.silvawb.java.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.impl.ClassImpl
	 * @see de.silvawb.java.impl.JavaPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 2;

	/**
	 * The meta object id for the '{@link de.silvawb.java.impl.InterfaceImplementationImpl <em>Interface Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.impl.InterfaceImplementationImpl
	 * @see de.silvawb.java.impl.JavaPackageImpl#getInterfaceImplementation()
	 * @generated
	 */
	int INTERFACE_IMPLEMENTATION = 3;

	/**
	 * The meta object id for the '{@link de.silvawb.java.impl.ContainedImpl <em>Contained</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.impl.ContainedImpl
	 * @see de.silvawb.java.impl.JavaPackageImpl#getContained()
	 * @generated
	 */
	int CONTAINED = 8;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED__VISIBILITY = 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED__CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Importing Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED__IMPORTING_CLASSES = 2;

	/**
	 * The number of structural features of the '<em>Contained</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Contained</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__VISIBILITY = CONTAINED__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__CONTAINER = CONTAINED__CONTAINER;

	/**
	 * The feature id for the '<em><b>Importing Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__IMPORTING_CLASSES = CONTAINED__IMPORTING_CLASSES;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__CONTAINED_ELEMENTS = CONTAINED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotation Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__ANNOTATION_INSTANCES = CONTAINED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__NAME = CONTAINED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generic Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__GENERIC_BINDINGS = CONTAINED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__FIELDS = CONTAINED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__METHODS = CONTAINED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Interface Implementations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__INTERFACE_IMPLEMENTATIONS = CONTAINED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__GENERALIZATION = CONTAINED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__IMPORTS = CONTAINED_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = CONTAINED_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_OPERATION_COUNT = CONTAINED_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__VISIBILITY = CLASSIFIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CONTAINER = CLASSIFIER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Importing Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IMPORTING_CLASSES = CLASSIFIER__IMPORTING_CLASSES;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CONTAINED_ELEMENTS = CLASSIFIER__CONTAINED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotation Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ANNOTATION_INSTANCES = CLASSIFIER__ANNOTATION_INSTANCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Generic Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__GENERIC_BINDINGS = CLASSIFIER__GENERIC_BINDINGS;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FIELDS = CLASSIFIER__FIELDS;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__METHODS = CLASSIFIER__METHODS;

	/**
	 * The feature id for the '<em><b>Interface Implementations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__INTERFACE_IMPLEMENTATIONS = CLASSIFIER__INTERFACE_IMPLEMENTATIONS;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__GENERALIZATION = CLASSIFIER__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IMPORTS = CLASSIFIER__IMPORTS;

	/**
	 * The feature id for the '<em><b>Extended Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__EXTENDED_CLASS = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extending Classes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__EXTENDING_CLASSES = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_ABSTRACT = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_FINAL = CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_STATIC = CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_IMPLEMENTATION__INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Implementer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_IMPLEMENTATION__IMPLEMENTER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_IMPLEMENTATION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Interface Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_IMPLEMENTATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Interface Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_IMPLEMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.impl.GeneralizationImpl <em>Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.impl.GeneralizationImpl
	 * @see de.silvawb.java.impl.JavaPackageImpl#getGeneralization()
	 * @generated
	 */
	int GENERALIZATION = 4;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__GENERAL = 0;

	/**
	 * The feature id for the '<em><b>Generalizator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__GENERALIZATOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.impl.FieldImpl
	 * @see de.silvawb.java.impl.JavaPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 6;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__VISIBILITY = CONTAINED__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__CONTAINER = CONTAINED__CONTAINER;

	/**
	 * The feature id for the '<em><b>Importing Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__IMPORTING_CLASSES = CONTAINED__IMPORTING_CLASSES;

	/**
	 * The feature id for the '<em><b>Annotation Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ANNOTATION_INSTANCES = CONTAINED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = CONTAINED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = CONTAINED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Containing Classifier</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__CONTAINING_CLASSIFIER = CONTAINED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DEFAULT = CONTAINED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__IS_STATIC = CONTAINED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__IS_FINAL = CONTAINED_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = CONTAINED_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = CONTAINED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.impl.ImportImpl
	 * @see de.silvawb.java.impl.JavaPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 7;

	/**
	 * The feature id for the '<em><b>Imported</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORTED = 0;

	/**
	 * The feature id for the '<em><b>Importing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORTING = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.impl.MethodImpl
	 * @see de.silvawb.java.impl.JavaPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 9;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__VISIBILITY = CONTAINED__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CONTAINER = CONTAINED__CONTAINER;

	/**
	 * The feature id for the '<em><b>Importing Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IMPORTING_CLASSES = CONTAINED__IMPORTING_CLASSES;

	/**
	 * The feature id for the '<em><b>Annotation Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ANNOTATION_INSTANCES = CONTAINED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = CONTAINED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RETURN_TYPE = CONTAINED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ARGUMENTS = CONTAINED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Containing Classifier</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CONTAINING_CLASSIFIER = CONTAINED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_FINAL = CONTAINED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_STATIC = CONTAINED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Concurrency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CONCURRENCY = CONTAINED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Raised Exceptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RAISED_EXCEPTIONS = CONTAINED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__BODY = CONTAINED_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = CONTAINED_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = CONTAINED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.impl.StatementImpl
	 * @see de.silvawb.java.impl.JavaPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 10;

	/**
	 * The feature id for the '<em><b>Method</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__METHOD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.impl.AssertStatementImpl <em>Assert Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.impl.AssertStatementImpl
	 * @see de.silvawb.java.impl.JavaPackageImpl#getAssertStatement()
	 * @generated
	 */
	int ASSERT_STATEMENT = 11;

	/**
	 * The feature id for the '<em><b>Method</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_STATEMENT__METHOD = STATEMENT__METHOD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_STATEMENT__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_STATEMENT__ASSERTION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assert Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Assert Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.impl.GETExpressionImpl <em>GET Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.impl.GETExpressionImpl
	 * @see de.silvawb.java.impl.JavaPackageImpl#getGETExpression()
	 * @generated
	 */
	int GET_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Right Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_EXPRESSION__RIGHT_SIDE = 0;

	/**
	 * The feature id for the '<em><b>Container Statement</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_EXPRESSION__CONTAINER_STATEMENT = 1;

	/**
	 * The feature id for the '<em><b>Left Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_EXPRESSION__LEFT_SIDE = 2;

	/**
	 * The number of structural features of the '<em>GET Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_EXPRESSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>GET Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.impl.ArgumentImpl
	 * @see de.silvawb.java.impl.JavaPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Using Method</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__USING_METHOD = 2;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ORDER = 3;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link de.silvawb.java.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.impl.InterfaceImpl
	 * @see de.silvawb.java.impl.JavaPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 15;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__VISIBILITY = CLASSIFIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CONTAINER = CLASSIFIER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Importing Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__IMPORTING_CLASSES = CLASSIFIER__IMPORTING_CLASSES;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CONTAINED_ELEMENTS = CLASSIFIER__CONTAINED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotation Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ANNOTATION_INSTANCES = CLASSIFIER__ANNOTATION_INSTANCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Generic Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__GENERIC_BINDINGS = CLASSIFIER__GENERIC_BINDINGS;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__FIELDS = CLASSIFIER__FIELDS;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__METHODS = CLASSIFIER__METHODS;

	/**
	 * The feature id for the '<em><b>Interface Implementations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__INTERFACE_IMPLEMENTATIONS = CLASSIFIER__INTERFACE_IMPLEMENTATIONS;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__GENERALIZATION = CLASSIFIER__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__IMPORTS = CLASSIFIER__IMPORTS;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.impl.GenericBindingImpl <em>Generic Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.impl.GenericBindingImpl
	 * @see de.silvawb.java.impl.JavaPackageImpl#getGenericBinding()
	 * @generated
	 */
	int GENERIC_BINDING = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_BINDING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Upper Boundings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_BINDING__UPPER_BOUNDINGS = 1;

	/**
	 * The feature id for the '<em><b>Lower Bounding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_BINDING__LOWER_BOUNDING = 2;

	/**
	 * The feature id for the '<em><b>Using Classifier</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_BINDING__USING_CLASSIFIER = 3;

	/**
	 * The number of structural features of the '<em>Generic Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_BINDING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Generic Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.impl.AnnotableImpl <em>Annotable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.impl.AnnotableImpl
	 * @see de.silvawb.java.impl.JavaPackageImpl#getAnnotable()
	 * @generated
	 */
	int ANNOTABLE = 17;

	/**
	 * The feature id for the '<em><b>Annotation Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE__ANNOTATION_INSTANCES = 0;

	/**
	 * The number of structural features of the '<em>Annotable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Annotable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.impl.AnnotationImpl
	 * @see de.silvawb.java.impl.JavaPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 18;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__VISIBILITY = CLASSIFIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__CONTAINER = CLASSIFIER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Importing Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__IMPORTING_CLASSES = CLASSIFIER__IMPORTING_CLASSES;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__CONTAINED_ELEMENTS = CLASSIFIER__CONTAINED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotation Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ANNOTATION_INSTANCES = CLASSIFIER__ANNOTATION_INSTANCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Generic Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__GENERIC_BINDINGS = CLASSIFIER__GENERIC_BINDINGS;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__FIELDS = CLASSIFIER__FIELDS;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__METHODS = CLASSIFIER__METHODS;

	/**
	 * The feature id for the '<em><b>Interface Implementations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__INTERFACE_IMPLEMENTATIONS = CLASSIFIER__INTERFACE_IMPLEMENTATIONS;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__GENERALIZATION = CLASSIFIER__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__IMPORTS = CLASSIFIER__IMPORTS;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.impl.AnnotationInstanceImpl <em>Annotation Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.impl.AnnotationInstanceImpl
	 * @see de.silvawb.java.impl.JavaPackageImpl#getAnnotationInstance()
	 * @generated
	 */
	int ANNOTATION_INSTANCE = 19;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE__ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE__PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Annotable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE__ANNOTABLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Annotation Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Annotation Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.impl.AnnotationInstanceParameterImpl <em>Annotation Instance Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.impl.AnnotationInstanceParameterImpl
	 * @see de.silvawb.java.impl.JavaPackageImpl#getAnnotationInstanceParameter()
	 * @generated
	 */
	int ANNOTATION_INSTANCE_PARAMETER = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_PARAMETER__VALUES = 1;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_PARAMETER__INSTANCE = 2;

	/**
	 * The number of structural features of the '<em>Annotation Instance Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Annotation Instance Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.impl.AnnotationInstanceValueImpl <em>Annotation Instance Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.impl.AnnotationInstanceValueImpl
	 * @see de.silvawb.java.impl.JavaPackageImpl#getAnnotationInstanceValue()
	 * @generated
	 */
	int ANNOTATION_INSTANCE_VALUE = 21;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_VALUE__PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_VALUE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_VALUE__ID = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_VALUE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Annotation Instance Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_VALUE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Annotation Instance Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INSTANCE_VALUE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see de.silvawb.java.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.silvawb.java.System#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.silvawb.java.System#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see de.silvawb.java.System#getPackages()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Packages();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see de.silvawb.java.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.Package#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.silvawb.java.Package#getName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Name();

	/**
	 * Returns the meta object for the container reference '{@link de.silvawb.java.Package#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System</em>'.
	 * @see de.silvawb.java.Package#getSystem()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_System();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see de.silvawb.java.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.java.Class#getExtendedClass <em>Extended Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extended Class</em>'.
	 * @see de.silvawb.java.Class#getExtendedClass()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_ExtendedClass();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.java.Class#getExtendingClasses <em>Extending Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extending Classes</em>'.
	 * @see de.silvawb.java.Class#getExtendingClasses()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_ExtendingClasses();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.Class#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see de.silvawb.java.Class#isIsAbstract()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.Class#isIsFinal <em>Is Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Final</em>'.
	 * @see de.silvawb.java.Class#isIsFinal()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_IsFinal();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.Class#isIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see de.silvawb.java.Class#isIsStatic()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_IsStatic();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.InterfaceImplementation <em>Interface Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Implementation</em>'.
	 * @see de.silvawb.java.InterfaceImplementation
	 * @generated
	 */
	EClass getInterfaceImplementation();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.java.InterfaceImplementation#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see de.silvawb.java.InterfaceImplementation#getInterface()
	 * @see #getInterfaceImplementation()
	 * @generated
	 */
	EReference getInterfaceImplementation_Interface();

	/**
	 * Returns the meta object for the container reference '{@link de.silvawb.java.InterfaceImplementation#getImplementer <em>Implementer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Implementer</em>'.
	 * @see de.silvawb.java.InterfaceImplementation#getImplementer()
	 * @see #getInterfaceImplementation()
	 * @generated
	 */
	EReference getInterfaceImplementation_Implementer();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.InterfaceImplementation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.silvawb.java.InterfaceImplementation#getName()
	 * @see #getInterfaceImplementation()
	 * @generated
	 */
	EAttribute getInterfaceImplementation_Name();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization</em>'.
	 * @see de.silvawb.java.Generalization
	 * @generated
	 */
	EClass getGeneralization();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.java.Generalization#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>General</em>'.
	 * @see de.silvawb.java.Generalization#getGeneral()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_General();

	/**
	 * Returns the meta object for the container reference '{@link de.silvawb.java.Generalization#getGeneralizator <em>Generalizator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Generalizator</em>'.
	 * @see de.silvawb.java.Generalization#getGeneralizator()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_Generalizator();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.Generalization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.silvawb.java.Generalization#getName()
	 * @see #getGeneralization()
	 * @generated
	 */
	EAttribute getGeneralization_Name();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see de.silvawb.java.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.Classifier#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.silvawb.java.Classifier#getName()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.silvawb.java.Classifier#getGenericBindings <em>Generic Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Bindings</em>'.
	 * @see de.silvawb.java.Classifier#getGenericBindings()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_GenericBindings();

	/**
	 * Returns the meta object for the containment reference list '{@link de.silvawb.java.Classifier#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see de.silvawb.java.Classifier#getFields()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Fields();

	/**
	 * Returns the meta object for the containment reference list '{@link de.silvawb.java.Classifier#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see de.silvawb.java.Classifier#getMethods()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Methods();

	/**
	 * Returns the meta object for the containment reference list '{@link de.silvawb.java.Classifier#getInterfaceImplementations <em>Interface Implementations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Implementations</em>'.
	 * @see de.silvawb.java.Classifier#getInterfaceImplementations()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_InterfaceImplementations();

	/**
	 * Returns the meta object for the containment reference '{@link de.silvawb.java.Classifier#getGeneralization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generalization</em>'.
	 * @see de.silvawb.java.Classifier#getGeneralization()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Generalization();

	/**
	 * Returns the meta object for the containment reference list '{@link de.silvawb.java.Classifier#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see de.silvawb.java.Classifier#getImports()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Imports();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see de.silvawb.java.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.silvawb.java.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.java.Field#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.silvawb.java.Field#getType()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Type();

	/**
	 * Returns the meta object for the container reference '{@link de.silvawb.java.Field#getContainingClassifier <em>Containing Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Containing Classifier</em>'.
	 * @see de.silvawb.java.Field#getContainingClassifier()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_ContainingClassifier();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.Field#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see de.silvawb.java.Field#getDefault()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Default();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.Field#isIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see de.silvawb.java.Field#isIsStatic()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_IsStatic();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.Field#isIsFinal <em>Is Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Final</em>'.
	 * @see de.silvawb.java.Field#isIsFinal()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_IsFinal();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see de.silvawb.java.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.java.Import#getImported <em>Imported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imported</em>'.
	 * @see de.silvawb.java.Import#getImported()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_Imported();

	/**
	 * Returns the meta object for the container reference '{@link de.silvawb.java.Import#getImporting <em>Importing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Importing</em>'.
	 * @see de.silvawb.java.Import#getImporting()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_Importing();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.Import#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.silvawb.java.Import#getName()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Name();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.Contained <em>Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contained</em>'.
	 * @see de.silvawb.java.Contained
	 * @generated
	 */
	EClass getContained();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.Contained#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see de.silvawb.java.Contained#getVisibility()
	 * @see #getContained()
	 * @generated
	 */
	EAttribute getContained_Visibility();

	/**
	 * Returns the meta object for the container reference '{@link de.silvawb.java.Contained#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see de.silvawb.java.Contained#getContainer()
	 * @see #getContained()
	 * @generated
	 */
	EReference getContained_Container();

	/**
	 * Returns the meta object for the reference list '{@link de.silvawb.java.Contained#getImportingClasses <em>Importing Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Importing Classes</em>'.
	 * @see de.silvawb.java.Contained#getImportingClasses()
	 * @see #getContained()
	 * @generated
	 */
	EReference getContained_ImportingClasses();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see de.silvawb.java.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.Method#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.silvawb.java.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Name();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.java.Method#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see de.silvawb.java.Method#getReturnType()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_ReturnType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.silvawb.java.Method#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see de.silvawb.java.Method#getArguments()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Arguments();

	/**
	 * Returns the meta object for the container reference '{@link de.silvawb.java.Method#getContainingClassifier <em>Containing Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Containing Classifier</em>'.
	 * @see de.silvawb.java.Method#getContainingClassifier()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_ContainingClassifier();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.Method#isIsFinal <em>Is Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Final</em>'.
	 * @see de.silvawb.java.Method#isIsFinal()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsFinal();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.Method#isIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see de.silvawb.java.Method#isIsStatic()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsStatic();

	/**
	 * Returns the meta object for the containment reference list '{@link de.silvawb.java.Method#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see de.silvawb.java.Method#getBody()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Body();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see de.silvawb.java.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the container reference '{@link de.silvawb.java.Statement#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Method</em>'.
	 * @see de.silvawb.java.Statement#getMethod()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Method();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.Statement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.silvawb.java.Statement#getName()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_Name();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.AssertStatement <em>Assert Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assert Statement</em>'.
	 * @see de.silvawb.java.AssertStatement
	 * @generated
	 */
	EClass getAssertStatement();

	/**
	 * Returns the meta object for the containment reference '{@link de.silvawb.java.AssertStatement#getAssertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assertion</em>'.
	 * @see de.silvawb.java.AssertStatement#getAssertion()
	 * @see #getAssertStatement()
	 * @generated
	 */
	EReference getAssertStatement_Assertion();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.GETExpression <em>GET Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GET Expression</em>'.
	 * @see de.silvawb.java.GETExpression
	 * @generated
	 */
	EClass getGETExpression();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.GETExpression#getRightSide <em>Right Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Side</em>'.
	 * @see de.silvawb.java.GETExpression#getRightSide()
	 * @see #getGETExpression()
	 * @generated
	 */
	EAttribute getGETExpression_RightSide();

	/**
	 * Returns the meta object for the container reference '{@link de.silvawb.java.GETExpression#getContainerStatement <em>Container Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Statement</em>'.
	 * @see de.silvawb.java.GETExpression#getContainerStatement()
	 * @see #getGETExpression()
	 * @generated
	 */
	EReference getGETExpression_ContainerStatement();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.GETExpression#getLeftSide <em>Left Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Side</em>'.
	 * @see de.silvawb.java.GETExpression#getLeftSide()
	 * @see #getGETExpression()
	 * @generated
	 */
	EAttribute getGETExpression_LeftSide();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.Method#getConcurrency <em>Concurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concurrency</em>'.
	 * @see de.silvawb.java.Method#getConcurrency()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Concurrency();

	/**
	 * Returns the meta object for the reference list '{@link de.silvawb.java.Method#getRaisedExceptions <em>Raised Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Raised Exceptions</em>'.
	 * @see de.silvawb.java.Method#getRaisedExceptions()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_RaisedExceptions();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see de.silvawb.java.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.Argument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.silvawb.java.Argument#getName()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Name();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.java.Argument#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.silvawb.java.Argument#getType()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_Type();

	/**
	 * Returns the meta object for the container reference '{@link de.silvawb.java.Argument#getUsingMethod <em>Using Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Using Method</em>'.
	 * @see de.silvawb.java.Argument#getUsingMethod()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_UsingMethod();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.Argument#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see de.silvawb.java.Argument#getOrder()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Order();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see de.silvawb.java.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link de.silvawb.java.Container#getContainedElements <em>Contained Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Elements</em>'.
	 * @see de.silvawb.java.Container#getContainedElements()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_ContainedElements();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see de.silvawb.java.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.GenericBinding <em>Generic Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Binding</em>'.
	 * @see de.silvawb.java.GenericBinding
	 * @generated
	 */
	EClass getGenericBinding();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.GenericBinding#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.silvawb.java.GenericBinding#getName()
	 * @see #getGenericBinding()
	 * @generated
	 */
	EAttribute getGenericBinding_Name();

	/**
	 * Returns the meta object for the reference list '{@link de.silvawb.java.GenericBinding#getUpperBoundings <em>Upper Boundings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Upper Boundings</em>'.
	 * @see de.silvawb.java.GenericBinding#getUpperBoundings()
	 * @see #getGenericBinding()
	 * @generated
	 */
	EReference getGenericBinding_UpperBoundings();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.java.GenericBinding#getLowerBounding <em>Lower Bounding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lower Bounding</em>'.
	 * @see de.silvawb.java.GenericBinding#getLowerBounding()
	 * @see #getGenericBinding()
	 * @generated
	 */
	EReference getGenericBinding_LowerBounding();

	/**
	 * Returns the meta object for the container reference '{@link de.silvawb.java.GenericBinding#getUsingClassifier <em>Using Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Using Classifier</em>'.
	 * @see de.silvawb.java.GenericBinding#getUsingClassifier()
	 * @see #getGenericBinding()
	 * @generated
	 */
	EReference getGenericBinding_UsingClassifier();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.Annotable <em>Annotable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotable</em>'.
	 * @see de.silvawb.java.Annotable
	 * @generated
	 */
	EClass getAnnotable();

	/**
	 * Returns the meta object for the containment reference list '{@link de.silvawb.java.Annotable#getAnnotationInstances <em>Annotation Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation Instances</em>'.
	 * @see de.silvawb.java.Annotable#getAnnotationInstances()
	 * @see #getAnnotable()
	 * @generated
	 */
	EReference getAnnotable_AnnotationInstances();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see de.silvawb.java.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.AnnotationInstance <em>Annotation Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Instance</em>'.
	 * @see de.silvawb.java.AnnotationInstance
	 * @generated
	 */
	EClass getAnnotationInstance();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.java.AnnotationInstance#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotation</em>'.
	 * @see de.silvawb.java.AnnotationInstance#getAnnotation()
	 * @see #getAnnotationInstance()
	 * @generated
	 */
	EReference getAnnotationInstance_Annotation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.silvawb.java.AnnotationInstance#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see de.silvawb.java.AnnotationInstance#getParameters()
	 * @see #getAnnotationInstance()
	 * @generated
	 */
	EReference getAnnotationInstance_Parameters();

	/**
	 * Returns the meta object for the container reference '{@link de.silvawb.java.AnnotationInstance#getAnnotable <em>Annotable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Annotable</em>'.
	 * @see de.silvawb.java.AnnotationInstance#getAnnotable()
	 * @see #getAnnotationInstance()
	 * @generated
	 */
	EReference getAnnotationInstance_Annotable();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.AnnotationInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.silvawb.java.AnnotationInstance#getName()
	 * @see #getAnnotationInstance()
	 * @generated
	 */
	EAttribute getAnnotationInstance_Name();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.AnnotationInstanceParameter <em>Annotation Instance Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Instance Parameter</em>'.
	 * @see de.silvawb.java.AnnotationInstanceParameter
	 * @generated
	 */
	EClass getAnnotationInstanceParameter();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.AnnotationInstanceParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.silvawb.java.AnnotationInstanceParameter#getName()
	 * @see #getAnnotationInstanceParameter()
	 * @generated
	 */
	EAttribute getAnnotationInstanceParameter_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.silvawb.java.AnnotationInstanceParameter#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see de.silvawb.java.AnnotationInstanceParameter#getValues()
	 * @see #getAnnotationInstanceParameter()
	 * @generated
	 */
	EReference getAnnotationInstanceParameter_Values();

	/**
	 * Returns the meta object for the container reference '{@link de.silvawb.java.AnnotationInstanceParameter#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Instance</em>'.
	 * @see de.silvawb.java.AnnotationInstanceParameter#getInstance()
	 * @see #getAnnotationInstanceParameter()
	 * @generated
	 */
	EReference getAnnotationInstanceParameter_Instance();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.AnnotationInstanceValue <em>Annotation Instance Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Instance Value</em>'.
	 * @see de.silvawb.java.AnnotationInstanceValue
	 * @generated
	 */
	EClass getAnnotationInstanceValue();

	/**
	 * Returns the meta object for the container reference '{@link de.silvawb.java.AnnotationInstanceValue#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parameter</em>'.
	 * @see de.silvawb.java.AnnotationInstanceValue#getParameter()
	 * @see #getAnnotationInstanceValue()
	 * @generated
	 */
	EReference getAnnotationInstanceValue_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.AnnotationInstanceValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.silvawb.java.AnnotationInstanceValue#getValue()
	 * @see #getAnnotationInstanceValue()
	 * @generated
	 */
	EAttribute getAnnotationInstanceValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.AnnotationInstanceValue#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.silvawb.java.AnnotationInstanceValue#getId()
	 * @see #getAnnotationInstanceValue()
	 * @generated
	 */
	EAttribute getAnnotationInstanceValue_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.AnnotationInstanceValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.silvawb.java.AnnotationInstanceValue#getName()
	 * @see #getAnnotationInstanceValue()
	 * @generated
	 */
	EAttribute getAnnotationInstanceValue_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JavaFactory getJavaFactory();

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
		 * The meta object literal for the '{@link de.silvawb.java.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.impl.SystemImpl
		 * @see de.silvawb.java.impl.JavaPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__PACKAGES = eINSTANCE.getSystem_Packages();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.impl.PackageImpl
		 * @see de.silvawb.java.impl.JavaPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__SYSTEM = eINSTANCE.getPackage_System();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.impl.ClassImpl
		 * @see de.silvawb.java.impl.JavaPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Extended Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__EXTENDED_CLASS = eINSTANCE.getClass_ExtendedClass();

		/**
		 * The meta object literal for the '<em><b>Extending Classes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__EXTENDING_CLASSES = eINSTANCE.getClass_ExtendingClasses();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__IS_ABSTRACT = eINSTANCE.getClass_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__IS_FINAL = eINSTANCE.getClass_IsFinal();

		/**
		 * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__IS_STATIC = eINSTANCE.getClass_IsStatic();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.impl.InterfaceImplementationImpl <em>Interface Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.impl.InterfaceImplementationImpl
		 * @see de.silvawb.java.impl.JavaPackageImpl#getInterfaceImplementation()
		 * @generated
		 */
		EClass INTERFACE_IMPLEMENTATION = eINSTANCE.getInterfaceImplementation();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_IMPLEMENTATION__INTERFACE = eINSTANCE.getInterfaceImplementation_Interface();

		/**
		 * The meta object literal for the '<em><b>Implementer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_IMPLEMENTATION__IMPLEMENTER = eINSTANCE.getInterfaceImplementation_Implementer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_IMPLEMENTATION__NAME = eINSTANCE.getInterfaceImplementation_Name();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.impl.GeneralizationImpl <em>Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.impl.GeneralizationImpl
		 * @see de.silvawb.java.impl.JavaPackageImpl#getGeneralization()
		 * @generated
		 */
		EClass GENERALIZATION = eINSTANCE.getGeneralization();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__GENERAL = eINSTANCE.getGeneralization_General();

		/**
		 * The meta object literal for the '<em><b>Generalizator</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__GENERALIZATOR = eINSTANCE.getGeneralization_Generalizator();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION__NAME = eINSTANCE.getGeneralization_Name();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.impl.ClassifierImpl <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.impl.ClassifierImpl
		 * @see de.silvawb.java.impl.JavaPackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__NAME = eINSTANCE.getClassifier_Name();

		/**
		 * The meta object literal for the '<em><b>Generic Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__GENERIC_BINDINGS = eINSTANCE.getClassifier_GenericBindings();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__FIELDS = eINSTANCE.getClassifier_Fields();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__METHODS = eINSTANCE.getClassifier_Methods();

		/**
		 * The meta object literal for the '<em><b>Interface Implementations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__INTERFACE_IMPLEMENTATIONS = eINSTANCE.getClassifier_InterfaceImplementations();

		/**
		 * The meta object literal for the '<em><b>Generalization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__GENERALIZATION = eINSTANCE.getClassifier_Generalization();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__IMPORTS = eINSTANCE.getClassifier_Imports();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.impl.FieldImpl
		 * @see de.silvawb.java.impl.JavaPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__TYPE = eINSTANCE.getField_Type();

		/**
		 * The meta object literal for the '<em><b>Containing Classifier</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__CONTAINING_CLASSIFIER = eINSTANCE.getField_ContainingClassifier();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__DEFAULT = eINSTANCE.getField_Default();

		/**
		 * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__IS_STATIC = eINSTANCE.getField_IsStatic();

		/**
		 * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__IS_FINAL = eINSTANCE.getField_IsFinal();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.impl.ImportImpl
		 * @see de.silvawb.java.impl.JavaPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Imported</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT__IMPORTED = eINSTANCE.getImport_Imported();

		/**
		 * The meta object literal for the '<em><b>Importing</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT__IMPORTING = eINSTANCE.getImport_Importing();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__NAME = eINSTANCE.getImport_Name();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.impl.ContainedImpl <em>Contained</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.impl.ContainedImpl
		 * @see de.silvawb.java.impl.JavaPackageImpl#getContained()
		 * @generated
		 */
		EClass CONTAINED = eINSTANCE.getContained();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED__VISIBILITY = eINSTANCE.getContained_Visibility();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINED__CONTAINER = eINSTANCE.getContained_Container();

		/**
		 * The meta object literal for the '<em><b>Importing Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINED__IMPORTING_CLASSES = eINSTANCE.getContained_ImportingClasses();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.impl.MethodImpl
		 * @see de.silvawb.java.impl.JavaPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__RETURN_TYPE = eINSTANCE.getMethod_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__ARGUMENTS = eINSTANCE.getMethod_Arguments();

		/**
		 * The meta object literal for the '<em><b>Containing Classifier</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__CONTAINING_CLASSIFIER = eINSTANCE.getMethod_ContainingClassifier();

		/**
		 * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__IS_FINAL = eINSTANCE.getMethod_IsFinal();

		/**
		 * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__IS_STATIC = eINSTANCE.getMethod_IsStatic();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__BODY = eINSTANCE.getMethod_Body();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.impl.StatementImpl
		 * @see de.silvawb.java.impl.JavaPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__METHOD = eINSTANCE.getStatement_Method();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT__NAME = eINSTANCE.getStatement_Name();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.impl.AssertStatementImpl <em>Assert Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.impl.AssertStatementImpl
		 * @see de.silvawb.java.impl.JavaPackageImpl#getAssertStatement()
		 * @generated
		 */
		EClass ASSERT_STATEMENT = eINSTANCE.getAssertStatement();

		/**
		 * The meta object literal for the '<em><b>Assertion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERT_STATEMENT__ASSERTION = eINSTANCE.getAssertStatement_Assertion();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.impl.GETExpressionImpl <em>GET Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.impl.GETExpressionImpl
		 * @see de.silvawb.java.impl.JavaPackageImpl#getGETExpression()
		 * @generated
		 */
		EClass GET_EXPRESSION = eINSTANCE.getGETExpression();

		/**
		 * The meta object literal for the '<em><b>Right Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_EXPRESSION__RIGHT_SIDE = eINSTANCE.getGETExpression_RightSide();

		/**
		 * The meta object literal for the '<em><b>Container Statement</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_EXPRESSION__CONTAINER_STATEMENT = eINSTANCE.getGETExpression_ContainerStatement();

		/**
		 * The meta object literal for the '<em><b>Left Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_EXPRESSION__LEFT_SIDE = eINSTANCE.getGETExpression_LeftSide();

		/**
		 * The meta object literal for the '<em><b>Concurrency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__CONCURRENCY = eINSTANCE.getMethod_Concurrency();

		/**
		 * The meta object literal for the '<em><b>Raised Exceptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__RAISED_EXCEPTIONS = eINSTANCE.getMethod_RaisedExceptions();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.impl.ArgumentImpl
		 * @see de.silvawb.java.impl.JavaPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__NAME = eINSTANCE.getArgument_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__TYPE = eINSTANCE.getArgument_Type();

		/**
		 * The meta object literal for the '<em><b>Using Method</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__USING_METHOD = eINSTANCE.getArgument_UsingMethod();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__ORDER = eINSTANCE.getArgument_Order();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.impl.ContainerImpl
		 * @see de.silvawb.java.impl.JavaPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Contained Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__CONTAINED_ELEMENTS = eINSTANCE.getContainer_ContainedElements();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.impl.InterfaceImpl
		 * @see de.silvawb.java.impl.JavaPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.impl.GenericBindingImpl <em>Generic Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.impl.GenericBindingImpl
		 * @see de.silvawb.java.impl.JavaPackageImpl#getGenericBinding()
		 * @generated
		 */
		EClass GENERIC_BINDING = eINSTANCE.getGenericBinding();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_BINDING__NAME = eINSTANCE.getGenericBinding_Name();

		/**
		 * The meta object literal for the '<em><b>Upper Boundings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_BINDING__UPPER_BOUNDINGS = eINSTANCE.getGenericBinding_UpperBoundings();

		/**
		 * The meta object literal for the '<em><b>Lower Bounding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_BINDING__LOWER_BOUNDING = eINSTANCE.getGenericBinding_LowerBounding();

		/**
		 * The meta object literal for the '<em><b>Using Classifier</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_BINDING__USING_CLASSIFIER = eINSTANCE.getGenericBinding_UsingClassifier();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.impl.AnnotableImpl <em>Annotable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.impl.AnnotableImpl
		 * @see de.silvawb.java.impl.JavaPackageImpl#getAnnotable()
		 * @generated
		 */
		EClass ANNOTABLE = eINSTANCE.getAnnotable();

		/**
		 * The meta object literal for the '<em><b>Annotation Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTABLE__ANNOTATION_INSTANCES = eINSTANCE.getAnnotable_AnnotationInstances();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.impl.AnnotationImpl
		 * @see de.silvawb.java.impl.JavaPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.impl.AnnotationInstanceImpl <em>Annotation Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.impl.AnnotationInstanceImpl
		 * @see de.silvawb.java.impl.JavaPackageImpl#getAnnotationInstance()
		 * @generated
		 */
		EClass ANNOTATION_INSTANCE = eINSTANCE.getAnnotationInstance();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_INSTANCE__ANNOTATION = eINSTANCE.getAnnotationInstance_Annotation();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_INSTANCE__PARAMETERS = eINSTANCE.getAnnotationInstance_Parameters();

		/**
		 * The meta object literal for the '<em><b>Annotable</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_INSTANCE__ANNOTABLE = eINSTANCE.getAnnotationInstance_Annotable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_INSTANCE__NAME = eINSTANCE.getAnnotationInstance_Name();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.impl.AnnotationInstanceParameterImpl <em>Annotation Instance Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.impl.AnnotationInstanceParameterImpl
		 * @see de.silvawb.java.impl.JavaPackageImpl#getAnnotationInstanceParameter()
		 * @generated
		 */
		EClass ANNOTATION_INSTANCE_PARAMETER = eINSTANCE.getAnnotationInstanceParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_INSTANCE_PARAMETER__NAME = eINSTANCE.getAnnotationInstanceParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_INSTANCE_PARAMETER__VALUES = eINSTANCE.getAnnotationInstanceParameter_Values();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_INSTANCE_PARAMETER__INSTANCE = eINSTANCE.getAnnotationInstanceParameter_Instance();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.impl.AnnotationInstanceValueImpl <em>Annotation Instance Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.impl.AnnotationInstanceValueImpl
		 * @see de.silvawb.java.impl.JavaPackageImpl#getAnnotationInstanceValue()
		 * @generated
		 */
		EClass ANNOTATION_INSTANCE_VALUE = eINSTANCE.getAnnotationInstanceValue();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_INSTANCE_VALUE__PARAMETER = eINSTANCE.getAnnotationInstanceValue_Parameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_INSTANCE_VALUE__VALUE = eINSTANCE.getAnnotationInstanceValue_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_INSTANCE_VALUE__ID = eINSTANCE.getAnnotationInstanceValue_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_INSTANCE_VALUE__NAME = eINSTANCE.getAnnotationInstanceValue_Name();

	}

} //JavaPackage
