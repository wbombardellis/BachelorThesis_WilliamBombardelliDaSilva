/**
 */
package de.silvawb.java.classifiers.impl;

import de.silvawb.java.annotations.AnnotationsPackage;

import de.silvawb.java.annotations.impl.AnnotationsPackageImpl;

import de.silvawb.java.arrays.ArraysPackage;

import de.silvawb.java.arrays.impl.ArraysPackageImpl;

import de.silvawb.java.classifiers.Annotation;
import de.silvawb.java.classifiers.AnonymousClass;
import de.silvawb.java.classifiers.Classifier;
import de.silvawb.java.classifiers.ClassifiersFactory;
import de.silvawb.java.classifiers.ClassifiersPackage;
import de.silvawb.java.classifiers.ConcreteClassifier;
import de.silvawb.java.classifiers.Enumeration;
import de.silvawb.java.classifiers.Implementor;
import de.silvawb.java.classifiers.Interface;

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
public class ClassifiersPackageImpl extends EPackageImpl implements ClassifiersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousClassEClass = null;

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
	 * @see de.silvawb.java.classifiers.ClassifiersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ClassifiersPackageImpl() {
		super(eNS_URI, ClassifiersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ClassifiersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ClassifiersPackage init() {
		if (isInited) return (ClassifiersPackage)EPackage.Registry.INSTANCE.getEPackage(ClassifiersPackage.eNS_URI);

		// Obtain or create and register package
		ClassifiersPackageImpl theClassifiersPackage = (ClassifiersPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ClassifiersPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ClassifiersPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AnnotationsPackageImpl theAnnotationsPackage = (AnnotationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI) instanceof AnnotationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI) : AnnotationsPackage.eINSTANCE);
		ArraysPackageImpl theArraysPackage = (ArraysPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArraysPackage.eNS_URI) instanceof ArraysPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArraysPackage.eNS_URI) : ArraysPackage.eINSTANCE);
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
		theClassifiersPackage.createPackageContents();
		theAnnotationsPackage.createPackageContents();
		theArraysPackage.createPackageContents();
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
		theClassifiersPackage.initializePackageContents();
		theAnnotationsPackage.initializePackageContents();
		theArraysPackage.initializePackageContents();
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
		theClassifiersPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ClassifiersPackage.eNS_URI, theClassifiersPackage);
		return theClassifiersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifier() {
		return classifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__GetAllSuperClassifiers() {
		return classifierEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteClassifier() {
		return concreteClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConcreteClassifier__GetInnerClassifiers() {
		return concreteClassifierEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConcreteClassifier__GetAllInnerClassifiers() {
		return concreteClassifierEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConcreteClassifier__GetSuperTypeReferences() {
		return concreteClassifierEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConcreteClassifier__GetAllMembers__Commentable() {
		return concreteClassifierEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementor() {
		return implementorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementor_Implements() {
		return (EReference)implementorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Extends() {
		return (EReference)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_DefaultExtends() {
		return (EReference)classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__GetAllSuperClassifiers() {
		return classEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__GetSuperClass() {
		return classEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__UnWrapPrimitiveType() {
		return classEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Extends() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_DefaultExtends() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__GetAllSuperClassifiers() {
		return interfaceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeration() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_Constants() {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnumeration__GetAllSuperClassifiers() {
		return enumerationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnumeration__GetContainedConstant__String() {
		return enumerationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotation__GetAllSuperClassifiers() {
		return annotationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnonymousClass() {
		return anonymousClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__GetAllSuperClassifiers() {
		return anonymousClassEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__GetSuperClassifier() {
		return anonymousClassEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__GetAllMembers__Commentable() {
		return anonymousClassEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifiersFactory getClassifiersFactory() {
		return (ClassifiersFactory)getEFactoryInstance();
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
		classifierEClass = createEClass(CLASSIFIER);
		createEOperation(classifierEClass, CLASSIFIER___GET_ALL_SUPER_CLASSIFIERS);

		concreteClassifierEClass = createEClass(CONCRETE_CLASSIFIER);
		createEOperation(concreteClassifierEClass, CONCRETE_CLASSIFIER___GET_INNER_CLASSIFIERS);
		createEOperation(concreteClassifierEClass, CONCRETE_CLASSIFIER___GET_ALL_INNER_CLASSIFIERS);
		createEOperation(concreteClassifierEClass, CONCRETE_CLASSIFIER___GET_SUPER_TYPE_REFERENCES);
		createEOperation(concreteClassifierEClass, CONCRETE_CLASSIFIER___GET_ALL_MEMBERS__COMMENTABLE);

		implementorEClass = createEClass(IMPLEMENTOR);
		createEReference(implementorEClass, IMPLEMENTOR__IMPLEMENTS);

		classEClass = createEClass(CLASS);
		createEReference(classEClass, CLASS__EXTENDS);
		createEReference(classEClass, CLASS__DEFAULT_EXTENDS);
		createEOperation(classEClass, CLASS___GET_ALL_SUPER_CLASSIFIERS);
		createEOperation(classEClass, CLASS___GET_SUPER_CLASS);
		createEOperation(classEClass, CLASS___UN_WRAP_PRIMITIVE_TYPE);

		interfaceEClass = createEClass(INTERFACE);
		createEReference(interfaceEClass, INTERFACE__EXTENDS);
		createEReference(interfaceEClass, INTERFACE__DEFAULT_EXTENDS);
		createEOperation(interfaceEClass, INTERFACE___GET_ALL_SUPER_CLASSIFIERS);

		enumerationEClass = createEClass(ENUMERATION);
		createEReference(enumerationEClass, ENUMERATION__CONSTANTS);
		createEOperation(enumerationEClass, ENUMERATION___GET_ALL_SUPER_CLASSIFIERS);
		createEOperation(enumerationEClass, ENUMERATION___GET_CONTAINED_CONSTANT__STRING);

		annotationEClass = createEClass(ANNOTATION);
		createEOperation(annotationEClass, ANNOTATION___GET_ALL_SUPER_CLASSIFIERS);

		anonymousClassEClass = createEClass(ANONYMOUS_CLASS);
		createEOperation(anonymousClassEClass, ANONYMOUS_CLASS___GET_ALL_SUPER_CLASSIFIERS);
		createEOperation(anonymousClassEClass, ANONYMOUS_CLASS___GET_SUPER_CLASSIFIER);
		createEOperation(anonymousClassEClass, ANONYMOUS_CLASS___GET_ALL_MEMBERS__COMMENTABLE);
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
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		ReferencesPackage theReferencesPackage = (ReferencesPackage)EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI);
		GenericsPackage theGenericsPackage = (GenericsPackage)EPackage.Registry.INSTANCE.getEPackage(GenericsPackage.eNS_URI);
		MembersPackage theMembersPackage = (MembersPackage)EPackage.Registry.INSTANCE.getEPackage(MembersPackage.eNS_URI);
		StatementsPackage theStatementsPackage = (StatementsPackage)EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI);
		ModifiersPackage theModifiersPackage = (ModifiersPackage)EPackage.Registry.INSTANCE.getEPackage(ModifiersPackage.eNS_URI);
		CommonsPackage theCommonsPackage = (CommonsPackage)EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		classifierEClass.getESuperTypes().add(theTypesPackage.getType());
		classifierEClass.getESuperTypes().add(theReferencesPackage.getReferenceableElement());
		concreteClassifierEClass.getESuperTypes().add(this.getClassifier());
		concreteClassifierEClass.getESuperTypes().add(theGenericsPackage.getTypeParametrizable());
		concreteClassifierEClass.getESuperTypes().add(theMembersPackage.getMemberContainer());
		concreteClassifierEClass.getESuperTypes().add(theMembersPackage.getMember());
		concreteClassifierEClass.getESuperTypes().add(theStatementsPackage.getStatement());
		concreteClassifierEClass.getESuperTypes().add(theModifiersPackage.getAnnotableAndModifiable());
		implementorEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
		classEClass.getESuperTypes().add(this.getConcreteClassifier());
		classEClass.getESuperTypes().add(this.getImplementor());
		interfaceEClass.getESuperTypes().add(this.getConcreteClassifier());
		enumerationEClass.getESuperTypes().add(this.getConcreteClassifier());
		enumerationEClass.getESuperTypes().add(this.getImplementor());
		annotationEClass.getESuperTypes().add(this.getConcreteClassifier());
		anonymousClassEClass.getESuperTypes().add(theTypesPackage.getType());
		anonymousClassEClass.getESuperTypes().add(theMembersPackage.getMemberContainer());

		// Initialize classes, features, and operations; add parameters
		initEClass(classifierEClass, Classifier.class, "Classifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getClassifier__GetAllSuperClassifiers(), this.getConcreteClassifier(), "getAllSuperClassifiers", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(concreteClassifierEClass, ConcreteClassifier.class, "ConcreteClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getConcreteClassifier__GetInnerClassifiers(), this.getConcreteClassifier(), "getInnerClassifiers", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getConcreteClassifier__GetAllInnerClassifiers(), this.getConcreteClassifier(), "getAllInnerClassifiers", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getConcreteClassifier__GetSuperTypeReferences(), theTypesPackage.getClassifierReference(), "getSuperTypeReferences", 0, -1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getConcreteClassifier__GetAllMembers__Commentable(), theMembersPackage.getMember(), "getAllMembers", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCommonsPackage.getCommentable(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(implementorEClass, Implementor.class, "Implementor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplementor_Implements(), theTypesPackage.getTypeReference(), null, "implements", null, 0, -1, Implementor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classEClass, de.silvawb.java.classifiers.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass_Extends(), theTypesPackage.getTypeReference(), null, "extends", null, 0, 1, de.silvawb.java.classifiers.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_DefaultExtends(), theTypesPackage.getTypeReference(), null, "defaultExtends", null, 0, 1, de.silvawb.java.classifiers.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getClass__GetAllSuperClassifiers(), this.getConcreteClassifier(), "getAllSuperClassifiers", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getClass__GetSuperClass(), this.getClass_(), "getSuperClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getClass__UnWrapPrimitiveType(), theTypesPackage.getPrimitiveType(), "unWrapPrimitiveType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_Extends(), theTypesPackage.getTypeReference(), null, "extends", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_DefaultExtends(), theTypesPackage.getTypeReference(), null, "defaultExtends", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getInterface__GetAllSuperClassifiers(), this.getConcreteClassifier(), "getAllSuperClassifiers", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeration_Constants(), theMembersPackage.getEnumConstant(), null, "constants", null, 0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEnumeration__GetAllSuperClassifiers(), this.getConcreteClassifier(), "getAllSuperClassifiers", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnumeration__GetContainedConstant__String(), theMembersPackage.getEnumConstant(), "getContainedConstant", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAnnotation__GetAllSuperClassifiers(), this.getConcreteClassifier(), "getAllSuperClassifiers", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(anonymousClassEClass, AnonymousClass.class, "AnonymousClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAnonymousClass__GetAllSuperClassifiers(), this.getConcreteClassifier(), "getAllSuperClassifiers", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAnonymousClass__GetSuperClassifier(), this.getConcreteClassifier(), "getSuperClassifier", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAnonymousClass__GetAllMembers__Commentable(), theMembersPackage.getMember(), "getAllMembers", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCommonsPackage.getCommentable(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ClassifiersPackageImpl
