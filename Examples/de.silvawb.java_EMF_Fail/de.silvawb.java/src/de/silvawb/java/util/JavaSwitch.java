/**
 */
package de.silvawb.java.util;

import de.silvawb.java.*;

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
 * @see de.silvawb.java.JavaPackage
 * @generated
 */
public class JavaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JavaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaSwitch() {
		if (modelPackage == null) {
			modelPackage = JavaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
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
			case JavaPackage.JCLASS: {
				JClass jClass = (JClass)theEObject;
				T result = caseJClass(jClass);
				if (result == null) result = caseJMember(jClass);
				if (result == null) result = caseJModelElement(jClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.JCOMPILATION_UNIT: {
				JCompilationUnit jCompilationUnit = (JCompilationUnit)theEObject;
				T result = caseJCompilationUnit(jCompilationUnit);
				if (result == null) result = caseJModelElement(jCompilationUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.JFIELD: {
				JField jField = (JField)theEObject;
				T result = caseJField(jField);
				if (result == null) result = caseJMember(jField);
				if (result == null) result = caseJModelElement(jField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.JINITIALIZER: {
				JInitializer jInitializer = (JInitializer)theEObject;
				T result = caseJInitializer(jInitializer);
				if (result == null) result = caseJMember(jInitializer);
				if (result == null) result = caseJModelElement(jInitializer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.JMEMBER: {
				JMember jMember = (JMember)theEObject;
				T result = caseJMember(jMember);
				if (result == null) result = caseJModelElement(jMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.JMETHOD: {
				JMethod jMethod = (JMethod)theEObject;
				T result = caseJMethod(jMethod);
				if (result == null) result = caseJMember(jMethod);
				if (result == null) result = caseJModelElement(jMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.JMODEL_ELEMENT: {
				JModelElement jModelElement = (JModelElement)theEObject;
				T result = caseJModelElement(jModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.JPACKAGE: {
				JPackage jPackage = (JPackage)theEObject;
				T result = caseJPackage(jPackage);
				if (result == null) result = caseJModelElement(jPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.JPARAMETER: {
				JParameter jParameter = (JParameter)theEObject;
				T result = caseJParameter(jParameter);
				if (result == null) result = caseJModelElement(jParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJClass(JClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JCompilation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JCompilation Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJCompilationUnit(JCompilationUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JField</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JField</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJField(JField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JInitializer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JInitializer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJInitializer(JInitializer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JMember</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JMember</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJMember(JMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JMethod</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JMethod</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJMethod(JMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JModel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JModel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJModelElement(JModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJPackage(JPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJParameter(JParameter object) {
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

} //JavaSwitch
