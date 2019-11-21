/**
 */
package de.dfki.cos.basys.platform.model.aas.impl;

import de.dfki.cos.basys.platform.model.aas.AasPackage;
import de.dfki.cos.basys.platform.model.aas.Referable;
import de.dfki.cos.basys.platform.model.aas.RelationshipElement;
import de.dfki.cos.basys.platform.model.aas.SubmodelElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.RelationshipElementImpl#getSubmodelElement <em>Submodel Element</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.RelationshipElementImpl#getFirst <em>First</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.RelationshipElementImpl#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipElementImpl extends MinimalEObjectImpl.Container implements RelationshipElement {
	/**
	 * The cached value of the '{@link #getSubmodelElement() <em>Submodel Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmodelElement()
	 * @generated
	 * @ordered
	 */
	protected SubmodelElement submodelElement;

	/**
	 * The cached value of the '{@link #getFirst() <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst()
	 * @generated
	 * @ordered
	 */
	protected Referable first;

	/**
	 * The cached value of the '{@link #getSecond() <em>Second</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected Referable second;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AasPackage.Literals.RELATIONSHIP_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubmodelElement getSubmodelElement() {
		if (submodelElement != null && submodelElement.eIsProxy()) {
			InternalEObject oldSubmodelElement = (InternalEObject)submodelElement;
			submodelElement = (SubmodelElement)eResolveProxy(oldSubmodelElement);
			if (submodelElement != oldSubmodelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AasPackage.RELATIONSHIP_ELEMENT__SUBMODEL_ELEMENT, oldSubmodelElement, submodelElement));
			}
		}
		return submodelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmodelElement basicGetSubmodelElement() {
		return submodelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubmodelElement(SubmodelElement newSubmodelElement) {
		SubmodelElement oldSubmodelElement = submodelElement;
		submodelElement = newSubmodelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.RELATIONSHIP_ELEMENT__SUBMODEL_ELEMENT, oldSubmodelElement, submodelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Referable getFirst() {
		if (first != null && first.eIsProxy()) {
			InternalEObject oldFirst = (InternalEObject)first;
			first = (Referable)eResolveProxy(oldFirst);
			if (first != oldFirst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AasPackage.RELATIONSHIP_ELEMENT__FIRST, oldFirst, first));
			}
		}
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Referable basicGetFirst() {
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirst(Referable newFirst) {
		Referable oldFirst = first;
		first = newFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.RELATIONSHIP_ELEMENT__FIRST, oldFirst, first));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Referable getSecond() {
		if (second != null && second.eIsProxy()) {
			InternalEObject oldSecond = (InternalEObject)second;
			second = (Referable)eResolveProxy(oldSecond);
			if (second != oldSecond) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AasPackage.RELATIONSHIP_ELEMENT__SECOND, oldSecond, second));
			}
		}
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Referable basicGetSecond() {
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecond(Referable newSecond) {
		Referable oldSecond = second;
		second = newSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.RELATIONSHIP_ELEMENT__SECOND, oldSecond, second));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AasPackage.RELATIONSHIP_ELEMENT__SUBMODEL_ELEMENT:
				if (resolve) return getSubmodelElement();
				return basicGetSubmodelElement();
			case AasPackage.RELATIONSHIP_ELEMENT__FIRST:
				if (resolve) return getFirst();
				return basicGetFirst();
			case AasPackage.RELATIONSHIP_ELEMENT__SECOND:
				if (resolve) return getSecond();
				return basicGetSecond();
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
			case AasPackage.RELATIONSHIP_ELEMENT__SUBMODEL_ELEMENT:
				setSubmodelElement((SubmodelElement)newValue);
				return;
			case AasPackage.RELATIONSHIP_ELEMENT__FIRST:
				setFirst((Referable)newValue);
				return;
			case AasPackage.RELATIONSHIP_ELEMENT__SECOND:
				setSecond((Referable)newValue);
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
			case AasPackage.RELATIONSHIP_ELEMENT__SUBMODEL_ELEMENT:
				setSubmodelElement((SubmodelElement)null);
				return;
			case AasPackage.RELATIONSHIP_ELEMENT__FIRST:
				setFirst((Referable)null);
				return;
			case AasPackage.RELATIONSHIP_ELEMENT__SECOND:
				setSecond((Referable)null);
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
			case AasPackage.RELATIONSHIP_ELEMENT__SUBMODEL_ELEMENT:
				return submodelElement != null;
			case AasPackage.RELATIONSHIP_ELEMENT__FIRST:
				return first != null;
			case AasPackage.RELATIONSHIP_ELEMENT__SECOND:
				return second != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationshipElementImpl
