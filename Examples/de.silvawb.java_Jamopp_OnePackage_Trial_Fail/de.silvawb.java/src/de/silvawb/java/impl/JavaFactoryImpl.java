/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.Abstract;
import de.silvawb.java.Addition;
import de.silvawb.java.AdditionalField;
import de.silvawb.java.AdditionalLocalVariable;
import de.silvawb.java.AdditiveExpression;
import de.silvawb.java.AndExpression;
import de.silvawb.java.Annotation;
import de.silvawb.java.AnnotationAttribute;
import de.silvawb.java.AnnotationAttributeSetting;
import de.silvawb.java.AnnotationInstance;
import de.silvawb.java.AnnotationParameterList;
import de.silvawb.java.AnonymousClass;
import de.silvawb.java.ArrayDimension;
import de.silvawb.java.ArrayInitializer;
import de.silvawb.java.ArrayInstantiationBySize;
import de.silvawb.java.ArrayInstantiationByValuesTyped;
import de.silvawb.java.ArrayInstantiationByValuesUntyped;
import de.silvawb.java.ArraySelector;
import de.silvawb.java.Assert;
import de.silvawb.java.Assignment;
import de.silvawb.java.AssignmentAnd;
import de.silvawb.java.AssignmentDivision;
import de.silvawb.java.AssignmentExclusiveOr;
import de.silvawb.java.AssignmentExpression;
import de.silvawb.java.AssignmentLeftShift;
import de.silvawb.java.AssignmentMinus;
import de.silvawb.java.AssignmentModulo;
import de.silvawb.java.AssignmentMultiplication;
import de.silvawb.java.AssignmentOr;
import de.silvawb.java.AssignmentPlus;
import de.silvawb.java.AssignmentRightShift;
import de.silvawb.java.AssignmentUnsignedRightShift;
import de.silvawb.java.Block;
import de.silvawb.java.BooleanLiteral;
import de.silvawb.java.Break;
import de.silvawb.java.CastExpression;
import de.silvawb.java.CatchBlock;
import de.silvawb.java.Char;
import de.silvawb.java.CharacterLiteral;
import de.silvawb.java.ClassMethod;
import de.silvawb.java.ClassifierImport;
import de.silvawb.java.ClassifierReference;
import de.silvawb.java.CompilationUnit;
import de.silvawb.java.Complement;
import de.silvawb.java.Condition;
import de.silvawb.java.ConditionalAndExpression;
import de.silvawb.java.ConditionalExpression;
import de.silvawb.java.ConditionalOrExpression;
import de.silvawb.java.Constructor;
import de.silvawb.java.Continue;
import de.silvawb.java.DecimalDoubleLiteral;
import de.silvawb.java.DecimalFloatLiteral;
import de.silvawb.java.DecimalIntegerLiteral;
import de.silvawb.java.DecimalLongLiteral;
import de.silvawb.java.DefaultSwitchCase;
import de.silvawb.java.Division;
import de.silvawb.java.DoWhileLoop;
import de.silvawb.java.EmptyMember;
import de.silvawb.java.EmptyModel;
import de.silvawb.java.EmptyStatement;
import de.silvawb.java.EnumConstant;
import de.silvawb.java.Enumeration;
import de.silvawb.java.Equal;
import de.silvawb.java.EqualityExpression;
import de.silvawb.java.ExclusiveOrExpression;
import de.silvawb.java.ExplicitConstructorCall;
import de.silvawb.java.ExpressionList;
import de.silvawb.java.ExpressionStatement;
import de.silvawb.java.ExtendsTypeArgument;
import de.silvawb.java.Field;
import de.silvawb.java.Final;
import de.silvawb.java.ForEachLoop;
import de.silvawb.java.ForLoop;
import de.silvawb.java.GreaterThan;
import de.silvawb.java.GreaterThanOrEqual;
import de.silvawb.java.HexDoubleLiteral;
import de.silvawb.java.HexFloatLiteral;
import de.silvawb.java.HexIntegerLiteral;
import de.silvawb.java.HexLongLiteral;
import de.silvawb.java.IdentifierReference;
import de.silvawb.java.InclusiveOrExpression;
import de.silvawb.java.InstanceOfExpression;
import de.silvawb.java.Int;
import de.silvawb.java.Interface;
import de.silvawb.java.InterfaceMethod;
import de.silvawb.java.JavaFactory;
import de.silvawb.java.JavaPackage;
import de.silvawb.java.JumpLabel;
import de.silvawb.java.LeftShift;
import de.silvawb.java.LessThan;
import de.silvawb.java.LessThanOrEqual;
import de.silvawb.java.LocalVariable;
import de.silvawb.java.LocalVariableStatement;
import de.silvawb.java.MethodCall;
import de.silvawb.java.MinusMinus;
import de.silvawb.java.Multiplication;
import de.silvawb.java.MultiplicativeExpression;
import de.silvawb.java.NamespaceClassifierReference;
import de.silvawb.java.Native;
import de.silvawb.java.Negate;
import de.silvawb.java.NestedExpression;
import de.silvawb.java.NewConstructorCall;
import de.silvawb.java.NormalSwitchCase;
import de.silvawb.java.NotEqual;
import de.silvawb.java.NullLiteral;
import de.silvawb.java.OctalIntegerLiteral;
import de.silvawb.java.OctalLongLiteral;
import de.silvawb.java.OrdinaryParameter;
import de.silvawb.java.PackageImport;
import de.silvawb.java.PackageReference;
import de.silvawb.java.PlusPlus;
import de.silvawb.java.PrefixUnaryModificationExpression;
import de.silvawb.java.PrimitiveTypeReference;
import de.silvawb.java.Private;
import de.silvawb.java.Protected;
import de.silvawb.java.Public;
import de.silvawb.java.QualifiedTypeArgument;
import de.silvawb.java.ReflectiveClassReference;
import de.silvawb.java.RelationExpression;
import de.silvawb.java.Remainder;
import de.silvawb.java.Return;
import de.silvawb.java.RightShift;
import de.silvawb.java.SelfReference;
import de.silvawb.java.ShiftExpression;
import de.silvawb.java.SingleAnnotationParameter;
import de.silvawb.java.Static;
import de.silvawb.java.StaticClassifierImport;
import de.silvawb.java.StaticMemberImport;
import de.silvawb.java.Strictfp;
import de.silvawb.java.StringReference;
import de.silvawb.java.Subtraction;
import de.silvawb.java.SuffixUnaryModificationExpression;
import de.silvawb.java.Super;
import de.silvawb.java.SuperTypeArgument;
import de.silvawb.java.Switch;
import de.silvawb.java.Synchronized;
import de.silvawb.java.SynchronizedBlock;
import de.silvawb.java.This;
import de.silvawb.java.Throw;
import de.silvawb.java.Transient;
import de.silvawb.java.TryBlock;
import de.silvawb.java.TypeParameter;
import de.silvawb.java.UnaryExpression;
import de.silvawb.java.UnknownTypeArgument;
import de.silvawb.java.UnsignedRightShift;
import de.silvawb.java.VariableLengthParameter;
import de.silvawb.java.Volatile;
import de.silvawb.java.WhileLoop;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaFactoryImpl extends EFactoryImpl implements JavaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JavaFactory init() {
		try {
			JavaFactory theJavaFactory = (JavaFactory)EPackage.Registry.INSTANCE.getEFactory(JavaPackage.eNS_URI);
			if (theJavaFactory != null) {
				return theJavaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JavaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JavaPackage.ANNOTATION_INSTANCE: return createAnnotationInstance();
			case JavaPackage.SINGLE_ANNOTATION_PARAMETER: return createSingleAnnotationParameter();
			case JavaPackage.ANNOTATION_PARAMETER_LIST: return createAnnotationParameterList();
			case JavaPackage.ANNOTATION_ATTRIBUTE_SETTING: return createAnnotationAttributeSetting();
			case JavaPackage.ANNOTATION_ATTRIBUTE: return createAnnotationAttribute();
			case JavaPackage.ARRAY_DIMENSION: return createArrayDimension();
			case JavaPackage.ARRAY_INITIALIZER: return createArrayInitializer();
			case JavaPackage.ARRAY_INSTANTIATION_BY_SIZE: return createArrayInstantiationBySize();
			case JavaPackage.ARRAY_INSTANTIATION_BY_VALUES_UNTYPED: return createArrayInstantiationByValuesUntyped();
			case JavaPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED: return createArrayInstantiationByValuesTyped();
			case JavaPackage.ARRAY_SELECTOR: return createArraySelector();
			case JavaPackage.CLASS: return createClass();
			case JavaPackage.INTERFACE: return createInterface();
			case JavaPackage.ENUMERATION: return createEnumeration();
			case JavaPackage.ANNOTATION: return createAnnotation();
			case JavaPackage.ANONYMOUS_CLASS: return createAnonymousClass();
			case JavaPackage.COMPILATION_UNIT: return createCompilationUnit();
			case JavaPackage.PACKAGE: return createPackage();
			case JavaPackage.EMPTY_MODEL: return createEmptyModel();
			case JavaPackage.EXPRESSION_LIST: return createExpressionList();
			case JavaPackage.ASSIGNMENT_EXPRESSION: return createAssignmentExpression();
			case JavaPackage.CONDITIONAL_EXPRESSION: return createConditionalExpression();
			case JavaPackage.CONDITIONAL_OR_EXPRESSION: return createConditionalOrExpression();
			case JavaPackage.CONDITIONAL_AND_EXPRESSION: return createConditionalAndExpression();
			case JavaPackage.INCLUSIVE_OR_EXPRESSION: return createInclusiveOrExpression();
			case JavaPackage.EXCLUSIVE_OR_EXPRESSION: return createExclusiveOrExpression();
			case JavaPackage.AND_EXPRESSION: return createAndExpression();
			case JavaPackage.EQUALITY_EXPRESSION: return createEqualityExpression();
			case JavaPackage.INSTANCE_OF_EXPRESSION: return createInstanceOfExpression();
			case JavaPackage.RELATION_EXPRESSION: return createRelationExpression();
			case JavaPackage.SHIFT_EXPRESSION: return createShiftExpression();
			case JavaPackage.ADDITIVE_EXPRESSION: return createAdditiveExpression();
			case JavaPackage.MULTIPLICATIVE_EXPRESSION: return createMultiplicativeExpression();
			case JavaPackage.UNARY_EXPRESSION: return createUnaryExpression();
			case JavaPackage.PREFIX_UNARY_MODIFICATION_EXPRESSION: return createPrefixUnaryModificationExpression();
			case JavaPackage.SUFFIX_UNARY_MODIFICATION_EXPRESSION: return createSuffixUnaryModificationExpression();
			case JavaPackage.CAST_EXPRESSION: return createCastExpression();
			case JavaPackage.NESTED_EXPRESSION: return createNestedExpression();
			case JavaPackage.EXTENDS_TYPE_ARGUMENT: return createExtendsTypeArgument();
			case JavaPackage.QUALIFIED_TYPE_ARGUMENT: return createQualifiedTypeArgument();
			case JavaPackage.SUPER_TYPE_ARGUMENT: return createSuperTypeArgument();
			case JavaPackage.TYPE_PARAMETER: return createTypeParameter();
			case JavaPackage.UNKNOWN_TYPE_ARGUMENT: return createUnknownTypeArgument();
			case JavaPackage.CLASSIFIER_IMPORT: return createClassifierImport();
			case JavaPackage.PACKAGE_IMPORT: return createPackageImport();
			case JavaPackage.STATIC_CLASSIFIER_IMPORT: return createStaticClassifierImport();
			case JavaPackage.STATIC_MEMBER_IMPORT: return createStaticMemberImport();
			case JavaPackage.NEW_CONSTRUCTOR_CALL: return createNewConstructorCall();
			case JavaPackage.EXPLICIT_CONSTRUCTOR_CALL: return createExplicitConstructorCall();
			case JavaPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
			case JavaPackage.CHARACTER_LITERAL: return createCharacterLiteral();
			case JavaPackage.DECIMAL_FLOAT_LITERAL: return createDecimalFloatLiteral();
			case JavaPackage.HEX_FLOAT_LITERAL: return createHexFloatLiteral();
			case JavaPackage.DECIMAL_DOUBLE_LITERAL: return createDecimalDoubleLiteral();
			case JavaPackage.HEX_DOUBLE_LITERAL: return createHexDoubleLiteral();
			case JavaPackage.DECIMAL_INTEGER_LITERAL: return createDecimalIntegerLiteral();
			case JavaPackage.HEX_INTEGER_LITERAL: return createHexIntegerLiteral();
			case JavaPackage.OCTAL_INTEGER_LITERAL: return createOctalIntegerLiteral();
			case JavaPackage.DECIMAL_LONG_LITERAL: return createDecimalLongLiteral();
			case JavaPackage.HEX_LONG_LITERAL: return createHexLongLiteral();
			case JavaPackage.OCTAL_LONG_LITERAL: return createOctalLongLiteral();
			case JavaPackage.NULL_LITERAL: return createNullLiteral();
			case JavaPackage.SUPER: return createSuper();
			case JavaPackage.THIS: return createThis();
			case JavaPackage.ADDITIONAL_FIELD: return createAdditionalField();
			case JavaPackage.CONSTRUCTOR: return createConstructor();
			case JavaPackage.EMPTY_MEMBER: return createEmptyMember();
			case JavaPackage.FIELD: return createField();
			case JavaPackage.INTERFACE_METHOD: return createInterfaceMethod();
			case JavaPackage.CLASS_METHOD: return createClassMethod();
			case JavaPackage.ENUM_CONSTANT: return createEnumConstant();
			case JavaPackage.ABSTRACT: return createAbstract();
			case JavaPackage.FINAL: return createFinal();
			case JavaPackage.NATIVE: return createNative();
			case JavaPackage.PROTECTED: return createProtected();
			case JavaPackage.PUBLIC: return createPublic();
			case JavaPackage.PRIVATE: return createPrivate();
			case JavaPackage.STATIC: return createStatic();
			case JavaPackage.STRICTFP: return createStrictfp();
			case JavaPackage.SYNCHRONIZED: return createSynchronized();
			case JavaPackage.TRANSIENT: return createTransient();
			case JavaPackage.VOLATILE: return createVolatile();
			case JavaPackage.ASSIGNMENT: return createAssignment();
			case JavaPackage.ASSIGNMENT_AND: return createAssignmentAnd();
			case JavaPackage.ASSIGNMENT_DIVISION: return createAssignmentDivision();
			case JavaPackage.ASSIGNMENT_EXCLUSIVE_OR: return createAssignmentExclusiveOr();
			case JavaPackage.ASSIGNMENT_MINUS: return createAssignmentMinus();
			case JavaPackage.ASSIGNMENT_MODULO: return createAssignmentModulo();
			case JavaPackage.ASSIGNMENT_MULTIPLICATION: return createAssignmentMultiplication();
			case JavaPackage.ASSIGNMENT_LEFT_SHIFT: return createAssignmentLeftShift();
			case JavaPackage.ASSIGNMENT_OR: return createAssignmentOr();
			case JavaPackage.ASSIGNMENT_PLUS: return createAssignmentPlus();
			case JavaPackage.ASSIGNMENT_RIGHT_SHIFT: return createAssignmentRightShift();
			case JavaPackage.ASSIGNMENT_UNSIGNED_RIGHT_SHIFT: return createAssignmentUnsignedRightShift();
			case JavaPackage.EQUAL: return createEqual();
			case JavaPackage.NOT_EQUAL: return createNotEqual();
			case JavaPackage.GREATER_THAN: return createGreaterThan();
			case JavaPackage.GREATER_THAN_OR_EQUAL: return createGreaterThanOrEqual();
			case JavaPackage.LESS_THAN: return createLessThan();
			case JavaPackage.LESS_THAN_OR_EQUAL: return createLessThanOrEqual();
			case JavaPackage.ADDITION: return createAddition();
			case JavaPackage.SUBTRACTION: return createSubtraction();
			case JavaPackage.DIVISION: return createDivision();
			case JavaPackage.MULTIPLICATION: return createMultiplication();
			case JavaPackage.REMAINDER: return createRemainder();
			case JavaPackage.COMPLEMENT: return createComplement();
			case JavaPackage.MINUS_MINUS: return createMinusMinus();
			case JavaPackage.NEGATE: return createNegate();
			case JavaPackage.PLUS_PLUS: return createPlusPlus();
			case JavaPackage.LEFT_SHIFT: return createLeftShift();
			case JavaPackage.RIGHT_SHIFT: return createRightShift();
			case JavaPackage.UNSIGNED_RIGHT_SHIFT: return createUnsignedRightShift();
			case JavaPackage.IDENTIFIER_REFERENCE: return createIdentifierReference();
			case JavaPackage.METHOD_CALL: return createMethodCall();
			case JavaPackage.REFLECTIVE_CLASS_REFERENCE: return createReflectiveClassReference();
			case JavaPackage.PRIMITIVE_TYPE_REFERENCE: return createPrimitiveTypeReference();
			case JavaPackage.STRING_REFERENCE: return createStringReference();
			case JavaPackage.SELF_REFERENCE: return createSelfReference();
			case JavaPackage.ORDINARY_PARAMETER: return createOrdinaryParameter();
			case JavaPackage.VARIABLE_LENGTH_PARAMETER: return createVariableLengthParameter();
			case JavaPackage.ASSERT: return createAssert();
			case JavaPackage.BREAK: return createBreak();
			case JavaPackage.BLOCK: return createBlock();
			case JavaPackage.CATCH_BLOCK: return createCatchBlock();
			case JavaPackage.CONDITION: return createCondition();
			case JavaPackage.CONTINUE: return createContinue();
			case JavaPackage.DEFAULT_SWITCH_CASE: return createDefaultSwitchCase();
			case JavaPackage.DO_WHILE_LOOP: return createDoWhileLoop();
			case JavaPackage.EMPTY_STATEMENT: return createEmptyStatement();
			case JavaPackage.EXPRESSION_STATEMENT: return createExpressionStatement();
			case JavaPackage.FOR_LOOP: return createForLoop();
			case JavaPackage.FOR_EACH_LOOP: return createForEachLoop();
			case JavaPackage.JUMP_LABEL: return createJumpLabel();
			case JavaPackage.LOCAL_VARIABLE_STATEMENT: return createLocalVariableStatement();
			case JavaPackage.NORMAL_SWITCH_CASE: return createNormalSwitchCase();
			case JavaPackage.RETURN: return createReturn();
			case JavaPackage.SWITCH: return createSwitch();
			case JavaPackage.SYNCHRONIZED_BLOCK: return createSynchronizedBlock();
			case JavaPackage.THROW: return createThrow();
			case JavaPackage.TRY_BLOCK: return createTryBlock();
			case JavaPackage.WHILE_LOOP: return createWhileLoop();
			case JavaPackage.CLASSIFIER_REFERENCE: return createClassifierReference();
			case JavaPackage.NAMESPACE_CLASSIFIER_REFERENCE: return createNamespaceClassifierReference();
			case JavaPackage.BOOLEAN: return createBoolean();
			case JavaPackage.BYTE: return createByte();
			case JavaPackage.CHAR: return createChar();
			case JavaPackage.DOUBLE: return createDouble();
			case JavaPackage.FLOAT: return createFloat();
			case JavaPackage.INT: return createInt();
			case JavaPackage.LONG: return createLong();
			case JavaPackage.SHORT: return createShort();
			case JavaPackage.VOID: return createVoid();
			case JavaPackage.PACKAGE_REFERENCE: return createPackageReference();
			case JavaPackage.LOCAL_VARIABLE: return createLocalVariable();
			case JavaPackage.ADDITIONAL_LOCAL_VARIABLE: return createAdditionalLocalVariable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationInstance createAnnotationInstance() {
		AnnotationInstanceImpl annotationInstance = new AnnotationInstanceImpl();
		return annotationInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleAnnotationParameter createSingleAnnotationParameter() {
		SingleAnnotationParameterImpl singleAnnotationParameter = new SingleAnnotationParameterImpl();
		return singleAnnotationParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationParameterList createAnnotationParameterList() {
		AnnotationParameterListImpl annotationParameterList = new AnnotationParameterListImpl();
		return annotationParameterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationAttributeSetting createAnnotationAttributeSetting() {
		AnnotationAttributeSettingImpl annotationAttributeSetting = new AnnotationAttributeSettingImpl();
		return annotationAttributeSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationAttribute createAnnotationAttribute() {
		AnnotationAttributeImpl annotationAttribute = new AnnotationAttributeImpl();
		return annotationAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayDimension createArrayDimension() {
		ArrayDimensionImpl arrayDimension = new ArrayDimensionImpl();
		return arrayDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayInitializer createArrayInitializer() {
		ArrayInitializerImpl arrayInitializer = new ArrayInitializerImpl();
		return arrayInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayInstantiationBySize createArrayInstantiationBySize() {
		ArrayInstantiationBySizeImpl arrayInstantiationBySize = new ArrayInstantiationBySizeImpl();
		return arrayInstantiationBySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayInstantiationByValuesUntyped createArrayInstantiationByValuesUntyped() {
		ArrayInstantiationByValuesUntypedImpl arrayInstantiationByValuesUntyped = new ArrayInstantiationByValuesUntypedImpl();
		return arrayInstantiationByValuesUntyped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayInstantiationByValuesTyped createArrayInstantiationByValuesTyped() {
		ArrayInstantiationByValuesTypedImpl arrayInstantiationByValuesTyped = new ArrayInstantiationByValuesTypedImpl();
		return arrayInstantiationByValuesTyped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArraySelector createArraySelector() {
		ArraySelectorImpl arraySelector = new ArraySelectorImpl();
		return arraySelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.silvawb.java.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousClass createAnonymousClass() {
		AnonymousClassImpl anonymousClass = new AnonymousClassImpl();
		return anonymousClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationUnit createCompilationUnit() {
		CompilationUnitImpl compilationUnit = new CompilationUnitImpl();
		return compilationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.silvawb.java.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyModel createEmptyModel() {
		EmptyModelImpl emptyModel = new EmptyModelImpl();
		return emptyModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionList createExpressionList() {
		ExpressionListImpl expressionList = new ExpressionListImpl();
		return expressionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentExpression createAssignmentExpression() {
		AssignmentExpressionImpl assignmentExpression = new AssignmentExpressionImpl();
		return assignmentExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalExpression createConditionalExpression() {
		ConditionalExpressionImpl conditionalExpression = new ConditionalExpressionImpl();
		return conditionalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalOrExpression createConditionalOrExpression() {
		ConditionalOrExpressionImpl conditionalOrExpression = new ConditionalOrExpressionImpl();
		return conditionalOrExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalAndExpression createConditionalAndExpression() {
		ConditionalAndExpressionImpl conditionalAndExpression = new ConditionalAndExpressionImpl();
		return conditionalAndExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InclusiveOrExpression createInclusiveOrExpression() {
		InclusiveOrExpressionImpl inclusiveOrExpression = new InclusiveOrExpressionImpl();
		return inclusiveOrExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveOrExpression createExclusiveOrExpression() {
		ExclusiveOrExpressionImpl exclusiveOrExpression = new ExclusiveOrExpressionImpl();
		return exclusiveOrExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndExpression createAndExpression() {
		AndExpressionImpl andExpression = new AndExpressionImpl();
		return andExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualityExpression createEqualityExpression() {
		EqualityExpressionImpl equalityExpression = new EqualityExpressionImpl();
		return equalityExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceOfExpression createInstanceOfExpression() {
		InstanceOfExpressionImpl instanceOfExpression = new InstanceOfExpressionImpl();
		return instanceOfExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationExpression createRelationExpression() {
		RelationExpressionImpl relationExpression = new RelationExpressionImpl();
		return relationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShiftExpression createShiftExpression() {
		ShiftExpressionImpl shiftExpression = new ShiftExpressionImpl();
		return shiftExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditiveExpression createAdditiveExpression() {
		AdditiveExpressionImpl additiveExpression = new AdditiveExpressionImpl();
		return additiveExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicativeExpression createMultiplicativeExpression() {
		MultiplicativeExpressionImpl multiplicativeExpression = new MultiplicativeExpressionImpl();
		return multiplicativeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryExpression createUnaryExpression() {
		UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
		return unaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrefixUnaryModificationExpression createPrefixUnaryModificationExpression() {
		PrefixUnaryModificationExpressionImpl prefixUnaryModificationExpression = new PrefixUnaryModificationExpressionImpl();
		return prefixUnaryModificationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuffixUnaryModificationExpression createSuffixUnaryModificationExpression() {
		SuffixUnaryModificationExpressionImpl suffixUnaryModificationExpression = new SuffixUnaryModificationExpressionImpl();
		return suffixUnaryModificationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CastExpression createCastExpression() {
		CastExpressionImpl castExpression = new CastExpressionImpl();
		return castExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedExpression createNestedExpression() {
		NestedExpressionImpl nestedExpression = new NestedExpressionImpl();
		return nestedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendsTypeArgument createExtendsTypeArgument() {
		ExtendsTypeArgumentImpl extendsTypeArgument = new ExtendsTypeArgumentImpl();
		return extendsTypeArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedTypeArgument createQualifiedTypeArgument() {
		QualifiedTypeArgumentImpl qualifiedTypeArgument = new QualifiedTypeArgumentImpl();
		return qualifiedTypeArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperTypeArgument createSuperTypeArgument() {
		SuperTypeArgumentImpl superTypeArgument = new SuperTypeArgumentImpl();
		return superTypeArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeParameter createTypeParameter() {
		TypeParameterImpl typeParameter = new TypeParameterImpl();
		return typeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownTypeArgument createUnknownTypeArgument() {
		UnknownTypeArgumentImpl unknownTypeArgument = new UnknownTypeArgumentImpl();
		return unknownTypeArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierImport createClassifierImport() {
		ClassifierImportImpl classifierImport = new ClassifierImportImpl();
		return classifierImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageImport createPackageImport() {
		PackageImportImpl packageImport = new PackageImportImpl();
		return packageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticClassifierImport createStaticClassifierImport() {
		StaticClassifierImportImpl staticClassifierImport = new StaticClassifierImportImpl();
		return staticClassifierImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticMemberImport createStaticMemberImport() {
		StaticMemberImportImpl staticMemberImport = new StaticMemberImportImpl();
		return staticMemberImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewConstructorCall createNewConstructorCall() {
		NewConstructorCallImpl newConstructorCall = new NewConstructorCallImpl();
		return newConstructorCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplicitConstructorCall createExplicitConstructorCall() {
		ExplicitConstructorCallImpl explicitConstructorCall = new ExplicitConstructorCallImpl();
		return explicitConstructorCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanLiteral createBooleanLiteral() {
		BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
		return booleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterLiteral createCharacterLiteral() {
		CharacterLiteralImpl characterLiteral = new CharacterLiteralImpl();
		return characterLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalFloatLiteral createDecimalFloatLiteral() {
		DecimalFloatLiteralImpl decimalFloatLiteral = new DecimalFloatLiteralImpl();
		return decimalFloatLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HexFloatLiteral createHexFloatLiteral() {
		HexFloatLiteralImpl hexFloatLiteral = new HexFloatLiteralImpl();
		return hexFloatLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalDoubleLiteral createDecimalDoubleLiteral() {
		DecimalDoubleLiteralImpl decimalDoubleLiteral = new DecimalDoubleLiteralImpl();
		return decimalDoubleLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HexDoubleLiteral createHexDoubleLiteral() {
		HexDoubleLiteralImpl hexDoubleLiteral = new HexDoubleLiteralImpl();
		return hexDoubleLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalIntegerLiteral createDecimalIntegerLiteral() {
		DecimalIntegerLiteralImpl decimalIntegerLiteral = new DecimalIntegerLiteralImpl();
		return decimalIntegerLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HexIntegerLiteral createHexIntegerLiteral() {
		HexIntegerLiteralImpl hexIntegerLiteral = new HexIntegerLiteralImpl();
		return hexIntegerLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OctalIntegerLiteral createOctalIntegerLiteral() {
		OctalIntegerLiteralImpl octalIntegerLiteral = new OctalIntegerLiteralImpl();
		return octalIntegerLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalLongLiteral createDecimalLongLiteral() {
		DecimalLongLiteralImpl decimalLongLiteral = new DecimalLongLiteralImpl();
		return decimalLongLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HexLongLiteral createHexLongLiteral() {
		HexLongLiteralImpl hexLongLiteral = new HexLongLiteralImpl();
		return hexLongLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OctalLongLiteral createOctalLongLiteral() {
		OctalLongLiteralImpl octalLongLiteral = new OctalLongLiteralImpl();
		return octalLongLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullLiteral createNullLiteral() {
		NullLiteralImpl nullLiteral = new NullLiteralImpl();
		return nullLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Super createSuper() {
		SuperImpl super_ = new SuperImpl();
		return super_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public This createThis() {
		ThisImpl this_ = new ThisImpl();
		return this_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalField createAdditionalField() {
		AdditionalFieldImpl additionalField = new AdditionalFieldImpl();
		return additionalField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constructor createConstructor() {
		ConstructorImpl constructor = new ConstructorImpl();
		return constructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyMember createEmptyMember() {
		EmptyMemberImpl emptyMember = new EmptyMemberImpl();
		return emptyMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceMethod createInterfaceMethod() {
		InterfaceMethodImpl interfaceMethod = new InterfaceMethodImpl();
		return interfaceMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassMethod createClassMethod() {
		ClassMethodImpl classMethod = new ClassMethodImpl();
		return classMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumConstant createEnumConstant() {
		EnumConstantImpl enumConstant = new EnumConstantImpl();
		return enumConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Abstract createAbstract() {
		AbstractImpl abstract_ = new AbstractImpl();
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Final createFinal() {
		FinalImpl final_ = new FinalImpl();
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Native createNative() {
		NativeImpl native_ = new NativeImpl();
		return native_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protected createProtected() {
		ProtectedImpl protected_ = new ProtectedImpl();
		return protected_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Public createPublic() {
		PublicImpl public_ = new PublicImpl();
		return public_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Private createPrivate() {
		PrivateImpl private_ = new PrivateImpl();
		return private_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Static createStatic() {
		StaticImpl static_ = new StaticImpl();
		return static_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strictfp createStrictfp() {
		StrictfpImpl strictfp_ = new StrictfpImpl();
		return strictfp_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Synchronized createSynchronized() {
		SynchronizedImpl synchronized_ = new SynchronizedImpl();
		return synchronized_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transient createTransient() {
		TransientImpl transient_ = new TransientImpl();
		return transient_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Volatile createVolatile() {
		VolatileImpl volatile_ = new VolatileImpl();
		return volatile_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentAnd createAssignmentAnd() {
		AssignmentAndImpl assignmentAnd = new AssignmentAndImpl();
		return assignmentAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentDivision createAssignmentDivision() {
		AssignmentDivisionImpl assignmentDivision = new AssignmentDivisionImpl();
		return assignmentDivision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentExclusiveOr createAssignmentExclusiveOr() {
		AssignmentExclusiveOrImpl assignmentExclusiveOr = new AssignmentExclusiveOrImpl();
		return assignmentExclusiveOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentMinus createAssignmentMinus() {
		AssignmentMinusImpl assignmentMinus = new AssignmentMinusImpl();
		return assignmentMinus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentModulo createAssignmentModulo() {
		AssignmentModuloImpl assignmentModulo = new AssignmentModuloImpl();
		return assignmentModulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentMultiplication createAssignmentMultiplication() {
		AssignmentMultiplicationImpl assignmentMultiplication = new AssignmentMultiplicationImpl();
		return assignmentMultiplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentLeftShift createAssignmentLeftShift() {
		AssignmentLeftShiftImpl assignmentLeftShift = new AssignmentLeftShiftImpl();
		return assignmentLeftShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentOr createAssignmentOr() {
		AssignmentOrImpl assignmentOr = new AssignmentOrImpl();
		return assignmentOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentPlus createAssignmentPlus() {
		AssignmentPlusImpl assignmentPlus = new AssignmentPlusImpl();
		return assignmentPlus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentRightShift createAssignmentRightShift() {
		AssignmentRightShiftImpl assignmentRightShift = new AssignmentRightShiftImpl();
		return assignmentRightShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentUnsignedRightShift createAssignmentUnsignedRightShift() {
		AssignmentUnsignedRightShiftImpl assignmentUnsignedRightShift = new AssignmentUnsignedRightShiftImpl();
		return assignmentUnsignedRightShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equal createEqual() {
		EqualImpl equal = new EqualImpl();
		return equal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotEqual createNotEqual() {
		NotEqualImpl notEqual = new NotEqualImpl();
		return notEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterThan createGreaterThan() {
		GreaterThanImpl greaterThan = new GreaterThanImpl();
		return greaterThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterThanOrEqual createGreaterThanOrEqual() {
		GreaterThanOrEqualImpl greaterThanOrEqual = new GreaterThanOrEqualImpl();
		return greaterThanOrEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessThan createLessThan() {
		LessThanImpl lessThan = new LessThanImpl();
		return lessThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessThanOrEqual createLessThanOrEqual() {
		LessThanOrEqualImpl lessThanOrEqual = new LessThanOrEqualImpl();
		return lessThanOrEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Addition createAddition() {
		AdditionImpl addition = new AdditionImpl();
		return addition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subtraction createSubtraction() {
		SubtractionImpl subtraction = new SubtractionImpl();
		return subtraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Division createDivision() {
		DivisionImpl division = new DivisionImpl();
		return division;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplication createMultiplication() {
		MultiplicationImpl multiplication = new MultiplicationImpl();
		return multiplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Remainder createRemainder() {
		RemainderImpl remainder = new RemainderImpl();
		return remainder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Complement createComplement() {
		ComplementImpl complement = new ComplementImpl();
		return complement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinusMinus createMinusMinus() {
		MinusMinusImpl minusMinus = new MinusMinusImpl();
		return minusMinus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Negate createNegate() {
		NegateImpl negate = new NegateImpl();
		return negate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlusPlus createPlusPlus() {
		PlusPlusImpl plusPlus = new PlusPlusImpl();
		return plusPlus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftShift createLeftShift() {
		LeftShiftImpl leftShift = new LeftShiftImpl();
		return leftShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightShift createRightShift() {
		RightShiftImpl rightShift = new RightShiftImpl();
		return rightShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedRightShift createUnsignedRightShift() {
		UnsignedRightShiftImpl unsignedRightShift = new UnsignedRightShiftImpl();
		return unsignedRightShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierReference createIdentifierReference() {
		IdentifierReferenceImpl identifierReference = new IdentifierReferenceImpl();
		return identifierReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodCall createMethodCall() {
		MethodCallImpl methodCall = new MethodCallImpl();
		return methodCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReflectiveClassReference createReflectiveClassReference() {
		ReflectiveClassReferenceImpl reflectiveClassReference = new ReflectiveClassReferenceImpl();
		return reflectiveClassReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeReference createPrimitiveTypeReference() {
		PrimitiveTypeReferenceImpl primitiveTypeReference = new PrimitiveTypeReferenceImpl();
		return primitiveTypeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringReference createStringReference() {
		StringReferenceImpl stringReference = new StringReferenceImpl();
		return stringReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfReference createSelfReference() {
		SelfReferenceImpl selfReference = new SelfReferenceImpl();
		return selfReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrdinaryParameter createOrdinaryParameter() {
		OrdinaryParameterImpl ordinaryParameter = new OrdinaryParameterImpl();
		return ordinaryParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableLengthParameter createVariableLengthParameter() {
		VariableLengthParameterImpl variableLengthParameter = new VariableLengthParameterImpl();
		return variableLengthParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assert createAssert() {
		AssertImpl assert_ = new AssertImpl();
		return assert_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Break createBreak() {
		BreakImpl break_ = new BreakImpl();
		return break_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatchBlock createCatchBlock() {
		CatchBlockImpl catchBlock = new CatchBlockImpl();
		return catchBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Continue createContinue() {
		ContinueImpl continue_ = new ContinueImpl();
		return continue_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultSwitchCase createDefaultSwitchCase() {
		DefaultSwitchCaseImpl defaultSwitchCase = new DefaultSwitchCaseImpl();
		return defaultSwitchCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoWhileLoop createDoWhileLoop() {
		DoWhileLoopImpl doWhileLoop = new DoWhileLoopImpl();
		return doWhileLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyStatement createEmptyStatement() {
		EmptyStatementImpl emptyStatement = new EmptyStatementImpl();
		return emptyStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionStatement createExpressionStatement() {
		ExpressionStatementImpl expressionStatement = new ExpressionStatementImpl();
		return expressionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForLoop createForLoop() {
		ForLoopImpl forLoop = new ForLoopImpl();
		return forLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForEachLoop createForEachLoop() {
		ForEachLoopImpl forEachLoop = new ForEachLoopImpl();
		return forEachLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JumpLabel createJumpLabel() {
		JumpLabelImpl jumpLabel = new JumpLabelImpl();
		return jumpLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariableStatement createLocalVariableStatement() {
		LocalVariableStatementImpl localVariableStatement = new LocalVariableStatementImpl();
		return localVariableStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalSwitchCase createNormalSwitchCase() {
		NormalSwitchCaseImpl normalSwitchCase = new NormalSwitchCaseImpl();
		return normalSwitchCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Return createReturn() {
		ReturnImpl return_ = new ReturnImpl();
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch createSwitch() {
		SwitchImpl switch_ = new SwitchImpl();
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizedBlock createSynchronizedBlock() {
		SynchronizedBlockImpl synchronizedBlock = new SynchronizedBlockImpl();
		return synchronizedBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Throw createThrow() {
		ThrowImpl throw_ = new ThrowImpl();
		return throw_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TryBlock createTryBlock() {
		TryBlockImpl tryBlock = new TryBlockImpl();
		return tryBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileLoop createWhileLoop() {
		WhileLoopImpl whileLoop = new WhileLoopImpl();
		return whileLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierReference createClassifierReference() {
		ClassifierReferenceImpl classifierReference = new ClassifierReferenceImpl();
		return classifierReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceClassifierReference createNamespaceClassifierReference() {
		NamespaceClassifierReferenceImpl namespaceClassifierReference = new NamespaceClassifierReferenceImpl();
		return namespaceClassifierReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.silvawb.java.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.silvawb.java.Byte createByte() {
		ByteImpl byte_ = new ByteImpl();
		return byte_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Char createChar() {
		CharImpl char_ = new CharImpl();
		return char_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.silvawb.java.Double createDouble() {
		DoubleImpl double_ = new DoubleImpl();
		return double_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.silvawb.java.Float createFloat() {
		FloatImpl float_ = new FloatImpl();
		return float_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Int createInt() {
		IntImpl int_ = new IntImpl();
		return int_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.silvawb.java.Long createLong() {
		LongImpl long_ = new LongImpl();
		return long_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.silvawb.java.Short createShort() {
		ShortImpl short_ = new ShortImpl();
		return short_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.silvawb.java.Void createVoid() {
		VoidImpl void_ = new VoidImpl();
		return void_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageReference createPackageReference() {
		PackageReferenceImpl packageReference = new PackageReferenceImpl();
		return packageReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable createLocalVariable() {
		LocalVariableImpl localVariable = new LocalVariableImpl();
		return localVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalLocalVariable createAdditionalLocalVariable() {
		AdditionalLocalVariableImpl additionalLocalVariable = new AdditionalLocalVariableImpl();
		return additionalLocalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaPackage getJavaPackage() {
		return (JavaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JavaPackage getPackage() {
		return JavaPackage.eINSTANCE;
	}

} //JavaFactoryImpl
