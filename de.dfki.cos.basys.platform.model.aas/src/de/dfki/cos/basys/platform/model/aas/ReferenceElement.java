/**
 */
package de.dfki.cos.basys.platform.model.aas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.ReferenceElement#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getReferenceElement()
 * @model
 * @generated
 */
public interface ReferenceElement extends DataElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Reference)
	 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getReferenceElement_Value()
	 * @model
	 * @generated
	 */
	Reference getValue();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.ReferenceElement#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Reference value);

} // ReferenceElement
