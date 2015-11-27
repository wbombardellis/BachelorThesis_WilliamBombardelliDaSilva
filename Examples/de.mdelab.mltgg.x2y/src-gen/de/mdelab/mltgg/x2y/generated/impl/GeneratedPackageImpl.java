/**
 */
package de.mdelab.mltgg.x2y.generated.impl;

import de.mdelab.mlsdm.MlsdmPackage;

import de.mdelab.mltgg.mote2.Mote2Package;

import de.mdelab.mltgg.mote2.helpers.HelpersPackage;

import de.mdelab.mltgg.mote2.operationalTGG.OperationalTGGPackage;

import de.mdelab.mltgg.mote2.sdm.SdmPackage;

import de.mdelab.mltgg.x2y.X2yPackage;

import de.mdelab.mltgg.x2y.generated.GeneratedFactory;
import de.mdelab.mltgg.x2y.generated.GeneratedPackage;
import de.mdelab.mltgg.x2y.generated.x2yAxiom;
import de.mdelab.mltgg.x2y.generated.x2yAxiom_r1;
import de.mdelab.mltgg.x2y.generated.x2yOperationalTGG;

import de.mdelab.mltgg.x2y.impl.X2yPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneratedPackageImpl extends EPackageImpl implements GeneratedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass x2yOperationalTGGEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass x2yAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass x2yAxiom_r1EClass = null;

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
	 * @see de.mdelab.mltgg.x2y.generated.GeneratedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GeneratedPackageImpl() {
		super(eNS_URI, GeneratedFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GeneratedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GeneratedPackage init() {
		if (isInited)
			return (GeneratedPackage) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI);

		// Obtain or create and register package
		GeneratedPackageImpl theGeneratedPackage = (GeneratedPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof GeneratedPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new GeneratedPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SdmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		X2yPackageImpl theX2yPackage = (X2yPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(X2yPackage.eNS_URI) instanceof X2yPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(X2yPackage.eNS_URI) : X2yPackage.eINSTANCE);

		// Create package meta-data objects
		theGeneratedPackage.createPackageContents();
		theX2yPackage.createPackageContents();

		// Initialize created meta-data
		theGeneratedPackage.initializePackageContents();
		theX2yPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGeneratedPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GeneratedPackage.eNS_URI, theGeneratedPackage);
		return theGeneratedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getx2yOperationalTGG() {
		return x2yOperationalTGGEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getx2yAxiom() {
		return x2yAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getx2yAxiom_r1() {
		return x2yAxiom_r1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getx2yAxiom_r1_AddElementActivity() {
		return (EReference) x2yAxiom_r1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getx2yAxiom_r1_MoveElementActivity() {
		return (EReference) x2yAxiom_r1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getx2yAxiom_r1_ChangeAttributeActivity() {
		return (EReference) x2yAxiom_r1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getx2yAxiom_r1_TransformForwardActivity() {
		return (EReference) x2yAxiom_r1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getx2yAxiom_r1_TransformMappingActivity() {
		return (EReference) x2yAxiom_r1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getx2yAxiom_r1_TransformBackwardActivity() {
		return (EReference) x2yAxiom_r1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getx2yAxiom_r1_SynchronizeForwardActivity() {
		return (EReference) x2yAxiom_r1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getx2yAxiom_r1_SynchronizeBackwardActivity() {
		return (EReference) x2yAxiom_r1EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getx2yAxiom_r1__AddElement__EMap_EList_EList() {
		return x2yAxiom_r1EClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getx2yAxiom_r1__ChangeAttributeValues__TGGNode_EMap() {
		return x2yAxiom_r1EClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getx2yAxiom_r1__TransformForward__EList_EList_boolean() {
		return x2yAxiom_r1EClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getx2yAxiom_r1__TransformMapping__EList_EList_boolean() {
		return x2yAxiom_r1EClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getx2yAxiom_r1__TransformBackward__EList_EList_boolean() {
		return x2yAxiom_r1EClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getx2yAxiom_r1__SynchronizeForward__EList_EList_TGGNode_boolean() {
		return x2yAxiom_r1EClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getx2yAxiom_r1__SynchronizeBackward__EList_EList_TGGNode_boolean() {
		return x2yAxiom_r1EClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedFactory getGeneratedFactory() {
		return (GeneratedFactory) getEFactoryInstance();
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
		x2yOperationalTGGEClass = createEClass(X2Y_OPERATIONAL_TGG);

		x2yAxiomEClass = createEClass(X2Y_AXIOM);

		x2yAxiom_r1EClass = createEClass(X2Y_AXIOM_R1);
		createEReference(x2yAxiom_r1EClass, X2Y_AXIOM_R1__ADD_ELEMENT_ACTIVITY);
		createEReference(x2yAxiom_r1EClass, X2Y_AXIOM_R1__MOVE_ELEMENT_ACTIVITY);
		createEReference(x2yAxiom_r1EClass, X2Y_AXIOM_R1__CHANGE_ATTRIBUTE_ACTIVITY);
		createEReference(x2yAxiom_r1EClass, X2Y_AXIOM_R1__TRANSFORM_FORWARD_ACTIVITY);
		createEReference(x2yAxiom_r1EClass, X2Y_AXIOM_R1__TRANSFORM_MAPPING_ACTIVITY);
		createEReference(x2yAxiom_r1EClass, X2Y_AXIOM_R1__TRANSFORM_BACKWARD_ACTIVITY);
		createEReference(x2yAxiom_r1EClass, X2Y_AXIOM_R1__SYNCHRONIZE_FORWARD_ACTIVITY);
		createEReference(x2yAxiom_r1EClass, X2Y_AXIOM_R1__SYNCHRONIZE_BACKWARD_ACTIVITY);
		createEOperation(x2yAxiom_r1EClass, X2Y_AXIOM_R1___ADD_ELEMENT__EMAP_ELIST_ELIST);
		createEOperation(x2yAxiom_r1EClass, X2Y_AXIOM_R1___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP);
		createEOperation(x2yAxiom_r1EClass, X2Y_AXIOM_R1___TRANSFORM_FORWARD__ELIST_ELIST_BOOLEAN);
		createEOperation(x2yAxiom_r1EClass, X2Y_AXIOM_R1___TRANSFORM_MAPPING__ELIST_ELIST_BOOLEAN);
		createEOperation(x2yAxiom_r1EClass, X2Y_AXIOM_R1___TRANSFORM_BACKWARD__ELIST_ELIST_BOOLEAN);
		createEOperation(x2yAxiom_r1EClass, X2Y_AXIOM_R1___SYNCHRONIZE_FORWARD__ELIST_ELIST_TGGNODE_BOOLEAN);
		createEOperation(x2yAxiom_r1EClass, X2Y_AXIOM_R1___SYNCHRONIZE_BACKWARD__ELIST_ELIST_TGGNODE_BOOLEAN);
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
		SdmPackage theSdmPackage = (SdmPackage) EPackage.Registry.INSTANCE.getEPackage(SdmPackage.eNS_URI);
		OperationalTGGPackage theOperationalTGGPackage = (OperationalTGGPackage) EPackage.Registry.INSTANCE
				.getEPackage(OperationalTGGPackage.eNS_URI);
		MlsdmPackage theMlsdmPackage = (MlsdmPackage) EPackage.Registry.INSTANCE.getEPackage(MlsdmPackage.eNS_URI);
		Mote2Package theMote2Package = (Mote2Package) EPackage.Registry.INSTANCE.getEPackage(Mote2Package.eNS_URI);
		HelpersPackage theHelpersPackage = (HelpersPackage) EPackage.Registry.INSTANCE
				.getEPackage(HelpersPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		x2yOperationalTGGEClass.getESuperTypes().add(theSdmPackage.getSdmOperationalTGG());
		x2yAxiomEClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalAxiomGroup());
		x2yAxiom_r1EClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalAxiom());

		// Initialize classes, features, and operations; add parameters
		initEClass(x2yOperationalTGGEClass, x2yOperationalTGG.class, "x2yOperationalTGG", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(x2yAxiomEClass, x2yAxiom.class, "x2yAxiom", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(x2yAxiom_r1EClass, x2yAxiom_r1.class, "x2yAxiom_r1", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getx2yAxiom_r1_AddElementActivity(), theMlsdmPackage.getActivity(), null, "addElementActivity",
				null, 1, 1, x2yAxiom_r1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getx2yAxiom_r1_MoveElementActivity(), theMlsdmPackage.getActivity(), null, "moveElementActivity",
				null, 1, 1, x2yAxiom_r1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getx2yAxiom_r1_ChangeAttributeActivity(), theMlsdmPackage.getActivity(), null,
				"changeAttributeActivity", null, 1, 1, x2yAxiom_r1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getx2yAxiom_r1_TransformForwardActivity(), theMlsdmPackage.getActivity(), null,
				"transformForwardActivity", null, 1, 1, x2yAxiom_r1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getx2yAxiom_r1_TransformMappingActivity(), theMlsdmPackage.getActivity(), null,
				"transformMappingActivity", null, 1, 1, x2yAxiom_r1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getx2yAxiom_r1_TransformBackwardActivity(), theMlsdmPackage.getActivity(), null,
				"transformBackwardActivity", null, 1, 1, x2yAxiom_r1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getx2yAxiom_r1_SynchronizeForwardActivity(), theMlsdmPackage.getActivity(), null,
				"synchronizeForwardActivity", null, 1, 1, x2yAxiom_r1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getx2yAxiom_r1_SynchronizeBackwardActivity(), theMlsdmPackage.getActivity(), null,
				"synchronizeBackwardActivity", null, 1, 1, x2yAxiom_r1.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getx2yAxiom_r1__AddElement__EMap_EList_EList(), theMote2Package.getTGGNode(),
				"addElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(theHelpersPackage.getMapEntry());
		EGenericType g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "parameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getx2yAxiom_r1__ChangeAttributeValues__TGGNode_EMap(), ecorePackage.getEBoolean(),
				"changeAttributeValues", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "ruleParameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getx2yAxiom_r1__TransformForward__EList_EList_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getx2yAxiom_r1__TransformMapping__EList_EList_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformMapping", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getx2yAxiom_r1__TransformBackward__EList_EList_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getx2yAxiom_r1__SynchronizeForward__EList_EList_TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getx2yAxiom_r1__SynchronizeBackward__EList_EList_TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());
	}

} //GeneratedPackageImpl
