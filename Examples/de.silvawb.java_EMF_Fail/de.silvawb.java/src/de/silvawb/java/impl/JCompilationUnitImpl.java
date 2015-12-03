/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.JClass;
import de.silvawb.java.JCompilationUnit;
import de.silvawb.java.JPackage;
import de.silvawb.java.JavaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JCompilation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.JCompilationUnitImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JCompilationUnitImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JCompilationUnitImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JCompilationUnitImpl#getImportedPackages <em>Imported Packages</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JCompilationUnitImpl#getImportedTypes <em>Imported Types</em>}</li>
 *   <li>{@link de.silvawb.java.impl.JCompilationUnitImpl#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JCompilationUnitImpl extends JModelElementImpl implements JCompilationUnit {
	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<String> imports;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<JClass> types;

	/**
	 * The cached value of the '{@link #getImportedPackages() <em>Imported Packages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<JPackage> importedPackages;

	/**
	 * The cached value of the '{@link #getImportedTypes() <em>Imported Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<JClass> importedTypes;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected JPackage package_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JCompilationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.JCOMPILATION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getImports() {
		if (imports == null) {
			imports = new EDataTypeUniqueEList<String>(String.class, this, JavaPackage.JCOMPILATION_UNIT__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.JCOMPILATION_UNIT__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JClass> getTypes() {
		if (types == null) {
			types = new EObjectContainmentWithInverseEList<JClass>(JClass.class, this, JavaPackage.JCOMPILATION_UNIT__TYPES, JavaPackage.JCLASS__UNIT);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JPackage> getImportedPackages() {
		if (importedPackages == null) {
			importedPackages = new EObjectResolvingEList<JPackage>(JPackage.class, this, JavaPackage.JCOMPILATION_UNIT__IMPORTED_PACKAGES);
		}
		return importedPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JClass> getImportedTypes() {
		if (importedTypes == null) {
			importedTypes = new EObjectResolvingEList<JClass>(JClass.class, this, JavaPackage.JCOMPILATION_UNIT__IMPORTED_TYPES);
		}
		return importedTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JPackage getPackage() {
		if (package_ != null && package_.eIsProxy()) {
			InternalEObject oldPackage = (InternalEObject)package_;
			package_ = (JPackage)eResolveProxy(oldPackage);
			if (package_ != oldPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaPackage.JCOMPILATION_UNIT__PACKAGE, oldPackage, package_));
			}
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JPackage basicGetPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(JPackage newPackage) {
		JPackage oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.JCOMPILATION_UNIT__PACKAGE, oldPackage, package_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.JCOMPILATION_UNIT__TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.JCOMPILATION_UNIT__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
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
			case JavaPackage.JCOMPILATION_UNIT__IMPORTS:
				return getImports();
			case JavaPackage.JCOMPILATION_UNIT__COMMENT:
				return getComment();
			case JavaPackage.JCOMPILATION_UNIT__TYPES:
				return getTypes();
			case JavaPackage.JCOMPILATION_UNIT__IMPORTED_PACKAGES:
				return getImportedPackages();
			case JavaPackage.JCOMPILATION_UNIT__IMPORTED_TYPES:
				return getImportedTypes();
			case JavaPackage.JCOMPILATION_UNIT__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
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
			case JavaPackage.JCOMPILATION_UNIT__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends String>)newValue);
				return;
			case JavaPackage.JCOMPILATION_UNIT__COMMENT:
				setComment((String)newValue);
				return;
			case JavaPackage.JCOMPILATION_UNIT__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends JClass>)newValue);
				return;
			case JavaPackage.JCOMPILATION_UNIT__IMPORTED_PACKAGES:
				getImportedPackages().clear();
				getImportedPackages().addAll((Collection<? extends JPackage>)newValue);
				return;
			case JavaPackage.JCOMPILATION_UNIT__IMPORTED_TYPES:
				getImportedTypes().clear();
				getImportedTypes().addAll((Collection<? extends JClass>)newValue);
				return;
			case JavaPackage.JCOMPILATION_UNIT__PACKAGE:
				setPackage((JPackage)newValue);
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
			case JavaPackage.JCOMPILATION_UNIT__IMPORTS:
				getImports().clear();
				return;
			case JavaPackage.JCOMPILATION_UNIT__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case JavaPackage.JCOMPILATION_UNIT__TYPES:
				getTypes().clear();
				return;
			case JavaPackage.JCOMPILATION_UNIT__IMPORTED_PACKAGES:
				getImportedPackages().clear();
				return;
			case JavaPackage.JCOMPILATION_UNIT__IMPORTED_TYPES:
				getImportedTypes().clear();
				return;
			case JavaPackage.JCOMPILATION_UNIT__PACKAGE:
				setPackage((JPackage)null);
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
			case JavaPackage.JCOMPILATION_UNIT__IMPORTS:
				return imports != null && !imports.isEmpty();
			case JavaPackage.JCOMPILATION_UNIT__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case JavaPackage.JCOMPILATION_UNIT__TYPES:
				return types != null && !types.isEmpty();
			case JavaPackage.JCOMPILATION_UNIT__IMPORTED_PACKAGES:
				return importedPackages != null && !importedPackages.isEmpty();
			case JavaPackage.JCOMPILATION_UNIT__IMPORTED_TYPES:
				return importedTypes != null && !importedTypes.isEmpty();
			case JavaPackage.JCOMPILATION_UNIT__PACKAGE:
				return package_ != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (imports: ");
		result.append(imports);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //JCompilationUnitImpl
