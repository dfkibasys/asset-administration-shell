/**
 */
package de.dfki.cos.basys.aas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.aas.IIdentifier#getIdType <em>Id Type</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.IIdentifier#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.aas.IAasPackage#getIdentifier()
 * @model
 * @generated
 */
public interface IIdentifier {
	/**
	 * Returns the value of the '<em><b>Id Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.cos.basys.aas.IdentifierType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Type</em>' attribute.
	 * @see de.dfki.cos.basys.aas.IdentifierType
	 * @see #setIdType(IdentifierType)
	 * @see de.dfki.cos.basys.aas.IAasPackage#getIdentifier_IdType()
	 * @model
	 * @generated
	 */
	IdentifierType getIdType();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.aas.IIdentifier#getIdType <em>Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Type</em>' attribute.
	 * @see de.dfki.cos.basys.aas.IdentifierType
	 * @see #getIdType()
	 * @generated
	 */
	void setIdType(IdentifierType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.dfki.cos.basys.aas.IAasPackage#getIdentifier_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.aas.IIdentifier#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // IIdentifier
