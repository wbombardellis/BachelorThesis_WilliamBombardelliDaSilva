/**
 */
package de.silvawb.java.util;

import de.silvawb.java.Abstract;
import de.silvawb.java.Addition;
import de.silvawb.java.AdditionalField;
import de.silvawb.java.AdditionalLocalVariable;
import de.silvawb.java.AdditiveExpression;
import de.silvawb.java.AdditiveExpressionChild;
import de.silvawb.java.AdditiveOperator;
import de.silvawb.java.AndExpression;
import de.silvawb.java.AndExpressionChild;
import de.silvawb.java.Annotable;
import de.silvawb.java.AnnotableAndModifiable;
import de.silvawb.java.Annotation;
import de.silvawb.java.AnnotationAttribute;
import de.silvawb.java.AnnotationAttributeSetting;
import de.silvawb.java.AnnotationInstance;
import de.silvawb.java.AnnotationInstanceOrModifier;
import de.silvawb.java.AnnotationParameter;
import de.silvawb.java.AnnotationParameterList;
import de.silvawb.java.AnnotationValue;
import de.silvawb.java.AnonymousClass;
import de.silvawb.java.Argumentable;
import de.silvawb.java.ArrayDimension;
import de.silvawb.java.ArrayInitializationValue;
import de.silvawb.java.ArrayInitializer;
import de.silvawb.java.ArrayInstantiation;
import de.silvawb.java.ArrayInstantiationBySize;
import de.silvawb.java.ArrayInstantiationByValues;
import de.silvawb.java.ArrayInstantiationByValuesTyped;
import de.silvawb.java.ArrayInstantiationByValuesUntyped;
import de.silvawb.java.ArraySelector;
import de.silvawb.java.ArrayTypeable;
import de.silvawb.java.Assert;
import de.silvawb.java.Assignment;
import de.silvawb.java.AssignmentAnd;
import de.silvawb.java.AssignmentDivision;
import de.silvawb.java.AssignmentExclusiveOr;
import de.silvawb.java.AssignmentExpression;
import de.silvawb.java.AssignmentExpressionChild;
import de.silvawb.java.AssignmentLeftShift;
import de.silvawb.java.AssignmentMinus;
import de.silvawb.java.AssignmentModulo;
import de.silvawb.java.AssignmentMultiplication;
import de.silvawb.java.AssignmentOperator;
import de.silvawb.java.AssignmentOr;
import de.silvawb.java.AssignmentPlus;
import de.silvawb.java.AssignmentRightShift;
import de.silvawb.java.AssignmentUnsignedRightShift;
import de.silvawb.java.Block;
import de.silvawb.java.BooleanLiteral;
import de.silvawb.java.Break;
import de.silvawb.java.CallTypeArgumentable;
import de.silvawb.java.CastExpression;
import de.silvawb.java.CatchBlock;
import de.silvawb.java.Char;
import de.silvawb.java.CharacterLiteral;
import de.silvawb.java.ClassMethod;
import de.silvawb.java.Classifier;
import de.silvawb.java.ClassifierImport;
import de.silvawb.java.ClassifierReference;
import de.silvawb.java.Commentable;
import de.silvawb.java.CompilationUnit;
import de.silvawb.java.Complement;
import de.silvawb.java.ConcreteClassifier;
import de.silvawb.java.Condition;
import de.silvawb.java.Conditional;
import de.silvawb.java.ConditionalAndExpression;
import de.silvawb.java.ConditionalAndExpressionChild;
import de.silvawb.java.ConditionalExpression;
import de.silvawb.java.ConditionalExpressionChild;
import de.silvawb.java.ConditionalOrExpression;
import de.silvawb.java.ConditionalOrExpressionChild;
import de.silvawb.java.Constructor;
import de.silvawb.java.Continue;
import de.silvawb.java.DecimalDoubleLiteral;
import de.silvawb.java.DecimalFloatLiteral;
import de.silvawb.java.DecimalIntegerLiteral;
import de.silvawb.java.DecimalLongLiteral;
import de.silvawb.java.DefaultSwitchCase;
import de.silvawb.java.Division;
import de.silvawb.java.DoWhileLoop;
import de.silvawb.java.DoubleLiteral;
import de.silvawb.java.ElementReference;
import de.silvawb.java.EmptyMember;
import de.silvawb.java.EmptyModel;
import de.silvawb.java.EmptyStatement;
import de.silvawb.java.EnumConstant;
import de.silvawb.java.Enumeration;
import de.silvawb.java.Equal;
import de.silvawb.java.EqualityExpression;
import de.silvawb.java.EqualityExpressionChild;
import de.silvawb.java.EqualityOperator;
import de.silvawb.java.ExceptionThrower;
import de.silvawb.java.ExclusiveOrExpression;
import de.silvawb.java.ExclusiveOrExpressionChild;
import de.silvawb.java.ExplicitConstructorCall;
import de.silvawb.java.Expression;
import de.silvawb.java.ExpressionList;
import de.silvawb.java.ExpressionStatement;
import de.silvawb.java.ExtendsTypeArgument;
import de.silvawb.java.Field;
import de.silvawb.java.Final;
import de.silvawb.java.FloatLiteral;
import de.silvawb.java.ForEachLoop;
import de.silvawb.java.ForLoop;
import de.silvawb.java.ForLoopInitializer;
import de.silvawb.java.GreaterThan;
import de.silvawb.java.GreaterThanOrEqual;
import de.silvawb.java.HexDoubleLiteral;
import de.silvawb.java.HexFloatLiteral;
import de.silvawb.java.HexIntegerLiteral;
import de.silvawb.java.HexLongLiteral;
import de.silvawb.java.IdentifierReference;
import de.silvawb.java.Implementor;
import de.silvawb.java.Import;
import de.silvawb.java.ImportingElement;
import de.silvawb.java.InclusiveOrExpression;
import de.silvawb.java.InclusiveOrExpressionChild;
import de.silvawb.java.Initializable;
import de.silvawb.java.InstanceOfExpression;
import de.silvawb.java.InstanceOfExpressionChild;
import de.silvawb.java.Instantiation;
import de.silvawb.java.Int;
import de.silvawb.java.IntegerLiteral;
import de.silvawb.java.Interface;
import de.silvawb.java.InterfaceMethod;
import de.silvawb.java.JavaPackage;
import de.silvawb.java.JavaRoot;
import de.silvawb.java.Jump;
import de.silvawb.java.JumpLabel;
import de.silvawb.java.LeftShift;
import de.silvawb.java.LessThan;
import de.silvawb.java.LessThanOrEqual;
import de.silvawb.java.Literal;
import de.silvawb.java.LocalVariable;
import de.silvawb.java.LocalVariableStatement;
import de.silvawb.java.LongLiteral;
import de.silvawb.java.Member;
import de.silvawb.java.MemberContainer;
import de.silvawb.java.Method;
import de.silvawb.java.MethodCall;
import de.silvawb.java.MinusMinus;
import de.silvawb.java.Modifiable;
import de.silvawb.java.Modifier;
import de.silvawb.java.Multiplication;
import de.silvawb.java.MultiplicativeExpression;
import de.silvawb.java.MultiplicativeExpressionChild;
import de.silvawb.java.MultiplicativeOperator;
import de.silvawb.java.NamedElement;
import de.silvawb.java.NamespaceAwareElement;
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
import de.silvawb.java.Operator;
import de.silvawb.java.OrdinaryParameter;
import de.silvawb.java.PackageImport;
import de.silvawb.java.PackageReference;
import de.silvawb.java.Parameter;
import de.silvawb.java.Parametrizable;
import de.silvawb.java.PlusPlus;
import de.silvawb.java.PrefixUnaryModificationExpression;
import de.silvawb.java.PrimaryExpression;
import de.silvawb.java.PrimitiveType;
import de.silvawb.java.PrimitiveTypeReference;
import de.silvawb.java.Private;
import de.silvawb.java.Protected;
import de.silvawb.java.Public;
import de.silvawb.java.QualifiedTypeArgument;
import de.silvawb.java.Reference;
import de.silvawb.java.ReferenceableElement;
import de.silvawb.java.ReflectiveClassReference;
import de.silvawb.java.RelationExpression;
import de.silvawb.java.RelationExpressionChild;
import de.silvawb.java.RelationOperator;
import de.silvawb.java.Remainder;
import de.silvawb.java.Return;
import de.silvawb.java.RightShift;
import de.silvawb.java.Self;
import de.silvawb.java.SelfReference;
import de.silvawb.java.ShiftExpression;
import de.silvawb.java.ShiftExpressionChild;
import de.silvawb.java.ShiftOperator;
import de.silvawb.java.SingleAnnotationParameter;
import de.silvawb.java.Statement;
import de.silvawb.java.StatementContainer;
import de.silvawb.java.StatementListContainer;
import de.silvawb.java.Static;
import de.silvawb.java.StaticClassifierImport;
import de.silvawb.java.StaticImport;
import de.silvawb.java.StaticMemberImport;
import de.silvawb.java.Strictfp;
import de.silvawb.java.StringReference;
import de.silvawb.java.Subtraction;
import de.silvawb.java.SuffixUnaryModificationExpression;
import de.silvawb.java.Super;
import de.silvawb.java.SuperTypeArgument;
import de.silvawb.java.SwitchCase;
import de.silvawb.java.Synchronized;
import de.silvawb.java.SynchronizedBlock;
import de.silvawb.java.This;
import de.silvawb.java.Throw;
import de.silvawb.java.Transient;
import de.silvawb.java.TryBlock;
import de.silvawb.java.Type;
import de.silvawb.java.TypeArgument;
import de.silvawb.java.TypeArgumentable;
import de.silvawb.java.TypeParameter;
import de.silvawb.java.TypeParametrizable;
import de.silvawb.java.TypeReference;
import de.silvawb.java.TypedElement;
import de.silvawb.java.UnaryExpression;
import de.silvawb.java.UnaryExpressionChild;
import de.silvawb.java.UnaryModificationExpression;
import de.silvawb.java.UnaryModificationExpressionChild;
import de.silvawb.java.UnaryModificationOperator;
import de.silvawb.java.UnaryOperator;
import de.silvawb.java.UnknownTypeArgument;
import de.silvawb.java.UnsignedRightShift;
import de.silvawb.java.Variable;
import de.silvawb.java.VariableLengthParameter;
import de.silvawb.java.Volatile;
import de.silvawb.java.WhileLoop;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.silvawb.java.JavaPackage
 * @generated
 */
