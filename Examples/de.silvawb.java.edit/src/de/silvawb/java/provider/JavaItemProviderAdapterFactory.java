/**
 */
package de.silvawb.java.provider;

import de.silvawb.java.util.JavaAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaItemProviderAdapterFactory extends JavaAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.silvawb.java.System} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemItemProvider systemItemProvider;

	/**
	 * This creates an adapter for a {@link de.silvawb.java.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemAdapter() {
		if (systemItemProvider == null) {
			systemItemProvider = new SystemItemProvider(this);
		}

		return systemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.silvawb.java.Package} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageItemProvider packageItemProvider;

	/**
	 * This creates an adapter for a {@link de.silvawb.java.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPackageAdapter() {
		if (packageItemProvider == null) {
			packageItemProvider = new PackageItemProvider(this);
		}

		return packageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.silvawb.java.Class} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassItemProvider classItemProvider;

	/**
	 * This creates an adapter for a {@link de.silvawb.java.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassAdapter() {
		if (classItemProvider == null) {
			classItemProvider = new ClassItemProvider(this);
		}

		return classItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.silvawb.java.InterfaceImplementation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImplementationItemProvider interfaceImplementationItemProvider;

	/**
	 * This creates an adapter for a {@link de.silvawb.java.InterfaceImplementation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInterfaceImplementationAdapter() {
		if (interfaceImplementationItemProvider == null) {
			interfaceImplementationItemProvider = new InterfaceImplementationItemProvider(this);
		}

		return interfaceImplementationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.silvawb.java.Generalization} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationItemProvider generalizationItemProvider;

	/**
	 * This creates an adapter for a {@link de.silvawb.java.Generalization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneralizationAdapter() {
		if (generalizationItemProvider == null) {
			generalizationItemProvider = new GeneralizationItemProvider(this);
		}

		return generalizationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.silvawb.java.Field} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldItemProvider fieldItemProvider;

	/**
	 * This creates an adapter for a {@link de.silvawb.java.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFieldAdapter() {
		if (fieldItemProvider == null) {
			fieldItemProvider = new FieldItemProvider(this);
		}

		return fieldItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.silvawb.java.Import} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportItemProvider importItemProvider;

	/**
	 * This creates an adapter for a {@link de.silvawb.java.Import}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImportAdapter() {
		if (importItemProvider == null) {
			importItemProvider = new ImportItemProvider(this);
		}

		return importItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.silvawb.java.Contained} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainedItemProvider containedItemProvider;

	/**
	 * This creates an adapter for a {@link de.silvawb.java.Contained}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContainedAdapter() {
		if (containedItemProvider == null) {
			containedItemProvider = new ContainedItemProvider(this);
		}

		return containedItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.silvawb.java.Method} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodItemProvider methodItemProvider;

	/**
	 * This creates an adapter for a {@link de.silvawb.java.Method}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMethodAdapter() {
		if (methodItemProvider == null) {
			methodItemProvider = new MethodItemProvider(this);
		}

		return methodItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.silvawb.java.Argument} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentItemProvider argumentItemProvider;

	/**
	 * This creates an adapter for a {@link de.silvawb.java.Argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArgumentAdapter() {
		if (argumentItemProvider == null) {
			argumentItemProvider = new ArgumentItemProvider(this);
		}

		return argumentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.silvawb.java.Container} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerItemProvider containerItemProvider;

	/**
	 * This creates an adapter for a {@link de.silvawb.java.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContainerAdapter() {
		if (containerItemProvider == null) {
			containerItemProvider = new ContainerItemProvider(this);
		}

		return containerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.silvawb.java.Interface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceItemProvider interfaceItemProvider;

	/**
	 * This creates an adapter for a {@link de.silvawb.java.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInterfaceAdapter() {
		if (interfaceItemProvider == null) {
			interfaceItemProvider = new InterfaceItemProvider(this);
		}

		return interfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.silvawb.java.GenericBinding} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericBindingItemProvider genericBindingItemProvider;

	/**
	 * This creates an adapter for a {@link de.silvawb.java.GenericBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGenericBindingAdapter() {
		if (genericBindingItemProvider == null) {
			genericBindingItemProvider = new GenericBindingItemProvider(this);
		}

		return genericBindingItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (systemItemProvider != null) systemItemProvider.dispose();
		if (packageItemProvider != null) packageItemProvider.dispose();
		if (classItemProvider != null) classItemProvider.dispose();
		if (interfaceImplementationItemProvider != null) interfaceImplementationItemProvider.dispose();
		if (generalizationItemProvider != null) generalizationItemProvider.dispose();
		if (fieldItemProvider != null) fieldItemProvider.dispose();
		if (importItemProvider != null) importItemProvider.dispose();
		if (containedItemProvider != null) containedItemProvider.dispose();
		if (methodItemProvider != null) methodItemProvider.dispose();
		if (argumentItemProvider != null) argumentItemProvider.dispose();
		if (containerItemProvider != null) containerItemProvider.dispose();
		if (interfaceItemProvider != null) interfaceItemProvider.dispose();
		if (genericBindingItemProvider != null) genericBindingItemProvider.dispose();
	}

}
