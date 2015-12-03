/**
 */
package de.mdelab.mltgg.sdl2uml.generated.impl;

import de.mdelab.mltgg.sdl2uml.generated.*;

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
public class GeneratedFactoryImpl extends EFactoryImpl implements
		GeneratedFactory {
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
		case GeneratedPackage.SDL2UML_OPERATIONAL_TGG:
			return createSDL2UMLOperationalTGG();
		case GeneratedPackage.SDL2UML_AXIOM:
			return createSDL2UMLAxiom();
		case GeneratedPackage.SDL2UML_CONNECTION_VAR3:
			return createSDL2UMLConnectionVar3();
		case GeneratedPackage.SDL2UML_PROCESS:
			return createSDL2UMLProcess();
		case GeneratedPackage.SDL2UML_BLOCK:
			return createSDL2UMLBlock();
		case GeneratedPackage.SDL2UML_CONNECTION_VAR1:
			return createSDL2UMLConnectionVar1();
		case GeneratedPackage.SDL2UML_CONNECTION_VAR2:
			return createSDL2UMLConnectionVar2();
		case GeneratedPackage.SDL2UML_SYSTEM_BLOCK:
			return createSDL2UMLSystemBlock();
		case GeneratedPackage.SDL2UML_AXIOM_SDL2UML_AXIOM_R1:
			return createSDL2UMLAxiom_SDL2UMLAxiom_R1();
		case GeneratedPackage.SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1:
			return createSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1();
		case GeneratedPackage.SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1:
			return createSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1();
		case GeneratedPackage.SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1:
			return createSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1();
		case GeneratedPackage.SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1:
			return createSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1();
		case GeneratedPackage.SDL2UML_PROCESS_SDL2UML_PROCESS_R1:
			return createSDL2UMLProcess_SDL2UMLProcess_R1();
		case GeneratedPackage.SDL2UML_BLOCK_SDL2UML_BLOCK_R1:
			return createSDL2UMLBlock_SDL2UMLBlock_R1();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDL2UMLOperationalTGG createSDL2UMLOperationalTGG() {
		SDL2UMLOperationalTGGImpl sdl2UMLOperationalTGG = new SDL2UMLOperationalTGGImpl();
		return sdl2UMLOperationalTGG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDL2UMLAxiom createSDL2UMLAxiom() {
		SDL2UMLAxiomImpl sdl2UMLAxiom = new SDL2UMLAxiomImpl();
		return sdl2UMLAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDL2UMLConnectionVar3 createSDL2UMLConnectionVar3() {
		SDL2UMLConnectionVar3Impl sdl2UMLConnectionVar3 = new SDL2UMLConnectionVar3Impl();
		return sdl2UMLConnectionVar3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDL2UMLProcess createSDL2UMLProcess() {
		SDL2UMLProcessImpl sdl2UMLProcess = new SDL2UMLProcessImpl();
		return sdl2UMLProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDL2UMLBlock createSDL2UMLBlock() {
		SDL2UMLBlockImpl sdl2UMLBlock = new SDL2UMLBlockImpl();
		return sdl2UMLBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDL2UMLConnectionVar1 createSDL2UMLConnectionVar1() {
		SDL2UMLConnectionVar1Impl sdl2UMLConnectionVar1 = new SDL2UMLConnectionVar1Impl();
		return sdl2UMLConnectionVar1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDL2UMLConnectionVar2 createSDL2UMLConnectionVar2() {
		SDL2UMLConnectionVar2Impl sdl2UMLConnectionVar2 = new SDL2UMLConnectionVar2Impl();
		return sdl2UMLConnectionVar2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDL2UMLSystemBlock createSDL2UMLSystemBlock() {
		SDL2UMLSystemBlockImpl sdl2UMLSystemBlock = new SDL2UMLSystemBlockImpl();
		return sdl2UMLSystemBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDL2UMLAxiom_SDL2UMLAxiom_R1 createSDL2UMLAxiom_SDL2UMLAxiom_R1() {
		SDL2UMLAxiom_SDL2UMLAxiom_R1Impl sdl2UMLAxiom_SDL2UMLAxiom_R1 = new SDL2UMLAxiom_SDL2UMLAxiom_R1Impl();
		return sdl2UMLAxiom_SDL2UMLAxiom_R1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1 createSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1() {
		SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1Impl sdl2UMLSystemBlock_SDL2UMLSystemBlock_R1 = new SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1Impl();
		return sdl2UMLSystemBlock_SDL2UMLSystemBlock_R1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1 createSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1() {
		SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1Impl sdl2UMLConnectionVar2_SDL2UMLConnectionVar2_R1 = new SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1Impl();
		return sdl2UMLConnectionVar2_SDL2UMLConnectionVar2_R1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1 createSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1() {
		SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1Impl sdl2UMLConnectionVar1_SDL2UMLConnectionVar1_R1 = new SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1Impl();
		return sdl2UMLConnectionVar1_SDL2UMLConnectionVar1_R1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1 createSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1() {
		SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1Impl sdl2UMLConnectionVar3_SDL2UMLConnectionVar3_R1 = new SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1Impl();
		return sdl2UMLConnectionVar3_SDL2UMLConnectionVar3_R1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDL2UMLProcess_SDL2UMLProcess_R1 createSDL2UMLProcess_SDL2UMLProcess_R1() {
		SDL2UMLProcess_SDL2UMLProcess_R1Impl sdl2UMLProcess_SDL2UMLProcess_R1 = new SDL2UMLProcess_SDL2UMLProcess_R1Impl();
		return sdl2UMLProcess_SDL2UMLProcess_R1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDL2UMLBlock_SDL2UMLBlock_R1 createSDL2UMLBlock_SDL2UMLBlock_R1() {
		SDL2UMLBlock_SDL2UMLBlock_R1Impl sdl2UMLBlock_SDL2UMLBlock_R1 = new SDL2UMLBlock_SDL2UMLBlock_R1Impl();
		return sdl2UMLBlock_SDL2UMLBlock_R1;
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
