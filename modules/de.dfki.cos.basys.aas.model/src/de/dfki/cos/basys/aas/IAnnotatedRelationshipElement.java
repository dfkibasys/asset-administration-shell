/**
 */
package de.dfki.cos.basys.aas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotated Relationship Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.aas.IAnnotatedRelationshipElement#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.aas.IAasPackage#getAnnotatedRelationshipElement()
 * @model
 * @generated
 */
public interface IAnnotatedRelationshipElement {
	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.aas.IDataElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' reference list.
	 * @see de.dfki.cos.basys.aas.IAasPackage#getAnnotatedRelationshipElement_Annotation()
	 * @model
	 * @generated
	 */
	EList<IDataElement> getAnnotation();

} // IAnnotatedRelationshipElement
