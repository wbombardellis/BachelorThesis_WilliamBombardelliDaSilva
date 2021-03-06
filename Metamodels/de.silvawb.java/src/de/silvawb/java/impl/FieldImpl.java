/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.Annotable;
import de.silvawb.java.AnnotationInstance;
import de.silvawb.java.Classifier;
import de.silvawb.java.Field;
import de.silvawb.java.JavaPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.FieldImpl#getAnnotationInstances <em>Annotation Instances</em>}</li>
 *   <li>{@link de.silvawb.java.impl.FieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.silvawb.java.impl.FieldImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.silvawb.java.impl.FieldImpl#getContainingClassifier <em>Containing Classifier</em>}</li>
 *   <li>{@link de.silvawb.java.impl.FieldImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link de.silvawb.java.impl.FieldImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link de.silvawb.java.impl.FieldImpl#isIsFinal <em>Is Final</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldImpl extends ContainedImpl implements Field {
	/**
	 * The cached value of the '{@link #getAnnotationInstances() <em>Annotation Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationInstance> annotationInstances;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Classifier type;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected String default_ = DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean isStatic = IS_STATIC_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean isFinal = IS_FINAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotationInstance> getAnnotationInstances() {
		if (annotationInstances == null) {
			annotationInstances = new EObjectContainmentWithInverseEList<AnnotationInstance>(AnnotationInstance.class, this, JavaPackage.FIELD__ANNOTATION_INSTANCES, JavaPackage.ANNOTATION_INSTANCE__ANNOTABLE);
		}
		return annotationInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.FIELD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Classifier)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaPackage.FIELD__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Classifier newType) {
		Classifier oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.FIELD__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getContainingClassifier() {
		if (eContainerFeatureID() != JavaPackage.FIELD__CONTAINING_CLASSIFIER) return null;
		return (Classifier)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainingClassifier(Classifier newContainingClassifier, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainingClassifier, JavaPackage.FIELD__CONTAINING_CLASSIFIER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingClassifier(Classifier newContainingClassifier) {
		if (newContainingClassifier != eInternalContainer() || (eContainerFeatureID() != JavaPackage.FIELD__CONTAINING_CLASSIFIER && newContainingClassifier != null)) {
			if (EcoreUtil.isAncestor(this, newContainingClassifier))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainingClassifier != null)
				msgs = ((InternalEObject)newContainingClassifier).eInverseAdd(this, JavaPackage.CLASSIFIER__FIELDS, Classifier.class, msgs);
			msgs = basicSetContainingClassifier(newContainingClassifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.FIELD__CONTAINING_CLASSIFIER, newContainingClassifier, newContainingClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault) {
		String oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.FIELD__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStatic() {
		return isStatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStatic(boolean newIsStatic) {
		boolean oldIsStatic = isStatic;
		isStatic = newIsStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.FIELD__IS_STATIC, oldIsStatic, isStatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFinal() {
		return isFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFinal(boolean newIsFinal) {
		boolean oldIsFinal = isFinal;
		isFinal = newIsFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.FIELD__IS_FINAL, oldIsFinal, isFinal));
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
			case JavaPackage.FIELD__ANNOTATION_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnnotationInstances()).basicAdd(otherEnd, msgs);
			case JavaPackage.FIELD__CONTAINING_CLASSIFIER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainingClassifier((Classifier)otherEnd, msgs);
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
			case JavaPackage.FIELD__ANNOTATION_INSTANCES:
				return ((InternalEList<?>)getAnnotationInstances()).basicRemove(otherEnd, msgs);
			case JavaPackage.FIELD__CONTAINING_CLASSIFIER:
				return basicSetContainingClassifier(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case JavaPackage.FIELD__CONTAINING_CLASSIFIER:
				return eInternalContainer().eInverseRemove(this, JavaPackage.CLASSIFIER__FIELDS, Classifier.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaPackage.FIELD__ANNOTATION_INSTANCES:
				return getAnnotationInstances();
			case JavaPackage.FIELD__NAME:
				return getName();
			case JavaPackage.FIELD__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case JavaPackage.FIELD__CONTAINING_CLASSIFIER:
				return getContainingClassifier();
			case JavaPackage.FIELD__DEFAULT:
				return getDefault();
			case JavaPackage.FIELD__IS_STATIC:
				return isIsStatic();
			case JavaPackage.FIELD__IS_FINAL:
				return isIsFinal();
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
			case JavaPackage.FIELD__ANNOTATION_INSTANCES:
				getAnnotationInstances().clear();
				getAnnotationInstances().addAll((Collection<? extends AnnotationInstance>)newValue);
				return;
			case JavaPackage.FIELD__NAME:
				setName((String)newValue);
				return;
			case JavaPackage.FIELD__TYPE:
				setType((Classifier)newValue);
				return;
			case JavaPackage.FIELD__CONTAINING_CLASSIFIER:
				setContainingClassifier((Classifier)newValue);
				return;
			case JavaPackage.FIELD__DEFAULT:
				setDefault((String)newValue);
				return;
			case JavaPackage.FIELD__IS_STATIC:
				setIsStatic((Boolean)newValue);
				return;
			case JavaPackage.FIELD__IS_FINAL:
				setIsFinal((Boolean)newValue);
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
			case JavaPackage.FIELD__ANNOTATION_INSTANCES:
				getAnnotationInstances().clear();
				return;
			case JavaPackage.FIELD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JavaPackage.FIELD__TYPE:
				setType((Classifier)null);
				return;
			case JavaPackage.FIELD__CONTAINING_CLASSIFIER:
				setContainingClassifier((Classifier)null);
				return;
			case JavaPackage.FIELD__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case JavaPackage.FIELD__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case JavaPackage.FIELD__IS_FINAL:
				setIsFinal(IS_FINAL_EDEFAULT);
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
			case JavaPackage.FIELD__ANNOTATION_INSTANCES:
				return annotationInstances != null && !annotationInstances.isEmpty();
			case JavaPackage.FIELD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JavaPackage.FIELD__TYPE:
				return type != null;
			case JavaPackage.FIELD__CONTAINING_CLASSIFIER:
				return getContainingClassifier() != null;
			case JavaPackage.FIELD__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case JavaPackage.FIELD__IS_STATIC:
				return isStatic != IS_STATIC_EDEFAULT;
			case JavaPackage.FIELD__IS_FINAL:
				return isFinal != IS_FINAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Annotable.class) {
			switch (derivedFeatureID) {
				case JavaPackage.FIELD__ANNOTATION_INSTANCES: return JavaPackage.ANNOTABLE__ANNOTATION_INSTANCES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Annotable.class) {
			switch (baseFeatureID) {
				case JavaPackage.ANNOTABLE__ANNOTATION_INSTANCES: return JavaPackage.FIELD__ANNOTATION_INSTANCES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", default: ");
		result.append(default_);
		result.append(", isStatic: ");
		result.append(isStatic);
		result.append(", isFinal: ");
		result.append(isFinal);
		result.append(')');
		return result.toString();
	}

} //FieldImpl
