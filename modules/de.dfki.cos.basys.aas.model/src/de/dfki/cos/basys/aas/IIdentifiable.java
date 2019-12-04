/**
 */
package de.dfki.cos.basys.aas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifiable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.aas.IIdentifiable#getAdministration <em>Administration</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.IIdentifiable#getIdentification <em>Identification</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.aas.IAasPackage#getIdentifiable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IIdentifiable extends IReferable {
	/**
	 * Returns the value of the '<em><b>Administration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Administration</em>' containment reference.
	 * @see #setAdministration(IAdministrativeInformation)
	 * @see de.dfki.cos.basys.aas.IAasPackage#getIdentifiable_Administration()
	 * @model containment="true"
	 * @generated
	 */
	IAdministrativeInformation getAdministration();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.aas.IIdentifiable#getAdministration <em>Administration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Administration</em>' containment reference.
	 * @see #getAdministration()
	 * @generated
	 */
	void setAdministration(IAdministrativeInformation value);

	/**
	 * Returns the value of the '<em><b>Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identification</em>' containment reference.
	 * @see #setIdentification(IIdentifier)
	 * @see de.dfki.cos.basys.aas.IAasPackage#getIdentifiable_Identification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IIdentifier getIdentification();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.aas.IIdentifiable#getIdentification <em>Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identification</em>' containment reference.
	 * @see #getIdentification()
	 * @generated
	 */
	void setIdentification(IIdentifier value);

} // IIdentifiable
