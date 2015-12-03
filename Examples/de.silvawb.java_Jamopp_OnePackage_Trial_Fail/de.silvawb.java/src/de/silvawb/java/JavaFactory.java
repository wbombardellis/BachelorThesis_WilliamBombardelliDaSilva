/**
 */
package de.silvawb.java;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.silvawb.java.JavaPackage
 * @generated
 */
public interface JavaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaFactory eINSTANCE = de.silvawb.java.impl.JavaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Annotation Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Instance</em>'.
	 * @generated
	 */
	AnnotationInstance createAnnotationInstance();

	/**
	 * Returns a new object of class '<em>Single Annotation Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Annotation Parameter</em>'.
	 * @generated
	 */
	SingleAnnotationParameter createSingleAnnotationParameter();

	/**
	 * Returns a new object of class '<em>Annotation Parameter List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Parameter List</em>'.
	 * @generated
	 */
	AnnotationParameterList createAnnotationParameterList();

	/**
	 * Returns a new object of class '<em>Annotation Attribute Setting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Attribute Setting</em>'.
	 * @generated
	 */
	AnnotationAttributeSetting createAnnotationAttributeSetting();

	/**
	 * Returns a new object of class '<em>Annotation Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Attribute</em>'.
	 * @generated
	 */
	AnnotationAttribute createAnnotationAttribute();

	/**
	 * Returns a new object of class '<em>Array Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Dimension</em>'.
	 * @generated
	 */
	ArrayDimension createArrayDimension();

	/**
	 * Returns a new object of class '<em>Array Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Initializer</em>'.
	 * @generated
	 */
	ArrayInitializer createArrayInitializer();

	/**
	 * Returns a new object of class '<em>Array Instantiation By Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Instantiation By Size</em>'.
	 * @generated
	 */
	ArrayInstantiationBySize createArrayInstantiationBySize();

	/**
	 * Returns a new object of class '<em>Array Instantiation By Values Untyped</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Instantiation By Values Untyped</em>'.
	 * @generated
	 */
	ArrayInstantiationByValuesUntyped createArrayInstantiationByValuesUntyped();

	/**
	 * Returns a new object of class '<em>Array Instantiation By Values Typed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Instantiation By Values Typed</em>'.
	 * @generated
	 */
	ArrayInstantiationByValuesTyped createArrayInstantiationByValuesTyped();

	/**
	 * Returns a new object of class '<em>Array Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Selector</em>'.
	 * @generated
	 */
	ArraySelector createArraySelector();

	/**
	 * Returns a new object of class '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class</em>'.
	 * @generated
	 */
	Class createClass();

	/**
	 * Returns a new object of class '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface</em>'.
	 * @generated
	 */
	Interface createInterface();

	/**
	 * Returns a new object of class '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration</em>'.
	 * @generated
	 */
	Enumeration createEnumeration();

	/**
	 * Returns a new object of class '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation</em>'.
	 * @generated
	 */
	Annotation createAnnotation();

	/**
	 * Returns a new object of class '<em>Anonymous Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anonymous Class</em>'.
	 * @generated
	 */
	AnonymousClass createAnonymousClass();

	/**
	 * Returns a new object of class '<em>Compilation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compilation Unit</em>'.
	 * @generated
	 */
	CompilationUnit createCompilationUnit();

	/**
	 * Returns a new object of class '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package</em>'.
	 * @generated
	 */
	Package createPackage();

	/**
	 * Returns a new object of class '<em>Empty Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empty Model</em>'.
	 * @generated
	 */
	EmptyModel createEmptyModel();

	/**
	 * Returns a new object of class '<em>Expression List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression List</em>'.
	 * @generated
	 */
	ExpressionList createExpressionList();

	/**
	 * Returns a new object of class '<em>Assignment Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment Expression</em>'.
	 * @generated
	 */
	AssignmentExpression createAssignmentExpression();

	/**
	 * Returns a new object of class '<em>Conditional Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Expression</em>'.
	 * @generated
	 */
	ConditionalExpression createConditionalExpression();

	/**
	 * Returns a new object of class '<em>Conditional Or Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Or Expression</em>'.
	 * @generated
	 */
	ConditionalOrExpression createConditionalOrExpression();

	/**
	 * Returns a new object of class '<em>Conditional And Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional And Expression</em>'.
	 * @generated
	 */
	ConditionalAndExpression createConditionalAndExpression();

	/**
	 * Returns a new object of class '<em>Inclusive Or Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inclusive Or Expression</em>'.
	 * @generated
	 */
	InclusiveOrExpression createInclusiveOrExpression();

	/**
	 * Returns a new object of class '<em>Exclusive Or Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exclusive Or Expression</em>'.
	 * @generated
	 */
	ExclusiveOrExpression createExclusiveOrExpression();

	/**
	 * Returns a new object of class '<em>And Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Expression</em>'.
	 * @generated
	 */
	AndExpression createAndExpression();

	/**
	 * Returns a new object of class '<em>Equality Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equality Expression</em>'.
	 * @generated
	 */
	EqualityExpression createEqualityExpression();

	/**
	 * Returns a new object of class '<em>Instance Of Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Of Expression</em>'.
	 * @generated
	 */
	InstanceOfExpression createInstanceOfExpression();

	/**
	 * Returns a new object of class '<em>Relation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Expression</em>'.
	 * @generated
	 */
	RelationExpression createRelationExpression();

	/**
	 * Returns a new object of class '<em>Shift Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shift Expression</em>'.
	 * @generated
	 */
	ShiftExpression createShiftExpression();

	/**
	 * Returns a new object of class '<em>Additive Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Additive Expression</em>'.
	 * @generated
	 */
	AdditiveExpression createAdditiveExpression();

	/**
	 * Returns a new object of class '<em>Multiplicative Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplicative Expression</em>'.
	 * @generated
	 */
	MultiplicativeExpression createMultiplicativeExpression();

	/**
	 * Returns a new object of class '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Expression</em>'.
	 * @generated
	 */
	UnaryExpression createUnaryExpression();

	/**
	 * Returns a new object of class '<em>Prefix Unary Modification Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prefix Unary Modification Expression</em>'.
	 * @generated
	 */
	PrefixUnaryModificationExpression createPrefixUnaryModificationExpression();

	/**
	 * Returns a new object of class '<em>Suffix Unary Modification Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Suffix Unary Modification Expression</em>'.
	 * @generated
	 */
	SuffixUnaryModificationExpression createSuffixUnaryModificationExpression();

	/**
	 * Returns a new object of class '<em>Cast Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cast Expression</em>'.
	 * @generated
	 */
	CastExpression createCastExpression();

	/**
	 * Returns a new object of class '<em>Nested Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nested Expression</em>'.
	 * @generated
	 */
	NestedExpression createNestedExpression();

	/**
	 * Returns a new object of class '<em>Extends Type Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extends Type Argument</em>'.
	 * @generated
	 */
	ExtendsTypeArgument createExtendsTypeArgument();

	/**
	 * Returns a new object of class '<em>Qualified Type Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qualified Type Argument</em>'.
	 * @generated
	 */
	QualifiedTypeArgument createQualifiedTypeArgument();

	/**
	 * Returns a new object of class '<em>Super Type Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super Type Argument</em>'.
	 * @generated
	 */
	SuperTypeArgument createSuperTypeArgument();

	/**
	 * Returns a new object of class '<em>Type Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Parameter</em>'.
	 * @generated
	 */
	TypeParameter createTypeParameter();

	/**
	 * Returns a new object of class '<em>Unknown Type Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unknown Type Argument</em>'.
	 * @generated
	 */
	UnknownTypeArgument createUnknownTypeArgument();

	/**
	 * Returns a new object of class '<em>Classifier Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classifier Import</em>'.
	 * @generated
	 */
	ClassifierImport createClassifierImport();

	/**
	 * Returns a new object of class '<em>Package Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Import</em>'.
	 * @generated
	 */
	PackageImport createPackageImport();

	/**
	 * Returns a new object of class '<em>Static Classifier Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Classifier Import</em>'.
	 * @generated
	 */
	StaticClassifierImport createStaticClassifierImport();

	/**
	 * Returns a new object of class '<em>Static Member Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Member Import</em>'.
	 * @generated
	 */
	StaticMemberImport createStaticMemberImport();

	/**
	 * Returns a new object of class '<em>New Constructor Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Constructor Call</em>'.
	 * @generated
	 */
	NewConstructorCall createNewConstructorCall();

	/**
	 * Returns a new object of class '<em>Explicit Constructor Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explicit Constructor Call</em>'.
	 * @generated
	 */
	ExplicitConstructorCall createExplicitConstructorCall();

	/**
	 * Returns a new object of class '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Literal</em>'.
	 * @generated
	 */
	BooleanLiteral createBooleanLiteral();

	/**
	 * Returns a new object of class '<em>Character Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Character Literal</em>'.
	 * @generated
	 */
	CharacterLiteral createCharacterLiteral();

	/**
	 * Returns a new object of class '<em>Decimal Float Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decimal Float Literal</em>'.
	 * @generated
	 */
	DecimalFloatLiteral createDecimalFloatLiteral();

	/**
	 * Returns a new object of class '<em>Hex Float Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hex Float Literal</em>'.
	 * @generated
	 */
	HexFloatLiteral createHexFloatLiteral();

	/**
	 * Returns a new object of class '<em>Decimal Double Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decimal Double Literal</em>'.
	 * @generated
	 */
	DecimalDoubleLiteral createDecimalDoubleLiteral();

	/**
	 * Returns a new object of class '<em>Hex Double Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hex Double Literal</em>'.
	 * @generated
	 */
	HexDoubleLiteral createHexDoubleLiteral();

	/**
	 * Returns a new object of class '<em>Decimal Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decimal Integer Literal</em>'.
	 * @generated
	 */
	DecimalIntegerLiteral createDecimalIntegerLiteral();

	/**
	 * Returns a new object of class '<em>Hex Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hex Integer Literal</em>'.
	 * @generated
	 */
	HexIntegerLiteral createHexIntegerLiteral();

	/**
	 * Returns a new object of class '<em>Octal Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Octal Integer Literal</em>'.
	 * @generated
	 */
	OctalIntegerLiteral createOctalIntegerLiteral();

	/**
	 * Returns a new object of class '<em>Decimal Long Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decimal Long Literal</em>'.
	 * @generated
	 */
	DecimalLongLiteral createDecimalLongLiteral();

	/**
	 * Returns a new object of class '<em>Hex Long Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hex Long Literal</em>'.
	 * @generated
	 */
	HexLongLiteral createHexLongLiteral();

	/**
	 * Returns a new object of class '<em>Octal Long Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Octal Long Literal</em>'.
	 * @generated
	 */
	OctalLongLiteral createOctalLongLiteral();

	/**
	 * Returns a new object of class '<em>Null Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Null Literal</em>'.
	 * @generated
	 */
	NullLiteral createNullLiteral();

	/**
	 * Returns a new object of class '<em>Super</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super</em>'.
	 * @generated
	 */
	Super createSuper();

	/**
	 * Returns a new object of class '<em>This</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>This</em>'.
	 * @generated
	 */
	This createThis();

	/**
	 * Returns a new object of class '<em>Additional Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Additional Field</em>'.
	 * @generated
	 */
	AdditionalField createAdditionalField();

	/**
	 * Returns a new object of class '<em>Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constructor</em>'.
	 * @generated
	 */
	Constructor createConstructor();

	/**
	 * Returns a new object of class '<em>Empty Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empty Member</em>'.
	 * @generated
	 */
	EmptyMember createEmptyMember();

	/**
	 * Returns a new object of class '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field</em>'.
	 * @generated
	 */
	Field createField();

	/**
	 * Returns a new object of class '<em>Interface Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Method</em>'.
	 * @generated
	 */
	InterfaceMethod createInterfaceMethod();

	/**
	 * Returns a new object of class '<em>Class Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Method</em>'.
	 * @generated
	 */
	ClassMethod createClassMethod();

	/**
	 * Returns a new object of class '<em>Enum Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Constant</em>'.
	 * @generated
	 */
	EnumConstant createEnumConstant();

	/**
	 * Returns a new object of class '<em>Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract</em>'.
	 * @generated
	 */
	Abstract createAbstract();

	/**
	 * Returns a new object of class '<em>Final</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Final</em>'.
	 * @generated
	 */
	Final createFinal();

	/**
	 * Returns a new object of class '<em>Native</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Native</em>'.
	 * @generated
	 */
	Native createNative();

	/**
	 * Returns a new object of class '<em>Protected</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protected</em>'.
	 * @generated
	 */
	Protected createProtected();

	/**
	 * Returns a new object of class '<em>Public</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Public</em>'.
	 * @generated
	 */
	Public createPublic();

	/**
	 * Returns a new object of class '<em>Private</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Private</em>'.
	 * @generated
	 */
	Private createPrivate();

	/**
	 * Returns a new object of class '<em>Static</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static</em>'.
	 * @generated
	 */
	Static createStatic();

	/**
	 * Returns a new object of class '<em>Strictfp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strictfp</em>'.
	 * @generated
	 */
	Strictfp createStrictfp();

	/**
	 * Returns a new object of class '<em>Synchronized</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchronized</em>'.
	 * @generated
	 */
	Synchronized createSynchronized();

	/**
	 * Returns a new object of class '<em>Transient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transient</em>'.
	 * @generated
	 */
	Transient createTransient();

	/**
	 * Returns a new object of class '<em>Volatile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Volatile</em>'.
	 * @generated
	 */
	Volatile createVolatile();

	/**
	 * Returns a new object of class '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment</em>'.
	 * @generated
	 */
	Assignment createAssignment();

	/**
	 * Returns a new object of class '<em>Assignment And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment And</em>'.
	 * @generated
	 */
	AssignmentAnd createAssignmentAnd();

	/**
	 * Returns a new object of class '<em>Assignment Division</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment Division</em>'.
	 * @generated
	 */
	AssignmentDivision createAssignmentDivision();

	/**
	 * Returns a new object of class '<em>Assignment Exclusive Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment Exclusive Or</em>'.
	 * @generated
	 */
	AssignmentExclusiveOr createAssignmentExclusiveOr();

	/**
	 * Returns a new object of class '<em>Assignment Minus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment Minus</em>'.
	 * @generated
	 */
	AssignmentMinus createAssignmentMinus();

	/**
	 * Returns a new object of class '<em>Assignment Modulo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment Modulo</em>'.
	 * @generated
	 */
	AssignmentModulo createAssignmentModulo();

	/**
	 * Returns a new object of class '<em>Assignment Multiplication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment Multiplication</em>'.
	 * @generated
	 */
	AssignmentMultiplication createAssignmentMultiplication();

	/**
	 * Returns a new object of class '<em>Assignment Left Shift</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment Left Shift</em>'.
	 * @generated
	 */
	AssignmentLeftShift createAssignmentLeftShift();

	/**
	 * Returns a new object of class '<em>Assignment Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment Or</em>'.
	 * @generated
	 */
	AssignmentOr createAssignmentOr();

	/**
	 * Returns a new object of class '<em>Assignment Plus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment Plus</em>'.
	 * @generated
	 */
	AssignmentPlus createAssignmentPlus();

	/**
	 * Returns a new object of class '<em>Assignment Right Shift</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment Right Shift</em>'.
	 * @generated
	 */
	AssignmentRightShift createAssignmentRightShift();

	/**
	 * Returns a new object of class '<em>Assignment Unsigned Right Shift</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment Unsigned Right Shift</em>'.
	 * @generated
	 */
	AssignmentUnsignedRightShift createAssignmentUnsignedRightShift();

	/**
	 * Returns a new object of class '<em>Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equal</em>'.
	 * @generated
	 */
	Equal createEqual();

	/**
	 * Returns a new object of class '<em>Not Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Equal</em>'.
	 * @generated
	 */
	NotEqual createNotEqual();

	/**
	 * Returns a new object of class '<em>Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater Than</em>'.
	 * @generated
	 */
	GreaterThan createGreaterThan();

	/**
	 * Returns a new object of class '<em>Greater Than Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater Than Or Equal</em>'.
	 * @generated
	 */
	GreaterThanOrEqual createGreaterThanOrEqual();

	/**
	 * Returns a new object of class '<em>Less Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Less Than</em>'.
	 * @generated
	 */
	LessThan createLessThan();

	/**
	 * Returns a new object of class '<em>Less Than Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Less Than Or Equal</em>'.
	 * @generated
	 */
	LessThanOrEqual createLessThanOrEqual();

	/**
	 * Returns a new object of class '<em>Addition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Addition</em>'.
	 * @generated
	 */
	Addition createAddition();

	/**
	 * Returns a new object of class '<em>Subtraction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subtraction</em>'.
	 * @generated
	 */
	Subtraction createSubtraction();

	/**
	 * Returns a new object of class '<em>Division</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Division</em>'.
	 * @generated
	 */
	Division createDivision();

	/**
	 * Returns a new object of class '<em>Multiplication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplication</em>'.
	 * @generated
	 */
	Multiplication createMultiplication();

	/**
	 * Returns a new object of class '<em>Remainder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remainder</em>'.
	 * @generated
	 */
	Remainder createRemainder();

	/**
	 * Returns a new object of class '<em>Complement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complement</em>'.
	 * @generated
	 */
	Complement createComplement();

	/**
	 * Returns a new object of class '<em>Minus Minus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minus Minus</em>'.
	 * @generated
	 */
	MinusMinus createMinusMinus();

	/**
	 * Returns a new object of class '<em>Negate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negate</em>'.
	 * @generated
	 */
	Negate createNegate();

	/**
	 * Returns a new object of class '<em>Plus Plus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plus Plus</em>'.
	 * @generated
	 */
	PlusPlus createPlusPlus();

	/**
	 * Returns a new object of class '<em>Left Shift</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Left Shift</em>'.
	 * @generated
	 */
	LeftShift createLeftShift();

	/**
	 * Returns a new object of class '<em>Right Shift</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Right Shift</em>'.
	 * @generated
	 */
	RightShift createRightShift();

	/**
	 * Returns a new object of class '<em>Unsigned Right Shift</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unsigned Right Shift</em>'.
	 * @generated
	 */
	UnsignedRightShift createUnsignedRightShift();

	/**
	 * Returns a new object of class '<em>Identifier Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identifier Reference</em>'.
	 * @generated
	 */
	IdentifierReference createIdentifierReference();

	/**
	 * Returns a new object of class '<em>Method Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Call</em>'.
	 * @generated
	 */
	MethodCall createMethodCall();

	/**
	 * Returns a new object of class '<em>Reflective Class Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reflective Class Reference</em>'.
	 * @generated
	 */
	ReflectiveClassReference createReflectiveClassReference();

	/**
	 * Returns a new object of class '<em>Primitive Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type Reference</em>'.
	 * @generated
	 */
	PrimitiveTypeReference createPrimitiveTypeReference();

	/**
	 * Returns a new object of class '<em>String Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Reference</em>'.
	 * @generated
	 */
	StringReference createStringReference();

	/**
	 * Returns a new object of class '<em>Self Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Self Reference</em>'.
	 * @generated
	 */
	SelfReference createSelfReference();

	/**
	 * Returns a new object of class '<em>Ordinary Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ordinary Parameter</em>'.
	 * @generated
	 */
	OrdinaryParameter createOrdinaryParameter();

	/**
	 * Returns a new object of class '<em>Variable Length Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Length Parameter</em>'.
	 * @generated
	 */
	VariableLengthParameter createVariableLengthParameter();

	/**
	 * Returns a new object of class '<em>Assert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assert</em>'.
	 * @generated
	 */
	Assert createAssert();

	/**
	 * Returns a new object of class '<em>Break</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Break</em>'.
	 * @generated
	 */
	Break createBreak();

	/**
	 * Returns a new object of class '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block</em>'.
	 * @generated
	 */
	Block createBlock();

	/**
	 * Returns a new object of class '<em>Catch Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catch Block</em>'.
	 * @generated
	 */
	CatchBlock createCatchBlock();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Continue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Continue</em>'.
	 * @generated
	 */
	Continue createContinue();

	/**
	 * Returns a new object of class '<em>Default Switch Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Switch Case</em>'.
	 * @generated
	 */
	DefaultSwitchCase createDefaultSwitchCase();

	/**
	 * Returns a new object of class '<em>Do While Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Do While Loop</em>'.
	 * @generated
	 */
	DoWhileLoop createDoWhileLoop();

	/**
	 * Returns a new object of class '<em>Empty Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empty Statement</em>'.
	 * @generated
	 */
	EmptyStatement createEmptyStatement();

	/**
	 * Returns a new object of class '<em>Expression Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Statement</em>'.
	 * @generated
	 */
	ExpressionStatement createExpressionStatement();

	/**
	 * Returns a new object of class '<em>For Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For Loop</em>'.
	 * @generated
	 */
	ForLoop createForLoop();

	/**
	 * Returns a new object of class '<em>For Each Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For Each Loop</em>'.
	 * @generated
	 */
	ForEachLoop createForEachLoop();

	/**
	 * Returns a new object of class '<em>Jump Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jump Label</em>'.
	 * @generated
	 */
	JumpLabel createJumpLabel();

	/**
	 * Returns a new object of class '<em>Local Variable Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Variable Statement</em>'.
	 * @generated
	 */
	LocalVariableStatement createLocalVariableStatement();

	/**
	 * Returns a new object of class '<em>Normal Switch Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal Switch Case</em>'.
	 * @generated
	 */
	NormalSwitchCase createNormalSwitchCase();

	/**
	 * Returns a new object of class '<em>Return</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return</em>'.
	 * @generated
	 */
	Return createReturn();

	/**
	 * Returns a new object of class '<em>Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch</em>'.
	 * @generated
	 */
	Switch createSwitch();

	/**
	 * Returns a new object of class '<em>Synchronized Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchronized Block</em>'.
	 * @generated
	 */
	SynchronizedBlock createSynchronizedBlock();

	/**
	 * Returns a new object of class '<em>Throw</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Throw</em>'.
	 * @generated
	 */
	Throw createThrow();

	/**
	 * Returns a new object of class '<em>Try Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Try Block</em>'.
	 * @generated
	 */
	TryBlock createTryBlock();

	/**
	 * Returns a new object of class '<em>While Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>While Loop</em>'.
	 * @generated
	 */
	WhileLoop createWhileLoop();

	/**
	 * Returns a new object of class '<em>Classifier Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classifier Reference</em>'.
	 * @generated
	 */
	ClassifierReference createClassifierReference();

	/**
	 * Returns a new object of class '<em>Namespace Classifier Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Namespace Classifier Reference</em>'.
	 * @generated
	 */
	NamespaceClassifierReference createNamespaceClassifierReference();

	/**
	 * Returns a new object of class '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean</em>'.
	 * @generated
	 */
	Boolean createBoolean();

	/**
	 * Returns a new object of class '<em>Byte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Byte</em>'.
	 * @generated
	 */
	Byte createByte();

	/**
	 * Returns a new object of class '<em>Char</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Char</em>'.
	 * @generated
	 */
	Char createChar();

	/**
	 * Returns a new object of class '<em>Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double</em>'.
	 * @generated
	 */
	Double createDouble();

	/**
	 * Returns a new object of class '<em>Float</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Float</em>'.
	 * @generated
	 */
	Float createFloat();

	/**
	 * Returns a new object of class '<em>Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int</em>'.
	 * @generated
	 */
	Int createInt();

	/**
	 * Returns a new object of class '<em>Long</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long</em>'.
	 * @generated
	 */
	Long createLong();

	/**
	 * Returns a new object of class '<em>Short</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Short</em>'.
	 * @generated
	 */
	Short createShort();

	/**
	 * Returns a new object of class '<em>Void</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Void</em>'.
	 * @generated
	 */
	Void createVoid();

	/**
	 * Returns a new object of class '<em>Package Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Reference</em>'.
	 * @generated
	 */
	PackageReference createPackageReference();

	/**
	 * Returns a new object of class '<em>Local Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Variable</em>'.
	 * @generated
	 */
	LocalVariable createLocalVariable();

	/**
	 * Returns a new object of class '<em>Additional Local Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Additional Local Variable</em>'.
	 * @generated
	 */
	AdditionalLocalVariable createAdditionalLocalVariable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JavaPackage getJavaPackage();

} //JavaFactory
