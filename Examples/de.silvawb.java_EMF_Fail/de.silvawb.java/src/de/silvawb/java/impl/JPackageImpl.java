/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.JClass;
import de.silvawb.java.JPackage;
import de.silvawb.java.JavaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JPackage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.JPackageImpl#getJavaPackage <em>Java Package</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JPackageImpl#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JPackageImpl extends JModelElementImpl implements JPackage {
	/**
	 * The default value of the '{@link #getJavaPackage() <em>Java Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaPackage()
	 * @generated
	 * @ordered
	 */
	protected static final Package JAVA_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJavaPackage() <em>Java Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaPackage()
	 * @generated
	 * @ordered
	 */
	protected Package javaPackage = JAVA_PACKAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<JClass> types;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.JPACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Package getJavaPackage() {
		return javaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaPackage(Package newJavaPackage) {
		Package oldJavaPackage = javaPackage;
		javaPackage = newJavaPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.JPACKAGE__JAVA_PACKAGE, oldJavaPackage, javaPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JClass> getTypes() {
		if (types == null) {
			types = new EObjectWithInverseResolvingEList<JClass>(JClass.class, this, JavaPackage.JPACKAGE__TYPES, JavaPackage.JCLASS__PACKAGE);
		}
		return types;
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
			case JavaPackage.JPACKAGE__TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypes()).basicAdd(otherEnd, msgs);
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
			case JavaPackage.JPACKAGE__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
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
			case JavaPackage.JPACKAGE__JAVA_PACKAGE:
				return getJavaPackage();
			case JavaPackage.JPACKAGE__TYPES:
				return getTypes();
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
			case JavaPackage.JPACKAGE__JAVA_PACKAGE:
				setJavaPackage((Package)newValue);
				return;
			case JavaPackage.JPACKAGE__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends JClass>)newValue);
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
			case JavaPackage.JPACKAGE__JAVA_PACKAGE:
				setJavaPackage(JAVA_PACKAGE_EDEFAULT);
				return;
			case JavaPackage.JPACKAGE__TYPES:
				getTypes().clear();
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
			case JavaPackage.JPACKAGE__JAVA_PACKAGE:
				return JAVA_PACKAGE_EDEFAULT == null ? javaPackage != null : !JAVA_PACKAGE_EDEFAULT.equals(javaPackage);
			case JavaPackage.JPACKAGE__TYPES:
				return types != null && !types.isEmpty();
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
		result.append(" (javaPackage: ");
		result.append(javaPackage);
		result.append(')');
		return result.toString();
	}

} //JPackageImpl
