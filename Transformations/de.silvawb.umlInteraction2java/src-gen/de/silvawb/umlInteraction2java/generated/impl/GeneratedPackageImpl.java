/**
 */
package de.silvawb.umlInteraction2java.generated.impl;

import de.mdelab.mlsdm.MlsdmPackage;

import de.mdelab.mltgg.mote2.Mote2Package;

import de.mdelab.mltgg.mote2.helpers.HelpersPackage;

import de.mdelab.mltgg.mote2.operationalTGG.OperationalTGGPackage;

import de.mdelab.mltgg.mote2.sdm.SdmPackage;

import de.silvawb.umlInteraction2java.UmlInteraction2javaPackage;

import de.silvawb.umlInteraction2java.generated.GeneratedFactory;
import de.silvawb.umlInteraction2java.generated.GeneratedPackage;
import de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation;
import de.silvawb.umlInteraction2java.generated.uILifeline2jMAnnotation_r2;
import de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation;
import de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2;
import de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_2_r5;
import de.silvawb.umlInteraction2java.generated.uMessageSequence2jInteractionAnnotation_r3;
import de.silvawb.umlInteraction2java.generated.uOperation2jMethod_HelperRule;
import de.silvawb.umlInteraction2java.generated.uOperation2jMethod_HelperRule_r4;
import de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom;
import de.silvawb.umlInteraction2java.generated.umlInteraction2javaAxiom_r1;
import de.silvawb.umlInteraction2java.generated.umlInteraction2javaOperationalTGG;

