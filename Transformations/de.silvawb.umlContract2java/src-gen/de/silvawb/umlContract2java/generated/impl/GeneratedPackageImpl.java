/**
 */
package de.silvawb.umlContract2java.generated.impl;

import de.mdelab.mltgg.mote2.sdm.SdmPackage;

import de.silvawb.umlContract2java.UmlContract2javaPackage;

import de.silvawb.umlContract2java.generated.GeneratedFactory;
import de.silvawb.umlContract2java.generated.GeneratedPackage;

import de.silvawb.umlContract2java.impl.UmlContract2javaPackageImpl;

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
	private EClass umlContract2javaOperationalTGGEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlContract2javaAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uProperty2jField_HelperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uOPPre2jMAPreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uCInv2jCInvEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uClass2jClass_HelperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uOParamenter2jMArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uOperation2jMethod_HelperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uOPPosInt2jMAPosAssertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uOPPos2jMAPosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uCInvInt2jCInvAssertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uOPPreInt2jMAPreAssertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlContract2javaAxiom_r1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uOParamenter2jMArgument_r4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uCInv2jCInv_r9EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uOPPre2jMAPre_r5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uOPPreInt2jMAPreAssert_r7EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uOPPosInt2jMAPosAssert_r8EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uOperation2jMethod_Helper_r3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uCInvInt2jCInvAssert_r10EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uClass2jClass_Helper_r2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uOPPos2jMAPos_r6EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uProperty2jField_Helper_r11EClass = null;

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
	 * @see de.silvawb.umlContract2java.generated.GeneratedPackage#eNS_URI
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
		UmlContract2javaPackageImpl theUmlContract2javaPackage = (UmlContract2javaPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(UmlContract2javaPackage.eNS_URI) instanceof UmlContract2javaPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(UmlContract2javaPackage.eNS_URI)
						: UmlContract2javaPackage.eINSTANCE);

		// Load packages
		theUmlContract2javaPackage.loadPackage();

		// Fix loaded packages
		theGeneratedPackage.fixPackageContents();
		theUmlContract2javaPackage.fixPackageContents();

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
	public EClass getumlContract2javaOperationalTGG() {
		if (umlContract2javaOperationalTGGEClass == null) {
			umlContract2javaOperationalTGGEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GeneratedPackage.eNS_URI).getEClassifiers().get(0);
		}
		return umlContract2javaOperationalTGGEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getumlContract2javaAxiom() {
		if (umlContract2javaAxiomEClass == null) {
			umlContract2javaAxiomEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
					.getEClassifiers().get(1);
		}
		return umlContract2javaAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuProperty2jField_Helper() {
		if (uProperty2jField_HelperEClass == null) {
			uProperty2jField_HelperEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
					.getEClassifiers().get(2);
		}
		return uProperty2jField_HelperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuOPPre2jMAPre() {
		if (uOPPre2jMAPreEClass == null) {
			uOPPre2jMAPreEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
					.getEClassifiers().get(3);
		}
		return uOPPre2jMAPreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuCInv2jCInv() {
		if (uCInv2jCInvEClass == null) {
			uCInv2jCInvEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
					.getEClassifiers().get(4);
		}
		return uCInv2jCInvEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuClass2jClass_Helper() {
		if (uClass2jClass_HelperEClass == null) {
			uClass2jClass_HelperEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
					.getEClassifiers().get(5);
		}
		return uClass2jClass_HelperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuOParamenter2jMArgument() {
		if (uOParamenter2jMArgumentEClass == null) {
			uOParamenter2jMArgumentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
					.getEClassifiers().get(6);
		}
		return uOParamenter2jMArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuOperation2jMethod_Helper() {
		if (uOperation2jMethod_HelperEClass == null) {
			uOperation2jMethod_HelperEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
					.getEClassifiers().get(7);
		}
		return uOperation2jMethod_HelperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuOPPosInt2jMAPosAssert() {
		if (uOPPosInt2jMAPosAssertEClass == null) {
			uOPPosInt2jMAPosAssertEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
					.getEClassifiers().get(8);
		}
		return uOPPosInt2jMAPosAssertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuOPPos2jMAPos() {
		if (uOPPos2jMAPosEClass == null) {
			uOPPos2jMAPosEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
					.getEClassifiers().get(9);
		}
		return uOPPos2jMAPosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuCInvInt2jCInvAssert() {
		if (uCInvInt2jCInvAssertEClass == null) {
			uCInvInt2jCInvAssertEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
					.getEClassifiers().get(10);
		}
		return uCInvInt2jCInvAssertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuOPPreInt2jMAPreAssert() {
		if (uOPPreInt2jMAPreAssertEClass == null) {
			uOPPreInt2jMAPreAssertEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
					.getEClassifiers().get(11);
		}
		return uOPPreInt2jMAPreAssertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getumlContract2javaAxiom_r1() {
		if (umlContract2javaAxiom_r1EClass == null) {
			umlContract2javaAxiom_r1EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
					.getEClassifiers().get(12);
		}
		return umlContract2javaAxiom_r1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getumlContract2javaAxiom_r1_AddElementActivity() {
		return (EReference) getumlContract2javaAxiom_r1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getumlContract2javaAxiom_r1_MoveElementActivity() {
		return (EReference) getumlContract2javaAxiom_r1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getumlContract2javaAxiom_r1_ChangeAttributeActivity() {
		return (EReference) getumlContract2javaAxiom_r1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getumlContract2javaAxiom_r1_TransformForwardActivity() {
		return (EReference) getumlContract2javaAxiom_r1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getumlContract2javaAxiom_r1_TransformMappingActivity() {
		return (EReference) getumlContract2javaAxiom_r1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getumlContract2javaAxiom_r1_TransformBackwardActivity() {
		return (EReference) getumlContract2javaAxiom_r1().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getumlContract2javaAxiom_r1_SynchronizeForwardActivity() {
		return (EReference) getumlContract2javaAxiom_r1().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getumlContract2javaAxiom_r1_SynchronizeBackwardActivity() {
		return (EReference) getumlContract2javaAxiom_r1().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getumlContract2javaAxiom_r1__AddElement__EMap_EList_EList() {
		return getumlContract2javaAxiom_r1().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getumlContract2javaAxiom_r1__ChangeAttributeValues__TGGNode_EMap() {
		return getumlContract2javaAxiom_r1().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getumlContract2javaAxiom_r1__TransformForward__EList_EList_boolean() {
		return getumlContract2javaAxiom_r1().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getumlContract2javaAxiom_r1__TransformMapping__EList_EList_boolean() {
		return getumlContract2javaAxiom_r1().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getumlContract2javaAxiom_r1__TransformBackward__EList_EList_boolean() {
		return getumlContract2javaAxiom_r1().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getumlContract2javaAxiom_r1__SynchronizeForward__EList_EList_TGGNode_boolean() {
		return getumlContract2javaAxiom_r1().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getumlContract2javaAxiom_r1__SynchronizeBackward__EList_EList_TGGNode_boolean() {
		return getumlContract2javaAxiom_r1().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuOParamenter2jMArgument_r4() {
		if (uOParamenter2jMArgument_r4EClass == null) {
			uOParamenter2jMArgument_r4EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
					.getEClassifiers().get(13);
		}
		return uOParamenter2jMArgument_r4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOParamenter2jMArgument_r4_AddElementActivity() {
		return (EReference) getuOParamenter2jMArgument_r4().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOParamenter2jMArgument_r4_MoveElementActivity() {
		return (EReference) getuOParamenter2jMArgument_r4().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOParamenter2jMArgument_r4_ChangeAttributeActivity() {
		return (EReference) getuOParamenter2jMArgument_r4().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOParamenter2jMArgument_r4_TransformForwardActivity() {
		return (EReference) getuOParamenter2jMArgument_r4().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOParamenter2jMArgument_r4_TransformMappingActivity() {
		return (EReference) getuOParamenter2jMArgument_r4().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOParamenter2jMArgument_r4_TransformBackwardActivity() {
		return (EReference) getuOParamenter2jMArgument_r4().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOParamenter2jMArgument_r4_ConflictCheckForwardActivity() {
		return (EReference) getuOParamenter2jMArgument_r4().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOParamenter2jMArgument_r4_ConflictCheckMappingActivity() {
		return (EReference) getuOParamenter2jMArgument_r4().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOParamenter2jMArgument_r4_ConflictCheckBackwardActivity() {
		return (EReference) getuOParamenter2jMArgument_r4().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOParamenter2jMArgument_r4_SynchronizeForwardActivity() {
		return (EReference) getuOParamenter2jMArgument_r4().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOParamenter2jMArgument_r4_SynchronizeBackwardActivity() {
		return (EReference) getuOParamenter2jMArgument_r4().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOParamenter2jMArgument_r4_RepairForwardActivity() {
		return (EReference) getuOParamenter2jMArgument_r4().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOParamenter2jMArgument_r4_RepairBackwardActivity() {
		return (EReference) getuOParamenter2jMArgument_r4().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOParamenter2jMArgument_r4__AddElement__EMap() {
		return getuOParamenter2jMArgument_r4().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOParamenter2jMArgument_r4__ChangeAttributeValues__TGGNode_EMap() {
		return getuOParamenter2jMArgument_r4().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOParamenter2jMArgument_r4__MoveElement__TGGNode_TGGNode_TGGNode() {
		return getuOParamenter2jMArgument_r4().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOParamenter2jMArgument_r4__TransformForward__TGGNode_boolean_boolean() {
		return getuOParamenter2jMArgument_r4().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOParamenter2jMArgument_r4__TransformMapping__TGGNode_boolean_boolean() {
		return getuOParamenter2jMArgument_r4().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOParamenter2jMArgument_r4__TransformBackward__TGGNode_boolean_boolean() {
		return getuOParamenter2jMArgument_r4().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOParamenter2jMArgument_r4__ConflictCheckForward__TGGNode() {
		return getuOParamenter2jMArgument_r4().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOParamenter2jMArgument_r4__ConflictCheckMapping__TGGNode() {
		return getuOParamenter2jMArgument_r4().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOParamenter2jMArgument_r4__ConflictCheckBackward__TGGNode() {
		return getuOParamenter2jMArgument_r4().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOParamenter2jMArgument_r4__SynchronizeForward__TGGNode_boolean() {
		return getuOParamenter2jMArgument_r4().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOParamenter2jMArgument_r4__SynchronizeBackward__TGGNode_boolean() {
		return getuOParamenter2jMArgument_r4().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOParamenter2jMArgument_r4__RepairForward__TGGNode_boolean() {
		return getuOParamenter2jMArgument_r4().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOParamenter2jMArgument_r4__RepairBackward__TGGNode_boolean() {
		return getuOParamenter2jMArgument_r4().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuCInv2jCInv_r9() {
		if (uCInv2jCInv_r9EClass == null) {
			uCInv2jCInv_r9EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
					.getEClassifiers().get(14);
		}
		return uCInv2jCInv_r9EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCInv2jCInv_r9_AddElementActivity() {
		return (EReference) getuCInv2jCInv_r9().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCInv2jCInv_r9_MoveElementActivity() {
		return (EReference) getuCInv2jCInv_r9().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCInv2jCInv_r9_ChangeAttributeActivity() {
		return (EReference) getuCInv2jCInv_r9().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCInv2jCInv_r9_TransformForwardActivity() {
		return (EReference) getuCInv2jCInv_r9().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCInv2jCInv_r9_TransformMappingActivity() {
		return (EReference) getuCInv2jCInv_r9().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCInv2jCInv_r9_TransformBackwardActivity() {
		return (EReference) getuCInv2jCInv_r9().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCInv2jCInv_r9_ConflictCheckForwardActivity() {
		return (EReference) getuCInv2jCInv_r9().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCInv2jCInv_r9_ConflictCheckMappingActivity() {
		return (EReference) getuCInv2jCInv_r9().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCInv2jCInv_r9_ConflictCheckBackwardActivity() {
		return (EReference) getuCInv2jCInv_r9().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCInv2jCInv_r9_SynchronizeForwardActivity() {
		return (EReference) getuCInv2jCInv_r9().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCInv2jCInv_r9_SynchronizeBackwardActivity() {
		return (EReference) getuCInv2jCInv_r9().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCInv2jCInv_r9_RepairForwardActivity() {
		return (EReference) getuCInv2jCInv_r9().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCInv2jCInv_r9_RepairBackwardActivity() {
		return (EReference) getuCInv2jCInv_r9().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCInv2jCInv_r9__AddElement__EMap() {
		return getuCInv2jCInv_r9().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCInv2jCInv_r9__ChangeAttributeValues__TGGNode_EMap() {
		return getuCInv2jCInv_r9().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCInv2jCInv_r9__MoveElement__TGGNode_TGGNode_TGGNode() {
		return getuCInv2jCInv_r9().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCInv2jCInv_r9__TransformForward__TGGNode_boolean_boolean() {
		return getuCInv2jCInv_r9().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCInv2jCInv_r9__TransformMapping__TGGNode_boolean_boolean() {
		return getuCInv2jCInv_r9().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCInv2jCInv_r9__TransformBackward__TGGNode_boolean_boolean() {
		return getuCInv2jCInv_r9().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCInv2jCInv_r9__ConflictCheckForward__TGGNode() {
		return getuCInv2jCInv_r9().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCInv2jCInv_r9__ConflictCheckMapping__TGGNode() {
		return getuCInv2jCInv_r9().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCInv2jCInv_r9__ConflictCheckBackward__TGGNode() {
		return getuCInv2jCInv_r9().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCInv2jCInv_r9__SynchronizeForward__TGGNode_boolean() {
		return getuCInv2jCInv_r9().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCInv2jCInv_r9__SynchronizeBackward__TGGNode_boolean() {
		return getuCInv2jCInv_r9().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCInv2jCInv_r9__RepairForward__TGGNode_boolean() {
		return getuCInv2jCInv_r9().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCInv2jCInv_r9__RepairBackward__TGGNode_boolean() {
		return getuCInv2jCInv_r9().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuOPPre2jMAPre_r5() {
		if (uOPPre2jMAPre_r5EClass == null) {
			uOPPre2jMAPre_r5EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
					.getEClassifiers().get(15);
		}
		return uOPPre2jMAPre_r5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPre2jMAPre_r5_AddElementActivity() {
		return (EReference) getuOPPre2jMAPre_r5().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPre2jMAPre_r5_MoveElementActivity() {
		return (EReference) getuOPPre2jMAPre_r5().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPre2jMAPre_r5_ChangeAttributeActivity() {
		return (EReference) getuOPPre2jMAPre_r5().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPre2jMAPre_r5_TransformForwardActivity() {
		return (EReference) getuOPPre2jMAPre_r5().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPre2jMAPre_r5_TransformMappingActivity() {
		return (EReference) getuOPPre2jMAPre_r5().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPre2jMAPre_r5_TransformBackwardActivity() {
		return (EReference) getuOPPre2jMAPre_r5().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPre2jMAPre_r5_ConflictCheckForwardActivity() {
		return (EReference) getuOPPre2jMAPre_r5().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPre2jMAPre_r5_ConflictCheckMappingActivity() {
		return (EReference) getuOPPre2jMAPre_r5().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPre2jMAPre_r5_ConflictCheckBackwardActivity() {
		return (EReference) getuOPPre2jMAPre_r5().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPre2jMAPre_r5_SynchronizeForwardActivity() {
		return (EReference) getuOPPre2jMAPre_r5().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPre2jMAPre_r5_SynchronizeBackwardActivity() {
		return (EReference) getuOPPre2jMAPre_r5().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPre2jMAPre_r5_RepairForwardActivity() {
		return (EReference) getuOPPre2jMAPre_r5().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPre2jMAPre_r5_RepairBackwardActivity() {
		return (EReference) getuOPPre2jMAPre_r5().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPre2jMAPre_r5__AddElement__EMap() {
		return getuOPPre2jMAPre_r5().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPre2jMAPre_r5__ChangeAttributeValues__TGGNode_EMap() {
		return getuOPPre2jMAPre_r5().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPre2jMAPre_r5__MoveElement__TGGNode_TGGNode_TGGNode() {
		return getuOPPre2jMAPre_r5().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPre2jMAPre_r5__TransformForward__TGGNode_boolean_boolean() {
		return getuOPPre2jMAPre_r5().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPre2jMAPre_r5__TransformMapping__TGGNode_boolean_boolean() {
		return getuOPPre2jMAPre_r5().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPre2jMAPre_r5__TransformBackward__TGGNode_boolean_boolean() {
		return getuOPPre2jMAPre_r5().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPre2jMAPre_r5__ConflictCheckForward__TGGNode() {
		return getuOPPre2jMAPre_r5().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPre2jMAPre_r5__ConflictCheckMapping__TGGNode() {
		return getuOPPre2jMAPre_r5().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPre2jMAPre_r5__ConflictCheckBackward__TGGNode() {
		return getuOPPre2jMAPre_r5().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPre2jMAPre_r5__SynchronizeForward__TGGNode_boolean() {
		return getuOPPre2jMAPre_r5().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPre2jMAPre_r5__SynchronizeBackward__TGGNode_boolean() {
		return getuOPPre2jMAPre_r5().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPre2jMAPre_r5__RepairForward__TGGNode_boolean() {
		return getuOPPre2jMAPre_r5().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPre2jMAPre_r5__RepairBackward__TGGNode_boolean() {
		return getuOPPre2jMAPre_r5().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuOPPreInt2jMAPreAssert_r7() {
		if (uOPPreInt2jMAPreAssert_r7EClass == null) {
			uOPPreInt2jMAPreAssert_r7EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
					.getEClassifiers().get(16);
		}
		return uOPPreInt2jMAPreAssert_r7EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPreInt2jMAPreAssert_r7_AddElementActivity() {
		return (EReference) getuOPPreInt2jMAPreAssert_r7().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPreInt2jMAPreAssert_r7_MoveElementActivity() {
		return (EReference) getuOPPreInt2jMAPreAssert_r7().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPreInt2jMAPreAssert_r7_ChangeAttributeActivity() {
		return (EReference) getuOPPreInt2jMAPreAssert_r7().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPreInt2jMAPreAssert_r7_TransformForwardActivity() {
		return (EReference) getuOPPreInt2jMAPreAssert_r7().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPreInt2jMAPreAssert_r7_TransformMappingActivity() {
		return (EReference) getuOPPreInt2jMAPreAssert_r7().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPreInt2jMAPreAssert_r7_TransformBackwardActivity() {
		return (EReference) getuOPPreInt2jMAPreAssert_r7().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPreInt2jMAPreAssert_r7_ConflictCheckForwardActivity() {
		return (EReference) getuOPPreInt2jMAPreAssert_r7().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPreInt2jMAPreAssert_r7_ConflictCheckMappingActivity() {
		return (EReference) getuOPPreInt2jMAPreAssert_r7().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPreInt2jMAPreAssert_r7_ConflictCheckBackwardActivity() {
		return (EReference) getuOPPreInt2jMAPreAssert_r7().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPreInt2jMAPreAssert_r7_SynchronizeForwardActivity() {
		return (EReference) getuOPPreInt2jMAPreAssert_r7().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPreInt2jMAPreAssert_r7_SynchronizeBackwardActivity() {
		return (EReference) getuOPPreInt2jMAPreAssert_r7().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPreInt2jMAPreAssert_r7_RepairForwardActivity() {
		return (EReference) getuOPPreInt2jMAPreAssert_r7().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPreInt2jMAPreAssert_r7_RepairBackwardActivity() {
		return (EReference) getuOPPreInt2jMAPreAssert_r7().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPreInt2jMAPreAssert_r7__AddElement__EMap() {
		return getuOPPreInt2jMAPreAssert_r7().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPreInt2jMAPreAssert_r7__ChangeAttributeValues__TGGNode_EMap() {
		return getuOPPreInt2jMAPreAssert_r7().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPreInt2jMAPreAssert_r7__MoveElement__TGGNode_TGGNode_TGGNode() {
		return getuOPPreInt2jMAPreAssert_r7().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPreInt2jMAPreAssert_r7__TransformForward__TGGNode_boolean_boolean() {
		return getuOPPreInt2jMAPreAssert_r7().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPreInt2jMAPreAssert_r7__TransformMapping__TGGNode_boolean_boolean() {
		return getuOPPreInt2jMAPreAssert_r7().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPreInt2jMAPreAssert_r7__TransformBackward__TGGNode_boolean_boolean() {
		return getuOPPreInt2jMAPreAssert_r7().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPreInt2jMAPreAssert_r7__ConflictCheckForward__TGGNode() {
		return getuOPPreInt2jMAPreAssert_r7().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPreInt2jMAPreAssert_r7__ConflictCheckMapping__TGGNode() {
		return getuOPPreInt2jMAPreAssert_r7().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPreInt2jMAPreAssert_r7__ConflictCheckBackward__TGGNode() {
		return getuOPPreInt2jMAPreAssert_r7().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPreInt2jMAPreAssert_r7__SynchronizeForward__TGGNode_boolean() {
		return getuOPPreInt2jMAPreAssert_r7().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPreInt2jMAPreAssert_r7__SynchronizeBackward__TGGNode_boolean() {
		return getuOPPreInt2jMAPreAssert_r7().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPreInt2jMAPreAssert_r7__RepairForward__TGGNode_boolean() {
		return getuOPPreInt2jMAPreAssert_r7().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPreInt2jMAPreAssert_r7__RepairBackward__TGGNode_boolean() {
		return getuOPPreInt2jMAPreAssert_r7().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuOPPosInt2jMAPosAssert_r8() {
		if (uOPPosInt2jMAPosAssert_r8EClass == null) {
			uOPPosInt2jMAPosAssert_r8EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
					.getEClassifiers().get(17);
		}
		return uOPPosInt2jMAPosAssert_r8EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPosInt2jMAPosAssert_r8_AddElementActivity() {
		return (EReference) getuOPPosInt2jMAPosAssert_r8().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPosInt2jMAPosAssert_r8_MoveElementActivity() {
		return (EReference) getuOPPosInt2jMAPosAssert_r8().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPosInt2jMAPosAssert_r8_ChangeAttributeActivity() {
		return (EReference) getuOPPosInt2jMAPosAssert_r8().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPosInt2jMAPosAssert_r8_TransformForwardActivity() {
		return (EReference) getuOPPosInt2jMAPosAssert_r8().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPosInt2jMAPosAssert_r8_TransformMappingActivity() {
		return (EReference) getuOPPosInt2jMAPosAssert_r8().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPosInt2jMAPosAssert_r8_TransformBackwardActivity() {
		return (EReference) getuOPPosInt2jMAPosAssert_r8().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPosInt2jMAPosAssert_r8_ConflictCheckForwardActivity() {
		return (EReference) getuOPPosInt2jMAPosAssert_r8().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPosInt2jMAPosAssert_r8_ConflictCheckMappingActivity() {
		return (EReference) getuOPPosInt2jMAPosAssert_r8().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPosInt2jMAPosAssert_r8_ConflictCheckBackwardActivity() {
		return (EReference) getuOPPosInt2jMAPosAssert_r8().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPosInt2jMAPosAssert_r8_SynchronizeForwardActivity() {
		return (EReference) getuOPPosInt2jMAPosAssert_r8().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPosInt2jMAPosAssert_r8_SynchronizeBackwardActivity() {
		return (EReference) getuOPPosInt2jMAPosAssert_r8().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPosInt2jMAPosAssert_r8_RepairForwardActivity() {
		return (EReference) getuOPPosInt2jMAPosAssert_r8().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPosInt2jMAPosAssert_r8_RepairBackwardActivity() {
		return (EReference) getuOPPosInt2jMAPosAssert_r8().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPosInt2jMAPosAssert_r8__AddElement__EMap() {
		return getuOPPosInt2jMAPosAssert_r8().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPosInt2jMAPosAssert_r8__ChangeAttributeValues__TGGNode_EMap() {
		return getuOPPosInt2jMAPosAssert_r8().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPosInt2jMAPosAssert_r8__MoveElement__TGGNode_TGGNode_TGGNode() {
		return getuOPPosInt2jMAPosAssert_r8().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPosInt2jMAPosAssert_r8__TransformForward__TGGNode_boolean_boolean() {
		return getuOPPosInt2jMAPosAssert_r8().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPosInt2jMAPosAssert_r8__TransformMapping__TGGNode_boolean_boolean() {
		return getuOPPosInt2jMAPosAssert_r8().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPosInt2jMAPosAssert_r8__TransformBackward__TGGNode_boolean_boolean() {
		return getuOPPosInt2jMAPosAssert_r8().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPosInt2jMAPosAssert_r8__ConflictCheckForward__TGGNode() {
		return getuOPPosInt2jMAPosAssert_r8().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPosInt2jMAPosAssert_r8__ConflictCheckMapping__TGGNode() {
		return getuOPPosInt2jMAPosAssert_r8().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPosInt2jMAPosAssert_r8__ConflictCheckBackward__TGGNode() {
		return getuOPPosInt2jMAPosAssert_r8().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPosInt2jMAPosAssert_r8__SynchronizeForward__TGGNode_boolean() {
		return getuOPPosInt2jMAPosAssert_r8().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPosInt2jMAPosAssert_r8__SynchronizeBackward__TGGNode_boolean() {
		return getuOPPosInt2jMAPosAssert_r8().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPosInt2jMAPosAssert_r8__RepairForward__TGGNode_boolean() {
		return getuOPPosInt2jMAPosAssert_r8().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPosInt2jMAPosAssert_r8__RepairBackward__TGGNode_boolean() {
		return getuOPPosInt2jMAPosAssert_r8().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuOperation2jMethod_Helper_r3() {
		if (uOperation2jMethod_Helper_r3EClass == null) {
			uOperation2jMethod_Helper_r3EClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GeneratedPackage.eNS_URI).getEClassifiers().get(18);
		}
		return uOperation2jMethod_Helper_r3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOperation2jMethod_Helper_r3_AddElementActivity() {
		return (EReference) getuOperation2jMethod_Helper_r3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOperation2jMethod_Helper_r3_MoveElementActivity() {
		return (EReference) getuOperation2jMethod_Helper_r3().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOperation2jMethod_Helper_r3_ChangeAttributeActivity() {
		return (EReference) getuOperation2jMethod_Helper_r3().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOperation2jMethod_Helper_r3_TransformForwardActivity() {
		return (EReference) getuOperation2jMethod_Helper_r3().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOperation2jMethod_Helper_r3_TransformMappingActivity() {
		return (EReference) getuOperation2jMethod_Helper_r3().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOperation2jMethod_Helper_r3_TransformBackwardActivity() {
		return (EReference) getuOperation2jMethod_Helper_r3().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOperation2jMethod_Helper_r3_ConflictCheckForwardActivity() {
		return (EReference) getuOperation2jMethod_Helper_r3().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOperation2jMethod_Helper_r3_ConflictCheckMappingActivity() {
		return (EReference) getuOperation2jMethod_Helper_r3().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOperation2jMethod_Helper_r3_ConflictCheckBackwardActivity() {
		return (EReference) getuOperation2jMethod_Helper_r3().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOperation2jMethod_Helper_r3_SynchronizeForwardActivity() {
		return (EReference) getuOperation2jMethod_Helper_r3().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOperation2jMethod_Helper_r3_SynchronizeBackwardActivity() {
		return (EReference) getuOperation2jMethod_Helper_r3().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOperation2jMethod_Helper_r3_RepairForwardActivity() {
		return (EReference) getuOperation2jMethod_Helper_r3().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOperation2jMethod_Helper_r3_RepairBackwardActivity() {
		return (EReference) getuOperation2jMethod_Helper_r3().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOperation2jMethod_Helper_r3__AddElement__EMap() {
		return getuOperation2jMethod_Helper_r3().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOperation2jMethod_Helper_r3__ChangeAttributeValues__TGGNode_EMap() {
		return getuOperation2jMethod_Helper_r3().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOperation2jMethod_Helper_r3__MoveElement__TGGNode_TGGNode_TGGNode() {
		return getuOperation2jMethod_Helper_r3().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOperation2jMethod_Helper_r3__TransformForward__TGGNode_boolean_boolean() {
		return getuOperation2jMethod_Helper_r3().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOperation2jMethod_Helper_r3__TransformMapping__TGGNode_boolean_boolean() {
		return getuOperation2jMethod_Helper_r3().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOperation2jMethod_Helper_r3__TransformBackward__TGGNode_boolean_boolean() {
		return getuOperation2jMethod_Helper_r3().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOperation2jMethod_Helper_r3__ConflictCheckForward__TGGNode() {
		return getuOperation2jMethod_Helper_r3().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOperation2jMethod_Helper_r3__ConflictCheckMapping__TGGNode() {
		return getuOperation2jMethod_Helper_r3().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOperation2jMethod_Helper_r3__ConflictCheckBackward__TGGNode() {
		return getuOperation2jMethod_Helper_r3().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOperation2jMethod_Helper_r3__SynchronizeForward__TGGNode_boolean() {
		return getuOperation2jMethod_Helper_r3().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOperation2jMethod_Helper_r3__SynchronizeBackward__TGGNode_boolean() {
		return getuOperation2jMethod_Helper_r3().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOperation2jMethod_Helper_r3__RepairForward__TGGNode_boolean() {
		return getuOperation2jMethod_Helper_r3().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOperation2jMethod_Helper_r3__RepairBackward__TGGNode_boolean() {
		return getuOperation2jMethod_Helper_r3().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuCInvInt2jCInvAssert_r10() {
		if (uCInvInt2jCInvAssert_r10EClass == null) {
			uCInvInt2jCInvAssert_r10EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
					.getEClassifiers().get(19);
		}
		return uCInvInt2jCInvAssert_r10EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCInvInt2jCInvAssert_r10_AddElementActivity() {
		return (EReference) getuCInvInt2jCInvAssert_r10().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCInvInt2jCInvAssert_r10_MoveElementActivity() {
		return (EReference) getuCInvInt2jCInvAssert_r10().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCInvInt2jCInvAssert_r10_ChangeAttributeActivity() {
		return (EReference) getuCInvInt2jCInvAssert_r10().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCInvInt2jCInvAssert_r10_TransformForwardActivity() {
		return (EReference) getuCInvInt2jCInvAssert_r10().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCInvInt2jCInvAssert_r10_TransformMappingActivity() {
		return (EReference) getuCInvInt2jCInvAssert_r10().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCInvInt2jCInvAssert_r10_TransformBackwardActivity() {
		return (EReference) getuCInvInt2jCInvAssert_r10().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCInvInt2jCInvAssert_r10_ConflictCheckForwardActivity() {
		return (EReference) getuCInvInt2jCInvAssert_r10().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCInvInt2jCInvAssert_r10_ConflictCheckMappingActivity() {
		return (EReference) getuCInvInt2jCInvAssert_r10().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCInvInt2jCInvAssert_r10_ConflictCheckBackwardActivity() {
		return (EReference) getuCInvInt2jCInvAssert_r10().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCInvInt2jCInvAssert_r10_SynchronizeForwardActivity() {
		return (EReference) getuCInvInt2jCInvAssert_r10().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCInvInt2jCInvAssert_r10_SynchronizeBackwardActivity() {
		return (EReference) getuCInvInt2jCInvAssert_r10().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCInvInt2jCInvAssert_r10_RepairForwardActivity() {
		return (EReference) getuCInvInt2jCInvAssert_r10().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuCInvInt2jCInvAssert_r10_RepairBackwardActivity() {
		return (EReference) getuCInvInt2jCInvAssert_r10().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCInvInt2jCInvAssert_r10__AddElement__EMap() {
		return getuCInvInt2jCInvAssert_r10().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCInvInt2jCInvAssert_r10__ChangeAttributeValues__TGGNode_EMap() {
		return getuCInvInt2jCInvAssert_r10().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCInvInt2jCInvAssert_r10__MoveElement__TGGNode_TGGNode_TGGNode() {
		return getuCInvInt2jCInvAssert_r10().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCInvInt2jCInvAssert_r10__TransformForward__TGGNode_boolean_boolean() {
		return getuCInvInt2jCInvAssert_r10().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCInvInt2jCInvAssert_r10__TransformMapping__TGGNode_boolean_boolean() {
		return getuCInvInt2jCInvAssert_r10().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCInvInt2jCInvAssert_r10__TransformBackward__TGGNode_boolean_boolean() {
		return getuCInvInt2jCInvAssert_r10().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCInvInt2jCInvAssert_r10__ConflictCheckForward__TGGNode() {
		return getuCInvInt2jCInvAssert_r10().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCInvInt2jCInvAssert_r10__ConflictCheckMapping__TGGNode() {
		return getuCInvInt2jCInvAssert_r10().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCInvInt2jCInvAssert_r10__ConflictCheckBackward__TGGNode() {
		return getuCInvInt2jCInvAssert_r10().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCInvInt2jCInvAssert_r10__SynchronizeForward__TGGNode_boolean() {
		return getuCInvInt2jCInvAssert_r10().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCInvInt2jCInvAssert_r10__SynchronizeBackward__TGGNode_boolean() {
		return getuCInvInt2jCInvAssert_r10().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCInvInt2jCInvAssert_r10__RepairForward__TGGNode_boolean() {
		return getuCInvInt2jCInvAssert_r10().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuCInvInt2jCInvAssert_r10__RepairBackward__TGGNode_boolean() {
		return getuCInvInt2jCInvAssert_r10().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuClass2jClass_Helper_r2() {
		if (uClass2jClass_Helper_r2EClass == null) {
			uClass2jClass_Helper_r2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
					.getEClassifiers().get(20);
		}
		return uClass2jClass_Helper_r2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Helper_r2_AddElementActivity() {
		return (EReference) getuClass2jClass_Helper_r2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Helper_r2_MoveElementActivity() {
		return (EReference) getuClass2jClass_Helper_r2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Helper_r2_ChangeAttributeActivity() {
		return (EReference) getuClass2jClass_Helper_r2().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Helper_r2_TransformForwardActivity() {
		return (EReference) getuClass2jClass_Helper_r2().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Helper_r2_TransformMappingActivity() {
		return (EReference) getuClass2jClass_Helper_r2().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Helper_r2_TransformBackwardActivity() {
		return (EReference) getuClass2jClass_Helper_r2().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Helper_r2_ConflictCheckForwardActivity() {
		return (EReference) getuClass2jClass_Helper_r2().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Helper_r2_ConflictCheckMappingActivity() {
		return (EReference) getuClass2jClass_Helper_r2().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Helper_r2_ConflictCheckBackwardActivity() {
		return (EReference) getuClass2jClass_Helper_r2().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Helper_r2_SynchronizeForwardActivity() {
		return (EReference) getuClass2jClass_Helper_r2().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Helper_r2_SynchronizeBackwardActivity() {
		return (EReference) getuClass2jClass_Helper_r2().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Helper_r2_RepairForwardActivity() {
		return (EReference) getuClass2jClass_Helper_r2().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuClass2jClass_Helper_r2_RepairBackwardActivity() {
		return (EReference) getuClass2jClass_Helper_r2().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Helper_r2__AddElement__EMap() {
		return getuClass2jClass_Helper_r2().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Helper_r2__ChangeAttributeValues__TGGNode_EMap() {
		return getuClass2jClass_Helper_r2().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Helper_r2__MoveElement__TGGNode_TGGNode_TGGNode() {
		return getuClass2jClass_Helper_r2().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Helper_r2__TransformForward__TGGNode_boolean_boolean() {
		return getuClass2jClass_Helper_r2().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Helper_r2__TransformMapping__TGGNode_boolean_boolean() {
		return getuClass2jClass_Helper_r2().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Helper_r2__TransformBackward__TGGNode_boolean_boolean() {
		return getuClass2jClass_Helper_r2().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Helper_r2__ConflictCheckForward__TGGNode() {
		return getuClass2jClass_Helper_r2().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Helper_r2__ConflictCheckMapping__TGGNode() {
		return getuClass2jClass_Helper_r2().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Helper_r2__ConflictCheckBackward__TGGNode() {
		return getuClass2jClass_Helper_r2().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Helper_r2__SynchronizeForward__TGGNode_boolean() {
		return getuClass2jClass_Helper_r2().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Helper_r2__SynchronizeBackward__TGGNode_boolean() {
		return getuClass2jClass_Helper_r2().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Helper_r2__RepairForward__TGGNode_boolean() {
		return getuClass2jClass_Helper_r2().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuClass2jClass_Helper_r2__RepairBackward__TGGNode_boolean() {
		return getuClass2jClass_Helper_r2().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuOPPos2jMAPos_r6() {
		if (uOPPos2jMAPos_r6EClass == null) {
			uOPPos2jMAPos_r6EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
					.getEClassifiers().get(21);
		}
		return uOPPos2jMAPos_r6EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPos2jMAPos_r6_AddElementActivity() {
		return (EReference) getuOPPos2jMAPos_r6().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPos2jMAPos_r6_MoveElementActivity() {
		return (EReference) getuOPPos2jMAPos_r6().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPos2jMAPos_r6_ChangeAttributeActivity() {
		return (EReference) getuOPPos2jMAPos_r6().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPos2jMAPos_r6_TransformForwardActivity() {
		return (EReference) getuOPPos2jMAPos_r6().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPos2jMAPos_r6_TransformMappingActivity() {
		return (EReference) getuOPPos2jMAPos_r6().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPos2jMAPos_r6_TransformBackwardActivity() {
		return (EReference) getuOPPos2jMAPos_r6().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPos2jMAPos_r6_ConflictCheckForwardActivity() {
		return (EReference) getuOPPos2jMAPos_r6().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPos2jMAPos_r6_ConflictCheckMappingActivity() {
		return (EReference) getuOPPos2jMAPos_r6().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPos2jMAPos_r6_ConflictCheckBackwardActivity() {
		return (EReference) getuOPPos2jMAPos_r6().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPos2jMAPos_r6_SynchronizeForwardActivity() {
		return (EReference) getuOPPos2jMAPos_r6().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPos2jMAPos_r6_SynchronizeBackwardActivity() {
		return (EReference) getuOPPos2jMAPos_r6().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPos2jMAPos_r6_RepairForwardActivity() {
		return (EReference) getuOPPos2jMAPos_r6().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuOPPos2jMAPos_r6_RepairBackwardActivity() {
		return (EReference) getuOPPos2jMAPos_r6().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPos2jMAPos_r6__AddElement__EMap() {
		return getuOPPos2jMAPos_r6().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPos2jMAPos_r6__ChangeAttributeValues__TGGNode_EMap() {
		return getuOPPos2jMAPos_r6().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPos2jMAPos_r6__MoveElement__TGGNode_TGGNode_TGGNode() {
		return getuOPPos2jMAPos_r6().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPos2jMAPos_r6__TransformForward__TGGNode_boolean_boolean() {
		return getuOPPos2jMAPos_r6().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPos2jMAPos_r6__TransformMapping__TGGNode_boolean_boolean() {
		return getuOPPos2jMAPos_r6().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPos2jMAPos_r6__TransformBackward__TGGNode_boolean_boolean() {
		return getuOPPos2jMAPos_r6().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPos2jMAPos_r6__ConflictCheckForward__TGGNode() {
		return getuOPPos2jMAPos_r6().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPos2jMAPos_r6__ConflictCheckMapping__TGGNode() {
		return getuOPPos2jMAPos_r6().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPos2jMAPos_r6__ConflictCheckBackward__TGGNode() {
		return getuOPPos2jMAPos_r6().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPos2jMAPos_r6__SynchronizeForward__TGGNode_boolean() {
		return getuOPPos2jMAPos_r6().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPos2jMAPos_r6__SynchronizeBackward__TGGNode_boolean() {
		return getuOPPos2jMAPos_r6().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPos2jMAPos_r6__RepairForward__TGGNode_boolean() {
		return getuOPPos2jMAPos_r6().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuOPPos2jMAPos_r6__RepairBackward__TGGNode_boolean() {
		return getuOPPos2jMAPos_r6().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuProperty2jField_Helper_r11() {
		if (uProperty2jField_Helper_r11EClass == null) {
			uProperty2jField_Helper_r11EClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(GeneratedPackage.eNS_URI).getEClassifiers().get(22);
		}
		return uProperty2jField_Helper_r11EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuProperty2jField_Helper_r11_AddElementActivity() {
		return (EReference) getuProperty2jField_Helper_r11().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuProperty2jField_Helper_r11_MoveElementActivity() {
		return (EReference) getuProperty2jField_Helper_r11().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuProperty2jField_Helper_r11_ChangeAttributeActivity() {
		return (EReference) getuProperty2jField_Helper_r11().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuProperty2jField_Helper_r11_TransformForwardActivity() {
		return (EReference) getuProperty2jField_Helper_r11().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuProperty2jField_Helper_r11_TransformMappingActivity() {
		return (EReference) getuProperty2jField_Helper_r11().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuProperty2jField_Helper_r11_TransformBackwardActivity() {
		return (EReference) getuProperty2jField_Helper_r11().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuProperty2jField_Helper_r11_ConflictCheckForwardActivity() {
		return (EReference) getuProperty2jField_Helper_r11().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuProperty2jField_Helper_r11_ConflictCheckMappingActivity() {
		return (EReference) getuProperty2jField_Helper_r11().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuProperty2jField_Helper_r11_ConflictCheckBackwardActivity() {
		return (EReference) getuProperty2jField_Helper_r11().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuProperty2jField_Helper_r11_SynchronizeForwardActivity() {
		return (EReference) getuProperty2jField_Helper_r11().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuProperty2jField_Helper_r11_SynchronizeBackwardActivity() {
		return (EReference) getuProperty2jField_Helper_r11().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuProperty2jField_Helper_r11_RepairForwardActivity() {
		return (EReference) getuProperty2jField_Helper_r11().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuProperty2jField_Helper_r11_RepairBackwardActivity() {
		return (EReference) getuProperty2jField_Helper_r11().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuProperty2jField_Helper_r11__AddElement__EMap() {
		return getuProperty2jField_Helper_r11().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuProperty2jField_Helper_r11__ChangeAttributeValues__TGGNode_EMap() {
		return getuProperty2jField_Helper_r11().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuProperty2jField_Helper_r11__MoveElement__TGGNode_TGGNode_TGGNode() {
		return getuProperty2jField_Helper_r11().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuProperty2jField_Helper_r11__TransformForward__TGGNode_boolean_boolean() {
		return getuProperty2jField_Helper_r11().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuProperty2jField_Helper_r11__TransformMapping__TGGNode_boolean_boolean() {
		return getuProperty2jField_Helper_r11().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuProperty2jField_Helper_r11__TransformBackward__TGGNode_boolean_boolean() {
		return getuProperty2jField_Helper_r11().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuProperty2jField_Helper_r11__ConflictCheckForward__TGGNode() {
		return getuProperty2jField_Helper_r11().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuProperty2jField_Helper_r11__ConflictCheckMapping__TGGNode() {
		return getuProperty2jField_Helper_r11().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuProperty2jField_Helper_r11__ConflictCheckBackward__TGGNode() {
		return getuProperty2jField_Helper_r11().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuProperty2jField_Helper_r11__SynchronizeForward__TGGNode_boolean() {
		return getuProperty2jField_Helper_r11().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuProperty2jField_Helper_r11__SynchronizeBackward__TGGNode_boolean() {
		return getuProperty2jField_Helper_r11().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuProperty2jField_Helper_r11__RepairForward__TGGNode_boolean() {
		return getuProperty2jField_Helper_r11().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getuProperty2jField_Helper_r11__RepairBackward__TGGNode_boolean() {
		return getuProperty2jField_Helper_r11().getEOperations().get(12);
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
			eClassifier.setInstanceClassName("de.silvawb.umlContract2java.generated." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //GeneratedPackageImpl
