/**
 */
package de.dfki.cos.basys.aas.impl;

import de.dfki.cos.basys.aas.IAasPackage;
import de.dfki.cos.basys.aas.IConceptDescription;
import de.dfki.cos.basys.aas.IConceptDictionary;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Dictionary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.aas.impl.ConceptDictionary#getConceptDescription <em>Concept Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptDictionary extends MinimalEObjectImpl.Container implements IConceptDictionary {
	/**
	 * The cached value of the '{@link #getConceptDescription() <em>Concept Description</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<IConceptDescription> conceptDescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptDictionary() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IAasPackage.Literals.CONCEPT_DICTIONARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IConceptDescription> getConceptDescription() {
		if (conceptDescription == null) {
			conceptDescription = new EObjectResolvingEList<IConceptDescription>(IConceptDescription.class, this, IAasPackage.CONCEPT_DICTIONARY__CONCEPT_DESCRIPTION);
		}
		return conceptDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IAasPackage.CONCEPT_DICTIONARY__CONCEPT_DESCRIPTION:
				return getConceptDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IAasPackage.CONCEPT_DICTIONARY__CONCEPT_DESCRIPTION:
				getConceptDescription().clear();
				getConceptDescription().addAll((Collection<? extends IConceptDescription>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IAasPackage.CONCEPT_DICTIONARY__CONCEPT_DESCRIPTION:
				getConceptDescription().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IAasPackage.CONCEPT_DICTIONARY__CONCEPT_DESCRIPTION:
				return conceptDescription != null && !conceptDescription.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConceptDictionary
