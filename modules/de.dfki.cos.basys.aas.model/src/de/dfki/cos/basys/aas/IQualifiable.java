/**
 */
package de.dfki.cos.basys.aas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualifiable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.aas.IQualifiable#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.aas.IAasPackage#getQualifiable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IQualifiable {
	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' reference.
	 * @see #setQualifier(IConstraint)
	 * @see de.dfki.cos.basys.aas.IAasPackage#getQualifiable_Qualifier()
	 * @model
	 * @generated
	 */
	IConstraint getQualifier();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.aas.IQualifiable#getQualifier <em>Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(IConstraint value);

} // IQualifiable
