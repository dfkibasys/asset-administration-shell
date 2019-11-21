/**
 */
package de.dfki.cos.basys.platform.model.aas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.Operation#getIn <em>In</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.Operation#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends SubmodelElement {
	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.aas.OperationVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getOperation_In()
	 * @model
	 * @generated
	 */
	EList<OperationVariable> getIn();

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.aas.OperationVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getOperation_Out()
	 * @model
	 * @generated
	 */
	EList<OperationVariable> getOut();

} // Operation
