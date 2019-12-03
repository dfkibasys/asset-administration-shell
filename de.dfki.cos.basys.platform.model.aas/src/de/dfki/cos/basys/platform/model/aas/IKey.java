/**
 */
package de.dfki.cos.basys.platform.model.aas;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.IKey#getType <em>Type</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.IKey#isLocal <em>Local</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.IKey#getValue <em>Value</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.IKey#getIdType <em>Id Type</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getKey()
 * @model
 * @generated
 */
public interface IKey {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.cos.basys.platform.model.aas.KeyElements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.aas.KeyElements
	 * @see #setType(KeyElements)
	 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getKey_Type()
	 * @model required="true"
	 * @generated
	 */
	KeyElements getType();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.IKey#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.aas.KeyElements
	 * @see #getType()
	 * @generated
	 */
	void setType(KeyElements value);

	/**
	 * Returns the value of the '<em><b>Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local</em>' attribute.
	 * @see #setLocal(boolean)
	 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getKey_Local()
	 * @model required="true"
	 * @generated
	 */
	boolean isLocal();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.IKey#isLocal <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local</em>' attribute.
	 * @see #isLocal()
	 * @generated
	 */
	void setLocal(boolean value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getKey_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.IKey#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Id Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.cos.basys.platform.model.aas.KeyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Type</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.aas.KeyType
	 * @see #setIdType(KeyType)
	 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getKey_IdType()
	 * @model
	 * @generated
	 */
	KeyType getIdType();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.IKey#getIdType <em>Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Type</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.aas.KeyType
	 * @see #getIdType()
	 * @generated
	 */
	void setIdType(KeyType value);

} // IKey
