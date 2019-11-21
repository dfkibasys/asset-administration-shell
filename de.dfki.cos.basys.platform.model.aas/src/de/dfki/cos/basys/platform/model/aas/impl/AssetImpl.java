/**
 */
package de.dfki.cos.basys.platform.model.aas.impl;

import de.dfki.cos.basys.platform.model.aas.AasPackage;
import de.dfki.cos.basys.platform.model.aas.AdministrativeInformation;
import de.dfki.cos.basys.platform.model.aas.Asset;
import de.dfki.cos.basys.platform.model.aas.HasKind;
import de.dfki.cos.basys.platform.model.aas.Identifiable;
import de.dfki.cos.basys.platform.model.aas.Identifier;
import de.dfki.cos.basys.platform.model.aas.Kind;
import de.dfki.cos.basys.platform.model.aas.Submodel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.AssetImpl#getAdministration <em>Administration</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.AssetImpl#getIdentification <em>Identification</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.AssetImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.AssetImpl#getAssetIdentificationModel <em>Asset Identification Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetImpl extends MinimalEObjectImpl.Container implements Asset {
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
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final Kind KIND_EDEFAULT = Kind.TYPE;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected Kind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssetIdentificationModel() <em>Asset Identification Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetIdentificationModel()
	 * @generated
	 * @ordered
	 */
	protected Submodel assetIdentificationModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AasPackage.Literals.ASSET;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AasPackage.ASSET__ADMINISTRATION, oldAdministration, administration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.ASSET__ADMINISTRATION, oldAdministration, administration));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AasPackage.ASSET__IDENTIFICATION, oldIdentification, identification));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.ASSET__IDENTIFICATION, oldIdentification, identification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(Kind newKind) {
		Kind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.ASSET__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Submodel getAssetIdentificationModel() {
		if (assetIdentificationModel != null && assetIdentificationModel.eIsProxy()) {
			InternalEObject oldAssetIdentificationModel = (InternalEObject)assetIdentificationModel;
			assetIdentificationModel = (Submodel)eResolveProxy(oldAssetIdentificationModel);
			if (assetIdentificationModel != oldAssetIdentificationModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AasPackage.ASSET__ASSET_IDENTIFICATION_MODEL, oldAssetIdentificationModel, assetIdentificationModel));
			}
		}
		return assetIdentificationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Submodel basicGetAssetIdentificationModel() {
		return assetIdentificationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssetIdentificationModel(Submodel newAssetIdentificationModel) {
		Submodel oldAssetIdentificationModel = assetIdentificationModel;
		assetIdentificationModel = newAssetIdentificationModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.ASSET__ASSET_IDENTIFICATION_MODEL, oldAssetIdentificationModel, assetIdentificationModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AasPackage.ASSET__ADMINISTRATION:
				if (resolve) return getAdministration();
				return basicGetAdministration();
			case AasPackage.ASSET__IDENTIFICATION:
				if (resolve) return getIdentification();
				return basicGetIdentification();
			case AasPackage.ASSET__KIND:
				return getKind();
			case AasPackage.ASSET__ASSET_IDENTIFICATION_MODEL:
				if (resolve) return getAssetIdentificationModel();
				return basicGetAssetIdentificationModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AasPackage.ASSET__ADMINISTRATION:
				setAdministration((AdministrativeInformation)newValue);
				return;
			case AasPackage.ASSET__IDENTIFICATION:
				setIdentification((Identifier)newValue);
				return;
			case AasPackage.ASSET__KIND:
				setKind((Kind)newValue);
				return;
			case AasPackage.ASSET__ASSET_IDENTIFICATION_MODEL:
				setAssetIdentificationModel((Submodel)newValue);
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
			case AasPackage.ASSET__ADMINISTRATION:
				setAdministration((AdministrativeInformation)null);
				return;
			case AasPackage.ASSET__IDENTIFICATION:
				setIdentification((Identifier)null);
				return;
			case AasPackage.ASSET__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case AasPackage.ASSET__ASSET_IDENTIFICATION_MODEL:
				setAssetIdentificationModel((Submodel)null);
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
			case AasPackage.ASSET__ADMINISTRATION:
				return administration != null;
			case AasPackage.ASSET__IDENTIFICATION:
				return identification != null;
			case AasPackage.ASSET__KIND:
				return kind != KIND_EDEFAULT;
			case AasPackage.ASSET__ASSET_IDENTIFICATION_MODEL:
				return assetIdentificationModel != null;
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
				case AasPackage.ASSET__ADMINISTRATION: return AasPackage.IDENTIFIABLE__ADMINISTRATION;
				case AasPackage.ASSET__IDENTIFICATION: return AasPackage.IDENTIFIABLE__IDENTIFICATION;
				default: return -1;
			}
		}
		if (baseClass == HasKind.class) {
			switch (derivedFeatureID) {
				case AasPackage.ASSET__KIND: return AasPackage.HAS_KIND__KIND;
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
				case AasPackage.IDENTIFIABLE__ADMINISTRATION: return AasPackage.ASSET__ADMINISTRATION;
				case AasPackage.IDENTIFIABLE__IDENTIFICATION: return AasPackage.ASSET__IDENTIFICATION;
				default: return -1;
			}
		}
		if (baseClass == HasKind.class) {
			switch (baseFeatureID) {
				case AasPackage.HAS_KIND__KIND: return AasPackage.ASSET__KIND;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //AssetImpl
