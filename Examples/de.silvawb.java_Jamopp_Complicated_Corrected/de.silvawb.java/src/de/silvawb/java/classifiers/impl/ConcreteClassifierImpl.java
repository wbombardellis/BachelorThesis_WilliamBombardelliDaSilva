/**
 */
package de.silvawb.java.classifiers.impl;

import de.silvawb.java.classifiers.ClassifiersPackage;
import de.silvawb.java.classifiers.ConcreteClassifier;

import de.silvawb.java.commons.Commentable;

import de.silvawb.java.generics.GenericsPackage;
import de.silvawb.java.generics.TypeParameter;
import de.silvawb.java.generics.TypeParametrizable;

import de.silvawb.java.members.Field;
import de.silvawb.java.members.Member;
import de.silvawb.java.members.MemberContainer;
import de.silvawb.java.members.MembersPackage;
import de.silvawb.java.members.Method;

import de.silvawb.java.modifiers.AnnotableAndModifiable;
import de.silvawb.java.modifiers.AnnotationInstanceOrModifier;
import de.silvawb.java.modifiers.Modifier;
import de.silvawb.java.modifiers.ModifiersPackage;

import de.silvawb.java.statements.Statement;

import de.silvawb.java.types.ClassifierReference;
import de.silvawb.java.types.Type;
import de.silvawb.java.types.TypesPackage;

