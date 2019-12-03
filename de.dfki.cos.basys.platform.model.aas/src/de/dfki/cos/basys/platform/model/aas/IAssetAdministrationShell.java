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
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.IAssetAdministrationShell#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.IAssetAdministrationShell#getSecurity <em>Security</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.IAssetAdministrationShell#getAsset <em>Asset</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.IAssetAdministrationShell#getSubmodel <em>Submodel</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.IAssetAdministrationShell#getView <em>View</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.IAssetAdministrationShell#getConceptDictionary <em>Concept Dictionary</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getAssetAdministrationShell()
 * @model
 * @generated
 */
public interface IAssetAdministrationShell extends IHasDataSpecification, IIdentifiable {
	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived From</em>' reference.
	 * @see #setDerivedFrom(IAssetAdministrationShell)
	 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getAssetAdministrationShell_DerivedFrom()
	 * @model
	 * @generated
	 */
	IAssetAdministrationShell getDerivedFrom();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.IAssetAdministrationShell#getDerivedFrom <em>Derived From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived From</em>' reference.
	 * @see #getDerivedFrom()
	 * @generated
	 */
	void setDerivedFrom(IAssetAdministrationShell value);

	/**
	 * Returns the value of the '<em><b>Security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' containment reference.
	 * @see #setSecurity(ISecurity)
	 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getAssetAdministrationShell_Security()
	 * @model containment="true"
	 * @generated
	 */
	ISecurity getSecurity();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.IAssetAdministrationShell#getSecurity <em>Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' containment reference.
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(ISecurity value);

	/**
	 * Returns the value of the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset</em>' reference.
	 * @see #setAsset(IAsset)
	 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getAssetAdministrationShell_Asset()
	 * @model required="true"
	 * @generated
	 */
	IAsset getAsset();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.IAssetAdministrationShell#getAsset <em>Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset</em>' reference.
	 * @see #getAsset()
	 * @generated
	 */
	void setAsset(IAsset value);

	/**
	 * Returns the value of the '<em><b>Submodel</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.aas.ISubmodel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submodel</em>' reference list.
	 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getAssetAdministrationShell_Submodel()
	 * @model
	 * @generated
	 */
	EList<ISubmodel> getSubmodel();

	/**
	 * Returns the value of the '<em><b>View</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.aas.IView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getAssetAdministrationShell_View()
	 * @model containment="true"
	 * @generated
	 */
	EList<IView> getView();

	/**
	 * Returns the value of the '<em><b>Concept Dictionary</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.aas.IConceptDictionary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept Dictionary</em>' reference list.
	 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getAssetAdministrationShell_ConceptDictionary()
	 * @model
	 * @generated
	 */
	EList<IConceptDictionary> getConceptDictionary();

} // IAssetAdministrationShell
