/**
 */
package de.dfki.cos.basys.platform.model.aas;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Semantics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.HasSemantics#getSemanticId <em>Semantic Id</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getHasSemantics()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface HasSemantics extends EObject {
	/**
	 * Returns the value of the '<em><b>Semantic Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Id</em>' reference.
	 * @see #setSemanticId(Reference)
	 * @see de.dfki.cos.basys.platform.model.aas.AasPackage#getHasSemantics_SemanticId()
	 * @model
	 * @generated
	 */
	Reference getSemanticId();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.HasSemantics#getSemanticId <em>Semantic Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Id</em>' reference.
	 * @see #getSemanticId()
	 * @generated
	 */
	void setSemanticId(Reference value);

} // HasSemantics
