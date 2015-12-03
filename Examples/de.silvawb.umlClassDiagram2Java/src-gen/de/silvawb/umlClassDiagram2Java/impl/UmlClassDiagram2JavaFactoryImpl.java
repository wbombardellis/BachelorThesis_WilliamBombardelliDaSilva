/**
 */
package de.silvawb.umlClassDiagram2Java.impl;

import de.silvawb.umlClassDiagram2Java.*;

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
public class UmlClassDiagram2JavaFactoryImpl extends EFactoryImpl implements UmlClassDiagram2JavaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UmlClassDiagram2JavaFactory init() {
		try {
			UmlClassDiagram2JavaFactory theUmlClassDiagram2JavaFactory = (UmlClassDiagram2JavaFactory) EPackage.Registry.INSTANCE
					.getEFactory(UmlClassDiagram2JavaPackage.eNS_URI);
			if (theUmlClassDiagram2JavaFactory != null) {
				return theUmlClassDiagram2JavaFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UmlClassDiagram2JavaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlClassDiagram2JavaFactoryImpl() {
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
		case UmlClassDiagram2JavaPackage.CORR_AXIOM:
			return createCorrAxiom();
		case UmlClassDiagram2JavaPackage.CORR_RULE:
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
	public UmlClassDiagram2JavaPackage getUmlClassDiagram2JavaPackage() {
		return (UmlClassDiagram2JavaPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UmlClassDiagram2JavaPackage getPackage() {
		return UmlClassDiagram2JavaPackage.eINSTANCE;
	}

} //UmlClassDiagram2JavaFactoryImpl
