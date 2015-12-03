/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.ConcreteClassifier;
import de.silvawb.java.Field;
import de.silvawb.java.JavaPackage;
import de.silvawb.java.Member;
import de.silvawb.java.MemberContainer;
import de.silvawb.java.Method;

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
 * An implementation of the model object '<em><b>Member Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.MemberContainerImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link de.silvawb.java.impl.MemberContainerImpl#getDefaultMembers <em>Default Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MemberContainerImpl extends CommentableImpl implements MemberContainer {
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
	protected MemberContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getMemberContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Member> getMembers() {
		if (members == null) {
			members = new EObjectContainmentEList<Member>(Member.class, this, JavaPackage.MEMBER_CONTAINER__MEMBERS);
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
			defaultMembers = new EObjectContainmentEList<Member>(Member.class, this, JavaPackage.MEMBER_CONTAINER__DEFAULT_MEMBERS);
		}
		return defaultMembers;
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
			case JavaPackage.MEMBER_CONTAINER__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
			case JavaPackage.MEMBER_CONTAINER__DEFAULT_MEMBERS:
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
			case JavaPackage.MEMBER_CONTAINER__MEMBERS:
				return getMembers();
			case JavaPackage.MEMBER_CONTAINER__DEFAULT_MEMBERS:
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
			case JavaPackage.MEMBER_CONTAINER__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends Member>)newValue);
				return;
			case JavaPackage.MEMBER_CONTAINER__DEFAULT_MEMBERS:
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
			case JavaPackage.MEMBER_CONTAINER__MEMBERS:
				getMembers().clear();
				return;
			case JavaPackage.MEMBER_CONTAINER__DEFAULT_MEMBERS:
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
			case JavaPackage.MEMBER_CONTAINER__MEMBERS:
				return members != null && !members.isEmpty();
			case JavaPackage.MEMBER_CONTAINER__DEFAULT_MEMBERS:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JavaPackage.MEMBER_CONTAINER___GET_CONTAINED_CLASSIFIER__STRING:
				return getContainedClassifier((String)arguments.get(0));
			case JavaPackage.MEMBER_CONTAINER___GET_CONTAINED_FIELD__STRING:
				return getContainedField((String)arguments.get(0));
			case JavaPackage.MEMBER_CONTAINER___GET_CONTAINED_METHOD__STRING:
				return getContainedMethod((String)arguments.get(0));
			case JavaPackage.MEMBER_CONTAINER___GET_METHODS:
				return getMethods();
			case JavaPackage.MEMBER_CONTAINER___REMOVE_METHODS__STRING:
				removeMethods((String)arguments.get(0));
				return null;
			case JavaPackage.MEMBER_CONTAINER___GET_MEMBERS_BY_NAME__STRING:
				return getMembersByName((String)arguments.get(0));
			case JavaPackage.MEMBER_CONTAINER___CREATE_FIELD__STRING_STRING:
				return createField((String)arguments.get(0), (String)arguments.get(1));
			case JavaPackage.MEMBER_CONTAINER___GET_FIELDS:
				return getFields();
		}
		return super.eInvoke(operationID, arguments);
	}

} //MemberContainerImpl
