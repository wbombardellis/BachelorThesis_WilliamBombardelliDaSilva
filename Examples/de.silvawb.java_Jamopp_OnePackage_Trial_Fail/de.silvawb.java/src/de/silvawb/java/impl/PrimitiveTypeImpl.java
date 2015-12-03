/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.ClassifierReference;
import de.silvawb.java.Commentable;
import de.silvawb.java.JavaPackage;
import de.silvawb.java.Member;
import de.silvawb.java.PrimitiveType;
import de.silvawb.java.Reference;
import de.silvawb.java.Type;
import de.silvawb.java.TypeReference;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class PrimitiveTypeImpl extends TypeImpl implements PrimitiveType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getPrimitiveType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Member> getAllMembers(final Commentable context) {
		de.silvawb.java.Class javaClass = wrapPrimitiveType();	
		return javaClass.getAllMembers(context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.silvawb.java.Class wrapPrimitiveType() {
		de.silvawb.java.Class javaClass = null;
		
		if (this instanceof de.silvawb.java.Boolean) {
			javaClass = getLibClass("Boolean");
		}
		if (this instanceof de.silvawb.java.Byte) {
			javaClass = getLibClass("Byte");
		}
		if (this instanceof de.silvawb.java.Char) {
			javaClass = getLibClass("Character");
		}
		if (this instanceof de.silvawb.java.Double) {
			javaClass = getLibClass("Double");
		}
		if (this instanceof de.silvawb.java.Float) {
			javaClass = getLibClass("Float");
		}
		if (this instanceof de.silvawb.java.Int) {
			javaClass = getLibClass("Integer");
		}
		if (this instanceof de.silvawb.java.Long) {
			javaClass = getLibClass("Long");
		}
		if (this instanceof de.silvawb.java.Short) {
			javaClass = getLibClass("Short");
		}
		if (this instanceof de.silvawb.java.Void) {
			javaClass = getLibClass("Void");
		}
		return javaClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getTarget() {
		return getBoundTarget(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getBoundTarget(final Reference reference) {
		de.silvawb.java.Type type = null;
		if (this instanceof de.silvawb.java.ClassifierReference || 
				this instanceof de.silvawb.java.NamespaceClassifierReference) {
			de.silvawb.java.ClassifierReference classifierRef = getPureClassifierReference();
			if (classifierRef != null) {
				type = classifierRef.getTarget();
			}
			
			if (reference instanceof de.silvawb.java.MethodCall) {
				de.silvawb.java.MethodCall potentialCloneCall = ( de.silvawb.java.MethodCall) reference;
				//clone returns the type of the cloned in the case of arrays
				de.silvawb.java.ReferenceableElement potentialCloneCallTarget = potentialCloneCall.getTarget();
				if (potentialCloneCallTarget != null && 
						!potentialCloneCallTarget.eIsProxy() && 
						"clone".equals(potentialCloneCallTarget.getName()))  {
					if (potentialCloneCall.getPrevious() instanceof de.silvawb.java.ElementReference) {
						de.silvawb.java.ElementReference prevRef = ( de.silvawb.java.ElementReference) potentialCloneCall.getPrevious();
						if (prevRef.getTarget() instanceof de.silvawb.java.ArrayTypeable && 
								(( de.silvawb.java.ArrayTypeable)prevRef.getTarget()).getArrayDimension() > 0) {
							type = prevRef.getReferencedType();
						}
					}
				}
			}
		}
		
		else if(this instanceof de.silvawb.java.PrimitiveType) {
			return ( de.silvawb.java.PrimitiveType) this;
		}
		
		//resolve parameter to real type
		if (type instanceof de.silvawb.java.TypeParameter) {
			type = (( de.silvawb.java.TypeParameter) type).getBoundType(this, reference);
		}
		
		if (type != null && type.eIsProxy()) {
			//this may happen, when e.g. a super type is resolved. It is ok.
			return null;
		}
		
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierReference getPureClassifierReference() {
		de.silvawb.java.ClassifierReference classifierReference = null;
		if (this instanceof de.silvawb.java.ClassifierReference) {
			classifierReference = ( de.silvawb.java.ClassifierReference) this;
		}
		if (this instanceof de.silvawb.java.NamespaceClassifierReference) {
			de.silvawb.java.NamespaceClassifierReference nsClassifierReference = ( de.silvawb.java.NamespaceClassifierReference) this;
			if (!nsClassifierReference.getClassifierReferences().isEmpty()) {
				int lastIndex = nsClassifierReference.getClassifierReferences().size() - 1;
				classifierReference = nsClassifierReference.getClassifierReferences().get(lastIndex);
			}
		}
		return classifierReference;
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
				case JavaPackage.TYPE___GET_ALL_MEMBERS__COMMENTABLE: return JavaPackage.PRIMITIVE_TYPE___GET_ALL_MEMBERS__COMMENTABLE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == TypeReference.class) {
			switch (baseOperationID) {
				case JavaPackage.TYPE_REFERENCE___GET_TARGET: return JavaPackage.PRIMITIVE_TYPE___GET_TARGET;
				case JavaPackage.TYPE_REFERENCE___GET_BOUND_TARGET__REFERENCE: return JavaPackage.PRIMITIVE_TYPE___GET_BOUND_TARGET__REFERENCE;
				case JavaPackage.TYPE_REFERENCE___GET_PURE_CLASSIFIER_REFERENCE: return JavaPackage.PRIMITIVE_TYPE___GET_PURE_CLASSIFIER_REFERENCE;
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
			case JavaPackage.PRIMITIVE_TYPE___GET_ALL_MEMBERS__COMMENTABLE:
				return getAllMembers((Commentable)arguments.get(0));
			case JavaPackage.PRIMITIVE_TYPE___WRAP_PRIMITIVE_TYPE:
				return wrapPrimitiveType();
			case JavaPackage.PRIMITIVE_TYPE___GET_TARGET:
				return getTarget();
			case JavaPackage.PRIMITIVE_TYPE___GET_BOUND_TARGET__REFERENCE:
				return getBoundTarget((Reference)arguments.get(0));
			case JavaPackage.PRIMITIVE_TYPE___GET_PURE_CLASSIFIER_REFERENCE:
				return getPureClassifierReference();
		}
		return super.eInvoke(operationID, arguments);
	}

} //PrimitiveTypeImpl
