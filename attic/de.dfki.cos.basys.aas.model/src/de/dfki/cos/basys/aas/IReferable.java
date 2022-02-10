/**
 */
package de.dfki.cos.basys.aas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An element that is referable by its idShort. This id is not globally unique. This id is unique within the name space of the element. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.aas.IReferable#getIdShort <em>Id Short</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.IReferable#getCategory <em>Category</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.IReferable#getDescription <em>Description</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.IReferable#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.aas.IAasPackage#getReferable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IReferable {
	/**
	 * Returns the value of the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Short</em>' attribute.
	 * @see #setIdShort(String)
	 * @see de.dfki.cos.basys.aas.IAasPackage#getReferable_IdShort()
	 * @model required="true"
	 * @generated
	 */
	String getIdShort();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.aas.IReferable#getIdShort <em>Id Short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Short</em>' attribute.
	 * @see #getIdShort()
	 * @generated
	 */
	void setIdShort(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see de.dfki.cos.basys.aas.IAasPackage#getReferable_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.aas.IReferable#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.dfki.cos.basys.aas.IAasPackage#getReferable_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.aas.IReferable#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(IReferable)
	 * @see de.dfki.cos.basys.aas.IAasPackage#getReferable_Parent()
	 * @model
	 * @generated
	 */
	IReferable getParent();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.aas.IReferable#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(IReferable value);

} // IReferable
