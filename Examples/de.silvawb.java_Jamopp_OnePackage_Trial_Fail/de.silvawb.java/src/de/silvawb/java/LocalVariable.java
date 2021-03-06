/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.LocalVariable#getAdditionalLocalVariables <em>Additional Local Variables</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getLocalVariable()
 * @model
 * @generated
 */
public interface LocalVariable extends Variable, Initializable, ForLoopInitializer, AnnotableAndModifiable {
	/**
	 * Returns the value of the '<em><b>Additional Local Variables</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.AdditionalLocalVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Local Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Local Variables</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getLocalVariable_AdditionalLocalVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<AdditionalLocalVariable> getAdditionalLocalVariables();

} // LocalVariable