import java.lang.Class;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.classifiers.impl.ConcreteClassifierImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link de.silvawb.java.classifiers.impl.ConcreteClassifierImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link de.silvawb.java.classifiers.impl.ConcreteClassifierImpl#getDefaultMembers <em>Default Members</em>}</li>
 *   <li>{@link de.silvawb.java.classifiers.impl.ConcreteClassifierImpl#getAnnotationsAndModifiers <em>Annotations And Modifiers</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConcreteClassifierImpl extends ClassifierImpl implements ConcreteClassifier {
	/**
	 * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeParameter> typeParameters;

	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Member> members;

	/**
	 * The cached value of the '{@link #getDefaultMembers() <em>Default Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Member> defaultMembers;

	/**
	 * The cached value of the '{@link #getAnnotationsAndModifiers() <em>Annotations And Modifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationsAndModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationInstanceOrModifier> annotationsAndModifiers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcreteClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassifiersPackage.Literals.CONCRETE_CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeParameter> getTypeParameters() {
		if (typeParameters == null) {
			typeParameters = new EObjectContainmentEList<TypeParameter>(TypeParameter.class, this, ClassifiersPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS);
		}
		return typeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Member> getMembers() {
		if (members == null) {
			members = new EObjectContainmentEList<Member>(Member.class, this, ClassifiersPackage.CONCRETE_CLASSIFIER__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Member> getDefaultMembers() {
		if (defaultMembers == null) {
			defaultMembers = new EObjectContainmentEList<Member>(Member.class, this, ClassifiersPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS);
		}
		return defaultMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotationInstanceOrModifier> getAnnotationsAndModifiers() {
		if (annotationsAndModifiers == null) {
			annotationsAndModifiers = new EObjectContainmentEList<AnnotationInstanceOrModifier>(AnnotationInstanceOrModifier.class, this, ClassifiersPackage.CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS);
		}
		return annotationsAndModifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcreteClassifier> getInnerClassifiers() {
		if (this.eIsProxy()) {
			 java.lang.String uriString = (( org.eclipse.emf.ecore.InternalEObject)this).eProxyURI().trimFragment().toString();
			 java.lang.String fullName = uriString.substring( org.emftext.language.java.JavaUniquePathConstructor.JAVA_CLASSIFIER_PATHMAP.length(), 
					 uriString.length() - ".java".length()) + "$";
			 return getConcreteClassifierProxies(fullName, "*");
		}
		else {
			java.lang.String suffix = "";
			de.silvawb.java.classifiers.ConcreteClassifier containingClass = this;
			while (containingClass.eContainer() instanceof de.silvawb.java.classifiers.ConcreteClassifier) {
				containingClass = ( de.silvawb.java.classifiers.ConcreteClassifier) containingClass.eContainer();
				suffix = containingClass.getName() + org.emftext.language.java.JavaUniquePathConstructor.CLASSIFIER_SEPARATOR + suffix;
			}
			if (containingClass.eContainer() instanceof de.silvawb.java.containers.CompilationUnit) {
				de.silvawb.java.containers.CompilationUnit compilationUnit = ( de.silvawb.java.containers.CompilationUnit) containingClass.eContainer();
			    java.lang.String fullName = compilationUnit.getNamespacesAsString() + suffix + 
			    	getName() + org.emftext.language.java.JavaUniquePathConstructor.CLASSIFIER_SEPARATOR;
			    return getConcreteClassifierProxies(fullName, "*");
			}
		}
		
		//for classes declared locally inside methods that are not registered in the class path
		org.eclipse.emf.common.util.EList< de.silvawb.java.classifiers.ConcreteClassifier> result = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.classifiers.ConcreteClassifier>();
		//can not call ClassifierUtil.getAllMembers, because it will try to call this method!
		for( de.silvawb.java.members.Member member : getMembers()) {
			if(member instanceof de.silvawb.java.classifiers.ConcreteClassifier) {
				result.add(( de.silvawb.java.classifiers.ConcreteClassifier) member);
			}
		}
		for( de.silvawb.java.classifiers.ConcreteClassifier superClassifier : getAllSuperClassifiers()) {
			for( de.silvawb.java.members.Member member : superClassifier.getMembers()) {
				if(member instanceof de.silvawb.java.classifiers.ConcreteClassifier) {
					result.add(( de.silvawb.java.classifiers.ConcreteClassifier) member);
				}
			}
		}
		
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcreteClassifier> getAllInnerClassifiers() {
		org.eclipse.emf.common.util.EList< de.silvawb.java.classifiers.ConcreteClassifier> innerClassifierList = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.classifiers.ConcreteClassifier>();
		
		innerClassifierList.addAll(getInnerClassifiers());
		
		for ( de.silvawb.java.classifiers.ConcreteClassifier superClassifier : getAllSuperClassifiers()) {
			org.eclipse.emf.common.util.EList< de.silvawb.java.classifiers.ConcreteClassifier> superInnerList = superClassifier
					.getInnerClassifiers();
		
			for ( de.silvawb.java.classifiers.ConcreteClassifier superInner : superInnerList) {
				if (superInner.eIsProxy()) {
					superInner = ( de.silvawb.java.classifiers.ConcreteClassifier) org.eclipse.emf.ecore.util.EcoreUtil.resolve(
							superInner, this);
				}
				if (!superInner.isHidden(this)) {
					innerClassifierList.add(superInner);
				}
			}
		}	
		return innerClassifierList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassifierReference> getSuperTypeReferences() {
		org.eclipse.emf.common.util.EList< de.silvawb.java.types.ClassifierReference> typeReferenceList = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.types.ClassifierReference>();
		if(this == null) {
			return typeReferenceList;
		}
		
		if (this instanceof de.silvawb.java.classifiers.Class) {
			de.silvawb.java.classifiers.Class javaClass = ( de.silvawb.java.classifiers.Class) this;
			if (javaClass.getExtends() != null) {
				de.silvawb.java.types.ClassifierReference classifierReference = javaClass.getExtends().getPureClassifierReference();
				typeReferenceList.add(classifierReference);
				de.silvawb.java.classifiers.ConcreteClassifier target = ( de.silvawb.java.classifiers.ConcreteClassifier) classifierReference.getTarget();
				if (!target.equals(getObjectClass())) {
					typeReferenceList.addAll(target.getSuperTypeReferences());
				}
			}	
			for( de.silvawb.java.types.TypeReference interfaceReference : javaClass.getImplements()) {
				de.silvawb.java.types.ClassifierReference classifierReference = interfaceReference.getPureClassifierReference();
				typeReferenceList.add(classifierReference);
				typeReferenceList.addAll((( de.silvawb.java.classifiers.ConcreteClassifier) classifierReference.getTarget()).getSuperTypeReferences());
			}
		} else if (this instanceof de.silvawb.java.classifiers.Interface) {
			de.silvawb.java.classifiers.Interface javaInterface = ( de.silvawb.java.classifiers.Interface) this;
			for( de.silvawb.java.types.TypeReference interfaceReference : javaInterface.getExtends()) {
				de.silvawb.java.types.ClassifierReference classifierReference = interfaceReference.getPureClassifierReference();
				typeReferenceList.add(classifierReference);
				typeReferenceList.addAll((( de.silvawb.java.classifiers.ConcreteClassifier) classifierReference.getTarget()).getSuperTypeReferences());
			}
		}
		return typeReferenceList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Member> getAllMembers(final Commentable context) {
		org.eclipse.emf.common.util.EList< de.silvawb.java.members.Member> memberList = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.members.Member>();
		
		de.silvawb.java.classifiers.ConcreteClassifier concreteClassifier = ( de.silvawb.java.classifiers.ConcreteClassifier) this;
		memberList.addAll(concreteClassifier.getMembers());
		memberList.addAll(concreteClassifier.getDefaultMembers());
		//because inner classes are found in separate class files
		memberList.addAll(concreteClassifier.getAllInnerClassifiers());
		
		for ( de.silvawb.java.classifiers.ConcreteClassifier superClassifier : getAllSuperClassifiers()) {
			for( de.silvawb.java.members.Member member : superClassifier.getMembers()) {
				if(member instanceof de.silvawb.java.modifiers.AnnotableAndModifiable) {					
					de.silvawb.java.modifiers.AnnotableAndModifiable modifiable = ( de.silvawb.java.modifiers.AnnotableAndModifiable) member;
		
					if(!modifiable.isHidden(context)) {
						memberList.add(member);
					}
				}
				else {
					memberList.add(member);
				}
			}
			memberList.addAll(superClassifier.getDefaultMembers());
		}
		return memberList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHidden(Commentable context) {
		if (this.eIsProxy()) {
			return false;
		}
		//all members of an interface are public by default
		if (this.eContainer() instanceof de.silvawb.java.classifiers.Interface) {
			return false;
		}
		
		if(context.eIsProxy()) {
			context = ( de.silvawb.java.commons.Commentable) org.eclipse.emf.ecore.util.EcoreUtil.resolve(context, this);
		}
		
		de.silvawb.java.classifiers.ConcreteClassifier contextClassifier = context.getContainingConcreteClassifier(); 
		if (!(eContainer() instanceof de.silvawb.java.commons.Commentable)) {
			return true;
		}
		de.silvawb.java.classifiers.ConcreteClassifier myClassifier = (( de.silvawb.java.commons.Commentable) eContainer()).getParentConcreteClassifier();
		//special case: self reference to outer instance
		if(context instanceof de.silvawb.java.references.Reference) {
			if ((( de.silvawb.java.references.Reference)context).getPrevious() instanceof de.silvawb.java.references.SelfReference) {
				de.silvawb.java.references.SelfReference selfReference = ( de.silvawb.java.references.SelfReference) (( de.silvawb.java.references.Reference)context).getPrevious();
				if (selfReference.getSelf() instanceof de.silvawb.java.literals.Self) {
					if(selfReference.getPrevious() != null) {
						de.silvawb.java.types.Type type = selfReference.getPrevious().getReferencedType();
						if (type instanceof de.silvawb.java.classifiers.ConcreteClassifier) {
							contextClassifier = ( de.silvawb.java.classifiers.ConcreteClassifier) type;
						}
					}
				}
			}
		}
		
		for( de.silvawb.java.modifiers.AnnotationInstanceOrModifier modifier : this.getAnnotationsAndModifiers()) {
			if(modifier instanceof de.silvawb.java.modifiers.Private) {
				if (myClassifier.equalsType(0, contextClassifier,0)) {
					return false;
				}
				return true;
			}
			if(modifier instanceof de.silvawb.java.modifiers.Public) {
				return false;
			}
			if(modifier instanceof de.silvawb.java.modifiers.Protected) {
				//package visibility
				if (getContainingPackageName() != null && 
						getContainingPackageName().equals(context.getContainingPackageName())) {
					return false;
				}
				//try outer classifiers as well 
				while(contextClassifier instanceof de.silvawb.java.classifiers.Classifier) {
					if (contextClassifier.isSuperType(0, myClassifier, null)) {
						return false;
					}
					
					org.eclipse.emf.ecore.EObject container = contextClassifier.eContainer();
					if (container instanceof de.silvawb.java.commons.Commentable) {
						contextClassifier = (( de.silvawb.java.commons.Commentable) container).getParentConcreteClassifier();
					} else {
						contextClassifier = null;
					}
					
					if (contextClassifier != null && !contextClassifier.eIsProxy() && 
							contextClassifier.isSuperType(0, myClassifier, null)) {
						return false;
					}
				}
				//visibility through anonymous subclass
				de.silvawb.java.classifiers.AnonymousClass anonymousClass = context.getContainingAnonymousClass();
				while (anonymousClass != null) {
					contextClassifier = anonymousClass.getSuperClassifier();
					if (contextClassifier == null) {
						return true;
					}
					if (contextClassifier.isSuperType(0, myClassifier, null)) {
						return false;
					}
					
					org.eclipse.emf.ecore.EObject container = anonymousClass.eContainer();
					if (container instanceof de.silvawb.java.commons.Commentable) {
						anonymousClass = (( de.silvawb.java.commons.Commentable) container).getContainingAnonymousClass();
					} else {
						anonymousClass = null;
					}
				}
				return true;
			}
		}
		//package visibility?
		if (getContainingPackageName() != null && 
				getContainingPackageName().equals(context.getContainingPackageName())) {
			return false;
		}
		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatic() {
		//all members of an interface are static by default
		if (this.eContainer() instanceof de.silvawb.java.classifiers.Interface) {
			return true;
		}
		
		for( de.silvawb.java.modifiers.AnnotationInstanceOrModifier modifier : this.getAnnotationsAndModifiers()) {
			if(modifier instanceof de.silvawb.java.modifiers.Static) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeModifier(final Class<?> modifierType) {
		java.util.List< de.silvawb.java.modifiers.AnnotationInstanceOrModifier> modifiers = getAnnotationsAndModifiers();
		java.util.List< de.silvawb.java.modifiers.AnnotationInstanceOrModifier> modifiersToRemove = new java.util.ArrayList< de.silvawb.java.modifiers.AnnotationInstanceOrModifier>();
		for ( de.silvawb.java.modifiers.AnnotationInstanceOrModifier modifier : modifiers) {
			if (modifierType.isInstance(modifier)) {
				modifiersToRemove.add(modifier);
			}
		}
		modifiers.removeAll(modifiersToRemove);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void makePublic() {
		if (isPublic()) {
			return;
		}
		removeModifier( de.silvawb.java.modifiers.Private.class);
		removeModifier( de.silvawb.java.modifiers.Protected.class);
		getAnnotationsAndModifiers().add( de.silvawb.java.modifiers.ModifiersFactory.eINSTANCE.createPublic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void makePrivate() {
		if (isPrivate()) {
			return;
		}
		removeModifier( de.silvawb.java.modifiers.Public.class);
		removeModifier( de.silvawb.java.modifiers.Protected.class);
		getAnnotationsAndModifiers().add( de.silvawb.java.modifiers.ModifiersFactory.eINSTANCE.createPrivate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void makeProtected() {
		if (isProtected()) {
			return;
		}
		removeModifier( de.silvawb.java.modifiers.Private.class);
		removeModifier( de.silvawb.java.modifiers.Public.class);
		getAnnotationsAndModifiers().add( de.silvawb.java.modifiers.ModifiersFactory.eINSTANCE.createProtected());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Modifier> getModifiers() {
		org.eclipse.emf.common.util.EList< de.silvawb.java.modifiers.AnnotationInstanceOrModifier> elements = getAnnotationsAndModifiers();
		org.eclipse.emf.common.util.EList< de.silvawb.java.modifiers.Modifier> modifiers = new org.eclipse.emf.common.util.BasicEList< de.silvawb.java.modifiers.Modifier>(); 
		for ( de.silvawb.java.modifiers.AnnotationInstanceOrModifier next : elements) {
			if (next instanceof de.silvawb.java.modifiers.Modifier) {
				modifiers.add(( de.silvawb.java.modifiers.Modifier) next);
			}
		}
		return org.eclipse.emf.common.util.ECollections.unmodifiableEList(modifiers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeAllModifiers() {
		java.util.List< de.silvawb.java.modifiers.Modifier> modifiers = getModifiers();
		org.eclipse.emf.common.util.EList< de.silvawb.java.modifiers.AnnotationInstanceOrModifier> elements = getAnnotationsAndModifiers();
		elements.removeAll(modifiers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasModifier(final Class<?> type) {
		java.util.List< de.silvawb.java.modifiers.AnnotationInstanceOrModifier> modifiers = getAnnotationsAndModifiers();
		for ( de.silvawb.java.modifiers.AnnotationInstanceOrModifier modifier : modifiers) {
			if (type.isInstance(modifier)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPublic() {
		return hasModifier( de.silvawb.java.modifiers.Public.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrivate() {
		return hasModifier( de.silvawb.java.modifiers.Private.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProtected() {
		return hasModifier( de.silvawb.java.modifiers.Protected.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addModifier(final Modifier newModifier) {
		getAnnotationsAndModifiers().add(newModifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteClassifier getContainedClassifier(final String name) {
		for( de.silvawb.java.members.Member member : getMembers()) {
			if (member instanceof de.silvawb.java.classifiers.ConcreteClassifier && name.equals(member.getName())) {
				return ( de.silvawb.java.classifiers.ConcreteClassifier) member;
			}
		 		}
		for( de.silvawb.java.members.Member member : getDefaultMembers()) {
			if (member instanceof de.silvawb.java.classifiers.ConcreteClassifier && name.equals(member.getName())) {
				return ( de.silvawb.java.classifiers.ConcreteClassifier) member;
			}
		 		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getContainedField(final String name) {
		for( de.silvawb.java.members.Member member : getMembers()) {
			if (member instanceof de.silvawb.java.members.Field && name.equals(member.getName())) {
				return ( de.silvawb.java.members.Field) member;
			}
		 		}
		for( de.silvawb.java.members.Member member : getDefaultMembers()) {
			if (member instanceof de.silvawb.java.members.Field && name.equals(member.getName())) {
				return ( de.silvawb.java.members.Field) member;
			}
		 		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getContainedMethod(final String name) {
		de.silvawb.java.members.Method found = null;
		for( de.silvawb.java.members.Member member : getMembers()) {
			if (member instanceof de.silvawb.java.members.Method && name.equals(member.getName())) {
				if(found != null) {
					return null;
				}
				else {
					found = ( de.silvawb.java.members.Method) member;
				}
			}
		 		}
		 		for( de.silvawb.java.members.Member member : getDefaultMembers()) {
			if (member instanceof de.silvawb.java.members.Method && name.equals(member.getName())) {
				if(found != null) {
					return null;
				}
				else {
					found = ( de.silvawb.java.members.Method) member;
				}
			}
		 		}
		return found;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getMethods() {
		org.eclipse.emf.common.util.EList< de.silvawb.java.members.Method> methodList = new org.eclipse.emf.common.util.BasicEList< de.silvawb.java.members.Method>();
		
		for ( de.silvawb.java.members.Member member : getMembers()) {
			if (member instanceof de.silvawb.java.members.Method) {
				methodList.add(( de.silvawb.java.members.Method) member);
			}
		}	
		return methodList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeMethods(final String name) {
		org.eclipse.emf.common.util.EList< de.silvawb.java.members.Method> methodsToRemove = new org.eclipse.emf.common.util.BasicEList< de.silvawb.java.members.Method>();
		
		for ( de.silvawb.java.members.Member member : getMembers()) {
			if (member instanceof de.silvawb.java.members.Method) {
				if (name.equals(member.getName())) {
					methodsToRemove.add(( de.silvawb.java.members.Method) member);
				}
			}
		}
		getMembers().removeAll(methodsToRemove);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Member> getMembersByName(final String name) {
		org.eclipse.emf.common.util.EList< de.silvawb.java.members.Member> matchingMembers = new org.eclipse.emf.common.util.BasicEList< de.silvawb.java.members.Member>();
		
		for ( de.silvawb.java.members.Member member : getMembers()) {
			if (name.equals(member.getName())) {
				matchingMembers.add(member);
			}
		}	
		return matchingMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField(final String name, final String qualifiedTypeName) {
		de.silvawb.java.members.Field field = de.silvawb.java.members.MembersFactory.eINSTANCE.createField();
		field.setName(name);
		de.silvawb.java.types.ClassifierReference typeRef = de.silvawb.java.types.TypesFactory.eINSTANCE.createClassifierReference();
		typeRef.setTarget(getConcreteClassifier(qualifiedTypeName));
		field.setTypeReference(typeRef);
		getMembers().add(field);
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFields() {
		org.eclipse.emf.common.util.EList< de.silvawb.java.members.Field> fieldList = new org.eclipse.emf.common.util.BasicEList< de.silvawb.java.members.Field>();
		
		for ( de.silvawb.java.members.Member member : getMembers()) {
			if (member instanceof de.silvawb.java.members.Field) {
				fieldList.add(( de.silvawb.java.members.Field) member);
			}
		}	
		return fieldList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassifiersPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS:
				return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
			case ClassifiersPackage.CONCRETE_CLASSIFIER__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
			case ClassifiersPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS:
				return ((InternalEList<?>)getDefaultMembers()).basicRemove(otherEnd, msgs);
			case ClassifiersPackage.CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS:
				return ((InternalEList<?>)getAnnotationsAndModifiers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassifiersPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS:
				return getTypeParameters();
			case ClassifiersPackage.CONCRETE_CLASSIFIER__MEMBERS:
				return getMembers();
			case ClassifiersPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS:
				return getDefaultMembers();
			case ClassifiersPackage.CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS:
				return getAnnotationsAndModifiers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClassifiersPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends TypeParameter>)newValue);
				return;
			case ClassifiersPackage.CONCRETE_CLASSIFIER__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends Member>)newValue);
				return;
			case ClassifiersPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS:
				getDefaultMembers().clear();
				getDefaultMembers().addAll((Collection<? extends Member>)newValue);
				return;
			case ClassifiersPackage.CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS:
				getAnnotationsAndModifiers().clear();
				getAnnotationsAndModifiers().addAll((Collection<? extends AnnotationInstanceOrModifier>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ClassifiersPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS:
				getTypeParameters().clear();
				return;
			case ClassifiersPackage.CONCRETE_CLASSIFIER__MEMBERS:
				getMembers().clear();
				return;
			case ClassifiersPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS:
				getDefaultMembers().clear();
				return;
			case ClassifiersPackage.CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS:
				getAnnotationsAndModifiers().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ClassifiersPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS:
				return typeParameters != null && !typeParameters.isEmpty();
			case ClassifiersPackage.CONCRETE_CLASSIFIER__MEMBERS:
				return members != null && !members.isEmpty();
			case ClassifiersPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS:
				return defaultMembers != null && !defaultMembers.isEmpty();
			case ClassifiersPackage.CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS:
				return annotationsAndModifiers != null && !annotationsAndModifiers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TypeParametrizable.class) {
			switch (derivedFeatureID) {
				case ClassifiersPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS: return GenericsPackage.TYPE_PARAMETRIZABLE__TYPE_PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == MemberContainer.class) {
			switch (derivedFeatureID) {
				case ClassifiersPackage.CONCRETE_CLASSIFIER__MEMBERS: return MembersPackage.MEMBER_CONTAINER__MEMBERS;
				case ClassifiersPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS: return MembersPackage.MEMBER_CONTAINER__DEFAULT_MEMBERS;
				default: return -1;
			}
		}
		if (baseClass == Member.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Statement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AnnotableAndModifiable.class) {
			switch (derivedFeatureID) {
				case ClassifiersPackage.CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS: return ModifiersPackage.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TypeParametrizable.class) {
			switch (baseFeatureID) {
				case GenericsPackage.TYPE_PARAMETRIZABLE__TYPE_PARAMETERS: return ClassifiersPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == MemberContainer.class) {
			switch (baseFeatureID) {
				case MembersPackage.MEMBER_CONTAINER__MEMBERS: return ClassifiersPackage.CONCRETE_CLASSIFIER__MEMBERS;
				case MembersPackage.MEMBER_CONTAINER__DEFAULT_MEMBERS: return ClassifiersPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS;
				default: return -1;
			}
		}
		if (baseClass == Member.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Statement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AnnotableAndModifiable.class) {
			switch (baseFeatureID) {
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS: return ClassifiersPackage.CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Type.class) {
			switch (baseOperationID) {
				case TypesPackage.TYPE___GET_ALL_MEMBERS__COMMENTABLE: return ClassifiersPackage.CONCRETE_CLASSIFIER___GET_ALL_MEMBERS__COMMENTABLE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == TypeParametrizable.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == MemberContainer.class) {
			switch (baseOperationID) {
				case MembersPackage.MEMBER_CONTAINER___GET_CONTAINED_CLASSIFIER__STRING: return ClassifiersPackage.CONCRETE_CLASSIFIER___GET_CONTAINED_CLASSIFIER__STRING;
				case MembersPackage.MEMBER_CONTAINER___GET_CONTAINED_FIELD__STRING: return ClassifiersPackage.CONCRETE_CLASSIFIER___GET_CONTAINED_FIELD__STRING;
				case MembersPackage.MEMBER_CONTAINER___GET_CONTAINED_METHOD__STRING: return ClassifiersPackage.CONCRETE_CLASSIFIER___GET_CONTAINED_METHOD__STRING;
				case MembersPackage.MEMBER_CONTAINER___GET_METHODS: return ClassifiersPackage.CONCRETE_CLASSIFIER___GET_METHODS;
				case MembersPackage.MEMBER_CONTAINER___REMOVE_METHODS__STRING: return ClassifiersPackage.CONCRETE_CLASSIFIER___REMOVE_METHODS__STRING;
				case MembersPackage.MEMBER_CONTAINER___GET_MEMBERS_BY_NAME__STRING: return ClassifiersPackage.CONCRETE_CLASSIFIER___GET_MEMBERS_BY_NAME__STRING;
				case MembersPackage.MEMBER_CONTAINER___CREATE_FIELD__STRING_STRING: return ClassifiersPackage.CONCRETE_CLASSIFIER___CREATE_FIELD__STRING_STRING;
				case MembersPackage.MEMBER_CONTAINER___GET_FIELDS: return ClassifiersPackage.CONCRETE_CLASSIFIER___GET_FIELDS;
				default: return -1;
			}
		}
		if (baseClass == Member.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Statement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == AnnotableAndModifiable.class) {
			switch (baseOperationID) {
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_HIDDEN__COMMENTABLE: return ClassifiersPackage.CONCRETE_CLASSIFIER___IS_HIDDEN__COMMENTABLE;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_STATIC: return ClassifiersPackage.CONCRETE_CLASSIFIER___IS_STATIC;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___REMOVE_MODIFIER__CLASS: return ClassifiersPackage.CONCRETE_CLASSIFIER___REMOVE_MODIFIER__CLASS;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PUBLIC: return ClassifiersPackage.CONCRETE_CLASSIFIER___MAKE_PUBLIC;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PRIVATE: return ClassifiersPackage.CONCRETE_CLASSIFIER___MAKE_PRIVATE;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PROTECTED: return ClassifiersPackage.CONCRETE_CLASSIFIER___MAKE_PROTECTED;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___GET_MODIFIERS: return ClassifiersPackage.CONCRETE_CLASSIFIER___GET_MODIFIERS;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___REMOVE_ALL_MODIFIERS: return ClassifiersPackage.CONCRETE_CLASSIFIER___REMOVE_ALL_MODIFIERS;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___HAS_MODIFIER__CLASS: return ClassifiersPackage.CONCRETE_CLASSIFIER___HAS_MODIFIER__CLASS;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_PUBLIC: return ClassifiersPackage.CONCRETE_CLASSIFIER___IS_PUBLIC;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_PRIVATE: return ClassifiersPackage.CONCRETE_CLASSIFIER___IS_PRIVATE;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_PROTECTED: return ClassifiersPackage.CONCRETE_CLASSIFIER___IS_PROTECTED;
				case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___ADD_MODIFIER__MODIFIER: return ClassifiersPackage.CONCRETE_CLASSIFIER___ADD_MODIFIER__MODIFIER;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ClassifiersPackage.CONCRETE_CLASSIFIER___GET_INNER_CLASSIFIERS:
				return getInnerClassifiers();
			case ClassifiersPackage.CONCRETE_CLASSIFIER___GET_ALL_INNER_CLASSIFIERS:
				return getAllInnerClassifiers();
			case ClassifiersPackage.CONCRETE_CLASSIFIER___GET_SUPER_TYPE_REFERENCES:
				return getSuperTypeReferences();
			case ClassifiersPackage.CONCRETE_CLASSIFIER___GET_ALL_MEMBERS__COMMENTABLE:
				return getAllMembers((Commentable)arguments.get(0));
			case ClassifiersPackage.CONCRETE_CLASSIFIER___IS_HIDDEN__COMMENTABLE:
				return isHidden((Commentable)arguments.get(0));
			case ClassifiersPackage.CONCRETE_CLASSIFIER___IS_STATIC:
				return isStatic();
			case ClassifiersPackage.CONCRETE_CLASSIFIER___REMOVE_MODIFIER__CLASS:
				removeModifier((Class<?>)arguments.get(0));
				return null;
			case ClassifiersPackage.CONCRETE_CLASSIFIER___MAKE_PUBLIC:
				makePublic();
				return null;
			case ClassifiersPackage.CONCRETE_CLASSIFIER___MAKE_PRIVATE:
				makePrivate();
				return null;
			case ClassifiersPackage.CONCRETE_CLASSIFIER___MAKE_PROTECTED:
				makeProtected();
				return null;
			case ClassifiersPackage.CONCRETE_CLASSIFIER___GET_MODIFIERS:
				return getModifiers();
			case ClassifiersPackage.CONCRETE_CLASSIFIER___REMOVE_ALL_MODIFIERS:
				removeAllModifiers();
				return null;
			case ClassifiersPackage.CONCRETE_CLASSIFIER___HAS_MODIFIER__CLASS:
				return hasModifier((Class<?>)arguments.get(0));
			case ClassifiersPackage.CONCRETE_CLASSIFIER___IS_PUBLIC:
				return isPublic();
			case ClassifiersPackage.CONCRETE_CLASSIFIER___IS_PRIVATE:
				return isPrivate();
			case ClassifiersPackage.CONCRETE_CLASSIFIER___IS_PROTECTED:
				return isProtected();
			case ClassifiersPackage.CONCRETE_CLASSIFIER___ADD_MODIFIER__MODIFIER:
				addModifier((Modifier)arguments.get(0));
				return null;
			case ClassifiersPackage.CONCRETE_CLASSIFIER___GET_CONTAINED_CLASSIFIER__STRING:
				return getContainedClassifier((String)arguments.get(0));
			case ClassifiersPackage.CONCRETE_CLASSIFIER___GET_CONTAINED_FIELD__STRING:
				return getContainedField((String)arguments.get(0));
			case ClassifiersPackage.CONCRETE_CLASSIFIER___GET_CONTAINED_METHOD__STRING:
				return getContainedMethod((String)arguments.get(0));
			case ClassifiersPackage.CONCRETE_CLASSIFIER___GET_METHODS:
				return getMethods();
			case ClassifiersPackage.CONCRETE_CLASSIFIER___REMOVE_METHODS__STRING:
				removeMethods((String)arguments.get(0));
				return null;
			case ClassifiersPackage.CONCRETE_CLASSIFIER___GET_MEMBERS_BY_NAME__STRING:
				return getMembersByName((String)arguments.get(0));
			case ClassifiersPackage.CONCRETE_CLASSIFIER___CREATE_FIELD__STRING_STRING:
				return createField((String)arguments.get(0), (String)arguments.get(1));
			case ClassifiersPackage.CONCRETE_CLASSIFIER___GET_FIELDS:
				return getFields();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConcreteClassifierImpl
