/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.EqualityExpression;
import de.silvawb.java.EqualityExpressionChild;
import de.silvawb.java.EqualityOperator;
import de.silvawb.java.JavaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equality Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.EqualityExpressionImpl#getEqualityOperators <em>Equality Operators</em>}</li>
 *   <li>{@link de.silvawb.java.impl.EqualityExpressionImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EqualityExpressionImpl extends AndExpressionChildImpl implements EqualityExpression {
	/**
	 * The cached value of the '{@link #getEqualityOperators() <em>Equality Operators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqualityOperators()
	 * @generated
	 * @ordered
	 */
	protected EList<EqualityOperator> equalityOperators;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<EqualityExpressionChild> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EqualityExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getEqualityExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EqualityOperator> getEqualityOperators() {
		if (equalityOperators == null) {
			equalityOperators = new EObjectContainmentEList<EqualityOperator>(EqualityOperator.class, this, JavaPackage.EQUALITY_EXPRESSION__EQUALITY_OPERATORS);
		}
		return equalityOperators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EqualityExpressionChild> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<EqualityExpressionChild>(EqualityExpressionChild.class, this, JavaPackage.EQUALITY_EXPRESSION__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.EQUALITY_EXPRESSION__EQUALITY_OPERATORS:
				return ((InternalEList<?>)getEqualityOperators()).basicRemove(otherEnd, msgs);
			case JavaPackage.EQUALITY_EXPRESSION__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case JavaPackage.EQUALITY_EXPRESSION__EQUALITY_OPERATORS:
				return getEqualityOperators();
			case JavaPackage.EQUALITY_EXPRESSION__CHILDREN:
				return getChildren();
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
			case JavaPackage.EQUALITY_EXPRESSION__EQUALITY_OPERATORS:
				getEqualityOperators().clear();
				getEqualityOperators().addAll((Collection<? extends EqualityOperator>)newValue);
				return;
			case JavaPackage.EQUALITY_EXPRESSION__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends EqualityExpressionChild>)newValue);
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
			case JavaPackage.EQUALITY_EXPRESSION__EQUALITY_OPERATORS:
				getEqualityOperators().clear();
				return;
			case JavaPackage.EQUALITY_EXPRESSION__CHILDREN:
				getChildren().clear();
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
			case JavaPackage.EQUALITY_EXPRESSION__EQUALITY_OPERATORS:
				return equalityOperators != null && !equalityOperators.isEmpty();
			case JavaPackage.EQUALITY_EXPRESSION__CHILDREN:
				return children != null && !children.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EqualityExpressionImpl
