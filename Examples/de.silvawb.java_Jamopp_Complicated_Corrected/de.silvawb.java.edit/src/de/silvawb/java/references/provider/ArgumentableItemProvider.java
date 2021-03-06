/**
 */
package de.silvawb.java.references.provider;


import de.silvawb.java.annotations.AnnotationsFactory;

import de.silvawb.java.annotations.provider.JavaEditPlugin;

import de.silvawb.java.arrays.ArraysFactory;

import de.silvawb.java.commons.provider.CommentableItemProvider;

import de.silvawb.java.expressions.ExpressionsFactory;

import de.silvawb.java.instantiations.InstantiationsFactory;

import de.silvawb.java.literals.LiteralsFactory;

import de.silvawb.java.references.Argumentable;
import de.silvawb.java.references.ReferencesFactory;
import de.silvawb.java.references.ReferencesPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.silvawb.java.references.Argumentable} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentableItemProvider extends CommentableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentableItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Argumentable_type");
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

		switch (notification.getFeatureID(Argumentable.class)) {
			case ReferencesPackage.ARGUMENTABLE__ARGUMENTS:
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
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ReferencesFactory.eINSTANCE.createIdentifierReference()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ReferencesFactory.eINSTANCE.createMethodCall()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ReferencesFactory.eINSTANCE.createReflectiveClassReference()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ReferencesFactory.eINSTANCE.createPrimitiveTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ReferencesFactory.eINSTANCE.createStringReference()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ReferencesFactory.eINSTANCE.createSelfReference()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 AnnotationsFactory.eINSTANCE.createAnnotationInstance()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ArraysFactory.eINSTANCE.createArrayInstantiationBySize()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ArraysFactory.eINSTANCE.createArrayInstantiationByValuesUntyped()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ArraysFactory.eINSTANCE.createArrayInstantiationByValuesTyped()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createConditionalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createConditionalOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createConditionalAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createInclusiveOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createExclusiveOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createEqualityExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createInstanceOfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createRelationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createAdditiveExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createMultiplicativeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createPrefixUnaryModificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createSuffixUnaryModificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createCastExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 ExpressionsFactory.eINSTANCE.createNestedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 InstantiationsFactory.eINSTANCE.createNewConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 InstantiationsFactory.eINSTANCE.createExplicitConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 LiteralsFactory.eINSTANCE.createCharacterLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 LiteralsFactory.eINSTANCE.createDecimalFloatLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 LiteralsFactory.eINSTANCE.createHexFloatLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 LiteralsFactory.eINSTANCE.createDecimalDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 LiteralsFactory.eINSTANCE.createHexDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 LiteralsFactory.eINSTANCE.createDecimalIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 LiteralsFactory.eINSTANCE.createHexIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 LiteralsFactory.eINSTANCE.createOctalIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 LiteralsFactory.eINSTANCE.createDecimalLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 LiteralsFactory.eINSTANCE.createHexLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 LiteralsFactory.eINSTANCE.createOctalLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ReferencesPackage.Literals.ARGUMENTABLE__ARGUMENTS,
				 LiteralsFactory.eINSTANCE.createNullLiteral()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return JavaEditPlugin.INSTANCE;
	}

}