public class JavaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JavaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaSwitch() {
		if (modelPackage == null) {
			modelPackage = JavaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case JavaPackage.ANNOTABLE: {
				Annotable annotable = (Annotable)theEObject;
				T result = caseAnnotable(annotable);
				if (result == null) result = caseCommentable(annotable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ANNOTATION_INSTANCE: {
				AnnotationInstance annotationInstance = (AnnotationInstance)theEObject;
				T result = caseAnnotationInstance(annotationInstance);
				if (result == null) result = caseReference(annotationInstance);
				if (result == null) result = caseAnnotationInstanceOrModifier(annotationInstance);
				if (result == null) result = caseNamespaceAwareElement(annotationInstance);
				if (result == null) result = casePrimaryExpression(annotationInstance);
				if (result == null) result = caseTypeArgumentable(annotationInstance);
				if (result == null) result = caseUnaryModificationExpressionChild(annotationInstance);
				if (result == null) result = caseUnaryExpressionChild(annotationInstance);
				if (result == null) result = caseMultiplicativeExpressionChild(annotationInstance);
				if (result == null) result = caseAdditiveExpressionChild(annotationInstance);
				if (result == null) result = caseShiftExpressionChild(annotationInstance);
				if (result == null) result = caseRelationExpressionChild(annotationInstance);
				if (result == null) result = caseInstanceOfExpressionChild(annotationInstance);
				if (result == null) result = caseEqualityExpressionChild(annotationInstance);
				if (result == null) result = caseAndExpressionChild(annotationInstance);
				if (result == null) result = caseExclusiveOrExpressionChild(annotationInstance);
				if (result == null) result = caseInclusiveOrExpressionChild(annotationInstance);
				if (result == null) result = caseConditionalAndExpressionChild(annotationInstance);
				if (result == null) result = caseConditionalOrExpressionChild(annotationInstance);
				if (result == null) result = caseConditionalExpressionChild(annotationInstance);
				if (result == null) result = caseAssignmentExpressionChild(annotationInstance);
				if (result == null) result = caseExpression(annotationInstance);
				if (result == null) result = caseArrayInitializationValue(annotationInstance);
				if (result == null) result = caseAnnotationValue(annotationInstance);
				if (result == null) result = caseCommentable(annotationInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ANNOTATION_PARAMETER: {
				AnnotationParameter annotationParameter = (AnnotationParameter)theEObject;
				T result = caseAnnotationParameter(annotationParameter);
				if (result == null) result = caseCommentable(annotationParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.SINGLE_ANNOTATION_PARAMETER: {
				SingleAnnotationParameter singleAnnotationParameter = (SingleAnnotationParameter)theEObject;
				T result = caseSingleAnnotationParameter(singleAnnotationParameter);
				if (result == null) result = caseAnnotationParameter(singleAnnotationParameter);
				if (result == null) result = caseCommentable(singleAnnotationParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ANNOTATION_PARAMETER_LIST: {
				AnnotationParameterList annotationParameterList = (AnnotationParameterList)theEObject;
				T result = caseAnnotationParameterList(annotationParameterList);
				if (result == null) result = caseAnnotationParameter(annotationParameterList);
				if (result == null) result = caseCommentable(annotationParameterList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ANNOTATION_ATTRIBUTE_SETTING: {
				AnnotationAttributeSetting annotationAttributeSetting = (AnnotationAttributeSetting)theEObject;
				T result = caseAnnotationAttributeSetting(annotationAttributeSetting);
				if (result == null) result = caseCommentable(annotationAttributeSetting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ANNOTATION_VALUE: {
				AnnotationValue annotationValue = (AnnotationValue)theEObject;
				T result = caseAnnotationValue(annotationValue);
				if (result == null) result = caseCommentable(annotationValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ANNOTATION_ATTRIBUTE: {
				AnnotationAttribute annotationAttribute = (AnnotationAttribute)theEObject;
				T result = caseAnnotationAttribute(annotationAttribute);
				if (result == null) result = caseInterfaceMethod(annotationAttribute);
				if (result == null) result = caseMethod(annotationAttribute);
				if (result == null) result = caseMember(annotationAttribute);
				if (result == null) result = caseTypedElement(annotationAttribute);
				if (result == null) result = caseArrayTypeable(annotationAttribute);
				if (result == null) result = caseTypeParametrizable(annotationAttribute);
				if (result == null) result = caseParametrizable(annotationAttribute);
				if (result == null) result = caseReferenceableElement(annotationAttribute);
				if (result == null) result = caseExceptionThrower(annotationAttribute);
				if (result == null) result = caseAnnotableAndModifiable(annotationAttribute);
				if (result == null) result = caseNamedElement(annotationAttribute);
				if (result == null) result = caseCommentable(annotationAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ARRAY_TYPEABLE: {
				ArrayTypeable arrayTypeable = (ArrayTypeable)theEObject;
				T result = caseArrayTypeable(arrayTypeable);
				if (result == null) result = caseCommentable(arrayTypeable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ARRAY_DIMENSION: {
				ArrayDimension arrayDimension = (ArrayDimension)theEObject;
				T result = caseArrayDimension(arrayDimension);
				if (result == null) result = caseCommentable(arrayDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ARRAY_INITIALIZER: {
				ArrayInitializer arrayInitializer = (ArrayInitializer)theEObject;
				T result = caseArrayInitializer(arrayInitializer);
				if (result == null) result = caseArrayInitializationValue(arrayInitializer);
				if (result == null) result = caseAnnotationValue(arrayInitializer);
				if (result == null) result = caseCommentable(arrayInitializer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ARRAY_INITIALIZATION_VALUE: {
				ArrayInitializationValue arrayInitializationValue = (ArrayInitializationValue)theEObject;
				T result = caseArrayInitializationValue(arrayInitializationValue);
				if (result == null) result = caseCommentable(arrayInitializationValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ARRAY_INSTANTIATION: {
				ArrayInstantiation arrayInstantiation = (ArrayInstantiation)theEObject;
				T result = caseArrayInstantiation(arrayInstantiation);
				if (result == null) result = caseReference(arrayInstantiation);
				if (result == null) result = caseArrayInitializationValue(arrayInstantiation);
				if (result == null) result = caseAnnotationValue(arrayInstantiation);
				if (result == null) result = casePrimaryExpression(arrayInstantiation);
				if (result == null) result = caseTypeArgumentable(arrayInstantiation);
				if (result == null) result = caseCommentable(arrayInstantiation);
				if (result == null) result = caseUnaryModificationExpressionChild(arrayInstantiation);
				if (result == null) result = caseUnaryExpressionChild(arrayInstantiation);
				if (result == null) result = caseMultiplicativeExpressionChild(arrayInstantiation);
				if (result == null) result = caseAdditiveExpressionChild(arrayInstantiation);
				if (result == null) result = caseShiftExpressionChild(arrayInstantiation);
				if (result == null) result = caseRelationExpressionChild(arrayInstantiation);
				if (result == null) result = caseInstanceOfExpressionChild(arrayInstantiation);
				if (result == null) result = caseEqualityExpressionChild(arrayInstantiation);
				if (result == null) result = caseAndExpressionChild(arrayInstantiation);
				if (result == null) result = caseExclusiveOrExpressionChild(arrayInstantiation);
				if (result == null) result = caseInclusiveOrExpressionChild(arrayInstantiation);
				if (result == null) result = caseConditionalAndExpressionChild(arrayInstantiation);
				if (result == null) result = caseConditionalOrExpressionChild(arrayInstantiation);
				if (result == null) result = caseConditionalExpressionChild(arrayInstantiation);
				if (result == null) result = caseAssignmentExpressionChild(arrayInstantiation);
				if (result == null) result = caseExpression(arrayInstantiation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ARRAY_INSTANTIATION_BY_SIZE: {
				ArrayInstantiationBySize arrayInstantiationBySize = (ArrayInstantiationBySize)theEObject;
				T result = caseArrayInstantiationBySize(arrayInstantiationBySize);
				if (result == null) result = caseArrayInstantiation(arrayInstantiationBySize);
				if (result == null) result = caseTypedElement(arrayInstantiationBySize);
				if (result == null) result = caseArrayTypeable(arrayInstantiationBySize);
				if (result == null) result = caseReference(arrayInstantiationBySize);
				if (result == null) result = caseArrayInitializationValue(arrayInstantiationBySize);
				if (result == null) result = caseAnnotationValue(arrayInstantiationBySize);
				if (result == null) result = casePrimaryExpression(arrayInstantiationBySize);
				if (result == null) result = caseTypeArgumentable(arrayInstantiationBySize);
				if (result == null) result = caseCommentable(arrayInstantiationBySize);
				if (result == null) result = caseUnaryModificationExpressionChild(arrayInstantiationBySize);
				if (result == null) result = caseUnaryExpressionChild(arrayInstantiationBySize);
				if (result == null) result = caseMultiplicativeExpressionChild(arrayInstantiationBySize);
				if (result == null) result = caseAdditiveExpressionChild(arrayInstantiationBySize);
				if (result == null) result = caseShiftExpressionChild(arrayInstantiationBySize);
				if (result == null) result = caseRelationExpressionChild(arrayInstantiationBySize);
				if (result == null) result = caseInstanceOfExpressionChild(arrayInstantiationBySize);
				if (result == null) result = caseEqualityExpressionChild(arrayInstantiationBySize);
				if (result == null) result = caseAndExpressionChild(arrayInstantiationBySize);
				if (result == null) result = caseExclusiveOrExpressionChild(arrayInstantiationBySize);
				if (result == null) result = caseInclusiveOrExpressionChild(arrayInstantiationBySize);
				if (result == null) result = caseConditionalAndExpressionChild(arrayInstantiationBySize);
				if (result == null) result = caseConditionalOrExpressionChild(arrayInstantiationBySize);
				if (result == null) result = caseConditionalExpressionChild(arrayInstantiationBySize);
				if (result == null) result = caseAssignmentExpressionChild(arrayInstantiationBySize);
				if (result == null) result = caseExpression(arrayInstantiationBySize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ARRAY_INSTANTIATION_BY_VALUES: {
				ArrayInstantiationByValues arrayInstantiationByValues = (ArrayInstantiationByValues)theEObject;
				T result = caseArrayInstantiationByValues(arrayInstantiationByValues);
				if (result == null) result = caseArrayInstantiation(arrayInstantiationByValues);
				if (result == null) result = caseReference(arrayInstantiationByValues);
				if (result == null) result = caseArrayInitializationValue(arrayInstantiationByValues);
				if (result == null) result = caseAnnotationValue(arrayInstantiationByValues);
				if (result == null) result = casePrimaryExpression(arrayInstantiationByValues);
				if (result == null) result = caseTypeArgumentable(arrayInstantiationByValues);
				if (result == null) result = caseCommentable(arrayInstantiationByValues);
				if (result == null) result = caseUnaryModificationExpressionChild(arrayInstantiationByValues);
				if (result == null) result = caseUnaryExpressionChild(arrayInstantiationByValues);
				if (result == null) result = caseMultiplicativeExpressionChild(arrayInstantiationByValues);
				if (result == null) result = caseAdditiveExpressionChild(arrayInstantiationByValues);
				if (result == null) result = caseShiftExpressionChild(arrayInstantiationByValues);
				if (result == null) result = caseRelationExpressionChild(arrayInstantiationByValues);
				if (result == null) result = caseInstanceOfExpressionChild(arrayInstantiationByValues);
				if (result == null) result = caseEqualityExpressionChild(arrayInstantiationByValues);
				if (result == null) result = caseAndExpressionChild(arrayInstantiationByValues);
				if (result == null) result = caseExclusiveOrExpressionChild(arrayInstantiationByValues);
				if (result == null) result = caseInclusiveOrExpressionChild(arrayInstantiationByValues);
				if (result == null) result = caseConditionalAndExpressionChild(arrayInstantiationByValues);
				if (result == null) result = caseConditionalOrExpressionChild(arrayInstantiationByValues);
				if (result == null) result = caseConditionalExpressionChild(arrayInstantiationByValues);
				if (result == null) result = caseAssignmentExpressionChild(arrayInstantiationByValues);
				if (result == null) result = caseExpression(arrayInstantiationByValues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ARRAY_INSTANTIATION_BY_VALUES_UNTYPED: {
				ArrayInstantiationByValuesUntyped arrayInstantiationByValuesUntyped = (ArrayInstantiationByValuesUntyped)theEObject;
				T result = caseArrayInstantiationByValuesUntyped(arrayInstantiationByValuesUntyped);
				if (result == null) result = caseArrayInstantiationByValues(arrayInstantiationByValuesUntyped);
				if (result == null) result = caseArrayInstantiation(arrayInstantiationByValuesUntyped);
				if (result == null) result = caseReference(arrayInstantiationByValuesUntyped);
				if (result == null) result = caseArrayInitializationValue(arrayInstantiationByValuesUntyped);
				if (result == null) result = caseAnnotationValue(arrayInstantiationByValuesUntyped);
				if (result == null) result = casePrimaryExpression(arrayInstantiationByValuesUntyped);
				if (result == null) result = caseTypeArgumentable(arrayInstantiationByValuesUntyped);
				if (result == null) result = caseCommentable(arrayInstantiationByValuesUntyped);
				if (result == null) result = caseUnaryModificationExpressionChild(arrayInstantiationByValuesUntyped);
				if (result == null) result = caseUnaryExpressionChild(arrayInstantiationByValuesUntyped);
				if (result == null) result = caseMultiplicativeExpressionChild(arrayInstantiationByValuesUntyped);
				if (result == null) result = caseAdditiveExpressionChild(arrayInstantiationByValuesUntyped);
				if (result == null) result = caseShiftExpressionChild(arrayInstantiationByValuesUntyped);
				if (result == null) result = caseRelationExpressionChild(arrayInstantiationByValuesUntyped);
				if (result == null) result = caseInstanceOfExpressionChild(arrayInstantiationByValuesUntyped);
				if (result == null) result = caseEqualityExpressionChild(arrayInstantiationByValuesUntyped);
				if (result == null) result = caseAndExpressionChild(arrayInstantiationByValuesUntyped);
				if (result == null) result = caseExclusiveOrExpressionChild(arrayInstantiationByValuesUntyped);
				if (result == null) result = caseInclusiveOrExpressionChild(arrayInstantiationByValuesUntyped);
				if (result == null) result = caseConditionalAndExpressionChild(arrayInstantiationByValuesUntyped);
				if (result == null) result = caseConditionalOrExpressionChild(arrayInstantiationByValuesUntyped);
				if (result == null) result = caseConditionalExpressionChild(arrayInstantiationByValuesUntyped);
				if (result == null) result = caseAssignmentExpressionChild(arrayInstantiationByValuesUntyped);
				if (result == null) result = caseExpression(arrayInstantiationByValuesUntyped);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED: {
				ArrayInstantiationByValuesTyped arrayInstantiationByValuesTyped = (ArrayInstantiationByValuesTyped)theEObject;
				T result = caseArrayInstantiationByValuesTyped(arrayInstantiationByValuesTyped);
				if (result == null) result = caseArrayInstantiationByValues(arrayInstantiationByValuesTyped);
				if (result == null) result = caseTypedElement(arrayInstantiationByValuesTyped);
				if (result == null) result = caseArrayTypeable(arrayInstantiationByValuesTyped);
				if (result == null) result = caseArrayInstantiation(arrayInstantiationByValuesTyped);
				if (result == null) result = caseReference(arrayInstantiationByValuesTyped);
				if (result == null) result = caseArrayInitializationValue(arrayInstantiationByValuesTyped);
				if (result == null) result = caseAnnotationValue(arrayInstantiationByValuesTyped);
				if (result == null) result = casePrimaryExpression(arrayInstantiationByValuesTyped);
				if (result == null) result = caseTypeArgumentable(arrayInstantiationByValuesTyped);
				if (result == null) result = caseCommentable(arrayInstantiationByValuesTyped);
				if (result == null) result = caseUnaryModificationExpressionChild(arrayInstantiationByValuesTyped);
				if (result == null) result = caseUnaryExpressionChild(arrayInstantiationByValuesTyped);
				if (result == null) result = caseMultiplicativeExpressionChild(arrayInstantiationByValuesTyped);
				if (result == null) result = caseAdditiveExpressionChild(arrayInstantiationByValuesTyped);
				if (result == null) result = caseShiftExpressionChild(arrayInstantiationByValuesTyped);
				if (result == null) result = caseRelationExpressionChild(arrayInstantiationByValuesTyped);
				if (result == null) result = caseInstanceOfExpressionChild(arrayInstantiationByValuesTyped);
				if (result == null) result = caseEqualityExpressionChild(arrayInstantiationByValuesTyped);
				if (result == null) result = caseAndExpressionChild(arrayInstantiationByValuesTyped);
				if (result == null) result = caseExclusiveOrExpressionChild(arrayInstantiationByValuesTyped);
				if (result == null) result = caseInclusiveOrExpressionChild(arrayInstantiationByValuesTyped);
				if (result == null) result = caseConditionalAndExpressionChild(arrayInstantiationByValuesTyped);
				if (result == null) result = caseConditionalOrExpressionChild(arrayInstantiationByValuesTyped);
				if (result == null) result = caseConditionalExpressionChild(arrayInstantiationByValuesTyped);
				if (result == null) result = caseAssignmentExpressionChild(arrayInstantiationByValuesTyped);
				if (result == null) result = caseExpression(arrayInstantiationByValuesTyped);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ARRAY_SELECTOR: {
				ArraySelector arraySelector = (ArraySelector)theEObject;
				T result = caseArraySelector(arraySelector);
				if (result == null) result = caseCommentable(arraySelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.CLASSIFIER: {
				Classifier classifier = (Classifier)theEObject;
				T result = caseClassifier(classifier);
				if (result == null) result = caseType(classifier);
				if (result == null) result = caseReferenceableElement(classifier);
				if (result == null) result = caseNamedElement(classifier);
				if (result == null) result = caseCommentable(classifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.CONCRETE_CLASSIFIER: {
				ConcreteClassifier concreteClassifier = (ConcreteClassifier)theEObject;
				T result = caseConcreteClassifier(concreteClassifier);
				if (result == null) result = caseClassifier(concreteClassifier);
				if (result == null) result = caseTypeParametrizable(concreteClassifier);
				if (result == null) result = caseMemberContainer(concreteClassifier);
				if (result == null) result = caseMember(concreteClassifier);
				if (result == null) result = caseStatement(concreteClassifier);
				if (result == null) result = caseAnnotableAndModifiable(concreteClassifier);
				if (result == null) result = caseType(concreteClassifier);
				if (result == null) result = caseReferenceableElement(concreteClassifier);
				if (result == null) result = caseNamedElement(concreteClassifier);
				if (result == null) result = caseCommentable(concreteClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.IMPLEMENTOR: {
				Implementor implementor = (Implementor)theEObject;
				T result = caseImplementor(implementor);
				if (result == null) result = caseCommentable(implementor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.CLASS: {
				de.silvawb.java.Class class_ = (de.silvawb.java.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseConcreteClassifier(class_);
				if (result == null) result = caseImplementor(class_);
				if (result == null) result = caseClassifier(class_);
				if (result == null) result = caseTypeParametrizable(class_);
				if (result == null) result = caseMemberContainer(class_);
				if (result == null) result = caseMember(class_);
				if (result == null) result = caseStatement(class_);
				if (result == null) result = caseAnnotableAndModifiable(class_);
				if (result == null) result = caseType(class_);
				if (result == null) result = caseReferenceableElement(class_);
				if (result == null) result = caseNamedElement(class_);
				if (result == null) result = caseCommentable(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				T result = caseInterface(interface_);
				if (result == null) result = caseConcreteClassifier(interface_);
				if (result == null) result = caseClassifier(interface_);
				if (result == null) result = caseTypeParametrizable(interface_);
				if (result == null) result = caseMemberContainer(interface_);
				if (result == null) result = caseMember(interface_);
				if (result == null) result = caseStatement(interface_);
				if (result == null) result = caseAnnotableAndModifiable(interface_);
				if (result == null) result = caseType(interface_);
				if (result == null) result = caseReferenceableElement(interface_);
				if (result == null) result = caseNamedElement(interface_);
				if (result == null) result = caseCommentable(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ENUMERATION: {
				Enumeration enumeration = (Enumeration)theEObject;
				T result = caseEnumeration(enumeration);
				if (result == null) result = caseConcreteClassifier(enumeration);
				if (result == null) result = caseImplementor(enumeration);
				if (result == null) result = caseClassifier(enumeration);
				if (result == null) result = caseTypeParametrizable(enumeration);
				if (result == null) result = caseMemberContainer(enumeration);
				if (result == null) result = caseMember(enumeration);
				if (result == null) result = caseStatement(enumeration);
				if (result == null) result = caseAnnotableAndModifiable(enumeration);
				if (result == null) result = caseType(enumeration);
				if (result == null) result = caseReferenceableElement(enumeration);
				if (result == null) result = caseNamedElement(enumeration);
				if (result == null) result = caseCommentable(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = caseConcreteClassifier(annotation);
				if (result == null) result = caseClassifier(annotation);
				if (result == null) result = caseTypeParametrizable(annotation);
				if (result == null) result = caseMemberContainer(annotation);
				if (result == null) result = caseMember(annotation);
				if (result == null) result = caseStatement(annotation);
				if (result == null) result = caseAnnotableAndModifiable(annotation);
				if (result == null) result = caseType(annotation);
				if (result == null) result = caseReferenceableElement(annotation);
				if (result == null) result = caseNamedElement(annotation);
				if (result == null) result = caseCommentable(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ANONYMOUS_CLASS: {
				AnonymousClass anonymousClass = (AnonymousClass)theEObject;
				T result = caseAnonymousClass(anonymousClass);
				if (result == null) result = caseType(anonymousClass);
				if (result == null) result = caseMemberContainer(anonymousClass);
				if (result == null) result = caseCommentable(anonymousClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.COMMENTABLE: {
				Commentable commentable = (Commentable)theEObject;
				T result = caseCommentable(commentable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = caseCommentable(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.NAMESPACE_AWARE_ELEMENT: {
				NamespaceAwareElement namespaceAwareElement = (NamespaceAwareElement)theEObject;
				T result = caseNamespaceAwareElement(namespaceAwareElement);
				if (result == null) result = caseCommentable(namespaceAwareElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.JAVA_ROOT: {
				JavaRoot javaRoot = (JavaRoot)theEObject;
				T result = caseJavaRoot(javaRoot);
				if (result == null) result = caseNamedElement(javaRoot);
				if (result == null) result = caseNamespaceAwareElement(javaRoot);
				if (result == null) result = caseImportingElement(javaRoot);
				if (result == null) result = caseCommentable(javaRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.COMPILATION_UNIT: {
				CompilationUnit compilationUnit = (CompilationUnit)theEObject;
				T result = caseCompilationUnit(compilationUnit);
				if (result == null) result = caseJavaRoot(compilationUnit);
				if (result == null) result = caseNamedElement(compilationUnit);
				if (result == null) result = caseNamespaceAwareElement(compilationUnit);
				if (result == null) result = caseImportingElement(compilationUnit);
				if (result == null) result = caseCommentable(compilationUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.PACKAGE: {
				de.silvawb.java.Package package_ = (de.silvawb.java.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = caseJavaRoot(package_);
				if (result == null) result = caseAnnotable(package_);
				if (result == null) result = caseNamedElement(package_);
				if (result == null) result = caseNamespaceAwareElement(package_);
				if (result == null) result = caseImportingElement(package_);
				if (result == null) result = caseCommentable(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.EMPTY_MODEL: {
				EmptyModel emptyModel = (EmptyModel)theEObject;
				T result = caseEmptyModel(emptyModel);
				if (result == null) result = caseJavaRoot(emptyModel);
				if (result == null) result = caseNamedElement(emptyModel);
				if (result == null) result = caseNamespaceAwareElement(emptyModel);
				if (result == null) result = caseImportingElement(emptyModel);
				if (result == null) result = caseCommentable(emptyModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.EXPRESSION_LIST: {
				ExpressionList expressionList = (ExpressionList)theEObject;
				T result = caseExpressionList(expressionList);
				if (result == null) result = caseForLoopInitializer(expressionList);
				if (result == null) result = caseCommentable(expressionList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseArrayInitializationValue(expression);
				if (result == null) result = caseAnnotationValue(expression);
				if (result == null) result = caseCommentable(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ASSIGNMENT_EXPRESSION: {
				AssignmentExpression assignmentExpression = (AssignmentExpression)theEObject;
				T result = caseAssignmentExpression(assignmentExpression);
				if (result == null) result = caseExpression(assignmentExpression);
				if (result == null) result = caseArrayInitializationValue(assignmentExpression);
				if (result == null) result = caseAnnotationValue(assignmentExpression);
				if (result == null) result = caseCommentable(assignmentExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ASSIGNMENT_EXPRESSION_CHILD: {
				AssignmentExpressionChild assignmentExpressionChild = (AssignmentExpressionChild)theEObject;
				T result = caseAssignmentExpressionChild(assignmentExpressionChild);
				if (result == null) result = caseExpression(assignmentExpressionChild);
				if (result == null) result = caseArrayInitializationValue(assignmentExpressionChild);
				if (result == null) result = caseAnnotationValue(assignmentExpressionChild);
				if (result == null) result = caseCommentable(assignmentExpressionChild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.CONDITIONAL_EXPRESSION: {
				ConditionalExpression conditionalExpression = (ConditionalExpression)theEObject;
				T result = caseConditionalExpression(conditionalExpression);
				if (result == null) result = caseAssignmentExpressionChild(conditionalExpression);
				if (result == null) result = caseExpression(conditionalExpression);
				if (result == null) result = caseArrayInitializationValue(conditionalExpression);
				if (result == null) result = caseAnnotationValue(conditionalExpression);
				if (result == null) result = caseCommentable(conditionalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.CONDITIONAL_EXPRESSION_CHILD: {
				ConditionalExpressionChild conditionalExpressionChild = (ConditionalExpressionChild)theEObject;
				T result = caseConditionalExpressionChild(conditionalExpressionChild);
				if (result == null) result = caseAssignmentExpressionChild(conditionalExpressionChild);
				if (result == null) result = caseExpression(conditionalExpressionChild);
				if (result == null) result = caseArrayInitializationValue(conditionalExpressionChild);
				if (result == null) result = caseAnnotationValue(conditionalExpressionChild);
				if (result == null) result = caseCommentable(conditionalExpressionChild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.CONDITIONAL_OR_EXPRESSION: {
				ConditionalOrExpression conditionalOrExpression = (ConditionalOrExpression)theEObject;
				T result = caseConditionalOrExpression(conditionalOrExpression);
				if (result == null) result = caseConditionalExpressionChild(conditionalOrExpression);
				if (result == null) result = caseAssignmentExpressionChild(conditionalOrExpression);
				if (result == null) result = caseExpression(conditionalOrExpression);
				if (result == null) result = caseArrayInitializationValue(conditionalOrExpression);
				if (result == null) result = caseAnnotationValue(conditionalOrExpression);
				if (result == null) result = caseCommentable(conditionalOrExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.CONDITIONAL_OR_EXPRESSION_CHILD: {
				ConditionalOrExpressionChild conditionalOrExpressionChild = (ConditionalOrExpressionChild)theEObject;
				T result = caseConditionalOrExpressionChild(conditionalOrExpressionChild);
				if (result == null) result = caseConditionalExpressionChild(conditionalOrExpressionChild);
				if (result == null) result = caseAssignmentExpressionChild(conditionalOrExpressionChild);
				if (result == null) result = caseExpression(conditionalOrExpressionChild);
				if (result == null) result = caseArrayInitializationValue(conditionalOrExpressionChild);
				if (result == null) result = caseAnnotationValue(conditionalOrExpressionChild);
				if (result == null) result = caseCommentable(conditionalOrExpressionChild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.CONDITIONAL_AND_EXPRESSION: {
				ConditionalAndExpression conditionalAndExpression = (ConditionalAndExpression)theEObject;
				T result = caseConditionalAndExpression(conditionalAndExpression);
				if (result == null) result = caseConditionalOrExpressionChild(conditionalAndExpression);
				if (result == null) result = caseConditionalExpressionChild(conditionalAndExpression);
				if (result == null) result = caseAssignmentExpressionChild(conditionalAndExpression);
				if (result == null) result = caseExpression(conditionalAndExpression);
				if (result == null) result = caseArrayInitializationValue(conditionalAndExpression);
				if (result == null) result = caseAnnotationValue(conditionalAndExpression);
				if (result == null) result = caseCommentable(conditionalAndExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.CONDITIONAL_AND_EXPRESSION_CHILD: {
				ConditionalAndExpressionChild conditionalAndExpressionChild = (ConditionalAndExpressionChild)theEObject;
				T result = caseConditionalAndExpressionChild(conditionalAndExpressionChild);
				if (result == null) result = caseConditionalOrExpressionChild(conditionalAndExpressionChild);
				if (result == null) result = caseConditionalExpressionChild(conditionalAndExpressionChild);
				if (result == null) result = caseAssignmentExpressionChild(conditionalAndExpressionChild);
				if (result == null) result = caseExpression(conditionalAndExpressionChild);
				if (result == null) result = caseArrayInitializationValue(conditionalAndExpressionChild);
				if (result == null) result = caseAnnotationValue(conditionalAndExpressionChild);
				if (result == null) result = caseCommentable(conditionalAndExpressionChild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.INCLUSIVE_OR_EXPRESSION: {
				InclusiveOrExpression inclusiveOrExpression = (InclusiveOrExpression)theEObject;
				T result = caseInclusiveOrExpression(inclusiveOrExpression);
				if (result == null) result = caseConditionalAndExpressionChild(inclusiveOrExpression);
				if (result == null) result = caseConditionalOrExpressionChild(inclusiveOrExpression);
				if (result == null) result = caseConditionalExpressionChild(inclusiveOrExpression);
				if (result == null) result = caseAssignmentExpressionChild(inclusiveOrExpression);
				if (result == null) result = caseExpression(inclusiveOrExpression);
				if (result == null) result = caseArrayInitializationValue(inclusiveOrExpression);
				if (result == null) result = caseAnnotationValue(inclusiveOrExpression);
				if (result == null) result = caseCommentable(inclusiveOrExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.INCLUSIVE_OR_EXPRESSION_CHILD: {
				InclusiveOrExpressionChild inclusiveOrExpressionChild = (InclusiveOrExpressionChild)theEObject;
				T result = caseInclusiveOrExpressionChild(inclusiveOrExpressionChild);
				if (result == null) result = caseConditionalAndExpressionChild(inclusiveOrExpressionChild);
				if (result == null) result = caseConditionalOrExpressionChild(inclusiveOrExpressionChild);
				if (result == null) result = caseConditionalExpressionChild(inclusiveOrExpressionChild);
				if (result == null) result = caseAssignmentExpressionChild(inclusiveOrExpressionChild);
				if (result == null) result = caseExpression(inclusiveOrExpressionChild);
				if (result == null) result = caseArrayInitializationValue(inclusiveOrExpressionChild);
				if (result == null) result = caseAnnotationValue(inclusiveOrExpressionChild);
				if (result == null) result = caseCommentable(inclusiveOrExpressionChild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.EXCLUSIVE_OR_EXPRESSION: {
				ExclusiveOrExpression exclusiveOrExpression = (ExclusiveOrExpression)theEObject;
				T result = caseExclusiveOrExpression(exclusiveOrExpression);
				if (result == null) result = caseInclusiveOrExpressionChild(exclusiveOrExpression);
				if (result == null) result = caseConditionalAndExpressionChild(exclusiveOrExpression);
				if (result == null) result = caseConditionalOrExpressionChild(exclusiveOrExpression);
				if (result == null) result = caseConditionalExpressionChild(exclusiveOrExpression);
				if (result == null) result = caseAssignmentExpressionChild(exclusiveOrExpression);
				if (result == null) result = caseExpression(exclusiveOrExpression);
				if (result == null) result = caseArrayInitializationValue(exclusiveOrExpression);
				if (result == null) result = caseAnnotationValue(exclusiveOrExpression);
				if (result == null) result = caseCommentable(exclusiveOrExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.EXCLUSIVE_OR_EXPRESSION_CHILD: {
				ExclusiveOrExpressionChild exclusiveOrExpressionChild = (ExclusiveOrExpressionChild)theEObject;
				T result = caseExclusiveOrExpressionChild(exclusiveOrExpressionChild);
				if (result == null) result = caseInclusiveOrExpressionChild(exclusiveOrExpressionChild);
				if (result == null) result = caseConditionalAndExpressionChild(exclusiveOrExpressionChild);
				if (result == null) result = caseConditionalOrExpressionChild(exclusiveOrExpressionChild);
				if (result == null) result = caseConditionalExpressionChild(exclusiveOrExpressionChild);
				if (result == null) result = caseAssignmentExpressionChild(exclusiveOrExpressionChild);
				if (result == null) result = caseExpression(exclusiveOrExpressionChild);
				if (result == null) result = caseArrayInitializationValue(exclusiveOrExpressionChild);
				if (result == null) result = caseAnnotationValue(exclusiveOrExpressionChild);
				if (result == null) result = caseCommentable(exclusiveOrExpressionChild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.AND_EXPRESSION: {
				AndExpression andExpression = (AndExpression)theEObject;
				T result = caseAndExpression(andExpression);
				if (result == null) result = caseExclusiveOrExpressionChild(andExpression);
				if (result == null) result = caseInclusiveOrExpressionChild(andExpression);
				if (result == null) result = caseConditionalAndExpressionChild(andExpression);
				if (result == null) result = caseConditionalOrExpressionChild(andExpression);
				if (result == null) result = caseConditionalExpressionChild(andExpression);
				if (result == null) result = caseAssignmentExpressionChild(andExpression);
				if (result == null) result = caseExpression(andExpression);
				if (result == null) result = caseArrayInitializationValue(andExpression);
				if (result == null) result = caseAnnotationValue(andExpression);
				if (result == null) result = caseCommentable(andExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.AND_EXPRESSION_CHILD: {
				AndExpressionChild andExpressionChild = (AndExpressionChild)theEObject;
				T result = caseAndExpressionChild(andExpressionChild);
				if (result == null) result = caseExclusiveOrExpressionChild(andExpressionChild);
				if (result == null) result = caseInclusiveOrExpressionChild(andExpressionChild);
				if (result == null) result = caseConditionalAndExpressionChild(andExpressionChild);
				if (result == null) result = caseConditionalOrExpressionChild(andExpressionChild);
				if (result == null) result = caseConditionalExpressionChild(andExpressionChild);
				if (result == null) result = caseAssignmentExpressionChild(andExpressionChild);
				if (result == null) result = caseExpression(andExpressionChild);
				if (result == null) result = caseArrayInitializationValue(andExpressionChild);
				if (result == null) result = caseAnnotationValue(andExpressionChild);
				if (result == null) result = caseCommentable(andExpressionChild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.EQUALITY_EXPRESSION: {
				EqualityExpression equalityExpression = (EqualityExpression)theEObject;
				T result = caseEqualityExpression(equalityExpression);
				if (result == null) result = caseAndExpressionChild(equalityExpression);
				if (result == null) result = caseExclusiveOrExpressionChild(equalityExpression);
				if (result == null) result = caseInclusiveOrExpressionChild(equalityExpression);
				if (result == null) result = caseConditionalAndExpressionChild(equalityExpression);
				if (result == null) result = caseConditionalOrExpressionChild(equalityExpression);
				if (result == null) result = caseConditionalExpressionChild(equalityExpression);
				if (result == null) result = caseAssignmentExpressionChild(equalityExpression);
				if (result == null) result = caseExpression(equalityExpression);
				if (result == null) result = caseArrayInitializationValue(equalityExpression);
				if (result == null) result = caseAnnotationValue(equalityExpression);
				if (result == null) result = caseCommentable(equalityExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.EQUALITY_EXPRESSION_CHILD: {
				EqualityExpressionChild equalityExpressionChild = (EqualityExpressionChild)theEObject;
				T result = caseEqualityExpressionChild(equalityExpressionChild);
				if (result == null) result = caseAndExpressionChild(equalityExpressionChild);
				if (result == null) result = caseExclusiveOrExpressionChild(equalityExpressionChild);
				if (result == null) result = caseInclusiveOrExpressionChild(equalityExpressionChild);
				if (result == null) result = caseConditionalAndExpressionChild(equalityExpressionChild);
				if (result == null) result = caseConditionalOrExpressionChild(equalityExpressionChild);
				if (result == null) result = caseConditionalExpressionChild(equalityExpressionChild);
				if (result == null) result = caseAssignmentExpressionChild(equalityExpressionChild);
				if (result == null) result = caseExpression(equalityExpressionChild);
				if (result == null) result = caseArrayInitializationValue(equalityExpressionChild);
				if (result == null) result = caseAnnotationValue(equalityExpressionChild);
				if (result == null) result = caseCommentable(equalityExpressionChild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.INSTANCE_OF_EXPRESSION: {
				InstanceOfExpression instanceOfExpression = (InstanceOfExpression)theEObject;
				T result = caseInstanceOfExpression(instanceOfExpression);
				if (result == null) result = caseArrayTypeable(instanceOfExpression);
				if (result == null) result = caseTypedElement(instanceOfExpression);
				if (result == null) result = caseEqualityExpressionChild(instanceOfExpression);
				if (result == null) result = caseAndExpressionChild(instanceOfExpression);
				if (result == null) result = caseExclusiveOrExpressionChild(instanceOfExpression);
				if (result == null) result = caseInclusiveOrExpressionChild(instanceOfExpression);
				if (result == null) result = caseConditionalAndExpressionChild(instanceOfExpression);
				if (result == null) result = caseConditionalOrExpressionChild(instanceOfExpression);
				if (result == null) result = caseConditionalExpressionChild(instanceOfExpression);
				if (result == null) result = caseAssignmentExpressionChild(instanceOfExpression);
				if (result == null) result = caseExpression(instanceOfExpression);
				if (result == null) result = caseArrayInitializationValue(instanceOfExpression);
				if (result == null) result = caseAnnotationValue(instanceOfExpression);
				if (result == null) result = caseCommentable(instanceOfExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.INSTANCE_OF_EXPRESSION_CHILD: {
				InstanceOfExpressionChild instanceOfExpressionChild = (InstanceOfExpressionChild)theEObject;
				T result = caseInstanceOfExpressionChild(instanceOfExpressionChild);
				if (result == null) result = caseEqualityExpressionChild(instanceOfExpressionChild);
				if (result == null) result = caseAndExpressionChild(instanceOfExpressionChild);
				if (result == null) result = caseExclusiveOrExpressionChild(instanceOfExpressionChild);
				if (result == null) result = caseInclusiveOrExpressionChild(instanceOfExpressionChild);
				if (result == null) result = caseConditionalAndExpressionChild(instanceOfExpressionChild);
				if (result == null) result = caseConditionalOrExpressionChild(instanceOfExpressionChild);
				if (result == null) result = caseConditionalExpressionChild(instanceOfExpressionChild);
				if (result == null) result = caseAssignmentExpressionChild(instanceOfExpressionChild);
				if (result == null) result = caseExpression(instanceOfExpressionChild);
				if (result == null) result = caseArrayInitializationValue(instanceOfExpressionChild);
				if (result == null) result = caseAnnotationValue(instanceOfExpressionChild);
				if (result == null) result = caseCommentable(instanceOfExpressionChild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.RELATION_EXPRESSION: {
				RelationExpression relationExpression = (RelationExpression)theEObject;
				T result = caseRelationExpression(relationExpression);
				if (result == null) result = caseInstanceOfExpressionChild(relationExpression);
				if (result == null) result = caseEqualityExpressionChild(relationExpression);
				if (result == null) result = caseAndExpressionChild(relationExpression);
				if (result == null) result = caseExclusiveOrExpressionChild(relationExpression);
				if (result == null) result = caseInclusiveOrExpressionChild(relationExpression);
				if (result == null) result = caseConditionalAndExpressionChild(relationExpression);
				if (result == null) result = caseConditionalOrExpressionChild(relationExpression);
				if (result == null) result = caseConditionalExpressionChild(relationExpression);
				if (result == null) result = caseAssignmentExpressionChild(relationExpression);
				if (result == null) result = caseExpression(relationExpression);
				if (result == null) result = caseArrayInitializationValue(relationExpression);
				if (result == null) result = caseAnnotationValue(relationExpression);
				if (result == null) result = caseCommentable(relationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.RELATION_EXPRESSION_CHILD: {
				RelationExpressionChild relationExpressionChild = (RelationExpressionChild)theEObject;
				T result = caseRelationExpressionChild(relationExpressionChild);
				if (result == null) result = caseInstanceOfExpressionChild(relationExpressionChild);
				if (result == null) result = caseEqualityExpressionChild(relationExpressionChild);
				if (result == null) result = caseAndExpressionChild(relationExpressionChild);
				if (result == null) result = caseExclusiveOrExpressionChild(relationExpressionChild);
				if (result == null) result = caseInclusiveOrExpressionChild(relationExpressionChild);
				if (result == null) result = caseConditionalAndExpressionChild(relationExpressionChild);
				if (result == null) result = caseConditionalOrExpressionChild(relationExpressionChild);
				if (result == null) result = caseConditionalExpressionChild(relationExpressionChild);
				if (result == null) result = caseAssignmentExpressionChild(relationExpressionChild);
				if (result == null) result = caseExpression(relationExpressionChild);
				if (result == null) result = caseArrayInitializationValue(relationExpressionChild);
				if (result == null) result = caseAnnotationValue(relationExpressionChild);
				if (result == null) result = caseCommentable(relationExpressionChild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.SHIFT_EXPRESSION: {
				ShiftExpression shiftExpression = (ShiftExpression)theEObject;
				T result = caseShiftExpression(shiftExpression);
				if (result == null) result = caseRelationExpressionChild(shiftExpression);
				if (result == null) result = caseInstanceOfExpressionChild(shiftExpression);
				if (result == null) result = caseEqualityExpressionChild(shiftExpression);
				if (result == null) result = caseAndExpressionChild(shiftExpression);
				if (result == null) result = caseExclusiveOrExpressionChild(shiftExpression);
				if (result == null) result = caseInclusiveOrExpressionChild(shiftExpression);
				if (result == null) result = caseConditionalAndExpressionChild(shiftExpression);
				if (result == null) result = caseConditionalOrExpressionChild(shiftExpression);
				if (result == null) result = caseConditionalExpressionChild(shiftExpression);
				if (result == null) result = caseAssignmentExpressionChild(shiftExpression);
				if (result == null) result = caseExpression(shiftExpression);
				if (result == null) result = caseArrayInitializationValue(shiftExpression);
				if (result == null) result = caseAnnotationValue(shiftExpression);
				if (result == null) result = caseCommentable(shiftExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.SHIFT_EXPRESSION_CHILD: {
				ShiftExpressionChild shiftExpressionChild = (ShiftExpressionChild)theEObject;
				T result = caseShiftExpressionChild(shiftExpressionChild);
				if (result == null) result = caseRelationExpressionChild(shiftExpressionChild);
				if (result == null) result = caseInstanceOfExpressionChild(shiftExpressionChild);
				if (result == null) result = caseEqualityExpressionChild(shiftExpressionChild);
				if (result == null) result = caseAndExpressionChild(shiftExpressionChild);
				if (result == null) result = caseExclusiveOrExpressionChild(shiftExpressionChild);
				if (result == null) result = caseInclusiveOrExpressionChild(shiftExpressionChild);
				if (result == null) result = caseConditionalAndExpressionChild(shiftExpressionChild);
				if (result == null) result = caseConditionalOrExpressionChild(shiftExpressionChild);
				if (result == null) result = caseConditionalExpressionChild(shiftExpressionChild);
				if (result == null) result = caseAssignmentExpressionChild(shiftExpressionChild);
				if (result == null) result = caseExpression(shiftExpressionChild);
				if (result == null) result = caseArrayInitializationValue(shiftExpressionChild);
				if (result == null) result = caseAnnotationValue(shiftExpressionChild);
				if (result == null) result = caseCommentable(shiftExpressionChild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ADDITIVE_EXPRESSION: {
				AdditiveExpression additiveExpression = (AdditiveExpression)theEObject;
				T result = caseAdditiveExpression(additiveExpression);
				if (result == null) result = caseShiftExpressionChild(additiveExpression);
				if (result == null) result = caseRelationExpressionChild(additiveExpression);
				if (result == null) result = caseInstanceOfExpressionChild(additiveExpression);
				if (result == null) result = caseEqualityExpressionChild(additiveExpression);
				if (result == null) result = caseAndExpressionChild(additiveExpression);
				if (result == null) result = caseExclusiveOrExpressionChild(additiveExpression);
				if (result == null) result = caseInclusiveOrExpressionChild(additiveExpression);
				if (result == null) result = caseConditionalAndExpressionChild(additiveExpression);
				if (result == null) result = caseConditionalOrExpressionChild(additiveExpression);
				if (result == null) result = caseConditionalExpressionChild(additiveExpression);
				if (result == null) result = caseAssignmentExpressionChild(additiveExpression);
				if (result == null) result = caseExpression(additiveExpression);
				if (result == null) result = caseArrayInitializationValue(additiveExpression);
				if (result == null) result = caseAnnotationValue(additiveExpression);
				if (result == null) result = caseCommentable(additiveExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ADDITIVE_EXPRESSION_CHILD: {
				AdditiveExpressionChild additiveExpressionChild = (AdditiveExpressionChild)theEObject;
				T result = caseAdditiveExpressionChild(additiveExpressionChild);
				if (result == null) result = caseShiftExpressionChild(additiveExpressionChild);
				if (result == null) result = caseRelationExpressionChild(additiveExpressionChild);
				if (result == null) result = caseInstanceOfExpressionChild(additiveExpressionChild);
				if (result == null) result = caseEqualityExpressionChild(additiveExpressionChild);
				if (result == null) result = caseAndExpressionChild(additiveExpressionChild);
				if (result == null) result = caseExclusiveOrExpressionChild(additiveExpressionChild);
				if (result == null) result = caseInclusiveOrExpressionChild(additiveExpressionChild);
				if (result == null) result = caseConditionalAndExpressionChild(additiveExpressionChild);
				if (result == null) result = caseConditionalOrExpressionChild(additiveExpressionChild);
				if (result == null) result = caseConditionalExpressionChild(additiveExpressionChild);
				if (result == null) result = caseAssignmentExpressionChild(additiveExpressionChild);
				if (result == null) result = caseExpression(additiveExpressionChild);
				if (result == null) result = caseArrayInitializationValue(additiveExpressionChild);
				if (result == null) result = caseAnnotationValue(additiveExpressionChild);
				if (result == null) result = caseCommentable(additiveExpressionChild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.MULTIPLICATIVE_EXPRESSION: {
				MultiplicativeExpression multiplicativeExpression = (MultiplicativeExpression)theEObject;
				T result = caseMultiplicativeExpression(multiplicativeExpression);
				if (result == null) result = caseAdditiveExpressionChild(multiplicativeExpression);
				if (result == null) result = caseShiftExpressionChild(multiplicativeExpression);
				if (result == null) result = caseRelationExpressionChild(multiplicativeExpression);
				if (result == null) result = caseInstanceOfExpressionChild(multiplicativeExpression);
				if (result == null) result = caseEqualityExpressionChild(multiplicativeExpression);
				if (result == null) result = caseAndExpressionChild(multiplicativeExpression);
				if (result == null) result = caseExclusiveOrExpressionChild(multiplicativeExpression);
				if (result == null) result = caseInclusiveOrExpressionChild(multiplicativeExpression);
				if (result == null) result = caseConditionalAndExpressionChild(multiplicativeExpression);
				if (result == null) result = caseConditionalOrExpressionChild(multiplicativeExpression);
				if (result == null) result = caseConditionalExpressionChild(multiplicativeExpression);
				if (result == null) result = caseAssignmentExpressionChild(multiplicativeExpression);
				if (result == null) result = caseExpression(multiplicativeExpression);
				if (result == null) result = caseArrayInitializationValue(multiplicativeExpression);
				if (result == null) result = caseAnnotationValue(multiplicativeExpression);
				if (result == null) result = caseCommentable(multiplicativeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.MULTIPLICATIVE_EXPRESSION_CHILD: {
				MultiplicativeExpressionChild multiplicativeExpressionChild = (MultiplicativeExpressionChild)theEObject;
				T result = caseMultiplicativeExpressionChild(multiplicativeExpressionChild);
				if (result == null) result = caseAdditiveExpressionChild(multiplicativeExpressionChild);
				if (result == null) result = caseShiftExpressionChild(multiplicativeExpressionChild);
				if (result == null) result = caseRelationExpressionChild(multiplicativeExpressionChild);
				if (result == null) result = caseInstanceOfExpressionChild(multiplicativeExpressionChild);
				if (result == null) result = caseEqualityExpressionChild(multiplicativeExpressionChild);
				if (result == null) result = caseAndExpressionChild(multiplicativeExpressionChild);
				if (result == null) result = caseExclusiveOrExpressionChild(multiplicativeExpressionChild);
				if (result == null) result = caseInclusiveOrExpressionChild(multiplicativeExpressionChild);
				if (result == null) result = caseConditionalAndExpressionChild(multiplicativeExpressionChild);
				if (result == null) result = caseConditionalOrExpressionChild(multiplicativeExpressionChild);
				if (result == null) result = caseConditionalExpressionChild(multiplicativeExpressionChild);
				if (result == null) result = caseAssignmentExpressionChild(multiplicativeExpressionChild);
				if (result == null) result = caseExpression(multiplicativeExpressionChild);
				if (result == null) result = caseArrayInitializationValue(multiplicativeExpressionChild);
				if (result == null) result = caseAnnotationValue(multiplicativeExpressionChild);
				if (result == null) result = caseCommentable(multiplicativeExpressionChild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.UNARY_EXPRESSION: {
				UnaryExpression unaryExpression = (UnaryExpression)theEObject;
				T result = caseUnaryExpression(unaryExpression);
				if (result == null) result = caseMultiplicativeExpressionChild(unaryExpression);
				if (result == null) result = caseAdditiveExpressionChild(unaryExpression);
				if (result == null) result = caseShiftExpressionChild(unaryExpression);
				if (result == null) result = caseRelationExpressionChild(unaryExpression);
				if (result == null) result = caseInstanceOfExpressionChild(unaryExpression);
				if (result == null) result = caseEqualityExpressionChild(unaryExpression);
				if (result == null) result = caseAndExpressionChild(unaryExpression);
				if (result == null) result = caseExclusiveOrExpressionChild(unaryExpression);
				if (result == null) result = caseInclusiveOrExpressionChild(unaryExpression);
				if (result == null) result = caseConditionalAndExpressionChild(unaryExpression);
				if (result == null) result = caseConditionalOrExpressionChild(unaryExpression);
				if (result == null) result = caseConditionalExpressionChild(unaryExpression);
				if (result == null) result = caseAssignmentExpressionChild(unaryExpression);
				if (result == null) result = caseExpression(unaryExpression);
				if (result == null) result = caseArrayInitializationValue(unaryExpression);
				if (result == null) result = caseAnnotationValue(unaryExpression);
				if (result == null) result = caseCommentable(unaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.UNARY_EXPRESSION_CHILD: {
				UnaryExpressionChild unaryExpressionChild = (UnaryExpressionChild)theEObject;
				T result = caseUnaryExpressionChild(unaryExpressionChild);
				if (result == null) result = caseMultiplicativeExpressionChild(unaryExpressionChild);
				if (result == null) result = caseAdditiveExpressionChild(unaryExpressionChild);
				if (result == null) result = caseShiftExpressionChild(unaryExpressionChild);
				if (result == null) result = caseRelationExpressionChild(unaryExpressionChild);
				if (result == null) result = caseInstanceOfExpressionChild(unaryExpressionChild);
				if (result == null) result = caseEqualityExpressionChild(unaryExpressionChild);
				if (result == null) result = caseAndExpressionChild(unaryExpressionChild);
				if (result == null) result = caseExclusiveOrExpressionChild(unaryExpressionChild);
				if (result == null) result = caseInclusiveOrExpressionChild(unaryExpressionChild);
				if (result == null) result = caseConditionalAndExpressionChild(unaryExpressionChild);
				if (result == null) result = caseConditionalOrExpressionChild(unaryExpressionChild);
				if (result == null) result = caseConditionalExpressionChild(unaryExpressionChild);
				if (result == null) result = caseAssignmentExpressionChild(unaryExpressionChild);
				if (result == null) result = caseExpression(unaryExpressionChild);
				if (result == null) result = caseArrayInitializationValue(unaryExpressionChild);
				if (result == null) result = caseAnnotationValue(unaryExpressionChild);
				if (result == null) result = caseCommentable(unaryExpressionChild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.UNARY_MODIFICATION_EXPRESSION: {
				UnaryModificationExpression unaryModificationExpression = (UnaryModificationExpression)theEObject;
				T result = caseUnaryModificationExpression(unaryModificationExpression);
				if (result == null) result = caseUnaryExpressionChild(unaryModificationExpression);
				if (result == null) result = caseMultiplicativeExpressionChild(unaryModificationExpression);
				if (result == null) result = caseAdditiveExpressionChild(unaryModificationExpression);
				if (result == null) result = caseShiftExpressionChild(unaryModificationExpression);
				if (result == null) result = caseRelationExpressionChild(unaryModificationExpression);
				if (result == null) result = caseInstanceOfExpressionChild(unaryModificationExpression);
				if (result == null) result = caseEqualityExpressionChild(unaryModificationExpression);
				if (result == null) result = caseAndExpressionChild(unaryModificationExpression);
				if (result == null) result = caseExclusiveOrExpressionChild(unaryModificationExpression);
				if (result == null) result = caseInclusiveOrExpressionChild(unaryModificationExpression);
				if (result == null) result = caseConditionalAndExpressionChild(unaryModificationExpression);
				if (result == null) result = caseConditionalOrExpressionChild(unaryModificationExpression);
				if (result == null) result = caseConditionalExpressionChild(unaryModificationExpression);
				if (result == null) result = caseAssignmentExpressionChild(unaryModificationExpression);
				if (result == null) result = caseExpression(unaryModificationExpression);
				if (result == null) result = caseArrayInitializationValue(unaryModificationExpression);
				if (result == null) result = caseAnnotationValue(unaryModificationExpression);
				if (result == null) result = caseCommentable(unaryModificationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.PREFIX_UNARY_MODIFICATION_EXPRESSION: {
				PrefixUnaryModificationExpression prefixUnaryModificationExpression = (PrefixUnaryModificationExpression)theEObject;
				T result = casePrefixUnaryModificationExpression(prefixUnaryModificationExpression);
				if (result == null) result = caseUnaryModificationExpression(prefixUnaryModificationExpression);
				if (result == null) result = caseUnaryExpressionChild(prefixUnaryModificationExpression);
				if (result == null) result = caseMultiplicativeExpressionChild(prefixUnaryModificationExpression);
				if (result == null) result = caseAdditiveExpressionChild(prefixUnaryModificationExpression);
				if (result == null) result = caseShiftExpressionChild(prefixUnaryModificationExpression);
				if (result == null) result = caseRelationExpressionChild(prefixUnaryModificationExpression);
				if (result == null) result = caseInstanceOfExpressionChild(prefixUnaryModificationExpression);
				if (result == null) result = caseEqualityExpressionChild(prefixUnaryModificationExpression);
				if (result == null) result = caseAndExpressionChild(prefixUnaryModificationExpression);
				if (result == null) result = caseExclusiveOrExpressionChild(prefixUnaryModificationExpression);
				if (result == null) result = caseInclusiveOrExpressionChild(prefixUnaryModificationExpression);
				if (result == null) result = caseConditionalAndExpressionChild(prefixUnaryModificationExpression);
				if (result == null) result = caseConditionalOrExpressionChild(prefixUnaryModificationExpression);
				if (result == null) result = caseConditionalExpressionChild(prefixUnaryModificationExpression);
				if (result == null) result = caseAssignmentExpressionChild(prefixUnaryModificationExpression);
				if (result == null) result = caseExpression(prefixUnaryModificationExpression);
				if (result == null) result = caseArrayInitializationValue(prefixUnaryModificationExpression);
				if (result == null) result = caseAnnotationValue(prefixUnaryModificationExpression);
				if (result == null) result = caseCommentable(prefixUnaryModificationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.SUFFIX_UNARY_MODIFICATION_EXPRESSION: {
				SuffixUnaryModificationExpression suffixUnaryModificationExpression = (SuffixUnaryModificationExpression)theEObject;
				T result = caseSuffixUnaryModificationExpression(suffixUnaryModificationExpression);
				if (result == null) result = caseUnaryModificationExpression(suffixUnaryModificationExpression);
				if (result == null) result = caseUnaryExpressionChild(suffixUnaryModificationExpression);
				if (result == null) result = caseMultiplicativeExpressionChild(suffixUnaryModificationExpression);
				if (result == null) result = caseAdditiveExpressionChild(suffixUnaryModificationExpression);
				if (result == null) result = caseShiftExpressionChild(suffixUnaryModificationExpression);
				if (result == null) result = caseRelationExpressionChild(suffixUnaryModificationExpression);
				if (result == null) result = caseInstanceOfExpressionChild(suffixUnaryModificationExpression);
				if (result == null) result = caseEqualityExpressionChild(suffixUnaryModificationExpression);
				if (result == null) result = caseAndExpressionChild(suffixUnaryModificationExpression);
				if (result == null) result = caseExclusiveOrExpressionChild(suffixUnaryModificationExpression);
				if (result == null) result = caseInclusiveOrExpressionChild(suffixUnaryModificationExpression);
				if (result == null) result = caseConditionalAndExpressionChild(suffixUnaryModificationExpression);
				if (result == null) result = caseConditionalOrExpressionChild(suffixUnaryModificationExpression);
				if (result == null) result = caseConditionalExpressionChild(suffixUnaryModificationExpression);
				if (result == null) result = caseAssignmentExpressionChild(suffixUnaryModificationExpression);
				if (result == null) result = caseExpression(suffixUnaryModificationExpression);
				if (result == null) result = caseArrayInitializationValue(suffixUnaryModificationExpression);
				if (result == null) result = caseAnnotationValue(suffixUnaryModificationExpression);
				if (result == null) result = caseCommentable(suffixUnaryModificationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.UNARY_MODIFICATION_EXPRESSION_CHILD: {
				UnaryModificationExpressionChild unaryModificationExpressionChild = (UnaryModificationExpressionChild)theEObject;
				T result = caseUnaryModificationExpressionChild(unaryModificationExpressionChild);
				if (result == null) result = caseUnaryExpressionChild(unaryModificationExpressionChild);
				if (result == null) result = caseMultiplicativeExpressionChild(unaryModificationExpressionChild);
				if (result == null) result = caseAdditiveExpressionChild(unaryModificationExpressionChild);
				if (result == null) result = caseShiftExpressionChild(unaryModificationExpressionChild);
				if (result == null) result = caseRelationExpressionChild(unaryModificationExpressionChild);
				if (result == null) result = caseInstanceOfExpressionChild(unaryModificationExpressionChild);
				if (result == null) result = caseEqualityExpressionChild(unaryModificationExpressionChild);
				if (result == null) result = caseAndExpressionChild(unaryModificationExpressionChild);
				if (result == null) result = caseExclusiveOrExpressionChild(unaryModificationExpressionChild);
				if (result == null) result = caseInclusiveOrExpressionChild(unaryModificationExpressionChild);
				if (result == null) result = caseConditionalAndExpressionChild(unaryModificationExpressionChild);
				if (result == null) result = caseConditionalOrExpressionChild(unaryModificationExpressionChild);
				if (result == null) result = caseConditionalExpressionChild(unaryModificationExpressionChild);
				if (result == null) result = caseAssignmentExpressionChild(unaryModificationExpressionChild);
				if (result == null) result = caseExpression(unaryModificationExpressionChild);
				if (result == null) result = caseArrayInitializationValue(unaryModificationExpressionChild);
				if (result == null) result = caseAnnotationValue(unaryModificationExpressionChild);
				if (result == null) result = caseCommentable(unaryModificationExpressionChild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.CAST_EXPRESSION: {
				CastExpression castExpression = (CastExpression)theEObject;
				T result = caseCastExpression(castExpression);
				if (result == null) result = caseTypedElement(castExpression);
				if (result == null) result = caseArrayTypeable(castExpression);
				if (result == null) result = caseUnaryModificationExpressionChild(castExpression);
				if (result == null) result = caseUnaryExpressionChild(castExpression);
				if (result == null) result = caseMultiplicativeExpressionChild(castExpression);
				if (result == null) result = caseAdditiveExpressionChild(castExpression);
				if (result == null) result = caseShiftExpressionChild(castExpression);
				if (result == null) result = caseRelationExpressionChild(castExpression);
				if (result == null) result = caseInstanceOfExpressionChild(castExpression);
				if (result == null) result = caseEqualityExpressionChild(castExpression);
				if (result == null) result = caseAndExpressionChild(castExpression);
				if (result == null) result = caseExclusiveOrExpressionChild(castExpression);
				if (result == null) result = caseInclusiveOrExpressionChild(castExpression);
				if (result == null) result = caseConditionalAndExpressionChild(castExpression);
				if (result == null) result = caseConditionalOrExpressionChild(castExpression);
				if (result == null) result = caseConditionalExpressionChild(castExpression);
				if (result == null) result = caseAssignmentExpressionChild(castExpression);
				if (result == null) result = caseExpression(castExpression);
				if (result == null) result = caseArrayInitializationValue(castExpression);
				if (result == null) result = caseAnnotationValue(castExpression);
				if (result == null) result = caseCommentable(castExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.PRIMARY_EXPRESSION: {
				PrimaryExpression primaryExpression = (PrimaryExpression)theEObject;
				T result = casePrimaryExpression(primaryExpression);
				if (result == null) result = caseUnaryModificationExpressionChild(primaryExpression);
				if (result == null) result = caseUnaryExpressionChild(primaryExpression);
				if (result == null) result = caseMultiplicativeExpressionChild(primaryExpression);
				if (result == null) result = caseAdditiveExpressionChild(primaryExpression);
				if (result == null) result = caseShiftExpressionChild(primaryExpression);
				if (result == null) result = caseRelationExpressionChild(primaryExpression);
				if (result == null) result = caseInstanceOfExpressionChild(primaryExpression);
				if (result == null) result = caseEqualityExpressionChild(primaryExpression);
				if (result == null) result = caseAndExpressionChild(primaryExpression);
				if (result == null) result = caseExclusiveOrExpressionChild(primaryExpression);
				if (result == null) result = caseInclusiveOrExpressionChild(primaryExpression);
				if (result == null) result = caseConditionalAndExpressionChild(primaryExpression);
				if (result == null) result = caseConditionalOrExpressionChild(primaryExpression);
				if (result == null) result = caseConditionalExpressionChild(primaryExpression);
				if (result == null) result = caseAssignmentExpressionChild(primaryExpression);
				if (result == null) result = caseExpression(primaryExpression);
				if (result == null) result = caseArrayInitializationValue(primaryExpression);
				if (result == null) result = caseAnnotationValue(primaryExpression);
				if (result == null) result = caseCommentable(primaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.NESTED_EXPRESSION: {
				NestedExpression nestedExpression = (NestedExpression)theEObject;
				T result = caseNestedExpression(nestedExpression);
				if (result == null) result = caseReference(nestedExpression);
				if (result == null) result = casePrimaryExpression(nestedExpression);
				if (result == null) result = caseTypeArgumentable(nestedExpression);
				if (result == null) result = caseUnaryModificationExpressionChild(nestedExpression);
				if (result == null) result = caseUnaryExpressionChild(nestedExpression);
				if (result == null) result = caseMultiplicativeExpressionChild(nestedExpression);
				if (result == null) result = caseAdditiveExpressionChild(nestedExpression);
				if (result == null) result = caseShiftExpressionChild(nestedExpression);
				if (result == null) result = caseRelationExpressionChild(nestedExpression);
				if (result == null) result = caseInstanceOfExpressionChild(nestedExpression);
				if (result == null) result = caseEqualityExpressionChild(nestedExpression);
				if (result == null) result = caseAndExpressionChild(nestedExpression);
				if (result == null) result = caseExclusiveOrExpressionChild(nestedExpression);
				if (result == null) result = caseInclusiveOrExpressionChild(nestedExpression);
				if (result == null) result = caseConditionalAndExpressionChild(nestedExpression);
				if (result == null) result = caseConditionalOrExpressionChild(nestedExpression);
				if (result == null) result = caseConditionalExpressionChild(nestedExpression);
				if (result == null) result = caseAssignmentExpressionChild(nestedExpression);
				if (result == null) result = caseExpression(nestedExpression);
				if (result == null) result = caseArrayInitializationValue(nestedExpression);
				if (result == null) result = caseAnnotationValue(nestedExpression);
				if (result == null) result = caseCommentable(nestedExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.TYPE_ARGUMENT: {
				TypeArgument typeArgument = (TypeArgument)theEObject;
				T result = caseTypeArgument(typeArgument);
				if (result == null) result = caseArrayTypeable(typeArgument);
				if (result == null) result = caseCommentable(typeArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.TYPE_ARGUMENTABLE: {
				TypeArgumentable typeArgumentable = (TypeArgumentable)theEObject;
				T result = caseTypeArgumentable(typeArgumentable);
				if (result == null) result = caseCommentable(typeArgumentable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.CALL_TYPE_ARGUMENTABLE: {
				CallTypeArgumentable callTypeArgumentable = (CallTypeArgumentable)theEObject;
				T result = caseCallTypeArgumentable(callTypeArgumentable);
				if (result == null) result = caseCommentable(callTypeArgumentable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.TYPE_PARAMETRIZABLE: {
				TypeParametrizable typeParametrizable = (TypeParametrizable)theEObject;
				T result = caseTypeParametrizable(typeParametrizable);
				if (result == null) result = caseCommentable(typeParametrizable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.EXTENDS_TYPE_ARGUMENT: {
				ExtendsTypeArgument extendsTypeArgument = (ExtendsTypeArgument)theEObject;
				T result = caseExtendsTypeArgument(extendsTypeArgument);
				if (result == null) result = caseTypeArgument(extendsTypeArgument);
				if (result == null) result = caseArrayTypeable(extendsTypeArgument);
				if (result == null) result = caseCommentable(extendsTypeArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.QUALIFIED_TYPE_ARGUMENT: {
				QualifiedTypeArgument qualifiedTypeArgument = (QualifiedTypeArgument)theEObject;
				T result = caseQualifiedTypeArgument(qualifiedTypeArgument);
				if (result == null) result = caseTypeArgument(qualifiedTypeArgument);
				if (result == null) result = caseTypedElement(qualifiedTypeArgument);
				if (result == null) result = caseArrayTypeable(qualifiedTypeArgument);
				if (result == null) result = caseCommentable(qualifiedTypeArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.SUPER_TYPE_ARGUMENT: {
				SuperTypeArgument superTypeArgument = (SuperTypeArgument)theEObject;
				T result = caseSuperTypeArgument(superTypeArgument);
				if (result == null) result = caseTypeArgument(superTypeArgument);
				if (result == null) result = caseArrayTypeable(superTypeArgument);
				if (result == null) result = caseCommentable(superTypeArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.TYPE_PARAMETER: {
				TypeParameter typeParameter = (TypeParameter)theEObject;
				T result = caseTypeParameter(typeParameter);
				if (result == null) result = caseClassifier(typeParameter);
				if (result == null) result = caseType(typeParameter);
				if (result == null) result = caseReferenceableElement(typeParameter);
				if (result == null) result = caseNamedElement(typeParameter);
				if (result == null) result = caseCommentable(typeParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.UNKNOWN_TYPE_ARGUMENT: {
				UnknownTypeArgument unknownTypeArgument = (UnknownTypeArgument)theEObject;
				T result = caseUnknownTypeArgument(unknownTypeArgument);
				if (result == null) result = caseTypeArgument(unknownTypeArgument);
				if (result == null) result = caseArrayTypeable(unknownTypeArgument);
				if (result == null) result = caseCommentable(unknownTypeArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = caseNamespaceAwareElement(import_);
				if (result == null) result = caseCommentable(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.IMPORTING_ELEMENT: {
				ImportingElement importingElement = (ImportingElement)theEObject;
				T result = caseImportingElement(importingElement);
				if (result == null) result = caseCommentable(importingElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.STATIC_IMPORT: {
				StaticImport staticImport = (StaticImport)theEObject;
				T result = caseStaticImport(staticImport);
				if (result == null) result = caseImport(staticImport);
				if (result == null) result = caseNamespaceAwareElement(staticImport);
				if (result == null) result = caseCommentable(staticImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.CLASSIFIER_IMPORT: {
				ClassifierImport classifierImport = (ClassifierImport)theEObject;
				T result = caseClassifierImport(classifierImport);
				if (result == null) result = caseImport(classifierImport);
				if (result == null) result = caseNamespaceAwareElement(classifierImport);
				if (result == null) result = caseCommentable(classifierImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.PACKAGE_IMPORT: {
				PackageImport packageImport = (PackageImport)theEObject;
				T result = casePackageImport(packageImport);
				if (result == null) result = caseImport(packageImport);
				if (result == null) result = caseNamespaceAwareElement(packageImport);
				if (result == null) result = caseCommentable(packageImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.STATIC_CLASSIFIER_IMPORT: {
				StaticClassifierImport staticClassifierImport = (StaticClassifierImport)theEObject;
				T result = caseStaticClassifierImport(staticClassifierImport);
				if (result == null) result = caseStaticImport(staticClassifierImport);
				if (result == null) result = caseImport(staticClassifierImport);
				if (result == null) result = caseNamespaceAwareElement(staticClassifierImport);
				if (result == null) result = caseCommentable(staticClassifierImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.STATIC_MEMBER_IMPORT: {
				StaticMemberImport staticMemberImport = (StaticMemberImport)theEObject;
				T result = caseStaticMemberImport(staticMemberImport);
				if (result == null) result = caseStaticImport(staticMemberImport);
				if (result == null) result = caseImport(staticMemberImport);
				if (result == null) result = caseNamespaceAwareElement(staticMemberImport);
				if (result == null) result = caseCommentable(staticMemberImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.INITIALIZABLE: {
				Initializable initializable = (Initializable)theEObject;
				T result = caseInitializable(initializable);
				if (result == null) result = caseCommentable(initializable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.INSTANTIATION: {
				Instantiation instantiation = (Instantiation)theEObject;
				T result = caseInstantiation(instantiation);
				if (result == null) result = caseReference(instantiation);
				if (result == null) result = caseArgumentable(instantiation);
				if (result == null) result = casePrimaryExpression(instantiation);
				if (result == null) result = caseTypeArgumentable(instantiation);
				if (result == null) result = caseUnaryModificationExpressionChild(instantiation);
				if (result == null) result = caseUnaryExpressionChild(instantiation);
				if (result == null) result = caseMultiplicativeExpressionChild(instantiation);
				if (result == null) result = caseAdditiveExpressionChild(instantiation);
				if (result == null) result = caseShiftExpressionChild(instantiation);
				if (result == null) result = caseRelationExpressionChild(instantiation);
				if (result == null) result = caseInstanceOfExpressionChild(instantiation);
				if (result == null) result = caseEqualityExpressionChild(instantiation);
				if (result == null) result = caseAndExpressionChild(instantiation);
				if (result == null) result = caseExclusiveOrExpressionChild(instantiation);
				if (result == null) result = caseInclusiveOrExpressionChild(instantiation);
				if (result == null) result = caseConditionalAndExpressionChild(instantiation);
				if (result == null) result = caseConditionalOrExpressionChild(instantiation);
				if (result == null) result = caseConditionalExpressionChild(instantiation);
				if (result == null) result = caseAssignmentExpressionChild(instantiation);
				if (result == null) result = caseExpression(instantiation);
				if (result == null) result = caseArrayInitializationValue(instantiation);
				if (result == null) result = caseAnnotationValue(instantiation);
				if (result == null) result = caseCommentable(instantiation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.NEW_CONSTRUCTOR_CALL: {
				NewConstructorCall newConstructorCall = (NewConstructorCall)theEObject;
				T result = caseNewConstructorCall(newConstructorCall);
				if (result == null) result = caseTypedElement(newConstructorCall);
				if (result == null) result = caseInstantiation(newConstructorCall);
				if (result == null) result = caseCallTypeArgumentable(newConstructorCall);
				if (result == null) result = caseReference(newConstructorCall);
				if (result == null) result = caseArgumentable(newConstructorCall);
				if (result == null) result = casePrimaryExpression(newConstructorCall);
				if (result == null) result = caseTypeArgumentable(newConstructorCall);
				if (result == null) result = caseUnaryModificationExpressionChild(newConstructorCall);
				if (result == null) result = caseUnaryExpressionChild(newConstructorCall);
				if (result == null) result = caseMultiplicativeExpressionChild(newConstructorCall);
				if (result == null) result = caseAdditiveExpressionChild(newConstructorCall);
				if (result == null) result = caseShiftExpressionChild(newConstructorCall);
				if (result == null) result = caseRelationExpressionChild(newConstructorCall);
				if (result == null) result = caseInstanceOfExpressionChild(newConstructorCall);
				if (result == null) result = caseEqualityExpressionChild(newConstructorCall);
				if (result == null) result = caseAndExpressionChild(newConstructorCall);
				if (result == null) result = caseExclusiveOrExpressionChild(newConstructorCall);
				if (result == null) result = caseInclusiveOrExpressionChild(newConstructorCall);
				if (result == null) result = caseConditionalAndExpressionChild(newConstructorCall);
				if (result == null) result = caseConditionalOrExpressionChild(newConstructorCall);
				if (result == null) result = caseConditionalExpressionChild(newConstructorCall);
				if (result == null) result = caseAssignmentExpressionChild(newConstructorCall);
				if (result == null) result = caseExpression(newConstructorCall);
				if (result == null) result = caseArrayInitializationValue(newConstructorCall);
				if (result == null) result = caseAnnotationValue(newConstructorCall);
				if (result == null) result = caseCommentable(newConstructorCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.EXPLICIT_CONSTRUCTOR_CALL: {
				ExplicitConstructorCall explicitConstructorCall = (ExplicitConstructorCall)theEObject;
				T result = caseExplicitConstructorCall(explicitConstructorCall);
				if (result == null) result = caseInstantiation(explicitConstructorCall);
				if (result == null) result = caseReference(explicitConstructorCall);
				if (result == null) result = caseArgumentable(explicitConstructorCall);
				if (result == null) result = casePrimaryExpression(explicitConstructorCall);
				if (result == null) result = caseTypeArgumentable(explicitConstructorCall);
				if (result == null) result = caseUnaryModificationExpressionChild(explicitConstructorCall);
				if (result == null) result = caseUnaryExpressionChild(explicitConstructorCall);
				if (result == null) result = caseMultiplicativeExpressionChild(explicitConstructorCall);
				if (result == null) result = caseAdditiveExpressionChild(explicitConstructorCall);
				if (result == null) result = caseShiftExpressionChild(explicitConstructorCall);
				if (result == null) result = caseRelationExpressionChild(explicitConstructorCall);
				if (result == null) result = caseInstanceOfExpressionChild(explicitConstructorCall);
				if (result == null) result = caseEqualityExpressionChild(explicitConstructorCall);
				if (result == null) result = caseAndExpressionChild(explicitConstructorCall);
				if (result == null) result = caseExclusiveOrExpressionChild(explicitConstructorCall);
				if (result == null) result = caseInclusiveOrExpressionChild(explicitConstructorCall);
				if (result == null) result = caseConditionalAndExpressionChild(explicitConstructorCall);
				if (result == null) result = caseConditionalOrExpressionChild(explicitConstructorCall);
				if (result == null) result = caseConditionalExpressionChild(explicitConstructorCall);
				if (result == null) result = caseAssignmentExpressionChild(explicitConstructorCall);
				if (result == null) result = caseExpression(explicitConstructorCall);
				if (result == null) result = caseArrayInitializationValue(explicitConstructorCall);
				if (result == null) result = caseAnnotationValue(explicitConstructorCall);
				if (result == null) result = caseCommentable(explicitConstructorCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = casePrimaryExpression(literal);
				if (result == null) result = caseUnaryModificationExpressionChild(literal);
				if (result == null) result = caseUnaryExpressionChild(literal);
				if (result == null) result = caseMultiplicativeExpressionChild(literal);
				if (result == null) result = caseAdditiveExpressionChild(literal);
				if (result == null) result = caseShiftExpressionChild(literal);
				if (result == null) result = caseRelationExpressionChild(literal);
				if (result == null) result = caseInstanceOfExpressionChild(literal);
				if (result == null) result = caseEqualityExpressionChild(literal);
				if (result == null) result = caseAndExpressionChild(literal);
				if (result == null) result = caseExclusiveOrExpressionChild(literal);
				if (result == null) result = caseInclusiveOrExpressionChild(literal);
				if (result == null) result = caseConditionalAndExpressionChild(literal);
				if (result == null) result = caseConditionalOrExpressionChild(literal);
				if (result == null) result = caseConditionalExpressionChild(literal);
				if (result == null) result = caseAssignmentExpressionChild(literal);
				if (result == null) result = caseExpression(literal);
				if (result == null) result = caseArrayInitializationValue(literal);
				if (result == null) result = caseAnnotationValue(literal);
				if (result == null) result = caseCommentable(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.SELF: {
				Self self = (Self)theEObject;
				T result = caseSelf(self);
				if (result == null) result = caseCommentable(self);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.BOOLEAN_LITERAL: {
				BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
				T result = caseBooleanLiteral(booleanLiteral);
				if (result == null) result = caseLiteral(booleanLiteral);
				if (result == null) result = casePrimaryExpression(booleanLiteral);
				if (result == null) result = caseUnaryModificationExpressionChild(booleanLiteral);
				if (result == null) result = caseUnaryExpressionChild(booleanLiteral);
				if (result == null) result = caseMultiplicativeExpressionChild(booleanLiteral);
				if (result == null) result = caseAdditiveExpressionChild(booleanLiteral);
				if (result == null) result = caseShiftExpressionChild(booleanLiteral);
				if (result == null) result = caseRelationExpressionChild(booleanLiteral);
				if (result == null) result = caseInstanceOfExpressionChild(booleanLiteral);
				if (result == null) result = caseEqualityExpressionChild(booleanLiteral);
				if (result == null) result = caseAndExpressionChild(booleanLiteral);
				if (result == null) result = caseExclusiveOrExpressionChild(booleanLiteral);
				if (result == null) result = caseInclusiveOrExpressionChild(booleanLiteral);
				if (result == null) result = caseConditionalAndExpressionChild(booleanLiteral);
				if (result == null) result = caseConditionalOrExpressionChild(booleanLiteral);
				if (result == null) result = caseConditionalExpressionChild(booleanLiteral);
				if (result == null) result = caseAssignmentExpressionChild(booleanLiteral);
				if (result == null) result = caseExpression(booleanLiteral);
				if (result == null) result = caseArrayInitializationValue(booleanLiteral);
				if (result == null) result = caseAnnotationValue(booleanLiteral);
				if (result == null) result = caseCommentable(booleanLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.CHARACTER_LITERAL: {
				CharacterLiteral characterLiteral = (CharacterLiteral)theEObject;
				T result = caseCharacterLiteral(characterLiteral);
				if (result == null) result = caseLiteral(characterLiteral);
				if (result == null) result = casePrimaryExpression(characterLiteral);
				if (result == null) result = caseUnaryModificationExpressionChild(characterLiteral);
				if (result == null) result = caseUnaryExpressionChild(characterLiteral);
				if (result == null) result = caseMultiplicativeExpressionChild(characterLiteral);
				if (result == null) result = caseAdditiveExpressionChild(characterLiteral);
				if (result == null) result = caseShiftExpressionChild(characterLiteral);
				if (result == null) result = caseRelationExpressionChild(characterLiteral);
				if (result == null) result = caseInstanceOfExpressionChild(characterLiteral);
				if (result == null) result = caseEqualityExpressionChild(characterLiteral);
				if (result == null) result = caseAndExpressionChild(characterLiteral);
				if (result == null) result = caseExclusiveOrExpressionChild(characterLiteral);
				if (result == null) result = caseInclusiveOrExpressionChild(characterLiteral);
				if (result == null) result = caseConditionalAndExpressionChild(characterLiteral);
				if (result == null) result = caseConditionalOrExpressionChild(characterLiteral);
				if (result == null) result = caseConditionalExpressionChild(characterLiteral);
				if (result == null) result = caseAssignmentExpressionChild(characterLiteral);
				if (result == null) result = caseExpression(characterLiteral);
				if (result == null) result = caseArrayInitializationValue(characterLiteral);
				if (result == null) result = caseAnnotationValue(characterLiteral);
				if (result == null) result = caseCommentable(characterLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.FLOAT_LITERAL: {
				FloatLiteral floatLiteral = (FloatLiteral)theEObject;
				T result = caseFloatLiteral(floatLiteral);
				if (result == null) result = caseLiteral(floatLiteral);
				if (result == null) result = casePrimaryExpression(floatLiteral);
				if (result == null) result = caseUnaryModificationExpressionChild(floatLiteral);
				if (result == null) result = caseUnaryExpressionChild(floatLiteral);
				if (result == null) result = caseMultiplicativeExpressionChild(floatLiteral);
				if (result == null) result = caseAdditiveExpressionChild(floatLiteral);
				if (result == null) result = caseShiftExpressionChild(floatLiteral);
				if (result == null) result = caseRelationExpressionChild(floatLiteral);
				if (result == null) result = caseInstanceOfExpressionChild(floatLiteral);
				if (result == null) result = caseEqualityExpressionChild(floatLiteral);
				if (result == null) result = caseAndExpressionChild(floatLiteral);
				if (result == null) result = caseExclusiveOrExpressionChild(floatLiteral);
				if (result == null) result = caseInclusiveOrExpressionChild(floatLiteral);
				if (result == null) result = caseConditionalAndExpressionChild(floatLiteral);
				if (result == null) result = caseConditionalOrExpressionChild(floatLiteral);
				if (result == null) result = caseConditionalExpressionChild(floatLiteral);
				if (result == null) result = caseAssignmentExpressionChild(floatLiteral);
				if (result == null) result = caseExpression(floatLiteral);
				if (result == null) result = caseArrayInitializationValue(floatLiteral);
				if (result == null) result = caseAnnotationValue(floatLiteral);
				if (result == null) result = caseCommentable(floatLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.DECIMAL_FLOAT_LITERAL: {
				DecimalFloatLiteral decimalFloatLiteral = (DecimalFloatLiteral)theEObject;
				T result = caseDecimalFloatLiteral(decimalFloatLiteral);
				if (result == null) result = caseFloatLiteral(decimalFloatLiteral);
				if (result == null) result = caseLiteral(decimalFloatLiteral);
				if (result == null) result = casePrimaryExpression(decimalFloatLiteral);
				if (result == null) result = caseUnaryModificationExpressionChild(decimalFloatLiteral);
				if (result == null) result = caseUnaryExpressionChild(decimalFloatLiteral);
				if (result == null) result = caseMultiplicativeExpressionChild(decimalFloatLiteral);
				if (result == null) result = caseAdditiveExpressionChild(decimalFloatLiteral);
				if (result == null) result = caseShiftExpressionChild(decimalFloatLiteral);
				if (result == null) result = caseRelationExpressionChild(decimalFloatLiteral);
				if (result == null) result = caseInstanceOfExpressionChild(decimalFloatLiteral);
				if (result == null) result = caseEqualityExpressionChild(decimalFloatLiteral);
				if (result == null) result = caseAndExpressionChild(decimalFloatLiteral);
				if (result == null) result = caseExclusiveOrExpressionChild(decimalFloatLiteral);
				if (result == null) result = caseInclusiveOrExpressionChild(decimalFloatLiteral);
				if (result == null) result = caseConditionalAndExpressionChild(decimalFloatLiteral);
				if (result == null) result = caseConditionalOrExpressionChild(decimalFloatLiteral);
				if (result == null) result = caseConditionalExpressionChild(decimalFloatLiteral);
				if (result == null) result = caseAssignmentExpressionChild(decimalFloatLiteral);
				if (result == null) result = caseExpression(decimalFloatLiteral);
				if (result == null) result = caseArrayInitializationValue(decimalFloatLiteral);
				if (result == null) result = caseAnnotationValue(decimalFloatLiteral);
				if (result == null) result = caseCommentable(decimalFloatLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.HEX_FLOAT_LITERAL: {
				HexFloatLiteral hexFloatLiteral = (HexFloatLiteral)theEObject;
				T result = caseHexFloatLiteral(hexFloatLiteral);
				if (result == null) result = caseFloatLiteral(hexFloatLiteral);
				if (result == null) result = caseLiteral(hexFloatLiteral);
				if (result == null) result = casePrimaryExpression(hexFloatLiteral);
				if (result == null) result = caseUnaryModificationExpressionChild(hexFloatLiteral);
				if (result == null) result = caseUnaryExpressionChild(hexFloatLiteral);
				if (result == null) result = caseMultiplicativeExpressionChild(hexFloatLiteral);
				if (result == null) result = caseAdditiveExpressionChild(hexFloatLiteral);
				if (result == null) result = caseShiftExpressionChild(hexFloatLiteral);
				if (result == null) result = caseRelationExpressionChild(hexFloatLiteral);
				if (result == null) result = caseInstanceOfExpressionChild(hexFloatLiteral);
				if (result == null) result = caseEqualityExpressionChild(hexFloatLiteral);
				if (result == null) result = caseAndExpressionChild(hexFloatLiteral);
				if (result == null) result = caseExclusiveOrExpressionChild(hexFloatLiteral);
				if (result == null) result = caseInclusiveOrExpressionChild(hexFloatLiteral);
				if (result == null) result = caseConditionalAndExpressionChild(hexFloatLiteral);
				if (result == null) result = caseConditionalOrExpressionChild(hexFloatLiteral);
				if (result == null) result = caseConditionalExpressionChild(hexFloatLiteral);
				if (result == null) result = caseAssignmentExpressionChild(hexFloatLiteral);
				if (result == null) result = caseExpression(hexFloatLiteral);
				if (result == null) result = caseArrayInitializationValue(hexFloatLiteral);
				if (result == null) result = caseAnnotationValue(hexFloatLiteral);
				if (result == null) result = caseCommentable(hexFloatLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.DOUBLE_LITERAL: {
				DoubleLiteral doubleLiteral = (DoubleLiteral)theEObject;
				T result = caseDoubleLiteral(doubleLiteral);
				if (result == null) result = caseLiteral(doubleLiteral);
				if (result == null) result = casePrimaryExpression(doubleLiteral);
				if (result == null) result = caseUnaryModificationExpressionChild(doubleLiteral);
				if (result == null) result = caseUnaryExpressionChild(doubleLiteral);
				if (result == null) result = caseMultiplicativeExpressionChild(doubleLiteral);
				if (result == null) result = caseAdditiveExpressionChild(doubleLiteral);
				if (result == null) result = caseShiftExpressionChild(doubleLiteral);
				if (result == null) result = caseRelationExpressionChild(doubleLiteral);
				if (result == null) result = caseInstanceOfExpressionChild(doubleLiteral);
				if (result == null) result = caseEqualityExpressionChild(doubleLiteral);
				if (result == null) result = caseAndExpressionChild(doubleLiteral);
				if (result == null) result = caseExclusiveOrExpressionChild(doubleLiteral);
				if (result == null) result = caseInclusiveOrExpressionChild(doubleLiteral);
				if (result == null) result = caseConditionalAndExpressionChild(doubleLiteral);
				if (result == null) result = caseConditionalOrExpressionChild(doubleLiteral);
				if (result == null) result = caseConditionalExpressionChild(doubleLiteral);
				if (result == null) result = caseAssignmentExpressionChild(doubleLiteral);
				if (result == null) result = caseExpression(doubleLiteral);
				if (result == null) result = caseArrayInitializationValue(doubleLiteral);
				if (result == null) result = caseAnnotationValue(doubleLiteral);
				if (result == null) result = caseCommentable(doubleLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.DECIMAL_DOUBLE_LITERAL: {
				DecimalDoubleLiteral decimalDoubleLiteral = (DecimalDoubleLiteral)theEObject;
				T result = caseDecimalDoubleLiteral(decimalDoubleLiteral);
				if (result == null) result = caseDoubleLiteral(decimalDoubleLiteral);
				if (result == null) result = caseLiteral(decimalDoubleLiteral);
				if (result == null) result = casePrimaryExpression(decimalDoubleLiteral);
				if (result == null) result = caseUnaryModificationExpressionChild(decimalDoubleLiteral);
				if (result == null) result = caseUnaryExpressionChild(decimalDoubleLiteral);
				if (result == null) result = caseMultiplicativeExpressionChild(decimalDoubleLiteral);
				if (result == null) result = caseAdditiveExpressionChild(decimalDoubleLiteral);
				if (result == null) result = caseShiftExpressionChild(decimalDoubleLiteral);
				if (result == null) result = caseRelationExpressionChild(decimalDoubleLiteral);
				if (result == null) result = caseInstanceOfExpressionChild(decimalDoubleLiteral);
				if (result == null) result = caseEqualityExpressionChild(decimalDoubleLiteral);
				if (result == null) result = caseAndExpressionChild(decimalDoubleLiteral);
				if (result == null) result = caseExclusiveOrExpressionChild(decimalDoubleLiteral);
				if (result == null) result = caseInclusiveOrExpressionChild(decimalDoubleLiteral);
				if (result == null) result = caseConditionalAndExpressionChild(decimalDoubleLiteral);
				if (result == null) result = caseConditionalOrExpressionChild(decimalDoubleLiteral);
				if (result == null) result = caseConditionalExpressionChild(decimalDoubleLiteral);
				if (result == null) result = caseAssignmentExpressionChild(decimalDoubleLiteral);
				if (result == null) result = caseExpression(decimalDoubleLiteral);
				if (result == null) result = caseArrayInitializationValue(decimalDoubleLiteral);
				if (result == null) result = caseAnnotationValue(decimalDoubleLiteral);
				if (result == null) result = caseCommentable(decimalDoubleLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.HEX_DOUBLE_LITERAL: {
				HexDoubleLiteral hexDoubleLiteral = (HexDoubleLiteral)theEObject;
				T result = caseHexDoubleLiteral(hexDoubleLiteral);
				if (result == null) result = caseDoubleLiteral(hexDoubleLiteral);
				if (result == null) result = caseLiteral(hexDoubleLiteral);
				if (result == null) result = casePrimaryExpression(hexDoubleLiteral);
				if (result == null) result = caseUnaryModificationExpressionChild(hexDoubleLiteral);
				if (result == null) result = caseUnaryExpressionChild(hexDoubleLiteral);
				if (result == null) result = caseMultiplicativeExpressionChild(hexDoubleLiteral);
				if (result == null) result = caseAdditiveExpressionChild(hexDoubleLiteral);
				if (result == null) result = caseShiftExpressionChild(hexDoubleLiteral);
				if (result == null) result = caseRelationExpressionChild(hexDoubleLiteral);
				if (result == null) result = caseInstanceOfExpressionChild(hexDoubleLiteral);
				if (result == null) result = caseEqualityExpressionChild(hexDoubleLiteral);
				if (result == null) result = caseAndExpressionChild(hexDoubleLiteral);
				if (result == null) result = caseExclusiveOrExpressionChild(hexDoubleLiteral);
				if (result == null) result = caseInclusiveOrExpressionChild(hexDoubleLiteral);
				if (result == null) result = caseConditionalAndExpressionChild(hexDoubleLiteral);
				if (result == null) result = caseConditionalOrExpressionChild(hexDoubleLiteral);
				if (result == null) result = caseConditionalExpressionChild(hexDoubleLiteral);
				if (result == null) result = caseAssignmentExpressionChild(hexDoubleLiteral);
				if (result == null) result = caseExpression(hexDoubleLiteral);
				if (result == null) result = caseArrayInitializationValue(hexDoubleLiteral);
				if (result == null) result = caseAnnotationValue(hexDoubleLiteral);
				if (result == null) result = caseCommentable(hexDoubleLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.INTEGER_LITERAL: {
				IntegerLiteral integerLiteral = (IntegerLiteral)theEObject;
				T result = caseIntegerLiteral(integerLiteral);
				if (result == null) result = caseLiteral(integerLiteral);
				if (result == null) result = casePrimaryExpression(integerLiteral);
				if (result == null) result = caseUnaryModificationExpressionChild(integerLiteral);
				if (result == null) result = caseUnaryExpressionChild(integerLiteral);
				if (result == null) result = caseMultiplicativeExpressionChild(integerLiteral);
				if (result == null) result = caseAdditiveExpressionChild(integerLiteral);
				if (result == null) result = caseShiftExpressionChild(integerLiteral);
				if (result == null) result = caseRelationExpressionChild(integerLiteral);
				if (result == null) result = caseInstanceOfExpressionChild(integerLiteral);
				if (result == null) result = caseEqualityExpressionChild(integerLiteral);
				if (result == null) result = caseAndExpressionChild(integerLiteral);
				if (result == null) result = caseExclusiveOrExpressionChild(integerLiteral);
				if (result == null) result = caseInclusiveOrExpressionChild(integerLiteral);
				if (result == null) result = caseConditionalAndExpressionChild(integerLiteral);
				if (result == null) result = caseConditionalOrExpressionChild(integerLiteral);
				if (result == null) result = caseConditionalExpressionChild(integerLiteral);
				if (result == null) result = caseAssignmentExpressionChild(integerLiteral);
				if (result == null) result = caseExpression(integerLiteral);
				if (result == null) result = caseArrayInitializationValue(integerLiteral);
				if (result == null) result = caseAnnotationValue(integerLiteral);
				if (result == null) result = caseCommentable(integerLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.DECIMAL_INTEGER_LITERAL: {
				DecimalIntegerLiteral decimalIntegerLiteral = (DecimalIntegerLiteral)theEObject;
				T result = caseDecimalIntegerLiteral(decimalIntegerLiteral);
				if (result == null) result = caseIntegerLiteral(decimalIntegerLiteral);
				if (result == null) result = caseLiteral(decimalIntegerLiteral);
				if (result == null) result = casePrimaryExpression(decimalIntegerLiteral);
				if (result == null) result = caseUnaryModificationExpressionChild(decimalIntegerLiteral);
				if (result == null) result = caseUnaryExpressionChild(decimalIntegerLiteral);
				if (result == null) result = caseMultiplicativeExpressionChild(decimalIntegerLiteral);
				if (result == null) result = caseAdditiveExpressionChild(decimalIntegerLiteral);
				if (result == null) result = caseShiftExpressionChild(decimalIntegerLiteral);
				if (result == null) result = caseRelationExpressionChild(decimalIntegerLiteral);
				if (result == null) result = caseInstanceOfExpressionChild(decimalIntegerLiteral);
				if (result == null) result = caseEqualityExpressionChild(decimalIntegerLiteral);
				if (result == null) result = caseAndExpressionChild(decimalIntegerLiteral);
				if (result == null) result = caseExclusiveOrExpressionChild(decimalIntegerLiteral);
				if (result == null) result = caseInclusiveOrExpressionChild(decimalIntegerLiteral);
				if (result == null) result = caseConditionalAndExpressionChild(decimalIntegerLiteral);
				if (result == null) result = caseConditionalOrExpressionChild(decimalIntegerLiteral);
				if (result == null) result = caseConditionalExpressionChild(decimalIntegerLiteral);
				if (result == null) result = caseAssignmentExpressionChild(decimalIntegerLiteral);
				if (result == null) result = caseExpression(decimalIntegerLiteral);
				if (result == null) result = caseArrayInitializationValue(decimalIntegerLiteral);
				if (result == null) result = caseAnnotationValue(decimalIntegerLiteral);
				if (result == null) result = caseCommentable(decimalIntegerLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.HEX_INTEGER_LITERAL: {
				HexIntegerLiteral hexIntegerLiteral = (HexIntegerLiteral)theEObject;
				T result = caseHexIntegerLiteral(hexIntegerLiteral);
				if (result == null) result = caseIntegerLiteral(hexIntegerLiteral);
				if (result == null) result = caseLiteral(hexIntegerLiteral);
				if (result == null) result = casePrimaryExpression(hexIntegerLiteral);
				if (result == null) result = caseUnaryModificationExpressionChild(hexIntegerLiteral);
				if (result == null) result = caseUnaryExpressionChild(hexIntegerLiteral);
				if (result == null) result = caseMultiplicativeExpressionChild(hexIntegerLiteral);
				if (result == null) result = caseAdditiveExpressionChild(hexIntegerLiteral);
				if (result == null) result = caseShiftExpressionChild(hexIntegerLiteral);
				if (result == null) result = caseRelationExpressionChild(hexIntegerLiteral);
				if (result == null) result = caseInstanceOfExpressionChild(hexIntegerLiteral);
				if (result == null) result = caseEqualityExpressionChild(hexIntegerLiteral);
				if (result == null) result = caseAndExpressionChild(hexIntegerLiteral);
				if (result == null) result = caseExclusiveOrExpressionChild(hexIntegerLiteral);
				if (result == null) result = caseInclusiveOrExpressionChild(hexIntegerLiteral);
				if (result == null) result = caseConditionalAndExpressionChild(hexIntegerLiteral);
				if (result == null) result = caseConditionalOrExpressionChild(hexIntegerLiteral);
				if (result == null) result = caseConditionalExpressionChild(hexIntegerLiteral);
				if (result == null) result = caseAssignmentExpressionChild(hexIntegerLiteral);
				if (result == null) result = caseExpression(hexIntegerLiteral);
				if (result == null) result = caseArrayInitializationValue(hexIntegerLiteral);
				if (result == null) result = caseAnnotationValue(hexIntegerLiteral);
				if (result == null) result = caseCommentable(hexIntegerLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.OCTAL_INTEGER_LITERAL: {
				OctalIntegerLiteral octalIntegerLiteral = (OctalIntegerLiteral)theEObject;
				T result = caseOctalIntegerLiteral(octalIntegerLiteral);
				if (result == null) result = caseIntegerLiteral(octalIntegerLiteral);
				if (result == null) result = caseLiteral(octalIntegerLiteral);
				if (result == null) result = casePrimaryExpression(octalIntegerLiteral);
				if (result == null) result = caseUnaryModificationExpressionChild(octalIntegerLiteral);
				if (result == null) result = caseUnaryExpressionChild(octalIntegerLiteral);
				if (result == null) result = caseMultiplicativeExpressionChild(octalIntegerLiteral);
				if (result == null) result = caseAdditiveExpressionChild(octalIntegerLiteral);
				if (result == null) result = caseShiftExpressionChild(octalIntegerLiteral);
				if (result == null) result = caseRelationExpressionChild(octalIntegerLiteral);
				if (result == null) result = caseInstanceOfExpressionChild(octalIntegerLiteral);
				if (result == null) result = caseEqualityExpressionChild(octalIntegerLiteral);
				if (result == null) result = caseAndExpressionChild(octalIntegerLiteral);
				if (result == null) result = caseExclusiveOrExpressionChild(octalIntegerLiteral);
				if (result == null) result = caseInclusiveOrExpressionChild(octalIntegerLiteral);
				if (result == null) result = caseConditionalAndExpressionChild(octalIntegerLiteral);
				if (result == null) result = caseConditionalOrExpressionChild(octalIntegerLiteral);
				if (result == null) result = caseConditionalExpressionChild(octalIntegerLiteral);
				if (result == null) result = caseAssignmentExpressionChild(octalIntegerLiteral);
				if (result == null) result = caseExpression(octalIntegerLiteral);
				if (result == null) result = caseArrayInitializationValue(octalIntegerLiteral);
				if (result == null) result = caseAnnotationValue(octalIntegerLiteral);
				if (result == null) result = caseCommentable(octalIntegerLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.LONG_LITERAL: {
				LongLiteral longLiteral = (LongLiteral)theEObject;
				T result = caseLongLiteral(longLiteral);
				if (result == null) result = caseLiteral(longLiteral);
				if (result == null) result = casePrimaryExpression(longLiteral);
				if (result == null) result = caseUnaryModificationExpressionChild(longLiteral);
				if (result == null) result = caseUnaryExpressionChild(longLiteral);
				if (result == null) result = caseMultiplicativeExpressionChild(longLiteral);
				if (result == null) result = caseAdditiveExpressionChild(longLiteral);
				if (result == null) result = caseShiftExpressionChild(longLiteral);
				if (result == null) result = caseRelationExpressionChild(longLiteral);
				if (result == null) result = caseInstanceOfExpressionChild(longLiteral);
				if (result == null) result = caseEqualityExpressionChild(longLiteral);
				if (result == null) result = caseAndExpressionChild(longLiteral);
				if (result == null) result = caseExclusiveOrExpressionChild(longLiteral);
				if (result == null) result = caseInclusiveOrExpressionChild(longLiteral);
				if (result == null) result = caseConditionalAndExpressionChild(longLiteral);
				if (result == null) result = caseConditionalOrExpressionChild(longLiteral);
				if (result == null) result = caseConditionalExpressionChild(longLiteral);
				if (result == null) result = caseAssignmentExpressionChild(longLiteral);
				if (result == null) result = caseExpression(longLiteral);
				if (result == null) result = caseArrayInitializationValue(longLiteral);
				if (result == null) result = caseAnnotationValue(longLiteral);
				if (result == null) result = caseCommentable(longLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.DECIMAL_LONG_LITERAL: {
				DecimalLongLiteral decimalLongLiteral = (DecimalLongLiteral)theEObject;
				T result = caseDecimalLongLiteral(decimalLongLiteral);
				if (result == null) result = caseLongLiteral(decimalLongLiteral);
				if (result == null) result = caseLiteral(decimalLongLiteral);
				if (result == null) result = casePrimaryExpression(decimalLongLiteral);
				if (result == null) result = caseUnaryModificationExpressionChild(decimalLongLiteral);
				if (result == null) result = caseUnaryExpressionChild(decimalLongLiteral);
				if (result == null) result = caseMultiplicativeExpressionChild(decimalLongLiteral);
				if (result == null) result = caseAdditiveExpressionChild(decimalLongLiteral);
				if (result == null) result = caseShiftExpressionChild(decimalLongLiteral);
				if (result == null) result = caseRelationExpressionChild(decimalLongLiteral);
				if (result == null) result = caseInstanceOfExpressionChild(decimalLongLiteral);
				if (result == null) result = caseEqualityExpressionChild(decimalLongLiteral);
				if (result == null) result = caseAndExpressionChild(decimalLongLiteral);
				if (result == null) result = caseExclusiveOrExpressionChild(decimalLongLiteral);
				if (result == null) result = caseInclusiveOrExpressionChild(decimalLongLiteral);
				if (result == null) result = caseConditionalAndExpressionChild(decimalLongLiteral);
				if (result == null) result = caseConditionalOrExpressionChild(decimalLongLiteral);
				if (result == null) result = caseConditionalExpressionChild(decimalLongLiteral);
				if (result == null) result = caseAssignmentExpressionChild(decimalLongLiteral);
				if (result == null) result = caseExpression(decimalLongLiteral);
				if (result == null) result = caseArrayInitializationValue(decimalLongLiteral);
				if (result == null) result = caseAnnotationValue(decimalLongLiteral);
				if (result == null) result = caseCommentable(decimalLongLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.HEX_LONG_LITERAL: {
				HexLongLiteral hexLongLiteral = (HexLongLiteral)theEObject;
				T result = caseHexLongLiteral(hexLongLiteral);
				if (result == null) result = caseLongLiteral(hexLongLiteral);
				if (result == null) result = caseLiteral(hexLongLiteral);
				if (result == null) result = casePrimaryExpression(hexLongLiteral);
				if (result == null) result = caseUnaryModificationExpressionChild(hexLongLiteral);
				if (result == null) result = caseUnaryExpressionChild(hexLongLiteral);
				if (result == null) result = caseMultiplicativeExpressionChild(hexLongLiteral);
				if (result == null) result = caseAdditiveExpressionChild(hexLongLiteral);
				if (result == null) result = caseShiftExpressionChild(hexLongLiteral);
				if (result == null) result = caseRelationExpressionChild(hexLongLiteral);
				if (result == null) result = caseInstanceOfExpressionChild(hexLongLiteral);
				if (result == null) result = caseEqualityExpressionChild(hexLongLiteral);
				if (result == null) result = caseAndExpressionChild(hexLongLiteral);
				if (result == null) result = caseExclusiveOrExpressionChild(hexLongLiteral);
				if (result == null) result = caseInclusiveOrExpressionChild(hexLongLiteral);
				if (result == null) result = caseConditionalAndExpressionChild(hexLongLiteral);
				if (result == null) result = caseConditionalOrExpressionChild(hexLongLiteral);
				if (result == null) result = caseConditionalExpressionChild(hexLongLiteral);
				if (result == null) result = caseAssignmentExpressionChild(hexLongLiteral);
				if (result == null) result = caseExpression(hexLongLiteral);
				if (result == null) result = caseArrayInitializationValue(hexLongLiteral);
				if (result == null) result = caseAnnotationValue(hexLongLiteral);
				if (result == null) result = caseCommentable(hexLongLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.OCTAL_LONG_LITERAL: {
				OctalLongLiteral octalLongLiteral = (OctalLongLiteral)theEObject;
				T result = caseOctalLongLiteral(octalLongLiteral);
				if (result == null) result = caseLongLiteral(octalLongLiteral);
				if (result == null) result = caseLiteral(octalLongLiteral);
				if (result == null) result = casePrimaryExpression(octalLongLiteral);
				if (result == null) result = caseUnaryModificationExpressionChild(octalLongLiteral);
				if (result == null) result = caseUnaryExpressionChild(octalLongLiteral);
				if (result == null) result = caseMultiplicativeExpressionChild(octalLongLiteral);
				if (result == null) result = caseAdditiveExpressionChild(octalLongLiteral);
				if (result == null) result = caseShiftExpressionChild(octalLongLiteral);
				if (result == null) result = caseRelationExpressionChild(octalLongLiteral);
				if (result == null) result = caseInstanceOfExpressionChild(octalLongLiteral);
				if (result == null) result = caseEqualityExpressionChild(octalLongLiteral);
				if (result == null) result = caseAndExpressionChild(octalLongLiteral);
				if (result == null) result = caseExclusiveOrExpressionChild(octalLongLiteral);
				if (result == null) result = caseInclusiveOrExpressionChild(octalLongLiteral);
				if (result == null) result = caseConditionalAndExpressionChild(octalLongLiteral);
				if (result == null) result = caseConditionalOrExpressionChild(octalLongLiteral);
				if (result == null) result = caseConditionalExpressionChild(octalLongLiteral);
				if (result == null) result = caseAssignmentExpressionChild(octalLongLiteral);
				if (result == null) result = caseExpression(octalLongLiteral);
				if (result == null) result = caseArrayInitializationValue(octalLongLiteral);
				if (result == null) result = caseAnnotationValue(octalLongLiteral);
				if (result == null) result = caseCommentable(octalLongLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.NULL_LITERAL: {
				NullLiteral nullLiteral = (NullLiteral)theEObject;
				T result = caseNullLiteral(nullLiteral);
				if (result == null) result = caseLiteral(nullLiteral);
				if (result == null) result = casePrimaryExpression(nullLiteral);
				if (result == null) result = caseUnaryModificationExpressionChild(nullLiteral);
				if (result == null) result = caseUnaryExpressionChild(nullLiteral);
				if (result == null) result = caseMultiplicativeExpressionChild(nullLiteral);
				if (result == null) result = caseAdditiveExpressionChild(nullLiteral);
				if (result == null) result = caseShiftExpressionChild(nullLiteral);
				if (result == null) result = caseRelationExpressionChild(nullLiteral);
				if (result == null) result = caseInstanceOfExpressionChild(nullLiteral);
				if (result == null) result = caseEqualityExpressionChild(nullLiteral);
				if (result == null) result = caseAndExpressionChild(nullLiteral);
				if (result == null) result = caseExclusiveOrExpressionChild(nullLiteral);
				if (result == null) result = caseInclusiveOrExpressionChild(nullLiteral);
				if (result == null) result = caseConditionalAndExpressionChild(nullLiteral);
				if (result == null) result = caseConditionalOrExpressionChild(nullLiteral);
				if (result == null) result = caseConditionalExpressionChild(nullLiteral);
				if (result == null) result = caseAssignmentExpressionChild(nullLiteral);
				if (result == null) result = caseExpression(nullLiteral);
				if (result == null) result = caseArrayInitializationValue(nullLiteral);
				if (result == null) result = caseAnnotationValue(nullLiteral);
				if (result == null) result = caseCommentable(nullLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.SUPER: {
				Super super_ = (Super)theEObject;
				T result = caseSuper(super_);
				if (result == null) result = caseSelf(super_);
				if (result == null) result = caseCommentable(super_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.THIS: {
				This this_ = (This)theEObject;
				T result = caseThis(this_);
				if (result == null) result = caseSelf(this_);
				if (result == null) result = caseCommentable(this_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.EXCEPTION_THROWER: {
				ExceptionThrower exceptionThrower = (ExceptionThrower)theEObject;
				T result = caseExceptionThrower(exceptionThrower);
				if (result == null) result = caseCommentable(exceptionThrower);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.MEMBER: {
				Member member = (Member)theEObject;
				T result = caseMember(member);
				if (result == null) result = caseNamedElement(member);
				if (result == null) result = caseCommentable(member);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.MEMBER_CONTAINER: {
				MemberContainer memberContainer = (MemberContainer)theEObject;
				T result = caseMemberContainer(memberContainer);
				if (result == null) result = caseCommentable(memberContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ADDITIONAL_FIELD: {
				AdditionalField additionalField = (AdditionalField)theEObject;
				T result = caseAdditionalField(additionalField);
				if (result == null) result = caseReferenceableElement(additionalField);
				if (result == null) result = caseArrayTypeable(additionalField);
				if (result == null) result = caseInitializable(additionalField);
				if (result == null) result = caseNamedElement(additionalField);
				if (result == null) result = caseCommentable(additionalField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.CONSTRUCTOR: {
				Constructor constructor = (Constructor)theEObject;
				T result = caseConstructor(constructor);
				if (result == null) result = caseMember(constructor);
				if (result == null) result = caseStatementListContainer(constructor);
				if (result == null) result = caseParametrizable(constructor);
				if (result == null) result = caseTypeParametrizable(constructor);
				if (result == null) result = caseExceptionThrower(constructor);
				if (result == null) result = caseAnnotableAndModifiable(constructor);
				if (result == null) result = caseNamedElement(constructor);
				if (result == null) result = caseCommentable(constructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.EMPTY_MEMBER: {
				EmptyMember emptyMember = (EmptyMember)theEObject;
				T result = caseEmptyMember(emptyMember);
				if (result == null) result = caseMember(emptyMember);
				if (result == null) result = caseNamedElement(emptyMember);
				if (result == null) result = caseCommentable(emptyMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.FIELD: {
				Field field = (Field)theEObject;
				T result = caseField(field);
				if (result == null) result = caseMember(field);
				if (result == null) result = caseInitializable(field);
				if (result == null) result = caseVariable(field);
				if (result == null) result = caseAnnotableAndModifiable(field);
				if (result == null) result = caseTypedElement(field);
				if (result == null) result = caseArrayTypeable(field);
				if (result == null) result = caseReferenceableElement(field);
				if (result == null) result = caseTypeArgumentable(field);
				if (result == null) result = caseNamedElement(field);
				if (result == null) result = caseCommentable(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.METHOD: {
				Method method = (Method)theEObject;
				T result = caseMethod(method);
				if (result == null) result = caseMember(method);
				if (result == null) result = caseTypedElement(method);
				if (result == null) result = caseArrayTypeable(method);
				if (result == null) result = caseTypeParametrizable(method);
				if (result == null) result = caseParametrizable(method);
				if (result == null) result = caseReferenceableElement(method);
				if (result == null) result = caseExceptionThrower(method);
				if (result == null) result = caseAnnotableAndModifiable(method);
				if (result == null) result = caseNamedElement(method);
				if (result == null) result = caseCommentable(method);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.INTERFACE_METHOD: {
				InterfaceMethod interfaceMethod = (InterfaceMethod)theEObject;
				T result = caseInterfaceMethod(interfaceMethod);
				if (result == null) result = caseMethod(interfaceMethod);
				if (result == null) result = caseMember(interfaceMethod);
				if (result == null) result = caseTypedElement(interfaceMethod);
				if (result == null) result = caseArrayTypeable(interfaceMethod);
				if (result == null) result = caseTypeParametrizable(interfaceMethod);
				if (result == null) result = caseParametrizable(interfaceMethod);
				if (result == null) result = caseReferenceableElement(interfaceMethod);
				if (result == null) result = caseExceptionThrower(interfaceMethod);
				if (result == null) result = caseAnnotableAndModifiable(interfaceMethod);
				if (result == null) result = caseNamedElement(interfaceMethod);
				if (result == null) result = caseCommentable(interfaceMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.CLASS_METHOD: {
				ClassMethod classMethod = (ClassMethod)theEObject;
				T result = caseClassMethod(classMethod);
				if (result == null) result = caseMethod(classMethod);
				if (result == null) result = caseStatementListContainer(classMethod);
				if (result == null) result = caseMember(classMethod);
				if (result == null) result = caseTypedElement(classMethod);
				if (result == null) result = caseArrayTypeable(classMethod);
				if (result == null) result = caseTypeParametrizable(classMethod);
				if (result == null) result = caseParametrizable(classMethod);
				if (result == null) result = caseReferenceableElement(classMethod);
				if (result == null) result = caseExceptionThrower(classMethod);
				if (result == null) result = caseAnnotableAndModifiable(classMethod);
				if (result == null) result = caseNamedElement(classMethod);
				if (result == null) result = caseCommentable(classMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ENUM_CONSTANT: {
				EnumConstant enumConstant = (EnumConstant)theEObject;
				T result = caseEnumConstant(enumConstant);
				if (result == null) result = caseReferenceableElement(enumConstant);
				if (result == null) result = caseArgumentable(enumConstant);
				if (result == null) result = caseAnnotable(enumConstant);
				if (result == null) result = caseNamedElement(enumConstant);
				if (result == null) result = caseCommentable(enumConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.MODIFIER: {
				Modifier modifier = (Modifier)theEObject;
				T result = caseModifier(modifier);
				if (result == null) result = caseAnnotationInstanceOrModifier(modifier);
				if (result == null) result = caseCommentable(modifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ANNOTATION_INSTANCE_OR_MODIFIER: {
				AnnotationInstanceOrModifier annotationInstanceOrModifier = (AnnotationInstanceOrModifier)theEObject;
				T result = caseAnnotationInstanceOrModifier(annotationInstanceOrModifier);
				if (result == null) result = caseCommentable(annotationInstanceOrModifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ANNOTABLE_AND_MODIFIABLE: {
				AnnotableAndModifiable annotableAndModifiable = (AnnotableAndModifiable)theEObject;
				T result = caseAnnotableAndModifiable(annotableAndModifiable);
				if (result == null) result = caseCommentable(annotableAndModifiable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.MODIFIABLE: {
				Modifiable modifiable = (Modifiable)theEObject;
				T result = caseModifiable(modifiable);
				if (result == null) result = caseCommentable(modifiable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ABSTRACT: {
				Abstract abstract_ = (Abstract)theEObject;
				T result = caseAbstract(abstract_);
				if (result == null) result = caseModifier(abstract_);
				if (result == null) result = caseAnnotationInstanceOrModifier(abstract_);
				if (result == null) result = caseCommentable(abstract_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.FINAL: {
				Final final_ = (Final)theEObject;
				T result = caseFinal(final_);
				if (result == null) result = caseModifier(final_);
				if (result == null) result = caseAnnotationInstanceOrModifier(final_);
				if (result == null) result = caseCommentable(final_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.NATIVE: {
				Native native_ = (Native)theEObject;
				T result = caseNative(native_);
				if (result == null) result = caseModifier(native_);
				if (result == null) result = caseAnnotationInstanceOrModifier(native_);
				if (result == null) result = caseCommentable(native_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.PROTECTED: {
				Protected protected_ = (Protected)theEObject;
				T result = caseProtected(protected_);
				if (result == null) result = caseModifier(protected_);
				if (result == null) result = caseAnnotationInstanceOrModifier(protected_);
				if (result == null) result = caseCommentable(protected_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.PUBLIC: {
				Public public_ = (Public)theEObject;
				T result = casePublic(public_);
				if (result == null) result = caseModifier(public_);
				if (result == null) result = caseAnnotationInstanceOrModifier(public_);
				if (result == null) result = caseCommentable(public_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.PRIVATE: {
				Private private_ = (Private)theEObject;
				T result = casePrivate(private_);
				if (result == null) result = caseModifier(private_);
				if (result == null) result = caseAnnotationInstanceOrModifier(private_);
				if (result == null) result = caseCommentable(private_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.STATIC: {
				Static static_ = (Static)theEObject;
				T result = caseStatic(static_);
				if (result == null) result = caseModifier(static_);
				if (result == null) result = caseAnnotationInstanceOrModifier(static_);
				if (result == null) result = caseCommentable(static_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.STRICTFP: {
				Strictfp strictfp_ = (Strictfp)theEObject;
				T result = caseStrictfp(strictfp_);
				if (result == null) result = caseModifier(strictfp_);
				if (result == null) result = caseAnnotationInstanceOrModifier(strictfp_);
				if (result == null) result = caseCommentable(strictfp_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.SYNCHRONIZED: {
				Synchronized synchronized_ = (Synchronized)theEObject;
				T result = caseSynchronized(synchronized_);
				if (result == null) result = caseModifier(synchronized_);
				if (result == null) result = caseAnnotationInstanceOrModifier(synchronized_);
				if (result == null) result = caseCommentable(synchronized_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.TRANSIENT: {
				Transient transient_ = (Transient)theEObject;
				T result = caseTransient(transient_);
				if (result == null) result = caseModifier(transient_);
				if (result == null) result = caseAnnotationInstanceOrModifier(transient_);
				if (result == null) result = caseCommentable(transient_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.VOLATILE: {
				Volatile volatile_ = (Volatile)theEObject;
				T result = caseVolatile(volatile_);
				if (result == null) result = caseModifier(volatile_);
				if (result == null) result = caseAnnotationInstanceOrModifier(volatile_);
				if (result == null) result = caseCommentable(volatile_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.OPERATOR: {
				Operator operator = (Operator)theEObject;
				T result = caseOperator(operator);
				if (result == null) result = caseCommentable(operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ADDITIVE_OPERATOR: {
				AdditiveOperator additiveOperator = (AdditiveOperator)theEObject;
				T result = caseAdditiveOperator(additiveOperator);
				if (result == null) result = caseOperator(additiveOperator);
				if (result == null) result = caseCommentable(additiveOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ASSIGNMENT_OPERATOR: {
				AssignmentOperator assignmentOperator = (AssignmentOperator)theEObject;
				T result = caseAssignmentOperator(assignmentOperator);
				if (result == null) result = caseOperator(assignmentOperator);
				if (result == null) result = caseCommentable(assignmentOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.EQUALITY_OPERATOR: {
				EqualityOperator equalityOperator = (EqualityOperator)theEObject;
				T result = caseEqualityOperator(equalityOperator);
				if (result == null) result = caseOperator(equalityOperator);
				if (result == null) result = caseCommentable(equalityOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.MULTIPLICATIVE_OPERATOR: {
				MultiplicativeOperator multiplicativeOperator = (MultiplicativeOperator)theEObject;
				T result = caseMultiplicativeOperator(multiplicativeOperator);
				if (result == null) result = caseOperator(multiplicativeOperator);
				if (result == null) result = caseCommentable(multiplicativeOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.RELATION_OPERATOR: {
				RelationOperator relationOperator = (RelationOperator)theEObject;
				T result = caseRelationOperator(relationOperator);
				if (result == null) result = caseOperator(relationOperator);
				if (result == null) result = caseCommentable(relationOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.SHIFT_OPERATOR: {
				ShiftOperator shiftOperator = (ShiftOperator)theEObject;
				T result = caseShiftOperator(shiftOperator);
				if (result == null) result = caseOperator(shiftOperator);
				if (result == null) result = caseCommentable(shiftOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.UNARY_OPERATOR: {
				UnaryOperator unaryOperator = (UnaryOperator)theEObject;
				T result = caseUnaryOperator(unaryOperator);
				if (result == null) result = caseOperator(unaryOperator);
				if (result == null) result = caseCommentable(unaryOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.UNARY_MODIFICATION_OPERATOR: {
				UnaryModificationOperator unaryModificationOperator = (UnaryModificationOperator)theEObject;
				T result = caseUnaryModificationOperator(unaryModificationOperator);
				if (result == null) result = caseOperator(unaryModificationOperator);
				if (result == null) result = caseCommentable(unaryModificationOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ASSIGNMENT: {
				Assignment assignment = (Assignment)theEObject;
				T result = caseAssignment(assignment);
				if (result == null) result = caseAssignmentOperator(assignment);
				if (result == null) result = caseOperator(assignment);
				if (result == null) result = caseCommentable(assignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ASSIGNMENT_AND: {
				AssignmentAnd assignmentAnd = (AssignmentAnd)theEObject;
				T result = caseAssignmentAnd(assignmentAnd);
				if (result == null) result = caseAssignmentOperator(assignmentAnd);
				if (result == null) result = caseOperator(assignmentAnd);
				if (result == null) result = caseCommentable(assignmentAnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ASSIGNMENT_DIVISION: {
				AssignmentDivision assignmentDivision = (AssignmentDivision)theEObject;
				T result = caseAssignmentDivision(assignmentDivision);
				if (result == null) result = caseAssignmentOperator(assignmentDivision);
				if (result == null) result = caseOperator(assignmentDivision);
				if (result == null) result = caseCommentable(assignmentDivision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ASSIGNMENT_EXCLUSIVE_OR: {
				AssignmentExclusiveOr assignmentExclusiveOr = (AssignmentExclusiveOr)theEObject;
				T result = caseAssignmentExclusiveOr(assignmentExclusiveOr);
				if (result == null) result = caseAssignmentOperator(assignmentExclusiveOr);
				if (result == null) result = caseOperator(assignmentExclusiveOr);
				if (result == null) result = caseCommentable(assignmentExclusiveOr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ASSIGNMENT_MINUS: {
				AssignmentMinus assignmentMinus = (AssignmentMinus)theEObject;
				T result = caseAssignmentMinus(assignmentMinus);
				if (result == null) result = caseAssignmentOperator(assignmentMinus);
				if (result == null) result = caseOperator(assignmentMinus);
				if (result == null) result = caseCommentable(assignmentMinus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ASSIGNMENT_MODULO: {
				AssignmentModulo assignmentModulo = (AssignmentModulo)theEObject;
				T result = caseAssignmentModulo(assignmentModulo);
				if (result == null) result = caseAssignmentOperator(assignmentModulo);
				if (result == null) result = caseOperator(assignmentModulo);
				if (result == null) result = caseCommentable(assignmentModulo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ASSIGNMENT_MULTIPLICATION: {
				AssignmentMultiplication assignmentMultiplication = (AssignmentMultiplication)theEObject;
				T result = caseAssignmentMultiplication(assignmentMultiplication);
				if (result == null) result = caseAssignmentOperator(assignmentMultiplication);
				if (result == null) result = caseOperator(assignmentMultiplication);
				if (result == null) result = caseCommentable(assignmentMultiplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ASSIGNMENT_LEFT_SHIFT: {
				AssignmentLeftShift assignmentLeftShift = (AssignmentLeftShift)theEObject;
				T result = caseAssignmentLeftShift(assignmentLeftShift);
				if (result == null) result = caseAssignmentOperator(assignmentLeftShift);
				if (result == null) result = caseOperator(assignmentLeftShift);
				if (result == null) result = caseCommentable(assignmentLeftShift);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ASSIGNMENT_OR: {
				AssignmentOr assignmentOr = (AssignmentOr)theEObject;
				T result = caseAssignmentOr(assignmentOr);
				if (result == null) result = caseAssignmentOperator(assignmentOr);
				if (result == null) result = caseOperator(assignmentOr);
				if (result == null) result = caseCommentable(assignmentOr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ASSIGNMENT_PLUS: {
				AssignmentPlus assignmentPlus = (AssignmentPlus)theEObject;
				T result = caseAssignmentPlus(assignmentPlus);
				if (result == null) result = caseAssignmentOperator(assignmentPlus);
				if (result == null) result = caseOperator(assignmentPlus);
				if (result == null) result = caseCommentable(assignmentPlus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ASSIGNMENT_RIGHT_SHIFT: {
				AssignmentRightShift assignmentRightShift = (AssignmentRightShift)theEObject;
				T result = caseAssignmentRightShift(assignmentRightShift);
				if (result == null) result = caseAssignmentOperator(assignmentRightShift);
				if (result == null) result = caseOperator(assignmentRightShift);
				if (result == null) result = caseCommentable(assignmentRightShift);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ASSIGNMENT_UNSIGNED_RIGHT_SHIFT: {
				AssignmentUnsignedRightShift assignmentUnsignedRightShift = (AssignmentUnsignedRightShift)theEObject;
				T result = caseAssignmentUnsignedRightShift(assignmentUnsignedRightShift);
				if (result == null) result = caseAssignmentOperator(assignmentUnsignedRightShift);
				if (result == null) result = caseOperator(assignmentUnsignedRightShift);
				if (result == null) result = caseCommentable(assignmentUnsignedRightShift);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.EQUAL: {
				Equal equal = (Equal)theEObject;
				T result = caseEqual(equal);
				if (result == null) result = caseEqualityOperator(equal);
				if (result == null) result = caseOperator(equal);
				if (result == null) result = caseCommentable(equal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.NOT_EQUAL: {
				NotEqual notEqual = (NotEqual)theEObject;
				T result = caseNotEqual(notEqual);
				if (result == null) result = caseEqualityOperator(notEqual);
				if (result == null) result = caseOperator(notEqual);
				if (result == null) result = caseCommentable(notEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.GREATER_THAN: {
				GreaterThan greaterThan = (GreaterThan)theEObject;
				T result = caseGreaterThan(greaterThan);
				if (result == null) result = caseRelationOperator(greaterThan);
				if (result == null) result = caseOperator(greaterThan);
				if (result == null) result = caseCommentable(greaterThan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.GREATER_THAN_OR_EQUAL: {
				GreaterThanOrEqual greaterThanOrEqual = (GreaterThanOrEqual)theEObject;
				T result = caseGreaterThanOrEqual(greaterThanOrEqual);
				if (result == null) result = caseRelationOperator(greaterThanOrEqual);
				if (result == null) result = caseOperator(greaterThanOrEqual);
				if (result == null) result = caseCommentable(greaterThanOrEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.LESS_THAN: {
				LessThan lessThan = (LessThan)theEObject;
				T result = caseLessThan(lessThan);
				if (result == null) result = caseRelationOperator(lessThan);
				if (result == null) result = caseOperator(lessThan);
				if (result == null) result = caseCommentable(lessThan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.LESS_THAN_OR_EQUAL: {
				LessThanOrEqual lessThanOrEqual = (LessThanOrEqual)theEObject;
				T result = caseLessThanOrEqual(lessThanOrEqual);
				if (result == null) result = caseRelationOperator(lessThanOrEqual);
				if (result == null) result = caseOperator(lessThanOrEqual);
				if (result == null) result = caseCommentable(lessThanOrEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ADDITION: {
				Addition addition = (Addition)theEObject;
				T result = caseAddition(addition);
				if (result == null) result = caseAdditiveOperator(addition);
				if (result == null) result = caseUnaryOperator(addition);
				if (result == null) result = caseOperator(addition);
				if (result == null) result = caseCommentable(addition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.SUBTRACTION: {
				Subtraction subtraction = (Subtraction)theEObject;
				T result = caseSubtraction(subtraction);
				if (result == null) result = caseAdditiveOperator(subtraction);
				if (result == null) result = caseUnaryOperator(subtraction);
				if (result == null) result = caseOperator(subtraction);
				if (result == null) result = caseCommentable(subtraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.DIVISION: {
				Division division = (Division)theEObject;
				T result = caseDivision(division);
				if (result == null) result = caseMultiplicativeOperator(division);
				if (result == null) result = caseOperator(division);
				if (result == null) result = caseCommentable(division);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.MULTIPLICATION: {
				Multiplication multiplication = (Multiplication)theEObject;
				T result = caseMultiplication(multiplication);
				if (result == null) result = caseMultiplicativeOperator(multiplication);
				if (result == null) result = caseOperator(multiplication);
				if (result == null) result = caseCommentable(multiplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.REMAINDER: {
				Remainder remainder = (Remainder)theEObject;
				T result = caseRemainder(remainder);
				if (result == null) result = caseMultiplicativeOperator(remainder);
				if (result == null) result = caseOperator(remainder);
				if (result == null) result = caseCommentable(remainder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.COMPLEMENT: {
				Complement complement = (Complement)theEObject;
				T result = caseComplement(complement);
				if (result == null) result = caseUnaryOperator(complement);
				if (result == null) result = caseOperator(complement);
				if (result == null) result = caseCommentable(complement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.MINUS_MINUS: {
				MinusMinus minusMinus = (MinusMinus)theEObject;
				T result = caseMinusMinus(minusMinus);
				if (result == null) result = caseUnaryModificationOperator(minusMinus);
				if (result == null) result = caseOperator(minusMinus);
				if (result == null) result = caseCommentable(minusMinus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.NEGATE: {
				Negate negate = (Negate)theEObject;
				T result = caseNegate(negate);
				if (result == null) result = caseUnaryOperator(negate);
				if (result == null) result = caseOperator(negate);
				if (result == null) result = caseCommentable(negate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.PLUS_PLUS: {
				PlusPlus plusPlus = (PlusPlus)theEObject;
				T result = casePlusPlus(plusPlus);
				if (result == null) result = caseUnaryModificationOperator(plusPlus);
				if (result == null) result = caseOperator(plusPlus);
				if (result == null) result = caseCommentable(plusPlus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.LEFT_SHIFT: {
				LeftShift leftShift = (LeftShift)theEObject;
				T result = caseLeftShift(leftShift);
				if (result == null) result = caseShiftOperator(leftShift);
				if (result == null) result = caseOperator(leftShift);
				if (result == null) result = caseCommentable(leftShift);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.RIGHT_SHIFT: {
				RightShift rightShift = (RightShift)theEObject;
				T result = caseRightShift(rightShift);
				if (result == null) result = caseShiftOperator(rightShift);
				if (result == null) result = caseOperator(rightShift);
				if (result == null) result = caseCommentable(rightShift);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.UNSIGNED_RIGHT_SHIFT: {
				UnsignedRightShift unsignedRightShift = (UnsignedRightShift)theEObject;
				T result = caseUnsignedRightShift(unsignedRightShift);
				if (result == null) result = caseShiftOperator(unsignedRightShift);
				if (result == null) result = caseOperator(unsignedRightShift);
				if (result == null) result = caseCommentable(unsignedRightShift);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = casePrimaryExpression(reference);
				if (result == null) result = caseTypeArgumentable(reference);
				if (result == null) result = caseUnaryModificationExpressionChild(reference);
				if (result == null) result = caseUnaryExpressionChild(reference);
				if (result == null) result = caseMultiplicativeExpressionChild(reference);
				if (result == null) result = caseAdditiveExpressionChild(reference);
				if (result == null) result = caseShiftExpressionChild(reference);
				if (result == null) result = caseRelationExpressionChild(reference);
				if (result == null) result = caseInstanceOfExpressionChild(reference);
				if (result == null) result = caseEqualityExpressionChild(reference);
				if (result == null) result = caseAndExpressionChild(reference);
				if (result == null) result = caseExclusiveOrExpressionChild(reference);
				if (result == null) result = caseInclusiveOrExpressionChild(reference);
				if (result == null) result = caseConditionalAndExpressionChild(reference);
				if (result == null) result = caseConditionalOrExpressionChild(reference);
				if (result == null) result = caseConditionalExpressionChild(reference);
				if (result == null) result = caseAssignmentExpressionChild(reference);
				if (result == null) result = caseExpression(reference);
				if (result == null) result = caseArrayInitializationValue(reference);
				if (result == null) result = caseAnnotationValue(reference);
				if (result == null) result = caseCommentable(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ARGUMENTABLE: {
				Argumentable argumentable = (Argumentable)theEObject;
				T result = caseArgumentable(argumentable);
				if (result == null) result = caseCommentable(argumentable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.REFERENCEABLE_ELEMENT: {
				ReferenceableElement referenceableElement = (ReferenceableElement)theEObject;
				T result = caseReferenceableElement(referenceableElement);
				if (result == null) result = caseNamedElement(referenceableElement);
				if (result == null) result = caseCommentable(referenceableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ELEMENT_REFERENCE: {
				ElementReference elementReference = (ElementReference)theEObject;
				T result = caseElementReference(elementReference);
				if (result == null) result = caseReference(elementReference);
				if (result == null) result = casePrimaryExpression(elementReference);
				if (result == null) result = caseTypeArgumentable(elementReference);
				if (result == null) result = caseUnaryModificationExpressionChild(elementReference);
				if (result == null) result = caseUnaryExpressionChild(elementReference);
				if (result == null) result = caseMultiplicativeExpressionChild(elementReference);
				if (result == null) result = caseAdditiveExpressionChild(elementReference);
				if (result == null) result = caseShiftExpressionChild(elementReference);
				if (result == null) result = caseRelationExpressionChild(elementReference);
				if (result == null) result = caseInstanceOfExpressionChild(elementReference);
				if (result == null) result = caseEqualityExpressionChild(elementReference);
				if (result == null) result = caseAndExpressionChild(elementReference);
				if (result == null) result = caseExclusiveOrExpressionChild(elementReference);
				if (result == null) result = caseInclusiveOrExpressionChild(elementReference);
				if (result == null) result = caseConditionalAndExpressionChild(elementReference);
				if (result == null) result = caseConditionalOrExpressionChild(elementReference);
				if (result == null) result = caseConditionalExpressionChild(elementReference);
				if (result == null) result = caseAssignmentExpressionChild(elementReference);
				if (result == null) result = caseExpression(elementReference);
				if (result == null) result = caseArrayInitializationValue(elementReference);
				if (result == null) result = caseAnnotationValue(elementReference);
				if (result == null) result = caseCommentable(elementReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.IDENTIFIER_REFERENCE: {
				IdentifierReference identifierReference = (IdentifierReference)theEObject;
				T result = caseIdentifierReference(identifierReference);
				if (result == null) result = caseElementReference(identifierReference);
				if (result == null) result = caseReference(identifierReference);
				if (result == null) result = casePrimaryExpression(identifierReference);
				if (result == null) result = caseTypeArgumentable(identifierReference);
				if (result == null) result = caseUnaryModificationExpressionChild(identifierReference);
				if (result == null) result = caseUnaryExpressionChild(identifierReference);
				if (result == null) result = caseMultiplicativeExpressionChild(identifierReference);
				if (result == null) result = caseAdditiveExpressionChild(identifierReference);
				if (result == null) result = caseShiftExpressionChild(identifierReference);
				if (result == null) result = caseRelationExpressionChild(identifierReference);
				if (result == null) result = caseInstanceOfExpressionChild(identifierReference);
				if (result == null) result = caseEqualityExpressionChild(identifierReference);
				if (result == null) result = caseAndExpressionChild(identifierReference);
				if (result == null) result = caseExclusiveOrExpressionChild(identifierReference);
				if (result == null) result = caseInclusiveOrExpressionChild(identifierReference);
				if (result == null) result = caseConditionalAndExpressionChild(identifierReference);
				if (result == null) result = caseConditionalOrExpressionChild(identifierReference);
				if (result == null) result = caseConditionalExpressionChild(identifierReference);
				if (result == null) result = caseAssignmentExpressionChild(identifierReference);
				if (result == null) result = caseExpression(identifierReference);
				if (result == null) result = caseArrayInitializationValue(identifierReference);
				if (result == null) result = caseAnnotationValue(identifierReference);
				if (result == null) result = caseCommentable(identifierReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.METHOD_CALL: {
				MethodCall methodCall = (MethodCall)theEObject;
				T result = caseMethodCall(methodCall);
				if (result == null) result = caseElementReference(methodCall);
				if (result == null) result = caseArgumentable(methodCall);
				if (result == null) result = caseCallTypeArgumentable(methodCall);
				if (result == null) result = caseReference(methodCall);
				if (result == null) result = casePrimaryExpression(methodCall);
				if (result == null) result = caseTypeArgumentable(methodCall);
				if (result == null) result = caseUnaryModificationExpressionChild(methodCall);
				if (result == null) result = caseUnaryExpressionChild(methodCall);
				if (result == null) result = caseMultiplicativeExpressionChild(methodCall);
				if (result == null) result = caseAdditiveExpressionChild(methodCall);
				if (result == null) result = caseShiftExpressionChild(methodCall);
				if (result == null) result = caseRelationExpressionChild(methodCall);
				if (result == null) result = caseInstanceOfExpressionChild(methodCall);
				if (result == null) result = caseEqualityExpressionChild(methodCall);
				if (result == null) result = caseAndExpressionChild(methodCall);
				if (result == null) result = caseExclusiveOrExpressionChild(methodCall);
				if (result == null) result = caseInclusiveOrExpressionChild(methodCall);
				if (result == null) result = caseConditionalAndExpressionChild(methodCall);
				if (result == null) result = caseConditionalOrExpressionChild(methodCall);
				if (result == null) result = caseConditionalExpressionChild(methodCall);
				if (result == null) result = caseAssignmentExpressionChild(methodCall);
				if (result == null) result = caseExpression(methodCall);
				if (result == null) result = caseArrayInitializationValue(methodCall);
				if (result == null) result = caseAnnotationValue(methodCall);
				if (result == null) result = caseCommentable(methodCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.REFLECTIVE_CLASS_REFERENCE: {
				ReflectiveClassReference reflectiveClassReference = (ReflectiveClassReference)theEObject;
				T result = caseReflectiveClassReference(reflectiveClassReference);
				if (result == null) result = caseReference(reflectiveClassReference);
				if (result == null) result = casePrimaryExpression(reflectiveClassReference);
				if (result == null) result = caseTypeArgumentable(reflectiveClassReference);
				if (result == null) result = caseUnaryModificationExpressionChild(reflectiveClassReference);
				if (result == null) result = caseUnaryExpressionChild(reflectiveClassReference);
				if (result == null) result = caseMultiplicativeExpressionChild(reflectiveClassReference);
				if (result == null) result = caseAdditiveExpressionChild(reflectiveClassReference);
				if (result == null) result = caseShiftExpressionChild(reflectiveClassReference);
				if (result == null) result = caseRelationExpressionChild(reflectiveClassReference);
				if (result == null) result = caseInstanceOfExpressionChild(reflectiveClassReference);
				if (result == null) result = caseEqualityExpressionChild(reflectiveClassReference);
				if (result == null) result = caseAndExpressionChild(reflectiveClassReference);
				if (result == null) result = caseExclusiveOrExpressionChild(reflectiveClassReference);
				if (result == null) result = caseInclusiveOrExpressionChild(reflectiveClassReference);
				if (result == null) result = caseConditionalAndExpressionChild(reflectiveClassReference);
				if (result == null) result = caseConditionalOrExpressionChild(reflectiveClassReference);
				if (result == null) result = caseConditionalExpressionChild(reflectiveClassReference);
				if (result == null) result = caseAssignmentExpressionChild(reflectiveClassReference);
				if (result == null) result = caseExpression(reflectiveClassReference);
				if (result == null) result = caseArrayInitializationValue(reflectiveClassReference);
				if (result == null) result = caseAnnotationValue(reflectiveClassReference);
				if (result == null) result = caseCommentable(reflectiveClassReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.PRIMITIVE_TYPE_REFERENCE: {
				PrimitiveTypeReference primitiveTypeReference = (PrimitiveTypeReference)theEObject;
				T result = casePrimitiveTypeReference(primitiveTypeReference);
				if (result == null) result = caseReference(primitiveTypeReference);
				if (result == null) result = casePrimaryExpression(primitiveTypeReference);
				if (result == null) result = caseTypeArgumentable(primitiveTypeReference);
				if (result == null) result = caseUnaryModificationExpressionChild(primitiveTypeReference);
				if (result == null) result = caseUnaryExpressionChild(primitiveTypeReference);
				if (result == null) result = caseMultiplicativeExpressionChild(primitiveTypeReference);
				if (result == null) result = caseAdditiveExpressionChild(primitiveTypeReference);
				if (result == null) result = caseShiftExpressionChild(primitiveTypeReference);
				if (result == null) result = caseRelationExpressionChild(primitiveTypeReference);
				if (result == null) result = caseInstanceOfExpressionChild(primitiveTypeReference);
				if (result == null) result = caseEqualityExpressionChild(primitiveTypeReference);
				if (result == null) result = caseAndExpressionChild(primitiveTypeReference);
				if (result == null) result = caseExclusiveOrExpressionChild(primitiveTypeReference);
				if (result == null) result = caseInclusiveOrExpressionChild(primitiveTypeReference);
				if (result == null) result = caseConditionalAndExpressionChild(primitiveTypeReference);
				if (result == null) result = caseConditionalOrExpressionChild(primitiveTypeReference);
				if (result == null) result = caseConditionalExpressionChild(primitiveTypeReference);
				if (result == null) result = caseAssignmentExpressionChild(primitiveTypeReference);
				if (result == null) result = caseExpression(primitiveTypeReference);
				if (result == null) result = caseArrayInitializationValue(primitiveTypeReference);
				if (result == null) result = caseAnnotationValue(primitiveTypeReference);
				if (result == null) result = caseCommentable(primitiveTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.STRING_REFERENCE: {
				StringReference stringReference = (StringReference)theEObject;
				T result = caseStringReference(stringReference);
				if (result == null) result = caseReference(stringReference);
				if (result == null) result = casePrimaryExpression(stringReference);
				if (result == null) result = caseTypeArgumentable(stringReference);
				if (result == null) result = caseUnaryModificationExpressionChild(stringReference);
				if (result == null) result = caseUnaryExpressionChild(stringReference);
				if (result == null) result = caseMultiplicativeExpressionChild(stringReference);
				if (result == null) result = caseAdditiveExpressionChild(stringReference);
				if (result == null) result = caseShiftExpressionChild(stringReference);
				if (result == null) result = caseRelationExpressionChild(stringReference);
				if (result == null) result = caseInstanceOfExpressionChild(stringReference);
				if (result == null) result = caseEqualityExpressionChild(stringReference);
				if (result == null) result = caseAndExpressionChild(stringReference);
				if (result == null) result = caseExclusiveOrExpressionChild(stringReference);
				if (result == null) result = caseInclusiveOrExpressionChild(stringReference);
				if (result == null) result = caseConditionalAndExpressionChild(stringReference);
				if (result == null) result = caseConditionalOrExpressionChild(stringReference);
				if (result == null) result = caseConditionalExpressionChild(stringReference);
				if (result == null) result = caseAssignmentExpressionChild(stringReference);
				if (result == null) result = caseExpression(stringReference);
				if (result == null) result = caseArrayInitializationValue(stringReference);
				if (result == null) result = caseAnnotationValue(stringReference);
				if (result == null) result = caseCommentable(stringReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.SELF_REFERENCE: {
				SelfReference selfReference = (SelfReference)theEObject;
				T result = caseSelfReference(selfReference);
				if (result == null) result = caseReference(selfReference);
				if (result == null) result = casePrimaryExpression(selfReference);
				if (result == null) result = caseTypeArgumentable(selfReference);
				if (result == null) result = caseUnaryModificationExpressionChild(selfReference);
				if (result == null) result = caseUnaryExpressionChild(selfReference);
				if (result == null) result = caseMultiplicativeExpressionChild(selfReference);
				if (result == null) result = caseAdditiveExpressionChild(selfReference);
				if (result == null) result = caseShiftExpressionChild(selfReference);
				if (result == null) result = caseRelationExpressionChild(selfReference);
				if (result == null) result = caseInstanceOfExpressionChild(selfReference);
				if (result == null) result = caseEqualityExpressionChild(selfReference);
				if (result == null) result = caseAndExpressionChild(selfReference);
				if (result == null) result = caseExclusiveOrExpressionChild(selfReference);
				if (result == null) result = caseInclusiveOrExpressionChild(selfReference);
				if (result == null) result = caseConditionalAndExpressionChild(selfReference);
				if (result == null) result = caseConditionalOrExpressionChild(selfReference);
				if (result == null) result = caseConditionalExpressionChild(selfReference);
				if (result == null) result = caseAssignmentExpressionChild(selfReference);
				if (result == null) result = caseExpression(selfReference);
				if (result == null) result = caseArrayInitializationValue(selfReference);
				if (result == null) result = caseAnnotationValue(selfReference);
				if (result == null) result = caseCommentable(selfReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseVariable(parameter);
				if (result == null) result = caseAnnotableAndModifiable(parameter);
				if (result == null) result = caseTypedElement(parameter);
				if (result == null) result = caseArrayTypeable(parameter);
				if (result == null) result = caseReferenceableElement(parameter);
				if (result == null) result = caseTypeArgumentable(parameter);
				if (result == null) result = caseNamedElement(parameter);
				if (result == null) result = caseCommentable(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.PARAMETRIZABLE: {
				Parametrizable parametrizable = (Parametrizable)theEObject;
				T result = caseParametrizable(parametrizable);
				if (result == null) result = caseCommentable(parametrizable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ORDINARY_PARAMETER: {
				OrdinaryParameter ordinaryParameter = (OrdinaryParameter)theEObject;
				T result = caseOrdinaryParameter(ordinaryParameter);
				if (result == null) result = caseParameter(ordinaryParameter);
				if (result == null) result = caseVariable(ordinaryParameter);
				if (result == null) result = caseAnnotableAndModifiable(ordinaryParameter);
				if (result == null) result = caseTypedElement(ordinaryParameter);
				if (result == null) result = caseArrayTypeable(ordinaryParameter);
				if (result == null) result = caseReferenceableElement(ordinaryParameter);
				if (result == null) result = caseTypeArgumentable(ordinaryParameter);
				if (result == null) result = caseNamedElement(ordinaryParameter);
				if (result == null) result = caseCommentable(ordinaryParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.VARIABLE_LENGTH_PARAMETER: {
				VariableLengthParameter variableLengthParameter = (VariableLengthParameter)theEObject;
				T result = caseVariableLengthParameter(variableLengthParameter);
				if (result == null) result = caseParameter(variableLengthParameter);
				if (result == null) result = caseVariable(variableLengthParameter);
				if (result == null) result = caseAnnotableAndModifiable(variableLengthParameter);
				if (result == null) result = caseTypedElement(variableLengthParameter);
				if (result == null) result = caseArrayTypeable(variableLengthParameter);
				if (result == null) result = caseReferenceableElement(variableLengthParameter);
				if (result == null) result = caseTypeArgumentable(variableLengthParameter);
				if (result == null) result = caseNamedElement(variableLengthParameter);
				if (result == null) result = caseCommentable(variableLengthParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.STATEMENT_CONTAINER: {
				StatementContainer statementContainer = (StatementContainer)theEObject;
				T result = caseStatementContainer(statementContainer);
				if (result == null) result = caseCommentable(statementContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.STATEMENT_LIST_CONTAINER: {
				StatementListContainer statementListContainer = (StatementListContainer)theEObject;
				T result = caseStatementListContainer(statementListContainer);
				if (result == null) result = caseCommentable(statementListContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.CONDITIONAL: {
				Conditional conditional = (Conditional)theEObject;
				T result = caseConditional(conditional);
				if (result == null) result = caseCommentable(conditional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.FOR_LOOP_INITIALIZER: {
				ForLoopInitializer forLoopInitializer = (ForLoopInitializer)theEObject;
				T result = caseForLoopInitializer(forLoopInitializer);
				if (result == null) result = caseCommentable(forLoopInitializer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T result = caseStatement(statement);
				if (result == null) result = caseCommentable(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.SWITCH_CASE: {
				SwitchCase switchCase = (SwitchCase)theEObject;
				T result = caseSwitchCase(switchCase);
				if (result == null) result = caseStatementListContainer(switchCase);
				if (result == null) result = caseCommentable(switchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ASSERT: {
				Assert assert_ = (Assert)theEObject;
				T result = caseAssert(assert_);
				if (result == null) result = caseStatement(assert_);
				if (result == null) result = caseConditional(assert_);
				if (result == null) result = caseCommentable(assert_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.BREAK: {
				Break break_ = (Break)theEObject;
				T result = caseBreak(break_);
				if (result == null) result = caseJump(break_);
				if (result == null) result = caseStatement(break_);
				if (result == null) result = caseCommentable(break_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = caseMember(block);
				if (result == null) result = caseStatement(block);
				if (result == null) result = caseStatementListContainer(block);
				if (result == null) result = caseModifiable(block);
				if (result == null) result = caseNamedElement(block);
				if (result == null) result = caseCommentable(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.CATCH_BLOCK: {
				CatchBlock catchBlock = (CatchBlock)theEObject;
				T result = caseCatchBlock(catchBlock);
				if (result == null) result = caseStatementListContainer(catchBlock);
				if (result == null) result = caseCommentable(catchBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = caseStatement(condition);
				if (result == null) result = caseStatementContainer(condition);
				if (result == null) result = caseConditional(condition);
				if (result == null) result = caseCommentable(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.CONTINUE: {
				Continue continue_ = (Continue)theEObject;
				T result = caseContinue(continue_);
				if (result == null) result = caseJump(continue_);
				if (result == null) result = caseStatement(continue_);
				if (result == null) result = caseCommentable(continue_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.DEFAULT_SWITCH_CASE: {
				DefaultSwitchCase defaultSwitchCase = (DefaultSwitchCase)theEObject;
				T result = caseDefaultSwitchCase(defaultSwitchCase);
				if (result == null) result = caseSwitchCase(defaultSwitchCase);
				if (result == null) result = caseStatementListContainer(defaultSwitchCase);
				if (result == null) result = caseCommentable(defaultSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.DO_WHILE_LOOP: {
				DoWhileLoop doWhileLoop = (DoWhileLoop)theEObject;
				T result = caseDoWhileLoop(doWhileLoop);
				if (result == null) result = caseWhileLoop(doWhileLoop);
				if (result == null) result = caseStatement(doWhileLoop);
				if (result == null) result = caseStatementContainer(doWhileLoop);
				if (result == null) result = caseCommentable(doWhileLoop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.EMPTY_STATEMENT: {
				EmptyStatement emptyStatement = (EmptyStatement)theEObject;
				T result = caseEmptyStatement(emptyStatement);
				if (result == null) result = caseStatement(emptyStatement);
				if (result == null) result = caseCommentable(emptyStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.EXPRESSION_STATEMENT: {
				ExpressionStatement expressionStatement = (ExpressionStatement)theEObject;
				T result = caseExpressionStatement(expressionStatement);
				if (result == null) result = caseStatement(expressionStatement);
				if (result == null) result = caseCommentable(expressionStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.FOR_LOOP: {
				ForLoop forLoop = (ForLoop)theEObject;
				T result = caseForLoop(forLoop);
				if (result == null) result = caseStatement(forLoop);
				if (result == null) result = caseStatementContainer(forLoop);
				if (result == null) result = caseConditional(forLoop);
				if (result == null) result = caseCommentable(forLoop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.FOR_EACH_LOOP: {
				ForEachLoop forEachLoop = (ForEachLoop)theEObject;
				T result = caseForEachLoop(forEachLoop);
				if (result == null) result = caseStatement(forEachLoop);
				if (result == null) result = caseStatementContainer(forEachLoop);
				if (result == null) result = caseCommentable(forEachLoop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.JUMP: {
				Jump jump = (Jump)theEObject;
				T result = caseJump(jump);
				if (result == null) result = caseStatement(jump);
				if (result == null) result = caseCommentable(jump);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.JUMP_LABEL: {
				JumpLabel jumpLabel = (JumpLabel)theEObject;
				T result = caseJumpLabel(jumpLabel);
				if (result == null) result = caseStatement(jumpLabel);
				if (result == null) result = caseStatementContainer(jumpLabel);
				if (result == null) result = caseNamedElement(jumpLabel);
				if (result == null) result = caseCommentable(jumpLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.LOCAL_VARIABLE_STATEMENT: {
				LocalVariableStatement localVariableStatement = (LocalVariableStatement)theEObject;
				T result = caseLocalVariableStatement(localVariableStatement);
				if (result == null) result = caseStatement(localVariableStatement);
				if (result == null) result = caseCommentable(localVariableStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.NORMAL_SWITCH_CASE: {
				NormalSwitchCase normalSwitchCase = (NormalSwitchCase)theEObject;
				T result = caseNormalSwitchCase(normalSwitchCase);
				if (result == null) result = caseSwitchCase(normalSwitchCase);
				if (result == null) result = caseConditional(normalSwitchCase);
				if (result == null) result = caseStatementListContainer(normalSwitchCase);
				if (result == null) result = caseCommentable(normalSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.RETURN: {
				Return return_ = (Return)theEObject;
				T result = caseReturn(return_);
				if (result == null) result = caseStatement(return_);
				if (result == null) result = caseCommentable(return_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.SWITCH: {
				de.silvawb.java.Switch switch_ = (de.silvawb.java.Switch)theEObject;
				T result = caseSwitch(switch_);
				if (result == null) result = caseStatement(switch_);
				if (result == null) result = caseCommentable(switch_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.SYNCHRONIZED_BLOCK: {
				SynchronizedBlock synchronizedBlock = (SynchronizedBlock)theEObject;
				T result = caseSynchronizedBlock(synchronizedBlock);
				if (result == null) result = caseStatement(synchronizedBlock);
				if (result == null) result = caseStatementListContainer(synchronizedBlock);
				if (result == null) result = caseCommentable(synchronizedBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.THROW: {
				Throw throw_ = (Throw)theEObject;
				T result = caseThrow(throw_);
				if (result == null) result = caseStatement(throw_);
				if (result == null) result = caseCommentable(throw_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.TRY_BLOCK: {
				TryBlock tryBlock = (TryBlock)theEObject;
				T result = caseTryBlock(tryBlock);
				if (result == null) result = caseStatement(tryBlock);
				if (result == null) result = caseStatementListContainer(tryBlock);
				if (result == null) result = caseCommentable(tryBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.WHILE_LOOP: {
				WhileLoop whileLoop = (WhileLoop)theEObject;
				T result = caseWhileLoop(whileLoop);
				if (result == null) result = caseStatement(whileLoop);
				if (result == null) result = caseStatementContainer(whileLoop);
				if (result == null) result = caseCommentable(whileLoop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseCommentable(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.TYPED_ELEMENT: {
				TypedElement typedElement = (TypedElement)theEObject;
				T result = caseTypedElement(typedElement);
				if (result == null) result = caseCommentable(typedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.TYPE_REFERENCE: {
				TypeReference typeReference = (TypeReference)theEObject;
				T result = caseTypeReference(typeReference);
				if (result == null) result = caseCommentable(typeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.CLASSIFIER_REFERENCE: {
				ClassifierReference classifierReference = (ClassifierReference)theEObject;
				T result = caseClassifierReference(classifierReference);
				if (result == null) result = caseTypeReference(classifierReference);
				if (result == null) result = caseTypeArgumentable(classifierReference);
				if (result == null) result = caseCommentable(classifierReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.NAMESPACE_CLASSIFIER_REFERENCE: {
				NamespaceClassifierReference namespaceClassifierReference = (NamespaceClassifierReference)theEObject;
				T result = caseNamespaceClassifierReference(namespaceClassifierReference);
				if (result == null) result = caseTypeReference(namespaceClassifierReference);
				if (result == null) result = caseNamespaceAwareElement(namespaceClassifierReference);
				if (result == null) result = caseCommentable(namespaceClassifierReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.PRIMITIVE_TYPE: {
				PrimitiveType primitiveType = (PrimitiveType)theEObject;
				T result = casePrimitiveType(primitiveType);
				if (result == null) result = caseType(primitiveType);
				if (result == null) result = caseTypeReference(primitiveType);
				if (result == null) result = caseCommentable(primitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.BOOLEAN: {
				de.silvawb.java.Boolean boolean_ = (de.silvawb.java.Boolean)theEObject;
				T result = caseBoolean(boolean_);
				if (result == null) result = casePrimitiveType(boolean_);
				if (result == null) result = caseType(boolean_);
				if (result == null) result = caseTypeReference(boolean_);
				if (result == null) result = caseCommentable(boolean_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.BYTE: {
				de.silvawb.java.Byte byte_ = (de.silvawb.java.Byte)theEObject;
				T result = caseByte(byte_);
				if (result == null) result = casePrimitiveType(byte_);
				if (result == null) result = caseType(byte_);
				if (result == null) result = caseTypeReference(byte_);
				if (result == null) result = caseCommentable(byte_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.CHAR: {
				Char char_ = (Char)theEObject;
				T result = caseChar(char_);
				if (result == null) result = casePrimitiveType(char_);
				if (result == null) result = caseType(char_);
				if (result == null) result = caseTypeReference(char_);
				if (result == null) result = caseCommentable(char_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.DOUBLE: {
				de.silvawb.java.Double double_ = (de.silvawb.java.Double)theEObject;
				T result = caseDouble(double_);
				if (result == null) result = casePrimitiveType(double_);
				if (result == null) result = caseType(double_);
				if (result == null) result = caseTypeReference(double_);
				if (result == null) result = caseCommentable(double_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.FLOAT: {
				de.silvawb.java.Float float_ = (de.silvawb.java.Float)theEObject;
				T result = caseFloat(float_);
				if (result == null) result = casePrimitiveType(float_);
				if (result == null) result = caseType(float_);
				if (result == null) result = caseTypeReference(float_);
				if (result == null) result = caseCommentable(float_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.INT: {
				Int int_ = (Int)theEObject;
				T result = caseInt(int_);
				if (result == null) result = casePrimitiveType(int_);
				if (result == null) result = caseType(int_);
				if (result == null) result = caseTypeReference(int_);
				if (result == null) result = caseCommentable(int_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.LONG: {
				de.silvawb.java.Long long_ = (de.silvawb.java.Long)theEObject;
				T result = caseLong(long_);
				if (result == null) result = casePrimitiveType(long_);
				if (result == null) result = caseType(long_);
				if (result == null) result = caseTypeReference(long_);
				if (result == null) result = caseCommentable(long_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.SHORT: {
				de.silvawb.java.Short short_ = (de.silvawb.java.Short)theEObject;
				T result = caseShort(short_);
				if (result == null) result = casePrimitiveType(short_);
				if (result == null) result = caseType(short_);
				if (result == null) result = caseTypeReference(short_);
				if (result == null) result = caseCommentable(short_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.VOID: {
				de.silvawb.java.Void void_ = (de.silvawb.java.Void)theEObject;
				T result = caseVoid(void_);
				if (result == null) result = casePrimitiveType(void_);
				if (result == null) result = caseType(void_);
				if (result == null) result = caseTypeReference(void_);
				if (result == null) result = caseCommentable(void_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.PACKAGE_REFERENCE: {
				PackageReference packageReference = (PackageReference)theEObject;
				T result = casePackageReference(packageReference);
				if (result == null) result = caseReferenceableElement(packageReference);
				if (result == null) result = caseNamedElement(packageReference);
				if (result == null) result = caseCommentable(packageReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseTypedElement(variable);
				if (result == null) result = caseArrayTypeable(variable);
				if (result == null) result = caseReferenceableElement(variable);
				if (result == null) result = caseTypeArgumentable(variable);
				if (result == null) result = caseNamedElement(variable);
				if (result == null) result = caseCommentable(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.LOCAL_VARIABLE: {
				LocalVariable localVariable = (LocalVariable)theEObject;
				T result = caseLocalVariable(localVariable);
				if (result == null) result = caseVariable(localVariable);
				if (result == null) result = caseInitializable(localVariable);
				if (result == null) result = caseForLoopInitializer(localVariable);
				if (result == null) result = caseAnnotableAndModifiable(localVariable);
				if (result == null) result = caseTypedElement(localVariable);
				if (result == null) result = caseArrayTypeable(localVariable);
				if (result == null) result = caseReferenceableElement(localVariable);
				if (result == null) result = caseTypeArgumentable(localVariable);
				if (result == null) result = caseNamedElement(localVariable);
				if (result == null) result = caseCommentable(localVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ADDITIONAL_LOCAL_VARIABLE: {
				AdditionalLocalVariable additionalLocalVariable = (AdditionalLocalVariable)theEObject;
				T result = caseAdditionalLocalVariable(additionalLocalVariable);
				if (result == null) result = caseReferenceableElement(additionalLocalVariable);
				if (result == null) result = caseArrayTypeable(additionalLocalVariable);
				if (result == null) result = caseInitializable(additionalLocalVariable);
				if (result == null) result = caseNamedElement(additionalLocalVariable);
				if (result == null) result = caseCommentable(additionalLocalVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotable(Annotable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationInstance(AnnotationInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationParameter(AnnotationParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Annotation Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Annotation Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleAnnotationParameter(SingleAnnotationParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Parameter List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Parameter List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationParameterList(AnnotationParameterList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Attribute Setting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Attribute Setting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationAttributeSetting(AnnotationAttributeSetting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationValue(AnnotationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationAttribute(AnnotationAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Typeable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Typeable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayTypeable(ArrayTypeable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayDimension(ArrayDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Initializer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayInitializer(ArrayInitializer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Initialization Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Initialization Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayInitializationValue(ArrayInitializationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Instantiation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Instantiation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayInstantiation(ArrayInstantiation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Instantiation By Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Instantiation By Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayInstantiationBySize(ArrayInstantiationBySize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Instantiation By Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Instantiation By Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayInstantiationByValues(ArrayInstantiationByValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Instantiation By Values Untyped</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Instantiation By Values Untyped</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayInstantiationByValuesUntyped(ArrayInstantiationByValuesUntyped object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Instantiation By Values Typed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Instantiation By Values Typed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayInstantiationByValuesTyped(ArrayInstantiationByValuesTyped object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArraySelector(ArraySelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteClassifier(ConcreteClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementor(Implementor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(de.silvawb.java.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousClass(AnonymousClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commentable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commentable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentable(Commentable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace Aware Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace Aware Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespaceAwareElement(NamespaceAwareElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaRoot(JavaRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compilation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compilation Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompilationUnit(CompilationUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(de.silvawb.java.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empty Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empty Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmptyModel(EmptyModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionList(ExpressionList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignmentExpression(AssignmentExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignmentExpressionChild(AssignmentExpressionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalExpression(ConditionalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalExpressionChild(ConditionalExpressionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Or Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Or Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalOrExpression(ConditionalOrExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Or Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Or Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalOrExpressionChild(ConditionalOrExpressionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional And Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional And Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalAndExpression(ConditionalAndExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional And Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional And Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalAndExpressionChild(ConditionalAndExpressionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inclusive Or Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inclusive Or Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInclusiveOrExpression(InclusiveOrExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inclusive Or Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inclusive Or Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInclusiveOrExpressionChild(InclusiveOrExpressionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusive Or Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusive Or Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusiveOrExpression(ExclusiveOrExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusive Or Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusive Or Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusiveOrExpressionChild(ExclusiveOrExpressionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndExpression(AndExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndExpressionChild(AndExpressionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equality Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equality Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqualityExpression(EqualityExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equality Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equality Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqualityExpressionChild(EqualityExpressionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Of Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Of Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceOfExpression(InstanceOfExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Of Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Of Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceOfExpressionChild(InstanceOfExpressionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationExpression(RelationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationExpressionChild(RelationExpressionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shift Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shift Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShiftExpression(ShiftExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shift Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shift Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShiftExpressionChild(ShiftExpressionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additive Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additive Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditiveExpression(AdditiveExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additive Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additive Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditiveExpressionChild(AdditiveExpressionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicative Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicative Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicativeExpression(MultiplicativeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicative Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicative Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicativeExpressionChild(MultiplicativeExpressionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryExpression(UnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryExpressionChild(UnaryExpressionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Modification Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Modification Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryModificationExpression(UnaryModificationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prefix Unary Modification Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prefix Unary Modification Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrefixUnaryModificationExpression(PrefixUnaryModificationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suffix Unary Modification Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suffix Unary Modification Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuffixUnaryModificationExpression(SuffixUnaryModificationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Modification Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Modification Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryModificationExpressionChild(UnaryModificationExpressionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cast Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cast Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCastExpression(CastExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimaryExpression(PrimaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedExpression(NestedExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeArgument(TypeArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Argumentable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Argumentable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeArgumentable(TypeArgumentable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Type Argumentable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Type Argumentable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallTypeArgumentable(CallTypeArgumentable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Parametrizable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Parametrizable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeParametrizable(TypeParametrizable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extends Type Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extends Type Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendsTypeArgument(ExtendsTypeArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualified Type Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualified Type Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifiedTypeArgument(QualifiedTypeArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Type Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Type Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperTypeArgument(SuperTypeArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeParameter(TypeParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown Type Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown Type Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknownTypeArgument(UnknownTypeArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Importing Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Importing Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportingElement(ImportingElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticImport(StaticImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierImport(ClassifierImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageImport(PackageImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Classifier Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Classifier Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticClassifierImport(StaticClassifierImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Member Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Member Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticMemberImport(StaticMemberImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initializable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initializable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitializable(Initializable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instantiation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instantiation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstantiation(Instantiation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Constructor Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Constructor Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewConstructorCall(NewConstructorCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explicit Constructor Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explicit Constructor Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplicitConstructorCall(ExplicitConstructorCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Self</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Self</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelf(Self object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanLiteral(BooleanLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacterLiteral(CharacterLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatLiteral(FloatLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal Float Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal Float Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimalFloatLiteral(DecimalFloatLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hex Float Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hex Float Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHexFloatLiteral(HexFloatLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleLiteral(DoubleLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal Double Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal Double Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimalDoubleLiteral(DecimalDoubleLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hex Double Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hex Double Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHexDoubleLiteral(HexDoubleLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerLiteral(IntegerLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal Integer Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimalIntegerLiteral(DecimalIntegerLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hex Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hex Integer Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHexIntegerLiteral(HexIntegerLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Octal Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Octal Integer Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOctalIntegerLiteral(OctalIntegerLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongLiteral(LongLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal Long Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal Long Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimalLongLiteral(DecimalLongLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hex Long Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hex Long Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHexLongLiteral(HexLongLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Octal Long Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Octal Long Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOctalLongLiteral(OctalLongLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullLiteral(NullLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuper(Super object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>This</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>This</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThis(This object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Thrower</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Thrower</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionThrower(ExceptionThrower object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMember(Member object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemberContainer(MemberContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalField(AdditionalField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructor(Constructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empty Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empty Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmptyMember(EmptyMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethod(Method object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceMethod(InterfaceMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassMethod(ClassMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumConstant(EnumConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifier(Modifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Instance Or Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Instance Or Modifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationInstanceOrModifier(AnnotationInstanceOrModifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotable And Modifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotable And Modifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotableAndModifiable(AnnotableAndModifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifiable(Modifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstract(Abstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinal(Final object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Native</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Native</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNative(Native object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protected</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protected</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtected(Protected object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublic(Public object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Private</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Private</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivate(Private object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatic(Static object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strictfp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strictfp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrictfp(Strictfp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronized</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronized</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronized(Synchronized object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransient(Transient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volatile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volatile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolatile(Volatile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperator(Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additive Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additive Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditiveOperator(AdditiveOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignmentOperator(AssignmentOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equality Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equality Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqualityOperator(EqualityOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicative Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicative Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicativeOperator(MultiplicativeOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationOperator(RelationOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shift Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shift Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShiftOperator(ShiftOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryOperator(UnaryOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Modification Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Modification Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryModificationOperator(UnaryModificationOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignment(Assignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignmentAnd(AssignmentAnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment Division</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment Division</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignmentDivision(AssignmentDivision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment Exclusive Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment Exclusive Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignmentExclusiveOr(AssignmentExclusiveOr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment Minus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment Minus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignmentMinus(AssignmentMinus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment Modulo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment Modulo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignmentModulo(AssignmentModulo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment Multiplication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment Multiplication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignmentMultiplication(AssignmentMultiplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment Left Shift</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment Left Shift</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignmentLeftShift(AssignmentLeftShift object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignmentOr(AssignmentOr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment Plus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment Plus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignmentPlus(AssignmentPlus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment Right Shift</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment Right Shift</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignmentRightShift(AssignmentRightShift object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment Unsigned Right Shift</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment Unsigned Right Shift</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignmentUnsignedRightShift(AssignmentUnsignedRightShift object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqual(Equal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotEqual(NotEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterThan(GreaterThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Than Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Than Or Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterThanOrEqual(GreaterThanOrEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessThan(LessThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Than Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Than Or Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessThanOrEqual(LessThanOrEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddition(Addition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtraction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtraction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtraction(Subtraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Division</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Division</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivision(Division object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplication(Multiplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remainder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remainder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemainder(Remainder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplement(Complement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minus Minus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minus Minus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinusMinus(MinusMinus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegate(Negate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plus Plus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plus Plus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlusPlus(PlusPlus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left Shift</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left Shift</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeftShift(LeftShift object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right Shift</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right Shift</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRightShift(RightShift object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsigned Right Shift</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsigned Right Shift</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsignedRightShift(UnsignedRightShift object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argumentable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argumentable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentable(Argumentable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referenceable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referenceable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceableElement(ReferenceableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementReference(ElementReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifierReference(IdentifierReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodCall(MethodCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reflective Class Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reflective Class Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReflectiveClassReference(ReflectiveClassReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeReference(PrimitiveTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringReference(StringReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Self Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Self Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelfReference(SelfReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parametrizable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parametrizable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametrizable(Parametrizable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordinary Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordinary Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrdinaryParameter(OrdinaryParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Length Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Length Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableLengthParameter(VariableLengthParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatementContainer(StatementContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement List Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement List Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatementListContainer(StatementListContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditional(Conditional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Loop Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Loop Initializer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForLoopInitializer(ForLoopInitializer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchCase(SwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssert(Assert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Break</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Break</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreak(Break object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catch Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catch Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatchBlock(CatchBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinue(Continue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Switch Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Switch Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultSwitchCase(DefaultSwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Do While Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Do While Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoWhileLoop(DoWhileLoop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empty Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empty Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmptyStatement(EmptyStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionStatement(ExpressionStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForLoop(ForLoop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Each Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Each Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForEachLoop(ForEachLoop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jump</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jump</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJump(Jump object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jump Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jump Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJumpLabel(JumpLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Variable Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Variable Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalVariableStatement(LocalVariableStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normal Switch Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normal Switch Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormalSwitchCase(NormalSwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturn(Return object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitch(de.silvawb.java.Switch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronized Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronized Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronizedBlock(SynchronizedBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Throw</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throw</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThrow(Throw object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Try Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Try Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTryBlock(TryBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhileLoop(WhileLoop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeReference(TypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierReference(ClassifierReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace Classifier Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace Classifier Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespaceClassifierReference(NamespaceClassifierReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveType(PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean(de.silvawb.java.Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Byte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Byte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseByte(de.silvawb.java.Byte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChar(Char object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble(de.silvawb.java.Double object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat(de.silvawb.java.Float object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInt(Int object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLong(de.silvawb.java.Long object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Short</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Short</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShort(de.silvawb.java.Short object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Void</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Void</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoid(de.silvawb.java.Void object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageReference(PackageReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalVariable(LocalVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Local Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Local Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalLocalVariable(AdditionalLocalVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //JavaSwitch
