/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.Classifier;
import de.silvawb.java.GenericBinding;
import de.silvawb.java.JavaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.GenericBindingImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.silvawb.java.impl.GenericBindingImpl#getUpperBoundings <em>Upper Boundings</em>}</li>
 *   <li>{@link de.silvawb.java.impl.GenericBindingImpl#getLowerBounding <em>Lower Bounding</em>}</li>
 *   <li>{@link de.silvawb.java.impl.GenericBindingImpl#getUsingClassifier <em>Using Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericBindingImpl extends MinimalEObjectImpl.Container implements GenericBinding {
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
	 * The cached value of the '{@link #getUpperBoundings() <em>Upper Boundings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBoundings()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> upperBoundings;

	/**
	 * The cached value of the '{@link #getLowerBounding() <em>Lower Bounding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBounding()
	 * @generated
	 * @ordered
	 */
	protected Classifier lowerBounding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.GENERIC_BINDING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.GENERIC_BINDING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getUpperBoundings() {
		if (upperBoundings == null) {
			upperBoundings = new EObjectResolvingEList<Classifier>(Classifier.class, this, JavaPackage.GENERIC_BINDING__UPPER_BOUNDINGS);
		}
		return upperBoundings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getLowerBounding() {
		if (lowerBounding != null && lowerBounding.eIsProxy()) {
			InternalEObject oldLowerBounding = (InternalEObject)lowerBounding;
			lowerBounding = (Classifier)eResolveProxy(oldLowerBounding);
			if (lowerBounding != oldLowerBounding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaPackage.GENERIC_BINDING__LOWER_BOUNDING, oldLowerBounding, lowerBounding));
			}
		}
		return lowerBounding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetLowerBounding() {
		return lowerBounding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBounding(Classifier newLowerBounding) {
		Classifier oldLowerBounding = lowerBounding;
		lowerBounding = newLowerBounding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.GENERIC_BINDING__LOWER_BOUNDING, oldLowerBounding, lowerBounding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getUsingClassifier() {
		if (eContainerFeatureID() != JavaPackage.GENERIC_BINDING__USING_CLASSIFIER) return null;
		return (Classifier)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsingClassifier(Classifier newUsingClassifier, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUsingClassifier, JavaPackage.GENERIC_BINDING__USING_CLASSIFIER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsingClassifier(Classifier newUsingClassifier) {
		if (newUsingClassifier != eInternalContainer() || (eContainerFeatureID() != JavaPackage.GENERIC_BINDING__USING_CLASSIFIER && newUsingClassifier != null)) {
			if (EcoreUtil.isAncestor(this, newUsingClassifier))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUsingClassifier != null)
				msgs = ((InternalEObject)newUsingClassifier).eInverseAdd(this, JavaPackage.CLASSIFIER__GENERIC_BINDINGS, Classifier.class, msgs);
			msgs = basicSetUsingClassifier(newUsingClassifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.GENERIC_BINDING__USING_CLASSIFIER, newUsingClassifier, newUsingClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.GENERIC_BINDING__USING_CLASSIFIER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUsingClassifier((Classifier)otherEnd, msgs);
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
			case JavaPackage.GENERIC_BINDING__USING_CLASSIFIER:
				return basicSetUsingClassifier(null, msgs);
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
			case JavaPackage.GENERIC_BINDING__USING_CLASSIFIER:
				return eInternalContainer().eInverseRemove(this, JavaPackage.CLASSIFIER__GENERIC_BINDINGS, Classifier.class, msgs);
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
			case JavaPackage.GENERIC_BINDING__NAME:
				return getName();
			case JavaPackage.GENERIC_BINDING__UPPER_BOUNDINGS:
				return getUpperBoundings();
			case JavaPackage.GENERIC_BINDING__LOWER_BOUNDING:
				if (resolve) return getLowerBounding();
				return basicGetLowerBounding();
			case JavaPackage.GENERIC_BINDING__USING_CLASSIFIER:
				return getUsingClassifier();
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
			case JavaPackage.GENERIC_BINDING__NAME:
				setName((String)newValue);
				return;
			case JavaPackage.GENERIC_BINDING__UPPER_BOUNDINGS:
				getUpperBoundings().clear();
				getUpperBoundings().addAll((Collection<? extends Classifier>)newValue);
				return;
			case JavaPackage.GENERIC_BINDING__LOWER_BOUNDING:
				setLowerBounding((Classifier)newValue);
				return;
			case JavaPackage.GENERIC_BINDING__USING_CLASSIFIER:
				setUsingClassifier((Classifier)newValue);
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
			case JavaPackage.GENERIC_BINDING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JavaPackage.GENERIC_BINDING__UPPER_BOUNDINGS:
				getUpperBoundings().clear();
				return;
			case JavaPackage.GENERIC_BINDING__LOWER_BOUNDING:
				setLowerBounding((Classifier)null);
				return;
			case JavaPackage.GENERIC_BINDING__USING_CLASSIFIER:
				setUsingClassifier((Classifier)null);
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
			case JavaPackage.GENERIC_BINDING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JavaPackage.GENERIC_BINDING__UPPER_BOUNDINGS:
				return upperBoundings != null && !upperBoundings.isEmpty();
			case JavaPackage.GENERIC_BINDING__LOWER_BOUNDING:
				return lowerBounding != null;
			case JavaPackage.GENERIC_BINDING__USING_CLASSIFIER:
				return getUsingClassifier() != null;
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

} //GenericBindingImpl