import de.silvawb.umlInteraction2java.impl.UmlInteraction2javaPackageImpl;

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
	private EClass umlInteraction2javaOperationalTGGEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlInteraction2javaAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uILifeline2jMAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uMessageSequence2jInteractionAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uOperation2jMethod_HelperRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uMessageSequence2jInteractionAnnotation_2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlInteraction2javaAxiom_r1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uOperation2jMethod_HelperRule_r4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uMessageSequence2jInteractionAnnotation_2_r5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uMessageSequence2jInteractionAnnotation_r3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uILifeline2jMAnnotation_r2EClass = null;

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
	 * @see de.silvawb.umlInteraction2java.generated.GeneratedPackage#eNS_URI
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
		UmlInteraction2javaPackageImpl theUmlInteraction2javaPackage = (UmlInteraction2javaPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(UmlInteraction2javaPackage.eNS_URI) instanceof UmlInteraction2javaPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(UmlInteraction2javaPackage.eNS_URI)
						: UmlInteraction2javaPackage.eINSTANCE);

		// Create package meta-data objects
		theGeneratedPackage.createPackageContents();
		theUmlInteraction2javaPackage.createPackageContents();

		// Initialize created meta-data
		theGeneratedPackage.initializePackageContents();
		theUmlInteraction2javaPackage.initializePackageContents();

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
	public EClass getumlInteraction2javaOperationalTGG() {
		return umlInteraction2javaOperationalTGGEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getumlInteraction2javaAxiom() {
		return umlInteraction2javaAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuILifeline2jMAnnotation() {
		return uILifeline2jMAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuMessageSequence2jInteractionAnnotation() {
		return uMessageSequence2jInteractionAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuOperation2jMethod_HelperRule() {
		return uOperation2jMethod_HelperRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuMessageSequence2jInteractionAnnotation_2() {
		return uMessageSequence2jInteractionAnnotation_2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getumlInteraction2javaAxiom_r1() {
		return umlInteraction2javaAxiom_r1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getumlInteraction2javaAxiom_r1_AddElementActivity() {
		return (EReference) umlInteraction2javaAxiom_r1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getumlInteraction2javaAxiom_r1_MoveElementActivity() {
		return (EReference) umlInteraction2javaAxiom_r1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getumlInteraction2javaAxiom_r1_ChangeAttributeActivity() {
		return (EReference) umlInteraction2javaAxiom_r1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getumlInteraction2javaAxiom_r1_TransformForwardActivity() {
		return (EReference) umlInteraction2javaAxiom_r1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getumlInteraction2javaAxiom_r1_TransformMappingActivity() {
		return (EReference) umlInteraction2javaAxiom_r1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getumlInteraction2javaAxiom_r1_TransformBackwardActivity() {
		return (EReference) umlInteraction2javaAxiom_r1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getumlInteraction2javaAxiom_r1_SynchronizeForwardActivity() {
		return (EReference) umlInteraction2javaAxiom_r1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getumlInteraction2javaAxiom_r1_SynchronizeBackwardActivity() {
		return (EReference) umlInteraction2javaAxiom_r1EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getumlInteraction2javaAxiom_r1__AddElement__EMap_EList_EList() {
		return umlInteraction2javaAxiom_r1EClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getumlInteraction2javaAxiom_r1__ChangeAttributeValues__TGGNode_EMap() {
		return umlInteraction2javaAxiom_r1EClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getumlInteraction2javaAxiom_r1__TransformForward__EList_EList_boolean() {
		return umlInteraction2javaAxiom_r1EClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getumlInteraction2javaAxiom_r1__TransformMapping__EList_EList_boolean() {
		return umlInteraction2javaAxiom_r1EClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getumlInteraction2javaAxiom_r1__TransformBackward__EList_EList_boolean() {
		return umlInteraction2javaAxiom_r1EClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getumlInteraction2javaAxiom_r1__SynchronizeForward__EList_EList_TGGNode_boolean() {
		return umlInteraction2javaAxiom_r1EClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getumlInteraction2javaAxiom_r1__SynchronizeBackward__EList_EList_TGGNode_boolean() {
		return umlInteraction2javaAxiom_r1EClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuOperation2jMethod_HelperRule_r4() {
		return uOperation2jMethod_HelperRule_r4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOperation2jMethod_HelperRule_r4_AddElementActivity() {
		return (EReference) uOperation2jMethod_HelperRule_r4EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOperation2jMethod_HelperRule_r4_MoveElementActivity() {
		return (EReference) uOperation2jMethod_HelperRule_r4EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOperation2jMethod_HelperRule_r4_ChangeAttributeActivity() {
		return (EReference) uOperation2jMethod_HelperRule_r4EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOperation2jMethod_HelperRule_r4_TransformForwardActivity() {
		return (EReference) uOperation2jMethod_HelperRule_r4EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOperation2jMethod_HelperRule_r4_TransformMappingActivity() {
		return (EReference) uOperation2jMethod_HelperRule_r4EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOperation2jMethod_HelperRule_r4_TransformBackwardActivity() {
		return (EReference) uOperation2jMethod_HelperRule_r4EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOperation2jMethod_HelperRule_r4_ConflictCheckForwardActivity() {
		return (EReference) uOperation2jMethod_HelperRule_r4EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOperation2jMethod_HelperRule_r4_ConflictCheckMappingActivity() {
		return (EReference) uOperation2jMethod_HelperRule_r4EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOperation2jMethod_HelperRule_r4_ConflictCheckBackwardActivity() {
		return (EReference) uOperation2jMethod_HelperRule_r4EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOperation2jMethod_HelperRule_r4_SynchronizeForwardActivity() {
		return (EReference) uOperation2jMethod_HelperRule_r4EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOperation2jMethod_HelperRule_r4_SynchronizeBackwardActivity() {
		return (EReference) uOperation2jMethod_HelperRule_r4EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOperation2jMethod_HelperRule_r4_RepairForwardActivity() {
		return (EReference) uOperation2jMethod_HelperRule_r4EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOperation2jMethod_HelperRule_r4_RepairBackwardActivity() {
		return (EReference) uOperation2jMethod_HelperRule_r4EClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOperation2jMethod_HelperRule_r4__AddElement__EMap() {
		return uOperation2jMethod_HelperRule_r4EClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOperation2jMethod_HelperRule_r4__ChangeAttributeValues__TGGNode_EMap() {
		return uOperation2jMethod_HelperRule_r4EClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOperation2jMethod_HelperRule_r4__MoveElement__TGGNode_TGGNode_TGGNode() {
		return uOperation2jMethod_HelperRule_r4EClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOperation2jMethod_HelperRule_r4__TransformForward__TGGNode_boolean_boolean() {
		return uOperation2jMethod_HelperRule_r4EClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOperation2jMethod_HelperRule_r4__TransformMapping__TGGNode_boolean_boolean() {
		return uOperation2jMethod_HelperRule_r4EClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOperation2jMethod_HelperRule_r4__TransformBackward__TGGNode_boolean_boolean() {
		return uOperation2jMethod_HelperRule_r4EClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOperation2jMethod_HelperRule_r4__ConflictCheckForward__TGGNode() {
		return uOperation2jMethod_HelperRule_r4EClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOperation2jMethod_HelperRule_r4__ConflictCheckMapping__TGGNode() {
		return uOperation2jMethod_HelperRule_r4EClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOperation2jMethod_HelperRule_r4__ConflictCheckBackward__TGGNode() {
		return uOperation2jMethod_HelperRule_r4EClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOperation2jMethod_HelperRule_r4__SynchronizeForward__TGGNode_boolean() {
		return uOperation2jMethod_HelperRule_r4EClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOperation2jMethod_HelperRule_r4__SynchronizeBackward__TGGNode_boolean() {
		return uOperation2jMethod_HelperRule_r4EClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOperation2jMethod_HelperRule_r4__RepairForward__TGGNode_boolean() {
		return uOperation2jMethod_HelperRule_r4EClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOperation2jMethod_HelperRule_r4__RepairBackward__TGGNode_boolean() {
		return uOperation2jMethod_HelperRule_r4EClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuMessageSequence2jInteractionAnnotation_2_r5() {
		return uMessageSequence2jInteractionAnnotation_2_r5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuMessageSequence2jInteractionAnnotation_2_r5_AddElementActivity() {
		return (EReference) uMessageSequence2jInteractionAnnotation_2_r5EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuMessageSequence2jInteractionAnnotation_2_r5_MoveElementActivity() {
		return (EReference) uMessageSequence2jInteractionAnnotation_2_r5EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuMessageSequence2jInteractionAnnotation_2_r5_ChangeAttributeActivity() {
		return (EReference) uMessageSequence2jInteractionAnnotation_2_r5EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuMessageSequence2jInteractionAnnotation_2_r5_TransformForwardActivity() {
		return (EReference) uMessageSequence2jInteractionAnnotation_2_r5EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuMessageSequence2jInteractionAnnotation_2_r5_TransformMappingActivity() {
		return (EReference) uMessageSequence2jInteractionAnnotation_2_r5EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuMessageSequence2jInteractionAnnotation_2_r5_TransformBackwardActivity() {
		return (EReference) uMessageSequence2jInteractionAnnotation_2_r5EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuMessageSequence2jInteractionAnnotation_2_r5_ConflictCheckForwardActivity() {
		return (EReference) uMessageSequence2jInteractionAnnotation_2_r5EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuMessageSequence2jInteractionAnnotation_2_r5_ConflictCheckMappingActivity() {
		return (EReference) uMessageSequence2jInteractionAnnotation_2_r5EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuMessageSequence2jInteractionAnnotation_2_r5_ConflictCheckBackwardActivity() {
		return (EReference) uMessageSequence2jInteractionAnnotation_2_r5EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuMessageSequence2jInteractionAnnotation_2_r5_SynchronizeForwardActivity() {
		return (EReference) uMessageSequence2jInteractionAnnotation_2_r5EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuMessageSequence2jInteractionAnnotation_2_r5_SynchronizeBackwardActivity() {
		return (EReference) uMessageSequence2jInteractionAnnotation_2_r5EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuMessageSequence2jInteractionAnnotation_2_r5_RepairForwardActivity() {
		return (EReference) uMessageSequence2jInteractionAnnotation_2_r5EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuMessageSequence2jInteractionAnnotation_2_r5_RepairBackwardActivity() {
		return (EReference) uMessageSequence2jInteractionAnnotation_2_r5EClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuMessageSequence2jInteractionAnnotation_2_r5__AddElement__EMap() {
		return uMessageSequence2jInteractionAnnotation_2_r5EClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuMessageSequence2jInteractionAnnotation_2_r5__ChangeAttributeValues__TGGNode_EMap() {
		return uMessageSequence2jInteractionAnnotation_2_r5EClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuMessageSequence2jInteractionAnnotation_2_r5__MoveElement__TGGNode_TGGNode_TGGNode() {
		return uMessageSequence2jInteractionAnnotation_2_r5EClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuMessageSequence2jInteractionAnnotation_2_r5__TransformForward__TGGNode_boolean_boolean() {
		return uMessageSequence2jInteractionAnnotation_2_r5EClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuMessageSequence2jInteractionAnnotation_2_r5__TransformMapping__TGGNode_boolean_boolean() {
		return uMessageSequence2jInteractionAnnotation_2_r5EClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuMessageSequence2jInteractionAnnotation_2_r5__TransformBackward__TGGNode_boolean_boolean() {
		return uMessageSequence2jInteractionAnnotation_2_r5EClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuMessageSequence2jInteractionAnnotation_2_r5__ConflictCheckForward__TGGNode() {
		return uMessageSequence2jInteractionAnnotation_2_r5EClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuMessageSequence2jInteractionAnnotation_2_r5__ConflictCheckMapping__TGGNode() {
		return uMessageSequence2jInteractionAnnotation_2_r5EClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuMessageSequence2jInteractionAnnotation_2_r5__ConflictCheckBackward__TGGNode() {
		return uMessageSequence2jInteractionAnnotation_2_r5EClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuMessageSequence2jInteractionAnnotation_2_r5__SynchronizeForward__TGGNode_boolean() {
		return uMessageSequence2jInteractionAnnotation_2_r5EClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuMessageSequence2jInteractionAnnotation_2_r5__SynchronizeBackward__TGGNode_boolean() {
		return uMessageSequence2jInteractionAnnotation_2_r5EClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuMessageSequence2jInteractionAnnotation_2_r5__RepairForward__TGGNode_boolean() {
		return uMessageSequence2jInteractionAnnotation_2_r5EClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuMessageSequence2jInteractionAnnotation_2_r5__RepairBackward__TGGNode_boolean() {
		return uMessageSequence2jInteractionAnnotation_2_r5EClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuMessageSequence2jInteractionAnnotation_r3() {
		return uMessageSequence2jInteractionAnnotation_r3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuMessageSequence2jInteractionAnnotation_r3_AddElementActivity() {
		return (EReference) uMessageSequence2jInteractionAnnotation_r3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuMessageSequence2jInteractionAnnotation_r3_MoveElementActivity() {
		return (EReference) uMessageSequence2jInteractionAnnotation_r3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuMessageSequence2jInteractionAnnotation_r3_ChangeAttributeActivity() {
		return (EReference) uMessageSequence2jInteractionAnnotation_r3EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuMessageSequence2jInteractionAnnotation_r3_TransformForwardActivity() {
		return (EReference) uMessageSequence2jInteractionAnnotation_r3EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuMessageSequence2jInteractionAnnotation_r3_TransformMappingActivity() {
		return (EReference) uMessageSequence2jInteractionAnnotation_r3EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuMessageSequence2jInteractionAnnotation_r3_TransformBackwardActivity() {
		return (EReference) uMessageSequence2jInteractionAnnotation_r3EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuMessageSequence2jInteractionAnnotation_r3_ConflictCheckForwardActivity() {
		return (EReference) uMessageSequence2jInteractionAnnotation_r3EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuMessageSequence2jInteractionAnnotation_r3_ConflictCheckMappingActivity() {
		return (EReference) uMessageSequence2jInteractionAnnotation_r3EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuMessageSequence2jInteractionAnnotation_r3_ConflictCheckBackwardActivity() {
		return (EReference) uMessageSequence2jInteractionAnnotation_r3EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuMessageSequence2jInteractionAnnotation_r3_SynchronizeForwardActivity() {
		return (EReference) uMessageSequence2jInteractionAnnotation_r3EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuMessageSequence2jInteractionAnnotation_r3_SynchronizeBackwardActivity() {
		return (EReference) uMessageSequence2jInteractionAnnotation_r3EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuMessageSequence2jInteractionAnnotation_r3_RepairForwardActivity() {
		return (EReference) uMessageSequence2jInteractionAnnotation_r3EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuMessageSequence2jInteractionAnnotation_r3_RepairBackwardActivity() {
		return (EReference) uMessageSequence2jInteractionAnnotation_r3EClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuMessageSequence2jInteractionAnnotation_r3__AddElement__EMap() {
		return uMessageSequence2jInteractionAnnotation_r3EClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuMessageSequence2jInteractionAnnotation_r3__ChangeAttributeValues__TGGNode_EMap() {
		return uMessageSequence2jInteractionAnnotation_r3EClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuMessageSequence2jInteractionAnnotation_r3__MoveElement__TGGNode_TGGNode_TGGNode() {
		return uMessageSequence2jInteractionAnnotation_r3EClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuMessageSequence2jInteractionAnnotation_r3__TransformForward__TGGNode_boolean_boolean() {
		return uMessageSequence2jInteractionAnnotation_r3EClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuMessageSequence2jInteractionAnnotation_r3__TransformMapping__TGGNode_boolean_boolean() {
		return uMessageSequence2jInteractionAnnotation_r3EClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuMessageSequence2jInteractionAnnotation_r3__TransformBackward__TGGNode_boolean_boolean() {
		return uMessageSequence2jInteractionAnnotation_r3EClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuMessageSequence2jInteractionAnnotation_r3__ConflictCheckForward__TGGNode() {
		return uMessageSequence2jInteractionAnnotation_r3EClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuMessageSequence2jInteractionAnnotation_r3__ConflictCheckMapping__TGGNode() {
		return uMessageSequence2jInteractionAnnotation_r3EClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuMessageSequence2jInteractionAnnotation_r3__ConflictCheckBackward__TGGNode() {
		return uMessageSequence2jInteractionAnnotation_r3EClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuMessageSequence2jInteractionAnnotation_r3__SynchronizeForward__TGGNode_boolean() {
		return uMessageSequence2jInteractionAnnotation_r3EClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuMessageSequence2jInteractionAnnotation_r3__SynchronizeBackward__TGGNode_boolean() {
		return uMessageSequence2jInteractionAnnotation_r3EClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuMessageSequence2jInteractionAnnotation_r3__RepairForward__TGGNode_boolean() {
		return uMessageSequence2jInteractionAnnotation_r3EClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuMessageSequence2jInteractionAnnotation_r3__RepairBackward__TGGNode_boolean() {
		return uMessageSequence2jInteractionAnnotation_r3EClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuILifeline2jMAnnotation_r2() {
		return uILifeline2jMAnnotation_r2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuILifeline2jMAnnotation_r2_AddElementActivity() {
		return (EReference) uILifeline2jMAnnotation_r2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuILifeline2jMAnnotation_r2_MoveElementActivity() {
		return (EReference) uILifeline2jMAnnotation_r2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuILifeline2jMAnnotation_r2_ChangeAttributeActivity() {
		return (EReference) uILifeline2jMAnnotation_r2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuILifeline2jMAnnotation_r2_TransformForwardActivity() {
		return (EReference) uILifeline2jMAnnotation_r2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuILifeline2jMAnnotation_r2_TransformMappingActivity() {
		return (EReference) uILifeline2jMAnnotation_r2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuILifeline2jMAnnotation_r2_TransformBackwardActivity() {
		return (EReference) uILifeline2jMAnnotation_r2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuILifeline2jMAnnotation_r2_ConflictCheckForwardActivity() {
		return (EReference) uILifeline2jMAnnotation_r2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuILifeline2jMAnnotation_r2_ConflictCheckMappingActivity() {
		return (EReference) uILifeline2jMAnnotation_r2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuILifeline2jMAnnotation_r2_ConflictCheckBackwardActivity() {
		return (EReference) uILifeline2jMAnnotation_r2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuILifeline2jMAnnotation_r2_SynchronizeForwardActivity() {
		return (EReference) uILifeline2jMAnnotation_r2EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuILifeline2jMAnnotation_r2_SynchronizeBackwardActivity() {
		return (EReference) uILifeline2jMAnnotation_r2EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuILifeline2jMAnnotation_r2_RepairForwardActivity() {
		return (EReference) uILifeline2jMAnnotation_r2EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuILifeline2jMAnnotation_r2_RepairBackwardActivity() {
		return (EReference) uILifeline2jMAnnotation_r2EClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuILifeline2jMAnnotation_r2__AddElement__EMap() {
		return uILifeline2jMAnnotation_r2EClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuILifeline2jMAnnotation_r2__ChangeAttributeValues__TGGNode_EMap() {
		return uILifeline2jMAnnotation_r2EClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuILifeline2jMAnnotation_r2__MoveElement__TGGNode_TGGNode_TGGNode() {
		return uILifeline2jMAnnotation_r2EClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuILifeline2jMAnnotation_r2__TransformForward__TGGNode_boolean_boolean() {
		return uILifeline2jMAnnotation_r2EClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuILifeline2jMAnnotation_r2__TransformMapping__TGGNode_boolean_boolean() {
		return uILifeline2jMAnnotation_r2EClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuILifeline2jMAnnotation_r2__TransformBackward__TGGNode_boolean_boolean() {
		return uILifeline2jMAnnotation_r2EClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuILifeline2jMAnnotation_r2__ConflictCheckForward__TGGNode() {
		return uILifeline2jMAnnotation_r2EClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuILifeline2jMAnnotation_r2__ConflictCheckMapping__TGGNode() {
		return uILifeline2jMAnnotation_r2EClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuILifeline2jMAnnotation_r2__ConflictCheckBackward__TGGNode() {
		return uILifeline2jMAnnotation_r2EClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuILifeline2jMAnnotation_r2__SynchronizeForward__TGGNode_boolean() {
		return uILifeline2jMAnnotation_r2EClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuILifeline2jMAnnotation_r2__SynchronizeBackward__TGGNode_boolean() {
		return uILifeline2jMAnnotation_r2EClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuILifeline2jMAnnotation_r2__RepairForward__TGGNode_boolean() {
		return uILifeline2jMAnnotation_r2EClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuILifeline2jMAnnotation_r2__RepairBackward__TGGNode_boolean() {
		return uILifeline2jMAnnotation_r2EClass.getEOperations().get(12);
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
		umlInteraction2javaOperationalTGGEClass = createEClass(UML_INTERACTION2JAVA_OPERATIONAL_TGG);

		umlInteraction2javaAxiomEClass = createEClass(UML_INTERACTION2JAVA_AXIOM);

		uILifeline2jMAnnotationEClass = createEClass(UI_LIFELINE2J_MANNOTATION);

		uMessageSequence2jInteractionAnnotationEClass = createEClass(UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION);

		uOperation2jMethod_HelperRuleEClass = createEClass(UOPERATION2J_METHOD_HELPER_RULE);

		uMessageSequence2jInteractionAnnotation_2EClass = createEClass(UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2);

		umlInteraction2javaAxiom_r1EClass = createEClass(UML_INTERACTION2JAVA_AXIOM_R1);
		createEReference(umlInteraction2javaAxiom_r1EClass, UML_INTERACTION2JAVA_AXIOM_R1__ADD_ELEMENT_ACTIVITY);
		createEReference(umlInteraction2javaAxiom_r1EClass, UML_INTERACTION2JAVA_AXIOM_R1__MOVE_ELEMENT_ACTIVITY);
		createEReference(umlInteraction2javaAxiom_r1EClass, UML_INTERACTION2JAVA_AXIOM_R1__CHANGE_ATTRIBUTE_ACTIVITY);
		createEReference(umlInteraction2javaAxiom_r1EClass, UML_INTERACTION2JAVA_AXIOM_R1__TRANSFORM_FORWARD_ACTIVITY);
		createEReference(umlInteraction2javaAxiom_r1EClass, UML_INTERACTION2JAVA_AXIOM_R1__TRANSFORM_MAPPING_ACTIVITY);
		createEReference(umlInteraction2javaAxiom_r1EClass, UML_INTERACTION2JAVA_AXIOM_R1__TRANSFORM_BACKWARD_ACTIVITY);
		createEReference(umlInteraction2javaAxiom_r1EClass,
				UML_INTERACTION2JAVA_AXIOM_R1__SYNCHRONIZE_FORWARD_ACTIVITY);
		createEReference(umlInteraction2javaAxiom_r1EClass,
				UML_INTERACTION2JAVA_AXIOM_R1__SYNCHRONIZE_BACKWARD_ACTIVITY);
		createEOperation(umlInteraction2javaAxiom_r1EClass,
				UML_INTERACTION2JAVA_AXIOM_R1___ADD_ELEMENT__EMAP_ELIST_ELIST);
		createEOperation(umlInteraction2javaAxiom_r1EClass,
				UML_INTERACTION2JAVA_AXIOM_R1___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP);
		createEOperation(umlInteraction2javaAxiom_r1EClass,
				UML_INTERACTION2JAVA_AXIOM_R1___TRANSFORM_FORWARD__ELIST_ELIST_BOOLEAN);
		createEOperation(umlInteraction2javaAxiom_r1EClass,
				UML_INTERACTION2JAVA_AXIOM_R1___TRANSFORM_MAPPING__ELIST_ELIST_BOOLEAN);
		createEOperation(umlInteraction2javaAxiom_r1EClass,
				UML_INTERACTION2JAVA_AXIOM_R1___TRANSFORM_BACKWARD__ELIST_ELIST_BOOLEAN);
		createEOperation(umlInteraction2javaAxiom_r1EClass,
				UML_INTERACTION2JAVA_AXIOM_R1___SYNCHRONIZE_FORWARD__ELIST_ELIST_TGGNODE_BOOLEAN);
		createEOperation(umlInteraction2javaAxiom_r1EClass,
				UML_INTERACTION2JAVA_AXIOM_R1___SYNCHRONIZE_BACKWARD__ELIST_ELIST_TGGNODE_BOOLEAN);

		uOperation2jMethod_HelperRule_r4EClass = createEClass(UOPERATION2J_METHOD_HELPER_RULE_R4);
		createEReference(uOperation2jMethod_HelperRule_r4EClass,
				UOPERATION2J_METHOD_HELPER_RULE_R4__ADD_ELEMENT_ACTIVITY);
		createEReference(uOperation2jMethod_HelperRule_r4EClass,
				UOPERATION2J_METHOD_HELPER_RULE_R4__MOVE_ELEMENT_ACTIVITY);
		createEReference(uOperation2jMethod_HelperRule_r4EClass,
				UOPERATION2J_METHOD_HELPER_RULE_R4__CHANGE_ATTRIBUTE_ACTIVITY);
		createEReference(uOperation2jMethod_HelperRule_r4EClass,
				UOPERATION2J_METHOD_HELPER_RULE_R4__TRANSFORM_FORWARD_ACTIVITY);
		createEReference(uOperation2jMethod_HelperRule_r4EClass,
				UOPERATION2J_METHOD_HELPER_RULE_R4__TRANSFORM_MAPPING_ACTIVITY);
		createEReference(uOperation2jMethod_HelperRule_r4EClass,
				UOPERATION2J_METHOD_HELPER_RULE_R4__TRANSFORM_BACKWARD_ACTIVITY);
		createEReference(uOperation2jMethod_HelperRule_r4EClass,
				UOPERATION2J_METHOD_HELPER_RULE_R4__CONFLICT_CHECK_FORWARD_ACTIVITY);
		createEReference(uOperation2jMethod_HelperRule_r4EClass,
				UOPERATION2J_METHOD_HELPER_RULE_R4__CONFLICT_CHECK_MAPPING_ACTIVITY);
		createEReference(uOperation2jMethod_HelperRule_r4EClass,
				UOPERATION2J_METHOD_HELPER_RULE_R4__CONFLICT_CHECK_BACKWARD_ACTIVITY);
		createEReference(uOperation2jMethod_HelperRule_r4EClass,
				UOPERATION2J_METHOD_HELPER_RULE_R4__SYNCHRONIZE_FORWARD_ACTIVITY);
		createEReference(uOperation2jMethod_HelperRule_r4EClass,
				UOPERATION2J_METHOD_HELPER_RULE_R4__SYNCHRONIZE_BACKWARD_ACTIVITY);
		createEReference(uOperation2jMethod_HelperRule_r4EClass,
				UOPERATION2J_METHOD_HELPER_RULE_R4__REPAIR_FORWARD_ACTIVITY);
		createEReference(uOperation2jMethod_HelperRule_r4EClass,
				UOPERATION2J_METHOD_HELPER_RULE_R4__REPAIR_BACKWARD_ACTIVITY);
		createEOperation(uOperation2jMethod_HelperRule_r4EClass,
				UOPERATION2J_METHOD_HELPER_RULE_R4___ADD_ELEMENT__EMAP);
		createEOperation(uOperation2jMethod_HelperRule_r4EClass,
				UOPERATION2J_METHOD_HELPER_RULE_R4___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP);
		createEOperation(uOperation2jMethod_HelperRule_r4EClass,
				UOPERATION2J_METHOD_HELPER_RULE_R4___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE);
		createEOperation(uOperation2jMethod_HelperRule_r4EClass,
				UOPERATION2J_METHOD_HELPER_RULE_R4___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(uOperation2jMethod_HelperRule_r4EClass,
				UOPERATION2J_METHOD_HELPER_RULE_R4___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(uOperation2jMethod_HelperRule_r4EClass,
				UOPERATION2J_METHOD_HELPER_RULE_R4___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(uOperation2jMethod_HelperRule_r4EClass,
				UOPERATION2J_METHOD_HELPER_RULE_R4___CONFLICT_CHECK_FORWARD__TGGNODE);
		createEOperation(uOperation2jMethod_HelperRule_r4EClass,
				UOPERATION2J_METHOD_HELPER_RULE_R4___CONFLICT_CHECK_MAPPING__TGGNODE);
		createEOperation(uOperation2jMethod_HelperRule_r4EClass,
				UOPERATION2J_METHOD_HELPER_RULE_R4___CONFLICT_CHECK_BACKWARD__TGGNODE);
		createEOperation(uOperation2jMethod_HelperRule_r4EClass,
				UOPERATION2J_METHOD_HELPER_RULE_R4___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(uOperation2jMethod_HelperRule_r4EClass,
				UOPERATION2J_METHOD_HELPER_RULE_R4___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN);
		createEOperation(uOperation2jMethod_HelperRule_r4EClass,
				UOPERATION2J_METHOD_HELPER_RULE_R4___REPAIR_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(uOperation2jMethod_HelperRule_r4EClass,
				UOPERATION2J_METHOD_HELPER_RULE_R4___REPAIR_BACKWARD__TGGNODE_BOOLEAN);

		uMessageSequence2jInteractionAnnotation_2_r5EClass = createEClass(
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5);
		createEReference(uMessageSequence2jInteractionAnnotation_2_r5EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__ADD_ELEMENT_ACTIVITY);
		createEReference(uMessageSequence2jInteractionAnnotation_2_r5EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__MOVE_ELEMENT_ACTIVITY);
		createEReference(uMessageSequence2jInteractionAnnotation_2_r5EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__CHANGE_ATTRIBUTE_ACTIVITY);
		createEReference(uMessageSequence2jInteractionAnnotation_2_r5EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__TRANSFORM_FORWARD_ACTIVITY);
		createEReference(uMessageSequence2jInteractionAnnotation_2_r5EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__TRANSFORM_MAPPING_ACTIVITY);
		createEReference(uMessageSequence2jInteractionAnnotation_2_r5EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__TRANSFORM_BACKWARD_ACTIVITY);
		createEReference(uMessageSequence2jInteractionAnnotation_2_r5EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__CONFLICT_CHECK_FORWARD_ACTIVITY);
		createEReference(uMessageSequence2jInteractionAnnotation_2_r5EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__CONFLICT_CHECK_MAPPING_ACTIVITY);
		createEReference(uMessageSequence2jInteractionAnnotation_2_r5EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__CONFLICT_CHECK_BACKWARD_ACTIVITY);
		createEReference(uMessageSequence2jInteractionAnnotation_2_r5EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__SYNCHRONIZE_FORWARD_ACTIVITY);
		createEReference(uMessageSequence2jInteractionAnnotation_2_r5EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__SYNCHRONIZE_BACKWARD_ACTIVITY);
		createEReference(uMessageSequence2jInteractionAnnotation_2_r5EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__REPAIR_FORWARD_ACTIVITY);
		createEReference(uMessageSequence2jInteractionAnnotation_2_r5EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5__REPAIR_BACKWARD_ACTIVITY);
		createEOperation(uMessageSequence2jInteractionAnnotation_2_r5EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___ADD_ELEMENT__EMAP);
		createEOperation(uMessageSequence2jInteractionAnnotation_2_r5EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP);
		createEOperation(uMessageSequence2jInteractionAnnotation_2_r5EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE);
		createEOperation(uMessageSequence2jInteractionAnnotation_2_r5EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(uMessageSequence2jInteractionAnnotation_2_r5EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(uMessageSequence2jInteractionAnnotation_2_r5EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(uMessageSequence2jInteractionAnnotation_2_r5EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___CONFLICT_CHECK_FORWARD__TGGNODE);
		createEOperation(uMessageSequence2jInteractionAnnotation_2_r5EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___CONFLICT_CHECK_MAPPING__TGGNODE);
		createEOperation(uMessageSequence2jInteractionAnnotation_2_r5EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___CONFLICT_CHECK_BACKWARD__TGGNODE);
		createEOperation(uMessageSequence2jInteractionAnnotation_2_r5EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(uMessageSequence2jInteractionAnnotation_2_r5EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN);
		createEOperation(uMessageSequence2jInteractionAnnotation_2_r5EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___REPAIR_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(uMessageSequence2jInteractionAnnotation_2_r5EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5___REPAIR_BACKWARD__TGGNODE_BOOLEAN);

		uMessageSequence2jInteractionAnnotation_r3EClass = createEClass(UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3);
		createEReference(uMessageSequence2jInteractionAnnotation_r3EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__ADD_ELEMENT_ACTIVITY);
		createEReference(uMessageSequence2jInteractionAnnotation_r3EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__MOVE_ELEMENT_ACTIVITY);
		createEReference(uMessageSequence2jInteractionAnnotation_r3EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__CHANGE_ATTRIBUTE_ACTIVITY);
		createEReference(uMessageSequence2jInteractionAnnotation_r3EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__TRANSFORM_FORWARD_ACTIVITY);
		createEReference(uMessageSequence2jInteractionAnnotation_r3EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__TRANSFORM_MAPPING_ACTIVITY);
		createEReference(uMessageSequence2jInteractionAnnotation_r3EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__TRANSFORM_BACKWARD_ACTIVITY);
		createEReference(uMessageSequence2jInteractionAnnotation_r3EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__CONFLICT_CHECK_FORWARD_ACTIVITY);
		createEReference(uMessageSequence2jInteractionAnnotation_r3EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__CONFLICT_CHECK_MAPPING_ACTIVITY);
		createEReference(uMessageSequence2jInteractionAnnotation_r3EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__CONFLICT_CHECK_BACKWARD_ACTIVITY);
		createEReference(uMessageSequence2jInteractionAnnotation_r3EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__SYNCHRONIZE_FORWARD_ACTIVITY);
		createEReference(uMessageSequence2jInteractionAnnotation_r3EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__SYNCHRONIZE_BACKWARD_ACTIVITY);
		createEReference(uMessageSequence2jInteractionAnnotation_r3EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__REPAIR_FORWARD_ACTIVITY);
		createEReference(uMessageSequence2jInteractionAnnotation_r3EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3__REPAIR_BACKWARD_ACTIVITY);
		createEOperation(uMessageSequence2jInteractionAnnotation_r3EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___ADD_ELEMENT__EMAP);
		createEOperation(uMessageSequence2jInteractionAnnotation_r3EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP);
		createEOperation(uMessageSequence2jInteractionAnnotation_r3EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE);
		createEOperation(uMessageSequence2jInteractionAnnotation_r3EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(uMessageSequence2jInteractionAnnotation_r3EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(uMessageSequence2jInteractionAnnotation_r3EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(uMessageSequence2jInteractionAnnotation_r3EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___CONFLICT_CHECK_FORWARD__TGGNODE);
		createEOperation(uMessageSequence2jInteractionAnnotation_r3EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___CONFLICT_CHECK_MAPPING__TGGNODE);
		createEOperation(uMessageSequence2jInteractionAnnotation_r3EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___CONFLICT_CHECK_BACKWARD__TGGNODE);
		createEOperation(uMessageSequence2jInteractionAnnotation_r3EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(uMessageSequence2jInteractionAnnotation_r3EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN);
		createEOperation(uMessageSequence2jInteractionAnnotation_r3EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___REPAIR_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(uMessageSequence2jInteractionAnnotation_r3EClass,
				UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3___REPAIR_BACKWARD__TGGNODE_BOOLEAN);

		uILifeline2jMAnnotation_r2EClass = createEClass(UI_LIFELINE2J_MANNOTATION_R2);
		createEReference(uILifeline2jMAnnotation_r2EClass, UI_LIFELINE2J_MANNOTATION_R2__ADD_ELEMENT_ACTIVITY);
		createEReference(uILifeline2jMAnnotation_r2EClass, UI_LIFELINE2J_MANNOTATION_R2__MOVE_ELEMENT_ACTIVITY);
		createEReference(uILifeline2jMAnnotation_r2EClass, UI_LIFELINE2J_MANNOTATION_R2__CHANGE_ATTRIBUTE_ACTIVITY);
		createEReference(uILifeline2jMAnnotation_r2EClass, UI_LIFELINE2J_MANNOTATION_R2__TRANSFORM_FORWARD_ACTIVITY);
		createEReference(uILifeline2jMAnnotation_r2EClass, UI_LIFELINE2J_MANNOTATION_R2__TRANSFORM_MAPPING_ACTIVITY);
		createEReference(uILifeline2jMAnnotation_r2EClass, UI_LIFELINE2J_MANNOTATION_R2__TRANSFORM_BACKWARD_ACTIVITY);
		createEReference(uILifeline2jMAnnotation_r2EClass,
				UI_LIFELINE2J_MANNOTATION_R2__CONFLICT_CHECK_FORWARD_ACTIVITY);
		createEReference(uILifeline2jMAnnotation_r2EClass,
				UI_LIFELINE2J_MANNOTATION_R2__CONFLICT_CHECK_MAPPING_ACTIVITY);
		createEReference(uILifeline2jMAnnotation_r2EClass,
				UI_LIFELINE2J_MANNOTATION_R2__CONFLICT_CHECK_BACKWARD_ACTIVITY);
		createEReference(uILifeline2jMAnnotation_r2EClass, UI_LIFELINE2J_MANNOTATION_R2__SYNCHRONIZE_FORWARD_ACTIVITY);
		createEReference(uILifeline2jMAnnotation_r2EClass, UI_LIFELINE2J_MANNOTATION_R2__SYNCHRONIZE_BACKWARD_ACTIVITY);
		createEReference(uILifeline2jMAnnotation_r2EClass, UI_LIFELINE2J_MANNOTATION_R2__REPAIR_FORWARD_ACTIVITY);
		createEReference(uILifeline2jMAnnotation_r2EClass, UI_LIFELINE2J_MANNOTATION_R2__REPAIR_BACKWARD_ACTIVITY);
		createEOperation(uILifeline2jMAnnotation_r2EClass, UI_LIFELINE2J_MANNOTATION_R2___ADD_ELEMENT__EMAP);
		createEOperation(uILifeline2jMAnnotation_r2EClass,
				UI_LIFELINE2J_MANNOTATION_R2___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP);
		createEOperation(uILifeline2jMAnnotation_r2EClass,
				UI_LIFELINE2J_MANNOTATION_R2___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE);
		createEOperation(uILifeline2jMAnnotation_r2EClass,
				UI_LIFELINE2J_MANNOTATION_R2___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(uILifeline2jMAnnotation_r2EClass,
				UI_LIFELINE2J_MANNOTATION_R2___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(uILifeline2jMAnnotation_r2EClass,
				UI_LIFELINE2J_MANNOTATION_R2___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(uILifeline2jMAnnotation_r2EClass,
				UI_LIFELINE2J_MANNOTATION_R2___CONFLICT_CHECK_FORWARD__TGGNODE);
		createEOperation(uILifeline2jMAnnotation_r2EClass,
				UI_LIFELINE2J_MANNOTATION_R2___CONFLICT_CHECK_MAPPING__TGGNODE);
		createEOperation(uILifeline2jMAnnotation_r2EClass,
				UI_LIFELINE2J_MANNOTATION_R2___CONFLICT_CHECK_BACKWARD__TGGNODE);
		createEOperation(uILifeline2jMAnnotation_r2EClass,
				UI_LIFELINE2J_MANNOTATION_R2___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(uILifeline2jMAnnotation_r2EClass,
				UI_LIFELINE2J_MANNOTATION_R2___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN);
		createEOperation(uILifeline2jMAnnotation_r2EClass,
				UI_LIFELINE2J_MANNOTATION_R2___REPAIR_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(uILifeline2jMAnnotation_r2EClass,
				UI_LIFELINE2J_MANNOTATION_R2___REPAIR_BACKWARD__TGGNODE_BOOLEAN);
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
		umlInteraction2javaOperationalTGGEClass.getESuperTypes().add(theSdmPackage.getSdmOperationalTGG());
		umlInteraction2javaAxiomEClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalAxiomGroup());
		uILifeline2jMAnnotationEClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalRuleGroup());
		uMessageSequence2jInteractionAnnotationEClass.getESuperTypes()
				.add(theOperationalTGGPackage.getOperationalRuleGroup());
		uOperation2jMethod_HelperRuleEClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalRuleGroup());
		uMessageSequence2jInteractionAnnotation_2EClass.getESuperTypes()
				.add(theOperationalTGGPackage.getOperationalRuleGroup());
		umlInteraction2javaAxiom_r1EClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalAxiom());
		uOperation2jMethod_HelperRule_r4EClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalRule());
		uMessageSequence2jInteractionAnnotation_2_r5EClass.getESuperTypes()
				.add(theOperationalTGGPackage.getOperationalRule());
		uMessageSequence2jInteractionAnnotation_r3EClass.getESuperTypes()
				.add(theOperationalTGGPackage.getOperationalRule());
		uILifeline2jMAnnotation_r2EClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalRule());

		// Initialize classes, features, and operations; add parameters
		initEClass(umlInteraction2javaOperationalTGGEClass, umlInteraction2javaOperationalTGG.class,
				"umlInteraction2javaOperationalTGG", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(umlInteraction2javaAxiomEClass, umlInteraction2javaAxiom.class, "umlInteraction2javaAxiom",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uILifeline2jMAnnotationEClass, uILifeline2jMAnnotation.class, "uILifeline2jMAnnotation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uMessageSequence2jInteractionAnnotationEClass, uMessageSequence2jInteractionAnnotation.class,
				"uMessageSequence2jInteractionAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uOperation2jMethod_HelperRuleEClass, uOperation2jMethod_HelperRule.class,
				"uOperation2jMethod_HelperRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uMessageSequence2jInteractionAnnotation_2EClass, uMessageSequence2jInteractionAnnotation_2.class,
				"uMessageSequence2jInteractionAnnotation_2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(umlInteraction2javaAxiom_r1EClass, umlInteraction2javaAxiom_r1.class, "umlInteraction2javaAxiom_r1",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getumlInteraction2javaAxiom_r1_AddElementActivity(), theMlsdmPackage.getActivity(), null,
				"addElementActivity", null, 1, 1, umlInteraction2javaAxiom_r1.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getumlInteraction2javaAxiom_r1_MoveElementActivity(), theMlsdmPackage.getActivity(), null,
				"moveElementActivity", null, 1, 1, umlInteraction2javaAxiom_r1.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getumlInteraction2javaAxiom_r1_ChangeAttributeActivity(), theMlsdmPackage.getActivity(), null,
				"changeAttributeActivity", null, 1, 1, umlInteraction2javaAxiom_r1.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getumlInteraction2javaAxiom_r1_TransformForwardActivity(), theMlsdmPackage.getActivity(), null,
				"transformForwardActivity", null, 1, 1, umlInteraction2javaAxiom_r1.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getumlInteraction2javaAxiom_r1_TransformMappingActivity(), theMlsdmPackage.getActivity(), null,
				"transformMappingActivity", null, 1, 1, umlInteraction2javaAxiom_r1.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getumlInteraction2javaAxiom_r1_TransformBackwardActivity(), theMlsdmPackage.getActivity(), null,
				"transformBackwardActivity", null, 1, 1, umlInteraction2javaAxiom_r1.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getumlInteraction2javaAxiom_r1_SynchronizeForwardActivity(), theMlsdmPackage.getActivity(), null,
				"synchronizeForwardActivity", null, 1, 1, umlInteraction2javaAxiom_r1.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getumlInteraction2javaAxiom_r1_SynchronizeBackwardActivity(), theMlsdmPackage.getActivity(),
				null, "synchronizeBackwardActivity", null, 1, 1, umlInteraction2javaAxiom_r1.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		EOperation op = initEOperation(getumlInteraction2javaAxiom_r1__AddElement__EMap_EList_EList(),
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

		op = initEOperation(getumlInteraction2javaAxiom_r1__ChangeAttributeValues__TGGNode_EMap(),
				ecorePackage.getEBoolean(), "changeAttributeValues", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "ruleParameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getumlInteraction2javaAxiom_r1__TransformForward__EList_EList_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getumlInteraction2javaAxiom_r1__TransformMapping__EList_EList_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformMapping", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getumlInteraction2javaAxiom_r1__TransformBackward__EList_EList_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getumlInteraction2javaAxiom_r1__SynchronizeForward__EList_EList_TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getumlInteraction2javaAxiom_r1__SynchronizeBackward__EList_EList_TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		initEClass(uOperation2jMethod_HelperRule_r4EClass, uOperation2jMethod_HelperRule_r4.class,
				"uOperation2jMethod_HelperRule_r4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getuOperation2jMethod_HelperRule_r4_AddElementActivity(), theMlsdmPackage.getActivity(), null,
				"addElementActivity", null, 1, 1, uOperation2jMethod_HelperRule_r4.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuOperation2jMethod_HelperRule_r4_MoveElementActivity(), theMlsdmPackage.getActivity(), null,
				"moveElementActivity", null, 1, 1, uOperation2jMethod_HelperRule_r4.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuOperation2jMethod_HelperRule_r4_ChangeAttributeActivity(), theMlsdmPackage.getActivity(),
				null, "changeAttributeActivity", null, 1, 1, uOperation2jMethod_HelperRule_r4.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuOperation2jMethod_HelperRule_r4_TransformForwardActivity(), theMlsdmPackage.getActivity(),
				null, "transformForwardActivity", null, 1, 1, uOperation2jMethod_HelperRule_r4.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuOperation2jMethod_HelperRule_r4_TransformMappingActivity(), theMlsdmPackage.getActivity(),
				null, "transformMappingActivity", null, 1, 1, uOperation2jMethod_HelperRule_r4.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuOperation2jMethod_HelperRule_r4_TransformBackwardActivity(), theMlsdmPackage.getActivity(),
				null, "transformBackwardActivity", null, 1, 1, uOperation2jMethod_HelperRule_r4.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuOperation2jMethod_HelperRule_r4_ConflictCheckForwardActivity(),
				theMlsdmPackage.getActivity(), null, "conflictCheckForwardActivity", null, 1, 1,
				uOperation2jMethod_HelperRule_r4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuOperation2jMethod_HelperRule_r4_ConflictCheckMappingActivity(),
				theMlsdmPackage.getActivity(), null, "conflictCheckMappingActivity", null, 1, 1,
				uOperation2jMethod_HelperRule_r4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuOperation2jMethod_HelperRule_r4_ConflictCheckBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "conflictCheckBackwardActivity", null, 1, 1,
				uOperation2jMethod_HelperRule_r4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuOperation2jMethod_HelperRule_r4_SynchronizeForwardActivity(), theMlsdmPackage.getActivity(),
				null, "synchronizeForwardActivity", null, 1, 1, uOperation2jMethod_HelperRule_r4.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuOperation2jMethod_HelperRule_r4_SynchronizeBackwardActivity(), theMlsdmPackage.getActivity(),
				null, "synchronizeBackwardActivity", null, 1, 1, uOperation2jMethod_HelperRule_r4.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuOperation2jMethod_HelperRule_r4_RepairForwardActivity(), theMlsdmPackage.getActivity(), null,
				"repairForwardActivity", null, 1, 1, uOperation2jMethod_HelperRule_r4.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuOperation2jMethod_HelperRule_r4_RepairBackwardActivity(), theMlsdmPackage.getActivity(),
				null, "repairBackwardActivity", null, 1, 1, uOperation2jMethod_HelperRule_r4.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = initEOperation(getuOperation2jMethod_HelperRule_r4__AddElement__EMap(), theMote2Package.getTGGNode(),
				"addElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "parameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuOperation2jMethod_HelperRule_r4__ChangeAttributeValues__TGGNode_EMap(),
				ecorePackage.getEBoolean(), "changeAttributeValues", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "ruleParameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuOperation2jMethod_HelperRule_r4__MoveElement__TGGNode_TGGNode_TGGNode(),
				ecorePackage.getEBoolean(), "moveElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "oldPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "newPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuOperation2jMethod_HelperRule_r4__TransformForward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuOperation2jMethod_HelperRule_r4__TransformMapping__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformMapping", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuOperation2jMethod_HelperRule_r4__TransformBackward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuOperation2jMethod_HelperRule_r4__ConflictCheckForward__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckForward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuOperation2jMethod_HelperRule_r4__ConflictCheckMapping__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckMapping", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuOperation2jMethod_HelperRule_r4__ConflictCheckBackward__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckBackward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuOperation2jMethod_HelperRule_r4__SynchronizeForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuOperation2jMethod_HelperRule_r4__SynchronizeBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuOperation2jMethod_HelperRule_r4__RepairForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuOperation2jMethod_HelperRule_r4__RepairBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		initEClass(uMessageSequence2jInteractionAnnotation_2_r5EClass,
				uMessageSequence2jInteractionAnnotation_2_r5.class, "uMessageSequence2jInteractionAnnotation_2_r5",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getuMessageSequence2jInteractionAnnotation_2_r5_AddElementActivity(),
				theMlsdmPackage.getActivity(), null, "addElementActivity", null, 1, 1,
				uMessageSequence2jInteractionAnnotation_2_r5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuMessageSequence2jInteractionAnnotation_2_r5_MoveElementActivity(),
				theMlsdmPackage.getActivity(), null, "moveElementActivity", null, 1, 1,
				uMessageSequence2jInteractionAnnotation_2_r5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuMessageSequence2jInteractionAnnotation_2_r5_ChangeAttributeActivity(),
				theMlsdmPackage.getActivity(), null, "changeAttributeActivity", null, 1, 1,
				uMessageSequence2jInteractionAnnotation_2_r5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuMessageSequence2jInteractionAnnotation_2_r5_TransformForwardActivity(),
				theMlsdmPackage.getActivity(), null, "transformForwardActivity", null, 1, 1,
				uMessageSequence2jInteractionAnnotation_2_r5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuMessageSequence2jInteractionAnnotation_2_r5_TransformMappingActivity(),
				theMlsdmPackage.getActivity(), null, "transformMappingActivity", null, 1, 1,
				uMessageSequence2jInteractionAnnotation_2_r5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuMessageSequence2jInteractionAnnotation_2_r5_TransformBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "transformBackwardActivity", null, 1, 1,
				uMessageSequence2jInteractionAnnotation_2_r5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuMessageSequence2jInteractionAnnotation_2_r5_ConflictCheckForwardActivity(),
				theMlsdmPackage.getActivity(), null, "conflictCheckForwardActivity", null, 1, 1,
				uMessageSequence2jInteractionAnnotation_2_r5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuMessageSequence2jInteractionAnnotation_2_r5_ConflictCheckMappingActivity(),
				theMlsdmPackage.getActivity(), null, "conflictCheckMappingActivity", null, 1, 1,
				uMessageSequence2jInteractionAnnotation_2_r5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuMessageSequence2jInteractionAnnotation_2_r5_ConflictCheckBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "conflictCheckBackwardActivity", null, 1, 1,
				uMessageSequence2jInteractionAnnotation_2_r5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuMessageSequence2jInteractionAnnotation_2_r5_SynchronizeForwardActivity(),
				theMlsdmPackage.getActivity(), null, "synchronizeForwardActivity", null, 1, 1,
				uMessageSequence2jInteractionAnnotation_2_r5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuMessageSequence2jInteractionAnnotation_2_r5_SynchronizeBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "synchronizeBackwardActivity", null, 1, 1,
				uMessageSequence2jInteractionAnnotation_2_r5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuMessageSequence2jInteractionAnnotation_2_r5_RepairForwardActivity(),
				theMlsdmPackage.getActivity(), null, "repairForwardActivity", null, 1, 1,
				uMessageSequence2jInteractionAnnotation_2_r5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuMessageSequence2jInteractionAnnotation_2_r5_RepairBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "repairBackwardActivity", null, 1, 1,
				uMessageSequence2jInteractionAnnotation_2_r5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getuMessageSequence2jInteractionAnnotation_2_r5__AddElement__EMap(),
				theMote2Package.getTGGNode(), "addElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "parameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuMessageSequence2jInteractionAnnotation_2_r5__ChangeAttributeValues__TGGNode_EMap(),
				ecorePackage.getEBoolean(), "changeAttributeValues", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "ruleParameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuMessageSequence2jInteractionAnnotation_2_r5__MoveElement__TGGNode_TGGNode_TGGNode(),
				ecorePackage.getEBoolean(), "moveElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "oldPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "newPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getuMessageSequence2jInteractionAnnotation_2_r5__TransformForward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getuMessageSequence2jInteractionAnnotation_2_r5__TransformMapping__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformMapping", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getuMessageSequence2jInteractionAnnotation_2_r5__TransformBackward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuMessageSequence2jInteractionAnnotation_2_r5__ConflictCheckForward__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckForward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuMessageSequence2jInteractionAnnotation_2_r5__ConflictCheckMapping__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckMapping", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuMessageSequence2jInteractionAnnotation_2_r5__ConflictCheckBackward__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckBackward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuMessageSequence2jInteractionAnnotation_2_r5__SynchronizeForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuMessageSequence2jInteractionAnnotation_2_r5__SynchronizeBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuMessageSequence2jInteractionAnnotation_2_r5__RepairForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuMessageSequence2jInteractionAnnotation_2_r5__RepairBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		initEClass(uMessageSequence2jInteractionAnnotation_r3EClass, uMessageSequence2jInteractionAnnotation_r3.class,
				"uMessageSequence2jInteractionAnnotation_r3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getuMessageSequence2jInteractionAnnotation_r3_AddElementActivity(),
				theMlsdmPackage.getActivity(), null, "addElementActivity", null, 1, 1,
				uMessageSequence2jInteractionAnnotation_r3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuMessageSequence2jInteractionAnnotation_r3_MoveElementActivity(),
				theMlsdmPackage.getActivity(), null, "moveElementActivity", null, 1, 1,
				uMessageSequence2jInteractionAnnotation_r3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuMessageSequence2jInteractionAnnotation_r3_ChangeAttributeActivity(),
				theMlsdmPackage.getActivity(), null, "changeAttributeActivity", null, 1, 1,
				uMessageSequence2jInteractionAnnotation_r3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuMessageSequence2jInteractionAnnotation_r3_TransformForwardActivity(),
				theMlsdmPackage.getActivity(), null, "transformForwardActivity", null, 1, 1,
				uMessageSequence2jInteractionAnnotation_r3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuMessageSequence2jInteractionAnnotation_r3_TransformMappingActivity(),
				theMlsdmPackage.getActivity(), null, "transformMappingActivity", null, 1, 1,
				uMessageSequence2jInteractionAnnotation_r3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuMessageSequence2jInteractionAnnotation_r3_TransformBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "transformBackwardActivity", null, 1, 1,
				uMessageSequence2jInteractionAnnotation_r3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuMessageSequence2jInteractionAnnotation_r3_ConflictCheckForwardActivity(),
				theMlsdmPackage.getActivity(), null, "conflictCheckForwardActivity", null, 1, 1,
				uMessageSequence2jInteractionAnnotation_r3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuMessageSequence2jInteractionAnnotation_r3_ConflictCheckMappingActivity(),
				theMlsdmPackage.getActivity(), null, "conflictCheckMappingActivity", null, 1, 1,
				uMessageSequence2jInteractionAnnotation_r3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuMessageSequence2jInteractionAnnotation_r3_ConflictCheckBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "conflictCheckBackwardActivity", null, 1, 1,
				uMessageSequence2jInteractionAnnotation_r3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuMessageSequence2jInteractionAnnotation_r3_SynchronizeForwardActivity(),
				theMlsdmPackage.getActivity(), null, "synchronizeForwardActivity", null, 1, 1,
				uMessageSequence2jInteractionAnnotation_r3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuMessageSequence2jInteractionAnnotation_r3_SynchronizeBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "synchronizeBackwardActivity", null, 1, 1,
				uMessageSequence2jInteractionAnnotation_r3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuMessageSequence2jInteractionAnnotation_r3_RepairForwardActivity(),
				theMlsdmPackage.getActivity(), null, "repairForwardActivity", null, 1, 1,
				uMessageSequence2jInteractionAnnotation_r3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuMessageSequence2jInteractionAnnotation_r3_RepairBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "repairBackwardActivity", null, 1, 1,
				uMessageSequence2jInteractionAnnotation_r3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getuMessageSequence2jInteractionAnnotation_r3__AddElement__EMap(),
				theMote2Package.getTGGNode(), "addElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "parameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuMessageSequence2jInteractionAnnotation_r3__ChangeAttributeValues__TGGNode_EMap(),
				ecorePackage.getEBoolean(), "changeAttributeValues", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "ruleParameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuMessageSequence2jInteractionAnnotation_r3__MoveElement__TGGNode_TGGNode_TGGNode(),
				ecorePackage.getEBoolean(), "moveElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "oldPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "newPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuMessageSequence2jInteractionAnnotation_r3__TransformForward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuMessageSequence2jInteractionAnnotation_r3__TransformMapping__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformMapping", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuMessageSequence2jInteractionAnnotation_r3__TransformBackward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuMessageSequence2jInteractionAnnotation_r3__ConflictCheckForward__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckForward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuMessageSequence2jInteractionAnnotation_r3__ConflictCheckMapping__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckMapping", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuMessageSequence2jInteractionAnnotation_r3__ConflictCheckBackward__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckBackward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuMessageSequence2jInteractionAnnotation_r3__SynchronizeForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuMessageSequence2jInteractionAnnotation_r3__SynchronizeBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuMessageSequence2jInteractionAnnotation_r3__RepairForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuMessageSequence2jInteractionAnnotation_r3__RepairBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		initEClass(uILifeline2jMAnnotation_r2EClass, uILifeline2jMAnnotation_r2.class, "uILifeline2jMAnnotation_r2",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getuILifeline2jMAnnotation_r2_AddElementActivity(), theMlsdmPackage.getActivity(), null,
				"addElementActivity", null, 1, 1, uILifeline2jMAnnotation_r2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuILifeline2jMAnnotation_r2_MoveElementActivity(), theMlsdmPackage.getActivity(), null,
				"moveElementActivity", null, 1, 1, uILifeline2jMAnnotation_r2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuILifeline2jMAnnotation_r2_ChangeAttributeActivity(), theMlsdmPackage.getActivity(), null,
				"changeAttributeActivity", null, 1, 1, uILifeline2jMAnnotation_r2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuILifeline2jMAnnotation_r2_TransformForwardActivity(), theMlsdmPackage.getActivity(), null,
				"transformForwardActivity", null, 1, 1, uILifeline2jMAnnotation_r2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuILifeline2jMAnnotation_r2_TransformMappingActivity(), theMlsdmPackage.getActivity(), null,
				"transformMappingActivity", null, 1, 1, uILifeline2jMAnnotation_r2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuILifeline2jMAnnotation_r2_TransformBackwardActivity(), theMlsdmPackage.getActivity(), null,
				"transformBackwardActivity", null, 1, 1, uILifeline2jMAnnotation_r2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuILifeline2jMAnnotation_r2_ConflictCheckForwardActivity(), theMlsdmPackage.getActivity(),
				null, "conflictCheckForwardActivity", null, 1, 1, uILifeline2jMAnnotation_r2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuILifeline2jMAnnotation_r2_ConflictCheckMappingActivity(), theMlsdmPackage.getActivity(),
				null, "conflictCheckMappingActivity", null, 1, 1, uILifeline2jMAnnotation_r2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuILifeline2jMAnnotation_r2_ConflictCheckBackwardActivity(), theMlsdmPackage.getActivity(),
				null, "conflictCheckBackwardActivity", null, 1, 1, uILifeline2jMAnnotation_r2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuILifeline2jMAnnotation_r2_SynchronizeForwardActivity(), theMlsdmPackage.getActivity(), null,
				"synchronizeForwardActivity", null, 1, 1, uILifeline2jMAnnotation_r2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuILifeline2jMAnnotation_r2_SynchronizeBackwardActivity(), theMlsdmPackage.getActivity(), null,
				"synchronizeBackwardActivity", null, 1, 1, uILifeline2jMAnnotation_r2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getuILifeline2jMAnnotation_r2_RepairForwardActivity(), theMlsdmPackage.getActivity(), null,
				"repairForwardActivity", null, 1, 1, uILifeline2jMAnnotation_r2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuILifeline2jMAnnotation_r2_RepairBackwardActivity(), theMlsdmPackage.getActivity(), null,
				"repairBackwardActivity", null, 1, 1, uILifeline2jMAnnotation_r2.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getuILifeline2jMAnnotation_r2__AddElement__EMap(), theMote2Package.getTGGNode(),
				"addElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "parameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuILifeline2jMAnnotation_r2__ChangeAttributeValues__TGGNode_EMap(),
				ecorePackage.getEBoolean(), "changeAttributeValues", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "ruleParameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuILifeline2jMAnnotation_r2__MoveElement__TGGNode_TGGNode_TGGNode(),
				ecorePackage.getEBoolean(), "moveElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "oldPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "newPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuILifeline2jMAnnotation_r2__TransformForward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuILifeline2jMAnnotation_r2__TransformMapping__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformMapping", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuILifeline2jMAnnotation_r2__TransformBackward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuILifeline2jMAnnotation_r2__ConflictCheckForward__TGGNode(), ecorePackage.getEObject(),
				"conflictCheckForward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuILifeline2jMAnnotation_r2__ConflictCheckMapping__TGGNode(), ecorePackage.getEObject(),
				"conflictCheckMapping", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuILifeline2jMAnnotation_r2__ConflictCheckBackward__TGGNode(), ecorePackage.getEObject(),
				"conflictCheckBackward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuILifeline2jMAnnotation_r2__SynchronizeForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuILifeline2jMAnnotation_r2__SynchronizeBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuILifeline2jMAnnotation_r2__RepairForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getuILifeline2jMAnnotation_r2__RepairBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());
	}

} //GeneratedPackageImpl
