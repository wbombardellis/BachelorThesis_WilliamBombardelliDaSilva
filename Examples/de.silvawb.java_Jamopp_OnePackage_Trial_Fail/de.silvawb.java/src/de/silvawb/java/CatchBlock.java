/**
 */
package de.silvawb.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catch Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.CatchBlock#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getCatchBlock()
 * @model
 * @generated
 */
public interface CatchBlock extends StatementListContainer {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference.
	 * @see #setParameter(OrdinaryParameter)
	 * @see de.silvawb.java.JavaPackage#getCatchBlock_Parameter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OrdinaryParameter getParameter();

	/**
	 * Sets the value of the '{@link de.silvawb.java.CatchBlock#getParameter <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' containment reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(OrdinaryParameter value);

} // CatchBlock
