/**
 */
package de.silvawb.java.classifiers.provider;


import de.silvawb.java.classifiers.ClassifiersPackage;
import de.silvawb.java.classifiers.Enumeration;

import de.silvawb.java.members.MembersFactory;
import de.silvawb.java.members.MembersPackage;

import de.silvawb.java.types.TypesFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.silvawb.java.classifiers.Enumeration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumerationItemProvider extends ConcreteClassifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ClassifiersPackage.Literals.IMPLEMENTOR__IMPLEMENTS);
			childrenFeatures.add(ClassifiersPackage.Literals.ENUMERATION__CONSTANTS);
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
	 * This returns Enumeration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Enumeration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Enumeration)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Enumeration_type") :
			getString("_UI_Enumeration_type") + " " + label;
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

		switch (notification.getFeatureID(Enumeration.class)) {
			case ClassifiersPackage.ENUMERATION__IMPLEMENTS:
			case ClassifiersPackage.ENUMERATION__CONSTANTS:
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
				(ClassifiersPackage.Literals.IMPLEMENTOR__IMPLEMENTS,
				 TypesFactory.eINSTANCE.createClassifierReference()));

		newChildDescriptors.add
			(createChildParameter
				(ClassifiersPackage.Literals.IMPLEMENTOR__IMPLEMENTS,
				 TypesFactory.eINSTANCE.createNamespaceClassifierReference()));

		newChildDescriptors.add
			(createChildParameter
				(ClassifiersPackage.Literals.IMPLEMENTOR__IMPLEMENTS,
				 TypesFactory.eINSTANCE.createBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(ClassifiersPackage.Literals.IMPLEMENTOR__IMPLEMENTS,
				 TypesFactory.eINSTANCE.createByte()));

		newChildDescriptors.add
			(createChildParameter
				(ClassifiersPackage.Literals.IMPLEMENTOR__IMPLEMENTS,
				 TypesFactory.eINSTANCE.createChar()));

		newChildDescriptors.add
			(createChildParameter
				(ClassifiersPackage.Literals.IMPLEMENTOR__IMPLEMENTS,
				 TypesFactory.eINSTANCE.createDouble()));

		newChildDescriptors.add
			(createChildParameter
				(ClassifiersPackage.Literals.IMPLEMENTOR__IMPLEMENTS,
				 TypesFactory.eINSTANCE.createFloat()));

		newChildDescriptors.add
			(createChildParameter
				(ClassifiersPackage.Literals.IMPLEMENTOR__IMPLEMENTS,
				 TypesFactory.eINSTANCE.createInt()));

		newChildDescriptors.add
			(createChildParameter
				(ClassifiersPackage.Literals.IMPLEMENTOR__IMPLEMENTS,
				 TypesFactory.eINSTANCE.createLong()));

		newChildDescriptors.add
			(createChildParameter
				(ClassifiersPackage.Literals.IMPLEMENTOR__IMPLEMENTS,
				 TypesFactory.eINSTANCE.createShort()));

		newChildDescriptors.add
			(createChildParameter
				(ClassifiersPackage.Literals.IMPLEMENTOR__IMPLEMENTS,
				 TypesFactory.eINSTANCE.createVoid()));

		newChildDescriptors.add
			(createChildParameter
				(ClassifiersPackage.Literals.ENUMERATION__CONSTANTS,
				 MembersFactory.eINSTANCE.createEnumConstant()));
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
			childFeature == MembersPackage.Literals.MEMBER_CONTAINER__MEMBERS ||
			childFeature == MembersPackage.Literals.MEMBER_CONTAINER__DEFAULT_MEMBERS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
