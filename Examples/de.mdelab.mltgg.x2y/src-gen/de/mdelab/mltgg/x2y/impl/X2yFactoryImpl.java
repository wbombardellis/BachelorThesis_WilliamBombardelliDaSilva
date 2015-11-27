/**
 */
package de.mdelab.mltgg.x2y.impl;

import de.mdelab.mltgg.x2y.*;

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
public class X2yFactoryImpl extends EFactoryImpl implements X2yFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static X2yFactory init() {
		try {
			X2yFactory theX2yFactory = (X2yFactory) EPackage.Registry.INSTANCE.getEFactory(X2yPackage.eNS_URI);
			if (theX2yFactory != null) {
				return theX2yFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new X2yFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public X2yFactoryImpl() {
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
		case X2yPackage.CORR_AXIOM:
			return createCorrAxiom();
		case X2yPackage.CORR_RULE:
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
	public X2yPackage getX2yPackage() {
		return (X2yPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static X2yPackage getPackage() {
		return X2yPackage.eINSTANCE;
	}

} //X2yFactoryImpl
