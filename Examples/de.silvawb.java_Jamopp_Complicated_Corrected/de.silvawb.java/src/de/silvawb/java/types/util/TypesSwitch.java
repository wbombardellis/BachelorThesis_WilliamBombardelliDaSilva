/**
 */
package de.silvawb.java.types.util;

import de.silvawb.java.commons.Commentable;
import de.silvawb.java.commons.NamespaceAwareElement;

import de.silvawb.java.generics.TypeArgumentable;

import de.silvawb.java.types.Char;
import de.silvawb.java.types.ClassifierReference;
import de.silvawb.java.types.Int;
import de.silvawb.java.types.NamespaceClassifierReference;
import de.silvawb.java.types.PrimitiveType;
import de.silvawb.java.types.Type;
import de.silvawb.java.types.TypeReference;
import de.silvawb.java.types.TypedElement;
import de.silvawb.java.types.TypesPackage;

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
 * @see de.silvawb.java.types.TypesPackage
 * @generated
 */
public class TypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesSwitch() {
		if (modelPackage == null) {
			modelPackage = TypesPackage.eINSTANCE;
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
			case TypesPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseCommentable(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.TYPED_ELEMENT: {
				TypedElement typedElement = (TypedElement)theEObject;
				T result = caseTypedElement(typedElement);
				if (result == null) result = caseCommentable(typedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.TYPE_REFERENCE: {
				TypeReference typeReference = (TypeReference)theEObject;
				T result = caseTypeReference(typeReference);
				if (result == null) result = caseCommentable(typeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.CLASSIFIER_REFERENCE: {
				ClassifierReference classifierReference = (ClassifierReference)theEObject;
				T result = caseClassifierReference(classifierReference);
				if (result == null) result = caseTypeReference(classifierReference);
				if (result == null) result = caseTypeArgumentable(classifierReference);
				if (result == null) result = caseCommentable(classifierReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.NAMESPACE_CLASSIFIER_REFERENCE: {
				NamespaceClassifierReference namespaceClassifierReference = (NamespaceClassifierReference)theEObject;
				T result = caseNamespaceClassifierReference(namespaceClassifierReference);
				if (result == null) result = caseTypeReference(namespaceClassifierReference);
				if (result == null) result = caseNamespaceAwareElement(namespaceClassifierReference);
				if (result == null) result = caseCommentable(namespaceClassifierReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.PRIMITIVE_TYPE: {
				PrimitiveType primitiveType = (PrimitiveType)theEObject;
				T result = casePrimitiveType(primitiveType);
				if (result == null) result = caseType(primitiveType);
				if (result == null) result = caseTypeReference(primitiveType);
				if (result == null) result = caseCommentable(primitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.BOOLEAN: {
				de.silvawb.java.types.Boolean boolean_ = (de.silvawb.java.types.Boolean)theEObject;
				T result = caseBoolean(boolean_);
				if (result == null) result = casePrimitiveType(boolean_);
				if (result == null) result = caseType(boolean_);
				if (result == null) result = caseTypeReference(boolean_);
				if (result == null) result = caseCommentable(boolean_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.BYTE: {
				de.silvawb.java.types.Byte byte_ = (de.silvawb.java.types.Byte)theEObject;
				T result = caseByte(byte_);
				if (result == null) result = casePrimitiveType(byte_);
				if (result == null) result = caseType(byte_);
				if (result == null) result = caseTypeReference(byte_);
				if (result == null) result = caseCommentable(byte_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.CHAR: {
				Char char_ = (Char)theEObject;
				T result = caseChar(char_);
				if (result == null) result = casePrimitiveType(char_);
				if (result == null) result = caseType(char_);
				if (result == null) result = caseTypeReference(char_);
				if (result == null) result = caseCommentable(char_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DOUBLE: {
				de.silvawb.java.types.Double double_ = (de.silvawb.java.types.Double)theEObject;
				T result = caseDouble(double_);
				if (result == null) result = casePrimitiveType(double_);
				if (result == null) result = caseType(double_);
				if (result == null) result = caseTypeReference(double_);
				if (result == null) result = caseCommentable(double_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.FLOAT: {
				de.silvawb.java.types.Float float_ = (de.silvawb.java.types.Float)theEObject;
				T result = caseFloat(float_);
				if (result == null) result = casePrimitiveType(float_);
				if (result == null) result = caseType(float_);
				if (result == null) result = caseTypeReference(float_);
				if (result == null) result = caseCommentable(float_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.INT: {
				Int int_ = (Int)theEObject;
				T result = caseInt(int_);
				if (result == null) result = casePrimitiveType(int_);
				if (result == null) result = caseType(int_);
				if (result == null) result = caseTypeReference(int_);
				if (result == null) result = caseCommentable(int_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LONG: {
				de.silvawb.java.types.Long long_ = (de.silvawb.java.types.Long)theEObject;
				T result = caseLong(long_);
				if (result == null) result = casePrimitiveType(long_);
				if (result == null) result = caseType(long_);
				if (result == null) result = caseTypeReference(long_);
				if (result == null) result = caseCommentable(long_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SHORT: {
				de.silvawb.java.types.Short short_ = (de.silvawb.java.types.Short)theEObject;
				T result = caseShort(short_);
				if (result == null) result = casePrimitiveType(short_);
				if (result == null) result = caseType(short_);
				if (result == null) result = caseTypeReference(short_);
				if (result == null) result = caseCommentable(short_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.VOID: {
				de.silvawb.java.types.Void void_ = (de.silvawb.java.types.Void)theEObject;
				T result = caseVoid(void_);
				if (result == null) result = casePrimitiveType(void_);
				if (result == null) result = caseType(void_);
				if (result == null) result = caseTypeReference(void_);
				if (result == null) result = caseCommentable(void_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeReference(TypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierReference(ClassifierReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace Classifier Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace Classifier Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespaceClassifierReference(NamespaceClassifierReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveType(PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean(de.silvawb.java.types.Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Byte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Byte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseByte(de.silvawb.java.types.Byte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChar(Char object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble(de.silvawb.java.types.Double object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat(de.silvawb.java.types.Float object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInt(Int object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLong(de.silvawb.java.types.Long object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Short</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Short</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShort(de.silvawb.java.types.Short object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Void</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Void</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoid(de.silvawb.java.types.Void object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commentable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commentable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentable(Commentable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Argumentable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Argumentable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeArgumentable(TypeArgumentable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace Aware Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace Aware Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespaceAwareElement(NamespaceAwareElement object) {
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

} //TypesSwitch
