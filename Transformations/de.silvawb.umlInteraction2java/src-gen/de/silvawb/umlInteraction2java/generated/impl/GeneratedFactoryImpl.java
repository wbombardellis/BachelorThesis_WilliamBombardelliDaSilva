/**
 */
package de.silvawb.umlInteraction2java.generated.impl;

import de.silvawb.umlInteraction2java.generated.*;

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
		case GeneratedPackage.UML_INTERACTION2JAVA_OPERATIONAL_TGG:
			return createumlInteraction2javaOperationalTGG();
		case GeneratedPackage.UML_INTERACTION2JAVA_AXIOM:
			return createumlInteraction2javaAxiom();
		case GeneratedPackage.UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2:
			return createuMessageSequence2jInteractionAnnotation_2();
		case GeneratedPackage.UINTERFACE2J_INTERFACE_HELPER:
			return createuInterface2jInterface_Helper();
		case GeneratedPackage.UI_OPERATION2J_IMETHOD_HELPER:
			return createuIOperation2jIMethod_Helper();
		case GeneratedPackage.UI_LIFELINE2J_MANNOTATION:
			return createuILifeline2jMAnnotation();
		case GeneratedPackage.UOPERATION2J_METHOD_HELPER:
			return createuOperation2jMethod_Helper();
		case GeneratedPackage.UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION:
			return createuMessageSequence2jInteractionAnnotation();
		case GeneratedPackage.UML_INTERACTION2JAVA_AXIOM_R1:
			return createumlInteraction2javaAxiom_r1();
		case GeneratedPackage.UI_LIFELINE2J_MANNOTATION_R2:
			return createuILifeline2jMAnnotation_r2();
		case GeneratedPackage.UINTERFACE2J_INTERFACE_HELPER_R6:
			return createuInterface2jInterface_Helper_r6();
		case GeneratedPackage.UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5:
			return createuMessageSequence2jInteractionAnnotation_2_r5();
		case GeneratedPackage.UOPERATION2J_METHOD_HELPER_R4:
			return createuOperation2jMethod_Helper_r4();
		case GeneratedPackage.UI_OPERATION2J_IMETHOD_HELPER_R7:
			return createuIOperation2jIMethod_Helper_r7();
		case GeneratedPackage.UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3:
			return createuMessageSequence2jInteractionAnnotation_r3();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public umlInteraction2javaOperationalTGG createumlInteraction2javaOperationalTGG() {
		umlInteraction2javaOperationalTGGImpl umlInteraction2javaOperationalTGG = new umlInteraction2javaOperationalTGGImpl();
		return umlInteraction2javaOperationalTGG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public umlInteraction2javaAxiom createumlInteraction2javaAxiom() {
		umlInteraction2javaAxiomImpl umlInteraction2javaAxiom = new umlInteraction2javaAxiomImpl();
		return umlInteraction2javaAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uMessageSequence2jInteractionAnnotation_2 createuMessageSequence2jInteractionAnnotation_2() {
		uMessageSequence2jInteractionAnnotation_2Impl uMessageSequence2jInteractionAnnotation_2 = new uMessageSequence2jInteractionAnnotation_2Impl();
		return uMessageSequence2jInteractionAnnotation_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uInterface2jInterface_Helper createuInterface2jInterface_Helper() {
		uInterface2jInterface_HelperImpl uInterface2jInterface_Helper = new uInterface2jInterface_HelperImpl();
		return uInterface2jInterface_Helper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uIOperation2jIMethod_Helper createuIOperation2jIMethod_Helper() {
		uIOperation2jIMethod_HelperImpl uIOperation2jIMethod_Helper = new uIOperation2jIMethod_HelperImpl();
		return uIOperation2jIMethod_Helper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uILifeline2jMAnnotation createuILifeline2jMAnnotation() {
		uILifeline2jMAnnotationImpl uILifeline2jMAnnotation = new uILifeline2jMAnnotationImpl();
		return uILifeline2jMAnnotation;
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
	public uMessageSequence2jInteractionAnnotation createuMessageSequence2jInteractionAnnotation() {
		uMessageSequence2jInteractionAnnotationImpl uMessageSequence2jInteractionAnnotation = new uMessageSequence2jInteractionAnnotationImpl();
		return uMessageSequence2jInteractionAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public umlInteraction2javaAxiom_r1 createumlInteraction2javaAxiom_r1() {
		umlInteraction2javaAxiom_r1Impl umlInteraction2javaAxiom_r1 = new umlInteraction2javaAxiom_r1Impl();
		return umlInteraction2javaAxiom_r1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uILifeline2jMAnnotation_r2 createuILifeline2jMAnnotation_r2() {
		uILifeline2jMAnnotation_r2Impl uILifeline2jMAnnotation_r2 = new uILifeline2jMAnnotation_r2Impl();
		return uILifeline2jMAnnotation_r2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uInterface2jInterface_Helper_r6 createuInterface2jInterface_Helper_r6() {
		uInterface2jInterface_Helper_r6Impl uInterface2jInterface_Helper_r6 = new uInterface2jInterface_Helper_r6Impl();
		return uInterface2jInterface_Helper_r6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uMessageSequence2jInteractionAnnotation_2_r5 createuMessageSequence2jInteractionAnnotation_2_r5() {
		uMessageSequence2jInteractionAnnotation_2_r5Impl uMessageSequence2jInteractionAnnotation_2_r5 = new uMessageSequence2jInteractionAnnotation_2_r5Impl();
		return uMessageSequence2jInteractionAnnotation_2_r5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uOperation2jMethod_Helper_r4 createuOperation2jMethod_Helper_r4() {
		uOperation2jMethod_Helper_r4Impl uOperation2jMethod_Helper_r4 = new uOperation2jMethod_Helper_r4Impl();
		return uOperation2jMethod_Helper_r4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uIOperation2jIMethod_Helper_r7 createuIOperation2jIMethod_Helper_r7() {
		uIOperation2jIMethod_Helper_r7Impl uIOperation2jIMethod_Helper_r7 = new uIOperation2jIMethod_Helper_r7Impl();
		return uIOperation2jIMethod_Helper_r7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uMessageSequence2jInteractionAnnotation_r3 createuMessageSequence2jInteractionAnnotation_r3() {
		uMessageSequence2jInteractionAnnotation_r3Impl uMessageSequence2jInteractionAnnotation_r3 = new uMessageSequence2jInteractionAnnotation_r3Impl();
		return uMessageSequence2jInteractionAnnotation_r3;
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
