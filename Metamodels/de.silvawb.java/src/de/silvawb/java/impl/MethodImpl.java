/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.Annotable;
import de.silvawb.java.AnnotationInstance;
import de.silvawb.java.Argument;
import de.silvawb.java.Classifier;
import de.silvawb.java.JavaPackage;
import de.silvawb.java.Method;

import de.silvawb.java.Statement;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.MethodImpl#getAnnotationInstances <em>Annotation Instances</em>}</li>
 *   <li>{@link de.silvawb.java.impl.MethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.silvawb.java.impl.MethodImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link de.silvawb.java.impl.MethodImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link de.silvawb.java.impl.MethodImpl#getContainingClassifier <em>Containing Classifier</em>}</li>
 *   <li>{@link de.silvawb.java.impl.MethodImpl#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link de.silvawb.java.impl.MethodImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link de.silvawb.java.impl.MethodImpl#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link de.silvawb.java.impl.MethodImpl#getRaisedExceptions <em>Raised Exceptions</em>}</li>
 *   <li>{@link de.silvawb.java.impl.MethodImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImpl extends ContainedImpl implements Method {
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
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected Classifier returnType;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> arguments;

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
	 * The default value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected static final String CONCURRENCY_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected String concurrency = CONCURRENCY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRaisedExceptions() <em>Raised Exceptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaisedExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> raisedExceptions;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotationInstance> getAnnotationInstances() {
		if (annotationInstances == null) {
			annotationInstances = new EObjectContainmentWithInverseEList<AnnotationInstance>(AnnotationInstance.class, this, JavaPackage.METHOD__ANNOTATION_INSTANCES, JavaPackage.ANNOTATION_INSTANCE__ANNOTABLE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.METHOD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getReturnType() {
		if (returnType != null && returnType.eIsProxy()) {
			InternalEObject oldReturnType = (InternalEObject)returnType;
			returnType = (Classifier)eResolveProxy(oldReturnType);
			if (returnType != oldReturnType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaPackage.METHOD__RETURN_TYPE, oldReturnType, returnType));
			}
		}
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(Classifier newReturnType) {
		Classifier oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.METHOD__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentWithInverseEList<Argument>(Argument.class, this, JavaPackage.METHOD__ARGUMENTS, JavaPackage.ARGUMENT__USING_METHOD);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getContainingClassifier() {
		if (eContainerFeatureID() != JavaPackage.METHOD__CONTAINING_CLASSIFIER) return null;
		return (Classifier)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainingClassifier(Classifier newContainingClassifier, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainingClassifier, JavaPackage.METHOD__CONTAINING_CLASSIFIER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingClassifier(Classifier newContainingClassifier) {
		if (newContainingClassifier != eInternalContainer() || (eContainerFeatureID() != JavaPackage.METHOD__CONTAINING_CLASSIFIER && newContainingClassifier != null)) {
			if (EcoreUtil.isAncestor(this, newContainingClassifier))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainingClassifier != null)
				msgs = ((InternalEObject)newContainingClassifier).eInverseAdd(this, JavaPackage.CLASSIFIER__METHODS, Classifier.class, msgs);
			msgs = basicSetContainingClassifier(newContainingClassifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.METHOD__CONTAINING_CLASSIFIER, newContainingClassifier, newContainingClassifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.METHOD__IS_FINAL, oldIsFinal, isFinal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.METHOD__IS_STATIC, oldIsStatic, isStatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getBody() {
		if (body == null) {
			body = new EObjectContainmentWithInverseEList<Statement>(Statement.class, this, JavaPackage.METHOD__BODY, JavaPackage.STATEMENT__METHOD);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConcurrency() {
		return concurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcurrency(String newConcurrency) {
		String oldConcurrency = concurrency;
		concurrency = newConcurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.METHOD__CONCURRENCY, oldConcurrency, concurrency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getRaisedExceptions() {
		if (raisedExceptions == null) {
			raisedExceptions = new EObjectResolvingEList<Classifier>(Classifier.class, this, JavaPackage.METHOD__RAISED_EXCEPTIONS);
		}
		return raisedExceptions;
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
			case JavaPackage.METHOD__ANNOTATION_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnnotationInstances()).basicAdd(otherEnd, msgs);
			case JavaPackage.METHOD__ARGUMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArguments()).basicAdd(otherEnd, msgs);
			case JavaPackage.METHOD__CONTAINING_CLASSIFIER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainingClassifier((Classifier)otherEnd, msgs);
			case JavaPackage.METHOD__BODY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBody()).basicAdd(otherEnd, msgs);
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
			case JavaPackage.METHOD__ANNOTATION_INSTANCES:
				return ((InternalEList<?>)getAnnotationInstances()).basicRemove(otherEnd, msgs);
			case JavaPackage.METHOD__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case JavaPackage.METHOD__CONTAINING_CLASSIFIER:
				return basicSetContainingClassifier(null, msgs);
			case JavaPackage.METHOD__BODY:
				return ((InternalEList<?>)getBody()).basicRemove(otherEnd, msgs);
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
			case JavaPackage.METHOD__CONTAINING_CLASSIFIER:
				return eInternalContainer().eInverseRemove(this, JavaPackage.CLASSIFIER__METHODS, Classifier.class, msgs);
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
			case JavaPackage.METHOD__ANNOTATION_INSTANCES:
				return getAnnotationInstances();
			case JavaPackage.METHOD__NAME:
				return getName();
			case JavaPackage.METHOD__RETURN_TYPE:
				if (resolve) return getReturnType();
				return basicGetReturnType();
			case JavaPackage.METHOD__ARGUMENTS:
				return getArguments();
			case JavaPackage.METHOD__CONTAINING_CLASSIFIER:
				return getContainingClassifier();
			case JavaPackage.METHOD__IS_FINAL:
				return isIsFinal();
			case JavaPackage.METHOD__IS_STATIC:
				return isIsStatic();
			case JavaPackage.METHOD__CONCURRENCY:
				return getConcurrency();
			case JavaPackage.METHOD__RAISED_EXCEPTIONS:
				return getRaisedExceptions();
			case JavaPackage.METHOD__BODY:
				return getBody();
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
			case JavaPackage.METHOD__ANNOTATION_INSTANCES:
				getAnnotationInstances().clear();
				getAnnotationInstances().addAll((Collection<? extends AnnotationInstance>)newValue);
				return;
			case JavaPackage.METHOD__NAME:
				setName((String)newValue);
				return;
			case JavaPackage.METHOD__RETURN_TYPE:
				setReturnType((Classifier)newValue);
				return;
			case JavaPackage.METHOD__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Argument>)newValue);
				return;
			case JavaPackage.METHOD__CONTAINING_CLASSIFIER:
				setContainingClassifier((Classifier)newValue);
				return;
			case JavaPackage.METHOD__IS_FINAL:
				setIsFinal((Boolean)newValue);
				return;
			case JavaPackage.METHOD__IS_STATIC:
				setIsStatic((Boolean)newValue);
				return;
			case JavaPackage.METHOD__CONCURRENCY:
				setConcurrency((String)newValue);
				return;
			case JavaPackage.METHOD__RAISED_EXCEPTIONS:
				getRaisedExceptions().clear();
				getRaisedExceptions().addAll((Collection<? extends Classifier>)newValue);
				return;
			case JavaPackage.METHOD__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends Statement>)newValue);
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
			case JavaPackage.METHOD__ANNOTATION_INSTANCES:
				getAnnotationInstances().clear();
				return;
			case JavaPackage.METHOD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JavaPackage.METHOD__RETURN_TYPE:
				setReturnType((Classifier)null);
				return;
			case JavaPackage.METHOD__ARGUMENTS:
				getArguments().clear();
				return;
			case JavaPackage.METHOD__CONTAINING_CLASSIFIER:
				setContainingClassifier((Classifier)null);
				return;
			case JavaPackage.METHOD__IS_FINAL:
				setIsFinal(IS_FINAL_EDEFAULT);
				return;
			case JavaPackage.METHOD__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case JavaPackage.METHOD__CONCURRENCY:
				setConcurrency(CONCURRENCY_EDEFAULT);
				return;
			case JavaPackage.METHOD__RAISED_EXCEPTIONS:
				getRaisedExceptions().clear();
				return;
			case JavaPackage.METHOD__BODY:
				getBody().clear();
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
			case JavaPackage.METHOD__ANNOTATION_INSTANCES:
				return annotationInstances != null && !annotationInstances.isEmpty();
			case JavaPackage.METHOD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JavaPackage.METHOD__RETURN_TYPE:
				return returnType != null;
			case JavaPackage.METHOD__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case JavaPackage.METHOD__CONTAINING_CLASSIFIER:
				return getContainingClassifier() != null;
			case JavaPackage.METHOD__IS_FINAL:
				return isFinal != IS_FINAL_EDEFAULT;
			case JavaPackage.METHOD__IS_STATIC:
				return isStatic != IS_STATIC_EDEFAULT;
			case JavaPackage.METHOD__CONCURRENCY:
				return CONCURRENCY_EDEFAULT == null ? concurrency != null : !CONCURRENCY_EDEFAULT.equals(concurrency);
			case JavaPackage.METHOD__RAISED_EXCEPTIONS:
				return raisedExceptions != null && !raisedExceptions.isEmpty();
			case JavaPackage.METHOD__BODY:
				return body != null && !body.isEmpty();
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
				case JavaPackage.METHOD__ANNOTATION_INSTANCES: return JavaPackage.ANNOTABLE__ANNOTATION_INSTANCES;
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
				case JavaPackage.ANNOTABLE__ANNOTATION_INSTANCES: return JavaPackage.METHOD__ANNOTATION_INSTANCES;
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
		result.append(", isFinal: ");
		result.append(isFinal);
		result.append(", isStatic: ");
		result.append(isStatic);
		result.append(", concurrency: ");
		result.append(concurrency);
		result.append(')');
		return result.toString();
	}

} //MethodImpl
