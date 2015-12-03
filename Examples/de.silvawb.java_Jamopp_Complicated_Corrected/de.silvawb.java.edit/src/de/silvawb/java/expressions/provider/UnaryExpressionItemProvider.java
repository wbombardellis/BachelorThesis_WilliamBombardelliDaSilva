/**
 */
package de.silvawb.java.expressions.provider;


import de.silvawb.java.annotations.AnnotationsFactory;

import de.silvawb.java.arrays.ArraysFactory;

import de.silvawb.java.expressions.ExpressionsFactory;
import de.silvawb.java.expressions.ExpressionsPackage;
import de.silvawb.java.expressions.UnaryExpression;

import de.silvawb.java.instantiations.InstantiationsFactory;

import de.silvawb.java.literals.LiteralsFactory;

import de.silvawb.java.operators.OperatorsFactory;

import de.silvawb.java.references.ReferencesFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.silvawb.java.expressions.UnaryExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnaryExpressionItemProvider extends MultiplicativeExpressionChildItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryExpressionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ExpressionsPackage.Literals.UNARY_EXPRESSION__OPERATORS);
			childrenFeatures.add(ExpressionsPackage.Literals.UNARY_EXPRESSION__CHILD);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns UnaryExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UnaryExpression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_UnaryExpression_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(UnaryExpression.class)) {
			case ExpressionsPackage.UNARY_EXPRESSION__OPERATORS:
			case ExpressionsPackage.UNARY_EXPRESSION__CHILD:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__OPERATORS,
				 OperatorsFactory.eINSTANCE.createAddition()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__OPERATORS,
				 OperatorsFactory.eINSTANCE.createSubtraction()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__OPERATORS,
				 OperatorsFactory.eINSTANCE.createComplement()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__OPERATORS,
				 OperatorsFactory.eINSTANCE.createNegate()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__CHILD,
				 ExpressionsFactory.eINSTANCE.createPrefixUnaryModificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__CHILD,
				 ExpressionsFactory.eINSTANCE.createSuffixUnaryModificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__CHILD,
				 ExpressionsFactory.eINSTANCE.createCastExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__CHILD,
				 ExpressionsFactory.eINSTANCE.createNestedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__CHILD,
				 AnnotationsFactory.eINSTANCE.createAnnotationInstance()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__CHILD,
				 ArraysFactory.eINSTANCE.createArrayInstantiationBySize()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__CHILD,
				 ArraysFactory.eINSTANCE.createArrayInstantiationByValuesUntyped()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__CHILD,
				 ArraysFactory.eINSTANCE.createArrayInstantiationByValuesTyped()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__CHILD,
				 InstantiationsFactory.eINSTANCE.createNewConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__CHILD,
				 InstantiationsFactory.eINSTANCE.createExplicitConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__CHILD,
				 LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__CHILD,
				 LiteralsFactory.eINSTANCE.createCharacterLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__CHILD,
				 LiteralsFactory.eINSTANCE.createDecimalFloatLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__CHILD,
				 LiteralsFactory.eINSTANCE.createHexFloatLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__CHILD,
				 LiteralsFactory.eINSTANCE.createDecimalDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__CHILD,
				 LiteralsFactory.eINSTANCE.createHexDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__CHILD,
				 LiteralsFactory.eINSTANCE.createDecimalIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__CHILD,
				 LiteralsFactory.eINSTANCE.createHexIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__CHILD,
				 LiteralsFactory.eINSTANCE.createOctalIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__CHILD,
				 LiteralsFactory.eINSTANCE.createDecimalLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__CHILD,
				 LiteralsFactory.eINSTANCE.createHexLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__CHILD,
				 LiteralsFactory.eINSTANCE.createOctalLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__CHILD,
				 LiteralsFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__CHILD,
				 ReferencesFactory.eINSTANCE.createIdentifierReference()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__CHILD,
				 ReferencesFactory.eINSTANCE.createMethodCall()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__CHILD,
				 ReferencesFactory.eINSTANCE.createReflectiveClassReference()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__CHILD,
				 ReferencesFactory.eINSTANCE.createPrimitiveTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__CHILD,
				 ReferencesFactory.eINSTANCE.createStringReference()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.UNARY_EXPRESSION__CHILD,
				 ReferencesFactory.eINSTANCE.createSelfReference()));
	}

}
