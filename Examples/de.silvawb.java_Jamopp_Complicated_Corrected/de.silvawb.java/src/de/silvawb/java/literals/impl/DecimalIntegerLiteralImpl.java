/**
 */
package de.silvawb.java.literals.impl;

import de.silvawb.java.literals.DecimalIntegerLiteral;
import de.silvawb.java.literals.LiteralsPackage;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decimal Integer Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.literals.impl.DecimalIntegerLiteralImpl#getDecimalValue <em>Decimal Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecimalIntegerLiteralImpl extends IntegerLiteralImpl implements DecimalIntegerLiteral {
	/**
	 * The default value of the '{@link #getDecimalValue() <em>Decimal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DECIMAL_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecimalValue() <em>Decimal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalValue()
	 * @generated
	 * @ordered
	 */
	protected BigInteger decimalValue = DECIMAL_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecimalIntegerLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LiteralsPackage.Literals.DECIMAL_INTEGER_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDecimalValue() {
		return decimalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecimalValue(BigInteger newDecimalValue) {
		BigInteger oldDecimalValue = decimalValue;
		decimalValue = newDecimalValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LiteralsPackage.DECIMAL_INTEGER_LITERAL__DECIMAL_VALUE, oldDecimalValue, decimalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LiteralsPackage.DECIMAL_INTEGER_LITERAL__DECIMAL_VALUE:
				return getDecimalValue();
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
			case LiteralsPackage.DECIMAL_INTEGER_LITERAL__DECIMAL_VALUE:
				setDecimalValue((BigInteger)newValue);
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
			case LiteralsPackage.DECIMAL_INTEGER_LITERAL__DECIMAL_VALUE:
				setDecimalValue(DECIMAL_VALUE_EDEFAULT);
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
			case LiteralsPackage.DECIMAL_INTEGER_LITERAL__DECIMAL_VALUE:
				return DECIMAL_VALUE_EDEFAULT == null ? decimalValue != null : !DECIMAL_VALUE_EDEFAULT.equals(decimalValue);
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
		result.append(" (decimalValue: ");
		result.append(decimalValue);
		result.append(')');
		return result.toString();
	}

} //DecimalIntegerLiteralImpl
