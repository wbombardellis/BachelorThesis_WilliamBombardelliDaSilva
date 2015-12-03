/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.AnnotableAndModifiable;
import de.silvawb.java.AnnotationInstanceOrModifier;
import de.silvawb.java.ArrayDimension;
import de.silvawb.java.ArrayTypeable;
import de.silvawb.java.Commentable;
import de.silvawb.java.ExceptionThrower;
import de.silvawb.java.JavaPackage;
import de.silvawb.java.Method;
import de.silvawb.java.MethodCall;
import de.silvawb.java.Modifier;
import de.silvawb.java.NamespaceClassifierReference;
import de.silvawb.java.Parameter;
import de.silvawb.java.Parametrizable;
import de.silvawb.java.ReferenceableElement;
import de.silvawb.java.TypeParameter;
import de.silvawb.java.TypeParametrizable;
import de.silvawb.java.TypeReference;
import de.silvawb.java.TypedElement;

import java.lang.Boolean;
import java.lang.Class;

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
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.MethodImpl#getTypeReference <em>Type Reference</em>}</li>
 *   <li>{@link de.silvawb.java.impl.MethodImpl#getArrayDimensionsBefore <em>Array Dimensions Before</em>}</li>
 *   <li>{@link de.silvawb.java.impl.MethodImpl#getArrayDimensionsAfter <em>Array Dimensions After</em>}</li>
 *   <li>{@link de.silvawb.java.impl.MethodImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link de.silvawb.java.impl.MethodImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.silvawb.java.impl.MethodImpl#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link de.silvawb.java.impl.MethodImpl#getAnnotationsAndModifiers <em>Annotations And Modifiers</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MethodImpl extends MemberImpl implements Method {
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
	 * The cached value of the '{@link #getArrayDimensionsBefore() <em>Array Dimensions Before</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayDimensionsBefore()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrayDimension> arrayDimensionsBefore;

	/**
	 * The cached value of the '{@link #getArrayDimensionsAfter() <em>Array Dimensions After</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayDimensionsAfter()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrayDimension> arrayDimensionsAfter;

	/**
	 * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeParameter> typeParameters;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getExceptions() <em>Exceptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<NamespaceClassifierReference> exceptions;

	/**
	 * The cached value of the '{@link #getAnnotationsAndModifiers() <em>Annotations And Modifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationsAndModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationInstanceOrModifier> annotationsAndModifiers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getMethod();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.METHOD__TYPE_REFERENCE, oldTypeReference, newTypeReference);
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
				msgs = ((InternalEObject)typeReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.METHOD__TYPE_REFERENCE, null, msgs);
			if (newTypeReference != null)
				msgs = ((InternalEObject)newTypeReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.METHOD__TYPE_REFERENCE, null, msgs);
			msgs = basicSetTypeReference(newTypeReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.METHOD__TYPE_REFERENCE, newTypeReference, newTypeReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArrayDimension> getArrayDimensionsBefore() {
		if (arrayDimensionsBefore == null) {
			arrayDimensionsBefore = new EObjectContainmentEList<ArrayDimension>(ArrayDimension.class, this, JavaPackage.METHOD__ARRAY_DIMENSIONS_BEFORE);
		}
		return arrayDimensionsBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArrayDimension> getArrayDimensionsAfter() {
		if (arrayDimensionsAfter == null) {
			arrayDimensionsAfter = new EObjectContainmentEList<ArrayDimension>(ArrayDimension.class, this, JavaPackage.METHOD__ARRAY_DIMENSIONS_AFTER);
		}
		return arrayDimensionsAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeParameter> getTypeParameters() {
		if (typeParameters == null) {
			typeParameters = new EObjectContainmentEList<TypeParameter>(TypeParameter.class, this, JavaPackage.METHOD__TYPE_PARAMETERS);
		}
		return typeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, JavaPackage.METHOD__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamespaceClassifierReference> getExceptions() {
		if (exceptions == null) {
			exceptions = new EObjectContainmentEList<NamespaceClassifierReference>(NamespaceClassifierReference.class, this, JavaPackage.METHOD__EXCEPTIONS);
		}
		return exceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotationInstanceOrModifier> getAnnotationsAndModifiers() {
		if (annotationsAndModifiers == null) {
			annotationsAndModifiers = new EObjectContainmentEList<AnnotationInstanceOrModifier>(AnnotationInstanceOrModifier.class, this, JavaPackage.METHOD__ANNOTATIONS_AND_MODIFIERS);
		}
		return annotationsAndModifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMethodForCall(final MethodCall methodCall, final boolean needsPerfectMatch) {
		org.eclipse.emf.common.util.EList< de.silvawb.java.Type> argumentTypeList = methodCall.getArgumentTypes();
		org.eclipse.emf.common.util.EList< de.silvawb.java.Parameter> parameterList = new org.eclipse.emf.common.util.BasicEList< de.silvawb.java.Parameter>(this.getParameters());
		
		org.eclipse.emf.common.util.EList< de.silvawb.java.Type> parameterTypeList = new org.eclipse.emf.common.util.BasicEList< de.silvawb.java.Type>();
		for( de.silvawb.java.Parameter parameter : parameterList)  {
			//determine types before messing with the parameters
			parameterTypeList.add(
					parameter.getTypeReference().getBoundTarget(methodCall));
		}
		
		if (!parameterList.isEmpty()) {
			de.silvawb.java.Parameter lastParameter = parameterList.get(parameterList.size() - 1);
			de.silvawb.java.Type lastParameterType  = parameterTypeList.get(parameterTypeList.size() - 1);;
			if (lastParameter instanceof de.silvawb.java.VariableLengthParameter) {
				//in case of variable length add/remove some parameters
				while(parameterList.size() < argumentTypeList.size()) {
					if (needsPerfectMatch) return false;
					parameterList.add(lastParameter);
					parameterTypeList.add(lastParameterType);
				}
				if(parameterList.size() > argumentTypeList.size()) {
					if (needsPerfectMatch) return false;
					parameterList.remove(lastParameter);
					parameterTypeList.remove(parameterTypeList.size() - 1);
				}
				
			}
		}
		
		if (parameterList.size() == argumentTypeList.size()) { 
			boolean parametersMatch = true;
			for (int i = 0; i < argumentTypeList.size(); i++) {
				de.silvawb.java.Parameter  parameter = parameterList.get(i);
				de.silvawb.java.Expression argument = methodCall.getArguments().get(i);
		
				de.silvawb.java.Type parameterType = parameterTypeList.get(i);
				de.silvawb.java.Type argumentType  = argumentTypeList.get(i);
				
				if (argumentType == null || parameterType == null) {
					return false;
				}
				
				if (parameterType != null && argumentType != null) {
					if (!parameterType.eIsProxy() || !argumentType.eIsProxy()) {
						if (needsPerfectMatch) {
							parametersMatch = parametersMatch
								&& argumentType.equalsType(argument.getArrayDimension(),
										parameterType, parameter.getArrayDimension());
						}
						else {
							parametersMatch = parametersMatch 
								&& argumentType.isSuperType(argument.getArrayDimension(),
										parameterType, parameter);
						}
					}
					else {
						return false;
					}
				}
				else {
					return false;
				}
			}
			return parametersMatch; 
		} 
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSomeMethodForCall(final MethodCall methodCall) {
		return isMethodForCall(methodCall, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBetterMethodForCall(final Method otherMethod, final MethodCall methodCall) {
		if (!isMethodForCall(methodCall, false)) {
			return false;
		}
		if (otherMethod.isMethodForCall(methodCall, true)) {
			if (isMethodForCall(methodCall, true)) {
				//we both match perfectly; lets compare our return types
				de.silvawb.java.Type target = getTypeReference().getTarget();
				if (target instanceof de.silvawb.java.ConcreteClassifier) {
					if ((( de.silvawb.java.ConcreteClassifier) target).getAllSuperClassifiers().contains(
							otherMethod.getTypeReference().getTarget())) {
						// I am the more concrete type
						return true;
					}
				}
			}
			//the other already matches perfectly; I am not better
			return false;
		}
		if (!otherMethod.isMethodForCall(methodCall, false)) {
			//I match, but the other does not
			return true;
		}
		//we both match, I am only better if I match perfectly <- 
		//TODO #763: this is not enough: we need to check for "nearest subtype" here
		return isMethodForCall(methodCall, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getArrayDimension() {
		long size = this.getArrayDimensionsBefore().size() + this.getArrayDimensionsAfter().size();
		if (this instanceof de.silvawb.java.VariableLengthParameter) {
			size++;
		}
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHidden(final Commentable context) {
		if (this.eIsProxy()) {
			return false;
		}
		//all members of an interface are public by default
		if (this.eContainer() instanceof de.silvawb.java.Interface) {
			return false;
		}
		
		if(context.eIsProxy()) {
			context = ( de.silvawb.java.Commentable) org.eclipse.emf.ecore.util.EcoreUtil.resolve(context, this);
		}
		
		de.silvawb.java.ConcreteClassifier contextClassifier = context.getContainingConcreteClassifier(); 
		if (!(eContainer() instanceof de.silvawb.java.Commentable)) {
			return true;
		}
		de.silvawb.java.ConcreteClassifier myClassifier = (( de.silvawb.java.Commentable) eContainer()).getParentConcreteClassifier();
		//special case: self reference to outer instance
		if(context instanceof de.silvawb.java.Reference) {
			if ((( de.silvawb.java.Reference)context).getPrevious() instanceof de.silvawb.java.SelfReference) {
				de.silvawb.java.SelfReference selfReference = ( de.silvawb.java.SelfReference) (( de.silvawb.java.Reference)context).getPrevious();
				if (selfReference.getSelf() instanceof de.silvawb.java.Self) {
					if(selfReference.getPrevious() != null) {
						de.silvawb.java.Type type = selfReference.getPrevious().getReferencedType();
						if (type instanceof de.silvawb.java.ConcreteClassifier) {
							contextClassifier = ( de.silvawb.java.ConcreteClassifier) type;
						}
					}
				}
			}
		}
		
		for( de.silvawb.java.AnnotationInstanceOrModifier modifier : this.getAnnotationsAndModifiers()) {
			if(modifier instanceof de.silvawb.java.Private) {
				if (myClassifier.equalsType(0, contextClassifier,0)) {
					return false;
				}
				return true;
			}
			if(modifier instanceof de.silvawb.java.Public) {
				return false;
			}
			if(modifier instanceof de.silvawb.java.Protected) {
				//package visibility
				if (getContainingPackageName() != null && 
						getContainingPackageName().equals(context.getContainingPackageName())) {
					return false;
				}
				//try outer classifiers as well 
				while(contextClassifier instanceof de.silvawb.java.Classifier) {
					if (contextClassifier.isSuperType(0, myClassifier, null)) {
						return false;
					}
					
					org.eclipse.emf.ecore.EObject container = contextClassifier.eContainer();
					if (container instanceof de.silvawb.java.Commentable) {
						contextClassifier = (( de.silvawb.java.Commentable) container).getParentConcreteClassifier();
					} else {
						contextClassifier = null;
					}
					
					if (contextClassifier != null && !contextClassifier.eIsProxy() && 
							contextClassifier.isSuperType(0, myClassifier, null)) {
						return false;
					}
				}
				//visibility through anonymous subclass
				de.silvawb.java.AnonymousClass anonymousClass = context.getContainingAnonymousClass();
				while (anonymousClass != null) {
					contextClassifier = anonymousClass.getSuperClassifier();
					if (contextClassifier == null) {
						return true;
					}
					if (contextClassifier.isSuperType(0, myClassifier, null)) {
						return false;
					}
					
					org.eclipse.emf.ecore.EObject container = anonymousClass.eContainer();
					if (container instanceof de.silvawb.java.Commentable) {
						anonymousClass = (( de.silvawb.java.Commentable) container).getContainingAnonymousClass();
					} else {
						anonymousClass = null;
					}
				}
				return true;
			}
		}
		//package visibility?
		if (getContainingPackageName() != null && 
				getContainingPackageName().equals(context.getContainingPackageName())) {
			return false;
		}
		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatic() {
		//all members of an interface are static by default
		if (this.eContainer() instanceof de.silvawb.java.Interface) {
			return true;
		}
		
		for( de.silvawb.java.AnnotationInstanceOrModifier modifier : this.getAnnotationsAndModifiers()) {
			if(modifier instanceof de.silvawb.java.Static) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeModifier(final Class<?> modifierType) {
		java.util.List< de.silvawb.java.AnnotationInstanceOrModifier> modifiers = getAnnotationsAndModifiers();
		java.util.List< de.silvawb.java.AnnotationInstanceOrModifier> modifiersToRemove = new java.util.ArrayList< de.silvawb.java.AnnotationInstanceOrModifier>();
		for ( de.silvawb.java.AnnotationInstanceOrModifier modifier : modifiers) {
			if (modifierType.isInstance(modifier)) {
				modifiersToRemove.add(modifier);
			}
		}
		modifiers.removeAll(modifiersToRemove);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void makePublic() {
		if (isPublic()) {
			return;
		}
		removeModifier( de.silvawb.java.Private.class);
		removeModifier( de.silvawb.java.Protected.class);
		getAnnotationsAndModifiers().add( de.silvawb.java.ModifiersFactory.eINSTANCE.createPublic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void makePrivate() {
		if (isPrivate()) {
			return;
		}
		removeModifier( de.silvawb.java.Public.class);
		removeModifier( de.silvawb.java.Protected.class);
		getAnnotationsAndModifiers().add( de.silvawb.java.ModifiersFactory.eINSTANCE.createPrivate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void makeProtected() {
		if (isProtected()) {
			return;
		}
		removeModifier( de.silvawb.java.Private.class);
		removeModifier( de.silvawb.java.Public.class);
		getAnnotationsAndModifiers().add( de.silvawb.java.ModifiersFactory.eINSTANCE.createProtected());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Modifier> getModifiers() {
		org.eclipse.emf.common.util.EList< de.silvawb.java.AnnotationInstanceOrModifier> elements = getAnnotationsAndModifiers();
		org.eclipse.emf.common.util.EList< de.silvawb.java.Modifier> modifiers = new org.eclipse.emf.common.util.BasicEList< de.silvawb.java.Modifier>(); 
		for ( de.silvawb.java.AnnotationInstanceOrModifier next : elements) {
			if (next instanceof de.silvawb.java.Modifier) {
				modifiers.add(( de.silvawb.java.Modifier) next);
			}
		}
		return org.eclipse.emf.common.util.ECollections.unmodifiableEList(modifiers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeAllModifiers() {
		java.util.List< de.silvawb.java.Modifier> modifiers = getModifiers();
		org.eclipse.emf.common.util.EList< de.silvawb.java.AnnotationInstanceOrModifier> elements = getAnnotationsAndModifiers();
		elements.removeAll(modifiers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasModifier(final Class<?> type) {
		java.util.List< de.silvawb.java.AnnotationInstanceOrModifier> modifiers = getAnnotationsAndModifiers();
		for ( de.silvawb.java.AnnotationInstanceOrModifier modifier : modifiers) {
			if (type.isInstance(modifier)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPublic() {
		return hasModifier( de.silvawb.java.Public.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrivate() {
		return hasModifier( de.silvawb.java.Private.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProtected() {
		return hasModifier( de.silvawb.java.Protected.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addModifier(final Modifier newModifier) {
		getAnnotationsAndModifiers().add(newModifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.METHOD__TYPE_REFERENCE:
				return basicSetTypeReference(null, msgs);
			case JavaPackage.METHOD__ARRAY_DIMENSIONS_BEFORE:
				return ((InternalEList<?>)getArrayDimensionsBefore()).basicRemove(otherEnd, msgs);
			case JavaPackage.METHOD__ARRAY_DIMENSIONS_AFTER:
				return ((InternalEList<?>)getArrayDimensionsAfter()).basicRemove(otherEnd, msgs);
			case JavaPackage.METHOD__TYPE_PARAMETERS:
				return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
			case JavaPackage.METHOD__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case JavaPackage.METHOD__EXCEPTIONS:
				return ((InternalEList<?>)getExceptions()).basicRemove(otherEnd, msgs);
			case JavaPackage.METHOD__ANNOTATIONS_AND_MODIFIERS:
				return ((InternalEList<?>)getAnnotationsAndModifiers()).basicRemove(otherEnd, msgs);
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
			case JavaPackage.METHOD__TYPE_REFERENCE:
				return getTypeReference();
			case JavaPackage.METHOD__ARRAY_DIMENSIONS_BEFORE:
				return getArrayDimensionsBefore();
			case JavaPackage.METHOD__ARRAY_DIMENSIONS_AFTER:
				return getArrayDimensionsAfter();
			case JavaPackage.METHOD__TYPE_PARAMETERS:
				return getTypeParameters();
			case JavaPackage.METHOD__PARAMETERS:
				return getParameters();
			case JavaPackage.METHOD__EXCEPTIONS:
				return getExceptions();
			case JavaPackage.METHOD__ANNOTATIONS_AND_MODIFIERS:
				return getAnnotationsAndModifiers();
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
			case JavaPackage.METHOD__TYPE_REFERENCE:
				setTypeReference((TypeReference)newValue);
				return;
			case JavaPackage.METHOD__ARRAY_DIMENSIONS_BEFORE:
				getArrayDimensionsBefore().clear();
				getArrayDimensionsBefore().addAll((Collection<? extends ArrayDimension>)newValue);
				return;
			case JavaPackage.METHOD__ARRAY_DIMENSIONS_AFTER:
				getArrayDimensionsAfter().clear();
				getArrayDimensionsAfter().addAll((Collection<? extends ArrayDimension>)newValue);
				return;
			case JavaPackage.METHOD__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends TypeParameter>)newValue);
				return;
			case JavaPackage.METHOD__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case JavaPackage.METHOD__EXCEPTIONS:
				getExceptions().clear();
				getExceptions().addAll((Collection<? extends NamespaceClassifierReference>)newValue);
				return;
			case JavaPackage.METHOD__ANNOTATIONS_AND_MODIFIERS:
				getAnnotationsAndModifiers().clear();
				getAnnotationsAndModifiers().addAll((Collection<? extends AnnotationInstanceOrModifier>)newValue);
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
			case JavaPackage.METHOD__TYPE_REFERENCE:
				setTypeReference((TypeReference)null);
				return;
			case JavaPackage.METHOD__ARRAY_DIMENSIONS_BEFORE:
				getArrayDimensionsBefore().clear();
				return;
			case JavaPackage.METHOD__ARRAY_DIMENSIONS_AFTER:
				getArrayDimensionsAfter().clear();
				return;
			case JavaPackage.METHOD__TYPE_PARAMETERS:
				getTypeParameters().clear();
				return;
			case JavaPackage.METHOD__PARAMETERS:
				getParameters().clear();
				return;
			case JavaPackage.METHOD__EXCEPTIONS:
				getExceptions().clear();
				return;
			case JavaPackage.METHOD__ANNOTATIONS_AND_MODIFIERS:
				getAnnotationsAndModifiers().clear();
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
			case JavaPackage.METHOD__TYPE_REFERENCE:
				return typeReference != null;
			case JavaPackage.METHOD__ARRAY_DIMENSIONS_BEFORE:
				return arrayDimensionsBefore != null && !arrayDimensionsBefore.isEmpty();
			case JavaPackage.METHOD__ARRAY_DIMENSIONS_AFTER:
				return arrayDimensionsAfter != null && !arrayDimensionsAfter.isEmpty();
			case JavaPackage.METHOD__TYPE_PARAMETERS:
				return typeParameters != null && !typeParameters.isEmpty();
			case JavaPackage.METHOD__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case JavaPackage.METHOD__EXCEPTIONS:
				return exceptions != null && !exceptions.isEmpty();
			case JavaPackage.METHOD__ANNOTATIONS_AND_MODIFIERS:
				return annotationsAndModifiers != null && !annotationsAndModifiers.isEmpty();
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
				case JavaPackage.METHOD__TYPE_REFERENCE: return JavaPackage.TYPED_ELEMENT__TYPE_REFERENCE;
				default: return -1;
			}
		}
		if (baseClass == ArrayTypeable.class) {
			switch (derivedFeatureID) {
				case JavaPackage.METHOD__ARRAY_DIMENSIONS_BEFORE: return JavaPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE;
				case JavaPackage.METHOD__ARRAY_DIMENSIONS_AFTER: return JavaPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER;
				default: return -1;
			}
		}
		if (baseClass == TypeParametrizable.class) {
			switch (derivedFeatureID) {
				case JavaPackage.METHOD__TYPE_PARAMETERS: return JavaPackage.TYPE_PARAMETRIZABLE__TYPE_PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == Parametrizable.class) {
			switch (derivedFeatureID) {
				case JavaPackage.METHOD__PARAMETERS: return JavaPackage.PARAMETRIZABLE__PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == ReferenceableElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ExceptionThrower.class) {
			switch (derivedFeatureID) {
				case JavaPackage.METHOD__EXCEPTIONS: return JavaPackage.EXCEPTION_THROWER__EXCEPTIONS;
				default: return -1;
			}
		}
		if (baseClass == AnnotableAndModifiable.class) {
			switch (derivedFeatureID) {
				case JavaPackage.METHOD__ANNOTATIONS_AND_MODIFIERS: return JavaPackage.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS;
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
				case JavaPackage.TYPED_ELEMENT__TYPE_REFERENCE: return JavaPackage.METHOD__TYPE_REFERENCE;
				default: return -1;
			}
		}
		if (baseClass == ArrayTypeable.class) {
			switch (baseFeatureID) {
				case JavaPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE: return JavaPackage.METHOD__ARRAY_DIMENSIONS_BEFORE;
				case JavaPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER: return JavaPackage.METHOD__ARRAY_DIMENSIONS_AFTER;
				default: return -1;
			}
		}
		if (baseClass == TypeParametrizable.class) {
			switch (baseFeatureID) {
				case JavaPackage.TYPE_PARAMETRIZABLE__TYPE_PARAMETERS: return JavaPackage.METHOD__TYPE_PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == Parametrizable.class) {
			switch (baseFeatureID) {
				case JavaPackage.PARAMETRIZABLE__PARAMETERS: return JavaPackage.METHOD__PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == ReferenceableElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ExceptionThrower.class) {
			switch (baseFeatureID) {
				case JavaPackage.EXCEPTION_THROWER__EXCEPTIONS: return JavaPackage.METHOD__EXCEPTIONS;
				default: return -1;
			}
		}
		if (baseClass == AnnotableAndModifiable.class) {
			switch (baseFeatureID) {
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS: return JavaPackage.METHOD__ANNOTATIONS_AND_MODIFIERS;
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
		if (baseClass == TypedElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == ArrayTypeable.class) {
			switch (baseOperationID) {
				case JavaPackage.ARRAY_TYPEABLE___GET_ARRAY_DIMENSION: return JavaPackage.METHOD___GET_ARRAY_DIMENSION;
				default: return -1;
			}
		}
		if (baseClass == TypeParametrizable.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Parametrizable.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == ReferenceableElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == ExceptionThrower.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == AnnotableAndModifiable.class) {
			switch (baseOperationID) {
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___IS_HIDDEN__COMMENTABLE: return JavaPackage.METHOD___IS_HIDDEN__COMMENTABLE;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___IS_STATIC: return JavaPackage.METHOD___IS_STATIC;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___REMOVE_MODIFIER__CLASS: return JavaPackage.METHOD___REMOVE_MODIFIER__CLASS;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PUBLIC: return JavaPackage.METHOD___MAKE_PUBLIC;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PRIVATE: return JavaPackage.METHOD___MAKE_PRIVATE;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PROTECTED: return JavaPackage.METHOD___MAKE_PROTECTED;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___GET_MODIFIERS: return JavaPackage.METHOD___GET_MODIFIERS;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___REMOVE_ALL_MODIFIERS: return JavaPackage.METHOD___REMOVE_ALL_MODIFIERS;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___HAS_MODIFIER__CLASS: return JavaPackage.METHOD___HAS_MODIFIER__CLASS;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___IS_PUBLIC: return JavaPackage.METHOD___IS_PUBLIC;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___IS_PRIVATE: return JavaPackage.METHOD___IS_PRIVATE;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___IS_PROTECTED: return JavaPackage.METHOD___IS_PROTECTED;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___ADD_MODIFIER__MODIFIER: return JavaPackage.METHOD___ADD_MODIFIER__MODIFIER;
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
			case JavaPackage.METHOD___IS_METHOD_FOR_CALL__METHODCALL_BOOLEAN:
				return isMethodForCall((MethodCall)arguments.get(0), (Boolean)arguments.get(1));
			case JavaPackage.METHOD___IS_SOME_METHOD_FOR_CALL__METHODCALL:
				return isSomeMethodForCall((MethodCall)arguments.get(0));
			case JavaPackage.METHOD___IS_BETTER_METHOD_FOR_CALL__METHOD_METHODCALL:
				return isBetterMethodForCall((Method)arguments.get(0), (MethodCall)arguments.get(1));
			case JavaPackage.METHOD___GET_ARRAY_DIMENSION:
				return getArrayDimension();
			case JavaPackage.METHOD___IS_HIDDEN__COMMENTABLE:
				return isHidden((Commentable)arguments.get(0));
			case JavaPackage.METHOD___IS_STATIC:
				return isStatic();
			case JavaPackage.METHOD___REMOVE_MODIFIER__CLASS:
				removeModifier((Class<?>)arguments.get(0));
				return null;
			case JavaPackage.METHOD___MAKE_PUBLIC:
				makePublic();
				return null;
			case JavaPackage.METHOD___MAKE_PRIVATE:
				makePrivate();
				return null;
			case JavaPackage.METHOD___MAKE_PROTECTED:
				makeProtected();
				return null;
			case JavaPackage.METHOD___GET_MODIFIERS:
				return getModifiers();
			case JavaPackage.METHOD___REMOVE_ALL_MODIFIERS:
				removeAllModifiers();
				return null;
			case JavaPackage.METHOD___HAS_MODIFIER__CLASS:
				return hasModifier((Class<?>)arguments.get(0));
			case JavaPackage.METHOD___IS_PUBLIC:
				return isPublic();
			case JavaPackage.METHOD___IS_PRIVATE:
				return isPrivate();
			case JavaPackage.METHOD___IS_PROTECTED:
				return isProtected();
			case JavaPackage.METHOD___ADD_MODIFIER__MODIFIER:
				addModifier((Modifier)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //MethodImpl
