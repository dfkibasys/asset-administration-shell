/**
 */
package de.dfki.cos.basys.platform.model.aas;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifiable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.Identifiable#getAdministration <em>Administration</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.Identifiable#getIdentification <em>Identification</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getIdentifiable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Identifiable extends EObject {
	/**
	 * Returns the value of the '<em><b>Administration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Administration</em>' reference.
	 * @see #setAdministration(AdministrativeInformation)
	 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getIdentifiable_Administration()
	 * @model
	 * @generated
	 */
	AdministrativeInformation getAdministration();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.Identifiable#getAdministration <em>Administration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Administration</em>' reference.
	 * @see #getAdministration()
	 * @generated
	 */
	void setAdministration(AdministrativeInformation value);

	/**
	 * Returns the value of the '<em><b>Identification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identification</em>' reference.
	 * @see #setIdentification(Identifier)
	 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getIdentifiable_Identification()
	 * @model
	 * @generated
	 */
	Identifier getIdentification();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.Identifiable#getIdentification <em>Identification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identification</em>' reference.
	 * @see #getIdentification()
	 * @generated
	 */
	void setIdentification(Identifier value);

} // Identifiable
