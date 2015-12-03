/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.Argumentable;
import de.silvawb.java.CallTypeArgumentable;
import de.silvawb.java.Expression;
import de.silvawb.java.JavaPackage;
import de.silvawb.java.MethodCall;
import de.silvawb.java.Type;
import de.silvawb.java.TypeArgument;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.MethodCallImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link de.silvawb.java.impl.MethodCallImpl#getCallTypeArguments <em>Call Type Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodCallImpl extends ElementReferenceImpl implements MethodCall {
	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> arguments;

	/**
	 * The cached value of the '{@link #getCallTypeArguments() <em>Call Type Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallTypeArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeArgument> callTypeArguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getMethodCall();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<Expression>(Expression.class, this, JavaPackage.METHOD_CALL__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeArgument> getCallTypeArguments() {
		if (callTypeArguments == null) {
			callTypeArguments = new EObjectContainmentEList<TypeArgument>(TypeArgument.class, this, JavaPackage.METHOD_CALL__CALL_TYPE_ARGUMENTS);
		}
		return callTypeArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getArgumentTypes() {
		org.eclipse.emf.common.util.EList< de.silvawb.java.Type> resultList = new org.eclipse.emf.common.util.BasicEList< de.silvawb.java.Type>();
		
		for( de.silvawb.java.Expression exp : getArguments()) {
			de.silvawb.java.Type type = exp.getType();
			resultList.add(type);
		}
		return resultList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.METHOD_CALL__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case JavaPackage.METHOD_CALL__CALL_TYPE_ARGUMENTS:
				return ((InternalEList<?>)getCallTypeArguments()).basicRemove(otherEnd, msgs);
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
			case JavaPackage.METHOD_CALL__ARGUMENTS:
				return getArguments();
			case JavaPackage.METHOD_CALL__CALL_TYPE_ARGUMENTS:
				return getCallTypeArguments();
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
			case JavaPackage.METHOD_CALL__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Expression>)newValue);
				return;
			case JavaPackage.METHOD_CALL__CALL_TYPE_ARGUMENTS:
				getCallTypeArguments().clear();
				getCallTypeArguments().addAll((Collection<? extends TypeArgument>)newValue);
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
			case JavaPackage.METHOD_CALL__ARGUMENTS:
				getArguments().clear();
				return;
			case JavaPackage.METHOD_CALL__CALL_TYPE_ARGUMENTS:
				getCallTypeArguments().clear();
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
			case JavaPackage.METHOD_CALL__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case JavaPackage.METHOD_CALL__CALL_TYPE_ARGUMENTS:
				return callTypeArguments != null && !callTypeArguments.isEmpty();
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
		if (baseClass == Argumentable.class) {
			switch (derivedFeatureID) {
				case JavaPackage.METHOD_CALL__ARGUMENTS: return JavaPackage.ARGUMENTABLE__ARGUMENTS;
				default: return -1;
			}
		}
		if (baseClass == CallTypeArgumentable.class) {
			switch (derivedFeatureID) {
				case JavaPackage.METHOD_CALL__CALL_TYPE_ARGUMENTS: return JavaPackage.CALL_TYPE_ARGUMENTABLE__CALL_TYPE_ARGUMENTS;
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
		if (baseClass == Argumentable.class) {
			switch (baseFeatureID) {
				case JavaPackage.ARGUMENTABLE__ARGUMENTS: return JavaPackage.METHOD_CALL__ARGUMENTS;
				default: return -1;
			}
		}
		if (baseClass == CallTypeArgumentable.class) {
			switch (baseFeatureID) {
				case JavaPackage.CALL_TYPE_ARGUMENTABLE__CALL_TYPE_ARGUMENTS: return JavaPackage.METHOD_CALL__CALL_TYPE_ARGUMENTS;
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
		if (baseClass == Argumentable.class) {
			switch (baseOperationID) {
				case JavaPackage.ARGUMENTABLE___GET_ARGUMENT_TYPES: return JavaPackage.METHOD_CALL___GET_ARGUMENT_TYPES;
				default: return -1;
			}
		}
		if (baseClass == CallTypeArgumentable.class) {
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
			case JavaPackage.METHOD_CALL___GET_ARGUMENT_TYPES:
				return getArgumentTypes();
		}
		return super.eInvoke(operationID, arguments);
	}

} //MethodCallImpl
