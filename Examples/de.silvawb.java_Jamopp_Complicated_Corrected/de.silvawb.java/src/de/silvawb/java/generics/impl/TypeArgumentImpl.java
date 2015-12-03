/**
 */
package de.silvawb.java.generics.impl;

import de.silvawb.java.arrays.impl.ArrayTypeableImpl;

import de.silvawb.java.generics.GenericsPackage;
import de.silvawb.java.generics.TypeArgument;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TypeArgumentImpl extends ArrayTypeableImpl implements TypeArgument {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeArgumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericsPackage.Literals.TYPE_ARGUMENT;
	}

} //TypeArgumentImpl
