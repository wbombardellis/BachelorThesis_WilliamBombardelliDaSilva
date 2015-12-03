/**
 */
package de.silvawb.java.parameters;

import de.silvawb.java.commons.Commentable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parametrizable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.parameters.Parametrizable#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.parameters.ParametersPackage#getParametrizable()
 * @model abstract="true"
 * @generated
 */
public interface Parametrizable extends Commentable {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.parameters.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see de.silvawb.java.parameters.ParametersPackage#getParametrizable_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // Parametrizable
