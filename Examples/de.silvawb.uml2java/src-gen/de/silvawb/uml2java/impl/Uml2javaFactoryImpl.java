/**
 */
package de.silvawb.uml2java.impl;

import de.silvawb.uml2java.*;

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
public class Uml2javaFactoryImpl extends EFactoryImpl implements Uml2javaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Uml2javaFactory init() {
		try {
			Uml2javaFactory theUml2javaFactory = (Uml2javaFactory) EPackage.Registry.INSTANCE
					.getEFactory(Uml2javaPackage.eNS_URI);
			if (theUml2javaFactory != null) {
				return theUml2javaFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Uml2javaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uml2javaFactoryImpl() {
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
		case Uml2javaPackage.CORR_AXIOM:
			return createCorrAxiom();
		case Uml2javaPackage.CORR_RULE:
			return createCorrRule();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrAxiom createCorrAxiom() {
		CorrAxiomImpl corrAxiom = new CorrAxiomImpl();
		return corrAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrRule createCorrRule() {
		CorrRuleImpl corrRule = new CorrRuleImpl();
		return corrRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uml2javaPackage getUml2javaPackage() {
		return (Uml2javaPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Uml2javaPackage getPackage() {
		return Uml2javaPackage.eINSTANCE;
	}

} //Uml2javaFactoryImpl
