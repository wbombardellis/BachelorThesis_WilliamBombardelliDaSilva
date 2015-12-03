/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.JClass;
import de.silvawb.java.JMethod;
import de.silvawb.java.JParameter;
import de.silvawb.java.JavaPackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JMethod</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.JMethodImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JMethodImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JMethodImpl#isNative <em>Native</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JMethodImpl#isSynchronized <em>Synchronized</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JMethodImpl#getJavaMethod <em>Java Method</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JMethodImpl#isConstructor <em>Constructor</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JMethodImpl#getJavaConstructor <em>Java Constructor</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JMethodImpl#getBody <em>Body</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JMethodImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JMethodImpl#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JMethodImpl#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JMethodImpl extends JMemberImpl implements JMethod {
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
	 * The default value of the '{@link #isNative() <em>Native</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NATIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNative() <em>Native</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNative()
	 * @generated
	 * @ordered
	 */
	protected boolean native_ = NATIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSynchronized() <em>Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchronized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYNCHRONIZED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSynchronized() <em>Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchronized()
	 * @generated
	 * @ordered
	 */
	protected boolean synchronized_ = SYNCHRONIZED_EDEFAULT;

	/**
	 * The default value of the '{@link #getJavaMethod() <em>Java Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaMethod()
	 * @generated
	 * @ordered
	 */
	protected static final Method JAVA_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJavaMethod() <em>Java Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaMethod()
	 * @generated
	 * @ordered
	 */
	protected Method javaMethod = JAVA_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #isConstructor() <em>Constructor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstructor()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSTRUCTOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConstructor() <em>Constructor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstructor()
	 * @generated
	 * @ordered
	 */
	protected boolean constructor = CONSTRUCTOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getJavaConstructor() <em>Java Constructor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaConstructor()
	 * @generated
	 * @ordered
	 */
	protected Constructor<?> javaConstructor;

	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<JParameter> parameters;

	/**
	 * The cached value of the '{@link #getExceptions() <em>Exceptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<JClass> exceptions;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected JClass returnType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.JMETHOD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.JMETHOD__ABSTRACT, oldAbstract, abstract_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.JMETHOD__FINAL, oldFinal, final_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNative() {
		return native_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNative(boolean newNative) {
		boolean oldNative = native_;
		native_ = newNative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.JMETHOD__NATIVE, oldNative, native_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSynchronized() {
		return synchronized_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronized(boolean newSynchronized) {
		boolean oldSynchronized = synchronized_;
		synchronized_ = newSynchronized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.JMETHOD__SYNCHRONIZED, oldSynchronized, synchronized_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getJavaMethod() {
		return javaMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaMethod(Method newJavaMethod) {
		Method oldJavaMethod = javaMethod;
		javaMethod = newJavaMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.JMETHOD__JAVA_METHOD, oldJavaMethod, javaMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConstructor() {
		return constructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstructor(boolean newConstructor) {
		boolean oldConstructor = constructor;
		constructor = newConstructor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.JMETHOD__CONSTRUCTOR, oldConstructor, constructor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constructor<?> getJavaConstructor() {
		return javaConstructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaConstructor(Constructor<?> newJavaConstructor) {
		Constructor<?> oldJavaConstructor = javaConstructor;
		javaConstructor = newJavaConstructor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.JMETHOD__JAVA_CONSTRUCTOR, oldJavaConstructor, javaConstructor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.JMETHOD__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentWithInverseEList<JParameter>(JParameter.class, this, JavaPackage.JMETHOD__PARAMETERS, JavaPackage.JPARAMETER__METHOD);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JClass> getExceptions() {
		if (exceptions == null) {
			exceptions = new EObjectResolvingEList<JClass>(JClass.class, this, JavaPackage.JMETHOD__EXCEPTIONS);
		}
		return exceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JClass getReturnType() {
		if (returnType != null && returnType.eIsProxy()) {
			InternalEObject oldReturnType = (InternalEObject)returnType;
			returnType = (JClass)eResolveProxy(oldReturnType);
			if (returnType != oldReturnType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaPackage.JMETHOD__RETURN_TYPE, oldReturnType, returnType));
			}
		}
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JClass basicGetReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(JClass newReturnType) {
		JClass oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.JMETHOD__RETURN_TYPE, oldReturnType, returnType));
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
			case JavaPackage.JMETHOD__PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameters()).basicAdd(otherEnd, msgs);
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
			case JavaPackage.JMETHOD__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case JavaPackage.JMETHOD__ABSTRACT:
				return isAbstract();
			case JavaPackage.JMETHOD__FINAL:
				return isFinal();
			case JavaPackage.JMETHOD__NATIVE:
				return isNative();
			case JavaPackage.JMETHOD__SYNCHRONIZED:
				return isSynchronized();
			case JavaPackage.JMETHOD__JAVA_METHOD:
				return getJavaMethod();
			case JavaPackage.JMETHOD__CONSTRUCTOR:
				return isConstructor();
			case JavaPackage.JMETHOD__JAVA_CONSTRUCTOR:
				return getJavaConstructor();
			case JavaPackage.JMETHOD__BODY:
				return getBody();
			case JavaPackage.JMETHOD__PARAMETERS:
				return getParameters();
			case JavaPackage.JMETHOD__EXCEPTIONS:
				return getExceptions();
			case JavaPackage.JMETHOD__RETURN_TYPE:
				if (resolve) return getReturnType();
				return basicGetReturnType();
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
			case JavaPackage.JMETHOD__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case JavaPackage.JMETHOD__FINAL:
				setFinal((Boolean)newValue);
				return;
			case JavaPackage.JMETHOD__NATIVE:
				setNative((Boolean)newValue);
				return;
			case JavaPackage.JMETHOD__SYNCHRONIZED:
				setSynchronized((Boolean)newValue);
				return;
			case JavaPackage.JMETHOD__JAVA_METHOD:
				setJavaMethod((Method)newValue);
				return;
			case JavaPackage.JMETHOD__CONSTRUCTOR:
				setConstructor((Boolean)newValue);
				return;
			case JavaPackage.JMETHOD__JAVA_CONSTRUCTOR:
				setJavaConstructor((Constructor<?>)newValue);
				return;
			case JavaPackage.JMETHOD__BODY:
				setBody((String)newValue);
				return;
			case JavaPackage.JMETHOD__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends JParameter>)newValue);
				return;
			case JavaPackage.JMETHOD__EXCEPTIONS:
				getExceptions().clear();
				getExceptions().addAll((Collection<? extends JClass>)newValue);
				return;
			case JavaPackage.JMETHOD__RETURN_TYPE:
				setReturnType((JClass)newValue);
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
			case JavaPackage.JMETHOD__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case JavaPackage.JMETHOD__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case JavaPackage.JMETHOD__NATIVE:
				setNative(NATIVE_EDEFAULT);
				return;
			case JavaPackage.JMETHOD__SYNCHRONIZED:
				setSynchronized(SYNCHRONIZED_EDEFAULT);
				return;
			case JavaPackage.JMETHOD__JAVA_METHOD:
				setJavaMethod(JAVA_METHOD_EDEFAULT);
				return;
			case JavaPackage.JMETHOD__CONSTRUCTOR:
				setConstructor(CONSTRUCTOR_EDEFAULT);
				return;
			case JavaPackage.JMETHOD__JAVA_CONSTRUCTOR:
				setJavaConstructor((Constructor<?>)null);
				return;
			case JavaPackage.JMETHOD__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case JavaPackage.JMETHOD__PARAMETERS:
				getParameters().clear();
				return;
			case JavaPackage.JMETHOD__EXCEPTIONS:
				getExceptions().clear();
				return;
			case JavaPackage.JMETHOD__RETURN_TYPE:
				setReturnType((JClass)null);
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
			case JavaPackage.JMETHOD__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case JavaPackage.JMETHOD__FINAL:
				return final_ != FINAL_EDEFAULT;
			case JavaPackage.JMETHOD__NATIVE:
				return native_ != NATIVE_EDEFAULT;
			case JavaPackage.JMETHOD__SYNCHRONIZED:
				return synchronized_ != SYNCHRONIZED_EDEFAULT;
			case JavaPackage.JMETHOD__JAVA_METHOD:
				return JAVA_METHOD_EDEFAULT == null ? javaMethod != null : !JAVA_METHOD_EDEFAULT.equals(javaMethod);
			case JavaPackage.JMETHOD__CONSTRUCTOR:
				return constructor != CONSTRUCTOR_EDEFAULT;
			case JavaPackage.JMETHOD__JAVA_CONSTRUCTOR:
				return javaConstructor != null;
			case JavaPackage.JMETHOD__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case JavaPackage.JMETHOD__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case JavaPackage.JMETHOD__EXCEPTIONS:
				return exceptions != null && !exceptions.isEmpty();
			case JavaPackage.JMETHOD__RETURN_TYPE:
				return returnType != null;
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
		result.append(", native: ");
		result.append(native_);
		result.append(", synchronized: ");
		result.append(synchronized_);
		result.append(", javaMethod: ");
		result.append(javaMethod);
		result.append(", constructor: ");
		result.append(constructor);
		result.append(", javaConstructor: ");
		result.append(javaConstructor);
		result.append(", body: ");
		result.append(body);
		result.append(')');
		return result.toString();
	}

} //JMethodImpl
