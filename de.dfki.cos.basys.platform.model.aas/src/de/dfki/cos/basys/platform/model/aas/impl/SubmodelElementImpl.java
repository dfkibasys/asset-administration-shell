/**
 */
package de.dfki.cos.basys.platform.model.aas.impl;

import de.dfki.cos.basys.platform.model.aas.AasPackage;
import de.dfki.cos.basys.platform.model.aas.HasKind;
import de.dfki.cos.basys.platform.model.aas.HasSemantics;
import de.dfki.cos.basys.platform.model.aas.Kind;
import de.dfki.cos.basys.platform.model.aas.Qualifiable;
import de.dfki.cos.basys.platform.model.aas.Qualifier;
import de.dfki.cos.basys.platform.model.aas.Referable;
import de.dfki.cos.basys.platform.model.aas.Reference;
import de.dfki.cos.basys.platform.model.aas.SubmodelElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Submodel Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.SubmodelElementImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.SubmodelElementImpl#getSemanticId <em>Semantic Id</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.SubmodelElementImpl#getIdShort <em>Id Short</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.SubmodelElementImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.SubmodelElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.SubmodelElementImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.SubmodelElementImpl#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SubmodelElementImpl extends MinimalEObjectImpl.Container implements SubmodelElement {
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
	protected Referable parent;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubmodelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AasPackage.Literals.SUBMODEL_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.SUBMODEL_ELEMENT__KIND, oldKind, kind));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AasPackage.SUBMODEL_ELEMENT__SEMANTIC_ID, oldSemanticId, semanticId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.SUBMODEL_ELEMENT__SEMANTIC_ID, oldSemanticId, semanticId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.SUBMODEL_ELEMENT__ID_SHORT, oldIdShort, idShort));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.SUBMODEL_ELEMENT__CATEGORY, oldCategory, category));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.SUBMODEL_ELEMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Referable getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (Referable)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AasPackage.SUBMODEL_ELEMENT__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Referable basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(Referable newParent) {
		Referable oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.SUBMODEL_ELEMENT__PARENT, oldParent, parent));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AasPackage.SUBMODEL_ELEMENT__QUALIFIER, oldQualifier, newQualifier);
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
				msgs = ((InternalEObject)qualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AasPackage.SUBMODEL_ELEMENT__QUALIFIER, null, msgs);
			if (newQualifier != null)
				msgs = ((InternalEObject)newQualifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AasPackage.SUBMODEL_ELEMENT__QUALIFIER, null, msgs);
			msgs = basicSetQualifier(newQualifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.SUBMODEL_ELEMENT__QUALIFIER, newQualifier, newQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AasPackage.SUBMODEL_ELEMENT__QUALIFIER:
				return basicSetQualifier(null, msgs);
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
			case AasPackage.SUBMODEL_ELEMENT__KIND:
				return getKind();
			case AasPackage.SUBMODEL_ELEMENT__SEMANTIC_ID:
				if (resolve) return getSemanticId();
				return basicGetSemanticId();
			case AasPackage.SUBMODEL_ELEMENT__ID_SHORT:
				return getIdShort();
			case AasPackage.SUBMODEL_ELEMENT__CATEGORY:
				return getCategory();
			case AasPackage.SUBMODEL_ELEMENT__DESCRIPTION:
				return getDescription();
			case AasPackage.SUBMODEL_ELEMENT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case AasPackage.SUBMODEL_ELEMENT__QUALIFIER:
				return getQualifier();
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
			case AasPackage.SUBMODEL_ELEMENT__KIND:
				setKind((Kind)newValue);
				return;
			case AasPackage.SUBMODEL_ELEMENT__SEMANTIC_ID:
				setSemanticId((Reference)newValue);
				return;
			case AasPackage.SUBMODEL_ELEMENT__ID_SHORT:
				setIdShort((String)newValue);
				return;
			case AasPackage.SUBMODEL_ELEMENT__CATEGORY:
				setCategory((String)newValue);
				return;
			case AasPackage.SUBMODEL_ELEMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AasPackage.SUBMODEL_ELEMENT__PARENT:
				setParent((Referable)newValue);
				return;
			case AasPackage.SUBMODEL_ELEMENT__QUALIFIER:
				setQualifier((Qualifier)newValue);
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
			case AasPackage.SUBMODEL_ELEMENT__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case AasPackage.SUBMODEL_ELEMENT__SEMANTIC_ID:
				setSemanticId((Reference)null);
				return;
			case AasPackage.SUBMODEL_ELEMENT__ID_SHORT:
				setIdShort(ID_SHORT_EDEFAULT);
				return;
			case AasPackage.SUBMODEL_ELEMENT__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case AasPackage.SUBMODEL_ELEMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AasPackage.SUBMODEL_ELEMENT__PARENT:
				setParent((Referable)null);
				return;
			case AasPackage.SUBMODEL_ELEMENT__QUALIFIER:
				setQualifier((Qualifier)null);
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
			case AasPackage.SUBMODEL_ELEMENT__KIND:
				return kind != KIND_EDEFAULT;
			case AasPackage.SUBMODEL_ELEMENT__SEMANTIC_ID:
				return semanticId != null;
			case AasPackage.SUBMODEL_ELEMENT__ID_SHORT:
				return ID_SHORT_EDEFAULT == null ? idShort != null : !ID_SHORT_EDEFAULT.equals(idShort);
			case AasPackage.SUBMODEL_ELEMENT__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case AasPackage.SUBMODEL_ELEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AasPackage.SUBMODEL_ELEMENT__PARENT:
				return parent != null;
			case AasPackage.SUBMODEL_ELEMENT__QUALIFIER:
				return qualifier != null;
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
				case AasPackage.SUBMODEL_ELEMENT__KIND: return AasPackage.HAS_KIND__KIND;
				default: return -1;
			}
		}
		if (baseClass == HasSemantics.class) {
			switch (derivedFeatureID) {
				case AasPackage.SUBMODEL_ELEMENT__SEMANTIC_ID: return AasPackage.HAS_SEMANTICS__SEMANTIC_ID;
				default: return -1;
			}
		}
		if (baseClass == Qualifiable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Referable.class) {
			switch (derivedFeatureID) {
				case AasPackage.SUBMODEL_ELEMENT__ID_SHORT: return AasPackage.REFERABLE__ID_SHORT;
				case AasPackage.SUBMODEL_ELEMENT__CATEGORY: return AasPackage.REFERABLE__CATEGORY;
				case AasPackage.SUBMODEL_ELEMENT__DESCRIPTION: return AasPackage.REFERABLE__DESCRIPTION;
				case AasPackage.SUBMODEL_ELEMENT__PARENT: return AasPackage.REFERABLE__PARENT;
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
				case AasPackage.HAS_KIND__KIND: return AasPackage.SUBMODEL_ELEMENT__KIND;
				default: return -1;
			}
		}
		if (baseClass == HasSemantics.class) {
			switch (baseFeatureID) {
				case AasPackage.HAS_SEMANTICS__SEMANTIC_ID: return AasPackage.SUBMODEL_ELEMENT__SEMANTIC_ID;
				default: return -1;
			}
		}
		if (baseClass == Qualifiable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Referable.class) {
			switch (baseFeatureID) {
				case AasPackage.REFERABLE__ID_SHORT: return AasPackage.SUBMODEL_ELEMENT__ID_SHORT;
				case AasPackage.REFERABLE__CATEGORY: return AasPackage.SUBMODEL_ELEMENT__CATEGORY;
				case AasPackage.REFERABLE__DESCRIPTION: return AasPackage.SUBMODEL_ELEMENT__DESCRIPTION;
				case AasPackage.REFERABLE__PARENT: return AasPackage.SUBMODEL_ELEMENT__PARENT;
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
		result.append(", idShort: ");
		result.append(idShort);
		result.append(", category: ");
		result.append(category);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //SubmodelElementImpl
