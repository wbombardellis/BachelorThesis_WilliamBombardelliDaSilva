/**
 */
package de.silvawb.java.instantiations.impl;

import de.silvawb.java.annotations.AnnotationValue;

import de.silvawb.java.arrays.ArrayInitializationValue;
import de.silvawb.java.arrays.ArraySelector;

import de.silvawb.java.classifiers.AnonymousClass;

import de.silvawb.java.expressions.AdditiveExpressionChild;
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
import de.silvawb.java.expressions.InstanceOfExpressionChild;
import de.silvawb.java.expressions.MultiplicativeExpressionChild;
import de.silvawb.java.expressions.PrimaryExpression;
import de.silvawb.java.expressions.RelationExpressionChild;
import de.silvawb.java.expressions.ShiftExpressionChild;
import de.silvawb.java.expressions.UnaryExpressionChild;
import de.silvawb.java.expressions.UnaryModificationExpressionChild;

import de.silvawb.java.generics.CallTypeArgumentable;
import de.silvawb.java.generics.GenericsPackage;
import de.silvawb.java.generics.TypeArgument;
import de.silvawb.java.generics.TypeArgumentable;

import de.silvawb.java.instantiations.Instantiation;
import de.silvawb.java.instantiations.InstantiationsPackage;
import de.silvawb.java.instantiations.NewConstructorCall;

import de.silvawb.java.references.Argumentable;
import de.silvawb.java.references.Reference;
import de.silvawb.java.references.ReferencesPackage;

import de.silvawb.java.types.Type;

