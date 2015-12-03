/**
 */
package de.silvawb.java.types.impl;

import de.silvawb.java.commons.impl.CommentableImpl;

import de.silvawb.java.references.Reference;

import de.silvawb.java.types.ClassifierReference;
import de.silvawb.java.types.Type;
import de.silvawb.java.types.TypeReference;
import de.silvawb.java.types.TypesPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TypeReferenceImpl extends CommentableImpl implements TypeReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.TYPE_REFERENCE;
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
		de.silvawb.java.types.Type type = null;
		if (this instanceof de.silvawb.java.types.ClassifierReference || 
				this instanceof de.silvawb.java.types.NamespaceClassifierReference) {
			de.silvawb.java.types.ClassifierReference classifierRef = getPureClassifierReference();
			if (classifierRef != null) {
				type = classifierRef.getTarget();
			}
			
			if (reference instanceof de.silvawb.java.references.MethodCall) {
				de.silvawb.java.references.MethodCall potentialCloneCall = ( de.silvawb.java.references.MethodCall) reference;
				//clone returns the type of the cloned in the case of arrays
				de.silvawb.java.references.ReferenceableElement potentialCloneCallTarget = potentialCloneCall.getTarget();
				if (potentialCloneCallTarget != null && 
						!potentialCloneCallTarget.eIsProxy() && 
						"clone".equals(potentialCloneCallTarget.getName()))  {
					if (potentialCloneCall.getPrevious() instanceof de.silvawb.java.references.ElementReference) {
						de.silvawb.java.references.ElementReference prevRef = ( de.silvawb.java.references.ElementReference) potentialCloneCall.getPrevious();
						if (prevRef.getTarget() instanceof de.silvawb.java.arrays.ArrayTypeable && 
								(( de.silvawb.java.arrays.ArrayTypeable)prevRef.getTarget()).getArrayDimension() > 0) {
							type = prevRef.getReferencedType();
						}
					}
				}
			}
		}
		
		else if(this instanceof de.silvawb.java.types.PrimitiveType) {
			return ( de.silvawb.java.types.PrimitiveType) this;
		}
		
		//resolve parameter to real type
		if (type instanceof de.silvawb.java.generics.TypeParameter) {
			type = (( de.silvawb.java.generics.TypeParameter) type).getBoundType(this, reference);
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
		de.silvawb.java.types.ClassifierReference classifierReference = null;
		if (this instanceof de.silvawb.java.types.ClassifierReference) {
			classifierReference = ( de.silvawb.java.types.ClassifierReference) this;
		}
		if (this instanceof de.silvawb.java.types.NamespaceClassifierReference) {
			de.silvawb.java.types.NamespaceClassifierReference nsClassifierReference = ( de.silvawb.java.types.NamespaceClassifierReference) this;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TypesPackage.TYPE_REFERENCE___GET_TARGET:
				return getTarget();
			case TypesPackage.TYPE_REFERENCE___GET_BOUND_TARGET__REFERENCE:
				return getBoundTarget((Reference)arguments.get(0));
			case TypesPackage.TYPE_REFERENCE___GET_PURE_CLASSIFIER_REFERENCE:
				return getPureClassifierReference();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TypeReferenceImpl
