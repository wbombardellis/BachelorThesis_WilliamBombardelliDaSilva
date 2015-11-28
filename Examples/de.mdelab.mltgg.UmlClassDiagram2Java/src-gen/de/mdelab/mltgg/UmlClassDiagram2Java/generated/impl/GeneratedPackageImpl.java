/**
 */
package de.mdelab.mltgg.UmlClassDiagram2Java.generated.impl;

import de.mdelab.mlsdm.MlsdmPackage;

import de.mdelab.mltgg.UmlClassDiagram2Java.UmlClassDiagram2JavaPackage;

import de.mdelab.mltgg.UmlClassDiagram2Java.generated.GeneratedFactory;
import de.mdelab.mltgg.UmlClassDiagram2Java.generated.GeneratedPackage;
import de.mdelab.mltgg.UmlClassDiagram2Java.generated.UmlClassDiagram2JavaAxiom;
import de.mdelab.mltgg.UmlClassDiagram2Java.generated.UmlClassDiagram2JavaAxiom_r1;
import de.mdelab.mltgg.UmlClassDiagram2Java.generated.UmlClassDiagram2JavaOperationalTGG;
import de.mdelab.mltgg.UmlClassDiagram2Java.generated.UmlPackage2JavaPackage;
import de.mdelab.mltgg.UmlClassDiagram2Java.generated.UmlPackage2JavaPackage_r2;

import de.mdelab.mltgg.UmlClassDiagram2Java.impl.UmlClassDiagram2JavaPackageImpl;

import de.mdelab.mltgg.mote2.Mote2Package;

import de.mdelab.mltgg.mote2.helpers.HelpersPackage;

import de.mdelab.mltgg.mote2.operationalTGG.OperationalTGGPackage;

