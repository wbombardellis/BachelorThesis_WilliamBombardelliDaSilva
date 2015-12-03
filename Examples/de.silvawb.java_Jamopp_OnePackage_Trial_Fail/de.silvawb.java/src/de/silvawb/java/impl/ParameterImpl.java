/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.AnnotableAndModifiable;
import de.silvawb.java.AnnotationInstanceOrModifier;
import de.silvawb.java.Commentable;
import de.silvawb.java.JavaPackage;
import de.silvawb.java.Modifier;
import de.silvawb.java.Parameter;

import java.lang.Class;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.ParameterImpl#getAnnotationsAndModifiers <em>Annotations And Modifiers</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ParameterImpl extends VariableImpl implements Parameter {
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
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotationInstanceOrModifier> getAnnotationsAndModifiers() {
		if (annotationsAndModifiers == null) {
			annotationsAndModifiers = new EObjectContainmentEList<AnnotationInstanceOrModifier>(AnnotationInstanceOrModifier.class, this, JavaPackage.PARAMETER__ANNOTATIONS_AND_MODIFIERS);
		}
		return annotationsAndModifiers;
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
			case JavaPackage.PARAMETER__ANNOTATIONS_AND_MODIFIERS:
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
			case JavaPackage.PARAMETER__ANNOTATIONS_AND_MODIFIERS:
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
			case JavaPackage.PARAMETER__ANNOTATIONS_AND_MODIFIERS:
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
			case JavaPackage.PARAMETER__ANNOTATIONS_AND_MODIFIERS:
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
			case JavaPackage.PARAMETER__ANNOTATIONS_AND_MODIFIERS:
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
		if (baseClass == AnnotableAndModifiable.class) {
			switch (derivedFeatureID) {
				case JavaPackage.PARAMETER__ANNOTATIONS_AND_MODIFIERS: return JavaPackage.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS;
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
		if (baseClass == AnnotableAndModifiable.class) {
			switch (baseFeatureID) {
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS: return JavaPackage.PARAMETER__ANNOTATIONS_AND_MODIFIERS;
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
		if (baseClass == AnnotableAndModifiable.class) {
			switch (baseOperationID) {
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___IS_HIDDEN__COMMENTABLE: return JavaPackage.PARAMETER___IS_HIDDEN__COMMENTABLE;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___IS_STATIC: return JavaPackage.PARAMETER___IS_STATIC;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___REMOVE_MODIFIER__CLASS: return JavaPackage.PARAMETER___REMOVE_MODIFIER__CLASS;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PUBLIC: return JavaPackage.PARAMETER___MAKE_PUBLIC;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PRIVATE: return JavaPackage.PARAMETER___MAKE_PRIVATE;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PROTECTED: return JavaPackage.PARAMETER___MAKE_PROTECTED;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___GET_MODIFIERS: return JavaPackage.PARAMETER___GET_MODIFIERS;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___REMOVE_ALL_MODIFIERS: return JavaPackage.PARAMETER___REMOVE_ALL_MODIFIERS;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___HAS_MODIFIER__CLASS: return JavaPackage.PARAMETER___HAS_MODIFIER__CLASS;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___IS_PUBLIC: return JavaPackage.PARAMETER___IS_PUBLIC;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___IS_PRIVATE: return JavaPackage.PARAMETER___IS_PRIVATE;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___IS_PROTECTED: return JavaPackage.PARAMETER___IS_PROTECTED;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___ADD_MODIFIER__MODIFIER: return JavaPackage.PARAMETER___ADD_MODIFIER__MODIFIER;
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
			case JavaPackage.PARAMETER___IS_HIDDEN__COMMENTABLE:
				return isHidden((Commentable)arguments.get(0));
			case JavaPackage.PARAMETER___IS_STATIC:
				return isStatic();
			case JavaPackage.PARAMETER___REMOVE_MODIFIER__CLASS:
				removeModifier((Class<?>)arguments.get(0));
				return null;
			case JavaPackage.PARAMETER___MAKE_PUBLIC:
				makePublic();
				return null;
			case JavaPackage.PARAMETER___MAKE_PRIVATE:
				makePrivate();
				return null;
			case JavaPackage.PARAMETER___MAKE_PROTECTED:
				makeProtected();
				return null;
			case JavaPackage.PARAMETER___GET_MODIFIERS:
				return getModifiers();
			case JavaPackage.PARAMETER___REMOVE_ALL_MODIFIERS:
				removeAllModifiers();
				return null;
			case JavaPackage.PARAMETER___HAS_MODIFIER__CLASS:
				return hasModifier((Class<?>)arguments.get(0));
			case JavaPackage.PARAMETER___IS_PUBLIC:
				return isPublic();
			case JavaPackage.PARAMETER___IS_PRIVATE:
				return isPrivate();
			case JavaPackage.PARAMETER___IS_PROTECTED:
				return isProtected();
			case JavaPackage.PARAMETER___ADD_MODIFIER__MODIFIER:
				addModifier((Modifier)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ParameterImpl
