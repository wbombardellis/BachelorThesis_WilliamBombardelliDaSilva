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
	 * The meta object id for the '{@link de.silvawb.uml2java.generated.impl.uIAttribute2jIAttributeImpl <em>uI Attribute2j IAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.uml2java.generated.impl.uIAttribute2jIAttributeImpl
	 * @see de.silvawb.uml2java.generated.impl.GeneratedPackageImpl#getuIAttribute2jIAttribute()
	 * @generated
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>uI Attribute2j IAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>uI Attribute2j IAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.uml2java.generated.impl.uClass2jClass_RuleImpl <em>uClass2j Class Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.uml2java.generated.impl.uClass2jClass_RuleImpl
	 * @see de.silvawb.uml2java.generated.impl.GeneratedPackageImpl#getuClass2jClass_Rule()
	 * @generated
	 */
	int UCLASS2J_CLASS_RULE = 3;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>uClass2j Class Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>uClass2j Class Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.uml2java.generated.impl.uIRealization2jIImplementation_RuleImpl <em>uI Realization2j IImplementation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.uml2java.generated.impl.uIRealization2jIImplementation_RuleImpl
	 * @see de.silvawb.uml2java.generated.impl.GeneratedPackageImpl#getuIRealization2jIImplementation_Rule()
	 * @generated
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE = 4;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>uI Realization2j IImplementation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>uI Realization2j IImplementation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link de.silvawb.uml2java.generated.impl.uPackage2jPackage_RuleImpl <em>uPackage2j Package Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.uml2java.generated.impl.uPackage2jPackage_RuleImpl
	 * @see de.silvawb.uml2java.generated.impl.GeneratedPackageImpl#getuPackage2jPackage_Rule()
	 * @generated
	 */
	int UPACKAGE2J_PACKAGE_RULE = 5;

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
	 * The meta object id for the '{@link de.silvawb.uml2java.generated.impl.uCAttribute2jCAttribute_RuleImpl <em>uC Attribute2j CAttribute Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.uml2java.generated.impl.uCAttribute2jCAttribute_RuleImpl
	 * @see de.silvawb.uml2java.generated.impl.GeneratedPackageImpl#getuCAttribute2jCAttribute_Rule()
	 * @generated
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE = 6;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>uC Attribute2j CAttribute Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>uC Attribute2j CAttribute Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link de.silvawb.uml2java.generated.impl.uIOperation2jIMethod_RuleImpl <em>uI Operation2j IMethod Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.uml2java.generated.impl.uIOperation2jIMethod_RuleImpl
	 * @see de.silvawb.uml2java.generated.impl.GeneratedPackageImpl#getuIOperation2jIMethod_Rule()
	 * @generated
	 */
	int UI_OPERATION2J_IMETHOD_RULE = 7;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>uI Operation2j IMethod Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>uI Operation2j IMethod Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.uml2java.generated.impl.uCOperation2jCMethod_RuleImpl <em>uC Operation2j CMethod Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.uml2java.generated.impl.uCOperation2jCMethod_RuleImpl
	 * @see de.silvawb.uml2java.generated.impl.GeneratedPackageImpl#getuCOperation2jCMethod_Rule()
	 * @generated
	 */
	int UC_OPERATION2J_CMETHOD_RULE = 8;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>uC Operation2j CMethod Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>uC Operation2j CMethod Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.uml2java.generated.impl.uCGeneralization2jCGeneralization_RuleImpl <em>uC Generalization2j CGeneralization Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.uml2java.generated.impl.uCGeneralization2jCGeneralization_RuleImpl
	 * @see de.silvawb.uml2java.generated.impl.GeneratedPackageImpl#getuCGeneralization2jCGeneralization_Rule()
	 * @generated
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE = 9;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>uC Generalization2j CGeneralization Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>uC Generalization2j CGeneralization Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link de.silvawb.uml2java.generated.impl.uInterface2jInterface_RuleImpl <em>uInterface2j Interface Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.uml2java.generated.impl.uInterface2jInterface_RuleImpl
	 * @see de.silvawb.uml2java.generated.impl.GeneratedPackageImpl#getuInterface2jInterface_Rule()
	 * @generated
	 */
	int UINTERFACE2J_INTERFACE_RULE = 10;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>uInterface2j Interface Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>uInterface2j Interface Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.uml2java.generated.impl.uml2javaAxiom_r1Impl <em>uml2java Axiom r1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.uml2java.generated.impl.uml2javaAxiom_r1Impl
	 * @see de.silvawb.uml2java.generated.impl.GeneratedPackageImpl#getuml2javaAxiom_r1()
	 * @generated
	 */
	int UML2JAVA_AXIOM_R1 = 11;

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
	int UPACKAGE2J_PACKAGE_RULE_R2 = 12;

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
	 * The meta object id for the '{@link de.silvawb.uml2java.generated.impl.uCOperation2jCMethod_Rule_r5Impl <em>uC Operation2j CMethod Rule r5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.uml2java.generated.impl.uCOperation2jCMethod_Rule_r5Impl
	 * @see de.silvawb.uml2java.generated.impl.GeneratedPackageImpl#getuCOperation2jCMethod_Rule_r5()
	 * @generated
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5 = 13;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>uC Operation2j CMethod Rule r5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>uC Operation2j CMethod Rule r5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION2J_CMETHOD_RULE_R5_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link de.silvawb.uml2java.generated.impl.uCGeneralization2jCGeneralization_Rule_r10Impl <em>uC Generalization2j CGeneralization Rule r10</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.uml2java.generated.impl.uCGeneralization2jCGeneralization_Rule_r10Impl
	 * @see de.silvawb.uml2java.generated.impl.GeneratedPackageImpl#getuCGeneralization2jCGeneralization_Rule_r10()
	 * @generated
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10 = 14;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>uC Generalization2j CGeneralization Rule r10</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>uC Generalization2j CGeneralization Rule r10</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_GENERALIZATION2J_CGENERALIZATION_RULE_R10_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The meta object id for the '{@link de.silvawb.uml2java.generated.impl.uIRealization2jIImplementation_Rule_r9Impl <em>uI Realization2j IImplementation Rule r9</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.uml2java.generated.impl.uIRealization2jIImplementation_Rule_r9Impl
	 * @see de.silvawb.uml2java.generated.impl.GeneratedPackageImpl#getuIRealization2jIImplementation_Rule_r9()
	 * @generated
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9 = 15;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>uI Realization2j IImplementation Rule r9</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>uI Realization2j IImplementation Rule r9</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The meta object id for the '{@link de.silvawb.uml2java.generated.impl.uIAttribute2jIAttribute_r7Impl <em>uI Attribute2j IAttribute r7</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.uml2java.generated.impl.uIAttribute2jIAttribute_r7Impl
	 * @see de.silvawb.uml2java.generated.impl.GeneratedPackageImpl#getuIAttribute2jIAttribute_r7()
	 * @generated
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7 = 16;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>uI Attribute2j IAttribute r7</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>uI Attribute2j IAttribute r7</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE2J_IATTRIBUTE_R7_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link de.silvawb.uml2java.generated.impl.uIOperation2jIMethod_Rule_r8Impl <em>uI Operation2j IMethod Rule r8</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.uml2java.generated.impl.uIOperation2jIMethod_Rule_r8Impl
	 * @see de.silvawb.uml2java.generated.impl.GeneratedPackageImpl#getuIOperation2jIMethod_Rule_r8()
	 * @generated
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8 = 17;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>uI Operation2j IMethod Rule r8</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>uI Operation2j IMethod Rule r8</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_RULE_R8_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link de.silvawb.uml2java.generated.impl.uCAttribute2jCAttribute_Rule_r4Impl <em>uC Attribute2j CAttribute Rule r4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.uml2java.generated.impl.uCAttribute2jCAttribute_Rule_r4Impl
	 * @see de.silvawb.uml2java.generated.impl.GeneratedPackageImpl#getuCAttribute2jCAttribute_Rule_r4()
	 * @generated
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4 = 18;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>uC Attribute2j CAttribute Rule r4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>uC Attribute2j CAttribute Rule r4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link de.silvawb.uml2java.generated.impl.uClass2jClass_Rule_r3Impl <em>uClass2j Class Rule r3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.uml2java.generated.impl.uClass2jClass_Rule_r3Impl
	 * @see de.silvawb.uml2java.generated.impl.GeneratedPackageImpl#getuClass2jClass_Rule_r3()
	 * @generated
	 */
	int UCLASS2J_CLASS_RULE_R3 = 19;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>uClass2j Class Rule r3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>uClass2j Class Rule r3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UCLASS2J_CLASS_RULE_R3_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link de.silvawb.uml2java.generated.impl.uInterface2jInterface_Rule_r6Impl <em>uInterface2j Interface Rule r6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.uml2java.generated.impl.uInterface2jInterface_Rule_r6Impl
	 * @see de.silvawb.uml2java.generated.impl.GeneratedPackageImpl#getuInterface2jInterface_Rule_r6()
	 * @generated
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6 = 20;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>uInterface2j Interface Rule r6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>uInterface2j Interface Rule r6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_RULE_R6_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

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
	 * Returns the meta object for class '{@link de.silvawb.uml2java.generated.uIAttribute2jIAttribute <em>uI Attribute2j IAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uI Attribute2j IAttribute</em>'.
	 * @see de.silvawb.uml2java.generated.uIAttribute2jIAttribute
	 * @generated
	 */
	EClass getuIAttribute2jIAttribute();

	/**
	 * Returns the meta object for class '{@link de.silvawb.uml2java.generated.uClass2jClass_Rule <em>uClass2j Class Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uClass2j Class Rule</em>'.
	 * @see de.silvawb.uml2java.generated.uClass2jClass_Rule
	 * @generated
	 */
	EClass getuClass2jClass_Rule();

	/**
	 * Returns the meta object for class '{@link de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule <em>uI Realization2j IImplementation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uI Realization2j IImplementation Rule</em>'.
	 * @see de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule
	 * @generated
	 */
	EClass getuIRealization2jIImplementation_Rule();

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
	 * Returns the meta object for class '{@link de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule <em>uC Attribute2j CAttribute Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uC Attribute2j CAttribute Rule</em>'.
	 * @see de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule
	 * @generated
	 */
	EClass getuCAttribute2jCAttribute_Rule();

	/**
	 * Returns the meta object for class '{@link de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule <em>uI Operation2j IMethod Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uI Operation2j IMethod Rule</em>'.
	 * @see de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule
	 * @generated
	 */
	EClass getuIOperation2jIMethod_Rule();

	/**
	 * Returns the meta object for class '{@link de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule <em>uC Operation2j CMethod Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uC Operation2j CMethod Rule</em>'.
	 * @see de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule
	 * @generated
	 */
	EClass getuCOperation2jCMethod_Rule();

	/**
	 * Returns the meta object for class '{@link de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule <em>uC Generalization2j CGeneralization Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uC Generalization2j CGeneralization Rule</em>'.
	 * @see de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule
	 * @generated
	 */
	EClass getuCGeneralization2jCGeneralization_Rule();

	/**
	 * Returns the meta object for class '{@link de.silvawb.uml2java.generated.uInterface2jInterface_Rule <em>uInterface2j Interface Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uInterface2j Interface Rule</em>'.
	 * @see de.silvawb.uml2java.generated.uInterface2jInterface_Rule
	 * @generated
	 */
	EClass getuInterface2jInterface_Rule();

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
	 * Returns the meta object for class '{@link de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5 <em>uC Operation2j CMethod Rule r5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uC Operation2j CMethod Rule r5</em>'.
	 * @see de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5
	 * @generated
	 */
	EClass getuCOperation2jCMethod_Rule_r5();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#getAddElementActivity()
	 * @see #getuCOperation2jCMethod_Rule_r5()
	 * @generated
	 */
	EReference getuCOperation2jCMethod_Rule_r5_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#getMoveElementActivity()
	 * @see #getuCOperation2jCMethod_Rule_r5()
	 * @generated
	 */
	EReference getuCOperation2jCMethod_Rule_r5_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#getChangeAttributeActivity()
	 * @see #getuCOperation2jCMethod_Rule_r5()
	 * @generated
	 */
	EReference getuCOperation2jCMethod_Rule_r5_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#getTransformForwardActivity()
	 * @see #getuCOperation2jCMethod_Rule_r5()
	 * @generated
	 */
	EReference getuCOperation2jCMethod_Rule_r5_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#getTransformMappingActivity()
	 * @see #getuCOperation2jCMethod_Rule_r5()
	 * @generated
	 */
	EReference getuCOperation2jCMethod_Rule_r5_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#getTransformBackwardActivity()
	 * @see #getuCOperation2jCMethod_Rule_r5()
	 * @generated
	 */
	EReference getuCOperation2jCMethod_Rule_r5_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#getConflictCheckForwardActivity()
	 * @see #getuCOperation2jCMethod_Rule_r5()
	 * @generated
	 */
	EReference getuCOperation2jCMethod_Rule_r5_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#getConflictCheckMappingActivity()
	 * @see #getuCOperation2jCMethod_Rule_r5()
	 * @generated
	 */
	EReference getuCOperation2jCMethod_Rule_r5_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#getConflictCheckBackwardActivity()
	 * @see #getuCOperation2jCMethod_Rule_r5()
	 * @generated
	 */
	EReference getuCOperation2jCMethod_Rule_r5_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#getSynchronizeForwardActivity()
	 * @see #getuCOperation2jCMethod_Rule_r5()
	 * @generated
	 */
	EReference getuCOperation2jCMethod_Rule_r5_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#getSynchronizeBackwardActivity()
	 * @see #getuCOperation2jCMethod_Rule_r5()
	 * @generated
	 */
	EReference getuCOperation2jCMethod_Rule_r5_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#getRepairForwardActivity()
	 * @see #getuCOperation2jCMethod_Rule_r5()
	 * @generated
	 */
	EReference getuCOperation2jCMethod_Rule_r5_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#getRepairBackwardActivity()
	 * @see #getuCOperation2jCMethod_Rule_r5()
	 * @generated
	 */
	EReference getuCOperation2jCMethod_Rule_r5_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuCOperation2jCMethod_Rule_r5__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuCOperation2jCMethod_Rule_r5__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuCOperation2jCMethod_Rule_r5__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuCOperation2jCMethod_Rule_r5__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuCOperation2jCMethod_Rule_r5__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuCOperation2jCMethod_Rule_r5__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuCOperation2jCMethod_Rule_r5__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuCOperation2jCMethod_Rule_r5__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuCOperation2jCMethod_Rule_r5__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuCOperation2jCMethod_Rule_r5__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuCOperation2jCMethod_Rule_r5__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuCOperation2jCMethod_Rule_r5__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuCOperation2jCMethod_Rule_r5__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10 <em>uC Generalization2j CGeneralization Rule r10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uC Generalization2j CGeneralization Rule r10</em>'.
	 * @see de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10
	 * @generated
	 */
	EClass getuCGeneralization2jCGeneralization_Rule_r10();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#getAddElementActivity()
	 * @see #getuCGeneralization2jCGeneralization_Rule_r10()
	 * @generated
	 */
	EReference getuCGeneralization2jCGeneralization_Rule_r10_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#getMoveElementActivity()
	 * @see #getuCGeneralization2jCGeneralization_Rule_r10()
	 * @generated
	 */
	EReference getuCGeneralization2jCGeneralization_Rule_r10_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#getChangeAttributeActivity()
	 * @see #getuCGeneralization2jCGeneralization_Rule_r10()
	 * @generated
	 */
	EReference getuCGeneralization2jCGeneralization_Rule_r10_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#getTransformForwardActivity()
	 * @see #getuCGeneralization2jCGeneralization_Rule_r10()
	 * @generated
	 */
	EReference getuCGeneralization2jCGeneralization_Rule_r10_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#getTransformMappingActivity()
	 * @see #getuCGeneralization2jCGeneralization_Rule_r10()
	 * @generated
	 */
	EReference getuCGeneralization2jCGeneralization_Rule_r10_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#getTransformBackwardActivity()
	 * @see #getuCGeneralization2jCGeneralization_Rule_r10()
	 * @generated
	 */
	EReference getuCGeneralization2jCGeneralization_Rule_r10_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#getConflictCheckForwardActivity()
	 * @see #getuCGeneralization2jCGeneralization_Rule_r10()
	 * @generated
	 */
	EReference getuCGeneralization2jCGeneralization_Rule_r10_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#getConflictCheckMappingActivity()
	 * @see #getuCGeneralization2jCGeneralization_Rule_r10()
	 * @generated
	 */
	EReference getuCGeneralization2jCGeneralization_Rule_r10_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#getConflictCheckBackwardActivity()
	 * @see #getuCGeneralization2jCGeneralization_Rule_r10()
	 * @generated
	 */
	EReference getuCGeneralization2jCGeneralization_Rule_r10_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#getSynchronizeForwardActivity()
	 * @see #getuCGeneralization2jCGeneralization_Rule_r10()
	 * @generated
	 */
	EReference getuCGeneralization2jCGeneralization_Rule_r10_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#getSynchronizeBackwardActivity()
	 * @see #getuCGeneralization2jCGeneralization_Rule_r10()
	 * @generated
	 */
	EReference getuCGeneralization2jCGeneralization_Rule_r10_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#getRepairForwardActivity()
	 * @see #getuCGeneralization2jCGeneralization_Rule_r10()
	 * @generated
	 */
	EReference getuCGeneralization2jCGeneralization_Rule_r10_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#getRepairBackwardActivity()
	 * @see #getuCGeneralization2jCGeneralization_Rule_r10()
	 * @generated
	 */
	EReference getuCGeneralization2jCGeneralization_Rule_r10_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuCGeneralization2jCGeneralization_Rule_r10__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuCGeneralization2jCGeneralization_Rule_r10__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuCGeneralization2jCGeneralization_Rule_r10__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuCGeneralization2jCGeneralization_Rule_r10__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuCGeneralization2jCGeneralization_Rule_r10__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuCGeneralization2jCGeneralization_Rule_r10__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuCGeneralization2jCGeneralization_Rule_r10__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuCGeneralization2jCGeneralization_Rule_r10__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuCGeneralization2jCGeneralization_Rule_r10__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuCGeneralization2jCGeneralization_Rule_r10__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuCGeneralization2jCGeneralization_Rule_r10__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuCGeneralization2jCGeneralization_Rule_r10__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCGeneralization2jCGeneralization_Rule_r10#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuCGeneralization2jCGeneralization_Rule_r10__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9 <em>uI Realization2j IImplementation Rule r9</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uI Realization2j IImplementation Rule r9</em>'.
	 * @see de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9
	 * @generated
	 */
	EClass getuIRealization2jIImplementation_Rule_r9();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#getAddElementActivity()
	 * @see #getuIRealization2jIImplementation_Rule_r9()
	 * @generated
	 */
	EReference getuIRealization2jIImplementation_Rule_r9_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#getMoveElementActivity()
	 * @see #getuIRealization2jIImplementation_Rule_r9()
	 * @generated
	 */
	EReference getuIRealization2jIImplementation_Rule_r9_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#getChangeAttributeActivity()
	 * @see #getuIRealization2jIImplementation_Rule_r9()
	 * @generated
	 */
	EReference getuIRealization2jIImplementation_Rule_r9_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#getTransformForwardActivity()
	 * @see #getuIRealization2jIImplementation_Rule_r9()
	 * @generated
	 */
	EReference getuIRealization2jIImplementation_Rule_r9_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#getTransformMappingActivity()
	 * @see #getuIRealization2jIImplementation_Rule_r9()
	 * @generated
	 */
	EReference getuIRealization2jIImplementation_Rule_r9_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#getTransformBackwardActivity()
	 * @see #getuIRealization2jIImplementation_Rule_r9()
	 * @generated
	 */
	EReference getuIRealization2jIImplementation_Rule_r9_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#getConflictCheckForwardActivity()
	 * @see #getuIRealization2jIImplementation_Rule_r9()
	 * @generated
	 */
	EReference getuIRealization2jIImplementation_Rule_r9_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#getConflictCheckMappingActivity()
	 * @see #getuIRealization2jIImplementation_Rule_r9()
	 * @generated
	 */
	EReference getuIRealization2jIImplementation_Rule_r9_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#getConflictCheckBackwardActivity()
	 * @see #getuIRealization2jIImplementation_Rule_r9()
	 * @generated
	 */
	EReference getuIRealization2jIImplementation_Rule_r9_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#getSynchronizeForwardActivity()
	 * @see #getuIRealization2jIImplementation_Rule_r9()
	 * @generated
	 */
	EReference getuIRealization2jIImplementation_Rule_r9_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#getSynchronizeBackwardActivity()
	 * @see #getuIRealization2jIImplementation_Rule_r9()
	 * @generated
	 */
	EReference getuIRealization2jIImplementation_Rule_r9_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#getRepairForwardActivity()
	 * @see #getuIRealization2jIImplementation_Rule_r9()
	 * @generated
	 */
	EReference getuIRealization2jIImplementation_Rule_r9_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#getRepairBackwardActivity()
	 * @see #getuIRealization2jIImplementation_Rule_r9()
	 * @generated
	 */
	EReference getuIRealization2jIImplementation_Rule_r9_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuIRealization2jIImplementation_Rule_r9__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuIRealization2jIImplementation_Rule_r9__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuIRealization2jIImplementation_Rule_r9__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuIRealization2jIImplementation_Rule_r9__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuIRealization2jIImplementation_Rule_r9__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuIRealization2jIImplementation_Rule_r9__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuIRealization2jIImplementation_Rule_r9__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuIRealization2jIImplementation_Rule_r9__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuIRealization2jIImplementation_Rule_r9__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuIRealization2jIImplementation_Rule_r9__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuIRealization2jIImplementation_Rule_r9__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuIRealization2jIImplementation_Rule_r9__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuIRealization2jIImplementation_Rule_r9__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7 <em>uI Attribute2j IAttribute r7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uI Attribute2j IAttribute r7</em>'.
	 * @see de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7
	 * @generated
	 */
	EClass getuIAttribute2jIAttribute_r7();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#getAddElementActivity()
	 * @see #getuIAttribute2jIAttribute_r7()
	 * @generated
	 */
	EReference getuIAttribute2jIAttribute_r7_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#getMoveElementActivity()
	 * @see #getuIAttribute2jIAttribute_r7()
	 * @generated
	 */
	EReference getuIAttribute2jIAttribute_r7_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#getChangeAttributeActivity()
	 * @see #getuIAttribute2jIAttribute_r7()
	 * @generated
	 */
	EReference getuIAttribute2jIAttribute_r7_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#getTransformForwardActivity()
	 * @see #getuIAttribute2jIAttribute_r7()
	 * @generated
	 */
	EReference getuIAttribute2jIAttribute_r7_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#getTransformMappingActivity()
	 * @see #getuIAttribute2jIAttribute_r7()
	 * @generated
	 */
	EReference getuIAttribute2jIAttribute_r7_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#getTransformBackwardActivity()
	 * @see #getuIAttribute2jIAttribute_r7()
	 * @generated
	 */
	EReference getuIAttribute2jIAttribute_r7_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#getConflictCheckForwardActivity()
	 * @see #getuIAttribute2jIAttribute_r7()
	 * @generated
	 */
	EReference getuIAttribute2jIAttribute_r7_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#getConflictCheckMappingActivity()
	 * @see #getuIAttribute2jIAttribute_r7()
	 * @generated
	 */
	EReference getuIAttribute2jIAttribute_r7_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#getConflictCheckBackwardActivity()
	 * @see #getuIAttribute2jIAttribute_r7()
	 * @generated
	 */
	EReference getuIAttribute2jIAttribute_r7_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#getSynchronizeForwardActivity()
	 * @see #getuIAttribute2jIAttribute_r7()
	 * @generated
	 */
	EReference getuIAttribute2jIAttribute_r7_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#getSynchronizeBackwardActivity()
	 * @see #getuIAttribute2jIAttribute_r7()
	 * @generated
	 */
	EReference getuIAttribute2jIAttribute_r7_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#getRepairForwardActivity()
	 * @see #getuIAttribute2jIAttribute_r7()
	 * @generated
	 */
	EReference getuIAttribute2jIAttribute_r7_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#getRepairBackwardActivity()
	 * @see #getuIAttribute2jIAttribute_r7()
	 * @generated
	 */
	EReference getuIAttribute2jIAttribute_r7_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuIAttribute2jIAttribute_r7__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuIAttribute2jIAttribute_r7__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuIAttribute2jIAttribute_r7__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuIAttribute2jIAttribute_r7__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuIAttribute2jIAttribute_r7__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuIAttribute2jIAttribute_r7__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuIAttribute2jIAttribute_r7__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuIAttribute2jIAttribute_r7__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuIAttribute2jIAttribute_r7__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuIAttribute2jIAttribute_r7__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuIAttribute2jIAttribute_r7__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuIAttribute2jIAttribute_r7__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuIAttribute2jIAttribute_r7__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8 <em>uI Operation2j IMethod Rule r8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uI Operation2j IMethod Rule r8</em>'.
	 * @see de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8
	 * @generated
	 */
	EClass getuIOperation2jIMethod_Rule_r8();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#getAddElementActivity()
	 * @see #getuIOperation2jIMethod_Rule_r8()
	 * @generated
	 */
	EReference getuIOperation2jIMethod_Rule_r8_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#getMoveElementActivity()
	 * @see #getuIOperation2jIMethod_Rule_r8()
	 * @generated
	 */
	EReference getuIOperation2jIMethod_Rule_r8_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#getChangeAttributeActivity()
	 * @see #getuIOperation2jIMethod_Rule_r8()
	 * @generated
	 */
	EReference getuIOperation2jIMethod_Rule_r8_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#getTransformForwardActivity()
	 * @see #getuIOperation2jIMethod_Rule_r8()
	 * @generated
	 */
	EReference getuIOperation2jIMethod_Rule_r8_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#getTransformMappingActivity()
	 * @see #getuIOperation2jIMethod_Rule_r8()
	 * @generated
	 */
	EReference getuIOperation2jIMethod_Rule_r8_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#getTransformBackwardActivity()
	 * @see #getuIOperation2jIMethod_Rule_r8()
	 * @generated
	 */
	EReference getuIOperation2jIMethod_Rule_r8_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#getConflictCheckForwardActivity()
	 * @see #getuIOperation2jIMethod_Rule_r8()
	 * @generated
	 */
	EReference getuIOperation2jIMethod_Rule_r8_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#getConflictCheckMappingActivity()
	 * @see #getuIOperation2jIMethod_Rule_r8()
	 * @generated
	 */
	EReference getuIOperation2jIMethod_Rule_r8_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#getConflictCheckBackwardActivity()
	 * @see #getuIOperation2jIMethod_Rule_r8()
	 * @generated
	 */
	EReference getuIOperation2jIMethod_Rule_r8_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#getSynchronizeForwardActivity()
	 * @see #getuIOperation2jIMethod_Rule_r8()
	 * @generated
	 */
	EReference getuIOperation2jIMethod_Rule_r8_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#getSynchronizeBackwardActivity()
	 * @see #getuIOperation2jIMethod_Rule_r8()
	 * @generated
	 */
	EReference getuIOperation2jIMethod_Rule_r8_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#getRepairForwardActivity()
	 * @see #getuIOperation2jIMethod_Rule_r8()
	 * @generated
	 */
	EReference getuIOperation2jIMethod_Rule_r8_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#getRepairBackwardActivity()
	 * @see #getuIOperation2jIMethod_Rule_r8()
	 * @generated
	 */
	EReference getuIOperation2jIMethod_Rule_r8_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuIOperation2jIMethod_Rule_r8__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuIOperation2jIMethod_Rule_r8__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuIOperation2jIMethod_Rule_r8__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuIOperation2jIMethod_Rule_r8__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuIOperation2jIMethod_Rule_r8__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuIOperation2jIMethod_Rule_r8__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuIOperation2jIMethod_Rule_r8__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuIOperation2jIMethod_Rule_r8__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuIOperation2jIMethod_Rule_r8__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuIOperation2jIMethod_Rule_r8__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuIOperation2jIMethod_Rule_r8__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuIOperation2jIMethod_Rule_r8__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuIOperation2jIMethod_Rule_r8__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4 <em>uC Attribute2j CAttribute Rule r4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uC Attribute2j CAttribute Rule r4</em>'.
	 * @see de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4
	 * @generated
	 */
	EClass getuCAttribute2jCAttribute_Rule_r4();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#getAddElementActivity()
	 * @see #getuCAttribute2jCAttribute_Rule_r4()
	 * @generated
	 */
	EReference getuCAttribute2jCAttribute_Rule_r4_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#getMoveElementActivity()
	 * @see #getuCAttribute2jCAttribute_Rule_r4()
	 * @generated
	 */
	EReference getuCAttribute2jCAttribute_Rule_r4_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#getChangeAttributeActivity()
	 * @see #getuCAttribute2jCAttribute_Rule_r4()
	 * @generated
	 */
	EReference getuCAttribute2jCAttribute_Rule_r4_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#getTransformForwardActivity()
	 * @see #getuCAttribute2jCAttribute_Rule_r4()
	 * @generated
	 */
	EReference getuCAttribute2jCAttribute_Rule_r4_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#getTransformMappingActivity()
	 * @see #getuCAttribute2jCAttribute_Rule_r4()
	 * @generated
	 */
	EReference getuCAttribute2jCAttribute_Rule_r4_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#getTransformBackwardActivity()
	 * @see #getuCAttribute2jCAttribute_Rule_r4()
	 * @generated
	 */
	EReference getuCAttribute2jCAttribute_Rule_r4_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#getConflictCheckForwardActivity()
	 * @see #getuCAttribute2jCAttribute_Rule_r4()
	 * @generated
	 */
	EReference getuCAttribute2jCAttribute_Rule_r4_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#getConflictCheckMappingActivity()
	 * @see #getuCAttribute2jCAttribute_Rule_r4()
	 * @generated
	 */
	EReference getuCAttribute2jCAttribute_Rule_r4_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#getConflictCheckBackwardActivity()
	 * @see #getuCAttribute2jCAttribute_Rule_r4()
	 * @generated
	 */
	EReference getuCAttribute2jCAttribute_Rule_r4_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#getSynchronizeForwardActivity()
	 * @see #getuCAttribute2jCAttribute_Rule_r4()
	 * @generated
	 */
	EReference getuCAttribute2jCAttribute_Rule_r4_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#getSynchronizeBackwardActivity()
	 * @see #getuCAttribute2jCAttribute_Rule_r4()
	 * @generated
	 */
	EReference getuCAttribute2jCAttribute_Rule_r4_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#getRepairForwardActivity()
	 * @see #getuCAttribute2jCAttribute_Rule_r4()
	 * @generated
	 */
	EReference getuCAttribute2jCAttribute_Rule_r4_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#getRepairBackwardActivity()
	 * @see #getuCAttribute2jCAttribute_Rule_r4()
	 * @generated
	 */
	EReference getuCAttribute2jCAttribute_Rule_r4_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuCAttribute2jCAttribute_Rule_r4__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuCAttribute2jCAttribute_Rule_r4__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuCAttribute2jCAttribute_Rule_r4__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuCAttribute2jCAttribute_Rule_r4__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuCAttribute2jCAttribute_Rule_r4__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuCAttribute2jCAttribute_Rule_r4__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuCAttribute2jCAttribute_Rule_r4__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuCAttribute2jCAttribute_Rule_r4__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuCAttribute2jCAttribute_Rule_r4__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuCAttribute2jCAttribute_Rule_r4__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuCAttribute2jCAttribute_Rule_r4__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuCAttribute2jCAttribute_Rule_r4__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuCAttribute2jCAttribute_Rule_r4__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.silvawb.uml2java.generated.uClass2jClass_Rule_r3 <em>uClass2j Class Rule r3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uClass2j Class Rule r3</em>'.
	 * @see de.silvawb.uml2java.generated.uClass2jClass_Rule_r3
	 * @generated
	 */
	EClass getuClass2jClass_Rule_r3();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#getAddElementActivity()
	 * @see #getuClass2jClass_Rule_r3()
	 * @generated
	 */
	EReference getuClass2jClass_Rule_r3_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#getMoveElementActivity()
	 * @see #getuClass2jClass_Rule_r3()
	 * @generated
	 */
	EReference getuClass2jClass_Rule_r3_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#getChangeAttributeActivity()
	 * @see #getuClass2jClass_Rule_r3()
	 * @generated
	 */
	EReference getuClass2jClass_Rule_r3_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#getTransformForwardActivity()
	 * @see #getuClass2jClass_Rule_r3()
	 * @generated
	 */
	EReference getuClass2jClass_Rule_r3_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#getTransformMappingActivity()
	 * @see #getuClass2jClass_Rule_r3()
	 * @generated
	 */
	EReference getuClass2jClass_Rule_r3_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#getTransformBackwardActivity()
	 * @see #getuClass2jClass_Rule_r3()
	 * @generated
	 */
	EReference getuClass2jClass_Rule_r3_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#getConflictCheckForwardActivity()
	 * @see #getuClass2jClass_Rule_r3()
	 * @generated
	 */
	EReference getuClass2jClass_Rule_r3_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#getConflictCheckMappingActivity()
	 * @see #getuClass2jClass_Rule_r3()
	 * @generated
	 */
	EReference getuClass2jClass_Rule_r3_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#getConflictCheckBackwardActivity()
	 * @see #getuClass2jClass_Rule_r3()
	 * @generated
	 */
	EReference getuClass2jClass_Rule_r3_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#getSynchronizeForwardActivity()
	 * @see #getuClass2jClass_Rule_r3()
	 * @generated
	 */
	EReference getuClass2jClass_Rule_r3_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#getSynchronizeBackwardActivity()
	 * @see #getuClass2jClass_Rule_r3()
	 * @generated
	 */
	EReference getuClass2jClass_Rule_r3_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#getRepairForwardActivity()
	 * @see #getuClass2jClass_Rule_r3()
	 * @generated
	 */
	EReference getuClass2jClass_Rule_r3_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#getRepairBackwardActivity()
	 * @see #getuClass2jClass_Rule_r3()
	 * @generated
	 */
	EReference getuClass2jClass_Rule_r3_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuClass2jClass_Rule_r3__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuClass2jClass_Rule_r3__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuClass2jClass_Rule_r3__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuClass2jClass_Rule_r3__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuClass2jClass_Rule_r3__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuClass2jClass_Rule_r3__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuClass2jClass_Rule_r3__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuClass2jClass_Rule_r3__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuClass2jClass_Rule_r3__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuClass2jClass_Rule_r3__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuClass2jClass_Rule_r3__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuClass2jClass_Rule_r3__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uClass2jClass_Rule_r3#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuClass2jClass_Rule_r3__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6 <em>uInterface2j Interface Rule r6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uInterface2j Interface Rule r6</em>'.
	 * @see de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6
	 * @generated
	 */
	EClass getuInterface2jInterface_Rule_r6();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#getAddElementActivity()
	 * @see #getuInterface2jInterface_Rule_r6()
	 * @generated
	 */
	EReference getuInterface2jInterface_Rule_r6_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#getMoveElementActivity()
	 * @see #getuInterface2jInterface_Rule_r6()
	 * @generated
	 */
	EReference getuInterface2jInterface_Rule_r6_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#getChangeAttributeActivity()
	 * @see #getuInterface2jInterface_Rule_r6()
	 * @generated
	 */
	EReference getuInterface2jInterface_Rule_r6_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#getTransformForwardActivity()
	 * @see #getuInterface2jInterface_Rule_r6()
	 * @generated
	 */
	EReference getuInterface2jInterface_Rule_r6_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#getTransformMappingActivity()
	 * @see #getuInterface2jInterface_Rule_r6()
	 * @generated
	 */
	EReference getuInterface2jInterface_Rule_r6_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#getTransformBackwardActivity()
	 * @see #getuInterface2jInterface_Rule_r6()
	 * @generated
	 */
	EReference getuInterface2jInterface_Rule_r6_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#getConflictCheckForwardActivity()
	 * @see #getuInterface2jInterface_Rule_r6()
	 * @generated
	 */
	EReference getuInterface2jInterface_Rule_r6_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#getConflictCheckMappingActivity()
	 * @see #getuInterface2jInterface_Rule_r6()
	 * @generated
	 */
	EReference getuInterface2jInterface_Rule_r6_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#getConflictCheckBackwardActivity()
	 * @see #getuInterface2jInterface_Rule_r6()
	 * @generated
	 */
	EReference getuInterface2jInterface_Rule_r6_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#getSynchronizeForwardActivity()
	 * @see #getuInterface2jInterface_Rule_r6()
	 * @generated
	 */
	EReference getuInterface2jInterface_Rule_r6_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#getSynchronizeBackwardActivity()
	 * @see #getuInterface2jInterface_Rule_r6()
	 * @generated
	 */
	EReference getuInterface2jInterface_Rule_r6_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#getRepairForwardActivity()
	 * @see #getuInterface2jInterface_Rule_r6()
	 * @generated
	 */
	EReference getuInterface2jInterface_Rule_r6_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#getRepairBackwardActivity()
	 * @see #getuInterface2jInterface_Rule_r6()
	 * @generated
	 */
	EReference getuInterface2jInterface_Rule_r6_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuInterface2jInterface_Rule_r6__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuInterface2jInterface_Rule_r6__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuInterface2jInterface_Rule_r6__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuInterface2jInterface_Rule_r6__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuInterface2jInterface_Rule_r6__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuInterface2jInterface_Rule_r6__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuInterface2jInterface_Rule_r6__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuInterface2jInterface_Rule_r6__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuInterface2jInterface_Rule_r6__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuInterface2jInterface_Rule_r6__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuInterface2jInterface_Rule_r6__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuInterface2jInterface_Rule_r6__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuInterface2jInterface_Rule_r6__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeneratedFactory getGeneratedFactory();

} //GeneratedPackage
