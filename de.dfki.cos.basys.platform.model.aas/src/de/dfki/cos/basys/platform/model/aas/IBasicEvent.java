/**
 */
package de.dfki.cos.basys.platform.model.aas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.platform.model.aas.IBasicEvent#getObserved <em>Observed</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getBasicEvent()
 * @model
 * @generated
 */
public interface IBasicEvent extends IEvent {
	/**
	 * Returns the value of the '<em><b>Observed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observed</em>' reference.
	 * @see #setObserved(IReferable)
	 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#getBasicEvent_Observed()
	 * @model required="true"
	 * @generated
	 */
	IReferable getObserved();

	/**
	 * Sets the value of the '{@link de.dfki.cos.basys.platform.model.aas.IBasicEvent#getObserved <em>Observed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observed</em>' reference.
	 * @see #getObserved()
	 * @generated
	 */
	void setObserved(IReferable value);

} // IBasicEvent
