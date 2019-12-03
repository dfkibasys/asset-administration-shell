/**
 */
package de.dfki.cos.basys.platform.model.aas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.IRelationshipElement#getFirst <em>First</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.IRelationshipElement#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getRelationshipElement()
 * @model
 * @generated
 */
public interface IRelationshipElement extends ISubmodelElement {
	/**
	 * Returns the value of the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' reference.
	 * @see #setFirst(IReferable)
	 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getRelationshipElement_First()
	 * @model required="true"
	 * @generated
	 */
	IReferable getFirst();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.IRelationshipElement#getFirst <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(IReferable value);

	/**
	 * Returns the value of the '<em><b>Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' reference.
	 * @see #setSecond(IReferable)
	 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getRelationshipElement_Second()
	 * @model required="true"
	 * @generated
	 */
	IReferable getSecond();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.IRelationshipElement#getSecond <em>Second</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second</em>' reference.
	 * @see #getSecond()
	 * @generated
	 */
	void setSecond(IReferable value);

} // IRelationshipElement
