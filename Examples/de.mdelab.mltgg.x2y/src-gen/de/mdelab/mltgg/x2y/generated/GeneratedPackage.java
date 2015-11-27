/**
 */
package de.mdelab.mltgg.x2y.generated;

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
 * @see de.mdelab.mltgg.x2y.generated.GeneratedFactory
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
	String eNS_URI = "http://www.mdelab.de/mltgg/x2y/1.0/generated";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "x2y.generated";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeneratedPackage eINSTANCE = de.mdelab.mltgg.x2y.generated.impl.GeneratedPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.x2y.generated.impl.x2yOperationalTGGImpl <em>x2y Operational TGG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.x2y.generated.impl.x2yOperationalTGGImpl
	 * @see de.mdelab.mltgg.x2y.generated.impl.GeneratedPackageImpl#getx2yOperationalTGG()
	 * @generated
	 */
	int X2Y_OPERATIONAL_TGG = 0;

	/**
	 * The feature id for the '<em><b>Operational Axiom Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_OPERATIONAL_TGG__OPERATIONAL_AXIOM_GROUP = SdmPackage.SDM_OPERATIONAL_TGG__OPERATIONAL_AXIOM_GROUP;

	/**
	 * The feature id for the '<em><b>Operational Rule Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_OPERATIONAL_TGG__OPERATIONAL_RULE_GROUPS = SdmPackage.SDM_OPERATIONAL_TGG__OPERATIONAL_RULE_GROUPS;

	/**
	 * The feature id for the '<em><b>Tgg Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_OPERATIONAL_TGG__TGG_ENGINE = SdmPackage.SDM_OPERATIONAL_TGG__TGG_ENGINE;

	/**
	 * The feature id for the '<em><b>Tgg ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_OPERATIONAL_TGG__TGG_ID = SdmPackage.SDM_OPERATIONAL_TGG__TGG_ID;

	/**
	 * The feature id for the '<em><b>Unidirectional References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_OPERATIONAL_TGG__UNIDIRECTIONAL_REFERENCES = SdmPackage.SDM_OPERATIONAL_TGG__UNIDIRECTIONAL_REFERENCES;

	/**
	 * The feature id for the '<em><b>Interpreter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_OPERATIONAL_TGG__INTERPRETER = SdmPackage.SDM_OPERATIONAL_TGG__INTERPRETER;

	/**
	 * The number of structural features of the '<em>x2y Operational TGG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_OPERATIONAL_TGG_FEATURE_COUNT = SdmPackage.SDM_OPERATIONAL_TGG_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Transformation Started</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_OPERATIONAL_TGG___TRANSFORMATION_STARTED = SdmPackage.SDM_OPERATIONAL_TGG___TRANSFORMATION_STARTED;

	/**
	 * The operation id for the '<em>Transformation Finished</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_OPERATIONAL_TGG___TRANSFORMATION_FINISHED = SdmPackage.SDM_OPERATIONAL_TGG___TRANSFORMATION_FINISHED;

	/**
	 * The operation id for the '<em>Get Operational Mapping Group</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_OPERATIONAL_TGG___GET_OPERATIONAL_MAPPING_GROUP__STRING = SdmPackage.SDM_OPERATIONAL_TGG___GET_OPERATIONAL_MAPPING_GROUP__STRING;

	/**
	 * The operation id for the '<em>Execute Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_OPERATIONAL_TGG___EXECUTE_ACTIVITY__ACTIVITY_EMAP = SdmPackage.SDM_OPERATIONAL_TGG___EXECUTE_ACTIVITY__ACTIVITY_EMAP;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_OPERATIONAL_TGG___INIT = SdmPackage.SDM_OPERATIONAL_TGG___INIT;

	/**
	 * The number of operations of the '<em>x2y Operational TGG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_OPERATIONAL_TGG_OPERATION_COUNT = SdmPackage.SDM_OPERATIONAL_TGG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.x2y.generated.impl.x2yAxiomImpl <em>x2y Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.x2y.generated.impl.x2yAxiomImpl
	 * @see de.mdelab.mltgg.x2y.generated.impl.GeneratedPackageImpl#getx2yAxiom()
	 * @generated
	 */
	int X2Y_AXIOM = 1;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_AXIOM__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Axioms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_AXIOM__AXIOMS = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP__AXIOMS;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_AXIOM__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>x2y Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_AXIOM_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_AXIOM___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>x2y Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_AXIOM_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.x2y.generated.impl.x2yAxiom_r1Impl <em>x2y Axiom r1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.x2y.generated.impl.x2yAxiom_r1Impl
	 * @see de.mdelab.mltgg.x2y.generated.impl.GeneratedPackageImpl#getx2yAxiom_r1()
	 * @generated
	 */
	int X2Y_AXIOM_R1 = 2;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_AXIOM_R1__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_AXIOM__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_AXIOM_R1__RULE_ID = OperationalTGGPackage.OPERATIONAL_AXIOM__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Axiom Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_AXIOM_R1__OPERATIONAL_AXIOM_GROUP = OperationalTGGPackage.OPERATIONAL_AXIOM__OPERATIONAL_AXIOM_GROUP;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_AXIOM_R1__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_AXIOM_R1__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_AXIOM_R1__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_AXIOM_R1__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_AXIOM_R1__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_AXIOM_R1__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_AXIOM_R1__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_AXIOM_R1__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>x2y Axiom r1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_AXIOM_R1_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_AXIOM_R1___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_AXIOM___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_AXIOM_R1___ADD_ELEMENT__EMAP_ELIST_ELIST = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_AXIOM_R1___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_AXIOM_R1___TRANSFORM_FORWARD__ELIST_ELIST_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_AXIOM_R1___TRANSFORM_MAPPING__ELIST_ELIST_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_AXIOM_R1___TRANSFORM_BACKWARD__ELIST_ELIST_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_AXIOM_R1___SYNCHRONIZE_FORWARD__ELIST_ELIST_TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_AXIOM_R1___SYNCHRONIZE_BACKWARD__ELIST_ELIST_TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 6;

	/**
	 * The number of operations of the '<em>x2y Axiom r1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X2Y_AXIOM_R1_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT + 7;

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.x2y.generated.x2yOperationalTGG <em>x2y Operational TGG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>x2y Operational TGG</em>'.
	 * @see de.mdelab.mltgg.x2y.generated.x2yOperationalTGG
	 * @generated
	 */
	EClass getx2yOperationalTGG();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.x2y.generated.x2yAxiom <em>x2y Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>x2y Axiom</em>'.
	 * @see de.mdelab.mltgg.x2y.generated.x2yAxiom
	 * @generated
	 */
	EClass getx2yAxiom();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.x2y.generated.x2yAxiom_r1 <em>x2y Axiom r1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>x2y Axiom r1</em>'.
	 * @see de.mdelab.mltgg.x2y.generated.x2yAxiom_r1
	 * @generated
	 */
	EClass getx2yAxiom_r1();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.x2y.generated.x2yAxiom_r1#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.mdelab.mltgg.x2y.generated.x2yAxiom_r1#getAddElementActivity()
	 * @see #getx2yAxiom_r1()
	 * @generated
	 */
	EReference getx2yAxiom_r1_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.x2y.generated.x2yAxiom_r1#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.mdelab.mltgg.x2y.generated.x2yAxiom_r1#getMoveElementActivity()
	 * @see #getx2yAxiom_r1()
	 * @generated
	 */
	EReference getx2yAxiom_r1_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.x2y.generated.x2yAxiom_r1#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.mdelab.mltgg.x2y.generated.x2yAxiom_r1#getChangeAttributeActivity()
	 * @see #getx2yAxiom_r1()
	 * @generated
	 */
	EReference getx2yAxiom_r1_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.x2y.generated.x2yAxiom_r1#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.mdelab.mltgg.x2y.generated.x2yAxiom_r1#getTransformForwardActivity()
	 * @see #getx2yAxiom_r1()
	 * @generated
	 */
	EReference getx2yAxiom_r1_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.x2y.generated.x2yAxiom_r1#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.mdelab.mltgg.x2y.generated.x2yAxiom_r1#getTransformMappingActivity()
	 * @see #getx2yAxiom_r1()
	 * @generated
	 */
	EReference getx2yAxiom_r1_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.x2y.generated.x2yAxiom_r1#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.mdelab.mltgg.x2y.generated.x2yAxiom_r1#getTransformBackwardActivity()
	 * @see #getx2yAxiom_r1()
	 * @generated
	 */
	EReference getx2yAxiom_r1_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.x2y.generated.x2yAxiom_r1#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.mdelab.mltgg.x2y.generated.x2yAxiom_r1#getSynchronizeForwardActivity()
	 * @see #getx2yAxiom_r1()
	 * @generated
	 */
	EReference getx2yAxiom_r1_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.x2y.generated.x2yAxiom_r1#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.mdelab.mltgg.x2y.generated.x2yAxiom_r1#getSynchronizeBackwardActivity()
	 * @see #getx2yAxiom_r1()
	 * @generated
	 */
	EReference getx2yAxiom_r1_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.x2y.generated.x2yAxiom_r1#addElement(org.eclipse.emf.common.util.EMap, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.mdelab.mltgg.x2y.generated.x2yAxiom_r1#addElement(org.eclipse.emf.common.util.EMap, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getx2yAxiom_r1__AddElement__EMap_EList_EList();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.x2y.generated.x2yAxiom_r1#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.mdelab.mltgg.x2y.generated.x2yAxiom_r1#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getx2yAxiom_r1__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.x2y.generated.x2yAxiom_r1#transformForward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.mdelab.mltgg.x2y.generated.x2yAxiom_r1#transformForward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getx2yAxiom_r1__TransformForward__EList_EList_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.x2y.generated.x2yAxiom_r1#transformMapping(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.mdelab.mltgg.x2y.generated.x2yAxiom_r1#transformMapping(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getx2yAxiom_r1__TransformMapping__EList_EList_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.x2y.generated.x2yAxiom_r1#transformBackward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.mdelab.mltgg.x2y.generated.x2yAxiom_r1#transformBackward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getx2yAxiom_r1__TransformBackward__EList_EList_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.x2y.generated.x2yAxiom_r1#synchronizeForward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.mdelab.mltgg.x2y.generated.x2yAxiom_r1#synchronizeForward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getx2yAxiom_r1__SynchronizeForward__EList_EList_TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.x2y.generated.x2yAxiom_r1#synchronizeBackward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.mdelab.mltgg.x2y.generated.x2yAxiom_r1#synchronizeBackward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getx2yAxiom_r1__SynchronizeBackward__EList_EList_TGGNode_boolean();

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
		 * The meta object literal for the '{@link de.mdelab.mltgg.x2y.generated.impl.x2yOperationalTGGImpl <em>x2y Operational TGG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.x2y.generated.impl.x2yOperationalTGGImpl
		 * @see de.mdelab.mltgg.x2y.generated.impl.GeneratedPackageImpl#getx2yOperationalTGG()
		 * @generated
		 */
		EClass X2Y_OPERATIONAL_TGG = eINSTANCE.getx2yOperationalTGG();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.x2y.generated.impl.x2yAxiomImpl <em>x2y Axiom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.x2y.generated.impl.x2yAxiomImpl
		 * @see de.mdelab.mltgg.x2y.generated.impl.GeneratedPackageImpl#getx2yAxiom()
		 * @generated
		 */
		EClass X2Y_AXIOM = eINSTANCE.getx2yAxiom();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.x2y.generated.impl.x2yAxiom_r1Impl <em>x2y Axiom r1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.x2y.generated.impl.x2yAxiom_r1Impl
		 * @see de.mdelab.mltgg.x2y.generated.impl.GeneratedPackageImpl#getx2yAxiom_r1()
		 * @generated
		 */
		EClass X2Y_AXIOM_R1 = eINSTANCE.getx2yAxiom_r1();

		/**
		 * The meta object literal for the '<em><b>Add Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference X2Y_AXIOM_R1__ADD_ELEMENT_ACTIVITY = eINSTANCE.getx2yAxiom_r1_AddElementActivity();

		/**
		 * The meta object literal for the '<em><b>Move Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference X2Y_AXIOM_R1__MOVE_ELEMENT_ACTIVITY = eINSTANCE.getx2yAxiom_r1_MoveElementActivity();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference X2Y_AXIOM_R1__CHANGE_ATTRIBUTE_ACTIVITY = eINSTANCE.getx2yAxiom_r1_ChangeAttributeActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference X2Y_AXIOM_R1__TRANSFORM_FORWARD_ACTIVITY = eINSTANCE.getx2yAxiom_r1_TransformForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference X2Y_AXIOM_R1__TRANSFORM_MAPPING_ACTIVITY = eINSTANCE.getx2yAxiom_r1_TransformMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference X2Y_AXIOM_R1__TRANSFORM_BACKWARD_ACTIVITY = eINSTANCE.getx2yAxiom_r1_TransformBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference X2Y_AXIOM_R1__SYNCHRONIZE_FORWARD_ACTIVITY = eINSTANCE.getx2yAxiom_r1_SynchronizeForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference X2Y_AXIOM_R1__SYNCHRONIZE_BACKWARD_ACTIVITY = eINSTANCE.getx2yAxiom_r1_SynchronizeBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation X2Y_AXIOM_R1___ADD_ELEMENT__EMAP_ELIST_ELIST = eINSTANCE
				.getx2yAxiom_r1__AddElement__EMap_EList_EList();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation X2Y_AXIOM_R1___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = eINSTANCE
				.getx2yAxiom_r1__ChangeAttributeValues__TGGNode_EMap();

		/**
		 * The meta object literal for the '<em><b>Transform Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation X2Y_AXIOM_R1___TRANSFORM_FORWARD__ELIST_ELIST_BOOLEAN = eINSTANCE
				.getx2yAxiom_r1__TransformForward__EList_EList_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation X2Y_AXIOM_R1___TRANSFORM_MAPPING__ELIST_ELIST_BOOLEAN = eINSTANCE
				.getx2yAxiom_r1__TransformMapping__EList_EList_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation X2Y_AXIOM_R1___TRANSFORM_BACKWARD__ELIST_ELIST_BOOLEAN = eINSTANCE
				.getx2yAxiom_r1__TransformBackward__EList_EList_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation X2Y_AXIOM_R1___SYNCHRONIZE_FORWARD__ELIST_ELIST_TGGNODE_BOOLEAN = eINSTANCE
				.getx2yAxiom_r1__SynchronizeForward__EList_EList_TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation X2Y_AXIOM_R1___SYNCHRONIZE_BACKWARD__ELIST_ELIST_TGGNODE_BOOLEAN = eINSTANCE
				.getx2yAxiom_r1__SynchronizeBackward__EList_EList_TGGNode_boolean();

	}

} //GeneratedPackage
