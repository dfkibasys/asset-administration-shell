/**
 */
package de.dfki.cos.basys.aas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.aas.IFormula#getDependsOn <em>Depends On</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.aas.IAasPackage#getFormula()
 * @model
 * @generated
 */
public interface IFormula extends IConstraint {
	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.aas.IReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On</em>' containment reference list.
	 * @see de.dfki.cos.basys.aas.IAasPackage#getFormula_DependsOn()
	 * @model containment="true"
	 * @generated
	 */
	EList<IReference> getDependsOn();

} // IFormula
