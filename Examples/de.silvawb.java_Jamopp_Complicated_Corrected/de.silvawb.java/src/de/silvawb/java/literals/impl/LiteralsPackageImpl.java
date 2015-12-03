/**
 */
package de.silvawb.java.literals.impl;

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

import de.silvawb.java.literals.BooleanLiteral;
import de.silvawb.java.literals.CharacterLiteral;
import de.silvawb.java.literals.DecimalDoubleLiteral;
import de.silvawb.java.literals.DecimalFloatLiteral;
import de.silvawb.java.literals.DecimalIntegerLiteral;
import de.silvawb.java.literals.DecimalLongLiteral;
import de.silvawb.java.literals.DoubleLiteral;
import de.silvawb.java.literals.FloatLiteral;
import de.silvawb.java.literals.HexDoubleLiteral;
import de.silvawb.java.literals.HexFloatLiteral;
import de.silvawb.java.literals.HexIntegerLiteral;
import de.silvawb.java.literals.HexLongLiteral;
import de.silvawb.java.literals.IntegerLiteral;
import de.silvawb.java.literals.Literal;
import de.silvawb.java.literals.LiteralsFactory;
import de.silvawb.java.literals.LiteralsPackage;
import de.silvawb.java.literals.LongLiteral;
import de.silvawb.java.literals.NullLiteral;
import de.silvawb.java.literals.OctalIntegerLiteral;
import de.silvawb.java.literals.OctalLongLiteral;
import de.silvawb.java.literals.Self;
import de.silvawb.java.literals.Super;
import de.silvawb.java.literals.This;

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
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LiteralsPackageImpl extends EPackageImpl implements LiteralsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalFloatLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hexFloatLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalDoubleLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hexDoubleLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalIntegerLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hexIntegerLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass octalIntegerLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalLongLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hexLongLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass octalLongLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thisEClass = null;

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
	 * @see de.silvawb.java.literals.LiteralsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LiteralsPackageImpl() {
		super(eNS_URI, LiteralsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LiteralsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LiteralsPackage init() {
		if (isInited) return (LiteralsPackage)EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI);

		// Obtain or create and register package
		LiteralsPackageImpl theLiteralsPackage = (LiteralsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LiteralsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LiteralsPackageImpl());

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
		theLiteralsPackage.createPackageContents();
		theAnnotationsPackage.createPackageContents();
		theArraysPackage.createPackageContents();
		theClassifiersPackage.createPackageContents();
		theCommonsPackage.createPackageContents();
		theContainersPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theGenericsPackage.createPackageContents();
		theImportsPackage.createPackageContents();
		theInstantiationsPackage.createPackageContents();
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
		theLiteralsPackage.initializePackageContents();
		theAnnotationsPackage.initializePackageContents();
		theArraysPackage.initializePackageContents();
		theClassifiersPackage.initializePackageContents();
		theCommonsPackage.initializePackageContents();
		theContainersPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theGenericsPackage.initializePackageContents();
		theImportsPackage.initializePackageContents();
		theInstantiationsPackage.initializePackageContents();
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
		theLiteralsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LiteralsPackage.eNS_URI, theLiteralsPackage);
		return theLiteralsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLiteral__GetOneType__boolean() {
		return literalEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelf() {
		return selfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanLiteral() {
		return booleanLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanLiteral_Value() {
		return (EAttribute)booleanLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacterLiteral() {
		return characterLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterLiteral_Value() {
		return (EAttribute)characterLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatLiteral() {
		return floatLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecimalFloatLiteral() {
		return decimalFloatLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalFloatLiteral_DecimalValue() {
		return (EAttribute)decimalFloatLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHexFloatLiteral() {
		return hexFloatLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHexFloatLiteral_HexValue() {
		return (EAttribute)hexFloatLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoubleLiteral() {
		return doubleLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecimalDoubleLiteral() {
		return decimalDoubleLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalDoubleLiteral_DecimalValue() {
		return (EAttribute)decimalDoubleLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHexDoubleLiteral() {
		return hexDoubleLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHexDoubleLiteral_HexValue() {
		return (EAttribute)hexDoubleLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerLiteral() {
		return integerLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecimalIntegerLiteral() {
		return decimalIntegerLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalIntegerLiteral_DecimalValue() {
		return (EAttribute)decimalIntegerLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHexIntegerLiteral() {
		return hexIntegerLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHexIntegerLiteral_HexValue() {
		return (EAttribute)hexIntegerLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOctalIntegerLiteral() {
		return octalIntegerLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOctalIntegerLiteral_OctalValue() {
		return (EAttribute)octalIntegerLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongLiteral() {
		return longLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecimalLongLiteral() {
		return decimalLongLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalLongLiteral_DecimalValue() {
		return (EAttribute)decimalLongLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHexLongLiteral() {
		return hexLongLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHexLongLiteral_HexValue() {
		return (EAttribute)hexLongLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOctalLongLiteral() {
		return octalLongLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOctalLongLiteral_OctalValue() {
		return (EAttribute)octalLongLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNullLiteral() {
		return nullLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuper() {
		return superEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThis() {
		return thisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralsFactory getLiteralsFactory() {
		return (LiteralsFactory)getEFactoryInstance();
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
		literalEClass = createEClass(LITERAL);
		createEOperation(literalEClass, LITERAL___GET_ONE_TYPE__BOOLEAN);

		selfEClass = createEClass(SELF);

		booleanLiteralEClass = createEClass(BOOLEAN_LITERAL);
		createEAttribute(booleanLiteralEClass, BOOLEAN_LITERAL__VALUE);

		characterLiteralEClass = createEClass(CHARACTER_LITERAL);
		createEAttribute(characterLiteralEClass, CHARACTER_LITERAL__VALUE);

		floatLiteralEClass = createEClass(FLOAT_LITERAL);

		decimalFloatLiteralEClass = createEClass(DECIMAL_FLOAT_LITERAL);
		createEAttribute(decimalFloatLiteralEClass, DECIMAL_FLOAT_LITERAL__DECIMAL_VALUE);

		hexFloatLiteralEClass = createEClass(HEX_FLOAT_LITERAL);
		createEAttribute(hexFloatLiteralEClass, HEX_FLOAT_LITERAL__HEX_VALUE);

		doubleLiteralEClass = createEClass(DOUBLE_LITERAL);

		decimalDoubleLiteralEClass = createEClass(DECIMAL_DOUBLE_LITERAL);
		createEAttribute(decimalDoubleLiteralEClass, DECIMAL_DOUBLE_LITERAL__DECIMAL_VALUE);

		hexDoubleLiteralEClass = createEClass(HEX_DOUBLE_LITERAL);
		createEAttribute(hexDoubleLiteralEClass, HEX_DOUBLE_LITERAL__HEX_VALUE);

		integerLiteralEClass = createEClass(INTEGER_LITERAL);

		decimalIntegerLiteralEClass = createEClass(DECIMAL_INTEGER_LITERAL);
		createEAttribute(decimalIntegerLiteralEClass, DECIMAL_INTEGER_LITERAL__DECIMAL_VALUE);

		hexIntegerLiteralEClass = createEClass(HEX_INTEGER_LITERAL);
		createEAttribute(hexIntegerLiteralEClass, HEX_INTEGER_LITERAL__HEX_VALUE);

		octalIntegerLiteralEClass = createEClass(OCTAL_INTEGER_LITERAL);
		createEAttribute(octalIntegerLiteralEClass, OCTAL_INTEGER_LITERAL__OCTAL_VALUE);

		longLiteralEClass = createEClass(LONG_LITERAL);

		decimalLongLiteralEClass = createEClass(DECIMAL_LONG_LITERAL);
		createEAttribute(decimalLongLiteralEClass, DECIMAL_LONG_LITERAL__DECIMAL_VALUE);

		hexLongLiteralEClass = createEClass(HEX_LONG_LITERAL);
		createEAttribute(hexLongLiteralEClass, HEX_LONG_LITERAL__HEX_VALUE);

		octalLongLiteralEClass = createEClass(OCTAL_LONG_LITERAL);
		createEAttribute(octalLongLiteralEClass, OCTAL_LONG_LITERAL__OCTAL_VALUE);

		nullLiteralEClass = createEClass(NULL_LITERAL);

		superEClass = createEClass(SUPER);

		thisEClass = createEClass(THIS);
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
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		CommonsPackage theCommonsPackage = (CommonsPackage)EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		literalEClass.getESuperTypes().add(theExpressionsPackage.getPrimaryExpression());
		selfEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
		booleanLiteralEClass.getESuperTypes().add(this.getLiteral());
		characterLiteralEClass.getESuperTypes().add(this.getLiteral());
		floatLiteralEClass.getESuperTypes().add(this.getLiteral());
		decimalFloatLiteralEClass.getESuperTypes().add(this.getFloatLiteral());
		hexFloatLiteralEClass.getESuperTypes().add(this.getFloatLiteral());
		doubleLiteralEClass.getESuperTypes().add(this.getLiteral());
		decimalDoubleLiteralEClass.getESuperTypes().add(this.getDoubleLiteral());
		hexDoubleLiteralEClass.getESuperTypes().add(this.getDoubleLiteral());
		integerLiteralEClass.getESuperTypes().add(this.getLiteral());
		decimalIntegerLiteralEClass.getESuperTypes().add(this.getIntegerLiteral());
		hexIntegerLiteralEClass.getESuperTypes().add(this.getIntegerLiteral());
		octalIntegerLiteralEClass.getESuperTypes().add(this.getIntegerLiteral());
		longLiteralEClass.getESuperTypes().add(this.getLiteral());
		decimalLongLiteralEClass.getESuperTypes().add(this.getLongLiteral());
		hexLongLiteralEClass.getESuperTypes().add(this.getLongLiteral());
		octalLongLiteralEClass.getESuperTypes().add(this.getLongLiteral());
		nullLiteralEClass.getESuperTypes().add(this.getLiteral());
		superEClass.getESuperTypes().add(this.getSelf());
		thisEClass.getESuperTypes().add(this.getSelf());

		// Initialize classes, features, and operations; add parameters
		initEClass(literalEClass, Literal.class, "Literal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getLiteral__GetOneType__boolean(), theTypesPackage.getType(), "getOneType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "alternative", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(selfEClass, Self.class, "Self", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanLiteralEClass, BooleanLiteral.class, "BooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanLiteral_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, BooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(characterLiteralEClass, CharacterLiteral.class, "CharacterLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharacterLiteral_Value(), ecorePackage.getEChar(), "value", null, 1, 1, CharacterLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floatLiteralEClass, FloatLiteral.class, "FloatLiteral", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decimalFloatLiteralEClass, DecimalFloatLiteral.class, "DecimalFloatLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecimalFloatLiteral_DecimalValue(), ecorePackage.getEFloat(), "decimalValue", null, 1, 1, DecimalFloatLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hexFloatLiteralEClass, HexFloatLiteral.class, "HexFloatLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHexFloatLiteral_HexValue(), ecorePackage.getEFloat(), "hexValue", null, 1, 1, HexFloatLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doubleLiteralEClass, DoubleLiteral.class, "DoubleLiteral", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decimalDoubleLiteralEClass, DecimalDoubleLiteral.class, "DecimalDoubleLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecimalDoubleLiteral_DecimalValue(), ecorePackage.getEDouble(), "decimalValue", null, 1, 1, DecimalDoubleLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hexDoubleLiteralEClass, HexDoubleLiteral.class, "HexDoubleLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHexDoubleLiteral_HexValue(), ecorePackage.getEDouble(), "hexValue", null, 1, 1, HexDoubleLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerLiteralEClass, IntegerLiteral.class, "IntegerLiteral", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decimalIntegerLiteralEClass, DecimalIntegerLiteral.class, "DecimalIntegerLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecimalIntegerLiteral_DecimalValue(), ecorePackage.getEBigInteger(), "decimalValue", null, 1, 1, DecimalIntegerLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hexIntegerLiteralEClass, HexIntegerLiteral.class, "HexIntegerLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHexIntegerLiteral_HexValue(), ecorePackage.getEBigInteger(), "hexValue", null, 1, 1, HexIntegerLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(octalIntegerLiteralEClass, OctalIntegerLiteral.class, "OctalIntegerLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOctalIntegerLiteral_OctalValue(), ecorePackage.getEBigInteger(), "octalValue", null, 1, 1, OctalIntegerLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(longLiteralEClass, LongLiteral.class, "LongLiteral", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decimalLongLiteralEClass, DecimalLongLiteral.class, "DecimalLongLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecimalLongLiteral_DecimalValue(), ecorePackage.getEBigInteger(), "decimalValue", null, 1, 1, DecimalLongLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hexLongLiteralEClass, HexLongLiteral.class, "HexLongLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHexLongLiteral_HexValue(), ecorePackage.getEBigInteger(), "hexValue", null, 1, 1, HexLongLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(octalLongLiteralEClass, OctalLongLiteral.class, "OctalLongLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOctalLongLiteral_OctalValue(), ecorePackage.getEBigInteger(), "octalValue", null, 1, 1, OctalLongLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nullLiteralEClass, NullLiteral.class, "NullLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(superEClass, Super.class, "Super", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(thisEClass, This.class, "This", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //LiteralsPackageImpl
