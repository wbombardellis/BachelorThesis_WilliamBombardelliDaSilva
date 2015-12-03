/**
 */
package de.silvawb.layout.impl;

import de.silvawb.layout.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LayoutFactoryImpl extends EFactoryImpl implements LayoutFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LayoutFactory init() {
		try {
			LayoutFactory theLayoutFactory = (LayoutFactory)EPackage.Registry.INSTANCE.getEFactory(LayoutPackage.eNS_URI);
			if (theLayoutFactory != null) {
				return theLayoutFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LayoutFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LayoutPackage.REFERENCE_LAYOUT_INFORMATION: return createReferenceLayoutInformation();
			case LayoutPackage.ATTRIBUTE_LAYOUT_INFORMATION: return createAttributeLayoutInformation();
			case LayoutPackage.KEYWORD_LAYOUT_INFORMATION: return createKeywordLayoutInformation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceLayoutInformation createReferenceLayoutInformation() {
		ReferenceLayoutInformationImpl referenceLayoutInformation = new ReferenceLayoutInformationImpl();
		return referenceLayoutInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeLayoutInformation createAttributeLayoutInformation() {
		AttributeLayoutInformationImpl attributeLayoutInformation = new AttributeLayoutInformationImpl();
		return attributeLayoutInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeywordLayoutInformation createKeywordLayoutInformation() {
		KeywordLayoutInformationImpl keywordLayoutInformation = new KeywordLayoutInformationImpl();
		return keywordLayoutInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutPackage getLayoutPackage() {
		return (LayoutPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LayoutPackage getPackage() {
		return LayoutPackage.eINSTANCE;
	}

} //LayoutFactoryImpl
