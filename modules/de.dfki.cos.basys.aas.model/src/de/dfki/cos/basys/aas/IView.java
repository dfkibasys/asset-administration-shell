/**
 */
package de.dfki.cos.basys.aas;

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
 *   <li>{@link de.dfki.cos.basys.aas.IView#getContainedElement <em>Contained Element</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.aas.IAasPackage#getView()
 * @model
 * @generated
 */
public interface IView extends IHasDataSpecification, IHasSemantics, IReferable {
	/**
	 * Returns the value of the '<em><b>Contained Element</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.aas.IReferable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Element</em>' reference list.
	 * @see de.dfki.cos.basys.aas.IAasPackage#getView_ContainedElement()
	 * @model
	 * @generated
	 */
	EList<IReferable> getContainedElement();

} // IView
