/**
 */
package de.silvawb.java.members.impl;

import de.silvawb.java.annotations.AnnotationsPackage;

import de.silvawb.java.annotations.impl.AnnotationsPackageImpl;

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

import de.silvawb.java.members.AdditionalField;
import de.silvawb.java.members.ClassMethod;
import de.silvawb.java.members.Constructor;
import de.silvawb.java.members.EmptyMember;
import de.silvawb.java.members.EnumConstant;
import de.silvawb.java.members.ExceptionThrower;
import de.silvawb.java.members.Field;
import de.silvawb.java.members.InterfaceMethod;
import de.silvawb.java.members.Member;
import de.silvawb.java.members.MemberContainer;
import de.silvawb.java.members.MembersFactory;
import de.silvawb.java.members.MembersPackage;
import de.silvawb.java.members.Method;

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
public class MembersPackageImpl extends EPackageImpl implements MembersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionThrowerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emptyMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumConstantEClass = null;

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
	 * @see de.silvawb.java.members.MembersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MembersPackageImpl() {
		super(eNS_URI, MembersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MembersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MembersPackage init() {
		if (isInited) return (MembersPackage)EPackage.Registry.INSTANCE.getEPackage(MembersPackage.eNS_URI);

		// Obtain or create and register package
		MembersPackageImpl theMembersPackage = (MembersPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MembersPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MembersPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AnnotationsPackageImpl theAnnotationsPackage = (AnnotationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI) instanceof AnnotationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI) : AnnotationsPackage.eINSTANCE);
		ArraysPackageImpl theArraysPackage = (ArraysPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArraysPackage.eNS_URI) instanceof ArraysPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArraysPackage.eNS_URI) : ArraysPackage.eINSTANCE);
		ClassifiersPackageImpl theClassifiersPackage = (ClassifiersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClassifiersPackage.eNS_URI) instanceof ClassifiersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClassifiersPackage.eNS_URI) : ClassifiersPackage.eINSTANCE);
		CommonsPackageImpl theCommonsPackage = (CommonsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI) instanceof CommonsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI) : CommonsPackage.eINSTANCE);
		ContainersPackageImpl theContainersPackage = (ContainersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContainersPackage.eNS_URI) instanceof ContainersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContainersPackage.eNS_URI) : ContainersPackage.eINSTANCE);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);
		GenericsPackageImpl theGenericsPackage = (GenericsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GenericsPackage.eNS_URI) instanceof GenericsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GenericsPackage.eNS_URI) : GenericsPackage.eINSTANCE);
		ImportsPackageImpl theImportsPackage = (ImportsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ImportsPackage.eNS_URI) instanceof ImportsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ImportsPackage.eNS_URI) : ImportsPackage.eINSTANCE);
		InstantiationsPackageImpl theInstantiationsPackage = (InstantiationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstantiationsPackage.eNS_URI) instanceof InstantiationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstantiationsPackage.eNS_URI) : InstantiationsPackage.eINSTANCE);
		LiteralsPackageImpl theLiteralsPackage = (LiteralsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI) instanceof LiteralsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI) : LiteralsPackage.eINSTANCE);
		ModifiersPackageImpl theModifiersPackage = (ModifiersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModifiersPackage.eNS_URI) instanceof ModifiersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModifiersPackage.eNS_URI) : ModifiersPackage.eINSTANCE);
		OperatorsPackageImpl theOperatorsPackage = (OperatorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI) instanceof OperatorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI) : OperatorsPackage.eINSTANCE);
		ParametersPackageImpl theParametersPackage = (ParametersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI) instanceof ParametersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI) : ParametersPackage.eINSTANCE);
		ReferencesPackageImpl theReferencesPackage = (ReferencesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI) instanceof ReferencesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI) : ReferencesPackage.eINSTANCE);
		StatementsPackageImpl theStatementsPackage = (StatementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI) instanceof StatementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI) : StatementsPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		VariablesPackageImpl theVariablesPackage = (VariablesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) instanceof VariablesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) : VariablesPackage.eINSTANCE);
		LayoutPackageImpl theLayoutPackage = (LayoutPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LayoutPackage.eNS_URI) instanceof LayoutPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LayoutPackage.eNS_URI) : LayoutPackage.eINSTANCE);

		// Create package meta-data objects
		theMembersPackage.createPackageContents();
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
		theModifiersPackage.createPackageContents();
		theOperatorsPackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theReferencesPackage.createPackageContents();
		theStatementsPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theVariablesPackage.createPackageContents();
		theLayoutPackage.createPackageContents();

		// Initialize created meta-data
		theMembersPackage.initializePackageContents();
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
		theModifiersPackage.initializePackageContents();
		theOperatorsPackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theReferencesPackage.initializePackageContents();
		theStatementsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theVariablesPackage.initializePackageContents();
		theLayoutPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMembersPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MembersPackage.eNS_URI, theMembersPackage);
		return theMembersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionThrower() {
		return exceptionThrowerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionThrower_Exceptions() {
		return (EReference)exceptionThrowerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMember() {
		return memberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemberContainer() {
		return memberContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemberContainer_Members() {
		return (EReference)memberContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemberContainer_DefaultMembers() {
		return (EReference)memberContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMemberContainer__GetContainedClassifier__String() {
		return memberContainerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMemberContainer__GetContainedField__String() {
		return memberContainerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMemberContainer__GetContainedMethod__String() {
		return memberContainerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMemberContainer__GetMethods() {
		return memberContainerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMemberContainer__RemoveMethods__String() {
		return memberContainerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMemberContainer__GetMembersByName__String() {
		return memberContainerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMemberContainer__CreateField__String_String() {
		return memberContainerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMemberContainer__GetFields() {
		return memberContainerEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionalField() {
		return additionalFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdditionalField__GetArrayDimension() {
		return additionalFieldEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructor() {
		return constructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmptyMember() {
		return emptyMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_AdditionalFields() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethod__IsMethodForCall__MethodCall_boolean() {
		return methodEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethod__IsSomeMethodForCall__MethodCall() {
		return methodEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethod__IsBetterMethodForCall__Method_MethodCall() {
		return methodEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethod__GetArrayDimension() {
		return methodEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceMethod() {
		return interfaceMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassMethod() {
		return classMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumConstant() {
		return enumConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumConstant_AnonymousClass() {
		return (EReference)enumConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MembersFactory getMembersFactory() {
		return (MembersFactory)getEFactoryInstance();
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
		exceptionThrowerEClass = createEClass(EXCEPTION_THROWER);
		createEReference(exceptionThrowerEClass, EXCEPTION_THROWER__EXCEPTIONS);

		memberEClass = createEClass(MEMBER);

		memberContainerEClass = createEClass(MEMBER_CONTAINER);
		createEReference(memberContainerEClass, MEMBER_CONTAINER__MEMBERS);
		createEReference(memberContainerEClass, MEMBER_CONTAINER__DEFAULT_MEMBERS);
		createEOperation(memberContainerEClass, MEMBER_CONTAINER___GET_CONTAINED_CLASSIFIER__STRING);
		createEOperation(memberContainerEClass, MEMBER_CONTAINER___GET_CONTAINED_FIELD__STRING);
		createEOperation(memberContainerEClass, MEMBER_CONTAINER___GET_CONTAINED_METHOD__STRING);
		createEOperation(memberContainerEClass, MEMBER_CONTAINER___GET_METHODS);
		createEOperation(memberContainerEClass, MEMBER_CONTAINER___REMOVE_METHODS__STRING);
		createEOperation(memberContainerEClass, MEMBER_CONTAINER___GET_MEMBERS_BY_NAME__STRING);
		createEOperation(memberContainerEClass, MEMBER_CONTAINER___CREATE_FIELD__STRING_STRING);
		createEOperation(memberContainerEClass, MEMBER_CONTAINER___GET_FIELDS);

		additionalFieldEClass = createEClass(ADDITIONAL_FIELD);
		createEOperation(additionalFieldEClass, ADDITIONAL_FIELD___GET_ARRAY_DIMENSION);

		constructorEClass = createEClass(CONSTRUCTOR);

		emptyMemberEClass = createEClass(EMPTY_MEMBER);

		fieldEClass = createEClass(FIELD);
		createEReference(fieldEClass, FIELD__ADDITIONAL_FIELDS);

		methodEClass = createEClass(METHOD);
		createEOperation(methodEClass, METHOD___IS_METHOD_FOR_CALL__METHODCALL_BOOLEAN);
		createEOperation(methodEClass, METHOD___IS_SOME_METHOD_FOR_CALL__METHODCALL);
		createEOperation(methodEClass, METHOD___IS_BETTER_METHOD_FOR_CALL__METHOD_METHODCALL);
		createEOperation(methodEClass, METHOD___GET_ARRAY_DIMENSION);

		interfaceMethodEClass = createEClass(INTERFACE_METHOD);

		classMethodEClass = createEClass(CLASS_METHOD);

		enumConstantEClass = createEClass(ENUM_CONSTANT);
		createEReference(enumConstantEClass, ENUM_CONSTANT__ANONYMOUS_CLASS);
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
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		ClassifiersPackage theClassifiersPackage = (ClassifiersPackage)EPackage.Registry.INSTANCE.getEPackage(ClassifiersPackage.eNS_URI);
		ReferencesPackage theReferencesPackage = (ReferencesPackage)EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI);
		ArraysPackage theArraysPackage = (ArraysPackage)EPackage.Registry.INSTANCE.getEPackage(ArraysPackage.eNS_URI);
		InstantiationsPackage theInstantiationsPackage = (InstantiationsPackage)EPackage.Registry.INSTANCE.getEPackage(InstantiationsPackage.eNS_URI);
		StatementsPackage theStatementsPackage = (StatementsPackage)EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI);
		ParametersPackage theParametersPackage = (ParametersPackage)EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI);
		GenericsPackage theGenericsPackage = (GenericsPackage)EPackage.Registry.INSTANCE.getEPackage(GenericsPackage.eNS_URI);
		ModifiersPackage theModifiersPackage = (ModifiersPackage)EPackage.Registry.INSTANCE.getEPackage(ModifiersPackage.eNS_URI);
		VariablesPackage theVariablesPackage = (VariablesPackage)EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI);
		AnnotationsPackage theAnnotationsPackage = (AnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		exceptionThrowerEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
		memberEClass.getESuperTypes().add(theCommonsPackage.getNamedElement());
		memberContainerEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
		additionalFieldEClass.getESuperTypes().add(theReferencesPackage.getReferenceableElement());
		additionalFieldEClass.getESuperTypes().add(theArraysPackage.getArrayTypeable());
		additionalFieldEClass.getESuperTypes().add(theInstantiationsPackage.getInitializable());
		constructorEClass.getESuperTypes().add(this.getMember());
		constructorEClass.getESuperTypes().add(theStatementsPackage.getStatementListContainer());
		constructorEClass.getESuperTypes().add(theParametersPackage.getParametrizable());
		constructorEClass.getESuperTypes().add(theGenericsPackage.getTypeParametrizable());
		constructorEClass.getESuperTypes().add(this.getExceptionThrower());
		constructorEClass.getESuperTypes().add(theModifiersPackage.getAnnotableAndModifiable());
		emptyMemberEClass.getESuperTypes().add(this.getMember());
		fieldEClass.getESuperTypes().add(this.getMember());
		fieldEClass.getESuperTypes().add(theInstantiationsPackage.getInitializable());
		fieldEClass.getESuperTypes().add(theVariablesPackage.getVariable());
		fieldEClass.getESuperTypes().add(theReferencesPackage.getReferenceableElement());
		fieldEClass.getESuperTypes().add(theModifiersPackage.getAnnotableAndModifiable());
		methodEClass.getESuperTypes().add(this.getMember());
		methodEClass.getESuperTypes().add(theTypesPackage.getTypedElement());
		methodEClass.getESuperTypes().add(theArraysPackage.getArrayTypeable());
		methodEClass.getESuperTypes().add(theGenericsPackage.getTypeParametrizable());
		methodEClass.getESuperTypes().add(theParametersPackage.getParametrizable());
		methodEClass.getESuperTypes().add(theReferencesPackage.getReferenceableElement());
		methodEClass.getESuperTypes().add(this.getExceptionThrower());
		methodEClass.getESuperTypes().add(theModifiersPackage.getAnnotableAndModifiable());
		interfaceMethodEClass.getESuperTypes().add(this.getMethod());
		classMethodEClass.getESuperTypes().add(this.getMethod());
		classMethodEClass.getESuperTypes().add(theStatementsPackage.getStatementListContainer());
		enumConstantEClass.getESuperTypes().add(theReferencesPackage.getReferenceableElement());
		enumConstantEClass.getESuperTypes().add(theReferencesPackage.getArgumentable());
		enumConstantEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotable());

		// Initialize classes, features, and operations; add parameters
		initEClass(exceptionThrowerEClass, ExceptionThrower.class, "ExceptionThrower", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExceptionThrower_Exceptions(), theTypesPackage.getNamespaceClassifierReference(), null, "exceptions", null, 0, -1, ExceptionThrower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memberEClass, Member.class, "Member", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(memberContainerEClass, MemberContainer.class, "MemberContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemberContainer_Members(), this.getMember(), null, "members", null, 0, -1, MemberContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemberContainer_DefaultMembers(), this.getMember(), null, "defaultMembers", null, 0, -1, MemberContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getMemberContainer__GetContainedClassifier__String(), theClassifiersPackage.getConcreteClassifier(), "getContainedClassifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMemberContainer__GetContainedField__String(), this.getField(), "getContainedField", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMemberContainer__GetContainedMethod__String(), this.getMethod(), "getContainedMethod", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMemberContainer__GetMethods(), this.getMethod(), "getMethods", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMemberContainer__RemoveMethods__String(), null, "removeMethods", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMemberContainer__GetMembersByName__String(), this.getMember(), "getMembersByName", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMemberContainer__CreateField__String_String(), this.getField(), "createField", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "qualifiedTypeName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMemberContainer__GetFields(), this.getField(), "getFields", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(additionalFieldEClass, AdditionalField.class, "AdditionalField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAdditionalField__GetArrayDimension(), ecorePackage.getELong(), "getArrayDimension", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(constructorEClass, Constructor.class, "Constructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emptyMemberEClass, EmptyMember.class, "EmptyMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getField_AdditionalFields(), this.getAdditionalField(), null, "additionalFields", null, 0, -1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodEClass, Method.class, "Method", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getMethod__IsMethodForCall__MethodCall_boolean(), ecorePackage.getEBoolean(), "isMethodForCall", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReferencesPackage.getMethodCall(), "methodCall", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "needsPerfectMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMethod__IsSomeMethodForCall__MethodCall(), ecorePackage.getEBoolean(), "isSomeMethodForCall", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReferencesPackage.getMethodCall(), "methodCall", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMethod__IsBetterMethodForCall__Method_MethodCall(), ecorePackage.getEBoolean(), "isBetterMethodForCall", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMethod(), "otherMethod", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReferencesPackage.getMethodCall(), "methodCall", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMethod__GetArrayDimension(), ecorePackage.getELong(), "getArrayDimension", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(interfaceMethodEClass, InterfaceMethod.class, "InterfaceMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classMethodEClass, ClassMethod.class, "ClassMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumConstantEClass, EnumConstant.class, "EnumConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumConstant_AnonymousClass(), theClassifiersPackage.getAnonymousClass(), null, "anonymousClass", null, 0, 1, EnumConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MembersPackageImpl
