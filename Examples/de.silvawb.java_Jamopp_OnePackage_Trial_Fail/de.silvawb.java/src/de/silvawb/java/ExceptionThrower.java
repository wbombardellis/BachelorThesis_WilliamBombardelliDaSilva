/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Thrower</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.ExceptionThrower#getExceptions <em>Exceptions</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getExceptionThrower()
 * @model abstract="true"
 * @generated
 */
public interface ExceptionThrower extends Commentable {
	/**
	 * Returns the value of the '<em><b>Exceptions</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.NamespaceClassifierReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exceptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exceptions</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getExceptionThrower_Exceptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamespaceClassifierReference> getExceptions();

} // ExceptionThrower
