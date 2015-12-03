/**
 */
package de.silvawb.uml2java;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.silvawb.uml2java.Uml2javaPackage
 * @generated
 */
public interface Uml2javaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Uml2javaFactory eINSTANCE = de.silvawb.uml2java.impl.Uml2javaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Corr Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corr Axiom</em>'.
	 * @generated
	 */
	CorrAxiom createCorrAxiom();

	/**
	 * Returns a new object of class '<em>Corr Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corr Rule</em>'.
	 * @generated
	 */
	CorrRule createCorrRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Uml2javaPackage getUml2javaPackage();

} //Uml2javaFactory
