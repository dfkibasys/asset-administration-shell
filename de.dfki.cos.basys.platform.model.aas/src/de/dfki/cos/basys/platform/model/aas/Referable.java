/**
 */
package de.dfki.cos.basys.platform.model.aas;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.Referable#getIdShort <em>Id Short</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.Referable#getCategory <em>Category</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.Referable#getDescription <em>Description</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.Referable#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getReferable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Referable extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Short</em>' attribute.
	 * @see #setIdShort(String)
	 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getReferable_IdShort()
	 * @model
	 * @generated
	 */
	String getIdShort();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.Referable#getIdShort <em>Id Short</em>}' attribute.
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
	 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getReferable_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.Referable#getCategory <em>Category</em>}' attribute.
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
	 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getReferable_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.Referable#getDescription <em>Description</em>}' attribute.
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
	 * @see #setParent(Referable)
	 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getReferable_Parent()
	 * @model
	 * @generated
	 */
	Referable getParent();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.Referable#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Referable value);

} // Referable
