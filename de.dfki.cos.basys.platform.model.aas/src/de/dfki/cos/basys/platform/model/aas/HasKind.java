/**
 */
package de.dfki.cos.basys.platform.model.aas;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Kind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.HasKind#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getHasKind()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface HasKind extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.cos.basys.platform.model.aas.Kind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.aas.Kind
	 * @see #setKind(Kind)
	 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getHasKind_Kind()
	 * @model
	 * @generated
	 */
	Kind getKind();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.HasKind#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see de.dfki.cos.basys.platform.model.aas.Kind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(Kind value);

} // HasKind
