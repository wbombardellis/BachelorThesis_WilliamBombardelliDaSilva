/**
 */
package de.silvawb.layout.impl;

import de.silvawb.java.JavaPackage;

import de.silvawb.java.impl.JavaPackageImpl;

import de.silvawb.layout.AttributeLayoutInformation;
import de.silvawb.layout.KeywordLayoutInformation;
import de.silvawb.layout.LayoutFactory;
import de.silvawb.layout.LayoutInformation;
import de.silvawb.layout.LayoutPackage;
import de.silvawb.layout.ReferenceLayoutInformation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LayoutPackageImpl extends EPackageImpl implements LayoutPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceLayoutInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeLayoutInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keywordLayoutInformationEClass = null;

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
	 * @see de.silvawb.layout.LayoutPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LayoutPackageImpl() {
		super(eNS_URI, LayoutFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LayoutPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LayoutPackage init() {
		if (isInited) return (LayoutPackage)EPackage.Registry.INSTANCE.getEPackage(LayoutPackage.eNS_URI);

		// Obtain or create and register package
		LayoutPackageImpl theLayoutPackage = (LayoutPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LayoutPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LayoutPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		JavaPackageImpl theJavaPackage = (JavaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI) instanceof JavaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI) : JavaPackage.eINSTANCE);

		// Load packages
		theJavaPackage.loadPackage();

		// Create package meta-data objects
		theLayoutPackage.createPackageContents();

		// Initialize created meta-data
		theLayoutPackage.initializePackageContents();

		// Fix loaded packages
		theJavaPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theLayoutPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LayoutPackage.eNS_URI, theLayoutPackage);
		return theLayoutPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayoutInformation() {
		return layoutInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayoutInformation_StartOffset() {
		return (EAttribute)layoutInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayoutInformation_HiddenTokenText() {
		return (EAttribute)layoutInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayoutInformation_VisibleTokenText() {
		return (EAttribute)layoutInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayoutInformation_SyntaxElementID() {
		return (EAttribute)layoutInformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceLayoutInformation() {
		return referenceLayoutInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceLayoutInformation_Object() {
		return (EReference)referenceLayoutInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeLayoutInformation() {
		return attributeLayoutInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeywordLayoutInformation() {
		return keywordLayoutInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutFactory getLayoutFactory() {
		return (LayoutFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		layoutInformationEClass = createEClass(LAYOUT_INFORMATION);
		createEAttribute(layoutInformationEClass, LAYOUT_INFORMATION__START_OFFSET);
		createEAttribute(layoutInformationEClass, LAYOUT_INFORMATION__HIDDEN_TOKEN_TEXT);
		createEAttribute(layoutInformationEClass, LAYOUT_INFORMATION__VISIBLE_TOKEN_TEXT);
		createEAttribute(layoutInformationEClass, LAYOUT_INFORMATION__SYNTAX_ELEMENT_ID);

		referenceLayoutInformationEClass = createEClass(REFERENCE_LAYOUT_INFORMATION);
		createEReference(referenceLayoutInformationEClass, REFERENCE_LAYOUT_INFORMATION__OBJECT);

		attributeLayoutInformationEClass = createEClass(ATTRIBUTE_LAYOUT_INFORMATION);

		keywordLayoutInformationEClass = createEClass(KEYWORD_LAYOUT_INFORMATION);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		referenceLayoutInformationEClass.getESuperTypes().add(this.getLayoutInformation());
		attributeLayoutInformationEClass.getESuperTypes().add(this.getLayoutInformation());
		keywordLayoutInformationEClass.getESuperTypes().add(this.getLayoutInformation());

		// Initialize classes, features, and operations; add parameters
		initEClass(layoutInformationEClass, LayoutInformation.class, "LayoutInformation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLayoutInformation_StartOffset(), ecorePackage.getEInt(), "startOffset", null, 1, 1, LayoutInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayoutInformation_HiddenTokenText(), ecorePackage.getEString(), "hiddenTokenText", null, 1, 1, LayoutInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayoutInformation_VisibleTokenText(), ecorePackage.getEString(), "visibleTokenText", null, 1, 1, LayoutInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayoutInformation_SyntaxElementID(), ecorePackage.getEString(), "syntaxElementID", null, 1, 1, LayoutInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceLayoutInformationEClass, ReferenceLayoutInformation.class, "ReferenceLayoutInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceLayoutInformation_Object(), ecorePackage.getEObject(), null, "object", null, 1, 1, ReferenceLayoutInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeLayoutInformationEClass, AttributeLayoutInformation.class, "AttributeLayoutInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(keywordLayoutInformationEClass, KeywordLayoutInformation.class, "KeywordLayoutInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //LayoutPackageImpl
