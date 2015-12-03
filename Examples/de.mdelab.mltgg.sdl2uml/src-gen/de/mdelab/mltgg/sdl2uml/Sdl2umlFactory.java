/**
 */
package de.mdelab.mltgg.sdl2uml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.mdelab.mltgg.sdl2uml.Sdl2umlPackage
 * @generated
 */
public interface Sdl2umlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Sdl2umlFactory eINSTANCE = de.mdelab.mltgg.sdl2uml.impl.Sdl2umlFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Corr Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corr Axiom</em>'.
	 * @generated
	 */
	CorrAxiom createCorrAxiom();

	/**
	 * Returns a new object of class '<em>Corr Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corr Connection</em>'.
	 * @generated
	 */
	CorrConnection createCorrConnection();

	/**
	 * Returns a new object of class '<em>Corr Connectable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corr Connectable</em>'.
	 * @generated
	 */
	CorrConnectable createCorrConnectable();

	/**
	 * Returns a new object of class '<em>Corr Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corr Process</em>'.
	 * @generated
	 */
	CorrProcess createCorrProcess();

	/**
	 * Returns a new object of class '<em>Corr Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corr Block</em>'.
	 * @generated
	 */
	CorrBlock createCorrBlock();

	/**
	 * Returns a new object of class '<em>Corr System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corr System</em>'.
	 * @generated
	 */
	CorrSystem createCorrSystem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Sdl2umlPackage getSdl2umlPackage();

} //Sdl2umlFactory
