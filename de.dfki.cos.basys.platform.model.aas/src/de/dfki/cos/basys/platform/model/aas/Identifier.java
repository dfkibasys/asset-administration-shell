/**
 */
package de.dfki.cos.basys.platform.model.aas;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.Identifier#getIdType <em>Id Type</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.Identifier#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getIdentifier()
 * @model
 * @generated
 */
public interface Identifier extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.cos.basys.platform.model.aas.IdentifierType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Type</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.aas.IdentifierType
	 * @see #setIdType(IdentifierType)
	 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getIdentifier_IdType()
	 * @model
	 * @generated
	 */
	IdentifierType getIdType();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.Identifier#getIdType <em>Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Type</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.aas.IdentifierType
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
	 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getIdentifier_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.Identifier#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Identifier
