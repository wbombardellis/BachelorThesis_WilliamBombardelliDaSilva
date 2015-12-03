/**
 */
package de.silvawb.java.literals.impl;

import de.silvawb.java.expressions.Expression;
import de.silvawb.java.expressions.ExpressionsPackage;

import de.silvawb.java.expressions.impl.PrimaryExpressionImpl;

import de.silvawb.java.literals.Literal;
import de.silvawb.java.literals.LiteralsPackage;

import de.silvawb.java.types.Type;

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
		return LiteralsPackage.Literals.LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getOneType(final boolean alternative) {
		//Overrides implementation in Expression
		de.silvawb.java.classifiers.Class javaClass = null;
		
		if (this instanceof de.silvawb.java.literals.NullLiteral) {
			javaClass = getLibClass("Void");
		}
		else if (this instanceof de.silvawb.java.literals.BooleanLiteral) {
			javaClass = getLibClass("Boolean");
		}
		else if (this instanceof de.silvawb.java.literals.DoubleLiteral) {
			javaClass = getLibClass("Double");
		}
		else if (this instanceof de.silvawb.java.literals.FloatLiteral) {
			javaClass = getLibClass("Float");
		}
		else if (this instanceof de.silvawb.java.literals.IntegerLiteral) {
			javaClass = getLibClass("Integer");
		}
		else if (this instanceof de.silvawb.java.literals.LongLiteral) {
			javaClass = getLibClass("Long");
		}
		else if (this instanceof de.silvawb.java.literals.CharacterLiteral) {
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
				case ExpressionsPackage.EXPRESSION___GET_ONE_TYPE__BOOLEAN: return LiteralsPackage.LITERAL___GET_ONE_TYPE__BOOLEAN;
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
			case LiteralsPackage.LITERAL___GET_ONE_TYPE__BOOLEAN:
				return getOneType((Boolean)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //LiteralImpl
