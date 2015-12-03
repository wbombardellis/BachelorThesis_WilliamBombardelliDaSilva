/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.JavaPackage;
import de.silvawb.java.ShiftExpression;
import de.silvawb.java.ShiftExpressionChild;
import de.silvawb.java.ShiftOperator;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shift Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.ShiftExpressionImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ShiftExpressionImpl#getShiftOperators <em>Shift Operators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShiftExpressionImpl extends RelationExpressionChildImpl implements ShiftExpression {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<ShiftExpressionChild> children;

	/**
	 * The cached value of the '{@link #getShiftOperators() <em>Shift Operators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShiftOperators()
	 * @generated
	 * @ordered
	 */
	protected EList<ShiftOperator> shiftOperators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShiftExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getShiftExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ShiftExpressionChild> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<ShiftExpressionChild>(ShiftExpressionChild.class, this, JavaPackage.SHIFT_EXPRESSION__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ShiftOperator> getShiftOperators() {
		if (shiftOperators == null) {
			shiftOperators = new EObjectContainmentEList<ShiftOperator>(ShiftOperator.class, this, JavaPackage.SHIFT_EXPRESSION__SHIFT_OPERATORS);
		}
		return shiftOperators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.SHIFT_EXPRESSION__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case JavaPackage.SHIFT_EXPRESSION__SHIFT_OPERATORS:
				return ((InternalEList<?>)getShiftOperators()).basicRemove(otherEnd, msgs);
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
			case JavaPackage.SHIFT_EXPRESSION__CHILDREN:
				return getChildren();
			case JavaPackage.SHIFT_EXPRESSION__SHIFT_OPERATORS:
				return getShiftOperators();
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
			case JavaPackage.SHIFT_EXPRESSION__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends ShiftExpressionChild>)newValue);
				return;
			case JavaPackage.SHIFT_EXPRESSION__SHIFT_OPERATORS:
				getShiftOperators().clear();
				getShiftOperators().addAll((Collection<? extends ShiftOperator>)newValue);
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
			case JavaPackage.SHIFT_EXPRESSION__CHILDREN:
				getChildren().clear();
				return;
			case JavaPackage.SHIFT_EXPRESSION__SHIFT_OPERATORS:
				getShiftOperators().clear();
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
			case JavaPackage.SHIFT_EXPRESSION__CHILDREN:
				return children != null && !children.isEmpty();
			case JavaPackage.SHIFT_EXPRESSION__SHIFT_OPERATORS:
				return shiftOperators != null && !shiftOperators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ShiftExpressionImpl
