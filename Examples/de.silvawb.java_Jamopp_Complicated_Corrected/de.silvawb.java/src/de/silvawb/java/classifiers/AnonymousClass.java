/**
 */
package de.silvawb.java.classifiers;

import de.silvawb.java.commons.Commentable;

import de.silvawb.java.members.Member;
import de.silvawb.java.members.MemberContainer;

import de.silvawb.java.types.Type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anonymous Class</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.silvawb.java.classifiers.ClassifiersPackage#getAnonymousClass()
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.classifiers.ConcreteClassifier> superClassifierList = new de.silvawb.java.util.UniqueEList< de.silvawb.java.classifiers.ConcreteClassifier>();\n\nde.silvawb.java.classifiers.ConcreteClassifier superClassifier = getSuperClassifier();\n\nif (superClassifier != null) {\n\tsuperClassifierList.add(superClassifier);\n\tsuperClassifierList.addAll(superClassifier.getAllSuperClassifiers());\n}\nelse {\n\tsuperClassifierList.add(getObjectClass());\n}\nreturn superClassifierList;'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='de.silvawb.java.instantiations.NewConstructorCall ncCall = null;\nif (this.eContainer() instanceof de.silvawb.java.instantiations.NewConstructorCall) {\n\tncCall = ( de.silvawb.java.instantiations.NewConstructorCall) this.eContainer();\n\tde.silvawb.java.classifiers.ConcreteClassifier superClassifier = ( de.silvawb.java.classifiers.ConcreteClassifier) ncCall.getTypeReference().getTarget();\n\treturn superClassifier;\n}\nelse if (this.eContainer() instanceof de.silvawb.java.members.EnumConstant) {\n\tif (this.eContainer().eContainer() instanceof de.silvawb.java.classifiers.Enumeration) {\n\t\treturn ( de.silvawb.java.classifiers.Enumeration) this.eContainer().eContainer();\n\t}\n}\nreturn null;'"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.members.Member> memberList = new de.silvawb.java.util.UniqueEList< de.silvawb.java.members.Member>();\nmemberList.addAll(this.getMembers());\nmemberList.addAll(this.getDefaultMembers());\n\nde.silvawb.java.instantiations.NewConstructorCall ncCall = null;\nif (this.eContainer() instanceof de.silvawb.java.instantiations.NewConstructorCall) {\n\tncCall = ( de.silvawb.java.instantiations.NewConstructorCall) this.eContainer();;\n}\nif (ncCall == null) {\n\treturn memberList;\n}\nelse {\n\tde.silvawb.java.classifiers.ConcreteClassifier classifier = ( de.silvawb.java.classifiers.ConcreteClassifier) ncCall.getTypeReference().getTarget();\n\tif (classifier != null) {\n\t\torg.eclipse.emf.common.util.EList< de.silvawb.java.members.Member> superMemberList = classifier.getAllMembers(context);\n\t\tfor( de.silvawb.java.members.Member superMember : superMemberList) {\n\t\t\t//exclude private members\n\t\t\tif(superMember instanceof de.silvawb.java.modifiers.AnnotableAndModifiable) {\t\t\t\t\t\n\t\t\t\tif (superMember.eIsProxy()) {\n\t\t\t\t\tsuperMember = ( de.silvawb.java.members.Member) org.eclipse.emf.ecore.util.EcoreUtil.resolve(superMember, this);\n\t\t\t\t}\n\t\t\t\tde.silvawb.java.modifiers.AnnotableAndModifiable modifiable = ( de.silvawb.java.modifiers.AnnotableAndModifiable) superMember;\n\t\t\t\tif(!modifiable.isHidden(context)) {\n\t\t\t\t\tmemberList.add(superMember);\n\t\t\t\t}\n\t\t\t}\n\t\t\telse {\n\t\t\t\tmemberList.add(superMember);\n\t\t\t}\n\t\t}\n\t}\n\treturn memberList;\n}'"
	 * @generated
	 */
	EList<Member> getAllMembers(Commentable context);

} // AnonymousClass
