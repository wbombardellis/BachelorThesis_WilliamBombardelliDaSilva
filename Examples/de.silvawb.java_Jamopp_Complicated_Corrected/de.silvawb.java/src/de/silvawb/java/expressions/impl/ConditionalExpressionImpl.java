/**
 */
package de.silvawb.java.expressions.impl;

import de.silvawb.java.expressions.AssignmentExpressionChild;
import de.silvawb.java.expressions.ConditionalExpression;
import de.silvawb.java.expressions.ConditionalExpressionChild;
import de.silvawb.java.expressions.Expression;
import de.silvawb.java.expressions.ExpressionsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.expressions.impl.ConditionalExpressionImpl#getChild <em>Child</em>}</li>
 *   <li>{@link de.silvawb.java.expressions.impl.ConditionalExpressionImpl#getExpressionIf <em>Expression If</em>}</li>
 *   <li>{@link de.silvawb.java.expressions.impl.ConditionalExpressionImpl#getExpressionElse <em>Expression Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalExpressionImpl extends AssignmentExpressionChildImpl implements ConditionalExpression {
	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected ConditionalExpressionChild child;

	/**
	 * The cached value of the '{@link #getExpressionIf() <em>Expression If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionIf()
	 * @generated
	 * @ordered
	 */
	protected Expression expressionIf;

	/**
	 * The cached value of the '{@link #getExpressionElse() <em>Expression Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionElse()
	 * @generated
	 * @ordered
	 */
	protected AssignmentExpressionChild expressionElse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.CONDITIONAL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalExpressionChild getChild() {
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChild(ConditionalExpressionChild newChild, NotificationChain msgs) {
		ConditionalExpressionChild oldChild = child;
		child = newChild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD, oldChild, newChild);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChild(ConditionalExpressionChild newChild) {
		if (newChild != child) {
			NotificationChain msgs = null;
			if (child != null)
				msgs = ((InternalEObject)child).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD, null, msgs);
			if (newChild != null)
				msgs = ((InternalEObject)newChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD, null, msgs);
			msgs = basicSetChild(newChild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD, newChild, newChild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpressionIf() {
		return expressionIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpressionIf(Expression newExpressionIf, NotificationChain msgs) {
		Expression oldExpressionIf = expressionIf;
		expressionIf = newExpressionIf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF, oldExpressionIf, newExpressionIf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionIf(Expression newExpressionIf) {
		if (newExpressionIf != expressionIf) {
			NotificationChain msgs = null;
			if (expressionIf != null)
				msgs = ((InternalEObject)expressionIf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF, null, msgs);
			if (newExpressionIf != null)
				msgs = ((InternalEObject)newExpressionIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF, null, msgs);
			msgs = basicSetExpressionIf(newExpressionIf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF, newExpressionIf, newExpressionIf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentExpressionChild getExpressionElse() {
		return expressionElse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpressionElse(AssignmentExpressionChild newExpressionElse, NotificationChain msgs) {
		AssignmentExpressionChild oldExpressionElse = expressionElse;
		expressionElse = newExpressionElse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE, oldExpressionElse, newExpressionElse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionElse(AssignmentExpressionChild newExpressionElse) {
		if (newExpressionElse != expressionElse) {
			NotificationChain msgs = null;
			if (expressionElse != null)
				msgs = ((InternalEObject)expressionElse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE, null, msgs);
			if (newExpressionElse != null)
				msgs = ((InternalEObject)newExpressionElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE, null, msgs);
			msgs = basicSetExpressionElse(newExpressionElse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE, newExpressionElse, newExpressionElse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD:
				return basicSetChild(null, msgs);
			case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF:
				return basicSetExpressionIf(null, msgs);
			case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE:
				return basicSetExpressionElse(null, msgs);
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
			case ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD:
				return getChild();
			case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF:
				return getExpressionIf();
			case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE:
				return getExpressionElse();
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
			case ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD:
				setChild((ConditionalExpressionChild)newValue);
				return;
			case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF:
				setExpressionIf((Expression)newValue);
				return;
			case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE:
				setExpressionElse((AssignmentExpressionChild)newValue);
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
			case ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD:
				setChild((ConditionalExpressionChild)null);
				return;
			case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF:
				setExpressionIf((Expression)null);
				return;
			case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE:
				setExpressionElse((AssignmentExpressionChild)null);
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
			case ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD:
				return child != null;
			case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF:
				return expressionIf != null;
			case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE:
				return expressionElse != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalExpressionImpl
