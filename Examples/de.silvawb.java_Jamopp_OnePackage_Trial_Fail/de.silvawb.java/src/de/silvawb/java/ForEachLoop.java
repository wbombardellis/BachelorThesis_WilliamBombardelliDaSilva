/**
 */
package de.silvawb.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Each Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.ForEachLoop#getNext <em>Next</em>}</li>
 *   <li>{@link de.silvawb.java.ForEachLoop#getCollection <em>Collection</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getForEachLoop()
 * @model
 * @generated
 */
public interface ForEachLoop extends Statement, StatementContainer {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference.
	 * @see #setNext(OrdinaryParameter)
	 * @see de.silvawb.java.JavaPackage#getForEachLoop_Next()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OrdinaryParameter getNext();

	/**
	 * Sets the value of the '{@link de.silvawb.java.ForEachLoop#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(OrdinaryParameter value);

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' containment reference.
	 * @see #setCollection(Expression)
	 * @see de.silvawb.java.JavaPackage#getForEachLoop_Collection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getCollection();

	/**
	 * Sets the value of the '{@link de.silvawb.java.ForEachLoop#getCollection <em>Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' containment reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(Expression value);

} // ForEachLoop
