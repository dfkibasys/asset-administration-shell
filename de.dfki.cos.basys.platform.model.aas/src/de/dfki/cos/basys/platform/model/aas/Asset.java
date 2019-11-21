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
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.Asset#getAssetIdentificationModel <em>Asset Identification Model</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getAsset()
 * @model
 * @generated
 */
public interface Asset extends HasDataSpecification, Identifiable, HasKind {
	/**
	 * Returns the value of the '<em><b>Asset Identification Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Identification Model</em>' reference.
	 * @see #setAssetIdentificationModel(Submodel)
	 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getAsset_AssetIdentificationModel()
	 * @model
	 * @generated
	 */
	Submodel getAssetIdentificationModel();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.Asset#getAssetIdentificationModel <em>Asset Identification Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Identification Model</em>' reference.
	 * @see #getAssetIdentificationModel()
	 * @generated
	 */
	void setAssetIdentificationModel(Submodel value);

} // Asset
