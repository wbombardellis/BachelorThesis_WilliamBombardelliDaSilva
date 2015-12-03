/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.AdditionalField;
import de.silvawb.java.AnnotableAndModifiable;
import de.silvawb.java.AnnotationInstanceOrModifier;
import de.silvawb.java.ArrayDimension;
import de.silvawb.java.ArrayTypeable;
import de.silvawb.java.Commentable;
import de.silvawb.java.Expression;
import de.silvawb.java.Field;
import de.silvawb.java.Initializable;
import de.silvawb.java.JavaPackage;
import de.silvawb.java.Modifier;
import de.silvawb.java.ReferenceableElement;
import de.silvawb.java.Statement;
import de.silvawb.java.TypeArgument;
import de.silvawb.java.TypeArgumentable;
import de.silvawb.java.TypeReference;
import de.silvawb.java.TypedElement;
import de.silvawb.java.Variable;

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
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.FieldImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link de.silvawb.java.impl.FieldImpl#getTypeReference <em>Type Reference</em>}</li>
 *   <li>{@link de.silvawb.java.impl.FieldImpl#getArrayDimensionsBefore <em>Array Dimensions Before</em>}</li>
 *   <li>{@link de.silvawb.java.impl.FieldImpl#getArrayDimensionsAfter <em>Array Dimensions After</em>}</li>
 *   <li>{@link de.silvawb.java.impl.FieldImpl#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link de.silvawb.java.impl.FieldImpl#getAnnotationsAndModifiers <em>Annotations And Modifiers</em>}</li>
 *   <li>{@link de.silvawb.java.impl.FieldImpl#getAdditionalFields <em>Additional Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldImpl extends MemberImpl implements Field {
	/**
	 * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected Expression initialValue;

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
	 * The cached value of the '{@link #getTypeArguments() <em>Type Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeArgument> typeArguments;

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
	 * The cached value of the '{@link #getAdditionalFields() <em>Additional Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalFields()
	 * @generated
	 * @ordered
	 */
	protected EList<AdditionalField> additionalFields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getField();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getInitialValue() {
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialValue(Expression newInitialValue, NotificationChain msgs) {
		Expression oldInitialValue = initialValue;
		initialValue = newInitialValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.FIELD__INITIAL_VALUE, oldInitialValue, newInitialValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialValue(Expression newInitialValue) {
		if (newInitialValue != initialValue) {
			NotificationChain msgs = null;
			if (initialValue != null)
				msgs = ((InternalEObject)initialValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.FIELD__INITIAL_VALUE, null, msgs);
			if (newInitialValue != null)
				msgs = ((InternalEObject)newInitialValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.FIELD__INITIAL_VALUE, null, msgs);
			msgs = basicSetInitialValue(newInitialValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.FIELD__INITIAL_VALUE, newInitialValue, newInitialValue));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.FIELD__TYPE_REFERENCE, oldTypeReference, newTypeReference);
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
				msgs = ((InternalEObject)typeReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.FIELD__TYPE_REFERENCE, null, msgs);
			if (newTypeReference != null)
				msgs = ((InternalEObject)newTypeReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.FIELD__TYPE_REFERENCE, null, msgs);
			msgs = basicSetTypeReference(newTypeReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.FIELD__TYPE_REFERENCE, newTypeReference, newTypeReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArrayDimension> getArrayDimensionsBefore() {
		if (arrayDimensionsBefore == null) {
			arrayDimensionsBefore = new EObjectContainmentEList<ArrayDimension>(ArrayDimension.class, this, JavaPackage.FIELD__ARRAY_DIMENSIONS_BEFORE);
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
			arrayDimensionsAfter = new EObjectContainmentEList<ArrayDimension>(ArrayDimension.class, this, JavaPackage.FIELD__ARRAY_DIMENSIONS_AFTER);
		}
		return arrayDimensionsAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeArgument> getTypeArguments() {
		if (typeArguments == null) {
			typeArguments = new EObjectContainmentEList<TypeArgument>(TypeArgument.class, this, JavaPackage.FIELD__TYPE_ARGUMENTS);
		}
		return typeArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotationInstanceOrModifier> getAnnotationsAndModifiers() {
		if (annotationsAndModifiers == null) {
			annotationsAndModifiers = new EObjectContainmentEList<AnnotationInstanceOrModifier>(AnnotationInstanceOrModifier.class, this, JavaPackage.FIELD__ANNOTATIONS_AND_MODIFIERS);
		}
		return annotationsAndModifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdditionalField> getAdditionalFields() {
		if (additionalFields == null) {
			additionalFields = new EObjectContainmentEList<AdditionalField>(AdditionalField.class, this, JavaPackage.FIELD__ADDITIONAL_FIELDS);
		}
		return additionalFields;
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
	public Statement createMethodCallStatement(final String methodName, final EList<Expression> arguments) {
		de.silvawb.java.ExpressionStatement callStatement = de.silvawb.java.StatementsFactory.eINSTANCE.createExpressionStatement();
		callStatement.setExpression(createMethodCall(methodName, arguments));
		return callStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createMethodCall(final String methodName, final EList<Expression> arguments) {
		de.silvawb.java.IdentifierReference thisRef = de.silvawb.java.ReferencesFactory.eINSTANCE.createIdentifierReference();
		thisRef.setTarget(this);
		de.silvawb.java.MethodCall methodCall = de.silvawb.java.ReferencesFactory.eINSTANCE.createMethodCall();
		de.silvawb.java.Type thisType = getTypeReference().getTarget();
		if (thisType instanceof de.silvawb.java.MemberContainer) {
			de.silvawb.java.MemberContainer castedType = ( de.silvawb.java.MemberContainer) thisType;
			de.silvawb.java.Method method = castedType.getContainedMethod(methodName);
			if (method == null) {
				return null;
			}
			methodCall.setTarget(method);
			// add arguments
			methodCall.getArguments().addAll(arguments);
			thisRef.setNext(methodCall);
			return thisRef;
		} else {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.FIELD__INITIAL_VALUE:
				return basicSetInitialValue(null, msgs);
			case JavaPackage.FIELD__TYPE_REFERENCE:
				return basicSetTypeReference(null, msgs);
			case JavaPackage.FIELD__ARRAY_DIMENSIONS_BEFORE:
				return ((InternalEList<?>)getArrayDimensionsBefore()).basicRemove(otherEnd, msgs);
			case JavaPackage.FIELD__ARRAY_DIMENSIONS_AFTER:
				return ((InternalEList<?>)getArrayDimensionsAfter()).basicRemove(otherEnd, msgs);
			case JavaPackage.FIELD__TYPE_ARGUMENTS:
				return ((InternalEList<?>)getTypeArguments()).basicRemove(otherEnd, msgs);
			case JavaPackage.FIELD__ANNOTATIONS_AND_MODIFIERS:
				return ((InternalEList<?>)getAnnotationsAndModifiers()).basicRemove(otherEnd, msgs);
			case JavaPackage.FIELD__ADDITIONAL_FIELDS:
				return ((InternalEList<?>)getAdditionalFields()).basicRemove(otherEnd, msgs);
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
			case JavaPackage.FIELD__INITIAL_VALUE:
				return getInitialValue();
			case JavaPackage.FIELD__TYPE_REFERENCE:
				return getTypeReference();
			case JavaPackage.FIELD__ARRAY_DIMENSIONS_BEFORE:
				return getArrayDimensionsBefore();
			case JavaPackage.FIELD__ARRAY_DIMENSIONS_AFTER:
				return getArrayDimensionsAfter();
			case JavaPackage.FIELD__TYPE_ARGUMENTS:
				return getTypeArguments();
			case JavaPackage.FIELD__ANNOTATIONS_AND_MODIFIERS:
				return getAnnotationsAndModifiers();
			case JavaPackage.FIELD__ADDITIONAL_FIELDS:
				return getAdditionalFields();
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
			case JavaPackage.FIELD__INITIAL_VALUE:
				setInitialValue((Expression)newValue);
				return;
			case JavaPackage.FIELD__TYPE_REFERENCE:
				setTypeReference((TypeReference)newValue);
				return;
			case JavaPackage.FIELD__ARRAY_DIMENSIONS_BEFORE:
				getArrayDimensionsBefore().clear();
				getArrayDimensionsBefore().addAll((Collection<? extends ArrayDimension>)newValue);
				return;
			case JavaPackage.FIELD__ARRAY_DIMENSIONS_AFTER:
				getArrayDimensionsAfter().clear();
				getArrayDimensionsAfter().addAll((Collection<? extends ArrayDimension>)newValue);
				return;
			case JavaPackage.FIELD__TYPE_ARGUMENTS:
				getTypeArguments().clear();
				getTypeArguments().addAll((Collection<? extends TypeArgument>)newValue);
				return;
			case JavaPackage.FIELD__ANNOTATIONS_AND_MODIFIERS:
				getAnnotationsAndModifiers().clear();
				getAnnotationsAndModifiers().addAll((Collection<? extends AnnotationInstanceOrModifier>)newValue);
				return;
			case JavaPackage.FIELD__ADDITIONAL_FIELDS:
				getAdditionalFields().clear();
				getAdditionalFields().addAll((Collection<? extends AdditionalField>)newValue);
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
			case JavaPackage.FIELD__INITIAL_VALUE:
				setInitialValue((Expression)null);
				return;
			case JavaPackage.FIELD__TYPE_REFERENCE:
				setTypeReference((TypeReference)null);
				return;
			case JavaPackage.FIELD__ARRAY_DIMENSIONS_BEFORE:
				getArrayDimensionsBefore().clear();
				return;
			case JavaPackage.FIELD__ARRAY_DIMENSIONS_AFTER:
				getArrayDimensionsAfter().clear();
				return;
			case JavaPackage.FIELD__TYPE_ARGUMENTS:
				getTypeArguments().clear();
				return;
			case JavaPackage.FIELD__ANNOTATIONS_AND_MODIFIERS:
				getAnnotationsAndModifiers().clear();
				return;
			case JavaPackage.FIELD__ADDITIONAL_FIELDS:
				getAdditionalFields().clear();
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
			case JavaPackage.FIELD__INITIAL_VALUE:
				return initialValue != null;
			case JavaPackage.FIELD__TYPE_REFERENCE:
				return typeReference != null;
			case JavaPackage.FIELD__ARRAY_DIMENSIONS_BEFORE:
				return arrayDimensionsBefore != null && !arrayDimensionsBefore.isEmpty();
			case JavaPackage.FIELD__ARRAY_DIMENSIONS_AFTER:
				return arrayDimensionsAfter != null && !arrayDimensionsAfter.isEmpty();
			case JavaPackage.FIELD__TYPE_ARGUMENTS:
				return typeArguments != null && !typeArguments.isEmpty();
			case JavaPackage.FIELD__ANNOTATIONS_AND_MODIFIERS:
				return annotationsAndModifiers != null && !annotationsAndModifiers.isEmpty();
			case JavaPackage.FIELD__ADDITIONAL_FIELDS:
				return additionalFields != null && !additionalFields.isEmpty();
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
		if (baseClass == Initializable.class) {
			switch (derivedFeatureID) {
				case JavaPackage.FIELD__INITIAL_VALUE: return JavaPackage.INITIALIZABLE__INITIAL_VALUE;
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case JavaPackage.FIELD__TYPE_REFERENCE: return JavaPackage.TYPED_ELEMENT__TYPE_REFERENCE;
				default: return -1;
			}
		}
		if (baseClass == ArrayTypeable.class) {
			switch (derivedFeatureID) {
				case JavaPackage.FIELD__ARRAY_DIMENSIONS_BEFORE: return JavaPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE;
				case JavaPackage.FIELD__ARRAY_DIMENSIONS_AFTER: return JavaPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER;
				default: return -1;
			}
		}
		if (baseClass == ReferenceableElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TypeArgumentable.class) {
			switch (derivedFeatureID) {
				case JavaPackage.FIELD__TYPE_ARGUMENTS: return JavaPackage.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS;
				default: return -1;
			}
		}
		if (baseClass == Variable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AnnotableAndModifiable.class) {
			switch (derivedFeatureID) {
				case JavaPackage.FIELD__ANNOTATIONS_AND_MODIFIERS: return JavaPackage.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS;
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
		if (baseClass == Initializable.class) {
			switch (baseFeatureID) {
				case JavaPackage.INITIALIZABLE__INITIAL_VALUE: return JavaPackage.FIELD__INITIAL_VALUE;
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case JavaPackage.TYPED_ELEMENT__TYPE_REFERENCE: return JavaPackage.FIELD__TYPE_REFERENCE;
				default: return -1;
			}
		}
		if (baseClass == ArrayTypeable.class) {
			switch (baseFeatureID) {
				case JavaPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE: return JavaPackage.FIELD__ARRAY_DIMENSIONS_BEFORE;
				case JavaPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER: return JavaPackage.FIELD__ARRAY_DIMENSIONS_AFTER;
				default: return -1;
			}
		}
		if (baseClass == ReferenceableElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TypeArgumentable.class) {
			switch (baseFeatureID) {
				case JavaPackage.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS: return JavaPackage.FIELD__TYPE_ARGUMENTS;
				default: return -1;
			}
		}
		if (baseClass == Variable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AnnotableAndModifiable.class) {
			switch (baseFeatureID) {
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS: return JavaPackage.FIELD__ANNOTATIONS_AND_MODIFIERS;
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
		if (baseClass == Initializable.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == ArrayTypeable.class) {
			switch (baseOperationID) {
				case JavaPackage.ARRAY_TYPEABLE___GET_ARRAY_DIMENSION: return JavaPackage.FIELD___GET_ARRAY_DIMENSION;
				default: return -1;
			}
		}
		if (baseClass == ReferenceableElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == TypeArgumentable.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Variable.class) {
			switch (baseOperationID) {
				case JavaPackage.VARIABLE___GET_ARRAY_DIMENSION: return JavaPackage.FIELD___GET_ARRAY_DIMENSION;
				case JavaPackage.VARIABLE___CREATE_METHOD_CALL_STATEMENT__STRING_ELIST: return JavaPackage.FIELD___CREATE_METHOD_CALL_STATEMENT__STRING_ELIST;
				case JavaPackage.VARIABLE___CREATE_METHOD_CALL__STRING_ELIST: return JavaPackage.FIELD___CREATE_METHOD_CALL__STRING_ELIST;
				default: return -1;
			}
		}
		if (baseClass == AnnotableAndModifiable.class) {
			switch (baseOperationID) {
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___IS_HIDDEN__COMMENTABLE: return JavaPackage.FIELD___IS_HIDDEN__COMMENTABLE;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___IS_STATIC: return JavaPackage.FIELD___IS_STATIC;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___REMOVE_MODIFIER__CLASS: return JavaPackage.FIELD___REMOVE_MODIFIER__CLASS;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PUBLIC: return JavaPackage.FIELD___MAKE_PUBLIC;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PRIVATE: return JavaPackage.FIELD___MAKE_PRIVATE;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PROTECTED: return JavaPackage.FIELD___MAKE_PROTECTED;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___GET_MODIFIERS: return JavaPackage.FIELD___GET_MODIFIERS;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___REMOVE_ALL_MODIFIERS: return JavaPackage.FIELD___REMOVE_ALL_MODIFIERS;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___HAS_MODIFIER__CLASS: return JavaPackage.FIELD___HAS_MODIFIER__CLASS;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___IS_PUBLIC: return JavaPackage.FIELD___IS_PUBLIC;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___IS_PRIVATE: return JavaPackage.FIELD___IS_PRIVATE;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___IS_PROTECTED: return JavaPackage.FIELD___IS_PROTECTED;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___ADD_MODIFIER__MODIFIER: return JavaPackage.FIELD___ADD_MODIFIER__MODIFIER;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JavaPackage.FIELD___IS_HIDDEN__COMMENTABLE:
				return isHidden((Commentable)arguments.get(0));
			case JavaPackage.FIELD___IS_STATIC:
				return isStatic();
			case JavaPackage.FIELD___REMOVE_MODIFIER__CLASS:
				removeModifier((Class<?>)arguments.get(0));
				return null;
			case JavaPackage.FIELD___MAKE_PUBLIC:
				makePublic();
				return null;
			case JavaPackage.FIELD___MAKE_PRIVATE:
				makePrivate();
				return null;
			case JavaPackage.FIELD___MAKE_PROTECTED:
				makeProtected();
				return null;
			case JavaPackage.FIELD___GET_MODIFIERS:
				return getModifiers();
			case JavaPackage.FIELD___REMOVE_ALL_MODIFIERS:
				removeAllModifiers();
				return null;
			case JavaPackage.FIELD___HAS_MODIFIER__CLASS:
				return hasModifier((Class<?>)arguments.get(0));
			case JavaPackage.FIELD___IS_PUBLIC:
				return isPublic();
			case JavaPackage.FIELD___IS_PRIVATE:
				return isPrivate();
			case JavaPackage.FIELD___IS_PROTECTED:
				return isProtected();
			case JavaPackage.FIELD___ADD_MODIFIER__MODIFIER:
				addModifier((Modifier)arguments.get(0));
				return null;
			case JavaPackage.FIELD___GET_ARRAY_DIMENSION:
				return getArrayDimension();
			case JavaPackage.FIELD___CREATE_METHOD_CALL_STATEMENT__STRING_ELIST:
				return createMethodCallStatement((String)arguments.get(0), (EList<Expression>)arguments.get(1));
			case JavaPackage.FIELD___CREATE_METHOD_CALL__STRING_ELIST:
				return createMethodCall((String)arguments.get(0), (EList<Expression>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //FieldImpl
