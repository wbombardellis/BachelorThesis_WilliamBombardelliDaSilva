/**
 */
package de.silvawb.java.annotations.impl;

import de.silvawb.java.annotations.Annotable;
import de.silvawb.java.annotations.AnnotationAttribute;
import de.silvawb.java.annotations.AnnotationAttributeSetting;
import de.silvawb.java.annotations.AnnotationInstance;
import de.silvawb.java.annotations.AnnotationParameter;
import de.silvawb.java.annotations.AnnotationParameterList;
import de.silvawb.java.annotations.AnnotationValue;
import de.silvawb.java.annotations.AnnotationsFactory;
import de.silvawb.java.annotations.AnnotationsPackage;
import de.silvawb.java.annotations.SingleAnnotationParameter;

import de.silvawb.java.arrays.ArraysPackage;

import de.silvawb.java.arrays.impl.ArraysPackageImpl;

import de.silvawb.java.classifiers.ClassifiersPackage;

import de.silvawb.java.classifiers.impl.ClassifiersPackageImpl;

import de.silvawb.java.commons.CommonsPackage;

import de.silvawb.java.commons.impl.CommonsPackageImpl;

import de.silvawb.java.containers.ContainersPackage;

import de.silvawb.java.containers.impl.ContainersPackageImpl;

import de.silvawb.java.expressions.ExpressionsPackage;

import de.silvawb.java.expressions.impl.ExpressionsPackageImpl;

import de.silvawb.java.generics.GenericsPackage;

import de.silvawb.java.generics.impl.GenericsPackageImpl;

import de.silvawb.java.imports.ImportsPackage;

import de.silvawb.java.imports.impl.ImportsPackageImpl;

import de.silvawb.java.instantiations.InstantiationsPackage;

import de.silvawb.java.instantiations.impl.InstantiationsPackageImpl;

import de.silvawb.java.literals.LiteralsPackage;

import de.silvawb.java.literals.impl.LiteralsPackageImpl;

import de.silvawb.java.members.MembersPackage;

import de.silvawb.java.members.impl.MembersPackageImpl;

import de.silvawb.java.modifiers.ModifiersPackage;

import de.silvawb.java.modifiers.impl.ModifiersPackageImpl;

import de.silvawb.java.operators.OperatorsPackage;

import de.silvawb.java.operators.impl.OperatorsPackageImpl;

import de.silvawb.java.parameters.ParametersPackage;

import de.silvawb.java.parameters.impl.ParametersPackageImpl;

import de.silvawb.java.references.ReferencesPackage;

import de.silvawb.java.references.impl.ReferencesPackageImpl;

import de.silvawb.java.statements.StatementsPackage;

import de.silvawb.java.statements.impl.StatementsPackageImpl;

import de.silvawb.java.types.TypesPackage;

import de.silvawb.java.types.impl.TypesPackageImpl;

import de.silvawb.java.variables.VariablesPackage;

import de.silvawb.java.variables.impl.VariablesPackageImpl;

import de.silvawb.layout.LayoutPackage;

