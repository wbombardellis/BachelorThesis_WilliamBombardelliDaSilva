/**
 */
package de.silvawb.java.expressions.impl;

import de.silvawb.java.expressions.ExpressionsPackage;
import de.silvawb.java.expressions.MultiplicativeExpression;
import de.silvawb.java.expressions.MultiplicativeExpressionChild;

import de.silvawb.java.operators.MultiplicativeOperator;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplicative Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.expressions.impl.MultiplicativeExpressionImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link de.silvawb.java.expressions.impl.MultiplicativeExpressionImpl#getMultiplicativeOperators <em>Multiplicative Operators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiplicativeExpressionImpl extends AdditiveExpressionChildImpl implements MultiplicativeExpression {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<MultiplicativeExpressionChild> children;

	/**
	 * The cached value of the '{@link #getMultiplicativeOperators() <em>Multiplicative Operators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicativeOperators()
	 * @generated
	 * @ordered
	 */
	protected EList<MultiplicativeOperator> multiplicativeOperators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicativeExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.MULTIPLICATIVE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MultiplicativeExpressionChild> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<MultiplicativeExpressionChild>(MultiplicativeExpressionChild.class, this, ExpressionsPackage.MULTIPLICATIVE_EXPRESSION__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MultiplicativeOperator> getMultiplicativeOperators() {
		if (multiplicativeOperators == null) {
			multiplicativeOperators = new EObjectContainmentEList<MultiplicativeOperator>(MultiplicativeOperator.class, this, ExpressionsPackage.MULTIPLICATIVE_EXPRESSION__MULTIPLICATIVE_OPERATORS);
		}
		return multiplicativeOperators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionsPackage.MULTIPLICATIVE_EXPRESSION__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case ExpressionsPackage.MULTIPLICATIVE_EXPRESSION__MULTIPLICATIVE_OPERATORS:
				return ((InternalEList<?>)getMultiplicativeOperators()).basicRemove(otherEnd, msgs);
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
			case ExpressionsPackage.MULTIPLICATIVE_EXPRESSION__CHILDREN:
				return getChildren();
			case ExpressionsPackage.MULTIPLICATIVE_EXPRESSION__MULTIPLICATIVE_OPERATORS:
				return getMultiplicativeOperators();
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
			case ExpressionsPackage.MULTIPLICATIVE_EXPRESSION__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends MultiplicativeExpressionChild>)newValue);
				return;
			case ExpressionsPackage.MULTIPLICATIVE_EXPRESSION__MULTIPLICATIVE_OPERATORS:
				getMultiplicativeOperators().clear();
				getMultiplicativeOperators().addAll((Collection<? extends MultiplicativeOperator>)newValue);
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
			case ExpressionsPackage.MULTIPLICATIVE_EXPRESSION__CHILDREN:
				getChildren().clear();
				return;
			case ExpressionsPackage.MULTIPLICATIVE_EXPRESSION__MULTIPLICATIVE_OPERATORS:
				getMultiplicativeOperators().clear();
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
			case ExpressionsPackage.MULTIPLICATIVE_EXPRESSION__CHILDREN:
				return children != null && !children.isEmpty();
			case ExpressionsPackage.MULTIPLICATIVE_EXPRESSION__MULTIPLICATIVE_OPERATORS:
				return multiplicativeOperators != null && !multiplicativeOperators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MultiplicativeExpressionImpl
