/**
 */
package de.dfki.cos.basys.aas.impl;

import de.dfki.cos.basys.aas.IAasPackage;
import de.dfki.cos.basys.aas.IAdministrativeInformation;
import de.dfki.cos.basys.aas.IAsset;
import de.dfki.cos.basys.aas.IAssetAdministrationShell;
import de.dfki.cos.basys.aas.IConceptDictionary;
import de.dfki.cos.basys.aas.IIdentifiable;
import de.dfki.cos.basys.aas.IIdentifier;
import de.dfki.cos.basys.aas.IReferable;
import de.dfki.cos.basys.aas.IReference;
import de.dfki.cos.basys.aas.ISecurity;
import de.dfki.cos.basys.aas.ISubmodel;
import de.dfki.cos.basys.aas.IView;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset Administration Shell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.aas.impl.AssetAdministrationShell#getDataSpecification <em>Data Specification</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.AssetAdministrationShell#getIdShort <em>Id Short</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.AssetAdministrationShell#getCategory <em>Category</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.AssetAdministrationShell#getDescription <em>Description</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.AssetAdministrationShell#getParent <em>Parent</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.AssetAdministrationShell#getAdministration <em>Administration</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.AssetAdministrationShell#getIdentification <em>Identification</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.AssetAdministrationShell#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.AssetAdministrationShell#getSecurity <em>Security</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.AssetAdministrationShell#getAsset <em>Asset</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.AssetAdministrationShell#getSubmodel <em>Submodel</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.AssetAdministrationShell#getView <em>View</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.AssetAdministrationShell#getConceptDictionary <em>Concept Dictionary</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetAdministrationShell extends MinimalEObjectImpl.Container implements IAssetAdministrationShell {
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
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected IAssetAdministrationShell derivedFrom;

	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected ISecurity security;

	/**
	 * The cached value of the '{@link #getAsset() <em>Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsset()
	 * @generated
	 * @ordered
	 */
	protected IAsset asset;

	/**
	 * The cached value of the '{@link #getSubmodel() <em>Submodel</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmodel()
	 * @generated
	 * @ordered
	 */
	protected EList<ISubmodel> submodel;

	/**
	 * The cached value of the '{@link #getView() <em>View</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected EList<IView> view;

	/**
	 * The cached value of the '{@link #getConceptDictionary() <em>Concept Dictionary</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptDictionary()
	 * @generated
	 * @ordered
	 */
	protected EList<IConceptDictionary> conceptDictionary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetAdministrationShell() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IAasPackage.Literals.ASSET_ADMINISTRATION_SHELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IReference> getDataSpecification() {
		if (dataSpecification == null) {
			dataSpecification = new EObjectResolvingEList<IReference>(IReference.class, this, IAasPackage.ASSET_ADMINISTRATION_SHELL__DATA_SPECIFICATION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.ASSET_ADMINISTRATION_SHELL__ID_SHORT, oldIdShort, idShort));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.ASSET_ADMINISTRATION_SHELL__CATEGORY, oldCategory, category));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.ASSET_ADMINISTRATION_SHELL__DESCRIPTION, oldDescription, description));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IAasPackage.ASSET_ADMINISTRATION_SHELL__PARENT, oldParent, parent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.ASSET_ADMINISTRATION_SHELL__PARENT, oldParent, parent));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IAasPackage.ASSET_ADMINISTRATION_SHELL__ADMINISTRATION, oldAdministration, newAdministration);
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
				msgs = ((InternalEObject)administration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IAasPackage.ASSET_ADMINISTRATION_SHELL__ADMINISTRATION, null, msgs);
			if (newAdministration != null)
				msgs = ((InternalEObject)newAdministration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IAasPackage.ASSET_ADMINISTRATION_SHELL__ADMINISTRATION, null, msgs);
			msgs = basicSetAdministration(newAdministration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.ASSET_ADMINISTRATION_SHELL__ADMINISTRATION, newAdministration, newAdministration));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IAasPackage.ASSET_ADMINISTRATION_SHELL__IDENTIFICATION, oldIdentification, newIdentification);
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
				msgs = ((InternalEObject)identification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IAasPackage.ASSET_ADMINISTRATION_SHELL__IDENTIFICATION, null, msgs);
			if (newIdentification != null)
				msgs = ((InternalEObject)newIdentification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IAasPackage.ASSET_ADMINISTRATION_SHELL__IDENTIFICATION, null, msgs);
			msgs = basicSetIdentification(newIdentification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.ASSET_ADMINISTRATION_SHELL__IDENTIFICATION, newIdentification, newIdentification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IAssetAdministrationShell getDerivedFrom() {
		if (derivedFrom != null && ((EObject)derivedFrom).eIsProxy()) {
			InternalEObject oldDerivedFrom = (InternalEObject)derivedFrom;
			derivedFrom = (IAssetAdministrationShell)eResolveProxy(oldDerivedFrom);
			if (derivedFrom != oldDerivedFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IAasPackage.ASSET_ADMINISTRATION_SHELL__DERIVED_FROM, oldDerivedFrom, derivedFrom));
			}
		}
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAssetAdministrationShell basicGetDerivedFrom() {
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDerivedFrom(IAssetAdministrationShell newDerivedFrom) {
		IAssetAdministrationShell oldDerivedFrom = derivedFrom;
		derivedFrom = newDerivedFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.ASSET_ADMINISTRATION_SHELL__DERIVED_FROM, oldDerivedFrom, derivedFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISecurity getSecurity() {
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurity(ISecurity newSecurity, NotificationChain msgs) {
		ISecurity oldSecurity = security;
		security = newSecurity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IAasPackage.ASSET_ADMINISTRATION_SHELL__SECURITY, oldSecurity, newSecurity);
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
	public void setSecurity(ISecurity newSecurity) {
		if (newSecurity != security) {
			NotificationChain msgs = null;
			if (security != null)
				msgs = ((InternalEObject)security).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IAasPackage.ASSET_ADMINISTRATION_SHELL__SECURITY, null, msgs);
			if (newSecurity != null)
				msgs = ((InternalEObject)newSecurity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IAasPackage.ASSET_ADMINISTRATION_SHELL__SECURITY, null, msgs);
			msgs = basicSetSecurity(newSecurity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.ASSET_ADMINISTRATION_SHELL__SECURITY, newSecurity, newSecurity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IAsset getAsset() {
		if (asset != null && ((EObject)asset).eIsProxy()) {
			InternalEObject oldAsset = (InternalEObject)asset;
			asset = (IAsset)eResolveProxy(oldAsset);
			if (asset != oldAsset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IAasPackage.ASSET_ADMINISTRATION_SHELL__ASSET, oldAsset, asset));
			}
		}
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAsset basicGetAsset() {
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAsset(IAsset newAsset) {
		IAsset oldAsset = asset;
		asset = newAsset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.ASSET_ADMINISTRATION_SHELL__ASSET, oldAsset, asset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ISubmodel> getSubmodel() {
		if (submodel == null) {
			submodel = new EObjectResolvingEList<ISubmodel>(ISubmodel.class, this, IAasPackage.ASSET_ADMINISTRATION_SHELL__SUBMODEL);
		}
		return submodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IView> getView() {
		if (view == null) {
			view = new EObjectContainmentEList<IView>(IView.class, this, IAasPackage.ASSET_ADMINISTRATION_SHELL__VIEW);
		}
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IConceptDictionary> getConceptDictionary() {
		if (conceptDictionary == null) {
			conceptDictionary = new EObjectResolvingEList<IConceptDictionary>(IConceptDictionary.class, this, IAasPackage.ASSET_ADMINISTRATION_SHELL__CONCEPT_DICTIONARY);
		}
		return conceptDictionary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__ADMINISTRATION:
				return basicSetAdministration(null, msgs);
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__IDENTIFICATION:
				return basicSetIdentification(null, msgs);
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__SECURITY:
				return basicSetSecurity(null, msgs);
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__VIEW:
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
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__DATA_SPECIFICATION:
				return getDataSpecification();
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__ID_SHORT:
				return getIdShort();
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__CATEGORY:
				return getCategory();
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__DESCRIPTION:
				return getDescription();
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__ADMINISTRATION:
				return getAdministration();
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__IDENTIFICATION:
				return getIdentification();
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__DERIVED_FROM:
				if (resolve) return getDerivedFrom();
				return basicGetDerivedFrom();
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__SECURITY:
				return getSecurity();
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__ASSET:
				if (resolve) return getAsset();
				return basicGetAsset();
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__SUBMODEL:
				return getSubmodel();
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__VIEW:
				return getView();
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__CONCEPT_DICTIONARY:
				return getConceptDictionary();
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
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__DATA_SPECIFICATION:
				getDataSpecification().clear();
				getDataSpecification().addAll((Collection<? extends IReference>)newValue);
				return;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__ID_SHORT:
				setIdShort((String)newValue);
				return;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__CATEGORY:
				setCategory((String)newValue);
				return;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__PARENT:
				setParent((IReferable)newValue);
				return;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__ADMINISTRATION:
				setAdministration((IAdministrativeInformation)newValue);
				return;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__IDENTIFICATION:
				setIdentification((IIdentifier)newValue);
				return;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__DERIVED_FROM:
				setDerivedFrom((IAssetAdministrationShell)newValue);
				return;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__SECURITY:
				setSecurity((ISecurity)newValue);
				return;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__ASSET:
				setAsset((IAsset)newValue);
				return;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__SUBMODEL:
				getSubmodel().clear();
				getSubmodel().addAll((Collection<? extends ISubmodel>)newValue);
				return;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__VIEW:
				getView().clear();
				getView().addAll((Collection<? extends IView>)newValue);
				return;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__CONCEPT_DICTIONARY:
				getConceptDictionary().clear();
				getConceptDictionary().addAll((Collection<? extends IConceptDictionary>)newValue);
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
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__DATA_SPECIFICATION:
				getDataSpecification().clear();
				return;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__ID_SHORT:
				setIdShort(ID_SHORT_EDEFAULT);
				return;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__PARENT:
				setParent((IReferable)null);
				return;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__ADMINISTRATION:
				setAdministration((IAdministrativeInformation)null);
				return;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__IDENTIFICATION:
				setIdentification((IIdentifier)null);
				return;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__DERIVED_FROM:
				setDerivedFrom((IAssetAdministrationShell)null);
				return;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__SECURITY:
				setSecurity((ISecurity)null);
				return;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__ASSET:
				setAsset((IAsset)null);
				return;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__SUBMODEL:
				getSubmodel().clear();
				return;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__VIEW:
				getView().clear();
				return;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__CONCEPT_DICTIONARY:
				getConceptDictionary().clear();
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
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__DATA_SPECIFICATION:
				return dataSpecification != null && !dataSpecification.isEmpty();
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__ID_SHORT:
				return ID_SHORT_EDEFAULT == null ? idShort != null : !ID_SHORT_EDEFAULT.equals(idShort);
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__PARENT:
				return parent != null;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__ADMINISTRATION:
				return administration != null;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__IDENTIFICATION:
				return identification != null;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__DERIVED_FROM:
				return derivedFrom != null;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__SECURITY:
				return security != null;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__ASSET:
				return asset != null;
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__SUBMODEL:
				return submodel != null && !submodel.isEmpty();
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__VIEW:
				return view != null && !view.isEmpty();
			case IAasPackage.ASSET_ADMINISTRATION_SHELL__CONCEPT_DICTIONARY:
				return conceptDictionary != null && !conceptDictionary.isEmpty();
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
				case IAasPackage.ASSET_ADMINISTRATION_SHELL__ID_SHORT: return IAasPackage.REFERABLE__ID_SHORT;
				case IAasPackage.ASSET_ADMINISTRATION_SHELL__CATEGORY: return IAasPackage.REFERABLE__CATEGORY;
				case IAasPackage.ASSET_ADMINISTRATION_SHELL__DESCRIPTION: return IAasPackage.REFERABLE__DESCRIPTION;
				case IAasPackage.ASSET_ADMINISTRATION_SHELL__PARENT: return IAasPackage.REFERABLE__PARENT;
				default: return -1;
			}
		}
		if (baseClass == IIdentifiable.class) {
			switch (derivedFeatureID) {
				case IAasPackage.ASSET_ADMINISTRATION_SHELL__ADMINISTRATION: return IAasPackage.IDENTIFIABLE__ADMINISTRATION;
				case IAasPackage.ASSET_ADMINISTRATION_SHELL__IDENTIFICATION: return IAasPackage.IDENTIFIABLE__IDENTIFICATION;
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
				case IAasPackage.REFERABLE__ID_SHORT: return IAasPackage.ASSET_ADMINISTRATION_SHELL__ID_SHORT;
				case IAasPackage.REFERABLE__CATEGORY: return IAasPackage.ASSET_ADMINISTRATION_SHELL__CATEGORY;
				case IAasPackage.REFERABLE__DESCRIPTION: return IAasPackage.ASSET_ADMINISTRATION_SHELL__DESCRIPTION;
				case IAasPackage.REFERABLE__PARENT: return IAasPackage.ASSET_ADMINISTRATION_SHELL__PARENT;
				default: return -1;
			}
		}
		if (baseClass == IIdentifiable.class) {
			switch (baseFeatureID) {
				case IAasPackage.IDENTIFIABLE__ADMINISTRATION: return IAasPackage.ASSET_ADMINISTRATION_SHELL__ADMINISTRATION;
				case IAasPackage.IDENTIFIABLE__IDENTIFICATION: return IAasPackage.ASSET_ADMINISTRATION_SHELL__IDENTIFICATION;
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
		result.append(')');
		return result.toString();
	}

} //AssetAdministrationShell
