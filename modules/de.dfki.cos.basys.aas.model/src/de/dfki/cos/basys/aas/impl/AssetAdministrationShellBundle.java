/**
 */
package de.dfki.cos.basys.aas.impl;

import de.dfki.cos.basys.aas.IAasPackage;
import de.dfki.cos.basys.aas.IAsset;
import de.dfki.cos.basys.aas.IAssetAdministrationShell;
import de.dfki.cos.basys.aas.IAssetAdministrationShellBundle;
import de.dfki.cos.basys.aas.IConceptDescription;
import de.dfki.cos.basys.aas.ISubmodel;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset Administration Shell Bundle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.aas.impl.AssetAdministrationShellBundle#getAdministrationShells <em>Administration Shells</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.AssetAdministrationShellBundle#getSubmodels <em>Submodels</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.AssetAdministrationShellBundle#getAssets <em>Assets</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.AssetAdministrationShellBundle#getConceptDescriptions <em>Concept Descriptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetAdministrationShellBundle extends MinimalEObjectImpl.Container implements IAssetAdministrationShellBundle {
	/**
	 * The cached value of the '{@link #getAdministrationShells() <em>Administration Shells</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministrationShells()
	 * @generated
	 * @ordered
	 */
	protected EList<IAssetAdministrationShell> administrationShells;

	/**
	 * The cached value of the '{@link #getSubmodels() <em>Submodels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmodels()
	 * @generated
	 * @ordered
	 */
	protected EList<ISubmodel> submodels;

	/**
	 * The cached value of the '{@link #getAssets() <em>Assets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<IAsset> assets;

	/**
	 * The cached value of the '{@link #getConceptDescriptions() <em>Concept Descriptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<IConceptDescription> conceptDescriptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetAdministrationShellBundle() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IAasPackage.Literals.ASSET_ADMINISTRATION_SHELL_BUNDLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IAssetAdministrationShell> getAdministrationShells() {
		if (administrationShells == null) {
			administrationShells = new EObjectContainmentEList<IAssetAdministrationShell>(IAssetAdministrationShell.class, this, IAasPackage.ASSET_ADMINISTRATION_SHELL_BUNDLE__ADMINISTRATION_SHELLS);
		}
		return administrationShells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ISubmodel> getSubmodels() {
		if (submodels == null) {
			submodels = new EObjectContainmentEList<ISubmodel>(ISubmodel.class, this, IAasPackage.ASSET_ADMINISTRATION_SHELL_BUNDLE__SUBMODELS);
		}
		return submodels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IAsset> getAssets() {
		if (assets == null) {
			assets = new EObjectContainmentEList<IAsset>(IAsset.class, this, IAasPackage.ASSET_ADMINISTRATION_SHELL_BUNDLE__ASSETS);
		}
		return assets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IConceptDescription> getConceptDescriptions() {
		if (conceptDescriptions == null) {
			conceptDescriptions = new EObjectContainmentEList<IConceptDescription>(IConceptDescription.class, this, IAasPackage.ASSET_ADMINISTRATION_SHELL_BUNDLE__CONCEPT_DESCRIPTIONS);
		}
		return conceptDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IAasPackage.ASSET_ADMINISTRATION_SHELL_BUNDLE__ADMINISTRATION_SHELLS:
				return ((InternalEList<?>)getAdministrationShells()).basicRemove(otherEnd, msgs);
			case IAasPackage.ASSET_ADMINISTRATION_SHELL_BUNDLE__SUBMODELS:
				return ((InternalEList<?>)getSubmodels()).basicRemove(otherEnd, msgs);
			case IAasPackage.ASSET_ADMINISTRATION_SHELL_BUNDLE__ASSETS:
				return ((InternalEList<?>)getAssets()).basicRemove(otherEnd, msgs);
			case IAasPackage.ASSET_ADMINISTRATION_SHELL_BUNDLE__CONCEPT_DESCRIPTIONS:
				return ((InternalEList<?>)getConceptDescriptions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IAasPackage.ASSET_ADMINISTRATION_SHELL_BUNDLE__ADMINISTRATION_SHELLS:
				return getAdministrationShells();
			case IAasPackage.ASSET_ADMINISTRATION_SHELL_BUNDLE__SUBMODELS:
				return getSubmodels();
			case IAasPackage.ASSET_ADMINISTRATION_SHELL_BUNDLE__ASSETS:
				return getAssets();
			case IAasPackage.ASSET_ADMINISTRATION_SHELL_BUNDLE__CONCEPT_DESCRIPTIONS:
				return getConceptDescriptions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IAasPackage.ASSET_ADMINISTRATION_SHELL_BUNDLE__ADMINISTRATION_SHELLS:
				getAdministrationShells().clear();
				getAdministrationShells().addAll((Collection<? extends IAssetAdministrationShell>)newValue);
				return;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL_BUNDLE__SUBMODELS:
				getSubmodels().clear();
				getSubmodels().addAll((Collection<? extends ISubmodel>)newValue);
				return;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL_BUNDLE__ASSETS:
				getAssets().clear();
				getAssets().addAll((Collection<? extends IAsset>)newValue);
				return;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL_BUNDLE__CONCEPT_DESCRIPTIONS:
				getConceptDescriptions().clear();
				getConceptDescriptions().addAll((Collection<? extends IConceptDescription>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IAasPackage.ASSET_ADMINISTRATION_SHELL_BUNDLE__ADMINISTRATION_SHELLS:
				getAdministrationShells().clear();
				return;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL_BUNDLE__SUBMODELS:
				getSubmodels().clear();
				return;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL_BUNDLE__ASSETS:
				getAssets().clear();
				return;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL_BUNDLE__CONCEPT_DESCRIPTIONS:
				getConceptDescriptions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IAasPackage.ASSET_ADMINISTRATION_SHELL_BUNDLE__ADMINISTRATION_SHELLS:
				return administrationShells != null && !administrationShells.isEmpty();
			case IAasPackage.ASSET_ADMINISTRATION_SHELL_BUNDLE__SUBMODELS:
				return submodels != null && !submodels.isEmpty();
			case IAasPackage.ASSET_ADMINISTRATION_SHELL_BUNDLE__ASSETS:
				return assets != null && !assets.isEmpty();
			case IAasPackage.ASSET_ADMINISTRATION_SHELL_BUNDLE__CONCEPT_DESCRIPTIONS:
				return conceptDescriptions != null && !conceptDescriptions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssetAdministrationShellBundle
