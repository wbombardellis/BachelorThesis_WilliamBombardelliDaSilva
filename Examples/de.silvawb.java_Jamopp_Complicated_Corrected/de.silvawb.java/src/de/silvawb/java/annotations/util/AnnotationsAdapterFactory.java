/**
 */
package de.silvawb.java.annotations.util;

import de.silvawb.java.annotations.*;

import de.silvawb.java.arrays.ArrayInitializationValue;
import de.silvawb.java.arrays.ArrayTypeable;

import de.silvawb.java.commons.Commentable;
import de.silvawb.java.commons.NamedElement;
import de.silvawb.java.commons.NamespaceAwareElement;

import de.silvawb.java.expressions.AdditiveExpressionChild;
import de.silvawb.java.expressions.AndExpressionChild;
import de.silvawb.java.expressions.AssignmentExpressionChild;
import de.silvawb.java.expressions.ConditionalAndExpressionChild;
import de.silvawb.java.expressions.ConditionalExpressionChild;
import de.silvawb.java.expressions.ConditionalOrExpressionChild;
import de.silvawb.java.expressions.EqualityExpressionChild;
import de.silvawb.java.expressions.ExclusiveOrExpressionChild;
import de.silvawb.java.expressions.Expression;
import de.silvawb.java.expressions.InclusiveOrExpressionChild;
import de.silvawb.java.expressions.InstanceOfExpressionChild;
import de.silvawb.java.expressions.MultiplicativeExpressionChild;
import de.silvawb.java.expressions.PrimaryExpression;
import de.silvawb.java.expressions.RelationExpressionChild;
import de.silvawb.java.expressions.ShiftExpressionChild;
import de.silvawb.java.expressions.UnaryExpressionChild;
import de.silvawb.java.expressions.UnaryModificationExpressionChild;

import de.silvawb.java.generics.TypeArgumentable;
import de.silvawb.java.generics.TypeParametrizable;

import de.silvawb.java.members.ExceptionThrower;
import de.silvawb.java.members.InterfaceMethod;
import de.silvawb.java.members.Member;
import de.silvawb.java.members.Method;

import de.silvawb.java.modifiers.AnnotableAndModifiable;
import de.silvawb.java.modifiers.AnnotationInstanceOrModifier;

import de.silvawb.java.parameters.Parametrizable;

import de.silvawb.java.references.Reference;
import de.silvawb.java.references.ReferenceableElement;

import de.silvawb.java.types.TypedElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.silvawb.java.annotations.AnnotationsPackage
 * @generated
 */
