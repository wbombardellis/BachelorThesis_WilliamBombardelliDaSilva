/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.ExclusiveOrExpression;
import de.silvawb.java.ExclusiveOrExpressionChild;
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
 * An implementation of the model object '<em><b>Exclusive Or Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.ExclusiveOrExpressionImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExclusiveOrExpressionImpl extends InclusiveOrExpressionChildImpl implements ExclusiveOrExpression {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<ExclusiveOrExpressionChild> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExclusiveOrExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getExclusiveOrExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExclusiveOrExpressionChild> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<ExclusiveOrExpressionChild>(ExclusiveOrExpressionChild.class, this, JavaPackage.EXCLUSIVE_OR_EXPRESSION__CHILDREN);
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
			case JavaPackage.EXCLUSIVE_OR_EXPRESSION__CHILDREN:
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
			case JavaPackage.EXCLUSIVE_OR_EXPRESSION__CHILDREN:
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
			case JavaPackage.EXCLUSIVE_OR_EXPRESSION__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends ExclusiveOrExpressionChild>)newValue);
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
			case JavaPackage.EXCLUSIVE_OR_EXPRESSION__CHILDREN:
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
			case JavaPackage.EXCLUSIVE_OR_EXPRESSION__CHILDREN:
				return children != null && !children.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExclusiveOrExpressionImpl
