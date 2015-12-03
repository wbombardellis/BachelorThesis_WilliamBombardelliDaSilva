/**
 */
package de.silvawb.java.containers.impl;

import de.silvawb.java.annotations.Annotable;
import de.silvawb.java.annotations.AnnotationInstance;
import de.silvawb.java.annotations.AnnotationsPackage;

import de.silvawb.java.classifiers.ConcreteClassifier;

import de.silvawb.java.commons.CommonsPackage;
import de.silvawb.java.commons.NamespaceAwareElement;

import de.silvawb.java.containers.CompilationUnit;
import de.silvawb.java.containers.ContainersPackage;
import de.silvawb.java.containers.JavaRoot;

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
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.containers.impl.PackageImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link de.silvawb.java.containers.impl.PackageImpl#getCompilationUnits <em>Compilation Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends JavaRootImpl implements de.silvawb.java.containers.Package {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationInstance> annotations;

	/**
	 * The cached value of the '{@link #getCompilationUnits() <em>Compilation Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompilationUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<CompilationUnit> compilationUnits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContainersPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotationInstance> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<AnnotationInstance>(AnnotationInstance.class, this, ContainersPackage.PACKAGE__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompilationUnit> getCompilationUnits() {
		if (compilationUnits == null) {
			compilationUnits = new EObjectContainmentEList<CompilationUnit>(CompilationUnit.class, this, ContainersPackage.PACKAGE__COMPILATION_UNITS);
		}
		return compilationUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespacesAsString() {
		java.lang.String packageName = ""; 
		for( java.util.Iterator< java.lang.String> it = getNamespaces().iterator(); it.hasNext(); ) {
			java.lang.String namespaceFragment = it.next();
			packageName = packageName + namespaceFragment + org.emftext.language.java.JavaUniquePathConstructor.PACKAGE_SEPARATOR;
		}
		return packageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcreteClassifier> getClassifiersInSamePackage() {
		org.eclipse.emf.common.util.EList< de.silvawb.java.classifiers.ConcreteClassifier> defaultImportList = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.classifiers.ConcreteClassifier>();
		
		java.lang.String packageName = getNamespacesAsString();
		
		defaultImportList.addAll(getConcreteClassifierProxies(
				packageName + getName(), "*"));
		
		return defaultImportList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContainersPackage.PACKAGE__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case ContainersPackage.PACKAGE__COMPILATION_UNITS:
				return ((InternalEList<?>)getCompilationUnits()).basicRemove(otherEnd, msgs);
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
			case ContainersPackage.PACKAGE__ANNOTATIONS:
				return getAnnotations();
			case ContainersPackage.PACKAGE__COMPILATION_UNITS:
				return getCompilationUnits();
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
			case ContainersPackage.PACKAGE__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends AnnotationInstance>)newValue);
				return;
			case ContainersPackage.PACKAGE__COMPILATION_UNITS:
				getCompilationUnits().clear();
				getCompilationUnits().addAll((Collection<? extends CompilationUnit>)newValue);
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
			case ContainersPackage.PACKAGE__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case ContainersPackage.PACKAGE__COMPILATION_UNITS:
				getCompilationUnits().clear();
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
			case ContainersPackage.PACKAGE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case ContainersPackage.PACKAGE__COMPILATION_UNITS:
				return compilationUnits != null && !compilationUnits.isEmpty();
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
		if (baseClass == Annotable.class) {
			switch (derivedFeatureID) {
				case ContainersPackage.PACKAGE__ANNOTATIONS: return AnnotationsPackage.ANNOTABLE__ANNOTATIONS;
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
		if (baseClass == Annotable.class) {
			switch (baseFeatureID) {
				case AnnotationsPackage.ANNOTABLE__ANNOTATIONS: return ContainersPackage.PACKAGE__ANNOTATIONS;
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
		if (baseClass == NamespaceAwareElement.class) {
			switch (baseOperationID) {
				case CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_NAMESPACES_AS_STRING: return ContainersPackage.PACKAGE___GET_NAMESPACES_AS_STRING;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == JavaRoot.class) {
			switch (baseOperationID) {
				case ContainersPackage.JAVA_ROOT___GET_CLASSIFIERS_IN_SAME_PACKAGE: return ContainersPackage.PACKAGE___GET_CLASSIFIERS_IN_SAME_PACKAGE;
				case ContainersPackage.JAVA_ROOT___GET_NAMESPACES_AS_STRING: return ContainersPackage.PACKAGE___GET_NAMESPACES_AS_STRING;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Annotable.class) {
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
			case ContainersPackage.PACKAGE___GET_NAMESPACES_AS_STRING:
				return getNamespacesAsString();
			case ContainersPackage.PACKAGE___GET_CLASSIFIERS_IN_SAME_PACKAGE:
				return getClassifiersInSamePackage();
		}
		return super.eInvoke(operationID, arguments);
	}

} //PackageImpl
