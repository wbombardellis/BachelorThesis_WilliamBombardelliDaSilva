/**
 */
package de.mdelab.mltgg.sdl2uml.impl;

import de.mdelab.mltgg.mote2.Mote2Package;

import de.mdelab.mltgg.mote2.sdm.SdmPackage;

import de.mdelab.mltgg.sdl2uml.CorrAxiom;
import de.mdelab.mltgg.sdl2uml.CorrBlock;
import de.mdelab.mltgg.sdl2uml.CorrConnectable;
import de.mdelab.mltgg.sdl2uml.CorrConnection;
import de.mdelab.mltgg.sdl2uml.CorrProcess;
import de.mdelab.mltgg.sdl2uml.CorrSystem;
import de.mdelab.mltgg.sdl2uml.Sdl2umlFactory;
import de.mdelab.mltgg.sdl2uml.Sdl2umlPackage;

import de.mdelab.mltgg.sdl2uml.generated.GeneratedPackage;

import de.mdelab.mltgg.sdl2uml.generated.impl.GeneratedPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Sdl2umlPackageImpl extends EPackageImpl implements Sdl2umlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corrAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corrConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corrConnectableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corrProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corrBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corrSystemEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.mdelab.mltgg.sdl2uml.Sdl2umlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Sdl2umlPackageImpl() {
		super(eNS_URI, Sdl2umlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Sdl2umlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Sdl2umlPackage init() {
		if (isInited)
			return (Sdl2umlPackage) EPackage.Registry.INSTANCE
					.getEPackage(Sdl2umlPackage.eNS_URI);

		// Obtain or create and register package
		Sdl2umlPackageImpl theSdl2umlPackage = (Sdl2umlPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof Sdl2umlPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new Sdl2umlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SdmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		GeneratedPackageImpl theGeneratedPackage = (GeneratedPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(GeneratedPackage.eNS_URI) instanceof GeneratedPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(GeneratedPackage.eNS_URI)
				: GeneratedPackage.eINSTANCE);

		// Create package meta-data objects
		theSdl2umlPackage.createPackageContents();
		theGeneratedPackage.createPackageContents();

		// Initialize created meta-data
		theSdl2umlPackage.initializePackageContents();
		theGeneratedPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSdl2umlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Sdl2umlPackage.eNS_URI,
				theSdl2umlPackage);
		return theSdl2umlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrAxiom() {
		return corrAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrConnection() {
		return corrConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrConnectable() {
		return corrConnectableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrProcess() {
		return corrProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrBlock() {
		return corrBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrSystem() {
		return corrSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sdl2umlFactory getSdl2umlFactory() {
		return (Sdl2umlFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		corrAxiomEClass = createEClass(CORR_AXIOM);

		corrConnectionEClass = createEClass(CORR_CONNECTION);

		corrConnectableEClass = createEClass(CORR_CONNECTABLE);

		corrProcessEClass = createEClass(CORR_PROCESS);

		corrBlockEClass = createEClass(CORR_BLOCK);

		corrSystemEClass = createEClass(CORR_SYSTEM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GeneratedPackage theGeneratedPackage = (GeneratedPackage) EPackage.Registry.INSTANCE
				.getEPackage(GeneratedPackage.eNS_URI);
		Mote2Package theMote2Package = (Mote2Package) EPackage.Registry.INSTANCE
				.getEPackage(Mote2Package.eNS_URI);

		// Add subpackages
		getESubpackages().add(theGeneratedPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		corrAxiomEClass.getESuperTypes().add(theMote2Package.getTGGNode());
		corrConnectionEClass.getESuperTypes().add(theMote2Package.getTGGNode());
		corrConnectableEClass.getESuperTypes()
				.add(theMote2Package.getTGGNode());
		corrProcessEClass.getESuperTypes().add(this.getCorrConnectable());
		corrBlockEClass.getESuperTypes().add(this.getCorrConnectable());
		corrSystemEClass.getESuperTypes().add(this.getCorrBlock());

		// Initialize classes, features, and operations; add parameters
		initEClass(corrAxiomEClass, CorrAxiom.class, "CorrAxiom", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(corrConnectionEClass, CorrConnection.class,
				"CorrConnection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(corrConnectableEClass, CorrConnectable.class,
				"CorrConnectable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(corrProcessEClass, CorrProcess.class, "CorrProcess",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(corrBlockEClass, CorrBlock.class, "CorrBlock", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(corrSystemEClass, CorrSystem.class, "CorrSystem",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Sdl2umlPackageImpl
