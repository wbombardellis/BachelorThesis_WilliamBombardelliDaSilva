/**
 */
package de.silvawb.umlContract2java.impl;

import de.mdelab.mltgg.mote2.sdm.SdmPackage;

import de.silvawb.umlContract2java.UmlContract2javaFactory;
import de.silvawb.umlContract2java.UmlContract2javaPackage;

import de.silvawb.umlContract2java.generated.GeneratedPackage;

import de.silvawb.umlContract2java.generated.impl.GeneratedPackageImpl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlContract2javaPackageImpl extends EPackageImpl implements UmlContract2javaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "umlContract2java.ecore";

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
	 * @see de.silvawb.umlContract2java.UmlContract2javaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UmlContract2javaPackageImpl() {
		super(eNS_URI, UmlContract2javaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UmlContract2javaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static UmlContract2javaPackage init() {
		if (isInited)
			return (UmlContract2javaPackage) EPackage.Registry.INSTANCE.getEPackage(UmlContract2javaPackage.eNS_URI);

		// Obtain or create and register package
		UmlContract2javaPackageImpl theUmlContract2javaPackage = (UmlContract2javaPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof UmlContract2javaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new UmlContract2javaPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SdmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		GeneratedPackageImpl theGeneratedPackage = (GeneratedPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(GeneratedPackage.eNS_URI) instanceof GeneratedPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI)
						: GeneratedPackage.eINSTANCE);

		// Load packages
		theUmlContract2javaPackage.loadPackage();

		// Fix loaded packages
		theUmlContract2javaPackage.fixPackageContents();
		theGeneratedPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theUmlContract2javaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UmlContract2javaPackage.eNS_URI, theUmlContract2javaPackage);
		return theUmlContract2javaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrAxiom() {
		if (corrAxiomEClass == null) {
			corrAxiomEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(UmlContract2javaPackage.eNS_URI)
					.getEClassifiers().get(0);
		}
		return corrAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrRule() {
		if (corrRuleEClass == null) {
			corrRuleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(UmlContract2javaPackage.eNS_URI)
					.getEClassifiers().get(1);
		}
		return corrRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlContract2javaFactory getUmlContract2javaFactory() {
		return (UmlContract2javaFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded)
			return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		} catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage) resource.getContents().get(0));
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed)
			return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("de.silvawb.umlContract2java." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //UmlContract2javaPackageImpl
