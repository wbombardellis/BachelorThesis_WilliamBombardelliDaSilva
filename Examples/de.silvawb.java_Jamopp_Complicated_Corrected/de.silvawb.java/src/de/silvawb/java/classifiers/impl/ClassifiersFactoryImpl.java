/**
 */
package de.silvawb.java.classifiers.impl;

import de.silvawb.java.classifiers.Annotation;
import de.silvawb.java.classifiers.AnonymousClass;
import de.silvawb.java.classifiers.ClassifiersFactory;
import de.silvawb.java.classifiers.ClassifiersPackage;
import de.silvawb.java.classifiers.Enumeration;
import de.silvawb.java.classifiers.Interface;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassifiersFactoryImpl extends EFactoryImpl implements ClassifiersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClassifiersFactory init() {
		try {
			ClassifiersFactory theClassifiersFactory = (ClassifiersFactory)EPackage.Registry.INSTANCE.getEFactory(ClassifiersPackage.eNS_URI);
			if (theClassifiersFactory != null) {
				return theClassifiersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ClassifiersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifiersFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ClassifiersPackage.CLASS: return createClass();
			case ClassifiersPackage.INTERFACE: return createInterface();
			case ClassifiersPackage.ENUMERATION: return createEnumeration();
			case ClassifiersPackage.ANNOTATION: return createAnnotation();
			case ClassifiersPackage.ANONYMOUS_CLASS: return createAnonymousClass();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.silvawb.java.classifiers.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousClass createAnonymousClass() {
		AnonymousClassImpl anonymousClass = new AnonymousClassImpl();
		return anonymousClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifiersPackage getClassifiersPackage() {
		return (ClassifiersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ClassifiersPackage getPackage() {
		return ClassifiersPackage.eINSTANCE;
	}

} //ClassifiersFactoryImpl
