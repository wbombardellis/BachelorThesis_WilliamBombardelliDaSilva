/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.Annotation;
import de.silvawb.java.AnnotationInstance;
import de.silvawb.java.AnnotationInstanceParameter;
import de.silvawb.java.AnnotationInstanceValue;
import de.silvawb.java.Argument;
import de.silvawb.java.AssertStatement;
import de.silvawb.java.Field;
import de.silvawb.java.GETExpression;
import de.silvawb.java.Generalization;
import de.silvawb.java.GenericBinding;
import de.silvawb.java.Import;
import de.silvawb.java.Interface;
import de.silvawb.java.InterfaceImplementation;
import de.silvawb.java.JavaFactory;
import de.silvawb.java.JavaPackage;

import de.silvawb.java.Method;
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
public class JavaFactoryImpl extends EFactoryImpl implements JavaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JavaFactory init() {
		try {
			JavaFactory theJavaFactory = (JavaFactory)EPackage.Registry.INSTANCE.getEFactory(JavaPackage.eNS_URI);
			if (theJavaFactory != null) {
				return theJavaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JavaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaFactoryImpl() {
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
			case JavaPackage.SYSTEM: return createSystem();
			case JavaPackage.PACKAGE: return createPackage();
			case JavaPackage.CLASS: return createClass();
			case JavaPackage.INTERFACE_IMPLEMENTATION: return createInterfaceImplementation();
			case JavaPackage.GENERALIZATION: return createGeneralization();
			case JavaPackage.FIELD: return createField();
			case JavaPackage.IMPORT: return createImport();
			case JavaPackage.METHOD: return createMethod();
			case JavaPackage.ASSERT_STATEMENT: return createAssertStatement();
			case JavaPackage.GET_EXPRESSION: return createGETExpression();
			case JavaPackage.ARGUMENT: return createArgument();
			case JavaPackage.INTERFACE: return createInterface();
			case JavaPackage.GENERIC_BINDING: return createGenericBinding();
			case JavaPackage.ANNOTATION: return createAnnotation();
			case JavaPackage.ANNOTATION_INSTANCE: return createAnnotationInstance();
			case JavaPackage.ANNOTATION_INSTANCE_PARAMETER: return createAnnotationInstanceParameter();
			case JavaPackage.ANNOTATION_INSTANCE_VALUE: return createAnnotationInstanceValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.silvawb.java.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.silvawb.java.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.silvawb.java.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceImplementation createInterfaceImplementation() {
		InterfaceImplementationImpl interfaceImplementation = new InterfaceImplementationImpl();
		return interfaceImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization createGeneralization() {
		GeneralizationImpl generalization = new GeneralizationImpl();
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertStatement createAssertStatement() {
		AssertStatementImpl assertStatement = new AssertStatementImpl();
		return assertStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GETExpression createGETExpression() {
		GETExpressionImpl getExpression = new GETExpressionImpl();
		return getExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument createArgument() {
		ArgumentImpl argument = new ArgumentImpl();
		return argument;
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
	public GenericBinding createGenericBinding() {
		GenericBindingImpl genericBinding = new GenericBindingImpl();
		return genericBinding;
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
	public AnnotationInstance createAnnotationInstance() {
		AnnotationInstanceImpl annotationInstance = new AnnotationInstanceImpl();
		return annotationInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationInstanceParameter createAnnotationInstanceParameter() {
		AnnotationInstanceParameterImpl annotationInstanceParameter = new AnnotationInstanceParameterImpl();
		return annotationInstanceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationInstanceValue createAnnotationInstanceValue() {
		AnnotationInstanceValueImpl annotationInstanceValue = new AnnotationInstanceValueImpl();
		return annotationInstanceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaPackage getJavaPackage() {
		return (JavaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JavaPackage getPackage() {
		return JavaPackage.eINSTANCE;
	}

} //JavaFactoryImpl