import de.mdelab.mltgg.mote2.sdm.SdmPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneratedPackageImpl extends EPackageImpl implements GeneratedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlClassDiagram2JavaOperationalTGGEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlClassDiagram2JavaAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlPackage2JavaPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlClassDiagram2JavaAxiom_r1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlPackage2JavaPackage_r2EClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.mdelab.mltgg.UmlClassDiagram2Java.generated.GeneratedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GeneratedPackageImpl() {
		super(eNS_URI, GeneratedFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GeneratedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GeneratedPackage init() {
		if (isInited)
			return (GeneratedPackage) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI);

		// Obtain or create and register package
		GeneratedPackageImpl theGeneratedPackage = (GeneratedPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof GeneratedPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new GeneratedPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SdmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		UmlClassDiagram2JavaPackageImpl theUmlClassDiagram2JavaPackage = (UmlClassDiagram2JavaPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(UmlClassDiagram2JavaPackage.eNS_URI) instanceof UmlClassDiagram2JavaPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(UmlClassDiagram2JavaPackage.eNS_URI)
						: UmlClassDiagram2JavaPackage.eINSTANCE);

		// Create package meta-data objects
		theGeneratedPackage.createPackageContents();
		theUmlClassDiagram2JavaPackage.createPackageContents();

		// Initialize created meta-data
		theGeneratedPackage.initializePackageContents();
		theUmlClassDiagram2JavaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGeneratedPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GeneratedPackage.eNS_URI, theGeneratedPackage);
		return theGeneratedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUmlClassDiagram2JavaOperationalTGG() {
		return umlClassDiagram2JavaOperationalTGGEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUmlClassDiagram2JavaAxiom() {
		return umlClassDiagram2JavaAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUmlPackage2JavaPackage() {
		return umlPackage2JavaPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUmlClassDiagram2JavaAxiom_r1() {
		return umlClassDiagram2JavaAxiom_r1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlClassDiagram2JavaAxiom_r1_AddElementActivity() {
		return (EReference) umlClassDiagram2JavaAxiom_r1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlClassDiagram2JavaAxiom_r1_MoveElementActivity() {
		return (EReference) umlClassDiagram2JavaAxiom_r1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlClassDiagram2JavaAxiom_r1_ChangeAttributeActivity() {
		return (EReference) umlClassDiagram2JavaAxiom_r1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlClassDiagram2JavaAxiom_r1_TransformForwardActivity() {
		return (EReference) umlClassDiagram2JavaAxiom_r1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlClassDiagram2JavaAxiom_r1_TransformMappingActivity() {
		return (EReference) umlClassDiagram2JavaAxiom_r1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlClassDiagram2JavaAxiom_r1_TransformBackwardActivity() {
		return (EReference) umlClassDiagram2JavaAxiom_r1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlClassDiagram2JavaAxiom_r1_SynchronizeForwardActivity() {
		return (EReference) umlClassDiagram2JavaAxiom_r1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlClassDiagram2JavaAxiom_r1_SynchronizeBackwardActivity() {
		return (EReference) umlClassDiagram2JavaAxiom_r1EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUmlClassDiagram2JavaAxiom_r1__AddElement__EMap_EList_EList() {
		return umlClassDiagram2JavaAxiom_r1EClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUmlClassDiagram2JavaAxiom_r1__ChangeAttributeValues__TGGNode_EMap() {
		return umlClassDiagram2JavaAxiom_r1EClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUmlClassDiagram2JavaAxiom_r1__TransformForward__EList_EList_boolean() {
		return umlClassDiagram2JavaAxiom_r1EClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUmlClassDiagram2JavaAxiom_r1__TransformMapping__EList_EList_boolean() {
		return umlClassDiagram2JavaAxiom_r1EClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUmlClassDiagram2JavaAxiom_r1__TransformBackward__EList_EList_boolean() {
		return umlClassDiagram2JavaAxiom_r1EClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUmlClassDiagram2JavaAxiom_r1__SynchronizeForward__EList_EList_TGGNode_boolean() {
		return umlClassDiagram2JavaAxiom_r1EClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUmlClassDiagram2JavaAxiom_r1__SynchronizeBackward__EList_EList_TGGNode_boolean() {
		return umlClassDiagram2JavaAxiom_r1EClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUmlPackage2JavaPackage_r2() {
		return umlPackage2JavaPackage_r2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlPackage2JavaPackage_r2_AddElementActivity() {
		return (EReference) umlPackage2JavaPackage_r2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlPackage2JavaPackage_r2_MoveElementActivity() {
		return (EReference) umlPackage2JavaPackage_r2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlPackage2JavaPackage_r2_ChangeAttributeActivity() {
		return (EReference) umlPackage2JavaPackage_r2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlPackage2JavaPackage_r2_TransformForwardActivity() {
		return (EReference) umlPackage2JavaPackage_r2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlPackage2JavaPackage_r2_TransformMappingActivity() {
		return (EReference) umlPackage2JavaPackage_r2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlPackage2JavaPackage_r2_TransformBackwardActivity() {
		return (EReference) umlPackage2JavaPackage_r2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlPackage2JavaPackage_r2_ConflictCheckForwardActivity() {
		return (EReference) umlPackage2JavaPackage_r2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlPackage2JavaPackage_r2_ConflictCheckMappingActivity() {
		return (EReference) umlPackage2JavaPackage_r2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlPackage2JavaPackage_r2_ConflictCheckBackwardActivity() {
		return (EReference) umlPackage2JavaPackage_r2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlPackage2JavaPackage_r2_SynchronizeForwardActivity() {
		return (EReference) umlPackage2JavaPackage_r2EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlPackage2JavaPackage_r2_SynchronizeBackwardActivity() {
		return (EReference) umlPackage2JavaPackage_r2EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlPackage2JavaPackage_r2_RepairForwardActivity() {
		return (EReference) umlPackage2JavaPackage_r2EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlPackage2JavaPackage_r2_RepairBackwardActivity() {
		return (EReference) umlPackage2JavaPackage_r2EClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUmlPackage2JavaPackage_r2__AddElement__EMap() {
		return umlPackage2JavaPackage_r2EClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUmlPackage2JavaPackage_r2__ChangeAttributeValues__TGGNode_EMap() {
		return umlPackage2JavaPackage_r2EClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUmlPackage2JavaPackage_r2__MoveElement__TGGNode_TGGNode_TGGNode() {
		return umlPackage2JavaPackage_r2EClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUmlPackage2JavaPackage_r2__TransformForward__TGGNode_boolean_boolean() {
		return umlPackage2JavaPackage_r2EClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUmlPackage2JavaPackage_r2__TransformMapping__TGGNode_boolean_boolean() {
		return umlPackage2JavaPackage_r2EClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUmlPackage2JavaPackage_r2__TransformBackward__TGGNode_boolean_boolean() {
		return umlPackage2JavaPackage_r2EClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUmlPackage2JavaPackage_r2__ConflictCheckForward__TGGNode() {
		return umlPackage2JavaPackage_r2EClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUmlPackage2JavaPackage_r2__ConflictCheckMapping__TGGNode() {
		return umlPackage2JavaPackage_r2EClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUmlPackage2JavaPackage_r2__ConflictCheckBackward__TGGNode() {
		return umlPackage2JavaPackage_r2EClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUmlPackage2JavaPackage_r2__SynchronizeForward__TGGNode_boolean() {
		return umlPackage2JavaPackage_r2EClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUmlPackage2JavaPackage_r2__SynchronizeBackward__TGGNode_boolean() {
		return umlPackage2JavaPackage_r2EClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUmlPackage2JavaPackage_r2__RepairForward__TGGNode_boolean() {
		return umlPackage2JavaPackage_r2EClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUmlPackage2JavaPackage_r2__RepairBackward__TGGNode_boolean() {
		return umlPackage2JavaPackage_r2EClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedFactory getGeneratedFactory() {
		return (GeneratedFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		umlClassDiagram2JavaOperationalTGGEClass = createEClass(UML_CLASS_DIAGRAM2_JAVA_OPERATIONAL_TGG);

		umlClassDiagram2JavaAxiomEClass = createEClass(UML_CLASS_DIAGRAM2_JAVA_AXIOM);

		umlPackage2JavaPackageEClass = createEClass(UML_PACKAGE2_JAVA_PACKAGE);

		umlClassDiagram2JavaAxiom_r1EClass = createEClass(UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1);
		createEReference(umlClassDiagram2JavaAxiom_r1EClass, UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__ADD_ELEMENT_ACTIVITY);
		createEReference(umlClassDiagram2JavaAxiom_r1EClass, UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__MOVE_ELEMENT_ACTIVITY);
		createEReference(umlClassDiagram2JavaAxiom_r1EClass,
				UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__CHANGE_ATTRIBUTE_ACTIVITY);
		createEReference(umlClassDiagram2JavaAxiom_r1EClass,
				UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__TRANSFORM_FORWARD_ACTIVITY);
		createEReference(umlClassDiagram2JavaAxiom_r1EClass,
				UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__TRANSFORM_MAPPING_ACTIVITY);
		createEReference(umlClassDiagram2JavaAxiom_r1EClass,
				UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__TRANSFORM_BACKWARD_ACTIVITY);
		createEReference(umlClassDiagram2JavaAxiom_r1EClass,
				UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__SYNCHRONIZE_FORWARD_ACTIVITY);
		createEReference(umlClassDiagram2JavaAxiom_r1EClass,
				UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__SYNCHRONIZE_BACKWARD_ACTIVITY);
		createEOperation(umlClassDiagram2JavaAxiom_r1EClass,
				UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1___ADD_ELEMENT__EMAP_ELIST_ELIST);
		createEOperation(umlClassDiagram2JavaAxiom_r1EClass,
				UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP);
		createEOperation(umlClassDiagram2JavaAxiom_r1EClass,
				UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1___TRANSFORM_FORWARD__ELIST_ELIST_BOOLEAN);
		createEOperation(umlClassDiagram2JavaAxiom_r1EClass,
				UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1___TRANSFORM_MAPPING__ELIST_ELIST_BOOLEAN);
		createEOperation(umlClassDiagram2JavaAxiom_r1EClass,
				UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1___TRANSFORM_BACKWARD__ELIST_ELIST_BOOLEAN);
		createEOperation(umlClassDiagram2JavaAxiom_r1EClass,
				UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1___SYNCHRONIZE_FORWARD__ELIST_ELIST_TGGNODE_BOOLEAN);
		createEOperation(umlClassDiagram2JavaAxiom_r1EClass,
				UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1___SYNCHRONIZE_BACKWARD__ELIST_ELIST_TGGNODE_BOOLEAN);

		umlPackage2JavaPackage_r2EClass = createEClass(UML_PACKAGE2_JAVA_PACKAGE_R2);
		createEReference(umlPackage2JavaPackage_r2EClass, UML_PACKAGE2_JAVA_PACKAGE_R2__ADD_ELEMENT_ACTIVITY);
		createEReference(umlPackage2JavaPackage_r2EClass, UML_PACKAGE2_JAVA_PACKAGE_R2__MOVE_ELEMENT_ACTIVITY);
		createEReference(umlPackage2JavaPackage_r2EClass, UML_PACKAGE2_JAVA_PACKAGE_R2__CHANGE_ATTRIBUTE_ACTIVITY);
		createEReference(umlPackage2JavaPackage_r2EClass, UML_PACKAGE2_JAVA_PACKAGE_R2__TRANSFORM_FORWARD_ACTIVITY);
		createEReference(umlPackage2JavaPackage_r2EClass, UML_PACKAGE2_JAVA_PACKAGE_R2__TRANSFORM_MAPPING_ACTIVITY);
		createEReference(umlPackage2JavaPackage_r2EClass, UML_PACKAGE2_JAVA_PACKAGE_R2__TRANSFORM_BACKWARD_ACTIVITY);
		createEReference(umlPackage2JavaPackage_r2EClass,
				UML_PACKAGE2_JAVA_PACKAGE_R2__CONFLICT_CHECK_FORWARD_ACTIVITY);
		createEReference(umlPackage2JavaPackage_r2EClass,
				UML_PACKAGE2_JAVA_PACKAGE_R2__CONFLICT_CHECK_MAPPING_ACTIVITY);
		createEReference(umlPackage2JavaPackage_r2EClass,
				UML_PACKAGE2_JAVA_PACKAGE_R2__CONFLICT_CHECK_BACKWARD_ACTIVITY);
		createEReference(umlPackage2JavaPackage_r2EClass, UML_PACKAGE2_JAVA_PACKAGE_R2__SYNCHRONIZE_FORWARD_ACTIVITY);
		createEReference(umlPackage2JavaPackage_r2EClass, UML_PACKAGE2_JAVA_PACKAGE_R2__SYNCHRONIZE_BACKWARD_ACTIVITY);
		createEReference(umlPackage2JavaPackage_r2EClass, UML_PACKAGE2_JAVA_PACKAGE_R2__REPAIR_FORWARD_ACTIVITY);
		createEReference(umlPackage2JavaPackage_r2EClass, UML_PACKAGE2_JAVA_PACKAGE_R2__REPAIR_BACKWARD_ACTIVITY);
		createEOperation(umlPackage2JavaPackage_r2EClass, UML_PACKAGE2_JAVA_PACKAGE_R2___ADD_ELEMENT__EMAP);
		createEOperation(umlPackage2JavaPackage_r2EClass,
				UML_PACKAGE2_JAVA_PACKAGE_R2___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP);
		createEOperation(umlPackage2JavaPackage_r2EClass,
				UML_PACKAGE2_JAVA_PACKAGE_R2___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE);
		createEOperation(umlPackage2JavaPackage_r2EClass,
				UML_PACKAGE2_JAVA_PACKAGE_R2___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(umlPackage2JavaPackage_r2EClass,
				UML_PACKAGE2_JAVA_PACKAGE_R2___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(umlPackage2JavaPackage_r2EClass,
				UML_PACKAGE2_JAVA_PACKAGE_R2___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(umlPackage2JavaPackage_r2EClass,
				UML_PACKAGE2_JAVA_PACKAGE_R2___CONFLICT_CHECK_FORWARD__TGGNODE);
		createEOperation(umlPackage2JavaPackage_r2EClass,
				UML_PACKAGE2_JAVA_PACKAGE_R2___CONFLICT_CHECK_MAPPING__TGGNODE);
		createEOperation(umlPackage2JavaPackage_r2EClass,
				UML_PACKAGE2_JAVA_PACKAGE_R2___CONFLICT_CHECK_BACKWARD__TGGNODE);
		createEOperation(umlPackage2JavaPackage_r2EClass,
				UML_PACKAGE2_JAVA_PACKAGE_R2___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(umlPackage2JavaPackage_r2EClass,
				UML_PACKAGE2_JAVA_PACKAGE_R2___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN);
		createEOperation(umlPackage2JavaPackage_r2EClass,
				UML_PACKAGE2_JAVA_PACKAGE_R2___REPAIR_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(umlPackage2JavaPackage_r2EClass,
				UML_PACKAGE2_JAVA_PACKAGE_R2___REPAIR_BACKWARD__TGGNODE_BOOLEAN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SdmPackage theSdmPackage = (SdmPackage) EPackage.Registry.INSTANCE.getEPackage(SdmPackage.eNS_URI);
		OperationalTGGPackage theOperationalTGGPackage = (OperationalTGGPackage) EPackage.Registry.INSTANCE
				.getEPackage(OperationalTGGPackage.eNS_URI);
		MlsdmPackage theMlsdmPackage = (MlsdmPackage) EPackage.Registry.INSTANCE.getEPackage(MlsdmPackage.eNS_URI);
		Mote2Package theMote2Package = (Mote2Package) EPackage.Registry.INSTANCE.getEPackage(Mote2Package.eNS_URI);
		HelpersPackage theHelpersPackage = (HelpersPackage) EPackage.Registry.INSTANCE
				.getEPackage(HelpersPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		umlClassDiagram2JavaOperationalTGGEClass.getESuperTypes().add(theSdmPackage.getSdmOperationalTGG());
		umlClassDiagram2JavaAxiomEClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalAxiomGroup());
		umlPackage2JavaPackageEClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalRuleGroup());
		umlClassDiagram2JavaAxiom_r1EClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalAxiom());
		umlPackage2JavaPackage_r2EClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalRule());

		// Initialize classes, features, and operations; add parameters
		initEClass(umlClassDiagram2JavaOperationalTGGEClass, UmlClassDiagram2JavaOperationalTGG.class,
				"UmlClassDiagram2JavaOperationalTGG", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(umlClassDiagram2JavaAxiomEClass, UmlClassDiagram2JavaAxiom.class, "UmlClassDiagram2JavaAxiom",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(umlPackage2JavaPackageEClass, UmlPackage2JavaPackage.class, "UmlPackage2JavaPackage", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(umlClassDiagram2JavaAxiom_r1EClass, UmlClassDiagram2JavaAxiom_r1.class,
				"UmlClassDiagram2JavaAxiom_r1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUmlClassDiagram2JavaAxiom_r1_AddElementActivity(), theMlsdmPackage.getActivity(), null,
				"addElementActivity", null, 1, 1, UmlClassDiagram2JavaAxiom_r1.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUmlClassDiagram2JavaAxiom_r1_MoveElementActivity(), theMlsdmPackage.getActivity(), null,
				"moveElementActivity", null, 1, 1, UmlClassDiagram2JavaAxiom_r1.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUmlClassDiagram2JavaAxiom_r1_ChangeAttributeActivity(), theMlsdmPackage.getActivity(), null,
				"changeAttributeActivity", null, 1, 1, UmlClassDiagram2JavaAxiom_r1.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUmlClassDiagram2JavaAxiom_r1_TransformForwardActivity(), theMlsdmPackage.getActivity(), null,
				"transformForwardActivity", null, 1, 1, UmlClassDiagram2JavaAxiom_r1.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUmlClassDiagram2JavaAxiom_r1_TransformMappingActivity(), theMlsdmPackage.getActivity(), null,
				"transformMappingActivity", null, 1, 1, UmlClassDiagram2JavaAxiom_r1.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUmlClassDiagram2JavaAxiom_r1_TransformBackwardActivity(), theMlsdmPackage.getActivity(), null,
				"transformBackwardActivity", null, 1, 1, UmlClassDiagram2JavaAxiom_r1.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getUmlClassDiagram2JavaAxiom_r1_SynchronizeForwardActivity(), theMlsdmPackage.getActivity(),
				null, "synchronizeForwardActivity", null, 1, 1, UmlClassDiagram2JavaAxiom_r1.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getUmlClassDiagram2JavaAxiom_r1_SynchronizeBackwardActivity(), theMlsdmPackage.getActivity(),
				null, "synchronizeBackwardActivity", null, 1, 1, UmlClassDiagram2JavaAxiom_r1.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		EOperation op = initEOperation(getUmlClassDiagram2JavaAxiom_r1__AddElement__EMap_EList_EList(),
				theMote2Package.getTGGNode(), "addElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(theHelpersPackage.getMapEntry());
		EGenericType g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "parameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getUmlClassDiagram2JavaAxiom_r1__ChangeAttributeValues__TGGNode_EMap(),
				ecorePackage.getEBoolean(), "changeAttributeValues", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "ruleParameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getUmlClassDiagram2JavaAxiom_r1__TransformForward__EList_EList_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getUmlClassDiagram2JavaAxiom_r1__TransformMapping__EList_EList_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformMapping", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getUmlClassDiagram2JavaAxiom_r1__TransformBackward__EList_EList_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getUmlClassDiagram2JavaAxiom_r1__SynchronizeForward__EList_EList_TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getUmlClassDiagram2JavaAxiom_r1__SynchronizeBackward__EList_EList_TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		initEClass(umlPackage2JavaPackage_r2EClass, UmlPackage2JavaPackage_r2.class, "UmlPackage2JavaPackage_r2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUmlPackage2JavaPackage_r2_AddElementActivity(), theMlsdmPackage.getActivity(), null,
				"addElementActivity", null, 1, 1, UmlPackage2JavaPackage_r2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUmlPackage2JavaPackage_r2_MoveElementActivity(), theMlsdmPackage.getActivity(), null,
				"moveElementActivity", null, 1, 1, UmlPackage2JavaPackage_r2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUmlPackage2JavaPackage_r2_ChangeAttributeActivity(), theMlsdmPackage.getActivity(), null,
				"changeAttributeActivity", null, 1, 1, UmlPackage2JavaPackage_r2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUmlPackage2JavaPackage_r2_TransformForwardActivity(), theMlsdmPackage.getActivity(), null,
				"transformForwardActivity", null, 1, 1, UmlPackage2JavaPackage_r2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUmlPackage2JavaPackage_r2_TransformMappingActivity(), theMlsdmPackage.getActivity(), null,
				"transformMappingActivity", null, 1, 1, UmlPackage2JavaPackage_r2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUmlPackage2JavaPackage_r2_TransformBackwardActivity(), theMlsdmPackage.getActivity(), null,
				"transformBackwardActivity", null, 1, 1, UmlPackage2JavaPackage_r2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUmlPackage2JavaPackage_r2_ConflictCheckForwardActivity(), theMlsdmPackage.getActivity(), null,
				"conflictCheckForwardActivity", null, 1, 1, UmlPackage2JavaPackage_r2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getUmlPackage2JavaPackage_r2_ConflictCheckMappingActivity(), theMlsdmPackage.getActivity(), null,
				"conflictCheckMappingActivity", null, 1, 1, UmlPackage2JavaPackage_r2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getUmlPackage2JavaPackage_r2_ConflictCheckBackwardActivity(), theMlsdmPackage.getActivity(),
				null, "conflictCheckBackwardActivity", null, 1, 1, UmlPackage2JavaPackage_r2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getUmlPackage2JavaPackage_r2_SynchronizeForwardActivity(), theMlsdmPackage.getActivity(), null,
				"synchronizeForwardActivity", null, 1, 1, UmlPackage2JavaPackage_r2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUmlPackage2JavaPackage_r2_SynchronizeBackwardActivity(), theMlsdmPackage.getActivity(), null,
				"synchronizeBackwardActivity", null, 1, 1, UmlPackage2JavaPackage_r2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUmlPackage2JavaPackage_r2_RepairForwardActivity(), theMlsdmPackage.getActivity(), null,
				"repairForwardActivity", null, 1, 1, UmlPackage2JavaPackage_r2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUmlPackage2JavaPackage_r2_RepairBackwardActivity(), theMlsdmPackage.getActivity(), null,
				"repairBackwardActivity", null, 1, 1, UmlPackage2JavaPackage_r2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getUmlPackage2JavaPackage_r2__AddElement__EMap(), theMote2Package.getTGGNode(),
				"addElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "parameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getUmlPackage2JavaPackage_r2__ChangeAttributeValues__TGGNode_EMap(),
				ecorePackage.getEBoolean(), "changeAttributeValues", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "ruleParameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getUmlPackage2JavaPackage_r2__MoveElement__TGGNode_TGGNode_TGGNode(),
				ecorePackage.getEBoolean(), "moveElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "oldPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "newPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getUmlPackage2JavaPackage_r2__TransformForward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getUmlPackage2JavaPackage_r2__TransformMapping__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformMapping", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getUmlPackage2JavaPackage_r2__TransformBackward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getUmlPackage2JavaPackage_r2__ConflictCheckForward__TGGNode(), ecorePackage.getEObject(),
				"conflictCheckForward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getUmlPackage2JavaPackage_r2__ConflictCheckMapping__TGGNode(), ecorePackage.getEObject(),
				"conflictCheckMapping", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getUmlPackage2JavaPackage_r2__ConflictCheckBackward__TGGNode(), ecorePackage.getEObject(),
				"conflictCheckBackward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getUmlPackage2JavaPackage_r2__SynchronizeForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getUmlPackage2JavaPackage_r2__SynchronizeBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getUmlPackage2JavaPackage_r2__RepairForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getUmlPackage2JavaPackage_r2__RepairBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());
	}

} //GeneratedPackageImpl
