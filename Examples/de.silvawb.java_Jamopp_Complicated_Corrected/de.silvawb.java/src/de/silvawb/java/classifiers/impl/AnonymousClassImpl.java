/**
 */
package de.silvawb.java.classifiers.impl;

import de.silvawb.java.classifiers.AnonymousClass;
import de.silvawb.java.classifiers.ClassifiersPackage;
import de.silvawb.java.classifiers.ConcreteClassifier;

import de.silvawb.java.commons.Commentable;

import de.silvawb.java.members.Field;
import de.silvawb.java.members.Member;
import de.silvawb.java.members.MemberContainer;
import de.silvawb.java.members.MembersPackage;
import de.silvawb.java.members.Method;

import de.silvawb.java.types.Type;
import de.silvawb.java.types.TypesPackage;

import de.silvawb.java.types.impl.TypeImpl;

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
 * An implementation of the model object '<em><b>Anonymous Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.classifiers.impl.AnonymousClassImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link de.silvawb.java.classifiers.impl.AnonymousClassImpl#getDefaultMembers <em>Default Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnonymousClassImpl extends TypeImpl implements AnonymousClass {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnonymousClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassifiersPackage.Literals.ANONYMOUS_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Member> getMembers() {
		if (members == null) {
			members = new EObjectContainmentEList<Member>(Member.class, this, ClassifiersPackage.ANONYMOUS_CLASS__MEMBERS);
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
			defaultMembers = new EObjectContainmentEList<Member>(Member.class, this, ClassifiersPackage.ANONYMOUS_CLASS__DEFAULT_MEMBERS);
		}
		return defaultMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcreteClassifier> getAllSuperClassifiers() {
		org.eclipse.emf.common.util.EList< de.silvawb.java.classifiers.ConcreteClassifier> superClassifierList = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.classifiers.ConcreteClassifier>();
		
		de.silvawb.java.classifiers.ConcreteClassifier superClassifier = getSuperClassifier();
		
		if (superClassifier != null) {
			superClassifierList.add(superClassifier);
			superClassifierList.addAll(superClassifier.getAllSuperClassifiers());
		}
		else {
			superClassifierList.add(getObjectClass());
		}
		return superClassifierList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteClassifier getSuperClassifier() {
		de.silvawb.java.instantiations.NewConstructorCall ncCall = null;
		if (this.eContainer() instanceof de.silvawb.java.instantiations.NewConstructorCall) {
			ncCall = ( de.silvawb.java.instantiations.NewConstructorCall) this.eContainer();
			de.silvawb.java.classifiers.ConcreteClassifier superClassifier = ( de.silvawb.java.classifiers.ConcreteClassifier) ncCall.getTypeReference().getTarget();
			return superClassifier;
		}
		else if (this.eContainer() instanceof de.silvawb.java.members.EnumConstant) {
			if (this.eContainer().eContainer() instanceof de.silvawb.java.classifiers.Enumeration) {
				return ( de.silvawb.java.classifiers.Enumeration) this.eContainer().eContainer();
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Member> getAllMembers(final Commentable context) {
		org.eclipse.emf.common.util.EList< de.silvawb.java.members.Member> memberList = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.members.Member>();
		memberList.addAll(this.getMembers());
		memberList.addAll(this.getDefaultMembers());
		
		de.silvawb.java.instantiations.NewConstructorCall ncCall = null;
		if (this.eContainer() instanceof de.silvawb.java.instantiations.NewConstructorCall) {
			ncCall = ( de.silvawb.java.instantiations.NewConstructorCall) this.eContainer();;
		}
		if (ncCall == null) {
			return memberList;
		}
		else {
			de.silvawb.java.classifiers.ConcreteClassifier classifier = ( de.silvawb.java.classifiers.ConcreteClassifier) ncCall.getTypeReference().getTarget();
			if (classifier != null) {
				org.eclipse.emf.common.util.EList< de.silvawb.java.members.Member> superMemberList = classifier.getAllMembers(context);
				for( de.silvawb.java.members.Member superMember : superMemberList) {
					//exclude private members
					if(superMember instanceof de.silvawb.java.modifiers.AnnotableAndModifiable) {					
						if (superMember.eIsProxy()) {
							superMember = ( de.silvawb.java.members.Member) org.eclipse.emf.ecore.util.EcoreUtil.resolve(superMember, this);
						}
						de.silvawb.java.modifiers.AnnotableAndModifiable modifiable = ( de.silvawb.java.modifiers.AnnotableAndModifiable) superMember;
						if(!modifiable.isHidden(context)) {
							memberList.add(superMember);
						}
					}
					else {
						memberList.add(superMember);
					}
				}
			}
			return memberList;
		}
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
			case ClassifiersPackage.ANONYMOUS_CLASS__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
			case ClassifiersPackage.ANONYMOUS_CLASS__DEFAULT_MEMBERS:
				return ((InternalEList<?>)getDefaultMembers()).basicRemove(otherEnd, msgs);
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
			case ClassifiersPackage.ANONYMOUS_CLASS__MEMBERS:
				return getMembers();
			case ClassifiersPackage.ANONYMOUS_CLASS__DEFAULT_MEMBERS:
				return getDefaultMembers();
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
			case ClassifiersPackage.ANONYMOUS_CLASS__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends Member>)newValue);
				return;
			case ClassifiersPackage.ANONYMOUS_CLASS__DEFAULT_MEMBERS:
				getDefaultMembers().clear();
				getDefaultMembers().addAll((Collection<? extends Member>)newValue);
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
			case ClassifiersPackage.ANONYMOUS_CLASS__MEMBERS:
				getMembers().clear();
				return;
			case ClassifiersPackage.ANONYMOUS_CLASS__DEFAULT_MEMBERS:
				getDefaultMembers().clear();
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
			case ClassifiersPackage.ANONYMOUS_CLASS__MEMBERS:
				return members != null && !members.isEmpty();
			case ClassifiersPackage.ANONYMOUS_CLASS__DEFAULT_MEMBERS:
				return defaultMembers != null && !defaultMembers.isEmpty();
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
		if (baseClass == MemberContainer.class) {
			switch (derivedFeatureID) {
				case ClassifiersPackage.ANONYMOUS_CLASS__MEMBERS: return MembersPackage.MEMBER_CONTAINER__MEMBERS;
				case ClassifiersPackage.ANONYMOUS_CLASS__DEFAULT_MEMBERS: return MembersPackage.MEMBER_CONTAINER__DEFAULT_MEMBERS;
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
		if (baseClass == MemberContainer.class) {
			switch (baseFeatureID) {
				case MembersPackage.MEMBER_CONTAINER__MEMBERS: return ClassifiersPackage.ANONYMOUS_CLASS__MEMBERS;
				case MembersPackage.MEMBER_CONTAINER__DEFAULT_MEMBERS: return ClassifiersPackage.ANONYMOUS_CLASS__DEFAULT_MEMBERS;
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
				case TypesPackage.TYPE___GET_ALL_MEMBERS__COMMENTABLE: return ClassifiersPackage.ANONYMOUS_CLASS___GET_ALL_MEMBERS__COMMENTABLE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == MemberContainer.class) {
			switch (baseOperationID) {
				case MembersPackage.MEMBER_CONTAINER___GET_CONTAINED_CLASSIFIER__STRING: return ClassifiersPackage.ANONYMOUS_CLASS___GET_CONTAINED_CLASSIFIER__STRING;
				case MembersPackage.MEMBER_CONTAINER___GET_CONTAINED_FIELD__STRING: return ClassifiersPackage.ANONYMOUS_CLASS___GET_CONTAINED_FIELD__STRING;
				case MembersPackage.MEMBER_CONTAINER___GET_CONTAINED_METHOD__STRING: return ClassifiersPackage.ANONYMOUS_CLASS___GET_CONTAINED_METHOD__STRING;
				case MembersPackage.MEMBER_CONTAINER___GET_METHODS: return ClassifiersPackage.ANONYMOUS_CLASS___GET_METHODS;
				case MembersPackage.MEMBER_CONTAINER___REMOVE_METHODS__STRING: return ClassifiersPackage.ANONYMOUS_CLASS___REMOVE_METHODS__STRING;
				case MembersPackage.MEMBER_CONTAINER___GET_MEMBERS_BY_NAME__STRING: return ClassifiersPackage.ANONYMOUS_CLASS___GET_MEMBERS_BY_NAME__STRING;
				case MembersPackage.MEMBER_CONTAINER___CREATE_FIELD__STRING_STRING: return ClassifiersPackage.ANONYMOUS_CLASS___CREATE_FIELD__STRING_STRING;
				case MembersPackage.MEMBER_CONTAINER___GET_FIELDS: return ClassifiersPackage.ANONYMOUS_CLASS___GET_FIELDS;
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
			case ClassifiersPackage.ANONYMOUS_CLASS___GET_ALL_SUPER_CLASSIFIERS:
				return getAllSuperClassifiers();
			case ClassifiersPackage.ANONYMOUS_CLASS___GET_SUPER_CLASSIFIER:
				return getSuperClassifier();
			case ClassifiersPackage.ANONYMOUS_CLASS___GET_ALL_MEMBERS__COMMENTABLE:
				return getAllMembers((Commentable)arguments.get(0));
			case ClassifiersPackage.ANONYMOUS_CLASS___GET_CONTAINED_CLASSIFIER__STRING:
				return getContainedClassifier((String)arguments.get(0));
			case ClassifiersPackage.ANONYMOUS_CLASS___GET_CONTAINED_FIELD__STRING:
				return getContainedField((String)arguments.get(0));
			case ClassifiersPackage.ANONYMOUS_CLASS___GET_CONTAINED_METHOD__STRING:
				return getContainedMethod((String)arguments.get(0));
			case ClassifiersPackage.ANONYMOUS_CLASS___GET_METHODS:
				return getMethods();
			case ClassifiersPackage.ANONYMOUS_CLASS___REMOVE_METHODS__STRING:
				removeMethods((String)arguments.get(0));
				return null;
			case ClassifiersPackage.ANONYMOUS_CLASS___GET_MEMBERS_BY_NAME__STRING:
				return getMembersByName((String)arguments.get(0));
			case ClassifiersPackage.ANONYMOUS_CLASS___CREATE_FIELD__STRING_STRING:
				return createField((String)arguments.get(0), (String)arguments.get(1));
			case ClassifiersPackage.ANONYMOUS_CLASS___GET_FIELDS:
				return getFields();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AnonymousClassImpl
