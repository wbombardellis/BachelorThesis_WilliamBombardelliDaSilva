/**
 */
package de.silvawb.java.references.impl;

import de.silvawb.java.commons.impl.NamedElementImpl;

import de.silvawb.java.references.ReferenceableElement;
import de.silvawb.java.references.ReferencesPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referenceable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ReferenceableElementImpl extends NamedElementImpl implements ReferenceableElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReferencesPackage.Literals.REFERENCEABLE_ELEMENT;
	}

} //ReferenceableElementImpl
