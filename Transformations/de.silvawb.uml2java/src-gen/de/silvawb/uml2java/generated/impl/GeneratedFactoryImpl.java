/**
 */
package de.silvawb.uml2java.generated.impl;

import de.silvawb.uml2java.generated.*;

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
		case GeneratedPackage.UML2JAVA_OPERATIONAL_TGG:
			return createuml2javaOperationalTGG();
		case GeneratedPackage.UML2JAVA_AXIOM:
			return createuml2javaAxiom();
		case GeneratedPackage.UI_ATTRIBUTE2J_IATTRIBUTE:
			return createuIAttribute2jIAttribute();
		case GeneratedPackage.UC_OPERATION2J_CMETHOD_RULE:
			return createuCOperation2jCMethod_Rule();
		case GeneratedPackage.UINTERFACE2J_INTERFACE_RULE:
			return createuInterface2jInterface_Rule();
		case GeneratedPackage.UI_OPERATION2J_IMETHOD_RULE:
			return createuIOperation2jIMethod_Rule();
		case GeneratedPackage.UI_REALIZATION2J_IIMPLEMENTATION_RULE:
			return createuIRealization2jIImplementation_Rule();
		case GeneratedPackage.UC_ATTRIBUTE2J_CATTRIBUTE_RULE:
			return createuCAttribute2jCAttribute_Rule();
		case GeneratedPackage.UPACKAGE2J_PACKAGE_RULE:
			return createuPackage2jPackage_Rule();
		case GeneratedPackage.UCLASS2J_CLASS_RULE:
			return createuClass2jClass_Rule();
		case GeneratedPackage.UML2JAVA_AXIOM_R1:
			return createuml2javaAxiom_r1();
		case GeneratedPackage.UI_ATTRIBUTE2J_IATTRIBUTE_R7:
			return createuIAttribute2jIAttribute_r7();
		case GeneratedPackage.UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4:
			return createuCAttribute2jCAttribute_Rule_r4();
		case GeneratedPackage.UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9:
			return createuIRealization2jIImplementation_Rule_r9();
		case GeneratedPackage.UCLASS2J_CLASS_RULE_R3:
			return createuClass2jClass_Rule_r3();
		case GeneratedPackage.UI_OPERATION2J_IMETHOD_RULE_R8:
			return createuIOperation2jIMethod_Rule_r8();
		case GeneratedPackage.UINTERFACE2J_INTERFACE_RULE_R6:
			return createuInterface2jInterface_Rule_r6();
		case GeneratedPackage.UC_OPERATION2J_CMETHOD_RULE_R5:
			return createuCOperation2jCMethod_Rule_r5();
		case GeneratedPackage.UPACKAGE2J_PACKAGE_RULE_R2:
			return createuPackage2jPackage_Rule_r2();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uml2javaOperationalTGG createuml2javaOperationalTGG() {
		uml2javaOperationalTGGImpl uml2javaOperationalTGG = new uml2javaOperationalTGGImpl();
		return uml2javaOperationalTGG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uml2javaAxiom createuml2javaAxiom() {
		uml2javaAxiomImpl uml2javaAxiom = new uml2javaAxiomImpl();
		return uml2javaAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uIAttribute2jIAttribute createuIAttribute2jIAttribute() {
		uIAttribute2jIAttributeImpl uIAttribute2jIAttribute = new uIAttribute2jIAttributeImpl();
		return uIAttribute2jIAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uCOperation2jCMethod_Rule createuCOperation2jCMethod_Rule() {
		uCOperation2jCMethod_RuleImpl uCOperation2jCMethod_Rule = new uCOperation2jCMethod_RuleImpl();
		return uCOperation2jCMethod_Rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uInterface2jInterface_Rule createuInterface2jInterface_Rule() {
		uInterface2jInterface_RuleImpl uInterface2jInterface_Rule = new uInterface2jInterface_RuleImpl();
		return uInterface2jInterface_Rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uIOperation2jIMethod_Rule createuIOperation2jIMethod_Rule() {
		uIOperation2jIMethod_RuleImpl uIOperation2jIMethod_Rule = new uIOperation2jIMethod_RuleImpl();
		return uIOperation2jIMethod_Rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uIRealization2jIImplementation_Rule createuIRealization2jIImplementation_Rule() {
		uIRealization2jIImplementation_RuleImpl uIRealization2jIImplementation_Rule = new uIRealization2jIImplementation_RuleImpl();
		return uIRealization2jIImplementation_Rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uCAttribute2jCAttribute_Rule createuCAttribute2jCAttribute_Rule() {
		uCAttribute2jCAttribute_RuleImpl uCAttribute2jCAttribute_Rule = new uCAttribute2jCAttribute_RuleImpl();
		return uCAttribute2jCAttribute_Rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uPackage2jPackage_Rule createuPackage2jPackage_Rule() {
		uPackage2jPackage_RuleImpl uPackage2jPackage_Rule = new uPackage2jPackage_RuleImpl();
		return uPackage2jPackage_Rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uClass2jClass_Rule createuClass2jClass_Rule() {
		uClass2jClass_RuleImpl uClass2jClass_Rule = new uClass2jClass_RuleImpl();
		return uClass2jClass_Rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uml2javaAxiom_r1 createuml2javaAxiom_r1() {
		uml2javaAxiom_r1Impl uml2javaAxiom_r1 = new uml2javaAxiom_r1Impl();
		return uml2javaAxiom_r1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uIAttribute2jIAttribute_r7 createuIAttribute2jIAttribute_r7() {
		uIAttribute2jIAttribute_r7Impl uIAttribute2jIAttribute_r7 = new uIAttribute2jIAttribute_r7Impl();
		return uIAttribute2jIAttribute_r7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uCAttribute2jCAttribute_Rule_r4 createuCAttribute2jCAttribute_Rule_r4() {
		uCAttribute2jCAttribute_Rule_r4Impl uCAttribute2jCAttribute_Rule_r4 = new uCAttribute2jCAttribute_Rule_r4Impl();
		return uCAttribute2jCAttribute_Rule_r4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uIRealization2jIImplementation_Rule_r9 createuIRealization2jIImplementation_Rule_r9() {
		uIRealization2jIImplementation_Rule_r9Impl uIRealization2jIImplementation_Rule_r9 = new uIRealization2jIImplementation_Rule_r9Impl();
		return uIRealization2jIImplementation_Rule_r9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uClass2jClass_Rule_r3 createuClass2jClass_Rule_r3() {
		uClass2jClass_Rule_r3Impl uClass2jClass_Rule_r3 = new uClass2jClass_Rule_r3Impl();
		return uClass2jClass_Rule_r3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uIOperation2jIMethod_Rule_r8 createuIOperation2jIMethod_Rule_r8() {
		uIOperation2jIMethod_Rule_r8Impl uIOperation2jIMethod_Rule_r8 = new uIOperation2jIMethod_Rule_r8Impl();
		return uIOperation2jIMethod_Rule_r8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uInterface2jInterface_Rule_r6 createuInterface2jInterface_Rule_r6() {
		uInterface2jInterface_Rule_r6Impl uInterface2jInterface_Rule_r6 = new uInterface2jInterface_Rule_r6Impl();
		return uInterface2jInterface_Rule_r6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uCOperation2jCMethod_Rule_r5 createuCOperation2jCMethod_Rule_r5() {
		uCOperation2jCMethod_Rule_r5Impl uCOperation2jCMethod_Rule_r5 = new uCOperation2jCMethod_Rule_r5Impl();
		return uCOperation2jCMethod_Rule_r5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uPackage2jPackage_Rule_r2 createuPackage2jPackage_Rule_r2() {
		uPackage2jPackage_Rule_r2Impl uPackage2jPackage_Rule_r2 = new uPackage2jPackage_Rule_r2Impl();
		return uPackage2jPackage_Rule_r2;
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
