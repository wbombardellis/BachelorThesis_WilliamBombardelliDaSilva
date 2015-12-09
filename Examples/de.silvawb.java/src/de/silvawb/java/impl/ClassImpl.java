/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.Contained;
import de.silvawb.java.Interface;
import de.silvawb.java.JavaPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.ClassImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ClassImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ClassImpl#getImportingClasses <em>Importing Classes</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ClassImpl#getContainedElements <em>Contained Elements</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ClassImpl#getImplementedInterfaces <em>Implemented Interfaces</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ClassImpl#getExtendedClass <em>Extended Class</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ClassImpl#getExtendingClasses <em>Extending Classes</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ClassImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ClassImpl#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ClassImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ClassImpl#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends ClassifierImpl implements de.silvawb.java.Class {
	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIBILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected String visibility = VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImportingClasses() <em>Importing Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportingClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<de.silvawb.java.Class> importingClasses;

	/**
	 * The cached value of the '{@link #getContainedElements() <em>Contained Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Contained> containedElements;

	/**
	 * The cached value of the '{@link #getImplementedInterfaces() <em>Implemented Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> implementedInterfaces;

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
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Contained> imports;

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
	public String getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(String newVisibility) {
		String oldVisibility = visibility;
		visibility = newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.CLASS__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.silvawb.java.Container getContainer() {
		if (eContainerFeatureID() != JavaPackage.CLASS__CONTAINER) return null;
		return (de.silvawb.java.Container)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(de.silvawb.java.Container newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, JavaPackage.CLASS__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(de.silvawb.java.Container newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != JavaPackage.CLASS__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, JavaPackage.CONTAINER__CONTAINED_ELEMENTS, de.silvawb.java.Container.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.CLASS__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<de.silvawb.java.Class> getImportingClasses() {
		if (importingClasses == null) {
			importingClasses = new EObjectWithInverseResolvingEList.ManyInverse<de.silvawb.java.Class>(de.silvawb.java.Class.class, this, JavaPackage.CLASS__IMPORTING_CLASSES, JavaPackage.CLASS__IMPORTS);
		}
		return importingClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contained> getContainedElements() {
		if (containedElements == null) {
			containedElements = new EObjectContainmentWithInverseEList<Contained>(Contained.class, this, JavaPackage.CLASS__CONTAINED_ELEMENTS, JavaPackage.CONTAINED__CONTAINER);
		}
		return containedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getImplementedInterfaces() {
		if (implementedInterfaces == null) {
			implementedInterfaces = new EObjectWithInverseResolvingEList.ManyInverse<Interface>(Interface.class, this, JavaPackage.CLASS__IMPLEMENTED_INTERFACES, JavaPackage.INTERFACE__IMPLEMENTING_CLASSES);
		}
		return implementedInterfaces;
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
	public EList<Contained> getImports() {
		if (imports == null) {
			imports = new EObjectWithInverseResolvingEList.ManyInverse<Contained>(Contained.class, this, JavaPackage.CLASS__IMPORTS, JavaPackage.CONTAINED__IMPORTING_CLASSES);
		}
		return imports;
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
			case JavaPackage.CLASS__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((de.silvawb.java.Container)otherEnd, msgs);
			case JavaPackage.CLASS__IMPORTING_CLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImportingClasses()).basicAdd(otherEnd, msgs);
			case JavaPackage.CLASS__CONTAINED_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedElements()).basicAdd(otherEnd, msgs);
			case JavaPackage.CLASS__IMPLEMENTED_INTERFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImplementedInterfaces()).basicAdd(otherEnd, msgs);
			case JavaPackage.CLASS__EXTENDED_CLASS:
				if (extendedClass != null)
					msgs = ((InternalEObject)extendedClass).eInverseRemove(this, JavaPackage.CLASS__EXTENDING_CLASSES, de.silvawb.java.Class.class, msgs);
				return basicSetExtendedClass((de.silvawb.java.Class)otherEnd, msgs);
			case JavaPackage.CLASS__EXTENDING_CLASSES:
				if (extendingClasses != null)
					msgs = ((InternalEObject)extendingClasses).eInverseRemove(this, JavaPackage.CLASS__EXTENDED_CLASS, de.silvawb.java.Class.class, msgs);
				return basicSetExtendingClasses((de.silvawb.java.Class)otherEnd, msgs);
			case JavaPackage.CLASS__IMPORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImports()).basicAdd(otherEnd, msgs);
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
			case JavaPackage.CLASS__CONTAINER:
				return basicSetContainer(null, msgs);
			case JavaPackage.CLASS__IMPORTING_CLASSES:
				return ((InternalEList<?>)getImportingClasses()).basicRemove(otherEnd, msgs);
			case JavaPackage.CLASS__CONTAINED_ELEMENTS:
				return ((InternalEList<?>)getContainedElements()).basicRemove(otherEnd, msgs);
			case JavaPackage.CLASS__IMPLEMENTED_INTERFACES:
				return ((InternalEList<?>)getImplementedInterfaces()).basicRemove(otherEnd, msgs);
			case JavaPackage.CLASS__EXTENDED_CLASS:
				return basicSetExtendedClass(null, msgs);
			case JavaPackage.CLASS__EXTENDING_CLASSES:
				return basicSetExtendingClasses(null, msgs);
			case JavaPackage.CLASS__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
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
			case JavaPackage.CLASS__CONTAINER:
				return eInternalContainer().eInverseRemove(this, JavaPackage.CONTAINER__CONTAINED_ELEMENTS, de.silvawb.java.Container.class, msgs);
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
			case JavaPackage.CLASS__VISIBILITY:
				return getVisibility();
			case JavaPackage.CLASS__CONTAINER:
				return getContainer();
			case JavaPackage.CLASS__IMPORTING_CLASSES:
				return getImportingClasses();
			case JavaPackage.CLASS__CONTAINED_ELEMENTS:
				return getContainedElements();
			case JavaPackage.CLASS__IMPLEMENTED_INTERFACES:
				return getImplementedInterfaces();
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
			case JavaPackage.CLASS__IMPORTS:
				return getImports();
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
			case JavaPackage.CLASS__VISIBILITY:
				setVisibility((String)newValue);
				return;
			case JavaPackage.CLASS__CONTAINER:
				setContainer((de.silvawb.java.Container)newValue);
				return;
			case JavaPackage.CLASS__IMPORTING_CLASSES:
				getImportingClasses().clear();
				getImportingClasses().addAll((Collection<? extends de.silvawb.java.Class>)newValue);
				return;
			case JavaPackage.CLASS__CONTAINED_ELEMENTS:
				getContainedElements().clear();
				getContainedElements().addAll((Collection<? extends Contained>)newValue);
				return;
			case JavaPackage.CLASS__IMPLEMENTED_INTERFACES:
				getImplementedInterfaces().clear();
				getImplementedInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
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
			case JavaPackage.CLASS__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Contained>)newValue);
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
			case JavaPackage.CLASS__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case JavaPackage.CLASS__CONTAINER:
				setContainer((de.silvawb.java.Container)null);
				return;
			case JavaPackage.CLASS__IMPORTING_CLASSES:
				getImportingClasses().clear();
				return;
			case JavaPackage.CLASS__CONTAINED_ELEMENTS:
				getContainedElements().clear();
				return;
			case JavaPackage.CLASS__IMPLEMENTED_INTERFACES:
				getImplementedInterfaces().clear();
				return;
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
			case JavaPackage.CLASS__IMPORTS:
				getImports().clear();
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
			case JavaPackage.CLASS__VISIBILITY:
				return VISIBILITY_EDEFAULT == null ? visibility != null : !VISIBILITY_EDEFAULT.equals(visibility);
			case JavaPackage.CLASS__CONTAINER:
				return getContainer() != null;
			case JavaPackage.CLASS__IMPORTING_CLASSES:
				return importingClasses != null && !importingClasses.isEmpty();
			case JavaPackage.CLASS__CONTAINED_ELEMENTS:
				return containedElements != null && !containedElements.isEmpty();
			case JavaPackage.CLASS__IMPLEMENTED_INTERFACES:
				return implementedInterfaces != null && !implementedInterfaces.isEmpty();
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
			case JavaPackage.CLASS__IMPORTS:
				return imports != null && !imports.isEmpty();
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
		if (baseClass == Contained.class) {
			switch (derivedFeatureID) {
				case JavaPackage.CLASS__VISIBILITY: return JavaPackage.CONTAINED__VISIBILITY;
				case JavaPackage.CLASS__CONTAINER: return JavaPackage.CONTAINED__CONTAINER;
				case JavaPackage.CLASS__IMPORTING_CLASSES: return JavaPackage.CONTAINED__IMPORTING_CLASSES;
				default: return -1;
			}
		}
		if (baseClass == de.silvawb.java.Container.class) {
			switch (derivedFeatureID) {
				case JavaPackage.CLASS__CONTAINED_ELEMENTS: return JavaPackage.CONTAINER__CONTAINED_ELEMENTS;
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
		if (baseClass == Contained.class) {
			switch (baseFeatureID) {
				case JavaPackage.CONTAINED__VISIBILITY: return JavaPackage.CLASS__VISIBILITY;
				case JavaPackage.CONTAINED__CONTAINER: return JavaPackage.CLASS__CONTAINER;
				case JavaPackage.CONTAINED__IMPORTING_CLASSES: return JavaPackage.CLASS__IMPORTING_CLASSES;
				default: return -1;
			}
		}
		if (baseClass == de.silvawb.java.Container.class) {
			switch (baseFeatureID) {
				case JavaPackage.CONTAINER__CONTAINED_ELEMENTS: return JavaPackage.CLASS__CONTAINED_ELEMENTS;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(", isFinal: ");
		result.append(isFinal);
		result.append(", isStatic: ");
		result.append(isStatic);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
