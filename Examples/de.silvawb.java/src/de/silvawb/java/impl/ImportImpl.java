/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.Classifier;
import de.silvawb.java.Import;
import de.silvawb.java.JavaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.ImportImpl#getImported <em>Imported</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ImportImpl#getImporting <em>Importing</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ImportImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportImpl extends MinimalEObjectImpl.Container implements Import {
	/**
	 * The cached value of the '{@link #getImported() <em>Imported</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImported()
	 * @generated
	 * @ordered
	 */
	protected Classifier imported;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getImported() {
		if (imported != null && imported.eIsProxy()) {
			InternalEObject oldImported = (InternalEObject)imported;
			imported = (Classifier)eResolveProxy(oldImported);
			if (imported != oldImported) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaPackage.IMPORT__IMPORTED, oldImported, imported));
			}
		}
		return imported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetImported() {
		return imported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImported(Classifier newImported) {
		Classifier oldImported = imported;
		imported = newImported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.IMPORT__IMPORTED, oldImported, imported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getImporting() {
		if (eContainerFeatureID() != JavaPackage.IMPORT__IMPORTING) return null;
		return (Classifier)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImporting(Classifier newImporting, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newImporting, JavaPackage.IMPORT__IMPORTING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImporting(Classifier newImporting) {
		if (newImporting != eInternalContainer() || (eContainerFeatureID() != JavaPackage.IMPORT__IMPORTING && newImporting != null)) {
			if (EcoreUtil.isAncestor(this, newImporting))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newImporting != null)
				msgs = ((InternalEObject)newImporting).eInverseAdd(this, JavaPackage.CLASSIFIER__IMPORTS, Classifier.class, msgs);
			msgs = basicSetImporting(newImporting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.IMPORT__IMPORTING, newImporting, newImporting));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.IMPORT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.IMPORT__IMPORTING:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetImporting((Classifier)otherEnd, msgs);
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
			case JavaPackage.IMPORT__IMPORTING:
				return basicSetImporting(null, msgs);
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
			case JavaPackage.IMPORT__IMPORTING:
				return eInternalContainer().eInverseRemove(this, JavaPackage.CLASSIFIER__IMPORTS, Classifier.class, msgs);
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
			case JavaPackage.IMPORT__IMPORTED:
				if (resolve) return getImported();
				return basicGetImported();
			case JavaPackage.IMPORT__IMPORTING:
				return getImporting();
			case JavaPackage.IMPORT__NAME:
				return getName();
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
			case JavaPackage.IMPORT__IMPORTED:
				setImported((Classifier)newValue);
				return;
			case JavaPackage.IMPORT__IMPORTING:
				setImporting((Classifier)newValue);
				return;
			case JavaPackage.IMPORT__NAME:
				setName((String)newValue);
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
			case JavaPackage.IMPORT__IMPORTED:
				setImported((Classifier)null);
				return;
			case JavaPackage.IMPORT__IMPORTING:
				setImporting((Classifier)null);
				return;
			case JavaPackage.IMPORT__NAME:
				setName(NAME_EDEFAULT);
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
			case JavaPackage.IMPORT__IMPORTED:
				return imported != null;
			case JavaPackage.IMPORT__IMPORTING:
				return getImporting() != null;
			case JavaPackage.IMPORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //ImportImpl
