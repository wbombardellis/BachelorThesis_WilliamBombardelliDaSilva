/**
 */
package de.silvawb.layout;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.silvawb.layout.LayoutPackage
 * @generated
 */
public interface LayoutFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LayoutFactory eINSTANCE = de.silvawb.layout.impl.LayoutFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Reference Layout Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Layout Information</em>'.
	 * @generated
	 */
	ReferenceLayoutInformation createReferenceLayoutInformation();

	/**
	 * Returns a new object of class '<em>Attribute Layout Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Layout Information</em>'.
	 * @generated
	 */
	AttributeLayoutInformation createAttributeLayoutInformation();

	/**
	 * Returns a new object of class '<em>Keyword Layout Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keyword Layout Information</em>'.
	 * @generated
	 */
	KeywordLayoutInformation createKeywordLayoutInformation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LayoutPackage getLayoutPackage();

} //LayoutFactory
