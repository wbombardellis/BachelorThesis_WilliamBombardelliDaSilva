/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.AdditiveExpressionChild;
import de.silvawb.java.AndExpressionChild;
import de.silvawb.java.ArrayInstantiation;
import de.silvawb.java.ArraySelector;
import de.silvawb.java.AssignmentExpressionChild;
import de.silvawb.java.ConditionalAndExpressionChild;
import de.silvawb.java.ConditionalExpressionChild;
import de.silvawb.java.ConditionalOrExpressionChild;
import de.silvawb.java.EqualityExpressionChild;
import de.silvawb.java.ExclusiveOrExpressionChild;
import de.silvawb.java.InclusiveOrExpressionChild;
import de.silvawb.java.InstanceOfExpressionChild;
import de.silvawb.java.JavaPackage;
import de.silvawb.java.MultiplicativeExpressionChild;
import de.silvawb.java.PrimaryExpression;
import de.silvawb.java.Reference;
import de.silvawb.java.RelationExpressionChild;
import de.silvawb.java.ShiftExpressionChild;
import de.silvawb.java.Type;
import de.silvawb.java.TypeArgument;
import de.silvawb.java.TypeArgumentable;
import de.silvawb.java.UnaryExpressionChild;
import de.silvawb.java.UnaryModificationExpressionChild;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.ArrayInstantiationImpl#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ArrayInstantiationImpl#getNext <em>Next</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ArrayInstantiationImpl#getArraySelectors <em>Array Selectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArrayInstantiationImpl extends ExpressionImpl implements ArrayInstantiation {
	/**
	 * The cached value of the '{@link #getTypeArguments() <em>Type Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeArgument> typeArguments;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected Reference next;

	/**
	 * The cached value of the '{@link #getArraySelectors() <em>Array Selectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArraySelectors()
	 * @generated
	 * @ordered
	 */
	protected EList<ArraySelector> arraySelectors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayInstantiationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getArrayInstantiation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeArgument> getTypeArguments() {
		if (typeArguments == null) {
			typeArguments = new EObjectContainmentEList<TypeArgument>(TypeArgument.class, this, JavaPackage.ARRAY_INSTANTIATION__TYPE_ARGUMENTS);
		}
		return typeArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(Reference newNext, NotificationChain msgs) {
		Reference oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.ARRAY_INSTANTIATION__NEXT, oldNext, newNext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(Reference newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject)next).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.ARRAY_INSTANTIATION__NEXT, null, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.ARRAY_INSTANTIATION__NEXT, null, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.ARRAY_INSTANTIATION__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArraySelector> getArraySelectors() {
		if (arraySelectors == null) {
			arraySelectors = new EObjectContainmentEList<ArraySelector>(ArraySelector.class, this, JavaPackage.ARRAY_INSTANTIATION__ARRAY_SELECTORS);
		}
		return arraySelectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getReferencedType() {
		if (this instanceof de.silvawb.java.Literal) {
			return (( de.silvawb.java.Literal) this).getType();
		}
		
		de.silvawb.java.Type type = null;
		
		//referenced element point to a type
		if (this instanceof de.silvawb.java.TypedElement) {
			de.silvawb.java.TypeReference typeRef = (( de.silvawb.java.TypedElement) this).getTypeReference();
			type = typeRef.getBoundTarget(this);
		}
		//element points to this or super
		else if (this instanceof de.silvawb.java.SelfReference) {
			de.silvawb.java.Type thisClass = null;
			if (this.getPrevious() != null) {
				thisClass = this.getPrevious().getReferencedType();
			}
			else {
				de.silvawb.java.AnonymousClass anonymousContainer = getContainingAnonymousClass();
				if (anonymousContainer != null) {
					thisClass = anonymousContainer;
				}
				else {
					thisClass = getContainingConcreteClassifier();	
				}
			}
			
			//find super class if "self" is "super"
			if ((( de.silvawb.java.SelfReference) this).getSelf() instanceof de.silvawb.java.Super) {
				if (thisClass instanceof de.silvawb.java.Class) {
					return (( de.silvawb.java.Class)thisClass).getSuperClass();
				}
				if (thisClass instanceof de.silvawb.java.AnonymousClass) {
					return (( de.silvawb.java.AnonymousClass)thisClass).getSuperClassifier();
				}
			}
			
			return thisClass;
		}
		//element points to the object's class object
		else if(this instanceof de.silvawb.java.ReflectiveClassReference) {
			return getClassClass();
		}
		//referenced element points to an element with a type
		else if (this instanceof de.silvawb.java.ElementReference) {
			de.silvawb.java.ReferenceableElement target = 
				( de.silvawb.java.ReferenceableElement) (( de.silvawb.java.ElementReference) this).getTarget();
			if (target.eIsProxy()) {
				type = null;
			}
			
			//Navigate through AdditionalLocalVariable or Field
			if(target instanceof de.silvawb.java.AdditionalLocalVariable) {
				target = ( de.silvawb.java.ReferenceableElement) target.eContainer();
			}
			if(target instanceof de.silvawb.java.AdditionalField) {
				target = ( de.silvawb.java.ReferenceableElement) target.eContainer();
			}
			if (target instanceof de.silvawb.java.TypedElement) {
				de.silvawb.java.TypeReference typeRef = (( de.silvawb.java.TypedElement) target).getTypeReference();
				if (typeRef != null) {
					type = typeRef.getBoundTarget(this);
				}
			}
			else if (target instanceof de.silvawb.java.Type /*e.g. Annotation*/ ) {
				return ( de.silvawb.java.Type) target;
			}
			else if(target instanceof de.silvawb.java.EnumConstant) {
				type = ( de.silvawb.java.Enumeration)target.eContainer();
			}	
		}
		//Strings may also appear as reference
		else if (this instanceof de.silvawb.java.StringReference) {
			return getStringClass();
		}
		else if (this instanceof de.silvawb.java.NestedExpression) {
			type = (( de.silvawb.java.NestedExpression) this).getExpression().getType();
		}
		else if (this instanceof de.silvawb.java.PrimitiveTypeReference) {
			type = (( de.silvawb.java.PrimitiveTypeReference)this).getPrimitiveType();
		}
		else {
			assert(false);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPrevious() {
		if (eContainer() instanceof de.silvawb.java.Reference) { 
			 de.silvawb.java.Reference container = ( de.silvawb.java.Reference) eContainer( ) ; 
			  if (this.equals(container.getNext())) {
				 return container;
			 }
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.ARRAY_INSTANTIATION__TYPE_ARGUMENTS:
				return ((InternalEList<?>)getTypeArguments()).basicRemove(otherEnd, msgs);
			case JavaPackage.ARRAY_INSTANTIATION__NEXT:
				return basicSetNext(null, msgs);
			case JavaPackage.ARRAY_INSTANTIATION__ARRAY_SELECTORS:
				return ((InternalEList<?>)getArraySelectors()).basicRemove(otherEnd, msgs);
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
			case JavaPackage.ARRAY_INSTANTIATION__TYPE_ARGUMENTS:
				return getTypeArguments();
			case JavaPackage.ARRAY_INSTANTIATION__NEXT:
				return getNext();
			case JavaPackage.ARRAY_INSTANTIATION__ARRAY_SELECTORS:
				return getArraySelectors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JavaPackage.ARRAY_INSTANTIATION__TYPE_ARGUMENTS:
				getTypeArguments().clear();
				getTypeArguments().addAll((Collection<? extends TypeArgument>)newValue);
				return;
			case JavaPackage.ARRAY_INSTANTIATION__NEXT:
				setNext((Reference)newValue);
				return;
			case JavaPackage.ARRAY_INSTANTIATION__ARRAY_SELECTORS:
				getArraySelectors().clear();
				getArraySelectors().addAll((Collection<? extends ArraySelector>)newValue);
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
			case JavaPackage.ARRAY_INSTANTIATION__TYPE_ARGUMENTS:
				getTypeArguments().clear();
				return;
			case JavaPackage.ARRAY_INSTANTIATION__NEXT:
				setNext((Reference)null);
				return;
			case JavaPackage.ARRAY_INSTANTIATION__ARRAY_SELECTORS:
				getArraySelectors().clear();
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
			case JavaPackage.ARRAY_INSTANTIATION__TYPE_ARGUMENTS:
				return typeArguments != null && !typeArguments.isEmpty();
			case JavaPackage.ARRAY_INSTANTIATION__NEXT:
				return next != null;
			case JavaPackage.ARRAY_INSTANTIATION__ARRAY_SELECTORS:
				return arraySelectors != null && !arraySelectors.isEmpty();
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
		if (baseClass == InstanceOfExpressionChild.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == RelationExpressionChild.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ShiftExpressionChild.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AdditiveExpressionChild.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == MultiplicativeExpressionChild.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UnaryExpressionChild.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UnaryModificationExpressionChild.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PrimaryExpression.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TypeArgumentable.class) {
			switch (derivedFeatureID) {
				case JavaPackage.ARRAY_INSTANTIATION__TYPE_ARGUMENTS: return JavaPackage.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS;
				default: return -1;
			}
		}
		if (baseClass == Reference.class) {
			switch (derivedFeatureID) {
				case JavaPackage.ARRAY_INSTANTIATION__NEXT: return JavaPackage.REFERENCE__NEXT;
				case JavaPackage.ARRAY_INSTANTIATION__ARRAY_SELECTORS: return JavaPackage.REFERENCE__ARRAY_SELECTORS;
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
		if (baseClass == InstanceOfExpressionChild.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == RelationExpressionChild.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ShiftExpressionChild.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AdditiveExpressionChild.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == MultiplicativeExpressionChild.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UnaryExpressionChild.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UnaryModificationExpressionChild.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PrimaryExpression.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TypeArgumentable.class) {
			switch (baseFeatureID) {
				case JavaPackage.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS: return JavaPackage.ARRAY_INSTANTIATION__TYPE_ARGUMENTS;
				default: return -1;
			}
		}
		if (baseClass == Reference.class) {
			switch (baseFeatureID) {
				case JavaPackage.REFERENCE__NEXT: return JavaPackage.ARRAY_INSTANTIATION__NEXT;
				case JavaPackage.REFERENCE__ARRAY_SELECTORS: return JavaPackage.ARRAY_INSTANTIATION__ARRAY_SELECTORS;
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
		if (baseClass == InstanceOfExpressionChild.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == RelationExpressionChild.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == ShiftExpressionChild.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == AdditiveExpressionChild.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == MultiplicativeExpressionChild.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == UnaryExpressionChild.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == UnaryModificationExpressionChild.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == PrimaryExpression.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == TypeArgumentable.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Reference.class) {
			switch (baseOperationID) {
				case JavaPackage.REFERENCE___GET_REFERENCED_TYPE: return JavaPackage.ARRAY_INSTANTIATION___GET_REFERENCED_TYPE;
				case JavaPackage.REFERENCE___GET_PREVIOUS: return JavaPackage.ARRAY_INSTANTIATION___GET_PREVIOUS;
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
			case JavaPackage.ARRAY_INSTANTIATION___GET_REFERENCED_TYPE:
				return getReferencedType();
			case JavaPackage.ARRAY_INSTANTIATION___GET_PREVIOUS:
				return getPrevious();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ArrayInstantiationImpl
