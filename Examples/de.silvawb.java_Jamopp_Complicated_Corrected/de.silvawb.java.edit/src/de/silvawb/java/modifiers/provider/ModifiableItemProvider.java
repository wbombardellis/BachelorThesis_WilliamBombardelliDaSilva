/**
 */
package de.silvawb.java.modifiers.provider;


import de.silvawb.java.annotations.provider.JavaEditPlugin;

import de.silvawb.java.commons.provider.CommentableItemProvider;

import de.silvawb.java.modifiers.Modifiable;
import de.silvawb.java.modifiers.ModifiersFactory;
import de.silvawb.java.modifiers.ModifiersPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.silvawb.java.modifiers.Modifiable} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModifiableItemProvider extends CommentableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifiableItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ModifiersPackage.Literals.MODIFIABLE__MODIFIERS);
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
		return getString("_UI_Modifiable_type");
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

		switch (notification.getFeatureID(Modifiable.class)) {
			case ModifiersPackage.MODIFIABLE__MODIFIERS:
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
				(ModifiersPackage.Literals.MODIFIABLE__MODIFIERS,
				 ModifiersFactory.eINSTANCE.createAbstract()));

		newChildDescriptors.add
			(createChildParameter
				(ModifiersPackage.Literals.MODIFIABLE__MODIFIERS,
				 ModifiersFactory.eINSTANCE.createFinal()));

		newChildDescriptors.add
			(createChildParameter
				(ModifiersPackage.Literals.MODIFIABLE__MODIFIERS,
				 ModifiersFactory.eINSTANCE.createNative()));

		newChildDescriptors.add
			(createChildParameter
				(ModifiersPackage.Literals.MODIFIABLE__MODIFIERS,
				 ModifiersFactory.eINSTANCE.createProtected()));

		newChildDescriptors.add
			(createChildParameter
				(ModifiersPackage.Literals.MODIFIABLE__MODIFIERS,
				 ModifiersFactory.eINSTANCE.createPublic()));

		newChildDescriptors.add
			(createChildParameter
				(ModifiersPackage.Literals.MODIFIABLE__MODIFIERS,
				 ModifiersFactory.eINSTANCE.createPrivate()));

		newChildDescriptors.add
			(createChildParameter
				(ModifiersPackage.Literals.MODIFIABLE__MODIFIERS,
				 ModifiersFactory.eINSTANCE.createStatic()));

		newChildDescriptors.add
			(createChildParameter
				(ModifiersPackage.Literals.MODIFIABLE__MODIFIERS,
				 ModifiersFactory.eINSTANCE.createStrictfp()));

		newChildDescriptors.add
			(createChildParameter
				(ModifiersPackage.Literals.MODIFIABLE__MODIFIERS,
				 ModifiersFactory.eINSTANCE.createSynchronized()));

		newChildDescriptors.add
			(createChildParameter
				(ModifiersPackage.Literals.MODIFIABLE__MODIFIERS,
				 ModifiersFactory.eINSTANCE.createTransient()));

		newChildDescriptors.add
			(createChildParameter
				(ModifiersPackage.Literals.MODIFIABLE__MODIFIERS,
				 ModifiersFactory.eINSTANCE.createVolatile()));
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
