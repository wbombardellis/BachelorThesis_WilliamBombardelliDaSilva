/**
 */
package de.silvawb.java.classifiers;

import de.silvawb.java.commons.Commentable;

import de.silvawb.java.generics.TypeParametrizable;

import de.silvawb.java.members.Member;
import de.silvawb.java.members.MemberContainer;

import de.silvawb.java.modifiers.AnnotableAndModifiable;

import de.silvawb.java.statements.Statement;

import de.silvawb.java.types.ClassifierReference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.silvawb.java.classifiers.ClassifiersPackage#getConcreteClassifier()
 * @model abstract="true"
 * @generated
 */
public interface ConcreteClassifier extends Classifier, TypeParametrizable, MemberContainer, Member, Statement, AnnotableAndModifiable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (this.eIsProxy()) {\n\t java.lang.String uriString = (( org.eclipse.emf.ecore.InternalEObject)this).eProxyURI().trimFragment().toString();\n\t java.lang.String fullName = uriString.substring( de.silvawb.java.JavaUniquePathConstructor.JAVA_CLASSIFIER_PATHMAP.length(), \n\t\t\t uriString.length() - \".java\".length()) + \"$\";\n\t return getConcreteClassifierProxies(fullName, \"*\");\n}\nelse {\n\tjava.lang.String suffix = \"\";\n\tde.silvawb.java.classifiers.ConcreteClassifier containingClass = this;\n\twhile (containingClass.eContainer() instanceof de.silvawb.java.classifiers.ConcreteClassifier) {\n\t\tcontainingClass = ( de.silvawb.java.classifiers.ConcreteClassifier) containingClass.eContainer();\n\t\tsuffix = containingClass.getName() + de.silvawb.java.JavaUniquePathConstructor.CLASSIFIER_SEPARATOR + suffix;\n\t}\n\tif (containingClass.eContainer() instanceof de.silvawb.java.containers.CompilationUnit) {\n\t\tde.silvawb.java.containers.CompilationUnit compilationUnit = ( de.silvawb.java.containers.CompilationUnit) containingClass.eContainer();\n\t    java.lang.String fullName = compilationUnit.getNamespacesAsString() + suffix + \n\t    \tgetName() + de.silvawb.java.JavaUniquePathConstructor.CLASSIFIER_SEPARATOR;\n\t    return getConcreteClassifierProxies(fullName, \"*\");\n\t}\n}\n\n//for classes declared locally inside methods that are not registered in the class path\norg.eclipse.emf.common.util.EList< de.silvawb.java.classifiers.ConcreteClassifier> result = new de.silvawb.java.util.UniqueEList< de.silvawb.java.classifiers.ConcreteClassifier>();\n//can not call ClassifierUtil.getAllMembers, because it will try to call this method!\nfor( de.silvawb.java.members.Member member : getMembers()) {\n\tif(member instanceof de.silvawb.java.classifiers.ConcreteClassifier) {\n\t\tresult.add(( de.silvawb.java.classifiers.ConcreteClassifier) member);\n\t}\n}\nfor( de.silvawb.java.classifiers.ConcreteClassifier superClassifier : getAllSuperClassifiers()) {\n\tfor( de.silvawb.java.members.Member member : superClassifier.getMembers()) {\n\t\tif(member instanceof de.silvawb.java.classifiers.ConcreteClassifier) {\n\t\t\tresult.add(( de.silvawb.java.classifiers.ConcreteClassifier) member);\n\t\t}\n\t}\n}\n\nreturn result;'"
	 * @generated
	 */
	EList<ConcreteClassifier> getInnerClassifiers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.classifiers.ConcreteClassifier> innerClassifierList = new de.silvawb.java.util.UniqueEList< de.silvawb.java.classifiers.ConcreteClassifier>();\n\ninnerClassifierList.addAll(getInnerClassifiers());\n\nfor ( de.silvawb.java.classifiers.ConcreteClassifier superClassifier : getAllSuperClassifiers()) {\n\torg.eclipse.emf.common.util.EList< de.silvawb.java.classifiers.ConcreteClassifier> superInnerList = superClassifier\n\t\t\t.getInnerClassifiers();\n\n\tfor ( de.silvawb.java.classifiers.ConcreteClassifier superInner : superInnerList) {\n\t\tif (superInner.eIsProxy()) {\n\t\t\tsuperInner = ( de.silvawb.java.classifiers.ConcreteClassifier) org.eclipse.emf.ecore.util.EcoreUtil.resolve(\n\t\t\t\t\tsuperInner, this);\n\t\t}\n\t\tif (!superInner.isHidden(this)) {\n\t\t\tinnerClassifierList.add(superInner);\n\t\t}\n\t}\n}\t\nreturn innerClassifierList;'"
	 * @generated
	 */
	EList<ConcreteClassifier> getAllInnerClassifiers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.types.ClassifierReference> typeReferenceList = new de.silvawb.java.util.UniqueEList< de.silvawb.java.types.ClassifierReference>();\nif(this == null) {\n\treturn typeReferenceList;\n}\n\nif (this instanceof de.silvawb.java.classifiers.Class) {\n\tde.silvawb.java.classifiers.Class javaClass = ( de.silvawb.java.classifiers.Class) this;\n\tif (javaClass.getExtends() != null) {\n\t\tde.silvawb.java.types.ClassifierReference classifierReference = javaClass.getExtends().getPureClassifierReference();\n\t\ttypeReferenceList.add(classifierReference);\n\t\tde.silvawb.java.classifiers.ConcreteClassifier target = ( de.silvawb.java.classifiers.ConcreteClassifier) classifierReference.getTarget();\n\t\tif (!target.equals(getObjectClass())) {\n\t\t\ttypeReferenceList.addAll(target.getSuperTypeReferences());\n\t\t}\n\t}\t\n\tfor( de.silvawb.java.types.TypeReference interfaceReference : javaClass.getImplements()) {\n\t\tde.silvawb.java.types.ClassifierReference classifierReference = interfaceReference.getPureClassifierReference();\n\t\ttypeReferenceList.add(classifierReference);\n\t\ttypeReferenceList.addAll((( de.silvawb.java.classifiers.ConcreteClassifier) classifierReference.getTarget()).getSuperTypeReferences());\n\t}\n} else if (this instanceof de.silvawb.java.classifiers.Interface) {\n\tde.silvawb.java.classifiers.Interface javaInterface = ( de.silvawb.java.classifiers.Interface) this;\n\tfor( de.silvawb.java.types.TypeReference interfaceReference : javaInterface.getExtends()) {\n\t\tde.silvawb.java.types.ClassifierReference classifierReference = interfaceReference.getPureClassifierReference();\n\t\ttypeReferenceList.add(classifierReference);\n\t\ttypeReferenceList.addAll((( de.silvawb.java.classifiers.ConcreteClassifier) classifierReference.getTarget()).getSuperTypeReferences());\n\t}\n}\nreturn typeReferenceList;'"
	 * @generated
	 */
	EList<ClassifierReference> getSuperTypeReferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Returns all members of the given classifier including inner classes and 
	 *  all members of super types (extended classes and implemented interfaces).
	 *  
	 *  @param context to check protected visibility
	 *  @return member list
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.members.Member> memberList = new de.silvawb.java.util.UniqueEList< de.silvawb.java.members.Member>();\n\nde.silvawb.java.classifiers.ConcreteClassifier concreteClassifier = ( de.silvawb.java.classifiers.ConcreteClassifier) this;\nmemberList.addAll(concreteClassifier.getMembers());\nmemberList.addAll(concreteClassifier.getDefaultMembers());\n//because inner classes are found in separate class files\nmemberList.addAll(concreteClassifier.getAllInnerClassifiers());\n\nfor ( de.silvawb.java.classifiers.ConcreteClassifier superClassifier : getAllSuperClassifiers()) {\n\tfor( de.silvawb.java.members.Member member : superClassifier.getMembers()) {\n\t\tif(member instanceof de.silvawb.java.modifiers.AnnotableAndModifiable) {\t\t\t\t\t\n\t\t\tde.silvawb.java.modifiers.AnnotableAndModifiable modifiable = ( de.silvawb.java.modifiers.AnnotableAndModifiable) member;\n\n\t\t\tif(!modifiable.isHidden(context)) {\n\t\t\t\tmemberList.add(member);\n\t\t\t}\n\t\t}\n\t\telse {\n\t\t\tmemberList.add(member);\n\t\t}\n\t}\n\tmemberList.addAll(superClassifier.getDefaultMembers());\n}\nreturn memberList;'"
	 * @generated
	 */
	EList<Member> getAllMembers(Commentable context);

} // ConcreteClassifier
