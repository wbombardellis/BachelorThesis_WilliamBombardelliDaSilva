/**
 */
package de.silvawb.java.statements.provider;


import de.silvawb.java.annotations.provider.JavaEditPlugin;

import de.silvawb.java.classifiers.ClassifiersFactory;

import de.silvawb.java.commons.provider.CommentableItemProvider;

import de.silvawb.java.statements.StatementListContainer;
import de.silvawb.java.statements.StatementsFactory;
import de.silvawb.java.statements.StatementsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.silvawb.java.statements.StatementListContainer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StatementListContainerItemProvider extends CommentableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementListContainerItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS);
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
		return getString("_UI_StatementListContainer_type");
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

		switch (notification.getFeatureID(StatementListContainer.class)) {
			case StatementsPackage.STATEMENT_LIST_CONTAINER__STATEMENTS:
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
				(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
				 StatementsFactory.eINSTANCE.createAssert()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
				 StatementsFactory.eINSTANCE.createBreak()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
				 StatementsFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
				 StatementsFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
				 StatementsFactory.eINSTANCE.createContinue()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
				 StatementsFactory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
				 StatementsFactory.eINSTANCE.createDoWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
				 StatementsFactory.eINSTANCE.createEmptyStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
				 StatementsFactory.eINSTANCE.createExpressionStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
				 StatementsFactory.eINSTANCE.createForLoop()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
				 StatementsFactory.eINSTANCE.createForEachLoop()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
				 StatementsFactory.eINSTANCE.createJumpLabel()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
				 StatementsFactory.eINSTANCE.createLocalVariableStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
				 StatementsFactory.eINSTANCE.createReturn()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
				 StatementsFactory.eINSTANCE.createSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
				 StatementsFactory.eINSTANCE.createSynchronizedBlock()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
				 StatementsFactory.eINSTANCE.createThrow()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
				 StatementsFactory.eINSTANCE.createTryBlock()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
				 ClassifiersFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
				 ClassifiersFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
				 ClassifiersFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
				 ClassifiersFactory.eINSTANCE.createAnnotation()));
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
