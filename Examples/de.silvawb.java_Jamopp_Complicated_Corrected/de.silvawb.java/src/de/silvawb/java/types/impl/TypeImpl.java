/**
 */
package de.silvawb.java.types.impl;

import de.silvawb.java.arrays.ArrayTypeable;

import de.silvawb.java.commons.Commentable;

import de.silvawb.java.commons.impl.CommentableImpl;

import de.silvawb.java.members.Member;

import de.silvawb.java.types.Type;
import de.silvawb.java.types.TypesPackage;

import java.lang.Long;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TypeImpl extends CommentableImpl implements Type {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean equalsType(final long arrayDimension, Type otherType, final long otherArrayDimension) {
		de.silvawb.java.types.Type _this = this;
		//comparison for type parameters
		if (_this instanceof de.silvawb.java.generics.TypeParameter) {
			de.silvawb.java.generics.TypeParameter typeParameter = ( de.silvawb.java.generics.TypeParameter) _this;
			for ( de.silvawb.java.types.TypeReference referencedType : typeParameter.getExtendTypes()) {
				if (referencedType.getTarget() != null && !referencedType.getTarget().eIsProxy() && referencedType.getTarget().equalsType(arrayDimension, otherType, otherArrayDimension)) {
					return true;
				}
			}
			if (typeParameter.getExtendTypes().isEmpty()) {
				if (getObjectClass().equalsType(arrayDimension, otherType, otherArrayDimension)) {
					return true;
				}
			}
		} 
		if (otherType instanceof de.silvawb.java.generics.TypeParameter) {
			de.silvawb.java.generics.TypeParameter typeParameter = ( de.silvawb.java.generics.TypeParameter) otherType;
			for ( de.silvawb.java.types.TypeReference referencedType : typeParameter.getExtendTypes()) {
				if (referencedType.getTarget() != null && !referencedType.getTarget().eIsProxy() && equalsType(arrayDimension, referencedType.getTarget(), otherArrayDimension)) {
					return true;
				}
			}
			if (typeParameter.getExtendTypes().isEmpty()) {
				if (equalsType(arrayDimension, getObjectClass(), otherArrayDimension)) {
					return true;
				}
			}
		}
		
		//do comparison on the classifier level
		if (_this instanceof de.silvawb.java.types.PrimitiveType) {
			_this = (( de.silvawb.java.types.PrimitiveType)_this).wrapPrimitiveType();
		}
		if (otherType instanceof de.silvawb.java.types.PrimitiveType) {
			otherType = (( de.silvawb.java.types.PrimitiveType) otherType).wrapPrimitiveType();
		}
		
		if (arrayDimension == otherArrayDimension &&
				otherType instanceof de.silvawb.java.classifiers.Classifier && _this instanceof de.silvawb.java.classifiers.Classifier &&
				(otherType.equals(_this))) {	
			return true;
		}
		
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSuperType(final long arrayDimension, Type otherType, final ArrayTypeable otherArrayType) {
		if(otherType == null) {
			return false;
		}
		
		de.silvawb.java.types.Type _this = this;
		
		if (_this instanceof org.emftext.language.java.util.TemporalCompositeClassifier || otherType instanceof org.emftext.language.java.util.TemporalCompositeClassifier) {
			org.eclipse.emf.common.util.EList< de.silvawb.java.types.Type> _thisTypeList = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.types.Type>();
			org.eclipse.emf.common.util.EList< de.silvawb.java.types.Type> otherTypeList = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.types.Type>();
			if (_this instanceof org.emftext.language.java.util.TemporalCompositeClassifier) {
				for( org.eclipse.emf.ecore.EObject aType : (( org.emftext.language.java.util.TemporalCompositeClassifier)_this).getSuperTypes()) {
					_thisTypeList.add(( de.silvawb.java.types.Type)aType);
				}
			}
			else {
				_thisTypeList.add(_this);
			}
			if (otherType instanceof org.emftext.language.java.util.TemporalCompositeClassifier) {
				for( org.eclipse.emf.ecore.EObject aType : (( org.emftext.language.java.util.TemporalCompositeClassifier)otherType).getSuperTypes()) {
					otherTypeList.add(( de.silvawb.java.types.Type)aType);
				}
			}
			else {
				otherTypeList.add(_this);
			}
			
			
			for( de.silvawb.java.types.Type one_thisType : _thisTypeList) {
				for( de.silvawb.java.types.Type oneOtherType : otherTypeList) {
					boolean result = one_thisType.isSuperType(arrayDimension, oneOtherType, otherArrayType);
					if (result) {
						return true;
					}	
				}
			}
			return false;
		}
		
		//if I am a void, I am of every type
		if (_this.equals(getLibClass("Void"))) {
			return true;
		}
		
		//if the other is Object I am a subtype in any case (also array dimensions do not matter)
		if (otherType.equals(getObjectClass())) {
			return true;
		}
		
		//String, primitives, and arrays are serializable
		de.silvawb.java.classifiers.ConcreteClassifier serializableClass = ( de.silvawb.java.classifiers.ConcreteClassifier) org.eclipse.emf.ecore.util.EcoreUtil.resolve(
				getConcreteClassifierProxy("java.io.Serializable"), _this);
		if (otherType.equals(serializableClass)) {
			if (_this.equals(serializableClass)) {
			 			return true;
			}
			else if (_this.equals(getStringClass())) {
			 			return true;
			}
			else if (_this instanceof de.silvawb.java.types.PrimitiveType) {
				return true;
			}
			else if (arrayDimension > 0) {
				//all arrays are serializable
				return true;
			}
		}
		
		//if one of us is a parameter to the best of my knowledge, we might match
		if(_this instanceof de.silvawb.java.generics.TypeParameter) {
			return true;
		}
		if(otherType instanceof de.silvawb.java.generics.TypeParameter ) {
			return true;
		}
		
		//if array dimensions do not match, I am no subtype
		boolean isTypeParameter = false;		
		if (otherArrayType instanceof de.silvawb.java.types.TypedElement) {
			de.silvawb.java.types.Type type = (( de.silvawb.java.types.TypedElement)otherArrayType).getTypeReference().getTarget();
			isTypeParameter = type instanceof de.silvawb.java.generics.TypeParameter;
		}
		boolean isVariableLengthParameter = otherArrayType instanceof de.silvawb.java.parameters.VariableLengthParameter;
		
		long otherArrayDim = 0;
		if(otherArrayType != null) {
			otherArrayDim = otherArrayType.getArrayDimension();
		}
		
		if (isTypeParameter && isVariableLengthParameter) {
			if(arrayDimension != otherArrayDim && 
				arrayDimension != otherArrayDim- 1 && 
				arrayDimension < otherArrayDim) {
				
				return false;
			}
		}
		else if (isTypeParameter) {
			if(arrayDimension < otherArrayDim) {
				return false;
			}
		}
		else if (isVariableLengthParameter) {
			if(arrayDimension != otherArrayDim && arrayDimension != otherArrayDim- 1) {
				return false;
			}
		}
		else {
			if(arrayDimension != otherArrayDim) {
				return false;
			}
		}
		
		//annotations
		if(_this instanceof de.silvawb.java.classifiers.Annotation && 
				(otherType.equals(getAnnotationInterface()) ||
						(( de.silvawb.java.classifiers.ConcreteClassifier)_this).getAllSuperClassifiers(
							).contains(getAnnotationInterface()))) {
			return true;
		}
		
		//do comparison on the classifier level
		if (_this instanceof de.silvawb.java.types.PrimitiveType) {
			_this = (( de.silvawb.java.types.PrimitiveType) _this).wrapPrimitiveType();
		}
		if (otherType instanceof de.silvawb.java.types.PrimitiveType) {
			otherType = (( de.silvawb.java.types.PrimitiveType) otherType).wrapPrimitiveType();
		}
		
		//compare in type hierarchy
		if (otherType instanceof de.silvawb.java.classifiers.ConcreteClassifier && _this instanceof de.silvawb.java.classifiers.ConcreteClassifier &&
				(otherType.equals(_this) || 
						(( de.silvawb.java.classifiers.ConcreteClassifier)_this).getAllSuperClassifiers(
								).contains(otherType))) {
			return true;
		}
		
		if (otherType instanceof de.silvawb.java.classifiers.ConcreteClassifier && _this instanceof de.silvawb.java.classifiers.AnonymousClass &&
				(( de.silvawb.java.classifiers.AnonymousClass)_this).getAllSuperClassifiers(
						).contains(otherType)) {
			
			return true;
		}
		
		//everything can be implicitly casted to CharSequence, so I match when the other type is a CharSequence
		de.silvawb.java.classifiers.Interface charSequenceClass = getLibInterface("CharSequence");
		
		if (otherType instanceof de.silvawb.java.classifiers.ConcreteClassifier) {
			if(otherType.equals(charSequenceClass) ||
					(( de.silvawb.java.classifiers.ConcreteClassifier)otherType).getAllSuperClassifiers(
							).contains(charSequenceClass)) {
				return true;
			}
		}
		
		//there are some specifics for primitive types not reflected in the type hierarchy
		if (otherType instanceof de.silvawb.java.classifiers.Class) {
			de.silvawb.java.types.PrimitiveType primitiveType = (( de.silvawb.java.classifiers.Class) otherType).unWrapPrimitiveType();
			if(primitiveType == null) {
				return false;
			}
			otherType = primitiveType;
		}
		
		if (_this instanceof de.silvawb.java.classifiers.Class) {
			de.silvawb.java.types.PrimitiveType primitiveType = (( de.silvawb.java.classifiers.Class) _this).unWrapPrimitiveType();
			if(primitiveType == null) {
				return false;
			}
			_this = primitiveType;
		}
		
		if (_this instanceof de.silvawb.java.types.Boolean) {
			if (otherType instanceof de.silvawb.java.types.Boolean) {
				return true;
			}
			else {
				return false;
			}
		}
		if (_this instanceof de.silvawb.java.types.Byte ||
				_this instanceof de.silvawb.java.types.Int ||
				_this instanceof de.silvawb.java.types.Short ||
				_this instanceof de.silvawb.java.types.Long ||
				_this instanceof de.silvawb.java.types.Char) {
			if (otherType instanceof de.silvawb.java.types.Byte ||
					otherType instanceof de.silvawb.java.types.Int ||
					otherType instanceof de.silvawb.java.types.Short ||
					otherType instanceof de.silvawb.java.types.Long ||
					otherType instanceof de.silvawb.java.types.Char ||
					otherType instanceof de.silvawb.java.types.Float ||
					otherType instanceof de.silvawb.java.types.Double) {
				return true;
			}
			else {
				return false;
			}
		}
		if (_this instanceof de.silvawb.java.types.Float ||
				_this instanceof de.silvawb.java.types.Double) {
			if (otherType instanceof de.silvawb.java.types.Float ||
					otherType instanceof de.silvawb.java.types.Double) {
				return true;
			}
			else {
				return false;
			}
		}
		
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Member> getAllMembers(final Commentable context) {
		//method has to be specified in subclasses
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TypesPackage.TYPE___EQUALS_TYPE__LONG_TYPE_LONG:
				return equalsType((Long)arguments.get(0), (Type)arguments.get(1), (Long)arguments.get(2));
			case TypesPackage.TYPE___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE:
				return isSuperType((Long)arguments.get(0), (Type)arguments.get(1), (ArrayTypeable)arguments.get(2));
			case TypesPackage.TYPE___GET_ALL_MEMBERS__COMMENTABLE:
				return getAllMembers((Commentable)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TypeImpl
