/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.ClassifierReference;
import de.silvawb.java.JavaPackage;
import de.silvawb.java.Reference;
import de.silvawb.java.Type;
import de.silvawb.java.TypeReference;

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
		return JavaPackage.eINSTANCE.getTypeReference();
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JavaPackage.TYPE_REFERENCE___GET_TARGET:
				return getTarget();
			case JavaPackage.TYPE_REFERENCE___GET_BOUND_TARGET__REFERENCE:
				return getBoundTarget((Reference)arguments.get(0));
			case JavaPackage.TYPE_REFERENCE___GET_PURE_CLASSIFIER_REFERENCE:
				return getPureClassifierReference();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TypeReferenceImpl
