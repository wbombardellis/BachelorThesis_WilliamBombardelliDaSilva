/**
 */
package de.mdelab.mltgg.sdl2uml.util;

import de.mdelab.mlcore.MLAnnotatedElement;

import de.mdelab.mltgg.mote2.TGGNode;

import de.mdelab.mltgg.sdl2uml.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.mdelab.mltgg.sdl2uml.Sdl2umlPackage
 * @generated
 */
public class Sdl2umlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Sdl2umlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sdl2umlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Sdl2umlPackage.eINSTANCE;
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
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Sdl2umlSwitch<Adapter> modelSwitch = new Sdl2umlSwitch<Adapter>() {
		@Override
		public Adapter caseCorrAxiom(CorrAxiom object) {
			return createCorrAxiomAdapter();
		}

		@Override
		public Adapter caseCorrConnection(CorrConnection object) {
			return createCorrConnectionAdapter();
		}

		@Override
		public Adapter caseCorrConnectable(CorrConnectable object) {
			return createCorrConnectableAdapter();
		}

		@Override
		public Adapter caseCorrProcess(CorrProcess object) {
			return createCorrProcessAdapter();
		}

		@Override
		public Adapter caseCorrBlock(CorrBlock object) {
			return createCorrBlockAdapter();
		}

		@Override
		public Adapter caseCorrSystem(CorrSystem object) {
			return createCorrSystemAdapter();
		}

		@Override
		public Adapter caseMLAnnotatedElement(MLAnnotatedElement object) {
			return createMLAnnotatedElementAdapter();
		}

		@Override
		public Adapter caseTGGNode(TGGNode object) {
			return createTGGNodeAdapter();
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
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.sdl2uml.CorrAxiom <em>Corr Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.sdl2uml.CorrAxiom
	 * @generated
	 */
	public Adapter createCorrAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.sdl2uml.CorrConnection <em>Corr Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.sdl2uml.CorrConnection
	 * @generated
	 */
	public Adapter createCorrConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.sdl2uml.CorrConnectable <em>Corr Connectable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.sdl2uml.CorrConnectable
	 * @generated
	 */
	public Adapter createCorrConnectableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.sdl2uml.CorrProcess <em>Corr Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.sdl2uml.CorrProcess
	 * @generated
	 */
	public Adapter createCorrProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.sdl2uml.CorrBlock <em>Corr Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.sdl2uml.CorrBlock
	 * @generated
	 */
	public Adapter createCorrBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.sdl2uml.CorrSystem <em>Corr System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.sdl2uml.CorrSystem
	 * @generated
	 */
	public Adapter createCorrSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mlcore.MLAnnotatedElement <em>ML Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mlcore.MLAnnotatedElement
	 * @generated
	 */
	public Adapter createMLAnnotatedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.mote2.TGGNode <em>TGG Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.mote2.TGGNode
	 * @generated
	 */
	public Adapter createTGGNodeAdapter() {
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

} //Sdl2umlAdapterFactory
