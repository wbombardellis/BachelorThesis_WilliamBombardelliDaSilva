/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.AndExpressionChild;
import de.silvawb.java.AnnotationValue;
import de.silvawb.java.ArrayInitializationValue;
import de.silvawb.java.ArrayTypeable;
import de.silvawb.java.AssignmentExpressionChild;
import de.silvawb.java.ConditionalAndExpressionChild;
import de.silvawb.java.ConditionalExpressionChild;
import de.silvawb.java.ConditionalOrExpressionChild;
import de.silvawb.java.EqualityExpressionChild;
import de.silvawb.java.ExclusiveOrExpressionChild;
import de.silvawb.java.Expression;
import de.silvawb.java.InclusiveOrExpressionChild;
import de.silvawb.java.InstanceOfExpression;
import de.silvawb.java.InstanceOfExpressionChild;
import de.silvawb.java.JavaPackage;
import de.silvawb.java.Type;
import de.silvawb.java.TypeReference;
import de.silvawb.java.TypedElement;

import java.lang.Boolean;

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
 *   <li>{@link de.silvawb.java.impl.InstanceOfExpressionImpl#getTypeReference <em>Type Reference</em>}</li>
 *   <li>{@link de.silvawb.java.impl.InstanceOfExpressionImpl#getChild <em>Child</em>}</li>
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
		return JavaPackage.eINSTANCE.getInstanceOfExpression();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE, oldTypeReference, newTypeReference);
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
				msgs = ((InternalEObject)typeReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE, null, msgs);
			if (newTypeReference != null)
				msgs = ((InternalEObject)newTypeReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE, null, msgs);
			msgs = basicSetTypeReference(newTypeReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE, newTypeReference, newTypeReference));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.INSTANCE_OF_EXPRESSION__CHILD, oldChild, newChild);
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
				msgs = ((InternalEObject)child).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.INSTANCE_OF_EXPRESSION__CHILD, null, msgs);
			if (newChild != null)
				msgs = ((InternalEObject)newChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.INSTANCE_OF_EXPRESSION__CHILD, null, msgs);
			msgs = basicSetChild(newChild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.INSTANCE_OF_EXPRESSION__CHILD, newChild, newChild));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE:
				return basicSetTypeReference(null, msgs);
			case JavaPackage.INSTANCE_OF_EXPRESSION__CHILD:
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
			case JavaPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE:
				return getTypeReference();
			case JavaPackage.INSTANCE_OF_EXPRESSION__CHILD:
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
			case JavaPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE:
				setTypeReference((TypeReference)newValue);
				return;
			case JavaPackage.INSTANCE_OF_EXPRESSION__CHILD:
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
			case JavaPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE:
				setTypeReference((TypeReference)null);
				return;
			case JavaPackage.INSTANCE_OF_EXPRESSION__CHILD:
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
			case JavaPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE:
				return typeReference != null;
			case JavaPackage.INSTANCE_OF_EXPRESSION__CHILD:
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
				case JavaPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE: return JavaPackage.TYPED_ELEMENT__TYPE_REFERENCE;
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
				case JavaPackage.TYPED_ELEMENT__TYPE_REFERENCE: return JavaPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE;
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
				case JavaPackage.ARRAY_TYPEABLE___GET_ARRAY_DIMENSION: return JavaPackage.INSTANCE_OF_EXPRESSION___GET_ARRAY_DIMENSION;
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
				case JavaPackage.EXPRESSION___GET_TYPE: return JavaPackage.INSTANCE_OF_EXPRESSION___GET_TYPE;
				case JavaPackage.EXPRESSION___GET_ALTERNATIVE_TYPE: return JavaPackage.INSTANCE_OF_EXPRESSION___GET_ALTERNATIVE_TYPE;
				case JavaPackage.EXPRESSION___GET_ONE_TYPE__BOOLEAN: return JavaPackage.INSTANCE_OF_EXPRESSION___GET_ONE_TYPE__BOOLEAN;
				case JavaPackage.EXPRESSION___GET_ARRAY_DIMENSION: return JavaPackage.INSTANCE_OF_EXPRESSION___GET_ARRAY_DIMENSION;
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
			case JavaPackage.INSTANCE_OF_EXPRESSION___GET_TYPE:
				return getType();
			case JavaPackage.INSTANCE_OF_EXPRESSION___GET_ALTERNATIVE_TYPE:
				return getAlternativeType();
			case JavaPackage.INSTANCE_OF_EXPRESSION___GET_ONE_TYPE__BOOLEAN:
				return getOneType((Boolean)arguments.get(0));
			case JavaPackage.INSTANCE_OF_EXPRESSION___GET_ARRAY_DIMENSION:
				return getArrayDimension();
		}
		return super.eInvoke(operationID, arguments);
	}

} //InstanceOfExpressionImpl
