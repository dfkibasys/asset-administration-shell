/**
 */
package de.dfki.cos.basys.platform.model.aas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.View#getContainedElement <em>Contained Element</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getView()
 * @model
 * @generated
 */
public interface View extends HasDataSpecification, HasSemantics, Referable {
	/**
	 * Returns the value of the '<em><b>Contained Element</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.aas.Referable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Element</em>' reference list.
	 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getView_ContainedElement()
	 * @model
	 * @generated
	 */
	EList<Referable> getContainedElement();

} // View
