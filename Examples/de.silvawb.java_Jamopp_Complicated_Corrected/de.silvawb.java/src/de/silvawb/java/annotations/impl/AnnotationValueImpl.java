/**
 */
package de.silvawb.java.annotations.impl;

import de.silvawb.java.annotations.AnnotationValue;
import de.silvawb.java.annotations.AnnotationsPackage;

import de.silvawb.java.commons.impl.CommentableImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AnnotationValueImpl extends CommentableImpl implements AnnotationValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotationsPackage.Literals.ANNOTATION_VALUE;
	}

} //AnnotationValueImpl
