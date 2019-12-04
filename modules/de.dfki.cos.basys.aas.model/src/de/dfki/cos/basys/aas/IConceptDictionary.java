/**
 */
package de.dfki.cos.basys.aas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Dictionary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.aas.IConceptDictionary#getConceptDescription <em>Concept Description</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.aas.IAasPackage#getConceptDictionary()
 * @model
 * @generated
 */
public interface IConceptDictionary {
	/**
	 * Returns the value of the '<em><b>Concept Description</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.aas.IConceptDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept Description</em>' reference list.
	 * @see de.dfki.cos.basys.aas.IAasPackage#getConceptDictionary_ConceptDescription()
	 * @model
	 * @generated
	 */
	EList<IConceptDescription> getConceptDescription();

} // IConceptDictionary
