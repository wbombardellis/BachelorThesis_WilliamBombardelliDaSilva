/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.Annotable;
import de.silvawb.java.AnnotationInstance;
import de.silvawb.java.JavaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.AnnotableImpl#getAnnotationInstances <em>Annotation Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotableImpl extends MinimalEObjectImpl.Container implements Annotable {
	/**
	 * The cached value of the '{@link #getAnnotationInstances() <em>Annotation Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationInstance> annotationInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.ANNOTABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotationInstance> getAnnotationInstances() {
		if (annotationInstances == null) {
			annotationInstances = new EObjectContainmentWithInverseEList<AnnotationInstance>(AnnotationInstance.class, this, JavaPackage.ANNOTABLE__ANNOTATION_INSTANCES, JavaPackage.ANNOTATION_INSTANCE__ANNOTABLE);
		}
		return annotationInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.ANNOTABLE__ANNOTATION_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnnotationInstances()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.ANNOTABLE__ANNOTATION_INSTANCES:
				return ((InternalEList<?>)getAnnotationInstances()).basicRemove(otherEnd, msgs);
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
			case JavaPackage.ANNOTABLE__ANNOTATION_INSTANCES:
				return getAnnotationInstances();
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
			case JavaPackage.ANNOTABLE__ANNOTATION_INSTANCES:
				getAnnotationInstances().clear();
				getAnnotationInstances().addAll((Collection<? extends AnnotationInstance>)newValue);
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
			case JavaPackage.ANNOTABLE__ANNOTATION_INSTANCES:
				getAnnotationInstances().clear();
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
			case JavaPackage.ANNOTABLE__ANNOTATION_INSTANCES:
				return annotationInstances != null && !annotationInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnnotableImpl
