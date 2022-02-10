/**
 */
package de.dfki.cos.basys.aas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Administration Shell Bundle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.aas.IAssetAdministrationShellBundle#getAdministrationShells <em>Administration Shells</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.IAssetAdministrationShellBundle#getSubmodels <em>Submodels</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.IAssetAdministrationShellBundle#getAssets <em>Assets</em>}</li>
 *   <li>{@link de.dfki.cos.basys.aas.IAssetAdministrationShellBundle#getConceptDescriptions <em>Concept Descriptions</em>}</li>
 * </ul>
 *
 * @see de.dfki.cos.basys.aas.IAasPackage#getAssetAdministrationShellBundle()
 * @model
 * @generated
 */
public interface IAssetAdministrationShellBundle {
	/**
	 * Returns the value of the '<em><b>Administration Shells</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.aas.IAssetAdministrationShell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Administration Shells</em>' containment reference list.
	 * @see de.dfki.cos.basys.aas.IAasPackage#getAssetAdministrationShellBundle_AdministrationShells()
	 * @model containment="true"
	 * @generated
	 */
	EList<IAssetAdministrationShell> getAdministrationShells();

	/**
	 * Returns the value of the '<em><b>Submodels</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.aas.ISubmodel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submodels</em>' containment reference list.
	 * @see de.dfki.cos.basys.aas.IAasPackage#getAssetAdministrationShellBundle_Submodels()
	 * @model containment="true"
	 * @generated
	 */
	EList<ISubmodel> getSubmodels();

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.aas.IAsset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' containment reference list.
	 * @see de.dfki.cos.basys.aas.IAasPackage#getAssetAdministrationShellBundle_Assets()
	 * @model containment="true"
	 * @generated
	 */
	EList<IAsset> getAssets();

	/**
	 * Returns the value of the '<em><b>Concept Descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.cos.basys.aas.IConceptDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept Descriptions</em>' containment reference list.
	 * @see de.dfki.cos.basys.aas.IAasPackage#getAssetAdministrationShellBundle_ConceptDescriptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<IConceptDescription> getConceptDescriptions();

} // IAssetAdministrationShellBundle