import de.silvawb.layout.impl.LayoutPackageImpl;

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
public class AnnotationsPackageImpl extends EPackageImpl implements AnnotationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleAnnotationParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationParameterListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationAttributeSettingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationAttributeEClass = null;

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
	 * @see de.silvawb.java.annotations.AnnotationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AnnotationsPackageImpl() {
		super(eNS_URI, AnnotationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AnnotationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AnnotationsPackage init() {
		if (isInited) return (AnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);

		// Obtain or create and register package
		AnnotationsPackageImpl theAnnotationsPackage = (AnnotationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AnnotationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AnnotationsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ArraysPackageImpl theArraysPackage = (ArraysPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArraysPackage.eNS_URI) instanceof ArraysPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArraysPackage.eNS_URI) : ArraysPackage.eINSTANCE);
		ClassifiersPackageImpl theClassifiersPackage = (ClassifiersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClassifiersPackage.eNS_URI) instanceof ClassifiersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClassifiersPackage.eNS_URI) : ClassifiersPackage.eINSTANCE);
		CommonsPackageImpl theCommonsPackage = (CommonsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI) instanceof CommonsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI) : CommonsPackage.eINSTANCE);
		ContainersPackageImpl theContainersPackage = (ContainersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContainersPackage.eNS_URI) instanceof ContainersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContainersPackage.eNS_URI) : ContainersPackage.eINSTANCE);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);
		GenericsPackageImpl theGenericsPackage = (GenericsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GenericsPackage.eNS_URI) instanceof GenericsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GenericsPackage.eNS_URI) : GenericsPackage.eINSTANCE);
		ImportsPackageImpl theImportsPackage = (ImportsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ImportsPackage.eNS_URI) instanceof ImportsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ImportsPackage.eNS_URI) : ImportsPackage.eINSTANCE);
		InstantiationsPackageImpl theInstantiationsPackage = (InstantiationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstantiationsPackage.eNS_URI) instanceof InstantiationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstantiationsPackage.eNS_URI) : InstantiationsPackage.eINSTANCE);
		LiteralsPackageImpl theLiteralsPackage = (LiteralsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI) instanceof LiteralsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI) : LiteralsPackage.eINSTANCE);
		MembersPackageImpl theMembersPackage = (MembersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MembersPackage.eNS_URI) instanceof MembersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MembersPackage.eNS_URI) : MembersPackage.eINSTANCE);
		ModifiersPackageImpl theModifiersPackage = (ModifiersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModifiersPackage.eNS_URI) instanceof ModifiersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModifiersPackage.eNS_URI) : ModifiersPackage.eINSTANCE);
		OperatorsPackageImpl theOperatorsPackage = (OperatorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI) instanceof OperatorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI) : OperatorsPackage.eINSTANCE);
		ParametersPackageImpl theParametersPackage = (ParametersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI) instanceof ParametersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI) : ParametersPackage.eINSTANCE);
		ReferencesPackageImpl theReferencesPackage = (ReferencesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI) instanceof ReferencesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI) : ReferencesPackage.eINSTANCE);
		StatementsPackageImpl theStatementsPackage = (StatementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI) instanceof StatementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI) : StatementsPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		VariablesPackageImpl theVariablesPackage = (VariablesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) instanceof VariablesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) : VariablesPackage.eINSTANCE);
		LayoutPackageImpl theLayoutPackage = (LayoutPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LayoutPackage.eNS_URI) instanceof LayoutPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LayoutPackage.eNS_URI) : LayoutPackage.eINSTANCE);

		// Create package meta-data objects
		theAnnotationsPackage.createPackageContents();
		theArraysPackage.createPackageContents();
		theClassifiersPackage.createPackageContents();
		theCommonsPackage.createPackageContents();
		theContainersPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theGenericsPackage.createPackageContents();
		theImportsPackage.createPackageContents();
		theInstantiationsPackage.createPackageContents();
		theLiteralsPackage.createPackageContents();
		theMembersPackage.createPackageContents();
		theModifiersPackage.createPackageContents();
		theOperatorsPackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theReferencesPackage.createPackageContents();
		theStatementsPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theVariablesPackage.createPackageContents();
		theLayoutPackage.createPackageContents();

		// Initialize created meta-data
		theAnnotationsPackage.initializePackageContents();
		theArraysPackage.initializePackageContents();
		theClassifiersPackage.initializePackageContents();
		theCommonsPackage.initializePackageContents();
		theContainersPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theGenericsPackage.initializePackageContents();
		theImportsPackage.initializePackageContents();
		theInstantiationsPackage.initializePackageContents();
		theLiteralsPackage.initializePackageContents();
		theMembersPackage.initializePackageContents();
		theModifiersPackage.initializePackageContents();
		theOperatorsPackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theReferencesPackage.initializePackageContents();
		theStatementsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theVariablesPackage.initializePackageContents();
		theLayoutPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAnnotationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AnnotationsPackage.eNS_URI, theAnnotationsPackage);
		return theAnnotationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotable() {
		return annotableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotable_Annotations() {
		return (EReference)annotableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationInstance() {
		return annotationInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationInstance_Annotation() {
		return (EReference)annotationInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationInstance_Parameter() {
		return (EReference)annotationInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationParameter() {
		return annotationParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleAnnotationParameter() {
		return singleAnnotationParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleAnnotationParameter_Value() {
		return (EReference)singleAnnotationParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationParameterList() {
		return annotationParameterListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationParameterList_Settings() {
		return (EReference)annotationParameterListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationAttributeSetting() {
		return annotationAttributeSettingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationAttributeSetting_Attribute() {
		return (EReference)annotationAttributeSettingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationAttributeSetting_Value() {
		return (EReference)annotationAttributeSettingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationValue() {
		return annotationValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationAttribute() {
		return annotationAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationAttribute_DefaultValue() {
		return (EReference)annotationAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsFactory getAnnotationsFactory() {
		return (AnnotationsFactory)getEFactoryInstance();
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
		annotableEClass = createEClass(ANNOTABLE);
		createEReference(annotableEClass, ANNOTABLE__ANNOTATIONS);

		annotationInstanceEClass = createEClass(ANNOTATION_INSTANCE);
		createEReference(annotationInstanceEClass, ANNOTATION_INSTANCE__ANNOTATION);
		createEReference(annotationInstanceEClass, ANNOTATION_INSTANCE__PARAMETER);

		annotationParameterEClass = createEClass(ANNOTATION_PARAMETER);

		singleAnnotationParameterEClass = createEClass(SINGLE_ANNOTATION_PARAMETER);
		createEReference(singleAnnotationParameterEClass, SINGLE_ANNOTATION_PARAMETER__VALUE);

		annotationParameterListEClass = createEClass(ANNOTATION_PARAMETER_LIST);
		createEReference(annotationParameterListEClass, ANNOTATION_PARAMETER_LIST__SETTINGS);

		annotationAttributeSettingEClass = createEClass(ANNOTATION_ATTRIBUTE_SETTING);
		createEReference(annotationAttributeSettingEClass, ANNOTATION_ATTRIBUTE_SETTING__ATTRIBUTE);
		createEReference(annotationAttributeSettingEClass, ANNOTATION_ATTRIBUTE_SETTING__VALUE);

		annotationValueEClass = createEClass(ANNOTATION_VALUE);

		annotationAttributeEClass = createEClass(ANNOTATION_ATTRIBUTE);
		createEReference(annotationAttributeEClass, ANNOTATION_ATTRIBUTE__DEFAULT_VALUE);
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

		// Obtain other dependent packages
		CommonsPackage theCommonsPackage = (CommonsPackage)EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI);
		ReferencesPackage theReferencesPackage = (ReferencesPackage)EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI);
		ModifiersPackage theModifiersPackage = (ModifiersPackage)EPackage.Registry.INSTANCE.getEPackage(ModifiersPackage.eNS_URI);
		ClassifiersPackage theClassifiersPackage = (ClassifiersPackage)EPackage.Registry.INSTANCE.getEPackage(ClassifiersPackage.eNS_URI);
		MembersPackage theMembersPackage = (MembersPackage)EPackage.Registry.INSTANCE.getEPackage(MembersPackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		annotableEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
		annotationInstanceEClass.getESuperTypes().add(theReferencesPackage.getReference());
		annotationInstanceEClass.getESuperTypes().add(theModifiersPackage.getAnnotationInstanceOrModifier());
		annotationInstanceEClass.getESuperTypes().add(theCommonsPackage.getNamespaceAwareElement());
		annotationParameterEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
		singleAnnotationParameterEClass.getESuperTypes().add(this.getAnnotationParameter());
		annotationParameterListEClass.getESuperTypes().add(this.getAnnotationParameter());
		annotationAttributeSettingEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
		annotationValueEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
		annotationAttributeEClass.getESuperTypes().add(theMembersPackage.getInterfaceMethod());

		// Initialize classes, features, and operations; add parameters
		initEClass(annotableEClass, Annotable.class, "Annotable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotable_Annotations(), this.getAnnotationInstance(), null, "annotations", null, 0, -1, Annotable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationInstanceEClass, AnnotationInstance.class, "AnnotationInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotationInstance_Annotation(), theClassifiersPackage.getClassifier(), null, "annotation", null, 1, 1, AnnotationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationInstance_Parameter(), this.getAnnotationParameter(), null, "parameter", null, 0, 1, AnnotationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationParameterEClass, AnnotationParameter.class, "AnnotationParameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleAnnotationParameterEClass, SingleAnnotationParameter.class, "SingleAnnotationParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleAnnotationParameter_Value(), this.getAnnotationValue(), null, "value", null, 1, 1, SingleAnnotationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationParameterListEClass, AnnotationParameterList.class, "AnnotationParameterList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotationParameterList_Settings(), this.getAnnotationAttributeSetting(), null, "settings", null, 0, -1, AnnotationParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationAttributeSettingEClass, AnnotationAttributeSetting.class, "AnnotationAttributeSetting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotationAttributeSetting_Attribute(), theMembersPackage.getInterfaceMethod(), null, "attribute", null, 1, 1, AnnotationAttributeSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationAttributeSetting_Value(), this.getAnnotationValue(), null, "value", null, 1, 1, AnnotationAttributeSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationValueEClass, AnnotationValue.class, "AnnotationValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annotationAttributeEClass, AnnotationAttribute.class, "AnnotationAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotationAttribute_DefaultValue(), theExpressionsPackage.getExpression(), null, "defaultValue", null, 1, 1, AnnotationAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AnnotationsPackageImpl
