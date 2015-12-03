/**
 */
package de.silvawb.java.expressions.impl;

import de.silvawb.java.arrays.impl.ArrayInitializationValueImpl;

import de.silvawb.java.expressions.Expression;
import de.silvawb.java.expressions.ExpressionsPackage;

import de.silvawb.java.types.Type;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ExpressionImpl extends ArrayInitializationValueImpl implements Expression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return getOneType(false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getAlternativeType() {
		return getOneType(true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getOneType(final boolean alternative) {
		de.silvawb.java.classifiers.Class stringClass = getStringClass();
		
		de.silvawb.java.types.Type type = null;
		
		if (this instanceof de.silvawb.java.references.Reference) {
			de.silvawb.java.references.Reference reference = ( de.silvawb.java.references.Reference) this;
			//navigate down references
			while(reference.getNext() != null) {
				reference = reference.getNext();
			}
			type = reference.getReferencedType();
		}
		else if (this instanceof de.silvawb.java.literals.Literal) {
			type = (( de.silvawb.java.literals.Literal) this).getType();
		}
		else if (this instanceof de.silvawb.java.expressions.CastExpression) {
			type = (( de.silvawb.java.expressions.CastExpression)this).getTypeReference().getTarget();
		}
		else if (this instanceof de.silvawb.java.expressions.AssignmentExpression) {
			type = (( de.silvawb.java.expressions.AssignmentExpression) this).getChild().getOneType(alternative);
		}
		else if (this instanceof de.silvawb.java.expressions.ConditionalExpression &&
				(( de.silvawb.java.expressions.ConditionalExpression)this).getExpressionIf() != null) {
			if (alternative) {
				type = (( de.silvawb.java.expressions.ConditionalExpression)this).getExpressionElse().getOneType(alternative);
			}
			else {
				type = (( de.silvawb.java.expressions.ConditionalExpression)this).getExpressionIf().getOneType(alternative);
			}
			
		}
		else if (this instanceof de.silvawb.java.expressions.EqualityExpression ||
				this instanceof de.silvawb.java.expressions.RelationExpression ||
				this instanceof de.silvawb.java.expressions.ConditionalOrExpression ||
				this instanceof de.silvawb.java.expressions.ConditionalAndExpression ||
				this instanceof de.silvawb.java.expressions.InstanceOfExpression ) {
			type = getLibClass("Boolean");
		}
		else if (this instanceof de.silvawb.java.expressions.AdditiveExpression ||
				this instanceof de.silvawb.java.expressions.MultiplicativeExpression ||
				this instanceof de.silvawb.java.expressions.InclusiveOrExpression ||
				this instanceof de.silvawb.java.expressions.ExclusiveOrExpression ||
				this instanceof de.silvawb.java.expressions.AndExpression ||
				this instanceof de.silvawb.java.expressions.ShiftExpression ) {
			
			if (this instanceof de.silvawb.java.expressions.AdditiveExpression) {
				de.silvawb.java.expressions.AdditiveExpression additiveExpression = ( de.silvawb.java.expressions.AdditiveExpression) this;
				for( de.silvawb.java.expressions.Expression subExp : additiveExpression.getChildren()) {
					if (stringClass.equals(subExp.getOneType(alternative))) {
						//special case: string concatenation
						return stringClass;
					}
				}
			}
			
			@SuppressWarnings("unchecked")
			de.silvawb.java.expressions.Expression subExp = (( org.eclipse.emf.common.util.EList< de.silvawb.java.expressions.Expression>) 
					this.eGet(this.eClass().getEStructuralFeature("children"))).get(0);
			
			return subExp.getOneType(alternative);
		}
		else if (this instanceof de.silvawb.java.expressions.UnaryExpression) {
			de.silvawb.java.expressions.Expression subExp = (( de.silvawb.java.expressions.UnaryExpression)this).getChild();
			
			return subExp.getOneType(alternative);
		}
		else for( org.eclipse.emf.common.util.TreeIterator< org.eclipse.emf.ecore.EObject> i = this.eAllContents(); i.hasNext(); ) {
			org.eclipse.emf.ecore.EObject next = i.next();
			de.silvawb.java.types.Type nextType = null;
		
			if (next instanceof de.silvawb.java.expressions.PrimaryExpression) {
		
				if (next instanceof de.silvawb.java.references.Reference) {
					de.silvawb.java.references.Reference ref = ( de.silvawb.java.references.Reference) next;
					//navigate down references
					while(ref.getNext() != null) {
						ref = ref.getNext();
					}
					next = ref;
				}
				if (next instanceof de.silvawb.java.literals.Literal) {
					nextType = (( de.silvawb.java.literals.Literal) next).getType();
				}
				else if (next instanceof de.silvawb.java.expressions.CastExpression) {
					nextType = (( de.silvawb.java.expressions.CastExpression)next).getTypeReference().getTarget();
				}
				else {
					nextType = (( de.silvawb.java.references.Reference) next).getReferencedType();
				}
				i.prune();
		
			}
			if (nextType != null) {
				type = nextType;
				//in the special case that this is an expression with
				//some string included, everything is converted to string
				if (stringClass.equals(type)) {
					break;
				}
			}
		}
		//type can be null in cases of unresolved/unresolvable proxies
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getArrayDimension() {
		long size = 0;
		de.silvawb.java.arrays.ArrayTypeable arrayType = null;
		if (this instanceof de.silvawb.java.expressions.NestedExpression && 
				(( de.silvawb.java.expressions.NestedExpression)this).getNext() == null) {
			return (( de.silvawb.java.expressions.NestedExpression) this).getExpression().getArrayDimension()
				- (( de.silvawb.java.expressions.NestedExpression)this).getArraySelectors().size();
		}
		if (this instanceof de.silvawb.java.expressions.ConditionalExpression &&
				(( de.silvawb.java.expressions.ConditionalExpression)this).getExpressionIf() != null) {		
			return (( de.silvawb.java.expressions.ConditionalExpression)this).getExpressionIf().getArrayDimension();
		}
		if (this instanceof de.silvawb.java.expressions.AssignmentExpression) {
			de.silvawb.java.expressions.Expression value = (( de.silvawb.java.expressions.AssignmentExpression) this).getValue();
			if (value == null) {
				return 0;
			}
			return value.getArrayDimension();
		}
		if (this instanceof de.silvawb.java.expressions.InstanceOfExpression) {
			return 0;
		}
		if (this instanceof de.silvawb.java.references.Reference) {
			de.silvawb.java.references.Reference reference = ( de.silvawb.java.references.Reference) this;
			while (reference.getNext() != null) {
				reference = reference.getNext();
			}
			//an array clone? -> dimension defined by cloned array
			if (reference instanceof de.silvawb.java.references.ElementReference && 
					reference.getPrevious() != null) {
				de.silvawb.java.references.ReferenceableElement target = (( de.silvawb.java.references.ElementReference)reference).getTarget();
				if (target instanceof de.silvawb.java.members.Method) {
					if("clone".equals((( de.silvawb.java.members.Method)target).getName())) {
						reference = ( de.silvawb.java.references.Reference) reference.eContainer();
					}
				}
			}
			
			if (reference instanceof de.silvawb.java.references.ElementReference) {
				de.silvawb.java.references.ElementReference elementReference = ( de.silvawb.java.references.ElementReference) reference;
				if (elementReference.getTarget() instanceof de.silvawb.java.arrays.ArrayTypeable) {
					arrayType = ( de.silvawb.java.arrays.ArrayTypeable) elementReference.getTarget();
				}
				if (elementReference.getTarget() instanceof de.silvawb.java.variables.AdditionalLocalVariable) {
					de.silvawb.java.variables.AdditionalLocalVariable additionalLocalVariable = ( de.silvawb.java.variables.AdditionalLocalVariable) elementReference.getTarget();
					arrayType = ( de.silvawb.java.variables.LocalVariable) additionalLocalVariable.eContainer();
					size += additionalLocalVariable.getArrayDimensionsAfter().size();
					size -= arrayType.getArrayDimensionsAfter().size();
				}
				if (elementReference.getTarget() instanceof de.silvawb.java.members.AdditionalField) {
					de.silvawb.java.members.AdditionalField additionalField = ( de.silvawb.java.members.AdditionalField) elementReference.getTarget();
					arrayType = ( de.silvawb.java.members.Field) additionalField.eContainer();
					size += additionalField.getArrayDimensionsAfter().size();
					size -= arrayType.getArrayDimensionsAfter().size();
				}
			}
			else if (this instanceof de.silvawb.java.arrays.ArrayTypeable) {
				size += (( de.silvawb.java.arrays.ArrayTypeable)this).getArrayDimensionsBefore().size() + (( de.silvawb.java.arrays.ArrayTypeable)this).getArrayDimensionsAfter().size();
				if (this instanceof de.silvawb.java.parameters.VariableLengthParameter) {
					size++;
				}
			}
			size -= reference.getArraySelectors().size();
		}
		else if (this instanceof de.silvawb.java.arrays.ArrayTypeable) {
			size += (( de.silvawb.java.arrays.ArrayTypeable)this).getArrayDimensionsBefore().size() + (( de.silvawb.java.arrays.ArrayTypeable)this).getArrayDimensionsAfter().size();
			if (this instanceof de.silvawb.java.parameters.VariableLengthParameter) {
				size++;
			}
		}
		
		if(this instanceof de.silvawb.java.arrays.ArrayInstantiationBySize) {
			size += (( de.silvawb.java.arrays.ArrayInstantiationBySize)this).getSizes().size();
		}
		
		if(arrayType != null) {
			size += arrayType.getArrayDimension();
		}
		
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ExpressionsPackage.EXPRESSION___GET_TYPE:
				return getType();
			case ExpressionsPackage.EXPRESSION___GET_ALTERNATIVE_TYPE:
				return getAlternativeType();
			case ExpressionsPackage.EXPRESSION___GET_ONE_TYPE__BOOLEAN:
				return getOneType((Boolean)arguments.get(0));
			case ExpressionsPackage.EXPRESSION___GET_ARRAY_DIMENSION:
				return getArrayDimension();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExpressionImpl
