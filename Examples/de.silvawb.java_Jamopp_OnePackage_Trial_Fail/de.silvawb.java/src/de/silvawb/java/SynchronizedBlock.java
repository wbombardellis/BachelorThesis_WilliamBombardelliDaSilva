/**
 */
package de.silvawb.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchronized Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.SynchronizedBlock#getLockProvider <em>Lock Provider</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getSynchronizedBlock()
 * @model
 * @generated
 */
public interface SynchronizedBlock extends Statement, StatementListContainer {
	/**
	 * Returns the value of the '<em><b>Lock Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lock Provider</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lock Provider</em>' containment reference.
	 * @see #setLockProvider(Expression)
	 * @see de.silvawb.java.JavaPackage#getSynchronizedBlock_LockProvider()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLockProvider();

	/**
	 * Sets the value of the '{@link de.silvawb.java.SynchronizedBlock#getLockProvider <em>Lock Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lock Provider</em>' containment reference.
	 * @see #getLockProvider()
	 * @generated
	 */
	void setLockProvider(Expression value);

} // SynchronizedBlock
