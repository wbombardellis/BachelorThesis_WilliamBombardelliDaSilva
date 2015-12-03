/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.ArrayTypeable;
import de.silvawb.java.Commentable;
import de.silvawb.java.JavaPackage;
import de.silvawb.java.Member;
import de.silvawb.java.Type;

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
		return JavaPackage.eINSTANCE.getType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean equalsType(final long arrayDimension, final Type otherType, final long otherArrayDimension) {
		de.silvawb.java.Type _this = this;
		//comparison for type parameters
		if (_this instanceof de.silvawb.java.TypeParameter) {
			de.silvawb.java.TypeParameter typeParameter = ( de.silvawb.java.TypeParameter) _this;
			for ( de.silvawb.java.TypeReference referencedType : typeParameter.getExtendTypes()) {
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
		if (otherType instanceof de.silvawb.java.TypeParameter) {
			de.silvawb.java.TypeParameter typeParameter = ( de.silvawb.java.TypeParameter) otherType;
			for ( de.silvawb.java.TypeReference referencedType : typeParameter.getExtendTypes()) {
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
		if (_this instanceof de.silvawb.java.PrimitiveType) {
			_this = (( de.silvawb.java.PrimitiveType)_this).wrapPrimitiveType();
		}
		if (otherType instanceof de.silvawb.java.PrimitiveType) {
			otherType = (( de.silvawb.java.PrimitiveType) otherType).wrapPrimitiveType();
		}
		
		if (arrayDimension == otherArrayDimension &&
				otherType instanceof de.silvawb.java.Classifier && _this instanceof de.silvawb.java.Classifier &&
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
	public boolean isSuperType(final long arrayDimension, final Type otherType, final ArrayTypeable otherArrayType) {
		if(otherType == null) {
			return false;
		}
		
		de.silvawb.java.Type _this = this;
		
		if (_this instanceof org.emftext.language.java.util.TemporalCompositeClassifier || otherType instanceof org.emftext.language.java.util.TemporalCompositeClassifier) {
			org.eclipse.emf.common.util.EList< de.silvawb.java.Type> _thisTypeList = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.Type>();
			org.eclipse.emf.common.util.EList< de.silvawb.java.Type> otherTypeList = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.Type>();
			if (_this instanceof org.emftext.language.java.util.TemporalCompositeClassifier) {
				for( org.eclipse.emf.ecore.EObject aType : (( org.emftext.language.java.util.TemporalCompositeClassifier)_this).getSuperTypes()) {
					_thisTypeList.add(( de.silvawb.java.Type)aType);
				}
			}
			else {
				_thisTypeList.add(_this);
			}
			if (otherType instanceof org.emftext.language.java.util.TemporalCompositeClassifier) {
				for( org.eclipse.emf.ecore.EObject aType : (( org.emftext.language.java.util.TemporalCompositeClassifier)otherType).getSuperTypes()) {
					otherTypeList.add(( de.silvawb.java.Type)aType);
				}
			}
			else {
				otherTypeList.add(_this);
			}
			
			
			for( de.silvawb.java.Type one_thisType : _thisTypeList) {
				for( de.silvawb.java.Type oneOtherType : otherTypeList) {
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
		de.silvawb.java.ConcreteClassifier serializableClass = ( de.silvawb.java.ConcreteClassifier) org.eclipse.emf.ecore.util.EcoreUtil.resolve(
				getConcreteClassifierProxy("java.io.Serializable"), _this);
		if (otherType.equals(serializableClass)) {
			if (_this.equals(serializableClass)) {
			 			return true;
			}
			else if (_this.equals(getStringClass())) {
			 			return true;
			}
			else if (_this instanceof de.silvawb.java.PrimitiveType) {
				return true;
			}
			else if (arrayDimension > 0) {
				//all arrays are serializable
				return true;
			}
		}
		
		//if one of us is a parameter to the best of my knowledge, we might match
		if(_this instanceof de.silvawb.java.TypeParameter) {
			return true;
		}
		if(otherType instanceof de.silvawb.java.TypeParameter ) {
			return true;
		}
		
		//if array dimensions do not match, I am no subtype
		boolean isTypeParameter = false;		
		if (otherArrayType instanceof de.silvawb.java.TypedElement) {
			de.silvawb.java.Type type = (( de.silvawb.java.TypedElement)otherArrayType).getTypeReference().getTarget();
			isTypeParameter = type instanceof de.silvawb.java.TypeParameter;
		}
		boolean isVariableLengthParameter = otherArrayType instanceof de.silvawb.java.VariableLengthParameter;
		
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
		if(_this instanceof de.silvawb.java.Annotation && 
				(otherType.equals(getAnnotationInterface()) ||
						(( de.silvawb.java.ConcreteClassifier)_this).getAllSuperClassifiers(
							).contains(getAnnotationInterface()))) {
			return true;
		}
		
		//do comparison on the classifier level
		if (_this instanceof de.silvawb.java.PrimitiveType) {
			_this = (( de.silvawb.java.PrimitiveType) _this).wrapPrimitiveType();
		}
		if (otherType instanceof de.silvawb.java.PrimitiveType) {
			otherType = (( de.silvawb.java.PrimitiveType) otherType).wrapPrimitiveType();
		}
		
		//compare in type hierarchy
		if (otherType instanceof de.silvawb.java.ConcreteClassifier && _this instanceof de.silvawb.java.ConcreteClassifier &&
				(otherType.equals(_this) || 
						(( de.silvawb.java.ConcreteClassifier)_this).getAllSuperClassifiers(
								).contains(otherType))) {
			return true;
		}
		
		if (otherType instanceof de.silvawb.java.ConcreteClassifier && _this instanceof de.silvawb.java.AnonymousClass &&
				(( de.silvawb.java.AnonymousClass)_this).getAllSuperClassifiers(
						).contains(otherType)) {
			
			return true;
		}
		
		//everything can be implicitly casted to CharSequence, so I match when the other type is a CharSequence
		de.silvawb.java.Interface charSequenceClass = getLibInterface("CharSequence");
		
		if (otherType instanceof de.silvawb.java.ConcreteClassifier) {
			if(otherType.equals(charSequenceClass) ||
					(( de.silvawb.java.ConcreteClassifier)otherType).getAllSuperClassifiers(
							).contains(charSequenceClass)) {
				return true;
			}
		}
		
		//there are some specifics for primitive types not reflected in the type hierarchy
		if (otherType instanceof de.silvawb.java.Class) {
			de.silvawb.java.PrimitiveType primitiveType = (( de.silvawb.java.Class) otherType).unWrapPrimitiveType();
			if(primitiveType == null) {
				return false;
			}
			otherType = primitiveType;
		}
		
		if (_this instanceof de.silvawb.java.Class) {
			de.silvawb.java.PrimitiveType primitiveType = (( de.silvawb.java.Class) _this).unWrapPrimitiveType();
			if(primitiveType == null) {
				return false;
			}
			_this = primitiveType;
		}
		
		if (_this instanceof de.silvawb.java.Boolean) {
			if (otherType instanceof de.silvawb.java.Boolean) {
				return true;
			}
			else {
				return false;
			}
		}
		if (_this instanceof de.silvawb.java.Byte ||
				_this instanceof de.silvawb.java.Int ||
				_this instanceof de.silvawb.java.Short ||
				_this instanceof de.silvawb.java.Long ||
				_this instanceof de.silvawb.java.Char) {
			if (otherType instanceof de.silvawb.java.Byte ||
					otherType instanceof de.silvawb.java.Int ||
					otherType instanceof de.silvawb.java.Short ||
					otherType instanceof de.silvawb.java.Long ||
					otherType instanceof de.silvawb.java.Char ||
					otherType instanceof de.silvawb.java.Float ||
					otherType instanceof de.silvawb.java.Double) {
				return true;
			}
			else {
				return false;
			}
		}
		if (_this instanceof de.silvawb.java.Float ||
				_this instanceof de.silvawb.java.Double) {
			if (otherType instanceof de.silvawb.java.Float ||
					otherType instanceof de.silvawb.java.Double) {
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
			case JavaPackage.TYPE___EQUALS_TYPE__LONG_TYPE_LONG:
				return equalsType((Long)arguments.get(0), (Type)arguments.get(1), (Long)arguments.get(2));
			case JavaPackage.TYPE___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE:
				return isSuperType((Long)arguments.get(0), (Type)arguments.get(1), (ArrayTypeable)arguments.get(2));
			case JavaPackage.TYPE___GET_ALL_MEMBERS__COMMENTABLE:
				return getAllMembers((Commentable)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TypeImpl
