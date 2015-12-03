/**
 */
package de.silvawb.java.members.impl;

import de.silvawb.java.commons.Commentable;

import de.silvawb.java.generics.GenericsPackage;
import de.silvawb.java.generics.TypeParameter;
import de.silvawb.java.generics.TypeParametrizable;

import de.silvawb.java.members.Constructor;
import de.silvawb.java.members.ExceptionThrower;
import de.silvawb.java.members.MembersPackage;

import de.silvawb.java.modifiers.AnnotableAndModifiable;
import de.silvawb.java.modifiers.AnnotationInstanceOrModifier;
import de.silvawb.java.modifiers.Modifier;
import de.silvawb.java.modifiers.ModifiersPackage;

import de.silvawb.java.parameters.Parameter;
import de.silvawb.java.parameters.ParametersPackage;
import de.silvawb.java.parameters.Parametrizable;

import de.silvawb.java.statements.Statement;
import de.silvawb.java.statements.StatementListContainer;
import de.silvawb.java.statements.StatementsPackage;

import de.silvawb.java.types.NamespaceClassifierReference;

import de.silvawb.java.variables.LocalVariable;

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
 * An implementation of the model object '<em><b>Constructor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.members.impl.ConstructorImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link de.silvawb.java.members.impl.ConstructorImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.silvawb.java.members.impl.ConstructorImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link de.silvawb.java.members.impl.ConstructorImpl#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link de.silvawb.java.members.impl.ConstructorImpl#getAnnotationsAndModifiers <em>Annotations And Modifiers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstructorImpl extends MemberImpl implements Constructor {
	/**
	 * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> statements;

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
	 * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeParameter> typeParameters;

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
	protected ConstructorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MembersPackage.Literals.CONSTRUCTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getStatements() {
		if (statements == null) {
			statements = new EObjectContainmentEList<Statement>(Statement.class, this, MembersPackage.CONSTRUCTOR__STATEMENTS);
		}
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, MembersPackage.CONSTRUCTOR__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeParameter> getTypeParameters() {
		if (typeParameters == null) {
			typeParameters = new EObjectContainmentEList<TypeParameter>(TypeParameter.class, this, MembersPackage.CONSTRUCTOR__TYPE_PARAMETERS);
		}
		return typeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamespaceClassifierReference> getExceptions() {
		if (exceptions == null) {
			exceptions = new EObjectContainmentEList<NamespaceClassifierReference>(NamespaceClassifierReference.class, this, MembersPackage.CONSTRUCTOR__EXCEPTIONS);
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
			annotationsAndModifiers = new EObjectContainmentEList<AnnotationInstanceOrModifier>(AnnotationInstanceOrModifier.class, this, MembersPackage.CONSTRUCTOR__ANNOTATIONS_AND_MODIFIERS);
		}
		return annotationsAndModifiers;
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
	public LocalVariable getLocalVariable(final String name) {
		org.eclipse.emf.common.util.EList< de.silvawb.java.variables.LocalVariable> localVariables = getChildrenByType( de.silvawb.java.variables.LocalVariable.class);
		for ( de.silvawb.java.variables.LocalVariable localVariable : localVariables) {
			if (localVariable.getName().equals(name)) {
				return localVariable;
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
			case MembersPackage.CONSTRUCTOR__STATEMENTS:
				return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
			case MembersPackage.CONSTRUCTOR__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case MembersPackage.CONSTRUCTOR__TYPE_PARAMETERS:
				return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
			case MembersPackage.CONSTRUCTOR__EXCEPTIONS:
				return ((InternalEList<?>)getExceptions()).basicRemove(otherEnd, msgs);
			case MembersPackage.CONSTRUCTOR__ANNOTATIONS_AND_MODIFIERS:
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
			case MembersPackage.CONSTRUCTOR__STATEMENTS:
				return getStatements();
			case MembersPackage.CONSTRUCTOR__PARAMETERS:
				return getParameters();
			case MembersPackage.CONSTRUCTOR__TYPE_PARAMETERS:
				return getTypeParameters();
			case MembersPackage.CONSTRUCTOR__EXCEPTIONS:
				return getExceptions();
			case MembersPackage.CONSTRUCTOR__ANNOTATIONS_AND_MODIFIERS:
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
			case MembersPackage.CONSTRUCTOR__STATEMENTS:
				getStatements().clear();
				getStatements().addAll((Collection<? extends Statement>)newValue);
				return;
			case MembersPackage.CONSTRUCTOR__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case MembersPackage.CONSTRUCTOR__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends TypeParameter>)newValue);
				return;
			case MembersPackage.CONSTRUCTOR__EXCEPTIONS:
				getExceptions().clear();
				getExceptions().addAll((Collection<? extends NamespaceClassifierReference>)newValue);
				return;
			case MembersPackage.CONSTRUCTOR__ANNOTATIONS_AND_MODIFIERS:
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
			case MembersPackage.CONSTRUCTOR__STATEMENTS:
				getStatements().clear();
				return;
			case MembersPackage.CONSTRUCTOR__PARAMETERS:
				getParameters().clear();
				return;
			case MembersPackage.CONSTRUCTOR__TYPE_PARAMETERS:
				getTypeParameters().clear();
				return;
			case MembersPackage.CONSTRUCTOR__EXCEPTIONS:
				getExceptions().clear();
				return;
			case MembersPackage.CONSTRUCTOR__ANNOTATIONS_AND_MODIFIERS:
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
			case MembersPackage.CONSTRUCTOR__STATEMENTS:
				return statements != null && !statements.isEmpty();
			case MembersPackage.CONSTRUCTOR__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case MembersPackage.CONSTRUCTOR__TYPE_PARAMETERS:
				return typeParameters != null && !typeParameters.isEmpty();
			case MembersPackage.CONSTRUCTOR__EXCEPTIONS:
				return exceptions != null && !exceptions.isEmpty();
			case MembersPackage.CONSTRUCTOR__ANNOTATIONS_AND_MODIFIERS:
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
		if (baseClass == StatementListContainer.class) {
			switch (derivedFeatureID) {
				case MembersPackage.CONSTRUCTOR__STATEMENTS: return StatementsPackage.STATEMENT_LIST_CONTAINER__STATEMENTS;
				default: return -1;
			}
		}
		if (baseClass == Parametrizable.class) {
			switch (derivedFeatureID) {
				case MembersPackage.CONSTRUCTOR__PARAMETERS: return ParametersPackage.PARAMETRIZABLE__PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == TypeParametrizable.class) {
			switch (derivedFeatureID) {
				case MembersPackage.CONSTRUCTOR__TYPE_PARAMETERS: return GenericsPackage.TYPE_PARAMETRIZABLE__TYPE_PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == ExceptionThrower.class) {
			switch (derivedFeatureID) {
				case MembersPackage.CONSTRUCTOR__EXCEPTIONS: return MembersPackage.EXCEPTION_THROWER__EXCEPTIONS;
				default: return -1;
			}
		}
		if (baseClass == AnnotableAndModifiable.class) {
			switch (derivedFeatureID) {
				case MembersPackage.CONSTRUCTOR__ANNOTATIONS_AND_MODIFIERS: return ModifiersPackage.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS;
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
		if (baseClass == StatementListContainer.class) {
			switch (baseFeatureID) {
				case StatementsPackage.STATEMENT_LIST_CONTAINER__STATEMENTS: return MembersPackage.CONSTRUCTOR__STATEMENTS;
				default: return -1;
			}
		}
		if (baseClass == Parametrizable.class) {
			switch (baseFeatureID) {
				case ParametersPackage.PARAMETRIZABLE__PARAMETERS: return MembersPackage.CONSTRUCTOR__PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == TypeParametrizable.class) {
			switch (baseFeatureID) {
				case GenericsPackage.TYPE_PARAMETRIZABLE__TYPE_PARAMETERS: return MembersPackage.CONSTRUCTOR__TYPE_PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == ExceptionThrower.class) {
			switch (baseFeatureID) {
				case MembersPackage.EXCEPTION_THROWER__EXCEPTIONS: return MembersPackage.CONSTRUCTOR__EXCEPTIONS;
				default: return -1;
			}
		}
		if (baseClass == AnnotableAndModifiable.class) {
			switch (baseFeatureID) {
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS: return MembersPackage.CONSTRUCTOR__ANNOTATIONS_AND_MODIFIERS;
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
		if (baseClass == StatementListContainer.class) {
			switch (baseOperationID) {
				case StatementsPackage.STATEMENT_LIST_CONTAINER___GET_LOCAL_VARIABLE__STRING: return MembersPackage.CONSTRUCTOR___GET_LOCAL_VARIABLE__STRING;
				default: return -1;
			}
		}
		if (baseClass == Parametrizable.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == TypeParametrizable.class) {
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
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_HIDDEN__COMMENTABLE: return MembersPackage.CONSTRUCTOR___IS_HIDDEN__COMMENTABLE;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_STATIC: return MembersPackage.CONSTRUCTOR___IS_STATIC;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___REMOVE_MODIFIER__CLASS: return MembersPackage.CONSTRUCTOR___REMOVE_MODIFIER__CLASS;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PUBLIC: return MembersPackage.CONSTRUCTOR___MAKE_PUBLIC;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PRIVATE: return MembersPackage.CONSTRUCTOR___MAKE_PRIVATE;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PROTECTED: return MembersPackage.CONSTRUCTOR___MAKE_PROTECTED;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___GET_MODIFIERS: return MembersPackage.CONSTRUCTOR___GET_MODIFIERS;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___REMOVE_ALL_MODIFIERS: return MembersPackage.CONSTRUCTOR___REMOVE_ALL_MODIFIERS;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___HAS_MODIFIER__CLASS: return MembersPackage.CONSTRUCTOR___HAS_MODIFIER__CLASS;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_PUBLIC: return MembersPackage.CONSTRUCTOR___IS_PUBLIC;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_PRIVATE: return MembersPackage.CONSTRUCTOR___IS_PRIVATE;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_PROTECTED: return MembersPackage.CONSTRUCTOR___IS_PROTECTED;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___ADD_MODIFIER__MODIFIER: return MembersPackage.CONSTRUCTOR___ADD_MODIFIER__MODIFIER;
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
			case MembersPackage.CONSTRUCTOR___IS_HIDDEN__COMMENTABLE:
				return isHidden((Commentable)arguments.get(0));
			case MembersPackage.CONSTRUCTOR___IS_STATIC:
				return isStatic();
			case MembersPackage.CONSTRUCTOR___REMOVE_MODIFIER__CLASS:
				removeModifier((Class<?>)arguments.get(0));
				return null;
			case MembersPackage.CONSTRUCTOR___MAKE_PUBLIC:
				makePublic();
				return null;
			case MembersPackage.CONSTRUCTOR___MAKE_PRIVATE:
				makePrivate();
				return null;
			case MembersPackage.CONSTRUCTOR___MAKE_PROTECTED:
				makeProtected();
				return null;
			case MembersPackage.CONSTRUCTOR___GET_MODIFIERS:
				return getModifiers();
			case MembersPackage.CONSTRUCTOR___REMOVE_ALL_MODIFIERS:
				removeAllModifiers();
				return null;
			case MembersPackage.CONSTRUCTOR___HAS_MODIFIER__CLASS:
				return hasModifier((Class<?>)arguments.get(0));
			case MembersPackage.CONSTRUCTOR___IS_PUBLIC:
				return isPublic();
			case MembersPackage.CONSTRUCTOR___IS_PRIVATE:
				return isPrivate();
			case MembersPackage.CONSTRUCTOR___IS_PROTECTED:
				return isProtected();
			case MembersPackage.CONSTRUCTOR___ADD_MODIFIER__MODIFIER:
				addModifier((Modifier)arguments.get(0));
				return null;
			case MembersPackage.CONSTRUCTOR___GET_LOCAL_VARIABLE__STRING:
				return getLocalVariable((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConstructorImpl
