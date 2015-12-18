/**
 */
package de.silvawb.umlContract2java.generated;

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
 * @see de.silvawb.umlContract2java.generated.GeneratedFactory
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
	String eNS_URI = "http://www.tu-berlin.de/silvawb/umlContract2java/1.0/generated";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.silvawb.umlContract2java.generated";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeneratedPackage eINSTANCE = de.silvawb.umlContract2java.generated.impl.GeneratedPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.silvawb.umlContract2java.generated.impl.umlContract2javaOperationalTGGImpl <em>uml Contract2java Operational TGG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlContract2java.generated.impl.umlContract2javaOperationalTGGImpl
	 * @see de.silvawb.umlContract2java.generated.impl.GeneratedPackageImpl#getumlContract2javaOperationalTGG()
	 * @generated
	 */
	int UML_CONTRACT2JAVA_OPERATIONAL_TGG = 0;

	/**
	 * The feature id for the '<em><b>Operational Axiom Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_OPERATIONAL_TGG__OPERATIONAL_AXIOM_GROUP = SdmPackage.SDM_OPERATIONAL_TGG__OPERATIONAL_AXIOM_GROUP;

	/**
	 * The feature id for the '<em><b>Operational Rule Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_OPERATIONAL_TGG__OPERATIONAL_RULE_GROUPS = SdmPackage.SDM_OPERATIONAL_TGG__OPERATIONAL_RULE_GROUPS;

	/**
	 * The feature id for the '<em><b>Tgg Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_OPERATIONAL_TGG__TGG_ENGINE = SdmPackage.SDM_OPERATIONAL_TGG__TGG_ENGINE;

	/**
	 * The feature id for the '<em><b>Tgg ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_OPERATIONAL_TGG__TGG_ID = SdmPackage.SDM_OPERATIONAL_TGG__TGG_ID;

	/**
	 * The feature id for the '<em><b>Unidirectional References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_OPERATIONAL_TGG__UNIDIRECTIONAL_REFERENCES = SdmPackage.SDM_OPERATIONAL_TGG__UNIDIRECTIONAL_REFERENCES;

	/**
	 * The feature id for the '<em><b>Interpreter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_OPERATIONAL_TGG__INTERPRETER = SdmPackage.SDM_OPERATIONAL_TGG__INTERPRETER;

	/**
	 * The number of structural features of the '<em>uml Contract2java Operational TGG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_OPERATIONAL_TGG_FEATURE_COUNT = SdmPackage.SDM_OPERATIONAL_TGG_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Transformation Started</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_OPERATIONAL_TGG___TRANSFORMATION_STARTED = SdmPackage.SDM_OPERATIONAL_TGG___TRANSFORMATION_STARTED;

	/**
	 * The operation id for the '<em>Transformation Finished</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_OPERATIONAL_TGG___TRANSFORMATION_FINISHED = SdmPackage.SDM_OPERATIONAL_TGG___TRANSFORMATION_FINISHED;

	/**
	 * The operation id for the '<em>Get Operational Mapping Group</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_OPERATIONAL_TGG___GET_OPERATIONAL_MAPPING_GROUP__STRING = SdmPackage.SDM_OPERATIONAL_TGG___GET_OPERATIONAL_MAPPING_GROUP__STRING;

	/**
	 * The operation id for the '<em>Execute Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_OPERATIONAL_TGG___EXECUTE_ACTIVITY__ACTIVITY_EMAP = SdmPackage.SDM_OPERATIONAL_TGG___EXECUTE_ACTIVITY__ACTIVITY_EMAP;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_OPERATIONAL_TGG___INIT = SdmPackage.SDM_OPERATIONAL_TGG___INIT;

	/**
	 * The number of operations of the '<em>uml Contract2java Operational TGG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_OPERATIONAL_TGG_OPERATION_COUNT = SdmPackage.SDM_OPERATIONAL_TGG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.umlContract2java.generated.impl.umlContract2javaAxiomImpl <em>uml Contract2java Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlContract2java.generated.impl.umlContract2javaAxiomImpl
	 * @see de.silvawb.umlContract2java.generated.impl.GeneratedPackageImpl#getumlContract2javaAxiom()
	 * @generated
	 */
	int UML_CONTRACT2JAVA_AXIOM = 1;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_AXIOM__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Axioms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_AXIOM__AXIOMS = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP__AXIOMS;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_AXIOM__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>uml Contract2java Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_AXIOM_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_AXIOM___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>uml Contract2java Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_AXIOM_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.umlContract2java.generated.impl.uOPPreInt2jMAPreAssertImpl <em>uOP Pre Int2j MA Pre Assert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlContract2java.generated.impl.uOPPreInt2jMAPreAssertImpl
	 * @see de.silvawb.umlContract2java.generated.impl.GeneratedPackageImpl#getuOPPreInt2jMAPreAssert()
	 * @generated
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT = 2;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>uOP Pre Int2j MA Pre Assert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>uOP Pre Int2j MA Pre Assert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.umlContract2java.generated.impl.uOperation2jMethod_HelperImpl <em>uOperation2j Method Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlContract2java.generated.impl.uOperation2jMethod_HelperImpl
	 * @see de.silvawb.umlContract2java.generated.impl.GeneratedPackageImpl#getuOperation2jMethod_Helper()
	 * @generated
	 */
	int UOPERATION2J_METHOD_HELPER = 3;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>uOperation2j Method Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>uOperation2j Method Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.umlContract2java.generated.impl.uCInv2jCInvImpl <em>uC Inv2j CInv</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlContract2java.generated.impl.uCInv2jCInvImpl
	 * @see de.silvawb.umlContract2java.generated.impl.GeneratedPackageImpl#getuCInv2jCInv()
	 * @generated
	 */
	int UC_INV2J_CINV = 4;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>uC Inv2j CInv</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>uC Inv2j CInv</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.umlContract2java.generated.impl.uOPPos2jMAPosImpl <em>uOP Pos2j MA Pos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlContract2java.generated.impl.uOPPos2jMAPosImpl
	 * @see de.silvawb.umlContract2java.generated.impl.GeneratedPackageImpl#getuOPPos2jMAPos()
	 * @generated
	 */
	int UOP_POS2J_MA_POS = 5;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>uOP Pos2j MA Pos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>uOP Pos2j MA Pos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.umlContract2java.generated.impl.uClass2jClass_HelperImpl <em>uClass2j Class Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlContract2java.generated.impl.uClass2jClass_HelperImpl
	 * @see de.silvawb.umlContract2java.generated.impl.GeneratedPackageImpl#getuClass2jClass_Helper()
	 * @generated
	 */
	int UCLASS2J_CLASS_HELPER = 6;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>uClass2j Class Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>uClass2j Class Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.umlContract2java.generated.impl.uOPPre2jMAPreImpl <em>uOP Pre2j MA Pre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlContract2java.generated.impl.uOPPre2jMAPreImpl
	 * @see de.silvawb.umlContract2java.generated.impl.GeneratedPackageImpl#getuOPPre2jMAPre()
	 * @generated
	 */
	int UOP_PRE2J_MA_PRE = 7;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>uOP Pre2j MA Pre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>uOP Pre2j MA Pre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.umlContract2java.generated.impl.uOPPosInt2jMAPosAssertImpl <em>uOP Pos Int2j MA Pos Assert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlContract2java.generated.impl.uOPPosInt2jMAPosAssertImpl
	 * @see de.silvawb.umlContract2java.generated.impl.GeneratedPackageImpl#getuOPPosInt2jMAPosAssert()
	 * @generated
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT = 8;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>uOP Pos Int2j MA Pos Assert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>uOP Pos Int2j MA Pos Assert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.umlContract2java.generated.impl.uProperty2jField_HelperImpl <em>uProperty2j Field Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlContract2java.generated.impl.uProperty2jField_HelperImpl
	 * @see de.silvawb.umlContract2java.generated.impl.GeneratedPackageImpl#getuProperty2jField_Helper()
	 * @generated
	 */
	int UPROPERTY2J_FIELD_HELPER = 9;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>uProperty2j Field Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>uProperty2j Field Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.umlContract2java.generated.impl.uCInvInt2jCInvAssertImpl <em>uC Inv Int2j CInv Assert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlContract2java.generated.impl.uCInvInt2jCInvAssertImpl
	 * @see de.silvawb.umlContract2java.generated.impl.GeneratedPackageImpl#getuCInvInt2jCInvAssert()
	 * @generated
	 */
	int UC_INV_INT2J_CINV_ASSERT = 10;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>uC Inv Int2j CInv Assert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>uC Inv Int2j CInv Assert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.umlContract2java.generated.impl.uOParamenter2jMArgumentImpl <em>uO Paramenter2j MArgument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlContract2java.generated.impl.uOParamenter2jMArgumentImpl
	 * @see de.silvawb.umlContract2java.generated.impl.GeneratedPackageImpl#getuOParamenter2jMArgument()
	 * @generated
	 */
	int UO_PARAMENTER2J_MARGUMENT = 11;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>uO Paramenter2j MArgument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>uO Paramenter2j MArgument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.umlContract2java.generated.impl.umlContract2javaAxiom_r1Impl <em>uml Contract2java Axiom r1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlContract2java.generated.impl.umlContract2javaAxiom_r1Impl
	 * @see de.silvawb.umlContract2java.generated.impl.GeneratedPackageImpl#getumlContract2javaAxiom_r1()
	 * @generated
	 */
	int UML_CONTRACT2JAVA_AXIOM_R1 = 12;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_AXIOM_R1__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_AXIOM__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_AXIOM_R1__RULE_ID = OperationalTGGPackage.OPERATIONAL_AXIOM__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Axiom Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_AXIOM_R1__OPERATIONAL_AXIOM_GROUP = OperationalTGGPackage.OPERATIONAL_AXIOM__OPERATIONAL_AXIOM_GROUP;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_AXIOM_R1__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_AXIOM_R1__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_AXIOM_R1__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_AXIOM_R1__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_AXIOM_R1__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_AXIOM_R1__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_AXIOM_R1__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_AXIOM_R1__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT
			+ 7;

	/**
	 * The number of structural features of the '<em>uml Contract2java Axiom r1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_AXIOM_R1_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_AXIOM_R1___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_AXIOM___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_AXIOM_R1___ADD_ELEMENT__EMAP_ELIST_ELIST = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_AXIOM_R1___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_AXIOM_R1___TRANSFORM_FORWARD__ELIST_ELIST_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_AXIOM_R1___TRANSFORM_MAPPING__ELIST_ELIST_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_AXIOM_R1___TRANSFORM_BACKWARD__ELIST_ELIST_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_AXIOM_R1___SYNCHRONIZE_FORWARD__ELIST_ELIST_TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_AXIOM_R1___SYNCHRONIZE_BACKWARD__ELIST_ELIST_TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 6;

	/**
	 * The number of operations of the '<em>uml Contract2java Axiom r1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONTRACT2JAVA_AXIOM_R1_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link de.silvawb.umlContract2java.generated.impl.uOParamenter2jMArgument_r4Impl <em>uO Paramenter2j MArgument r4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlContract2java.generated.impl.uOParamenter2jMArgument_r4Impl
	 * @see de.silvawb.umlContract2java.generated.impl.GeneratedPackageImpl#getuOParamenter2jMArgument_r4()
	 * @generated
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4 = 13;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>uO Paramenter2j MArgument r4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>uO Paramenter2j MArgument r4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_PARAMENTER2J_MARGUMENT_R4_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link de.silvawb.umlContract2java.generated.impl.uOPPreInt2jMAPreAssert_r7Impl <em>uOP Pre Int2j MA Pre Assert r7</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlContract2java.generated.impl.uOPPreInt2jMAPreAssert_r7Impl
	 * @see de.silvawb.umlContract2java.generated.impl.GeneratedPackageImpl#getuOPPreInt2jMAPreAssert_r7()
	 * @generated
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7 = 14;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>uOP Pre Int2j MA Pre Assert r7</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>uOP Pre Int2j MA Pre Assert r7</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE_INT2J_MA_PRE_ASSERT_R7_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link de.silvawb.umlContract2java.generated.impl.uCInv2jCInv_r9Impl <em>uC Inv2j CInv r9</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlContract2java.generated.impl.uCInv2jCInv_r9Impl
	 * @see de.silvawb.umlContract2java.generated.impl.GeneratedPackageImpl#getuCInv2jCInv_r9()
	 * @generated
	 */
	int UC_INV2J_CINV_R9 = 15;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>uC Inv2j CInv r9</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>uC Inv2j CInv r9</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV2J_CINV_R9_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link de.silvawb.umlContract2java.generated.impl.uCInvInt2jCInvAssert_r10Impl <em>uC Inv Int2j CInv Assert r10</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlContract2java.generated.impl.uCInvInt2jCInvAssert_r10Impl
	 * @see de.silvawb.umlContract2java.generated.impl.GeneratedPackageImpl#getuCInvInt2jCInvAssert_r10()
	 * @generated
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10 = 16;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>uC Inv Int2j CInv Assert r10</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>uC Inv Int2j CInv Assert r10</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_INV_INT2J_CINV_ASSERT_R10_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link de.silvawb.umlContract2java.generated.impl.uProperty2jField_Helper_r11Impl <em>uProperty2j Field Helper r11</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlContract2java.generated.impl.uProperty2jField_Helper_r11Impl
	 * @see de.silvawb.umlContract2java.generated.impl.GeneratedPackageImpl#getuProperty2jField_Helper_r11()
	 * @generated
	 */
	int UPROPERTY2J_FIELD_HELPER_R11 = 17;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>uProperty2j Field Helper r11</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>uProperty2j Field Helper r11</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPROPERTY2J_FIELD_HELPER_R11_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link de.silvawb.umlContract2java.generated.impl.uOPPosInt2jMAPosAssert_r8Impl <em>uOP Pos Int2j MA Pos Assert r8</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlContract2java.generated.impl.uOPPosInt2jMAPosAssert_r8Impl
	 * @see de.silvawb.umlContract2java.generated.impl.GeneratedPackageImpl#getuOPPosInt2jMAPosAssert_r8()
	 * @generated
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8 = 18;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>uOP Pos Int2j MA Pos Assert r8</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>uOP Pos Int2j MA Pos Assert r8</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS_INT2J_MA_POS_ASSERT_R8_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link de.silvawb.umlContract2java.generated.impl.uClass2jClass_Helper_r2Impl <em>uClass2j Class Helper r2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlContract2java.generated.impl.uClass2jClass_Helper_r2Impl
	 * @see de.silvawb.umlContract2java.generated.impl.GeneratedPackageImpl#getuClass2jClass_Helper_r2()
	 * @generated
	 */
	int UCLASS2J_CLASS_HELPER_R2 = 19;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>uClass2j Class Helper r2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>uClass2j Class Helper r2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_HELPER_R2_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link de.silvawb.umlContract2java.generated.impl.uOPPre2jMAPre_r5Impl <em>uOP Pre2j MA Pre r5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlContract2java.generated.impl.uOPPre2jMAPre_r5Impl
	 * @see de.silvawb.umlContract2java.generated.impl.GeneratedPackageImpl#getuOPPre2jMAPre_r5()
	 * @generated
	 */
	int UOP_PRE2J_MA_PRE_R5 = 20;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>uOP Pre2j MA Pre r5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>uOP Pre2j MA Pre r5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_PRE2J_MA_PRE_R5_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link de.silvawb.umlContract2java.generated.impl.uOperation2jMethod_Helper_r3Impl <em>uOperation2j Method Helper r3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlContract2java.generated.impl.uOperation2jMethod_Helper_r3Impl
	 * @see de.silvawb.umlContract2java.generated.impl.GeneratedPackageImpl#getuOperation2jMethod_Helper_r3()
	 * @generated
	 */
	int UOPERATION2J_METHOD_HELPER_R3 = 21;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>uOperation2j Method Helper r3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>uOperation2j Method Helper r3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R3_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link de.silvawb.umlContract2java.generated.impl.uOPPos2jMAPos_r6Impl <em>uOP Pos2j MA Pos r6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlContract2java.generated.impl.uOPPos2jMAPos_r6Impl
	 * @see de.silvawb.umlContract2java.generated.impl.GeneratedPackageImpl#getuOPPos2jMAPos_r6()
	 * @generated
	 */
	int UOP_POS2J_MA_POS_R6 = 22;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>uOP Pos2j MA Pos r6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>uOP Pos2j MA Pos r6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_POS2J_MA_POS_R6_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlContract2java.generated.umlContract2javaOperationalTGG <em>uml Contract2java Operational TGG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uml Contract2java Operational TGG</em>'.
	 * @see de.silvawb.umlContract2java.generated.umlContract2javaOperationalTGG
	 * @generated
	 */
	EClass getumlContract2javaOperationalTGG();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom <em>uml Contract2java Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uml Contract2java Axiom</em>'.
	 * @see de.silvawb.umlContract2java.generated.umlContract2javaAxiom
	 * @generated
	 */
	EClass getumlContract2javaAxiom();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert <em>uOP Pre Int2j MA Pre Assert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uOP Pre Int2j MA Pre Assert</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert
	 * @generated
	 */
	EClass getuOPPreInt2jMAPreAssert();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper <em>uOperation2j Method Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uOperation2j Method Helper</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper
	 * @generated
	 */
	EClass getuOperation2jMethod_Helper();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlContract2java.generated.uCInv2jCInv <em>uC Inv2j CInv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uC Inv2j CInv</em>'.
	 * @see de.silvawb.umlContract2java.generated.uCInv2jCInv
	 * @generated
	 */
	EClass getuCInv2jCInv();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlContract2java.generated.uOPPos2jMAPos <em>uOP Pos2j MA Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uOP Pos2j MA Pos</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPos2jMAPos
	 * @generated
	 */
	EClass getuOPPos2jMAPos();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlContract2java.generated.uClass2jClass_Helper <em>uClass2j Class Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uClass2j Class Helper</em>'.
	 * @see de.silvawb.umlContract2java.generated.uClass2jClass_Helper
	 * @generated
	 */
	EClass getuClass2jClass_Helper();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlContract2java.generated.uOPPre2jMAPre <em>uOP Pre2j MA Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uOP Pre2j MA Pre</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPre2jMAPre
	 * @generated
	 */
	EClass getuOPPre2jMAPre();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert <em>uOP Pos Int2j MA Pos Assert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uOP Pos Int2j MA Pos Assert</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert
	 * @generated
	 */
	EClass getuOPPosInt2jMAPosAssert();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlContract2java.generated.uProperty2jField_Helper <em>uProperty2j Field Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uProperty2j Field Helper</em>'.
	 * @see de.silvawb.umlContract2java.generated.uProperty2jField_Helper
	 * @generated
	 */
	EClass getuProperty2jField_Helper();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert <em>uC Inv Int2j CInv Assert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uC Inv Int2j CInv Assert</em>'.
	 * @see de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert
	 * @generated
	 */
	EClass getuCInvInt2jCInvAssert();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlContract2java.generated.uOParamenter2jMArgument <em>uO Paramenter2j MArgument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uO Paramenter2j MArgument</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOParamenter2jMArgument
	 * @generated
	 */
	EClass getuOParamenter2jMArgument();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1 <em>uml Contract2java Axiom r1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uml Contract2java Axiom r1</em>'.
	 * @see de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1
	 * @generated
	 */
	EClass getumlContract2javaAxiom_r1();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#getAddElementActivity()
	 * @see #getumlContract2javaAxiom_r1()
	 * @generated
	 */
	EReference getumlContract2javaAxiom_r1_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#getMoveElementActivity()
	 * @see #getumlContract2javaAxiom_r1()
	 * @generated
	 */
	EReference getumlContract2javaAxiom_r1_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#getChangeAttributeActivity()
	 * @see #getumlContract2javaAxiom_r1()
	 * @generated
	 */
	EReference getumlContract2javaAxiom_r1_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#getTransformForwardActivity()
	 * @see #getumlContract2javaAxiom_r1()
	 * @generated
	 */
	EReference getumlContract2javaAxiom_r1_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#getTransformMappingActivity()
	 * @see #getumlContract2javaAxiom_r1()
	 * @generated
	 */
	EReference getumlContract2javaAxiom_r1_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#getTransformBackwardActivity()
	 * @see #getumlContract2javaAxiom_r1()
	 * @generated
	 */
	EReference getumlContract2javaAxiom_r1_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#getSynchronizeForwardActivity()
	 * @see #getumlContract2javaAxiom_r1()
	 * @generated
	 */
	EReference getumlContract2javaAxiom_r1_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#getSynchronizeBackwardActivity()
	 * @see #getumlContract2javaAxiom_r1()
	 * @generated
	 */
	EReference getumlContract2javaAxiom_r1_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#addElement(org.eclipse.emf.common.util.EMap, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#addElement(org.eclipse.emf.common.util.EMap, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getumlContract2javaAxiom_r1__AddElement__EMap_EList_EList();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getumlContract2javaAxiom_r1__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#transformForward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#transformForward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getumlContract2javaAxiom_r1__TransformForward__EList_EList_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#transformMapping(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#transformMapping(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getumlContract2javaAxiom_r1__TransformMapping__EList_EList_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#transformBackward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#transformBackward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getumlContract2javaAxiom_r1__TransformBackward__EList_EList_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#synchronizeForward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#synchronizeForward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getumlContract2javaAxiom_r1__SynchronizeForward__EList_EList_TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#synchronizeBackward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#synchronizeBackward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getumlContract2javaAxiom_r1__SynchronizeBackward__EList_EList_TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4 <em>uO Paramenter2j MArgument r4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uO Paramenter2j MArgument r4</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4
	 * @generated
	 */
	EClass getuOParamenter2jMArgument_r4();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#getAddElementActivity()
	 * @see #getuOParamenter2jMArgument_r4()
	 * @generated
	 */
	EReference getuOParamenter2jMArgument_r4_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#getMoveElementActivity()
	 * @see #getuOParamenter2jMArgument_r4()
	 * @generated
	 */
	EReference getuOParamenter2jMArgument_r4_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#getChangeAttributeActivity()
	 * @see #getuOParamenter2jMArgument_r4()
	 * @generated
	 */
	EReference getuOParamenter2jMArgument_r4_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#getTransformForwardActivity()
	 * @see #getuOParamenter2jMArgument_r4()
	 * @generated
	 */
	EReference getuOParamenter2jMArgument_r4_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#getTransformMappingActivity()
	 * @see #getuOParamenter2jMArgument_r4()
	 * @generated
	 */
	EReference getuOParamenter2jMArgument_r4_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#getTransformBackwardActivity()
	 * @see #getuOParamenter2jMArgument_r4()
	 * @generated
	 */
	EReference getuOParamenter2jMArgument_r4_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#getConflictCheckForwardActivity()
	 * @see #getuOParamenter2jMArgument_r4()
	 * @generated
	 */
	EReference getuOParamenter2jMArgument_r4_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#getConflictCheckMappingActivity()
	 * @see #getuOParamenter2jMArgument_r4()
	 * @generated
	 */
	EReference getuOParamenter2jMArgument_r4_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#getConflictCheckBackwardActivity()
	 * @see #getuOParamenter2jMArgument_r4()
	 * @generated
	 */
	EReference getuOParamenter2jMArgument_r4_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#getSynchronizeForwardActivity()
	 * @see #getuOParamenter2jMArgument_r4()
	 * @generated
	 */
	EReference getuOParamenter2jMArgument_r4_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#getSynchronizeBackwardActivity()
	 * @see #getuOParamenter2jMArgument_r4()
	 * @generated
	 */
	EReference getuOParamenter2jMArgument_r4_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#getRepairForwardActivity()
	 * @see #getuOParamenter2jMArgument_r4()
	 * @generated
	 */
	EReference getuOParamenter2jMArgument_r4_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#getRepairBackwardActivity()
	 * @see #getuOParamenter2jMArgument_r4()
	 * @generated
	 */
	EReference getuOParamenter2jMArgument_r4_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuOParamenter2jMArgument_r4__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuOParamenter2jMArgument_r4__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuOParamenter2jMArgument_r4__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuOParamenter2jMArgument_r4__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuOParamenter2jMArgument_r4__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuOParamenter2jMArgument_r4__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuOParamenter2jMArgument_r4__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuOParamenter2jMArgument_r4__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuOParamenter2jMArgument_r4__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuOParamenter2jMArgument_r4__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuOParamenter2jMArgument_r4__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuOParamenter2jMArgument_r4__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuOParamenter2jMArgument_r4__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7 <em>uOP Pre Int2j MA Pre Assert r7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uOP Pre Int2j MA Pre Assert r7</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7
	 * @generated
	 */
	EClass getuOPPreInt2jMAPreAssert_r7();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#getAddElementActivity()
	 * @see #getuOPPreInt2jMAPreAssert_r7()
	 * @generated
	 */
	EReference getuOPPreInt2jMAPreAssert_r7_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#getMoveElementActivity()
	 * @see #getuOPPreInt2jMAPreAssert_r7()
	 * @generated
	 */
	EReference getuOPPreInt2jMAPreAssert_r7_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#getChangeAttributeActivity()
	 * @see #getuOPPreInt2jMAPreAssert_r7()
	 * @generated
	 */
	EReference getuOPPreInt2jMAPreAssert_r7_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#getTransformForwardActivity()
	 * @see #getuOPPreInt2jMAPreAssert_r7()
	 * @generated
	 */
	EReference getuOPPreInt2jMAPreAssert_r7_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#getTransformMappingActivity()
	 * @see #getuOPPreInt2jMAPreAssert_r7()
	 * @generated
	 */
	EReference getuOPPreInt2jMAPreAssert_r7_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#getTransformBackwardActivity()
	 * @see #getuOPPreInt2jMAPreAssert_r7()
	 * @generated
	 */
	EReference getuOPPreInt2jMAPreAssert_r7_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#getConflictCheckForwardActivity()
	 * @see #getuOPPreInt2jMAPreAssert_r7()
	 * @generated
	 */
	EReference getuOPPreInt2jMAPreAssert_r7_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#getConflictCheckMappingActivity()
	 * @see #getuOPPreInt2jMAPreAssert_r7()
	 * @generated
	 */
	EReference getuOPPreInt2jMAPreAssert_r7_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#getConflictCheckBackwardActivity()
	 * @see #getuOPPreInt2jMAPreAssert_r7()
	 * @generated
	 */
	EReference getuOPPreInt2jMAPreAssert_r7_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#getSynchronizeForwardActivity()
	 * @see #getuOPPreInt2jMAPreAssert_r7()
	 * @generated
	 */
	EReference getuOPPreInt2jMAPreAssert_r7_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#getSynchronizeBackwardActivity()
	 * @see #getuOPPreInt2jMAPreAssert_r7()
	 * @generated
	 */
	EReference getuOPPreInt2jMAPreAssert_r7_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#getRepairForwardActivity()
	 * @see #getuOPPreInt2jMAPreAssert_r7()
	 * @generated
	 */
	EReference getuOPPreInt2jMAPreAssert_r7_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#getRepairBackwardActivity()
	 * @see #getuOPPreInt2jMAPreAssert_r7()
	 * @generated
	 */
	EReference getuOPPreInt2jMAPreAssert_r7_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuOPPreInt2jMAPreAssert_r7__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuOPPreInt2jMAPreAssert_r7__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuOPPreInt2jMAPreAssert_r7__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuOPPreInt2jMAPreAssert_r7__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuOPPreInt2jMAPreAssert_r7__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuOPPreInt2jMAPreAssert_r7__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuOPPreInt2jMAPreAssert_r7__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuOPPreInt2jMAPreAssert_r7__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuOPPreInt2jMAPreAssert_r7__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuOPPreInt2jMAPreAssert_r7__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuOPPreInt2jMAPreAssert_r7__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuOPPreInt2jMAPreAssert_r7__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuOPPreInt2jMAPreAssert_r7__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlContract2java.generated.uCInv2jCInv_r9 <em>uC Inv2j CInv r9</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uC Inv2j CInv r9</em>'.
	 * @see de.silvawb.umlContract2java.generated.uCInv2jCInv_r9
	 * @generated
	 */
	EClass getuCInv2jCInv_r9();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#getAddElementActivity()
	 * @see #getuCInv2jCInv_r9()
	 * @generated
	 */
	EReference getuCInv2jCInv_r9_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#getMoveElementActivity()
	 * @see #getuCInv2jCInv_r9()
	 * @generated
	 */
	EReference getuCInv2jCInv_r9_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#getChangeAttributeActivity()
	 * @see #getuCInv2jCInv_r9()
	 * @generated
	 */
	EReference getuCInv2jCInv_r9_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#getTransformForwardActivity()
	 * @see #getuCInv2jCInv_r9()
	 * @generated
	 */
	EReference getuCInv2jCInv_r9_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#getTransformMappingActivity()
	 * @see #getuCInv2jCInv_r9()
	 * @generated
	 */
	EReference getuCInv2jCInv_r9_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#getTransformBackwardActivity()
	 * @see #getuCInv2jCInv_r9()
	 * @generated
	 */
	EReference getuCInv2jCInv_r9_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#getConflictCheckForwardActivity()
	 * @see #getuCInv2jCInv_r9()
	 * @generated
	 */
	EReference getuCInv2jCInv_r9_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#getConflictCheckMappingActivity()
	 * @see #getuCInv2jCInv_r9()
	 * @generated
	 */
	EReference getuCInv2jCInv_r9_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#getConflictCheckBackwardActivity()
	 * @see #getuCInv2jCInv_r9()
	 * @generated
	 */
	EReference getuCInv2jCInv_r9_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#getSynchronizeForwardActivity()
	 * @see #getuCInv2jCInv_r9()
	 * @generated
	 */
	EReference getuCInv2jCInv_r9_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#getSynchronizeBackwardActivity()
	 * @see #getuCInv2jCInv_r9()
	 * @generated
	 */
	EReference getuCInv2jCInv_r9_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#getRepairForwardActivity()
	 * @see #getuCInv2jCInv_r9()
	 * @generated
	 */
	EReference getuCInv2jCInv_r9_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#getRepairBackwardActivity()
	 * @see #getuCInv2jCInv_r9()
	 * @generated
	 */
	EReference getuCInv2jCInv_r9_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuCInv2jCInv_r9__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuCInv2jCInv_r9__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuCInv2jCInv_r9__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuCInv2jCInv_r9__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuCInv2jCInv_r9__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuCInv2jCInv_r9__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuCInv2jCInv_r9__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuCInv2jCInv_r9__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuCInv2jCInv_r9__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuCInv2jCInv_r9__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuCInv2jCInv_r9__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuCInv2jCInv_r9__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uCInv2jCInv_r9#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuCInv2jCInv_r9__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10 <em>uC Inv Int2j CInv Assert r10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uC Inv Int2j CInv Assert r10</em>'.
	 * @see de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10
	 * @generated
	 */
	EClass getuCInvInt2jCInvAssert_r10();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#getAddElementActivity()
	 * @see #getuCInvInt2jCInvAssert_r10()
	 * @generated
	 */
	EReference getuCInvInt2jCInvAssert_r10_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#getMoveElementActivity()
	 * @see #getuCInvInt2jCInvAssert_r10()
	 * @generated
	 */
	EReference getuCInvInt2jCInvAssert_r10_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#getChangeAttributeActivity()
	 * @see #getuCInvInt2jCInvAssert_r10()
	 * @generated
	 */
	EReference getuCInvInt2jCInvAssert_r10_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#getTransformForwardActivity()
	 * @see #getuCInvInt2jCInvAssert_r10()
	 * @generated
	 */
	EReference getuCInvInt2jCInvAssert_r10_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#getTransformMappingActivity()
	 * @see #getuCInvInt2jCInvAssert_r10()
	 * @generated
	 */
	EReference getuCInvInt2jCInvAssert_r10_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#getTransformBackwardActivity()
	 * @see #getuCInvInt2jCInvAssert_r10()
	 * @generated
	 */
	EReference getuCInvInt2jCInvAssert_r10_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#getConflictCheckForwardActivity()
	 * @see #getuCInvInt2jCInvAssert_r10()
	 * @generated
	 */
	EReference getuCInvInt2jCInvAssert_r10_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#getConflictCheckMappingActivity()
	 * @see #getuCInvInt2jCInvAssert_r10()
	 * @generated
	 */
	EReference getuCInvInt2jCInvAssert_r10_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#getConflictCheckBackwardActivity()
	 * @see #getuCInvInt2jCInvAssert_r10()
	 * @generated
	 */
	EReference getuCInvInt2jCInvAssert_r10_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#getSynchronizeForwardActivity()
	 * @see #getuCInvInt2jCInvAssert_r10()
	 * @generated
	 */
	EReference getuCInvInt2jCInvAssert_r10_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#getSynchronizeBackwardActivity()
	 * @see #getuCInvInt2jCInvAssert_r10()
	 * @generated
	 */
	EReference getuCInvInt2jCInvAssert_r10_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#getRepairForwardActivity()
	 * @see #getuCInvInt2jCInvAssert_r10()
	 * @generated
	 */
	EReference getuCInvInt2jCInvAssert_r10_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#getRepairBackwardActivity()
	 * @see #getuCInvInt2jCInvAssert_r10()
	 * @generated
	 */
	EReference getuCInvInt2jCInvAssert_r10_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuCInvInt2jCInvAssert_r10__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuCInvInt2jCInvAssert_r10__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuCInvInt2jCInvAssert_r10__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuCInvInt2jCInvAssert_r10__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuCInvInt2jCInvAssert_r10__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuCInvInt2jCInvAssert_r10__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuCInvInt2jCInvAssert_r10__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuCInvInt2jCInvAssert_r10__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuCInvInt2jCInvAssert_r10__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuCInvInt2jCInvAssert_r10__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuCInvInt2jCInvAssert_r10__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuCInvInt2jCInvAssert_r10__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuCInvInt2jCInvAssert_r10__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11 <em>uProperty2j Field Helper r11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uProperty2j Field Helper r11</em>'.
	 * @see de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11
	 * @generated
	 */
	EClass getuProperty2jField_Helper_r11();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#getAddElementActivity()
	 * @see #getuProperty2jField_Helper_r11()
	 * @generated
	 */
	EReference getuProperty2jField_Helper_r11_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#getMoveElementActivity()
	 * @see #getuProperty2jField_Helper_r11()
	 * @generated
	 */
	EReference getuProperty2jField_Helper_r11_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#getChangeAttributeActivity()
	 * @see #getuProperty2jField_Helper_r11()
	 * @generated
	 */
	EReference getuProperty2jField_Helper_r11_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#getTransformForwardActivity()
	 * @see #getuProperty2jField_Helper_r11()
	 * @generated
	 */
	EReference getuProperty2jField_Helper_r11_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#getTransformMappingActivity()
	 * @see #getuProperty2jField_Helper_r11()
	 * @generated
	 */
	EReference getuProperty2jField_Helper_r11_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#getTransformBackwardActivity()
	 * @see #getuProperty2jField_Helper_r11()
	 * @generated
	 */
	EReference getuProperty2jField_Helper_r11_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#getConflictCheckForwardActivity()
	 * @see #getuProperty2jField_Helper_r11()
	 * @generated
	 */
	EReference getuProperty2jField_Helper_r11_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#getConflictCheckMappingActivity()
	 * @see #getuProperty2jField_Helper_r11()
	 * @generated
	 */
	EReference getuProperty2jField_Helper_r11_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#getConflictCheckBackwardActivity()
	 * @see #getuProperty2jField_Helper_r11()
	 * @generated
	 */
	EReference getuProperty2jField_Helper_r11_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#getSynchronizeForwardActivity()
	 * @see #getuProperty2jField_Helper_r11()
	 * @generated
	 */
	EReference getuProperty2jField_Helper_r11_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#getSynchronizeBackwardActivity()
	 * @see #getuProperty2jField_Helper_r11()
	 * @generated
	 */
	EReference getuProperty2jField_Helper_r11_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#getRepairForwardActivity()
	 * @see #getuProperty2jField_Helper_r11()
	 * @generated
	 */
	EReference getuProperty2jField_Helper_r11_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#getRepairBackwardActivity()
	 * @see #getuProperty2jField_Helper_r11()
	 * @generated
	 */
	EReference getuProperty2jField_Helper_r11_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuProperty2jField_Helper_r11__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuProperty2jField_Helper_r11__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuProperty2jField_Helper_r11__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuProperty2jField_Helper_r11__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuProperty2jField_Helper_r11__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuProperty2jField_Helper_r11__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuProperty2jField_Helper_r11__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuProperty2jField_Helper_r11__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuProperty2jField_Helper_r11__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuProperty2jField_Helper_r11__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuProperty2jField_Helper_r11__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuProperty2jField_Helper_r11__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuProperty2jField_Helper_r11__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8 <em>uOP Pos Int2j MA Pos Assert r8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uOP Pos Int2j MA Pos Assert r8</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8
	 * @generated
	 */
	EClass getuOPPosInt2jMAPosAssert_r8();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#getAddElementActivity()
	 * @see #getuOPPosInt2jMAPosAssert_r8()
	 * @generated
	 */
	EReference getuOPPosInt2jMAPosAssert_r8_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#getMoveElementActivity()
	 * @see #getuOPPosInt2jMAPosAssert_r8()
	 * @generated
	 */
	EReference getuOPPosInt2jMAPosAssert_r8_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#getChangeAttributeActivity()
	 * @see #getuOPPosInt2jMAPosAssert_r8()
	 * @generated
	 */
	EReference getuOPPosInt2jMAPosAssert_r8_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#getTransformForwardActivity()
	 * @see #getuOPPosInt2jMAPosAssert_r8()
	 * @generated
	 */
	EReference getuOPPosInt2jMAPosAssert_r8_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#getTransformMappingActivity()
	 * @see #getuOPPosInt2jMAPosAssert_r8()
	 * @generated
	 */
	EReference getuOPPosInt2jMAPosAssert_r8_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#getTransformBackwardActivity()
	 * @see #getuOPPosInt2jMAPosAssert_r8()
	 * @generated
	 */
	EReference getuOPPosInt2jMAPosAssert_r8_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#getConflictCheckForwardActivity()
	 * @see #getuOPPosInt2jMAPosAssert_r8()
	 * @generated
	 */
	EReference getuOPPosInt2jMAPosAssert_r8_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#getConflictCheckMappingActivity()
	 * @see #getuOPPosInt2jMAPosAssert_r8()
	 * @generated
	 */
	EReference getuOPPosInt2jMAPosAssert_r8_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#getConflictCheckBackwardActivity()
	 * @see #getuOPPosInt2jMAPosAssert_r8()
	 * @generated
	 */
	EReference getuOPPosInt2jMAPosAssert_r8_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#getSynchronizeForwardActivity()
	 * @see #getuOPPosInt2jMAPosAssert_r8()
	 * @generated
	 */
	EReference getuOPPosInt2jMAPosAssert_r8_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#getSynchronizeBackwardActivity()
	 * @see #getuOPPosInt2jMAPosAssert_r8()
	 * @generated
	 */
	EReference getuOPPosInt2jMAPosAssert_r8_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#getRepairForwardActivity()
	 * @see #getuOPPosInt2jMAPosAssert_r8()
	 * @generated
	 */
	EReference getuOPPosInt2jMAPosAssert_r8_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#getRepairBackwardActivity()
	 * @see #getuOPPosInt2jMAPosAssert_r8()
	 * @generated
	 */
	EReference getuOPPosInt2jMAPosAssert_r8_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuOPPosInt2jMAPosAssert_r8__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuOPPosInt2jMAPosAssert_r8__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuOPPosInt2jMAPosAssert_r8__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuOPPosInt2jMAPosAssert_r8__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuOPPosInt2jMAPosAssert_r8__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuOPPosInt2jMAPosAssert_r8__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuOPPosInt2jMAPosAssert_r8__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuOPPosInt2jMAPosAssert_r8__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuOPPosInt2jMAPosAssert_r8__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuOPPosInt2jMAPosAssert_r8__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuOPPosInt2jMAPosAssert_r8__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuOPPosInt2jMAPosAssert_r8__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuOPPosInt2jMAPosAssert_r8__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2 <em>uClass2j Class Helper r2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uClass2j Class Helper r2</em>'.
	 * @see de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2
	 * @generated
	 */
	EClass getuClass2jClass_Helper_r2();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#getAddElementActivity()
	 * @see #getuClass2jClass_Helper_r2()
	 * @generated
	 */
	EReference getuClass2jClass_Helper_r2_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#getMoveElementActivity()
	 * @see #getuClass2jClass_Helper_r2()
	 * @generated
	 */
	EReference getuClass2jClass_Helper_r2_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#getChangeAttributeActivity()
	 * @see #getuClass2jClass_Helper_r2()
	 * @generated
	 */
	EReference getuClass2jClass_Helper_r2_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#getTransformForwardActivity()
	 * @see #getuClass2jClass_Helper_r2()
	 * @generated
	 */
	EReference getuClass2jClass_Helper_r2_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#getTransformMappingActivity()
	 * @see #getuClass2jClass_Helper_r2()
	 * @generated
	 */
	EReference getuClass2jClass_Helper_r2_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#getTransformBackwardActivity()
	 * @see #getuClass2jClass_Helper_r2()
	 * @generated
	 */
	EReference getuClass2jClass_Helper_r2_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#getConflictCheckForwardActivity()
	 * @see #getuClass2jClass_Helper_r2()
	 * @generated
	 */
	EReference getuClass2jClass_Helper_r2_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#getConflictCheckMappingActivity()
	 * @see #getuClass2jClass_Helper_r2()
	 * @generated
	 */
	EReference getuClass2jClass_Helper_r2_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#getConflictCheckBackwardActivity()
	 * @see #getuClass2jClass_Helper_r2()
	 * @generated
	 */
	EReference getuClass2jClass_Helper_r2_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#getSynchronizeForwardActivity()
	 * @see #getuClass2jClass_Helper_r2()
	 * @generated
	 */
	EReference getuClass2jClass_Helper_r2_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#getSynchronizeBackwardActivity()
	 * @see #getuClass2jClass_Helper_r2()
	 * @generated
	 */
	EReference getuClass2jClass_Helper_r2_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#getRepairForwardActivity()
	 * @see #getuClass2jClass_Helper_r2()
	 * @generated
	 */
	EReference getuClass2jClass_Helper_r2_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#getRepairBackwardActivity()
	 * @see #getuClass2jClass_Helper_r2()
	 * @generated
	 */
	EReference getuClass2jClass_Helper_r2_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuClass2jClass_Helper_r2__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuClass2jClass_Helper_r2__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuClass2jClass_Helper_r2__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuClass2jClass_Helper_r2__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuClass2jClass_Helper_r2__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuClass2jClass_Helper_r2__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuClass2jClass_Helper_r2__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuClass2jClass_Helper_r2__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuClass2jClass_Helper_r2__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuClass2jClass_Helper_r2__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuClass2jClass_Helper_r2__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuClass2jClass_Helper_r2__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuClass2jClass_Helper_r2__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5 <em>uOP Pre2j MA Pre r5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uOP Pre2j MA Pre r5</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5
	 * @generated
	 */
	EClass getuOPPre2jMAPre_r5();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#getAddElementActivity()
	 * @see #getuOPPre2jMAPre_r5()
	 * @generated
	 */
	EReference getuOPPre2jMAPre_r5_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#getMoveElementActivity()
	 * @see #getuOPPre2jMAPre_r5()
	 * @generated
	 */
	EReference getuOPPre2jMAPre_r5_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#getChangeAttributeActivity()
	 * @see #getuOPPre2jMAPre_r5()
	 * @generated
	 */
	EReference getuOPPre2jMAPre_r5_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#getTransformForwardActivity()
	 * @see #getuOPPre2jMAPre_r5()
	 * @generated
	 */
	EReference getuOPPre2jMAPre_r5_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#getTransformMappingActivity()
	 * @see #getuOPPre2jMAPre_r5()
	 * @generated
	 */
	EReference getuOPPre2jMAPre_r5_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#getTransformBackwardActivity()
	 * @see #getuOPPre2jMAPre_r5()
	 * @generated
	 */
	EReference getuOPPre2jMAPre_r5_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#getConflictCheckForwardActivity()
	 * @see #getuOPPre2jMAPre_r5()
	 * @generated
	 */
	EReference getuOPPre2jMAPre_r5_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#getConflictCheckMappingActivity()
	 * @see #getuOPPre2jMAPre_r5()
	 * @generated
	 */
	EReference getuOPPre2jMAPre_r5_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#getConflictCheckBackwardActivity()
	 * @see #getuOPPre2jMAPre_r5()
	 * @generated
	 */
	EReference getuOPPre2jMAPre_r5_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#getSynchronizeForwardActivity()
	 * @see #getuOPPre2jMAPre_r5()
	 * @generated
	 */
	EReference getuOPPre2jMAPre_r5_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#getSynchronizeBackwardActivity()
	 * @see #getuOPPre2jMAPre_r5()
	 * @generated
	 */
	EReference getuOPPre2jMAPre_r5_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#getRepairForwardActivity()
	 * @see #getuOPPre2jMAPre_r5()
	 * @generated
	 */
	EReference getuOPPre2jMAPre_r5_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#getRepairBackwardActivity()
	 * @see #getuOPPre2jMAPre_r5()
	 * @generated
	 */
	EReference getuOPPre2jMAPre_r5_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuOPPre2jMAPre_r5__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuOPPre2jMAPre_r5__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuOPPre2jMAPre_r5__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuOPPre2jMAPre_r5__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuOPPre2jMAPre_r5__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuOPPre2jMAPre_r5__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuOPPre2jMAPre_r5__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuOPPre2jMAPre_r5__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuOPPre2jMAPre_r5__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuOPPre2jMAPre_r5__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuOPPre2jMAPre_r5__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuOPPre2jMAPre_r5__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuOPPre2jMAPre_r5__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3 <em>uOperation2j Method Helper r3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uOperation2j Method Helper r3</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3
	 * @generated
	 */
	EClass getuOperation2jMethod_Helper_r3();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#getAddElementActivity()
	 * @see #getuOperation2jMethod_Helper_r3()
	 * @generated
	 */
	EReference getuOperation2jMethod_Helper_r3_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#getMoveElementActivity()
	 * @see #getuOperation2jMethod_Helper_r3()
	 * @generated
	 */
	EReference getuOperation2jMethod_Helper_r3_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#getChangeAttributeActivity()
	 * @see #getuOperation2jMethod_Helper_r3()
	 * @generated
	 */
	EReference getuOperation2jMethod_Helper_r3_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#getTransformForwardActivity()
	 * @see #getuOperation2jMethod_Helper_r3()
	 * @generated
	 */
	EReference getuOperation2jMethod_Helper_r3_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#getTransformMappingActivity()
	 * @see #getuOperation2jMethod_Helper_r3()
	 * @generated
	 */
	EReference getuOperation2jMethod_Helper_r3_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#getTransformBackwardActivity()
	 * @see #getuOperation2jMethod_Helper_r3()
	 * @generated
	 */
	EReference getuOperation2jMethod_Helper_r3_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#getConflictCheckForwardActivity()
	 * @see #getuOperation2jMethod_Helper_r3()
	 * @generated
	 */
	EReference getuOperation2jMethod_Helper_r3_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#getConflictCheckMappingActivity()
	 * @see #getuOperation2jMethod_Helper_r3()
	 * @generated
	 */
	EReference getuOperation2jMethod_Helper_r3_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#getConflictCheckBackwardActivity()
	 * @see #getuOperation2jMethod_Helper_r3()
	 * @generated
	 */
	EReference getuOperation2jMethod_Helper_r3_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#getSynchronizeForwardActivity()
	 * @see #getuOperation2jMethod_Helper_r3()
	 * @generated
	 */
	EReference getuOperation2jMethod_Helper_r3_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#getSynchronizeBackwardActivity()
	 * @see #getuOperation2jMethod_Helper_r3()
	 * @generated
	 */
	EReference getuOperation2jMethod_Helper_r3_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#getRepairForwardActivity()
	 * @see #getuOperation2jMethod_Helper_r3()
	 * @generated
	 */
	EReference getuOperation2jMethod_Helper_r3_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#getRepairBackwardActivity()
	 * @see #getuOperation2jMethod_Helper_r3()
	 * @generated
	 */
	EReference getuOperation2jMethod_Helper_r3_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuOperation2jMethod_Helper_r3__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuOperation2jMethod_Helper_r3__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuOperation2jMethod_Helper_r3__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuOperation2jMethod_Helper_r3__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuOperation2jMethod_Helper_r3__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuOperation2jMethod_Helper_r3__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuOperation2jMethod_Helper_r3__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuOperation2jMethod_Helper_r3__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuOperation2jMethod_Helper_r3__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuOperation2jMethod_Helper_r3__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuOperation2jMethod_Helper_r3__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuOperation2jMethod_Helper_r3__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuOperation2jMethod_Helper_r3__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6 <em>uOP Pos2j MA Pos r6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uOP Pos2j MA Pos r6</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6
	 * @generated
	 */
	EClass getuOPPos2jMAPos_r6();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#getAddElementActivity()
	 * @see #getuOPPos2jMAPos_r6()
	 * @generated
	 */
	EReference getuOPPos2jMAPos_r6_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#getMoveElementActivity()
	 * @see #getuOPPos2jMAPos_r6()
	 * @generated
	 */
	EReference getuOPPos2jMAPos_r6_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#getChangeAttributeActivity()
	 * @see #getuOPPos2jMAPos_r6()
	 * @generated
	 */
	EReference getuOPPos2jMAPos_r6_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#getTransformForwardActivity()
	 * @see #getuOPPos2jMAPos_r6()
	 * @generated
	 */
	EReference getuOPPos2jMAPos_r6_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#getTransformMappingActivity()
	 * @see #getuOPPos2jMAPos_r6()
	 * @generated
	 */
	EReference getuOPPos2jMAPos_r6_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#getTransformBackwardActivity()
	 * @see #getuOPPos2jMAPos_r6()
	 * @generated
	 */
	EReference getuOPPos2jMAPos_r6_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#getConflictCheckForwardActivity()
	 * @see #getuOPPos2jMAPos_r6()
	 * @generated
	 */
	EReference getuOPPos2jMAPos_r6_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#getConflictCheckMappingActivity()
	 * @see #getuOPPos2jMAPos_r6()
	 * @generated
	 */
	EReference getuOPPos2jMAPos_r6_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#getConflictCheckBackwardActivity()
	 * @see #getuOPPos2jMAPos_r6()
	 * @generated
	 */
	EReference getuOPPos2jMAPos_r6_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#getSynchronizeForwardActivity()
	 * @see #getuOPPos2jMAPos_r6()
	 * @generated
	 */
	EReference getuOPPos2jMAPos_r6_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#getSynchronizeBackwardActivity()
	 * @see #getuOPPos2jMAPos_r6()
	 * @generated
	 */
	EReference getuOPPos2jMAPos_r6_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#getRepairForwardActivity()
	 * @see #getuOPPos2jMAPos_r6()
	 * @generated
	 */
	EReference getuOPPos2jMAPos_r6_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#getRepairBackwardActivity()
	 * @see #getuOPPos2jMAPos_r6()
	 * @generated
	 */
	EReference getuOPPos2jMAPos_r6_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuOPPos2jMAPos_r6__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuOPPos2jMAPos_r6__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuOPPos2jMAPos_r6__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuOPPos2jMAPos_r6__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuOPPos2jMAPos_r6__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuOPPos2jMAPos_r6__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuOPPos2jMAPos_r6__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuOPPos2jMAPos_r6__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuOPPos2jMAPos_r6__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuOPPos2jMAPos_r6__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuOPPos2jMAPos_r6__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuOPPos2jMAPos_r6__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuOPPos2jMAPos_r6__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeneratedFactory getGeneratedFactory();

} //GeneratedPackage
