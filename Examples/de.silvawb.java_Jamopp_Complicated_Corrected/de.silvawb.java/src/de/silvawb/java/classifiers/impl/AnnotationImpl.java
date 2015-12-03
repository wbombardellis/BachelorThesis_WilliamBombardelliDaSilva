/**
 */
package de.silvawb.java.classifiers.impl;

import de.silvawb.java.classifiers.Annotation;
import de.silvawb.java.classifiers.Classifier;
import de.silvawb.java.classifiers.ClassifiersPackage;
import de.silvawb.java.classifiers.ConcreteClassifier;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AnnotationImpl extends ConcreteClassifierImpl implements Annotation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassifiersPackage.Literals.ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcreteClassifier> getAllSuperClassifiers() {
		org.eclipse.emf.common.util.EList< de.silvawb.java.classifiers.ConcreteClassifier> result = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.classifiers.ConcreteClassifier>();
		result.add(getAnnotationInterface());
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Classifier.class) {
			switch (baseOperationID) {
				case ClassifiersPackage.CLASSIFIER___GET_ALL_SUPER_CLASSIFIERS: return ClassifiersPackage.ANNOTATION___GET_ALL_SUPER_CLASSIFIERS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case ClassifiersPackage.ANNOTATION___GET_ALL_SUPER_CLASSIFIERS:
				return getAllSuperClassifiers();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AnnotationImpl
