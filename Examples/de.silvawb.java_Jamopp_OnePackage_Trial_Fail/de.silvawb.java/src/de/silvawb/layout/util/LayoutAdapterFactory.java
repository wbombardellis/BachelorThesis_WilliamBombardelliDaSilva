/**
 */
package de.silvawb.layout.util;

import de.silvawb.layout.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.silvawb.layout.LayoutPackage
 * @generated
 */
public class LayoutAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LayoutPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LayoutPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayoutSwitch<Adapter> modelSwitch =
		new LayoutSwitch<Adapter>() {
			@Override
			public Adapter caseLayoutInformation(LayoutInformation object) {
				return createLayoutInformationAdapter();
			}
			@Override
			public Adapter caseReferenceLayoutInformation(ReferenceLayoutInformation object) {
				return createReferenceLayoutInformationAdapter();
			}
			@Override
			public Adapter caseAttributeLayoutInformation(AttributeLayoutInformation object) {
				return createAttributeLayoutInformationAdapter();
			}
			@Override
			public Adapter caseKeywordLayoutInformation(KeywordLayoutInformation object) {
				return createKeywordLayoutInformationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.layout.LayoutInformation <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.layout.LayoutInformation
	 * @generated
	 */
	public Adapter createLayoutInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.layout.ReferenceLayoutInformation <em>Reference Layout Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.layout.ReferenceLayoutInformation
	 * @generated
	 */
	public Adapter createReferenceLayoutInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.layout.AttributeLayoutInformation <em>Attribute Layout Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.layout.AttributeLayoutInformation
	 * @generated
	 */
	public Adapter createAttributeLayoutInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.layout.KeywordLayoutInformation <em>Keyword Layout Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.layout.KeywordLayoutInformation
	 * @generated
	 */
	public Adapter createKeywordLayoutInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LayoutAdapterFactory
