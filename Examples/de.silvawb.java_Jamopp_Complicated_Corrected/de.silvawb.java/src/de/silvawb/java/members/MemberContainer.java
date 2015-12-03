/**
 */
package de.silvawb.java.members;

import de.silvawb.java.classifiers.ConcreteClassifier;

import de.silvawb.java.commons.Commentable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.members.MemberContainer#getMembers <em>Members</em>}</li>
 *   <li>{@link de.silvawb.java.members.MemberContainer#getDefaultMembers <em>Default Members</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.members.MembersPackage#getMemberContainer()
 * @model abstract="true"
 * @generated
 */
public interface MemberContainer extends Commentable {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.members.Member}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see de.silvawb.java.members.MembersPackage#getMemberContainer_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Member> getMembers();

	/**
	 * Returns the value of the '<em><b>Default Members</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.members.Member}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Members</em>' containment reference list.
	 * @see de.silvawb.java.members.MembersPackage#getMemberContainer_DefaultMembers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Member> getDefaultMembers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  @param name
	 *  @return classifier with the given name defined in this member container
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='for( de.silvawb.java.members.Member member : getMembers()) {\n\tif (member instanceof de.silvawb.java.classifiers.ConcreteClassifier && name.equals(member.getName())) {\n\t\treturn ( de.silvawb.java.classifiers.ConcreteClassifier) member;\n\t}\n \t\t}\nfor( de.silvawb.java.members.Member member : getDefaultMembers()) {\n\tif (member instanceof de.silvawb.java.classifiers.ConcreteClassifier && name.equals(member.getName())) {\n\t\treturn ( de.silvawb.java.classifiers.ConcreteClassifier) member;\n\t}\n \t\t}\nreturn null;'"
	 * @generated
	 */
	ConcreteClassifier getContainedClassifier(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  @param name
	 *  @return field with the given name defined in this member container
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='for( de.silvawb.java.members.Member member : getMembers()) {\n\tif (member instanceof de.silvawb.java.members.Field && name.equals(member.getName())) {\n\t\treturn ( de.silvawb.java.members.Field) member;\n\t}\n \t\t}\nfor( de.silvawb.java.members.Member member : getDefaultMembers()) {\n\tif (member instanceof de.silvawb.java.members.Field && name.equals(member.getName())) {\n\t\treturn ( de.silvawb.java.members.Field) member;\n\t}\n \t\t}\nreturn null;'"
	 * @generated
	 */
	Field getContainedField(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  @param name
	 *  @return method with the given name defined in this member container;
	 *          null, if there is no such method 
	 *          or if there are multiple methods with the same name
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='de.silvawb.java.members.Method found = null;\nfor( de.silvawb.java.members.Member member : getMembers()) {\n\tif (member instanceof de.silvawb.java.members.Method && name.equals(member.getName())) {\n\t\tif(found != null) {\n\t\t\treturn null;\n\t\t}\n\t\telse {\n\t\t\tfound = ( de.silvawb.java.members.Method) member;\n\t\t}\n\t}\n \t\t}\n \t\tfor( de.silvawb.java.members.Member member : getDefaultMembers()) {\n\tif (member instanceof de.silvawb.java.members.Method && name.equals(member.getName())) {\n\t\tif(found != null) {\n\t\t\treturn null;\n\t\t}\n\t\telse {\n\t\t\tfound = ( de.silvawb.java.members.Method) member;\n\t\t}\n\t}\n \t\t}\nreturn found;'"
	 * @generated
	 */
	Method getContainedMethod(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.members.Method> methodList = new org.eclipse.emf.common.util.BasicEList< de.silvawb.java.members.Method>();\n\nfor ( de.silvawb.java.members.Member member : getMembers()) {\n\tif (member instanceof de.silvawb.java.members.Method) {\n\t\tmethodList.add(( de.silvawb.java.members.Method) member);\n\t}\n}\t\nreturn methodList;'"
	 * @generated
	 */
	EList<Method> getMethods();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model nameRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.members.Method> methodsToRemove = new org.eclipse.emf.common.util.BasicEList< de.silvawb.java.members.Method>();\n\nfor ( de.silvawb.java.members.Member member : getMembers()) {\n\tif (member instanceof de.silvawb.java.members.Method) {\n\t\tif (name.equals(member.getName())) {\n\t\t\tmethodsToRemove.add(( de.silvawb.java.members.Method) member);\n\t\t}\n\t}\n}\ngetMembers().removeAll(methodsToRemove);'"
	 * @generated
	 */
	void removeMethods(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model nameRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.members.Member> matchingMembers = new org.eclipse.emf.common.util.BasicEList< de.silvawb.java.members.Member>();\n\nfor ( de.silvawb.java.members.Member member : getMembers()) {\n\tif (name.equals(member.getName())) {\n\t\tmatchingMembers.add(member);\n\t}\n}\t\nreturn matchingMembers;'"
	 * @generated
	 */
	EList<Member> getMembersByName(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model nameRequired="true" qualifiedTypeNameRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='de.silvawb.java.members.Field field = de.silvawb.java.members.MembersFactory.eINSTANCE.createField();\nfield.setName(name);\nde.silvawb.java.types.ClassifierReference typeRef = de.silvawb.java.types.TypesFactory.eINSTANCE.createClassifierReference();\ntypeRef.setTarget(getConcreteClassifier(qualifiedTypeName));\nfield.setTypeReference(typeRef);\ngetMembers().add(field);\nreturn field;'"
	 * @generated
	 */
	Field createField(String name, String qualifiedTypeName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.members.Field> fieldList = new org.eclipse.emf.common.util.BasicEList< de.silvawb.java.members.Field>();\n\nfor ( de.silvawb.java.members.Member member : getMembers()) {\n\tif (member instanceof de.silvawb.java.members.Field) {\n\t\tfieldList.add(( de.silvawb.java.members.Field) member);\n\t}\n}\t\nreturn fieldList;'"
	 * @generated
	 */
	EList<Field> getFields();

} // MemberContainer
