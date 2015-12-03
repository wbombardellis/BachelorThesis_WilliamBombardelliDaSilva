/**
 */
package de.silvawb.java.members.impl;

import de.silvawb.java.members.*;

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
public class MembersFactoryImpl extends EFactoryImpl implements MembersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MembersFactory init() {
		try {
			MembersFactory theMembersFactory = (MembersFactory)EPackage.Registry.INSTANCE.getEFactory(MembersPackage.eNS_URI);
			if (theMembersFactory != null) {
				return theMembersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MembersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MembersFactoryImpl() {
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
			case MembersPackage.ADDITIONAL_FIELD: return createAdditionalField();
			case MembersPackage.CONSTRUCTOR: return createConstructor();
			case MembersPackage.EMPTY_MEMBER: return createEmptyMember();
			case MembersPackage.FIELD: return createField();
			case MembersPackage.INTERFACE_METHOD: return createInterfaceMethod();
			case MembersPackage.CLASS_METHOD: return createClassMethod();
			case MembersPackage.ENUM_CONSTANT: return createEnumConstant();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalField createAdditionalField() {
		AdditionalFieldImpl additionalField = new AdditionalFieldImpl();
		return additionalField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constructor createConstructor() {
		ConstructorImpl constructor = new ConstructorImpl();
		return constructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyMember createEmptyMember() {
		EmptyMemberImpl emptyMember = new EmptyMemberImpl();
		return emptyMember;
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
	public InterfaceMethod createInterfaceMethod() {
		InterfaceMethodImpl interfaceMethod = new InterfaceMethodImpl();
		return interfaceMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassMethod createClassMethod() {
		ClassMethodImpl classMethod = new ClassMethodImpl();
		return classMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumConstant createEnumConstant() {
		EnumConstantImpl enumConstant = new EnumConstantImpl();
		return enumConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MembersPackage getMembersPackage() {
		return (MembersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MembersPackage getPackage() {
		return MembersPackage.eINSTANCE;
	}

} //MembersFactoryImpl
