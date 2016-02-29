/**
 */
package de.silvawb.umlInteraction2java.generated;

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
 * @see de.silvawb.umlInteraction2java.generated.GeneratedFactory
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
	String eNS_URI = "http://tu-berlin.de/silvawb/umlInteraction2java/1.0/generated";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.silvawb.umlInteraction2java.generated";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeneratedPackage eINSTANCE = de.silvawb.umlInteraction2java.generated.impl.GeneratedPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.silvawb.umlInteraction2java.generated.impl.umlInteraction2javaOperationalTGGImpl <em>uml Interaction2java Operational TGG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlInteraction2java.generated.impl.umlInteraction2javaOperationalTGGImpl
	 * @see de.silvawb.umlInteraction2java.generated.impl.GeneratedPackageImpl#getumlInteraction2javaOperationalTGG()
	 * @generated
	 */
	int UML_INTERACTION2JAVA_OPERATIONAL_TGG = 0;

	/**
	 * The feature id for the '<em><b>Operational Axiom Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_OPERATIONAL_TGG__OPERATIONAL_AXIOM_GROUP = SdmPackage.SDM_OPERATIONAL_TGG__OPERATIONAL_AXIOM_GROUP;

	/**
	 * The feature id for the '<em><b>Operational Rule Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_OPERATIONAL_TGG__OPERATIONAL_RULE_GROUPS = SdmPackage.SDM_OPERATIONAL_TGG__OPERATIONAL_RULE_GROUPS;

	/**
	 * The feature id for the '<em><b>Tgg Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_OPERATIONAL_TGG__TGG_ENGINE = SdmPackage.SDM_OPERATIONAL_TGG__TGG_ENGINE;

	/**
	 * The feature id for the '<em><b>Tgg ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_OPERATIONAL_TGG__TGG_ID = SdmPackage.SDM_OPERATIONAL_TGG__TGG_ID;

	/**
	 * The feature id for the '<em><b>Unidirectional References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_OPERATIONAL_TGG__UNIDIRECTIONAL_REFERENCES = SdmPackage.SDM_OPERATIONAL_TGG__UNIDIRECTIONAL_REFERENCES;

	/**
	 * The feature id for the '<em><b>Interpreter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_OPERATIONAL_TGG__INTERPRETER = SdmPackage.SDM_OPERATIONAL_TGG__INTERPRETER;

	/**
	 * The number of structural features of the '<em>uml Interaction2java Operational TGG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_OPERATIONAL_TGG_FEATURE_COUNT = SdmPackage.SDM_OPERATIONAL_TGG_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Transformation Started</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_OPERATIONAL_TGG___TRANSFORMATION_STARTED = SdmPackage.SDM_OPERATIONAL_TGG___TRANSFORMATION_STARTED;

	/**
	 * The operation id for the '<em>Transformation Finished</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_OPERATIONAL_TGG___TRANSFORMATION_FINISHED = SdmPackage.SDM_OPERATIONAL_TGG___TRANSFORMATION_FINISHED;

	/**
	 * The operation id for the '<em>Get Operational Mapping Group</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_OPERATIONAL_TGG___GET_OPERATIONAL_MAPPING_GROUP__STRING = SdmPackage.SDM_OPERATIONAL_TGG___GET_OPERATIONAL_MAPPING_GROUP__STRING;

	/**
	 * The operation id for the '<em>Execute Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_OPERATIONAL_TGG___EXECUTE_ACTIVITY__ACTIVITY_EMAP = SdmPackage.SDM_OPERATIONAL_TGG___EXECUTE_ACTIVITY__ACTIVITY_EMAP;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_OPERATIONAL_TGG___INIT = SdmPackage.SDM_OPERATIONAL_TGG___INIT;

	/**
	 * The number of operations of the '<em>uml Interaction2java Operational TGG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_OPERATIONAL_TGG_OPERATION_COUNT = SdmPackage.SDM_OPERATIONAL_TGG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.umlInteraction2java.generated.impl.umlInteraction2javaAxiomImpl <em>uml Interaction2java Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlInteraction2java.generated.impl.umlInteraction2javaAxiomImpl
	 * @see de.silvawb.umlInteraction2java.generated.impl.GeneratedPackageImpl#getumlInteraction2javaAxiom()
	 * @generated
	 */
	int UML_INTERACTION2JAVA_AXIOM = 1;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_AXIOM__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Axioms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_AXIOM__AXIOMS = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP__AXIOMS;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_AXIOM__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>uml Interaction2java Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_AXIOM_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_AXIOM___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>uml Interaction2java Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_AXIOM_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.umlInteraction2java.generated.impl.uMessageSequence2jInteractionAnnotation_2Impl <em>uMessage Sequence2j Interaction Annotation 2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlInteraction2java.generated.impl.uMessageSequence2jInteractionAnnotation_2Impl
	 * @see de.silvawb.umlInteraction2java.generated.impl.GeneratedPackageImpl#getuMessageSequence2jInteractionAnnotation_2()
	 * @generated
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2 = 2;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>uMessage Sequence2j Interaction Annotation 2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>uMessage Sequence2j Interaction Annotation 2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link de.silvawb.umlInteraction2java.generated.impl.uInterface2jInterface_HelperImpl <em>uInterface2j Interface Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlInteraction2java.generated.impl.uInterface2jInterface_HelperImpl
	 * @see de.silvawb.umlInteraction2java.generated.impl.GeneratedPackageImpl#getuInterface2jInterface_Helper()
	 * @generated
	 */
	int UINTERFACE2J_INTERFACE_HELPER = 3;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>uInterface2j Interface Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>uInterface2j Interface Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link de.silvawb.umlInteraction2java.generated.impl.uIOperation2jIMethod_HelperImpl <em>uI Operation2j IMethod Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlInteraction2java.generated.impl.uIOperation2jIMethod_HelperImpl
	 * @see de.silvawb.umlInteraction2java.generated.impl.GeneratedPackageImpl#getuIOperation2jIMethod_Helper()
	 * @generated
	 */
	int UI_OPERATION2J_IMETHOD_HELPER = 4;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>uI Operation2j IMethod Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>uI Operation2j IMethod Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link de.silvawb.umlInteraction2java.generated.impl.uILifeline2jMAnnotationImpl <em>uI Lifeline2j MAnnotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlInteraction2java.generated.impl.uILifeline2jMAnnotationImpl
	 * @see de.silvawb.umlInteraction2java.generated.impl.GeneratedPackageImpl#getuILifeline2jMAnnotation()
	 * @generated
	 */
	int UI_LIFELINE2J_MANNOTATION = 5;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>uI Lifeline2j MAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>uI Lifeline2j MAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.umlInteraction2java.generated.impl.uOperation2jMethod_HelperImpl <em>uOperation2j Method Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlInteraction2java.generated.impl.uOperation2jMethod_HelperImpl
	 * @see de.silvawb.umlInteraction2java.generated.impl.GeneratedPackageImpl#getuOperation2jMethod_Helper()
	 * @generated
	 */
	int UOPERATION2J_METHOD_HELPER = 6;

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
	 * The meta object id for the '{@link de.silvawb.umlInteraction2java.generated.impl.uMessageSequence2jInteractionAnnotationImpl <em>uMessage Sequence2j Interaction Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlInteraction2java.generated.impl.uMessageSequence2jInteractionAnnotationImpl
	 * @see de.silvawb.umlInteraction2java.generated.impl.GeneratedPackageImpl#getuMessageSequence2jInteractionAnnotation()
	 * @generated
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION = 7;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>uMessage Sequence2j Interaction Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>uMessage Sequence2j Interaction Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link de.silvawb.umlInteraction2java.generated.impl.umlInteraction2javaAxiom_r1Impl <em>uml Interaction2java Axiom r1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlInteraction2java.generated.impl.umlInteraction2javaAxiom_r1Impl
	 * @see de.silvawb.umlInteraction2java.generated.impl.GeneratedPackageImpl#getumlInteraction2javaAxiom_r1()
	 * @generated
	 */
	int UML_INTERACTION2JAVA_AXIOM_R1 = 8;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_AXIOM_R1__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_AXIOM__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_AXIOM_R1__RULE_ID = OperationalTGGPackage.OPERATIONAL_AXIOM__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Axiom Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_AXIOM_R1__OPERATIONAL_AXIOM_GROUP = OperationalTGGPackage.OPERATIONAL_AXIOM__OPERATIONAL_AXIOM_GROUP;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_AXIOM_R1__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_AXIOM_R1__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_AXIOM_R1__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_AXIOM_R1__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_AXIOM_R1__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_AXIOM_R1__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_AXIOM_R1__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_AXIOM_R1__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT
			+ 7;

	/**
	 * The number of structural features of the '<em>uml Interaction2java Axiom r1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_AXIOM_R1_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_AXIOM_R1___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_AXIOM___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_AXIOM_R1___ADD_ELEMENT__EMAP_ELIST_ELIST = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_AXIOM_R1___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_AXIOM_R1___TRANSFORM_FORWARD__ELIST_ELIST_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_AXIOM_R1___TRANSFORM_MAPPING__ELIST_ELIST_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_AXIOM_R1___TRANSFORM_BACKWARD__ELIST_ELIST_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_AXIOM_R1___SYNCHRONIZE_FORWARD__ELIST_ELIST_TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_AXIOM_R1___SYNCHRONIZE_BACKWARD__ELIST_ELIST_TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 6;

	/**
	 * The number of operations of the '<em>uml Interaction2java Axiom r1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION2JAVA_AXIOM_R1_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link de.silvawb.umlInteraction2java.generated.impl.uILifeline2jMAnnotation_r2Impl <em>uI Lifeline2j MAnnotation r2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlInteraction2java.generated.impl.uILifeline2jMAnnotation_r2Impl
	 * @see de.silvawb.umlInteraction2java.generated.impl.GeneratedPackageImpl#getuILifeline2jMAnnotation_r2()
	 * @generated
	 */
	int UI_LIFELINE2J_MANNOTATION_R2 = 9;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>uI Lifeline2j MAnnotation r2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>uI Lifeline2j MAnnotation r2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIFELINE2J_MANNOTATION_R2_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link de.silvawb.umlInteraction2java.generated.impl.uInterface2jInterface_Helper_r6Impl <em>uInterface2j Interface Helper r6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlInteraction2java.generated.impl.uInterface2jInterface_Helper_r6Impl
	 * @see de.silvawb.umlInteraction2java.generated.impl.GeneratedPackageImpl#getuInterface2jInterface_Helper_r6()
	 * @generated
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6 = 10;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>uInterface2j Interface Helper r6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>uInterface2j Interface Helper r6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINTERFACE2J_INTERFACE_HELPER_R6_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link de.silvawb.umlInteraction2java.generated.impl.uMessageSequence2jInteractionAnnotation_2_r5Impl <em>uMessage Sequence2j Interaction Annotation 2r5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlInteraction2java.generated.impl.uMessageSequence2jInteractionAnnotation_2_r5Impl
	 * @see de.silvawb.umlInteraction2java.generated.impl.GeneratedPackageImpl#getuMessageSequence2jInteractionAnnotation_2_r5()
	 * @generated
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5 = 11;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>uMessage Sequence2j Interaction Annotation 2r5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>uMessage Sequence2j Interaction Annotation 2r5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The meta object id for the '{@link de.silvawb.umlInteraction2java.generated.impl.uOperation2jMethod_Helper_r4Impl <em>uOperation2j Method Helper r4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlInteraction2java.generated.impl.uOperation2jMethod_Helper_r4Impl
	 * @see de.silvawb.umlInteraction2java.generated.impl.GeneratedPackageImpl#getuOperation2jMethod_Helper_r4()
	 * @generated
	 */
	int UOPERATION2J_METHOD_HELPER_R4 = 12;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>uOperation2j Method Helper r4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>uOperation2j Method Helper r4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOPERATION2J_METHOD_HELPER_R4_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link de.silvawb.umlInteraction2java.generated.impl.uIOperation2jIMethod_Helper_r7Impl <em>uI Operation2j IMethod Helper r7</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlInteraction2java.generated.impl.uIOperation2jIMethod_Helper_r7Impl
	 * @see de.silvawb.umlInteraction2java.generated.impl.GeneratedPackageImpl#getuIOperation2jIMethod_Helper_r7()
	 * @generated
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7 = 13;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>uI Operation2j IMethod Helper r7</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>uI Operation2j IMethod Helper r7</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION2J_IMETHOD_HELPER_R7_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link de.silvawb.umlInteraction2java.generated.impl.uMessageSequence2jInteractionAnnotation_r3Impl <em>uMessage Sequence2j Interaction Annotation r3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.umlInteraction2java.generated.impl.uMessageSequence2jInteractionAnnotation_r3Impl
	 * @see de.silvawb.umlInteraction2java.generated.impl.GeneratedPackageImpl#getuMessageSequence2jInteractionAnnotation_r3()
	 * @generated
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3 = 14;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>uMessage Sequence2j Interaction Annotation r3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>uMessage Sequence2j Interaction Annotation r3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlInteraction2java.generated.umlInteraction2javaOperationalTGG <em>uml Interaction2java Operational TGG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uml Interaction2java Operational TGG</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.umlInteraction2javaOperationalTGG
	 * @generated
	 */
	EClass getumlInteraction2javaOperationalTGG();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom <em>uml Interaction2java Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uml Interaction2java Axiom</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom
	 * @generated
	 */
	EClass getumlInteraction2javaAxiom();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2 <em>uMessage Sequence2j Interaction Annotation 2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uMessage Sequence2j Interaction Annotation 2</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2
	 * @generated
	 */
	EClass getuMessageSequence2jInteractionAnnotation_2();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper <em>uInterface2j Interface Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uInterface2j Interface Helper</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper
	 * @generated
	 */
	EClass getuInterface2jInterface_Helper();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper <em>uI Operation2j IMethod Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uI Operation2j IMethod Helper</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper
	 * @generated
	 */
	EClass getuIOperation2jIMethod_Helper();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation <em>uI Lifeline2j MAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uI Lifeline2j MAnnotation</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation
	 * @generated
	 */
	EClass getuILifeline2jMAnnotation();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper <em>uOperation2j Method Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uOperation2j Method Helper</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper
	 * @generated
	 */
	EClass getuOperation2jMethod_Helper();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation <em>uMessage Sequence2j Interaction Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uMessage Sequence2j Interaction Annotation</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation
	 * @generated
	 */
	EClass getuMessageSequence2jInteractionAnnotation();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1 <em>uml Interaction2java Axiom r1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uml Interaction2java Axiom r1</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1
	 * @generated
	 */
	EClass getumlInteraction2javaAxiom_r1();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1#getAddElementActivity()
	 * @see #getumlInteraction2javaAxiom_r1()
	 * @generated
	 */
	EReference getumlInteraction2javaAxiom_r1_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1#getMoveElementActivity()
	 * @see #getumlInteraction2javaAxiom_r1()
	 * @generated
	 */
	EReference getumlInteraction2javaAxiom_r1_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1#getChangeAttributeActivity()
	 * @see #getumlInteraction2javaAxiom_r1()
	 * @generated
	 */
	EReference getumlInteraction2javaAxiom_r1_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1#getTransformForwardActivity()
	 * @see #getumlInteraction2javaAxiom_r1()
	 * @generated
	 */
	EReference getumlInteraction2javaAxiom_r1_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1#getTransformMappingActivity()
	 * @see #getumlInteraction2javaAxiom_r1()
	 * @generated
	 */
	EReference getumlInteraction2javaAxiom_r1_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1#getTransformBackwardActivity()
	 * @see #getumlInteraction2javaAxiom_r1()
	 * @generated
	 */
	EReference getumlInteraction2javaAxiom_r1_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1#getSynchronizeForwardActivity()
	 * @see #getumlInteraction2javaAxiom_r1()
	 * @generated
	 */
	EReference getumlInteraction2javaAxiom_r1_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1#getSynchronizeBackwardActivity()
	 * @see #getumlInteraction2javaAxiom_r1()
	 * @generated
	 */
	EReference getumlInteraction2javaAxiom_r1_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1#addElement(org.eclipse.emf.common.util.EMap, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1#addElement(org.eclipse.emf.common.util.EMap, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getumlInteraction2javaAxiom_r1__AddElement__EMap_EList_EList();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getumlInteraction2javaAxiom_r1__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1#transformForward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1#transformForward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getumlInteraction2javaAxiom_r1__TransformForward__EList_EList_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1#transformMapping(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1#transformMapping(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getumlInteraction2javaAxiom_r1__TransformMapping__EList_EList_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1#transformBackward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1#transformBackward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getumlInteraction2javaAxiom_r1__TransformBackward__EList_EList_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1#synchronizeForward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1#synchronizeForward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getumlInteraction2javaAxiom_r1__SynchronizeForward__EList_EList_TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1#synchronizeBackward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1#synchronizeBackward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getumlInteraction2javaAxiom_r1__SynchronizeBackward__EList_EList_TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2 <em>uI Lifeline2j MAnnotation r2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uI Lifeline2j MAnnotation r2</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2
	 * @generated
	 */
	EClass getuILifeline2jMAnnotation_r2();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#getAddElementActivity()
	 * @see #getuILifeline2jMAnnotation_r2()
	 * @generated
	 */
	EReference getuILifeline2jMAnnotation_r2_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#getMoveElementActivity()
	 * @see #getuILifeline2jMAnnotation_r2()
	 * @generated
	 */
	EReference getuILifeline2jMAnnotation_r2_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#getChangeAttributeActivity()
	 * @see #getuILifeline2jMAnnotation_r2()
	 * @generated
	 */
	EReference getuILifeline2jMAnnotation_r2_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#getTransformForwardActivity()
	 * @see #getuILifeline2jMAnnotation_r2()
	 * @generated
	 */
	EReference getuILifeline2jMAnnotation_r2_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#getTransformMappingActivity()
	 * @see #getuILifeline2jMAnnotation_r2()
	 * @generated
	 */
	EReference getuILifeline2jMAnnotation_r2_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#getTransformBackwardActivity()
	 * @see #getuILifeline2jMAnnotation_r2()
	 * @generated
	 */
	EReference getuILifeline2jMAnnotation_r2_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#getConflictCheckForwardActivity()
	 * @see #getuILifeline2jMAnnotation_r2()
	 * @generated
	 */
	EReference getuILifeline2jMAnnotation_r2_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#getConflictCheckMappingActivity()
	 * @see #getuILifeline2jMAnnotation_r2()
	 * @generated
	 */
	EReference getuILifeline2jMAnnotation_r2_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#getConflictCheckBackwardActivity()
	 * @see #getuILifeline2jMAnnotation_r2()
	 * @generated
	 */
	EReference getuILifeline2jMAnnotation_r2_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#getSynchronizeForwardActivity()
	 * @see #getuILifeline2jMAnnotation_r2()
	 * @generated
	 */
	EReference getuILifeline2jMAnnotation_r2_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#getSynchronizeBackwardActivity()
	 * @see #getuILifeline2jMAnnotation_r2()
	 * @generated
	 */
	EReference getuILifeline2jMAnnotation_r2_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#getRepairForwardActivity()
	 * @see #getuILifeline2jMAnnotation_r2()
	 * @generated
	 */
	EReference getuILifeline2jMAnnotation_r2_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#getRepairBackwardActivity()
	 * @see #getuILifeline2jMAnnotation_r2()
	 * @generated
	 */
	EReference getuILifeline2jMAnnotation_r2_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuILifeline2jMAnnotation_r2__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuILifeline2jMAnnotation_r2__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuILifeline2jMAnnotation_r2__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuILifeline2jMAnnotation_r2__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuILifeline2jMAnnotation_r2__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuILifeline2jMAnnotation_r2__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuILifeline2jMAnnotation_r2__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuILifeline2jMAnnotation_r2__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuILifeline2jMAnnotation_r2__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuILifeline2jMAnnotation_r2__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuILifeline2jMAnnotation_r2__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuILifeline2jMAnnotation_r2__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuILifeline2jMAnnotation_r2__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6 <em>uInterface2j Interface Helper r6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uInterface2j Interface Helper r6</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6
	 * @generated
	 */
	EClass getuInterface2jInterface_Helper_r6();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#getAddElementActivity()
	 * @see #getuInterface2jInterface_Helper_r6()
	 * @generated
	 */
	EReference getuInterface2jInterface_Helper_r6_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#getMoveElementActivity()
	 * @see #getuInterface2jInterface_Helper_r6()
	 * @generated
	 */
	EReference getuInterface2jInterface_Helper_r6_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#getChangeAttributeActivity()
	 * @see #getuInterface2jInterface_Helper_r6()
	 * @generated
	 */
	EReference getuInterface2jInterface_Helper_r6_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#getTransformForwardActivity()
	 * @see #getuInterface2jInterface_Helper_r6()
	 * @generated
	 */
	EReference getuInterface2jInterface_Helper_r6_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#getTransformMappingActivity()
	 * @see #getuInterface2jInterface_Helper_r6()
	 * @generated
	 */
	EReference getuInterface2jInterface_Helper_r6_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#getTransformBackwardActivity()
	 * @see #getuInterface2jInterface_Helper_r6()
	 * @generated
	 */
	EReference getuInterface2jInterface_Helper_r6_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#getConflictCheckForwardActivity()
	 * @see #getuInterface2jInterface_Helper_r6()
	 * @generated
	 */
	EReference getuInterface2jInterface_Helper_r6_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#getConflictCheckMappingActivity()
	 * @see #getuInterface2jInterface_Helper_r6()
	 * @generated
	 */
	EReference getuInterface2jInterface_Helper_r6_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#getConflictCheckBackwardActivity()
	 * @see #getuInterface2jInterface_Helper_r6()
	 * @generated
	 */
	EReference getuInterface2jInterface_Helper_r6_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#getSynchronizeForwardActivity()
	 * @see #getuInterface2jInterface_Helper_r6()
	 * @generated
	 */
	EReference getuInterface2jInterface_Helper_r6_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#getSynchronizeBackwardActivity()
	 * @see #getuInterface2jInterface_Helper_r6()
	 * @generated
	 */
	EReference getuInterface2jInterface_Helper_r6_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#getRepairForwardActivity()
	 * @see #getuInterface2jInterface_Helper_r6()
	 * @generated
	 */
	EReference getuInterface2jInterface_Helper_r6_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#getRepairBackwardActivity()
	 * @see #getuInterface2jInterface_Helper_r6()
	 * @generated
	 */
	EReference getuInterface2jInterface_Helper_r6_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuInterface2jInterface_Helper_r6__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuInterface2jInterface_Helper_r6__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuInterface2jInterface_Helper_r6__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuInterface2jInterface_Helper_r6__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuInterface2jInterface_Helper_r6__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuInterface2jInterface_Helper_r6__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuInterface2jInterface_Helper_r6__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuInterface2jInterface_Helper_r6__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuInterface2jInterface_Helper_r6__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuInterface2jInterface_Helper_r6__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuInterface2jInterface_Helper_r6__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuInterface2jInterface_Helper_r6__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uInterface2jInterface_Helper_r6#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuInterface2jInterface_Helper_r6__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5 <em>uMessage Sequence2j Interaction Annotation 2r5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uMessage Sequence2j Interaction Annotation 2r5</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5
	 * @generated
	 */
	EClass getuMessageSequence2jInteractionAnnotation_2_r5();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#getAddElementActivity()
	 * @see #getuMessageSequence2jInteractionAnnotation_2_r5()
	 * @generated
	 */
	EReference getuMessageSequence2jInteractionAnnotation_2_r5_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#getMoveElementActivity()
	 * @see #getuMessageSequence2jInteractionAnnotation_2_r5()
	 * @generated
	 */
	EReference getuMessageSequence2jInteractionAnnotation_2_r5_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#getChangeAttributeActivity()
	 * @see #getuMessageSequence2jInteractionAnnotation_2_r5()
	 * @generated
	 */
	EReference getuMessageSequence2jInteractionAnnotation_2_r5_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#getTransformForwardActivity()
	 * @see #getuMessageSequence2jInteractionAnnotation_2_r5()
	 * @generated
	 */
	EReference getuMessageSequence2jInteractionAnnotation_2_r5_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#getTransformMappingActivity()
	 * @see #getuMessageSequence2jInteractionAnnotation_2_r5()
	 * @generated
	 */
	EReference getuMessageSequence2jInteractionAnnotation_2_r5_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#getTransformBackwardActivity()
	 * @see #getuMessageSequence2jInteractionAnnotation_2_r5()
	 * @generated
	 */
	EReference getuMessageSequence2jInteractionAnnotation_2_r5_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#getConflictCheckForwardActivity()
	 * @see #getuMessageSequence2jInteractionAnnotation_2_r5()
	 * @generated
	 */
	EReference getuMessageSequence2jInteractionAnnotation_2_r5_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#getConflictCheckMappingActivity()
	 * @see #getuMessageSequence2jInteractionAnnotation_2_r5()
	 * @generated
	 */
	EReference getuMessageSequence2jInteractionAnnotation_2_r5_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#getConflictCheckBackwardActivity()
	 * @see #getuMessageSequence2jInteractionAnnotation_2_r5()
	 * @generated
	 */
	EReference getuMessageSequence2jInteractionAnnotation_2_r5_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#getSynchronizeForwardActivity()
	 * @see #getuMessageSequence2jInteractionAnnotation_2_r5()
	 * @generated
	 */
	EReference getuMessageSequence2jInteractionAnnotation_2_r5_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#getSynchronizeBackwardActivity()
	 * @see #getuMessageSequence2jInteractionAnnotation_2_r5()
	 * @generated
	 */
	EReference getuMessageSequence2jInteractionAnnotation_2_r5_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#getRepairForwardActivity()
	 * @see #getuMessageSequence2jInteractionAnnotation_2_r5()
	 * @generated
	 */
	EReference getuMessageSequence2jInteractionAnnotation_2_r5_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#getRepairBackwardActivity()
	 * @see #getuMessageSequence2jInteractionAnnotation_2_r5()
	 * @generated
	 */
	EReference getuMessageSequence2jInteractionAnnotation_2_r5_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuMessageSequence2jInteractionAnnotation_2_r5__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuMessageSequence2jInteractionAnnotation_2_r5__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuMessageSequence2jInteractionAnnotation_2_r5__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuMessageSequence2jInteractionAnnotation_2_r5__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuMessageSequence2jInteractionAnnotation_2_r5__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuMessageSequence2jInteractionAnnotation_2_r5__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuMessageSequence2jInteractionAnnotation_2_r5__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuMessageSequence2jInteractionAnnotation_2_r5__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuMessageSequence2jInteractionAnnotation_2_r5__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuMessageSequence2jInteractionAnnotation_2_r5__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuMessageSequence2jInteractionAnnotation_2_r5__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuMessageSequence2jInteractionAnnotation_2_r5__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuMessageSequence2jInteractionAnnotation_2_r5__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4 <em>uOperation2j Method Helper r4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uOperation2j Method Helper r4</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4
	 * @generated
	 */
	EClass getuOperation2jMethod_Helper_r4();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#getAddElementActivity()
	 * @see #getuOperation2jMethod_Helper_r4()
	 * @generated
	 */
	EReference getuOperation2jMethod_Helper_r4_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#getMoveElementActivity()
	 * @see #getuOperation2jMethod_Helper_r4()
	 * @generated
	 */
	EReference getuOperation2jMethod_Helper_r4_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#getChangeAttributeActivity()
	 * @see #getuOperation2jMethod_Helper_r4()
	 * @generated
	 */
	EReference getuOperation2jMethod_Helper_r4_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#getTransformForwardActivity()
	 * @see #getuOperation2jMethod_Helper_r4()
	 * @generated
	 */
	EReference getuOperation2jMethod_Helper_r4_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#getTransformMappingActivity()
	 * @see #getuOperation2jMethod_Helper_r4()
	 * @generated
	 */
	EReference getuOperation2jMethod_Helper_r4_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#getTransformBackwardActivity()
	 * @see #getuOperation2jMethod_Helper_r4()
	 * @generated
	 */
	EReference getuOperation2jMethod_Helper_r4_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#getConflictCheckForwardActivity()
	 * @see #getuOperation2jMethod_Helper_r4()
	 * @generated
	 */
	EReference getuOperation2jMethod_Helper_r4_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#getConflictCheckMappingActivity()
	 * @see #getuOperation2jMethod_Helper_r4()
	 * @generated
	 */
	EReference getuOperation2jMethod_Helper_r4_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#getConflictCheckBackwardActivity()
	 * @see #getuOperation2jMethod_Helper_r4()
	 * @generated
	 */
	EReference getuOperation2jMethod_Helper_r4_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#getSynchronizeForwardActivity()
	 * @see #getuOperation2jMethod_Helper_r4()
	 * @generated
	 */
	EReference getuOperation2jMethod_Helper_r4_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#getSynchronizeBackwardActivity()
	 * @see #getuOperation2jMethod_Helper_r4()
	 * @generated
	 */
	EReference getuOperation2jMethod_Helper_r4_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#getRepairForwardActivity()
	 * @see #getuOperation2jMethod_Helper_r4()
	 * @generated
	 */
	EReference getuOperation2jMethod_Helper_r4_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#getRepairBackwardActivity()
	 * @see #getuOperation2jMethod_Helper_r4()
	 * @generated
	 */
	EReference getuOperation2jMethod_Helper_r4_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuOperation2jMethod_Helper_r4__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuOperation2jMethod_Helper_r4__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuOperation2jMethod_Helper_r4__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuOperation2jMethod_Helper_r4__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuOperation2jMethod_Helper_r4__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuOperation2jMethod_Helper_r4__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuOperation2jMethod_Helper_r4__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuOperation2jMethod_Helper_r4__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuOperation2jMethod_Helper_r4__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuOperation2jMethod_Helper_r4__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuOperation2jMethod_Helper_r4__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuOperation2jMethod_Helper_r4__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uOperation2jMethod_Helper_r4#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuOperation2jMethod_Helper_r4__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7 <em>uI Operation2j IMethod Helper r7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uI Operation2j IMethod Helper r7</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7
	 * @generated
	 */
	EClass getuIOperation2jIMethod_Helper_r7();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#getAddElementActivity()
	 * @see #getuIOperation2jIMethod_Helper_r7()
	 * @generated
	 */
	EReference getuIOperation2jIMethod_Helper_r7_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#getMoveElementActivity()
	 * @see #getuIOperation2jIMethod_Helper_r7()
	 * @generated
	 */
	EReference getuIOperation2jIMethod_Helper_r7_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#getChangeAttributeActivity()
	 * @see #getuIOperation2jIMethod_Helper_r7()
	 * @generated
	 */
	EReference getuIOperation2jIMethod_Helper_r7_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#getTransformForwardActivity()
	 * @see #getuIOperation2jIMethod_Helper_r7()
	 * @generated
	 */
	EReference getuIOperation2jIMethod_Helper_r7_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#getTransformMappingActivity()
	 * @see #getuIOperation2jIMethod_Helper_r7()
	 * @generated
	 */
	EReference getuIOperation2jIMethod_Helper_r7_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#getTransformBackwardActivity()
	 * @see #getuIOperation2jIMethod_Helper_r7()
	 * @generated
	 */
	EReference getuIOperation2jIMethod_Helper_r7_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#getConflictCheckForwardActivity()
	 * @see #getuIOperation2jIMethod_Helper_r7()
	 * @generated
	 */
	EReference getuIOperation2jIMethod_Helper_r7_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#getConflictCheckMappingActivity()
	 * @see #getuIOperation2jIMethod_Helper_r7()
	 * @generated
	 */
	EReference getuIOperation2jIMethod_Helper_r7_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#getConflictCheckBackwardActivity()
	 * @see #getuIOperation2jIMethod_Helper_r7()
	 * @generated
	 */
	EReference getuIOperation2jIMethod_Helper_r7_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#getSynchronizeForwardActivity()
	 * @see #getuIOperation2jIMethod_Helper_r7()
	 * @generated
	 */
	EReference getuIOperation2jIMethod_Helper_r7_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#getSynchronizeBackwardActivity()
	 * @see #getuIOperation2jIMethod_Helper_r7()
	 * @generated
	 */
	EReference getuIOperation2jIMethod_Helper_r7_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#getRepairForwardActivity()
	 * @see #getuIOperation2jIMethod_Helper_r7()
	 * @generated
	 */
	EReference getuIOperation2jIMethod_Helper_r7_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#getRepairBackwardActivity()
	 * @see #getuIOperation2jIMethod_Helper_r7()
	 * @generated
	 */
	EReference getuIOperation2jIMethod_Helper_r7_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuIOperation2jIMethod_Helper_r7__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuIOperation2jIMethod_Helper_r7__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuIOperation2jIMethod_Helper_r7__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuIOperation2jIMethod_Helper_r7__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuIOperation2jIMethod_Helper_r7__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuIOperation2jIMethod_Helper_r7__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuIOperation2jIMethod_Helper_r7__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuIOperation2jIMethod_Helper_r7__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuIOperation2jIMethod_Helper_r7__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuIOperation2jIMethod_Helper_r7__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuIOperation2jIMethod_Helper_r7__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuIOperation2jIMethod_Helper_r7__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uIOperation2jIMethod_Helper_r7#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuIOperation2jIMethod_Helper_r7__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3 <em>uMessage Sequence2j Interaction Annotation r3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uMessage Sequence2j Interaction Annotation r3</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3
	 * @generated
	 */
	EClass getuMessageSequence2jInteractionAnnotation_r3();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#getAddElementActivity()
	 * @see #getuMessageSequence2jInteractionAnnotation_r3()
	 * @generated
	 */
	EReference getuMessageSequence2jInteractionAnnotation_r3_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#getMoveElementActivity()
	 * @see #getuMessageSequence2jInteractionAnnotation_r3()
	 * @generated
	 */
	EReference getuMessageSequence2jInteractionAnnotation_r3_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#getChangeAttributeActivity()
	 * @see #getuMessageSequence2jInteractionAnnotation_r3()
	 * @generated
	 */
	EReference getuMessageSequence2jInteractionAnnotation_r3_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#getTransformForwardActivity()
	 * @see #getuMessageSequence2jInteractionAnnotation_r3()
	 * @generated
	 */
	EReference getuMessageSequence2jInteractionAnnotation_r3_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#getTransformMappingActivity()
	 * @see #getuMessageSequence2jInteractionAnnotation_r3()
	 * @generated
	 */
	EReference getuMessageSequence2jInteractionAnnotation_r3_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#getTransformBackwardActivity()
	 * @see #getuMessageSequence2jInteractionAnnotation_r3()
	 * @generated
	 */
	EReference getuMessageSequence2jInteractionAnnotation_r3_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#getConflictCheckForwardActivity()
	 * @see #getuMessageSequence2jInteractionAnnotation_r3()
	 * @generated
	 */
	EReference getuMessageSequence2jInteractionAnnotation_r3_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#getConflictCheckMappingActivity()
	 * @see #getuMessageSequence2jInteractionAnnotation_r3()
	 * @generated
	 */
	EReference getuMessageSequence2jInteractionAnnotation_r3_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#getConflictCheckBackwardActivity()
	 * @see #getuMessageSequence2jInteractionAnnotation_r3()
	 * @generated
	 */
	EReference getuMessageSequence2jInteractionAnnotation_r3_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#getSynchronizeForwardActivity()
	 * @see #getuMessageSequence2jInteractionAnnotation_r3()
	 * @generated
	 */
	EReference getuMessageSequence2jInteractionAnnotation_r3_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#getSynchronizeBackwardActivity()
	 * @see #getuMessageSequence2jInteractionAnnotation_r3()
	 * @generated
	 */
	EReference getuMessageSequence2jInteractionAnnotation_r3_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#getRepairForwardActivity()
	 * @see #getuMessageSequence2jInteractionAnnotation_r3()
	 * @generated
	 */
	EReference getuMessageSequence2jInteractionAnnotation_r3_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#getRepairBackwardActivity()
	 * @see #getuMessageSequence2jInteractionAnnotation_r3()
	 * @generated
	 */
	EReference getuMessageSequence2jInteractionAnnotation_r3_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuMessageSequence2jInteractionAnnotation_r3__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getuMessageSequence2jInteractionAnnotation_r3__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuMessageSequence2jInteractionAnnotation_r3__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuMessageSequence2jInteractionAnnotation_r3__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuMessageSequence2jInteractionAnnotation_r3__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getuMessageSequence2jInteractionAnnotation_r3__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuMessageSequence2jInteractionAnnotation_r3__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuMessageSequence2jInteractionAnnotation_r3__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getuMessageSequence2jInteractionAnnotation_r3__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuMessageSequence2jInteractionAnnotation_r3__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuMessageSequence2jInteractionAnnotation_r3__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuMessageSequence2jInteractionAnnotation_r3__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getuMessageSequence2jInteractionAnnotation_r3__RepairBackward__TGGNode_boolean();

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
		 * The meta object literal for the '{@link de.silvawb.umlInteraction2java.generated.impl.umlInteraction2javaOperationalTGGImpl <em>uml Interaction2java Operational TGG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.umlInteraction2java.generated.impl.umlInteraction2javaOperationalTGGImpl
		 * @see de.silvawb.umlInteraction2java.generated.impl.GeneratedPackageImpl#getumlInteraction2javaOperationalTGG()
		 * @generated
		 */
		EClass UML_INTERACTION2JAVA_OPERATIONAL_TGG = eINSTANCE.getumlInteraction2javaOperationalTGG();

		/**
		 * The meta object literal for the '{@link de.silvawb.umlInteraction2java.generated.impl.umlInteraction2javaAxiomImpl <em>uml Interaction2java Axiom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.umlInteraction2java.generated.impl.umlInteraction2javaAxiomImpl
		 * @see de.silvawb.umlInteraction2java.generated.impl.GeneratedPackageImpl#getumlInteraction2javaAxiom()
		 * @generated
		 */
		EClass UML_INTERACTION2JAVA_AXIOM = eINSTANCE.getumlInteraction2javaAxiom();

		/**
		 * The meta object literal for the '{@link de.silvawb.umlInteraction2java.generated.impl.uMessageSequence2jInteractionAnnotation_2Impl <em>uMessage Sequence2j Interaction Annotation 2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.umlInteraction2java.generated.impl.uMessageSequence2jInteractionAnnotation_2Impl
		 * @see de.silvawb.umlInteraction2java.generated.impl.GeneratedPackageImpl#getuMessageSequence2jInteractionAnnotation_2()
		 * @generated
		 */
		EClass UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2 = eINSTANCE.getuMessageSequence2jInteractionAnnotation_2();

		/**
		 * The meta object literal for the '{@link de.silvawb.umlInteraction2java.generated.impl.uInterface2jInterface_HelperImpl <em>uInterface2j Interface Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.umlInteraction2java.generated.impl.uInterface2jInterface_HelperImpl
		 * @see de.silvawb.umlInteraction2java.generated.impl.GeneratedPackageImpl#getuInterface2jInterface_Helper()
		 * @generated
		 */
		EClass UINTERFACE2J_INTERFACE_HELPER = eINSTANCE.getuInterface2jInterface_Helper();

		/**
		 * The meta object literal for the '{@link de.silvawb.umlInteraction2java.generated.impl.uIOperation2jIMethod_HelperImpl <em>uI Operation2j IMethod Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.umlInteraction2java.generated.impl.uIOperation2jIMethod_HelperImpl
		 * @see de.silvawb.umlInteraction2java.generated.impl.GeneratedPackageImpl#getuIOperation2jIMethod_Helper()
		 * @generated
		 */
		EClass UI_OPERATION2J_IMETHOD_HELPER = eINSTANCE.getuIOperation2jIMethod_Helper();

		/**
		 * The meta object literal for the '{@link de.silvawb.umlInteraction2java.generated.impl.uILifeline2jMAnnotationImpl <em>uI Lifeline2j MAnnotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.umlInteraction2java.generated.impl.uILifeline2jMAnnotationImpl
		 * @see de.silvawb.umlInteraction2java.generated.impl.GeneratedPackageImpl#getuILifeline2jMAnnotation()
		 * @generated
		 */
		EClass UI_LIFELINE2J_MANNOTATION = eINSTANCE.getuILifeline2jMAnnotation();

		/**
		 * The meta object literal for the '{@link de.silvawb.umlInteraction2java.generated.impl.uOperation2jMethod_HelperImpl <em>uOperation2j Method Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.umlInteraction2java.generated.impl.uOperation2jMethod_HelperImpl
		 * @see de.silvawb.umlInteraction2java.generated.impl.GeneratedPackageImpl#getuOperation2jMethod_Helper()
		 * @generated
		 */
		EClass UOPERATION2J_METHOD_HELPER = eINSTANCE.getuOperation2jMethod_Helper();

		/**
		 * The meta object literal for the '{@link de.silvawb.umlInteraction2java.generated.impl.uMessageSequence2jInteractionAnnotationImpl <em>uMessage Sequence2j Interaction Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.umlInteraction2java.generated.impl.uMessageSequence2jInteractionAnnotationImpl
		 * @see de.silvawb.umlInteraction2java.generated.impl.GeneratedPackageImpl#getuMessageSequence2jInteractionAnnotation()
		 * @generated
		 */
		EClass UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION = eINSTANCE.getuMessageSequence2jInteractionAnnotation();

		/**
		 * The meta object literal for the '{@link de.silvawb.umlInteraction2java.generated.impl.umlInteraction2javaAxiom_r1Impl <em>uml Interaction2java Axiom r1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.umlInteraction2java.generated.impl.umlInteraction2javaAxiom_r1Impl
		 * @see de.silvawb.umlInteraction2java.generated.impl.GeneratedPackageImpl#getumlInteraction2javaAxiom_r1()
		 * @generated
		 */
		EClass UML_INTERACTION2JAVA_AXIOM_R1 = eINSTANCE.getumlInteraction2javaAxiom_r1();

		/**
		 * The meta object literal for the '<em><b>Add Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_INTERACTION2JAVA_AXIOM_R1__ADD_ELEMENT_ACTIVITY = eINSTANCE
				.getumlInteraction2javaAxiom_r1_AddElementActivity();

		/**
		 * The meta object literal for the '<em><b>Move Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_INTERACTION2JAVA_AXIOM_R1__MOVE_ELEMENT_ACTIVITY = eINSTANCE
				.getumlInteraction2javaAxiom_r1_MoveElementActivity();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_INTERACTION2JAVA_AXIOM_R1__CHANGE_ATTRIBUTE_ACTIVITY = eINSTANCE
				.getumlInteraction2javaAxiom_r1_ChangeAttributeActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_INTERACTION2JAVA_AXIOM_R1__TRANSFORM_FORWARD_ACTIVITY = eINSTANCE
				.getumlInteraction2javaAxiom_r1_TransformForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_INTERACTION2JAVA_AXIOM_R1__TRANSFORM_MAPPING_ACTIVITY = eINSTANCE
				.getumlInteraction2javaAxiom_r1_TransformMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_INTERACTION2JAVA_AXIOM_R1__TRANSFORM_BACKWARD_ACTIVITY = eINSTANCE
				.getumlInteraction2javaAxiom_r1_TransformBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_INTERACTION2JAVA_AXIOM_R1__SYNCHRONIZE_FORWARD_ACTIVITY = eINSTANCE
				.getumlInteraction2javaAxiom_r1_SynchronizeForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_INTERACTION2JAVA_AXIOM_R1__SYNCHRONIZE_BACKWARD_ACTIVITY = eINSTANCE
				.getumlInteraction2javaAxiom_r1_SynchronizeBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_INTERACTION2JAVA_AXIOM_R1___ADD_ELEMENT__EMAP_ELIST_ELIST = eINSTANCE
				.getumlInteraction2javaAxiom_r1__AddElement__EMap_EList_EList();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_INTERACTION2JAVA_AXIOM_R1___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = eINSTANCE
				.getumlInteraction2javaAxiom_r1__ChangeAttributeValues__TGGNode_EMap();

		/**
		 * The meta object literal for the '<em><b>Transform Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_INTERACTION2JAVA_AXIOM_R1___TRANSFORM_FORWARD__ELIST_ELIST_BOOLEAN = eINSTANCE
				.getumlInteraction2javaAxiom_r1__TransformForward__EList_EList_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_INTERACTION2JAVA_AXIOM_R1___TRANSFORM_MAPPING__ELIST_ELIST_BOOLEAN = eINSTANCE
				.getumlInteraction2javaAxiom_r1__TransformMapping__EList_EList_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_INTERACTION2JAVA_AXIOM_R1___TRANSFORM_BACKWARD__ELIST_ELIST_BOOLEAN = eINSTANCE
				.getumlInteraction2javaAxiom_r1__TransformBackward__EList_EList_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_INTERACTION2JAVA_AXIOM_R1___SYNCHRONIZE_FORWARD__ELIST_ELIST_TGGNODE_BOOLEAN = eINSTANCE
				.getumlInteraction2javaAxiom_r1__SynchronizeForward__EList_EList_TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_INTERACTION2JAVA_AXIOM_R1___SYNCHRONIZE_BACKWARD__ELIST_ELIST_TGGNODE_BOOLEAN = eINSTANCE
				.getumlInteraction2javaAxiom_r1__SynchronizeBackward__EList_EList_TGGNode_boolean();

		/**
		 * The meta object literal for the '{@link de.silvawb.umlInteraction2java.generated.impl.uILifeline2jMAnnotation_r2Impl <em>uI Lifeline2j MAnnotation r2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.umlInteraction2java.generated.impl.uILifeline2jMAnnotation_r2Impl
		 * @see de.silvawb.umlInteraction2java.generated.impl.GeneratedPackageImpl#getuILifeline2jMAnnotation_r2()
		 * @generated
		 */
		EClass UI_LIFELINE2J_MANNOTATION_R2 = eINSTANCE.getuILifeline2jMAnnotation_r2();

		/**
		 * The meta object literal for the '<em><b>Add Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_LIFELINE2J_MANNOTATION_R2__ADD_ELEMENT_ACTIVITY = eINSTANCE
				.getuILifeline2jMAnnotation_r2_AddElementActivity();

		/**
		 * The meta object literal for the '<em><b>Move Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_LIFELINE2J_MANNOTATION_R2__MOVE_ELEMENT_ACTIVITY = eINSTANCE
				.getuILifeline2jMAnnotation_r2_MoveElementActivity();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_LIFELINE2J_MANNOTATION_R2__CHANGE_ATTRIBUTE_ACTIVITY = eINSTANCE
				.getuILifeline2jMAnnotation_r2_ChangeAttributeActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_LIFELINE2J_MANNOTATION_R2__TRANSFORM_FORWARD_ACTIVITY = eINSTANCE
				.getuILifeline2jMAnnotation_r2_TransformForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_LIFELINE2J_MANNOTATION_R2__TRANSFORM_MAPPING_ACTIVITY = eINSTANCE
				.getuILifeline2jMAnnotation_r2_TransformMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_LIFELINE2J_MANNOTATION_R2__TRANSFORM_BACKWARD_ACTIVITY = eINSTANCE
				.getuILifeline2jMAnnotation_r2_TransformBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_LIFELINE2J_MANNOTATION_R2__CONFLICT_CHECK_FORWARD_ACTIVITY = eINSTANCE
				.getuILifeline2jMAnnotation_r2_ConflictCheckForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_LIFELINE2J_MANNOTATION_R2__CONFLICT_CHECK_MAPPING_ACTIVITY = eINSTANCE
				.getuILifeline2jMAnnotation_r2_ConflictCheckMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_LIFELINE2J_MANNOTATION_R2__CONFLICT_CHECK_BACKWARD_ACTIVITY = eINSTANCE
				.getuILifeline2jMAnnotation_r2_ConflictCheckBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_LIFELINE2J_MANNOTATION_R2__SYNCHRONIZE_FORWARD_ACTIVITY = eINSTANCE
				.getuILifeline2jMAnnotation_r2_SynchronizeForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_LIFELINE2J_MANNOTATION_R2__SYNCHRONIZE_BACKWARD_ACTIVITY = eINSTANCE
				.getuILifeline2jMAnnotation_r2_SynchronizeBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_LIFELINE2J_MANNOTATION_R2__REPAIR_FORWARD_ACTIVITY = eINSTANCE
				.getuILifeline2jMAnnotation_r2_RepairForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_LIFELINE2J_MANNOTATION_R2__REPAIR_BACKWARD_ACTIVITY = eINSTANCE
				.getuILifeline2jMAnnotation_r2_RepairBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_LIFELINE2J_MANNOTATION_R2___ADD_ELEMENT__EMAP = eINSTANCE
				.getuILifeline2jMAnnotation_r2__AddElement__EMap();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_LIFELINE2J_MANNOTATION_R2___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = eINSTANCE
				.getuILifeline2jMAnnotation_r2__ChangeAttributeValues__TGGNode_EMap();

		/**
		 * The meta object literal for the '<em><b>Move Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_LIFELINE2J_MANNOTATION_R2___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = eINSTANCE
				.getuILifeline2jMAnnotation_r2__MoveElement__TGGNode_TGGNode_TGGNode();

		/**
		 * The meta object literal for the '<em><b>Transform Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_LIFELINE2J_MANNOTATION_R2___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getuILifeline2jMAnnotation_r2__TransformForward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_LIFELINE2J_MANNOTATION_R2___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getuILifeline2jMAnnotation_r2__TransformMapping__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_LIFELINE2J_MANNOTATION_R2___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getuILifeline2jMAnnotation_r2__TransformBackward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_LIFELINE2J_MANNOTATION_R2___CONFLICT_CHECK_FORWARD__TGGNODE = eINSTANCE
				.getuILifeline2jMAnnotation_r2__ConflictCheckForward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_LIFELINE2J_MANNOTATION_R2___CONFLICT_CHECK_MAPPING__TGGNODE = eINSTANCE
				.getuILifeline2jMAnnotation_r2__ConflictCheckMapping__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_LIFELINE2J_MANNOTATION_R2___CONFLICT_CHECK_BACKWARD__TGGNODE = eINSTANCE
				.getuILifeline2jMAnnotation_r2__ConflictCheckBackward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_LIFELINE2J_MANNOTATION_R2___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getuILifeline2jMAnnotation_r2__SynchronizeForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_LIFELINE2J_MANNOTATION_R2___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getuILifeline2jMAnnotation_r2__SynchronizeBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_LIFELINE2J_MANNOTATION_R2___REPAIR_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getuILifeline2jMAnnotation_r2__RepairForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_LIFELINE2J_MANNOTATION_R2___REPAIR_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getuILifeline2jMAnnotation_r2__RepairBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '{@link de.silvawb.umlInteraction2java.generated.impl.uInterface2jInterface_Helper_r6Impl <em>uInterface2j Interface Helper r6</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.umlInteraction2java.generated.impl.uInterface2jInterface_Helper_r6Impl
		 * @see de.silvawb.umlInteraction2java.generated.impl.GeneratedPackageImpl#getuInterface2jInterface_Helper_r6()
		 * @generated
		 */
		EClass UINTERFACE2J_INTERFACE_HELPER_R6 = eINSTANCE.getuInterface2jInterface_Helper_r6();

		/**
		 * The meta object literal for the '<em><b>Add Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UINTERFACE2J_INTERFACE_HELPER_R6__ADD_ELEMENT_ACTIVITY = eINSTANCE
				.getuInterface2jInterface_Helper_r6_AddElementActivity();

		/**
		 * The meta object literal for the '<em><b>Move Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UINTERFACE2J_INTERFACE_HELPER_R6__MOVE_ELEMENT_ACTIVITY = eINSTANCE
				.getuInterface2jInterface_Helper_r6_MoveElementActivity();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UINTERFACE2J_INTERFACE_HELPER_R6__CHANGE_ATTRIBUTE_ACTIVITY = eINSTANCE
				.getuInterface2jInterface_Helper_r6_ChangeAttributeActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UINTERFACE2J_INTERFACE_HELPER_R6__TRANSFORM_FORWARD_ACTIVITY = eINSTANCE
				.getuInterface2jInterface_Helper_r6_TransformForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UINTERFACE2J_INTERFACE_HELPER_R6__TRANSFORM_MAPPING_ACTIVITY = eINSTANCE
				.getuInterface2jInterface_Helper_r6_TransformMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UINTERFACE2J_INTERFACE_HELPER_R6__TRANSFORM_BACKWARD_ACTIVITY = eINSTANCE
				.getuInterface2jInterface_Helper_r6_TransformBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UINTERFACE2J_INTERFACE_HELPER_R6__CONFLICT_CHECK_FORWARD_ACTIVITY = eINSTANCE
				.getuInterface2jInterface_Helper_r6_ConflictCheckForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UINTERFACE2J_INTERFACE_HELPER_R6__CONFLICT_CHECK_MAPPING_ACTIVITY = eINSTANCE
				.getuInterface2jInterface_Helper_r6_ConflictCheckMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UINTERFACE2J_INTERFACE_HELPER_R6__CONFLICT_CHECK_BACKWARD_ACTIVITY = eINSTANCE
				.getuInterface2jInterface_Helper_r6_ConflictCheckBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UINTERFACE2J_INTERFACE_HELPER_R6__SYNCHRONIZE_FORWARD_ACTIVITY = eINSTANCE
				.getuInterface2jInterface_Helper_r6_SynchronizeForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UINTERFACE2J_INTERFACE_HELPER_R6__SYNCHRONIZE_BACKWARD_ACTIVITY = eINSTANCE
				.getuInterface2jInterface_Helper_r6_SynchronizeBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UINTERFACE2J_INTERFACE_HELPER_R6__REPAIR_FORWARD_ACTIVITY = eINSTANCE
				.getuInterface2jInterface_Helper_r6_RepairForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UINTERFACE2J_INTERFACE_HELPER_R6__REPAIR_BACKWARD_ACTIVITY = eINSTANCE
				.getuInterface2jInterface_Helper_r6_RepairBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UINTERFACE2J_INTERFACE_HELPER_R6___ADD_ELEMENT__EMAP = eINSTANCE
				.getuInterface2jInterface_Helper_r6__AddElement__EMap();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UINTERFACE2J_INTERFACE_HELPER_R6___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = eINSTANCE
				.getuInterface2jInterface_Helper_r6__ChangeAttributeValues__TGGNode_EMap();

		/**
		 * The meta object literal for the '<em><b>Move Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UINTERFACE2J_INTERFACE_HELPER_R6___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = eINSTANCE
				.getuInterface2jInterface_Helper_r6__MoveElement__TGGNode_TGGNode_TGGNode();

		/**
		 * The meta object literal for the '<em><b>Transform Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UINTERFACE2J_INTERFACE_HELPER_R6___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getuInterface2jInterface_Helper_r6__TransformForward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UINTERFACE2J_INTERFACE_HELPER_R6___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getuInterface2jInterface_Helper_r6__TransformMapping__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UINTERFACE2J_INTERFACE_HELPER_R6___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getuInterface2jInterface_Helper_r6__TransformBackward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UINTERFACE2J_INTERFACE_HELPER_R6___CONFLICT_CHECK_FORWARD__TGGNODE = eINSTANCE
				.getuInterface2jInterface_Helper_r6__ConflictCheckForward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UINTERFACE2J_INTERFACE_HELPER_R6___CONFLICT_CHECK_MAPPING__TGGNODE = eINSTANCE
				.getuInterface2jInterface_Helper_r6__ConflictCheckMapping__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UINTERFACE2J_INTERFACE_HELPER_R6___CONFLICT_CHECK_BACKWARD__TGGNODE = eINSTANCE
				.getuInterface2jInterface_Helper_r6__ConflictCheckBackward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UINTERFACE2J_INTERFACE_HELPER_R6___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getuInterface2jInterface_Helper_r6__SynchronizeForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UINTERFACE2J_INTERFACE_HELPER_R6___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getuInterface2jInterface_Helper_r6__SynchronizeBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UINTERFACE2J_INTERFACE_HELPER_R6___REPAIR_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getuInterface2jInterface_Helper_r6__RepairForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UINTERFACE2J_INTERFACE_HELPER_R6___REPAIR_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getuInterface2jInterface_Helper_r6__RepairBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '{@link de.silvawb.umlInteraction2java.generated.impl.uMessageSequence2jInteractionAnnotation_2_r5Impl <em>uMessage Sequence2j Interaction Annotation 2r5</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.umlInteraction2java.generated.impl.uMessageSequence2jInteractionAnnotation_2_r5Impl
		 * @see de.silvawb.umlInteraction2java.generated.impl.GeneratedPackageImpl#getuMessageSequence2jInteractionAnnotation_2_r5()
		 * @generated
		 */
		EClass UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5 = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_2_r5();

		/**
		 * The meta object literal for the '<em><b>Add Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__ADD_ELEMENT_ACTIVITY = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_2_r5_AddElementActivity();

		/**
		 * The meta object literal for the '<em><b>Move Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__MOVE_ELEMENT_ACTIVITY = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_2_r5_MoveElementActivity();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__CHANGE_ATTRIBUTE_ACTIVITY = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_2_r5_ChangeAttributeActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__TRANSFORM_FORWARD_ACTIVITY = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_2_r5_TransformForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__TRANSFORM_MAPPING_ACTIVITY = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_2_r5_TransformMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__TRANSFORM_BACKWARD_ACTIVITY = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_2_r5_TransformBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__CONFLICT_CHECK_FORWARD_ACTIVITY = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_2_r5_ConflictCheckForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__CONFLICT_CHECK_MAPPING_ACTIVITY = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_2_r5_ConflictCheckMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__CONFLICT_CHECK_BACKWARD_ACTIVITY = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_2_r5_ConflictCheckBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__SYNCHRONIZE_FORWARD_ACTIVITY = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_2_r5_SynchronizeForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__SYNCHRONIZE_BACKWARD_ACTIVITY = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_2_r5_SynchronizeBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__REPAIR_FORWARD_ACTIVITY = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_2_r5_RepairForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__REPAIR_BACKWARD_ACTIVITY = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_2_r5_RepairBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___ADD_ELEMENT__EMAP = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_2_r5__AddElement__EMap();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_2_r5__ChangeAttributeValues__TGGNode_EMap();

		/**
		 * The meta object literal for the '<em><b>Move Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_2_r5__MoveElement__TGGNode_TGGNode_TGGNode();

		/**
		 * The meta object literal for the '<em><b>Transform Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_2_r5__TransformForward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_2_r5__TransformMapping__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_2_r5__TransformBackward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___CONFLICT_CHECK_FORWARD__TGGNODE = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_2_r5__ConflictCheckForward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___CONFLICT_CHECK_MAPPING__TGGNODE = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_2_r5__ConflictCheckMapping__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___CONFLICT_CHECK_BACKWARD__TGGNODE = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_2_r5__ConflictCheckBackward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_2_r5__SynchronizeForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_2_r5__SynchronizeBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___REPAIR_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_2_r5__RepairForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___REPAIR_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_2_r5__RepairBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '{@link de.silvawb.umlInteraction2java.generated.impl.uOperation2jMethod_Helper_r4Impl <em>uOperation2j Method Helper r4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.umlInteraction2java.generated.impl.uOperation2jMethod_Helper_r4Impl
		 * @see de.silvawb.umlInteraction2java.generated.impl.GeneratedPackageImpl#getuOperation2jMethod_Helper_r4()
		 * @generated
		 */
		EClass UOPERATION2J_METHOD_HELPER_R4 = eINSTANCE.getuOperation2jMethod_Helper_r4();

		/**
		 * The meta object literal for the '<em><b>Add Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOPERATION2J_METHOD_HELPER_R4__ADD_ELEMENT_ACTIVITY = eINSTANCE
				.getuOperation2jMethod_Helper_r4_AddElementActivity();

		/**
		 * The meta object literal for the '<em><b>Move Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOPERATION2J_METHOD_HELPER_R4__MOVE_ELEMENT_ACTIVITY = eINSTANCE
				.getuOperation2jMethod_Helper_r4_MoveElementActivity();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOPERATION2J_METHOD_HELPER_R4__CHANGE_ATTRIBUTE_ACTIVITY = eINSTANCE
				.getuOperation2jMethod_Helper_r4_ChangeAttributeActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOPERATION2J_METHOD_HELPER_R4__TRANSFORM_FORWARD_ACTIVITY = eINSTANCE
				.getuOperation2jMethod_Helper_r4_TransformForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOPERATION2J_METHOD_HELPER_R4__TRANSFORM_MAPPING_ACTIVITY = eINSTANCE
				.getuOperation2jMethod_Helper_r4_TransformMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOPERATION2J_METHOD_HELPER_R4__TRANSFORM_BACKWARD_ACTIVITY = eINSTANCE
				.getuOperation2jMethod_Helper_r4_TransformBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOPERATION2J_METHOD_HELPER_R4__CONFLICT_CHECK_FORWARD_ACTIVITY = eINSTANCE
				.getuOperation2jMethod_Helper_r4_ConflictCheckForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOPERATION2J_METHOD_HELPER_R4__CONFLICT_CHECK_MAPPING_ACTIVITY = eINSTANCE
				.getuOperation2jMethod_Helper_r4_ConflictCheckMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOPERATION2J_METHOD_HELPER_R4__CONFLICT_CHECK_BACKWARD_ACTIVITY = eINSTANCE
				.getuOperation2jMethod_Helper_r4_ConflictCheckBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOPERATION2J_METHOD_HELPER_R4__SYNCHRONIZE_FORWARD_ACTIVITY = eINSTANCE
				.getuOperation2jMethod_Helper_r4_SynchronizeForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOPERATION2J_METHOD_HELPER_R4__SYNCHRONIZE_BACKWARD_ACTIVITY = eINSTANCE
				.getuOperation2jMethod_Helper_r4_SynchronizeBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOPERATION2J_METHOD_HELPER_R4__REPAIR_FORWARD_ACTIVITY = eINSTANCE
				.getuOperation2jMethod_Helper_r4_RepairForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOPERATION2J_METHOD_HELPER_R4__REPAIR_BACKWARD_ACTIVITY = eINSTANCE
				.getuOperation2jMethod_Helper_r4_RepairBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOPERATION2J_METHOD_HELPER_R4___ADD_ELEMENT__EMAP = eINSTANCE
				.getuOperation2jMethod_Helper_r4__AddElement__EMap();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOPERATION2J_METHOD_HELPER_R4___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = eINSTANCE
				.getuOperation2jMethod_Helper_r4__ChangeAttributeValues__TGGNode_EMap();

		/**
		 * The meta object literal for the '<em><b>Move Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOPERATION2J_METHOD_HELPER_R4___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = eINSTANCE
				.getuOperation2jMethod_Helper_r4__MoveElement__TGGNode_TGGNode_TGGNode();

		/**
		 * The meta object literal for the '<em><b>Transform Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOPERATION2J_METHOD_HELPER_R4___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getuOperation2jMethod_Helper_r4__TransformForward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOPERATION2J_METHOD_HELPER_R4___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getuOperation2jMethod_Helper_r4__TransformMapping__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOPERATION2J_METHOD_HELPER_R4___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getuOperation2jMethod_Helper_r4__TransformBackward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOPERATION2J_METHOD_HELPER_R4___CONFLICT_CHECK_FORWARD__TGGNODE = eINSTANCE
				.getuOperation2jMethod_Helper_r4__ConflictCheckForward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOPERATION2J_METHOD_HELPER_R4___CONFLICT_CHECK_MAPPING__TGGNODE = eINSTANCE
				.getuOperation2jMethod_Helper_r4__ConflictCheckMapping__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOPERATION2J_METHOD_HELPER_R4___CONFLICT_CHECK_BACKWARD__TGGNODE = eINSTANCE
				.getuOperation2jMethod_Helper_r4__ConflictCheckBackward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOPERATION2J_METHOD_HELPER_R4___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getuOperation2jMethod_Helper_r4__SynchronizeForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOPERATION2J_METHOD_HELPER_R4___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getuOperation2jMethod_Helper_r4__SynchronizeBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOPERATION2J_METHOD_HELPER_R4___REPAIR_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getuOperation2jMethod_Helper_r4__RepairForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOPERATION2J_METHOD_HELPER_R4___REPAIR_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getuOperation2jMethod_Helper_r4__RepairBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '{@link de.silvawb.umlInteraction2java.generated.impl.uIOperation2jIMethod_Helper_r7Impl <em>uI Operation2j IMethod Helper r7</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.umlInteraction2java.generated.impl.uIOperation2jIMethod_Helper_r7Impl
		 * @see de.silvawb.umlInteraction2java.generated.impl.GeneratedPackageImpl#getuIOperation2jIMethod_Helper_r7()
		 * @generated
		 */
		EClass UI_OPERATION2J_IMETHOD_HELPER_R7 = eINSTANCE.getuIOperation2jIMethod_Helper_r7();

		/**
		 * The meta object literal for the '<em><b>Add Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_OPERATION2J_IMETHOD_HELPER_R7__ADD_ELEMENT_ACTIVITY = eINSTANCE
				.getuIOperation2jIMethod_Helper_r7_AddElementActivity();

		/**
		 * The meta object literal for the '<em><b>Move Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_OPERATION2J_IMETHOD_HELPER_R7__MOVE_ELEMENT_ACTIVITY = eINSTANCE
				.getuIOperation2jIMethod_Helper_r7_MoveElementActivity();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_OPERATION2J_IMETHOD_HELPER_R7__CHANGE_ATTRIBUTE_ACTIVITY = eINSTANCE
				.getuIOperation2jIMethod_Helper_r7_ChangeAttributeActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_OPERATION2J_IMETHOD_HELPER_R7__TRANSFORM_FORWARD_ACTIVITY = eINSTANCE
				.getuIOperation2jIMethod_Helper_r7_TransformForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_OPERATION2J_IMETHOD_HELPER_R7__TRANSFORM_MAPPING_ACTIVITY = eINSTANCE
				.getuIOperation2jIMethod_Helper_r7_TransformMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_OPERATION2J_IMETHOD_HELPER_R7__TRANSFORM_BACKWARD_ACTIVITY = eINSTANCE
				.getuIOperation2jIMethod_Helper_r7_TransformBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_OPERATION2J_IMETHOD_HELPER_R7__CONFLICT_CHECK_FORWARD_ACTIVITY = eINSTANCE
				.getuIOperation2jIMethod_Helper_r7_ConflictCheckForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_OPERATION2J_IMETHOD_HELPER_R7__CONFLICT_CHECK_MAPPING_ACTIVITY = eINSTANCE
				.getuIOperation2jIMethod_Helper_r7_ConflictCheckMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_OPERATION2J_IMETHOD_HELPER_R7__CONFLICT_CHECK_BACKWARD_ACTIVITY = eINSTANCE
				.getuIOperation2jIMethod_Helper_r7_ConflictCheckBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_OPERATION2J_IMETHOD_HELPER_R7__SYNCHRONIZE_FORWARD_ACTIVITY = eINSTANCE
				.getuIOperation2jIMethod_Helper_r7_SynchronizeForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_OPERATION2J_IMETHOD_HELPER_R7__SYNCHRONIZE_BACKWARD_ACTIVITY = eINSTANCE
				.getuIOperation2jIMethod_Helper_r7_SynchronizeBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_OPERATION2J_IMETHOD_HELPER_R7__REPAIR_FORWARD_ACTIVITY = eINSTANCE
				.getuIOperation2jIMethod_Helper_r7_RepairForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_OPERATION2J_IMETHOD_HELPER_R7__REPAIR_BACKWARD_ACTIVITY = eINSTANCE
				.getuIOperation2jIMethod_Helper_r7_RepairBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_OPERATION2J_IMETHOD_HELPER_R7___ADD_ELEMENT__EMAP = eINSTANCE
				.getuIOperation2jIMethod_Helper_r7__AddElement__EMap();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_OPERATION2J_IMETHOD_HELPER_R7___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = eINSTANCE
				.getuIOperation2jIMethod_Helper_r7__ChangeAttributeValues__TGGNode_EMap();

		/**
		 * The meta object literal for the '<em><b>Move Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_OPERATION2J_IMETHOD_HELPER_R7___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = eINSTANCE
				.getuIOperation2jIMethod_Helper_r7__MoveElement__TGGNode_TGGNode_TGGNode();

		/**
		 * The meta object literal for the '<em><b>Transform Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_OPERATION2J_IMETHOD_HELPER_R7___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getuIOperation2jIMethod_Helper_r7__TransformForward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_OPERATION2J_IMETHOD_HELPER_R7___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getuIOperation2jIMethod_Helper_r7__TransformMapping__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_OPERATION2J_IMETHOD_HELPER_R7___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getuIOperation2jIMethod_Helper_r7__TransformBackward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_OPERATION2J_IMETHOD_HELPER_R7___CONFLICT_CHECK_FORWARD__TGGNODE = eINSTANCE
				.getuIOperation2jIMethod_Helper_r7__ConflictCheckForward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_OPERATION2J_IMETHOD_HELPER_R7___CONFLICT_CHECK_MAPPING__TGGNODE = eINSTANCE
				.getuIOperation2jIMethod_Helper_r7__ConflictCheckMapping__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_OPERATION2J_IMETHOD_HELPER_R7___CONFLICT_CHECK_BACKWARD__TGGNODE = eINSTANCE
				.getuIOperation2jIMethod_Helper_r7__ConflictCheckBackward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_OPERATION2J_IMETHOD_HELPER_R7___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getuIOperation2jIMethod_Helper_r7__SynchronizeForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_OPERATION2J_IMETHOD_HELPER_R7___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getuIOperation2jIMethod_Helper_r7__SynchronizeBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_OPERATION2J_IMETHOD_HELPER_R7___REPAIR_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getuIOperation2jIMethod_Helper_r7__RepairForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI_OPERATION2J_IMETHOD_HELPER_R7___REPAIR_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getuIOperation2jIMethod_Helper_r7__RepairBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '{@link de.silvawb.umlInteraction2java.generated.impl.uMessageSequence2jInteractionAnnotation_r3Impl <em>uMessage Sequence2j Interaction Annotation r3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.umlInteraction2java.generated.impl.uMessageSequence2jInteractionAnnotation_r3Impl
		 * @see de.silvawb.umlInteraction2java.generated.impl.GeneratedPackageImpl#getuMessageSequence2jInteractionAnnotation_r3()
		 * @generated
		 */
		EClass UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3 = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_r3();

		/**
		 * The meta object literal for the '<em><b>Add Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__ADD_ELEMENT_ACTIVITY = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_r3_AddElementActivity();

		/**
		 * The meta object literal for the '<em><b>Move Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__MOVE_ELEMENT_ACTIVITY = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_r3_MoveElementActivity();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__CHANGE_ATTRIBUTE_ACTIVITY = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_r3_ChangeAttributeActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__TRANSFORM_FORWARD_ACTIVITY = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_r3_TransformForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__TRANSFORM_MAPPING_ACTIVITY = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_r3_TransformMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__TRANSFORM_BACKWARD_ACTIVITY = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_r3_TransformBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__CONFLICT_CHECK_FORWARD_ACTIVITY = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_r3_ConflictCheckForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__CONFLICT_CHECK_MAPPING_ACTIVITY = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_r3_ConflictCheckMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__CONFLICT_CHECK_BACKWARD_ACTIVITY = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_r3_ConflictCheckBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__SYNCHRONIZE_FORWARD_ACTIVITY = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_r3_SynchronizeForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__SYNCHRONIZE_BACKWARD_ACTIVITY = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_r3_SynchronizeBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__REPAIR_FORWARD_ACTIVITY = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_r3_RepairForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__REPAIR_BACKWARD_ACTIVITY = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_r3_RepairBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___ADD_ELEMENT__EMAP = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_r3__AddElement__EMap();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_r3__ChangeAttributeValues__TGGNode_EMap();

		/**
		 * The meta object literal for the '<em><b>Move Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_r3__MoveElement__TGGNode_TGGNode_TGGNode();

		/**
		 * The meta object literal for the '<em><b>Transform Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_r3__TransformForward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_r3__TransformMapping__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_r3__TransformBackward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___CONFLICT_CHECK_FORWARD__TGGNODE = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_r3__ConflictCheckForward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___CONFLICT_CHECK_MAPPING__TGGNODE = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_r3__ConflictCheckMapping__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___CONFLICT_CHECK_BACKWARD__TGGNODE = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_r3__ConflictCheckBackward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_r3__SynchronizeForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_r3__SynchronizeBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___REPAIR_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_r3__RepairForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___REPAIR_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getuMessageSequence2jInteractionAnnotation_r3__RepairBackward__TGGNode_boolean();

	}

} //GeneratedPackage
