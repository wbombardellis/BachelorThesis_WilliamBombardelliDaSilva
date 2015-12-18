/**
 */
package de.silvawb.umlInteraction2java.impl;

import de.silvawb.umlInteraction2java.*;

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
public class UmlInteraction2javaFactoryImpl extends EFactoryImpl implements UmlInteraction2javaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UmlInteraction2javaFactory init() {
		try {
			UmlInteraction2javaFactory theUmlInteraction2javaFactory = (UmlInteraction2javaFactory) EPackage.Registry.INSTANCE
					.getEFactory(UmlInteraction2javaPackage.eNS_URI);
			if (theUmlInteraction2javaFactory != null) {
				return theUmlInteraction2javaFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UmlInteraction2javaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlInteraction2javaFactoryImpl() {
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
		case UmlInteraction2javaPackage.CORR_AXIOM:
			return createCorrAxiom();
		case UmlInteraction2javaPackage.CORR_RULE:
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
	public UmlInteraction2javaPackage getUmlInteraction2javaPackage() {
		return (UmlInteraction2javaPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UmlInteraction2javaPackage getPackage() {
		return UmlInteraction2javaPackage.eINSTANCE;
	}

} //UmlInteraction2javaFactoryImpl
