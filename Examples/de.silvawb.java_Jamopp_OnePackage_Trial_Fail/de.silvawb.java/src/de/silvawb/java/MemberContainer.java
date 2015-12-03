/**
 */
package de.silvawb.java;

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
 *   <li>{@link de.silvawb.java.MemberContainer#getMembers <em>Members</em>}</li>
 *   <li>{@link de.silvawb.java.MemberContainer#getDefaultMembers <em>Default Members</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getMemberContainer()
 * @model abstract="true"
 * @generated
 */
public interface MemberContainer extends Commentable {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.Member}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getMemberContainer_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Member> getMembers();

	/**
	 * Returns the value of the '<em><b>Default Members</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.Member}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Members</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getMemberContainer_DefaultMembers()
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='for( de.silvawb.java.Member member : getMembers()) {\n\tif (member instanceof de.silvawb.java.ConcreteClassifier && name.equals(member.getName())) {\n\t\treturn ( de.silvawb.java.ConcreteClassifier) member;\n\t}\n \t\t}\nfor( de.silvawb.java.Member member : getDefaultMembers()) {\n\tif (member instanceof de.silvawb.java.ConcreteClassifier && name.equals(member.getName())) {\n\t\treturn ( de.silvawb.java.ConcreteClassifier) member;\n\t}\n \t\t}\nreturn null;'"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='for( de.silvawb.java.Member member : getMembers()) {\n\tif (member instanceof de.silvawb.java.Field && name.equals(member.getName())) {\n\t\treturn ( de.silvawb.java.Field) member;\n\t}\n \t\t}\nfor( de.silvawb.java.Member member : getDefaultMembers()) {\n\tif (member instanceof de.silvawb.java.Field && name.equals(member.getName())) {\n\t\treturn ( de.silvawb.java.Field) member;\n\t}\n \t\t}\nreturn null;'"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='de.silvawb.java.Method found = null;\nfor( de.silvawb.java.Member member : getMembers()) {\n\tif (member instanceof de.silvawb.java.Method && name.equals(member.getName())) {\n\t\tif(found != null) {\n\t\t\treturn null;\n\t\t}\n\t\telse {\n\t\t\tfound = ( de.silvawb.java.Method) member;\n\t\t}\n\t}\n \t\t}\n \t\tfor( de.silvawb.java.Member member : getDefaultMembers()) {\n\tif (member instanceof de.silvawb.java.Method && name.equals(member.getName())) {\n\t\tif(found != null) {\n\t\t\treturn null;\n\t\t}\n\t\telse {\n\t\t\tfound = ( de.silvawb.java.Method) member;\n\t\t}\n\t}\n \t\t}\nreturn found;'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.Method> methodList = new org.eclipse.emf.common.util.BasicEList< de.silvawb.java.Method>();\n\nfor ( de.silvawb.java.Member member : getMembers()) {\n\tif (member instanceof de.silvawb.java.Method) {\n\t\tmethodList.add(( de.silvawb.java.Method) member);\n\t}\n}\t\nreturn methodList;'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.Method> methodsToRemove = new org.eclipse.emf.common.util.BasicEList< de.silvawb.java.Method>();\n\nfor ( de.silvawb.java.Member member : getMembers()) {\n\tif (member instanceof de.silvawb.java.Method) {\n\t\tif (name.equals(member.getName())) {\n\t\t\tmethodsToRemove.add(( de.silvawb.java.Method) member);\n\t\t}\n\t}\n}\ngetMembers().removeAll(methodsToRemove);'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.Member> matchingMembers = new org.eclipse.emf.common.util.BasicEList< de.silvawb.java.Member>();\n\nfor ( de.silvawb.java.Member member : getMembers()) {\n\tif (name.equals(member.getName())) {\n\t\tmatchingMembers.add(member);\n\t}\n}\t\nreturn matchingMembers;'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='de.silvawb.java.Field field = de.silvawb.java.MembersFactory.eINSTANCE.createField();\nfield.setName(name);\nde.silvawb.java.ClassifierReference typeRef = de.silvawb.java.TypesFactory.eINSTANCE.createClassifierReference();\ntypeRef.setTarget(getConcreteClassifier(qualifiedTypeName));\nfield.setTypeReference(typeRef);\ngetMembers().add(field);\nreturn field;'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.Field> fieldList = new org.eclipse.emf.common.util.BasicEList< de.silvawb.java.Field>();\n\nfor ( de.silvawb.java.Member member : getMembers()) {\n\tif (member instanceof de.silvawb.java.Field) {\n\t\tfieldList.add(( de.silvawb.java.Field) member);\n\t}\n}\t\nreturn fieldList;'"
	 * @generated
	 */
	EList<Field> getFields();

} // MemberContainer
