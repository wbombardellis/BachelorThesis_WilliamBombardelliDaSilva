/**
 */
package de.mdelab.mltgg.x2y.generated.impl;

import de.mdelab.mltgg.x2y.generated.*;

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
		case GeneratedPackage.X2Y_OPERATIONAL_TGG:
			return createx2yOperationalTGG();
		case GeneratedPackage.X2Y_AXIOM:
			return createx2yAxiom();
		case GeneratedPackage.X2Y_AXIOM_R1:
			return createx2yAxiom_r1();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public x2yOperationalTGG createx2yOperationalTGG() {
		x2yOperationalTGGImpl x2yOperationalTGG = new x2yOperationalTGGImpl();
		return x2yOperationalTGG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public x2yAxiom createx2yAxiom() {
		x2yAxiomImpl x2yAxiom = new x2yAxiomImpl();
		return x2yAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public x2yAxiom_r1 createx2yAxiom_r1() {
		x2yAxiom_r1Impl x2yAxiom_r1 = new x2yAxiom_r1Impl();
		return x2yAxiom_r1;
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
