/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anonymous Class</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.silvawb.java.JavaPackage#getAnonymousClass()
 * @model
 * @generated
 */
public interface AnonymousClass extends Type, MemberContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  @return a view on all super classifiers
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.ConcreteClassifier> superClassifierList = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.ConcreteClassifier>();\n\nde.silvawb.java.ConcreteClassifier superClassifier = getSuperClassifier();\n\nif (superClassifier != null) {\n\tsuperClassifierList.add(superClassifier);\n\tsuperClassifierList.addAll(superClassifier.getAllSuperClassifiers());\n}\nelse {\n\tsuperClassifierList.add(getObjectClass());\n}\nreturn superClassifierList;'"
	 * @generated
	 */
	EList<ConcreteClassifier> getAllSuperClassifiers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  @return the direct super classifier
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='de.silvawb.java.NewConstructorCall ncCall = null;\nif (this.eContainer() instanceof de.silvawb.java.NewConstructorCall) {\n\tncCall = ( de.silvawb.java.NewConstructorCall) this.eContainer();\n\tde.silvawb.java.ConcreteClassifier superClassifier = ( de.silvawb.java.ConcreteClassifier) ncCall.getTypeReference().getTarget();\n\treturn superClassifier;\n}\nelse if (this.eContainer() instanceof de.silvawb.java.EnumConstant) {\n\tif (this.eContainer().eContainer() instanceof de.silvawb.java.Enumeration) {\n\t\treturn ( de.silvawb.java.Enumeration) this.eContainer().eContainer();\n\t}\n}\nreturn null;'"
	 * @generated
	 */
	ConcreteClassifier getSuperClassifier();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  @param context to check protected visibility
	 *  @return a view on all members including super classifiers' members
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.Member> memberList = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.Member>();\nmemberList.addAll(this.getMembers());\nmemberList.addAll(this.getDefaultMembers());\n\nde.silvawb.java.NewConstructorCall ncCall = null;\nif (this.eContainer() instanceof de.silvawb.java.NewConstructorCall) {\n\tncCall = ( de.silvawb.java.NewConstructorCall) this.eContainer();;\n}\nif (ncCall == null) {\n\treturn memberList;\n}\nelse {\n\tde.silvawb.java.ConcreteClassifier classifier = ( de.silvawb.java.ConcreteClassifier) ncCall.getTypeReference().getTarget();\n\tif (classifier != null) {\n\t\torg.eclipse.emf.common.util.EList< de.silvawb.java.Member> superMemberList = classifier.getAllMembers(context);\n\t\tfor( de.silvawb.java.Member superMember : superMemberList) {\n\t\t\t//exclude private members\n\t\t\tif(superMember instanceof de.silvawb.java.AnnotableAndModifiable) {\t\t\t\t\t\n\t\t\t\tif (superMember.eIsProxy()) {\n\t\t\t\t\tsuperMember = ( de.silvawb.java.Member) org.eclipse.emf.ecore.util.EcoreUtil.resolve(superMember, this);\n\t\t\t\t}\n\t\t\t\tde.silvawb.java.AnnotableAndModifiable modifiable = ( de.silvawb.java.AnnotableAndModifiable) superMember;\n\t\t\t\tif(!modifiable.isHidden(context)) {\n\t\t\t\t\tmemberList.add(superMember);\n\t\t\t\t}\n\t\t\t}\n\t\t\telse {\n\t\t\t\tmemberList.add(superMember);\n\t\t\t}\n\t\t}\n\t}\n\treturn memberList;\n}'"
	 * @generated
	 */
	EList<Member> getAllMembers(Commentable context);

} // AnonymousClass
