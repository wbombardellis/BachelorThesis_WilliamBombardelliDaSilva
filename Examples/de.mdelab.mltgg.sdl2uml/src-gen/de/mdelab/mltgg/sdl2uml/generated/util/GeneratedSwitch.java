/**
 */
package de.mdelab.mltgg.sdl2uml.generated.util;

import de.mdelab.mltgg.mote2.operationalTGG.OperationalAxiom;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalAxiomGroup;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalMapping;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalMappingGroup;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalRule;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalRuleGroup;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalTGG;

import de.mdelab.mltgg.mote2.sdm.SdmOperationalTGG;

import de.mdelab.mltgg.sdl2uml.generated.*;

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
 * @see de.mdelab.mltgg.sdl2uml.generated.GeneratedPackage
 * @generated
 */
public class GeneratedSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GeneratedPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedSwitch() {
		if (modelPackage == null) {
			modelPackage = GeneratedPackage.eINSTANCE;
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
		case GeneratedPackage.SDL2UML_OPERATIONAL_TGG: {
			SDL2UMLOperationalTGG sdl2UMLOperationalTGG = (SDL2UMLOperationalTGG) theEObject;
			T result = caseSDL2UMLOperationalTGG(sdl2UMLOperationalTGG);
			if (result == null)
				result = caseSdmOperationalTGG(sdl2UMLOperationalTGG);
			if (result == null)
				result = caseOperationalTGG(sdl2UMLOperationalTGG);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.SDL2UML_AXIOM: {
			SDL2UMLAxiom sdl2UMLAxiom = (SDL2UMLAxiom) theEObject;
			T result = caseSDL2UMLAxiom(sdl2UMLAxiom);
			if (result == null)
				result = caseOperationalAxiomGroup(sdl2UMLAxiom);
			if (result == null)
				result = caseOperationalMappingGroup(sdl2UMLAxiom);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.SDL2UML_CONNECTION_VAR3: {
			SDL2UMLConnectionVar3 sdl2UMLConnectionVar3 = (SDL2UMLConnectionVar3) theEObject;
			T result = caseSDL2UMLConnectionVar3(sdl2UMLConnectionVar3);
			if (result == null)
				result = caseOperationalRuleGroup(sdl2UMLConnectionVar3);
			if (result == null)
				result = caseOperationalMappingGroup(sdl2UMLConnectionVar3);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.SDL2UML_PROCESS: {
			SDL2UMLProcess sdl2UMLProcess = (SDL2UMLProcess) theEObject;
			T result = caseSDL2UMLProcess(sdl2UMLProcess);
			if (result == null)
				result = caseOperationalRuleGroup(sdl2UMLProcess);
			if (result == null)
				result = caseOperationalMappingGroup(sdl2UMLProcess);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.SDL2UML_BLOCK: {
			SDL2UMLBlock sdl2UMLBlock = (SDL2UMLBlock) theEObject;
			T result = caseSDL2UMLBlock(sdl2UMLBlock);
			if (result == null)
				result = caseOperationalRuleGroup(sdl2UMLBlock);
			if (result == null)
				result = caseOperationalMappingGroup(sdl2UMLBlock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.SDL2UML_CONNECTION_VAR1: {
			SDL2UMLConnectionVar1 sdl2UMLConnectionVar1 = (SDL2UMLConnectionVar1) theEObject;
			T result = caseSDL2UMLConnectionVar1(sdl2UMLConnectionVar1);
			if (result == null)
				result = caseOperationalRuleGroup(sdl2UMLConnectionVar1);
			if (result == null)
				result = caseOperationalMappingGroup(sdl2UMLConnectionVar1);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.SDL2UML_CONNECTION_VAR2: {
			SDL2UMLConnectionVar2 sdl2UMLConnectionVar2 = (SDL2UMLConnectionVar2) theEObject;
			T result = caseSDL2UMLConnectionVar2(sdl2UMLConnectionVar2);
			if (result == null)
				result = caseOperationalRuleGroup(sdl2UMLConnectionVar2);
			if (result == null)
				result = caseOperationalMappingGroup(sdl2UMLConnectionVar2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.SDL2UML_SYSTEM_BLOCK: {
			SDL2UMLSystemBlock sdl2UMLSystemBlock = (SDL2UMLSystemBlock) theEObject;
			T result = caseSDL2UMLSystemBlock(sdl2UMLSystemBlock);
			if (result == null)
				result = caseOperationalRuleGroup(sdl2UMLSystemBlock);
			if (result == null)
				result = caseOperationalMappingGroup(sdl2UMLSystemBlock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.SDL2UML_AXIOM_SDL2UML_AXIOM_R1: {
			SDL2UMLAxiom_SDL2UMLAxiom_R1 sdl2UMLAxiom_SDL2UMLAxiom_R1 = (SDL2UMLAxiom_SDL2UMLAxiom_R1) theEObject;
			T result = caseSDL2UMLAxiom_SDL2UMLAxiom_R1(sdl2UMLAxiom_SDL2UMLAxiom_R1);
			if (result == null)
				result = caseOperationalAxiom(sdl2UMLAxiom_SDL2UMLAxiom_R1);
			if (result == null)
				result = caseOperationalMapping(sdl2UMLAxiom_SDL2UMLAxiom_R1);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.SDL2UML_SYSTEM_BLOCK_SDL2UML_SYSTEM_BLOCK_R1: {
			SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1 sdl2UMLSystemBlock_SDL2UMLSystemBlock_R1 = (SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1) theEObject;
			T result = caseSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1(sdl2UMLSystemBlock_SDL2UMLSystemBlock_R1);
			if (result == null)
				result = caseOperationalRule(sdl2UMLSystemBlock_SDL2UMLSystemBlock_R1);
			if (result == null)
				result = caseOperationalMapping(sdl2UMLSystemBlock_SDL2UMLSystemBlock_R1);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.SDL2UML_CONNECTION_VAR2_SDL2UML_CONNECTION_VAR2_R1: {
			SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1 sdl2UMLConnectionVar2_SDL2UMLConnectionVar2_R1 = (SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1) theEObject;
			T result = caseSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1(sdl2UMLConnectionVar2_SDL2UMLConnectionVar2_R1);
			if (result == null)
				result = caseOperationalRule(sdl2UMLConnectionVar2_SDL2UMLConnectionVar2_R1);
			if (result == null)
				result = caseOperationalMapping(sdl2UMLConnectionVar2_SDL2UMLConnectionVar2_R1);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.SDL2UML_CONNECTION_VAR1_SDL2UML_CONNECTION_VAR1_R1: {
			SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1 sdl2UMLConnectionVar1_SDL2UMLConnectionVar1_R1 = (SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1) theEObject;
			T result = caseSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1(sdl2UMLConnectionVar1_SDL2UMLConnectionVar1_R1);
			if (result == null)
				result = caseOperationalRule(sdl2UMLConnectionVar1_SDL2UMLConnectionVar1_R1);
			if (result == null)
				result = caseOperationalMapping(sdl2UMLConnectionVar1_SDL2UMLConnectionVar1_R1);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.SDL2UML_CONNECTION_VAR3_SDL2UML_CONNECTION_VAR3_R1: {
			SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1 sdl2UMLConnectionVar3_SDL2UMLConnectionVar3_R1 = (SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1) theEObject;
			T result = caseSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1(sdl2UMLConnectionVar3_SDL2UMLConnectionVar3_R1);
			if (result == null)
				result = caseOperationalRule(sdl2UMLConnectionVar3_SDL2UMLConnectionVar3_R1);
			if (result == null)
				result = caseOperationalMapping(sdl2UMLConnectionVar3_SDL2UMLConnectionVar3_R1);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.SDL2UML_PROCESS_SDL2UML_PROCESS_R1: {
			SDL2UMLProcess_SDL2UMLProcess_R1 sdl2UMLProcess_SDL2UMLProcess_R1 = (SDL2UMLProcess_SDL2UMLProcess_R1) theEObject;
			T result = caseSDL2UMLProcess_SDL2UMLProcess_R1(sdl2UMLProcess_SDL2UMLProcess_R1);
			if (result == null)
				result = caseOperationalRule(sdl2UMLProcess_SDL2UMLProcess_R1);
			if (result == null)
				result = caseOperationalMapping(sdl2UMLProcess_SDL2UMLProcess_R1);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.SDL2UML_BLOCK_SDL2UML_BLOCK_R1: {
			SDL2UMLBlock_SDL2UMLBlock_R1 sdl2UMLBlock_SDL2UMLBlock_R1 = (SDL2UMLBlock_SDL2UMLBlock_R1) theEObject;
			T result = caseSDL2UMLBlock_SDL2UMLBlock_R1(sdl2UMLBlock_SDL2UMLBlock_R1);
			if (result == null)
				result = caseOperationalRule(sdl2UMLBlock_SDL2UMLBlock_R1);
			if (result == null)
				result = caseOperationalMapping(sdl2UMLBlock_SDL2UMLBlock_R1);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDL2UML Operational TGG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDL2UML Operational TGG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDL2UMLOperationalTGG(SDL2UMLOperationalTGG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDL2UML Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDL2UML Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDL2UMLAxiom(SDL2UMLAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDL2UML Connection Var3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDL2UML Connection Var3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDL2UMLConnectionVar3(SDL2UMLConnectionVar3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDL2UML Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDL2UML Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDL2UMLProcess(SDL2UMLProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDL2UML Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDL2UML Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDL2UMLBlock(SDL2UMLBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDL2UML Connection Var1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDL2UML Connection Var1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDL2UMLConnectionVar1(SDL2UMLConnectionVar1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDL2UML Connection Var2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDL2UML Connection Var2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDL2UMLConnectionVar2(SDL2UMLConnectionVar2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDL2UML System Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDL2UML System Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDL2UMLSystemBlock(SDL2UMLSystemBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDL2UML Axiom SDL2UML Axiom R1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDL2UML Axiom SDL2UML Axiom R1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDL2UMLAxiom_SDL2UMLAxiom_R1(
			SDL2UMLAxiom_SDL2UMLAxiom_R1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDL2UML System Block SDL2UML System Block R1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDL2UML System Block SDL2UML System Block R1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1(
			SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDL2UML Connection Var2 SDL2UML Connection Var2 R1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDL2UML Connection Var2 SDL2UML Connection Var2 R1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1(
			SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDL2UML Connection Var1 SDL2UML Connection Var1 R1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDL2UML Connection Var1 SDL2UML Connection Var1 R1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1(
			SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDL2UML Connection Var3 SDL2UML Connection Var3 R1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDL2UML Connection Var3 SDL2UML Connection Var3 R1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1(
			SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDL2UML Process SDL2UML Process R1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDL2UML Process SDL2UML Process R1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDL2UMLProcess_SDL2UMLProcess_R1(
			SDL2UMLProcess_SDL2UMLProcess_R1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDL2UML Block SDL2UML Block R1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDL2UML Block SDL2UML Block R1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDL2UMLBlock_SDL2UMLBlock_R1(
			SDL2UMLBlock_SDL2UMLBlock_R1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational TGG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational TGG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalTGG(OperationalTGG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational TGG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational TGG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSdmOperationalTGG(SdmOperationalTGG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Mapping Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Mapping Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalMappingGroup(OperationalMappingGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Axiom Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Axiom Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalAxiomGroup(OperationalAxiomGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Rule Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Rule Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalRuleGroup(OperationalRuleGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalMapping(OperationalMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalAxiom(OperationalAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalRule(OperationalRule object) {
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

} //GeneratedSwitch
