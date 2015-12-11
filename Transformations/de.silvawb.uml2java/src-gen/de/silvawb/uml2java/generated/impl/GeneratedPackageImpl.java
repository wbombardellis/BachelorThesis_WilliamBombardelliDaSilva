/**
 */
package de.silvawb.uml2java.generated.impl;

import de.mdelab.mltgg.mote2.sdm.SdmPackage;

import de.silvawb.uml2java.Uml2javaPackage;

import de.silvawb.uml2java.generated.GeneratedFactory;
import de.silvawb.uml2java.generated.GeneratedPackage;

import de.silvawb.uml2java.impl.Uml2javaPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
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
	private EClass uIAttribute2jIAttributeEClass = null;

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
	private EClass uInterface2jInterface_RuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uIOperation2jIMethod_RuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uIRealization2jIImplementation_RuleEClass = null;

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
	private EClass uPackage2jPackage_RuleEClass = null;

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
	private EClass uml2javaAxiom_r1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uIAttribute2jIAttribute_r7EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uCAttribute2jCAttribute_Rule_r4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uIRealization2jIImplementation_Rule_r9EClass = null;

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
	private EClass uIOperation2jIMethod_Rule_r8EClass = null;

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
	private EClass uCOperation2jCMethod_Rule_r5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uPackage2jPackage_Rule_r2EClass = null;

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

		// Load packages
		theUml2javaPackage.loadPackage();

		// Fix loaded packages
		theGeneratedPackage.fixPackageContents();
		theUml2javaPackage.fixPackageContents();

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
		if (uml2javaOperationalTGGEClass == null) {
			uml2javaOperationalTGGEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
					.getEClassifiers().get(0);
		}
		return uml2javaOperationalTGGEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuml2javaAxiom() {
		if (uml2javaAxiomEClass == null) {
			uml2javaAxiomEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
					.getEClassifiers().get(1);
		}
		return uml2javaAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuIAttribute2jIAttribute() {
		if (uIAttribute2jIAttributeEClass == null) {
			uIAttribute2jIAttributeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
					.getEClassifiers().get(2);
		}
		return uIAttribute2jIAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuCOperation2jCMethod_Rule() {
		if (uCOperation2jCMethod_RuleEClass == null) {
			uCOperation2jCMethod_RuleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
					.getEClassifiers().get(3);
		}
		return uCOperation2jCMethod_RuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuInterface2jInterface_Rule() {
		if (uInterface2jInterface_RuleEClass == null) {
			uInterface2jInterface_RuleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
					.getEClassifiers().get(4);
		}
		return uInterface2jInterface_RuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuIOperation2jIMethod_Rule() {
		if (uIOperation2jIMethod_RuleEClass == null) {
			uIOperation2jIMethod_RuleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
					.getEClassifiers().get(5);
		}
		return uIOperation2jIMethod_RuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuIRealization2jIImplementation_Rule() {
		if (uIRealization2jIImplementation_RuleEClass == null) {
			uIRealization2jIImplementation_RuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GeneratedPackage.eNS_URI).getEClassifiers().get(6);
		}
		return uIRealization2jIImplementation_RuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuCAttribute2jCAttribute_Rule() {
		if (uCAttribute2jCAttribute_RuleEClass == null) {
			uCAttribute2jCAttribute_RuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GeneratedPackage.eNS_URI).getEClassifiers().get(7);
		}
		return uCAttribute2jCAttribute_RuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuPackage2jPackage_Rule() {
		if (uPackage2jPackage_RuleEClass == null) {
			uPackage2jPackage_RuleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
					.getEClassifiers().get(8);
		}
		return uPackage2jPackage_RuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuClass2jClass_Rule() {
		if (uClass2jClass_RuleEClass == null) {
			uClass2jClass_RuleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
					.getEClassifiers().get(9);
		}
		return uClass2jClass_RuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuml2javaAxiom_r1() {
		if (uml2javaAxiom_r1EClass == null) {
			uml2javaAxiom_r1EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
					.getEClassifiers().get(10);
		}
		return uml2javaAxiom_r1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuml2javaAxiom_r1_AddElementActivity() {
		return (EReference) getuml2javaAxiom_r1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuml2javaAxiom_r1_MoveElementActivity() {
		return (EReference) getuml2javaAxiom_r1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuml2javaAxiom_r1_ChangeAttributeActivity() {
		return (EReference) getuml2javaAxiom_r1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuml2javaAxiom_r1_TransformForwardActivity() {
		return (EReference) getuml2javaAxiom_r1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuml2javaAxiom_r1_TransformMappingActivity() {
		return (EReference) getuml2javaAxiom_r1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuml2javaAxiom_r1_TransformBackwardActivity() {
		return (EReference) getuml2javaAxiom_r1().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuml2javaAxiom_r1_SynchronizeForwardActivity() {
		return (EReference) getuml2javaAxiom_r1().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuml2javaAxiom_r1_SynchronizeBackwardActivity() {
		return (EReference) getuml2javaAxiom_r1().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuml2javaAxiom_r1__AddElement__EMap_EList_EList() {
		return getuml2javaAxiom_r1().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuml2javaAxiom_r1__ChangeAttributeValues__TGGNode_EMap() {
		return getuml2javaAxiom_r1().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuml2javaAxiom_r1__TransformForward__EList_EList_boolean() {
		return getuml2javaAxiom_r1().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuml2javaAxiom_r1__TransformMapping__EList_EList_boolean() {
		return getuml2javaAxiom_r1().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuml2javaAxiom_r1__TransformBackward__EList_EList_boolean() {
		return getuml2javaAxiom_r1().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuml2javaAxiom_r1__SynchronizeForward__EList_EList_TGGNode_boolean() {
		return getuml2javaAxiom_r1().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuml2javaAxiom_r1__SynchronizeBackward__EList_EList_TGGNode_boolean() {
		return getuml2javaAxiom_r1().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuIAttribute2jIAttribute_r7() {
		if (uIAttribute2jIAttribute_r7EClass == null) {
			uIAttribute2jIAttribute_r7EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
					.getEClassifiers().get(11);
		}
		return uIAttribute2jIAttribute_r7EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIAttribute2jIAttribute_r7_AddElementActivity() {
		return (EReference) getuIAttribute2jIAttribute_r7().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIAttribute2jIAttribute_r7_MoveElementActivity() {
		return (EReference) getuIAttribute2jIAttribute_r7().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIAttribute2jIAttribute_r7_ChangeAttributeActivity() {
		return (EReference) getuIAttribute2jIAttribute_r7().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIAttribute2jIAttribute_r7_TransformForwardActivity() {
		return (EReference) getuIAttribute2jIAttribute_r7().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIAttribute2jIAttribute_r7_TransformMappingActivity() {
		return (EReference) getuIAttribute2jIAttribute_r7().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIAttribute2jIAttribute_r7_TransformBackwardActivity() {
		return (EReference) getuIAttribute2jIAttribute_r7().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIAttribute2jIAttribute_r7_ConflictCheckForwardActivity() {
		return (EReference) getuIAttribute2jIAttribute_r7().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIAttribute2jIAttribute_r7_ConflictCheckMappingActivity() {
		return (EReference) getuIAttribute2jIAttribute_r7().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIAttribute2jIAttribute_r7_ConflictCheckBackwardActivity() {
		return (EReference) getuIAttribute2jIAttribute_r7().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIAttribute2jIAttribute_r7_SynchronizeForwardActivity() {
		return (EReference) getuIAttribute2jIAttribute_r7().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIAttribute2jIAttribute_r7_SynchronizeBackwardActivity() {
		return (EReference) getuIAttribute2jIAttribute_r7().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIAttribute2jIAttribute_r7_RepairForwardActivity() {
		return (EReference) getuIAttribute2jIAttribute_r7().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIAttribute2jIAttribute_r7_RepairBackwardActivity() {
		return (EReference) getuIAttribute2jIAttribute_r7().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIAttribute2jIAttribute_r7__AddElement__EMap() {
		return getuIAttribute2jIAttribute_r7().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIAttribute2jIAttribute_r7__ChangeAttributeValues__TGGNode_EMap() {
		return getuIAttribute2jIAttribute_r7().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIAttribute2jIAttribute_r7__MoveElement__TGGNode_TGGNode_TGGNode() {
		return getuIAttribute2jIAttribute_r7().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIAttribute2jIAttribute_r7__TransformForward__TGGNode_boolean_boolean() {
		return getuIAttribute2jIAttribute_r7().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIAttribute2jIAttribute_r7__TransformMapping__TGGNode_boolean_boolean() {
		return getuIAttribute2jIAttribute_r7().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIAttribute2jIAttribute_r7__TransformBackward__TGGNode_boolean_boolean() {
		return getuIAttribute2jIAttribute_r7().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIAttribute2jIAttribute_r7__ConflictCheckForward__TGGNode() {
		return getuIAttribute2jIAttribute_r7().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIAttribute2jIAttribute_r7__ConflictCheckMapping__TGGNode() {
		return getuIAttribute2jIAttribute_r7().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIAttribute2jIAttribute_r7__ConflictCheckBackward__TGGNode() {
		return getuIAttribute2jIAttribute_r7().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIAttribute2jIAttribute_r7__SynchronizeForward__TGGNode_boolean() {
		return getuIAttribute2jIAttribute_r7().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIAttribute2jIAttribute_r7__SynchronizeBackward__TGGNode_boolean() {
		return getuIAttribute2jIAttribute_r7().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIAttribute2jIAttribute_r7__RepairForward__TGGNode_boolean() {
		return getuIAttribute2jIAttribute_r7().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIAttribute2jIAttribute_r7__RepairBackward__TGGNode_boolean() {
		return getuIAttribute2jIAttribute_r7().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuCAttribute2jCAttribute_Rule_r4() {
		if (uCAttribute2jCAttribute_Rule_r4EClass == null) {
			uCAttribute2jCAttribute_Rule_r4EClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GeneratedPackage.eNS_URI).getEClassifiers().get(12);
		}
		return uCAttribute2jCAttribute_Rule_r4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCAttribute2jCAttribute_Rule_r4_AddElementActivity() {
		return (EReference) getuCAttribute2jCAttribute_Rule_r4().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCAttribute2jCAttribute_Rule_r4_MoveElementActivity() {
		return (EReference) getuCAttribute2jCAttribute_Rule_r4().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCAttribute2jCAttribute_Rule_r4_ChangeAttributeActivity() {
		return (EReference) getuCAttribute2jCAttribute_Rule_r4().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCAttribute2jCAttribute_Rule_r4_TransformForwardActivity() {
		return (EReference) getuCAttribute2jCAttribute_Rule_r4().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCAttribute2jCAttribute_Rule_r4_TransformMappingActivity() {
		return (EReference) getuCAttribute2jCAttribute_Rule_r4().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCAttribute2jCAttribute_Rule_r4_TransformBackwardActivity() {
		return (EReference) getuCAttribute2jCAttribute_Rule_r4().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCAttribute2jCAttribute_Rule_r4_ConflictCheckForwardActivity() {
		return (EReference) getuCAttribute2jCAttribute_Rule_r4().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCAttribute2jCAttribute_Rule_r4_ConflictCheckMappingActivity() {
		return (EReference) getuCAttribute2jCAttribute_Rule_r4().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCAttribute2jCAttribute_Rule_r4_ConflictCheckBackwardActivity() {
		return (EReference) getuCAttribute2jCAttribute_Rule_r4().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCAttribute2jCAttribute_Rule_r4_SynchronizeForwardActivity() {
		return (EReference) getuCAttribute2jCAttribute_Rule_r4().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCAttribute2jCAttribute_Rule_r4_SynchronizeBackwardActivity() {
		return (EReference) getuCAttribute2jCAttribute_Rule_r4().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCAttribute2jCAttribute_Rule_r4_RepairForwardActivity() {
		return (EReference) getuCAttribute2jCAttribute_Rule_r4().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCAttribute2jCAttribute_Rule_r4_RepairBackwardActivity() {
		return (EReference) getuCAttribute2jCAttribute_Rule_r4().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCAttribute2jCAttribute_Rule_r4__AddElement__EMap() {
		return getuCAttribute2jCAttribute_Rule_r4().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCAttribute2jCAttribute_Rule_r4__ChangeAttributeValues__TGGNode_EMap() {
		return getuCAttribute2jCAttribute_Rule_r4().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCAttribute2jCAttribute_Rule_r4__MoveElement__TGGNode_TGGNode_TGGNode() {
		return getuCAttribute2jCAttribute_Rule_r4().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCAttribute2jCAttribute_Rule_r4__TransformForward__TGGNode_boolean_boolean() {
		return getuCAttribute2jCAttribute_Rule_r4().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCAttribute2jCAttribute_Rule_r4__TransformMapping__TGGNode_boolean_boolean() {
		return getuCAttribute2jCAttribute_Rule_r4().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCAttribute2jCAttribute_Rule_r4__TransformBackward__TGGNode_boolean_boolean() {
		return getuCAttribute2jCAttribute_Rule_r4().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCAttribute2jCAttribute_Rule_r4__ConflictCheckForward__TGGNode() {
		return getuCAttribute2jCAttribute_Rule_r4().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCAttribute2jCAttribute_Rule_r4__ConflictCheckMapping__TGGNode() {
		return getuCAttribute2jCAttribute_Rule_r4().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCAttribute2jCAttribute_Rule_r4__ConflictCheckBackward__TGGNode() {
		return getuCAttribute2jCAttribute_Rule_r4().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCAttribute2jCAttribute_Rule_r4__SynchronizeForward__TGGNode_boolean() {
		return getuCAttribute2jCAttribute_Rule_r4().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCAttribute2jCAttribute_Rule_r4__SynchronizeBackward__TGGNode_boolean() {
		return getuCAttribute2jCAttribute_Rule_r4().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCAttribute2jCAttribute_Rule_r4__RepairForward__TGGNode_boolean() {
		return getuCAttribute2jCAttribute_Rule_r4().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCAttribute2jCAttribute_Rule_r4__RepairBackward__TGGNode_boolean() {
		return getuCAttribute2jCAttribute_Rule_r4().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuIRealization2jIImplementation_Rule_r9() {
		if (uIRealization2jIImplementation_Rule_r9EClass == null) {
			uIRealization2jIImplementation_Rule_r9EClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GeneratedPackage.eNS_URI).getEClassifiers().get(13);
		}
		return uIRealization2jIImplementation_Rule_r9EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIRealization2jIImplementation_Rule_r9_AddElementActivity() {
		return (EReference) getuIRealization2jIImplementation_Rule_r9().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIRealization2jIImplementation_Rule_r9_MoveElementActivity() {
		return (EReference) getuIRealization2jIImplementation_Rule_r9().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIRealization2jIImplementation_Rule_r9_ChangeAttributeActivity() {
		return (EReference) getuIRealization2jIImplementation_Rule_r9().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIRealization2jIImplementation_Rule_r9_TransformForwardActivity() {
		return (EReference) getuIRealization2jIImplementation_Rule_r9().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIRealization2jIImplementation_Rule_r9_TransformMappingActivity() {
		return (EReference) getuIRealization2jIImplementation_Rule_r9().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIRealization2jIImplementation_Rule_r9_TransformBackwardActivity() {
		return (EReference) getuIRealization2jIImplementation_Rule_r9().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIRealization2jIImplementation_Rule_r9_ConflictCheckForwardActivity() {
		return (EReference) getuIRealization2jIImplementation_Rule_r9().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIRealization2jIImplementation_Rule_r9_ConflictCheckMappingActivity() {
		return (EReference) getuIRealization2jIImplementation_Rule_r9().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIRealization2jIImplementation_Rule_r9_ConflictCheckBackwardActivity() {
		return (EReference) getuIRealization2jIImplementation_Rule_r9().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIRealization2jIImplementation_Rule_r9_SynchronizeForwardActivity() {
		return (EReference) getuIRealization2jIImplementation_Rule_r9().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIRealization2jIImplementation_Rule_r9_SynchronizeBackwardActivity() {
		return (EReference) getuIRealization2jIImplementation_Rule_r9().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIRealization2jIImplementation_Rule_r9_RepairForwardActivity() {
		return (EReference) getuIRealization2jIImplementation_Rule_r9().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIRealization2jIImplementation_Rule_r9_RepairBackwardActivity() {
		return (EReference) getuIRealization2jIImplementation_Rule_r9().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIRealization2jIImplementation_Rule_r9__AddElement__EMap() {
		return getuIRealization2jIImplementation_Rule_r9().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIRealization2jIImplementation_Rule_r9__ChangeAttributeValues__TGGNode_EMap() {
		return getuIRealization2jIImplementation_Rule_r9().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIRealization2jIImplementation_Rule_r9__MoveElement__TGGNode_TGGNode_TGGNode() {
		return getuIRealization2jIImplementation_Rule_r9().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIRealization2jIImplementation_Rule_r9__TransformForward__TGGNode_boolean_boolean() {
		return getuIRealization2jIImplementation_Rule_r9().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIRealization2jIImplementation_Rule_r9__TransformMapping__TGGNode_boolean_boolean() {
		return getuIRealization2jIImplementation_Rule_r9().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIRealization2jIImplementation_Rule_r9__TransformBackward__TGGNode_boolean_boolean() {
		return getuIRealization2jIImplementation_Rule_r9().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIRealization2jIImplementation_Rule_r9__ConflictCheckForward__TGGNode() {
		return getuIRealization2jIImplementation_Rule_r9().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIRealization2jIImplementation_Rule_r9__ConflictCheckMapping__TGGNode() {
		return getuIRealization2jIImplementation_Rule_r9().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIRealization2jIImplementation_Rule_r9__ConflictCheckBackward__TGGNode() {
		return getuIRealization2jIImplementation_Rule_r9().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIRealization2jIImplementation_Rule_r9__SynchronizeForward__TGGNode_boolean() {
		return getuIRealization2jIImplementation_Rule_r9().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIRealization2jIImplementation_Rule_r9__SynchronizeBackward__TGGNode_boolean() {
		return getuIRealization2jIImplementation_Rule_r9().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIRealization2jIImplementation_Rule_r9__RepairForward__TGGNode_boolean() {
		return getuIRealization2jIImplementation_Rule_r9().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIRealization2jIImplementation_Rule_r9__RepairBackward__TGGNode_boolean() {
		return getuIRealization2jIImplementation_Rule_r9().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuClass2jClass_Rule_r3() {
		if (uClass2jClass_Rule_r3EClass == null) {
			uClass2jClass_Rule_r3EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
					.getEClassifiers().get(14);
		}
		return uClass2jClass_Rule_r3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Rule_r3_AddElementActivity() {
		return (EReference) getuClass2jClass_Rule_r3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Rule_r3_MoveElementActivity() {
		return (EReference) getuClass2jClass_Rule_r3().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Rule_r3_ChangeAttributeActivity() {
		return (EReference) getuClass2jClass_Rule_r3().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Rule_r3_TransformForwardActivity() {
		return (EReference) getuClass2jClass_Rule_r3().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Rule_r3_TransformMappingActivity() {
		return (EReference) getuClass2jClass_Rule_r3().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Rule_r3_TransformBackwardActivity() {
		return (EReference) getuClass2jClass_Rule_r3().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Rule_r3_ConflictCheckForwardActivity() {
		return (EReference) getuClass2jClass_Rule_r3().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Rule_r3_ConflictCheckMappingActivity() {
		return (EReference) getuClass2jClass_Rule_r3().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Rule_r3_ConflictCheckBackwardActivity() {
		return (EReference) getuClass2jClass_Rule_r3().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Rule_r3_SynchronizeForwardActivity() {
		return (EReference) getuClass2jClass_Rule_r3().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Rule_r3_SynchronizeBackwardActivity() {
		return (EReference) getuClass2jClass_Rule_r3().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Rule_r3_RepairForwardActivity() {
		return (EReference) getuClass2jClass_Rule_r3().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Rule_r3_RepairBackwardActivity() {
		return (EReference) getuClass2jClass_Rule_r3().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Rule_r3__AddElement__EMap() {
		return getuClass2jClass_Rule_r3().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Rule_r3__ChangeAttributeValues__TGGNode_EMap() {
		return getuClass2jClass_Rule_r3().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Rule_r3__MoveElement__TGGNode_TGGNode_TGGNode() {
		return getuClass2jClass_Rule_r3().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Rule_r3__TransformForward__TGGNode_boolean_boolean() {
		return getuClass2jClass_Rule_r3().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Rule_r3__TransformMapping__TGGNode_boolean_boolean() {
		return getuClass2jClass_Rule_r3().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Rule_r3__TransformBackward__TGGNode_boolean_boolean() {
		return getuClass2jClass_Rule_r3().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Rule_r3__ConflictCheckForward__TGGNode() {
		return getuClass2jClass_Rule_r3().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Rule_r3__ConflictCheckMapping__TGGNode() {
		return getuClass2jClass_Rule_r3().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Rule_r3__ConflictCheckBackward__TGGNode() {
		return getuClass2jClass_Rule_r3().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Rule_r3__SynchronizeForward__TGGNode_boolean() {
		return getuClass2jClass_Rule_r3().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Rule_r3__SynchronizeBackward__TGGNode_boolean() {
		return getuClass2jClass_Rule_r3().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Rule_r3__RepairForward__TGGNode_boolean() {
		return getuClass2jClass_Rule_r3().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Rule_r3__RepairBackward__TGGNode_boolean() {
		return getuClass2jClass_Rule_r3().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuIOperation2jIMethod_Rule_r8() {
		if (uIOperation2jIMethod_Rule_r8EClass == null) {
			uIOperation2jIMethod_Rule_r8EClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GeneratedPackage.eNS_URI).getEClassifiers().get(15);
		}
		return uIOperation2jIMethod_Rule_r8EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIOperation2jIMethod_Rule_r8_AddElementActivity() {
		return (EReference) getuIOperation2jIMethod_Rule_r8().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIOperation2jIMethod_Rule_r8_MoveElementActivity() {
		return (EReference) getuIOperation2jIMethod_Rule_r8().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIOperation2jIMethod_Rule_r8_ChangeAttributeActivity() {
		return (EReference) getuIOperation2jIMethod_Rule_r8().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIOperation2jIMethod_Rule_r8_TransformForwardActivity() {
		return (EReference) getuIOperation2jIMethod_Rule_r8().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIOperation2jIMethod_Rule_r8_TransformMappingActivity() {
		return (EReference) getuIOperation2jIMethod_Rule_r8().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIOperation2jIMethod_Rule_r8_TransformBackwardActivity() {
		return (EReference) getuIOperation2jIMethod_Rule_r8().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIOperation2jIMethod_Rule_r8_ConflictCheckForwardActivity() {
		return (EReference) getuIOperation2jIMethod_Rule_r8().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIOperation2jIMethod_Rule_r8_ConflictCheckMappingActivity() {
		return (EReference) getuIOperation2jIMethod_Rule_r8().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIOperation2jIMethod_Rule_r8_ConflictCheckBackwardActivity() {
		return (EReference) getuIOperation2jIMethod_Rule_r8().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIOperation2jIMethod_Rule_r8_SynchronizeForwardActivity() {
		return (EReference) getuIOperation2jIMethod_Rule_r8().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIOperation2jIMethod_Rule_r8_SynchronizeBackwardActivity() {
		return (EReference) getuIOperation2jIMethod_Rule_r8().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIOperation2jIMethod_Rule_r8_RepairForwardActivity() {
		return (EReference) getuIOperation2jIMethod_Rule_r8().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuIOperation2jIMethod_Rule_r8_RepairBackwardActivity() {
		return (EReference) getuIOperation2jIMethod_Rule_r8().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIOperation2jIMethod_Rule_r8__AddElement__EMap() {
		return getuIOperation2jIMethod_Rule_r8().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIOperation2jIMethod_Rule_r8__ChangeAttributeValues__TGGNode_EMap() {
		return getuIOperation2jIMethod_Rule_r8().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIOperation2jIMethod_Rule_r8__MoveElement__TGGNode_TGGNode_TGGNode() {
		return getuIOperation2jIMethod_Rule_r8().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIOperation2jIMethod_Rule_r8__TransformForward__TGGNode_boolean_boolean() {
		return getuIOperation2jIMethod_Rule_r8().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIOperation2jIMethod_Rule_r8__TransformMapping__TGGNode_boolean_boolean() {
		return getuIOperation2jIMethod_Rule_r8().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIOperation2jIMethod_Rule_r8__TransformBackward__TGGNode_boolean_boolean() {
		return getuIOperation2jIMethod_Rule_r8().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIOperation2jIMethod_Rule_r8__ConflictCheckForward__TGGNode() {
		return getuIOperation2jIMethod_Rule_r8().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIOperation2jIMethod_Rule_r8__ConflictCheckMapping__TGGNode() {
		return getuIOperation2jIMethod_Rule_r8().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIOperation2jIMethod_Rule_r8__ConflictCheckBackward__TGGNode() {
		return getuIOperation2jIMethod_Rule_r8().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIOperation2jIMethod_Rule_r8__SynchronizeForward__TGGNode_boolean() {
		return getuIOperation2jIMethod_Rule_r8().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIOperation2jIMethod_Rule_r8__SynchronizeBackward__TGGNode_boolean() {
		return getuIOperation2jIMethod_Rule_r8().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIOperation2jIMethod_Rule_r8__RepairForward__TGGNode_boolean() {
		return getuIOperation2jIMethod_Rule_r8().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuIOperation2jIMethod_Rule_r8__RepairBackward__TGGNode_boolean() {
		return getuIOperation2jIMethod_Rule_r8().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuInterface2jInterface_Rule_r6() {
		if (uInterface2jInterface_Rule_r6EClass == null) {
			uInterface2jInterface_Rule_r6EClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GeneratedPackage.eNS_URI).getEClassifiers().get(16);
		}
		return uInterface2jInterface_Rule_r6EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuInterface2jInterface_Rule_r6_AddElementActivity() {
		return (EReference) getuInterface2jInterface_Rule_r6().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuInterface2jInterface_Rule_r6_MoveElementActivity() {
		return (EReference) getuInterface2jInterface_Rule_r6().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuInterface2jInterface_Rule_r6_ChangeAttributeActivity() {
		return (EReference) getuInterface2jInterface_Rule_r6().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuInterface2jInterface_Rule_r6_TransformForwardActivity() {
		return (EReference) getuInterface2jInterface_Rule_r6().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuInterface2jInterface_Rule_r6_TransformMappingActivity() {
		return (EReference) getuInterface2jInterface_Rule_r6().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuInterface2jInterface_Rule_r6_TransformBackwardActivity() {
		return (EReference) getuInterface2jInterface_Rule_r6().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuInterface2jInterface_Rule_r6_ConflictCheckForwardActivity() {
		return (EReference) getuInterface2jInterface_Rule_r6().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuInterface2jInterface_Rule_r6_ConflictCheckMappingActivity() {
		return (EReference) getuInterface2jInterface_Rule_r6().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuInterface2jInterface_Rule_r6_ConflictCheckBackwardActivity() {
		return (EReference) getuInterface2jInterface_Rule_r6().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuInterface2jInterface_Rule_r6_SynchronizeForwardActivity() {
		return (EReference) getuInterface2jInterface_Rule_r6().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuInterface2jInterface_Rule_r6_SynchronizeBackwardActivity() {
		return (EReference) getuInterface2jInterface_Rule_r6().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuInterface2jInterface_Rule_r6_RepairForwardActivity() {
		return (EReference) getuInterface2jInterface_Rule_r6().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuInterface2jInterface_Rule_r6_RepairBackwardActivity() {
		return (EReference) getuInterface2jInterface_Rule_r6().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuInterface2jInterface_Rule_r6__AddElement__EMap() {
		return getuInterface2jInterface_Rule_r6().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuInterface2jInterface_Rule_r6__ChangeAttributeValues__TGGNode_EMap() {
		return getuInterface2jInterface_Rule_r6().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuInterface2jInterface_Rule_r6__MoveElement__TGGNode_TGGNode_TGGNode() {
		return getuInterface2jInterface_Rule_r6().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuInterface2jInterface_Rule_r6__TransformForward__TGGNode_boolean_boolean() {
		return getuInterface2jInterface_Rule_r6().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuInterface2jInterface_Rule_r6__TransformMapping__TGGNode_boolean_boolean() {
		return getuInterface2jInterface_Rule_r6().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuInterface2jInterface_Rule_r6__TransformBackward__TGGNode_boolean_boolean() {
		return getuInterface2jInterface_Rule_r6().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuInterface2jInterface_Rule_r6__ConflictCheckForward__TGGNode() {
		return getuInterface2jInterface_Rule_r6().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuInterface2jInterface_Rule_r6__ConflictCheckMapping__TGGNode() {
		return getuInterface2jInterface_Rule_r6().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuInterface2jInterface_Rule_r6__ConflictCheckBackward__TGGNode() {
		return getuInterface2jInterface_Rule_r6().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuInterface2jInterface_Rule_r6__SynchronizeForward__TGGNode_boolean() {
		return getuInterface2jInterface_Rule_r6().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuInterface2jInterface_Rule_r6__SynchronizeBackward__TGGNode_boolean() {
		return getuInterface2jInterface_Rule_r6().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuInterface2jInterface_Rule_r6__RepairForward__TGGNode_boolean() {
		return getuInterface2jInterface_Rule_r6().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuInterface2jInterface_Rule_r6__RepairBackward__TGGNode_boolean() {
		return getuInterface2jInterface_Rule_r6().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuCOperation2jCMethod_Rule_r5() {
		if (uCOperation2jCMethod_Rule_r5EClass == null) {
			uCOperation2jCMethod_Rule_r5EClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GeneratedPackage.eNS_URI).getEClassifiers().get(17);
		}
		return uCOperation2jCMethod_Rule_r5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCOperation2jCMethod_Rule_r5_AddElementActivity() {
		return (EReference) getuCOperation2jCMethod_Rule_r5().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCOperation2jCMethod_Rule_r5_MoveElementActivity() {
		return (EReference) getuCOperation2jCMethod_Rule_r5().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCOperation2jCMethod_Rule_r5_ChangeAttributeActivity() {
		return (EReference) getuCOperation2jCMethod_Rule_r5().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCOperation2jCMethod_Rule_r5_TransformForwardActivity() {
		return (EReference) getuCOperation2jCMethod_Rule_r5().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCOperation2jCMethod_Rule_r5_TransformMappingActivity() {
		return (EReference) getuCOperation2jCMethod_Rule_r5().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCOperation2jCMethod_Rule_r5_TransformBackwardActivity() {
		return (EReference) getuCOperation2jCMethod_Rule_r5().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCOperation2jCMethod_Rule_r5_ConflictCheckForwardActivity() {
		return (EReference) getuCOperation2jCMethod_Rule_r5().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCOperation2jCMethod_Rule_r5_ConflictCheckMappingActivity() {
		return (EReference) getuCOperation2jCMethod_Rule_r5().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCOperation2jCMethod_Rule_r5_ConflictCheckBackwardActivity() {
		return (EReference) getuCOperation2jCMethod_Rule_r5().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCOperation2jCMethod_Rule_r5_SynchronizeForwardActivity() {
		return (EReference) getuCOperation2jCMethod_Rule_r5().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCOperation2jCMethod_Rule_r5_SynchronizeBackwardActivity() {
		return (EReference) getuCOperation2jCMethod_Rule_r5().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCOperation2jCMethod_Rule_r5_RepairForwardActivity() {
		return (EReference) getuCOperation2jCMethod_Rule_r5().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCOperation2jCMethod_Rule_r5_RepairBackwardActivity() {
		return (EReference) getuCOperation2jCMethod_Rule_r5().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCOperation2jCMethod_Rule_r5__AddElement__EMap() {
		return getuCOperation2jCMethod_Rule_r5().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCOperation2jCMethod_Rule_r5__ChangeAttributeValues__TGGNode_EMap() {
		return getuCOperation2jCMethod_Rule_r5().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCOperation2jCMethod_Rule_r5__MoveElement__TGGNode_TGGNode_TGGNode() {
		return getuCOperation2jCMethod_Rule_r5().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCOperation2jCMethod_Rule_r5__TransformForward__TGGNode_boolean_boolean() {
		return getuCOperation2jCMethod_Rule_r5().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCOperation2jCMethod_Rule_r5__TransformMapping__TGGNode_boolean_boolean() {
		return getuCOperation2jCMethod_Rule_r5().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCOperation2jCMethod_Rule_r5__TransformBackward__TGGNode_boolean_boolean() {
		return getuCOperation2jCMethod_Rule_r5().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCOperation2jCMethod_Rule_r5__ConflictCheckForward__TGGNode() {
		return getuCOperation2jCMethod_Rule_r5().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCOperation2jCMethod_Rule_r5__ConflictCheckMapping__TGGNode() {
		return getuCOperation2jCMethod_Rule_r5().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCOperation2jCMethod_Rule_r5__ConflictCheckBackward__TGGNode() {
		return getuCOperation2jCMethod_Rule_r5().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCOperation2jCMethod_Rule_r5__SynchronizeForward__TGGNode_boolean() {
		return getuCOperation2jCMethod_Rule_r5().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCOperation2jCMethod_Rule_r5__SynchronizeBackward__TGGNode_boolean() {
		return getuCOperation2jCMethod_Rule_r5().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCOperation2jCMethod_Rule_r5__RepairForward__TGGNode_boolean() {
		return getuCOperation2jCMethod_Rule_r5().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCOperation2jCMethod_Rule_r5__RepairBackward__TGGNode_boolean() {
		return getuCOperation2jCMethod_Rule_r5().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuPackage2jPackage_Rule_r2() {
		if (uPackage2jPackage_Rule_r2EClass == null) {
			uPackage2jPackage_Rule_r2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
					.getEClassifiers().get(18);
		}
		return uPackage2jPackage_Rule_r2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuPackage2jPackage_Rule_r2_AddElementActivity() {
		return (EReference) getuPackage2jPackage_Rule_r2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuPackage2jPackage_Rule_r2_MoveElementActivity() {
		return (EReference) getuPackage2jPackage_Rule_r2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuPackage2jPackage_Rule_r2_ChangeAttributeActivity() {
		return (EReference) getuPackage2jPackage_Rule_r2().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuPackage2jPackage_Rule_r2_TransformForwardActivity() {
		return (EReference) getuPackage2jPackage_Rule_r2().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuPackage2jPackage_Rule_r2_TransformMappingActivity() {
		return (EReference) getuPackage2jPackage_Rule_r2().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuPackage2jPackage_Rule_r2_TransformBackwardActivity() {
		return (EReference) getuPackage2jPackage_Rule_r2().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuPackage2jPackage_Rule_r2_ConflictCheckForwardActivity() {
		return (EReference) getuPackage2jPackage_Rule_r2().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuPackage2jPackage_Rule_r2_ConflictCheckMappingActivity() {
		return (EReference) getuPackage2jPackage_Rule_r2().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuPackage2jPackage_Rule_r2_ConflictCheckBackwardActivity() {
		return (EReference) getuPackage2jPackage_Rule_r2().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuPackage2jPackage_Rule_r2_SynchronizeForwardActivity() {
		return (EReference) getuPackage2jPackage_Rule_r2().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuPackage2jPackage_Rule_r2_SynchronizeBackwardActivity() {
		return (EReference) getuPackage2jPackage_Rule_r2().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuPackage2jPackage_Rule_r2_RepairForwardActivity() {
		return (EReference) getuPackage2jPackage_Rule_r2().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuPackage2jPackage_Rule_r2_RepairBackwardActivity() {
		return (EReference) getuPackage2jPackage_Rule_r2().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuPackage2jPackage_Rule_r2__AddElement__EMap() {
		return getuPackage2jPackage_Rule_r2().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuPackage2jPackage_Rule_r2__ChangeAttributeValues__TGGNode_EMap() {
		return getuPackage2jPackage_Rule_r2().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuPackage2jPackage_Rule_r2__MoveElement__TGGNode_TGGNode_TGGNode() {
		return getuPackage2jPackage_Rule_r2().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuPackage2jPackage_Rule_r2__TransformForward__TGGNode_boolean_boolean() {
		return getuPackage2jPackage_Rule_r2().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuPackage2jPackage_Rule_r2__TransformMapping__TGGNode_boolean_boolean() {
		return getuPackage2jPackage_Rule_r2().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuPackage2jPackage_Rule_r2__TransformBackward__TGGNode_boolean_boolean() {
		return getuPackage2jPackage_Rule_r2().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuPackage2jPackage_Rule_r2__ConflictCheckForward__TGGNode() {
		return getuPackage2jPackage_Rule_r2().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuPackage2jPackage_Rule_r2__ConflictCheckMapping__TGGNode() {
		return getuPackage2jPackage_Rule_r2().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuPackage2jPackage_Rule_r2__ConflictCheckBackward__TGGNode() {
		return getuPackage2jPackage_Rule_r2().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuPackage2jPackage_Rule_r2__SynchronizeForward__TGGNode_boolean() {
		return getuPackage2jPackage_Rule_r2().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuPackage2jPackage_Rule_r2__SynchronizeBackward__TGGNode_boolean() {
		return getuPackage2jPackage_Rule_r2().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuPackage2jPackage_Rule_r2__RepairForward__TGGNode_boolean() {
		return getuPackage2jPackage_Rule_r2().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuPackage2jPackage_Rule_r2__RepairBackward__TGGNode_boolean() {
		return getuPackage2jPackage_Rule_r2().getEOperations().get(12);
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
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed)
			return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("de.silvawb.uml2java.generated." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //GeneratedPackageImpl
