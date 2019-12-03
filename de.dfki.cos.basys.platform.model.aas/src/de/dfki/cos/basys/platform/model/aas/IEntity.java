/**
 */
package de.dfki.cos.basys.platform.model.aas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.IEntity#getStatement <em>Statement</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.IEntity#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.IEntity#getAsset <em>Asset</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getEntity()
 * @model
 * @generated
 */
public interface IEntity extends ISubmodelElement {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' reference.
	 * @see #setStatement(ISubmodelElement)
	 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getEntity_Statement()
	 * @model
	 * @generated
	 */
	ISubmodelElement getStatement();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.IEntity#getStatement <em>Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(ISubmodelElement value);

	/**
	 * Returns the value of the '<em><b>Entity Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.cos.basys.platform.model.aas.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Type</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.aas.EntityType
	 * @see #setEntityType(EntityType)
	 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getEntity_EntityType()
	 * @model required="true"
	 * @generated
	 */
	EntityType getEntityType();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.IEntity#getEntityType <em>Entity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Type</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.aas.EntityType
	 * @see #getEntityType()
	 * @generated
	 */
	void setEntityType(EntityType value);

	/**
	 * Returns the value of the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset</em>' reference.
	 * @see #setAsset(IAsset)
	 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getEntity_Asset()
	 * @model
	 * @generated
	 */
	IAsset getAsset();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.IEntity#getAsset <em>Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset</em>' reference.
	 * @see #getAsset()
	 * @generated
	 */
	void setAsset(IAsset value);

} // IEntity
