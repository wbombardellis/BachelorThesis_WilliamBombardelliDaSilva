/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.AnnotableAndModifiable;
import de.silvawb.java.AnnotationInstanceOrModifier;
import de.silvawb.java.ClassifierReference;
import de.silvawb.java.Commentable;
import de.silvawb.java.ConcreteClassifier;
import de.silvawb.java.Field;
import de.silvawb.java.JavaPackage;
import de.silvawb.java.Member;
import de.silvawb.java.MemberContainer;
import de.silvawb.java.Method;
import de.silvawb.java.Modifier;
import de.silvawb.java.Statement;
import de.silvawb.java.Type;
import de.silvawb.java.TypeParameter;
import de.silvawb.java.TypeParametrizable;

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
 *   <li>{@link de.silvawb.java.impl.ConcreteClassifierImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ConcreteClassifierImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ConcreteClassifierImpl#getDefaultMembers <em>Default Members</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ConcreteClassifierImpl#getAnnotationsAndModifiers <em>Annotations And Modifiers</em>}</li>
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
		return JavaPackage.eINSTANCE.getConcreteClassifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeParameter> getTypeParameters() {
		if (typeParameters == null) {
			typeParameters = new EObjectContainmentEList<TypeParameter>(TypeParameter.class, this, JavaPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS);
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
			members = new EObjectContainmentEList<Member>(Member.class, this, JavaPackage.CONCRETE_CLASSIFIER__MEMBERS);
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
			defaultMembers = new EObjectContainmentEList<Member>(Member.class, this, JavaPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS);
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
			annotationsAndModifiers = new EObjectContainmentEList<AnnotationInstanceOrModifier>(AnnotationInstanceOrModifier.class, this, JavaPackage.CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS);
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
			 java.lang.String fullName = uriString.substring( de.silvawb.java.JAVA_CLASSIFIER_PATHMAP.length(), 
					 uriString.length() - ".java".length()) + "$";
			 return getConcreteClassifierProxies(fullName, "*");
		}
		else {
			java.lang.String suffix = "";
			de.silvawb.java.ConcreteClassifier containingClass = this;
			while (containingClass.eContainer() instanceof de.silvawb.java.ConcreteClassifier) {
				containingClass = ( de.silvawb.java.ConcreteClassifier) containingClass.eContainer();
				suffix = containingClass.getName() + de.silvawb.java.CLASSIFIER_SEPARATOR + suffix;
			}
			if (containingClass.eContainer() instanceof de.silvawb.java.CompilationUnit) {
				de.silvawb.java.CompilationUnit compilationUnit = ( de.silvawb.java.CompilationUnit) containingClass.eContainer();
			    java.lang.String fullName = compilationUnit.getNamespacesAsString() + suffix + 
			    	getName() + de.silvawb.java.CLASSIFIER_SEPARATOR;
			    return getConcreteClassifierProxies(fullName, "*");
			}
		}
		
		//for classes declared locally inside methods that are not registered in the class path
		org.eclipse.emf.common.util.EList< de.silvawb.java.ConcreteClassifier> result = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.ConcreteClassifier>();
		//can not call ClassifierUtil.getAllMembers, because it will try to call this method!
		for( de.silvawb.java.Member member : getMembers()) {
			if(member instanceof de.silvawb.java.ConcreteClassifier) {
				result.add(( de.silvawb.java.ConcreteClassifier) member);
			}
		}
		for( de.silvawb.java.ConcreteClassifier superClassifier : getAllSuperClassifiers()) {
			for( de.silvawb.java.Member member : superClassifier.getMembers()) {
				if(member instanceof de.silvawb.java.ConcreteClassifier) {
					result.add(( de.silvawb.java.ConcreteClassifier) member);
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
		org.eclipse.emf.common.util.EList< de.silvawb.java.ConcreteClassifier> innerClassifierList = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.ConcreteClassifier>();
		
		innerClassifierList.addAll(getInnerClassifiers());
		
		for ( de.silvawb.java.ConcreteClassifier superClassifier : getAllSuperClassifiers()) {
			org.eclipse.emf.common.util.EList< de.silvawb.java.ConcreteClassifier> superInnerList = superClassifier
					.getInnerClassifiers();
		
			for ( de.silvawb.java.ConcreteClassifier superInner : superInnerList) {
				if (superInner.eIsProxy()) {
					superInner = ( de.silvawb.java.ConcreteClassifier) org.eclipse.emf.ecore.util.EcoreUtil.resolve(
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
		org.eclipse.emf.common.util.EList< de.silvawb.java.ClassifierReference> typeReferenceList = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.ClassifierReference>();
		if(this == null) {
			return typeReferenceList;
		}
		
		if (this instanceof de.silvawb.java.Class) {
			de.silvawb.java.Class javaClass = ( de.silvawb.java.Class) this;
			if (javaClass.getExtends() != null) {
				de.silvawb.java.ClassifierReference classifierReference = javaClass.getExtends().getPureClassifierReference();
				typeReferenceList.add(classifierReference);
				de.silvawb.java.ConcreteClassifier target = ( de.silvawb.java.ConcreteClassifier) classifierReference.getTarget();
				if (!target.equals(getObjectClass())) {
					typeReferenceList.addAll(target.getSuperTypeReferences());
				}
			}	
			for( de.silvawb.java.TypeReference interfaceReference : javaClass.getImplements()) {
				de.silvawb.java.ClassifierReference classifierReference = interfaceReference.getPureClassifierReference();
				typeReferenceList.add(classifierReference);
				typeReferenceList.addAll((( de.silvawb.java.ConcreteClassifier) classifierReference.getTarget()).getSuperTypeReferences());
			}
		} else if (this instanceof de.silvawb.java.Interface) {
			de.silvawb.java.Interface javaInterface = ( de.silvawb.java.Interface) this;
			for( de.silvawb.java.TypeReference interfaceReference : javaInterface.getExtends()) {
				de.silvawb.java.ClassifierReference classifierReference = interfaceReference.getPureClassifierReference();
				typeReferenceList.add(classifierReference);
				typeReferenceList.addAll((( de.silvawb.java.ConcreteClassifier) classifierReference.getTarget()).getSuperTypeReferences());
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
		org.eclipse.emf.common.util.EList< de.silvawb.java.Member> memberList = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.Member>();
		
		de.silvawb.java.ConcreteClassifier concreteClassifier = ( de.silvawb.java.ConcreteClassifier) this;
		memberList.addAll(concreteClassifier.getMembers());
		memberList.addAll(concreteClassifier.getDefaultMembers());
		//because inner classes are found in separate class files
		memberList.addAll(concreteClassifier.getAllInnerClassifiers());
		
		for ( de.silvawb.java.ConcreteClassifier superClassifier : getAllSuperClassifiers()) {
			for( de.silvawb.java.Member member : superClassifier.getMembers()) {
				if(member instanceof de.silvawb.java.AnnotableAndModifiable) {					
					de.silvawb.java.AnnotableAndModifiable modifiable = ( de.silvawb.java.AnnotableAndModifiable) member;
		
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
	public boolean isHidden(final Commentable context) {
		if (this.eIsProxy()) {
			return false;
		}
		//all members of an interface are public by default
		if (this.eContainer() instanceof de.silvawb.java.Interface) {
			return false;
		}
		
		if(context.eIsProxy()) {
			context = ( de.silvawb.java.Commentable) org.eclipse.emf.ecore.util.EcoreUtil.resolve(context, this);
		}
		
		de.silvawb.java.ConcreteClassifier contextClassifier = context.getContainingConcreteClassifier(); 
		if (!(eContainer() instanceof de.silvawb.java.Commentable)) {
			return true;
		}
		de.silvawb.java.ConcreteClassifier myClassifier = (( de.silvawb.java.Commentable) eContainer()).getParentConcreteClassifier();
		//special case: self reference to outer instance
		if(context instanceof de.silvawb.java.Reference) {
			if ((( de.silvawb.java.Reference)context).getPrevious() instanceof de.silvawb.java.SelfReference) {
				de.silvawb.java.SelfReference selfReference = ( de.silvawb.java.SelfReference) (( de.silvawb.java.Reference)context).getPrevious();
				if (selfReference.getSelf() instanceof de.silvawb.java.Self) {
					if(selfReference.getPrevious() != null) {
						de.silvawb.java.Type type = selfReference.getPrevious().getReferencedType();
						if (type instanceof de.silvawb.java.ConcreteClassifier) {
							contextClassifier = ( de.silvawb.java.ConcreteClassifier) type;
						}
					}
				}
			}
		}
		
		for( de.silvawb.java.AnnotationInstanceOrModifier modifier : this.getAnnotationsAndModifiers()) {
			if(modifier instanceof de.silvawb.java.Private) {
				if (myClassifier.equalsType(0, contextClassifier,0)) {
					return false;
				}
				return true;
			}
			if(modifier instanceof de.silvawb.java.Public) {
				return false;
			}
			if(modifier instanceof de.silvawb.java.Protected) {
				//package visibility
				if (getContainingPackageName() != null && 
						getContainingPackageName().equals(context.getContainingPackageName())) {
					return false;
				}
				//try outer classifiers as well 
				while(contextClassifier instanceof de.silvawb.java.Classifier) {
					if (contextClassifier.isSuperType(0, myClassifier, null)) {
						return false;
					}
					
					org.eclipse.emf.ecore.EObject container = contextClassifier.eContainer();
					if (container instanceof de.silvawb.java.Commentable) {
						contextClassifier = (( de.silvawb.java.Commentable) container).getParentConcreteClassifier();
					} else {
						contextClassifier = null;
					}
					
					if (contextClassifier != null && !contextClassifier.eIsProxy() && 
							contextClassifier.isSuperType(0, myClassifier, null)) {
						return false;
					}
				}
				//visibility through anonymous subclass
				de.silvawb.java.AnonymousClass anonymousClass = context.getContainingAnonymousClass();
				while (anonymousClass != null) {
					contextClassifier = anonymousClass.getSuperClassifier();
					if (contextClassifier == null) {
						return true;
					}
					if (contextClassifier.isSuperType(0, myClassifier, null)) {
						return false;
					}
					
					org.eclipse.emf.ecore.EObject container = anonymousClass.eContainer();
					if (container instanceof de.silvawb.java.Commentable) {
						anonymousClass = (( de.silvawb.java.Commentable) container).getContainingAnonymousClass();
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
		if (this.eContainer() instanceof de.silvawb.java.Interface) {
			return true;
		}
		
		for( de.silvawb.java.AnnotationInstanceOrModifier modifier : this.getAnnotationsAndModifiers()) {
			if(modifier instanceof de.silvawb.java.Static) {
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
		java.util.List< de.silvawb.java.AnnotationInstanceOrModifier> modifiers = getAnnotationsAndModifiers();
		java.util.List< de.silvawb.java.AnnotationInstanceOrModifier> modifiersToRemove = new java.util.ArrayList< de.silvawb.java.AnnotationInstanceOrModifier>();
		for ( de.silvawb.java.AnnotationInstanceOrModifier modifier : modifiers) {
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
		removeModifier( de.silvawb.java.Private.class);
		removeModifier( de.silvawb.java.Protected.class);
		getAnnotationsAndModifiers().add( de.silvawb.java.ModifiersFactory.eINSTANCE.createPublic());
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
		removeModifier( de.silvawb.java.Public.class);
		removeModifier( de.silvawb.java.Protected.class);
		getAnnotationsAndModifiers().add( de.silvawb.java.ModifiersFactory.eINSTANCE.createPrivate());
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
		removeModifier( de.silvawb.java.Private.class);
		removeModifier( de.silvawb.java.Public.class);
		getAnnotationsAndModifiers().add( de.silvawb.java.ModifiersFactory.eINSTANCE.createProtected());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Modifier> getModifiers() {
		org.eclipse.emf.common.util.EList< de.silvawb.java.AnnotationInstanceOrModifier> elements = getAnnotationsAndModifiers();
		org.eclipse.emf.common.util.EList< de.silvawb.java.Modifier> modifiers = new org.eclipse.emf.common.util.BasicEList< de.silvawb.java.Modifier>(); 
		for ( de.silvawb.java.AnnotationInstanceOrModifier next : elements) {
			if (next instanceof de.silvawb.java.Modifier) {
				modifiers.add(( de.silvawb.java.Modifier) next);
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
		java.util.List< de.silvawb.java.Modifier> modifiers = getModifiers();
		org.eclipse.emf.common.util.EList< de.silvawb.java.AnnotationInstanceOrModifier> elements = getAnnotationsAndModifiers();
		elements.removeAll(modifiers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasModifier(final Class<?> type) {
		java.util.List< de.silvawb.java.AnnotationInstanceOrModifier> modifiers = getAnnotationsAndModifiers();
		for ( de.silvawb.java.AnnotationInstanceOrModifier modifier : modifiers) {
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
		return hasModifier( de.silvawb.java.Public.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrivate() {
		return hasModifier( de.silvawb.java.Private.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProtected() {
		return hasModifier( de.silvawb.java.Protected.class);
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
		for( de.silvawb.java.Member member : getMembers()) {
			if (member instanceof de.silvawb.java.ConcreteClassifier && name.equals(member.getName())) {
				return ( de.silvawb.java.ConcreteClassifier) member;
			}
		 		}
		for( de.silvawb.java.Member member : getDefaultMembers()) {
			if (member instanceof de.silvawb.java.ConcreteClassifier && name.equals(member.getName())) {
				return ( de.silvawb.java.ConcreteClassifier) member;
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
		for( de.silvawb.java.Member member : getMembers()) {
			if (member instanceof de.silvawb.java.Field && name.equals(member.getName())) {
				return ( de.silvawb.java.Field) member;
			}
		 		}
		for( de.silvawb.java.Member member : getDefaultMembers()) {
			if (member instanceof de.silvawb.java.Field && name.equals(member.getName())) {
				return ( de.silvawb.java.Field) member;
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
		de.silvawb.java.Method found = null;
		for( de.silvawb.java.Member member : getMembers()) {
			if (member instanceof de.silvawb.java.Method && name.equals(member.getName())) {
				if(found != null) {
					return null;
				}
				else {
					found = ( de.silvawb.java.Method) member;
				}
			}
		 		}
		 		for( de.silvawb.java.Member member : getDefaultMembers()) {
			if (member instanceof de.silvawb.java.Method && name.equals(member.getName())) {
				if(found != null) {
					return null;
				}
				else {
					found = ( de.silvawb.java.Method) member;
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
		org.eclipse.emf.common.util.EList< de.silvawb.java.Method> methodList = new org.eclipse.emf.common.util.BasicEList< de.silvawb.java.Method>();
		
		for ( de.silvawb.java.Member member : getMembers()) {
			if (member instanceof de.silvawb.java.Method) {
				methodList.add(( de.silvawb.java.Method) member);
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
		org.eclipse.emf.common.util.EList< de.silvawb.java.Method> methodsToRemove = new org.eclipse.emf.common.util.BasicEList< de.silvawb.java.Method>();
		
		for ( de.silvawb.java.Member member : getMembers()) {
			if (member instanceof de.silvawb.java.Method) {
				if (name.equals(member.getName())) {
					methodsToRemove.add(( de.silvawb.java.Method) member);
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
		org.eclipse.emf.common.util.EList< de.silvawb.java.Member> matchingMembers = new org.eclipse.emf.common.util.BasicEList< de.silvawb.java.Member>();
		
		for ( de.silvawb.java.Member member : getMembers()) {
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
		de.silvawb.java.Field field = de.silvawb.java.MembersFactory.eINSTANCE.createField();
		field.setName(name);
		de.silvawb.java.ClassifierReference typeRef = de.silvawb.java.TypesFactory.eINSTANCE.createClassifierReference();
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
		org.eclipse.emf.common.util.EList< de.silvawb.java.Field> fieldList = new org.eclipse.emf.common.util.BasicEList< de.silvawb.java.Field>();
		
		for ( de.silvawb.java.Member member : getMembers()) {
			if (member instanceof de.silvawb.java.Field) {
				fieldList.add(( de.silvawb.java.Field) member);
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
			case JavaPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS:
				return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
			case JavaPackage.CONCRETE_CLASSIFIER__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
			case JavaPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS:
				return ((InternalEList<?>)getDefaultMembers()).basicRemove(otherEnd, msgs);
			case JavaPackage.CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS:
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
			case JavaPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS:
				return getTypeParameters();
			case JavaPackage.CONCRETE_CLASSIFIER__MEMBERS:
				return getMembers();
			case JavaPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS:
				return getDefaultMembers();
			case JavaPackage.CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS:
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
			case JavaPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends TypeParameter>)newValue);
				return;
			case JavaPackage.CONCRETE_CLASSIFIER__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends Member>)newValue);
				return;
			case JavaPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS:
				getDefaultMembers().clear();
				getDefaultMembers().addAll((Collection<? extends Member>)newValue);
				return;
			case JavaPackage.CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS:
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
			case JavaPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS:
				getTypeParameters().clear();
				return;
			case JavaPackage.CONCRETE_CLASSIFIER__MEMBERS:
				getMembers().clear();
				return;
			case JavaPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS:
				getDefaultMembers().clear();
				return;
			case JavaPackage.CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS:
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
			case JavaPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS:
				return typeParameters != null && !typeParameters.isEmpty();
			case JavaPackage.CONCRETE_CLASSIFIER__MEMBERS:
				return members != null && !members.isEmpty();
			case JavaPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS:
				return defaultMembers != null && !defaultMembers.isEmpty();
			case JavaPackage.CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS:
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
				case JavaPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS: return JavaPackage.TYPE_PARAMETRIZABLE__TYPE_PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == MemberContainer.class) {
			switch (derivedFeatureID) {
				case JavaPackage.CONCRETE_CLASSIFIER__MEMBERS: return JavaPackage.MEMBER_CONTAINER__MEMBERS;
				case JavaPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS: return JavaPackage.MEMBER_CONTAINER__DEFAULT_MEMBERS;
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
				case JavaPackage.CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS: return JavaPackage.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS;
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
				case JavaPackage.TYPE_PARAMETRIZABLE__TYPE_PARAMETERS: return JavaPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == MemberContainer.class) {
			switch (baseFeatureID) {
				case JavaPackage.MEMBER_CONTAINER__MEMBERS: return JavaPackage.CONCRETE_CLASSIFIER__MEMBERS;
				case JavaPackage.MEMBER_CONTAINER__DEFAULT_MEMBERS: return JavaPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS;
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
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS: return JavaPackage.CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS;
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
				case JavaPackage.TYPE___GET_ALL_MEMBERS__COMMENTABLE: return JavaPackage.CONCRETE_CLASSIFIER___GET_ALL_MEMBERS__COMMENTABLE;
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
				case JavaPackage.MEMBER_CONTAINER___GET_CONTAINED_CLASSIFIER__STRING: return JavaPackage.CONCRETE_CLASSIFIER___GET_CONTAINED_CLASSIFIER__STRING;
				case JavaPackage.MEMBER_CONTAINER___GET_CONTAINED_FIELD__STRING: return JavaPackage.CONCRETE_CLASSIFIER___GET_CONTAINED_FIELD__STRING;
				case JavaPackage.MEMBER_CONTAINER___GET_CONTAINED_METHOD__STRING: return JavaPackage.CONCRETE_CLASSIFIER___GET_CONTAINED_METHOD__STRING;
				case JavaPackage.MEMBER_CONTAINER___GET_METHODS: return JavaPackage.CONCRETE_CLASSIFIER___GET_METHODS;
				case JavaPackage.MEMBER_CONTAINER___REMOVE_METHODS__STRING: return JavaPackage.CONCRETE_CLASSIFIER___REMOVE_METHODS__STRING;
				case JavaPackage.MEMBER_CONTAINER___GET_MEMBERS_BY_NAME__STRING: return JavaPackage.CONCRETE_CLASSIFIER___GET_MEMBERS_BY_NAME__STRING;
				case JavaPackage.MEMBER_CONTAINER___CREATE_FIELD__STRING_STRING: return JavaPackage.CONCRETE_CLASSIFIER___CREATE_FIELD__STRING_STRING;
				case JavaPackage.MEMBER_CONTAINER___GET_FIELDS: return JavaPackage.CONCRETE_CLASSIFIER___GET_FIELDS;
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
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___IS_HIDDEN__COMMENTABLE: return JavaPackage.CONCRETE_CLASSIFIER___IS_HIDDEN__COMMENTABLE;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___IS_STATIC: return JavaPackage.CONCRETE_CLASSIFIER___IS_STATIC;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___REMOVE_MODIFIER__CLASS: return JavaPackage.CONCRETE_CLASSIFIER___REMOVE_MODIFIER__CLASS;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PUBLIC: return JavaPackage.CONCRETE_CLASSIFIER___MAKE_PUBLIC;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PRIVATE: return JavaPackage.CONCRETE_CLASSIFIER___MAKE_PRIVATE;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PROTECTED: return JavaPackage.CONCRETE_CLASSIFIER___MAKE_PROTECTED;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___GET_MODIFIERS: return JavaPackage.CONCRETE_CLASSIFIER___GET_MODIFIERS;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___REMOVE_ALL_MODIFIERS: return JavaPackage.CONCRETE_CLASSIFIER___REMOVE_ALL_MODIFIERS;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___HAS_MODIFIER__CLASS: return JavaPackage.CONCRETE_CLASSIFIER___HAS_MODIFIER__CLASS;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___IS_PUBLIC: return JavaPackage.CONCRETE_CLASSIFIER___IS_PUBLIC;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___IS_PRIVATE: return JavaPackage.CONCRETE_CLASSIFIER___IS_PRIVATE;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___IS_PROTECTED: return JavaPackage.CONCRETE_CLASSIFIER___IS_PROTECTED;
				case JavaPackage.ANNOTABLE_AND_MODIFIABLE___ADD_MODIFIER__MODIFIER: return JavaPackage.CONCRETE_CLASSIFIER___ADD_MODIFIER__MODIFIER;
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
			case JavaPackage.CONCRETE_CLASSIFIER___GET_INNER_CLASSIFIERS:
				return getInnerClassifiers();
			case JavaPackage.CONCRETE_CLASSIFIER___GET_ALL_INNER_CLASSIFIERS:
				return getAllInnerClassifiers();
			case JavaPackage.CONCRETE_CLASSIFIER___GET_SUPER_TYPE_REFERENCES:
				return getSuperTypeReferences();
			case JavaPackage.CONCRETE_CLASSIFIER___GET_ALL_MEMBERS__COMMENTABLE:
				return getAllMembers((Commentable)arguments.get(0));
			case JavaPackage.CONCRETE_CLASSIFIER___IS_HIDDEN__COMMENTABLE:
				return isHidden((Commentable)arguments.get(0));
			case JavaPackage.CONCRETE_CLASSIFIER___IS_STATIC:
				return isStatic();
			case JavaPackage.CONCRETE_CLASSIFIER___REMOVE_MODIFIER__CLASS:
				removeModifier((Class<?>)arguments.get(0));
				return null;
			case JavaPackage.CONCRETE_CLASSIFIER___MAKE_PUBLIC:
				makePublic();
				return null;
			case JavaPackage.CONCRETE_CLASSIFIER___MAKE_PRIVATE:
				makePrivate();
				return null;
			case JavaPackage.CONCRETE_CLASSIFIER___MAKE_PROTECTED:
				makeProtected();
				return null;
			case JavaPackage.CONCRETE_CLASSIFIER___GET_MODIFIERS:
				return getModifiers();
			case JavaPackage.CONCRETE_CLASSIFIER___REMOVE_ALL_MODIFIERS:
				removeAllModifiers();
				return null;
			case JavaPackage.CONCRETE_CLASSIFIER___HAS_MODIFIER__CLASS:
				return hasModifier((Class<?>)arguments.get(0));
			case JavaPackage.CONCRETE_CLASSIFIER___IS_PUBLIC:
				return isPublic();
			case JavaPackage.CONCRETE_CLASSIFIER___IS_PRIVATE:
				return isPrivate();
			case JavaPackage.CONCRETE_CLASSIFIER___IS_PROTECTED:
				return isProtected();
			case JavaPackage.CONCRETE_CLASSIFIER___ADD_MODIFIER__MODIFIER:
				addModifier((Modifier)arguments.get(0));
				return null;
			case JavaPackage.CONCRETE_CLASSIFIER___GET_CONTAINED_CLASSIFIER__STRING:
				return getContainedClassifier((String)arguments.get(0));
			case JavaPackage.CONCRETE_CLASSIFIER___GET_CONTAINED_FIELD__STRING:
				return getContainedField((String)arguments.get(0));
			case JavaPackage.CONCRETE_CLASSIFIER___GET_CONTAINED_METHOD__STRING:
				return getContainedMethod((String)arguments.get(0));
			case JavaPackage.CONCRETE_CLASSIFIER___GET_METHODS:
				return getMethods();
			case JavaPackage.CONCRETE_CLASSIFIER___REMOVE_METHODS__STRING:
				removeMethods((String)arguments.get(0));
				return null;
			case JavaPackage.CONCRETE_CLASSIFIER___GET_MEMBERS_BY_NAME__STRING:
				return getMembersByName((String)arguments.get(0));
			case JavaPackage.CONCRETE_CLASSIFIER___CREATE_FIELD__STRING_STRING:
				return createField((String)arguments.get(0), (String)arguments.get(1));
			case JavaPackage.CONCRETE_CLASSIFIER___GET_FIELDS:
				return getFields();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConcreteClassifierImpl
