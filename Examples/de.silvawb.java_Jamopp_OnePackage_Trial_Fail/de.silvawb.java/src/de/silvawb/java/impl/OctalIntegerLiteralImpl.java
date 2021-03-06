/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.JavaPackage;
import de.silvawb.java.OctalIntegerLiteral;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Octal Integer Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.OctalIntegerLiteralImpl#getOctalValue <em>Octal Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OctalIntegerLiteralImpl extends IntegerLiteralImpl implements OctalIntegerLiteral {
	/**
	 * The default value of the '{@link #getOctalValue() <em>Octal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOctalValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger OCTAL_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOctalValue() <em>Octal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOctalValue()
	 * @generated
	 * @ordered
	 */
	protected BigInteger octalValue = OCTAL_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OctalIntegerLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getOctalIntegerLiteral();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getOctalValue() {
		return octalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOctalValue(BigInteger newOctalValue) {
		BigInteger oldOctalValue = octalValue;
		octalValue = newOctalValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.OCTAL_INTEGER_LITERAL__OCTAL_VALUE, oldOctalValue, octalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaPackage.OCTAL_INTEGER_LITERAL__OCTAL_VALUE:
				return getOctalValue();
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
			case JavaPackage.OCTAL_INTEGER_LITERAL__OCTAL_VALUE:
				setOctalValue((BigInteger)newValue);
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
			case JavaPackage.OCTAL_INTEGER_LITERAL__OCTAL_VALUE:
				setOctalValue(OCTAL_VALUE_EDEFAULT);
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
			case JavaPackage.OCTAL_INTEGER_LITERAL__OCTAL_VALUE:
				return OCTAL_VALUE_EDEFAULT == null ? octalValue != null : !OCTAL_VALUE_EDEFAULT.equals(octalValue);
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
		result.append(" (octalValue: ");
		result.append(octalValue);
		result.append(')');
		return result.toString();
	}

} //OctalIntegerLiteralImpl
