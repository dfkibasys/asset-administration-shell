/**
 */
package de.dfki.cos.basys.aas.impl;

import de.dfki.cos.basys.aas.AssetKind;
import de.dfki.cos.basys.aas.IAasPackage;
import de.dfki.cos.basys.aas.IAdministrativeInformation;
import de.dfki.cos.basys.aas.IAsset;
import de.dfki.cos.basys.aas.IIdentifiable;
import de.dfki.cos.basys.aas.IIdentifier;
import de.dfki.cos.basys.aas.IReferable;
import de.dfki.cos.basys.aas.IReference;
import de.dfki.cos.basys.aas.ISubmodel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.aas.impl.Asset#getDataSpecification <em>Data Specification</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.Asset#getIdShort <em>Id Short</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.Asset#getCategory <em>Category</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.Asset#getDescription <em>Description</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.Asset#getParent <em>Parent</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.Asset#getAdministration <em>Administration</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.Asset#getIdentification <em>Identification</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.Asset#getKind <em>Kind</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.Asset#getAssetIdentificationModel <em>Asset Identification Model</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.Asset#getBillOfMaterial <em>Bill Of Material</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Asset extends MinimalEObjectImpl.Container implements IAsset {
	/**
	 * The cached value of the '{@link #getDataSpecification() <em>Data Specification</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSpecification()
	 * @generated
	 * @ordered
	 */
	protected EList<IReference> dataSpecification;

	/**
	 * The default value of the '{@link #getIdShort() <em>Id Short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdShort()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_SHORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdShort() <em>Id Short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdShort()
	 * @generated
	 * @ordered
	 */
	protected String idShort = ID_SHORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected IReferable parent;

	/**
	 * The cached value of the '{@link #getAdministration() <em>Administration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministration()
	 * @generated
	 * @ordered
	 */
	protected IAdministrativeInformation administration;

	/**
	 * The cached value of the '{@link #getIdentification() <em>Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentification()
	 * @generated
	 * @ordered
	 */
	protected IIdentifier identification;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final AssetKind KIND_EDEFAULT = AssetKind.TYPE;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected AssetKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssetIdentificationModel() <em>Asset Identification Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetIdentificationModel()
	 * @generated
	 * @ordered
	 */
	protected ISubmodel assetIdentificationModel;

	/**
	 * The cached value of the '{@link #getBillOfMaterial() <em>Bill Of Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillOfMaterial()
	 * @generated
	 * @ordered
	 */
	protected ISubmodel billOfMaterial;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Asset() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IAasPackage.Literals.ASSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IReference> getDataSpecification() {
		if (dataSpecification == null) {
			dataSpecification = new EObjectResolvingEList<IReference>(IReference.class, this, IAasPackage.ASSET__DATA_SPECIFICATION);
		}
		return dataSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdShort() {
		return idShort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdShort(String newIdShort) {
		String oldIdShort = idShort;
		idShort = newIdShort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.ASSET__ID_SHORT, oldIdShort, idShort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.ASSET__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.ASSET__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IReferable getParent() {
		if (parent != null && ((EObject)parent).eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (IReferable)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IAasPackage.ASSET__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReferable basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(IReferable newParent) {
		IReferable oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.ASSET__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IAdministrativeInformation getAdministration() {
		return administration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdministration(IAdministrativeInformation newAdministration, NotificationChain msgs) {
		IAdministrativeInformation oldAdministration = administration;
		administration = newAdministration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IAasPackage.ASSET__ADMINISTRATION, oldAdministration, newAdministration);
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
	public void setAdministration(IAdministrativeInformation newAdministration) {
		if (newAdministration != administration) {
			NotificationChain msgs = null;
			if (administration != null)
				msgs = ((InternalEObject)administration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IAasPackage.ASSET__ADMINISTRATION, null, msgs);
			if (newAdministration != null)
				msgs = ((InternalEObject)newAdministration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IAasPackage.ASSET__ADMINISTRATION, null, msgs);
			msgs = basicSetAdministration(newAdministration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.ASSET__ADMINISTRATION, newAdministration, newAdministration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IIdentifier getIdentification() {
		return identification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentification(IIdentifier newIdentification, NotificationChain msgs) {
		IIdentifier oldIdentification = identification;
		identification = newIdentification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IAasPackage.ASSET__IDENTIFICATION, oldIdentification, newIdentification);
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
	public void setIdentification(IIdentifier newIdentification) {
		if (newIdentification != identification) {
			NotificationChain msgs = null;
			if (identification != null)
				msgs = ((InternalEObject)identification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IAasPackage.ASSET__IDENTIFICATION, null, msgs);
			if (newIdentification != null)
				msgs = ((InternalEObject)newIdentification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IAasPackage.ASSET__IDENTIFICATION, null, msgs);
			msgs = basicSetIdentification(newIdentification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.ASSET__IDENTIFICATION, newIdentification, newIdentification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssetKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(AssetKind newKind) {
		AssetKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.ASSET__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISubmodel getAssetIdentificationModel() {
		if (assetIdentificationModel != null && ((EObject)assetIdentificationModel).eIsProxy()) {
			InternalEObject oldAssetIdentificationModel = (InternalEObject)assetIdentificationModel;
			assetIdentificationModel = (ISubmodel)eResolveProxy(oldAssetIdentificationModel);
			if (assetIdentificationModel != oldAssetIdentificationModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IAasPackage.ASSET__ASSET_IDENTIFICATION_MODEL, oldAssetIdentificationModel, assetIdentificationModel));
			}
		}
		return assetIdentificationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISubmodel basicGetAssetIdentificationModel() {
		return assetIdentificationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssetIdentificationModel(ISubmodel newAssetIdentificationModel) {
		ISubmodel oldAssetIdentificationModel = assetIdentificationModel;
		assetIdentificationModel = newAssetIdentificationModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.ASSET__ASSET_IDENTIFICATION_MODEL, oldAssetIdentificationModel, assetIdentificationModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISubmodel getBillOfMaterial() {
		if (billOfMaterial != null && ((EObject)billOfMaterial).eIsProxy()) {
			InternalEObject oldBillOfMaterial = (InternalEObject)billOfMaterial;
			billOfMaterial = (ISubmodel)eResolveProxy(oldBillOfMaterial);
			if (billOfMaterial != oldBillOfMaterial) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IAasPackage.ASSET__BILL_OF_MATERIAL, oldBillOfMaterial, billOfMaterial));
			}
		}
		return billOfMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISubmodel basicGetBillOfMaterial() {
		return billOfMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillOfMaterial(ISubmodel newBillOfMaterial) {
		ISubmodel oldBillOfMaterial = billOfMaterial;
		billOfMaterial = newBillOfMaterial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.ASSET__BILL_OF_MATERIAL, oldBillOfMaterial, billOfMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IAasPackage.ASSET__ADMINISTRATION:
				return basicSetAdministration(null, msgs);
			case IAasPackage.ASSET__IDENTIFICATION:
				return basicSetIdentification(null, msgs);
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
			case IAasPackage.ASSET__DATA_SPECIFICATION:
				return getDataSpecification();
			case IAasPackage.ASSET__ID_SHORT:
				return getIdShort();
			case IAasPackage.ASSET__CATEGORY:
				return getCategory();
			case IAasPackage.ASSET__DESCRIPTION:
				return getDescription();
			case IAasPackage.ASSET__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case IAasPackage.ASSET__ADMINISTRATION:
				return getAdministration();
			case IAasPackage.ASSET__IDENTIFICATION:
				return getIdentification();
			case IAasPackage.ASSET__KIND:
				return getKind();
			case IAasPackage.ASSET__ASSET_IDENTIFICATION_MODEL:
				if (resolve) return getAssetIdentificationModel();
				return basicGetAssetIdentificationModel();
			case IAasPackage.ASSET__BILL_OF_MATERIAL:
				if (resolve) return getBillOfMaterial();
				return basicGetBillOfMaterial();
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
			case IAasPackage.ASSET__DATA_SPECIFICATION:
				getDataSpecification().clear();
				getDataSpecification().addAll((Collection<? extends IReference>)newValue);
				return;
			case IAasPackage.ASSET__ID_SHORT:
				setIdShort((String)newValue);
				return;
			case IAasPackage.ASSET__CATEGORY:
				setCategory((String)newValue);
				return;
			case IAasPackage.ASSET__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case IAasPackage.ASSET__PARENT:
				setParent((IReferable)newValue);
				return;
			case IAasPackage.ASSET__ADMINISTRATION:
				setAdministration((IAdministrativeInformation)newValue);
				return;
			case IAasPackage.ASSET__IDENTIFICATION:
				setIdentification((IIdentifier)newValue);
				return;
			case IAasPackage.ASSET__KIND:
				setKind((AssetKind)newValue);
				return;
			case IAasPackage.ASSET__ASSET_IDENTIFICATION_MODEL:
				setAssetIdentificationModel((ISubmodel)newValue);
				return;
			case IAasPackage.ASSET__BILL_OF_MATERIAL:
				setBillOfMaterial((ISubmodel)newValue);
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
			case IAasPackage.ASSET__DATA_SPECIFICATION:
				getDataSpecification().clear();
				return;
			case IAasPackage.ASSET__ID_SHORT:
				setIdShort(ID_SHORT_EDEFAULT);
				return;
			case IAasPackage.ASSET__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case IAasPackage.ASSET__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case IAasPackage.ASSET__PARENT:
				setParent((IReferable)null);
				return;
			case IAasPackage.ASSET__ADMINISTRATION:
				setAdministration((IAdministrativeInformation)null);
				return;
			case IAasPackage.ASSET__IDENTIFICATION:
				setIdentification((IIdentifier)null);
				return;
			case IAasPackage.ASSET__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case IAasPackage.ASSET__ASSET_IDENTIFICATION_MODEL:
				setAssetIdentificationModel((ISubmodel)null);
				return;
			case IAasPackage.ASSET__BILL_OF_MATERIAL:
				setBillOfMaterial((ISubmodel)null);
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
			case IAasPackage.ASSET__DATA_SPECIFICATION:
				return dataSpecification != null && !dataSpecification.isEmpty();
			case IAasPackage.ASSET__ID_SHORT:
				return ID_SHORT_EDEFAULT == null ? idShort != null : !ID_SHORT_EDEFAULT.equals(idShort);
			case IAasPackage.ASSET__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case IAasPackage.ASSET__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case IAasPackage.ASSET__PARENT:
				return parent != null;
			case IAasPackage.ASSET__ADMINISTRATION:
				return administration != null;
			case IAasPackage.ASSET__IDENTIFICATION:
				return identification != null;
			case IAasPackage.ASSET__KIND:
				return kind != KIND_EDEFAULT;
			case IAasPackage.ASSET__ASSET_IDENTIFICATION_MODEL:
				return assetIdentificationModel != null;
			case IAasPackage.ASSET__BILL_OF_MATERIAL:
				return billOfMaterial != null;
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
		if (baseClass == IReferable.class) {
			switch (derivedFeatureID) {
				case IAasPackage.ASSET__ID_SHORT: return IAasPackage.REFERABLE__ID_SHORT;
				case IAasPackage.ASSET__CATEGORY: return IAasPackage.REFERABLE__CATEGORY;
				case IAasPackage.ASSET__DESCRIPTION: return IAasPackage.REFERABLE__DESCRIPTION;
				case IAasPackage.ASSET__PARENT: return IAasPackage.REFERABLE__PARENT;
				default: return -1;
			}
		}
		if (baseClass == IIdentifiable.class) {
			switch (derivedFeatureID) {
				case IAasPackage.ASSET__ADMINISTRATION: return IAasPackage.IDENTIFIABLE__ADMINISTRATION;
				case IAasPackage.ASSET__IDENTIFICATION: return IAasPackage.IDENTIFIABLE__IDENTIFICATION;
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
		if (baseClass == IReferable.class) {
			switch (baseFeatureID) {
				case IAasPackage.REFERABLE__ID_SHORT: return IAasPackage.ASSET__ID_SHORT;
				case IAasPackage.REFERABLE__CATEGORY: return IAasPackage.ASSET__CATEGORY;
				case IAasPackage.REFERABLE__DESCRIPTION: return IAasPackage.ASSET__DESCRIPTION;
				case IAasPackage.REFERABLE__PARENT: return IAasPackage.ASSET__PARENT;
				default: return -1;
			}
		}
		if (baseClass == IIdentifiable.class) {
			switch (baseFeatureID) {
				case IAasPackage.IDENTIFIABLE__ADMINISTRATION: return IAasPackage.ASSET__ADMINISTRATION;
				case IAasPackage.IDENTIFIABLE__IDENTIFICATION: return IAasPackage.ASSET__IDENTIFICATION;
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
		result.append(" (idShort: ");
		result.append(idShort);
		result.append(", category: ");
		result.append(category);
		result.append(", description: ");
		result.append(description);
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //Asset
