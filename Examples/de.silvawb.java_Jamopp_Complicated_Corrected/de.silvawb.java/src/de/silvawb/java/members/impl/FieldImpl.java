/**
 */
package de.silvawb.java.members.impl;

import de.silvawb.java.arrays.ArrayDimension;
import de.silvawb.java.arrays.ArrayTypeable;
import de.silvawb.java.arrays.ArraysPackage;

import de.silvawb.java.commons.Commentable;

import de.silvawb.java.expressions.Expression;

import de.silvawb.java.generics.GenericsPackage;
import de.silvawb.java.generics.TypeArgument;
import de.silvawb.java.generics.TypeArgumentable;

import de.silvawb.java.instantiations.Initializable;
import de.silvawb.java.instantiations.InstantiationsPackage;

import de.silvawb.java.members.AdditionalField;
import de.silvawb.java.members.Field;
import de.silvawb.java.members.MembersPackage;

import de.silvawb.java.modifiers.AnnotableAndModifiable;
import de.silvawb.java.modifiers.AnnotationInstanceOrModifier;
import de.silvawb.java.modifiers.Modifier;
import de.silvawb.java.modifiers.ModifiersPackage;

import de.silvawb.java.references.ReferenceableElement;

import de.silvawb.java.statements.Statement;

import de.silvawb.java.types.TypeReference;
import de.silvawb.java.types.TypedElement;
import de.silvawb.java.types.TypesPackage;

