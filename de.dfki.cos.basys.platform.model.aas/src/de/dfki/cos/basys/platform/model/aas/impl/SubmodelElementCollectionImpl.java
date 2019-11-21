/**
 */
package de.dfki.cos.basys.platform.model.aas.impl;

import de.dfki.cos.basys.platform.model.aas.AasPackage;
import de.dfki.cos.basys.platform.model.aas.SubmodelElement;
import de.dfki.cos.basys.platform.model.aas.SubmodelElementCollection;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Submodel Element Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.SubmodelElementCollectionImpl#isAllowDuplicates <em>Allow Duplicates</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.SubmodelElementCollectionImpl#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.SubmodelElementCollectionImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubmodelElementCollectionImpl extends SubmodelElementImpl implements SubmodelElementCollection {
	/**
	 * The default value of the '{@link #isAllowDuplicates() <em>Allow Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowDuplicates()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_DUPLICATES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowDuplicates() <em>Allow Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowDuplicates()
	 * @generated
	 * @ordered
	 */
	protected boolean allowDuplicates = ALLOW_DUPLICATES_EDEFAULT;

	/**
	 * The default value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean ordered = ORDERED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<SubmodelElement> value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubmodelElementCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AasPackage.Literals.SUBMODEL_ELEMENT_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowDuplicates() {
		return allowDuplicates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowDuplicates(boolean newAllowDuplicates) {
		boolean oldAllowDuplicates = allowDuplicates;
		allowDuplicates = newAllowDuplicates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.SUBMODEL_ELEMENT_COLLECTION__ALLOW_DUPLICATES, oldAllowDuplicates, allowDuplicates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOrdered() {
		return ordered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrdered(boolean newOrdered) {
		boolean oldOrdered = ordered;
		ordered = newOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.SUBMODEL_ELEMENT_COLLECTION__ORDERED, oldOrdered, ordered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubmodelElement> getValue() {
		if (value == null) {
			value = new EObjectContainmentEList<SubmodelElement>(SubmodelElement.class, this, AasPackage.SUBMODEL_ELEMENT_COLLECTION__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AasPackage.SUBMODEL_ELEMENT_COLLECTION__VALUE:
				return ((InternalEList<?>)getValue()).basicRemove(otherEnd, msgs);
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
			case AasPackage.SUBMODEL_ELEMENT_COLLECTION__ALLOW_DUPLICATES:
				return isAllowDuplicates();
			case AasPackage.SUBMODEL_ELEMENT_COLLECTION__ORDERED:
				return isOrdered();
			case AasPackage.SUBMODEL_ELEMENT_COLLECTION__VALUE:
				return getValue();
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
			case AasPackage.SUBMODEL_ELEMENT_COLLECTION__ALLOW_DUPLICATES:
				setAllowDuplicates((Boolean)newValue);
				return;
			case AasPackage.SUBMODEL_ELEMENT_COLLECTION__ORDERED:
				setOrdered((Boolean)newValue);
				return;
			case AasPackage.SUBMODEL_ELEMENT_COLLECTION__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends SubmodelElement>)newValue);
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
			case AasPackage.SUBMODEL_ELEMENT_COLLECTION__ALLOW_DUPLICATES:
				setAllowDuplicates(ALLOW_DUPLICATES_EDEFAULT);
				return;
			case AasPackage.SUBMODEL_ELEMENT_COLLECTION__ORDERED:
				setOrdered(ORDERED_EDEFAULT);
				return;
			case AasPackage.SUBMODEL_ELEMENT_COLLECTION__VALUE:
				getValue().clear();
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
			case AasPackage.SUBMODEL_ELEMENT_COLLECTION__ALLOW_DUPLICATES:
				return allowDuplicates != ALLOW_DUPLICATES_EDEFAULT;
			case AasPackage.SUBMODEL_ELEMENT_COLLECTION__ORDERED:
				return ordered != ORDERED_EDEFAULT;
			case AasPackage.SUBMODEL_ELEMENT_COLLECTION__VALUE:
				return value != null && !value.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (allowDuplicates: ");
		result.append(allowDuplicates);
		result.append(", ordered: ");
		result.append(ordered);
		result.append(')');
		return result.toString();
	}

} //SubmodelElementCollectionImpl
