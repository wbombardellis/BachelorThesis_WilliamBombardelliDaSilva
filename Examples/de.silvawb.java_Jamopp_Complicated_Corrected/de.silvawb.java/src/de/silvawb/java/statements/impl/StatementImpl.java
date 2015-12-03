/**
 */
package de.silvawb.java.statements.impl;

import de.silvawb.java.commons.impl.CommentableImpl;

import de.silvawb.java.statements.Statement;
import de.silvawb.java.statements.StatementsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class StatementImpl extends CommentableImpl implements Statement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.STATEMENT;
	}

} //StatementImpl
