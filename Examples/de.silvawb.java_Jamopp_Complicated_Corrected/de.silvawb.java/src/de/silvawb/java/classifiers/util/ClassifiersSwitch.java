/**
 */
package de.silvawb.java.classifiers.util;

import de.silvawb.java.classifiers.Annotation;
import de.silvawb.java.classifiers.AnonymousClass;
import de.silvawb.java.classifiers.Classifier;
import de.silvawb.java.classifiers.ClassifiersPackage;
import de.silvawb.java.classifiers.ConcreteClassifier;
import de.silvawb.java.classifiers.Enumeration;
import de.silvawb.java.classifiers.Implementor;
import de.silvawb.java.classifiers.Interface;

import de.silvawb.java.commons.Commentable;
import de.silvawb.java.commons.NamedElement;

import de.silvawb.java.generics.TypeParametrizable;

import de.silvawb.java.members.Member;
import de.silvawb.java.members.MemberContainer;

import de.silvawb.java.modifiers.AnnotableAndModifiable;

import de.silvawb.java.references.ReferenceableElement;

import de.silvawb.java.statements.Statement;

import de.silvawb.java.types.Type;

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
 * @see de.silvawb.java.classifiers.ClassifiersPackage
 * @generated
 */
public class ClassifiersSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ClassifiersPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifiersSwitch() {
		if (modelPackage == null) {
			modelPackage = ClassifiersPackage.eINSTANCE;
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
			case ClassifiersPackage.CLASSIFIER: {
				Classifier classifier = (Classifier)theEObject;
				T result = caseClassifier(classifier);
				if (result == null) result = caseType(classifier);
				if (result == null) result = caseReferenceableElement(classifier);
				if (result == null) result = caseNamedElement(classifier);
				if (result == null) result = caseCommentable(classifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassifiersPackage.CONCRETE_CLASSIFIER: {
				ConcreteClassifier concreteClassifier = (ConcreteClassifier)theEObject;
				T result = caseConcreteClassifier(concreteClassifier);
				if (result == null) result = caseClassifier(concreteClassifier);
				if (result == null) result = caseTypeParametrizable(concreteClassifier);
				if (result == null) result = caseMemberContainer(concreteClassifier);
				if (result == null) result = caseMember(concreteClassifier);
				if (result == null) result = caseStatement(concreteClassifier);
				if (result == null) result = caseAnnotableAndModifiable(concreteClassifier);
				if (result == null) result = caseType(concreteClassifier);
				if (result == null) result = caseReferenceableElement(concreteClassifier);
				if (result == null) result = caseNamedElement(concreteClassifier);
				if (result == null) result = caseCommentable(concreteClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassifiersPackage.IMPLEMENTOR: {
				Implementor implementor = (Implementor)theEObject;
				T result = caseImplementor(implementor);
				if (result == null) result = caseCommentable(implementor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassifiersPackage.CLASS: {
				de.silvawb.java.classifiers.Class class_ = (de.silvawb.java.classifiers.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseConcreteClassifier(class_);
				if (result == null) result = caseImplementor(class_);
				if (result == null) result = caseClassifier(class_);
				if (result == null) result = caseTypeParametrizable(class_);
				if (result == null) result = caseMemberContainer(class_);
				if (result == null) result = caseMember(class_);
				if (result == null) result = caseStatement(class_);
				if (result == null) result = caseAnnotableAndModifiable(class_);
				if (result == null) result = caseType(class_);
				if (result == null) result = caseReferenceableElement(class_);
				if (result == null) result = caseNamedElement(class_);
				if (result == null) result = caseCommentable(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassifiersPackage.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				T result = caseInterface(interface_);
				if (result == null) result = caseConcreteClassifier(interface_);
				if (result == null) result = caseClassifier(interface_);
				if (result == null) result = caseTypeParametrizable(interface_);
				if (result == null) result = caseMemberContainer(interface_);
				if (result == null) result = caseMember(interface_);
				if (result == null) result = caseStatement(interface_);
				if (result == null) result = caseAnnotableAndModifiable(interface_);
				if (result == null) result = caseType(interface_);
				if (result == null) result = caseReferenceableElement(interface_);
				if (result == null) result = caseNamedElement(interface_);
				if (result == null) result = caseCommentable(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassifiersPackage.ENUMERATION: {
				Enumeration enumeration = (Enumeration)theEObject;
				T result = caseEnumeration(enumeration);
				if (result == null) result = caseConcreteClassifier(enumeration);
				if (result == null) result = caseImplementor(enumeration);
				if (result == null) result = caseClassifier(enumeration);
				if (result == null) result = caseTypeParametrizable(enumeration);
				if (result == null) result = caseMemberContainer(enumeration);
				if (result == null) result = caseMember(enumeration);
				if (result == null) result = caseStatement(enumeration);
				if (result == null) result = caseAnnotableAndModifiable(enumeration);
				if (result == null) result = caseType(enumeration);
				if (result == null) result = caseReferenceableElement(enumeration);
				if (result == null) result = caseNamedElement(enumeration);
				if (result == null) result = caseCommentable(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassifiersPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = caseConcreteClassifier(annotation);
				if (result == null) result = caseClassifier(annotation);
				if (result == null) result = caseTypeParametrizable(annotation);
				if (result == null) result = caseMemberContainer(annotation);
				if (result == null) result = caseMember(annotation);
				if (result == null) result = caseStatement(annotation);
				if (result == null) result = caseAnnotableAndModifiable(annotation);
				if (result == null) result = caseType(annotation);
				if (result == null) result = caseReferenceableElement(annotation);
				if (result == null) result = caseNamedElement(annotation);
				if (result == null) result = caseCommentable(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassifiersPackage.ANONYMOUS_CLASS: {
				AnonymousClass anonymousClass = (AnonymousClass)theEObject;
				T result = caseAnonymousClass(anonymousClass);
				if (result == null) result = caseType(anonymousClass);
				if (result == null) result = caseMemberContainer(anonymousClass);
				if (result == null) result = caseCommentable(anonymousClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteClassifier(ConcreteClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementor(Implementor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(de.silvawb.java.classifiers.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousClass(AnonymousClass object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referenceable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referenceable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceableElement(ReferenceableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Parametrizable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Parametrizable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeParametrizable(TypeParametrizable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemberContainer(MemberContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMember(Member object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotable And Modifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotable And Modifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotableAndModifiable(AnnotableAndModifiable object) {
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

} //ClassifiersSwitch
