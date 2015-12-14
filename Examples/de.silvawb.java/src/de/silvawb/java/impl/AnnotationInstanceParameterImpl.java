/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.AnnotationInstance;
import de.silvawb.java.AnnotationInstanceParameter;
import de.silvawb.java.AnnotationInstanceValue;
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
 * An implementation of the model object '<em><b>Annotation Instance Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.AnnotationInstanceParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.silvawb.java.impl.AnnotationInstanceParameterImpl#getValues <em>Values</em>}</li>
 *   <li>{@link de.silvawb.java.impl.AnnotationInstanceParameterImpl#getInstance <em>Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationInstanceParameterImpl extends MinimalEObjectImpl.Container implements AnnotationInstanceParameter {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationInstanceValue> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationInstanceParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.ANNOTATION_INSTANCE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.ANNOTATION_INSTANCE_PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotationInstanceValue> getValues() {
		if (values == null) {
			values = new EObjectContainmentWithInverseEList<AnnotationInstanceValue>(AnnotationInstanceValue.class, this, JavaPackage.ANNOTATION_INSTANCE_PARAMETER__VALUES, JavaPackage.ANNOTATION_INSTANCE_VALUE__PARAMETER);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationInstance getInstance() {
		if (eContainerFeatureID() != JavaPackage.ANNOTATION_INSTANCE_PARAMETER__INSTANCE) return null;
		return (AnnotationInstance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstance(AnnotationInstance newInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInstance, JavaPackage.ANNOTATION_INSTANCE_PARAMETER__INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance(AnnotationInstance newInstance) {
		if (newInstance != eInternalContainer() || (eContainerFeatureID() != JavaPackage.ANNOTATION_INSTANCE_PARAMETER__INSTANCE && newInstance != null)) {
			if (EcoreUtil.isAncestor(this, newInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInstance != null)
				msgs = ((InternalEObject)newInstance).eInverseAdd(this, JavaPackage.ANNOTATION_INSTANCE__PARAMETERS, AnnotationInstance.class, msgs);
			msgs = basicSetInstance(newInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.ANNOTATION_INSTANCE_PARAMETER__INSTANCE, newInstance, newInstance));
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
			case JavaPackage.ANNOTATION_INSTANCE_PARAMETER__VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValues()).basicAdd(otherEnd, msgs);
			case JavaPackage.ANNOTATION_INSTANCE_PARAMETER__INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInstance((AnnotationInstance)otherEnd, msgs);
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
			case JavaPackage.ANNOTATION_INSTANCE_PARAMETER__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
			case JavaPackage.ANNOTATION_INSTANCE_PARAMETER__INSTANCE:
				return basicSetInstance(null, msgs);
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
			case JavaPackage.ANNOTATION_INSTANCE_PARAMETER__INSTANCE:
				return eInternalContainer().eInverseRemove(this, JavaPackage.ANNOTATION_INSTANCE__PARAMETERS, AnnotationInstance.class, msgs);
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
			case JavaPackage.ANNOTATION_INSTANCE_PARAMETER__NAME:
				return getName();
			case JavaPackage.ANNOTATION_INSTANCE_PARAMETER__VALUES:
				return getValues();
			case JavaPackage.ANNOTATION_INSTANCE_PARAMETER__INSTANCE:
				return getInstance();
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
			case JavaPackage.ANNOTATION_INSTANCE_PARAMETER__NAME:
				setName((String)newValue);
				return;
			case JavaPackage.ANNOTATION_INSTANCE_PARAMETER__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends AnnotationInstanceValue>)newValue);
				return;
			case JavaPackage.ANNOTATION_INSTANCE_PARAMETER__INSTANCE:
				setInstance((AnnotationInstance)newValue);
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
			case JavaPackage.ANNOTATION_INSTANCE_PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JavaPackage.ANNOTATION_INSTANCE_PARAMETER__VALUES:
				getValues().clear();
				return;
			case JavaPackage.ANNOTATION_INSTANCE_PARAMETER__INSTANCE:
				setInstance((AnnotationInstance)null);
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
			case JavaPackage.ANNOTATION_INSTANCE_PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JavaPackage.ANNOTATION_INSTANCE_PARAMETER__VALUES:
				return values != null && !values.isEmpty();
			case JavaPackage.ANNOTATION_INSTANCE_PARAMETER__INSTANCE:
				return getInstance() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AnnotationInstanceParameterImpl