import de.silvawb.java.variables.Variable;
import de.silvawb.java.variables.VariablesPackage;

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
 *   <li>{@link de.silvawb.java.members.impl.FieldImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link de.silvawb.java.members.impl.FieldImpl#getTypeReference <em>Type Reference</em>}</li>
 *   <li>{@link de.silvawb.java.members.impl.FieldImpl#getArrayDimensionsBefore <em>Array Dimensions Before</em>}</li>
 *   <li>{@link de.silvawb.java.members.impl.FieldImpl#getArrayDimensionsAfter <em>Array Dimensions After</em>}</li>
 *   <li>{@link de.silvawb.java.members.impl.FieldImpl#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link de.silvawb.java.members.impl.FieldImpl#getAnnotationsAndModifiers <em>Annotations And Modifiers</em>}</li>
 *   <li>{@link de.silvawb.java.members.impl.FieldImpl#getAdditionalFields <em>Additional Fields</em>}</li>
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
		return MembersPackage.Literals.FIELD;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MembersPackage.FIELD__INITIAL_VALUE, oldInitialValue, newInitialValue);
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
				msgs = ((InternalEObject)initialValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MembersPackage.FIELD__INITIAL_VALUE, null, msgs);
			if (newInitialValue != null)
				msgs = ((InternalEObject)newInitialValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MembersPackage.FIELD__INITIAL_VALUE, null, msgs);
			msgs = basicSetInitialValue(newInitialValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MembersPackage.FIELD__INITIAL_VALUE, newInitialValue, newInitialValue));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MembersPackage.FIELD__TYPE_REFERENCE, oldTypeReference, newTypeReference);
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
				msgs = ((InternalEObject)typeReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MembersPackage.FIELD__TYPE_REFERENCE, null, msgs);
			if (newTypeReference != null)
				msgs = ((InternalEObject)newTypeReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MembersPackage.FIELD__TYPE_REFERENCE, null, msgs);
			msgs = basicSetTypeReference(newTypeReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MembersPackage.FIELD__TYPE_REFERENCE, newTypeReference, newTypeReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArrayDimension> getArrayDimensionsBefore() {
		if (arrayDimensionsBefore == null) {
			arrayDimensionsBefore = new EObjectContainmentEList<ArrayDimension>(ArrayDimension.class, this, MembersPackage.FIELD__ARRAY_DIMENSIONS_BEFORE);
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
			arrayDimensionsAfter = new EObjectContainmentEList<ArrayDimension>(ArrayDimension.class, this, MembersPackage.FIELD__ARRAY_DIMENSIONS_AFTER);
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
			typeArguments = new EObjectContainmentEList<TypeArgument>(TypeArgument.class, this, MembersPackage.FIELD__TYPE_ARGUMENTS);
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
			annotationsAndModifiers = new EObjectContainmentEList<AnnotationInstanceOrModifier>(AnnotationInstanceOrModifier.class, this, MembersPackage.FIELD__ANNOTATIONS_AND_MODIFIERS);
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
			additionalFields = new EObjectContainmentEList<AdditionalField>(AdditionalField.class, this, MembersPackage.FIELD__ADDITIONAL_FIELDS);
		}
		return additionalFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHidden(Commentable context) {
		if (this.eIsProxy()) {
			return false;
		}
		//all members of an interface are public by default
		if (this.eContainer() instanceof de.silvawb.java.classifiers.Interface) {
			return false;
		}
		
		if(context.eIsProxy()) {
			context = ( de.silvawb.java.commons.Commentable) org.eclipse.emf.ecore.util.EcoreUtil.resolve(context, this);
		}
		
		de.silvawb.java.classifiers.ConcreteClassifier contextClassifier = context.getContainingConcreteClassifier(); 
		if (!(eContainer() instanceof de.silvawb.java.commons.Commentable)) {
			return true;
		}
		de.silvawb.java.classifiers.ConcreteClassifier myClassifier = (( de.silvawb.java.commons.Commentable) eContainer()).getParentConcreteClassifier();
		//special case: self reference to outer instance
		if(context instanceof de.silvawb.java.references.Reference) {
			if ((( de.silvawb.java.references.Reference)context).getPrevious() instanceof de.silvawb.java.references.SelfReference) {
				de.silvawb.java.references.SelfReference selfReference = ( de.silvawb.java.references.SelfReference) (( de.silvawb.java.references.Reference)context).getPrevious();
				if (selfReference.getSelf() instanceof de.silvawb.java.literals.Self) {
					if(selfReference.getPrevious() != null) {
						de.silvawb.java.types.Type type = selfReference.getPrevious().getReferencedType();
						if (type instanceof de.silvawb.java.classifiers.ConcreteClassifier) {
							contextClassifier = ( de.silvawb.java.classifiers.ConcreteClassifier) type;
						}
					}
				}
			}
		}
		
		for( de.silvawb.java.modifiers.AnnotationInstanceOrModifier modifier : this.getAnnotationsAndModifiers()) {
			if(modifier instanceof de.silvawb.java.modifiers.Private) {
				if (myClassifier.equalsType(0, contextClassifier,0)) {
					return false;
				}
				return true;
			}
			if(modifier instanceof de.silvawb.java.modifiers.Public) {
				return false;
			}
			if(modifier instanceof de.silvawb.java.modifiers.Protected) {
				//package visibility
				if (getContainingPackageName() != null && 
						getContainingPackageName().equals(context.getContainingPackageName())) {
					return false;
				}
				//try outer classifiers as well 
				while(contextClassifier instanceof de.silvawb.java.classifiers.Classifier) {
					if (contextClassifier.isSuperType(0, myClassifier, null)) {
						return false;
					}
					
					org.eclipse.emf.ecore.EObject container = contextClassifier.eContainer();
					if (container instanceof de.silvawb.java.commons.Commentable) {
						contextClassifier = (( de.silvawb.java.commons.Commentable) container).getParentConcreteClassifier();
					} else {
						contextClassifier = null;
					}
					
					if (contextClassifier != null && !contextClassifier.eIsProxy() && 
							contextClassifier.isSuperType(0, myClassifier, null)) {
						return false;
					}
				}
				//visibility through anonymous subclass
				de.silvawb.java.classifiers.AnonymousClass anonymousClass = context.getContainingAnonymousClass();
				while (anonymousClass != null) {
					contextClassifier = anonymousClass.getSuperClassifier();
					if (contextClassifier == null) {
						return true;
					}
					if (contextClassifier.isSuperType(0, myClassifier, null)) {
						return false;
					}
					
					org.eclipse.emf.ecore.EObject container = anonymousClass.eContainer();
					if (container instanceof de.silvawb.java.commons.Commentable) {
						anonymousClass = (( de.silvawb.java.commons.Commentable) container).getContainingAnonymousClass();
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
		if (this.eContainer() instanceof de.silvawb.java.classifiers.Interface) {
			return true;
		}
		
		for( de.silvawb.java.modifiers.AnnotationInstanceOrModifier modifier : this.getAnnotationsAndModifiers()) {
			if(modifier instanceof de.silvawb.java.modifiers.Static) {
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
		java.util.List< de.silvawb.java.modifiers.AnnotationInstanceOrModifier> modifiers = getAnnotationsAndModifiers();
		java.util.List< de.silvawb.java.modifiers.AnnotationInstanceOrModifier> modifiersToRemove = new java.util.ArrayList< de.silvawb.java.modifiers.AnnotationInstanceOrModifier>();
		for ( de.silvawb.java.modifiers.AnnotationInstanceOrModifier modifier : modifiers) {
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
		removeModifier( de.silvawb.java.modifiers.Private.class);
		removeModifier( de.silvawb.java.modifiers.Protected.class);
		getAnnotationsAndModifiers().add( de.silvawb.java.modifiers.ModifiersFactory.eINSTANCE.createPublic());
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
		removeModifier( de.silvawb.java.modifiers.Public.class);
		removeModifier( de.silvawb.java.modifiers.Protected.class);
		getAnnotationsAndModifiers().add( de.silvawb.java.modifiers.ModifiersFactory.eINSTANCE.createPrivate());
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
		removeModifier( de.silvawb.java.modifiers.Private.class);
		removeModifier( de.silvawb.java.modifiers.Public.class);
		getAnnotationsAndModifiers().add( de.silvawb.java.modifiers.ModifiersFactory.eINSTANCE.createProtected());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Modifier> getModifiers() {
		org.eclipse.emf.common.util.EList< de.silvawb.java.modifiers.AnnotationInstanceOrModifier> elements = getAnnotationsAndModifiers();
		org.eclipse.emf.common.util.EList< de.silvawb.java.modifiers.Modifier> modifiers = new org.eclipse.emf.common.util.BasicEList< de.silvawb.java.modifiers.Modifier>(); 
		for ( de.silvawb.java.modifiers.AnnotationInstanceOrModifier next : elements) {
			if (next instanceof de.silvawb.java.modifiers.Modifier) {
				modifiers.add(( de.silvawb.java.modifiers.Modifier) next);
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
		java.util.List< de.silvawb.java.modifiers.Modifier> modifiers = getModifiers();
		org.eclipse.emf.common.util.EList< de.silvawb.java.modifiers.AnnotationInstanceOrModifier> elements = getAnnotationsAndModifiers();
		elements.removeAll(modifiers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasModifier(final Class<?> type) {
		java.util.List< de.silvawb.java.modifiers.AnnotationInstanceOrModifier> modifiers = getAnnotationsAndModifiers();
		for ( de.silvawb.java.modifiers.AnnotationInstanceOrModifier modifier : modifiers) {
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
		return hasModifier( de.silvawb.java.modifiers.Public.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrivate() {
		return hasModifier( de.silvawb.java.modifiers.Private.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProtected() {
		return hasModifier( de.silvawb.java.modifiers.Protected.class);
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
		if (this instanceof de.silvawb.java.parameters.VariableLengthParameter) {
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
		de.silvawb.java.statements.ExpressionStatement callStatement = de.silvawb.java.statements.StatementsFactory.eINSTANCE.createExpressionStatement();
		callStatement.setExpression(createMethodCall(methodName, arguments));
		return callStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createMethodCall(final String methodName, final EList<Expression> arguments) {
		de.silvawb.java.references.IdentifierReference thisRef = de.silvawb.java.references.ReferencesFactory.eINSTANCE.createIdentifierReference();
		thisRef.setTarget(this);
		de.silvawb.java.references.MethodCall methodCall = de.silvawb.java.references.ReferencesFactory.eINSTANCE.createMethodCall();
		de.silvawb.java.types.Type thisType = getTypeReference().getTarget();
		if (thisType instanceof de.silvawb.java.members.MemberContainer) {
			de.silvawb.java.members.MemberContainer castedType = ( de.silvawb.java.members.MemberContainer) thisType;
			de.silvawb.java.members.Method method = castedType.getContainedMethod(methodName);
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
			case MembersPackage.FIELD__INITIAL_VALUE:
				return basicSetInitialValue(null, msgs);
			case MembersPackage.FIELD__TYPE_REFERENCE:
				return basicSetTypeReference(null, msgs);
			case MembersPackage.FIELD__ARRAY_DIMENSIONS_BEFORE:
				return ((InternalEList<?>)getArrayDimensionsBefore()).basicRemove(otherEnd, msgs);
			case MembersPackage.FIELD__ARRAY_DIMENSIONS_AFTER:
				return ((InternalEList<?>)getArrayDimensionsAfter()).basicRemove(otherEnd, msgs);
			case MembersPackage.FIELD__TYPE_ARGUMENTS:
				return ((InternalEList<?>)getTypeArguments()).basicRemove(otherEnd, msgs);
			case MembersPackage.FIELD__ANNOTATIONS_AND_MODIFIERS:
				return ((InternalEList<?>)getAnnotationsAndModifiers()).basicRemove(otherEnd, msgs);
			case MembersPackage.FIELD__ADDITIONAL_FIELDS:
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
			case MembersPackage.FIELD__INITIAL_VALUE:
				return getInitialValue();
			case MembersPackage.FIELD__TYPE_REFERENCE:
				return getTypeReference();
			case MembersPackage.FIELD__ARRAY_DIMENSIONS_BEFORE:
				return getArrayDimensionsBefore();
			case MembersPackage.FIELD__ARRAY_DIMENSIONS_AFTER:
				return getArrayDimensionsAfter();
			case MembersPackage.FIELD__TYPE_ARGUMENTS:
				return getTypeArguments();
			case MembersPackage.FIELD__ANNOTATIONS_AND_MODIFIERS:
				return getAnnotationsAndModifiers();
			case MembersPackage.FIELD__ADDITIONAL_FIELDS:
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
			case MembersPackage.FIELD__INITIAL_VALUE:
				setInitialValue((Expression)newValue);
				return;
			case MembersPackage.FIELD__TYPE_REFERENCE:
				setTypeReference((TypeReference)newValue);
				return;
			case MembersPackage.FIELD__ARRAY_DIMENSIONS_BEFORE:
				getArrayDimensionsBefore().clear();
				getArrayDimensionsBefore().addAll((Collection<? extends ArrayDimension>)newValue);
				return;
			case MembersPackage.FIELD__ARRAY_DIMENSIONS_AFTER:
				getArrayDimensionsAfter().clear();
				getArrayDimensionsAfter().addAll((Collection<? extends ArrayDimension>)newValue);
				return;
			case MembersPackage.FIELD__TYPE_ARGUMENTS:
				getTypeArguments().clear();
				getTypeArguments().addAll((Collection<? extends TypeArgument>)newValue);
				return;
			case MembersPackage.FIELD__ANNOTATIONS_AND_MODIFIERS:
				getAnnotationsAndModifiers().clear();
				getAnnotationsAndModifiers().addAll((Collection<? extends AnnotationInstanceOrModifier>)newValue);
				return;
			case MembersPackage.FIELD__ADDITIONAL_FIELDS:
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
			case MembersPackage.FIELD__INITIAL_VALUE:
				setInitialValue((Expression)null);
				return;
			case MembersPackage.FIELD__TYPE_REFERENCE:
				setTypeReference((TypeReference)null);
				return;
			case MembersPackage.FIELD__ARRAY_DIMENSIONS_BEFORE:
				getArrayDimensionsBefore().clear();
				return;
			case MembersPackage.FIELD__ARRAY_DIMENSIONS_AFTER:
				getArrayDimensionsAfter().clear();
				return;
			case MembersPackage.FIELD__TYPE_ARGUMENTS:
				getTypeArguments().clear();
				return;
			case MembersPackage.FIELD__ANNOTATIONS_AND_MODIFIERS:
				getAnnotationsAndModifiers().clear();
				return;
			case MembersPackage.FIELD__ADDITIONAL_FIELDS:
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
			case MembersPackage.FIELD__INITIAL_VALUE:
				return initialValue != null;
			case MembersPackage.FIELD__TYPE_REFERENCE:
				return typeReference != null;
			case MembersPackage.FIELD__ARRAY_DIMENSIONS_BEFORE:
				return arrayDimensionsBefore != null && !arrayDimensionsBefore.isEmpty();
			case MembersPackage.FIELD__ARRAY_DIMENSIONS_AFTER:
				return arrayDimensionsAfter != null && !arrayDimensionsAfter.isEmpty();
			case MembersPackage.FIELD__TYPE_ARGUMENTS:
				return typeArguments != null && !typeArguments.isEmpty();
			case MembersPackage.FIELD__ANNOTATIONS_AND_MODIFIERS:
				return annotationsAndModifiers != null && !annotationsAndModifiers.isEmpty();
			case MembersPackage.FIELD__ADDITIONAL_FIELDS:
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
				case MembersPackage.FIELD__INITIAL_VALUE: return InstantiationsPackage.INITIALIZABLE__INITIAL_VALUE;
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case MembersPackage.FIELD__TYPE_REFERENCE: return TypesPackage.TYPED_ELEMENT__TYPE_REFERENCE;
				default: return -1;
			}
		}
		if (baseClass == ArrayTypeable.class) {
			switch (derivedFeatureID) {
				case MembersPackage.FIELD__ARRAY_DIMENSIONS_BEFORE: return ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE;
				case MembersPackage.FIELD__ARRAY_DIMENSIONS_AFTER: return ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER;
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
				case MembersPackage.FIELD__TYPE_ARGUMENTS: return GenericsPackage.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS;
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
				case MembersPackage.FIELD__ANNOTATIONS_AND_MODIFIERS: return ModifiersPackage.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS;
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
				case InstantiationsPackage.INITIALIZABLE__INITIAL_VALUE: return MembersPackage.FIELD__INITIAL_VALUE;
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case TypesPackage.TYPED_ELEMENT__TYPE_REFERENCE: return MembersPackage.FIELD__TYPE_REFERENCE;
				default: return -1;
			}
		}
		if (baseClass == ArrayTypeable.class) {
			switch (baseFeatureID) {
				case ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE: return MembersPackage.FIELD__ARRAY_DIMENSIONS_BEFORE;
				case ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER: return MembersPackage.FIELD__ARRAY_DIMENSIONS_AFTER;
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
				case GenericsPackage.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS: return MembersPackage.FIELD__TYPE_ARGUMENTS;
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
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS: return MembersPackage.FIELD__ANNOTATIONS_AND_MODIFIERS;
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
				case ArraysPackage.ARRAY_TYPEABLE___GET_ARRAY_DIMENSION: return MembersPackage.FIELD___GET_ARRAY_DIMENSION;
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
				case VariablesPackage.VARIABLE___GET_ARRAY_DIMENSION: return MembersPackage.FIELD___GET_ARRAY_DIMENSION;
				case VariablesPackage.VARIABLE___CREATE_METHOD_CALL_STATEMENT__STRING_ELIST: return MembersPackage.FIELD___CREATE_METHOD_CALL_STATEMENT__STRING_ELIST;
				case VariablesPackage.VARIABLE___CREATE_METHOD_CALL__STRING_ELIST: return MembersPackage.FIELD___CREATE_METHOD_CALL__STRING_ELIST;
				default: return -1;
			}
		}
		if (baseClass == AnnotableAndModifiable.class) {
			switch (baseOperationID) {
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_HIDDEN__COMMENTABLE: return MembersPackage.FIELD___IS_HIDDEN__COMMENTABLE;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_STATIC: return MembersPackage.FIELD___IS_STATIC;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___REMOVE_MODIFIER__CLASS: return MembersPackage.FIELD___REMOVE_MODIFIER__CLASS;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PUBLIC: return MembersPackage.FIELD___MAKE_PUBLIC;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PRIVATE: return MembersPackage.FIELD___MAKE_PRIVATE;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PROTECTED: return MembersPackage.FIELD___MAKE_PROTECTED;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___GET_MODIFIERS: return MembersPackage.FIELD___GET_MODIFIERS;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___REMOVE_ALL_MODIFIERS: return MembersPackage.FIELD___REMOVE_ALL_MODIFIERS;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___HAS_MODIFIER__CLASS: return MembersPackage.FIELD___HAS_MODIFIER__CLASS;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_PUBLIC: return MembersPackage.FIELD___IS_PUBLIC;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_PRIVATE: return MembersPackage.FIELD___IS_PRIVATE;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_PROTECTED: return MembersPackage.FIELD___IS_PROTECTED;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___ADD_MODIFIER__MODIFIER: return MembersPackage.FIELD___ADD_MODIFIER__MODIFIER;
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
			case MembersPackage.FIELD___IS_HIDDEN__COMMENTABLE:
				return isHidden((Commentable)arguments.get(0));
			case MembersPackage.FIELD___IS_STATIC:
				return isStatic();
			case MembersPackage.FIELD___REMOVE_MODIFIER__CLASS:
				removeModifier((Class<?>)arguments.get(0));
				return null;
			case MembersPackage.FIELD___MAKE_PUBLIC:
				makePublic();
				return null;
			case MembersPackage.FIELD___MAKE_PRIVATE:
				makePrivate();
				return null;
			case MembersPackage.FIELD___MAKE_PROTECTED:
				makeProtected();
				return null;
			case MembersPackage.FIELD___GET_MODIFIERS:
				return getModifiers();
			case MembersPackage.FIELD___REMOVE_ALL_MODIFIERS:
				removeAllModifiers();
				return null;
			case MembersPackage.FIELD___HAS_MODIFIER__CLASS:
				return hasModifier((Class<?>)arguments.get(0));
			case MembersPackage.FIELD___IS_PUBLIC:
				return isPublic();
			case MembersPackage.FIELD___IS_PRIVATE:
				return isPrivate();
			case MembersPackage.FIELD___IS_PROTECTED:
				return isProtected();
			case MembersPackage.FIELD___ADD_MODIFIER__MODIFIER:
				addModifier((Modifier)arguments.get(0));
				return null;
			case MembersPackage.FIELD___GET_ARRAY_DIMENSION:
				return getArrayDimension();
			case MembersPackage.FIELD___CREATE_METHOD_CALL_STATEMENT__STRING_ELIST:
				return createMethodCallStatement((String)arguments.get(0), (EList<Expression>)arguments.get(1));
			case MembersPackage.FIELD___CREATE_METHOD_CALL__STRING_ELIST:
				return createMethodCall((String)arguments.get(0), (EList<Expression>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //FieldImpl
