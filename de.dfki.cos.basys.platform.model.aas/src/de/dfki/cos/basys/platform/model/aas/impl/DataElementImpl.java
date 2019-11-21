/**
 */
package de.dfki.cos.basys.platform.model.aas.impl;

import de.dfki.cos.basys.platform.model.aas.AasPackage;
import de.dfki.cos.basys.platform.model.aas.DataElement;
import de.dfki.cos.basys.platform.model.aas.SubmodelElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.DataElementImpl#getSubmodelelement <em>Submodelelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataElementImpl extends MinimalEObjectImpl.Container implements DataElement {
	/**
	 * The cached value of the '{@link #getSubmodelelement() <em>Submodelelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmodelelement()
	 * @generated
	 * @ordered
	 */
	protected SubmodelElement submodelelement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AasPackage.Literals.DATA_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubmodelElement getSubmodelelement() {
		if (submodelelement != null && submodelelement.eIsProxy()) {
			InternalEObject oldSubmodelelement = (InternalEObject)submodelelement;
			submodelelement = (SubmodelElement)eResolveProxy(oldSubmodelelement);
			if (submodelelement != oldSubmodelelement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AasPackage.DATA_ELEMENT__SUBMODELELEMENT, oldSubmodelelement, submodelelement));
			}
		}
		return submodelelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmodelElement basicGetSubmodelelement() {
		return submodelelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubmodelelement(SubmodelElement newSubmodelelement) {
		SubmodelElement oldSubmodelelement = submodelelement;
		submodelelement = newSubmodelelement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.DATA_ELEMENT__SUBMODELELEMENT, oldSubmodelelement, submodelelement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AasPackage.DATA_ELEMENT__SUBMODELELEMENT:
				if (resolve) return getSubmodelelement();
				return basicGetSubmodelelement();
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
			case AasPackage.DATA_ELEMENT__SUBMODELELEMENT:
				setSubmodelelement((SubmodelElement)newValue);
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
			case AasPackage.DATA_ELEMENT__SUBMODELELEMENT:
				setSubmodelelement((SubmodelElement)null);
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
			case AasPackage.DATA_ELEMENT__SUBMODELELEMENT:
				return submodelelement != null;
		}
		return super.eIsSet(featureID);
	}

} //DataElementImpl
