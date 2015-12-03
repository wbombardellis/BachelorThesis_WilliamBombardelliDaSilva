/**
 */
package de.silvawb.java.commons;

import de.silvawb.java.annotations.AnnotationInstance;

import de.silvawb.java.classifiers.AnonymousClass;
import de.silvawb.java.classifiers.ConcreteClassifier;
import de.silvawb.java.classifiers.Interface;

import de.silvawb.java.containers.CompilationUnit;

import de.silvawb.java.statements.Statement;

import de.silvawb.layout.LayoutInformation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commentable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.commons.Commentable#getLayoutInformations <em>Layout Informations</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.commons.CommonsPackage#getCommentable()
 * @model abstract="true"
 * @generated
 */
public interface Commentable extends EObject {
	/**
	 * Returns the value of the '<em><b>Layout Informations</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.layout.LayoutInformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Informations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Informations</em>' containment reference list.
	 * @see de.silvawb.java.commons.CommonsPackage#getCommentable_LayoutInformations()
	 * @model containment="true"
	 * @generated
	 */
	EList<LayoutInformation> getLayoutInformations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Finds the <code>de.silvawb.java.classifiers.ConcreteClassifier</code>
	 *  representing the class with the given classified name.
	 *  
	 *  @param name classified name of the ConcreteClassifier
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return ( de.silvawb.java.classifiers.ConcreteClassifier) org.eclipse.emf.ecore.util.EcoreUtil.resolve(\n\tde.silvawb.java.JavaClasspath.get(this).getClassifier(name), this);'"
	 * @generated
	 */
	ConcreteClassifier getConcreteClassifier(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return ( de.silvawb.java.classifiers.ConcreteClassifier) de.silvawb.java.JavaClasspath.get(this).getClassifier(name);'"
	 * @generated
	 */
	ConcreteClassifier getConcreteClassifierProxy(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Finds all <code>de.silvawb.java.classifiers.ConcreteClassifier</code>
	 *  representing the classes in the given package or a single class from that package.
	 *  
	 *  @param packageName name of the package
	 *  for all classifiers or name of a single classifier
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.classifiers.ConcreteClassifier> result = new de.silvawb.java.util.UniqueEList< de.silvawb.java.classifiers.ConcreteClassifier>();\nfor( org.eclipse.emf.ecore.EObject classifier : de.silvawb.java.JavaClasspath.get(this).getClassifiers(packageName, classifierQuery)) {\n\tresult.add(( de.silvawb.java.classifiers.ConcreteClassifier) org.eclipse.emf.ecore.util.EcoreUtil.resolve(classifier, this));\n}\nreturn result;'"
	 * @generated
	 */
	EList<ConcreteClassifier> getConcreteClassifiers(String packageName, String classifierQuery);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.classifiers.ConcreteClassifier> result = new de.silvawb.java.util.UniqueEList< de.silvawb.java.classifiers.ConcreteClassifier>();\nfor( org.eclipse.emf.ecore.EObject classifier : de.silvawb.java.JavaClasspath.get(this).getClassifiers(packageName, classifierQuery)) {\n\tresult.add(( de.silvawb.java.classifiers.ConcreteClassifier)classifier);\n}\nreturn result;'"
	 * @generated
	 */
	EList<ConcreteClassifier> getConcreteClassifierProxies(String packageName, String classifierQuery);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Finds the <code>de.silvawb.java.classifiers.Class</code>
	 *  representing the class with the given name located in <code>java.lang</code>.
	 *  
	 *  @param name name of the Class
	 *  @return the Class
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='de.silvawb.java.classifiers.Class classClass = ( de.silvawb.java.classifiers.Class) getConcreteClassifierProxy(\n\t\t\"java.lang.\" + name);\norg.eclipse.emf.ecore.EObject resolved = ( de.silvawb.java.classifiers.ConcreteClassifier) org.eclipse.emf.ecore.util.EcoreUtil.resolve(classClass, this);\nif (resolved instanceof de.silvawb.java.classifiers.Class) {\n\treturn ( de.silvawb.java.classifiers.Class) resolved;\n}\nreturn null;'"
	 * @generated
	 */
	de.silvawb.java.classifiers.Class getLibClass(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Finds the <code>de.silvawb.java.classifiers.Interface</code>
	 *  representing the interface with the given name located in <code>java.lang</code>.
	 *  
	 *  @param name name of the Interface
	 *  @return the Class
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='de.silvawb.java.classifiers.ConcreteClassifier interfaceClass = getConcreteClassifierProxy(\n\t\t\"java.lang.\" + name);\norg.eclipse.emf.ecore.EObject resolved = org.eclipse.emf.ecore.util.EcoreUtil.resolve(interfaceClass, this);\nif (resolved instanceof de.silvawb.java.classifiers.Interface) {\n\treturn ( de.silvawb.java.classifiers.Interface) resolved;\n}\nreturn null;'"
	 * @generated
	 */
	Interface getLibInterface(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Finds the <code>de.silvawb.java.classifiers.Class</code>
	 *  representing <code>java.lang.Class</code>.
	 *  
	 *  @return the Class
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getLibClass(\"Class\");'"
	 * @generated
	 */
	de.silvawb.java.classifiers.Class getClassClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Finds the <code>de.silvawb.java.classifiers.Class</code>
	 *  representing <code>java.lang.Object</code>.
	 *  
	 *  @return the Class
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getLibClass(\"Object\");'"
	 * @generated
	 */
	de.silvawb.java.classifiers.Class getObjectClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Finds the <code>de.silvawb.java.classifiers.Class</code>
	 *  representing <code>java.lang.String</code>.
	 *  
	 *  @return the Class
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getLibClass(\"String\");'"
	 * @generated
	 */
	de.silvawb.java.classifiers.Class getStringClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Finds the <code>de.silvawb.java.classifiers.Interface</code>
	 *  representing <code>java.lang.annotation.Annotation</code>.
	 *  
	 *  @return the Class
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='de.silvawb.java.classifiers.Interface annotationClass = ( de.silvawb.java.classifiers.Interface) org.eclipse.emf.ecore.util.EcoreUtil.resolve(\n\t\tgetConcreteClassifierProxy(\"java.lang.annotation.Annotation\"), this);\norg.eclipse.emf.ecore.EObject resolved = org.eclipse.emf.ecore.util.EcoreUtil.resolve(annotationClass, this);\nif (resolved instanceof de.silvawb.java.classifiers.Interface) {\n\treturn ( de.silvawb.java.classifiers.Interface) resolved;\n}\nreturn null;'"
	 * @generated
	 */
	Interface getAnnotationInterface();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  
	 *  Finds the containing annotation instance for the given element.
	 *  
	 *  @param value
	 *  @return containing annotation instance
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.ecore.EObject value = this;\nwhile (!(value instanceof de.silvawb.java.annotations.AnnotationInstance) && value != null) {\n\tvalue = value.eContainer();\n}\nreturn ( de.silvawb.java.annotations.AnnotationInstance) value;'"
	 * @generated
	 */
	AnnotationInstance getContainingAnnotationInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Finds the containing anonymous class for the given element.
	 *  
	 *  @param value
	 *  @return containing anonymous class 
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.ecore.EObject value = this;\nwhile (!(value instanceof de.silvawb.java.classifiers.AnonymousClass) \n\t\t&& !(value instanceof de.silvawb.java.classifiers.ConcreteClassifier) //do not jump over other classifiers \n\t\t&& value != null) {\n\tvalue = value.eContainer();\n}\nif (!(value instanceof de.silvawb.java.classifiers.AnonymousClass)) {\n\treturn null;\n}\nreturn ( de.silvawb.java.classifiers.AnonymousClass) value;'"
	 * @generated
	 */
	AnonymousClass getContainingAnonymousClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.ecore.EObject value = this;\nwhile (!(value instanceof de.silvawb.java.classifiers.ConcreteClassifier) && value != null) {\n\tvalue = value.eContainer();\n}\nreturn ( de.silvawb.java.classifiers.ConcreteClassifier) value;'"
	 * @generated
	 */
	ConcreteClassifier getContainingConcreteClassifier();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Finds the containing compilation unit for the given element.
	 *  
	 *  @param value
	 *  @return containing compilation unit
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.ecore.EObject value = this;\nwhile (!(value instanceof de.silvawb.java.containers.CompilationUnit) && value != null) {\n\tvalue = value.eContainer();\n}\nreturn ( de.silvawb.java.containers.CompilationUnit) value;'"
	 * @generated
	 */
	CompilationUnit getContainingCompilationUnit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='de.silvawb.java.containers.CompilationUnit cu = getContainingCompilationUnit();\nif (cu == null) {\n\treturn null;\n}\n\nint idx = cu.getNamespaces().size();\nif(cu.getName() != null) {\n\tchar[] fullName = cu.getName().toCharArray();\n\tfor(int i = 0; i < fullName.length; i++) {\n\t\tif (fullName[i] == \'$\') {\n\t\t\tidx--;\n\t\t}\n\t}\n}\nreturn new org.eclipse.emf.common.util.BasicEList< java.lang.String>(cu.getNamespaces().subList(0, idx));'"
	 * @generated
	 */
	EList<String> getContainingPackageName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Finds the classifier that is the parent of this element. If 
	 *  this element is an inner classifier the parent classifier does
	 *  not necessarily contain this element, since it can reside in 
	 *  a different compilation unit when stored in byte code.
	 *  
	 *  @param value
	 *  @return containing classifier
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='de.silvawb.java.classifiers.ConcreteClassifier classifier = getContainingConcreteClassifier();\nif(classifier == null) {\n\tde.silvawb.java.containers.CompilationUnit cu = getContainingCompilationUnit();\n\t//maybe the outer classifier is in an extra cu\n\tif (cu != null && cu.getName() != null && cu.getName().contains(\"$\")) {\n\t\tclassifier = ( de.silvawb.java.classifiers.ConcreteClassifier) org.eclipse.emf.ecore.util.EcoreUtil.resolve(\n\t\tgetConcreteClassifierProxy(cu.getNamespacesAsString()), this);\n\t\tif(classifier.eIsProxy())  {\n\t\t\tclassifier = null;\n\t\t}\n\t}\n}\nreturn classifier;'"
	 * @generated
	 */
	ConcreteClassifier getParentConcreteClassifier();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Walks up the containment hierarchy and returns the first parent with the
	 *  given type. If no such parent is found, null is returned.
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.ecore.EObject container = this.eContainer();\nwhile (container != null) {\n\tif (type.isInstance(container)) {\n\t\treturn container;\n\t}\n\tcontainer = container.eContainer();\n}\nreturn null;'"
	 * @generated
	 */
	EObject getParentByEType(EClass type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Searches for the first child with the given type. If no such child is found, null is returned.
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.Iterator< org.eclipse.emf.ecore.EObject> it = this.eAllContents();\nwhile (it.hasNext()) {\n\torg.eclipse.emf.ecore.EObject next = it.next();\n\tif (type.isInstance(next)) {\n\t\treturn next;\n\t}\n}\nreturn null;'"
	 * @generated
	 */
	EObject getFirstChildByEType(EClass type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Walks up the containment hierarchy and returns the first parent with the
	 *  given type. If no such parent is found, null is returned.
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.ecore.EObject container = this.eContainer();\nwhile (container != null) {\n\tif (type.isInstance(container)) {\n\t\treturn type.cast(container);\n\t}\n\tcontainer = container.eContainer();\n}\nreturn null;'"
	 * @generated
	 */
	<T> T getParentByType(Class<T> type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Searches for the first child with the given type. If no such child is found, null is returned.
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.Iterator< org.eclipse.emf.ecore.EObject> it = this.eAllContents();\nwhile (it.hasNext()) {\n\torg.eclipse.emf.ecore.EObject next = it.next();\n\tif (type.isInstance(next)) {\n\t\treturn type.cast(next);\n\t}\n}\nreturn null;'"
	 * @generated
	 */
	<T> T getFirstChildByType(Class<T> type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Returns all children of the given type.
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< org.eclipse.emf.ecore.EObject> children = new org.eclipse.emf.common.util.BasicEList< org.eclipse.emf.ecore.EObject>();\njava.util.Iterator< org.eclipse.emf.ecore.EObject> it = this.eAllContents();\nwhile (it.hasNext()) {\n\torg.eclipse.emf.ecore.EObject next = it.next();\n\tif (type.isInstance(next)) {\n\t\tchildren.add(next);\n\t}\n}\nreturn children;'"
	 * @generated
	 */
	EList<EObject> getChildrenByEType(EClass type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Returns all children of the given type.
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList<T> children = new org.eclipse.emf.common.util.BasicEList<T>();\njava.util.Iterator< org.eclipse.emf.ecore.EObject> it = this.eAllContents();\nwhile (it.hasNext()) {\n\torg.eclipse.emf.ecore.EObject next = it.next();\n\tif (type.isInstance(next)) {\n\t\tchildren.add(type.cast(next));\n\t}\n}\nreturn children;'"
	 * @generated
	 */
	<T> EList<T> getChildrenByType(Class<T> type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< java.lang.String> comments = new org.eclipse.emf.common.util.BasicEList< java.lang.String>();\nif (this instanceof de.silvawb.java.modifiers.AnnotableAndModifiable) {\n\tfor ( de.silvawb.java.modifiers.AnnotationInstanceOrModifier aom : (( de.silvawb.java.modifiers.AnnotableAndModifiable) this).getAnnotationsAndModifiers()) {\n\t\tcomments.addAll(aom.getComments());\n\t}\n}\nfor ( org.emftext.commons.layout.LayoutInformation layoutInformation : getLayoutInformations()) {\n\tjava.lang.String text = layoutInformation.getHiddenTokenText();\n\tif (text.contains(\"/*\") || text.contains(\"//\")) {\n\t\tcomments.add(layoutInformation.getHiddenTokenText().trim());\n\t}\n}\nreturn org.eclipse.emf.common.util.ECollections.unmodifiableEList(comments);'"
	 * @generated
	 */
	EList<String> getComments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Adds the given statement before the statement that contains this element.
	 * /
	 * 
	 * <!-- end-model-doc -->
	 * @model statementToAddRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.ecore.EObject container = this.eContainer();\norg.eclipse.emf.ecore.EObject statement = this;\nwhile (container != null) {\n\tif (container instanceof de.silvawb.java.statements.StatementListContainer) {\n\t\tbreak;\n\t}\n\tcontainer = container.eContainer();\n\tstatement = statement.eContainer();\n}\nif (container == null) {\n\tthrow new java.lang.IllegalArgumentException(\"Element \" + this + \" is not contained in a StatementListContainer.\");\n}\nde.silvawb.java.statements.StatementListContainer statementListContainer = ( de.silvawb.java.statements.StatementListContainer) container;\norg.eclipse.emf.common.util.EList< de.silvawb.java.statements.Statement> statements = statementListContainer.getStatements();\nint index = statements.indexOf(statement);\n\nstatements.add(index, statementToAdd);'"
	 * @generated
	 */
	void addBeforeContainingStatement(Statement statementToAdd);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Adds the given statement after the statement that contains this element.
	 * /
	 * 
	 * <!-- end-model-doc -->
	 * @model statementToAddRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.ecore.EObject container = this.eContainer();\norg.eclipse.emf.ecore.EObject statement = this;\nwhile (container != null) {\n\tif (container instanceof de.silvawb.java.statements.StatementListContainer) {\n\t\tbreak;\n\t}\n\tcontainer = container.eContainer();\n\tstatement = statement.eContainer();\n}\nif (container == null) {\n\tthrow new java.lang.IllegalArgumentException(\"Element \" + this + \" is not contained in a StatementListContainer.\");\n}\nde.silvawb.java.statements.StatementListContainer statementListContainer = ( de.silvawb.java.statements.StatementListContainer) container;\norg.eclipse.emf.common.util.EList< de.silvawb.java.statements.Statement> statements = statementListContainer.getStatements();\nint index = statements.indexOf(statement);\n\nif (index == statements.size() - 1) {\n\t// statement is the last one\n\tstatements.add(statementToAdd);\n} else {\n\tstatements.add(index + 1, statementToAdd);\n}'"
	 * @generated
	 */
	void addAfterContainingStatement(Statement statementToAdd);

} // Commentable
