/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.HexFloatLiteral;
import de.silvawb.java.JavaPackage;

import java.lang.Float;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hex Float Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.HexFloatLiteralImpl#getHexValue <em>Hex Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HexFloatLiteralImpl extends FloatLiteralImpl implements HexFloatLiteral {
	/**
	 * The default value of the '{@link #getHexValue() <em>Hex Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHexValue()
	 * @generated
	 * @ordered
	 */
	protected static final float HEX_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHexValue() <em>Hex Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHexValue()
	 * @generated
	 * @ordered
	 */
	protected float hexValue = HEX_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HexFloatLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getHexFloatLiteral();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHexValue() {
		return hexValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHexValue(float newHexValue) {
		float oldHexValue = hexValue;
		hexValue = newHexValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.HEX_FLOAT_LITERAL__HEX_VALUE, oldHexValue, hexValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaPackage.HEX_FLOAT_LITERAL__HEX_VALUE:
				return getHexValue();
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
			case JavaPackage.HEX_FLOAT_LITERAL__HEX_VALUE:
				setHexValue((Float)newValue);
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
			case JavaPackage.HEX_FLOAT_LITERAL__HEX_VALUE:
				setHexValue(HEX_VALUE_EDEFAULT);
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
			case JavaPackage.HEX_FLOAT_LITERAL__HEX_VALUE:
				return hexValue != HEX_VALUE_EDEFAULT;
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
		result.append(" (hexValue: ");
		result.append(hexValue);
		result.append(')');
		return result.toString();
	}

} //HexFloatLiteralImpl
