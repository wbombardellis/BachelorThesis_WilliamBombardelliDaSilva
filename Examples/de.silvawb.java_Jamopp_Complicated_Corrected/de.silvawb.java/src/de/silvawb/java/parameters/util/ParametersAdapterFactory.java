/**
 */
package de.silvawb.java.parameters.util;

import de.silvawb.java.arrays.ArrayTypeable;

import de.silvawb.java.commons.Commentable;
import de.silvawb.java.commons.NamedElement;

import de.silvawb.java.generics.TypeArgumentable;

import de.silvawb.java.modifiers.AnnotableAndModifiable;

import de.silvawb.java.parameters.*;

import de.silvawb.java.references.ReferenceableElement;

import de.silvawb.java.types.TypedElement;

import de.silvawb.java.variables.Variable;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.silvawb.java.parameters.ParametersPackage
 * @generated
 */
public class ParametersAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ParametersPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ParametersPackage.eINSTANCE;
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
	protected ParametersSwitch<Adapter> modelSwitch =
		new ParametersSwitch<Adapter>() {
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseParametrizable(Parametrizable object) {
				return createParametrizableAdapter();
			}
			@Override
			public Adapter caseOrdinaryParameter(OrdinaryParameter object) {
				return createOrdinaryParameterAdapter();
			}
			@Override
			public Adapter caseVariableLengthParameter(VariableLengthParameter object) {
				return createVariableLengthParameterAdapter();
			}
			@Override
			public Adapter caseCommentable(Commentable object) {
				return createCommentableAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseTypedElement(TypedElement object) {
				return createTypedElementAdapter();
			}
			@Override
			public Adapter caseArrayTypeable(ArrayTypeable object) {
				return createArrayTypeableAdapter();
			}
			@Override
			public Adapter caseReferenceableElement(ReferenceableElement object) {
				return createReferenceableElementAdapter();
			}
			@Override
			public Adapter caseTypeArgumentable(TypeArgumentable object) {
				return createTypeArgumentableAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseAnnotableAndModifiable(AnnotableAndModifiable object) {
				return createAnnotableAndModifiableAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.parameters.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.parameters.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.parameters.Parametrizable <em>Parametrizable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.parameters.Parametrizable
	 * @generated
	 */
	public Adapter createParametrizableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.parameters.OrdinaryParameter <em>Ordinary Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.parameters.OrdinaryParameter
	 * @generated
	 */
	public Adapter createOrdinaryParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.parameters.VariableLengthParameter <em>Variable Length Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.parameters.VariableLengthParameter
	 * @generated
	 */
	public Adapter createVariableLengthParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.commons.Commentable <em>Commentable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.commons.Commentable
	 * @generated
	 */
	public Adapter createCommentableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.commons.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.commons.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.types.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.types.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.arrays.ArrayTypeable <em>Array Typeable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.arrays.ArrayTypeable
	 * @generated
	 */
	public Adapter createArrayTypeableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.references.ReferenceableElement <em>Referenceable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.references.ReferenceableElement
	 * @generated
	 */
	public Adapter createReferenceableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.generics.TypeArgumentable <em>Type Argumentable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.generics.TypeArgumentable
	 * @generated
	 */
	public Adapter createTypeArgumentableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.variables.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.variables.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.modifiers.AnnotableAndModifiable <em>Annotable And Modifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.modifiers.AnnotableAndModifiable
	 * @generated
	 */
	public Adapter createAnnotableAndModifiableAdapter() {
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

} //ParametersAdapterFactory
