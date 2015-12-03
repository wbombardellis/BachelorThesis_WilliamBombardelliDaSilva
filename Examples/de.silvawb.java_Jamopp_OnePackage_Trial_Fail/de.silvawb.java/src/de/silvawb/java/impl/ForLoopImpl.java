/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.Conditional;
import de.silvawb.java.Expression;
import de.silvawb.java.ForLoop;
import de.silvawb.java.ForLoopInitializer;
import de.silvawb.java.JavaPackage;
import de.silvawb.java.Statement;
import de.silvawb.java.StatementContainer;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.ForLoopImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ForLoopImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ForLoopImpl#getInit <em>Init</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ForLoopImpl#getUpdates <em>Updates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForLoopImpl extends StatementImpl implements ForLoop {
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
	 * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInit()
	 * @generated
	 * @ordered
	 */
	protected ForLoopInitializer init;

	/**
	 * The cached value of the '{@link #getUpdates() <em>Updates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdates()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> updates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForLoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getForLoop();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.FOR_LOOP__STATEMENT, oldStatement, newStatement);
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
				msgs = ((InternalEObject)statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.FOR_LOOP__STATEMENT, null, msgs);
			if (newStatement != null)
				msgs = ((InternalEObject)newStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.FOR_LOOP__STATEMENT, null, msgs);
			msgs = basicSetStatement(newStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.FOR_LOOP__STATEMENT, newStatement, newStatement));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.FOR_LOOP__CONDITION, oldCondition, newCondition);
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
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.FOR_LOOP__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.FOR_LOOP__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.FOR_LOOP__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForLoopInitializer getInit() {
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInit(ForLoopInitializer newInit, NotificationChain msgs) {
		ForLoopInitializer oldInit = init;
		init = newInit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.FOR_LOOP__INIT, oldInit, newInit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInit(ForLoopInitializer newInit) {
		if (newInit != init) {
			NotificationChain msgs = null;
			if (init != null)
				msgs = ((InternalEObject)init).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.FOR_LOOP__INIT, null, msgs);
			if (newInit != null)
				msgs = ((InternalEObject)newInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.FOR_LOOP__INIT, null, msgs);
			msgs = basicSetInit(newInit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.FOR_LOOP__INIT, newInit, newInit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getUpdates() {
		if (updates == null) {
			updates = new EObjectContainmentEList<Expression>(Expression.class, this, JavaPackage.FOR_LOOP__UPDATES);
		}
		return updates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.FOR_LOOP__STATEMENT:
				return basicSetStatement(null, msgs);
			case JavaPackage.FOR_LOOP__CONDITION:
				return basicSetCondition(null, msgs);
			case JavaPackage.FOR_LOOP__INIT:
				return basicSetInit(null, msgs);
			case JavaPackage.FOR_LOOP__UPDATES:
				return ((InternalEList<?>)getUpdates()).basicRemove(otherEnd, msgs);
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
			case JavaPackage.FOR_LOOP__STATEMENT:
				return getStatement();
			case JavaPackage.FOR_LOOP__CONDITION:
				return getCondition();
			case JavaPackage.FOR_LOOP__INIT:
				return getInit();
			case JavaPackage.FOR_LOOP__UPDATES:
				return getUpdates();
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
			case JavaPackage.FOR_LOOP__STATEMENT:
				setStatement((Statement)newValue);
				return;
			case JavaPackage.FOR_LOOP__CONDITION:
				setCondition((Expression)newValue);
				return;
			case JavaPackage.FOR_LOOP__INIT:
				setInit((ForLoopInitializer)newValue);
				return;
			case JavaPackage.FOR_LOOP__UPDATES:
				getUpdates().clear();
				getUpdates().addAll((Collection<? extends Expression>)newValue);
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
			case JavaPackage.FOR_LOOP__STATEMENT:
				setStatement((Statement)null);
				return;
			case JavaPackage.FOR_LOOP__CONDITION:
				setCondition((Expression)null);
				return;
			case JavaPackage.FOR_LOOP__INIT:
				setInit((ForLoopInitializer)null);
				return;
			case JavaPackage.FOR_LOOP__UPDATES:
				getUpdates().clear();
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
			case JavaPackage.FOR_LOOP__STATEMENT:
				return statement != null;
			case JavaPackage.FOR_LOOP__CONDITION:
				return condition != null;
			case JavaPackage.FOR_LOOP__INIT:
				return init != null;
			case JavaPackage.FOR_LOOP__UPDATES:
				return updates != null && !updates.isEmpty();
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
				case JavaPackage.FOR_LOOP__STATEMENT: return JavaPackage.STATEMENT_CONTAINER__STATEMENT;
				default: return -1;
			}
		}
		if (baseClass == Conditional.class) {
			switch (derivedFeatureID) {
				case JavaPackage.FOR_LOOP__CONDITION: return JavaPackage.CONDITIONAL__CONDITION;
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
				case JavaPackage.STATEMENT_CONTAINER__STATEMENT: return JavaPackage.FOR_LOOP__STATEMENT;
				default: return -1;
			}
		}
		if (baseClass == Conditional.class) {
			switch (baseFeatureID) {
				case JavaPackage.CONDITIONAL__CONDITION: return JavaPackage.FOR_LOOP__CONDITION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ForLoopImpl
