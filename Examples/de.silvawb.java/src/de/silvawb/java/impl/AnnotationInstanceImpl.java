/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.Annotable;
import de.silvawb.java.Annotation;
import de.silvawb.java.AnnotationInstance;
import de.silvawb.java.AnnotationInstanceParameter;
import de.silvawb.java.JavaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.AnnotationInstanceImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link de.silvawb.java.impl.AnnotationInstanceImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.silvawb.java.impl.AnnotationInstanceImpl#getAnnotable <em>Annotable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationInstanceImpl extends MinimalEObjectImpl.Container implements AnnotationInstance {
	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation annotation;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationInstanceParameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.ANNOTATION_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation getAnnotation() {
		if (annotation != null && annotation.eIsProxy()) {
			InternalEObject oldAnnotation = (InternalEObject)annotation;
			annotation = (Annotation)eResolveProxy(oldAnnotation);
			if (annotation != oldAnnotation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaPackage.ANNOTATION_INSTANCE__ANNOTATION, oldAnnotation, annotation));
			}
		}
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation basicGetAnnotation() {
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotation(Annotation newAnnotation) {
		Annotation oldAnnotation = annotation;
		annotation = newAnnotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.ANNOTATION_INSTANCE__ANNOTATION, oldAnnotation, annotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotationInstanceParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentWithInverseEList<AnnotationInstanceParameter>(AnnotationInstanceParameter.class, this, JavaPackage.ANNOTATION_INSTANCE__PARAMETERS, JavaPackage.ANNOTATION_INSTANCE_PARAMETER__INSTANCE);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotable getAnnotable() {
		if (eContainerFeatureID() != JavaPackage.ANNOTATION_INSTANCE__ANNOTABLE) return null;
		return (Annotable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotable(Annotable newAnnotable, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAnnotable, JavaPackage.ANNOTATION_INSTANCE__ANNOTABLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotable(Annotable newAnnotable) {
		if (newAnnotable != eInternalContainer() || (eContainerFeatureID() != JavaPackage.ANNOTATION_INSTANCE__ANNOTABLE && newAnnotable != null)) {
			if (EcoreUtil.isAncestor(this, newAnnotable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAnnotable != null)
				msgs = ((InternalEObject)newAnnotable).eInverseAdd(this, JavaPackage.ANNOTABLE__ANNOTATION_INSTANCES, Annotable.class, msgs);
			msgs = basicSetAnnotable(newAnnotable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.ANNOTATION_INSTANCE__ANNOTABLE, newAnnotable, newAnnotable));
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
			case JavaPackage.ANNOTATION_INSTANCE__PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameters()).basicAdd(otherEnd, msgs);
			case JavaPackage.ANNOTATION_INSTANCE__ANNOTABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAnnotable((Annotable)otherEnd, msgs);
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
			case JavaPackage.ANNOTATION_INSTANCE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case JavaPackage.ANNOTATION_INSTANCE__ANNOTABLE:
				return basicSetAnnotable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case JavaPackage.ANNOTATION_INSTANCE__ANNOTABLE:
				return eInternalContainer().eInverseRemove(this, JavaPackage.ANNOTABLE__ANNOTATION_INSTANCES, Annotable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaPackage.ANNOTATION_INSTANCE__ANNOTATION:
				if (resolve) return getAnnotation();
				return basicGetAnnotation();
			case JavaPackage.ANNOTATION_INSTANCE__PARAMETERS:
				return getParameters();
			case JavaPackage.ANNOTATION_INSTANCE__ANNOTABLE:
				return getAnnotable();
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
			case JavaPackage.ANNOTATION_INSTANCE__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case JavaPackage.ANNOTATION_INSTANCE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends AnnotationInstanceParameter>)newValue);
				return;
			case JavaPackage.ANNOTATION_INSTANCE__ANNOTABLE:
				setAnnotable((Annotable)newValue);
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
			case JavaPackage.ANNOTATION_INSTANCE__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case JavaPackage.ANNOTATION_INSTANCE__PARAMETERS:
				getParameters().clear();
				return;
			case JavaPackage.ANNOTATION_INSTANCE__ANNOTABLE:
				setAnnotable((Annotable)null);
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
			case JavaPackage.ANNOTATION_INSTANCE__ANNOTATION:
				return annotation != null;
			case JavaPackage.ANNOTATION_INSTANCE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case JavaPackage.ANNOTATION_INSTANCE__ANNOTABLE:
				return getAnnotable() != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnotationInstanceImpl
