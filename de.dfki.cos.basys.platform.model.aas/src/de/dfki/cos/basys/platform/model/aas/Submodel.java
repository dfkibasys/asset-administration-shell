/**
 */
package de.dfki.cos.basys.platform.model.aas;

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
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.Submodel#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.Submodel#getSubmodelElement <em>Submodel Element</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getSubmodel()
 * @model
 * @generated
 */
public interface Submodel extends HasDataSpecification, HasKind, HasSemantics, Identifiable, Qualifiable {
	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference.
	 * @see #setQualifier(Qualifier)
	 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getSubmodel_Qualifier()
	 * @model containment="true"
	 * @generated
	 */
	Qualifier getQualifier();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.Submodel#getQualifier <em>Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' containment reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(Qualifier value);

	/**
	 * Returns the value of the '<em><b>Submodel Element</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.aas.SubmodelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submodel Element</em>' containment reference list.
	 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getSubmodel_SubmodelElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubmodelElement> getSubmodelElement();

} // Submodel
