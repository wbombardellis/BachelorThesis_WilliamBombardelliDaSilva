/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.HexDoubleLiteral;
import de.silvawb.java.JavaPackage;

import java.lang.Double;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hex Double Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.HexDoubleLiteralImpl#getHexValue <em>Hex Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HexDoubleLiteralImpl extends DoubleLiteralImpl implements HexDoubleLiteral {
	/**
	 * The default value of the '{@link #getHexValue() <em>Hex Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHexValue()
	 * @generated
	 * @ordered
	 */
	protected static final double HEX_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHexValue() <em>Hex Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHexValue()
	 * @generated
	 * @ordered
	 */
	protected double hexValue = HEX_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HexDoubleLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getHexDoubleLiteral();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHexValue() {
		return hexValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHexValue(double newHexValue) {
		double oldHexValue = hexValue;
		hexValue = newHexValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.HEX_DOUBLE_LITERAL__HEX_VALUE, oldHexValue, hexValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaPackage.HEX_DOUBLE_LITERAL__HEX_VALUE:
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
			case JavaPackage.HEX_DOUBLE_LITERAL__HEX_VALUE:
				setHexValue((Double)newValue);
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
			case JavaPackage.HEX_DOUBLE_LITERAL__HEX_VALUE:
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
			case JavaPackage.HEX_DOUBLE_LITERAL__HEX_VALUE:
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

} //HexDoubleLiteralImpl