public class AnnotationsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AnnotationsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AnnotationsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationsSwitch<Adapter> modelSwitch =
		new AnnotationsSwitch<Adapter>() {
			@Override
			public Adapter caseAnnotable(Annotable object) {
				return createAnnotableAdapter();
			}
			@Override
			public Adapter caseAnnotationInstance(AnnotationInstance object) {
				return createAnnotationInstanceAdapter();
			}
			@Override
			public Adapter caseAnnotationParameter(AnnotationParameter object) {
				return createAnnotationParameterAdapter();
			}
			@Override
			public Adapter caseSingleAnnotationParameter(SingleAnnotationParameter object) {
				return createSingleAnnotationParameterAdapter();
			}
			@Override
			public Adapter caseAnnotationParameterList(AnnotationParameterList object) {
				return createAnnotationParameterListAdapter();
			}
			@Override
			public Adapter caseAnnotationAttributeSetting(AnnotationAttributeSetting object) {
				return createAnnotationAttributeSettingAdapter();
			}
			@Override
			public Adapter caseAnnotationValue(AnnotationValue object) {
				return createAnnotationValueAdapter();
			}
			@Override
			public Adapter caseAnnotationAttribute(AnnotationAttribute object) {
				return createAnnotationAttributeAdapter();
			}
			@Override
			public Adapter caseCommentable(Commentable object) {
				return createCommentableAdapter();
			}
			@Override
			public Adapter caseArrayInitializationValue(ArrayInitializationValue object) {
				return createArrayInitializationValueAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseAssignmentExpressionChild(AssignmentExpressionChild object) {
				return createAssignmentExpressionChildAdapter();
			}
			@Override
			public Adapter caseConditionalExpressionChild(ConditionalExpressionChild object) {
				return createConditionalExpressionChildAdapter();
			}
			@Override
			public Adapter caseConditionalOrExpressionChild(ConditionalOrExpressionChild object) {
				return createConditionalOrExpressionChildAdapter();
			}
			@Override
			public Adapter caseConditionalAndExpressionChild(ConditionalAndExpressionChild object) {
				return createConditionalAndExpressionChildAdapter();
			}
			@Override
			public Adapter caseInclusiveOrExpressionChild(InclusiveOrExpressionChild object) {
				return createInclusiveOrExpressionChildAdapter();
			}
			@Override
			public Adapter caseExclusiveOrExpressionChild(ExclusiveOrExpressionChild object) {
				return createExclusiveOrExpressionChildAdapter();
			}
			@Override
			public Adapter caseAndExpressionChild(AndExpressionChild object) {
				return createAndExpressionChildAdapter();
			}
			@Override
			public Adapter caseEqualityExpressionChild(EqualityExpressionChild object) {
				return createEqualityExpressionChildAdapter();
			}
			@Override
			public Adapter caseInstanceOfExpressionChild(InstanceOfExpressionChild object) {
				return createInstanceOfExpressionChildAdapter();
			}
			@Override
			public Adapter caseRelationExpressionChild(RelationExpressionChild object) {
				return createRelationExpressionChildAdapter();
			}
			@Override
			public Adapter caseShiftExpressionChild(ShiftExpressionChild object) {
				return createShiftExpressionChildAdapter();
			}
			@Override
			public Adapter caseAdditiveExpressionChild(AdditiveExpressionChild object) {
				return createAdditiveExpressionChildAdapter();
			}
			@Override
			public Adapter caseMultiplicativeExpressionChild(MultiplicativeExpressionChild object) {
				return createMultiplicativeExpressionChildAdapter();
			}
			@Override
			public Adapter caseUnaryExpressionChild(UnaryExpressionChild object) {
				return createUnaryExpressionChildAdapter();
			}
			@Override
			public Adapter caseUnaryModificationExpressionChild(UnaryModificationExpressionChild object) {
				return createUnaryModificationExpressionChildAdapter();
			}
			@Override
			public Adapter casePrimaryExpression(PrimaryExpression object) {
				return createPrimaryExpressionAdapter();
			}
			@Override
			public Adapter caseTypeArgumentable(TypeArgumentable object) {
				return createTypeArgumentableAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseAnnotationInstanceOrModifier(AnnotationInstanceOrModifier object) {
				return createAnnotationInstanceOrModifierAdapter();
			}
			@Override
			public Adapter caseNamespaceAwareElement(NamespaceAwareElement object) {
				return createNamespaceAwareElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseMember(Member object) {
				return createMemberAdapter();
			}
			@Override
			public Adapter caseTypedElement(TypedElement object) {
				return createTypedElementAdapter();
			}
			@Override
			public Adapter caseArrayTypeable(ArrayTypeable object) {
				return createArrayTypeableAdapter();
			}
			@Override
			public Adapter caseTypeParametrizable(TypeParametrizable object) {
				return createTypeParametrizableAdapter();
			}
			@Override
			public Adapter caseParametrizable(Parametrizable object) {
				return createParametrizableAdapter();
			}
			@Override
			public Adapter caseReferenceableElement(ReferenceableElement object) {
				return createReferenceableElementAdapter();
			}
			@Override
			public Adapter caseExceptionThrower(ExceptionThrower object) {
				return createExceptionThrowerAdapter();
			}
			@Override
			public Adapter caseAnnotableAndModifiable(AnnotableAndModifiable object) {
				return createAnnotableAndModifiableAdapter();
			}
			@Override
			public Adapter caseMethod(Method object) {
				return createMethodAdapter();
			}
			@Override
			public Adapter caseInterfaceMethod(InterfaceMethod object) {
				return createInterfaceMethodAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.annotations.Annotable <em>Annotable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.annotations.Annotable
	 * @generated
	 */
	public Adapter createAnnotableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.annotations.AnnotationInstance <em>Annotation Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.annotations.AnnotationInstance
	 * @generated
	 */
	public Adapter createAnnotationInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.annotations.AnnotationParameter <em>Annotation Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.annotations.AnnotationParameter
	 * @generated
	 */
	public Adapter createAnnotationParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.annotations.SingleAnnotationParameter <em>Single Annotation Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.annotations.SingleAnnotationParameter
	 * @generated
	 */
	public Adapter createSingleAnnotationParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.annotations.AnnotationParameterList <em>Annotation Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.annotations.AnnotationParameterList
	 * @generated
	 */
	public Adapter createAnnotationParameterListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.annotations.AnnotationAttributeSetting <em>Annotation Attribute Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.annotations.AnnotationAttributeSetting
	 * @generated
	 */
	public Adapter createAnnotationAttributeSettingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.annotations.AnnotationValue <em>Annotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.annotations.AnnotationValue
	 * @generated
	 */
	public Adapter createAnnotationValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.annotations.AnnotationAttribute <em>Annotation Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.annotations.AnnotationAttribute
	 * @generated
	 */
	public Adapter createAnnotationAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.commons.Commentable <em>Commentable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.commons.Commentable
	 * @generated
	 */
	public Adapter createCommentableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.arrays.ArrayInitializationValue <em>Array Initialization Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.arrays.ArrayInitializationValue
	 * @generated
	 */
	public Adapter createArrayInitializationValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.expressions.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.expressions.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.expressions.AssignmentExpressionChild <em>Assignment Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.expressions.AssignmentExpressionChild
	 * @generated
	 */
	public Adapter createAssignmentExpressionChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.expressions.ConditionalExpressionChild <em>Conditional Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.expressions.ConditionalExpressionChild
	 * @generated
	 */
	public Adapter createConditionalExpressionChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.expressions.ConditionalOrExpressionChild <em>Conditional Or Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.expressions.ConditionalOrExpressionChild
	 * @generated
	 */
	public Adapter createConditionalOrExpressionChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.expressions.ConditionalAndExpressionChild <em>Conditional And Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.expressions.ConditionalAndExpressionChild
	 * @generated
	 */
	public Adapter createConditionalAndExpressionChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.expressions.InclusiveOrExpressionChild <em>Inclusive Or Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.expressions.InclusiveOrExpressionChild
	 * @generated
	 */
	public Adapter createInclusiveOrExpressionChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.expressions.ExclusiveOrExpressionChild <em>Exclusive Or Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.expressions.ExclusiveOrExpressionChild
	 * @generated
	 */
	public Adapter createExclusiveOrExpressionChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.expressions.AndExpressionChild <em>And Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.expressions.AndExpressionChild
	 * @generated
	 */
	public Adapter createAndExpressionChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.expressions.EqualityExpressionChild <em>Equality Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.expressions.EqualityExpressionChild
	 * @generated
	 */
	public Adapter createEqualityExpressionChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.expressions.InstanceOfExpressionChild <em>Instance Of Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.expressions.InstanceOfExpressionChild
	 * @generated
	 */
	public Adapter createInstanceOfExpressionChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.expressions.RelationExpressionChild <em>Relation Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.expressions.RelationExpressionChild
	 * @generated
	 */
	public Adapter createRelationExpressionChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.expressions.ShiftExpressionChild <em>Shift Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.expressions.ShiftExpressionChild
	 * @generated
	 */
	public Adapter createShiftExpressionChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.expressions.AdditiveExpressionChild <em>Additive Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.expressions.AdditiveExpressionChild
	 * @generated
	 */
	public Adapter createAdditiveExpressionChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.expressions.MultiplicativeExpressionChild <em>Multiplicative Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.expressions.MultiplicativeExpressionChild
	 * @generated
	 */
	public Adapter createMultiplicativeExpressionChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.expressions.UnaryExpressionChild <em>Unary Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.expressions.UnaryExpressionChild
	 * @generated
	 */
	public Adapter createUnaryExpressionChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.expressions.UnaryModificationExpressionChild <em>Unary Modification Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.expressions.UnaryModificationExpressionChild
	 * @generated
	 */
	public Adapter createUnaryModificationExpressionChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.expressions.PrimaryExpression <em>Primary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.expressions.PrimaryExpression
	 * @generated
	 */
	public Adapter createPrimaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.generics.TypeArgumentable <em>Type Argumentable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.generics.TypeArgumentable
	 * @generated
	 */
	public Adapter createTypeArgumentableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.references.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.references.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.modifiers.AnnotationInstanceOrModifier <em>Annotation Instance Or Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.modifiers.AnnotationInstanceOrModifier
	 * @generated
	 */
	public Adapter createAnnotationInstanceOrModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.commons.NamespaceAwareElement <em>Namespace Aware Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.commons.NamespaceAwareElement
	 * @generated
	 */
	public Adapter createNamespaceAwareElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.commons.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.commons.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.members.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.members.Member
	 * @generated
	 */
	public Adapter createMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.types.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.types.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.arrays.ArrayTypeable <em>Array Typeable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.arrays.ArrayTypeable
	 * @generated
	 */
	public Adapter createArrayTypeableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.generics.TypeParametrizable <em>Type Parametrizable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.generics.TypeParametrizable
	 * @generated
	 */
	public Adapter createTypeParametrizableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.parameters.Parametrizable <em>Parametrizable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.parameters.Parametrizable
	 * @generated
	 */
	public Adapter createParametrizableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.references.ReferenceableElement <em>Referenceable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.references.ReferenceableElement
	 * @generated
	 */
	public Adapter createReferenceableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.members.ExceptionThrower <em>Exception Thrower</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.members.ExceptionThrower
	 * @generated
	 */
	public Adapter createExceptionThrowerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.modifiers.AnnotableAndModifiable <em>Annotable And Modifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.modifiers.AnnotableAndModifiable
	 * @generated
	 */
	public Adapter createAnnotableAndModifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.members.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.members.Method
	 * @generated
	 */
	public Adapter createMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.members.InterfaceMethod <em>Interface Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.members.InterfaceMethod
	 * @generated
	 */
	public Adapter createInterfaceMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AnnotationsAdapterFactory
