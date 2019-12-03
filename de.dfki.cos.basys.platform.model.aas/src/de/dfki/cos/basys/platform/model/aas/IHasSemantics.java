/**
 */
package de.dfki.cos.basys.platform.model.aas;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Semantics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.IHasSemantics#getSemanticId <em>Semantic Id</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getHasSemantics()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IHasSemantics {
	/**
	 * Returns the value of the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Id</em>' containment reference.
	 * @see #setSemanticId(IReference)
	 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getHasSemantics_SemanticId()
	 * @model containment="true"
	 * @generated
	 */
	IReference getSemanticId();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.IHasSemantics#getSemanticId <em>Semantic Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Id</em>' containment reference.
	 * @see #getSemanticId()
	 * @generated
	 */
	void setSemanticId(IReference value);

} // IHasSemantics
