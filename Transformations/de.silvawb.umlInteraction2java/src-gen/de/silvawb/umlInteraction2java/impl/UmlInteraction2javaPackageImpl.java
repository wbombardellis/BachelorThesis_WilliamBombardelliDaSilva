/**
 */
package de.silvawb.umlInteraction2java.impl;

import de.mdelab.mltgg.mote2.Mote2Package;

import de.mdelab.mltgg.mote2.sdm.SdmPackage;

import de.silvawb.umlInteraction2java.CorrAxiom;
import de.silvawb.umlInteraction2java.CorrRule;
import de.silvawb.umlInteraction2java.UmlInteraction2javaFactory;
import de.silvawb.umlInteraction2java.UmlInteraction2javaPackage;

import de.silvawb.umlInteraction2java.generated.GeneratedPackage;

import de.silvawb.umlInteraction2java.generated.impl.GeneratedPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlInteraction2javaPackageImpl extends EPackageImpl implements UmlInteraction2javaPackage {
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
	private EClass corrRuleEClass = null;

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
	 * @see de.silvawb.umlInteraction2java.UmlInteraction2javaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UmlInteraction2javaPackageImpl() {
		super(eNS_URI, UmlInteraction2javaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UmlInteraction2javaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UmlInteraction2javaPackage init() {
		if (isInited)
			return (UmlInteraction2javaPackage) EPackage.Registry.INSTANCE
					.getEPackage(UmlInteraction2javaPackage.eNS_URI);

		// Obtain or create and register package
		UmlInteraction2javaPackageImpl theUmlInteraction2javaPackage = (UmlInteraction2javaPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof UmlInteraction2javaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new UmlInteraction2javaPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SdmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		GeneratedPackageImpl theGeneratedPackage = (GeneratedPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(GeneratedPackage.eNS_URI) instanceof GeneratedPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
						: GeneratedPackage.eINSTANCE);

		// Create package meta-data objects
		theUmlInteraction2javaPackage.createPackageContents();
		theGeneratedPackage.createPackageContents();

		// Initialize created meta-data
		theUmlInteraction2javaPackage.initializePackageContents();
		theGeneratedPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUmlInteraction2javaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UmlInteraction2javaPackage.eNS_URI, theUmlInteraction2javaPackage);
		return theUmlInteraction2javaPackage;
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
	public EClass getCorrRule() {
		return corrRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlInteraction2javaFactory getUmlInteraction2javaFactory() {
		return (UmlInteraction2javaFactory) getEFactoryInstance();
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

		corrRuleEClass = createEClass(CORR_RULE);
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
		Mote2Package theMote2Package = (Mote2Package) EPackage.Registry.INSTANCE.getEPackage(Mote2Package.eNS_URI);

		// Add subpackages
		getESubpackages().add(theGeneratedPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		corrAxiomEClass.getESuperTypes().add(theMote2Package.getTGGNode());
		corrRuleEClass.getESuperTypes().add(theMote2Package.getTGGNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(corrAxiomEClass, CorrAxiom.class, "CorrAxiom", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(corrRuleEClass, CorrRule.class, "CorrRule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //UmlInteraction2javaPackageImpl
