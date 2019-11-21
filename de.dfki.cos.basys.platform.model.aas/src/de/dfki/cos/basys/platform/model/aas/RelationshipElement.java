/**
 */
package de.dfki.cos.basys.platform.model.aas;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.RelationshipElement#getSubmodelElement <em>Submodel Element</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.RelationshipElement#getFirst <em>First</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.RelationshipElement#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getRelationshipElement()
 * @model
 * @generated
 */
public interface RelationshipElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Submodel Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submodel Element</em>' reference.
	 * @see #setSubmodelElement(SubmodelElement)
	 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getRelationshipElement_SubmodelElement()
	 * @model
	 * @generated
	 */
	SubmodelElement getSubmodelElement();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.RelationshipElement#getSubmodelElement <em>Submodel Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submodel Element</em>' reference.
	 * @see #getSubmodelElement()
	 * @generated
	 */
	void setSubmodelElement(SubmodelElement value);

	/**
	 * Returns the value of the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' reference.
	 * @see #setFirst(Referable)
	 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getRelationshipElement_First()
	 * @model required="true"
	 * @generated
	 */
	Referable getFirst();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.RelationshipElement#getFirst <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(Referable value);

	/**
	 * Returns the value of the '<em><b>Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' reference.
	 * @see #setSecond(Referable)
	 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getRelationshipElement_Second()
	 * @model required="true"
	 * @generated
	 */
	Referable getSecond();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.RelationshipElement#getSecond <em>Second</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second</em>' reference.
	 * @see #getSecond()
	 * @generated
	 */
	void setSecond(Referable value);

} // RelationshipElement
