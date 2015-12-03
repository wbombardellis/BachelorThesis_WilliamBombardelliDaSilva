/**
 */
package de.silvawb.java.expressions.impl;

import de.silvawb.java.annotations.AnnotationValue;

import de.silvawb.java.arrays.ArrayInitializationValue;
import de.silvawb.java.arrays.ArrayTypeable;
import de.silvawb.java.arrays.ArraysPackage;

import de.silvawb.java.arrays.impl.ArrayTypeableImpl;

import de.silvawb.java.expressions.AndExpressionChild;
import de.silvawb.java.expressions.AssignmentExpressionChild;
import de.silvawb.java.expressions.ConditionalAndExpressionChild;
import de.silvawb.java.expressions.ConditionalExpressionChild;
import de.silvawb.java.expressions.ConditionalOrExpressionChild;
import de.silvawb.java.expressions.EqualityExpressionChild;
import de.silvawb.java.expressions.ExclusiveOrExpressionChild;
import de.silvawb.java.expressions.Expression;
import de.silvawb.java.expressions.ExpressionsPackage;
import de.silvawb.java.expressions.InclusiveOrExpressionChild;
import de.silvawb.java.expressions.InstanceOfExpression;
import de.silvawb.java.expressions.InstanceOfExpressionChild;

import de.silvawb.java.types.Type;
import de.silvawb.java.types.TypeReference;
import de.silvawb.java.types.TypedElement;
import de.silvawb.java.types.TypesPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Of Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.expressions.impl.InstanceOfExpressionImpl#getTypeReference <em>Type Reference</em>}</li>
 *   <li>{@link de.silvawb.java.expressions.impl.InstanceOfExpressionImpl#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceOfExpressionImpl extends ArrayTypeableImpl implements InstanceOfExpression {
	/**
	 * The cached value of the '{@link #getTypeReference() <em>Type Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeReference()
	 * @generated
	 * @ordered
	 */
	protected TypeReference typeReference;

	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected InstanceOfExpressionChild child;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceOfExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.INSTANCE_OF_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getTypeReference() {
		return typeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeReference(TypeReference newTypeReference, NotificationChain msgs) {
		TypeReference oldTypeReference = typeReference;
		typeReference = newTypeReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE, oldTypeReference, newTypeReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeReference(TypeReference newTypeReference) {
		if (newTypeReference != typeReference) {
			NotificationChain msgs = null;
			if (typeReference != null)
				msgs = ((InternalEObject)typeReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE, null, msgs);
			if (newTypeReference != null)
				msgs = ((InternalEObject)newTypeReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE, null, msgs);
			msgs = basicSetTypeReference(newTypeReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE, newTypeReference, newTypeReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceOfExpressionChild getChild() {
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChild(InstanceOfExpressionChild newChild, NotificationChain msgs) {
		InstanceOfExpressionChild oldChild = child;
		child = newChild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.INSTANCE_OF_EXPRESSION__CHILD, oldChild, newChild);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChild(InstanceOfExpressionChild newChild) {
		if (newChild != child) {
			NotificationChain msgs = null;
			if (child != null)
				msgs = ((InternalEObject)child).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.INSTANCE_OF_EXPRESSION__CHILD, null, msgs);
			if (newChild != null)
				msgs = ((InternalEObject)newChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.INSTANCE_OF_EXPRESSION__CHILD, null, msgs);
			msgs = basicSetChild(newChild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.INSTANCE_OF_EXPRESSION__CHILD, newChild, newChild));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE:
				return basicSetTypeReference(null, msgs);
			case ExpressionsPackage.INSTANCE_OF_EXPRESSION__CHILD:
				return basicSetChild(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE:
				return getTypeReference();
			case ExpressionsPackage.INSTANCE_OF_EXPRESSION__CHILD:
				return getChild();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE:
				setTypeReference((TypeReference)newValue);
				return;
			case ExpressionsPackage.INSTANCE_OF_EXPRESSION__CHILD:
				setChild((InstanceOfExpressionChild)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE:
				setTypeReference((TypeReference)null);
				return;
			case ExpressionsPackage.INSTANCE_OF_EXPRESSION__CHILD:
				setChild((InstanceOfExpressionChild)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE:
				return typeReference != null;
			case ExpressionsPackage.INSTANCE_OF_EXPRESSION__CHILD:
				return child != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE: return TypesPackage.TYPED_ELEMENT__TYPE_REFERENCE;
				default: return -1;
			}
		}
		if (baseClass == ArrayInitializationValue.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AnnotationValue.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Expression.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AssignmentExpressionChild.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ConditionalExpressionChild.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ConditionalOrExpressionChild.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ConditionalAndExpressionChild.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == InclusiveOrExpressionChild.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ExclusiveOrExpressionChild.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AndExpressionChild.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == EqualityExpressionChild.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case TypesPackage.TYPED_ELEMENT__TYPE_REFERENCE: return ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE;
				default: return -1;
			}
		}
		if (baseClass == ArrayInitializationValue.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AnnotationValue.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Expression.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AssignmentExpressionChild.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ConditionalExpressionChild.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ConditionalOrExpressionChild.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ConditionalAndExpressionChild.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == InclusiveOrExpressionChild.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ExclusiveOrExpressionChild.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AndExpressionChild.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == EqualityExpressionChild.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ArrayTypeable.class) {
			switch (baseOperationID) {
				case ArraysPackage.ARRAY_TYPEABLE___GET_ARRAY_DIMENSION: return ExpressionsPackage.INSTANCE_OF_EXPRESSION___GET_ARRAY_DIMENSION;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == TypedElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == ArrayInitializationValue.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == AnnotationValue.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Expression.class) {
			switch (baseOperationID) {
				case ExpressionsPackage.EXPRESSION___GET_TYPE: return ExpressionsPackage.INSTANCE_OF_EXPRESSION___GET_TYPE;
				case ExpressionsPackage.EXPRESSION___GET_ALTERNATIVE_TYPE: return ExpressionsPackage.INSTANCE_OF_EXPRESSION___GET_ALTERNATIVE_TYPE;
				case ExpressionsPackage.EXPRESSION___GET_ONE_TYPE__BOOLEAN: return ExpressionsPackage.INSTANCE_OF_EXPRESSION___GET_ONE_TYPE__BOOLEAN;
				case ExpressionsPackage.EXPRESSION___GET_ARRAY_DIMENSION: return ExpressionsPackage.INSTANCE_OF_EXPRESSION___GET_ARRAY_DIMENSION;
				default: return -1;
			}
		}
		if (baseClass == AssignmentExpressionChild.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == ConditionalExpressionChild.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == ConditionalOrExpressionChild.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == ConditionalAndExpressionChild.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == InclusiveOrExpressionChild.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == ExclusiveOrExpressionChild.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == AndExpressionChild.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == EqualityExpressionChild.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ExpressionsPackage.INSTANCE_OF_EXPRESSION___GET_TYPE:
				return getType();
			case ExpressionsPackage.INSTANCE_OF_EXPRESSION___GET_ALTERNATIVE_TYPE:
				return getAlternativeType();
			case ExpressionsPackage.INSTANCE_OF_EXPRESSION___GET_ONE_TYPE__BOOLEAN:
				return getOneType((Boolean)arguments.get(0));
			case ExpressionsPackage.INSTANCE_OF_EXPRESSION___GET_ARRAY_DIMENSION:
				return getArrayDimension();
		}
		return super.eInvoke(operationID, arguments);
	}

} //InstanceOfExpressionImpl