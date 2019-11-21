/**
 */
package de.dfki.cos.basys.platform.model.aas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.Qualifier#getQualifierType <em>Qualifier Type</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.Qualifier#getQualifierValue <em>Qualifier Value</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.Qualifier#getQualifierValueId <em>Qualifier Value Id</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getQualifier()
 * @model
 * @generated
 */
public interface Qualifier extends Constraint, HasSemantics {
	/**
	 * Returns the value of the '<em><b>Qualifier Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier Type</em>' attribute.
	 * @see #setQualifierType(String)
	 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getQualifier_QualifierType()
	 * @model
	 * @generated
	 */
	String getQualifierType();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.Qualifier#getQualifierType <em>Qualifier Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier Type</em>' attribute.
	 * @see #getQualifierType()
	 * @generated
	 */
	void setQualifierType(String value);

	/**
	 * Returns the value of the '<em><b>Qualifier Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier Value</em>' attribute.
	 * @see #setQualifierValue(String)
	 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getQualifier_QualifierValue()
	 * @model
	 * @generated
	 */
	String getQualifierValue();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.Qualifier#getQualifierValue <em>Qualifier Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier Value</em>' attribute.
	 * @see #getQualifierValue()
	 * @generated
	 */
	void setQualifierValue(String value);

	/**
	 * Returns the value of the '<em><b>Qualifier Value Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier Value Id</em>' attribute.
	 * @see #setQualifierValueId(String)
	 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getQualifier_QualifierValueId()
	 * @model
	 * @generated
	 */
	String getQualifierValueId();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.Qualifier#getQualifierValueId <em>Qualifier Value Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier Value Id</em>' attribute.
	 * @see #getQualifierValueId()
	 * @generated
	 */
	void setQualifierValueId(String value);

} // Qualifier
