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
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.InterfaceImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.silvawb.java.impl.InterfaceImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link de.silvawb.java.impl.InterfaceImpl#getImportingClasses <em>Importing Classes</em>}</li>
 *   <li>{@link de.silvawb.java.impl.InterfaceImpl#getContainedElements <em>Contained Elements</em>}</li>
 *   <li>{@link de.silvawb.java.impl.InterfaceImpl#getImplementingClasses <em>Implementing Classes</em>}</li>
 *   <li>{@link de.silvawb.java.impl.InterfaceImpl#getExtendedInterfaces <em>Extended Interfaces</em>}</li>
 *   <li>{@link de.silvawb.java.impl.InterfaceImpl#getExtendingInterfaces <em>Extending Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceImpl extends ClassifierImpl implements Interface {
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
	 * The cached value of the '{@link #getImplementingClasses() <em>Implementing Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementingClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<de.silvawb.java.Class> implementingClasses;

	/**
	 * The cached value of the '{@link #getExtendedInterfaces() <em>Extended Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> extendedInterfaces;

	/**
	 * The cached value of the '{@link #getExtendingInterfaces() <em>Extending Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendingInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> extendingInterfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.INTERFACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.INTERFACE__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.silvawb.java.Container getContainer() {
		if (eContainerFeatureID() != JavaPackage.INTERFACE__CONTAINER) return null;
		return (de.silvawb.java.Container)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(de.silvawb.java.Container newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, JavaPackage.INTERFACE__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(de.silvawb.java.Container newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != JavaPackage.INTERFACE__CONTAINER && newContainer != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.INTERFACE__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<de.silvawb.java.Class> getImportingClasses() {
		if (importingClasses == null) {
			importingClasses = new EObjectWithInverseResolvingEList.ManyInverse<de.silvawb.java.Class>(de.silvawb.java.Class.class, this, JavaPackage.INTERFACE__IMPORTING_CLASSES, JavaPackage.CLASS__IMPORTS);
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
			containedElements = new EObjectContainmentWithInverseEList<Contained>(Contained.class, this, JavaPackage.INTERFACE__CONTAINED_ELEMENTS, JavaPackage.CONTAINED__CONTAINER);
		}
		return containedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<de.silvawb.java.Class> getImplementingClasses() {
		if (implementingClasses == null) {
			implementingClasses = new EObjectWithInverseResolvingEList.ManyInverse<de.silvawb.java.Class>(de.silvawb.java.Class.class, this, JavaPackage.INTERFACE__IMPLEMENTING_CLASSES, JavaPackage.CLASS__IMPLEMENTED_INTERFACES);
		}
		return implementingClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getExtendedInterfaces() {
		if (extendedInterfaces == null) {
			extendedInterfaces = new EObjectWithInverseResolvingEList.ManyInverse<Interface>(Interface.class, this, JavaPackage.INTERFACE__EXTENDED_INTERFACES, JavaPackage.INTERFACE__EXTENDING_INTERFACES);
		}
		return extendedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getExtendingInterfaces() {
		if (extendingInterfaces == null) {
			extendingInterfaces = new EObjectWithInverseResolvingEList.ManyInverse<Interface>(Interface.class, this, JavaPackage.INTERFACE__EXTENDING_INTERFACES, JavaPackage.INTERFACE__EXTENDED_INTERFACES);
		}
		return extendingInterfaces;
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
			case JavaPackage.INTERFACE__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((de.silvawb.java.Container)otherEnd, msgs);
			case JavaPackage.INTERFACE__IMPORTING_CLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImportingClasses()).basicAdd(otherEnd, msgs);
			case JavaPackage.INTERFACE__CONTAINED_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedElements()).basicAdd(otherEnd, msgs);
			case JavaPackage.INTERFACE__IMPLEMENTING_CLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImplementingClasses()).basicAdd(otherEnd, msgs);
			case JavaPackage.INTERFACE__EXTENDED_INTERFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtendedInterfaces()).basicAdd(otherEnd, msgs);
			case JavaPackage.INTERFACE__EXTENDING_INTERFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtendingInterfaces()).basicAdd(otherEnd, msgs);
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
			case JavaPackage.INTERFACE__CONTAINER:
				return basicSetContainer(null, msgs);
			case JavaPackage.INTERFACE__IMPORTING_CLASSES:
				return ((InternalEList<?>)getImportingClasses()).basicRemove(otherEnd, msgs);
			case JavaPackage.INTERFACE__CONTAINED_ELEMENTS:
				return ((InternalEList<?>)getContainedElements()).basicRemove(otherEnd, msgs);
			case JavaPackage.INTERFACE__IMPLEMENTING_CLASSES:
				return ((InternalEList<?>)getImplementingClasses()).basicRemove(otherEnd, msgs);
			case JavaPackage.INTERFACE__EXTENDED_INTERFACES:
				return ((InternalEList<?>)getExtendedInterfaces()).basicRemove(otherEnd, msgs);
			case JavaPackage.INTERFACE__EXTENDING_INTERFACES:
				return ((InternalEList<?>)getExtendingInterfaces()).basicRemove(otherEnd, msgs);
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
			case JavaPackage.INTERFACE__CONTAINER:
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
			case JavaPackage.INTERFACE__VISIBILITY:
				return getVisibility();
			case JavaPackage.INTERFACE__CONTAINER:
				return getContainer();
			case JavaPackage.INTERFACE__IMPORTING_CLASSES:
				return getImportingClasses();
			case JavaPackage.INTERFACE__CONTAINED_ELEMENTS:
				return getContainedElements();
			case JavaPackage.INTERFACE__IMPLEMENTING_CLASSES:
				return getImplementingClasses();
			case JavaPackage.INTERFACE__EXTENDED_INTERFACES:
				return getExtendedInterfaces();
			case JavaPackage.INTERFACE__EXTENDING_INTERFACES:
				return getExtendingInterfaces();
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
			case JavaPackage.INTERFACE__VISIBILITY:
				setVisibility((String)newValue);
				return;
			case JavaPackage.INTERFACE__CONTAINER:
				setContainer((de.silvawb.java.Container)newValue);
				return;
			case JavaPackage.INTERFACE__IMPORTING_CLASSES:
				getImportingClasses().clear();
				getImportingClasses().addAll((Collection<? extends de.silvawb.java.Class>)newValue);
				return;
			case JavaPackage.INTERFACE__CONTAINED_ELEMENTS:
				getContainedElements().clear();
				getContainedElements().addAll((Collection<? extends Contained>)newValue);
				return;
			case JavaPackage.INTERFACE__IMPLEMENTING_CLASSES:
				getImplementingClasses().clear();
				getImplementingClasses().addAll((Collection<? extends de.silvawb.java.Class>)newValue);
				return;
			case JavaPackage.INTERFACE__EXTENDED_INTERFACES:
				getExtendedInterfaces().clear();
				getExtendedInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case JavaPackage.INTERFACE__EXTENDING_INTERFACES:
				getExtendingInterfaces().clear();
				getExtendingInterfaces().addAll((Collection<? extends Interface>)newValue);
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
			case JavaPackage.INTERFACE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case JavaPackage.INTERFACE__CONTAINER:
				setContainer((de.silvawb.java.Container)null);
				return;
			case JavaPackage.INTERFACE__IMPORTING_CLASSES:
				getImportingClasses().clear();
				return;
			case JavaPackage.INTERFACE__CONTAINED_ELEMENTS:
				getContainedElements().clear();
				return;
			case JavaPackage.INTERFACE__IMPLEMENTING_CLASSES:
				getImplementingClasses().clear();
				return;
			case JavaPackage.INTERFACE__EXTENDED_INTERFACES:
				getExtendedInterfaces().clear();
				return;
			case JavaPackage.INTERFACE__EXTENDING_INTERFACES:
				getExtendingInterfaces().clear();
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
			case JavaPackage.INTERFACE__VISIBILITY:
				return VISIBILITY_EDEFAULT == null ? visibility != null : !VISIBILITY_EDEFAULT.equals(visibility);
			case JavaPackage.INTERFACE__CONTAINER:
				return getContainer() != null;
			case JavaPackage.INTERFACE__IMPORTING_CLASSES:
				return importingClasses != null && !importingClasses.isEmpty();
			case JavaPackage.INTERFACE__CONTAINED_ELEMENTS:
				return containedElements != null && !containedElements.isEmpty();
			case JavaPackage.INTERFACE__IMPLEMENTING_CLASSES:
				return implementingClasses != null && !implementingClasses.isEmpty();
			case JavaPackage.INTERFACE__EXTENDED_INTERFACES:
				return extendedInterfaces != null && !extendedInterfaces.isEmpty();
			case JavaPackage.INTERFACE__EXTENDING_INTERFACES:
				return extendingInterfaces != null && !extendingInterfaces.isEmpty();
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
				case JavaPackage.INTERFACE__VISIBILITY: return JavaPackage.CONTAINED__VISIBILITY;
				case JavaPackage.INTERFACE__CONTAINER: return JavaPackage.CONTAINED__CONTAINER;
				case JavaPackage.INTERFACE__IMPORTING_CLASSES: return JavaPackage.CONTAINED__IMPORTING_CLASSES;
				default: return -1;
			}
		}
		if (baseClass == de.silvawb.java.Container.class) {
			switch (derivedFeatureID) {
				case JavaPackage.INTERFACE__CONTAINED_ELEMENTS: return JavaPackage.CONTAINER__CONTAINED_ELEMENTS;
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
				case JavaPackage.CONTAINED__VISIBILITY: return JavaPackage.INTERFACE__VISIBILITY;
				case JavaPackage.CONTAINED__CONTAINER: return JavaPackage.INTERFACE__CONTAINER;
				case JavaPackage.CONTAINED__IMPORTING_CLASSES: return JavaPackage.INTERFACE__IMPORTING_CLASSES;
				default: return -1;
			}
		}
		if (baseClass == de.silvawb.java.Container.class) {
			switch (baseFeatureID) {
				case JavaPackage.CONTAINER__CONTAINED_ELEMENTS: return JavaPackage.INTERFACE__CONTAINED_ELEMENTS;
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
		result.append(')');
		return result.toString();
	}

} //InterfaceImpl
