/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.AnnotationInstance;
import de.silvawb.java.AnonymousClass;
import de.silvawb.java.Commentable;
import de.silvawb.java.CompilationUnit;
import de.silvawb.java.ConcreteClassifier;
import de.silvawb.java.Interface;
import de.silvawb.java.JavaPackage;
import de.silvawb.java.Statement;

import de.silvawb.layout.LayoutInformation;

import java.lang.Class;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Commentable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.CommentableImpl#getLayoutInformations <em>Layout Informations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CommentableImpl extends MinimalEObjectImpl.Container implements Commentable {
	/**
	 * The cached value of the '{@link #getLayoutInformations() <em>Layout Informations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutInformations()
	 * @generated
	 * @ordered
	 */
	protected EList<LayoutInformation> layoutInformations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getCommentable();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LayoutInformation> getLayoutInformations() {
		if (layoutInformations == null) {
			layoutInformations = new EObjectContainmentEList<LayoutInformation>(LayoutInformation.class, this, JavaPackage.COMMENTABLE__LAYOUT_INFORMATIONS);
		}
		return layoutInformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteClassifier getConcreteClassifier(final String name) {
		return ( de.silvawb.java.ConcreteClassifier) org.eclipse.emf.ecore.util.EcoreUtil.resolve(
			de.silvawb.java.get(this).getClassifier(name), this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteClassifier getConcreteClassifierProxy(final String name) {
		return ( de.silvawb.java.ConcreteClassifier) de.silvawb.java.get(this).getClassifier(name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcreteClassifier> getConcreteClassifiers(final String packageName, final String classifierQuery) {
		org.eclipse.emf.common.util.EList< de.silvawb.java.ConcreteClassifier> result = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.ConcreteClassifier>();
		for( org.eclipse.emf.ecore.EObject classifier : de.silvawb.java.get(this).getClassifiers(packageName, classifierQuery)) {
			result.add(( de.silvawb.java.ConcreteClassifier) org.eclipse.emf.ecore.util.EcoreUtil.resolve(classifier, this));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcreteClassifier> getConcreteClassifierProxies(final String packageName, final String classifierQuery) {
		org.eclipse.emf.common.util.EList< de.silvawb.java.ConcreteClassifier> result = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.ConcreteClassifier>();
		for( org.eclipse.emf.ecore.EObject classifier : de.silvawb.java.get(this).getClassifiers(packageName, classifierQuery)) {
			result.add(( de.silvawb.java.ConcreteClassifier)classifier);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.silvawb.java.Class getLibClass(final String name) {
		de.silvawb.java.Class classClass = ( de.silvawb.java.Class) getConcreteClassifierProxy(
				"java.lang." + name);
		org.eclipse.emf.ecore.EObject resolved = ( de.silvawb.java.ConcreteClassifier) org.eclipse.emf.ecore.util.EcoreUtil.resolve(classClass, this);
		if (resolved instanceof de.silvawb.java.Class) {
			return ( de.silvawb.java.Class) resolved;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getLibInterface(final String name) {
		de.silvawb.java.ConcreteClassifier interfaceClass = getConcreteClassifierProxy(
				"java.lang." + name);
		org.eclipse.emf.ecore.EObject resolved = org.eclipse.emf.ecore.util.EcoreUtil.resolve(interfaceClass, this);
		if (resolved instanceof de.silvawb.java.Interface) {
			return ( de.silvawb.java.Interface) resolved;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.silvawb.java.Class getClassClass() {
		return getLibClass("Class");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.silvawb.java.Class getObjectClass() {
		return getLibClass("Object");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.silvawb.java.Class getStringClass() {
		return getLibClass("String");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getAnnotationInterface() {
		de.silvawb.java.Interface annotationClass = ( de.silvawb.java.Interface) org.eclipse.emf.ecore.util.EcoreUtil.resolve(
				getConcreteClassifierProxy("java.lang.annotation.Annotation"), this);
		org.eclipse.emf.ecore.EObject resolved = org.eclipse.emf.ecore.util.EcoreUtil.resolve(annotationClass, this);
		if (resolved instanceof de.silvawb.java.Interface) {
			return ( de.silvawb.java.Interface) resolved;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationInstance getContainingAnnotationInstance() {
		org.eclipse.emf.ecore.EObject value = this;
		while (!(value instanceof de.silvawb.java.AnnotationInstance) && value != null) {
			value = value.eContainer();
		}
		return ( de.silvawb.java.AnnotationInstance) value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousClass getContainingAnonymousClass() {
		org.eclipse.emf.ecore.EObject value = this;
		while (!(value instanceof de.silvawb.java.AnonymousClass) 
				&& !(value instanceof de.silvawb.java.ConcreteClassifier) //do not jump over other classifiers 
				&& value != null) {
			value = value.eContainer();
		}
		if (!(value instanceof de.silvawb.java.AnonymousClass)) {
			return null;
		}
		return ( de.silvawb.java.AnonymousClass) value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteClassifier getContainingConcreteClassifier() {
		org.eclipse.emf.ecore.EObject value = this;
		while (!(value instanceof de.silvawb.java.ConcreteClassifier) && value != null) {
			value = value.eContainer();
		}
		return ( de.silvawb.java.ConcreteClassifier) value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationUnit getContainingCompilationUnit() {
		org.eclipse.emf.ecore.EObject value = this;
		while (!(value instanceof de.silvawb.java.CompilationUnit) && value != null) {
			value = value.eContainer();
		}
		return ( de.silvawb.java.CompilationUnit) value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getContainingPackageName() {
		de.silvawb.java.CompilationUnit cu = getContainingCompilationUnit();
		if (cu == null) {
			return null;
		}
		
		int idx = cu.getNamespaces().size();
		if(cu.getName() != null) {
			char[] fullName = cu.getName().toCharArray();
			for(int i = 0; i < fullName.length; i++) {
				if (fullName[i] == '$') {
					idx--;
				}
			}
		}
		return new org.eclipse.emf.common.util.BasicEList< java.lang.String>(cu.getNamespaces().subList(0, idx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteClassifier getParentConcreteClassifier() {
		de.silvawb.java.ConcreteClassifier classifier = getContainingConcreteClassifier();
		if(classifier == null) {
			de.silvawb.java.CompilationUnit cu = getContainingCompilationUnit();
			//maybe the outer classifier is in an extra cu
			if (cu != null && cu.getName() != null && cu.getName().contains("$")) {
				classifier = ( de.silvawb.java.ConcreteClassifier) org.eclipse.emf.ecore.util.EcoreUtil.resolve(
				getConcreteClassifierProxy(cu.getNamespacesAsString()), this);
				if(classifier.eIsProxy())  {
					classifier = null;
				}
			}
		}
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getParentByEType(final EClass type) {
		org.eclipse.emf.ecore.EObject container = this.eContainer();
		while (container != null) {
			if (type.isInstance(container)) {
				return container;
			}
			container = container.eContainer();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getFirstChildByEType(final EClass type) {
		java.util.Iterator< org.eclipse.emf.ecore.EObject> it = this.eAllContents();
		while (it.hasNext()) {
			org.eclipse.emf.ecore.EObject next = it.next();
			if (type.isInstance(next)) {
				return next;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T> T getParentByType(final Class<T> type) {
		org.eclipse.emf.ecore.EObject container = this.eContainer();
		while (container != null) {
			if (type.isInstance(container)) {
				return type.cast(container);
			}
			container = container.eContainer();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T> T getFirstChildByType(final Class<T> type) {
		java.util.Iterator< org.eclipse.emf.ecore.EObject> it = this.eAllContents();
		while (it.hasNext()) {
			org.eclipse.emf.ecore.EObject next = it.next();
			if (type.isInstance(next)) {
				return type.cast(next);
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getChildrenByEType(final EClass type) {
		org.eclipse.emf.common.util.EList< org.eclipse.emf.ecore.EObject> children = new org.eclipse.emf.common.util.BasicEList< org.eclipse.emf.ecore.EObject>();
		java.util.Iterator< org.eclipse.emf.ecore.EObject> it = this.eAllContents();
		while (it.hasNext()) {
			org.eclipse.emf.ecore.EObject next = it.next();
			if (type.isInstance(next)) {
				children.add(next);
			}
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T> EList<T> getChildrenByType(final Class<T> type) {
		org.eclipse.emf.common.util.EList<T> children = new org.eclipse.emf.common.util.BasicEList<T>();
		java.util.Iterator< org.eclipse.emf.ecore.EObject> it = this.eAllContents();
		while (it.hasNext()) {
			org.eclipse.emf.ecore.EObject next = it.next();
			if (type.isInstance(next)) {
				children.add(type.cast(next));
			}
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getComments() {
		org.eclipse.emf.common.util.EList< java.lang.String> comments = new org.eclipse.emf.common.util.BasicEList< java.lang.String>();
		if (this instanceof de.silvawb.java.AnnotableAndModifiable) {
			for ( de.silvawb.java.AnnotationInstanceOrModifier aom : (( de.silvawb.java.AnnotableAndModifiable) this).getAnnotationsAndModifiers()) {
				comments.addAll(aom.getComments());
			}
		}
		for ( de.silvawb.layout.LayoutInformation layoutInformation : getLayoutInformations()) {
			java.lang.String text = layoutInformation.getHiddenTokenText();
			if (text.contains("/*") || text.contains("//")) {
				comments.add(layoutInformation.getHiddenTokenText().trim());
			}
		}
		return org.eclipse.emf.common.util.ECollections.unmodifiableEList(comments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addBeforeContainingStatement(final Statement statementToAdd) {
		org.eclipse.emf.ecore.EObject container = this.eContainer();
		org.eclipse.emf.ecore.EObject statement = this;
		while (container != null) {
			if (container instanceof de.silvawb.java.StatementListContainer) {
				break;
			}
			container = container.eContainer();
			statement = statement.eContainer();
		}
		if (container == null) {
			throw new java.lang.IllegalArgumentException("Element " + this + " is not contained in a StatementListContainer.");
		}
		de.silvawb.java.StatementListContainer statementListContainer = ( de.silvawb.java.StatementListContainer) container;
		org.eclipse.emf.common.util.EList< de.silvawb.java.Statement> statements = statementListContainer.getStatements();
		int index = statements.indexOf(statement);
		
		statements.add(index, statementToAdd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAfterContainingStatement(final Statement statementToAdd) {
		org.eclipse.emf.ecore.EObject container = this.eContainer();
		org.eclipse.emf.ecore.EObject statement = this;
		while (container != null) {
			if (container instanceof de.silvawb.java.StatementListContainer) {
				break;
			}
			container = container.eContainer();
			statement = statement.eContainer();
		}
		if (container == null) {
			throw new java.lang.IllegalArgumentException("Element " + this + " is not contained in a StatementListContainer.");
		}
		de.silvawb.java.StatementListContainer statementListContainer = ( de.silvawb.java.StatementListContainer) container;
		org.eclipse.emf.common.util.EList< de.silvawb.java.Statement> statements = statementListContainer.getStatements();
		int index = statements.indexOf(statement);
		
		if (index == statements.size() - 1) {
			// statement is the last one
			statements.add(statementToAdd);
		} else {
			statements.add(index + 1, statementToAdd);
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
			case JavaPackage.COMMENTABLE__LAYOUT_INFORMATIONS:
				return ((InternalEList<?>)getLayoutInformations()).basicRemove(otherEnd, msgs);
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
			case JavaPackage.COMMENTABLE__LAYOUT_INFORMATIONS:
				return getLayoutInformations();
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
			case JavaPackage.COMMENTABLE__LAYOUT_INFORMATIONS:
				getLayoutInformations().clear();
				getLayoutInformations().addAll((Collection<? extends LayoutInformation>)newValue);
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
			case JavaPackage.COMMENTABLE__LAYOUT_INFORMATIONS:
				getLayoutInformations().clear();
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
			case JavaPackage.COMMENTABLE__LAYOUT_INFORMATIONS:
				return layoutInformations != null && !layoutInformations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings({"rawtypes", "unchecked" })
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JavaPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER__STRING:
				return getConcreteClassifier((String)arguments.get(0));
			case JavaPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING:
				return getConcreteClassifierProxy((String)arguments.get(0));
			case JavaPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING:
				return getConcreteClassifiers((String)arguments.get(0), (String)arguments.get(1));
			case JavaPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING:
				return getConcreteClassifierProxies((String)arguments.get(0), (String)arguments.get(1));
			case JavaPackage.COMMENTABLE___GET_LIB_CLASS__STRING:
				return getLibClass((String)arguments.get(0));
			case JavaPackage.COMMENTABLE___GET_LIB_INTERFACE__STRING:
				return getLibInterface((String)arguments.get(0));
			case JavaPackage.COMMENTABLE___GET_CLASS_CLASS:
				return getClassClass();
			case JavaPackage.COMMENTABLE___GET_OBJECT_CLASS:
				return getObjectClass();
			case JavaPackage.COMMENTABLE___GET_STRING_CLASS:
				return getStringClass();
			case JavaPackage.COMMENTABLE___GET_ANNOTATION_INTERFACE:
				return getAnnotationInterface();
			case JavaPackage.COMMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE:
				return getContainingAnnotationInstance();
			case JavaPackage.COMMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS:
				return getContainingAnonymousClass();
			case JavaPackage.COMMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER:
				return getContainingConcreteClassifier();
			case JavaPackage.COMMENTABLE___GET_CONTAINING_COMPILATION_UNIT:
				return getContainingCompilationUnit();
			case JavaPackage.COMMENTABLE___GET_CONTAINING_PACKAGE_NAME:
				return getContainingPackageName();
			case JavaPackage.COMMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER:
				return getParentConcreteClassifier();
			case JavaPackage.COMMENTABLE___GET_PARENT_BY_ETYPE__ECLASS:
				return getParentByEType((EClass)arguments.get(0));
			case JavaPackage.COMMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS:
				return getFirstChildByEType((EClass)arguments.get(0));
			case JavaPackage.COMMENTABLE___GET_PARENT_BY_TYPE__CLASS:
				return getParentByType((Class)arguments.get(0));
			case JavaPackage.COMMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS:
				return getFirstChildByType((Class)arguments.get(0));
			case JavaPackage.COMMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS:
				return getChildrenByEType((EClass)arguments.get(0));
			case JavaPackage.COMMENTABLE___GET_CHILDREN_BY_TYPE__CLASS:
				return getChildrenByType((Class)arguments.get(0));
			case JavaPackage.COMMENTABLE___GET_COMMENTS:
				return getComments();
			case JavaPackage.COMMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT:
				addBeforeContainingStatement((Statement)arguments.get(0));
				return null;
			case JavaPackage.COMMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT:
				addAfterContainingStatement((Statement)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //CommentableImpl
