/**
 */
package de.dfki.cos.basys.platform.model.aas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Administrative Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.AdministrativeInformation#getVersion <em>Version</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.AdministrativeInformation#getRevision <em>Revision</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getAdministrativeInformation()
 * @model
 * @generated
 */
public interface AdministrativeInformation extends HasDataSpecification {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getAdministrativeInformation_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.AdministrativeInformation#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' attribute.
	 * @see #setRevision(String)
	 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getAdministrativeInformation_Revision()
	 * @model
	 * @generated
	 */
	String getRevision();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.AdministrativeInformation#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' attribute.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(String value);

} // AdministrativeInformation
