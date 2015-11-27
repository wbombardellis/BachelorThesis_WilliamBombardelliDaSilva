/**
 */
package de.mdelab.mltgg.UmlClassDiagram2Java;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.mdelab.mltgg.UmlClassDiagram2Java.UmlClassDiagram2JavaPackage
 * @generated
 */
public interface UmlClassDiagram2JavaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UmlClassDiagram2JavaFactory eINSTANCE = de.mdelab.mltgg.UmlClassDiagram2Java.impl.UmlClassDiagram2JavaFactoryImpl
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
	UmlClassDiagram2JavaPackage getUmlClassDiagram2JavaPackage();

} //UmlClassDiagram2JavaFactory
