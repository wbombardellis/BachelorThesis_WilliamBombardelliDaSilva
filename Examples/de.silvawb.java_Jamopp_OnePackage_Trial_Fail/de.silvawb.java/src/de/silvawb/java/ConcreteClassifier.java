/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.silvawb.java.JavaPackage#getConcreteClassifier()
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (this.eIsProxy()) {\n\t java.lang.String uriString = (( org.eclipse.emf.ecore.InternalEObject)this).eProxyURI().trimFragment().toString();\n\t java.lang.String fullName = uriString.substring( de.silvawb.java.JAVA_CLASSIFIER_PATHMAP.length(), \n\t\t\t uriString.length() - \".java\".length()) + \"$\";\n\t return getConcreteClassifierProxies(fullName, \"*\");\n}\nelse {\n\tjava.lang.String suffix = \"\";\n\tde.silvawb.java.ConcreteClassifier containingClass = this;\n\twhile (containingClass.eContainer() instanceof de.silvawb.java.ConcreteClassifier) {\n\t\tcontainingClass = ( de.silvawb.java.ConcreteClassifier) containingClass.eContainer();\n\t\tsuffix = containingClass.getName() + de.silvawb.java.CLASSIFIER_SEPARATOR + suffix;\n\t}\n\tif (containingClass.eContainer() instanceof de.silvawb.java.CompilationUnit) {\n\t\tde.silvawb.java.CompilationUnit compilationUnit = ( de.silvawb.java.CompilationUnit) containingClass.eContainer();\n\t    java.lang.String fullName = compilationUnit.getNamespacesAsString() + suffix + \n\t    \tgetName() + de.silvawb.java.CLASSIFIER_SEPARATOR;\n\t    return getConcreteClassifierProxies(fullName, \"*\");\n\t}\n}\n\n//for classes declared locally inside methods that are not registered in the class path\norg.eclipse.emf.common.util.EList< de.silvawb.java.ConcreteClassifier> result = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.ConcreteClassifier>();\n//can not call ClassifierUtil.getAllMembers, because it will try to call this method!\nfor( de.silvawb.java.Member member : getMembers()) {\n\tif(member instanceof de.silvawb.java.ConcreteClassifier) {\n\t\tresult.add(( de.silvawb.java.ConcreteClassifier) member);\n\t}\n}\nfor( de.silvawb.java.ConcreteClassifier superClassifier : getAllSuperClassifiers()) {\n\tfor( de.silvawb.java.Member member : superClassifier.getMembers()) {\n\t\tif(member instanceof de.silvawb.java.ConcreteClassifier) {\n\t\t\tresult.add(( de.silvawb.java.ConcreteClassifier) member);\n\t\t}\n\t}\n}\n\nreturn result;'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.ConcreteClassifier> innerClassifierList = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.ConcreteClassifier>();\n\ninnerClassifierList.addAll(getInnerClassifiers());\n\nfor ( de.silvawb.java.ConcreteClassifier superClassifier : getAllSuperClassifiers()) {\n\torg.eclipse.emf.common.util.EList< de.silvawb.java.ConcreteClassifier> superInnerList = superClassifier\n\t\t\t.getInnerClassifiers();\n\n\tfor ( de.silvawb.java.ConcreteClassifier superInner : superInnerList) {\n\t\tif (superInner.eIsProxy()) {\n\t\t\tsuperInner = ( de.silvawb.java.ConcreteClassifier) org.eclipse.emf.ecore.util.EcoreUtil.resolve(\n\t\t\t\t\tsuperInner, this);\n\t\t}\n\t\tif (!superInner.isHidden(this)) {\n\t\t\tinnerClassifierList.add(superInner);\n\t\t}\n\t}\n}\t\nreturn innerClassifierList;'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.ClassifierReference> typeReferenceList = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.ClassifierReference>();\nif(this == null) {\n\treturn typeReferenceList;\n}\n\nif (this instanceof de.silvawb.java.Class) {\n\tde.silvawb.java.Class javaClass = ( de.silvawb.java.Class) this;\n\tif (javaClass.getExtends() != null) {\n\t\tde.silvawb.java.ClassifierReference classifierReference = javaClass.getExtends().getPureClassifierReference();\n\t\ttypeReferenceList.add(classifierReference);\n\t\tde.silvawb.java.ConcreteClassifier target = ( de.silvawb.java.ConcreteClassifier) classifierReference.getTarget();\n\t\tif (!target.equals(getObjectClass())) {\n\t\t\ttypeReferenceList.addAll(target.getSuperTypeReferences());\n\t\t}\n\t}\t\n\tfor( de.silvawb.java.TypeReference interfaceReference : javaClass.getImplements()) {\n\t\tde.silvawb.java.ClassifierReference classifierReference = interfaceReference.getPureClassifierReference();\n\t\ttypeReferenceList.add(classifierReference);\n\t\ttypeReferenceList.addAll((( de.silvawb.java.ConcreteClassifier) classifierReference.getTarget()).getSuperTypeReferences());\n\t}\n} else if (this instanceof de.silvawb.java.Interface) {\n\tde.silvawb.java.Interface javaInterface = ( de.silvawb.java.Interface) this;\n\tfor( de.silvawb.java.TypeReference interfaceReference : javaInterface.getExtends()) {\n\t\tde.silvawb.java.ClassifierReference classifierReference = interfaceReference.getPureClassifierReference();\n\t\ttypeReferenceList.add(classifierReference);\n\t\ttypeReferenceList.addAll((( de.silvawb.java.ConcreteClassifier) classifierReference.getTarget()).getSuperTypeReferences());\n\t}\n}\nreturn typeReferenceList;'"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.Member> memberList = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.Member>();\n\nde.silvawb.java.ConcreteClassifier concreteClassifier = ( de.silvawb.java.ConcreteClassifier) this;\nmemberList.addAll(concreteClassifier.getMembers());\nmemberList.addAll(concreteClassifier.getDefaultMembers());\n//because inner classes are found in separate class files\nmemberList.addAll(concreteClassifier.getAllInnerClassifiers());\n\nfor ( de.silvawb.java.ConcreteClassifier superClassifier : getAllSuperClassifiers()) {\n\tfor( de.silvawb.java.Member member : superClassifier.getMembers()) {\n\t\tif(member instanceof de.silvawb.java.AnnotableAndModifiable) {\t\t\t\t\t\n\t\t\tde.silvawb.java.AnnotableAndModifiable modifiable = ( de.silvawb.java.AnnotableAndModifiable) member;\n\n\t\t\tif(!modifiable.isHidden(context)) {\n\t\t\t\tmemberList.add(member);\n\t\t\t}\n\t\t}\n\t\telse {\n\t\t\tmemberList.add(member);\n\t\t}\n\t}\n\tmemberList.addAll(superClassifier.getDefaultMembers());\n}\nreturn memberList;'"
	 * @generated
	 */
	EList<Member> getAllMembers(Commentable context);

} // ConcreteClassifier
