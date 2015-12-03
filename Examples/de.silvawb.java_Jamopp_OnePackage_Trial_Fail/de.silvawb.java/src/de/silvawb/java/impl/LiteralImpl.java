/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.Expression;
import de.silvawb.java.JavaPackage;
import de.silvawb.java.Literal;
import de.silvawb.java.Type;

import java.lang.Boolean;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class LiteralImpl extends PrimaryExpressionImpl implements Literal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getLiteral();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getOneType(final boolean alternative) {
		//Overrides implementation in Expression
		de.silvawb.java.Class javaClass = null;
		
		if (this instanceof de.silvawb.java.NullLiteral) {
			javaClass = getLibClass("Void");
		}
		else if (this instanceof de.silvawb.java.BooleanLiteral) {
			javaClass = getLibClass("Boolean");
		}
		else if (this instanceof de.silvawb.java.DoubleLiteral) {
			javaClass = getLibClass("Double");
		}
		else if (this instanceof de.silvawb.java.FloatLiteral) {
			javaClass = getLibClass("Float");
		}
		else if (this instanceof de.silvawb.java.IntegerLiteral) {
			javaClass = getLibClass("Integer");
		}
		else if (this instanceof de.silvawb.java.LongLiteral) {
			javaClass = getLibClass("Long");
		}
		else if (this instanceof de.silvawb.java.CharacterLiteral) {
			javaClass = getLibClass("Character");
		}
		
		return javaClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Expression.class) {
			switch (baseOperationID) {
				case JavaPackage.EXPRESSION___GET_ONE_TYPE__BOOLEAN: return JavaPackage.LITERAL___GET_ONE_TYPE__BOOLEAN;
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
			case JavaPackage.LITERAL___GET_ONE_TYPE__BOOLEAN:
				return getOneType((Boolean)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //LiteralImpl
