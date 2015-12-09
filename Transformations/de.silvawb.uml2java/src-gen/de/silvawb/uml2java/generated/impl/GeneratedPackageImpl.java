/**
 */
package de.silvawb.uml2java.generated.impl;

import de.mdelab.mlsdm.MlsdmPackage;

import de.mdelab.mltgg.mote2.Mote2Package;

import de.mdelab.mltgg.mote2.helpers.HelpersPackage;

import de.mdelab.mltgg.mote2.operationalTGG.OperationalTGGPackage;

import de.mdelab.mltgg.mote2.sdm.SdmPackage;

import de.silvawb.uml2java.Uml2javaPackage;

import de.silvawb.uml2java.generated.GeneratedFactory;
import de.silvawb.uml2java.generated.GeneratedPackage;
import de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule;
import de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4;
import de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule;
import de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5;
import de.silvawb.uml2java.generated.uClass2jClass_Rule;
import de.silvawb.uml2java.generated.uClass2jClass_Rule_r3;
import de.silvawb.uml2java.generated.uInterface2jInterface_Rule;
import de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6;
import de.silvawb.uml2java.generated.uPackage2jPackage_Rule;
import de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2;
import de.silvawb.uml2java.generated.uml2javaAxiom;
import de.silvawb.uml2java.generated.uml2javaAxiom_r1;
import de.silvawb.uml2java.generated.uml2javaOperationalTGG;

