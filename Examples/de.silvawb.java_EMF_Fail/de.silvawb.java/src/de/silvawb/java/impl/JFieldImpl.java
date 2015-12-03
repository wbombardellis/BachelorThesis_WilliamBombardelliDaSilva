/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.JClass;
import de.silvawb.java.JField;
import de.silvawb.java.JavaPackage;

import java.lang.reflect.Field;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JField</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.JFieldImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JFieldImpl#isTransient <em>Transient</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JFieldImpl#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JFieldImpl#getJavaField <em>Java Field</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JFieldImpl#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JFieldImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JFieldImpl extends JMemberImpl implements JField {
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
	 * The default value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSIENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected boolean transient_ = TRANSIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVolatile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VOLATILE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVolatile()
	 * @generated
	 * @ordered
	 */
	protected boolean volatile_ = VOLATILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getJavaField() <em>Java Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaField()
	 * @generated
	 * @ordered
	 */
	protected static final Field JAVA_FIELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJavaField() <em>Java Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaField()
	 * @generated
	 * @ordered
	 */
	protected Field javaField = JAVA_FIELD_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitializer() <em>Initializer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializer()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIALIZER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitializer() <em>Initializer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializer()
	 * @generated
	 * @ordered
	 */
	protected String initializer = INITIALIZER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected JClass type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.JFIELD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.JFIELD__FINAL, oldFinal, final_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransient() {
		return transient_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransient(boolean newTransient) {
		boolean oldTransient = transient_;
		transient_ = newTransient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.JFIELD__TRANSIENT, oldTransient, transient_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVolatile() {
		return volatile_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolatile(boolean newVolatile) {
		boolean oldVolatile = volatile_;
		volatile_ = newVolatile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.JFIELD__VOLATILE, oldVolatile, volatile_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getJavaField() {
		return javaField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaField(Field newJavaField) {
		Field oldJavaField = javaField;
		javaField = newJavaField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.JFIELD__JAVA_FIELD, oldJavaField, javaField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitializer() {
		return initializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitializer(String newInitializer) {
		String oldInitializer = initializer;
		initializer = newInitializer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.JFIELD__INITIALIZER, oldInitializer, initializer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JClass getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (JClass)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaPackage.JFIELD__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JClass basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(JClass newType) {
		JClass oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.JFIELD__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaPackage.JFIELD__FINAL:
				return isFinal();
			case JavaPackage.JFIELD__TRANSIENT:
				return isTransient();
			case JavaPackage.JFIELD__VOLATILE:
				return isVolatile();
			case JavaPackage.JFIELD__JAVA_FIELD:
				return getJavaField();
			case JavaPackage.JFIELD__INITIALIZER:
				return getInitializer();
			case JavaPackage.JFIELD__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case JavaPackage.JFIELD__FINAL:
				setFinal((Boolean)newValue);
				return;
			case JavaPackage.JFIELD__TRANSIENT:
				setTransient((Boolean)newValue);
				return;
			case JavaPackage.JFIELD__VOLATILE:
				setVolatile((Boolean)newValue);
				return;
			case JavaPackage.JFIELD__JAVA_FIELD:
				setJavaField((Field)newValue);
				return;
			case JavaPackage.JFIELD__INITIALIZER:
				setInitializer((String)newValue);
				return;
			case JavaPackage.JFIELD__TYPE:
				setType((JClass)newValue);
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
			case JavaPackage.JFIELD__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case JavaPackage.JFIELD__TRANSIENT:
				setTransient(TRANSIENT_EDEFAULT);
				return;
			case JavaPackage.JFIELD__VOLATILE:
				setVolatile(VOLATILE_EDEFAULT);
				return;
			case JavaPackage.JFIELD__JAVA_FIELD:
				setJavaField(JAVA_FIELD_EDEFAULT);
				return;
			case JavaPackage.JFIELD__INITIALIZER:
				setInitializer(INITIALIZER_EDEFAULT);
				return;
			case JavaPackage.JFIELD__TYPE:
				setType((JClass)null);
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
			case JavaPackage.JFIELD__FINAL:
				return final_ != FINAL_EDEFAULT;
			case JavaPackage.JFIELD__TRANSIENT:
				return transient_ != TRANSIENT_EDEFAULT;
			case JavaPackage.JFIELD__VOLATILE:
				return volatile_ != VOLATILE_EDEFAULT;
			case JavaPackage.JFIELD__JAVA_FIELD:
				return JAVA_FIELD_EDEFAULT == null ? javaField != null : !JAVA_FIELD_EDEFAULT.equals(javaField);
			case JavaPackage.JFIELD__INITIALIZER:
				return INITIALIZER_EDEFAULT == null ? initializer != null : !INITIALIZER_EDEFAULT.equals(initializer);
			case JavaPackage.JFIELD__TYPE:
				return type != null;
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
		result.append(" (final: ");
		result.append(final_);
		result.append(", transient: ");
		result.append(transient_);
		result.append(", volatile: ");
		result.append(volatile_);
		result.append(", javaField: ");
		result.append(javaField);
		result.append(", initializer: ");
		result.append(initializer);
		result.append(')');
		return result.toString();
	}

} //JFieldImpl
