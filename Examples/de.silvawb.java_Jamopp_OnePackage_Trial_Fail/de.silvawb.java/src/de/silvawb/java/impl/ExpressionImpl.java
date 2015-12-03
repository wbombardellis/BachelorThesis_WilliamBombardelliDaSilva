/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.Expression;
import de.silvawb.java.JavaPackage;
import de.silvawb.java.Type;

import java.lang.Boolean;

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
		return JavaPackage.eINSTANCE.getExpression();
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
		de.silvawb.java.Class stringClass = getStringClass();
		
		de.silvawb.java.Type type = null;
		
		if (this instanceof de.silvawb.java.Reference) {
			de.silvawb.java.Reference reference = ( de.silvawb.java.Reference) this;
			//navigate down references
			while(reference.getNext() != null) {
				reference = reference.getNext();
			}
			type = reference.getReferencedType();
		}
		else if (this instanceof de.silvawb.java.Literal) {
			type = (( de.silvawb.java.Literal) this).getType();
		}
		else if (this instanceof de.silvawb.java.CastExpression) {
			type = (( de.silvawb.java.CastExpression)this).getTypeReference().getTarget();
		}
		else if (this instanceof de.silvawb.java.AssignmentExpression) {
			type = (( de.silvawb.java.AssignmentExpression) this).getChild().getOneType(alternative);
		}
		else if (this instanceof de.silvawb.java.ConditionalExpression &&
				(( de.silvawb.java.ConditionalExpression)this).getExpressionIf() != null) {
			if (alternative) {
				type = (( de.silvawb.java.ConditionalExpression)this).getExpressionElse().getOneType(alternative);
			}
			else {
				type = (( de.silvawb.java.ConditionalExpression)this).getExpressionIf().getOneType(alternative);
			}
			
		}
		else if (this instanceof de.silvawb.java.EqualityExpression ||
				this instanceof de.silvawb.java.RelationExpression ||
				this instanceof de.silvawb.java.ConditionalOrExpression ||
				this instanceof de.silvawb.java.ConditionalAndExpression ||
				this instanceof de.silvawb.java.InstanceOfExpression ) {
			type = getLibClass("Boolean");
		}
		else if (this instanceof de.silvawb.java.AdditiveExpression ||
				this instanceof de.silvawb.java.MultiplicativeExpression ||
				this instanceof de.silvawb.java.InclusiveOrExpression ||
				this instanceof de.silvawb.java.ExclusiveOrExpression ||
				this instanceof de.silvawb.java.AndExpression ||
				this instanceof de.silvawb.java.ShiftExpression ) {
			
			if (this instanceof de.silvawb.java.AdditiveExpression) {
				de.silvawb.java.AdditiveExpression additiveExpression = ( de.silvawb.java.AdditiveExpression) this;
				for( de.silvawb.java.Expression subExp : additiveExpression.getChildren()) {
					if (stringClass.equals(subExp.getOneType(alternative))) {
						//special case: string concatenation
						return stringClass;
					}
				}
			}
			
			@SuppressWarnings("unchecked")
			de.silvawb.java.Expression subExp = (( org.eclipse.emf.common.util.EList< de.silvawb.java.Expression>) 
					this.eGet(this.eClass().getEStructuralFeature("children"))).get(0);
			
			return subExp.getOneType(alternative);
		}
		else if (this instanceof de.silvawb.java.UnaryExpression) {
			de.silvawb.java.Expression subExp = (( de.silvawb.java.UnaryExpression)this).getChild();
			
			return subExp.getOneType(alternative);
		}
		else for( org.eclipse.emf.common.util.TreeIterator< org.eclipse.emf.ecore.EObject> i = this.eAllContents(); i.hasNext(); ) {
			org.eclipse.emf.ecore.EObject next = i.next();
			de.silvawb.java.Type nextType = null;
		
			if (next instanceof de.silvawb.java.PrimaryExpression) {
		
				if (next instanceof de.silvawb.java.Reference) {
					de.silvawb.java.Reference ref = ( de.silvawb.java.Reference) next;
					//navigate down references
					while(ref.getNext() != null) {
						ref = ref.getNext();
					}
					next = ref;
				}
				if (next instanceof de.silvawb.java.Literal) {
					nextType = (( de.silvawb.java.Literal) next).getType();
				}
				else if (next instanceof de.silvawb.java.CastExpression) {
					nextType = (( de.silvawb.java.CastExpression)next).getTypeReference().getTarget();
				}
				else {
					nextType = (( de.silvawb.java.Reference) next).getReferencedType();
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
		de.silvawb.java.ArrayTypeable arrayType = null;
		if (this instanceof de.silvawb.java.NestedExpression && 
				(( de.silvawb.java.NestedExpression)this).getNext() == null) {
			return (( de.silvawb.java.NestedExpression) this).getExpression().getArrayDimension()
				- (( de.silvawb.java.NestedExpression)this).getArraySelectors().size();
		}
		if (this instanceof de.silvawb.java.ConditionalExpression &&
				(( de.silvawb.java.ConditionalExpression)this).getExpressionIf() != null) {		
			return (( de.silvawb.java.ConditionalExpression)this).getExpressionIf().getArrayDimension();
		}
		if (this instanceof de.silvawb.java.AssignmentExpression) {
			de.silvawb.java.Expression value = (( de.silvawb.java.AssignmentExpression) this).getValue();
			if (value == null) {
				return 0;
			}
			return value.getArrayDimension();
		}
		if (this instanceof de.silvawb.java.InstanceOfExpression) {
			return 0;
		}
		if (this instanceof de.silvawb.java.Reference) {
			de.silvawb.java.Reference reference = ( de.silvawb.java.Reference) this;
			while (reference.getNext() != null) {
				reference = reference.getNext();
			}
			//an array clone? -> dimension defined by cloned array
			if (reference instanceof de.silvawb.java.ElementReference && 
					reference.getPrevious() != null) {
				de.silvawb.java.ReferenceableElement target = (( de.silvawb.java.ElementReference)reference).getTarget();
				if (target instanceof de.silvawb.java.Method) {
					if("clone".equals((( de.silvawb.java.Method)target).getName())) {
						reference = ( de.silvawb.java.Reference) reference.eContainer();
					}
				}
			}
			
			if (reference instanceof de.silvawb.java.ElementReference) {
				de.silvawb.java.ElementReference elementReference = ( de.silvawb.java.ElementReference) reference;
				if (elementReference.getTarget() instanceof de.silvawb.java.ArrayTypeable) {
					arrayType = ( de.silvawb.java.ArrayTypeable) elementReference.getTarget();
				}
				if (elementReference.getTarget() instanceof de.silvawb.java.AdditionalLocalVariable) {
					de.silvawb.java.AdditionalLocalVariable additionalLocalVariable = ( de.silvawb.java.AdditionalLocalVariable) elementReference.getTarget();
					arrayType = ( de.silvawb.java.LocalVariable) additionalLocalVariable.eContainer();
					size += additionalLocalVariable.getArrayDimensionsAfter().size();
					size -= arrayType.getArrayDimensionsAfter().size();
				}
				if (elementReference.getTarget() instanceof de.silvawb.java.AdditionalField) {
					de.silvawb.java.AdditionalField additionalField = ( de.silvawb.java.AdditionalField) elementReference.getTarget();
					arrayType = ( de.silvawb.java.Field) additionalField.eContainer();
					size += additionalField.getArrayDimensionsAfter().size();
					size -= arrayType.getArrayDimensionsAfter().size();
				}
			}
			else if (this instanceof de.silvawb.java.ArrayTypeable) {
				size += (( de.silvawb.java.ArrayTypeable)this).getArrayDimensionsBefore().size() + (( de.silvawb.java.ArrayTypeable)this).getArrayDimensionsAfter().size();
				if (this instanceof de.silvawb.java.VariableLengthParameter) {
					size++;
				}
			}
			size -= reference.getArraySelectors().size();
		}
		else if (this instanceof de.silvawb.java.ArrayTypeable) {
			size += (( de.silvawb.java.ArrayTypeable)this).getArrayDimensionsBefore().size() + (( de.silvawb.java.ArrayTypeable)this).getArrayDimensionsAfter().size();
			if (this instanceof de.silvawb.java.VariableLengthParameter) {
				size++;
			}
		}
		
		if(this instanceof de.silvawb.java.ArrayInstantiationBySize) {
			size += (( de.silvawb.java.ArrayInstantiationBySize)this).getSizes().size();
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
			case JavaPackage.EXPRESSION___GET_TYPE:
				return getType();
			case JavaPackage.EXPRESSION___GET_ALTERNATIVE_TYPE:
				return getAlternativeType();
			case JavaPackage.EXPRESSION___GET_ONE_TYPE__BOOLEAN:
				return getOneType((Boolean)arguments.get(0));
			case JavaPackage.EXPRESSION___GET_ARRAY_DIMENSION:
				return getArrayDimension();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExpressionImpl
