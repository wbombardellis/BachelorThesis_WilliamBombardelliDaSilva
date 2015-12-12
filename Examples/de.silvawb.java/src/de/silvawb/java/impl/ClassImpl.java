/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.JavaPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.ClassImpl#getExtendedClass <em>Extended Class</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ClassImpl#getExtendingClasses <em>Extending Classes</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ClassImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ClassImpl#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ClassImpl#isIsStatic <em>Is Static</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends ClassifierImpl implements de.silvawb.java.Class {
	/**
	 * The cached value of the '{@link #getExtendedClass() <em>Extended Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedClass()
	 * @generated
	 * @ordered
	 */
	protected de.silvawb.java.Class extendedClass;

	/**
	 * The cached value of the '{@link #getExtendingClasses() <em>Extending Classes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendingClasses()
	 * @generated
	 * @ordered
	 */
	protected de.silvawb.java.Class extendingClasses;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean isFinal = IS_FINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean isStatic = IS_STATIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.silvawb.java.Class getExtendedClass() {
		if (extendedClass != null && extendedClass.eIsProxy()) {
			InternalEObject oldExtendedClass = (InternalEObject)extendedClass;
			extendedClass = (de.silvawb.java.Class)eResolveProxy(oldExtendedClass);
			if (extendedClass != oldExtendedClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaPackage.CLASS__EXTENDED_CLASS, oldExtendedClass, extendedClass));
			}
		}
		return extendedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.silvawb.java.Class basicGetExtendedClass() {
		return extendedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtendedClass(de.silvawb.java.Class newExtendedClass, NotificationChain msgs) {
		de.silvawb.java.Class oldExtendedClass = extendedClass;
		extendedClass = newExtendedClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.CLASS__EXTENDED_CLASS, oldExtendedClass, newExtendedClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedClass(de.silvawb.java.Class newExtendedClass) {
		if (newExtendedClass != extendedClass) {
			NotificationChain msgs = null;
			if (extendedClass != null)
				msgs = ((InternalEObject)extendedClass).eInverseRemove(this, JavaPackage.CLASS__EXTENDING_CLASSES, de.silvawb.java.Class.class, msgs);
			if (newExtendedClass != null)
				msgs = ((InternalEObject)newExtendedClass).eInverseAdd(this, JavaPackage.CLASS__EXTENDING_CLASSES, de.silvawb.java.Class.class, msgs);
			msgs = basicSetExtendedClass(newExtendedClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.CLASS__EXTENDED_CLASS, newExtendedClass, newExtendedClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.silvawb.java.Class getExtendingClasses() {
		if (extendingClasses != null && extendingClasses.eIsProxy()) {
			InternalEObject oldExtendingClasses = (InternalEObject)extendingClasses;
			extendingClasses = (de.silvawb.java.Class)eResolveProxy(oldExtendingClasses);
			if (extendingClasses != oldExtendingClasses) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaPackage.CLASS__EXTENDING_CLASSES, oldExtendingClasses, extendingClasses));
			}
		}
		return extendingClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.silvawb.java.Class basicGetExtendingClasses() {
		return extendingClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtendingClasses(de.silvawb.java.Class newExtendingClasses, NotificationChain msgs) {
		de.silvawb.java.Class oldExtendingClasses = extendingClasses;
		extendingClasses = newExtendingClasses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.CLASS__EXTENDING_CLASSES, oldExtendingClasses, newExtendingClasses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendingClasses(de.silvawb.java.Class newExtendingClasses) {
		if (newExtendingClasses != extendingClasses) {
			NotificationChain msgs = null;
			if (extendingClasses != null)
				msgs = ((InternalEObject)extendingClasses).eInverseRemove(this, JavaPackage.CLASS__EXTENDED_CLASS, de.silvawb.java.Class.class, msgs);
			if (newExtendingClasses != null)
				msgs = ((InternalEObject)newExtendingClasses).eInverseAdd(this, JavaPackage.CLASS__EXTENDED_CLASS, de.silvawb.java.Class.class, msgs);
			msgs = basicSetExtendingClasses(newExtendingClasses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.CLASS__EXTENDING_CLASSES, newExtendingClasses, newExtendingClasses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.CLASS__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFinal() {
		return isFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFinal(boolean newIsFinal) {
		boolean oldIsFinal = isFinal;
		isFinal = newIsFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.CLASS__IS_FINAL, oldIsFinal, isFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStatic() {
		return isStatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStatic(boolean newIsStatic) {
		boolean oldIsStatic = isStatic;
		isStatic = newIsStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.CLASS__IS_STATIC, oldIsStatic, isStatic));
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
			case JavaPackage.CLASS__EXTENDED_CLASS:
				if (extendedClass != null)
					msgs = ((InternalEObject)extendedClass).eInverseRemove(this, JavaPackage.CLASS__EXTENDING_CLASSES, de.silvawb.java.Class.class, msgs);
				return basicSetExtendedClass((de.silvawb.java.Class)otherEnd, msgs);
			case JavaPackage.CLASS__EXTENDING_CLASSES:
				if (extendingClasses != null)
					msgs = ((InternalEObject)extendingClasses).eInverseRemove(this, JavaPackage.CLASS__EXTENDED_CLASS, de.silvawb.java.Class.class, msgs);
				return basicSetExtendingClasses((de.silvawb.java.Class)otherEnd, msgs);
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
			case JavaPackage.CLASS__EXTENDED_CLASS:
				return basicSetExtendedClass(null, msgs);
			case JavaPackage.CLASS__EXTENDING_CLASSES:
				return basicSetExtendingClasses(null, msgs);
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
			case JavaPackage.CLASS__EXTENDED_CLASS:
				if (resolve) return getExtendedClass();
				return basicGetExtendedClass();
			case JavaPackage.CLASS__EXTENDING_CLASSES:
				if (resolve) return getExtendingClasses();
				return basicGetExtendingClasses();
			case JavaPackage.CLASS__IS_ABSTRACT:
				return isIsAbstract();
			case JavaPackage.CLASS__IS_FINAL:
				return isIsFinal();
			case JavaPackage.CLASS__IS_STATIC:
				return isIsStatic();
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
			case JavaPackage.CLASS__EXTENDED_CLASS:
				setExtendedClass((de.silvawb.java.Class)newValue);
				return;
			case JavaPackage.CLASS__EXTENDING_CLASSES:
				setExtendingClasses((de.silvawb.java.Class)newValue);
				return;
			case JavaPackage.CLASS__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case JavaPackage.CLASS__IS_FINAL:
				setIsFinal((Boolean)newValue);
				return;
			case JavaPackage.CLASS__IS_STATIC:
				setIsStatic((Boolean)newValue);
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
			case JavaPackage.CLASS__EXTENDED_CLASS:
				setExtendedClass((de.silvawb.java.Class)null);
				return;
			case JavaPackage.CLASS__EXTENDING_CLASSES:
				setExtendingClasses((de.silvawb.java.Class)null);
				return;
			case JavaPackage.CLASS__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case JavaPackage.CLASS__IS_FINAL:
				setIsFinal(IS_FINAL_EDEFAULT);
				return;
			case JavaPackage.CLASS__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
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
			case JavaPackage.CLASS__EXTENDED_CLASS:
				return extendedClass != null;
			case JavaPackage.CLASS__EXTENDING_CLASSES:
				return extendingClasses != null;
			case JavaPackage.CLASS__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case JavaPackage.CLASS__IS_FINAL:
				return isFinal != IS_FINAL_EDEFAULT;
			case JavaPackage.CLASS__IS_STATIC:
				return isStatic != IS_STATIC_EDEFAULT;
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
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(", isFinal: ");
		result.append(isFinal);
		result.append(", isStatic: ");
		result.append(isStatic);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
