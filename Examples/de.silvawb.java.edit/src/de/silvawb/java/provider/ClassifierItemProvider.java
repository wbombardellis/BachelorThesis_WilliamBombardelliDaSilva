/**
 */
package de.silvawb.java.provider;


import de.silvawb.java.Classifier;
import de.silvawb.java.JavaFactory;
import de.silvawb.java.JavaPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.silvawb.java.Classifier} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassifierItemProvider 
	extends ContainedItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addTemplateBindingsPropertyDescriptor(object);
			addUnderTemplateBindingsPropertyDescriptor(object);
			addTypingFieldsPropertyDescriptor(object);
			addTypingMethodsPropertyDescriptor(object);
			addTypingArgumentsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_name_feature", "_UI_Classifier_type"),
				 JavaPackage.Literals.CLASSIFIER__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Template Bindings feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTemplateBindingsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_templateBindings_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_templateBindings_feature", "_UI_Classifier_type"),
				 JavaPackage.Literals.CLASSIFIER__TEMPLATE_BINDINGS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Under Template Bindings feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnderTemplateBindingsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_underTemplateBindings_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_underTemplateBindings_feature", "_UI_Classifier_type"),
				 JavaPackage.Literals.CLASSIFIER__UNDER_TEMPLATE_BINDINGS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Typing Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypingFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_typingFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_typingFields_feature", "_UI_Classifier_type"),
				 JavaPackage.Literals.CLASSIFIER__TYPING_FIELDS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Typing Methods feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypingMethodsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_typingMethods_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_typingMethods_feature", "_UI_Classifier_type"),
				 JavaPackage.Literals.CLASSIFIER__TYPING_METHODS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Typing Arguments feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypingArgumentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_typingArguments_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_typingArguments_feature", "_UI_Classifier_type"),
				 JavaPackage.Literals.CLASSIFIER__TYPING_ARGUMENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(JavaPackage.Literals.CONTAINER__CONTAINED_ELEMENTS);
			childrenFeatures.add(JavaPackage.Literals.CLASSIFIER__FIELDS);
			childrenFeatures.add(JavaPackage.Literals.CLASSIFIER__METHODS);
			childrenFeatures.add(JavaPackage.Literals.CLASSIFIER__INTERFACE_IMPLEMENTATIONS);
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
		String label = ((Classifier)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Classifier_type") :
			getString("_UI_Classifier_type") + " " + label;
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

		switch (notification.getFeatureID(Classifier.class)) {
			case JavaPackage.CLASSIFIER__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case JavaPackage.CLASSIFIER__CONTAINED_ELEMENTS:
			case JavaPackage.CLASSIFIER__FIELDS:
			case JavaPackage.CLASSIFIER__METHODS:
			case JavaPackage.CLASSIFIER__INTERFACE_IMPLEMENTATIONS:
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
				(JavaPackage.Literals.CONTAINER__CONTAINED_ELEMENTS,
				 JavaFactory.eINSTANCE.createContained()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.CONTAINER__CONTAINED_ELEMENTS,
				 JavaFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.CONTAINER__CONTAINED_ELEMENTS,
				 JavaFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.CONTAINER__CONTAINED_ELEMENTS,
				 JavaFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.CONTAINER__CONTAINED_ELEMENTS,
				 JavaFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.CLASSIFIER__FIELDS,
				 JavaFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.CLASSIFIER__METHODS,
				 JavaFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(JavaPackage.Literals.CLASSIFIER__INTERFACE_IMPLEMENTATIONS,
				 JavaFactory.eINSTANCE.createInterfaceImplementation()));
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
			childFeature == JavaPackage.Literals.CONTAINER__CONTAINED_ELEMENTS ||
			childFeature == JavaPackage.Literals.CLASSIFIER__FIELDS ||
			childFeature == JavaPackage.Literals.CLASSIFIER__METHODS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
