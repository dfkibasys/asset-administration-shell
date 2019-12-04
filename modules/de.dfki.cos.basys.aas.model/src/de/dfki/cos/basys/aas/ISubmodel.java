/**
 */
package de.dfki.cos.basys.aas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Submodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.aas.ISubmodel#getSubmodelElement <em>Submodel Element</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.aas.IAasPackage#getSubmodel()
 * @model
 * @generated
 */
public interface ISubmodel extends IHasDataSpecification, IHasSemantics, IIdentifiable, IQualifiable, IHasKind {
	/**
	 * Returns the value of the '<em><b>Submodel Element</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.aas.ISubmodelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submodel Element</em>' containment reference list.
	 * @see de.dfki.cos.basys.aas.IAasPackage#getSubmodel_SubmodelElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<ISubmodelElement> getSubmodelElement();

} // ISubmodel
