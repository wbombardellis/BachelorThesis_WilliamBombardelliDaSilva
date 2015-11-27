/**
 */
package de.mdelab.mltgg.x2y;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.mdelab.mltgg.x2y.X2yPackage
 * @generated
 */
public interface X2yFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	X2yFactory eINSTANCE = de.mdelab.mltgg.x2y.impl.X2yFactoryImpl.init();

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
	X2yPackage getX2yPackage();

} //X2yFactory
