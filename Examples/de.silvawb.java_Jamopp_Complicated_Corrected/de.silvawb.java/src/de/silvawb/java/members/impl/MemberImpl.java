/**
 */
package de.silvawb.java.members.impl;

import de.silvawb.java.commons.impl.NamedElementImpl;

import de.silvawb.java.members.Member;
import de.silvawb.java.members.MembersPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class MemberImpl extends NamedElementImpl implements Member {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MembersPackage.Literals.MEMBER;
	}

} //MemberImpl
