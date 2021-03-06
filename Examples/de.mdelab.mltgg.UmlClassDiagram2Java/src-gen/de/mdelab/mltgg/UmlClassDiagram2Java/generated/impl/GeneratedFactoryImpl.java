/**
 */
package de.mdelab.mltgg.UmlClassDiagram2Java.generated.impl;

import de.mdelab.mltgg.UmlClassDiagram2Java.generated.*;

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
			return createUmlClassDiagram2JavaOperationalTGG();
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM:
			return createUmlClassDiagram2JavaAxiom();
		case GeneratedPackage.UML_PACKAGE2_JAVA_PACKAGE:
			return createUmlPackage2JavaPackage();
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1:
			return createUmlClassDiagram2JavaAxiom_r1();
		case GeneratedPackage.UML_PACKAGE2_JAVA_PACKAGE_R2:
			return createUmlPackage2JavaPackage_r2();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlClassDiagram2JavaOperationalTGG createUmlClassDiagram2JavaOperationalTGG() {
		UmlClassDiagram2JavaOperationalTGGImpl umlClassDiagram2JavaOperationalTGG = new UmlClassDiagram2JavaOperationalTGGImpl();
		return umlClassDiagram2JavaOperationalTGG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlClassDiagram2JavaAxiom createUmlClassDiagram2JavaAxiom() {
		UmlClassDiagram2JavaAxiomImpl umlClassDiagram2JavaAxiom = new UmlClassDiagram2JavaAxiomImpl();
		return umlClassDiagram2JavaAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlPackage2JavaPackage createUmlPackage2JavaPackage() {
		UmlPackage2JavaPackageImpl umlPackage2JavaPackage = new UmlPackage2JavaPackageImpl();
		return umlPackage2JavaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlClassDiagram2JavaAxiom_r1 createUmlClassDiagram2JavaAxiom_r1() {
		UmlClassDiagram2JavaAxiom_r1Impl umlClassDiagram2JavaAxiom_r1 = new UmlClassDiagram2JavaAxiom_r1Impl();
		return umlClassDiagram2JavaAxiom_r1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlPackage2JavaPackage_r2 createUmlPackage2JavaPackage_r2() {
		UmlPackage2JavaPackage_r2Impl umlPackage2JavaPackage_r2 = new UmlPackage2JavaPackage_r2Impl();
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
