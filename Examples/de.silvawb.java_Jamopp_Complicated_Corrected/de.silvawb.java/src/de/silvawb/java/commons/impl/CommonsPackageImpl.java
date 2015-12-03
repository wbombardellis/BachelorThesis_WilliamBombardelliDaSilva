/**
 */
package de.silvawb.java.commons.impl;

import de.silvawb.java.annotations.AnnotationsPackage;

import de.silvawb.java.annotations.impl.AnnotationsPackageImpl;

import de.silvawb.java.arrays.ArraysPackage;

import de.silvawb.java.arrays.impl.ArraysPackageImpl;

import de.silvawb.java.classifiers.ClassifiersPackage;

import de.silvawb.java.classifiers.impl.ClassifiersPackageImpl;

import de.silvawb.java.commons.Commentable;
import de.silvawb.java.commons.CommonsFactory;
import de.silvawb.java.commons.CommonsPackage;
import de.silvawb.java.commons.NamedElement;
import de.silvawb.java.commons.NamespaceAwareElement;

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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonsPackageImpl extends EPackageImpl implements CommonsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceAwareElementEClass = null;

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
	 * @see de.silvawb.java.commons.CommonsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommonsPackageImpl() {
		super(eNS_URI, CommonsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CommonsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommonsPackage init() {
		if (isInited) return (CommonsPackage)EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI);

		// Obtain or create and register package
		CommonsPackageImpl theCommonsPackage = (CommonsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CommonsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CommonsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AnnotationsPackageImpl theAnnotationsPackage = (AnnotationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI) instanceof AnnotationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI) : AnnotationsPackage.eINSTANCE);
		ArraysPackageImpl theArraysPackage = (ArraysPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArraysPackage.eNS_URI) instanceof ArraysPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArraysPackage.eNS_URI) : ArraysPackage.eINSTANCE);
		ClassifiersPackageImpl theClassifiersPackage = (ClassifiersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClassifiersPackage.eNS_URI) instanceof ClassifiersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClassifiersPackage.eNS_URI) : ClassifiersPackage.eINSTANCE);
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
		theCommonsPackage.createPackageContents();
		theAnnotationsPackage.createPackageContents();
		theArraysPackage.createPackageContents();
		theClassifiersPackage.createPackageContents();
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
		theCommonsPackage.initializePackageContents();
		theAnnotationsPackage.initializePackageContents();
		theArraysPackage.initializePackageContents();
		theClassifiersPackage.initializePackageContents();
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
		theCommonsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommonsPackage.eNS_URI, theCommonsPackage);
		return theCommonsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommentable() {
		return commentableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommentable_LayoutInformations() {
		return (EReference)commentableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetConcreteClassifier__String() {
		return commentableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetConcreteClassifierProxy__String() {
		return commentableEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetConcreteClassifiers__String_String() {
		return commentableEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetConcreteClassifierProxies__String_String() {
		return commentableEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetLibClass__String() {
		return commentableEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetLibInterface__String() {
		return commentableEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetClassClass() {
		return commentableEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetObjectClass() {
		return commentableEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetStringClass() {
		return commentableEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetAnnotationInterface() {
		return commentableEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetContainingAnnotationInstance() {
		return commentableEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetContainingAnonymousClass() {
		return commentableEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetContainingConcreteClassifier() {
		return commentableEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetContainingCompilationUnit() {
		return commentableEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetContainingPackageName() {
		return commentableEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetParentConcreteClassifier() {
		return commentableEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetParentByEType__EClass() {
		return commentableEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetFirstChildByEType__EClass() {
		return commentableEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetParentByType__Class() {
		return commentableEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetFirstChildByType__Class() {
		return commentableEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetChildrenByEType__EClass() {
		return commentableEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetChildrenByType__Class() {
		return commentableEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetComments() {
		return commentableEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__AddBeforeContainingStatement__Statement() {
		return commentableEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__AddAfterContainingStatement__Statement() {
		return commentableEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespaceAwareElement() {
		return namespaceAwareElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespaceAwareElement_Namespaces() {
		return (EAttribute)namespaceAwareElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamespaceAwareElement__GetNamespacesAsString() {
		return namespaceAwareElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamespaceAwareElement__GetClassifierAtNamespaces() {
		return namespaceAwareElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonsFactory getCommonsFactory() {
		return (CommonsFactory)getEFactoryInstance();
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
		commentableEClass = createEClass(COMMENTABLE);
		createEReference(commentableEClass, COMMENTABLE__LAYOUT_INFORMATIONS);
		createEOperation(commentableEClass, COMMENTABLE___GET_CONCRETE_CLASSIFIER__STRING);
		createEOperation(commentableEClass, COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING);
		createEOperation(commentableEClass, COMMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING);
		createEOperation(commentableEClass, COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING);
		createEOperation(commentableEClass, COMMENTABLE___GET_LIB_CLASS__STRING);
		createEOperation(commentableEClass, COMMENTABLE___GET_LIB_INTERFACE__STRING);
		createEOperation(commentableEClass, COMMENTABLE___GET_CLASS_CLASS);
		createEOperation(commentableEClass, COMMENTABLE___GET_OBJECT_CLASS);
		createEOperation(commentableEClass, COMMENTABLE___GET_STRING_CLASS);
		createEOperation(commentableEClass, COMMENTABLE___GET_ANNOTATION_INTERFACE);
		createEOperation(commentableEClass, COMMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE);
		createEOperation(commentableEClass, COMMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS);
		createEOperation(commentableEClass, COMMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER);
		createEOperation(commentableEClass, COMMENTABLE___GET_CONTAINING_COMPILATION_UNIT);
		createEOperation(commentableEClass, COMMENTABLE___GET_CONTAINING_PACKAGE_NAME);
		createEOperation(commentableEClass, COMMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER);
		createEOperation(commentableEClass, COMMENTABLE___GET_PARENT_BY_ETYPE__ECLASS);
		createEOperation(commentableEClass, COMMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS);
		createEOperation(commentableEClass, COMMENTABLE___GET_PARENT_BY_TYPE__CLASS);
		createEOperation(commentableEClass, COMMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS);
		createEOperation(commentableEClass, COMMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS);
		createEOperation(commentableEClass, COMMENTABLE___GET_CHILDREN_BY_TYPE__CLASS);
		createEOperation(commentableEClass, COMMENTABLE___GET_COMMENTS);
		createEOperation(commentableEClass, COMMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT);
		createEOperation(commentableEClass, COMMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		namespaceAwareElementEClass = createEClass(NAMESPACE_AWARE_ELEMENT);
		createEAttribute(namespaceAwareElementEClass, NAMESPACE_AWARE_ELEMENT__NAMESPACES);
		createEOperation(namespaceAwareElementEClass, NAMESPACE_AWARE_ELEMENT___GET_NAMESPACES_AS_STRING);
		createEOperation(namespaceAwareElementEClass, NAMESPACE_AWARE_ELEMENT___GET_CLASSIFIER_AT_NAMESPACES);
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
		LayoutPackage theLayoutPackage = (LayoutPackage)EPackage.Registry.INSTANCE.getEPackage(LayoutPackage.eNS_URI);
		ClassifiersPackage theClassifiersPackage = (ClassifiersPackage)EPackage.Registry.INSTANCE.getEPackage(ClassifiersPackage.eNS_URI);
		AnnotationsPackage theAnnotationsPackage = (AnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);
		ContainersPackage theContainersPackage = (ContainersPackage)EPackage.Registry.INSTANCE.getEPackage(ContainersPackage.eNS_URI);
		StatementsPackage theStatementsPackage = (StatementsPackage)EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		namedElementEClass.getESuperTypes().add(this.getCommentable());
		namespaceAwareElementEClass.getESuperTypes().add(this.getCommentable());

		// Initialize classes, features, and operations; add parameters
		initEClass(commentableEClass, Commentable.class, "Commentable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommentable_LayoutInformations(), theLayoutPackage.getLayoutInformation(), null, "layoutInformations", null, 0, -1, Commentable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getCommentable__GetConcreteClassifier__String(), theClassifiersPackage.getConcreteClassifier(), "getConcreteClassifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCommentable__GetConcreteClassifierProxy__String(), theClassifiersPackage.getConcreteClassifier(), "getConcreteClassifierProxy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCommentable__GetConcreteClassifiers__String_String(), theClassifiersPackage.getConcreteClassifier(), "getConcreteClassifiers", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "packageName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "classifierQuery", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCommentable__GetConcreteClassifierProxies__String_String(), theClassifiersPackage.getConcreteClassifier(), "getConcreteClassifierProxies", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "packageName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "classifierQuery", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCommentable__GetLibClass__String(), theClassifiersPackage.getClass_(), "getLibClass", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCommentable__GetLibInterface__String(), theClassifiersPackage.getInterface(), "getLibInterface", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCommentable__GetClassClass(), theClassifiersPackage.getClass_(), "getClassClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCommentable__GetObjectClass(), theClassifiersPackage.getClass_(), "getObjectClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCommentable__GetStringClass(), theClassifiersPackage.getClass_(), "getStringClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCommentable__GetAnnotationInterface(), theClassifiersPackage.getInterface(), "getAnnotationInterface", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCommentable__GetContainingAnnotationInstance(), theAnnotationsPackage.getAnnotationInstance(), "getContainingAnnotationInstance", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCommentable__GetContainingAnonymousClass(), theClassifiersPackage.getAnonymousClass(), "getContainingAnonymousClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCommentable__GetContainingConcreteClassifier(), theClassifiersPackage.getConcreteClassifier(), "getContainingConcreteClassifier", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCommentable__GetContainingCompilationUnit(), theContainersPackage.getCompilationUnit(), "getContainingCompilationUnit", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCommentable__GetContainingPackageName(), ecorePackage.getEString(), "getContainingPackageName", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCommentable__GetParentConcreteClassifier(), theClassifiersPackage.getConcreteClassifier(), "getParentConcreteClassifier", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCommentable__GetParentByEType__EClass(), ecorePackage.getEObject(), "getParentByEType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCommentable__GetFirstChildByEType__EClass(), ecorePackage.getEObject(), "getFirstChildByEType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCommentable__GetParentByType__Class(), null, "getParentByType", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "T");
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "type", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getCommentable__GetFirstChildByType__Class(), null, "getFirstChildByType", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "type", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getCommentable__GetChildrenByEType__EClass(), ecorePackage.getEObject(), "getChildrenByEType", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCommentable__GetChildrenByType__Class(), null, "getChildrenByType", 0, -1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "type", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEOperation(getCommentable__GetComments(), ecorePackage.getEString(), "getComments", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCommentable__AddBeforeContainingStatement__Statement(), null, "addBeforeContainingStatement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStatementsPackage.getStatement(), "statementToAdd", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCommentable__AddAfterContainingStatement__Statement(), null, "addAfterContainingStatement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStatementsPackage.getStatement(), "statementToAdd", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namespaceAwareElementEClass, NamespaceAwareElement.class, "NamespaceAwareElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamespaceAwareElement_Namespaces(), ecorePackage.getEString(), "namespaces", null, 0, -1, NamespaceAwareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getNamespaceAwareElement__GetNamespacesAsString(), ecorePackage.getEString(), "getNamespacesAsString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getNamespaceAwareElement__GetClassifierAtNamespaces(), theClassifiersPackage.getConcreteClassifier(), "getClassifierAtNamespaces", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CommonsPackageImpl
