/**
 */
package de.silvawb.java.statements.provider;


import de.silvawb.java.annotations.AnnotationsFactory;

import de.silvawb.java.arrays.ArraysFactory;

import de.silvawb.java.expressions.ExpressionsFactory;

import de.silvawb.java.instantiations.InstantiationsFactory;

import de.silvawb.java.literals.LiteralsFactory;

import de.silvawb.java.references.ReferencesFactory;

import de.silvawb.java.statements.StatementsPackage;
import de.silvawb.java.statements.Throw;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.silvawb.java.statements.Throw} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ThrowItemProvider extends StatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrowItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(StatementsPackage.Literals.THROW__THROWABLE);
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
	 * This returns Throw.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Throw"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Throw_type");
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

		switch (notification.getFeatureID(Throw.class)) {
			case StatementsPackage.THROW__THROWABLE:
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
				(StatementsPackage.Literals.THROW__THROWABLE,
				 AnnotationsFactory.eINSTANCE.createAnnotationInstance()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 ArraysFactory.eINSTANCE.createArrayInstantiationBySize()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 ArraysFactory.eINSTANCE.createArrayInstantiationByValuesUntyped()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 ArraysFactory.eINSTANCE.createArrayInstantiationByValuesTyped()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 ExpressionsFactory.eINSTANCE.createAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 ExpressionsFactory.eINSTANCE.createConditionalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 ExpressionsFactory.eINSTANCE.createConditionalOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 ExpressionsFactory.eINSTANCE.createConditionalAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 ExpressionsFactory.eINSTANCE.createInclusiveOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 ExpressionsFactory.eINSTANCE.createExclusiveOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 ExpressionsFactory.eINSTANCE.createAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 ExpressionsFactory.eINSTANCE.createEqualityExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 ExpressionsFactory.eINSTANCE.createInstanceOfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 ExpressionsFactory.eINSTANCE.createRelationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 ExpressionsFactory.eINSTANCE.createShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 ExpressionsFactory.eINSTANCE.createAdditiveExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 ExpressionsFactory.eINSTANCE.createMultiplicativeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 ExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 ExpressionsFactory.eINSTANCE.createPrefixUnaryModificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 ExpressionsFactory.eINSTANCE.createSuffixUnaryModificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 ExpressionsFactory.eINSTANCE.createCastExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 ExpressionsFactory.eINSTANCE.createNestedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 InstantiationsFactory.eINSTANCE.createNewConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 InstantiationsFactory.eINSTANCE.createExplicitConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 LiteralsFactory.eINSTANCE.createCharacterLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 LiteralsFactory.eINSTANCE.createDecimalFloatLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 LiteralsFactory.eINSTANCE.createHexFloatLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 LiteralsFactory.eINSTANCE.createDecimalDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 LiteralsFactory.eINSTANCE.createHexDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 LiteralsFactory.eINSTANCE.createDecimalIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 LiteralsFactory.eINSTANCE.createHexIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 LiteralsFactory.eINSTANCE.createOctalIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 LiteralsFactory.eINSTANCE.createDecimalLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 LiteralsFactory.eINSTANCE.createHexLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 LiteralsFactory.eINSTANCE.createOctalLongLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 LiteralsFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 ReferencesFactory.eINSTANCE.createIdentifierReference()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 ReferencesFactory.eINSTANCE.createMethodCall()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 ReferencesFactory.eINSTANCE.createReflectiveClassReference()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 ReferencesFactory.eINSTANCE.createPrimitiveTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 ReferencesFactory.eINSTANCE.createStringReference()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.THROW__THROWABLE,
				 ReferencesFactory.eINSTANCE.createSelfReference()));
	}

}
