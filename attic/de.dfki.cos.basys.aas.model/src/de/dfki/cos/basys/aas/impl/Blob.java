/**
 */
package de.dfki.cos.basys.aas.impl;

import de.dfki.cos.basys.aas.IAasPackage;
import de.dfki.cos.basys.aas.IBlob;
import de.dfki.cos.basys.aas.IConstraint;
import de.dfki.cos.basys.aas.IHasKind;
import de.dfki.cos.basys.aas.IHasSemantics;
import de.dfki.cos.basys.aas.IQualifiable;
import de.dfki.cos.basys.aas.IReferable;
import de.dfki.cos.basys.aas.IReference;
import de.dfki.cos.basys.aas.ModelingKind;

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
 * An implementation of the model object '<em><b>Blob</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.aas.impl.Blob#getDataSpecification <em>Data Specification</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.Blob#getIdShort <em>Id Short</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.Blob#getCategory <em>Category</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.Blob#getDescription <em>Description</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.Blob#getParent <em>Parent</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.Blob#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.Blob#getSemanticId <em>Semantic Id</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.Blob#getKind <em>Kind</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.Blob#getValue <em>Value</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.impl.Blob#getMimeType <em>Mime Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Blob extends MinimalEObjectImpl.Container implements IBlob {
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
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected IConstraint qualifier;

	/**
	 * The cached value of the '{@link #getSemanticId() <em>Semantic Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticId()
	 * @generated
	 * @ordered
	 */
	protected IReference semanticId;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ModelingKind KIND_EDEFAULT = ModelingKind.TEMPLATE;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ModelingKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected static final String MIME_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected String mimeType = MIME_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Blob() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IAasPackage.Literals.BLOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IReference> getDataSpecification() {
		if (dataSpecification == null) {
			dataSpecification = new EObjectResolvingEList<IReference>(IReference.class, this, IAasPackage.BLOB__DATA_SPECIFICATION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.BLOB__ID_SHORT, oldIdShort, idShort));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.BLOB__CATEGORY, oldCategory, category));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.BLOB__DESCRIPTION, oldDescription, description));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IAasPackage.BLOB__PARENT, oldParent, parent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.BLOB__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IConstraint getQualifier() {
		if (qualifier != null && ((EObject)qualifier).eIsProxy()) {
			InternalEObject oldQualifier = (InternalEObject)qualifier;
			qualifier = (IConstraint)eResolveProxy(oldQualifier);
			if (qualifier != oldQualifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IAasPackage.BLOB__QUALIFIER, oldQualifier, qualifier));
			}
		}
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IConstraint basicGetQualifier() {
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQualifier(IConstraint newQualifier) {
		IConstraint oldQualifier = qualifier;
		qualifier = newQualifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.BLOB__QUALIFIER, oldQualifier, qualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IReference getSemanticId() {
		return semanticId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemanticId(IReference newSemanticId, NotificationChain msgs) {
		IReference oldSemanticId = semanticId;
		semanticId = newSemanticId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IAasPackage.BLOB__SEMANTIC_ID, oldSemanticId, newSemanticId);
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
	public void setSemanticId(IReference newSemanticId) {
		if (newSemanticId != semanticId) {
			NotificationChain msgs = null;
			if (semanticId != null)
				msgs = ((InternalEObject)semanticId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IAasPackage.BLOB__SEMANTIC_ID, null, msgs);
			if (newSemanticId != null)
				msgs = ((InternalEObject)newSemanticId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IAasPackage.BLOB__SEMANTIC_ID, null, msgs);
			msgs = basicSetSemanticId(newSemanticId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.BLOB__SEMANTIC_ID, newSemanticId, newSemanticId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelingKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(ModelingKind newKind) {
		ModelingKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.BLOB__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.BLOB__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMimeType() {
		return mimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMimeType(String newMimeType) {
		String oldMimeType = mimeType;
		mimeType = newMimeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IAasPackage.BLOB__MIME_TYPE, oldMimeType, mimeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IAasPackage.BLOB__SEMANTIC_ID:
				return basicSetSemanticId(null, msgs);
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
			case IAasPackage.BLOB__DATA_SPECIFICATION:
				return getDataSpecification();
			case IAasPackage.BLOB__ID_SHORT:
				return getIdShort();
			case IAasPackage.BLOB__CATEGORY:
				return getCategory();
			case IAasPackage.BLOB__DESCRIPTION:
				return getDescription();
			case IAasPackage.BLOB__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case IAasPackage.BLOB__QUALIFIER:
				if (resolve) return getQualifier();
				return basicGetQualifier();
			case IAasPackage.BLOB__SEMANTIC_ID:
				return getSemanticId();
			case IAasPackage.BLOB__KIND:
				return getKind();
			case IAasPackage.BLOB__VALUE:
				return getValue();
			case IAasPackage.BLOB__MIME_TYPE:
				return getMimeType();
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
			case IAasPackage.BLOB__DATA_SPECIFICATION:
				getDataSpecification().clear();
				getDataSpecification().addAll((Collection<? extends IReference>)newValue);
				return;
			case IAasPackage.BLOB__ID_SHORT:
				setIdShort((String)newValue);
				return;
			case IAasPackage.BLOB__CATEGORY:
				setCategory((String)newValue);
				return;
			case IAasPackage.BLOB__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case IAasPackage.BLOB__PARENT:
				setParent((IReferable)newValue);
				return;
			case IAasPackage.BLOB__QUALIFIER:
				setQualifier((IConstraint)newValue);
				return;
			case IAasPackage.BLOB__SEMANTIC_ID:
				setSemanticId((IReference)newValue);
				return;
			case IAasPackage.BLOB__KIND:
				setKind((ModelingKind)newValue);
				return;
			case IAasPackage.BLOB__VALUE:
				setValue((String)newValue);
				return;
			case IAasPackage.BLOB__MIME_TYPE:
				setMimeType((String)newValue);
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
			case IAasPackage.BLOB__DATA_SPECIFICATION:
				getDataSpecification().clear();
				return;
			case IAasPackage.BLOB__ID_SHORT:
				setIdShort(ID_SHORT_EDEFAULT);
				return;
			case IAasPackage.BLOB__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case IAasPackage.BLOB__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case IAasPackage.BLOB__PARENT:
				setParent((IReferable)null);
				return;
			case IAasPackage.BLOB__QUALIFIER:
				setQualifier((IConstraint)null);
				return;
			case IAasPackage.BLOB__SEMANTIC_ID:
				setSemanticId((IReference)null);
				return;
			case IAasPackage.BLOB__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case IAasPackage.BLOB__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case IAasPackage.BLOB__MIME_TYPE:
				setMimeType(MIME_TYPE_EDEFAULT);
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
			case IAasPackage.BLOB__DATA_SPECIFICATION:
				return dataSpecification != null && !dataSpecification.isEmpty();
			case IAasPackage.BLOB__ID_SHORT:
				return ID_SHORT_EDEFAULT == null ? idShort != null : !ID_SHORT_EDEFAULT.equals(idShort);
			case IAasPackage.BLOB__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case IAasPackage.BLOB__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case IAasPackage.BLOB__PARENT:
				return parent != null;
			case IAasPackage.BLOB__QUALIFIER:
				return qualifier != null;
			case IAasPackage.BLOB__SEMANTIC_ID:
				return semanticId != null;
			case IAasPackage.BLOB__KIND:
				return kind != KIND_EDEFAULT;
			case IAasPackage.BLOB__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case IAasPackage.BLOB__MIME_TYPE:
				return MIME_TYPE_EDEFAULT == null ? mimeType != null : !MIME_TYPE_EDEFAULT.equals(mimeType);
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
				case IAasPackage.BLOB__ID_SHORT: return IAasPackage.REFERABLE__ID_SHORT;
				case IAasPackage.BLOB__CATEGORY: return IAasPackage.REFERABLE__CATEGORY;
				case IAasPackage.BLOB__DESCRIPTION: return IAasPackage.REFERABLE__DESCRIPTION;
				case IAasPackage.BLOB__PARENT: return IAasPackage.REFERABLE__PARENT;
				default: return -1;
			}
		}
		if (baseClass == IQualifiable.class) {
			switch (derivedFeatureID) {
				case IAasPackage.BLOB__QUALIFIER: return IAasPackage.QUALIFIABLE__QUALIFIER;
				default: return -1;
			}
		}
		if (baseClass == IHasSemantics.class) {
			switch (derivedFeatureID) {
				case IAasPackage.BLOB__SEMANTIC_ID: return IAasPackage.HAS_SEMANTICS__SEMANTIC_ID;
				default: return -1;
			}
		}
		if (baseClass == IHasKind.class) {
			switch (derivedFeatureID) {
				case IAasPackage.BLOB__KIND: return IAasPackage.HAS_KIND__KIND;
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
				case IAasPackage.REFERABLE__ID_SHORT: return IAasPackage.BLOB__ID_SHORT;
				case IAasPackage.REFERABLE__CATEGORY: return IAasPackage.BLOB__CATEGORY;
				case IAasPackage.REFERABLE__DESCRIPTION: return IAasPackage.BLOB__DESCRIPTION;
				case IAasPackage.REFERABLE__PARENT: return IAasPackage.BLOB__PARENT;
				default: return -1;
			}
		}
		if (baseClass == IQualifiable.class) {
			switch (baseFeatureID) {
				case IAasPackage.QUALIFIABLE__QUALIFIER: return IAasPackage.BLOB__QUALIFIER;
				default: return -1;
			}
		}
		if (baseClass == IHasSemantics.class) {
			switch (baseFeatureID) {
				case IAasPackage.HAS_SEMANTICS__SEMANTIC_ID: return IAasPackage.BLOB__SEMANTIC_ID;
				default: return -1;
			}
		}
		if (baseClass == IHasKind.class) {
			switch (baseFeatureID) {
				case IAasPackage.HAS_KIND__KIND: return IAasPackage.BLOB__KIND;
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
		result.append(", value: ");
		result.append(value);
		result.append(", mimeType: ");
		result.append(mimeType);
		result.append(')');
		return result.toString();
	}

} //Blob
