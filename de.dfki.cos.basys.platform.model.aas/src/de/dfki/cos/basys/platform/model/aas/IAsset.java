/**
 */
package de.dfki.cos.basys.platform.model.aas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.IAsset#getKind <em>Kind</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.IAsset#getAssetIdentificationModel <em>Asset Identification Model</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.IAsset#getBillOfMaterial <em>Bill Of Material</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getAsset()
 * @model
 * @generated
 */
public interface IAsset extends IHasDataSpecification, IIdentifiable {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.cos.basys.platform.model.aas.AssetKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.aas.AssetKind
	 * @see #setKind(AssetKind)
	 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getAsset_Kind()
	 * @model required="true"
	 * @generated
	 */
	AssetKind getKind();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.IAsset#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.aas.AssetKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(AssetKind value);

	/**
	 * Returns the value of the '<em><b>Asset Identification Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Identification Model</em>' reference.
	 * @see #setAssetIdentificationModel(ISubmodel)
	 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getAsset_AssetIdentificationModel()
	 * @model
	 * @generated
	 */
	ISubmodel getAssetIdentificationModel();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.IAsset#getAssetIdentificationModel <em>Asset Identification Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Identification Model</em>' reference.
	 * @see #getAssetIdentificationModel()
	 * @generated
	 */
	void setAssetIdentificationModel(ISubmodel value);

	/**
	 * Returns the value of the '<em><b>Bill Of Material</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill Of Material</em>' reference.
	 * @see #setBillOfMaterial(ISubmodel)
	 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getAsset_BillOfMaterial()
	 * @model
	 * @generated
	 */
	ISubmodel getBillOfMaterial();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.IAsset#getBillOfMaterial <em>Bill Of Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill Of Material</em>' reference.
	 * @see #getBillOfMaterial()
	 * @generated
	 */
	void setBillOfMaterial(ISubmodel value);

} // IAsset
