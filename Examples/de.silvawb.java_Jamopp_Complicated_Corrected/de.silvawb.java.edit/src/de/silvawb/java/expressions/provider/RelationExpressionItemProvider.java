/**
 */
package de.silvawb.java.expressions.provider;


import de.silvawb.java.annotations.AnnotationsFactory;

import de.silvawb.java.arrays.ArraysFactory;

import de.silvawb.java.expressions.ExpressionsFactory;
import de.silvawb.java.expressions.ExpressionsPackage;
import de.silvawb.java.expressions.RelationExpression;

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
 * This is the item provider adapter for a {@link de.silvawb.java.expressions.RelationExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationExpressionItemProvider extends InstanceOfExpressionChildItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationExpressionItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN);
			childrenFeatures.add(ExpressionsPackage.Literals.RELATION_EXPRESSION__RELATION_OPERATORS);
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
	 * This returns RelationExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RelationExpression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_RelationExpression_type");
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

		switch (notification.getFeatureID(RelationExpression.class)) {
			case ExpressionsPackage.RELATION_EXPRESSION__CHILDREN:
			case ExpressionsPackage.RELATION_EXPRESSION__RELATION_OPERATORS:
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
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 ExpressionsFactory.eINSTANCE.createShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 ExpressionsFactory.eINSTANCE.createAdditiveExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 ExpressionsFactory.eINSTANCE.createMultiplicativeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 ExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 ExpressionsFactory.eINSTANCE.createPrefixUnaryModificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 ExpressionsFactory.eINSTANCE.createSuffixUnaryModificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 ExpressionsFactory.eINSTANCE.createCastExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 ExpressionsFactory.eINSTANCE.createNestedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 AnnotationsFactory.eINSTANCE.createAnnotationInstance()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 ArraysFactory.eINSTANCE.createArrayInstantiationBySize()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 ArraysFactory.eINSTANCE.createArrayInstantiationByValuesUntyped()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 ArraysFactory.eINSTANCE.createArrayInstantiationByValuesTyped()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 InstantiationsFactory.eINSTANCE.createNewConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 InstantiationsFactory.eINSTANCE.createExplicitConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 LiteralsFactory.eINSTANCE.createCharacterLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 LiteralsFactory.eINSTANCE.createDecimalFloatLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 LiteralsFactory.eINSTANCE.createHexFloatLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 LiteralsFactory.eINSTANCE.createDecimalDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 LiteralsFactory.eINSTANCE.createHexDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 LiteralsFactory.eINSTANCE.createDecimalIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 LiteralsFactory.eINSTANCE.createHexIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 LiteralsFactory.eINSTANCE.createOctalIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 LiteralsFactory.eINSTANCE.createDecimalLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 LiteralsFactory.eINSTANCE.createHexLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 LiteralsFactory.eINSTANCE.createOctalLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 LiteralsFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 ReferencesFactory.eINSTANCE.createIdentifierReference()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 ReferencesFactory.eINSTANCE.createMethodCall()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 ReferencesFactory.eINSTANCE.createReflectiveClassReference()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 ReferencesFactory.eINSTANCE.createPrimitiveTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 ReferencesFactory.eINSTANCE.createStringReference()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__CHILDREN,
				 ReferencesFactory.eINSTANCE.createSelfReference()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__RELATION_OPERATORS,
				 OperatorsFactory.eINSTANCE.createGreaterThan()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__RELATION_OPERATORS,
				 OperatorsFactory.eINSTANCE.createGreaterThanOrEqual()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__RELATION_OPERATORS,
				 OperatorsFactory.eINSTANCE.createLessThan()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.RELATION_EXPRESSION__RELATION_OPERATORS,
				 OperatorsFactory.eINSTANCE.createLessThanOrEqual()));
	}

}
