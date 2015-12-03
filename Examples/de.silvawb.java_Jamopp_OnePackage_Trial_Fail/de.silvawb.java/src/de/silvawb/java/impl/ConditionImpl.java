/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.Condition;
import de.silvawb.java.Conditional;
import de.silvawb.java.Expression;
import de.silvawb.java.JavaPackage;
import de.silvawb.java.Statement;
import de.silvawb.java.StatementContainer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.ConditionImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ConditionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ConditionImpl#getElseStatement <em>Else Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends StatementImpl implements Condition {
	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected Statement statement;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression condition;

	/**
	 * The cached value of the '{@link #getElseStatement() <em>Else Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseStatement()
	 * @generated
	 * @ordered
	 */
	protected Statement elseStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getStatement() {
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatement(Statement newStatement, NotificationChain msgs) {
		Statement oldStatement = statement;
		statement = newStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.CONDITION__STATEMENT, oldStatement, newStatement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatement(Statement newStatement) {
		if (newStatement != statement) {
			NotificationChain msgs = null;
			if (statement != null)
				msgs = ((InternalEObject)statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.CONDITION__STATEMENT, null, msgs);
			if (newStatement != null)
				msgs = ((InternalEObject)newStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.CONDITION__STATEMENT, null, msgs);
			msgs = basicSetStatement(newStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.CONDITION__STATEMENT, newStatement, newStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
		Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.CONDITION__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Expression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.CONDITION__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.CONDITION__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.CONDITION__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getElseStatement() {
		return elseStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseStatement(Statement newElseStatement, NotificationChain msgs) {
		Statement oldElseStatement = elseStatement;
		elseStatement = newElseStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.CONDITION__ELSE_STATEMENT, oldElseStatement, newElseStatement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseStatement(Statement newElseStatement) {
		if (newElseStatement != elseStatement) {
			NotificationChain msgs = null;
			if (elseStatement != null)
				msgs = ((InternalEObject)elseStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.CONDITION__ELSE_STATEMENT, null, msgs);
			if (newElseStatement != null)
				msgs = ((InternalEObject)newElseStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.CONDITION__ELSE_STATEMENT, null, msgs);
			msgs = basicSetElseStatement(newElseStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.CONDITION__ELSE_STATEMENT, newElseStatement, newElseStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.CONDITION__STATEMENT:
				return basicSetStatement(null, msgs);
			case JavaPackage.CONDITION__CONDITION:
				return basicSetCondition(null, msgs);
			case JavaPackage.CONDITION__ELSE_STATEMENT:
				return basicSetElseStatement(null, msgs);
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
			case JavaPackage.CONDITION__STATEMENT:
				return getStatement();
			case JavaPackage.CONDITION__CONDITION:
				return getCondition();
			case JavaPackage.CONDITION__ELSE_STATEMENT:
				return getElseStatement();
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
			case JavaPackage.CONDITION__STATEMENT:
				setStatement((Statement)newValue);
				return;
			case JavaPackage.CONDITION__CONDITION:
				setCondition((Expression)newValue);
				return;
			case JavaPackage.CONDITION__ELSE_STATEMENT:
				setElseStatement((Statement)newValue);
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
			case JavaPackage.CONDITION__STATEMENT:
				setStatement((Statement)null);
				return;
			case JavaPackage.CONDITION__CONDITION:
				setCondition((Expression)null);
				return;
			case JavaPackage.CONDITION__ELSE_STATEMENT:
				setElseStatement((Statement)null);
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
			case JavaPackage.CONDITION__STATEMENT:
				return statement != null;
			case JavaPackage.CONDITION__CONDITION:
				return condition != null;
			case JavaPackage.CONDITION__ELSE_STATEMENT:
				return elseStatement != null;
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
		if (baseClass == StatementContainer.class) {
			switch (derivedFeatureID) {
				case JavaPackage.CONDITION__STATEMENT: return JavaPackage.STATEMENT_CONTAINER__STATEMENT;
				default: return -1;
			}
		}
		if (baseClass == Conditional.class) {
			switch (derivedFeatureID) {
				case JavaPackage.CONDITION__CONDITION: return JavaPackage.CONDITIONAL__CONDITION;
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
		if (baseClass == StatementContainer.class) {
			switch (baseFeatureID) {
				case JavaPackage.STATEMENT_CONTAINER__STATEMENT: return JavaPackage.CONDITION__STATEMENT;
				default: return -1;
			}
		}
		if (baseClass == Conditional.class) {
			switch (baseFeatureID) {
				case JavaPackage.CONDITIONAL__CONDITION: return JavaPackage.CONDITION__CONDITION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ConditionImpl
