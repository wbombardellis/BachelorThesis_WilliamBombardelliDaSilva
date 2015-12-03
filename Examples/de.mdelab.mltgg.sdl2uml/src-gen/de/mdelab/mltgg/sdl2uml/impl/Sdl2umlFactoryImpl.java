/**
 */
package de.mdelab.mltgg.sdl2uml.impl;

import de.mdelab.mltgg.sdl2uml.*;

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
public class Sdl2umlFactoryImpl extends EFactoryImpl implements Sdl2umlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Sdl2umlFactory init() {
		try {
			Sdl2umlFactory theSdl2umlFactory = (Sdl2umlFactory) EPackage.Registry.INSTANCE
					.getEFactory(Sdl2umlPackage.eNS_URI);
			if (theSdl2umlFactory != null) {
				return theSdl2umlFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Sdl2umlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sdl2umlFactoryImpl() {
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
		case Sdl2umlPackage.CORR_AXIOM:
			return createCorrAxiom();
		case Sdl2umlPackage.CORR_CONNECTION:
			return createCorrConnection();
		case Sdl2umlPackage.CORR_CONNECTABLE:
			return createCorrConnectable();
		case Sdl2umlPackage.CORR_PROCESS:
			return createCorrProcess();
		case Sdl2umlPackage.CORR_BLOCK:
			return createCorrBlock();
		case Sdl2umlPackage.CORR_SYSTEM:
			return createCorrSystem();
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
	public CorrAxiom createCorrAxiom() {
		CorrAxiomImpl corrAxiom = new CorrAxiomImpl();
		return corrAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrConnection createCorrConnection() {
		CorrConnectionImpl corrConnection = new CorrConnectionImpl();
		return corrConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrConnectable createCorrConnectable() {
		CorrConnectableImpl corrConnectable = new CorrConnectableImpl();
		return corrConnectable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrProcess createCorrProcess() {
		CorrProcessImpl corrProcess = new CorrProcessImpl();
		return corrProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrBlock createCorrBlock() {
		CorrBlockImpl corrBlock = new CorrBlockImpl();
		return corrBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrSystem createCorrSystem() {
		CorrSystemImpl corrSystem = new CorrSystemImpl();
		return corrSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sdl2umlPackage getSdl2umlPackage() {
		return (Sdl2umlPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Sdl2umlPackage getPackage() {
		return Sdl2umlPackage.eINSTANCE;
	}

} //Sdl2umlFactoryImpl
