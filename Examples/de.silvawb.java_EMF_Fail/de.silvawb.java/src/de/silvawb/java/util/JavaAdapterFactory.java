/**
 */
package de.silvawb.java.util;

import de.silvawb.java.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.silvawb.java.JavaPackage
 * @generated
 */
public class JavaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JavaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JavaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaSwitch<Adapter> modelSwitch =
		new JavaSwitch<Adapter>() {
			@Override
			public Adapter caseJClass(JClass object) {
				return createJClassAdapter();
			}
			@Override
			public Adapter caseJCompilationUnit(JCompilationUnit object) {
				return createJCompilationUnitAdapter();
			}
			@Override
			public Adapter caseJField(JField object) {
				return createJFieldAdapter();
			}
			@Override
			public Adapter caseJInitializer(JInitializer object) {
				return createJInitializerAdapter();
			}
			@Override
			public Adapter caseJMember(JMember object) {
				return createJMemberAdapter();
			}
			@Override
			public Adapter caseJMethod(JMethod object) {
				return createJMethodAdapter();
			}
			@Override
			public Adapter caseJModelElement(JModelElement object) {
				return createJModelElementAdapter();
			}
			@Override
			public Adapter caseJPackage(JPackage object) {
				return createJPackageAdapter();
			}
			@Override
			public Adapter caseJParameter(JParameter object) {
				return createJParameterAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.JClass <em>JClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.JClass
	 * @generated
	 */
	public Adapter createJClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.JCompilationUnit <em>JCompilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.JCompilationUnit
	 * @generated
	 */
	public Adapter createJCompilationUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.JField <em>JField</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.JField
	 * @generated
	 */
	public Adapter createJFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.JInitializer <em>JInitializer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.JInitializer
	 * @generated
	 */
	public Adapter createJInitializerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.JMember <em>JMember</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.JMember
	 * @generated
	 */
	public Adapter createJMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.JMethod <em>JMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.JMethod
	 * @generated
	 */
	public Adapter createJMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.JModelElement <em>JModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.JModelElement
	 * @generated
	 */
	public Adapter createJModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.JPackage <em>JPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.JPackage
	 * @generated
	 */
	public Adapter createJPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.java.JParameter <em>JParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.java.JParameter
	 * @generated
	 */
	public Adapter createJParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //JavaAdapterFactory
