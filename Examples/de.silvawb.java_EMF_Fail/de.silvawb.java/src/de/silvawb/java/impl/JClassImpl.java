/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.JClass;
import de.silvawb.java.JCompilationUnit;
import de.silvawb.java.JField;
import de.silvawb.java.JMember;
import de.silvawb.java.JMethod;
import de.silvawb.java.JPackage;
import de.silvawb.java.JavaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.JClassImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JClassImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JClassImpl#isInterface <em>Interface</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JClassImpl#isThrowable <em>Throwable</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JClassImpl#getJavaClass <em>Java Class</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JClassImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JClassImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JClassImpl#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JClassImpl#getAllSuperTypes <em>All Super Types</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JClassImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JClassImpl#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JClassImpl#getArrayType <em>Array Type</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JClassImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JClassImpl#getAllMethods <em>All Methods</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JClassImpl#getAllFields <em>All Fields</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JClassImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JClassImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JClassImpl#getAllTypes <em>All Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JClassImpl extends JMemberImpl implements JClass {
	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean final_ = FINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterface()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERFACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterface()
	 * @generated
	 * @ordered
	 */
	protected boolean interface_ = INTERFACE_EDEFAULT;

	/**
	 * The default value of the '{@link #isThrowable() <em>Throwable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThrowable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean THROWABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isThrowable() <em>Throwable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThrowable()
	 * @generated
	 * @ordered
	 */
	protected boolean throwable = THROWABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getJavaClass() <em>Java Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaClass()
	 * @generated
	 * @ordered
	 */
	protected Class<?> javaClass;

	/**
	 * The cached value of the '{@link #getSuperTypes() <em>Super Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<JClass> superTypes;

	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<JMember> members;

	/**
	 * The cached value of the '{@link #getArrayType() <em>Array Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayType()
	 * @generated
	 * @ordered
	 */
	protected JClass arrayType;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected JPackage package_;

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
	 * The cached value of the '{@link #getAllTypes() <em>All Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<JClass> allTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.JCLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.JCLASS__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinal() {
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(boolean newFinal) {
		boolean oldFinal = final_;
		final_ = newFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.JCLASS__FINAL, oldFinal, final_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(boolean newInterface) {
		boolean oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.JCLASS__INTERFACE, oldInterface, interface_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isThrowable() {
		return throwable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThrowable(boolean newThrowable) {
		boolean oldThrowable = throwable;
		throwable = newThrowable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.JCLASS__THROWABLE, oldThrowable, throwable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<?> getJavaClass() {
		return javaClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaClass(Class<?> newJavaClass) {
		Class<?> oldJavaClass = javaClass;
		javaClass = newJavaClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.JCLASS__JAVA_CLASS, oldJavaClass, javaClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JField> getFields() {
		// TODO: implement this method to return the 'Fields' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JMethod> getMethods() {
		// TODO: implement this method to return the 'Methods' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JClass> getSuperTypes() {
		if (superTypes == null) {
			superTypes = new EObjectResolvingEList<JClass>(JClass.class, this, JavaPackage.JCLASS__SUPER_TYPES);
		}
		return superTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JClass> getAllSuperTypes() {
		// TODO: implement this method to return the 'All Super Types' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JMember> getMembers() {
		if (members == null) {
			members = new EObjectContainmentWithInverseEList<JMember>(JMember.class, this, JavaPackage.JCLASS__MEMBERS, JavaPackage.JMEMBER__CONTAINING_TYPE);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JClass getComponentType() {
		if (eContainerFeatureID() != JavaPackage.JCLASS__COMPONENT_TYPE) return null;
		return (JClass)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentType(JClass newComponentType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComponentType, JavaPackage.JCLASS__COMPONENT_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentType(JClass newComponentType) {
		if (newComponentType != eInternalContainer() || (eContainerFeatureID() != JavaPackage.JCLASS__COMPONENT_TYPE && newComponentType != null)) {
			if (EcoreUtil.isAncestor(this, newComponentType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComponentType != null)
				msgs = ((InternalEObject)newComponentType).eInverseAdd(this, JavaPackage.JCLASS__ARRAY_TYPE, JClass.class, msgs);
			msgs = basicSetComponentType(newComponentType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.JCLASS__COMPONENT_TYPE, newComponentType, newComponentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JClass getArrayType() {
		return arrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArrayType(JClass newArrayType, NotificationChain msgs) {
		JClass oldArrayType = arrayType;
		arrayType = newArrayType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.JCLASS__ARRAY_TYPE, oldArrayType, newArrayType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrayType(JClass newArrayType) {
		if (newArrayType != arrayType) {
			NotificationChain msgs = null;
			if (arrayType != null)
				msgs = ((InternalEObject)arrayType).eInverseRemove(this, JavaPackage.JCLASS__COMPONENT_TYPE, JClass.class, msgs);
			if (newArrayType != null)
				msgs = ((InternalEObject)newArrayType).eInverseAdd(this, JavaPackage.JCLASS__COMPONENT_TYPE, JClass.class, msgs);
			msgs = basicSetArrayType(newArrayType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.JCLASS__ARRAY_TYPE, newArrayType, newArrayType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JCompilationUnit getUnit() {
		if (eContainerFeatureID() != JavaPackage.JCLASS__UNIT) return null;
		return (JCompilationUnit)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnit(JCompilationUnit newUnit, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUnit, JavaPackage.JCLASS__UNIT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(JCompilationUnit newUnit) {
		if (newUnit != eInternalContainer() || (eContainerFeatureID() != JavaPackage.JCLASS__UNIT && newUnit != null)) {
			if (EcoreUtil.isAncestor(this, newUnit))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUnit != null)
				msgs = ((InternalEObject)newUnit).eInverseAdd(this, JavaPackage.JCOMPILATION_UNIT__TYPES, JCompilationUnit.class, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.JCLASS__UNIT, newUnit, newUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JMethod> getAllMethods() {
		// TODO: implement this method to return the 'All Methods' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JField> getAllFields() {
		// TODO: implement this method to return the 'All Fields' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JPackage getPackage() {
		if (package_ != null && package_.eIsProxy()) {
			InternalEObject oldPackage = (InternalEObject)package_;
			package_ = (JPackage)eResolveProxy(oldPackage);
			if (package_ != oldPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaPackage.JCLASS__PACKAGE, oldPackage, package_));
			}
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JPackage basicGetPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(JPackage newPackage, NotificationChain msgs) {
		JPackage oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.JCLASS__PACKAGE, oldPackage, newPackage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(JPackage newPackage) {
		if (newPackage != package_) {
			NotificationChain msgs = null;
			if (package_ != null)
				msgs = ((InternalEObject)package_).eInverseRemove(this, JavaPackage.JPACKAGE__TYPES, JPackage.class, msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, JavaPackage.JPACKAGE__TYPES, JPackage.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.JCLASS__PACKAGE, newPackage, newPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JClass> getTypes() {
		if (types == null) {
			types = new EObjectResolvingEList<JClass>(JClass.class, this, JavaPackage.JCLASS__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JClass> getAllTypes() {
		if (allTypes == null) {
			allTypes = new EObjectResolvingEList<JClass>(JClass.class, this, JavaPackage.JCLASS__ALL_TYPES);
		}
		return allTypes;
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
			case JavaPackage.JCLASS__MEMBERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMembers()).basicAdd(otherEnd, msgs);
			case JavaPackage.JCLASS__COMPONENT_TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetComponentType((JClass)otherEnd, msgs);
			case JavaPackage.JCLASS__ARRAY_TYPE:
				if (arrayType != null)
					msgs = ((InternalEObject)arrayType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.JCLASS__ARRAY_TYPE, null, msgs);
				return basicSetArrayType((JClass)otherEnd, msgs);
			case JavaPackage.JCLASS__UNIT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUnit((JCompilationUnit)otherEnd, msgs);
			case JavaPackage.JCLASS__PACKAGE:
				if (package_ != null)
					msgs = ((InternalEObject)package_).eInverseRemove(this, JavaPackage.JPACKAGE__TYPES, JPackage.class, msgs);
				return basicSetPackage((JPackage)otherEnd, msgs);
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
			case JavaPackage.JCLASS__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
			case JavaPackage.JCLASS__COMPONENT_TYPE:
				return basicSetComponentType(null, msgs);
			case JavaPackage.JCLASS__ARRAY_TYPE:
				return basicSetArrayType(null, msgs);
			case JavaPackage.JCLASS__UNIT:
				return basicSetUnit(null, msgs);
			case JavaPackage.JCLASS__PACKAGE:
				return basicSetPackage(null, msgs);
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
			case JavaPackage.JCLASS__COMPONENT_TYPE:
				return eInternalContainer().eInverseRemove(this, JavaPackage.JCLASS__ARRAY_TYPE, JClass.class, msgs);
			case JavaPackage.JCLASS__UNIT:
				return eInternalContainer().eInverseRemove(this, JavaPackage.JCOMPILATION_UNIT__TYPES, JCompilationUnit.class, msgs);
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
			case JavaPackage.JCLASS__ABSTRACT:
				return isAbstract();
			case JavaPackage.JCLASS__FINAL:
				return isFinal();
			case JavaPackage.JCLASS__INTERFACE:
				return isInterface();
			case JavaPackage.JCLASS__THROWABLE:
				return isThrowable();
			case JavaPackage.JCLASS__JAVA_CLASS:
				return getJavaClass();
			case JavaPackage.JCLASS__FIELDS:
				return getFields();
			case JavaPackage.JCLASS__METHODS:
				return getMethods();
			case JavaPackage.JCLASS__SUPER_TYPES:
				return getSuperTypes();
			case JavaPackage.JCLASS__ALL_SUPER_TYPES:
				return getAllSuperTypes();
			case JavaPackage.JCLASS__MEMBERS:
				return getMembers();
			case JavaPackage.JCLASS__COMPONENT_TYPE:
				return getComponentType();
			case JavaPackage.JCLASS__ARRAY_TYPE:
				return getArrayType();
			case JavaPackage.JCLASS__UNIT:
				return getUnit();
			case JavaPackage.JCLASS__ALL_METHODS:
				return getAllMethods();
			case JavaPackage.JCLASS__ALL_FIELDS:
				return getAllFields();
			case JavaPackage.JCLASS__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case JavaPackage.JCLASS__TYPES:
				return getTypes();
			case JavaPackage.JCLASS__ALL_TYPES:
				return getAllTypes();
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
			case JavaPackage.JCLASS__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case JavaPackage.JCLASS__FINAL:
				setFinal((Boolean)newValue);
				return;
			case JavaPackage.JCLASS__INTERFACE:
				setInterface((Boolean)newValue);
				return;
			case JavaPackage.JCLASS__THROWABLE:
				setThrowable((Boolean)newValue);
				return;
			case JavaPackage.JCLASS__JAVA_CLASS:
				setJavaClass((Class<?>)newValue);
				return;
			case JavaPackage.JCLASS__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends JField>)newValue);
				return;
			case JavaPackage.JCLASS__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends JMethod>)newValue);
				return;
			case JavaPackage.JCLASS__SUPER_TYPES:
				getSuperTypes().clear();
				getSuperTypes().addAll((Collection<? extends JClass>)newValue);
				return;
			case JavaPackage.JCLASS__ALL_SUPER_TYPES:
				getAllSuperTypes().clear();
				getAllSuperTypes().addAll((Collection<? extends JClass>)newValue);
				return;
			case JavaPackage.JCLASS__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends JMember>)newValue);
				return;
			case JavaPackage.JCLASS__COMPONENT_TYPE:
				setComponentType((JClass)newValue);
				return;
			case JavaPackage.JCLASS__ARRAY_TYPE:
				setArrayType((JClass)newValue);
				return;
			case JavaPackage.JCLASS__UNIT:
				setUnit((JCompilationUnit)newValue);
				return;
			case JavaPackage.JCLASS__ALL_METHODS:
				getAllMethods().clear();
				getAllMethods().addAll((Collection<? extends JMethod>)newValue);
				return;
			case JavaPackage.JCLASS__ALL_FIELDS:
				getAllFields().clear();
				getAllFields().addAll((Collection<? extends JField>)newValue);
				return;
			case JavaPackage.JCLASS__PACKAGE:
				setPackage((JPackage)newValue);
				return;
			case JavaPackage.JCLASS__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends JClass>)newValue);
				return;
			case JavaPackage.JCLASS__ALL_TYPES:
				getAllTypes().clear();
				getAllTypes().addAll((Collection<? extends JClass>)newValue);
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
			case JavaPackage.JCLASS__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case JavaPackage.JCLASS__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case JavaPackage.JCLASS__INTERFACE:
				setInterface(INTERFACE_EDEFAULT);
				return;
			case JavaPackage.JCLASS__THROWABLE:
				setThrowable(THROWABLE_EDEFAULT);
				return;
			case JavaPackage.JCLASS__JAVA_CLASS:
				setJavaClass((Class<?>)null);
				return;
			case JavaPackage.JCLASS__FIELDS:
				getFields().clear();
				return;
			case JavaPackage.JCLASS__METHODS:
				getMethods().clear();
				return;
			case JavaPackage.JCLASS__SUPER_TYPES:
				getSuperTypes().clear();
				return;
			case JavaPackage.JCLASS__ALL_SUPER_TYPES:
				getAllSuperTypes().clear();
				return;
			case JavaPackage.JCLASS__MEMBERS:
				getMembers().clear();
				return;
			case JavaPackage.JCLASS__COMPONENT_TYPE:
				setComponentType((JClass)null);
				return;
			case JavaPackage.JCLASS__ARRAY_TYPE:
				setArrayType((JClass)null);
				return;
			case JavaPackage.JCLASS__UNIT:
				setUnit((JCompilationUnit)null);
				return;
			case JavaPackage.JCLASS__ALL_METHODS:
				getAllMethods().clear();
				return;
			case JavaPackage.JCLASS__ALL_FIELDS:
				getAllFields().clear();
				return;
			case JavaPackage.JCLASS__PACKAGE:
				setPackage((JPackage)null);
				return;
			case JavaPackage.JCLASS__TYPES:
				getTypes().clear();
				return;
			case JavaPackage.JCLASS__ALL_TYPES:
				getAllTypes().clear();
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
			case JavaPackage.JCLASS__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case JavaPackage.JCLASS__FINAL:
				return final_ != FINAL_EDEFAULT;
			case JavaPackage.JCLASS__INTERFACE:
				return interface_ != INTERFACE_EDEFAULT;
			case JavaPackage.JCLASS__THROWABLE:
				return throwable != THROWABLE_EDEFAULT;
			case JavaPackage.JCLASS__JAVA_CLASS:
				return javaClass != null;
			case JavaPackage.JCLASS__FIELDS:
				return !getFields().isEmpty();
			case JavaPackage.JCLASS__METHODS:
				return !getMethods().isEmpty();
			case JavaPackage.JCLASS__SUPER_TYPES:
				return superTypes != null && !superTypes.isEmpty();
			case JavaPackage.JCLASS__ALL_SUPER_TYPES:
				return !getAllSuperTypes().isEmpty();
			case JavaPackage.JCLASS__MEMBERS:
				return members != null && !members.isEmpty();
			case JavaPackage.JCLASS__COMPONENT_TYPE:
				return getComponentType() != null;
			case JavaPackage.JCLASS__ARRAY_TYPE:
				return arrayType != null;
			case JavaPackage.JCLASS__UNIT:
				return getUnit() != null;
			case JavaPackage.JCLASS__ALL_METHODS:
				return !getAllMethods().isEmpty();
			case JavaPackage.JCLASS__ALL_FIELDS:
				return !getAllFields().isEmpty();
			case JavaPackage.JCLASS__PACKAGE:
				return package_ != null;
			case JavaPackage.JCLASS__TYPES:
				return types != null && !types.isEmpty();
			case JavaPackage.JCLASS__ALL_TYPES:
				return allTypes != null && !allTypes.isEmpty();
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
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(", final: ");
		result.append(final_);
		result.append(", interface: ");
		result.append(interface_);
		result.append(", throwable: ");
		result.append(throwable);
		result.append(", javaClass: ");
		result.append(javaClass);
		result.append(')');
		return result.toString();
	}

} //JClassImpl
