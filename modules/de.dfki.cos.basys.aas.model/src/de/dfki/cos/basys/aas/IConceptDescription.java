/**
 */
package de.dfki.cos.basys.aas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.aas.IConceptDescription#getIsCaseOf <em>Is Case Of</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.aas.IAasPackage#getConceptDescription()
 * @model
 * @generated
 */
public interface IConceptDescription extends IHasDataSpecification, IIdentifiable {
	/**
	 * Returns the value of the '<em><b>Is Case Of</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.aas.IReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Case Of</em>' containment reference list.
	 * @see de.dfki.cos.basys.aas.IAasPackage#getConceptDescription_IsCaseOf()
	 * @model containment="true"
	 * @generated
	 */
	EList<IReference> getIsCaseOf();

} // IConceptDescription
