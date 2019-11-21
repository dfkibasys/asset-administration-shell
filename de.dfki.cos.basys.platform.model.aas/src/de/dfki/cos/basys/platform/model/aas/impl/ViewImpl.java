/**
 */
package de.dfki.cos.basys.platform.model.aas.impl;

import de.dfki.cos.basys.platform.model.aas.AasPackage;
import de.dfki.cos.basys.platform.model.aas.HasSemantics;
import de.dfki.cos.basys.platform.model.aas.Referable;
import de.dfki.cos.basys.platform.model.aas.Reference;
import de.dfki.cos.basys.platform.model.aas.View;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.ViewImpl#getSemanticId <em>Semantic Id</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.ViewImpl#getIdShort <em>Id Short</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.ViewImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.ViewImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.ViewImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.ViewImpl#getContainedElement <em>Contained Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewImpl extends MinimalEObjectImpl.Container implements View {
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
	 * The cached value of the '{@link #getContainedElement() <em>Contained Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Referable> containedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AasPackage.Literals.VIEW;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AasPackage.VIEW__SEMANTIC_ID, oldSemanticId, semanticId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.VIEW__SEMANTIC_ID, oldSemanticId, semanticId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.VIEW__ID_SHORT, oldIdShort, idShort));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.VIEW__CATEGORY, oldCategory, category));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.VIEW__DESCRIPTION, oldDescription, description));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AasPackage.VIEW__PARENT, oldParent, parent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.VIEW__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Referable> getContainedElement() {
		if (containedElement == null) {
			containedElement = new EObjectResolvingEList<Referable>(Referable.class, this, AasPackage.VIEW__CONTAINED_ELEMENT);
		}
		return containedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AasPackage.VIEW__SEMANTIC_ID:
				if (resolve) return getSemanticId();
				return basicGetSemanticId();
			case AasPackage.VIEW__ID_SHORT:
				return getIdShort();
			case AasPackage.VIEW__CATEGORY:
				return getCategory();
			case AasPackage.VIEW__DESCRIPTION:
				return getDescription();
			case AasPackage.VIEW__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case AasPackage.VIEW__CONTAINED_ELEMENT:
				return getContainedElement();
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
			case AasPackage.VIEW__SEMANTIC_ID:
				setSemanticId((Reference)newValue);
				return;
			case AasPackage.VIEW__ID_SHORT:
				setIdShort((String)newValue);
				return;
			case AasPackage.VIEW__CATEGORY:
				setCategory((String)newValue);
				return;
			case AasPackage.VIEW__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AasPackage.VIEW__PARENT:
				setParent((Referable)newValue);
				return;
			case AasPackage.VIEW__CONTAINED_ELEMENT:
				getContainedElement().clear();
				getContainedElement().addAll((Collection<? extends Referable>)newValue);
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
			case AasPackage.VIEW__SEMANTIC_ID:
				setSemanticId((Reference)null);
				return;
			case AasPackage.VIEW__ID_SHORT:
				setIdShort(ID_SHORT_EDEFAULT);
				return;
			case AasPackage.VIEW__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case AasPackage.VIEW__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AasPackage.VIEW__PARENT:
				setParent((Referable)null);
				return;
			case AasPackage.VIEW__CONTAINED_ELEMENT:
				getContainedElement().clear();
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
			case AasPackage.VIEW__SEMANTIC_ID:
				return semanticId != null;
			case AasPackage.VIEW__ID_SHORT:
				return ID_SHORT_EDEFAULT == null ? idShort != null : !ID_SHORT_EDEFAULT.equals(idShort);
			case AasPackage.VIEW__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case AasPackage.VIEW__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AasPackage.VIEW__PARENT:
				return parent != null;
			case AasPackage.VIEW__CONTAINED_ELEMENT:
				return containedElement != null && !containedElement.isEmpty();
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
		if (baseClass == HasSemantics.class) {
			switch (derivedFeatureID) {
				case AasPackage.VIEW__SEMANTIC_ID: return AasPackage.HAS_SEMANTICS__SEMANTIC_ID;
				default: return -1;
			}
		}
		if (baseClass == Referable.class) {
			switch (derivedFeatureID) {
				case AasPackage.VIEW__ID_SHORT: return AasPackage.REFERABLE__ID_SHORT;
				case AasPackage.VIEW__CATEGORY: return AasPackage.REFERABLE__CATEGORY;
				case AasPackage.VIEW__DESCRIPTION: return AasPackage.REFERABLE__DESCRIPTION;
				case AasPackage.VIEW__PARENT: return AasPackage.REFERABLE__PARENT;
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
		if (baseClass == HasSemantics.class) {
			switch (baseFeatureID) {
				case AasPackage.HAS_SEMANTICS__SEMANTIC_ID: return AasPackage.VIEW__SEMANTIC_ID;
				default: return -1;
			}
		}
		if (baseClass == Referable.class) {
			switch (baseFeatureID) {
				case AasPackage.REFERABLE__ID_SHORT: return AasPackage.VIEW__ID_SHORT;
				case AasPackage.REFERABLE__CATEGORY: return AasPackage.VIEW__CATEGORY;
				case AasPackage.REFERABLE__DESCRIPTION: return AasPackage.VIEW__DESCRIPTION;
				case AasPackage.REFERABLE__PARENT: return AasPackage.VIEW__PARENT;
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

} //ViewImpl
