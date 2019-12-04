/**
 */
package de.dfki.cos.basys.aas.impl;

import de.dfki.cos.basys.aas.IAasPackage;
import de.dfki.cos.basys.aas.IAdministrativeInformation;
import de.dfki.cos.basys.aas.IConceptDescription;
import de.dfki.cos.basys.aas.IIdentifiable;
import de.dfki.cos.basys.aas.IIdentifier;
import de.dfki.cos.basys.aas.IReferable;
import de.dfki.cos.basys.aas.IReference;

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
 * An implementation of the model object '<em><b>Concept Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.aas.impl.ConceptDescription#getDataSpecification <em>Data Specification</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.ConceptDescription#getIdShort <em>Id Short</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.ConceptDescription#getCategory <em>Category</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.ConceptDescription#getDescription <em>Description</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.ConceptDescription#getParent <em>Parent</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.ConceptDescription#getAdministration <em>Administration</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.ConceptDescription#getIdentification <em>Identification</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.ConceptDescription#getIsCaseOf <em>Is Case Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptDescription extends MinimalEObjectImpl.Container implements IConceptDescription {
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
	 * The cached value of the '{@link #getIsCaseOf() <em>Is Case Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCaseOf()
	 * @generated
	 * @ordered
	 */
	protected EList<IReference> isCaseOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptDescription() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IAasPackage.Literals.CONCEPT_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IReference> getDataSpecification() {
		if (dataSpecification == null) {
			dataSpecification = new EObjectResolvingEList<IReference>(IReference.class, this, IAasPackage.CONCEPT_DESCRIPTION__DATA_SPECIFICATION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.CONCEPT_DESCRIPTION__ID_SHORT, oldIdShort, idShort));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.CONCEPT_DESCRIPTION__CATEGORY, oldCategory, category));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.CONCEPT_DESCRIPTION__DESCRIPTION, oldDescription, description));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IAasPackage.CONCEPT_DESCRIPTION__PARENT, oldParent, parent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.CONCEPT_DESCRIPTION__PARENT, oldParent, parent));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IAasPackage.CONCEPT_DESCRIPTION__ADMINISTRATION, oldAdministration, newAdministration);
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
				msgs = ((InternalEObject)administration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IAasPackage.CONCEPT_DESCRIPTION__ADMINISTRATION, null, msgs);
			if (newAdministration != null)
				msgs = ((InternalEObject)newAdministration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IAasPackage.CONCEPT_DESCRIPTION__ADMINISTRATION, null, msgs);
			msgs = basicSetAdministration(newAdministration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.CONCEPT_DESCRIPTION__ADMINISTRATION, newAdministration, newAdministration));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IAasPackage.CONCEPT_DESCRIPTION__IDENTIFICATION, oldIdentification, newIdentification);
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
				msgs = ((InternalEObject)identification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IAasPackage.CONCEPT_DESCRIPTION__IDENTIFICATION, null, msgs);
			if (newIdentification != null)
				msgs = ((InternalEObject)newIdentification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IAasPackage.CONCEPT_DESCRIPTION__IDENTIFICATION, null, msgs);
			msgs = basicSetIdentification(newIdentification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.CONCEPT_DESCRIPTION__IDENTIFICATION, newIdentification, newIdentification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IReference> getIsCaseOf() {
		if (isCaseOf == null) {
			isCaseOf = new EObjectContainmentEList<IReference>(IReference.class, this, IAasPackage.CONCEPT_DESCRIPTION__IS_CASE_OF);
		}
		return isCaseOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IAasPackage.CONCEPT_DESCRIPTION__ADMINISTRATION:
				return basicSetAdministration(null, msgs);
			case IAasPackage.CONCEPT_DESCRIPTION__IDENTIFICATION:
				return basicSetIdentification(null, msgs);
			case IAasPackage.CONCEPT_DESCRIPTION__IS_CASE_OF:
				return ((InternalEList<?>)getIsCaseOf()).basicRemove(otherEnd, msgs);
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
			case IAasPackage.CONCEPT_DESCRIPTION__DATA_SPECIFICATION:
				return getDataSpecification();
			case IAasPackage.CONCEPT_DESCRIPTION__ID_SHORT:
				return getIdShort();
			case IAasPackage.CONCEPT_DESCRIPTION__CATEGORY:
				return getCategory();
			case IAasPackage.CONCEPT_DESCRIPTION__DESCRIPTION:
				return getDescription();
			case IAasPackage.CONCEPT_DESCRIPTION__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case IAasPackage.CONCEPT_DESCRIPTION__ADMINISTRATION:
				return getAdministration();
			case IAasPackage.CONCEPT_DESCRIPTION__IDENTIFICATION:
				return getIdentification();
			case IAasPackage.CONCEPT_DESCRIPTION__IS_CASE_OF:
				return getIsCaseOf();
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
			case IAasPackage.CONCEPT_DESCRIPTION__DATA_SPECIFICATION:
				getDataSpecification().clear();
				getDataSpecification().addAll((Collection<? extends IReference>)newValue);
				return;
			case IAasPackage.CONCEPT_DESCRIPTION__ID_SHORT:
				setIdShort((String)newValue);
				return;
			case IAasPackage.CONCEPT_DESCRIPTION__CATEGORY:
				setCategory((String)newValue);
				return;
			case IAasPackage.CONCEPT_DESCRIPTION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case IAasPackage.CONCEPT_DESCRIPTION__PARENT:
				setParent((IReferable)newValue);
				return;
			case IAasPackage.CONCEPT_DESCRIPTION__ADMINISTRATION:
				setAdministration((IAdministrativeInformation)newValue);
				return;
			case IAasPackage.CONCEPT_DESCRIPTION__IDENTIFICATION:
				setIdentification((IIdentifier)newValue);
				return;
			case IAasPackage.CONCEPT_DESCRIPTION__IS_CASE_OF:
				getIsCaseOf().clear();
				getIsCaseOf().addAll((Collection<? extends IReference>)newValue);
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
			case IAasPackage.CONCEPT_DESCRIPTION__DATA_SPECIFICATION:
				getDataSpecification().clear();
				return;
			case IAasPackage.CONCEPT_DESCRIPTION__ID_SHORT:
				setIdShort(ID_SHORT_EDEFAULT);
				return;
			case IAasPackage.CONCEPT_DESCRIPTION__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case IAasPackage.CONCEPT_DESCRIPTION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case IAasPackage.CONCEPT_DESCRIPTION__PARENT:
				setParent((IReferable)null);
				return;
			case IAasPackage.CONCEPT_DESCRIPTION__ADMINISTRATION:
				setAdministration((IAdministrativeInformation)null);
				return;
			case IAasPackage.CONCEPT_DESCRIPTION__IDENTIFICATION:
				setIdentification((IIdentifier)null);
				return;
			case IAasPackage.CONCEPT_DESCRIPTION__IS_CASE_OF:
				getIsCaseOf().clear();
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
			case IAasPackage.CONCEPT_DESCRIPTION__DATA_SPECIFICATION:
				return dataSpecification != null && !dataSpecification.isEmpty();
			case IAasPackage.CONCEPT_DESCRIPTION__ID_SHORT:
				return ID_SHORT_EDEFAULT == null ? idShort != null : !ID_SHORT_EDEFAULT.equals(idShort);
			case IAasPackage.CONCEPT_DESCRIPTION__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case IAasPackage.CONCEPT_DESCRIPTION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case IAasPackage.CONCEPT_DESCRIPTION__PARENT:
				return parent != null;
			case IAasPackage.CONCEPT_DESCRIPTION__ADMINISTRATION:
				return administration != null;
			case IAasPackage.CONCEPT_DESCRIPTION__IDENTIFICATION:
				return identification != null;
			case IAasPackage.CONCEPT_DESCRIPTION__IS_CASE_OF:
				return isCaseOf != null && !isCaseOf.isEmpty();
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
				case IAasPackage.CONCEPT_DESCRIPTION__ID_SHORT: return IAasPackage.REFERABLE__ID_SHORT;
				case IAasPackage.CONCEPT_DESCRIPTION__CATEGORY: return IAasPackage.REFERABLE__CATEGORY;
				case IAasPackage.CONCEPT_DESCRIPTION__DESCRIPTION: return IAasPackage.REFERABLE__DESCRIPTION;
				case IAasPackage.CONCEPT_DESCRIPTION__PARENT: return IAasPackage.REFERABLE__PARENT;
				default: return -1;
			}
		}
		if (baseClass == IIdentifiable.class) {
			switch (derivedFeatureID) {
				case IAasPackage.CONCEPT_DESCRIPTION__ADMINISTRATION: return IAasPackage.IDENTIFIABLE__ADMINISTRATION;
				case IAasPackage.CONCEPT_DESCRIPTION__IDENTIFICATION: return IAasPackage.IDENTIFIABLE__IDENTIFICATION;
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
				case IAasPackage.REFERABLE__ID_SHORT: return IAasPackage.CONCEPT_DESCRIPTION__ID_SHORT;
				case IAasPackage.REFERABLE__CATEGORY: return IAasPackage.CONCEPT_DESCRIPTION__CATEGORY;
				case IAasPackage.REFERABLE__DESCRIPTION: return IAasPackage.CONCEPT_DESCRIPTION__DESCRIPTION;
				case IAasPackage.REFERABLE__PARENT: return IAasPackage.CONCEPT_DESCRIPTION__PARENT;
				default: return -1;
			}
		}
		if (baseClass == IIdentifiable.class) {
			switch (baseFeatureID) {
				case IAasPackage.IDENTIFIABLE__ADMINISTRATION: return IAasPackage.CONCEPT_DESCRIPTION__ADMINISTRATION;
				case IAasPackage.IDENTIFIABLE__IDENTIFICATION: return IAasPackage.CONCEPT_DESCRIPTION__IDENTIFICATION;
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

} //ConceptDescription