import de.silvawb.uml2java.impl.Uml2javaPackageImpl;

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
	private EClass uml2javaOperationalTGGEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uml2javaAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uPackage2jPackage_RuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uCAttribute2jCAttribute_RuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uInterface2jInterface_RuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uClass2jClass_RuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uCOperation2jCMethod_RuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uml2javaAxiom_r1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uPackage2jPackage_Rule_r2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uCOperation2jCMethod_Rule_r5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uInterface2jInterface_Rule_r6EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uClass2jClass_Rule_r3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uCAttribute2jCAttribute_Rule_r4EClass = null;

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
	 * @see de.silvawb.uml2java.generated.GeneratedPackage#eNS_URI
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
		Uml2javaPackageImpl theUml2javaPackage = (Uml2javaPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(Uml2javaPackage.eNS_URI) instanceof Uml2javaPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(Uml2javaPackage.eNS_URI) : Uml2javaPackage.eINSTANCE);

		// Create package meta-data objects
		theGeneratedPackage.createPackageContents();
		theUml2javaPackage.createPackageContents();

		// Initialize created meta-data
		theGeneratedPackage.initializePackageContents();
		theUml2javaPackage.initializePackageContents();

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
	public EClass getuml2javaOperationalTGG() {
		return uml2javaOperationalTGGEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuml2javaAxiom() {
		return uml2javaAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuPackage2jPackage_Rule() {
		return uPackage2jPackage_RuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuCAttribute2jCAttribute_Rule() {
		return uCAttribute2jCAttribute_RuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuInterface2jInterface_Rule() {
		return uInterface2jInterface_RuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuClass2jClass_Rule() {
		return uClass2jClass_RuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuCOperation2jCMethod_Rule() {
		return uCOperation2jCMethod_RuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuml2javaAxiom_r1() {
		return uml2javaAxiom_r1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuml2javaAxiom_r1_AddElementActivity() {
		return (EReference) uml2javaAxiom_r1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuml2javaAxiom_r1_MoveElementActivity() {
		return (EReference) uml2javaAxiom_r1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuml2javaAxiom_r1_ChangeAttributeActivity() {
		return (EReference) uml2javaAxiom_r1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuml2javaAxiom_r1_TransformForwardActivity() {
		return (EReference) uml2javaAxiom_r1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuml2javaAxiom_r1_TransformMappingActivity() {
		return (EReference) uml2javaAxiom_r1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuml2javaAxiom_r1_TransformBackwardActivity() {
		return (EReference) uml2javaAxiom_r1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuml2javaAxiom_r1_SynchronizeForwardActivity() {
		return (EReference) uml2javaAxiom_r1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuml2javaAxiom_r1_SynchronizeBackwardActivity() {
		return (EReference) uml2javaAxiom_r1EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuml2javaAxiom_r1__AddElement__EMap_EList_EList() {
		return uml2javaAxiom_r1EClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuml2javaAxiom_r1__ChangeAttributeValues__TGGNode_EMap() {
		return uml2javaAxiom_r1EClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuml2javaAxiom_r1__TransformForward__EList_EList_boolean() {
		return uml2javaAxiom_r1EClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuml2javaAxiom_r1__TransformMapping__EList_EList_boolean() {
		return uml2javaAxiom_r1EClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuml2javaAxiom_r1__TransformBackward__EList_EList_boolean() {
		return uml2javaAxiom_r1EClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuml2javaAxiom_r1__SynchronizeForward__EList_EList_TGGNode_boolean() {
		return uml2javaAxiom_r1EClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuml2javaAxiom_r1__SynchronizeBackward__EList_EList_TGGNode_boolean() {
		return uml2javaAxiom_r1EClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuPackage2jPackage_Rule_r2() {
		return uPackage2jPackage_Rule_r2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuPackage2jPackage_Rule_r2_AddElementActivity() {
		return (EReference) uPackage2jPackage_Rule_r2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuPackage2jPackage_Rule_r2_MoveElementActivity() {
		return (EReference) uPackage2jPackage_Rule_r2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuPackage2jPackage_Rule_r2_ChangeAttributeActivity() {
		return (EReference) uPackage2jPackage_Rule_r2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuPackage2jPackage_Rule_r2_TransformForwardActivity() {
		return (EReference) uPackage2jPackage_Rule_r2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuPackage2jPackage_Rule_r2_TransformMappingActivity() {
		return (EReference) uPackage2jPackage_Rule_r2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuPackage2jPackage_Rule_r2_TransformBackwardActivity() {
		return (EReference) uPackage2jPackage_Rule_r2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuPackage2jPackage_Rule_r2_ConflictCheckForwardActivity() {
		return (EReference) uPackage2jPackage_Rule_r2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuPackage2jPackage_Rule_r2_ConflictCheckMappingActivity() {
		return (EReference) uPackage2jPackage_Rule_r2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuPackage2jPackage_Rule_r2_ConflictCheckBackwardActivity() {
		return (EReference) uPackage2jPackage_Rule_r2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuPackage2jPackage_Rule_r2_SynchronizeForwardActivity() {
		return (EReference) uPackage2jPackage_Rule_r2EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuPackage2jPackage_Rule_r2_SynchronizeBackwardActivity() {
		return (EReference) uPackage2jPackage_Rule_r2EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuPackage2jPackage_Rule_r2_RepairForwardActivity() {
		return (EReference) uPackage2jPackage_Rule_r2EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuPackage2jPackage_Rule_r2_RepairBackwardActivity() {
		return (EReference) uPackage2jPackage_Rule_r2EClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuPackage2jPackage_Rule_r2__AddElement__EMap() {
		return uPackage2jPackage_Rule_r2EClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuPackage2jPackage_Rule_r2__ChangeAttributeValues__TGGNode_EMap() {
		return uPackage2jPackage_Rule_r2EClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuPackage2jPackage_Rule_r2__MoveElement__TGGNode_TGGNode_TGGNode() {
		return uPackage2jPackage_Rule_r2EClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuPackage2jPackage_Rule_r2__TransformForward__TGGNode_boolean_boolean() {
		return uPackage2jPackage_Rule_r2EClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuPackage2jPackage_Rule_r2__TransformMapping__TGGNode_boolean_boolean() {
		return uPackage2jPackage_Rule_r2EClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuPackage2jPackage_Rule_r2__TransformBackward__TGGNode_boolean_boolean() {
		return uPackage2jPackage_Rule_r2EClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuPackage2jPackage_Rule_r2__ConflictCheckForward__TGGNode() {
		return uPackage2jPackage_Rule_r2EClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuPackage2jPackage_Rule_r2__ConflictCheckMapping__TGGNode() {
		return uPackage2jPackage_Rule_r2EClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuPackage2jPackage_Rule_r2__ConflictCheckBackward__TGGNode() {
		return uPackage2jPackage_Rule_r2EClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuPackage2jPackage_Rule_r2__SynchronizeForward__TGGNode_boolean() {
		return uPackage2jPackage_Rule_r2EClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuPackage2jPackage_Rule_r2__SynchronizeBackward__TGGNode_boolean() {
		return uPackage2jPackage_Rule_r2EClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuPackage2jPackage_Rule_r2__RepairForward__TGGNode_boolean() {
		return uPackage2jPackage_Rule_r2EClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuPackage2jPackage_Rule_r2__RepairBackward__TGGNode_boolean() {
		return uPackage2jPackage_Rule_r2EClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuCOperation2jCMethod_Rule_r5() {
		return uCOperation2jCMethod_Rule_r5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCOperation2jCMethod_Rule_r5_AddElementActivity() {
		return (EReference) uCOperation2jCMethod_Rule_r5EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCOperation2jCMethod_Rule_r5_MoveElementActivity() {
		return (EReference) uCOperation2jCMethod_Rule_r5EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCOperation2jCMethod_Rule_r5_ChangeAttributeActivity() {
		return (EReference) uCOperation2jCMethod_Rule_r5EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCOperation2jCMethod_Rule_r5_TransformForwardActivity() {
		return (EReference) uCOperation2jCMethod_Rule_r5EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCOperation2jCMethod_Rule_r5_TransformMappingActivity() {
		return (EReference) uCOperation2jCMethod_Rule_r5EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCOperation2jCMethod_Rule_r5_TransformBackwardActivity() {
		return (EReference) uCOperation2jCMethod_Rule_r5EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCOperation2jCMethod_Rule_r5_ConflictCheckForwardActivity() {
		return (EReference) uCOperation2jCMethod_Rule_r5EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCOperation2jCMethod_Rule_r5_ConflictCheckMappingActivity() {
		return (EReference) uCOperation2jCMethod_Rule_r5EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCOperation2jCMethod_Rule_r5_ConflictCheckBackwardActivity() {
		return (EReference) uCOperation2jCMethod_Rule_r5EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCOperation2jCMethod_Rule_r5_SynchronizeForwardActivity() {
		return (EReference) uCOperation2jCMethod_Rule_r5EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCOperation2jCMethod_Rule_r5_SynchronizeBackwardActivity() {
		return (EReference) uCOperation2jCMethod_Rule_r5EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCOperation2jCMethod_Rule_r5_RepairForwardActivity() {
		return (EReference) uCOperation2jCMethod_Rule_r5EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCOperation2jCMethod_Rule_r5_RepairBackwardActivity() {
		return (EReference) uCOperation2jCMethod_Rule_r5EClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCOperation2jCMethod_Rule_r5__AddElement__EMap() {
		return uCOperation2jCMethod_Rule_r5EClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCOperation2jCMethod_Rule_r5__ChangeAttributeValues__TGGNode_EMap() {
		return uCOperation2jCMethod_Rule_r5EClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCOperation2jCMethod_Rule_r5__MoveElement__TGGNode_TGGNode_TGGNode() {
		return uCOperation2jCMethod_Rule_r5EClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCOperation2jCMethod_Rule_r5__TransformForward__TGGNode_boolean_boolean() {
		return uCOperation2jCMethod_Rule_r5EClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCOperation2jCMethod_Rule_r5__TransformMapping__TGGNode_boolean_boolean() {
		return uCOperation2jCMethod_Rule_r5EClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCOperation2jCMethod_Rule_r5__TransformBackward__TGGNode_boolean_boolean() {
		return uCOperation2jCMethod_Rule_r5EClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCOperation2jCMethod_Rule_r5__ConflictCheckForward__TGGNode() {
		return uCOperation2jCMethod_Rule_r5EClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCOperation2jCMethod_Rule_r5__ConflictCheckMapping__TGGNode() {
		return uCOperation2jCMethod_Rule_r5EClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCOperation2jCMethod_Rule_r5__ConflictCheckBackward__TGGNode() {
		return uCOperation2jCMethod_Rule_r5EClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCOperation2jCMethod_Rule_r5__SynchronizeForward__TGGNode_boolean() {
		return uCOperation2jCMethod_Rule_r5EClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCOperation2jCMethod_Rule_r5__SynchronizeBackward__TGGNode_boolean() {
		return uCOperation2jCMethod_Rule_r5EClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCOperation2jCMethod_Rule_r5__RepairForward__TGGNode_boolean() {
		return uCOperation2jCMethod_Rule_r5EClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCOperation2jCMethod_Rule_r5__RepairBackward__TGGNode_boolean() {
		return uCOperation2jCMethod_Rule_r5EClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuInterface2jInterface_Rule_r6() {
		return uInterface2jInterface_Rule_r6EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuInterface2jInterface_Rule_r6_AddElementActivity() {
		return (EReference) uInterface2jInterface_Rule_r6EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuInterface2jInterface_Rule_r6_MoveElementActivity() {
		return (EReference) uInterface2jInterface_Rule_r6EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuInterface2jInterface_Rule_r6_ChangeAttributeActivity() {
		return (EReference) uInterface2jInterface_Rule_r6EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuInterface2jInterface_Rule_r6_TransformForwardActivity() {
		return (EReference) uInterface2jInterface_Rule_r6EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuInterface2jInterface_Rule_r6_TransformMappingActivity() {
		return (EReference) uInterface2jInterface_Rule_r6EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuInterface2jInterface_Rule_r6_TransformBackwardActivity() {
		return (EReference) uInterface2jInterface_Rule_r6EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuInterface2jInterface_Rule_r6_ConflictCheckForwardActivity() {
		return (EReference) uInterface2jInterface_Rule_r6EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuInterface2jInterface_Rule_r6_ConflictCheckMappingActivity() {
		return (EReference) uInterface2jInterface_Rule_r6EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuInterface2jInterface_Rule_r6_ConflictCheckBackwardActivity() {
		return (EReference) uInterface2jInterface_Rule_r6EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuInterface2jInterface_Rule_r6_SynchronizeForwardActivity() {
		return (EReference) uInterface2jInterface_Rule_r6EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuInterface2jInterface_Rule_r6_SynchronizeBackwardActivity() {
		return (EReference) uInterface2jInterface_Rule_r6EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuInterface2jInterface_Rule_r6_RepairForwardActivity() {
		return (EReference) uInterface2jInterface_Rule_r6EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuInterface2jInterface_Rule_r6_RepairBackwardActivity() {
		return (EReference) uInterface2jInterface_Rule_r6EClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuInterface2jInterface_Rule_r6__AddElement__EMap() {
		return uInterface2jInterface_Rule_r6EClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuInterface2jInterface_Rule_r6__ChangeAttributeValues__TGGNode_EMap() {
		return uInterface2jInterface_Rule_r6EClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuInterface2jInterface_Rule_r6__MoveElement__TGGNode_TGGNode_TGGNode() {
		return uInterface2jInterface_Rule_r6EClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuInterface2jInterface_Rule_r6__TransformForward__TGGNode_boolean_boolean() {
		return uInterface2jInterface_Rule_r6EClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuInterface2jInterface_Rule_r6__TransformMapping__TGGNode_boolean_boolean() {
		return uInterface2jInterface_Rule_r6EClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuInterface2jInterface_Rule_r6__TransformBackward__TGGNode_boolean_boolean() {
		return uInterface2jInterface_Rule_r6EClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuInterface2jInterface_Rule_r6__ConflictCheckForward__TGGNode() {
		return uInterface2jInterface_Rule_r6EClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuInterface2jInterface_Rule_r6__ConflictCheckMapping__TGGNode() {
		return uInterface2jInterface_Rule_r6EClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuInterface2jInterface_Rule_r6__ConflictCheckBackward__TGGNode() {
		return uInterface2jInterface_Rule_r6EClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuInterface2jInterface_Rule_r6__SynchronizeForward__TGGNode_boolean() {
		return uInterface2jInterface_Rule_r6EClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuInterface2jInterface_Rule_r6__SynchronizeBackward__TGGNode_boolean() {
		return uInterface2jInterface_Rule_r6EClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuInterface2jInterface_Rule_r6__RepairForward__TGGNode_boolean() {
		return uInterface2jInterface_Rule_r6EClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuInterface2jInterface_Rule_r6__RepairBackward__TGGNode_boolean() {
		return uInterface2jInterface_Rule_r6EClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuClass2jClass_Rule_r3() {
		return uClass2jClass_Rule_r3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Rule_r3_AddElementActivity() {
		return (EReference) uClass2jClass_Rule_r3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Rule_r3_MoveElementActivity() {
		return (EReference) uClass2jClass_Rule_r3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Rule_r3_ChangeAttributeActivity() {
		return (EReference) uClass2jClass_Rule_r3EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Rule_r3_TransformForwardActivity() {
		return (EReference) uClass2jClass_Rule_r3EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Rule_r3_TransformMappingActivity() {
		return (EReference) uClass2jClass_Rule_r3EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Rule_r3_TransformBackwardActivity() {
		return (EReference) uClass2jClass_Rule_r3EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Rule_r3_ConflictCheckForwardActivity() {
		return (EReference) uClass2jClass_Rule_r3EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Rule_r3_ConflictCheckMappingActivity() {
		return (EReference) uClass2jClass_Rule_r3EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Rule_r3_ConflictCheckBackwardActivity() {
		return (EReference) uClass2jClass_Rule_r3EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Rule_r3_SynchronizeForwardActivity() {
		return (EReference) uClass2jClass_Rule_r3EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Rule_r3_SynchronizeBackwardActivity() {
		return (EReference) uClass2jClass_Rule_r3EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Rule_r3_RepairForwardActivity() {
		return (EReference) uClass2jClass_Rule_r3EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Rule_r3_RepairBackwardActivity() {
		return (EReference) uClass2jClass_Rule_r3EClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Rule_r3__AddElement__EMap() {
		return uClass2jClass_Rule_r3EClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Rule_r3__ChangeAttributeValues__TGGNode_EMap() {
		return uClass2jClass_Rule_r3EClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Rule_r3__MoveElement__TGGNode_TGGNode_TGGNode() {
		return uClass2jClass_Rule_r3EClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Rule_r3__TransformForward__TGGNode_boolean_boolean() {
		return uClass2jClass_Rule_r3EClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Rule_r3__TransformMapping__TGGNode_boolean_boolean() {
		return uClass2jClass_Rule_r3EClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Rule_r3__TransformBackward__TGGNode_boolean_boolean() {
		return uClass2jClass_Rule_r3EClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Rule_r3__ConflictCheckForward__TGGNode() {
		return uClass2jClass_Rule_r3EClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Rule_r3__ConflictCheckMapping__TGGNode() {
		return uClass2jClass_Rule_r3EClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Rule_r3__ConflictCheckBackward__TGGNode() {
		return uClass2jClass_Rule_r3EClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Rule_r3__SynchronizeForward__TGGNode_boolean() {
		return uClass2jClass_Rule_r3EClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Rule_r3__SynchronizeBackward__TGGNode_boolean() {
		return uClass2jClass_Rule_r3EClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Rule_r3__RepairForward__TGGNode_boolean() {
		return uClass2jClass_Rule_r3EClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Rule_r3__RepairBackward__TGGNode_boolean() {
		return uClass2jClass_Rule_r3EClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuCAttribute2jCAttribute_Rule_r4() {
		return uCAttribute2jCAttribute_Rule_r4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCAttribute2jCAttribute_Rule_r4_AddElementActivity() {
		return (EReference) uCAttribute2jCAttribute_Rule_r4EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCAttribute2jCAttribute_Rule_r4_MoveElementActivity() {
		return (EReference) uCAttribute2jCAttribute_Rule_r4EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCAttribute2jCAttribute_Rule_r4_ChangeAttributeActivity() {
		return (EReference) uCAttribute2jCAttribute_Rule_r4EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCAttribute2jCAttribute_Rule_r4_TransformForwardActivity() {
		return (EReference) uCAttribute2jCAttribute_Rule_r4EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCAttribute2jCAttribute_Rule_r4_TransformMappingActivity() {
		return (EReference) uCAttribute2jCAttribute_Rule_r4EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCAttribute2jCAttribute_Rule_r4_TransformBackwardActivity() {
		return (EReference) uCAttribute2jCAttribute_Rule_r4EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCAttribute2jCAttribute_Rule_r4_ConflictCheckForwardActivity() {
		return (EReference) uCAttribute2jCAttribute_Rule_r4EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCAttribute2jCAttribute_Rule_r4_ConflictCheckMappingActivity() {
		return (EReference) uCAttribute2jCAttribute_Rule_r4EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCAttribute2jCAttribute_Rule_r4_ConflictCheckBackwardActivity() {
		return (EReference) uCAttribute2jCAttribute_Rule_r4EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCAttribute2jCAttribute_Rule_r4_SynchronizeForwardActivity() {
		return (EReference) uCAttribute2jCAttribute_Rule_r4EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCAttribute2jCAttribute_Rule_r4_SynchronizeBackwardActivity() {
		return (EReference) uCAttribute2jCAttribute_Rule_r4EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCAttribute2jCAttribute_Rule_r4_RepairForwardActivity() {
		return (EReference) uCAttribute2jCAttribute_Rule_r4EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCAttribute2jCAttribute_Rule_r4_RepairBackwardActivity() {
		return (EReference) uCAttribute2jCAttribute_Rule_r4EClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCAttribute2jCAttribute_Rule_r4__AddElement__EMap() {
		return uCAttribute2jCAttribute_Rule_r4EClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCAttribute2jCAttribute_Rule_r4__ChangeAttributeValues__TGGNode_EMap() {
		return uCAttribute2jCAttribute_Rule_r4EClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCAttribute2jCAttribute_Rule_r4__MoveElement__TGGNode_TGGNode_TGGNode() {
		return uCAttribute2jCAttribute_Rule_r4EClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCAttribute2jCAttribute_Rule_r4__TransformForward__TGGNode_boolean_boolean() {
		return uCAttribute2jCAttribute_Rule_r4EClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCAttribute2jCAttribute_Rule_r4__TransformMapping__TGGNode_boolean_boolean() {
		return uCAttribute2jCAttribute_Rule_r4EClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCAttribute2jCAttribute_Rule_r4__TransformBackward__TGGNode_boolean_boolean() {
		return uCAttribute2jCAttribute_Rule_r4EClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCAttribute2jCAttribute_Rule_r4__ConflictCheckForward__TGGNode() {
		return uCAttribute2jCAttribute_Rule_r4EClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCAttribute2jCAttribute_Rule_r4__ConflictCheckMapping__TGGNode() {
		return uCAttribute2jCAttribute_Rule_r4EClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCAttribute2jCAttribute_Rule_r4__ConflictCheckBackward__TGGNode() {
		return uCAttribute2jCAttribute_Rule_r4EClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCAttribute2jCAttribute_Rule_r4__SynchronizeForward__TGGNode_boolean() {
		return uCAttribute2jCAttribute_Rule_r4EClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCAttribute2jCAttribute_Rule_r4__SynchronizeBackward__TGGNode_boolean() {
		return uCAttribute2jCAttribute_Rule_r4EClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCAttribute2jCAttribute_Rule_r4__RepairForward__TGGNode_boolean() {
		return uCAttribute2jCAttribute_Rule_r4EClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCAttribute2jCAttribute_Rule_r4__RepairBackward__TGGNode_boolean() {
		return uCAttribute2jCAttribute_Rule_r4EClass.getEOperations().get(12);
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
		uml2javaOperationalTGGEClass = createEClass(UML2JAVA_OPERATIONAL_TGG);

		uml2javaAxiomEClass = createEClass(UML2JAVA_AXIOM);

		uPackage2jPackage_RuleEClass = createEClass(UPACKAGE2J_PACKAGE_RULE);

		uCAttribute2jCAttribute_RuleEClass = createEClass(UC_ATTRIBUTE2J_CATTRIBUTE_RULE);

		uInterface2jInterface_RuleEClass = createEClass(UINTERFACE2J_INTERFACE_RULE);

		uClass2jClass_RuleEClass = createEClass(UCLASS2J_CLASS_RULE);

		uCOperation2jCMethod_RuleEClass = createEClass(UC_OPERATION2J_CMETHOD_RULE);

		uml2javaAxiom_r1EClass = createEClass(UML2JAVA_AXIOM_R1);
		createEReference(uml2javaAxiom_r1EClass, UML2JAVA_AXIOM_R1__ADD_ELEMENT_ACTIVITY);
		createEReference(uml2javaAxiom_r1EClass, UML2JAVA_AXIOM_R1__MOVE_ELEMENT_ACTIVITY);
		createEReference(uml2javaAxiom_r1EClass, UML2JAVA_AXIOM_R1__CHANGE_ATTRIBUTE_ACTIVITY);
		createEReference(uml2javaAxiom_r1EClass, UML2JAVA_AXIOM_R1__TRANSFORM_FORWARD_ACTIVITY);
		createEReference(uml2javaAxiom_r1EClass, UML2JAVA_AXIOM_R1__TRANSFORM_MAPPING_ACTIVITY);
		createEReference(uml2javaAxiom_r1EClass, UML2JAVA_AXIOM_R1__TRANSFORM_BACKWARD_ACTIVITY);
		createEReference(uml2javaAxiom_r1EClass, UML2JAVA_AXIOM_R1__SYNCHRONIZE_FORWARD_ACTIVITY);
		createEReference(uml2javaAxiom_r1EClass, UML2JAVA_AXIOM_R1__SYNCHRONIZE_BACKWARD_ACTIVITY);
		createEOperation(uml2javaAxiom_r1EClass, UML2JAVA_AXIOM_R1___ADD_ELEMENT__EMAP_ELIST_ELIST);
		createEOperation(uml2javaAxiom_r1EClass, UML2JAVA_AXIOM_R1___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP);
		createEOperation(uml2javaAxiom_r1EClass, UML2JAVA_AXIOM_R1___TRANSFORM_FORWARD__ELIST_ELIST_BOOLEAN);
		createEOperation(uml2javaAxiom_r1EClass, UML2JAVA_AXIOM_R1___TRANSFORM_MAPPING__ELIST_ELIST_BOOLEAN);
		createEOperation(uml2javaAxiom_r1EClass, UML2JAVA_AXIOM_R1___TRANSFORM_BACKWARD__ELIST_ELIST_BOOLEAN);
		createEOperation(uml2javaAxiom_r1EClass, UML2JAVA_AXIOM_R1___SYNCHRONIZE_FORWARD__ELIST_ELIST_TGGNODE_BOOLEAN);
		createEOperation(uml2javaAxiom_r1EClass, UML2JAVA_AXIOM_R1___SYNCHRONIZE_BACKWARD__ELIST_ELIST_TGGNODE_BOOLEAN);

		uPackage2jPackage_Rule_r2EClass = createEClass(UPACKAGE2J_PACKAGE_RULE_R2);
		createEReference(uPackage2jPackage_Rule_r2EClass, UPACKAGE2J_PACKAGE_RULE_R2__ADD_ELEMENT_ACTIVITY);
		createEReference(uPackage2jPackage_Rule_r2EClass, UPACKAGE2J_PACKAGE_RULE_R2__MOVE_ELEMENT_ACTIVITY);
		createEReference(uPackage2jPackage_Rule_r2EClass, UPACKAGE2J_PACKAGE_RULE_R2__CHANGE_ATTRIBUTE_ACTIVITY);
		createEReference(uPackage2jPackage_Rule_r2EClass, UPACKAGE2J_PACKAGE_RULE_R2__TRANSFORM_FORWARD_ACTIVITY);
		createEReference(uPackage2jPackage_Rule_r2EClass, UPACKAGE2J_PACKAGE_RULE_R2__TRANSFORM_MAPPING_ACTIVITY);
		createEReference(uPackage2jPackage_Rule_r2EClass, UPACKAGE2J_PACKAGE_RULE_R2__TRANSFORM_BACKWARD_ACTIVITY);
		createEReference(uPackage2jPackage_Rule_r2EClass, UPACKAGE2J_PACKAGE_RULE_R2__CONFLICT_CHECK_FORWARD_ACTIVITY);
		createEReference(uPackage2jPackage_Rule_r2EClass, UPACKAGE2J_PACKAGE_RULE_R2__CONFLICT_CHECK_MAPPING_ACTIVITY);
		createEReference(uPackage2jPackage_Rule_r2EClass, UPACKAGE2J_PACKAGE_RULE_R2__CONFLICT_CHECK_BACKWARD_ACTIVITY);
		createEReference(uPackage2jPackage_Rule_r2EClass, UPACKAGE2J_PACKAGE_RULE_R2__SYNCHRONIZE_FORWARD_ACTIVITY);
		createEReference(uPackage2jPackage_Rule_r2EClass, UPACKAGE2J_PACKAGE_RULE_R2__SYNCHRONIZE_BACKWARD_ACTIVITY);
		createEReference(uPackage2jPackage_Rule_r2EClass, UPACKAGE2J_PACKAGE_RULE_R2__REPAIR_FORWARD_ACTIVITY);
		createEReference(uPackage2jPackage_Rule_r2EClass, UPACKAGE2J_PACKAGE_RULE_R2__REPAIR_BACKWARD_ACTIVITY);
		createEOperation(uPackage2jPackage_Rule_r2EClass, UPACKAGE2J_PACKAGE_RULE_R2___ADD_ELEMENT__EMAP);
		createEOperation(uPackage2jPackage_Rule_r2EClass,
				UPACKAGE2J_PACKAGE_RULE_R2___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP);
		createEOperation(uPackage2jPackage_Rule_r2EClass,
				UPACKAGE2J_PACKAGE_RULE_R2___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE);
		createEOperation(uPackage2jPackage_Rule_r2EClass,
				UPACKAGE2J_PACKAGE_RULE_R2___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(uPackage2jPackage_Rule_r2EClass,
				UPACKAGE2J_PACKAGE_RULE_R2___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(uPackage2jPackage_Rule_r2EClass,
				UPACKAGE2J_PACKAGE_RULE_R2___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(uPackage2jPackage_Rule_r2EClass, UPACKAGE2J_PACKAGE_RULE_R2___CONFLICT_CHECK_FORWARD__TGGNODE);
		createEOperation(uPackage2jPackage_Rule_r2EClass, UPACKAGE2J_PACKAGE_RULE_R2___CONFLICT_CHECK_MAPPING__TGGNODE);
		createEOperation(uPackage2jPackage_Rule_r2EClass,
				UPACKAGE2J_PACKAGE_RULE_R2___CONFLICT_CHECK_BACKWARD__TGGNODE);
		createEOperation(uPackage2jPackage_Rule_r2EClass,
				UPACKAGE2J_PACKAGE_RULE_R2___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(uPackage2jPackage_Rule_r2EClass,
				UPACKAGE2J_PACKAGE_RULE_R2___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN);
		createEOperation(uPackage2jPackage_Rule_r2EClass, UPACKAGE2J_PACKAGE_RULE_R2___REPAIR_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(uPackage2jPackage_Rule_r2EClass,
				UPACKAGE2J_PACKAGE_RULE_R2___REPAIR_BACKWARD__TGGNODE_BOOLEAN);

		uCOperation2jCMethod_Rule_r5EClass = createEClass(UC_OPERATION2J_CMETHOD_RULE_R5);
		createEReference(uCOperation2jCMethod_Rule_r5EClass, UC_OPERATION2J_CMETHOD_RULE_R5__ADD_ELEMENT_ACTIVITY);
		createEReference(uCOperation2jCMethod_Rule_r5EClass, UC_OPERATION2J_CMETHOD_RULE_R5__MOVE_ELEMENT_ACTIVITY);
		createEReference(uCOperation2jCMethod_Rule_r5EClass, UC_OPERATION2J_CMETHOD_RULE_R5__CHANGE_ATTRIBUTE_ACTIVITY);
		createEReference(uCOperation2jCMethod_Rule_r5EClass,
				UC_OPERATION2J_CMETHOD_RULE_R5__TRANSFORM_FORWARD_ACTIVITY);
		createEReference(uCOperation2jCMethod_Rule_r5EClass,
				UC_OPERATION2J_CMETHOD_RULE_R5__TRANSFORM_MAPPING_ACTIVITY);
		createEReference(uCOperation2jCMethod_Rule_r5EClass,
				UC_OPERATION2J_CMETHOD_RULE_R5__TRANSFORM_BACKWARD_ACTIVITY);
		createEReference(uCOperation2jCMethod_Rule_r5EClass,
				UC_OPERATION2J_CMETHOD_RULE_R5__CONFLICT_CHECK_FORWARD_ACTIVITY);
		createEReference(uCOperation2jCMethod_Rule_r5EClass,
				UC_OPERATION2J_CMETHOD_RULE_R5__CONFLICT_CHECK_MAPPING_ACTIVITY);
		createEReference(uCOperation2jCMethod_Rule_r5EClass,
				UC_OPERATION2J_CMETHOD_RULE_R5__CONFLICT_CHECK_BACKWARD_ACTIVITY);
		createEReference(uCOperation2jCMethod_Rule_r5EClass,
				UC_OPERATION2J_CMETHOD_RULE_R5__SYNCHRONIZE_FORWARD_ACTIVITY);
		createEReference(uCOperation2jCMethod_Rule_r5EClass,
				UC_OPERATION2J_CMETHOD_RULE_R5__SYNCHRONIZE_BACKWARD_ACTIVITY);
		createEReference(uCOperation2jCMethod_Rule_r5EClass, UC_OPERATION2J_CMETHOD_RULE_R5__REPAIR_FORWARD_ACTIVITY);
		createEReference(uCOperation2jCMethod_Rule_r5EClass, UC_OPERATION2J_CMETHOD_RULE_R5__REPAIR_BACKWARD_ACTIVITY);
		createEOperation(uCOperation2jCMethod_Rule_r5EClass, UC_OPERATION2J_CMETHOD_RULE_R5___ADD_ELEMENT__EMAP);
		createEOperation(uCOperation2jCMethod_Rule_r5EClass,
				UC_OPERATION2J_CMETHOD_RULE_R5___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP);
		createEOperation(uCOperation2jCMethod_Rule_r5EClass,
				UC_OPERATION2J_CMETHOD_RULE_R5___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE);
		createEOperation(uCOperation2jCMethod_Rule_r5EClass,
				UC_OPERATION2J_CMETHOD_RULE_R5___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(uCOperation2jCMethod_Rule_r5EClass,
				UC_OPERATION2J_CMETHOD_RULE_R5___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(uCOperation2jCMethod_Rule_r5EClass,
				UC_OPERATION2J_CMETHOD_RULE_R5___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(uCOperation2jCMethod_Rule_r5EClass,
				UC_OPERATION2J_CMETHOD_RULE_R5___CONFLICT_CHECK_FORWARD__TGGNODE);
		createEOperation(uCOperation2jCMethod_Rule_r5EClass,
				UC_OPERATION2J_CMETHOD_RULE_R5___CONFLICT_CHECK_MAPPING__TGGNODE);
		createEOperation(uCOperation2jCMethod_Rule_r5EClass,
				UC_OPERATION2J_CMETHOD_RULE_R5___CONFLICT_CHECK_BACKWARD__TGGNODE);
		createEOperation(uCOperation2jCMethod_Rule_r5EClass,
				UC_OPERATION2J_CMETHOD_RULE_R5___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(uCOperation2jCMethod_Rule_r5EClass,
				UC_OPERATION2J_CMETHOD_RULE_R5___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN);
		createEOperation(uCOperation2jCMethod_Rule_r5EClass,
				UC_OPERATION2J_CMETHOD_RULE_R5___REPAIR_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(uCOperation2jCMethod_Rule_r5EClass,
				UC_OPERATION2J_CMETHOD_RULE_R5___REPAIR_BACKWARD__TGGNODE_BOOLEAN);

		uInterface2jInterface_Rule_r6EClass = createEClass(UINTERFACE2J_INTERFACE_RULE_R6);
		createEReference(uInterface2jInterface_Rule_r6EClass, UINTERFACE2J_INTERFACE_RULE_R6__ADD_ELEMENT_ACTIVITY);
		createEReference(uInterface2jInterface_Rule_r6EClass, UINTERFACE2J_INTERFACE_RULE_R6__MOVE_ELEMENT_ACTIVITY);
		createEReference(uInterface2jInterface_Rule_r6EClass,
				UINTERFACE2J_INTERFACE_RULE_R6__CHANGE_ATTRIBUTE_ACTIVITY);
		createEReference(uInterface2jInterface_Rule_r6EClass,
				UINTERFACE2J_INTERFACE_RULE_R6__TRANSFORM_FORWARD_ACTIVITY);
		createEReference(uInterface2jInterface_Rule_r6EClass,
				UINTERFACE2J_INTERFACE_RULE_R6__TRANSFORM_MAPPING_ACTIVITY);
		createEReference(uInterface2jInterface_Rule_r6EClass,
				UINTERFACE2J_INTERFACE_RULE_R6__TRANSFORM_BACKWARD_ACTIVITY);
		createEReference(uInterface2jInterface_Rule_r6EClass,
				UINTERFACE2J_INTERFACE_RULE_R6__CONFLICT_CHECK_FORWARD_ACTIVITY);
		createEReference(uInterface2jInterface_Rule_r6EClass,
				UINTERFACE2J_INTERFACE_RULE_R6__CONFLICT_CHECK_MAPPING_ACTIVITY);
		createEReference(uInterface2jInterface_Rule_r6EClass,
				UINTERFACE2J_INTERFACE_RULE_R6__CONFLICT_CHECK_BACKWARD_ACTIVITY);
		createEReference(uInterface2jInterface_Rule_r6EClass,
				UINTERFACE2J_INTERFACE_RULE_R6__SYNCHRONIZE_FORWARD_ACTIVITY);
		createEReference(uInterface2jInterface_Rule_r6EClass,
				UINTERFACE2J_INTERFACE_RULE_R6__SYNCHRONIZE_BACKWARD_ACTIVITY);
		createEReference(uInterface2jInterface_Rule_r6EClass, UINTERFACE2J_INTERFACE_RULE_R6__REPAIR_FORWARD_ACTIVITY);
		createEReference(uInterface2jInterface_Rule_r6EClass, UINTERFACE2J_INTERFACE_RULE_R6__REPAIR_BACKWARD_ACTIVITY);
		createEOperation(uInterface2jInterface_Rule_r6EClass, UINTERFACE2J_INTERFACE_RULE_R6___ADD_ELEMENT__EMAP);
		createEOperation(uInterface2jInterface_Rule_r6EClass,
				UINTERFACE2J_INTERFACE_RULE_R6___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP);
		createEOperation(uInterface2jInterface_Rule_r6EClass,
				UINTERFACE2J_INTERFACE_RULE_R6___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE);
		createEOperation(uInterface2jInterface_Rule_r6EClass,
				UINTERFACE2J_INTERFACE_RULE_R6___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(uInterface2jInterface_Rule_r6EClass,
				UINTERFACE2J_INTERFACE_RULE_R6___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(uInterface2jInterface_Rule_r6EClass,
				UINTERFACE2J_INTERFACE_RULE_R6___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(uInterface2jInterface_Rule_r6EClass,
				UINTERFACE2J_INTERFACE_RULE_R6___CONFLICT_CHECK_FORWARD__TGGNODE);
		createEOperation(uInterface2jInterface_Rule_r6EClass,
				UINTERFACE2J_INTERFACE_RULE_R6___CONFLICT_CHECK_MAPPING__TGGNODE);
		createEOperation(uInterface2jInterface_Rule_r6EClass,
				UINTERFACE2J_INTERFACE_RULE_R6___CONFLICT_CHECK_BACKWARD__TGGNODE);
		createEOperation(uInterface2jInterface_Rule_r6EClass,
				UINTERFACE2J_INTERFACE_RULE_R6___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(uInterface2jInterface_Rule_r6EClass,
				UINTERFACE2J_INTERFACE_RULE_R6___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN);
		createEOperation(uInterface2jInterface_Rule_r6EClass,
				UINTERFACE2J_INTERFACE_RULE_R6___REPAIR_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(uInterface2jInterface_Rule_r6EClass,
				UINTERFACE2J_INTERFACE_RULE_R6___REPAIR_BACKWARD__TGGNODE_BOOLEAN);

		uClass2jClass_Rule_r3EClass = createEClass(UCLASS2J_CLASS_RULE_R3);
		createEReference(uClass2jClass_Rule_r3EClass, UCLASS2J_CLASS_RULE_R3__ADD_ELEMENT_ACTIVITY);
		createEReference(uClass2jClass_Rule_r3EClass, UCLASS2J_CLASS_RULE_R3__MOVE_ELEMENT_ACTIVITY);
		createEReference(uClass2jClass_Rule_r3EClass, UCLASS2J_CLASS_RULE_R3__CHANGE_ATTRIBUTE_ACTIVITY);
		createEReference(uClass2jClass_Rule_r3EClass, UCLASS2J_CLASS_RULE_R3__TRANSFORM_FORWARD_ACTIVITY);
		createEReference(uClass2jClass_Rule_r3EClass, UCLASS2J_CLASS_RULE_R3__TRANSFORM_MAPPING_ACTIVITY);
		createEReference(uClass2jClass_Rule_r3EClass, UCLASS2J_CLASS_RULE_R3__TRANSFORM_BACKWARD_ACTIVITY);
		createEReference(uClass2jClass_Rule_r3EClass, UCLASS2J_CLASS_RULE_R3__CONFLICT_CHECK_FORWARD_ACTIVITY);
		createEReference(uClass2jClass_Rule_r3EClass, UCLASS2J_CLASS_RULE_R3__CONFLICT_CHECK_MAPPING_ACTIVITY);
		createEReference(uClass2jClass_Rule_r3EClass, UCLASS2J_CLASS_RULE_R3__CONFLICT_CHECK_BACKWARD_ACTIVITY);
		createEReference(uClass2jClass_Rule_r3EClass, UCLASS2J_CLASS_RULE_R3__SYNCHRONIZE_FORWARD_ACTIVITY);
		createEReference(uClass2jClass_Rule_r3EClass, UCLASS2J_CLASS_RULE_R3__SYNCHRONIZE_BACKWARD_ACTIVITY);
		createEReference(uClass2jClass_Rule_r3EClass, UCLASS2J_CLASS_RULE_R3__REPAIR_FORWARD_ACTIVITY);
		createEReference(uClass2jClass_Rule_r3EClass, UCLASS2J_CLASS_RULE_R3__REPAIR_BACKWARD_ACTIVITY);
		createEOperation(uClass2jClass_Rule_r3EClass, UCLASS2J_CLASS_RULE_R3___ADD_ELEMENT__EMAP);
		createEOperation(uClass2jClass_Rule_r3EClass, UCLASS2J_CLASS_RULE_R3___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP);
		createEOperation(uClass2jClass_Rule_r3EClass, UCLASS2J_CLASS_RULE_R3___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE);
		createEOperation(uClass2jClass_Rule_r3EClass,
				UCLASS2J_CLASS_RULE_R3___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(uClass2jClass_Rule_r3EClass,
				UCLASS2J_CLASS_RULE_R3___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(uClass2jClass_Rule_r3EClass,
				UCLASS2J_CLASS_RULE_R3___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(uClass2jClass_Rule_r3EClass, UCLASS2J_CLASS_RULE_R3___CONFLICT_CHECK_FORWARD__TGGNODE);
		createEOperation(uClass2jClass_Rule_r3EClass, UCLASS2J_CLASS_RULE_R3___CONFLICT_CHECK_MAPPING__TGGNODE);
		createEOperation(uClass2jClass_Rule_r3EClass, UCLASS2J_CLASS_RULE_R3___CONFLICT_CHECK_BACKWARD__TGGNODE);
		createEOperation(uClass2jClass_Rule_r3EClass, UCLASS2J_CLASS_RULE_R3___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(uClass2jClass_Rule_r3EClass, UCLASS2J_CLASS_RULE_R3___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN);
		createEOperation(uClass2jClass_Rule_r3EClass, UCLASS2J_CLASS_RULE_R3___REPAIR_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(uClass2jClass_Rule_r3EClass, UCLASS2J_CLASS_RULE_R3___REPAIR_BACKWARD__TGGNODE_BOOLEAN);

		uCAttribute2jCAttribute_Rule_r4EClass = createEClass(UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4);
		createEReference(uCAttribute2jCAttribute_Rule_r4EClass,
				UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4__ADD_ELEMENT_ACTIVITY);
		createEReference(uCAttribute2jCAttribute_Rule_r4EClass,
				UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4__MOVE_ELEMENT_ACTIVITY);
		createEReference(uCAttribute2jCAttribute_Rule_r4EClass,
				UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4__CHANGE_ATTRIBUTE_ACTIVITY);
		createEReference(uCAttribute2jCAttribute_Rule_r4EClass,
				UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4__TRANSFORM_FORWARD_ACTIVITY);
		createEReference(uCAttribute2jCAttribute_Rule_r4EClass,
				UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4__TRANSFORM_MAPPING_ACTIVITY);
		createEReference(uCAttribute2jCAttribute_Rule_r4EClass,
				UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4__TRANSFORM_BACKWARD_ACTIVITY);
		createEReference(uCAttribute2jCAttribute_Rule_r4EClass,
				UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4__CONFLICT_CHECK_FORWARD_ACTIVITY);
		createEReference(uCAttribute2jCAttribute_Rule_r4EClass,
				UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4__CONFLICT_CHECK_MAPPING_ACTIVITY);
		createEReference(uCAttribute2jCAttribute_Rule_r4EClass,
				UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4__CONFLICT_CHECK_BACKWARD_ACTIVITY);
		createEReference(uCAttribute2jCAttribute_Rule_r4EClass,
				UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4__SYNCHRONIZE_FORWARD_ACTIVITY);
		createEReference(uCAttribute2jCAttribute_Rule_r4EClass,
				UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4__SYNCHRONIZE_BACKWARD_ACTIVITY);
		createEReference(uCAttribute2jCAttribute_Rule_r4EClass,
				UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4__REPAIR_FORWARD_ACTIVITY);
		createEReference(uCAttribute2jCAttribute_Rule_r4EClass,
				UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4__REPAIR_BACKWARD_ACTIVITY);
		createEOperation(uCAttribute2jCAttribute_Rule_r4EClass, UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4___ADD_ELEMENT__EMAP);
		createEOperation(uCAttribute2jCAttribute_Rule_r4EClass,
				UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP);
		createEOperation(uCAttribute2jCAttribute_Rule_r4EClass,
				UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE);
		createEOperation(uCAttribute2jCAttribute_Rule_r4EClass,
				UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(uCAttribute2jCAttribute_Rule_r4EClass,
				UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(uCAttribute2jCAttribute_Rule_r4EClass,
				UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(uCAttribute2jCAttribute_Rule_r4EClass,
				UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4___CONFLICT_CHECK_FORWARD__TGGNODE);
		createEOperation(uCAttribute2jCAttribute_Rule_r4EClass,
				UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4___CONFLICT_CHECK_MAPPING__TGGNODE);
		createEOperation(uCAttribute2jCAttribute_Rule_r4EClass,
				UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4___CONFLICT_CHECK_BACKWARD__TGGNODE);
		createEOperation(uCAttribute2jCAttribute_Rule_r4EClass,
				UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(uCAttribute2jCAttribute_Rule_r4EClass,
				UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN);
		createEOperation(uCAttribute2jCAttribute_Rule_r4EClass,
				UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4___REPAIR_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(uCAttribute2jCAttribute_Rule_r4EClass,
				UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4___REPAIR_BACKWARD__TGGNODE_BOOLEAN);
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
		uml2javaOperationalTGGEClass.getESuperTypes().add(theSdmPackage.getSdmOperationalTGG());
		uml2javaAxiomEClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalAxiomGroup());
		uPackage2jPackage_RuleEClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalRuleGroup());
		uCAttribute2jCAttribute_RuleEClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalRuleGroup());
		uInterface2jInterface_RuleEClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalRuleGroup());
		uClass2jClass_RuleEClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalRuleGroup());
		uCOperation2jCMethod_RuleEClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalRuleGroup());
		uml2javaAxiom_r1EClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalAxiom());
		uPackage2jPackage_Rule_r2EClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalRule());
		uCOperation2jCMethod_Rule_r5EClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalRule());
		uInterface2jInterface_Rule_r6EClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalRule());
		uClass2jClass_Rule_r3EClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalRule());
		uCAttribute2jCAttribute_Rule_r4EClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalRule());

		// Initialize classes, features, and operations; add parameters
		initEClass(uml2javaOperationalTGGEClass, uml2javaOperationalTGG.class, "uml2javaOperationalTGG", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uml2javaAxiomEClass, uml2javaAxiom.class, "uml2javaAxiom", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(uPackage2jPackage_RuleEClass, uPackage2jPackage_Rule.class, "uPackage2jPackage_Rule", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uCAttribute2jCAttribute_RuleEClass, uCAttribute2jCAttribute_Rule.class,
				"uCAttribute2jCAttribute_Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uInterface2jInterface_RuleEClass, uInterface2jInterface_Rule.class, "uInterface2jInterface_Rule",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uClass2jClass_RuleEClass, uClass2jClass_Rule.class, "uClass2jClass_Rule", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uCOperation2jCMethod_RuleEClass, uCOperation2jCMethod_Rule.class, "uCOperation2jCMethod_Rule",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uml2javaAxiom_r1EClass, uml2javaAxiom_r1.class, "uml2javaAxiom_r1", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getuml2javaAxiom_r1_AddElementActivity(), theMlsdmPackage.getActivity(), null,
				"addElementActivity", null, 1, 1, uml2javaAxiom_r1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuml2javaAxiom_r1_MoveElementActivity(), theMlsdmPackage.getActivity(), null,
				"moveElementActivity", null, 1, 1, uml2javaAxiom_r1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuml2javaAxiom_r1_ChangeAttributeActivity(), theMlsdmPackage.getActivity(), null,
				"changeAttributeActivity", null, 1, 1, uml2javaAxiom_r1.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuml2javaAxiom_r1_TransformForwardActivity(), theMlsdmPackage.getActivity(), null,
				"transformForwardActivity", null, 1, 1, uml2javaAxiom_r1.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuml2javaAxiom_r1_TransformMappingActivity(), theMlsdmPackage.getActivity(), null,
				"transformMappingActivity", null, 1, 1, uml2javaAxiom_r1.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuml2javaAxiom_r1_TransformBackwardActivity(), theMlsdmPackage.getActivity(), null,
				"transformBackwardActivity", null, 1, 1, uml2javaAxiom_r1.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuml2javaAxiom_r1_SynchronizeForwardActivity(), theMlsdmPackage.getActivity(), null,
				"synchronizeForwardActivity", null, 1, 1, uml2javaAxiom_r1.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuml2javaAxiom_r1_SynchronizeBackwardActivity(), theMlsdmPackage.getActivity(), null,
				"synchronizeBackwardActivity", null, 1, 1, uml2javaAxiom_r1.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getuml2javaAxiom_r1__AddElement__EMap_EList_EList(),
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

		op = initEOperation(getuml2javaAxiom_r1__ChangeAttributeValues__TGGNode_EMap(), ecorePackage.getEBoolean(),
				"changeAttributeValues", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "ruleParameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuml2javaAxiom_r1__TransformForward__EList_EList_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuml2javaAxiom_r1__TransformMapping__EList_EList_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformMapping", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuml2javaAxiom_r1__TransformBackward__EList_EList_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuml2javaAxiom_r1__SynchronizeForward__EList_EList_TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuml2javaAxiom_r1__SynchronizeBackward__EList_EList_TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		initEClass(uPackage2jPackage_Rule_r2EClass, uPackage2jPackage_Rule_r2.class, "uPackage2jPackage_Rule_r2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getuPackage2jPackage_Rule_r2_AddElementActivity(), theMlsdmPackage.getActivity(), null,
				"addElementActivity", null, 1, 1, uPackage2jPackage_Rule_r2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuPackage2jPackage_Rule_r2_MoveElementActivity(), theMlsdmPackage.getActivity(), null,
				"moveElementActivity", null, 1, 1, uPackage2jPackage_Rule_r2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuPackage2jPackage_Rule_r2_ChangeAttributeActivity(), theMlsdmPackage.getActivity(), null,
				"changeAttributeActivity", null, 1, 1, uPackage2jPackage_Rule_r2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuPackage2jPackage_Rule_r2_TransformForwardActivity(), theMlsdmPackage.getActivity(), null,
				"transformForwardActivity", null, 1, 1, uPackage2jPackage_Rule_r2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuPackage2jPackage_Rule_r2_TransformMappingActivity(), theMlsdmPackage.getActivity(), null,
				"transformMappingActivity", null, 1, 1, uPackage2jPackage_Rule_r2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuPackage2jPackage_Rule_r2_TransformBackwardActivity(), theMlsdmPackage.getActivity(), null,
				"transformBackwardActivity", null, 1, 1, uPackage2jPackage_Rule_r2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuPackage2jPackage_Rule_r2_ConflictCheckForwardActivity(), theMlsdmPackage.getActivity(), null,
				"conflictCheckForwardActivity", null, 1, 1, uPackage2jPackage_Rule_r2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuPackage2jPackage_Rule_r2_ConflictCheckMappingActivity(), theMlsdmPackage.getActivity(), null,
				"conflictCheckMappingActivity", null, 1, 1, uPackage2jPackage_Rule_r2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuPackage2jPackage_Rule_r2_ConflictCheckBackwardActivity(), theMlsdmPackage.getActivity(),
				null, "conflictCheckBackwardActivity", null, 1, 1, uPackage2jPackage_Rule_r2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuPackage2jPackage_Rule_r2_SynchronizeForwardActivity(), theMlsdmPackage.getActivity(), null,
				"synchronizeForwardActivity", null, 1, 1, uPackage2jPackage_Rule_r2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuPackage2jPackage_Rule_r2_SynchronizeBackwardActivity(), theMlsdmPackage.getActivity(), null,
				"synchronizeBackwardActivity", null, 1, 1, uPackage2jPackage_Rule_r2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuPackage2jPackage_Rule_r2_RepairForwardActivity(), theMlsdmPackage.getActivity(), null,
				"repairForwardActivity", null, 1, 1, uPackage2jPackage_Rule_r2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuPackage2jPackage_Rule_r2_RepairBackwardActivity(), theMlsdmPackage.getActivity(), null,
				"repairBackwardActivity", null, 1, 1, uPackage2jPackage_Rule_r2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getuPackage2jPackage_Rule_r2__AddElement__EMap(), theMote2Package.getTGGNode(),
				"addElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "parameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuPackage2jPackage_Rule_r2__ChangeAttributeValues__TGGNode_EMap(),
				ecorePackage.getEBoolean(), "changeAttributeValues", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "ruleParameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuPackage2jPackage_Rule_r2__MoveElement__TGGNode_TGGNode_TGGNode(),
				ecorePackage.getEBoolean(), "moveElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "oldPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "newPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuPackage2jPackage_Rule_r2__TransformForward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuPackage2jPackage_Rule_r2__TransformMapping__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformMapping", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuPackage2jPackage_Rule_r2__TransformBackward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuPackage2jPackage_Rule_r2__ConflictCheckForward__TGGNode(), ecorePackage.getEObject(),
				"conflictCheckForward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuPackage2jPackage_Rule_r2__ConflictCheckMapping__TGGNode(), ecorePackage.getEObject(),
				"conflictCheckMapping", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuPackage2jPackage_Rule_r2__ConflictCheckBackward__TGGNode(), ecorePackage.getEObject(),
				"conflictCheckBackward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuPackage2jPackage_Rule_r2__SynchronizeForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuPackage2jPackage_Rule_r2__SynchronizeBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuPackage2jPackage_Rule_r2__RepairForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuPackage2jPackage_Rule_r2__RepairBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		initEClass(uCOperation2jCMethod_Rule_r5EClass, uCOperation2jCMethod_Rule_r5.class,
				"uCOperation2jCMethod_Rule_r5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getuCOperation2jCMethod_Rule_r5_AddElementActivity(), theMlsdmPackage.getActivity(), null,
				"addElementActivity", null, 1, 1, uCOperation2jCMethod_Rule_r5.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuCOperation2jCMethod_Rule_r5_MoveElementActivity(), theMlsdmPackage.getActivity(), null,
				"moveElementActivity", null, 1, 1, uCOperation2jCMethod_Rule_r5.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuCOperation2jCMethod_Rule_r5_ChangeAttributeActivity(), theMlsdmPackage.getActivity(), null,
				"changeAttributeActivity", null, 1, 1, uCOperation2jCMethod_Rule_r5.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuCOperation2jCMethod_Rule_r5_TransformForwardActivity(), theMlsdmPackage.getActivity(), null,
				"transformForwardActivity", null, 1, 1, uCOperation2jCMethod_Rule_r5.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuCOperation2jCMethod_Rule_r5_TransformMappingActivity(), theMlsdmPackage.getActivity(), null,
				"transformMappingActivity", null, 1, 1, uCOperation2jCMethod_Rule_r5.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuCOperation2jCMethod_Rule_r5_TransformBackwardActivity(), theMlsdmPackage.getActivity(), null,
				"transformBackwardActivity", null, 1, 1, uCOperation2jCMethod_Rule_r5.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuCOperation2jCMethod_Rule_r5_ConflictCheckForwardActivity(), theMlsdmPackage.getActivity(),
				null, "conflictCheckForwardActivity", null, 1, 1, uCOperation2jCMethod_Rule_r5.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuCOperation2jCMethod_Rule_r5_ConflictCheckMappingActivity(), theMlsdmPackage.getActivity(),
				null, "conflictCheckMappingActivity", null, 1, 1, uCOperation2jCMethod_Rule_r5.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuCOperation2jCMethod_Rule_r5_ConflictCheckBackwardActivity(), theMlsdmPackage.getActivity(),
				null, "conflictCheckBackwardActivity", null, 1, 1, uCOperation2jCMethod_Rule_r5.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuCOperation2jCMethod_Rule_r5_SynchronizeForwardActivity(), theMlsdmPackage.getActivity(),
				null, "synchronizeForwardActivity", null, 1, 1, uCOperation2jCMethod_Rule_r5.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuCOperation2jCMethod_Rule_r5_SynchronizeBackwardActivity(), theMlsdmPackage.getActivity(),
				null, "synchronizeBackwardActivity", null, 1, 1, uCOperation2jCMethod_Rule_r5.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuCOperation2jCMethod_Rule_r5_RepairForwardActivity(), theMlsdmPackage.getActivity(), null,
				"repairForwardActivity", null, 1, 1, uCOperation2jCMethod_Rule_r5.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuCOperation2jCMethod_Rule_r5_RepairBackwardActivity(), theMlsdmPackage.getActivity(), null,
				"repairBackwardActivity", null, 1, 1, uCOperation2jCMethod_Rule_r5.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getuCOperation2jCMethod_Rule_r5__AddElement__EMap(), theMote2Package.getTGGNode(),
				"addElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "parameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuCOperation2jCMethod_Rule_r5__ChangeAttributeValues__TGGNode_EMap(),
				ecorePackage.getEBoolean(), "changeAttributeValues", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "ruleParameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuCOperation2jCMethod_Rule_r5__MoveElement__TGGNode_TGGNode_TGGNode(),
				ecorePackage.getEBoolean(), "moveElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "oldPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "newPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuCOperation2jCMethod_Rule_r5__TransformForward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuCOperation2jCMethod_Rule_r5__TransformMapping__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformMapping", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuCOperation2jCMethod_Rule_r5__TransformBackward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuCOperation2jCMethod_Rule_r5__ConflictCheckForward__TGGNode(), ecorePackage.getEObject(),
				"conflictCheckForward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuCOperation2jCMethod_Rule_r5__ConflictCheckMapping__TGGNode(), ecorePackage.getEObject(),
				"conflictCheckMapping", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuCOperation2jCMethod_Rule_r5__ConflictCheckBackward__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckBackward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuCOperation2jCMethod_Rule_r5__SynchronizeForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuCOperation2jCMethod_Rule_r5__SynchronizeBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuCOperation2jCMethod_Rule_r5__RepairForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuCOperation2jCMethod_Rule_r5__RepairBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		initEClass(uInterface2jInterface_Rule_r6EClass, uInterface2jInterface_Rule_r6.class,
				"uInterface2jInterface_Rule_r6", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getuInterface2jInterface_Rule_r6_AddElementActivity(), theMlsdmPackage.getActivity(), null,
				"addElementActivity", null, 1, 1, uInterface2jInterface_Rule_r6.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuInterface2jInterface_Rule_r6_MoveElementActivity(), theMlsdmPackage.getActivity(), null,
				"moveElementActivity", null, 1, 1, uInterface2jInterface_Rule_r6.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuInterface2jInterface_Rule_r6_ChangeAttributeActivity(), theMlsdmPackage.getActivity(), null,
				"changeAttributeActivity", null, 1, 1, uInterface2jInterface_Rule_r6.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuInterface2jInterface_Rule_r6_TransformForwardActivity(), theMlsdmPackage.getActivity(), null,
				"transformForwardActivity", null, 1, 1, uInterface2jInterface_Rule_r6.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuInterface2jInterface_Rule_r6_TransformMappingActivity(), theMlsdmPackage.getActivity(), null,
				"transformMappingActivity", null, 1, 1, uInterface2jInterface_Rule_r6.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuInterface2jInterface_Rule_r6_TransformBackwardActivity(), theMlsdmPackage.getActivity(),
				null, "transformBackwardActivity", null, 1, 1, uInterface2jInterface_Rule_r6.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuInterface2jInterface_Rule_r6_ConflictCheckForwardActivity(), theMlsdmPackage.getActivity(),
				null, "conflictCheckForwardActivity", null, 1, 1, uInterface2jInterface_Rule_r6.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuInterface2jInterface_Rule_r6_ConflictCheckMappingActivity(), theMlsdmPackage.getActivity(),
				null, "conflictCheckMappingActivity", null, 1, 1, uInterface2jInterface_Rule_r6.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuInterface2jInterface_Rule_r6_ConflictCheckBackwardActivity(), theMlsdmPackage.getActivity(),
				null, "conflictCheckBackwardActivity", null, 1, 1, uInterface2jInterface_Rule_r6.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuInterface2jInterface_Rule_r6_SynchronizeForwardActivity(), theMlsdmPackage.getActivity(),
				null, "synchronizeForwardActivity", null, 1, 1, uInterface2jInterface_Rule_r6.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuInterface2jInterface_Rule_r6_SynchronizeBackwardActivity(), theMlsdmPackage.getActivity(),
				null, "synchronizeBackwardActivity", null, 1, 1, uInterface2jInterface_Rule_r6.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuInterface2jInterface_Rule_r6_RepairForwardActivity(), theMlsdmPackage.getActivity(), null,
				"repairForwardActivity", null, 1, 1, uInterface2jInterface_Rule_r6.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuInterface2jInterface_Rule_r6_RepairBackwardActivity(), theMlsdmPackage.getActivity(), null,
				"repairBackwardActivity", null, 1, 1, uInterface2jInterface_Rule_r6.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getuInterface2jInterface_Rule_r6__AddElement__EMap(), theMote2Package.getTGGNode(),
				"addElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "parameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuInterface2jInterface_Rule_r6__ChangeAttributeValues__TGGNode_EMap(),
				ecorePackage.getEBoolean(), "changeAttributeValues", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "ruleParameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuInterface2jInterface_Rule_r6__MoveElement__TGGNode_TGGNode_TGGNode(),
				ecorePackage.getEBoolean(), "moveElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "oldPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "newPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuInterface2jInterface_Rule_r6__TransformForward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuInterface2jInterface_Rule_r6__TransformMapping__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformMapping", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuInterface2jInterface_Rule_r6__TransformBackward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuInterface2jInterface_Rule_r6__ConflictCheckForward__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckForward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuInterface2jInterface_Rule_r6__ConflictCheckMapping__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckMapping", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuInterface2jInterface_Rule_r6__ConflictCheckBackward__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckBackward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuInterface2jInterface_Rule_r6__SynchronizeForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuInterface2jInterface_Rule_r6__SynchronizeBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuInterface2jInterface_Rule_r6__RepairForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuInterface2jInterface_Rule_r6__RepairBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		initEClass(uClass2jClass_Rule_r3EClass, uClass2jClass_Rule_r3.class, "uClass2jClass_Rule_r3", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getuClass2jClass_Rule_r3_AddElementActivity(), theMlsdmPackage.getActivity(), null,
				"addElementActivity", null, 1, 1, uClass2jClass_Rule_r3.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuClass2jClass_Rule_r3_MoveElementActivity(), theMlsdmPackage.getActivity(), null,
				"moveElementActivity", null, 1, 1, uClass2jClass_Rule_r3.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuClass2jClass_Rule_r3_ChangeAttributeActivity(), theMlsdmPackage.getActivity(), null,
				"changeAttributeActivity", null, 1, 1, uClass2jClass_Rule_r3.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuClass2jClass_Rule_r3_TransformForwardActivity(), theMlsdmPackage.getActivity(), null,
				"transformForwardActivity", null, 1, 1, uClass2jClass_Rule_r3.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuClass2jClass_Rule_r3_TransformMappingActivity(), theMlsdmPackage.getActivity(), null,
				"transformMappingActivity", null, 1, 1, uClass2jClass_Rule_r3.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuClass2jClass_Rule_r3_TransformBackwardActivity(), theMlsdmPackage.getActivity(), null,
				"transformBackwardActivity", null, 1, 1, uClass2jClass_Rule_r3.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuClass2jClass_Rule_r3_ConflictCheckForwardActivity(), theMlsdmPackage.getActivity(), null,
				"conflictCheckForwardActivity", null, 1, 1, uClass2jClass_Rule_r3.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuClass2jClass_Rule_r3_ConflictCheckMappingActivity(), theMlsdmPackage.getActivity(), null,
				"conflictCheckMappingActivity", null, 1, 1, uClass2jClass_Rule_r3.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuClass2jClass_Rule_r3_ConflictCheckBackwardActivity(), theMlsdmPackage.getActivity(), null,
				"conflictCheckBackwardActivity", null, 1, 1, uClass2jClass_Rule_r3.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuClass2jClass_Rule_r3_SynchronizeForwardActivity(), theMlsdmPackage.getActivity(), null,
				"synchronizeForwardActivity", null, 1, 1, uClass2jClass_Rule_r3.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuClass2jClass_Rule_r3_SynchronizeBackwardActivity(), theMlsdmPackage.getActivity(), null,
				"synchronizeBackwardActivity", null, 1, 1, uClass2jClass_Rule_r3.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuClass2jClass_Rule_r3_RepairForwardActivity(), theMlsdmPackage.getActivity(), null,
				"repairForwardActivity", null, 1, 1, uClass2jClass_Rule_r3.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuClass2jClass_Rule_r3_RepairBackwardActivity(), theMlsdmPackage.getActivity(), null,
				"repairBackwardActivity", null, 1, 1, uClass2jClass_Rule_r3.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getuClass2jClass_Rule_r3__AddElement__EMap(), theMote2Package.getTGGNode(), "addElement", 1,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "parameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuClass2jClass_Rule_r3__ChangeAttributeValues__TGGNode_EMap(), ecorePackage.getEBoolean(),
				"changeAttributeValues", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "ruleParameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuClass2jClass_Rule_r3__MoveElement__TGGNode_TGGNode_TGGNode(),
				ecorePackage.getEBoolean(), "moveElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "oldPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "newPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuClass2jClass_Rule_r3__TransformForward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuClass2jClass_Rule_r3__TransformMapping__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformMapping", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuClass2jClass_Rule_r3__TransformBackward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuClass2jClass_Rule_r3__ConflictCheckForward__TGGNode(), ecorePackage.getEObject(),
				"conflictCheckForward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuClass2jClass_Rule_r3__ConflictCheckMapping__TGGNode(), ecorePackage.getEObject(),
				"conflictCheckMapping", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuClass2jClass_Rule_r3__ConflictCheckBackward__TGGNode(), ecorePackage.getEObject(),
				"conflictCheckBackward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuClass2jClass_Rule_r3__SynchronizeForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuClass2jClass_Rule_r3__SynchronizeBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuClass2jClass_Rule_r3__RepairForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuClass2jClass_Rule_r3__RepairBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		initEClass(uCAttribute2jCAttribute_Rule_r4EClass, uCAttribute2jCAttribute_Rule_r4.class,
				"uCAttribute2jCAttribute_Rule_r4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getuCAttribute2jCAttribute_Rule_r4_AddElementActivity(), theMlsdmPackage.getActivity(), null,
				"addElementActivity", null, 1, 1, uCAttribute2jCAttribute_Rule_r4.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuCAttribute2jCAttribute_Rule_r4_MoveElementActivity(), theMlsdmPackage.getActivity(), null,
				"moveElementActivity", null, 1, 1, uCAttribute2jCAttribute_Rule_r4.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuCAttribute2jCAttribute_Rule_r4_ChangeAttributeActivity(), theMlsdmPackage.getActivity(),
				null, "changeAttributeActivity", null, 1, 1, uCAttribute2jCAttribute_Rule_r4.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuCAttribute2jCAttribute_Rule_r4_TransformForwardActivity(), theMlsdmPackage.getActivity(),
				null, "transformForwardActivity", null, 1, 1, uCAttribute2jCAttribute_Rule_r4.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuCAttribute2jCAttribute_Rule_r4_TransformMappingActivity(), theMlsdmPackage.getActivity(),
				null, "transformMappingActivity", null, 1, 1, uCAttribute2jCAttribute_Rule_r4.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuCAttribute2jCAttribute_Rule_r4_TransformBackwardActivity(), theMlsdmPackage.getActivity(),
				null, "transformBackwardActivity", null, 1, 1, uCAttribute2jCAttribute_Rule_r4.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuCAttribute2jCAttribute_Rule_r4_ConflictCheckForwardActivity(), theMlsdmPackage.getActivity(),
				null, "conflictCheckForwardActivity", null, 1, 1, uCAttribute2jCAttribute_Rule_r4.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuCAttribute2jCAttribute_Rule_r4_ConflictCheckMappingActivity(), theMlsdmPackage.getActivity(),
				null, "conflictCheckMappingActivity", null, 1, 1, uCAttribute2jCAttribute_Rule_r4.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuCAttribute2jCAttribute_Rule_r4_ConflictCheckBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "conflictCheckBackwardActivity", null, 1, 1,
				uCAttribute2jCAttribute_Rule_r4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuCAttribute2jCAttribute_Rule_r4_SynchronizeForwardActivity(), theMlsdmPackage.getActivity(),
				null, "synchronizeForwardActivity", null, 1, 1, uCAttribute2jCAttribute_Rule_r4.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuCAttribute2jCAttribute_Rule_r4_SynchronizeBackwardActivity(), theMlsdmPackage.getActivity(),
				null, "synchronizeBackwardActivity", null, 1, 1, uCAttribute2jCAttribute_Rule_r4.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuCAttribute2jCAttribute_Rule_r4_RepairForwardActivity(), theMlsdmPackage.getActivity(), null,
				"repairForwardActivity", null, 1, 1, uCAttribute2jCAttribute_Rule_r4.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuCAttribute2jCAttribute_Rule_r4_RepairBackwardActivity(), theMlsdmPackage.getActivity(), null,
				"repairBackwardActivity", null, 1, 1, uCAttribute2jCAttribute_Rule_r4.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = initEOperation(getuCAttribute2jCAttribute_Rule_r4__AddElement__EMap(), theMote2Package.getTGGNode(),
				"addElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "parameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuCAttribute2jCAttribute_Rule_r4__ChangeAttributeValues__TGGNode_EMap(),
				ecorePackage.getEBoolean(), "changeAttributeValues", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "ruleParameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuCAttribute2jCAttribute_Rule_r4__MoveElement__TGGNode_TGGNode_TGGNode(),
				ecorePackage.getEBoolean(), "moveElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "oldPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "newPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuCAttribute2jCAttribute_Rule_r4__TransformForward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuCAttribute2jCAttribute_Rule_r4__TransformMapping__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformMapping", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuCAttribute2jCAttribute_Rule_r4__TransformBackward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuCAttribute2jCAttribute_Rule_r4__ConflictCheckForward__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckForward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuCAttribute2jCAttribute_Rule_r4__ConflictCheckMapping__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckMapping", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuCAttribute2jCAttribute_Rule_r4__ConflictCheckBackward__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckBackward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuCAttribute2jCAttribute_Rule_r4__SynchronizeForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuCAttribute2jCAttribute_Rule_r4__SynchronizeBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuCAttribute2jCAttribute_Rule_r4__RepairForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuCAttribute2jCAttribute_Rule_r4__RepairBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());
	}

} //GeneratedPackageImpl
