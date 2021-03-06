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
		case GeneratedPackage.UPACKAGE2J_PACKAGE_RULE:
			return createuPackage2jPackage_Rule();
		case GeneratedPackage.UML2JAVA_AXIOM_R1:
			return createuml2javaAxiom_r1();
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
	public uPackage2jPackage_Rule createuPackage2jPackage_Rule() {
		uPackage2jPackage_RuleImpl uPackage2jPackage_Rule = new uPackage2jPackage_RuleImpl();
		return uPackage2jPackage_Rule;
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
