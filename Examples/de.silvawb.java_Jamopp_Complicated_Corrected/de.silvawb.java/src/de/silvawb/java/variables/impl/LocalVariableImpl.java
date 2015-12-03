/**
 */
package de.silvawb.java.variables.impl;

import de.silvawb.java.commons.Commentable;

import de.silvawb.java.expressions.Expression;

import de.silvawb.java.instantiations.Initializable;
import de.silvawb.java.instantiations.InstantiationsPackage;

import de.silvawb.java.modifiers.AnnotableAndModifiable;
import de.silvawb.java.modifiers.AnnotationInstanceOrModifier;
import de.silvawb.java.modifiers.Modifier;
import de.silvawb.java.modifiers.ModifiersPackage;

import de.silvawb.java.statements.ForLoopInitializer;

import de.silvawb.java.variables.AdditionalLocalVariable;
import de.silvawb.java.variables.LocalVariable;
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
 * An implementation of the model object '<em><b>Local Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.variables.impl.LocalVariableImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link de.silvawb.java.variables.impl.LocalVariableImpl#getAnnotationsAndModifiers <em>Annotations And Modifiers</em>}</li>
 *   <li>{@link de.silvawb.java.variables.impl.LocalVariableImpl#getAdditionalLocalVariables <em>Additional Local Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalVariableImpl extends VariableImpl implements LocalVariable {
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
	 * The cached value of the '{@link #getAnnotationsAndModifiers() <em>Annotations And Modifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationsAndModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationInstanceOrModifier> annotationsAndModifiers;

	/**
	 * The cached value of the '{@link #getAdditionalLocalVariables() <em>Additional Local Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalLocalVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<AdditionalLocalVariable> additionalLocalVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariablesPackage.Literals.LOCAL_VARIABLE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariablesPackage.LOCAL_VARIABLE__INITIAL_VALUE, oldInitialValue, newInitialValue);
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
				msgs = ((InternalEObject)initialValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariablesPackage.LOCAL_VARIABLE__INITIAL_VALUE, null, msgs);
			if (newInitialValue != null)
				msgs = ((InternalEObject)newInitialValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariablesPackage.LOCAL_VARIABLE__INITIAL_VALUE, null, msgs);
			msgs = basicSetInitialValue(newInitialValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariablesPackage.LOCAL_VARIABLE__INITIAL_VALUE, newInitialValue, newInitialValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotationInstanceOrModifier> getAnnotationsAndModifiers() {
		if (annotationsAndModifiers == null) {
			annotationsAndModifiers = new EObjectContainmentEList<AnnotationInstanceOrModifier>(AnnotationInstanceOrModifier.class, this, VariablesPackage.LOCAL_VARIABLE__ANNOTATIONS_AND_MODIFIERS);
		}
		return annotationsAndModifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdditionalLocalVariable> getAdditionalLocalVariables() {
		if (additionalLocalVariables == null) {
			additionalLocalVariables = new EObjectContainmentEList<AdditionalLocalVariable>(AdditionalLocalVariable.class, this, VariablesPackage.LOCAL_VARIABLE__ADDITIONAL_LOCAL_VARIABLES);
		}
		return additionalLocalVariables;
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VariablesPackage.LOCAL_VARIABLE__INITIAL_VALUE:
				return basicSetInitialValue(null, msgs);
			case VariablesPackage.LOCAL_VARIABLE__ANNOTATIONS_AND_MODIFIERS:
				return ((InternalEList<?>)getAnnotationsAndModifiers()).basicRemove(otherEnd, msgs);
			case VariablesPackage.LOCAL_VARIABLE__ADDITIONAL_LOCAL_VARIABLES:
				return ((InternalEList<?>)getAdditionalLocalVariables()).basicRemove(otherEnd, msgs);
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
			case VariablesPackage.LOCAL_VARIABLE__INITIAL_VALUE:
				return getInitialValue();
			case VariablesPackage.LOCAL_VARIABLE__ANNOTATIONS_AND_MODIFIERS:
				return getAnnotationsAndModifiers();
			case VariablesPackage.LOCAL_VARIABLE__ADDITIONAL_LOCAL_VARIABLES:
				return getAdditionalLocalVariables();
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
			case VariablesPackage.LOCAL_VARIABLE__INITIAL_VALUE:
				setInitialValue((Expression)newValue);
				return;
			case VariablesPackage.LOCAL_VARIABLE__ANNOTATIONS_AND_MODIFIERS:
				getAnnotationsAndModifiers().clear();
				getAnnotationsAndModifiers().addAll((Collection<? extends AnnotationInstanceOrModifier>)newValue);
				return;
			case VariablesPackage.LOCAL_VARIABLE__ADDITIONAL_LOCAL_VARIABLES:
				getAdditionalLocalVariables().clear();
				getAdditionalLocalVariables().addAll((Collection<? extends AdditionalLocalVariable>)newValue);
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
			case VariablesPackage.LOCAL_VARIABLE__INITIAL_VALUE:
				setInitialValue((Expression)null);
				return;
			case VariablesPackage.LOCAL_VARIABLE__ANNOTATIONS_AND_MODIFIERS:
				getAnnotationsAndModifiers().clear();
				return;
			case VariablesPackage.LOCAL_VARIABLE__ADDITIONAL_LOCAL_VARIABLES:
				getAdditionalLocalVariables().clear();
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
			case VariablesPackage.LOCAL_VARIABLE__INITIAL_VALUE:
				return initialValue != null;
			case VariablesPackage.LOCAL_VARIABLE__ANNOTATIONS_AND_MODIFIERS:
				return annotationsAndModifiers != null && !annotationsAndModifiers.isEmpty();
			case VariablesPackage.LOCAL_VARIABLE__ADDITIONAL_LOCAL_VARIABLES:
				return additionalLocalVariables != null && !additionalLocalVariables.isEmpty();
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
				case VariablesPackage.LOCAL_VARIABLE__INITIAL_VALUE: return InstantiationsPackage.INITIALIZABLE__INITIAL_VALUE;
				default: return -1;
			}
		}
		if (baseClass == ForLoopInitializer.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AnnotableAndModifiable.class) {
			switch (derivedFeatureID) {
				case VariablesPackage.LOCAL_VARIABLE__ANNOTATIONS_AND_MODIFIERS: return ModifiersPackage.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS;
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
				case InstantiationsPackage.INITIALIZABLE__INITIAL_VALUE: return VariablesPackage.LOCAL_VARIABLE__INITIAL_VALUE;
				default: return -1;
			}
		}
		if (baseClass == ForLoopInitializer.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AnnotableAndModifiable.class) {
			switch (baseFeatureID) {
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS: return VariablesPackage.LOCAL_VARIABLE__ANNOTATIONS_AND_MODIFIERS;
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
		if (baseClass == ForLoopInitializer.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == AnnotableAndModifiable.class) {
			switch (baseOperationID) {
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_HIDDEN__COMMENTABLE: return VariablesPackage.LOCAL_VARIABLE___IS_HIDDEN__COMMENTABLE;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_STATIC: return VariablesPackage.LOCAL_VARIABLE___IS_STATIC;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___REMOVE_MODIFIER__CLASS: return VariablesPackage.LOCAL_VARIABLE___REMOVE_MODIFIER__CLASS;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PUBLIC: return VariablesPackage.LOCAL_VARIABLE___MAKE_PUBLIC;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PRIVATE: return VariablesPackage.LOCAL_VARIABLE___MAKE_PRIVATE;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PROTECTED: return VariablesPackage.LOCAL_VARIABLE___MAKE_PROTECTED;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___GET_MODIFIERS: return VariablesPackage.LOCAL_VARIABLE___GET_MODIFIERS;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___REMOVE_ALL_MODIFIERS: return VariablesPackage.LOCAL_VARIABLE___REMOVE_ALL_MODIFIERS;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___HAS_MODIFIER__CLASS: return VariablesPackage.LOCAL_VARIABLE___HAS_MODIFIER__CLASS;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_PUBLIC: return VariablesPackage.LOCAL_VARIABLE___IS_PUBLIC;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_PRIVATE: return VariablesPackage.LOCAL_VARIABLE___IS_PRIVATE;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_PROTECTED: return VariablesPackage.LOCAL_VARIABLE___IS_PROTECTED;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___ADD_MODIFIER__MODIFIER: return VariablesPackage.LOCAL_VARIABLE___ADD_MODIFIER__MODIFIER;
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
			case VariablesPackage.LOCAL_VARIABLE___IS_HIDDEN__COMMENTABLE:
				return isHidden((Commentable)arguments.get(0));
			case VariablesPackage.LOCAL_VARIABLE___IS_STATIC:
				return isStatic();
			case VariablesPackage.LOCAL_VARIABLE___REMOVE_MODIFIER__CLASS:
				removeModifier((Class<?>)arguments.get(0));
				return null;
			case VariablesPackage.LOCAL_VARIABLE___MAKE_PUBLIC:
				makePublic();
				return null;
			case VariablesPackage.LOCAL_VARIABLE___MAKE_PRIVATE:
				makePrivate();
				return null;
			case VariablesPackage.LOCAL_VARIABLE___MAKE_PROTECTED:
				makeProtected();
				return null;
			case VariablesPackage.LOCAL_VARIABLE___GET_MODIFIERS:
				return getModifiers();
			case VariablesPackage.LOCAL_VARIABLE___REMOVE_ALL_MODIFIERS:
				removeAllModifiers();
				return null;
			case VariablesPackage.LOCAL_VARIABLE___HAS_MODIFIER__CLASS:
				return hasModifier((Class<?>)arguments.get(0));
			case VariablesPackage.LOCAL_VARIABLE___IS_PUBLIC:
				return isPublic();
			case VariablesPackage.LOCAL_VARIABLE___IS_PRIVATE:
				return isPrivate();
			case VariablesPackage.LOCAL_VARIABLE___IS_PROTECTED:
				return isProtected();
			case VariablesPackage.LOCAL_VARIABLE___ADD_MODIFIER__MODIFIER:
				addModifier((Modifier)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //LocalVariableImpl
