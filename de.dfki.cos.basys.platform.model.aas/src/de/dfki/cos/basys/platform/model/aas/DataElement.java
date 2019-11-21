/**
 */
package de.dfki.cos.basys.platform.model.aas;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.DataElement#getSubmodelelement <em>Submodelelement</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getDataElement()
 * @model abstract="true"
 * @generated
 */
public interface DataElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Submodelelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submodelelement</em>' reference.
	 * @see #setSubmodelelement(SubmodelElement)
	 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getDataElement_Submodelelement()
	 * @model
	 * @generated
	 */
	SubmodelElement getSubmodelelement();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.DataElement#getSubmodelelement <em>Submodelelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submodelelement</em>' reference.
	 * @see #getSubmodelelement()
	 * @generated
	 */
	void setSubmodelelement(SubmodelElement value);

} // DataElement
