/**
 */
package de.dfki.cos.basys.aas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.aas.IQualifier#getType <em>Type</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.IQualifier#getValueType <em>Value Type</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.IQualifier#getValue <em>Value</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.IQualifier#getValueId <em>Value Id</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.aas.IAasPackage#getQualifier()
 * @model
 * @generated
 */
public interface IQualifier extends IConstraint, IHasSemantics {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.dfki.cos.basys.aas.IAasPackage#getQualifier_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.aas.IQualifier#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' attribute.
	 * @see #setValueType(String)
	 * @see de.dfki.cos.basys.aas.IAasPackage#getQualifier_ValueType()
	 * @model required="true"
	 * @generated
	 */
	String getValueType();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.aas.IQualifier#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' attribute.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see de.dfki.cos.basys.aas.IAasPackage#getQualifier_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.aas.IQualifier#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Value Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Id</em>' containment reference.
	 * @see #setValueId(IReference)
	 * @see de.dfki.cos.basys.aas.IAasPackage#getQualifier_ValueId()
	 * @model containment="true"
	 * @generated
	 */
	IReference getValueId();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.aas.IQualifier#getValueId <em>Value Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Id</em>' containment reference.
	 * @see #getValueId()
	 * @generated
	 */
	void setValueId(IReference value);

} // IQualifier