import de.silvawb.java.types.impl.TypedElementImpl;

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
 * An implementation of the model object '<em><b>New Constructor Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.instantiations.impl.NewConstructorCallImpl#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link de.silvawb.java.instantiations.impl.NewConstructorCallImpl#getNext <em>Next</em>}</li>
 *   <li>{@link de.silvawb.java.instantiations.impl.NewConstructorCallImpl#getArraySelectors <em>Array Selectors</em>}</li>
 *   <li>{@link de.silvawb.java.instantiations.impl.NewConstructorCallImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link de.silvawb.java.instantiations.impl.NewConstructorCallImpl#getCallTypeArguments <em>Call Type Arguments</em>}</li>
 *   <li>{@link de.silvawb.java.instantiations.impl.NewConstructorCallImpl#getAnonymousClass <em>Anonymous Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NewConstructorCallImpl extends TypedElementImpl implements NewConstructorCall {
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
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> arguments;

	/**
	 * The cached value of the '{@link #getCallTypeArguments() <em>Call Type Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallTypeArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeArgument> callTypeArguments;

	/**
	 * The cached value of the '{@link #getAnonymousClass() <em>Anonymous Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnonymousClass()
	 * @generated
	 * @ordered
	 */
	protected AnonymousClass anonymousClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewConstructorCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstantiationsPackage.Literals.NEW_CONSTRUCTOR_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeArgument> getTypeArguments() {
		if (typeArguments == null) {
			typeArguments = new EObjectContainmentEList<TypeArgument>(TypeArgument.class, this, InstantiationsPackage.NEW_CONSTRUCTOR_CALL__TYPE_ARGUMENTS);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantiationsPackage.NEW_CONSTRUCTOR_CALL__NEXT, oldNext, newNext);
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
				msgs = ((InternalEObject)next).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstantiationsPackage.NEW_CONSTRUCTOR_CALL__NEXT, null, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstantiationsPackage.NEW_CONSTRUCTOR_CALL__NEXT, null, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstantiationsPackage.NEW_CONSTRUCTOR_CALL__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArraySelector> getArraySelectors() {
		if (arraySelectors == null) {
			arraySelectors = new EObjectContainmentEList<ArraySelector>(ArraySelector.class, this, InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARRAY_SELECTORS);
		}
		return arraySelectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<Expression>(Expression.class, this, InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeArgument> getCallTypeArguments() {
		if (callTypeArguments == null) {
			callTypeArguments = new EObjectContainmentEList<TypeArgument>(TypeArgument.class, this, InstantiationsPackage.NEW_CONSTRUCTOR_CALL__CALL_TYPE_ARGUMENTS);
		}
		return callTypeArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousClass getAnonymousClass() {
		return anonymousClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnonymousClass(AnonymousClass newAnonymousClass, NotificationChain msgs) {
		AnonymousClass oldAnonymousClass = anonymousClass;
		anonymousClass = newAnonymousClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ANONYMOUS_CLASS, oldAnonymousClass, newAnonymousClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnonymousClass(AnonymousClass newAnonymousClass) {
		if (newAnonymousClass != anonymousClass) {
			NotificationChain msgs = null;
			if (anonymousClass != null)
				msgs = ((InternalEObject)anonymousClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ANONYMOUS_CLASS, null, msgs);
			if (newAnonymousClass != null)
				msgs = ((InternalEObject)newAnonymousClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ANONYMOUS_CLASS, null, msgs);
			msgs = basicSetAnonymousClass(newAnonymousClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ANONYMOUS_CLASS, newAnonymousClass, newAnonymousClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getArgumentTypes() {
		org.eclipse.emf.common.util.EList< de.silvawb.java.types.Type> resultList = new org.eclipse.emf.common.util.BasicEList< de.silvawb.java.types.Type>();
		
		for( de.silvawb.java.expressions.Expression exp : getArguments()) {
			de.silvawb.java.types.Type type = exp.getType();
			resultList.add(type);
		}
		return resultList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getReferencedType() {
		if (this instanceof de.silvawb.java.literals.Literal) {
			return (( de.silvawb.java.literals.Literal) this).getType();
		}
		
		de.silvawb.java.types.Type type = null;
		
		//referenced element point to a type
		if (this instanceof de.silvawb.java.types.TypedElement) {
			de.silvawb.java.types.TypeReference typeRef = (( de.silvawb.java.types.TypedElement) this).getTypeReference();
			type = typeRef.getBoundTarget(this);
		}
		//element points to this or super
		else if (this instanceof de.silvawb.java.references.SelfReference) {
			de.silvawb.java.types.Type thisClass = null;
			if (this.getPrevious() != null) {
				thisClass = this.getPrevious().getReferencedType();
			}
			else {
				de.silvawb.java.classifiers.AnonymousClass anonymousContainer = getContainingAnonymousClass();
				if (anonymousContainer != null) {
					thisClass = anonymousContainer;
				}
				else {
					thisClass = getContainingConcreteClassifier();	
				}
			}
			
			//find super class if "self" is "super"
			if ((( de.silvawb.java.references.SelfReference) this).getSelf() instanceof de.silvawb.java.literals.Super) {
				if (thisClass instanceof de.silvawb.java.classifiers.Class) {
					return (( de.silvawb.java.classifiers.Class)thisClass).getSuperClass();
				}
				if (thisClass instanceof de.silvawb.java.classifiers.AnonymousClass) {
					return (( de.silvawb.java.classifiers.AnonymousClass)thisClass).getSuperClassifier();
				}
			}
			
			return thisClass;
		}
		//element points to the object's class object
		else if(this instanceof de.silvawb.java.references.ReflectiveClassReference) {
			return getClassClass();
		}
		//referenced element points to an element with a type
		else if (this instanceof de.silvawb.java.references.ElementReference) {
			de.silvawb.java.references.ReferenceableElement target = 
				( de.silvawb.java.references.ReferenceableElement) (( de.silvawb.java.references.ElementReference) this).getTarget();
			if (target.eIsProxy()) {
				type = null;
			}
			
			//Navigate through AdditionalLocalVariable or Field
			if(target instanceof de.silvawb.java.variables.AdditionalLocalVariable) {
				target = ( de.silvawb.java.references.ReferenceableElement) target.eContainer();
			}
			if(target instanceof de.silvawb.java.members.AdditionalField) {
				target = ( de.silvawb.java.references.ReferenceableElement) target.eContainer();
			}
			if (target instanceof de.silvawb.java.types.TypedElement) {
				de.silvawb.java.types.TypeReference typeRef = (( de.silvawb.java.types.TypedElement) target).getTypeReference();
				if (typeRef != null) {
					type = typeRef.getBoundTarget(this);
				}
			}
			else if (target instanceof de.silvawb.java.types.Type /*e.g. Annotation*/ ) {
				return ( de.silvawb.java.types.Type) target;
			}
			else if(target instanceof de.silvawb.java.members.EnumConstant) {
				type = ( de.silvawb.java.classifiers.Enumeration)target.eContainer();
			}	
		}
		//Strings may also appear as reference
		else if (this instanceof de.silvawb.java.references.StringReference) {
			return getStringClass();
		}
		else if (this instanceof de.silvawb.java.expressions.NestedExpression) {
			type = (( de.silvawb.java.expressions.NestedExpression) this).getExpression().getType();
		}
		else if (this instanceof de.silvawb.java.references.PrimitiveTypeReference) {
			type = (( de.silvawb.java.references.PrimitiveTypeReference)this).getPrimitiveType();
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
		if (eContainer() instanceof de.silvawb.java.references.Reference) { 
			 de.silvawb.java.references.Reference container = ( de.silvawb.java.references.Reference) eContainer( ) ; 
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
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__TYPE_ARGUMENTS:
				return ((InternalEList<?>)getTypeArguments()).basicRemove(otherEnd, msgs);
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__NEXT:
				return basicSetNext(null, msgs);
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARRAY_SELECTORS:
				return ((InternalEList<?>)getArraySelectors()).basicRemove(otherEnd, msgs);
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__CALL_TYPE_ARGUMENTS:
				return ((InternalEList<?>)getCallTypeArguments()).basicRemove(otherEnd, msgs);
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ANONYMOUS_CLASS:
				return basicSetAnonymousClass(null, msgs);
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
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__TYPE_ARGUMENTS:
				return getTypeArguments();
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__NEXT:
				return getNext();
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARRAY_SELECTORS:
				return getArraySelectors();
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARGUMENTS:
				return getArguments();
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__CALL_TYPE_ARGUMENTS:
				return getCallTypeArguments();
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ANONYMOUS_CLASS:
				return getAnonymousClass();
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
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__TYPE_ARGUMENTS:
				getTypeArguments().clear();
				getTypeArguments().addAll((Collection<? extends TypeArgument>)newValue);
				return;
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__NEXT:
				setNext((Reference)newValue);
				return;
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARRAY_SELECTORS:
				getArraySelectors().clear();
				getArraySelectors().addAll((Collection<? extends ArraySelector>)newValue);
				return;
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Expression>)newValue);
				return;
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__CALL_TYPE_ARGUMENTS:
				getCallTypeArguments().clear();
				getCallTypeArguments().addAll((Collection<? extends TypeArgument>)newValue);
				return;
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ANONYMOUS_CLASS:
				setAnonymousClass((AnonymousClass)newValue);
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
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__TYPE_ARGUMENTS:
				getTypeArguments().clear();
				return;
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__NEXT:
				setNext((Reference)null);
				return;
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARRAY_SELECTORS:
				getArraySelectors().clear();
				return;
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARGUMENTS:
				getArguments().clear();
				return;
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__CALL_TYPE_ARGUMENTS:
				getCallTypeArguments().clear();
				return;
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ANONYMOUS_CLASS:
				setAnonymousClass((AnonymousClass)null);
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
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__TYPE_ARGUMENTS:
				return typeArguments != null && !typeArguments.isEmpty();
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__NEXT:
				return next != null;
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARRAY_SELECTORS:
				return arraySelectors != null && !arraySelectors.isEmpty();
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__CALL_TYPE_ARGUMENTS:
				return callTypeArguments != null && !callTypeArguments.isEmpty();
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ANONYMOUS_CLASS:
				return anonymousClass != null;
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
				case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__TYPE_ARGUMENTS: return GenericsPackage.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS;
				default: return -1;
			}
		}
		if (baseClass == Reference.class) {
			switch (derivedFeatureID) {
				case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__NEXT: return ReferencesPackage.REFERENCE__NEXT;
				case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARRAY_SELECTORS: return ReferencesPackage.REFERENCE__ARRAY_SELECTORS;
				default: return -1;
			}
		}
		if (baseClass == Argumentable.class) {
			switch (derivedFeatureID) {
				case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARGUMENTS: return ReferencesPackage.ARGUMENTABLE__ARGUMENTS;
				default: return -1;
			}
		}
		if (baseClass == Instantiation.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CallTypeArgumentable.class) {
			switch (derivedFeatureID) {
				case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__CALL_TYPE_ARGUMENTS: return GenericsPackage.CALL_TYPE_ARGUMENTABLE__CALL_TYPE_ARGUMENTS;
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
				case GenericsPackage.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS: return InstantiationsPackage.NEW_CONSTRUCTOR_CALL__TYPE_ARGUMENTS;
				default: return -1;
			}
		}
		if (baseClass == Reference.class) {
			switch (baseFeatureID) {
				case ReferencesPackage.REFERENCE__NEXT: return InstantiationsPackage.NEW_CONSTRUCTOR_CALL__NEXT;
				case ReferencesPackage.REFERENCE__ARRAY_SELECTORS: return InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARRAY_SELECTORS;
				default: return -1;
			}
		}
		if (baseClass == Argumentable.class) {
			switch (baseFeatureID) {
				case ReferencesPackage.ARGUMENTABLE__ARGUMENTS: return InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARGUMENTS;
				default: return -1;
			}
		}
		if (baseClass == Instantiation.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CallTypeArgumentable.class) {
			switch (baseFeatureID) {
				case GenericsPackage.CALL_TYPE_ARGUMENTABLE__CALL_TYPE_ARGUMENTS: return InstantiationsPackage.NEW_CONSTRUCTOR_CALL__CALL_TYPE_ARGUMENTS;
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
				case ExpressionsPackage.EXPRESSION___GET_TYPE: return InstantiationsPackage.NEW_CONSTRUCTOR_CALL___GET_TYPE;
				case ExpressionsPackage.EXPRESSION___GET_ALTERNATIVE_TYPE: return InstantiationsPackage.NEW_CONSTRUCTOR_CALL___GET_ALTERNATIVE_TYPE;
				case ExpressionsPackage.EXPRESSION___GET_ONE_TYPE__BOOLEAN: return InstantiationsPackage.NEW_CONSTRUCTOR_CALL___GET_ONE_TYPE__BOOLEAN;
				case ExpressionsPackage.EXPRESSION___GET_ARRAY_DIMENSION: return InstantiationsPackage.NEW_CONSTRUCTOR_CALL___GET_ARRAY_DIMENSION;
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
				case ReferencesPackage.REFERENCE___GET_REFERENCED_TYPE: return InstantiationsPackage.NEW_CONSTRUCTOR_CALL___GET_REFERENCED_TYPE;
				case ReferencesPackage.REFERENCE___GET_PREVIOUS: return InstantiationsPackage.NEW_CONSTRUCTOR_CALL___GET_PREVIOUS;
				default: return -1;
			}
		}
		if (baseClass == Argumentable.class) {
			switch (baseOperationID) {
				case ReferencesPackage.ARGUMENTABLE___GET_ARGUMENT_TYPES: return InstantiationsPackage.NEW_CONSTRUCTOR_CALL___GET_ARGUMENT_TYPES;
				default: return -1;
			}
		}
		if (baseClass == Instantiation.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == CallTypeArgumentable.class) {
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
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL___GET_ARGUMENT_TYPES:
				return getArgumentTypes();
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL___GET_REFERENCED_TYPE:
				return getReferencedType();
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL___GET_PREVIOUS:
				return getPrevious();
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL___GET_TYPE:
				return getType();
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL___GET_ALTERNATIVE_TYPE:
				return getAlternativeType();
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL___GET_ONE_TYPE__BOOLEAN:
				return getOneType((Boolean)arguments.get(0));
			case InstantiationsPackage.NEW_CONSTRUCTOR_CALL___GET_ARRAY_DIMENSION:
				return getArrayDimension();
		}
		return super.eInvoke(operationID, arguments);
	}

} //NewConstructorCallImpl
