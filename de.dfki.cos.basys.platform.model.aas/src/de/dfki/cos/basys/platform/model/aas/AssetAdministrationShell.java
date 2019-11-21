/**
 */
package de.dfki.cos.basys.platform.model.aas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Administration Shell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.AssetAdministrationShell#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.AssetAdministrationShell#getSecurity <em>Security</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.AssetAdministrationShell#getAsset <em>Asset</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.AssetAdministrationShell#getSubmodel <em>Submodel</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.AssetAdministrationShell#getView <em>View</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getAssetAdministrationShell()
 * @model
 * @generated
 */
public interface AssetAdministrationShell extends HasDataSpecification, Identifiable {
	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived From</em>' reference.
	 * @see #setDerivedFrom(AssetAdministrationShell)
	 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getAssetAdministrationShell_DerivedFrom()
	 * @model
	 * @generated
	 */
	AssetAdministrationShell getDerivedFrom();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.AssetAdministrationShell#getDerivedFrom <em>Derived From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived From</em>' reference.
	 * @see #getDerivedFrom()
	 * @generated
	 */
	void setDerivedFrom(AssetAdministrationShell value);

	/**
	 * Returns the value of the '<em><b>Security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' containment reference.
	 * @see #setSecurity(Security)
	 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getAssetAdministrationShell_Security()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Security getSecurity();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.AssetAdministrationShell#getSecurity <em>Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' containment reference.
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(Security value);

	/**
	 * Returns the value of the '<em><b>Asset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset</em>' containment reference.
	 * @see #setAsset(Asset)
	 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getAssetAdministrationShell_Asset()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Asset getAsset();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.AssetAdministrationShell#getAsset <em>Asset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset</em>' containment reference.
	 * @see #getAsset()
	 * @generated
	 */
	void setAsset(Asset value);

	/**
	 * Returns the value of the '<em><b>Submodel</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.aas.Submodel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submodel</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getAssetAdministrationShell_Submodel()
	 * @model containment="true"
	 * @generated
	 */
	EList<Submodel> getSubmodel();

	/**
	 * Returns the value of the '<em><b>View</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.aas.View}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getAssetAdministrationShell_View()
	 * @model containment="true"
	 * @generated
	 */
	EList<View> getView();

} // AssetAdministrationShell
