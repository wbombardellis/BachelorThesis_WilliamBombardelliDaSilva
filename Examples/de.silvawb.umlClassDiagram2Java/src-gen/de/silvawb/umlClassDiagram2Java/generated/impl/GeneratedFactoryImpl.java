/**
 */
package de.silvawb.umlClassDiagram2Java.generated.impl;

import de.silvawb.umlClassDiagram2Java.generated.*;

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
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_OPERATIONAL_TGG:
			return createumlClassDiagram2JavaOperationalTGG();
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM:
			return createumlClassDiagram2JavaAxiom();
		case GeneratedPackage.UML_PACKAGE2_JAVA_PACKAGE:
			return createumlPackage2JavaPackage();
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1:
			return createumlClassDiagram2JavaAxiom_r1();
		case GeneratedPackage.UML_PACKAGE2_JAVA_PACKAGE_R2:
			return createumlPackage2JavaPackage_r2();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public umlClassDiagram2JavaOperationalTGG createumlClassDiagram2JavaOperationalTGG() {
		umlClassDiagram2JavaOperationalTGGImpl umlClassDiagram2JavaOperationalTGG = new umlClassDiagram2JavaOperationalTGGImpl();
		return umlClassDiagram2JavaOperationalTGG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public umlClassDiagram2JavaAxiom createumlClassDiagram2JavaAxiom() {
		umlClassDiagram2JavaAxiomImpl umlClassDiagram2JavaAxiom = new umlClassDiagram2JavaAxiomImpl();
		return umlClassDiagram2JavaAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public umlPackage2JavaPackage createumlPackage2JavaPackage() {
		umlPackage2JavaPackageImpl umlPackage2JavaPackage = new umlPackage2JavaPackageImpl();
		return umlPackage2JavaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public umlClassDiagram2JavaAxiom_r1 createumlClassDiagram2JavaAxiom_r1() {
		umlClassDiagram2JavaAxiom_r1Impl umlClassDiagram2JavaAxiom_r1 = new umlClassDiagram2JavaAxiom_r1Impl();
		return umlClassDiagram2JavaAxiom_r1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public umlPackage2JavaPackage_r2 createumlPackage2JavaPackage_r2() {
		umlPackage2JavaPackage_r2Impl umlPackage2JavaPackage_r2 = new umlPackage2JavaPackage_r2Impl();
		return umlPackage2JavaPackage_r2;
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
