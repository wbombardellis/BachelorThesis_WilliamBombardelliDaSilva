/**
 */
package de.silvawb.java;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
	 * The meta object id for the '{@link de.silvawb.java.impl.JModelElementImpl <em>JModel Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.impl.JModelElementImpl
	 * @see de.silvawb.java.impl.JavaPackageImpl#getJModelElement()
	 * @generated
	 */
	int JMODEL_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMODEL_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>JNode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMODEL_ELEMENT__JNODE = 1;

	/**
	 * The number of structural features of the '<em>JModel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMODEL_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>JModel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.impl.JMemberImpl <em>JMember</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.impl.JMemberImpl
	 * @see de.silvawb.java.impl.JavaPackageImpl#getJMember()
	 * @generated
	 */
	int JMEMBER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMEMBER__NAME = JMODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>JNode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMEMBER__JNODE = JMODEL_ELEMENT__JNODE;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMEMBER__STATIC = JMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMEMBER__VISIBILITY = JMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMEMBER__COMMENT = JMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMEMBER__CONTAINING_TYPE = JMODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>JMember</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMEMBER_FEATURE_COUNT = JMODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>JMember</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMEMBER_OPERATION_COUNT = JMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.impl.JClassImpl <em>JClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.impl.JClassImpl
	 * @see de.silvawb.java.impl.JavaPackageImpl#getJClass()
	 * @generated
	 */
	int JCLASS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__NAME = JMEMBER__NAME;

	/**
	 * The feature id for the '<em><b>JNode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__JNODE = JMEMBER__JNODE;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__STATIC = JMEMBER__STATIC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__VISIBILITY = JMEMBER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__COMMENT = JMEMBER__COMMENT;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__CONTAINING_TYPE = JMEMBER__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__ABSTRACT = JMEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__FINAL = JMEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__INTERFACE = JMEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Throwable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__THROWABLE = JMEMBER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Java Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__JAVA_CLASS = JMEMBER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__FIELDS = JMEMBER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__METHODS = JMEMBER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__SUPER_TYPES = JMEMBER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>All Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__ALL_SUPER_TYPES = JMEMBER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__MEMBERS = JMEMBER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__COMPONENT_TYPE = JMEMBER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Array Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__ARRAY_TYPE = JMEMBER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__UNIT = JMEMBER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>All Methods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__ALL_METHODS = JMEMBER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>All Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__ALL_FIELDS = JMEMBER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__PACKAGE = JMEMBER_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__TYPES = JMEMBER_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>All Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__ALL_TYPES = JMEMBER_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>JClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS_FEATURE_COUNT = JMEMBER_FEATURE_COUNT + 18;

	/**
	 * The number of operations of the '<em>JClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS_OPERATION_COUNT = JMEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.impl.JCompilationUnitImpl <em>JCompilation Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.impl.JCompilationUnitImpl
	 * @see de.silvawb.java.impl.JavaPackageImpl#getJCompilationUnit()
	 * @generated
	 */
	int JCOMPILATION_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCOMPILATION_UNIT__NAME = JMODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>JNode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCOMPILATION_UNIT__JNODE = JMODEL_ELEMENT__JNODE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCOMPILATION_UNIT__IMPORTS = JMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCOMPILATION_UNIT__COMMENT = JMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCOMPILATION_UNIT__TYPES = JMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Imported Packages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCOMPILATION_UNIT__IMPORTED_PACKAGES = JMODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Imported Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCOMPILATION_UNIT__IMPORTED_TYPES = JMODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCOMPILATION_UNIT__PACKAGE = JMODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>JCompilation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCOMPILATION_UNIT_FEATURE_COUNT = JMODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>JCompilation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCOMPILATION_UNIT_OPERATION_COUNT = JMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.impl.JFieldImpl <em>JField</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.impl.JFieldImpl
	 * @see de.silvawb.java.impl.JavaPackageImpl#getJField()
	 * @generated
	 */
	int JFIELD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIELD__NAME = JMEMBER__NAME;

	/**
	 * The feature id for the '<em><b>JNode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIELD__JNODE = JMEMBER__JNODE;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIELD__STATIC = JMEMBER__STATIC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIELD__VISIBILITY = JMEMBER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIELD__COMMENT = JMEMBER__COMMENT;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIELD__CONTAINING_TYPE = JMEMBER__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIELD__FINAL = JMEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIELD__TRANSIENT = JMEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIELD__VOLATILE = JMEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Java Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIELD__JAVA_FIELD = JMEMBER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Initializer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIELD__INITIALIZER = JMEMBER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIELD__TYPE = JMEMBER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>JField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIELD_FEATURE_COUNT = JMEMBER_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>JField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIELD_OPERATION_COUNT = JMEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.impl.JInitializerImpl <em>JInitializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.impl.JInitializerImpl
	 * @see de.silvawb.java.impl.JavaPackageImpl#getJInitializer()
	 * @generated
	 */
	int JINITIALIZER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINITIALIZER__NAME = JMEMBER__NAME;

	/**
	 * The feature id for the '<em><b>JNode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINITIALIZER__JNODE = JMEMBER__JNODE;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINITIALIZER__STATIC = JMEMBER__STATIC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINITIALIZER__VISIBILITY = JMEMBER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINITIALIZER__COMMENT = JMEMBER__COMMENT;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINITIALIZER__CONTAINING_TYPE = JMEMBER__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINITIALIZER__BODY = JMEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JInitializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINITIALIZER_FEATURE_COUNT = JMEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>JInitializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINITIALIZER_OPERATION_COUNT = JMEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.impl.JMethodImpl <em>JMethod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.impl.JMethodImpl
	 * @see de.silvawb.java.impl.JavaPackageImpl#getJMethod()
	 * @generated
	 */
	int JMETHOD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__NAME = JMEMBER__NAME;

	/**
	 * The feature id for the '<em><b>JNode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__JNODE = JMEMBER__JNODE;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__STATIC = JMEMBER__STATIC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__VISIBILITY = JMEMBER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__COMMENT = JMEMBER__COMMENT;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__CONTAINING_TYPE = JMEMBER__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__ABSTRACT = JMEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__FINAL = JMEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Native</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__NATIVE = JMEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__SYNCHRONIZED = JMEMBER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Java Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__JAVA_METHOD = JMEMBER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Constructor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__CONSTRUCTOR = JMEMBER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Java Constructor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__JAVA_CONSTRUCTOR = JMEMBER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__BODY = JMEMBER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__PARAMETERS = JMEMBER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__EXCEPTIONS = JMEMBER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__RETURN_TYPE = JMEMBER_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>JMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD_FEATURE_COUNT = JMEMBER_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>JMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD_OPERATION_COUNT = JMEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.impl.JPackageImpl <em>JPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.impl.JPackageImpl
	 * @see de.silvawb.java.impl.JavaPackageImpl#getJPackage()
	 * @generated
	 */
	int JPACKAGE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE__NAME = JMODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>JNode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE__JNODE = JMODEL_ELEMENT__JNODE;

	/**
	 * The feature id for the '<em><b>Java Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE__JAVA_PACKAGE = JMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE__TYPES = JMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>JPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE_FEATURE_COUNT = JMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>JPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE_OPERATION_COUNT = JMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.impl.JParameterImpl <em>JParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.impl.JParameterImpl
	 * @see de.silvawb.java.impl.JavaPackageImpl#getJParameter()
	 * @generated
	 */
	int JPARAMETER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER__NAME = JMODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>JNode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER__JNODE = JMODEL_ELEMENT__JNODE;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER__FINAL = JMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER__METHOD = JMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER__TYPE = JMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>JParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER_FEATURE_COUNT = JMODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>JParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER_OPERATION_COUNT = JMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.java.JVisibility <em>JVisibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.java.JVisibility
	 * @see de.silvawb.java.impl.JavaPackageImpl#getJVisibility()
	 * @generated
	 */
	int JVISIBILITY = 9;

	/**
	 * The meta object id for the '<em>Class</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Class
	 * @see de.silvawb.java.impl.JavaPackageImpl#getJavaClass()
	 * @generated
	 */
	int JAVA_CLASS = 10;

	/**
	 * The meta object id for the '<em>Constructor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.reflect.Constructor
	 * @see de.silvawb.java.impl.JavaPackageImpl#getJavaConstructor()
	 * @generated
	 */
	int JAVA_CONSTRUCTOR = 11;

	/**
	 * The meta object id for the '<em>Field</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.reflect.Field
	 * @see de.silvawb.java.impl.JavaPackageImpl#getJavaField()
	 * @generated
	 */
	int JAVA_FIELD = 12;

	/**
	 * The meta object id for the '<em>Method</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.reflect.Method
	 * @see de.silvawb.java.impl.JavaPackageImpl#getJavaMethod()
	 * @generated
	 */
	int JAVA_METHOD = 13;

	/**
	 * The meta object id for the '<em>Package</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Package
	 * @see de.silvawb.java.impl.JavaPackageImpl#getJavaPackage()
	 * @generated
	 */
	int JAVA_PACKAGE = 14;

	/**
	 * The meta object id for the '<em>JNode</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see de.silvawb.java.impl.JavaPackageImpl#getJNode()
	 * @generated
	 */
	int JNODE = 15;


	/**
	 * Returns the meta object for class '{@link de.silvawb.java.JClass <em>JClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JClass</em>'.
	 * @see de.silvawb.java.JClass
	 * @generated
	 */
	EClass getJClass();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.JClass#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see de.silvawb.java.JClass#isAbstract()
	 * @see #getJClass()
	 * @generated
	 */
	EAttribute getJClass_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.JClass#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see de.silvawb.java.JClass#isFinal()
	 * @see #getJClass()
	 * @generated
	 */
	EAttribute getJClass_Final();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.JClass#isInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface</em>'.
	 * @see de.silvawb.java.JClass#isInterface()
	 * @see #getJClass()
	 * @generated
	 */
	EAttribute getJClass_Interface();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.JClass#isThrowable <em>Throwable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throwable</em>'.
	 * @see de.silvawb.java.JClass#isThrowable()
	 * @see #getJClass()
	 * @generated
	 */
	EAttribute getJClass_Throwable();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.JClass#getJavaClass <em>Java Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Class</em>'.
	 * @see de.silvawb.java.JClass#getJavaClass()
	 * @see #getJClass()
	 * @generated
	 */
	EAttribute getJClass_JavaClass();

	/**
	 * Returns the meta object for the reference list '{@link de.silvawb.java.JClass#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fields</em>'.
	 * @see de.silvawb.java.JClass#getFields()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_Fields();

	/**
	 * Returns the meta object for the reference list '{@link de.silvawb.java.JClass#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Methods</em>'.
	 * @see de.silvawb.java.JClass#getMethods()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_Methods();

	/**
	 * Returns the meta object for the reference list '{@link de.silvawb.java.JClass#getSuperTypes <em>Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Types</em>'.
	 * @see de.silvawb.java.JClass#getSuperTypes()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_SuperTypes();

	/**
	 * Returns the meta object for the reference list '{@link de.silvawb.java.JClass#getAllSuperTypes <em>All Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Super Types</em>'.
	 * @see de.silvawb.java.JClass#getAllSuperTypes()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_AllSuperTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.silvawb.java.JClass#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see de.silvawb.java.JClass#getMembers()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_Members();

	/**
	 * Returns the meta object for the container reference '{@link de.silvawb.java.JClass#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component Type</em>'.
	 * @see de.silvawb.java.JClass#getComponentType()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_ComponentType();

	/**
	 * Returns the meta object for the containment reference '{@link de.silvawb.java.JClass#getArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array Type</em>'.
	 * @see de.silvawb.java.JClass#getArrayType()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_ArrayType();

	/**
	 * Returns the meta object for the container reference '{@link de.silvawb.java.JClass#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Unit</em>'.
	 * @see de.silvawb.java.JClass#getUnit()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_Unit();

	/**
	 * Returns the meta object for the reference list '{@link de.silvawb.java.JClass#getAllMethods <em>All Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Methods</em>'.
	 * @see de.silvawb.java.JClass#getAllMethods()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_AllMethods();

	/**
	 * Returns the meta object for the reference list '{@link de.silvawb.java.JClass#getAllFields <em>All Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Fields</em>'.
	 * @see de.silvawb.java.JClass#getAllFields()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_AllFields();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.java.JClass#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see de.silvawb.java.JClass#getPackage()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_Package();

	/**
	 * Returns the meta object for the reference list '{@link de.silvawb.java.JClass#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Types</em>'.
	 * @see de.silvawb.java.JClass#getTypes()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_Types();

	/**
	 * Returns the meta object for the reference list '{@link de.silvawb.java.JClass#getAllTypes <em>All Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Types</em>'.
	 * @see de.silvawb.java.JClass#getAllTypes()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_AllTypes();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.JCompilationUnit <em>JCompilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JCompilation Unit</em>'.
	 * @see de.silvawb.java.JCompilationUnit
	 * @generated
	 */
	EClass getJCompilationUnit();

	/**
	 * Returns the meta object for the attribute list '{@link de.silvawb.java.JCompilationUnit#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Imports</em>'.
	 * @see de.silvawb.java.JCompilationUnit#getImports()
	 * @see #getJCompilationUnit()
	 * @generated
	 */
	EAttribute getJCompilationUnit_Imports();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.JCompilationUnit#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see de.silvawb.java.JCompilationUnit#getComment()
	 * @see #getJCompilationUnit()
	 * @generated
	 */
	EAttribute getJCompilationUnit_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link de.silvawb.java.JCompilationUnit#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see de.silvawb.java.JCompilationUnit#getTypes()
	 * @see #getJCompilationUnit()
	 * @generated
	 */
	EReference getJCompilationUnit_Types();

	/**
	 * Returns the meta object for the reference list '{@link de.silvawb.java.JCompilationUnit#getImportedPackages <em>Imported Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imported Packages</em>'.
	 * @see de.silvawb.java.JCompilationUnit#getImportedPackages()
	 * @see #getJCompilationUnit()
	 * @generated
	 */
	EReference getJCompilationUnit_ImportedPackages();

	/**
	 * Returns the meta object for the reference list '{@link de.silvawb.java.JCompilationUnit#getImportedTypes <em>Imported Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imported Types</em>'.
	 * @see de.silvawb.java.JCompilationUnit#getImportedTypes()
	 * @see #getJCompilationUnit()
	 * @generated
	 */
	EReference getJCompilationUnit_ImportedTypes();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.java.JCompilationUnit#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see de.silvawb.java.JCompilationUnit#getPackage()
	 * @see #getJCompilationUnit()
	 * @generated
	 */
	EReference getJCompilationUnit_Package();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.JField <em>JField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JField</em>'.
	 * @see de.silvawb.java.JField
	 * @generated
	 */
	EClass getJField();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.JField#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see de.silvawb.java.JField#isFinal()
	 * @see #getJField()
	 * @generated
	 */
	EAttribute getJField_Final();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.JField#isTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see de.silvawb.java.JField#isTransient()
	 * @see #getJField()
	 * @generated
	 */
	EAttribute getJField_Transient();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.JField#isVolatile <em>Volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volatile</em>'.
	 * @see de.silvawb.java.JField#isVolatile()
	 * @see #getJField()
	 * @generated
	 */
	EAttribute getJField_Volatile();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.JField#getJavaField <em>Java Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Field</em>'.
	 * @see de.silvawb.java.JField#getJavaField()
	 * @see #getJField()
	 * @generated
	 */
	EAttribute getJField_JavaField();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.JField#getInitializer <em>Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initializer</em>'.
	 * @see de.silvawb.java.JField#getInitializer()
	 * @see #getJField()
	 * @generated
	 */
	EAttribute getJField_Initializer();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.java.JField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.silvawb.java.JField#getType()
	 * @see #getJField()
	 * @generated
	 */
	EReference getJField_Type();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.JInitializer <em>JInitializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JInitializer</em>'.
	 * @see de.silvawb.java.JInitializer
	 * @generated
	 */
	EClass getJInitializer();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.JInitializer#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see de.silvawb.java.JInitializer#getBody()
	 * @see #getJInitializer()
	 * @generated
	 */
	EAttribute getJInitializer_Body();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.JMember <em>JMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JMember</em>'.
	 * @see de.silvawb.java.JMember
	 * @generated
	 */
	EClass getJMember();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.JMember#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see de.silvawb.java.JMember#isStatic()
	 * @see #getJMember()
	 * @generated
	 */
	EAttribute getJMember_Static();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.JMember#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see de.silvawb.java.JMember#getVisibility()
	 * @see #getJMember()
	 * @generated
	 */
	EAttribute getJMember_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.JMember#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see de.silvawb.java.JMember#getComment()
	 * @see #getJMember()
	 * @generated
	 */
	EAttribute getJMember_Comment();

	/**
	 * Returns the meta object for the container reference '{@link de.silvawb.java.JMember#getContainingType <em>Containing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Containing Type</em>'.
	 * @see de.silvawb.java.JMember#getContainingType()
	 * @see #getJMember()
	 * @generated
	 */
	EReference getJMember_ContainingType();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.JMethod <em>JMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JMethod</em>'.
	 * @see de.silvawb.java.JMethod
	 * @generated
	 */
	EClass getJMethod();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.JMethod#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see de.silvawb.java.JMethod#isAbstract()
	 * @see #getJMethod()
	 * @generated
	 */
	EAttribute getJMethod_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.JMethod#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see de.silvawb.java.JMethod#isFinal()
	 * @see #getJMethod()
	 * @generated
	 */
	EAttribute getJMethod_Final();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.JMethod#isNative <em>Native</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Native</em>'.
	 * @see de.silvawb.java.JMethod#isNative()
	 * @see #getJMethod()
	 * @generated
	 */
	EAttribute getJMethod_Native();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.JMethod#isSynchronized <em>Synchronized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchronized</em>'.
	 * @see de.silvawb.java.JMethod#isSynchronized()
	 * @see #getJMethod()
	 * @generated
	 */
	EAttribute getJMethod_Synchronized();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.JMethod#getJavaMethod <em>Java Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Method</em>'.
	 * @see de.silvawb.java.JMethod#getJavaMethod()
	 * @see #getJMethod()
	 * @generated
	 */
	EAttribute getJMethod_JavaMethod();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.JMethod#isConstructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constructor</em>'.
	 * @see de.silvawb.java.JMethod#isConstructor()
	 * @see #getJMethod()
	 * @generated
	 */
	EAttribute getJMethod_Constructor();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.JMethod#getJavaConstructor <em>Java Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Constructor</em>'.
	 * @see de.silvawb.java.JMethod#getJavaConstructor()
	 * @see #getJMethod()
	 * @generated
	 */
	EAttribute getJMethod_JavaConstructor();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.JMethod#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see de.silvawb.java.JMethod#getBody()
	 * @see #getJMethod()
	 * @generated
	 */
	EAttribute getJMethod_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link de.silvawb.java.JMethod#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see de.silvawb.java.JMethod#getParameters()
	 * @see #getJMethod()
	 * @generated
	 */
	EReference getJMethod_Parameters();

	/**
	 * Returns the meta object for the reference list '{@link de.silvawb.java.JMethod#getExceptions <em>Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exceptions</em>'.
	 * @see de.silvawb.java.JMethod#getExceptions()
	 * @see #getJMethod()
	 * @generated
	 */
	EReference getJMethod_Exceptions();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.java.JMethod#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see de.silvawb.java.JMethod#getReturnType()
	 * @see #getJMethod()
	 * @generated
	 */
	EReference getJMethod_ReturnType();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.JModelElement <em>JModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JModel Element</em>'.
	 * @see de.silvawb.java.JModelElement
	 * @generated
	 */
	EClass getJModelElement();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.JModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.silvawb.java.JModelElement#getName()
	 * @see #getJModelElement()
	 * @generated
	 */
	EAttribute getJModelElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.JModelElement#getJNode <em>JNode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>JNode</em>'.
	 * @see de.silvawb.java.JModelElement#getJNode()
	 * @see #getJModelElement()
	 * @generated
	 */
	EAttribute getJModelElement_JNode();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.JPackage <em>JPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JPackage</em>'.
	 * @see de.silvawb.java.JPackage
	 * @generated
	 */
	EClass getJPackage();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.JPackage#getJavaPackage <em>Java Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Package</em>'.
	 * @see de.silvawb.java.JPackage#getJavaPackage()
	 * @see #getJPackage()
	 * @generated
	 */
	EAttribute getJPackage_JavaPackage();

	/**
	 * Returns the meta object for the reference list '{@link de.silvawb.java.JPackage#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Types</em>'.
	 * @see de.silvawb.java.JPackage#getTypes()
	 * @see #getJPackage()
	 * @generated
	 */
	EReference getJPackage_Types();

	/**
	 * Returns the meta object for class '{@link de.silvawb.java.JParameter <em>JParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JParameter</em>'.
	 * @see de.silvawb.java.JParameter
	 * @generated
	 */
	EClass getJParameter();

	/**
	 * Returns the meta object for the attribute '{@link de.silvawb.java.JParameter#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see de.silvawb.java.JParameter#isFinal()
	 * @see #getJParameter()
	 * @generated
	 */
	EAttribute getJParameter_Final();

	/**
	 * Returns the meta object for the container reference '{@link de.silvawb.java.JParameter#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Method</em>'.
	 * @see de.silvawb.java.JParameter#getMethod()
	 * @see #getJParameter()
	 * @generated
	 */
	EReference getJParameter_Method();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.java.JParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.silvawb.java.JParameter#getType()
	 * @see #getJParameter()
	 * @generated
	 */
	EReference getJParameter_Type();

	/**
	 * Returns the meta object for enum '{@link de.silvawb.java.JVisibility <em>JVisibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>JVisibility</em>'.
	 * @see de.silvawb.java.JVisibility
	 * @generated
	 */
	EEnum getJVisibility();

	/**
	 * Returns the meta object for data type '{@link java.lang.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Class</em>'.
	 * @see java.lang.Class
	 * @model instanceClass="java.lang.Class" serializeable="false" typeParameters="T"
	 * @generated
	 */
	EDataType getJavaClass();

	/**
	 * Returns the meta object for data type '{@link java.lang.reflect.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Constructor</em>'.
	 * @see java.lang.reflect.Constructor
	 * @model instanceClass="java.lang.reflect.Constructor" serializeable="false" typeParameters="T"
	 * @generated
	 */
	EDataType getJavaConstructor();

	/**
	 * Returns the meta object for data type '{@link java.lang.reflect.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Field</em>'.
	 * @see java.lang.reflect.Field
	 * @model instanceClass="java.lang.reflect.Field" serializeable="false"
	 * @generated
	 */
	EDataType getJavaField();

	/**
	 * Returns the meta object for data type '{@link java.lang.reflect.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Method</em>'.
	 * @see java.lang.reflect.Method
	 * @model instanceClass="java.lang.reflect.Method" serializeable="false"
	 * @generated
	 */
	EDataType getJavaMethod();

	/**
	 * Returns the meta object for data type '{@link java.lang.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Package</em>'.
	 * @see java.lang.Package
	 * @model instanceClass="java.lang.Package"
	 * @generated
	 */
	EDataType getJavaPackage();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>JNode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>JNode</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object" serializeable="false"
	 * @generated
	 */
	EDataType getJNode();

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
		 * The meta object literal for the '{@link de.silvawb.java.impl.JClassImpl <em>JClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.impl.JClassImpl
		 * @see de.silvawb.java.impl.JavaPackageImpl#getJClass()
		 * @generated
		 */
		EClass JCLASS = eINSTANCE.getJClass();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JCLASS__ABSTRACT = eINSTANCE.getJClass_Abstract();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JCLASS__FINAL = eINSTANCE.getJClass_Final();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JCLASS__INTERFACE = eINSTANCE.getJClass_Interface();

		/**
		 * The meta object literal for the '<em><b>Throwable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JCLASS__THROWABLE = eINSTANCE.getJClass_Throwable();

		/**
		 * The meta object literal for the '<em><b>Java Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JCLASS__JAVA_CLASS = eINSTANCE.getJClass_JavaClass();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__FIELDS = eINSTANCE.getJClass_Fields();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__METHODS = eINSTANCE.getJClass_Methods();

		/**
		 * The meta object literal for the '<em><b>Super Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__SUPER_TYPES = eINSTANCE.getJClass_SuperTypes();

		/**
		 * The meta object literal for the '<em><b>All Super Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__ALL_SUPER_TYPES = eINSTANCE.getJClass_AllSuperTypes();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__MEMBERS = eINSTANCE.getJClass_Members();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__COMPONENT_TYPE = eINSTANCE.getJClass_ComponentType();

		/**
		 * The meta object literal for the '<em><b>Array Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__ARRAY_TYPE = eINSTANCE.getJClass_ArrayType();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__UNIT = eINSTANCE.getJClass_Unit();

		/**
		 * The meta object literal for the '<em><b>All Methods</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__ALL_METHODS = eINSTANCE.getJClass_AllMethods();

		/**
		 * The meta object literal for the '<em><b>All Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__ALL_FIELDS = eINSTANCE.getJClass_AllFields();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__PACKAGE = eINSTANCE.getJClass_Package();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__TYPES = eINSTANCE.getJClass_Types();

		/**
		 * The meta object literal for the '<em><b>All Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__ALL_TYPES = eINSTANCE.getJClass_AllTypes();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.impl.JCompilationUnitImpl <em>JCompilation Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.impl.JCompilationUnitImpl
		 * @see de.silvawb.java.impl.JavaPackageImpl#getJCompilationUnit()
		 * @generated
		 */
		EClass JCOMPILATION_UNIT = eINSTANCE.getJCompilationUnit();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JCOMPILATION_UNIT__IMPORTS = eINSTANCE.getJCompilationUnit_Imports();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JCOMPILATION_UNIT__COMMENT = eINSTANCE.getJCompilationUnit_Comment();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCOMPILATION_UNIT__TYPES = eINSTANCE.getJCompilationUnit_Types();

		/**
		 * The meta object literal for the '<em><b>Imported Packages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCOMPILATION_UNIT__IMPORTED_PACKAGES = eINSTANCE.getJCompilationUnit_ImportedPackages();

		/**
		 * The meta object literal for the '<em><b>Imported Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCOMPILATION_UNIT__IMPORTED_TYPES = eINSTANCE.getJCompilationUnit_ImportedTypes();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCOMPILATION_UNIT__PACKAGE = eINSTANCE.getJCompilationUnit_Package();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.impl.JFieldImpl <em>JField</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.impl.JFieldImpl
		 * @see de.silvawb.java.impl.JavaPackageImpl#getJField()
		 * @generated
		 */
		EClass JFIELD = eINSTANCE.getJField();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFIELD__FINAL = eINSTANCE.getJField_Final();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFIELD__TRANSIENT = eINSTANCE.getJField_Transient();

		/**
		 * The meta object literal for the '<em><b>Volatile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFIELD__VOLATILE = eINSTANCE.getJField_Volatile();

		/**
		 * The meta object literal for the '<em><b>Java Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFIELD__JAVA_FIELD = eINSTANCE.getJField_JavaField();

		/**
		 * The meta object literal for the '<em><b>Initializer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFIELD__INITIALIZER = eINSTANCE.getJField_Initializer();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JFIELD__TYPE = eINSTANCE.getJField_Type();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.impl.JInitializerImpl <em>JInitializer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.impl.JInitializerImpl
		 * @see de.silvawb.java.impl.JavaPackageImpl#getJInitializer()
		 * @generated
		 */
		EClass JINITIALIZER = eINSTANCE.getJInitializer();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JINITIALIZER__BODY = eINSTANCE.getJInitializer_Body();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.impl.JMemberImpl <em>JMember</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.impl.JMemberImpl
		 * @see de.silvawb.java.impl.JavaPackageImpl#getJMember()
		 * @generated
		 */
		EClass JMEMBER = eINSTANCE.getJMember();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JMEMBER__STATIC = eINSTANCE.getJMember_Static();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JMEMBER__VISIBILITY = eINSTANCE.getJMember_Visibility();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JMEMBER__COMMENT = eINSTANCE.getJMember_Comment();

		/**
		 * The meta object literal for the '<em><b>Containing Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JMEMBER__CONTAINING_TYPE = eINSTANCE.getJMember_ContainingType();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.impl.JMethodImpl <em>JMethod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.impl.JMethodImpl
		 * @see de.silvawb.java.impl.JavaPackageImpl#getJMethod()
		 * @generated
		 */
		EClass JMETHOD = eINSTANCE.getJMethod();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JMETHOD__ABSTRACT = eINSTANCE.getJMethod_Abstract();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JMETHOD__FINAL = eINSTANCE.getJMethod_Final();

		/**
		 * The meta object literal for the '<em><b>Native</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JMETHOD__NATIVE = eINSTANCE.getJMethod_Native();

		/**
		 * The meta object literal for the '<em><b>Synchronized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JMETHOD__SYNCHRONIZED = eINSTANCE.getJMethod_Synchronized();

		/**
		 * The meta object literal for the '<em><b>Java Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JMETHOD__JAVA_METHOD = eINSTANCE.getJMethod_JavaMethod();

		/**
		 * The meta object literal for the '<em><b>Constructor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JMETHOD__CONSTRUCTOR = eINSTANCE.getJMethod_Constructor();

		/**
		 * The meta object literal for the '<em><b>Java Constructor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JMETHOD__JAVA_CONSTRUCTOR = eINSTANCE.getJMethod_JavaConstructor();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JMETHOD__BODY = eINSTANCE.getJMethod_Body();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JMETHOD__PARAMETERS = eINSTANCE.getJMethod_Parameters();

		/**
		 * The meta object literal for the '<em><b>Exceptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JMETHOD__EXCEPTIONS = eINSTANCE.getJMethod_Exceptions();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JMETHOD__RETURN_TYPE = eINSTANCE.getJMethod_ReturnType();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.impl.JModelElementImpl <em>JModel Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.impl.JModelElementImpl
		 * @see de.silvawb.java.impl.JavaPackageImpl#getJModelElement()
		 * @generated
		 */
		EClass JMODEL_ELEMENT = eINSTANCE.getJModelElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JMODEL_ELEMENT__NAME = eINSTANCE.getJModelElement_Name();

		/**
		 * The meta object literal for the '<em><b>JNode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JMODEL_ELEMENT__JNODE = eINSTANCE.getJModelElement_JNode();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.impl.JPackageImpl <em>JPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.impl.JPackageImpl
		 * @see de.silvawb.java.impl.JavaPackageImpl#getJPackage()
		 * @generated
		 */
		EClass JPACKAGE = eINSTANCE.getJPackage();

		/**
		 * The meta object literal for the '<em><b>Java Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JPACKAGE__JAVA_PACKAGE = eINSTANCE.getJPackage_JavaPackage();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JPACKAGE__TYPES = eINSTANCE.getJPackage_Types();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.impl.JParameterImpl <em>JParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.impl.JParameterImpl
		 * @see de.silvawb.java.impl.JavaPackageImpl#getJParameter()
		 * @generated
		 */
		EClass JPARAMETER = eINSTANCE.getJParameter();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JPARAMETER__FINAL = eINSTANCE.getJParameter_Final();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JPARAMETER__METHOD = eINSTANCE.getJParameter_Method();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JPARAMETER__TYPE = eINSTANCE.getJParameter_Type();

		/**
		 * The meta object literal for the '{@link de.silvawb.java.JVisibility <em>JVisibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.java.JVisibility
		 * @see de.silvawb.java.impl.JavaPackageImpl#getJVisibility()
		 * @generated
		 */
		EEnum JVISIBILITY = eINSTANCE.getJVisibility();

		/**
		 * The meta object literal for the '<em>Class</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Class
		 * @see de.silvawb.java.impl.JavaPackageImpl#getJavaClass()
		 * @generated
		 */
		EDataType JAVA_CLASS = eINSTANCE.getJavaClass();

		/**
		 * The meta object literal for the '<em>Constructor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.reflect.Constructor
		 * @see de.silvawb.java.impl.JavaPackageImpl#getJavaConstructor()
		 * @generated
		 */
		EDataType JAVA_CONSTRUCTOR = eINSTANCE.getJavaConstructor();

		/**
		 * The meta object literal for the '<em>Field</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.reflect.Field
		 * @see de.silvawb.java.impl.JavaPackageImpl#getJavaField()
		 * @generated
		 */
		EDataType JAVA_FIELD = eINSTANCE.getJavaField();

		/**
		 * The meta object literal for the '<em>Method</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.reflect.Method
		 * @see de.silvawb.java.impl.JavaPackageImpl#getJavaMethod()
		 * @generated
		 */
		EDataType JAVA_METHOD = eINSTANCE.getJavaMethod();

		/**
		 * The meta object literal for the '<em>Package</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Package
		 * @see de.silvawb.java.impl.JavaPackageImpl#getJavaPackage()
		 * @generated
		 */
		EDataType JAVA_PACKAGE = eINSTANCE.getJavaPackage();

		/**
		 * The meta object literal for the '<em>JNode</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see de.silvawb.java.impl.JavaPackageImpl#getJNode()
		 * @generated
		 */
		EDataType JNODE = eINSTANCE.getJNode();

	}

} //JavaPackage
