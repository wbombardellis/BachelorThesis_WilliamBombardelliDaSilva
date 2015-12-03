/**
 */
package de.silvawb.java;

import java.lang.Class;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotable And Modifiable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.AnnotableAndModifiable#getAnnotationsAndModifiers <em>Annotations And Modifiers</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getAnnotableAndModifiable()
 * @model abstract="true"
 * @generated
 */
public interface AnnotableAndModifiable extends Commentable {
	/**
	 * Returns the value of the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.AnnotationInstanceOrModifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations And Modifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations And Modifiers</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getAnnotableAndModifiable_AnnotationsAndModifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnnotationInstanceOrModifier> getAnnotationsAndModifiers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (this.eIsProxy()) {\n\treturn false;\n}\n//all members of an interface are public by default\nif (this.eContainer() instanceof de.silvawb.java.Interface) {\n\treturn false;\n}\n\nif(context.eIsProxy()) {\n\tcontext = ( de.silvawb.java.Commentable) org.eclipse.emf.ecore.util.EcoreUtil.resolve(context, this);\n}\n\nde.silvawb.java.ConcreteClassifier contextClassifier = context.getContainingConcreteClassifier(); \nif (!(eContainer() instanceof de.silvawb.java.Commentable)) {\n\treturn true;\n}\nde.silvawb.java.ConcreteClassifier myClassifier = (( de.silvawb.java.Commentable) eContainer()).getParentConcreteClassifier();\n//special case: self reference to outer instance\nif(context instanceof de.silvawb.java.Reference) {\n\tif ((( de.silvawb.java.Reference)context).getPrevious() instanceof de.silvawb.java.SelfReference) {\n\t\tde.silvawb.java.SelfReference selfReference = ( de.silvawb.java.SelfReference) (( de.silvawb.java.Reference)context).getPrevious();\n\t\tif (selfReference.getSelf() instanceof de.silvawb.java.Self) {\n\t\t\tif(selfReference.getPrevious() != null) {\n\t\t\t\tde.silvawb.java.Type type = selfReference.getPrevious().getReferencedType();\n\t\t\t\tif (type instanceof de.silvawb.java.ConcreteClassifier) {\n\t\t\t\t\tcontextClassifier = ( de.silvawb.java.ConcreteClassifier) type;\n\t\t\t\t}\n\t\t\t}\n\t\t}\n\t}\n}\n\nfor( de.silvawb.java.AnnotationInstanceOrModifier modifier : this.getAnnotationsAndModifiers()) {\n\tif(modifier instanceof de.silvawb.java.Private) {\n\t\tif (myClassifier.equalsType(0, contextClassifier,0)) {\n\t\t\treturn false;\n\t\t}\n\t\treturn true;\n\t}\n\tif(modifier instanceof de.silvawb.java.Public) {\n\t\treturn false;\n\t}\n\tif(modifier instanceof de.silvawb.java.Protected) {\n\t\t//package visibility\n\t\tif (getContainingPackageName() != null && \n\t\t\t\tgetContainingPackageName().equals(context.getContainingPackageName())) {\n\t\t\treturn false;\n\t\t}\n\t\t//try outer classifiers as well \n\t\twhile(contextClassifier instanceof de.silvawb.java.Classifier) {\n\t\t\tif (contextClassifier.isSuperType(0, myClassifier, null)) {\n\t\t\t\treturn false;\n\t\t\t}\n\t\t\t\n\t\t\torg.eclipse.emf.ecore.EObject container = contextClassifier.eContainer();\n\t\t\tif (container instanceof de.silvawb.java.Commentable) {\n\t\t\t\tcontextClassifier = (( de.silvawb.java.Commentable) container).getParentConcreteClassifier();\n\t\t\t} else {\n\t\t\t\tcontextClassifier = null;\n\t\t\t}\n\t\t\t\n\t\t\tif (contextClassifier != null && !contextClassifier.eIsProxy() && \n\t\t\t\t\tcontextClassifier.isSuperType(0, myClassifier, null)) {\n\t\t\t\treturn false;\n\t\t\t}\n\t\t}\n\t\t//visibility through anonymous subclass\n\t\tde.silvawb.java.AnonymousClass anonymousClass = context.getContainingAnonymousClass();\n\t\twhile (anonymousClass != null) {\n\t\t\tcontextClassifier = anonymousClass.getSuperClassifier();\n\t\t\tif (contextClassifier == null) {\n\t\t\t\treturn true;\n\t\t\t}\n\t\t\tif (contextClassifier.isSuperType(0, myClassifier, null)) {\n\t\t\t\treturn false;\n\t\t\t}\n\t\t\t\n\t\t\torg.eclipse.emf.ecore.EObject container = anonymousClass.eContainer();\n\t\t\tif (container instanceof de.silvawb.java.Commentable) {\n\t\t\t\tanonymousClass = (( de.silvawb.java.Commentable) container).getContainingAnonymousClass();\n\t\t\t} else {\n\t\t\t\tanonymousClass = null;\n\t\t\t}\n\t\t}\n\t\treturn true;\n\t}\n}\n//package visibility?\nif (getContainingPackageName() != null && \n\t\tgetContainingPackageName().equals(context.getContainingPackageName())) {\n\treturn false;\n}\n\nreturn true;'"
	 * @generated
	 */
	boolean isHidden(Commentable context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Returns true if this element is static (either by an explicit modifier <code>static</code>
	 *  or because this element is part of an interface).
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='//all members of an interface are static by default\nif (this.eContainer() instanceof de.silvawb.java.Interface) {\n\treturn true;\n}\n\nfor( de.silvawb.java.AnnotationInstanceOrModifier modifier : this.getAnnotationsAndModifiers()) {\n\tif(modifier instanceof de.silvawb.java.Static) {\n\t\treturn true;\n\t}\n}\nreturn false;'"
	 * @generated
	 */
	boolean isStatic();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Removes the given type of modifier from this element.
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.List< de.silvawb.java.AnnotationInstanceOrModifier> modifiers = getAnnotationsAndModifiers();\njava.util.List< de.silvawb.java.AnnotationInstanceOrModifier> modifiersToRemove = new java.util.ArrayList< de.silvawb.java.AnnotationInstanceOrModifier>();\nfor ( de.silvawb.java.AnnotationInstanceOrModifier modifier : modifiers) {\n\tif (modifierType.isInstance(modifier)) {\n\t\tmodifiersToRemove.add(modifier);\n\t}\n}\nmodifiers.removeAll(modifiersToRemove);'"
	 * @generated
	 */
	void removeModifier(Class<?> modifierType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Sets the visibility of this element to <code>public</code>.
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (isPublic()) {\n\treturn;\n}\nremoveModifier( de.silvawb.java.Private.class);\nremoveModifier( de.silvawb.java.Protected.class);\ngetAnnotationsAndModifiers().add( de.silvawb.java.ModifiersFactory.eINSTANCE.createPublic());'"
	 * @generated
	 */
	void makePublic();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Sets the visibility of this element to <code>private</code>.
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (isPrivate()) {\n\treturn;\n}\nremoveModifier( de.silvawb.java.Public.class);\nremoveModifier( de.silvawb.java.Protected.class);\ngetAnnotationsAndModifiers().add( de.silvawb.java.ModifiersFactory.eINSTANCE.createPrivate());'"
	 * @generated
	 */
	void makePrivate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Sets the visibility of this element to <code>protected</code>.
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (isProtected()) {\n\treturn;\n}\nremoveModifier( de.silvawb.java.Private.class);\nremoveModifier( de.silvawb.java.Public.class);\ngetAnnotationsAndModifiers().add( de.silvawb.java.ModifiersFactory.eINSTANCE.createProtected());'"
	 * @generated
	 */
	void makeProtected();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Returns an unmodifiable list of the modifiers that apply to this element.
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.AnnotationInstanceOrModifier> elements = getAnnotationsAndModifiers();\norg.eclipse.emf.common.util.EList< de.silvawb.java.Modifier> modifiers = new org.eclipse.emf.common.util.BasicEList< de.silvawb.java.Modifier>(); \nfor ( de.silvawb.java.AnnotationInstanceOrModifier next : elements) {\n\tif (next instanceof de.silvawb.java.Modifier) {\n\t\tmodifiers.add(( de.silvawb.java.Modifier) next);\n\t}\n}\nreturn org.eclipse.emf.common.util.ECollections.unmodifiableEList(modifiers);'"
	 * @generated
	 */
	EList<Modifier> getModifiers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Removes all modifiers from this element.
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.List< de.silvawb.java.Modifier> modifiers = getModifiers();\norg.eclipse.emf.common.util.EList< de.silvawb.java.AnnotationInstanceOrModifier> elements = getAnnotationsAndModifiers();\nelements.removeAll(modifiers);'"
	 * @generated
	 */
	void removeAllModifiers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Checks whether this element has an modifier of the given type.
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.List< de.silvawb.java.AnnotationInstanceOrModifier> modifiers = getAnnotationsAndModifiers();\nfor ( de.silvawb.java.AnnotationInstanceOrModifier modifier : modifiers) {\n\tif (type.isInstance(modifier)) {\n\t\treturn true;\n\t}\n}\nreturn false;'"
	 * @generated
	 */
	boolean hasModifier(Class<?> type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return hasModifier( de.silvawb.java.Public.class);'"
	 * @generated
	 */
	boolean isPublic();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return hasModifier( de.silvawb.java.Private.class);'"
	 * @generated
	 */
	boolean isPrivate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return hasModifier( de.silvawb.java.Protected.class);'"
	 * @generated
	 */
	boolean isProtected();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Adds the given type of modifier to this element. This method does not
	 *  check for duplicate modifiers!
	 * 
	 * <!-- end-model-doc -->
	 * @model newModifierRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='getAnnotationsAndModifiers().add(newModifier);'"
	 * @generated
	 */
	void addModifier(Modifier newModifier);

} // AnnotableAndModifiable
