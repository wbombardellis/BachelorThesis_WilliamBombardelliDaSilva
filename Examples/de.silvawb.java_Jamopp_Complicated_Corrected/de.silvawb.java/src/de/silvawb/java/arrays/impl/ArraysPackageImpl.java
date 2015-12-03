/**
 */
package de.silvawb.java.arrays.impl;

import de.silvawb.java.annotations.AnnotationsPackage;

import de.silvawb.java.annotations.impl.AnnotationsPackageImpl;

import de.silvawb.java.arrays.ArrayDimension;
import de.silvawb.java.arrays.ArrayInitializationValue;
import de.silvawb.java.arrays.ArrayInitializer;
import de.silvawb.java.arrays.ArrayInstantiation;
import de.silvawb.java.arrays.ArrayInstantiationBySize;
import de.silvawb.java.arrays.ArrayInstantiationByValues;
import de.silvawb.java.arrays.ArrayInstantiationByValuesTyped;
import de.silvawb.java.arrays.ArrayInstantiationByValuesUntyped;
import de.silvawb.java.arrays.ArraySelector;
import de.silvawb.java.arrays.ArrayTypeable;
import de.silvawb.java.arrays.ArraysFactory;
import de.silvawb.java.arrays.ArraysPackage;

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
public class ArraysPackageImpl extends EPackageImpl implements ArraysPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayTypeableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayDimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayInitializationValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayInstantiationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayInstantiationBySizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayInstantiationByValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayInstantiationByValuesUntypedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayInstantiationByValuesTypedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arraySelectorEClass = null;

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
	 * @see de.silvawb.java.arrays.ArraysPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArraysPackageImpl() {
		super(eNS_URI, ArraysFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ArraysPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArraysPackage init() {
		if (isInited) return (ArraysPackage)EPackage.Registry.INSTANCE.getEPackage(ArraysPackage.eNS_URI);

		// Obtain or create and register package
		ArraysPackageImpl theArraysPackage = (ArraysPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArraysPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArraysPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AnnotationsPackageImpl theAnnotationsPackage = (AnnotationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI) instanceof AnnotationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI) : AnnotationsPackage.eINSTANCE);
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
		theArraysPackage.createPackageContents();
		theAnnotationsPackage.createPackageContents();
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
		theArraysPackage.initializePackageContents();
		theAnnotationsPackage.initializePackageContents();
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
		theArraysPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArraysPackage.eNS_URI, theArraysPackage);
		return theArraysPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayTypeable() {
		return arrayTypeableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayTypeable_ArrayDimensionsBefore() {
		return (EReference)arrayTypeableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayTypeable_ArrayDimensionsAfter() {
		return (EReference)arrayTypeableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArrayTypeable__GetArrayDimension() {
		return arrayTypeableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayDimension() {
		return arrayDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayInitializer() {
		return arrayInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayInitializer_InitialValues() {
		return (EReference)arrayInitializerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayInitializationValue() {
		return arrayInitializationValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayInstantiation() {
		return arrayInstantiationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayInstantiationBySize() {
		return arrayInstantiationBySizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayInstantiationBySize_Sizes() {
		return (EReference)arrayInstantiationBySizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayInstantiationByValues() {
		return arrayInstantiationByValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayInstantiationByValues_ArrayInitializer() {
		return (EReference)arrayInstantiationByValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayInstantiationByValuesUntyped() {
		return arrayInstantiationByValuesUntypedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayInstantiationByValuesTyped() {
		return arrayInstantiationByValuesTypedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArraySelector() {
		return arraySelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArraySelector_Position() {
		return (EReference)arraySelectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArraysFactory getArraysFactory() {
		return (ArraysFactory)getEFactoryInstance();
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
		arrayTypeableEClass = createEClass(ARRAY_TYPEABLE);
		createEReference(arrayTypeableEClass, ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE);
		createEReference(arrayTypeableEClass, ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER);
		createEOperation(arrayTypeableEClass, ARRAY_TYPEABLE___GET_ARRAY_DIMENSION);

		arrayDimensionEClass = createEClass(ARRAY_DIMENSION);

		arrayInitializerEClass = createEClass(ARRAY_INITIALIZER);
		createEReference(arrayInitializerEClass, ARRAY_INITIALIZER__INITIAL_VALUES);

		arrayInitializationValueEClass = createEClass(ARRAY_INITIALIZATION_VALUE);

		arrayInstantiationEClass = createEClass(ARRAY_INSTANTIATION);

		arrayInstantiationBySizeEClass = createEClass(ARRAY_INSTANTIATION_BY_SIZE);
		createEReference(arrayInstantiationBySizeEClass, ARRAY_INSTANTIATION_BY_SIZE__SIZES);

		arrayInstantiationByValuesEClass = createEClass(ARRAY_INSTANTIATION_BY_VALUES);
		createEReference(arrayInstantiationByValuesEClass, ARRAY_INSTANTIATION_BY_VALUES__ARRAY_INITIALIZER);

		arrayInstantiationByValuesUntypedEClass = createEClass(ARRAY_INSTANTIATION_BY_VALUES_UNTYPED);

		arrayInstantiationByValuesTypedEClass = createEClass(ARRAY_INSTANTIATION_BY_VALUES_TYPED);

		arraySelectorEClass = createEClass(ARRAY_SELECTOR);
		createEReference(arraySelectorEClass, ARRAY_SELECTOR__POSITION);
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
		AnnotationsPackage theAnnotationsPackage = (AnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
		ReferencesPackage theReferencesPackage = (ReferencesPackage)EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		arrayTypeableEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
		arrayDimensionEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
		arrayInitializerEClass.getESuperTypes().add(this.getArrayInitializationValue());
		arrayInitializerEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotationValue());
		arrayInitializationValueEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
		arrayInstantiationEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		arrayInstantiationEClass.getESuperTypes().add(theReferencesPackage.getReference());
		arrayInstantiationBySizeEClass.getESuperTypes().add(this.getArrayInstantiation());
		arrayInstantiationBySizeEClass.getESuperTypes().add(theTypesPackage.getTypedElement());
		arrayInstantiationBySizeEClass.getESuperTypes().add(this.getArrayTypeable());
		arrayInstantiationByValuesEClass.getESuperTypes().add(this.getArrayInstantiation());
		arrayInstantiationByValuesUntypedEClass.getESuperTypes().add(this.getArrayInstantiationByValues());
		arrayInstantiationByValuesTypedEClass.getESuperTypes().add(this.getArrayInstantiationByValues());
		arrayInstantiationByValuesTypedEClass.getESuperTypes().add(theTypesPackage.getTypedElement());
		arrayInstantiationByValuesTypedEClass.getESuperTypes().add(this.getArrayTypeable());
		arraySelectorEClass.getESuperTypes().add(theCommonsPackage.getCommentable());

		// Initialize classes, features, and operations; add parameters
		initEClass(arrayTypeableEClass, ArrayTypeable.class, "ArrayTypeable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayTypeable_ArrayDimensionsBefore(), this.getArrayDimension(), null, "arrayDimensionsBefore", null, 0, -1, ArrayTypeable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArrayTypeable_ArrayDimensionsAfter(), this.getArrayDimension(), null, "arrayDimensionsAfter", null, 0, -1, ArrayTypeable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getArrayTypeable__GetArrayDimension(), ecorePackage.getELong(), "getArrayDimension", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(arrayDimensionEClass, ArrayDimension.class, "ArrayDimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arrayInitializerEClass, ArrayInitializer.class, "ArrayInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayInitializer_InitialValues(), this.getArrayInitializationValue(), null, "initialValues", null, 0, -1, ArrayInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayInitializationValueEClass, ArrayInitializationValue.class, "ArrayInitializationValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arrayInstantiationEClass, ArrayInstantiation.class, "ArrayInstantiation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arrayInstantiationBySizeEClass, ArrayInstantiationBySize.class, "ArrayInstantiationBySize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayInstantiationBySize_Sizes(), theExpressionsPackage.getExpression(), null, "sizes", null, 1, -1, ArrayInstantiationBySize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayInstantiationByValuesEClass, ArrayInstantiationByValues.class, "ArrayInstantiationByValues", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayInstantiationByValues_ArrayInitializer(), this.getArrayInitializer(), null, "arrayInitializer", null, 1, 1, ArrayInstantiationByValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayInstantiationByValuesUntypedEClass, ArrayInstantiationByValuesUntyped.class, "ArrayInstantiationByValuesUntyped", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arrayInstantiationByValuesTypedEClass, ArrayInstantiationByValuesTyped.class, "ArrayInstantiationByValuesTyped", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arraySelectorEClass, ArraySelector.class, "ArraySelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArraySelector_Position(), theExpressionsPackage.getExpression(), null, "position", null, 0, 1, ArraySelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ArraysPackageImpl
