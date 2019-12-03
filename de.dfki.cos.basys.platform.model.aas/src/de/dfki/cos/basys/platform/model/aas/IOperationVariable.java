/**
 */
package de.dfki.cos.basys.platform.model.aas;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.IOperationVariable#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getOperationVariable()
 * @model
 * @generated
 */
public interface IOperationVariable {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(ISubmodelElement)
	 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getOperationVariable_Value()
	 * @model required="true"
	 * @generated
	 */
	ISubmodelElement getValue();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.IOperationVariable#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ISubmodelElement value);

} // IOperationVariable
