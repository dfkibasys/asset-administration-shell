/**
 */
package de.dfki.cos.basys.aas.provider;


import de.dfki.cos.basys.aas.IAasFactory;
import de.dfki.cos.basys.aas.IAasPackage;
import de.dfki.cos.basys.aas.IAssetAdministrationShell;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dfki.cos.basys.aas.IAssetAdministrationShell} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AssetAdministrationShellItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetAdministrationShellItemProvider(AdapterFactory adapterFactory) {
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

			addDataSpecificationPropertyDescriptor(object);
			addIdShortPropertyDescriptor(object);
			addCategoryPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addParentPropertyDescriptor(object);
			addDerivedFromPropertyDescriptor(object);
			addAssetPropertyDescriptor(object);
			addSubmodelPropertyDescriptor(object);
			addConceptDictionaryPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Data Specification feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataSpecificationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HasDataSpecification_dataSpecification_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HasDataSpecification_dataSpecification_feature", "_UI_HasDataSpecification_type"),
				 IAasPackage.Literals.HAS_DATA_SPECIFICATION__DATA_SPECIFICATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id Short feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdShortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Referable_idShort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Referable_idShort_feature", "_UI_Referable_type"),
				 IAasPackage.Literals.REFERABLE__ID_SHORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Category feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Referable_category_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Referable_category_feature", "_UI_Referable_type"),
				 IAasPackage.Literals.REFERABLE__CATEGORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Referable_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Referable_description_feature", "_UI_Referable_type"),
				 IAasPackage.Literals.REFERABLE__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Referable_parent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Referable_parent_feature", "_UI_Referable_type"),
				 IAasPackage.Literals.REFERABLE__PARENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Derived From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDerivedFromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssetAdministrationShell_derivedFrom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssetAdministrationShell_derivedFrom_feature", "_UI_AssetAdministrationShell_type"),
				 IAasPackage.Literals.ASSET_ADMINISTRATION_SHELL__DERIVED_FROM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Asset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssetAdministrationShell_asset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssetAdministrationShell_asset_feature", "_UI_AssetAdministrationShell_type"),
				 IAasPackage.Literals.ASSET_ADMINISTRATION_SHELL__ASSET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Submodel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubmodelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssetAdministrationShell_submodel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssetAdministrationShell_submodel_feature", "_UI_AssetAdministrationShell_type"),
				 IAasPackage.Literals.ASSET_ADMINISTRATION_SHELL__SUBMODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Concept Dictionary feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConceptDictionaryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssetAdministrationShell_conceptDictionary_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssetAdministrationShell_conceptDictionary_feature", "_UI_AssetAdministrationShell_type"),
				 IAasPackage.Literals.ASSET_ADMINISTRATION_SHELL__CONCEPT_DICTIONARY,
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
			childrenFeatures.add(IAasPackage.Literals.IDENTIFIABLE__ADMINISTRATION);
			childrenFeatures.add(IAasPackage.Literals.IDENTIFIABLE__IDENTIFICATION);
			childrenFeatures.add(IAasPackage.Literals.ASSET_ADMINISTRATION_SHELL__SECURITY);
			childrenFeatures.add(IAasPackage.Literals.ASSET_ADMINISTRATION_SHELL__VIEW);
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
	 * This returns AssetAdministrationShell.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AssetAdministrationShell"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IAssetAdministrationShell)object).getIdShort();
		return label == null || label.length() == 0 ?
			getString("_UI_AssetAdministrationShell_type") :
			getString("_UI_AssetAdministrationShell_type") + " " + label;
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

		switch (notification.getFeatureID(IAssetAdministrationShell.class)) {
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__ID_SHORT:
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__CATEGORY:
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__ADMINISTRATION:
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__IDENTIFICATION:
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__SECURITY:
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__VIEW:
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
				(IAasPackage.Literals.IDENTIFIABLE__ADMINISTRATION,
				 IAasFactory.eINSTANCE.createAdministrativeInformation()));

		newChildDescriptors.add
			(createChildParameter
				(IAasPackage.Literals.IDENTIFIABLE__IDENTIFICATION,
				 IAasFactory.eINSTANCE.createIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(IAasPackage.Literals.ASSET_ADMINISTRATION_SHELL__SECURITY,
				 IAasFactory.eINSTANCE.createSecurity()));

		newChildDescriptors.add
			(createChildParameter
				(IAasPackage.Literals.ASSET_ADMINISTRATION_SHELL__VIEW,
				 IAasFactory.eINSTANCE.createView()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AasEditPlugin.INSTANCE;
	}

}
