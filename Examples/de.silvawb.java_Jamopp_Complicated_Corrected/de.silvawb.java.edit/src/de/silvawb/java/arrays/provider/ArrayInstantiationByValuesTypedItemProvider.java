/**
 */
package de.silvawb.java.arrays.provider;


import de.silvawb.java.arrays.ArrayInstantiationByValuesTyped;
import de.silvawb.java.arrays.ArraysFactory;
import de.silvawb.java.arrays.ArraysPackage;

import de.silvawb.java.types.TypesFactory;
import de.silvawb.java.types.TypesPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.silvawb.java.arrays.ArrayInstantiationByValuesTyped} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArrayInstantiationByValuesTypedItemProvider extends ArrayInstantiationByValuesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayInstantiationByValuesTypedItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(TypesPackage.Literals.TYPED_ELEMENT__TYPE_REFERENCE);
			childrenFeatures.add(ArraysPackage.Literals.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE);
			childrenFeatures.add(ArraysPackage.Literals.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER);
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
	 * This returns ArrayInstantiationByValuesTyped.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ArrayInstantiationByValuesTyped"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ArrayInstantiationByValuesTyped_type");
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

		switch (notification.getFeatureID(ArrayInstantiationByValuesTyped.class)) {
			case ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__TYPE_REFERENCE:
			case ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__ARRAY_DIMENSIONS_BEFORE:
			case ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__ARRAY_DIMENSIONS_AFTER:
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
				(TypesPackage.Literals.TYPED_ELEMENT__TYPE_REFERENCE,
				 TypesFactory.eINSTANCE.createClassifierReference()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.TYPED_ELEMENT__TYPE_REFERENCE,
				 TypesFactory.eINSTANCE.createNamespaceClassifierReference()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.TYPED_ELEMENT__TYPE_REFERENCE,
				 TypesFactory.eINSTANCE.createBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.TYPED_ELEMENT__TYPE_REFERENCE,
				 TypesFactory.eINSTANCE.createByte()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.TYPED_ELEMENT__TYPE_REFERENCE,
				 TypesFactory.eINSTANCE.createChar()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.TYPED_ELEMENT__TYPE_REFERENCE,
				 TypesFactory.eINSTANCE.createDouble()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.TYPED_ELEMENT__TYPE_REFERENCE,
				 TypesFactory.eINSTANCE.createFloat()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.TYPED_ELEMENT__TYPE_REFERENCE,
				 TypesFactory.eINSTANCE.createInt()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.TYPED_ELEMENT__TYPE_REFERENCE,
				 TypesFactory.eINSTANCE.createLong()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.TYPED_ELEMENT__TYPE_REFERENCE,
				 TypesFactory.eINSTANCE.createShort()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.TYPED_ELEMENT__TYPE_REFERENCE,
				 TypesFactory.eINSTANCE.createVoid()));

		newChildDescriptors.add
			(createChildParameter
				(ArraysPackage.Literals.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE,
				 ArraysFactory.eINSTANCE.createArrayDimension()));

		newChildDescriptors.add
			(createChildParameter
				(ArraysPackage.Literals.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER,
				 ArraysFactory.eINSTANCE.createArrayDimension()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ArraysPackage.Literals.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE ||
			childFeature == ArraysPackage.Literals.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
