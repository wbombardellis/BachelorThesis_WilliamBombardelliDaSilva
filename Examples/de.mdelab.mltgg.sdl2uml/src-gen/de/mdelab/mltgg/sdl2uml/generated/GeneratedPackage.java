/**
 */
package de.mdelab.mltgg.sdl2uml.generated;

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
 * @see de.mdelab.mltgg.sdl2uml.generated.GeneratedFactory
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
	String eNS_URI = "http://www.mdelab.de/mltgg/sdl2uml/1.0/generated";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.hpi.sam.mote.sdl2uml.generated";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeneratedPackage eINSTANCE = de.mdelab.mltgg.sdl2uml.generated.impl.GeneratedPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLOperationalTGGImpl <em>SDL2UML Operational TGG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLOperationalTGGImpl
	 * @see de.mdelab.mltgg.sdl2uml.generated.impl.GeneratedPackageImpl#getSDL2UMLOperationalTGG()
	 * @generated
	 */
	int SDL2UML_OPERATIONAL_TGG = 0;

	/**
	 * The feature id for the '<em><b>Operational Axiom Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_OPERATIONAL_TGG__OPERATIONAL_AXIOM_GROUP = SdmPackage.SDM_OPERATIONAL_TGG__OPERATIONAL_AXIOM_GROUP;

	/**
	 * The feature id for the '<em><b>Operational Rule Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_OPERATIONAL_TGG__OPERATIONAL_RULE_GROUPS = SdmPackage.SDM_OPERATIONAL_TGG__OPERATIONAL_RULE_GROUPS;

	/**
	 * The feature id for the '<em><b>Tgg Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_OPERATIONAL_TGG__TGG_ENGINE = SdmPackage.SDM_OPERATIONAL_TGG__TGG_ENGINE;

	/**
	 * The feature id for the '<em><b>Tgg ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_OPERATIONAL_TGG__TGG_ID = SdmPackage.SDM_OPERATIONAL_TGG__TGG_ID;

	/**
	 * The feature id for the '<em><b>Unidirectional References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_OPERATIONAL_TGG__UNIDIRECTIONAL_REFERENCES = SdmPackage.SDM_OPERATIONAL_TGG__UNIDIRECTIONAL_REFERENCES;

	/**
	 * The feature id for the '<em><b>Interpreter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_OPERATIONAL_TGG__INTERPRETER = SdmPackage.SDM_OPERATIONAL_TGG__INTERPRETER;

	/**
	 * The number of structural features of the '<em>SDL2UML Operational TGG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_OPERATIONAL_TGG_FEATURE_COUNT = SdmPackage.SDM_OPERATIONAL_TGG_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Transformation Started</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_OPERATIONAL_TGG___TRANSFORMATION_STARTED = SdmPackage.SDM_OPERATIONAL_TGG___TRANSFORMATION_STARTED;

	/**
	 * The operation id for the '<em>Transformation Finished</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_OPERATIONAL_TGG___TRANSFORMATION_FINISHED = SdmPackage.SDM_OPERATIONAL_TGG___TRANSFORMATION_FINISHED;

	/**
	 * The operation id for the '<em>Get Operational Mapping Group</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_OPERATIONAL_TGG___GET_OPERATIONAL_MAPPING_GROUP__STRING = SdmPackage.SDM_OPERATIONAL_TGG___GET_OPERATIONAL_MAPPING_GROUP__STRING;

	/**
	 * The operation id for the '<em>Execute Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_OPERATIONAL_TGG___EXECUTE_ACTIVITY__ACTIVITY_EMAP = SdmPackage.SDM_OPERATIONAL_TGG___EXECUTE_ACTIVITY__ACTIVITY_EMAP;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_OPERATIONAL_TGG___INIT = SdmPackage.SDM_OPERATIONAL_TGG___INIT;

	/**
	 * The number of operations of the '<em>SDL2UML Operational TGG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_OPERATIONAL_TGG_OPERATION_COUNT = SdmPackage.SDM_OPERATIONAL_TGG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLAxiomImpl <em>SDL2UML Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLAxiomImpl
	 * @see de.mdelab.mltgg.sdl2uml.generated.impl.GeneratedPackageImpl#getSDL2UMLAxiom()
	 * @generated
	 */
	int SDL2UML_AXIOM = 1;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_AXIOM__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Axioms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_AXIOM__AXIOMS = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP__AXIOMS;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_AXIOM__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>SDL2UML Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_AXIOM_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_AXIOM___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>SDL2UML Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_AXIOM_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLConnectionVar3Impl <em>SDL2UML Connection Var3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLConnectionVar3Impl
	 * @see de.mdelab.mltgg.sdl2uml.generated.impl.GeneratedPackageImpl#getSDL2UMLConnectionVar3()
	 * @generated
	 */
	int SDL2UML_CONNECTION_VAR3 = 2;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>SDL2UML Connection Var3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>SDL2UML Connection Var3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLProcessImpl <em>SDL2UML Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLProcessImpl
	 * @see de.mdelab.mltgg.sdl2uml.generated.impl.GeneratedPackageImpl#getSDL2UMLProcess()
	 * @generated
	 */
	int SDL2UML_PROCESS = 3;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>SDL2UML Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>SDL2UML Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLBlockImpl <em>SDL2UML Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLBlockImpl
	 * @see de.mdelab.mltgg.sdl2uml.generated.impl.GeneratedPackageImpl#getSDL2UMLBlock()
	 * @generated
	 */
	int SDL2UML_BLOCK = 4;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>SDL2UML Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>SDL2UML Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLConnectionVar1Impl <em>SDL2UML Connection Var1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLConnectionVar1Impl
	 * @see de.mdelab.mltgg.sdl2uml.generated.impl.GeneratedPackageImpl#getSDL2UMLConnectionVar1()
	 * @generated
	 */
	int SDL2UML_CONNECTION_VAR1 = 5;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>SDL2UML Connection Var1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>SDL2UML Connection Var1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLConnectionVar2Impl <em>SDL2UML Connection Var2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLConnectionVar2Impl
	 * @see de.mdelab.mltgg.sdl2uml.generated.impl.GeneratedPackageImpl#getSDL2UMLConnectionVar2()
	 * @generated
	 */
	int SDL2UML_CONNECTION_VAR2 = 6;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>SDL2UML Connection Var2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>SDL2UML Connection Var2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLSystemBlockImpl <em>SDL2UML System Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLSystemBlockImpl
	 * @see de.mdelab.mltgg.sdl2uml.generated.impl.GeneratedPackageImpl#getSDL2UMLSystemBlock()
	 * @generated
	 */
	int SDL2UML_SYSTEM_BLOCK = 7;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>SDL2UML System Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>SDL2UML System Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLAxiom_SDL2UMLAxiom_R1Impl <em>SDL2UML Axiom SDL2UML Axiom R1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLAxiom_SDL2UMLAxiom_R1Impl
	 * @see de.mdelab.mltgg.sdl2uml.generated.impl.GeneratedPackageImpl#getSDL2UMLAxiom_SDL2UMLAxiom_R1()
	 * @generated
	 */
	int SDL2UML_AXIOM_SDL2UML_AXIOM_R1 = 8;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_AXIOM_SDL2UML_AXIOM_R1__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_AXIOM__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_AXIOM_SDL2UML_AXIOM_R1__RULE_ID = OperationalTGGPackage.OPERATIONAL_AXIOM__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Axiom Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_AXIOM_SDL2UML_AXIOM_R1__OPERATIONAL_AXIOM_GROUP = OperationalTGGPackage.OPERATIONAL_AXIOM__OPERATIONAL_AXIOM_GROUP;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_AXIOM_SDL2UML_AXIOM_R1__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_AXIOM_SDL2UML_AXIOM_R1__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_AXIOM_SDL2UML_AXIOM_R1__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_AXIOM_SDL2UML_AXIOM_R1__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_AXIOM_SDL2UML_AXIOM_R1__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_AXIOM_SDL2UML_AXIOM_R1__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_AXIOM_SDL2UML_AXIOM_R1__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_AXIOM_SDL2UML_AXIOM_R1__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>SDL2UML Axiom SDL2UML Axiom R1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_AXIOM_SDL2UML_AXIOM_R1_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_AXIOM_SDL2UML_AXIOM_R1___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_AXIOM___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_AXIOM_SDL2UML_AXIOM_R1___ADD_ELEMENT__EMAP_ELIST_ELIST = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_AXIOM_SDL2UML_AXIOM_R1___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_AXIOM_SDL2UML_AXIOM_R1___TRANSFORM_FORWARD__ELIST_ELIST_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_AXIOM_SDL2UML_AXIOM_R1___TRANSFORM_MAPPING__ELIST_ELIST_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_AXIOM_SDL2UML_AXIOM_R1___TRANSFORM_BACKWARD__ELIST_ELIST_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_AXIOM_SDL2UML_AXIOM_R1___SYNCHRONIZE_FORWARD__ELIST_ELIST_TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_AXIOM_SDL2UML_AXIOM_R1___SYNCHRONIZE_BACKWARD__ELIST_ELIST_TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>SDL2UML Axiom SDL2UML Axiom R1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_AXIOM_SDL2UML_AXIOM_R1_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1Impl <em>SDL2UML System Block SDL2UML System Block R1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1Impl
	 * @see de.mdelab.mltgg.sdl2uml.generated.impl.GeneratedPackageImpl#getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1()
	 * @generated
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1 = 9;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>SDL2UML System Block SDL2UML System Block R1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 12;

	/**
	 * The number of operations of the '<em>SDL2UML System Block SDL2UML System Block R1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1Impl <em>SDL2UML Connection Var2 SDL2UML Connection Var2 R1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1Impl
	 * @see de.mdelab.mltgg.sdl2uml.generated.impl.GeneratedPackageImpl#getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1()
	 * @generated
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1 = 10;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>SDL2UML Connection Var2 SDL2UML Connection Var2 R1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 12;

	/**
	 * The number of operations of the '<em>SDL2UML Connection Var2 SDL2UML Connection Var2 R1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1Impl <em>SDL2UML Connection Var1 SDL2UML Connection Var1 R1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1Impl
	 * @see de.mdelab.mltgg.sdl2uml.generated.impl.GeneratedPackageImpl#getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1()
	 * @generated
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1 = 11;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>SDL2UML Connection Var1 SDL2UML Connection Var1 R1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 12;

	/**
	 * The number of operations of the '<em>SDL2UML Connection Var1 SDL2UML Connection Var1 R1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1Impl <em>SDL2UML Connection Var3 SDL2UML Connection Var3 R1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1Impl
	 * @see de.mdelab.mltgg.sdl2uml.generated.impl.GeneratedPackageImpl#getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1()
	 * @generated
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1 = 12;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>SDL2UML Connection Var3 SDL2UML Connection Var3 R1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 12;

	/**
	 * The number of operations of the '<em>SDL2UML Connection Var3 SDL2UML Connection Var3 R1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLProcess_SDL2UMLProcess_R1Impl <em>SDL2UML Process SDL2UML Process R1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLProcess_SDL2UMLProcess_R1Impl
	 * @see de.mdelab.mltgg.sdl2uml.generated.impl.GeneratedPackageImpl#getSDL2UMLProcess_SDL2UMLProcess_R1()
	 * @generated
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1 = 13;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>SDL2UML Process SDL2UML Process R1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 12;

	/**
	 * The number of operations of the '<em>SDL2UML Process SDL2UML Process R1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_PROCESS_SDL2UML_PROCESS_R1_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLBlock_SDL2UMLBlock_R1Impl <em>SDL2UML Block SDL2UML Block R1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLBlock_SDL2UMLBlock_R1Impl
	 * @see de.mdelab.mltgg.sdl2uml.generated.impl.GeneratedPackageImpl#getSDL2UMLBlock_SDL2UMLBlock_R1()
	 * @generated
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1 = 14;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>SDL2UML Block SDL2UML Block R1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 12;

	/**
	 * The number of operations of the '<em>SDL2UML Block SDL2UML Block R1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL2UML_BLOCK_SDL2UML_BLOCK_R1_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLOperationalTGG <em>SDL2UML Operational TGG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDL2UML Operational TGG</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLOperationalTGG
	 * @generated
	 */
	EClass getSDL2UMLOperationalTGG();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom <em>SDL2UML Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDL2UML Axiom</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom
	 * @generated
	 */
	EClass getSDL2UMLAxiom();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3 <em>SDL2UML Connection Var3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDL2UML Connection Var3</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3
	 * @generated
	 */
	EClass getSDL2UMLConnectionVar3();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess <em>SDL2UML Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDL2UML Process</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess
	 * @generated
	 */
	EClass getSDL2UMLProcess();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock <em>SDL2UML Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDL2UML Block</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock
	 * @generated
	 */
	EClass getSDL2UMLBlock();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1 <em>SDL2UML Connection Var1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDL2UML Connection Var1</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1
	 * @generated
	 */
	EClass getSDL2UMLConnectionVar1();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2 <em>SDL2UML Connection Var2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDL2UML Connection Var2</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2
	 * @generated
	 */
	EClass getSDL2UMLConnectionVar2();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock <em>SDL2UML System Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDL2UML System Block</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock
	 * @generated
	 */
	EClass getSDL2UMLSystemBlock();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1 <em>SDL2UML Axiom SDL2UML Axiom R1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDL2UML Axiom SDL2UML Axiom R1</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1
	 * @generated
	 */
	EClass getSDL2UMLAxiom_SDL2UMLAxiom_R1();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1#getAddElementActivity()
	 * @see #getSDL2UMLAxiom_SDL2UMLAxiom_R1()
	 * @generated
	 */
	EReference getSDL2UMLAxiom_SDL2UMLAxiom_R1_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1#getMoveElementActivity()
	 * @see #getSDL2UMLAxiom_SDL2UMLAxiom_R1()
	 * @generated
	 */
	EReference getSDL2UMLAxiom_SDL2UMLAxiom_R1_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1#getChangeAttributeActivity()
	 * @see #getSDL2UMLAxiom_SDL2UMLAxiom_R1()
	 * @generated
	 */
	EReference getSDL2UMLAxiom_SDL2UMLAxiom_R1_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1#getTransformForwardActivity()
	 * @see #getSDL2UMLAxiom_SDL2UMLAxiom_R1()
	 * @generated
	 */
	EReference getSDL2UMLAxiom_SDL2UMLAxiom_R1_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1#getTransformMappingActivity()
	 * @see #getSDL2UMLAxiom_SDL2UMLAxiom_R1()
	 * @generated
	 */
	EReference getSDL2UMLAxiom_SDL2UMLAxiom_R1_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1#getTransformBackwardActivity()
	 * @see #getSDL2UMLAxiom_SDL2UMLAxiom_R1()
	 * @generated
	 */
	EReference getSDL2UMLAxiom_SDL2UMLAxiom_R1_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1#getSynchronizeForwardActivity()
	 * @see #getSDL2UMLAxiom_SDL2UMLAxiom_R1()
	 * @generated
	 */
	EReference getSDL2UMLAxiom_SDL2UMLAxiom_R1_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1#getSynchronizeBackwardActivity()
	 * @see #getSDL2UMLAxiom_SDL2UMLAxiom_R1()
	 * @generated
	 */
	EReference getSDL2UMLAxiom_SDL2UMLAxiom_R1_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1#addElement(org.eclipse.emf.common.util.EMap, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1#addElement(org.eclipse.emf.common.util.EMap, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getSDL2UMLAxiom_SDL2UMLAxiom_R1__AddElement__EMap_EList_EList();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getSDL2UMLAxiom_SDL2UMLAxiom_R1__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1#transformForward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1#transformForward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLAxiom_SDL2UMLAxiom_R1__TransformForward__EList_EList_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1#transformMapping(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1#transformMapping(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLAxiom_SDL2UMLAxiom_R1__TransformMapping__EList_EList_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1#transformBackward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1#transformBackward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLAxiom_SDL2UMLAxiom_R1__TransformBackward__EList_EList_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1#synchronizeForward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1#synchronizeForward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLAxiom_SDL2UMLAxiom_R1__SynchronizeForward__EList_EList_TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1#synchronizeBackward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1#synchronizeBackward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLAxiom_SDL2UMLAxiom_R1__SynchronizeBackward__EList_EList_TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1 <em>SDL2UML System Block SDL2UML System Block R1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDL2UML System Block SDL2UML System Block R1</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1
	 * @generated
	 */
	EClass getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getAddElementActivity()
	 * @see #getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1()
	 * @generated
	 */
	EReference getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getMoveElementActivity()
	 * @see #getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1()
	 * @generated
	 */
	EReference getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getChangeAttributeActivity()
	 * @see #getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1()
	 * @generated
	 */
	EReference getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getTransformForwardActivity()
	 * @see #getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1()
	 * @generated
	 */
	EReference getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getTransformMappingActivity()
	 * @see #getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1()
	 * @generated
	 */
	EReference getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getTransformBackwardActivity()
	 * @see #getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1()
	 * @generated
	 */
	EReference getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getConflictCheckForwardActivity()
	 * @see #getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1()
	 * @generated
	 */
	EReference getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getConflictCheckMappingActivity()
	 * @see #getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1()
	 * @generated
	 */
	EReference getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getConflictCheckBackwardActivity()
	 * @see #getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1()
	 * @generated
	 */
	EReference getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getSynchronizeForwardActivity()
	 * @see #getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1()
	 * @generated
	 */
	EReference getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getSynchronizeBackwardActivity()
	 * @see #getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1()
	 * @generated
	 */
	EReference getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getRepairForwardActivity()
	 * @see #getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1()
	 * @generated
	 */
	EReference getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getRepairBackwardActivity()
	 * @see #getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1()
	 * @generated
	 */
	EReference getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1 <em>SDL2UML Connection Var2 SDL2UML Connection Var2 R1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDL2UML Connection Var2 SDL2UML Connection Var2 R1</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1
	 * @generated
	 */
	EClass getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#getAddElementActivity()
	 * @see #getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#getMoveElementActivity()
	 * @see #getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#getChangeAttributeActivity()
	 * @see #getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#getTransformForwardActivity()
	 * @see #getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#getTransformMappingActivity()
	 * @see #getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#getTransformBackwardActivity()
	 * @see #getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#getConflictCheckForwardActivity()
	 * @see #getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#getConflictCheckMappingActivity()
	 * @see #getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#getConflictCheckBackwardActivity()
	 * @see #getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#getSynchronizeForwardActivity()
	 * @see #getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#getSynchronizeBackwardActivity()
	 * @see #getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#getRepairForwardActivity()
	 * @see #getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#getRepairBackwardActivity()
	 * @see #getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1 <em>SDL2UML Connection Var1 SDL2UML Connection Var1 R1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDL2UML Connection Var1 SDL2UML Connection Var1 R1</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1
	 * @generated
	 */
	EClass getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#getAddElementActivity()
	 * @see #getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#getMoveElementActivity()
	 * @see #getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#getChangeAttributeActivity()
	 * @see #getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#getTransformForwardActivity()
	 * @see #getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#getTransformMappingActivity()
	 * @see #getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#getTransformBackwardActivity()
	 * @see #getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#getConflictCheckForwardActivity()
	 * @see #getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#getConflictCheckMappingActivity()
	 * @see #getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#getConflictCheckBackwardActivity()
	 * @see #getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#getSynchronizeForwardActivity()
	 * @see #getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#getSynchronizeBackwardActivity()
	 * @see #getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#getRepairForwardActivity()
	 * @see #getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#getRepairBackwardActivity()
	 * @see #getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1 <em>SDL2UML Connection Var3 SDL2UML Connection Var3 R1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDL2UML Connection Var3 SDL2UML Connection Var3 R1</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1
	 * @generated
	 */
	EClass getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#getAddElementActivity()
	 * @see #getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#getMoveElementActivity()
	 * @see #getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#getChangeAttributeActivity()
	 * @see #getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#getTransformForwardActivity()
	 * @see #getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#getTransformMappingActivity()
	 * @see #getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#getTransformBackwardActivity()
	 * @see #getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#getConflictCheckForwardActivity()
	 * @see #getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#getConflictCheckMappingActivity()
	 * @see #getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#getConflictCheckBackwardActivity()
	 * @see #getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#getSynchronizeForwardActivity()
	 * @see #getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#getSynchronizeBackwardActivity()
	 * @see #getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#getRepairForwardActivity()
	 * @see #getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#getRepairBackwardActivity()
	 * @see #getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1()
	 * @generated
	 */
	EReference getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1 <em>SDL2UML Process SDL2UML Process R1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDL2UML Process SDL2UML Process R1</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1
	 * @generated
	 */
	EClass getSDL2UMLProcess_SDL2UMLProcess_R1();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#getAddElementActivity()
	 * @see #getSDL2UMLProcess_SDL2UMLProcess_R1()
	 * @generated
	 */
	EReference getSDL2UMLProcess_SDL2UMLProcess_R1_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#getMoveElementActivity()
	 * @see #getSDL2UMLProcess_SDL2UMLProcess_R1()
	 * @generated
	 */
	EReference getSDL2UMLProcess_SDL2UMLProcess_R1_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#getChangeAttributeActivity()
	 * @see #getSDL2UMLProcess_SDL2UMLProcess_R1()
	 * @generated
	 */
	EReference getSDL2UMLProcess_SDL2UMLProcess_R1_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#getTransformForwardActivity()
	 * @see #getSDL2UMLProcess_SDL2UMLProcess_R1()
	 * @generated
	 */
	EReference getSDL2UMLProcess_SDL2UMLProcess_R1_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#getTransformMappingActivity()
	 * @see #getSDL2UMLProcess_SDL2UMLProcess_R1()
	 * @generated
	 */
	EReference getSDL2UMLProcess_SDL2UMLProcess_R1_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#getTransformBackwardActivity()
	 * @see #getSDL2UMLProcess_SDL2UMLProcess_R1()
	 * @generated
	 */
	EReference getSDL2UMLProcess_SDL2UMLProcess_R1_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#getConflictCheckForwardActivity()
	 * @see #getSDL2UMLProcess_SDL2UMLProcess_R1()
	 * @generated
	 */
	EReference getSDL2UMLProcess_SDL2UMLProcess_R1_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#getConflictCheckMappingActivity()
	 * @see #getSDL2UMLProcess_SDL2UMLProcess_R1()
	 * @generated
	 */
	EReference getSDL2UMLProcess_SDL2UMLProcess_R1_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#getConflictCheckBackwardActivity()
	 * @see #getSDL2UMLProcess_SDL2UMLProcess_R1()
	 * @generated
	 */
	EReference getSDL2UMLProcess_SDL2UMLProcess_R1_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#getSynchronizeForwardActivity()
	 * @see #getSDL2UMLProcess_SDL2UMLProcess_R1()
	 * @generated
	 */
	EReference getSDL2UMLProcess_SDL2UMLProcess_R1_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#getSynchronizeBackwardActivity()
	 * @see #getSDL2UMLProcess_SDL2UMLProcess_R1()
	 * @generated
	 */
	EReference getSDL2UMLProcess_SDL2UMLProcess_R1_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#getRepairForwardActivity()
	 * @see #getSDL2UMLProcess_SDL2UMLProcess_R1()
	 * @generated
	 */
	EReference getSDL2UMLProcess_SDL2UMLProcess_R1_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#getRepairBackwardActivity()
	 * @see #getSDL2UMLProcess_SDL2UMLProcess_R1()
	 * @generated
	 */
	EReference getSDL2UMLProcess_SDL2UMLProcess_R1_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getSDL2UMLProcess_SDL2UMLProcess_R1__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getSDL2UMLProcess_SDL2UMLProcess_R1__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getSDL2UMLProcess_SDL2UMLProcess_R1__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLProcess_SDL2UMLProcess_R1__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLProcess_SDL2UMLProcess_R1__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLProcess_SDL2UMLProcess_R1__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getSDL2UMLProcess_SDL2UMLProcess_R1__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getSDL2UMLProcess_SDL2UMLProcess_R1__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getSDL2UMLProcess_SDL2UMLProcess_R1__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLProcess_SDL2UMLProcess_R1__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLProcess_SDL2UMLProcess_R1__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLProcess_SDL2UMLProcess_R1__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLProcess_SDL2UMLProcess_R1__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1 <em>SDL2UML Block SDL2UML Block R1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDL2UML Block SDL2UML Block R1</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1
	 * @generated
	 */
	EClass getSDL2UMLBlock_SDL2UMLBlock_R1();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#getAddElementActivity()
	 * @see #getSDL2UMLBlock_SDL2UMLBlock_R1()
	 * @generated
	 */
	EReference getSDL2UMLBlock_SDL2UMLBlock_R1_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#getMoveElementActivity()
	 * @see #getSDL2UMLBlock_SDL2UMLBlock_R1()
	 * @generated
	 */
	EReference getSDL2UMLBlock_SDL2UMLBlock_R1_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#getChangeAttributeActivity()
	 * @see #getSDL2UMLBlock_SDL2UMLBlock_R1()
	 * @generated
	 */
	EReference getSDL2UMLBlock_SDL2UMLBlock_R1_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#getTransformForwardActivity()
	 * @see #getSDL2UMLBlock_SDL2UMLBlock_R1()
	 * @generated
	 */
	EReference getSDL2UMLBlock_SDL2UMLBlock_R1_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#getTransformMappingActivity()
	 * @see #getSDL2UMLBlock_SDL2UMLBlock_R1()
	 * @generated
	 */
	EReference getSDL2UMLBlock_SDL2UMLBlock_R1_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#getTransformBackwardActivity()
	 * @see #getSDL2UMLBlock_SDL2UMLBlock_R1()
	 * @generated
	 */
	EReference getSDL2UMLBlock_SDL2UMLBlock_R1_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#getConflictCheckForwardActivity()
	 * @see #getSDL2UMLBlock_SDL2UMLBlock_R1()
	 * @generated
	 */
	EReference getSDL2UMLBlock_SDL2UMLBlock_R1_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#getConflictCheckMappingActivity()
	 * @see #getSDL2UMLBlock_SDL2UMLBlock_R1()
	 * @generated
	 */
	EReference getSDL2UMLBlock_SDL2UMLBlock_R1_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#getConflictCheckBackwardActivity()
	 * @see #getSDL2UMLBlock_SDL2UMLBlock_R1()
	 * @generated
	 */
	EReference getSDL2UMLBlock_SDL2UMLBlock_R1_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#getSynchronizeForwardActivity()
	 * @see #getSDL2UMLBlock_SDL2UMLBlock_R1()
	 * @generated
	 */
	EReference getSDL2UMLBlock_SDL2UMLBlock_R1_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#getSynchronizeBackwardActivity()
	 * @see #getSDL2UMLBlock_SDL2UMLBlock_R1()
	 * @generated
	 */
	EReference getSDL2UMLBlock_SDL2UMLBlock_R1_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#getRepairForwardActivity()
	 * @see #getSDL2UMLBlock_SDL2UMLBlock_R1()
	 * @generated
	 */
	EReference getSDL2UMLBlock_SDL2UMLBlock_R1_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#getRepairBackwardActivity()
	 * @see #getSDL2UMLBlock_SDL2UMLBlock_R1()
	 * @generated
	 */
	EReference getSDL2UMLBlock_SDL2UMLBlock_R1_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getSDL2UMLBlock_SDL2UMLBlock_R1__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getSDL2UMLBlock_SDL2UMLBlock_R1__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getSDL2UMLBlock_SDL2UMLBlock_R1__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLBlock_SDL2UMLBlock_R1__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLBlock_SDL2UMLBlock_R1__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLBlock_SDL2UMLBlock_R1__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getSDL2UMLBlock_SDL2UMLBlock_R1__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getSDL2UMLBlock_SDL2UMLBlock_R1__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getSDL2UMLBlock_SDL2UMLBlock_R1__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLBlock_SDL2UMLBlock_R1__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLBlock_SDL2UMLBlock_R1__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLBlock_SDL2UMLBlock_R1__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getSDL2UMLBlock_SDL2UMLBlock_R1__RepairBackward__TGGNode_boolean();

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
		 * The meta object literal for the '{@link de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLOperationalTGGImpl <em>SDL2UML Operational TGG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLOperationalTGGImpl
		 * @see de.mdelab.mltgg.sdl2uml.generated.impl.GeneratedPackageImpl#getSDL2UMLOperationalTGG()
		 * @generated
		 */
		EClass SDL2UML_OPERATIONAL_TGG = eINSTANCE.getSDL2UMLOperationalTGG();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLAxiomImpl <em>SDL2UML Axiom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLAxiomImpl
		 * @see de.mdelab.mltgg.sdl2uml.generated.impl.GeneratedPackageImpl#getSDL2UMLAxiom()
		 * @generated
		 */
		EClass SDL2UML_AXIOM = eINSTANCE.getSDL2UMLAxiom();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLConnectionVar3Impl <em>SDL2UML Connection Var3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLConnectionVar3Impl
		 * @see de.mdelab.mltgg.sdl2uml.generated.impl.GeneratedPackageImpl#getSDL2UMLConnectionVar3()
		 * @generated
		 */
		EClass SDL2UML_CONNECTION_VAR3 = eINSTANCE.getSDL2UMLConnectionVar3();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLProcessImpl <em>SDL2UML Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLProcessImpl
		 * @see de.mdelab.mltgg.sdl2uml.generated.impl.GeneratedPackageImpl#getSDL2UMLProcess()
		 * @generated
		 */
		EClass SDL2UML_PROCESS = eINSTANCE.getSDL2UMLProcess();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLBlockImpl <em>SDL2UML Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLBlockImpl
		 * @see de.mdelab.mltgg.sdl2uml.generated.impl.GeneratedPackageImpl#getSDL2UMLBlock()
		 * @generated
		 */
		EClass SDL2UML_BLOCK = eINSTANCE.getSDL2UMLBlock();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLConnectionVar1Impl <em>SDL2UML Connection Var1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLConnectionVar1Impl
		 * @see de.mdelab.mltgg.sdl2uml.generated.impl.GeneratedPackageImpl#getSDL2UMLConnectionVar1()
		 * @generated
		 */
		EClass SDL2UML_CONNECTION_VAR1 = eINSTANCE.getSDL2UMLConnectionVar1();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLConnectionVar2Impl <em>SDL2UML Connection Var2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLConnectionVar2Impl
		 * @see de.mdelab.mltgg.sdl2uml.generated.impl.GeneratedPackageImpl#getSDL2UMLConnectionVar2()
		 * @generated
		 */
		EClass SDL2UML_CONNECTION_VAR2 = eINSTANCE.getSDL2UMLConnectionVar2();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLSystemBlockImpl <em>SDL2UML System Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLSystemBlockImpl
		 * @see de.mdelab.mltgg.sdl2uml.generated.impl.GeneratedPackageImpl#getSDL2UMLSystemBlock()
		 * @generated
		 */
		EClass SDL2UML_SYSTEM_BLOCK = eINSTANCE.getSDL2UMLSystemBlock();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLAxiom_SDL2UMLAxiom_R1Impl <em>SDL2UML Axiom SDL2UML Axiom R1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLAxiom_SDL2UMLAxiom_R1Impl
		 * @see de.mdelab.mltgg.sdl2uml.generated.impl.GeneratedPackageImpl#getSDL2UMLAxiom_SDL2UMLAxiom_R1()
		 * @generated
		 */
		EClass SDL2UML_AXIOM_SDL2UML_AXIOM_R1 = eINSTANCE
				.getSDL2UMLAxiom_SDL2UMLAxiom_R1();

		/**
		 * The meta object literal for the '<em><b>Add Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_AXIOM_SDL2UML_AXIOM_R1__ADD_ELEMENT_ACTIVITY = eINSTANCE
				.getSDL2UMLAxiom_SDL2UMLAxiom_R1_AddElementActivity();

		/**
		 * The meta object literal for the '<em><b>Move Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_AXIOM_SDL2UML_AXIOM_R1__MOVE_ELEMENT_ACTIVITY = eINSTANCE
				.getSDL2UMLAxiom_SDL2UMLAxiom_R1_MoveElementActivity();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_AXIOM_SDL2UML_AXIOM_R1__CHANGE_ATTRIBUTE_ACTIVITY = eINSTANCE
				.getSDL2UMLAxiom_SDL2UMLAxiom_R1_ChangeAttributeActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_AXIOM_SDL2UML_AXIOM_R1__TRANSFORM_FORWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLAxiom_SDL2UMLAxiom_R1_TransformForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_AXIOM_SDL2UML_AXIOM_R1__TRANSFORM_MAPPING_ACTIVITY = eINSTANCE
				.getSDL2UMLAxiom_SDL2UMLAxiom_R1_TransformMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_AXIOM_SDL2UML_AXIOM_R1__TRANSFORM_BACKWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLAxiom_SDL2UMLAxiom_R1_TransformBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_AXIOM_SDL2UML_AXIOM_R1__SYNCHRONIZE_FORWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLAxiom_SDL2UMLAxiom_R1_SynchronizeForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_AXIOM_SDL2UML_AXIOM_R1__SYNCHRONIZE_BACKWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLAxiom_SDL2UMLAxiom_R1_SynchronizeBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_AXIOM_SDL2UML_AXIOM_R1___ADD_ELEMENT__EMAP_ELIST_ELIST = eINSTANCE
				.getSDL2UMLAxiom_SDL2UMLAxiom_R1__AddElement__EMap_EList_EList();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_AXIOM_SDL2UML_AXIOM_R1___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = eINSTANCE
				.getSDL2UMLAxiom_SDL2UMLAxiom_R1__ChangeAttributeValues__TGGNode_EMap();

		/**
		 * The meta object literal for the '<em><b>Transform Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_AXIOM_SDL2UML_AXIOM_R1___TRANSFORM_FORWARD__ELIST_ELIST_BOOLEAN = eINSTANCE
				.getSDL2UMLAxiom_SDL2UMLAxiom_R1__TransformForward__EList_EList_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_AXIOM_SDL2UML_AXIOM_R1___TRANSFORM_MAPPING__ELIST_ELIST_BOOLEAN = eINSTANCE
				.getSDL2UMLAxiom_SDL2UMLAxiom_R1__TransformMapping__EList_EList_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_AXIOM_SDL2UML_AXIOM_R1___TRANSFORM_BACKWARD__ELIST_ELIST_BOOLEAN = eINSTANCE
				.getSDL2UMLAxiom_SDL2UMLAxiom_R1__TransformBackward__EList_EList_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_AXIOM_SDL2UML_AXIOM_R1___SYNCHRONIZE_FORWARD__ELIST_ELIST_TGGNODE_BOOLEAN = eINSTANCE
				.getSDL2UMLAxiom_SDL2UMLAxiom_R1__SynchronizeForward__EList_EList_TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_AXIOM_SDL2UML_AXIOM_R1___SYNCHRONIZE_BACKWARD__ELIST_ELIST_TGGNODE_BOOLEAN = eINSTANCE
				.getSDL2UMLAxiom_SDL2UMLAxiom_R1__SynchronizeBackward__EList_EList_TGGNode_boolean();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1Impl <em>SDL2UML System Block SDL2UML System Block R1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1Impl
		 * @see de.mdelab.mltgg.sdl2uml.generated.impl.GeneratedPackageImpl#getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1()
		 * @generated
		 */
		EClass SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1 = eINSTANCE
				.getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1();

		/**
		 * The meta object literal for the '<em><b>Add Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1__ADD_ELEMENT_ACTIVITY = eINSTANCE
				.getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_AddElementActivity();

		/**
		 * The meta object literal for the '<em><b>Move Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1__MOVE_ELEMENT_ACTIVITY = eINSTANCE
				.getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_MoveElementActivity();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1__CHANGE_ATTRIBUTE_ACTIVITY = eINSTANCE
				.getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_ChangeAttributeActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1__TRANSFORM_FORWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_TransformForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1__TRANSFORM_MAPPING_ACTIVITY = eINSTANCE
				.getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_TransformMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1__TRANSFORM_BACKWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_TransformBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1__CONFLICT_CHECK_FORWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_ConflictCheckForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1__CONFLICT_CHECK_MAPPING_ACTIVITY = eINSTANCE
				.getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_ConflictCheckMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1__CONFLICT_CHECK_BACKWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_ConflictCheckBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1__SYNCHRONIZE_FORWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_SynchronizeForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1__SYNCHRONIZE_BACKWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_SynchronizeBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1__REPAIR_FORWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_RepairForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1__REPAIR_BACKWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_RepairBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1___ADD_ELEMENT__EMAP = eINSTANCE
				.getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1__AddElement__EMap();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = eINSTANCE
				.getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1__ChangeAttributeValues__TGGNode_EMap();

		/**
		 * The meta object literal for the '<em><b>Move Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = eINSTANCE
				.getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1__MoveElement__TGGNode_TGGNode_TGGNode();

		/**
		 * The meta object literal for the '<em><b>Transform Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1__TransformForward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1__TransformMapping__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1__TransformBackward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1___CONFLICT_CHECK_FORWARD__TGGNODE = eINSTANCE
				.getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1__ConflictCheckForward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1___CONFLICT_CHECK_MAPPING__TGGNODE = eINSTANCE
				.getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1__ConflictCheckMapping__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1___CONFLICT_CHECK_BACKWARD__TGGNODE = eINSTANCE
				.getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1__ConflictCheckBackward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1__SynchronizeForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1__SynchronizeBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1___REPAIR_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1__RepairForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1___REPAIR_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1__RepairBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1Impl <em>SDL2UML Connection Var2 SDL2UML Connection Var2 R1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1Impl
		 * @see de.mdelab.mltgg.sdl2uml.generated.impl.GeneratedPackageImpl#getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1()
		 * @generated
		 */
		EClass SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1 = eINSTANCE
				.getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1();

		/**
		 * The meta object literal for the '<em><b>Add Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1__ADD_ELEMENT_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1_AddElementActivity();

		/**
		 * The meta object literal for the '<em><b>Move Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1__MOVE_ELEMENT_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1_MoveElementActivity();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1__CHANGE_ATTRIBUTE_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1_ChangeAttributeActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1__TRANSFORM_FORWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1_TransformForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1__TRANSFORM_MAPPING_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1_TransformMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1__TRANSFORM_BACKWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1_TransformBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1__CONFLICT_CHECK_FORWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1_ConflictCheckForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1__CONFLICT_CHECK_MAPPING_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1_ConflictCheckMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1__CONFLICT_CHECK_BACKWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1_ConflictCheckBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1__SYNCHRONIZE_FORWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1_SynchronizeForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1__SYNCHRONIZE_BACKWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1_SynchronizeBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1__REPAIR_FORWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1_RepairForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1__REPAIR_BACKWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1_RepairBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1___ADD_ELEMENT__EMAP = eINSTANCE
				.getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1__AddElement__EMap();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = eINSTANCE
				.getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1__ChangeAttributeValues__TGGNode_EMap();

		/**
		 * The meta object literal for the '<em><b>Move Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = eINSTANCE
				.getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1__MoveElement__TGGNode_TGGNode_TGGNode();

		/**
		 * The meta object literal for the '<em><b>Transform Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1__TransformForward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1__TransformMapping__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1__TransformBackward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1___CONFLICT_CHECK_FORWARD__TGGNODE = eINSTANCE
				.getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1__ConflictCheckForward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1___CONFLICT_CHECK_MAPPING__TGGNODE = eINSTANCE
				.getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1__ConflictCheckMapping__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1___CONFLICT_CHECK_BACKWARD__TGGNODE = eINSTANCE
				.getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1__ConflictCheckBackward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1__SynchronizeForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1__SynchronizeBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1___REPAIR_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1__RepairForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1___REPAIR_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1__RepairBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1Impl <em>SDL2UML Connection Var1 SDL2UML Connection Var1 R1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1Impl
		 * @see de.mdelab.mltgg.sdl2uml.generated.impl.GeneratedPackageImpl#getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1()
		 * @generated
		 */
		EClass SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1 = eINSTANCE
				.getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1();

		/**
		 * The meta object literal for the '<em><b>Add Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1__ADD_ELEMENT_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1_AddElementActivity();

		/**
		 * The meta object literal for the '<em><b>Move Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1__MOVE_ELEMENT_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1_MoveElementActivity();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1__CHANGE_ATTRIBUTE_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1_ChangeAttributeActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1__TRANSFORM_FORWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1_TransformForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1__TRANSFORM_MAPPING_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1_TransformMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1__TRANSFORM_BACKWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1_TransformBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1__CONFLICT_CHECK_FORWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1_ConflictCheckForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1__CONFLICT_CHECK_MAPPING_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1_ConflictCheckMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1__CONFLICT_CHECK_BACKWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1_ConflictCheckBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1__SYNCHRONIZE_FORWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1_SynchronizeForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1__SYNCHRONIZE_BACKWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1_SynchronizeBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1__REPAIR_FORWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1_RepairForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1__REPAIR_BACKWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1_RepairBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1___ADD_ELEMENT__EMAP = eINSTANCE
				.getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1__AddElement__EMap();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = eINSTANCE
				.getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1__ChangeAttributeValues__TGGNode_EMap();

		/**
		 * The meta object literal for the '<em><b>Move Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = eINSTANCE
				.getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1__MoveElement__TGGNode_TGGNode_TGGNode();

		/**
		 * The meta object literal for the '<em><b>Transform Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1__TransformForward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1__TransformMapping__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1__TransformBackward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1___CONFLICT_CHECK_FORWARD__TGGNODE = eINSTANCE
				.getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1__ConflictCheckForward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1___CONFLICT_CHECK_MAPPING__TGGNODE = eINSTANCE
				.getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1__ConflictCheckMapping__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1___CONFLICT_CHECK_BACKWARD__TGGNODE = eINSTANCE
				.getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1__ConflictCheckBackward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1__SynchronizeForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1__SynchronizeBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1___REPAIR_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1__RepairForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1___REPAIR_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1__RepairBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1Impl <em>SDL2UML Connection Var3 SDL2UML Connection Var3 R1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1Impl
		 * @see de.mdelab.mltgg.sdl2uml.generated.impl.GeneratedPackageImpl#getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1()
		 * @generated
		 */
		EClass SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1 = eINSTANCE
				.getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1();

		/**
		 * The meta object literal for the '<em><b>Add Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1__ADD_ELEMENT_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1_AddElementActivity();

		/**
		 * The meta object literal for the '<em><b>Move Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1__MOVE_ELEMENT_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1_MoveElementActivity();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1__CHANGE_ATTRIBUTE_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1_ChangeAttributeActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1__TRANSFORM_FORWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1_TransformForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1__TRANSFORM_MAPPING_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1_TransformMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1__TRANSFORM_BACKWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1_TransformBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1__CONFLICT_CHECK_FORWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1_ConflictCheckForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1__CONFLICT_CHECK_MAPPING_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1_ConflictCheckMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1__CONFLICT_CHECK_BACKWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1_ConflictCheckBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1__SYNCHRONIZE_FORWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1_SynchronizeForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1__SYNCHRONIZE_BACKWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1_SynchronizeBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1__REPAIR_FORWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1_RepairForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1__REPAIR_BACKWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1_RepairBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1___ADD_ELEMENT__EMAP = eINSTANCE
				.getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1__AddElement__EMap();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = eINSTANCE
				.getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1__ChangeAttributeValues__TGGNode_EMap();

		/**
		 * The meta object literal for the '<em><b>Move Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = eINSTANCE
				.getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1__MoveElement__TGGNode_TGGNode_TGGNode();

		/**
		 * The meta object literal for the '<em><b>Transform Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1__TransformForward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1__TransformMapping__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1__TransformBackward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1___CONFLICT_CHECK_FORWARD__TGGNODE = eINSTANCE
				.getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1__ConflictCheckForward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1___CONFLICT_CHECK_MAPPING__TGGNODE = eINSTANCE
				.getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1__ConflictCheckMapping__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1___CONFLICT_CHECK_BACKWARD__TGGNODE = eINSTANCE
				.getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1__ConflictCheckBackward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1__SynchronizeForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1__SynchronizeBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1___REPAIR_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1__RepairForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1___REPAIR_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1__RepairBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLProcess_SDL2UMLProcess_R1Impl <em>SDL2UML Process SDL2UML Process R1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLProcess_SDL2UMLProcess_R1Impl
		 * @see de.mdelab.mltgg.sdl2uml.generated.impl.GeneratedPackageImpl#getSDL2UMLProcess_SDL2UMLProcess_R1()
		 * @generated
		 */
		EClass SDL2UML_PROCESS_SDL2UML_PROCESS_R1 = eINSTANCE
				.getSDL2UMLProcess_SDL2UMLProcess_R1();

		/**
		 * The meta object literal for the '<em><b>Add Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_PROCESS_SDL2UML_PROCESS_R1__ADD_ELEMENT_ACTIVITY = eINSTANCE
				.getSDL2UMLProcess_SDL2UMLProcess_R1_AddElementActivity();

		/**
		 * The meta object literal for the '<em><b>Move Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_PROCESS_SDL2UML_PROCESS_R1__MOVE_ELEMENT_ACTIVITY = eINSTANCE
				.getSDL2UMLProcess_SDL2UMLProcess_R1_MoveElementActivity();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_PROCESS_SDL2UML_PROCESS_R1__CHANGE_ATTRIBUTE_ACTIVITY = eINSTANCE
				.getSDL2UMLProcess_SDL2UMLProcess_R1_ChangeAttributeActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_PROCESS_SDL2UML_PROCESS_R1__TRANSFORM_FORWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLProcess_SDL2UMLProcess_R1_TransformForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_PROCESS_SDL2UML_PROCESS_R1__TRANSFORM_MAPPING_ACTIVITY = eINSTANCE
				.getSDL2UMLProcess_SDL2UMLProcess_R1_TransformMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_PROCESS_SDL2UML_PROCESS_R1__TRANSFORM_BACKWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLProcess_SDL2UMLProcess_R1_TransformBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_PROCESS_SDL2UML_PROCESS_R1__CONFLICT_CHECK_FORWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLProcess_SDL2UMLProcess_R1_ConflictCheckForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_PROCESS_SDL2UML_PROCESS_R1__CONFLICT_CHECK_MAPPING_ACTIVITY = eINSTANCE
				.getSDL2UMLProcess_SDL2UMLProcess_R1_ConflictCheckMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_PROCESS_SDL2UML_PROCESS_R1__CONFLICT_CHECK_BACKWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLProcess_SDL2UMLProcess_R1_ConflictCheckBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_PROCESS_SDL2UML_PROCESS_R1__SYNCHRONIZE_FORWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLProcess_SDL2UMLProcess_R1_SynchronizeForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_PROCESS_SDL2UML_PROCESS_R1__SYNCHRONIZE_BACKWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLProcess_SDL2UMLProcess_R1_SynchronizeBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_PROCESS_SDL2UML_PROCESS_R1__REPAIR_FORWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLProcess_SDL2UMLProcess_R1_RepairForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_PROCESS_SDL2UML_PROCESS_R1__REPAIR_BACKWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLProcess_SDL2UMLProcess_R1_RepairBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_PROCESS_SDL2UML_PROCESS_R1___ADD_ELEMENT__EMAP = eINSTANCE
				.getSDL2UMLProcess_SDL2UMLProcess_R1__AddElement__EMap();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_PROCESS_SDL2UML_PROCESS_R1___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = eINSTANCE
				.getSDL2UMLProcess_SDL2UMLProcess_R1__ChangeAttributeValues__TGGNode_EMap();

		/**
		 * The meta object literal for the '<em><b>Move Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_PROCESS_SDL2UML_PROCESS_R1___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = eINSTANCE
				.getSDL2UMLProcess_SDL2UMLProcess_R1__MoveElement__TGGNode_TGGNode_TGGNode();

		/**
		 * The meta object literal for the '<em><b>Transform Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_PROCESS_SDL2UML_PROCESS_R1___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getSDL2UMLProcess_SDL2UMLProcess_R1__TransformForward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_PROCESS_SDL2UML_PROCESS_R1___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getSDL2UMLProcess_SDL2UMLProcess_R1__TransformMapping__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_PROCESS_SDL2UML_PROCESS_R1___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getSDL2UMLProcess_SDL2UMLProcess_R1__TransformBackward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_PROCESS_SDL2UML_PROCESS_R1___CONFLICT_CHECK_FORWARD__TGGNODE = eINSTANCE
				.getSDL2UMLProcess_SDL2UMLProcess_R1__ConflictCheckForward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_PROCESS_SDL2UML_PROCESS_R1___CONFLICT_CHECK_MAPPING__TGGNODE = eINSTANCE
				.getSDL2UMLProcess_SDL2UMLProcess_R1__ConflictCheckMapping__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_PROCESS_SDL2UML_PROCESS_R1___CONFLICT_CHECK_BACKWARD__TGGNODE = eINSTANCE
				.getSDL2UMLProcess_SDL2UMLProcess_R1__ConflictCheckBackward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_PROCESS_SDL2UML_PROCESS_R1___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getSDL2UMLProcess_SDL2UMLProcess_R1__SynchronizeForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_PROCESS_SDL2UML_PROCESS_R1___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getSDL2UMLProcess_SDL2UMLProcess_R1__SynchronizeBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_PROCESS_SDL2UML_PROCESS_R1___REPAIR_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getSDL2UMLProcess_SDL2UMLProcess_R1__RepairForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_PROCESS_SDL2UML_PROCESS_R1___REPAIR_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getSDL2UMLProcess_SDL2UMLProcess_R1__RepairBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLBlock_SDL2UMLBlock_R1Impl <em>SDL2UML Block SDL2UML Block R1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.sdl2uml.generated.impl.SDL2UMLBlock_SDL2UMLBlock_R1Impl
		 * @see de.mdelab.mltgg.sdl2uml.generated.impl.GeneratedPackageImpl#getSDL2UMLBlock_SDL2UMLBlock_R1()
		 * @generated
		 */
		EClass SDL2UML_BLOCK_SDL2UML_BLOCK_R1 = eINSTANCE
				.getSDL2UMLBlock_SDL2UMLBlock_R1();

		/**
		 * The meta object literal for the '<em><b>Add Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_BLOCK_SDL2UML_BLOCK_R1__ADD_ELEMENT_ACTIVITY = eINSTANCE
				.getSDL2UMLBlock_SDL2UMLBlock_R1_AddElementActivity();

		/**
		 * The meta object literal for the '<em><b>Move Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_BLOCK_SDL2UML_BLOCK_R1__MOVE_ELEMENT_ACTIVITY = eINSTANCE
				.getSDL2UMLBlock_SDL2UMLBlock_R1_MoveElementActivity();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_BLOCK_SDL2UML_BLOCK_R1__CHANGE_ATTRIBUTE_ACTIVITY = eINSTANCE
				.getSDL2UMLBlock_SDL2UMLBlock_R1_ChangeAttributeActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_BLOCK_SDL2UML_BLOCK_R1__TRANSFORM_FORWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLBlock_SDL2UMLBlock_R1_TransformForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_BLOCK_SDL2UML_BLOCK_R1__TRANSFORM_MAPPING_ACTIVITY = eINSTANCE
				.getSDL2UMLBlock_SDL2UMLBlock_R1_TransformMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_BLOCK_SDL2UML_BLOCK_R1__TRANSFORM_BACKWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLBlock_SDL2UMLBlock_R1_TransformBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_BLOCK_SDL2UML_BLOCK_R1__CONFLICT_CHECK_FORWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLBlock_SDL2UMLBlock_R1_ConflictCheckForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_BLOCK_SDL2UML_BLOCK_R1__CONFLICT_CHECK_MAPPING_ACTIVITY = eINSTANCE
				.getSDL2UMLBlock_SDL2UMLBlock_R1_ConflictCheckMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_BLOCK_SDL2UML_BLOCK_R1__CONFLICT_CHECK_BACKWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLBlock_SDL2UMLBlock_R1_ConflictCheckBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_BLOCK_SDL2UML_BLOCK_R1__SYNCHRONIZE_FORWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLBlock_SDL2UMLBlock_R1_SynchronizeForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_BLOCK_SDL2UML_BLOCK_R1__SYNCHRONIZE_BACKWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLBlock_SDL2UMLBlock_R1_SynchronizeBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_BLOCK_SDL2UML_BLOCK_R1__REPAIR_FORWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLBlock_SDL2UMLBlock_R1_RepairForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL2UML_BLOCK_SDL2UML_BLOCK_R1__REPAIR_BACKWARD_ACTIVITY = eINSTANCE
				.getSDL2UMLBlock_SDL2UMLBlock_R1_RepairBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_BLOCK_SDL2UML_BLOCK_R1___ADD_ELEMENT__EMAP = eINSTANCE
				.getSDL2UMLBlock_SDL2UMLBlock_R1__AddElement__EMap();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_BLOCK_SDL2UML_BLOCK_R1___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = eINSTANCE
				.getSDL2UMLBlock_SDL2UMLBlock_R1__ChangeAttributeValues__TGGNode_EMap();

		/**
		 * The meta object literal for the '<em><b>Move Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_BLOCK_SDL2UML_BLOCK_R1___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = eINSTANCE
				.getSDL2UMLBlock_SDL2UMLBlock_R1__MoveElement__TGGNode_TGGNode_TGGNode();

		/**
		 * The meta object literal for the '<em><b>Transform Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_BLOCK_SDL2UML_BLOCK_R1___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getSDL2UMLBlock_SDL2UMLBlock_R1__TransformForward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_BLOCK_SDL2UML_BLOCK_R1___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getSDL2UMLBlock_SDL2UMLBlock_R1__TransformMapping__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_BLOCK_SDL2UML_BLOCK_R1___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getSDL2UMLBlock_SDL2UMLBlock_R1__TransformBackward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_BLOCK_SDL2UML_BLOCK_R1___CONFLICT_CHECK_FORWARD__TGGNODE = eINSTANCE
				.getSDL2UMLBlock_SDL2UMLBlock_R1__ConflictCheckForward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_BLOCK_SDL2UML_BLOCK_R1___CONFLICT_CHECK_MAPPING__TGGNODE = eINSTANCE
				.getSDL2UMLBlock_SDL2UMLBlock_R1__ConflictCheckMapping__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_BLOCK_SDL2UML_BLOCK_R1___CONFLICT_CHECK_BACKWARD__TGGNODE = eINSTANCE
				.getSDL2UMLBlock_SDL2UMLBlock_R1__ConflictCheckBackward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_BLOCK_SDL2UML_BLOCK_R1___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getSDL2UMLBlock_SDL2UMLBlock_R1__SynchronizeForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_BLOCK_SDL2UML_BLOCK_R1___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getSDL2UMLBlock_SDL2UMLBlock_R1__SynchronizeBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_BLOCK_SDL2UML_BLOCK_R1___REPAIR_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getSDL2UMLBlock_SDL2UMLBlock_R1__RepairForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDL2UML_BLOCK_SDL2UML_BLOCK_R1___REPAIR_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getSDL2UMLBlock_SDL2UMLBlock_R1__RepairBackward__TGGNode_boolean();

	}

} //GeneratedPackage
