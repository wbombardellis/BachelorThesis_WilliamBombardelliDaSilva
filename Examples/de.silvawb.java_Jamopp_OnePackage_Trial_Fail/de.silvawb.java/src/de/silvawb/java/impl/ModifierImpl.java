/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.JavaPackage;
import de.silvawb.java.Modifier;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ModifierImpl extends AnnotationInstanceOrModifierImpl implements Modifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getModifier();
	}

} //ModifierImpl
