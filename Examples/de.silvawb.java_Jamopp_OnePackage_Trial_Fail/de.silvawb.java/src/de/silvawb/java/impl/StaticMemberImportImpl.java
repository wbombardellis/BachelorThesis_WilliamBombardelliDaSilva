/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.JavaPackage;
import de.silvawb.java.ReferenceableElement;
import de.silvawb.java.StaticMemberImport;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Member Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.StaticMemberImportImpl#getStaticMembers <em>Static Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaticMemberImportImpl extends StaticImportImpl implements StaticMemberImport {
	/**
	 * The cached value of the '{@link #getStaticMembers() <em>Static Members</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceableElement> staticMembers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticMemberImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getStaticMemberImport();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceableElement> getStaticMembers() {
		if (staticMembers == null) {
			staticMembers = new EObjectResolvingEList<ReferenceableElement>(ReferenceableElement.class, this, JavaPackage.STATIC_MEMBER_IMPORT__STATIC_MEMBERS);
		}
		return staticMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaPackage.STATIC_MEMBER_IMPORT__STATIC_MEMBERS:
				return getStaticMembers();
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
			case JavaPackage.STATIC_MEMBER_IMPORT__STATIC_MEMBERS:
				getStaticMembers().clear();
				getStaticMembers().addAll((Collection<? extends ReferenceableElement>)newValue);
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
			case JavaPackage.STATIC_MEMBER_IMPORT__STATIC_MEMBERS:
				getStaticMembers().clear();
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
			case JavaPackage.STATIC_MEMBER_IMPORT__STATIC_MEMBERS:
				return staticMembers != null && !staticMembers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StaticMemberImportImpl
