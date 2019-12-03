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
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.IOperation#getInputVariable <em>Input Variable</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.IOperation#getOutputVariable <em>Output Variable</em>}</li>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.IOperation#getInoutputVariable <em>Inoutput Variable</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getOperation()
 * @model
 * @generated
 */
public interface IOperation extends ISubmodelElement {
	/**
	 * Returns the value of the '<em><b>Input Variable</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.aas.IOperationVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Variable</em>' reference list.
	 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getOperation_InputVariable()
	 * @model
	 * @generated
	 */
	EList<IOperationVariable> getInputVariable();

	/**
	 * Returns the value of the '<em><b>Output Variable</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.aas.IOperationVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Variable</em>' reference list.
	 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getOperation_OutputVariable()
	 * @model
	 * @generated
	 */
	EList<IOperationVariable> getOutputVariable();

	/**
	 * Returns the value of the '<em><b>Inoutput Variable</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.aas.IOperationVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inoutput Variable</em>' reference list.
	 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getOperation_InoutputVariable()
	 * @model
	 * @generated
	 */
	EList<IOperationVariable> getInoutputVariable();

} // IOperation
