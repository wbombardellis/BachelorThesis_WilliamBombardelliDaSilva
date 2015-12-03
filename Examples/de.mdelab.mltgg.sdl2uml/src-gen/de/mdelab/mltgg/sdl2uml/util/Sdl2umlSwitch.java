/**
 */
package de.mdelab.mltgg.sdl2uml.util;

import de.mdelab.mlcore.MLAnnotatedElement;

import de.mdelab.mltgg.mote2.TGGNode;

import de.mdelab.mltgg.sdl2uml.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.mdelab.mltgg.sdl2uml.Sdl2umlPackage
 * @generated
 */
public class Sdl2umlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Sdl2umlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sdl2umlSwitch() {
		if (modelPackage == null) {
			modelPackage = Sdl2umlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Sdl2umlPackage.CORR_AXIOM: {
			CorrAxiom corrAxiom = (CorrAxiom) theEObject;
			T result = caseCorrAxiom(corrAxiom);
			if (result == null)
				result = caseTGGNode(corrAxiom);
			if (result == null)
				result = caseMLAnnotatedElement(corrAxiom);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Sdl2umlPackage.CORR_CONNECTION: {
			CorrConnection corrConnection = (CorrConnection) theEObject;
			T result = caseCorrConnection(corrConnection);
			if (result == null)
				result = caseTGGNode(corrConnection);
			if (result == null)
				result = caseMLAnnotatedElement(corrConnection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Sdl2umlPackage.CORR_CONNECTABLE: {
			CorrConnectable corrConnectable = (CorrConnectable) theEObject;
			T result = caseCorrConnectable(corrConnectable);
			if (result == null)
				result = caseTGGNode(corrConnectable);
			if (result == null)
				result = caseMLAnnotatedElement(corrConnectable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Sdl2umlPackage.CORR_PROCESS: {
			CorrProcess corrProcess = (CorrProcess) theEObject;
			T result = caseCorrProcess(corrProcess);
			if (result == null)
				result = caseCorrConnectable(corrProcess);
			if (result == null)
				result = caseTGGNode(corrProcess);
			if (result == null)
				result = caseMLAnnotatedElement(corrProcess);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Sdl2umlPackage.CORR_BLOCK: {
			CorrBlock corrBlock = (CorrBlock) theEObject;
			T result = caseCorrBlock(corrBlock);
			if (result == null)
				result = caseCorrConnectable(corrBlock);
			if (result == null)
				result = caseTGGNode(corrBlock);
			if (result == null)
				result = caseMLAnnotatedElement(corrBlock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Sdl2umlPackage.CORR_SYSTEM: {
			CorrSystem corrSystem = (CorrSystem) theEObject;
			T result = caseCorrSystem(corrSystem);
			if (result == null)
				result = caseCorrBlock(corrSystem);
			if (result == null)
				result = caseCorrConnectable(corrSystem);
			if (result == null)
				result = caseTGGNode(corrSystem);
			if (result == null)
				result = caseMLAnnotatedElement(corrSystem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corr Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corr Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrAxiom(CorrAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corr Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corr Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrConnection(CorrConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corr Connectable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corr Connectable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrConnectable(CorrConnectable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corr Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corr Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrProcess(CorrProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corr Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corr Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrBlock(CorrBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corr System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corr System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrSystem(CorrSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ML Annotated Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ML Annotated Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMLAnnotatedElement(MLAnnotatedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TGG Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TGG Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTGGNode(TGGNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Sdl2umlSwitch
