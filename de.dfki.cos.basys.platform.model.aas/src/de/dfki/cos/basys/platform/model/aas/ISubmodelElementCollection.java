/**
 */
package de.dfki.cos.basys.platform.model.aas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Submodel Element Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.ISubmodelElementCollection#isAllowDuplicates <em>Allow Duplicates</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.ISubmodelElementCollection#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.ISubmodelElementCollection#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getSubmodelElementCollection()
 * @model
 * @generated
 */
public interface ISubmodelElementCollection extends ISubmodelElement {
	/**
	 * Returns the value of the '<em><b>Allow Duplicates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Duplicates</em>' attribute.
	 * @see #setAllowDuplicates(boolean)
	 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getSubmodelElementCollection_AllowDuplicates()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isAllowDuplicates();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.ISubmodelElementCollection#isAllowDuplicates <em>Allow Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Duplicates</em>' attribute.
	 * @see #isAllowDuplicates()
	 * @generated
	 */
	void setAllowDuplicates(boolean value);

	/**
	 * Returns the value of the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered</em>' attribute.
	 * @see #setOrdered(boolean)
	 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getSubmodelElementCollection_Ordered()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isOrdered();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.ISubmodelElementCollection#isOrdered <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered</em>' attribute.
	 * @see #isOrdered()
	 * @generated
	 */
	void setOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.aas.ISubmodelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getSubmodelElementCollection_Value()
	 * @model containment="true"
	 * @generated
	 */
	EList<ISubmodelElement> getValue();

} // ISubmodelElementCollection
