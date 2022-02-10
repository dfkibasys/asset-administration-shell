/**
 */
package de.dfki.cos.basys.aas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Kind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.aas.IHasKind#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.aas.IAasPackage#getHasKind()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IHasKind {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.cos.basys.aas.ModelingKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see de.dfki.cos.basys.aas.ModelingKind
	 * @see #setKind(ModelingKind)
	 * @see de.dfki.cos.basys.aas.IAasPackage#getHasKind_Kind()
	 * @model
	 * @generated
	 */
	ModelingKind getKind();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.aas.IHasKind#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see de.dfki.cos.basys.aas.ModelingKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ModelingKind value);

} // IHasKind
