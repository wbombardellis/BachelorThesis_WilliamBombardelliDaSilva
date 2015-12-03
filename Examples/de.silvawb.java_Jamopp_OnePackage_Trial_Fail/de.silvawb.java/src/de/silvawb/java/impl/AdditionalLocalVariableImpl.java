/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.AdditionalLocalVariable;
import de.silvawb.java.ArrayDimension;
import de.silvawb.java.ArrayTypeable;
import de.silvawb.java.Expression;
import de.silvawb.java.Initializable;
import de.silvawb.java.JavaPackage;

import java.lang.reflect.InvocationTargetException;

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
 * An implementation of the model object '<em><b>Additional Local Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.AdditionalLocalVariableImpl#getArrayDimensionsBefore <em>Array Dimensions Before</em>}</li>
 *   <li>{@link de.silvawb.java.impl.AdditionalLocalVariableImpl#getArrayDimensionsAfter <em>Array Dimensions After</em>}</li>
 *   <li>{@link de.silvawb.java.impl.AdditionalLocalVariableImpl#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdditionalLocalVariableImpl extends ReferenceableElementImpl implements AdditionalLocalVariable {
	/**
	 * The cached value of the '{@link #getArrayDimensionsBefore() <em>Array Dimensions Before</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayDimensionsBefore()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrayDimension> arrayDimensionsBefore;

	/**
	 * The cached value of the '{@link #getArrayDimensionsAfter() <em>Array Dimensions After</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayDimensionsAfter()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrayDimension> arrayDimensionsAfter;

	/**
	 * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected Expression initialValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionalLocalVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getAdditionalLocalVariable();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArrayDimension> getArrayDimensionsBefore() {
		if (arrayDimensionsBefore == null) {
			arrayDimensionsBefore = new EObjectContainmentEList<ArrayDimension>(ArrayDimension.class, this, JavaPackage.ADDITIONAL_LOCAL_VARIABLE__ARRAY_DIMENSIONS_BEFORE);
		}
		return arrayDimensionsBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArrayDimension> getArrayDimensionsAfter() {
		if (arrayDimensionsAfter == null) {
			arrayDimensionsAfter = new EObjectContainmentEList<ArrayDimension>(ArrayDimension.class, this, JavaPackage.ADDITIONAL_LOCAL_VARIABLE__ARRAY_DIMENSIONS_AFTER);
		}
		return arrayDimensionsAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getInitialValue() {
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialValue(Expression newInitialValue, NotificationChain msgs) {
		Expression oldInitialValue = initialValue;
		initialValue = newInitialValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.ADDITIONAL_LOCAL_VARIABLE__INITIAL_VALUE, oldInitialValue, newInitialValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialValue(Expression newInitialValue) {
		if (newInitialValue != initialValue) {
			NotificationChain msgs = null;
			if (initialValue != null)
				msgs = ((InternalEObject)initialValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.ADDITIONAL_LOCAL_VARIABLE__INITIAL_VALUE, null, msgs);
			if (newInitialValue != null)
				msgs = ((InternalEObject)newInitialValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.ADDITIONAL_LOCAL_VARIABLE__INITIAL_VALUE, null, msgs);
			msgs = basicSetInitialValue(newInitialValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.ADDITIONAL_LOCAL_VARIABLE__INITIAL_VALUE, newInitialValue, newInitialValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getArrayDimension() {
		long size = this.getArrayDimensionsBefore().size() + this.getArrayDimensionsAfter().size();
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.ADDITIONAL_LOCAL_VARIABLE__ARRAY_DIMENSIONS_BEFORE:
				return ((InternalEList<?>)getArrayDimensionsBefore()).basicRemove(otherEnd, msgs);
			case JavaPackage.ADDITIONAL_LOCAL_VARIABLE__ARRAY_DIMENSIONS_AFTER:
				return ((InternalEList<?>)getArrayDimensionsAfter()).basicRemove(otherEnd, msgs);
			case JavaPackage.ADDITIONAL_LOCAL_VARIABLE__INITIAL_VALUE:
				return basicSetInitialValue(null, msgs);
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
			case JavaPackage.ADDITIONAL_LOCAL_VARIABLE__ARRAY_DIMENSIONS_BEFORE:
				return getArrayDimensionsBefore();
			case JavaPackage.ADDITIONAL_LOCAL_VARIABLE__ARRAY_DIMENSIONS_AFTER:
				return getArrayDimensionsAfter();
			case JavaPackage.ADDITIONAL_LOCAL_VARIABLE__INITIAL_VALUE:
				return getInitialValue();
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
			case JavaPackage.ADDITIONAL_LOCAL_VARIABLE__ARRAY_DIMENSIONS_BEFORE:
				getArrayDimensionsBefore().clear();
				getArrayDimensionsBefore().addAll((Collection<? extends ArrayDimension>)newValue);
				return;
			case JavaPackage.ADDITIONAL_LOCAL_VARIABLE__ARRAY_DIMENSIONS_AFTER:
				getArrayDimensionsAfter().clear();
				getArrayDimensionsAfter().addAll((Collection<? extends ArrayDimension>)newValue);
				return;
			case JavaPackage.ADDITIONAL_LOCAL_VARIABLE__INITIAL_VALUE:
				setInitialValue((Expression)newValue);
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
			case JavaPackage.ADDITIONAL_LOCAL_VARIABLE__ARRAY_DIMENSIONS_BEFORE:
				getArrayDimensionsBefore().clear();
				return;
			case JavaPackage.ADDITIONAL_LOCAL_VARIABLE__ARRAY_DIMENSIONS_AFTER:
				getArrayDimensionsAfter().clear();
				return;
			case JavaPackage.ADDITIONAL_LOCAL_VARIABLE__INITIAL_VALUE:
				setInitialValue((Expression)null);
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
			case JavaPackage.ADDITIONAL_LOCAL_VARIABLE__ARRAY_DIMENSIONS_BEFORE:
				return arrayDimensionsBefore != null && !arrayDimensionsBefore.isEmpty();
			case JavaPackage.ADDITIONAL_LOCAL_VARIABLE__ARRAY_DIMENSIONS_AFTER:
				return arrayDimensionsAfter != null && !arrayDimensionsAfter.isEmpty();
			case JavaPackage.ADDITIONAL_LOCAL_VARIABLE__INITIAL_VALUE:
				return initialValue != null;
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
		if (baseClass == ArrayTypeable.class) {
			switch (derivedFeatureID) {
				case JavaPackage.ADDITIONAL_LOCAL_VARIABLE__ARRAY_DIMENSIONS_BEFORE: return JavaPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE;
				case JavaPackage.ADDITIONAL_LOCAL_VARIABLE__ARRAY_DIMENSIONS_AFTER: return JavaPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER;
				default: return -1;
			}
		}
		if (baseClass == Initializable.class) {
			switch (derivedFeatureID) {
				case JavaPackage.ADDITIONAL_LOCAL_VARIABLE__INITIAL_VALUE: return JavaPackage.INITIALIZABLE__INITIAL_VALUE;
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
		if (baseClass == ArrayTypeable.class) {
			switch (baseFeatureID) {
				case JavaPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE: return JavaPackage.ADDITIONAL_LOCAL_VARIABLE__ARRAY_DIMENSIONS_BEFORE;
				case JavaPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER: return JavaPackage.ADDITIONAL_LOCAL_VARIABLE__ARRAY_DIMENSIONS_AFTER;
				default: return -1;
			}
		}
		if (baseClass == Initializable.class) {
			switch (baseFeatureID) {
				case JavaPackage.INITIALIZABLE__INITIAL_VALUE: return JavaPackage.ADDITIONAL_LOCAL_VARIABLE__INITIAL_VALUE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ArrayTypeable.class) {
			switch (baseOperationID) {
				case JavaPackage.ARRAY_TYPEABLE___GET_ARRAY_DIMENSION: return JavaPackage.ADDITIONAL_LOCAL_VARIABLE___GET_ARRAY_DIMENSION;
				default: return -1;
			}
		}
		if (baseClass == Initializable.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JavaPackage.ADDITIONAL_LOCAL_VARIABLE___GET_ARRAY_DIMENSION:
				return getArrayDimension();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AdditionalLocalVariableImpl
