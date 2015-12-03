/**
 */
package de.silvawb.uml2blocky.impl;

import de.silvawb.uml2blocky.*;

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
public class Uml2blockyFactoryImpl extends EFactoryImpl implements Uml2blockyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Uml2blockyFactory init() {
		try {
			Uml2blockyFactory theUml2blockyFactory = (Uml2blockyFactory) EPackage.Registry.INSTANCE
					.getEFactory(Uml2blockyPackage.eNS_URI);
			if (theUml2blockyFactory != null) {
				return theUml2blockyFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Uml2blockyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uml2blockyFactoryImpl() {
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
		case Uml2blockyPackage.CORR_AXIOM:
			return createCorrAxiom();
		case Uml2blockyPackage.CORR_RULE:
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
	public Uml2blockyPackage getUml2blockyPackage() {
		return (Uml2blockyPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Uml2blockyPackage getPackage() {
		return Uml2blockyPackage.eINSTANCE;
	}

} //Uml2blockyFactoryImpl
