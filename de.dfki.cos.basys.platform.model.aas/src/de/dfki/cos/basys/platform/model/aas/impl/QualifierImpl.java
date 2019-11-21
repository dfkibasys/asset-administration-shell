/**
 */
package de.dfki.cos.basys.platform.model.aas.impl;

import de.dfki.cos.basys.platform.model.aas.AasPackage;
import de.dfki.cos.basys.platform.model.aas.HasSemantics;
import de.dfki.cos.basys.platform.model.aas.Qualifier;
import de.dfki.cos.basys.platform.model.aas.Reference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.QualifierImpl#getSemanticId <em>Semantic Id</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.QualifierImpl#getQualifierType <em>Qualifier Type</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.QualifierImpl#getQualifierValue <em>Qualifier Value</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.impl.QualifierImpl#getQualifierValueId <em>Qualifier Value Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualifierImpl extends MinimalEObjectImpl.Container implements Qualifier {
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
	 * The default value of the '{@link #getQualifierType() <em>Qualifier Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifierType()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifierType() <em>Qualifier Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifierType()
	 * @generated
	 * @ordered
	 */
	protected String qualifierType = QUALIFIER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualifierValue() <em>Qualifier Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifierValue()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIER_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifierValue() <em>Qualifier Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifierValue()
	 * @generated
	 * @ordered
	 */
	protected String qualifierValue = QUALIFIER_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualifierValueId() <em>Qualifier Value Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifierValueId()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIER_VALUE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifierValueId() <em>Qualifier Value Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifierValueId()
	 * @generated
	 * @ordered
	 */
	protected String qualifierValueId = QUALIFIER_VALUE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AasPackage.Literals.QUALIFIER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AasPackage.QUALIFIER__SEMANTIC_ID, oldSemanticId, semanticId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.QUALIFIER__SEMANTIC_ID, oldSemanticId, semanticId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQualifierType() {
		return qualifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQualifierType(String newQualifierType) {
		String oldQualifierType = qualifierType;
		qualifierType = newQualifierType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.QUALIFIER__QUALIFIER_TYPE, oldQualifierType, qualifierType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQualifierValue() {
		return qualifierValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQualifierValue(String newQualifierValue) {
		String oldQualifierValue = qualifierValue;
		qualifierValue = newQualifierValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.QUALIFIER__QUALIFIER_VALUE, oldQualifierValue, qualifierValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQualifierValueId() {
		return qualifierValueId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQualifierValueId(String newQualifierValueId) {
		String oldQualifierValueId = qualifierValueId;
		qualifierValueId = newQualifierValueId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AasPackage.QUALIFIER__QUALIFIER_VALUE_ID, oldQualifierValueId, qualifierValueId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AasPackage.QUALIFIER__SEMANTIC_ID:
				if (resolve) return getSemanticId();
				return basicGetSemanticId();
			case AasPackage.QUALIFIER__QUALIFIER_TYPE:
				return getQualifierType();
			case AasPackage.QUALIFIER__QUALIFIER_VALUE:
				return getQualifierValue();
			case AasPackage.QUALIFIER__QUALIFIER_VALUE_ID:
				return getQualifierValueId();
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
			case AasPackage.QUALIFIER__SEMANTIC_ID:
				setSemanticId((Reference)newValue);
				return;
			case AasPackage.QUALIFIER__QUALIFIER_TYPE:
				setQualifierType((String)newValue);
				return;
			case AasPackage.QUALIFIER__QUALIFIER_VALUE:
				setQualifierValue((String)newValue);
				return;
			case AasPackage.QUALIFIER__QUALIFIER_VALUE_ID:
				setQualifierValueId((String)newValue);
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
			case AasPackage.QUALIFIER__SEMANTIC_ID:
				setSemanticId((Reference)null);
				return;
			case AasPackage.QUALIFIER__QUALIFIER_TYPE:
				setQualifierType(QUALIFIER_TYPE_EDEFAULT);
				return;
			case AasPackage.QUALIFIER__QUALIFIER_VALUE:
				setQualifierValue(QUALIFIER_VALUE_EDEFAULT);
				return;
			case AasPackage.QUALIFIER__QUALIFIER_VALUE_ID:
				setQualifierValueId(QUALIFIER_VALUE_ID_EDEFAULT);
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
			case AasPackage.QUALIFIER__SEMANTIC_ID:
				return semanticId != null;
			case AasPackage.QUALIFIER__QUALIFIER_TYPE:
				return QUALIFIER_TYPE_EDEFAULT == null ? qualifierType != null : !QUALIFIER_TYPE_EDEFAULT.equals(qualifierType);
			case AasPackage.QUALIFIER__QUALIFIER_VALUE:
				return QUALIFIER_VALUE_EDEFAULT == null ? qualifierValue != null : !QUALIFIER_VALUE_EDEFAULT.equals(qualifierValue);
			case AasPackage.QUALIFIER__QUALIFIER_VALUE_ID:
				return QUALIFIER_VALUE_ID_EDEFAULT == null ? qualifierValueId != null : !QUALIFIER_VALUE_ID_EDEFAULT.equals(qualifierValueId);
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
				case AasPackage.QUALIFIER__SEMANTIC_ID: return AasPackage.HAS_SEMANTICS__SEMANTIC_ID;
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
				case AasPackage.HAS_SEMANTICS__SEMANTIC_ID: return AasPackage.QUALIFIER__SEMANTIC_ID;
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
		result.append(" (qualifierType: ");
		result.append(qualifierType);
		result.append(", qualifierValue: ");
		result.append(qualifierValue);
		result.append(", qualifierValueId: ");
		result.append(qualifierValueId);
		result.append(')');
		return result.toString();
	}

} //QualifierImpl
