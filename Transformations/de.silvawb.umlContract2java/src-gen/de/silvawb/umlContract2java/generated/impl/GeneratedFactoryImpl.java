/**
 */
package de.silvawb.umlContract2java.generated.impl;

import de.silvawb.umlContract2java.generated.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneratedFactoryImpl extends EFactoryImpl implements GeneratedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GeneratedFactory init() {
		try {
			GeneratedFactory theGeneratedFactory = (GeneratedFactory) EPackage.Registry.INSTANCE
					.getEFactory(GeneratedPackage.eNS_URI);
			if (theGeneratedFactory != null) {
				return theGeneratedFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GeneratedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case GeneratedPackage.UML_CONTRACT2JAVA_OPERATIONAL_TGG:
			return createumlContract2javaOperationalTGG();
		case GeneratedPackage.UML_CONTRACT2JAVA_AXIOM:
			return createumlContract2javaAxiom();
		case GeneratedPackage.UOP_POS2J_MA_POS:
			return createuOPPos2jMAPos();
		case GeneratedPackage.UCLASS2J_CLASS_HELPER:
			return createuClass2jClass_Helper();
		case GeneratedPackage.UOP_PRE2J_MA_PRE:
			return createuOPPre2jMAPre();
		case GeneratedPackage.UOP_PRE_INT2J_MA_PRE_ASSERT:
			return createuOPPreInt2jMAPreAssert();
		case GeneratedPackage.UOP_POS_INT2J_MA_POS_ASSERT:
			return createuOPPosInt2jMAPosAssert();
		case GeneratedPackage.UOPERATION2J_METHOD_HELPER:
			return createuOperation2jMethod_Helper();
		case GeneratedPackage.UO_PARAMENTER2J_MARGUMENT:
			return createuOParamenter2jMArgument();
		case GeneratedPackage.UML_CONTRACT2JAVA_AXIOM_R1:
			return createumlContract2javaAxiom_r1();
		case GeneratedPackage.UCLASS2J_CLASS_HELPER_R2:
			return createuClass2jClass_Helper_r2();
		case GeneratedPackage.UOP_PRE_INT2J_MA_PRE_ASSERT_R7:
			return createuOPPreInt2jMAPreAssert_r7();
		case GeneratedPackage.UO_PARAMENTER2J_MARGUMENT_R4:
			return createuOParamenter2jMArgument_r4();
		case GeneratedPackage.UOP_POS2J_MA_POS_R6:
			return createuOPPos2jMAPos_r6();
		case GeneratedPackage.UOP_PRE2J_MA_PRE_R5:
			return createuOPPre2jMAPre_r5();
		case GeneratedPackage.UOPERATION2J_METHOD_HELPER_R3:
			return createuOperation2jMethod_Helper_r3();
		case GeneratedPackage.UOP_POS_INT2J_MA_POS_ASSERT_R8:
			return createuOPPosInt2jMAPosAssert_r8();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public umlContract2javaOperationalTGG createumlContract2javaOperationalTGG() {
		umlContract2javaOperationalTGGImpl umlContract2javaOperationalTGG = new umlContract2javaOperationalTGGImpl();
		return umlContract2javaOperationalTGG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public umlContract2javaAxiom createumlContract2javaAxiom() {
		umlContract2javaAxiomImpl umlContract2javaAxiom = new umlContract2javaAxiomImpl();
		return umlContract2javaAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uOPPos2jMAPos createuOPPos2jMAPos() {
		uOPPos2jMAPosImpl uOPPos2jMAPos = new uOPPos2jMAPosImpl();
		return uOPPos2jMAPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uClass2jClass_Helper createuClass2jClass_Helper() {
		uClass2jClass_HelperImpl uClass2jClass_Helper = new uClass2jClass_HelperImpl();
		return uClass2jClass_Helper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uOPPre2jMAPre createuOPPre2jMAPre() {
		uOPPre2jMAPreImpl uOPPre2jMAPre = new uOPPre2jMAPreImpl();
		return uOPPre2jMAPre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uOPPreInt2jMAPreAssert createuOPPreInt2jMAPreAssert() {
		uOPPreInt2jMAPreAssertImpl uOPPreInt2jMAPreAssert = new uOPPreInt2jMAPreAssertImpl();
		return uOPPreInt2jMAPreAssert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uOPPosInt2jMAPosAssert createuOPPosInt2jMAPosAssert() {
		uOPPosInt2jMAPosAssertImpl uOPPosInt2jMAPosAssert = new uOPPosInt2jMAPosAssertImpl();
		return uOPPosInt2jMAPosAssert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uOperation2jMethod_Helper createuOperation2jMethod_Helper() {
		uOperation2jMethod_HelperImpl uOperation2jMethod_Helper = new uOperation2jMethod_HelperImpl();
		return uOperation2jMethod_Helper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uOParamenter2jMArgument createuOParamenter2jMArgument() {
		uOParamenter2jMArgumentImpl uOParamenter2jMArgument = new uOParamenter2jMArgumentImpl();
		return uOParamenter2jMArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public umlContract2javaAxiom_r1 createumlContract2javaAxiom_r1() {
		umlContract2javaAxiom_r1Impl umlContract2javaAxiom_r1 = new umlContract2javaAxiom_r1Impl();
		return umlContract2javaAxiom_r1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uClass2jClass_Helper_r2 createuClass2jClass_Helper_r2() {
		uClass2jClass_Helper_r2Impl uClass2jClass_Helper_r2 = new uClass2jClass_Helper_r2Impl();
		return uClass2jClass_Helper_r2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uOPPreInt2jMAPreAssert_r7 createuOPPreInt2jMAPreAssert_r7() {
		uOPPreInt2jMAPreAssert_r7Impl uOPPreInt2jMAPreAssert_r7 = new uOPPreInt2jMAPreAssert_r7Impl();
		return uOPPreInt2jMAPreAssert_r7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uOParamenter2jMArgument_r4 createuOParamenter2jMArgument_r4() {
		uOParamenter2jMArgument_r4Impl uOParamenter2jMArgument_r4 = new uOParamenter2jMArgument_r4Impl();
		return uOParamenter2jMArgument_r4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uOPPos2jMAPos_r6 createuOPPos2jMAPos_r6() {
		uOPPos2jMAPos_r6Impl uOPPos2jMAPos_r6 = new uOPPos2jMAPos_r6Impl();
		return uOPPos2jMAPos_r6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uOPPre2jMAPre_r5 createuOPPre2jMAPre_r5() {
		uOPPre2jMAPre_r5Impl uOPPre2jMAPre_r5 = new uOPPre2jMAPre_r5Impl();
		return uOPPre2jMAPre_r5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uOperation2jMethod_Helper_r3 createuOperation2jMethod_Helper_r3() {
		uOperation2jMethod_Helper_r3Impl uOperation2jMethod_Helper_r3 = new uOperation2jMethod_Helper_r3Impl();
		return uOperation2jMethod_Helper_r3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uOPPosInt2jMAPosAssert_r8 createuOPPosInt2jMAPosAssert_r8() {
		uOPPosInt2jMAPosAssert_r8Impl uOPPosInt2jMAPosAssert_r8 = new uOPPosInt2jMAPosAssert_r8Impl();
		return uOPPosInt2jMAPosAssert_r8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedPackage getGeneratedPackage() {
		return (GeneratedPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GeneratedPackage getPackage() {
		return GeneratedPackage.eINSTANCE;
	}

} //GeneratedFactoryImpl
