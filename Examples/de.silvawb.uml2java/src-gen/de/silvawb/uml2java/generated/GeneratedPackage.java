/**
 */
package de.silvawb.uml2java.generated;

import de.mdelab.mltgg.mote2.operationalTGG.OperationalTGGPackage;

import de.mdelab.mltgg.mote2.sdm.SdmPackage;

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
 * @see de.silvawb.uml2java.generated.GeneratedFactory
 * @model kind="package"
 * @generated
 */
public interface GeneratedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "generated";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tu-berlin.de/silvawb/uml2java/generated";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.silvawb.uml2java.generated";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeneratedPackage eINSTANCE = de.silvawb.uml2java.generated.impl.GeneratedPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.silvawb.uml2java.generated.impl.uml2javaOperationalTGGImpl <em>uml2java Operational TGG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.uml2java.generated.impl.uml2javaOperationalTGGImpl
	 * @see de.silvawb.uml2java.generated.impl.GeneratedPackageImpl#getuml2javaOperationalTGG()
	 * @generated
	 */
	int UML2JAVA_OPERATIONAL_TGG = 0;

	/**
	 * The feature id for the '<em><b>Operational Axiom Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_OPERATIONAL_TGG__OPERATIONAL_AXIOM_GROUP = SdmPackage.SDM_OPERATIONAL_TGG__OPERATIONAL_AXIOM_GROUP;

	/**
	 * The feature id for the '<em><b>Operational Rule Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_OPERATIONAL_TGG__OPERATIONAL_RULE_GROUPS = SdmPackage.SDM_OPERATIONAL_TGG__OPERATIONAL_RULE_GROUPS;

	/**
	 * The feature id for the '<em><b>Tgg Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_OPERATIONAL_TGG__TGG_ENGINE = SdmPackage.SDM_OPERATIONAL_TGG__TGG_ENGINE;

	/**
	 * The feature id for the '<em><b>Tgg ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_OPERATIONAL_TGG__TGG_ID = SdmPackage.SDM_OPERATIONAL_TGG__TGG_ID;

	/**
	 * The feature id for the '<em><b>Unidirectional References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_OPERATIONAL_TGG__UNIDIRECTIONAL_REFERENCES = SdmPackage.SDM_OPERATIONAL_TGG__UNIDIRECTIONAL_REFERENCES;

	/**
	 * The feature id for the '<em><b>Interpreter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_OPERATIONAL_TGG__INTERPRETER = SdmPackage.SDM_OPERATIONAL_TGG__INTERPRETER;

	/**
	 * The number of structural features of the '<em>uml2java Operational TGG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_OPERATIONAL_TGG_FEATURE_COUNT = SdmPackage.SDM_OPERATIONAL_TGG_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Transformation Started</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_OPERATIONAL_TGG___TRANSFORMATION_STARTED = SdmPackage.SDM_OPERATIONAL_TGG___TRANSFORMATION_STARTED;

	/**
	 * The operation id for the '<em>Transformation Finished</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_OPERATIONAL_TGG___TRANSFORMATION_FINISHED = SdmPackage.SDM_OPERATIONAL_TGG___TRANSFORMATION_FINISHED;

	/**
	 * The operation id for the '<em>Get Operational Mapping Group</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_OPERATIONAL_TGG___GET_OPERATIONAL_MAPPING_GROUP__STRING = SdmPackage.SDM_OPERATIONAL_TGG___GET_OPERATIONAL_MAPPING_GROUP__STRING;

	/**
	 * The operation id for the '<em>Execute Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_OPERATIONAL_TGG___EXECUTE_ACTIVITY__ACTIVITY_EMAP = SdmPackage.SDM_OPERATIONAL_TGG___EXECUTE_ACTIVITY__ACTIVITY_EMAP;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_OPERATIONAL_TGG___INIT = SdmPackage.SDM_OPERATIONAL_TGG___INIT;

	/**
	 * The number of operations of the '<em>uml2java Operational TGG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_OPERATIONAL_TGG_OPERATION_COUNT = SdmPackage.SDM_OPERATIONAL_TGG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.uml2java.generated.impl.uml2javaAxiomImpl <em>uml2java Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.uml2java.generated.impl.uml2javaAxiomImpl
	 * @see de.silvawb.uml2java.generated.impl.GeneratedPackageImpl#getuml2javaAxiom()
	 * @generated
	 */
	int UML2JAVA_AXIOM = 1;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_AXIOM__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Axioms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_AXIOM__AXIOMS = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP__AXIOMS;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_AXIOM__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>uml2java Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_AXIOM_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_AXIOM___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>uml2java Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_AXIOM_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.uml2java.generated.impl.uPackage2jPackage_RuleImpl <em>uPackage2j Package Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.uml2java.generated.impl.uPackage2jPackage_RuleImpl
	 * @see de.silvawb.uml2java.generated.impl.GeneratedPackageImpl#getuPackage2jPackage_Rule()
	 * @generated
	 */
	int UPACKAGE2J_PACKAGE_RULE = 2;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>uPackage2j Package Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>uPackage2j Package Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.uml2java.generated.impl.uml2javaAxiom_r1Impl <em>uml2java Axiom r1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.uml2java.generated.impl.uml2javaAxiom_r1Impl
	 * @see de.silvawb.uml2java.generated.impl.GeneratedPackageImpl#getuml2javaAxiom_r1()
	 * @generated
	 */
	int UML2JAVA_AXIOM_R1 = 3;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_AXIOM_R1__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_AXIOM__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_AXIOM_R1__RULE_ID = OperationalTGGPackage.OPERATIONAL_AXIOM__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Axiom Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_AXIOM_R1__OPERATIONAL_AXIOM_GROUP = OperationalTGGPackage.OPERATIONAL_AXIOM__OPERATIONAL_AXIOM_GROUP;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_AXIOM_R1__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_AXIOM_R1__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_AXIOM_R1__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_AXIOM_R1__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_AXIOM_R1__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_AXIOM_R1__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_AXIOM_R1__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_AXIOM_R1__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>uml2java Axiom r1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_AXIOM_R1_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_AXIOM_R1___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_AXIOM___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_AXIOM_R1___ADD_ELEMENT__EMAP_ELIST_ELIST = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_AXIOM_R1___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_AXIOM_R1___TRANSFORM_FORWARD__ELIST_ELIST_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_AXIOM_R1___TRANSFORM_MAPPING__ELIST_ELIST_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_AXIOM_R1___TRANSFORM_BACKWARD__ELIST_ELIST_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_AXIOM_R1___SYNCHRONIZE_FORWARD__ELIST_ELIST_TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_AXIOM_R1___SYNCHRONIZE_BACKWARD__ELIST_ELIST_TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 6;

	/**
	 * The number of operations of the '<em>uml2java Axiom r1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML2JAVA_AXIOM_R1_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link de.silvawb.uml2java.generated.impl.uPackage2jPackage_Rule_r2Impl <em>uPackage2j Package Rule r2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.uml2java.generated.impl.uPackage2jPackage_Rule_r2Impl
	 * @see de.silvawb.uml2java.generated.impl.GeneratedPackageImpl#getuPackage2jPackage_Rule_r2()
	 * @generated
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2 = 4;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>uPackage2j Package Rule r2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>uPackage2j Package Rule r2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPACKAGE2J_PACKAGE_RULE_R2_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * Returns the meta object for class '{@link de.silvawb.uml2java.generated.uml2javaOperationalTGG <em>uml2java Operational TGG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uml2java Operational TGG</em>'.
	 * @see de.silvawb.uml2java.generated.uml2javaOperationalTGG
	 * @generated
	 */
	EClass getuml2javaOperationalTGG();

	/**
	 * Returns the meta object for class '{@link de.silvawb.uml2java.generated.uml2javaAxiom <em>uml2java Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uml2java Axiom</em>'.
	 * @see de.silvawb.uml2java.generated.uml2javaAxiom
	 * @generated
	 */
	EClass getuml2javaAxiom();

	/**
	 * Returns the meta object for class '{@link de.silvawb.uml2java.generated.uPackage2jPackage_Rule <em>uPackage2j Package Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uPackage2j Package Rule</em>'.
	 * @see de.silvawb.uml2java.generated.uPackage2jPackage_Rule
	 * @generated
	 */
	EClass getuPackage2jPackage_Rule();

	/**
	 * Returns the meta object for class '{@link de.silvawb.uml2java.generated.uml2javaAxiom_r1 <em>uml2java Axiom r1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uml2java Axiom r1</em>'.
	 * @see de.silvawb.uml2java.generated.uml2javaAxiom_r1
	 * @generated
	 */
	EClass getuml2javaAxiom_r1();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uml2javaAxiom_r1#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uml2javaAxiom_r1#getAddElementActivity()
	 * @see #getuml2javaAxiom_r1()
	 * @generated
	 */
	EReference getuml2javaAxiom_r1_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uml2javaAxiom_r1#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uml2javaAxiom_r1#getMoveElementActivity()
	 * @see #getuml2javaAxiom_r1()
	 * @generated
	 */
	EReference getuml2javaAxiom_r1_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uml2javaAxiom_r1#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uml2javaAxiom_r1#getChangeAttributeActivity()
	 * @see #getuml2javaAxiom_r1()
	 * @generated
	 */
	EReference getuml2javaAxiom_r1_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uml2javaAxiom_r1#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uml2javaAxiom_r1#getTransformForwardActivity()
	 * @see #getuml2javaAxiom_r1()
	 * @generated
	 */
	EReference getuml2javaAxiom_r1_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uml2javaAxiom_r1#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uml2javaAxiom_r1#getTransformMappingActivity()
	 * @see #getuml2javaAxiom_r1()
	 * @generated
	 */
	EReference getuml2javaAxiom_r1_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uml2javaAxiom_r1#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uml2javaAxiom_r1#getTransformBackwardActivity()
	 * @see #getuml2javaAxiom_r1()
	 * @generated
	 */
	EReference getuml2javaAxiom_r1_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uml2javaAxiom_r1#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uml2javaAxiom_r1#getSynchronizeForwardActivity()
	 * @see #getuml2javaAxiom_r1()
	 * @generated
	 */
	EReference getuml2javaAxiom_r1_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uml2javaAxiom_r1#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uml2javaAxiom_r1#getSynchronizeBackwardActivity()
	 * @see #getuml2javaAxiom_r1()
	 * @generated
	 */
	EReference getuml2javaAxiom_r1_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uml2javaAxiom_r1#addElement(org.eclipse.emf.common.util.EMap, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.silvawb.uml2java.generated.uml2javaAxiom_r1#addElement(org.eclipse.emf.common.util.EMap, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getuml2javaAxiom_r1__AddElement__EMap_EList_EList();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uml2javaAxiom_r1#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.silvawb.uml2java.generated.uml2javaAxiom_r1#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuml2javaAxiom_r1__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uml2javaAxiom_r1#transformForward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uml2javaAxiom_r1#transformForward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getuml2javaAxiom_r1__TransformForward__EList_EList_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uml2javaAxiom_r1#transformMapping(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.silvawb.uml2java.generated.uml2javaAxiom_r1#transformMapping(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getuml2javaAxiom_r1__TransformMapping__EList_EList_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uml2javaAxiom_r1#transformBackward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uml2javaAxiom_r1#transformBackward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getuml2javaAxiom_r1__TransformBackward__EList_EList_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uml2javaAxiom_r1#synchronizeForward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uml2javaAxiom_r1#synchronizeForward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuml2javaAxiom_r1__SynchronizeForward__EList_EList_TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uml2javaAxiom_r1#synchronizeBackward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uml2javaAxiom_r1#synchronizeBackward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuml2javaAxiom_r1__SynchronizeBackward__EList_EList_TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2 <em>uPackage2j Package Rule r2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uPackage2j Package Rule r2</em>'.
	 * @see de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2
	 * @generated
	 */
	EClass getuPackage2jPackage_Rule_r2();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#getAddElementActivity()
	 * @see #getuPackage2jPackage_Rule_r2()
	 * @generated
	 */
	EReference getuPackage2jPackage_Rule_r2_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#getMoveElementActivity()
	 * @see #getuPackage2jPackage_Rule_r2()
	 * @generated
	 */
	EReference getuPackage2jPackage_Rule_r2_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#getChangeAttributeActivity()
	 * @see #getuPackage2jPackage_Rule_r2()
	 * @generated
	 */
	EReference getuPackage2jPackage_Rule_r2_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#getTransformForwardActivity()
	 * @see #getuPackage2jPackage_Rule_r2()
	 * @generated
	 */
	EReference getuPackage2jPackage_Rule_r2_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#getTransformMappingActivity()
	 * @see #getuPackage2jPackage_Rule_r2()
	 * @generated
	 */
	EReference getuPackage2jPackage_Rule_r2_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#getTransformBackwardActivity()
	 * @see #getuPackage2jPackage_Rule_r2()
	 * @generated
	 */
	EReference getuPackage2jPackage_Rule_r2_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#getConflictCheckForwardActivity()
	 * @see #getuPackage2jPackage_Rule_r2()
	 * @generated
	 */
	EReference getuPackage2jPackage_Rule_r2_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#getConflictCheckMappingActivity()
	 * @see #getuPackage2jPackage_Rule_r2()
	 * @generated
	 */
	EReference getuPackage2jPackage_Rule_r2_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#getConflictCheckBackwardActivity()
	 * @see #getuPackage2jPackage_Rule_r2()
	 * @generated
	 */
	EReference getuPackage2jPackage_Rule_r2_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#getSynchronizeForwardActivity()
	 * @see #getuPackage2jPackage_Rule_r2()
	 * @generated
	 */
	EReference getuPackage2jPackage_Rule_r2_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#getSynchronizeBackwardActivity()
	 * @see #getuPackage2jPackage_Rule_r2()
	 * @generated
	 */
	EReference getuPackage2jPackage_Rule_r2_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#getRepairForwardActivity()
	 * @see #getuPackage2jPackage_Rule_r2()
	 * @generated
	 */
	EReference getuPackage2jPackage_Rule_r2_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#getRepairBackwardActivity()
	 * @see #getuPackage2jPackage_Rule_r2()
	 * @generated
	 */
	EReference getuPackage2jPackage_Rule_r2_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuPackage2jPackage_Rule_r2__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuPackage2jPackage_Rule_r2__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuPackage2jPackage_Rule_r2__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuPackage2jPackage_Rule_r2__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuPackage2jPackage_Rule_r2__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuPackage2jPackage_Rule_r2__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuPackage2jPackage_Rule_r2__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuPackage2jPackage_Rule_r2__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuPackage2jPackage_Rule_r2__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuPackage2jPackage_Rule_r2__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuPackage2jPackage_Rule_r2__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuPackage2jPackage_Rule_r2__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuPackage2jPackage_Rule_r2__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeneratedFactory getGeneratedFactory();

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
		 * The meta object literal for the '{@link de.silvawb.uml2java.generated.impl.uml2javaOperationalTGGImpl <em>uml2java Operational TGG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.uml2java.generated.impl.uml2javaOperationalTGGImpl
		 * @see de.silvawb.uml2java.generated.impl.GeneratedPackageImpl#getuml2javaOperationalTGG()
		 * @generated
		 */
		EClass UML2JAVA_OPERATIONAL_TGG = eINSTANCE.getuml2javaOperationalTGG();

		/**
		 * The meta object literal for the '{@link de.silvawb.uml2java.generated.impl.uml2javaAxiomImpl <em>uml2java Axiom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.uml2java.generated.impl.uml2javaAxiomImpl
		 * @see de.silvawb.uml2java.generated.impl.GeneratedPackageImpl#getuml2javaAxiom()
		 * @generated
		 */
		EClass UML2JAVA_AXIOM = eINSTANCE.getuml2javaAxiom();

		/**
		 * The meta object literal for the '{@link de.silvawb.uml2java.generated.impl.uPackage2jPackage_RuleImpl <em>uPackage2j Package Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.uml2java.generated.impl.uPackage2jPackage_RuleImpl
		 * @see de.silvawb.uml2java.generated.impl.GeneratedPackageImpl#getuPackage2jPackage_Rule()
		 * @generated
		 */
		EClass UPACKAGE2J_PACKAGE_RULE = eINSTANCE.getuPackage2jPackage_Rule();

		/**
		 * The meta object literal for the '{@link de.silvawb.uml2java.generated.impl.uml2javaAxiom_r1Impl <em>uml2java Axiom r1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.uml2java.generated.impl.uml2javaAxiom_r1Impl
		 * @see de.silvawb.uml2java.generated.impl.GeneratedPackageImpl#getuml2javaAxiom_r1()
		 * @generated
		 */
		EClass UML2JAVA_AXIOM_R1 = eINSTANCE.getuml2javaAxiom_r1();

		/**
		 * The meta object literal for the '<em><b>Add Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML2JAVA_AXIOM_R1__ADD_ELEMENT_ACTIVITY = eINSTANCE.getuml2javaAxiom_r1_AddElementActivity();

		/**
		 * The meta object literal for the '<em><b>Move Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML2JAVA_AXIOM_R1__MOVE_ELEMENT_ACTIVITY = eINSTANCE.getuml2javaAxiom_r1_MoveElementActivity();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML2JAVA_AXIOM_R1__CHANGE_ATTRIBUTE_ACTIVITY = eINSTANCE
				.getuml2javaAxiom_r1_ChangeAttributeActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML2JAVA_AXIOM_R1__TRANSFORM_FORWARD_ACTIVITY = eINSTANCE
				.getuml2javaAxiom_r1_TransformForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML2JAVA_AXIOM_R1__TRANSFORM_MAPPING_ACTIVITY = eINSTANCE
				.getuml2javaAxiom_r1_TransformMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML2JAVA_AXIOM_R1__TRANSFORM_BACKWARD_ACTIVITY = eINSTANCE
				.getuml2javaAxiom_r1_TransformBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML2JAVA_AXIOM_R1__SYNCHRONIZE_FORWARD_ACTIVITY = eINSTANCE
				.getuml2javaAxiom_r1_SynchronizeForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML2JAVA_AXIOM_R1__SYNCHRONIZE_BACKWARD_ACTIVITY = eINSTANCE
				.getuml2javaAxiom_r1_SynchronizeBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML2JAVA_AXIOM_R1___ADD_ELEMENT__EMAP_ELIST_ELIST = eINSTANCE
				.getuml2javaAxiom_r1__AddElement__EMap_EList_EList();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML2JAVA_AXIOM_R1___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = eINSTANCE
				.getuml2javaAxiom_r1__ChangeAttributeValues__TGGNode_EMap();

		/**
		 * The meta object literal for the '<em><b>Transform Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML2JAVA_AXIOM_R1___TRANSFORM_FORWARD__ELIST_ELIST_BOOLEAN = eINSTANCE
				.getuml2javaAxiom_r1__TransformForward__EList_EList_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML2JAVA_AXIOM_R1___TRANSFORM_MAPPING__ELIST_ELIST_BOOLEAN = eINSTANCE
				.getuml2javaAxiom_r1__TransformMapping__EList_EList_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML2JAVA_AXIOM_R1___TRANSFORM_BACKWARD__ELIST_ELIST_BOOLEAN = eINSTANCE
				.getuml2javaAxiom_r1__TransformBackward__EList_EList_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML2JAVA_AXIOM_R1___SYNCHRONIZE_FORWARD__ELIST_ELIST_TGGNODE_BOOLEAN = eINSTANCE
				.getuml2javaAxiom_r1__SynchronizeForward__EList_EList_TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML2JAVA_AXIOM_R1___SYNCHRONIZE_BACKWARD__ELIST_ELIST_TGGNODE_BOOLEAN = eINSTANCE
				.getuml2javaAxiom_r1__SynchronizeBackward__EList_EList_TGGNode_boolean();

		/**
		 * The meta object literal for the '{@link de.silvawb.uml2java.generated.impl.uPackage2jPackage_Rule_r2Impl <em>uPackage2j Package Rule r2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.uml2java.generated.impl.uPackage2jPackage_Rule_r2Impl
		 * @see de.silvawb.uml2java.generated.impl.GeneratedPackageImpl#getuPackage2jPackage_Rule_r2()
		 * @generated
		 */
		EClass UPACKAGE2J_PACKAGE_RULE_R2 = eINSTANCE.getuPackage2jPackage_Rule_r2();

		/**
		 * The meta object literal for the '<em><b>Add Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPACKAGE2J_PACKAGE_RULE_R2__ADD_ELEMENT_ACTIVITY = eINSTANCE
				.getuPackage2jPackage_Rule_r2_AddElementActivity();

		/**
		 * The meta object literal for the '<em><b>Move Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPACKAGE2J_PACKAGE_RULE_R2__MOVE_ELEMENT_ACTIVITY = eINSTANCE
				.getuPackage2jPackage_Rule_r2_MoveElementActivity();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPACKAGE2J_PACKAGE_RULE_R2__CHANGE_ATTRIBUTE_ACTIVITY = eINSTANCE
				.getuPackage2jPackage_Rule_r2_ChangeAttributeActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPACKAGE2J_PACKAGE_RULE_R2__TRANSFORM_FORWARD_ACTIVITY = eINSTANCE
				.getuPackage2jPackage_Rule_r2_TransformForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPACKAGE2J_PACKAGE_RULE_R2__TRANSFORM_MAPPING_ACTIVITY = eINSTANCE
				.getuPackage2jPackage_Rule_r2_TransformMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPACKAGE2J_PACKAGE_RULE_R2__TRANSFORM_BACKWARD_ACTIVITY = eINSTANCE
				.getuPackage2jPackage_Rule_r2_TransformBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPACKAGE2J_PACKAGE_RULE_R2__CONFLICT_CHECK_FORWARD_ACTIVITY = eINSTANCE
				.getuPackage2jPackage_Rule_r2_ConflictCheckForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPACKAGE2J_PACKAGE_RULE_R2__CONFLICT_CHECK_MAPPING_ACTIVITY = eINSTANCE
				.getuPackage2jPackage_Rule_r2_ConflictCheckMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPACKAGE2J_PACKAGE_RULE_R2__CONFLICT_CHECK_BACKWARD_ACTIVITY = eINSTANCE
				.getuPackage2jPackage_Rule_r2_ConflictCheckBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPACKAGE2J_PACKAGE_RULE_R2__SYNCHRONIZE_FORWARD_ACTIVITY = eINSTANCE
				.getuPackage2jPackage_Rule_r2_SynchronizeForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPACKAGE2J_PACKAGE_RULE_R2__SYNCHRONIZE_BACKWARD_ACTIVITY = eINSTANCE
				.getuPackage2jPackage_Rule_r2_SynchronizeBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPACKAGE2J_PACKAGE_RULE_R2__REPAIR_FORWARD_ACTIVITY = eINSTANCE
				.getuPackage2jPackage_Rule_r2_RepairForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPACKAGE2J_PACKAGE_RULE_R2__REPAIR_BACKWARD_ACTIVITY = eINSTANCE
				.getuPackage2jPackage_Rule_r2_RepairBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UPACKAGE2J_PACKAGE_RULE_R2___ADD_ELEMENT__EMAP = eINSTANCE
				.getuPackage2jPackage_Rule_r2__AddElement__EMap();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UPACKAGE2J_PACKAGE_RULE_R2___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = eINSTANCE
				.getuPackage2jPackage_Rule_r2__ChangeAttributeValues__TGGNode_EMap();

		/**
		 * The meta object literal for the '<em><b>Move Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UPACKAGE2J_PACKAGE_RULE_R2___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = eINSTANCE
				.getuPackage2jPackage_Rule_r2__MoveElement__TGGNode_TGGNode_TGGNode();

		/**
		 * The meta object literal for the '<em><b>Transform Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UPACKAGE2J_PACKAGE_RULE_R2___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getuPackage2jPackage_Rule_r2__TransformForward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UPACKAGE2J_PACKAGE_RULE_R2___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getuPackage2jPackage_Rule_r2__TransformMapping__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UPACKAGE2J_PACKAGE_RULE_R2___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getuPackage2jPackage_Rule_r2__TransformBackward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UPACKAGE2J_PACKAGE_RULE_R2___CONFLICT_CHECK_FORWARD__TGGNODE = eINSTANCE
				.getuPackage2jPackage_Rule_r2__ConflictCheckForward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UPACKAGE2J_PACKAGE_RULE_R2___CONFLICT_CHECK_MAPPING__TGGNODE = eINSTANCE
				.getuPackage2jPackage_Rule_r2__ConflictCheckMapping__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UPACKAGE2J_PACKAGE_RULE_R2___CONFLICT_CHECK_BACKWARD__TGGNODE = eINSTANCE
				.getuPackage2jPackage_Rule_r2__ConflictCheckBackward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UPACKAGE2J_PACKAGE_RULE_R2___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getuPackage2jPackage_Rule_r2__SynchronizeForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UPACKAGE2J_PACKAGE_RULE_R2___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getuPackage2jPackage_Rule_r2__SynchronizeBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UPACKAGE2J_PACKAGE_RULE_R2___REPAIR_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getuPackage2jPackage_Rule_r2__RepairForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UPACKAGE2J_PACKAGE_RULE_R2___REPAIR_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getuPackage2jPackage_Rule_r2__RepairBackward__TGGNode_boolean();

	}

} //GeneratedPackage
