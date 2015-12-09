/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.Classifier;
import de.silvawb.java.JavaPackage;
import de.silvawb.java.TemplateBinding;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.TemplateBindingImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.silvawb.java.impl.TemplateBindingImpl#getTypeOverClassifier <em>Type Over Classifier</em>}</li>
 *   <li>{@link de.silvawb.java.impl.TemplateBindingImpl#getOverClassifier <em>Over Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateBindingImpl extends MinimalEObjectImpl.Container implements TemplateBinding {
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
	 * The default value of the '{@link #getTypeOverClassifier() <em>Type Over Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOverClassifier()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_OVER_CLASSIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeOverClassifier() <em>Type Over Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOverClassifier()
	 * @generated
	 * @ordered
	 */
	protected String typeOverClassifier = TYPE_OVER_CLASSIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOverClassifier() <em>Over Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverClassifier()
	 * @generated
	 * @ordered
	 */
	protected Classifier overClassifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.TEMPLATE_BINDING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.TEMPLATE_BINDING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeOverClassifier() {
		return typeOverClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeOverClassifier(String newTypeOverClassifier) {
		String oldTypeOverClassifier = typeOverClassifier;
		typeOverClassifier = newTypeOverClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.TEMPLATE_BINDING__TYPE_OVER_CLASSIFIER, oldTypeOverClassifier, typeOverClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getOverClassifier() {
		if (overClassifier != null && overClassifier.eIsProxy()) {
			InternalEObject oldOverClassifier = (InternalEObject)overClassifier;
			overClassifier = (Classifier)eResolveProxy(oldOverClassifier);
			if (overClassifier != oldOverClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaPackage.TEMPLATE_BINDING__OVER_CLASSIFIER, oldOverClassifier, overClassifier));
			}
		}
		return overClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetOverClassifier() {
		return overClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverClassifier(Classifier newOverClassifier, NotificationChain msgs) {
		Classifier oldOverClassifier = overClassifier;
		overClassifier = newOverClassifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.TEMPLATE_BINDING__OVER_CLASSIFIER, oldOverClassifier, newOverClassifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverClassifier(Classifier newOverClassifier) {
		if (newOverClassifier != overClassifier) {
			NotificationChain msgs = null;
			if (overClassifier != null)
				msgs = ((InternalEObject)overClassifier).eInverseRemove(this, JavaPackage.CLASSIFIER__UNDER_TEMPLATE_BINDINGS, Classifier.class, msgs);
			if (newOverClassifier != null)
				msgs = ((InternalEObject)newOverClassifier).eInverseAdd(this, JavaPackage.CLASSIFIER__UNDER_TEMPLATE_BINDINGS, Classifier.class, msgs);
			msgs = basicSetOverClassifier(newOverClassifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.TEMPLATE_BINDING__OVER_CLASSIFIER, newOverClassifier, newOverClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.TEMPLATE_BINDING__OVER_CLASSIFIER:
				if (overClassifier != null)
					msgs = ((InternalEObject)overClassifier).eInverseRemove(this, JavaPackage.CLASSIFIER__UNDER_TEMPLATE_BINDINGS, Classifier.class, msgs);
				return basicSetOverClassifier((Classifier)otherEnd, msgs);
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
			case JavaPackage.TEMPLATE_BINDING__OVER_CLASSIFIER:
				return basicSetOverClassifier(null, msgs);
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
			case JavaPackage.TEMPLATE_BINDING__NAME:
				return getName();
			case JavaPackage.TEMPLATE_BINDING__TYPE_OVER_CLASSIFIER:
				return getTypeOverClassifier();
			case JavaPackage.TEMPLATE_BINDING__OVER_CLASSIFIER:
				if (resolve) return getOverClassifier();
				return basicGetOverClassifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JavaPackage.TEMPLATE_BINDING__NAME:
				setName((String)newValue);
				return;
			case JavaPackage.TEMPLATE_BINDING__TYPE_OVER_CLASSIFIER:
				setTypeOverClassifier((String)newValue);
				return;
			case JavaPackage.TEMPLATE_BINDING__OVER_CLASSIFIER:
				setOverClassifier((Classifier)newValue);
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
			case JavaPackage.TEMPLATE_BINDING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JavaPackage.TEMPLATE_BINDING__TYPE_OVER_CLASSIFIER:
				setTypeOverClassifier(TYPE_OVER_CLASSIFIER_EDEFAULT);
				return;
			case JavaPackage.TEMPLATE_BINDING__OVER_CLASSIFIER:
				setOverClassifier((Classifier)null);
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
			case JavaPackage.TEMPLATE_BINDING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JavaPackage.TEMPLATE_BINDING__TYPE_OVER_CLASSIFIER:
				return TYPE_OVER_CLASSIFIER_EDEFAULT == null ? typeOverClassifier != null : !TYPE_OVER_CLASSIFIER_EDEFAULT.equals(typeOverClassifier);
			case JavaPackage.TEMPLATE_BINDING__OVER_CLASSIFIER:
				return overClassifier != null;
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
		result.append(", typeOverClassifier: ");
		result.append(typeOverClassifier);
		result.append(')');
		return result.toString();
	}

} //TemplateBindingImpl
