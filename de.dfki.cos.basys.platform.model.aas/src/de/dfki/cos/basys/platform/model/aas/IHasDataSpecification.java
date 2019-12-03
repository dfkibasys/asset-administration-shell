/**
 */
package de.dfki.cos.basys.platform.model.aas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Data Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.IHasDataSpecification#getDataSpecification <em>Data Specification</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getHasDataSpecification()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IHasDataSpecification {
	/**
	 * Returns the value of the '<em><b>Data Specification</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.platform.model.aas.IReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Specification</em>' reference list.
	 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getHasDataSpecification_DataSpecification()
	 * @model
	 * @generated
	 */
	EList<IReference> getDataSpecification();

} // IHasDataSpecification
