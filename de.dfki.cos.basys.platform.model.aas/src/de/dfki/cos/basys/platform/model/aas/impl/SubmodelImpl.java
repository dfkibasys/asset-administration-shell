/**
 */
package de.dfki.cos.basys.platform.model.aas.impl;

import de.dfki.cos.basys.platform.model.aas.AasPackage;
import de.dfki.cos.basys.platform.model.aas.AdministrativeInformation;
import de.dfki.cos.basys.platform.model.aas.HasKind;
import de.dfki.cos.basys.platform.model.aas.HasSemantics;
import de.dfki.cos.basys.platform.model.aas.Identifiable;
import de.dfki.cos.basys.platform.model.aas.Identifier;
import de.dfki.cos.basys.platform.model.aas.Kind;
import de.dfki.cos.basys.platform.model.aas.Qualifiable;
import de.dfki.cos.basys.platform.model.aas.Qualifier;
import de.dfki.cos.basys.platform.model.aas.Reference;
import de.dfki.cos.basys.platform.model.aas.Submodel;
import de.dfki.cos.basys.platform.model.aas.SubmodelElement;

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
 * An implementation of the model object '<em><b>Submodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.SubmodelImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.SubmodelImpl#getSemanticId <em>Semantic Id</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.SubmodelImpl#getAdministration <em>Administration</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.SubmodelImpl#getIdentification <em>Identification</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.SubmodelImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.SubmodelImpl#getSubmodelElement <em>Submodel Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubmodelImpl extends MinimalEObjectImpl.Container implements Submodel {
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
	 * The cached value of the '{@link #getSemanticId() <em>Semantic Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticId()
	 * @generated
	 * @ordered
	 */
	protected Reference semanticId;

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
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected Qualifier qualifier;

	/**
	 * The cached value of the '{@link #getSubmodelElement() <em>Submodel Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmodelElement()
	 * @generated
	 * @ordered
	 */
	protected EList<SubmodelElement> submodelElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubmodelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AasPackage.Literals.SUBMODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.SUBMODEL__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSemanticId() {
		if (semanticId != null && semanticId.eIsProxy()) {
			InternalEObject oldSemanticId = (InternalEObject)semanticId;
			semanticId = (Reference)eResolveProxy(oldSemanticId);
			if (semanticId != oldSemanticId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AasPackage.SUBMODEL__SEMANTIC_ID, oldSemanticId, semanticId));
			}
		}
		return semanticId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference basicGetSemanticId() {
		return semanticId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemanticId(Reference newSemanticId) {
		Reference oldSemanticId = semanticId;
		semanticId = newSemanticId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.SUBMODEL__SEMANTIC_ID, oldSemanticId, semanticId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AasPackage.SUBMODEL__ADMINISTRATION, oldAdministration, administration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.SUBMODEL__ADMINISTRATION, oldAdministration, administration));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AasPackage.SUBMODEL__IDENTIFICATION, oldIdentification, identification));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.SUBMODEL__IDENTIFICATION, oldIdentification, identification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Qualifier getQualifier() {
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQualifier(Qualifier newQualifier, NotificationChain msgs) {
		Qualifier oldQualifier = qualifier;
		qualifier = newQualifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AasPackage.SUBMODEL__QUALIFIER, oldQualifier, newQualifier);
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
	public void setQualifier(Qualifier newQualifier) {
		if (newQualifier != qualifier) {
			NotificationChain msgs = null;
			if (qualifier != null)
				msgs = ((InternalEObject)qualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AasPackage.SUBMODEL__QUALIFIER, null, msgs);
			if (newQualifier != null)
				msgs = ((InternalEObject)newQualifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AasPackage.SUBMODEL__QUALIFIER, null, msgs);
			msgs = basicSetQualifier(newQualifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.SUBMODEL__QUALIFIER, newQualifier, newQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubmodelElement> getSubmodelElement() {
		if (submodelElement == null) {
			submodelElement = new EObjectContainmentEList<SubmodelElement>(SubmodelElement.class, this, AasPackage.SUBMODEL__SUBMODEL_ELEMENT);
		}
		return submodelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AasPackage.SUBMODEL__QUALIFIER:
				return basicSetQualifier(null, msgs);
			case AasPackage.SUBMODEL__SUBMODEL_ELEMENT:
				return ((InternalEList<?>)getSubmodelElement()).basicRemove(otherEnd, msgs);
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
			case AasPackage.SUBMODEL__KIND:
				return getKind();
			case AasPackage.SUBMODEL__SEMANTIC_ID:
				if (resolve) return getSemanticId();
				return basicGetSemanticId();
			case AasPackage.SUBMODEL__ADMINISTRATION:
				if (resolve) return getAdministration();
				return basicGetAdministration();
			case AasPackage.SUBMODEL__IDENTIFICATION:
				if (resolve) return getIdentification();
				return basicGetIdentification();
			case AasPackage.SUBMODEL__QUALIFIER:
				return getQualifier();
			case AasPackage.SUBMODEL__SUBMODEL_ELEMENT:
				return getSubmodelElement();
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
			case AasPackage.SUBMODEL__KIND:
				setKind((Kind)newValue);
				return;
			case AasPackage.SUBMODEL__SEMANTIC_ID:
				setSemanticId((Reference)newValue);
				return;
			case AasPackage.SUBMODEL__ADMINISTRATION:
				setAdministration((AdministrativeInformation)newValue);
				return;
			case AasPackage.SUBMODEL__IDENTIFICATION:
				setIdentification((Identifier)newValue);
				return;
			case AasPackage.SUBMODEL__QUALIFIER:
				setQualifier((Qualifier)newValue);
				return;
			case AasPackage.SUBMODEL__SUBMODEL_ELEMENT:
				getSubmodelElement().clear();
				getSubmodelElement().addAll((Collection<? extends SubmodelElement>)newValue);
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
			case AasPackage.SUBMODEL__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case AasPackage.SUBMODEL__SEMANTIC_ID:
				setSemanticId((Reference)null);
				return;
			case AasPackage.SUBMODEL__ADMINISTRATION:
				setAdministration((AdministrativeInformation)null);
				return;
			case AasPackage.SUBMODEL__IDENTIFICATION:
				setIdentification((Identifier)null);
				return;
			case AasPackage.SUBMODEL__QUALIFIER:
				setQualifier((Qualifier)null);
				return;
			case AasPackage.SUBMODEL__SUBMODEL_ELEMENT:
				getSubmodelElement().clear();
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
			case AasPackage.SUBMODEL__KIND:
				return kind != KIND_EDEFAULT;
			case AasPackage.SUBMODEL__SEMANTIC_ID:
				return semanticId != null;
			case AasPackage.SUBMODEL__ADMINISTRATION:
				return administration != null;
			case AasPackage.SUBMODEL__IDENTIFICATION:
				return identification != null;
			case AasPackage.SUBMODEL__QUALIFIER:
				return qualifier != null;
			case AasPackage.SUBMODEL__SUBMODEL_ELEMENT:
				return submodelElement != null && !submodelElement.isEmpty();
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
		if (baseClass == HasKind.class) {
			switch (derivedFeatureID) {
				case AasPackage.SUBMODEL__KIND: return AasPackage.HAS_KIND__KIND;
				default: return -1;
			}
		}
		if (baseClass == HasSemantics.class) {
			switch (derivedFeatureID) {
				case AasPackage.SUBMODEL__SEMANTIC_ID: return AasPackage.HAS_SEMANTICS__SEMANTIC_ID;
				default: return -1;
			}
		}
		if (baseClass == Identifiable.class) {
			switch (derivedFeatureID) {
				case AasPackage.SUBMODEL__ADMINISTRATION: return AasPackage.IDENTIFIABLE__ADMINISTRATION;
				case AasPackage.SUBMODEL__IDENTIFICATION: return AasPackage.IDENTIFIABLE__IDENTIFICATION;
				default: return -1;
			}
		}
		if (baseClass == Qualifiable.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == HasKind.class) {
			switch (baseFeatureID) {
				case AasPackage.HAS_KIND__KIND: return AasPackage.SUBMODEL__KIND;
				default: return -1;
			}
		}
		if (baseClass == HasSemantics.class) {
			switch (baseFeatureID) {
				case AasPackage.HAS_SEMANTICS__SEMANTIC_ID: return AasPackage.SUBMODEL__SEMANTIC_ID;
				default: return -1;
			}
		}
		if (baseClass == Identifiable.class) {
			switch (baseFeatureID) {
				case AasPackage.IDENTIFIABLE__ADMINISTRATION: return AasPackage.SUBMODEL__ADMINISTRATION;
				case AasPackage.IDENTIFIABLE__IDENTIFICATION: return AasPackage.SUBMODEL__IDENTIFICATION;
				default: return -1;
			}
		}
		if (baseClass == Qualifiable.class) {
			switch (baseFeatureID) {
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

} //SubmodelImpl
