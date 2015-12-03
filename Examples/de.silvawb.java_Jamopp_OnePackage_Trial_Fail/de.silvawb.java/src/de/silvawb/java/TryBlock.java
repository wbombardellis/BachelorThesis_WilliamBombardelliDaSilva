/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Try Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.TryBlock#getCatcheBlocks <em>Catche Blocks</em>}</li>
 *   <li>{@link de.silvawb.java.TryBlock#getFinallyBlock <em>Finally Block</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getTryBlock()
 * @model
 * @generated
 */
public interface TryBlock extends Statement, StatementListContainer {
	/**
	 * Returns the value of the '<em><b>Catche Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.CatchBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catche Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catche Blocks</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getTryBlock_CatcheBlocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<CatchBlock> getCatcheBlocks();

	/**
	 * Returns the value of the '<em><b>Finally Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finally Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finally Block</em>' containment reference.
	 * @see #setFinallyBlock(Block)
	 * @see de.silvawb.java.JavaPackage#getTryBlock_FinallyBlock()
	 * @model containment="true"
	 * @generated
	 */
	Block getFinallyBlock();

	/**
	 * Sets the value of the '{@link de.silvawb.java.TryBlock#getFinallyBlock <em>Finally Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finally Block</em>' containment reference.
	 * @see #getFinallyBlock()
	 * @generated
	 */
	void setFinallyBlock(Block value);

} // TryBlock
