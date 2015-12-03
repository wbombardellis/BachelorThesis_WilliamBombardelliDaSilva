/**
 */
package de.silvawb.java;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.silvawb.java.JavaPackage
 * @generated
 */
public interface JavaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaFactory eINSTANCE = de.silvawb.java.impl.JavaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>JClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JClass</em>'.
	 * @generated
	 */
	JClass createJClass();

	/**
	 * Returns a new object of class '<em>JCompilation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JCompilation Unit</em>'.
	 * @generated
	 */
	JCompilationUnit createJCompilationUnit();

	/**
	 * Returns a new object of class '<em>JField</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JField</em>'.
	 * @generated
	 */
	JField createJField();

	/**
	 * Returns a new object of class '<em>JInitializer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JInitializer</em>'.
	 * @generated
	 */
	JInitializer createJInitializer();

	/**
	 * Returns a new object of class '<em>JMethod</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JMethod</em>'.
	 * @generated
	 */
	JMethod createJMethod();

	/**
	 * Returns a new object of class '<em>JPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JPackage</em>'.
	 * @generated
	 */
	JPackage createJPackage();

	/**
	 * Returns a new object of class '<em>JParameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JParameter</em>'.
	 * @generated
	 */
	JParameter createJParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JavaPackage getJavaPackage();

} //JavaFactory
