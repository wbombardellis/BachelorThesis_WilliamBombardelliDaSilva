/**
 */
package de.silvawb.java.statements.impl;

import de.silvawb.java.expressions.Expression;

import de.silvawb.java.statements.StatementsPackage;
import de.silvawb.java.statements.Throw;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Throw</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.statements.impl.ThrowImpl#getThrowable <em>Throwable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThrowImpl extends StatementImpl implements Throw {
	/**
	 * The cached value of the '{@link #getThrowable() <em>Throwable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrowable()
	 * @generated
	 * @ordered
	 */
	protected Expression throwable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThrowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.THROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getThrowable() {
		return throwable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThrowable(Expression newThrowable, NotificationChain msgs) {
		Expression oldThrowable = throwable;
		throwable = newThrowable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.THROW__THROWABLE, oldThrowable, newThrowable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThrowable(Expression newThrowable) {
		if (newThrowable != throwable) {
			NotificationChain msgs = null;
			if (throwable != null)
				msgs = ((InternalEObject)throwable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.THROW__THROWABLE, null, msgs);
			if (newThrowable != null)
				msgs = ((InternalEObject)newThrowable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.THROW__THROWABLE, null, msgs);
			msgs = basicSetThrowable(newThrowable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.THROW__THROWABLE, newThrowable, newThrowable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementsPackage.THROW__THROWABLE:
				return basicSetThrowable(null, msgs);
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
			case StatementsPackage.THROW__THROWABLE:
				return getThrowable();
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
			case StatementsPackage.THROW__THROWABLE:
				setThrowable((Expression)newValue);
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
			case StatementsPackage.THROW__THROWABLE:
				setThrowable((Expression)null);
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
			case StatementsPackage.THROW__THROWABLE:
				return throwable != null;
		}
		return super.eIsSet(featureID);
	}

} //ThrowImpl
