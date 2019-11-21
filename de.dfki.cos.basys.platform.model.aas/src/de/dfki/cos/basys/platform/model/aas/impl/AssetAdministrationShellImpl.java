/**
 */
package de.dfki.cos.basys.platform.model.aas.impl;

import de.dfki.cos.basys.platform.model.aas.AasPackage;
import de.dfki.cos.basys.platform.model.aas.AdministrativeInformation;
import de.dfki.cos.basys.platform.model.aas.Asset;
import de.dfki.cos.basys.platform.model.aas.AssetAdministrationShell;
import de.dfki.cos.basys.platform.model.aas.Identifiable;
import de.dfki.cos.basys.platform.model.aas.Identifier;
import de.dfki.cos.basys.platform.model.aas.Security;
import de.dfki.cos.basys.platform.model.aas.Submodel;
import de.dfki.cos.basys.platform.model.aas.View;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset Administration Shell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.AssetAdministrationShellImpl#getAdministration <em>Administration</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.AssetAdministrationShellImpl#getIdentification <em>Identification</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.AssetAdministrationShellImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.AssetAdministrationShellImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.AssetAdministrationShellImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.AssetAdministrationShellImpl#getSubmodel <em>Submodel</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.AssetAdministrationShellImpl#getView <em>View</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetAdministrationShellImpl extends MinimalEObjectImpl.Container implements AssetAdministrationShell {
	/**
	 * The cached value of the '{@link #getAdministration() <em>Administration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministration()
	 * @generated
	 * @ordered
	 */
	protected AdministrativeInformation administration;

	/**
	 * The cached value of the '{@link #getIdentification() <em>Identification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentification()
	 * @generated
	 * @ordered
	 */
	protected Identifier identification;

	/**
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected AssetAdministrationShell derivedFrom;

	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected Security security;

	/**
	 * The cached value of the '{@link #getAsset() <em>Asset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsset()
	 * @generated
	 * @ordered
	 */
	protected Asset asset;

	/**
	 * The cached value of the '{@link #getSubmodel() <em>Submodel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmodel()
	 * @generated
	 * @ordered
	 */
	protected EList<Submodel> submodel;

	/**
	 * The cached value of the '{@link #getView() <em>View</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected EList<View> view;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetAdministrationShellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AasPackage.Literals.ASSET_ADMINISTRATION_SHELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdministrativeInformation getAdministration() {
		if (administration != null && administration.eIsProxy()) {
			InternalEObject oldAdministration = (InternalEObject)administration;
			administration = (AdministrativeInformation)eResolveProxy(oldAdministration);
			if (administration != oldAdministration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AasPackage.ASSET_ADMINISTRATION_SHELL__ADMINISTRATION, oldAdministration, administration));
			}
		}
		return administration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrativeInformation basicGetAdministration() {
		return administration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdministration(AdministrativeInformation newAdministration) {
		AdministrativeInformation oldAdministration = administration;
		administration = newAdministration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.ASSET_ADMINISTRATION_SHELL__ADMINISTRATION, oldAdministration, administration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getIdentification() {
		if (identification != null && identification.eIsProxy()) {
			InternalEObject oldIdentification = (InternalEObject)identification;
			identification = (Identifier)eResolveProxy(oldIdentification);
			if (identification != oldIdentification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AasPackage.ASSET_ADMINISTRATION_SHELL__IDENTIFICATION, oldIdentification, identification));
			}
		}
		return identification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetIdentification() {
		return identification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentification(Identifier newIdentification) {
		Identifier oldIdentification = identification;
		identification = newIdentification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.ASSET_ADMINISTRATION_SHELL__IDENTIFICATION, oldIdentification, identification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssetAdministrationShell getDerivedFrom() {
		if (derivedFrom != null && derivedFrom.eIsProxy()) {
			InternalEObject oldDerivedFrom = (InternalEObject)derivedFrom;
			derivedFrom = (AssetAdministrationShell)eResolveProxy(oldDerivedFrom);
			if (derivedFrom != oldDerivedFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AasPackage.ASSET_ADMINISTRATION_SHELL__DERIVED_FROM, oldDerivedFrom, derivedFrom));
			}
		}
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetAdministrationShell basicGetDerivedFrom() {
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDerivedFrom(AssetAdministrationShell newDerivedFrom) {
		AssetAdministrationShell oldDerivedFrom = derivedFrom;
		derivedFrom = newDerivedFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.ASSET_ADMINISTRATION_SHELL__DERIVED_FROM, oldDerivedFrom, derivedFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Security getSecurity() {
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurity(Security newSecurity, NotificationChain msgs) {
		Security oldSecurity = security;
		security = newSecurity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AasPackage.ASSET_ADMINISTRATION_SHELL__SECURITY, oldSecurity, newSecurity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurity(Security newSecurity) {
		if (newSecurity != security) {
			NotificationChain msgs = null;
			if (security != null)
				msgs = ((InternalEObject)security).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AasPackage.ASSET_ADMINISTRATION_SHELL__SECURITY, null, msgs);
			if (newSecurity != null)
				msgs = ((InternalEObject)newSecurity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AasPackage.ASSET_ADMINISTRATION_SHELL__SECURITY, null, msgs);
			msgs = basicSetSecurity(newSecurity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.ASSET_ADMINISTRATION_SHELL__SECURITY, newSecurity, newSecurity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Asset getAsset() {
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsset(Asset newAsset, NotificationChain msgs) {
		Asset oldAsset = asset;
		asset = newAsset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AasPackage.ASSET_ADMINISTRATION_SHELL__ASSET, oldAsset, newAsset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAsset(Asset newAsset) {
		if (newAsset != asset) {
			NotificationChain msgs = null;
			if (asset != null)
				msgs = ((InternalEObject)asset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AasPackage.ASSET_ADMINISTRATION_SHELL__ASSET, null, msgs);
			if (newAsset != null)
				msgs = ((InternalEObject)newAsset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AasPackage.ASSET_ADMINISTRATION_SHELL__ASSET, null, msgs);
			msgs = basicSetAsset(newAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.ASSET_ADMINISTRATION_SHELL__ASSET, newAsset, newAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Submodel> getSubmodel() {
		if (submodel == null) {
			submodel = new EObjectContainmentEList<Submodel>(Submodel.class, this, AasPackage.ASSET_ADMINISTRATION_SHELL__SUBMODEL);
		}
		return submodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<View> getView() {
		if (view == null) {
			view = new EObjectContainmentEList<View>(View.class, this, AasPackage.ASSET_ADMINISTRATION_SHELL__VIEW);
		}
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AasPackage.ASSET_ADMINISTRATION_SHELL__SECURITY:
				return basicSetSecurity(null, msgs);
			case AasPackage.ASSET_ADMINISTRATION_SHELL__ASSET:
				return basicSetAsset(null, msgs);
			case AasPackage.ASSET_ADMINISTRATION_SHELL__SUBMODEL:
				return ((InternalEList<?>)getSubmodel()).basicRemove(otherEnd, msgs);
			case AasPackage.ASSET_ADMINISTRATION_SHELL__VIEW:
				return ((InternalEList<?>)getView()).basicRemove(otherEnd, msgs);
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
			case AasPackage.ASSET_ADMINISTRATION_SHELL__ADMINISTRATION:
				if (resolve) return getAdministration();
				return basicGetAdministration();
			case AasPackage.ASSET_ADMINISTRATION_SHELL__IDENTIFICATION:
				if (resolve) return getIdentification();
				return basicGetIdentification();
			case AasPackage.ASSET_ADMINISTRATION_SHELL__DERIVED_FROM:
				if (resolve) return getDerivedFrom();
				return basicGetDerivedFrom();
			case AasPackage.ASSET_ADMINISTRATION_SHELL__SECURITY:
				return getSecurity();
			case AasPackage.ASSET_ADMINISTRATION_SHELL__ASSET:
				return getAsset();
			case AasPackage.ASSET_ADMINISTRATION_SHELL__SUBMODEL:
				return getSubmodel();
			case AasPackage.ASSET_ADMINISTRATION_SHELL__VIEW:
				return getView();
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
			case AasPackage.ASSET_ADMINISTRATION_SHELL__ADMINISTRATION:
				setAdministration((AdministrativeInformation)newValue);
				return;
			case AasPackage.ASSET_ADMINISTRATION_SHELL__IDENTIFICATION:
				setIdentification((Identifier)newValue);
				return;
			case AasPackage.ASSET_ADMINISTRATION_SHELL__DERIVED_FROM:
				setDerivedFrom((AssetAdministrationShell)newValue);
				return;
			case AasPackage.ASSET_ADMINISTRATION_SHELL__SECURITY:
				setSecurity((Security)newValue);
				return;
			case AasPackage.ASSET_ADMINISTRATION_SHELL__ASSET:
				setAsset((Asset)newValue);
				return;
			case AasPackage.ASSET_ADMINISTRATION_SHELL__SUBMODEL:
				getSubmodel().clear();
				getSubmodel().addAll((Collection<? extends Submodel>)newValue);
				return;
			case AasPackage.ASSET_ADMINISTRATION_SHELL__VIEW:
				getView().clear();
				getView().addAll((Collection<? extends View>)newValue);
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
			case AasPackage.ASSET_ADMINISTRATION_SHELL__ADMINISTRATION:
				setAdministration((AdministrativeInformation)null);
				return;
			case AasPackage.ASSET_ADMINISTRATION_SHELL__IDENTIFICATION:
				setIdentification((Identifier)null);
				return;
			case AasPackage.ASSET_ADMINISTRATION_SHELL__DERIVED_FROM:
				setDerivedFrom((AssetAdministrationShell)null);
				return;
			case AasPackage.ASSET_ADMINISTRATION_SHELL__SECURITY:
				setSecurity((Security)null);
				return;
			case AasPackage.ASSET_ADMINISTRATION_SHELL__ASSET:
				setAsset((Asset)null);
				return;
			case AasPackage.ASSET_ADMINISTRATION_SHELL__SUBMODEL:
				getSubmodel().clear();
				return;
			case AasPackage.ASSET_ADMINISTRATION_SHELL__VIEW:
				getView().clear();
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
			case AasPackage.ASSET_ADMINISTRATION_SHELL__ADMINISTRATION:
				return administration != null;
			case AasPackage.ASSET_ADMINISTRATION_SHELL__IDENTIFICATION:
				return identification != null;
			case AasPackage.ASSET_ADMINISTRATION_SHELL__DERIVED_FROM:
				return derivedFrom != null;
			case AasPackage.ASSET_ADMINISTRATION_SHELL__SECURITY:
				return security != null;
			case AasPackage.ASSET_ADMINISTRATION_SHELL__ASSET:
				return asset != null;
			case AasPackage.ASSET_ADMINISTRATION_SHELL__SUBMODEL:
				return submodel != null && !submodel.isEmpty();
			case AasPackage.ASSET_ADMINISTRATION_SHELL__VIEW:
				return view != null && !view.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Identifiable.class) {
			switch (derivedFeatureID) {
				case AasPackage.ASSET_ADMINISTRATION_SHELL__ADMINISTRATION: return AasPackage.IDENTIFIABLE__ADMINISTRATION;
				case AasPackage.ASSET_ADMINISTRATION_SHELL__IDENTIFICATION: return AasPackage.IDENTIFIABLE__IDENTIFICATION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Identifiable.class) {
			switch (baseFeatureID) {
				case AasPackage.IDENTIFIABLE__ADMINISTRATION: return AasPackage.ASSET_ADMINISTRATION_SHELL__ADMINISTRATION;
				case AasPackage.IDENTIFIABLE__IDENTIFICATION: return AasPackage.ASSET_ADMINISTRATION_SHELL__IDENTIFICATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AssetAdministrationShellImpl
