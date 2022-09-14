/**
 */
package de.dfki.cos.basys.aas;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dfki.cos.basys.aas.IAasFactory
 * @model kind="package"
 * @generated
 */
public interface IAasPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "aas";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/cos/basys/model/aas";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "aas";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IAasPackage eINSTANCE = de.dfki.cos.basys.aas.impl.AasPackage.init();

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.IReferable <em>Referable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.IReferable
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getReferable()
	 * @generated
	 */
	int REFERABLE = 0;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE__ID_SHORT = 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE__CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE__PARENT = 3;

	/**
	 * The number of structural features of the '<em>Referable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Referable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.IIdentifiable <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.IIdentifiable
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 1;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__ID_SHORT = REFERABLE__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__CATEGORY = REFERABLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__DESCRIPTION = REFERABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__PARENT = REFERABLE__PARENT;

	/**
	 * The feature id for the '<em><b>Administration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__ADMINISTRATION = REFERABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__IDENTIFICATION = REFERABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = REFERABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_OPERATION_COUNT = REFERABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.impl.Identifier <em>Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.impl.Identifier
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>Id Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__ID_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__ID = 1;

	/**
	 * The number of structural features of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.IHasKind <em>Has Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.IHasKind
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getHasKind()
	 * @generated
	 */
	int HAS_KIND = 3;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_KIND__KIND = 0;

	/**
	 * The number of structural features of the '<em>Has Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_KIND_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Has Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_KIND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.IHasDataSpecification <em>Has Data Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.IHasDataSpecification
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getHasDataSpecification()
	 * @generated
	 */
	int HAS_DATA_SPECIFICATION = 10;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_DATA_SPECIFICATION__DATA_SPECIFICATION = 0;

	/**
	 * The number of structural features of the '<em>Has Data Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_DATA_SPECIFICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Has Data Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_DATA_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.impl.AdministrativeInformation <em>Administrative Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.impl.AdministrativeInformation
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getAdministrativeInformation()
	 * @generated
	 */
	int ADMINISTRATIVE_INFORMATION = 4;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_INFORMATION__DATA_SPECIFICATION = HAS_DATA_SPECIFICATION__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_INFORMATION__VERSION = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_INFORMATION__REVISION = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Administrative Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_INFORMATION_FEATURE_COUNT = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Administrative Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_INFORMATION_OPERATION_COUNT = HAS_DATA_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.IHasSemantics <em>Has Semantics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.IHasSemantics
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getHasSemantics()
	 * @generated
	 */
	int HAS_SEMANTICS = 5;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_SEMANTICS__SEMANTIC_ID = 0;

	/**
	 * The number of structural features of the '<em>Has Semantics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_SEMANTICS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Has Semantics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_SEMANTICS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.IQualifiable <em>Qualifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.IQualifiable
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getQualifiable()
	 * @generated
	 */
	int QUALIFIABLE = 6;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIABLE__QUALIFIER = 0;

	/**
	 * The number of structural features of the '<em>Qualifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Qualifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.IConstraint <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.IConstraint
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 7;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.impl.Qualifier <em>Qualifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.impl.Qualifier
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getQualifier()
	 * @generated
	 */
	int QUALIFIER = 8;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER__SEMANTIC_ID = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER__TYPE = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER__VALUE_TYPE = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER__VALUE = CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER__VALUE_ID = CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.impl.Formula <em>Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.impl.Formula
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getFormula()
	 * @generated
	 */
	int FORMULA = 9;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__DEPENDS_ON = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.impl.AssetAdministrationShell <em>Asset Administration Shell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.impl.AssetAdministrationShell
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getAssetAdministrationShell()
	 * @generated
	 */
	int ASSET_ADMINISTRATION_SHELL = 11;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__DATA_SPECIFICATION = HAS_DATA_SPECIFICATION__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__ID_SHORT = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__CATEGORY = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__DESCRIPTION = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__PARENT = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Administration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__ADMINISTRATION = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__IDENTIFICATION = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__DERIVED_FROM = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__SECURITY = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__ASSET = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Submodel</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__SUBMODEL = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__VIEW = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Concept Dictionary</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__CONCEPT_DICTIONARY = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Asset Administration Shell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL_FEATURE_COUNT = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Asset Administration Shell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL_OPERATION_COUNT = HAS_DATA_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.impl.Asset <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.impl.Asset
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getAsset()
	 * @generated
	 */
	int ASSET = 12;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__DATA_SPECIFICATION = HAS_DATA_SPECIFICATION__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ID_SHORT = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__CATEGORY = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__DESCRIPTION = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__PARENT = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Administration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ADMINISTRATION = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__IDENTIFICATION = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__KIND = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Asset Identification Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ASSET_IDENTIFICATION_MODEL = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Bill Of Material</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__BILL_OF_MATERIAL = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = HAS_DATA_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.impl.Submodel <em>Submodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.impl.Submodel
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getSubmodel()
	 * @generated
	 */
	int SUBMODEL = 13;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL__DATA_SPECIFICATION = HAS_DATA_SPECIFICATION__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL__SEMANTIC_ID = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL__ID_SHORT = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL__CATEGORY = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL__DESCRIPTION = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL__PARENT = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Administration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL__ADMINISTRATION = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL__IDENTIFICATION = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL__QUALIFIER = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL__KIND = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Submodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL__SUBMODEL_ELEMENT = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Submodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_FEATURE_COUNT = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Submodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_OPERATION_COUNT = HAS_DATA_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.ISubmodelElement <em>Submodel Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.ISubmodelElement
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getSubmodelElement()
	 * @generated
	 */
	int SUBMODEL_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT__DATA_SPECIFICATION = HAS_DATA_SPECIFICATION__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT__ID_SHORT = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT__CATEGORY = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT__DESCRIPTION = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT__PARENT = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT__QUALIFIER = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT__SEMANTIC_ID = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT__KIND = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Submodel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_FEATURE_COUNT = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Submodel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_OPERATION_COUNT = HAS_DATA_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.IDataElement <em>Data Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.IDataElement
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getDataElement()
	 * @generated
	 */
	int DATA_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__DATA_SPECIFICATION = SUBMODEL_ELEMENT__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__ID_SHORT = SUBMODEL_ELEMENT__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__CATEGORY = SUBMODEL_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__DESCRIPTION = SUBMODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__PARENT = SUBMODEL_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__QUALIFIER = SUBMODEL_ELEMENT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__SEMANTIC_ID = SUBMODEL_ELEMENT__SEMANTIC_ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__KIND = SUBMODEL_ELEMENT__KIND;

	/**
	 * The number of structural features of the '<em>Data Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_FEATURE_COUNT = SUBMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_OPERATION_COUNT = SUBMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.impl.Property <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.impl.Property
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getProperty()
	 * @generated
	 */
	int PROPERTY = 16;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DATA_SPECIFICATION = DATA_ELEMENT__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ID_SHORT = DATA_ELEMENT__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CATEGORY = DATA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DESCRIPTION = DATA_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PARENT = DATA_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__QUALIFIER = DATA_ELEMENT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SEMANTIC_ID = DATA_ELEMENT__SEMANTIC_ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__KIND = DATA_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE_TYPE = DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = DATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE_ID = DATA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = DATA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = DATA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.impl.MultiLanguageProperty <em>Multi Language Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.impl.MultiLanguageProperty
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getMultiLanguageProperty()
	 * @generated
	 */
	int MULTI_LANGUAGE_PROPERTY = 17;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANGUAGE_PROPERTY__DATA_SPECIFICATION = DATA_ELEMENT__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANGUAGE_PROPERTY__ID_SHORT = DATA_ELEMENT__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANGUAGE_PROPERTY__CATEGORY = DATA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANGUAGE_PROPERTY__DESCRIPTION = DATA_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANGUAGE_PROPERTY__PARENT = DATA_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANGUAGE_PROPERTY__QUALIFIER = DATA_ELEMENT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANGUAGE_PROPERTY__SEMANTIC_ID = DATA_ELEMENT__SEMANTIC_ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANGUAGE_PROPERTY__KIND = DATA_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANGUAGE_PROPERTY__VALUE = DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANGUAGE_PROPERTY__VALUE_ID = DATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multi Language Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANGUAGE_PROPERTY_FEATURE_COUNT = DATA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Multi Language Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANGUAGE_PROPERTY_OPERATION_COUNT = DATA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.impl.ReferenceElement <em>Reference Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.impl.ReferenceElement
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getReferenceElement()
	 * @generated
	 */
	int REFERENCE_ELEMENT = 18;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ELEMENT__DATA_SPECIFICATION = DATA_ELEMENT__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ELEMENT__ID_SHORT = DATA_ELEMENT__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ELEMENT__CATEGORY = DATA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ELEMENT__DESCRIPTION = DATA_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ELEMENT__PARENT = DATA_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ELEMENT__QUALIFIER = DATA_ELEMENT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ELEMENT__SEMANTIC_ID = DATA_ELEMENT__SEMANTIC_ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ELEMENT__KIND = DATA_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ELEMENT__VALUE = DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ELEMENT_FEATURE_COUNT = DATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reference Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ELEMENT_OPERATION_COUNT = DATA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.impl.Range <em>Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.impl.Range
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getRange()
	 * @generated
	 */
	int RANGE = 19;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__DATA_SPECIFICATION = DATA_ELEMENT__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__ID_SHORT = DATA_ELEMENT__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__CATEGORY = DATA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__DESCRIPTION = DATA_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__PARENT = DATA_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__QUALIFIER = DATA_ELEMENT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__SEMANTIC_ID = DATA_ELEMENT__SEMANTIC_ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__KIND = DATA_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__VALUE_TYPE = DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__MIN = DATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__MAX = DATA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FEATURE_COUNT = DATA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATION_COUNT = DATA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.impl.Blob <em>Blob</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.impl.Blob
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getBlob()
	 * @generated
	 */
	int BLOB = 20;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB__DATA_SPECIFICATION = DATA_ELEMENT__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB__ID_SHORT = DATA_ELEMENT__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB__CATEGORY = DATA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB__DESCRIPTION = DATA_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB__PARENT = DATA_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB__QUALIFIER = DATA_ELEMENT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB__SEMANTIC_ID = DATA_ELEMENT__SEMANTIC_ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB__KIND = DATA_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB__VALUE = DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB__MIME_TYPE = DATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Blob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_FEATURE_COUNT = DATA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Blob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_OPERATION_COUNT = DATA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.impl.File <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.impl.File
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getFile()
	 * @generated
	 */
	int FILE = 21;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DATA_SPECIFICATION = DATA_ELEMENT__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__ID_SHORT = DATA_ELEMENT__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CATEGORY = DATA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DESCRIPTION = DATA_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PARENT = DATA_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__QUALIFIER = DATA_ELEMENT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__SEMANTIC_ID = DATA_ELEMENT__SEMANTIC_ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__KIND = DATA_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__VALUE = DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__MIME_TYPE = DATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = DATA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = DATA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.impl.SubmodelElementCollection <em>Submodel Element Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.impl.SubmodelElementCollection
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getSubmodelElementCollection()
	 * @generated
	 */
	int SUBMODEL_ELEMENT_COLLECTION = 22;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_COLLECTION__DATA_SPECIFICATION = SUBMODEL_ELEMENT__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_COLLECTION__ID_SHORT = SUBMODEL_ELEMENT__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_COLLECTION__CATEGORY = SUBMODEL_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_COLLECTION__DESCRIPTION = SUBMODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_COLLECTION__PARENT = SUBMODEL_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_COLLECTION__QUALIFIER = SUBMODEL_ELEMENT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_COLLECTION__SEMANTIC_ID = SUBMODEL_ELEMENT__SEMANTIC_ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_COLLECTION__KIND = SUBMODEL_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Allow Duplicates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_COLLECTION__ALLOW_DUPLICATES = SUBMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_COLLECTION__ORDERED = SUBMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_COLLECTION__VALUE = SUBMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Submodel Element Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_COLLECTION_FEATURE_COUNT = SUBMODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Submodel Element Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_COLLECTION_OPERATION_COUNT = SUBMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.impl.RelationshipElement <em>Relationship Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.impl.RelationshipElement
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getRelationshipElement()
	 * @generated
	 */
	int RELATIONSHIP_ELEMENT = 23;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT__DATA_SPECIFICATION = SUBMODEL_ELEMENT__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT__ID_SHORT = SUBMODEL_ELEMENT__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT__CATEGORY = SUBMODEL_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT__DESCRIPTION = SUBMODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT__PARENT = SUBMODEL_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT__QUALIFIER = SUBMODEL_ELEMENT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT__SEMANTIC_ID = SUBMODEL_ELEMENT__SEMANTIC_ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT__KIND = SUBMODEL_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT__FIRST = SUBMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT__SECOND = SUBMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relationship Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT_FEATURE_COUNT = SUBMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Relationship Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT_OPERATION_COUNT = SUBMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.impl.AnnotatedRelationshipElement <em>Annotated Relationship Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.impl.AnnotatedRelationshipElement
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getAnnotatedRelationshipElement()
	 * @generated
	 */
	int ANNOTATED_RELATIONSHIP_ELEMENT = 24;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_RELATIONSHIP_ELEMENT__ANNOTATION = 0;

	/**
	 * The number of structural features of the '<em>Annotated Relationship Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_RELATIONSHIP_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Annotated Relationship Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_RELATIONSHIP_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.impl.Operation <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.impl.Operation
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getOperation()
	 * @generated
	 */
	int OPERATION = 25;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DATA_SPECIFICATION = SUBMODEL_ELEMENT__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ID_SHORT = SUBMODEL_ELEMENT__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CATEGORY = SUBMODEL_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DESCRIPTION = SUBMODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARENT = SUBMODEL_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__QUALIFIER = SUBMODEL_ELEMENT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SEMANTIC_ID = SUBMODEL_ELEMENT__SEMANTIC_ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__KIND = SUBMODEL_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Input Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__INPUT_VARIABLE = SUBMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OUTPUT_VARIABLE = SUBMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inoutput Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__INOUTPUT_VARIABLE = SUBMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = SUBMODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = SUBMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.impl.OperationVariable <em>Operation Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.impl.OperationVariable
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getOperationVariable()
	 * @generated
	 */
	int OPERATION_VARIABLE = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_VARIABLE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Operation Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Operation Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.impl.Capability <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.impl.Capability
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getCapability()
	 * @generated
	 */
	int CAPABILITY = 27;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DATA_SPECIFICATION = SUBMODEL_ELEMENT__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ID_SHORT = SUBMODEL_ELEMENT__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__CATEGORY = SUBMODEL_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DESCRIPTION = SUBMODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__PARENT = SUBMODEL_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__QUALIFIER = SUBMODEL_ELEMENT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__SEMANTIC_ID = SUBMODEL_ELEMENT__SEMANTIC_ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__KIND = SUBMODEL_ELEMENT__KIND;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = SUBMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_OPERATION_COUNT = SUBMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.impl.Entity <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.impl.Entity
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getEntity()
	 * @generated
	 */
	int ENTITY = 28;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DATA_SPECIFICATION = SUBMODEL_ELEMENT__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ID_SHORT = SUBMODEL_ELEMENT__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CATEGORY = SUBMODEL_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DESCRIPTION = SUBMODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PARENT = SUBMODEL_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__QUALIFIER = SUBMODEL_ELEMENT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SEMANTIC_ID = SUBMODEL_ELEMENT__SEMANTIC_ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__KIND = SUBMODEL_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__STATEMENT = SUBMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ENTITY_TYPE = SUBMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ASSET = SUBMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = SUBMODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = SUBMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.IEvent <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.IEvent
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getEvent()
	 * @generated
	 */
	int EVENT = 29;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DATA_SPECIFICATION = SUBMODEL_ELEMENT__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ID_SHORT = SUBMODEL_ELEMENT__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CATEGORY = SUBMODEL_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DESCRIPTION = SUBMODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PARENT = SUBMODEL_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__QUALIFIER = SUBMODEL_ELEMENT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__SEMANTIC_ID = SUBMODEL_ELEMENT__SEMANTIC_ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__KIND = SUBMODEL_ELEMENT__KIND;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = SUBMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = SUBMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.impl.BasicEvent <em>Basic Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.impl.BasicEvent
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getBasicEvent()
	 * @generated
	 */
	int BASIC_EVENT = 30;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__DATA_SPECIFICATION = EVENT__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__ID_SHORT = EVENT__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__CATEGORY = EVENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__DESCRIPTION = EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__PARENT = EVENT__PARENT;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__QUALIFIER = EVENT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__SEMANTIC_ID = EVENT__SEMANTIC_ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__KIND = EVENT__KIND;

	/**
	 * The feature id for the '<em><b>Observed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__OBSERVED = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Basic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Basic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.impl.View <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.impl.View
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getView()
	 * @generated
	 */
	int VIEW = 31;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__DATA_SPECIFICATION = HAS_DATA_SPECIFICATION__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__SEMANTIC_ID = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__ID_SHORT = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__CATEGORY = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__DESCRIPTION = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__PARENT = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Contained Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__CONTAINED_ELEMENT = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = HAS_DATA_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.impl.ConceptDictionary <em>Concept Dictionary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.impl.ConceptDictionary
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getConceptDictionary()
	 * @generated
	 */
	int CONCEPT_DICTIONARY = 32;

	/**
	 * The feature id for the '<em><b>Concept Description</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DICTIONARY__CONCEPT_DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Concept Dictionary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DICTIONARY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Concept Dictionary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DICTIONARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.impl.ConceptDescription <em>Concept Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.impl.ConceptDescription
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getConceptDescription()
	 * @generated
	 */
	int CONCEPT_DESCRIPTION = 33;

	/**
	 * The feature id for the '<em><b>Data Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DESCRIPTION__DATA_SPECIFICATION = HAS_DATA_SPECIFICATION__DATA_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DESCRIPTION__ID_SHORT = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DESCRIPTION__CATEGORY = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DESCRIPTION__DESCRIPTION = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DESCRIPTION__PARENT = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Administration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DESCRIPTION__ADMINISTRATION = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DESCRIPTION__IDENTIFICATION = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Case Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DESCRIPTION__IS_CASE_OF = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Concept Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DESCRIPTION_FEATURE_COUNT = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Concept Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DESCRIPTION_OPERATION_COUNT = HAS_DATA_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.impl.Reference <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.impl.Reference
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getReference()
	 * @generated
	 */
	int REFERENCE = 34;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__KEY = 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.impl.Key <em>Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.impl.Key
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getKey()
	 * @generated
	 */
	int KEY = 35;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__LOCAL = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Id Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__ID_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.impl.Security <em>Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.impl.Security
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getSecurity()
	 * @generated
	 */
	int SECURITY = 36;

	/**
	 * The number of structural features of the '<em>Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.impl.AssetAdministrationShellBundle <em>Asset Administration Shell Bundle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.impl.AssetAdministrationShellBundle
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getAssetAdministrationShellBundle()
	 * @generated
	 */
	int ASSET_ADMINISTRATION_SHELL_BUNDLE = 37;

	/**
	 * The feature id for the '<em><b>Administration Shells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL_BUNDLE__ADMINISTRATION_SHELLS = 0;

	/**
	 * The feature id for the '<em><b>Submodels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL_BUNDLE__SUBMODELS = 1;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL_BUNDLE__ASSETS = 2;

	/**
	 * The feature id for the '<em><b>Concept Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL_BUNDLE__CONCEPT_DESCRIPTIONS = 3;

	/**
	 * The number of structural features of the '<em>Asset Administration Shell Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL_BUNDLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Asset Administration Shell Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL_BUNDLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.IdentifierType <em>Identifier Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.IdentifierType
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getIdentifierType()
	 * @generated
	 */
	int IDENTIFIER_TYPE = 38;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.ModelingKind <em>Modeling Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.ModelingKind
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getModelingKind()
	 * @generated
	 */
	int MODELING_KIND = 39;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.AssetKind <em>Asset Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.AssetKind
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getAssetKind()
	 * @generated
	 */
	int ASSET_KIND = 40;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.EntityType <em>Entity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.EntityType
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getEntityType()
	 * @generated
	 */
	int ENTITY_TYPE = 41;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.KeyElements <em>Key Elements</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.KeyElements
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getKeyElements()
	 * @generated
	 */
	int KEY_ELEMENTS = 42;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.aas.KeyType <em>Key Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.aas.KeyType
	 * @see de.dfki.cos.basys.aas.impl.AasPackage#getKeyType()
	 * @generated
	 */
	int KEY_TYPE = 43;


	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IReferable <em>Referable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referable</em>'.
	 * @see de.dfki.cos.basys.aas.IReferable
	 * @generated
	 */
	EClass getReferable();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.aas.IReferable#getIdShort <em>Id Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Short</em>'.
	 * @see de.dfki.cos.basys.aas.IReferable#getIdShort()
	 * @see #getReferable()
	 * @generated
	 */
	EAttribute getReferable_IdShort();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.aas.IReferable#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see de.dfki.cos.basys.aas.IReferable#getCategory()
	 * @see #getReferable()
	 * @generated
	 */
	EAttribute getReferable_Category();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.aas.IReferable#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.dfki.cos.basys.aas.IReferable#getDescription()
	 * @see #getReferable()
	 * @generated
	 */
	EAttribute getReferable_Description();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.aas.IReferable#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see de.dfki.cos.basys.aas.IReferable#getParent()
	 * @see #getReferable()
	 * @generated
	 */
	EReference getReferable_Parent();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IIdentifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see de.dfki.cos.basys.aas.IIdentifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.cos.basys.aas.IIdentifiable#getAdministration <em>Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Administration</em>'.
	 * @see de.dfki.cos.basys.aas.IIdentifiable#getAdministration()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EReference getIdentifiable_Administration();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.cos.basys.aas.IIdentifiable#getIdentification <em>Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identification</em>'.
	 * @see de.dfki.cos.basys.aas.IIdentifiable#getIdentification()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EReference getIdentifiable_Identification();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier</em>'.
	 * @see de.dfki.cos.basys.aas.IIdentifier
	 * @generated
	 */
	EClass getIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.aas.IIdentifier#getIdType <em>Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Type</em>'.
	 * @see de.dfki.cos.basys.aas.IIdentifier#getIdType()
	 * @see #getIdentifier()
	 * @generated
	 */
	EAttribute getIdentifier_IdType();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.aas.IIdentifier#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dfki.cos.basys.aas.IIdentifier#getId()
	 * @see #getIdentifier()
	 * @generated
	 */
	EAttribute getIdentifier_Id();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IHasKind <em>Has Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Kind</em>'.
	 * @see de.dfki.cos.basys.aas.IHasKind
	 * @generated
	 */
	EClass getHasKind();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.aas.IHasKind#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see de.dfki.cos.basys.aas.IHasKind#getKind()
	 * @see #getHasKind()
	 * @generated
	 */
	EAttribute getHasKind_Kind();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IAdministrativeInformation <em>Administrative Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrative Information</em>'.
	 * @see de.dfki.cos.basys.aas.IAdministrativeInformation
	 * @generated
	 */
	EClass getAdministrativeInformation();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.aas.IAdministrativeInformation#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.dfki.cos.basys.aas.IAdministrativeInformation#getVersion()
	 * @see #getAdministrativeInformation()
	 * @generated
	 */
	EAttribute getAdministrativeInformation_Version();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.aas.IAdministrativeInformation#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see de.dfki.cos.basys.aas.IAdministrativeInformation#getRevision()
	 * @see #getAdministrativeInformation()
	 * @generated
	 */
	EAttribute getAdministrativeInformation_Revision();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IHasSemantics <em>Has Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Semantics</em>'.
	 * @see de.dfki.cos.basys.aas.IHasSemantics
	 * @generated
	 */
	EClass getHasSemantics();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.cos.basys.aas.IHasSemantics#getSemanticId <em>Semantic Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Semantic Id</em>'.
	 * @see de.dfki.cos.basys.aas.IHasSemantics#getSemanticId()
	 * @see #getHasSemantics()
	 * @generated
	 */
	EReference getHasSemantics_SemanticId();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IQualifiable <em>Qualifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualifiable</em>'.
	 * @see de.dfki.cos.basys.aas.IQualifiable
	 * @generated
	 */
	EClass getQualifiable();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.aas.IQualifiable#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Qualifier</em>'.
	 * @see de.dfki.cos.basys.aas.IQualifiable#getQualifier()
	 * @see #getQualifiable()
	 * @generated
	 */
	EReference getQualifiable_Qualifier();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see de.dfki.cos.basys.aas.IConstraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualifier</em>'.
	 * @see de.dfki.cos.basys.aas.IQualifier
	 * @generated
	 */
	EClass getQualifier();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.aas.IQualifier#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dfki.cos.basys.aas.IQualifier#getType()
	 * @see #getQualifier()
	 * @generated
	 */
	EAttribute getQualifier_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.aas.IQualifier#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see de.dfki.cos.basys.aas.IQualifier#getValueType()
	 * @see #getQualifier()
	 * @generated
	 */
	EAttribute getQualifier_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.aas.IQualifier#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.cos.basys.aas.IQualifier#getValue()
	 * @see #getQualifier()
	 * @generated
	 */
	EAttribute getQualifier_Value();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.cos.basys.aas.IQualifier#getValueId <em>Value Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Id</em>'.
	 * @see de.dfki.cos.basys.aas.IQualifier#getValueId()
	 * @see #getQualifier()
	 * @generated
	 */
	EReference getQualifier_ValueId();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formula</em>'.
	 * @see de.dfki.cos.basys.aas.IFormula
	 * @generated
	 */
	EClass getFormula();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.aas.IFormula#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Depends On</em>'.
	 * @see de.dfki.cos.basys.aas.IFormula#getDependsOn()
	 * @see #getFormula()
	 * @generated
	 */
	EReference getFormula_DependsOn();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IHasDataSpecification <em>Has Data Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Data Specification</em>'.
	 * @see de.dfki.cos.basys.aas.IHasDataSpecification
	 * @generated
	 */
	EClass getHasDataSpecification();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.cos.basys.aas.IHasDataSpecification#getDataSpecification <em>Data Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Specification</em>'.
	 * @see de.dfki.cos.basys.aas.IHasDataSpecification#getDataSpecification()
	 * @see #getHasDataSpecification()
	 * @generated
	 */
	EReference getHasDataSpecification_DataSpecification();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IAssetAdministrationShell <em>Asset Administration Shell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Administration Shell</em>'.
	 * @see de.dfki.cos.basys.aas.IAssetAdministrationShell
	 * @generated
	 */
	EClass getAssetAdministrationShell();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.aas.IAssetAdministrationShell#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Derived From</em>'.
	 * @see de.dfki.cos.basys.aas.IAssetAdministrationShell#getDerivedFrom()
	 * @see #getAssetAdministrationShell()
	 * @generated
	 */
	EReference getAssetAdministrationShell_DerivedFrom();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.cos.basys.aas.IAssetAdministrationShell#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security</em>'.
	 * @see de.dfki.cos.basys.aas.IAssetAdministrationShell#getSecurity()
	 * @see #getAssetAdministrationShell()
	 * @generated
	 */
	EReference getAssetAdministrationShell_Security();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.aas.IAssetAdministrationShell#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset</em>'.
	 * @see de.dfki.cos.basys.aas.IAssetAdministrationShell#getAsset()
	 * @see #getAssetAdministrationShell()
	 * @generated
	 */
	EReference getAssetAdministrationShell_Asset();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.cos.basys.aas.IAssetAdministrationShell#getSubmodel <em>Submodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Submodel</em>'.
	 * @see de.dfki.cos.basys.aas.IAssetAdministrationShell#getSubmodel()
	 * @see #getAssetAdministrationShell()
	 * @generated
	 */
	EReference getAssetAdministrationShell_Submodel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.aas.IAssetAdministrationShell#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View</em>'.
	 * @see de.dfki.cos.basys.aas.IAssetAdministrationShell#getView()
	 * @see #getAssetAdministrationShell()
	 * @generated
	 */
	EReference getAssetAdministrationShell_View();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.cos.basys.aas.IAssetAdministrationShell#getConceptDictionary <em>Concept Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concept Dictionary</em>'.
	 * @see de.dfki.cos.basys.aas.IAssetAdministrationShell#getConceptDictionary()
	 * @see #getAssetAdministrationShell()
	 * @generated
	 */
	EReference getAssetAdministrationShell_ConceptDictionary();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see de.dfki.cos.basys.aas.IAsset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.aas.IAsset#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see de.dfki.cos.basys.aas.IAsset#getKind()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Kind();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.aas.IAsset#getAssetIdentificationModel <em>Asset Identification Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset Identification Model</em>'.
	 * @see de.dfki.cos.basys.aas.IAsset#getAssetIdentificationModel()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_AssetIdentificationModel();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.aas.IAsset#getBillOfMaterial <em>Bill Of Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bill Of Material</em>'.
	 * @see de.dfki.cos.basys.aas.IAsset#getBillOfMaterial()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_BillOfMaterial();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.ISubmodel <em>Submodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submodel</em>'.
	 * @see de.dfki.cos.basys.aas.ISubmodel
	 * @generated
	 */
	EClass getSubmodel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.aas.ISubmodel#getSubmodelElement <em>Submodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Submodel Element</em>'.
	 * @see de.dfki.cos.basys.aas.ISubmodel#getSubmodelElement()
	 * @see #getSubmodel()
	 * @generated
	 */
	EReference getSubmodel_SubmodelElement();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.ISubmodelElement <em>Submodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submodel Element</em>'.
	 * @see de.dfki.cos.basys.aas.ISubmodelElement
	 * @generated
	 */
	EClass getSubmodelElement();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IDataElement <em>Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Element</em>'.
	 * @see de.dfki.cos.basys.aas.IDataElement
	 * @generated
	 */
	EClass getDataElement();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see de.dfki.cos.basys.aas.IProperty
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.aas.IProperty#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see de.dfki.cos.basys.aas.IProperty#getValueType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.aas.IProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.cos.basys.aas.IProperty#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.cos.basys.aas.IProperty#getValueId <em>Value Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Id</em>'.
	 * @see de.dfki.cos.basys.aas.IProperty#getValueId()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_ValueId();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IMultiLanguageProperty <em>Multi Language Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Language Property</em>'.
	 * @see de.dfki.cos.basys.aas.IMultiLanguageProperty
	 * @generated
	 */
	EClass getMultiLanguageProperty();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.aas.IMultiLanguageProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.cos.basys.aas.IMultiLanguageProperty#getValue()
	 * @see #getMultiLanguageProperty()
	 * @generated
	 */
	EAttribute getMultiLanguageProperty_Value();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.cos.basys.aas.IMultiLanguageProperty#getValueId <em>Value Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Id</em>'.
	 * @see de.dfki.cos.basys.aas.IMultiLanguageProperty#getValueId()
	 * @see #getMultiLanguageProperty()
	 * @generated
	 */
	EReference getMultiLanguageProperty_ValueId();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IReferenceElement <em>Reference Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Element</em>'.
	 * @see de.dfki.cos.basys.aas.IReferenceElement
	 * @generated
	 */
	EClass getReferenceElement();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.aas.IReferenceElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see de.dfki.cos.basys.aas.IReferenceElement#getValue()
	 * @see #getReferenceElement()
	 * @generated
	 */
	EReference getReferenceElement_Value();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range</em>'.
	 * @see de.dfki.cos.basys.aas.IRange
	 * @generated
	 */
	EClass getRange();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.aas.IRange#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see de.dfki.cos.basys.aas.IRange#getValueType()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.aas.IRange#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see de.dfki.cos.basys.aas.IRange#getMin()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_Min();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.aas.IRange#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see de.dfki.cos.basys.aas.IRange#getMax()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_Max();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IBlob <em>Blob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blob</em>'.
	 * @see de.dfki.cos.basys.aas.IBlob
	 * @generated
	 */
	EClass getBlob();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.aas.IBlob#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.cos.basys.aas.IBlob#getValue()
	 * @see #getBlob()
	 * @generated
	 */
	EAttribute getBlob_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.aas.IBlob#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see de.dfki.cos.basys.aas.IBlob#getMimeType()
	 * @see #getBlob()
	 * @generated
	 */
	EAttribute getBlob_MimeType();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see de.dfki.cos.basys.aas.IFile
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.aas.IFile#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.cos.basys.aas.IFile#getValue()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.aas.IFile#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see de.dfki.cos.basys.aas.IFile#getMimeType()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_MimeType();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.ISubmodelElementCollection <em>Submodel Element Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submodel Element Collection</em>'.
	 * @see de.dfki.cos.basys.aas.ISubmodelElementCollection
	 * @generated
	 */
	EClass getSubmodelElementCollection();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.aas.ISubmodelElementCollection#isAllowDuplicates <em>Allow Duplicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Duplicates</em>'.
	 * @see de.dfki.cos.basys.aas.ISubmodelElementCollection#isAllowDuplicates()
	 * @see #getSubmodelElementCollection()
	 * @generated
	 */
	EAttribute getSubmodelElementCollection_AllowDuplicates();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.aas.ISubmodelElementCollection#isOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordered</em>'.
	 * @see de.dfki.cos.basys.aas.ISubmodelElementCollection#isOrdered()
	 * @see #getSubmodelElementCollection()
	 * @generated
	 */
	EAttribute getSubmodelElementCollection_Ordered();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.aas.ISubmodelElementCollection#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see de.dfki.cos.basys.aas.ISubmodelElementCollection#getValue()
	 * @see #getSubmodelElementCollection()
	 * @generated
	 */
	EReference getSubmodelElementCollection_Value();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IRelationshipElement <em>Relationship Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Element</em>'.
	 * @see de.dfki.cos.basys.aas.IRelationshipElement
	 * @generated
	 */
	EClass getRelationshipElement();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.aas.IRelationshipElement#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First</em>'.
	 * @see de.dfki.cos.basys.aas.IRelationshipElement#getFirst()
	 * @see #getRelationshipElement()
	 * @generated
	 */
	EReference getRelationshipElement_First();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.aas.IRelationshipElement#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Second</em>'.
	 * @see de.dfki.cos.basys.aas.IRelationshipElement#getSecond()
	 * @see #getRelationshipElement()
	 * @generated
	 */
	EReference getRelationshipElement_Second();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IAnnotatedRelationshipElement <em>Annotated Relationship Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated Relationship Element</em>'.
	 * @see de.dfki.cos.basys.aas.IAnnotatedRelationshipElement
	 * @generated
	 */
	EClass getAnnotatedRelationshipElement();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.cos.basys.aas.IAnnotatedRelationshipElement#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotation</em>'.
	 * @see de.dfki.cos.basys.aas.IAnnotatedRelationshipElement#getAnnotation()
	 * @see #getAnnotatedRelationshipElement()
	 * @generated
	 */
	EReference getAnnotatedRelationshipElement_Annotation();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see de.dfki.cos.basys.aas.IOperation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.cos.basys.aas.IOperation#getInputVariable <em>Input Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Variable</em>'.
	 * @see de.dfki.cos.basys.aas.IOperation#getInputVariable()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_InputVariable();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.cos.basys.aas.IOperation#getOutputVariable <em>Output Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Variable</em>'.
	 * @see de.dfki.cos.basys.aas.IOperation#getOutputVariable()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_OutputVariable();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.cos.basys.aas.IOperation#getInoutputVariable <em>Inoutput Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inoutput Variable</em>'.
	 * @see de.dfki.cos.basys.aas.IOperation#getInoutputVariable()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_InoutputVariable();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IOperationVariable <em>Operation Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Variable</em>'.
	 * @see de.dfki.cos.basys.aas.IOperationVariable
	 * @generated
	 */
	EClass getOperationVariable();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.aas.IOperationVariable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see de.dfki.cos.basys.aas.IOperationVariable#getValue()
	 * @see #getOperationVariable()
	 * @generated
	 */
	EReference getOperationVariable_Value();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.ICapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see de.dfki.cos.basys.aas.ICapability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see de.dfki.cos.basys.aas.IEntity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.aas.IEntity#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statement</em>'.
	 * @see de.dfki.cos.basys.aas.IEntity#getStatement()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Statement();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.aas.IEntity#getEntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Type</em>'.
	 * @see de.dfki.cos.basys.aas.IEntity#getEntityType()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_EntityType();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.aas.IEntity#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset</em>'.
	 * @see de.dfki.cos.basys.aas.IEntity#getAsset()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Asset();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see de.dfki.cos.basys.aas.IEvent
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IBasicEvent <em>Basic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Event</em>'.
	 * @see de.dfki.cos.basys.aas.IBasicEvent
	 * @generated
	 */
	EClass getBasicEvent();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.aas.IBasicEvent#getObserved <em>Observed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Observed</em>'.
	 * @see de.dfki.cos.basys.aas.IBasicEvent#getObserved()
	 * @see #getBasicEvent()
	 * @generated
	 */
	EReference getBasicEvent_Observed();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see de.dfki.cos.basys.aas.IView
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.cos.basys.aas.IView#getContainedElement <em>Contained Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contained Element</em>'.
	 * @see de.dfki.cos.basys.aas.IView#getContainedElement()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_ContainedElement();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IConceptDictionary <em>Concept Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Dictionary</em>'.
	 * @see de.dfki.cos.basys.aas.IConceptDictionary
	 * @generated
	 */
	EClass getConceptDictionary();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.cos.basys.aas.IConceptDictionary#getConceptDescription <em>Concept Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concept Description</em>'.
	 * @see de.dfki.cos.basys.aas.IConceptDictionary#getConceptDescription()
	 * @see #getConceptDictionary()
	 * @generated
	 */
	EReference getConceptDictionary_ConceptDescription();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IConceptDescription <em>Concept Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Description</em>'.
	 * @see de.dfki.cos.basys.aas.IConceptDescription
	 * @generated
	 */
	EClass getConceptDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.aas.IConceptDescription#getIsCaseOf <em>Is Case Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Is Case Of</em>'.
	 * @see de.dfki.cos.basys.aas.IConceptDescription#getIsCaseOf()
	 * @see #getConceptDescription()
	 * @generated
	 */
	EReference getConceptDescription_IsCaseOf();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see de.dfki.cos.basys.aas.IReference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.aas.IReference#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key</em>'.
	 * @see de.dfki.cos.basys.aas.IReference#getKey()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Key();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key</em>'.
	 * @see de.dfki.cos.basys.aas.IKey
	 * @generated
	 */
	EClass getKey();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.aas.IKey#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dfki.cos.basys.aas.IKey#getType()
	 * @see #getKey()
	 * @generated
	 */
	EAttribute getKey_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.aas.IKey#isLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local</em>'.
	 * @see de.dfki.cos.basys.aas.IKey#isLocal()
	 * @see #getKey()
	 * @generated
	 */
	EAttribute getKey_Local();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.aas.IKey#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.cos.basys.aas.IKey#getValue()
	 * @see #getKey()
	 * @generated
	 */
	EAttribute getKey_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.aas.IKey#getIdType <em>Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Type</em>'.
	 * @see de.dfki.cos.basys.aas.IKey#getIdType()
	 * @see #getKey()
	 * @generated
	 */
	EAttribute getKey_IdType();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.ISecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security</em>'.
	 * @see de.dfki.cos.basys.aas.ISecurity
	 * @generated
	 */
	EClass getSecurity();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.aas.IAssetAdministrationShellBundle <em>Asset Administration Shell Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Administration Shell Bundle</em>'.
	 * @see de.dfki.cos.basys.aas.IAssetAdministrationShellBundle
	 * @generated
	 */
	EClass getAssetAdministrationShellBundle();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.aas.IAssetAdministrationShellBundle#getAdministrationShells <em>Administration Shells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Administration Shells</em>'.
	 * @see de.dfki.cos.basys.aas.IAssetAdministrationShellBundle#getAdministrationShells()
	 * @see #getAssetAdministrationShellBundle()
	 * @generated
	 */
	EReference getAssetAdministrationShellBundle_AdministrationShells();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.aas.IAssetAdministrationShellBundle#getSubmodels <em>Submodels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Submodels</em>'.
	 * @see de.dfki.cos.basys.aas.IAssetAdministrationShellBundle#getSubmodels()
	 * @see #getAssetAdministrationShellBundle()
	 * @generated
	 */
	EReference getAssetAdministrationShellBundle_Submodels();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.aas.IAssetAdministrationShellBundle#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assets</em>'.
	 * @see de.dfki.cos.basys.aas.IAssetAdministrationShellBundle#getAssets()
	 * @see #getAssetAdministrationShellBundle()
	 * @generated
	 */
	EReference getAssetAdministrationShellBundle_Assets();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.aas.IAssetAdministrationShellBundle#getConceptDescriptions <em>Concept Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concept Descriptions</em>'.
	 * @see de.dfki.cos.basys.aas.IAssetAdministrationShellBundle#getConceptDescriptions()
	 * @see #getAssetAdministrationShellBundle()
	 * @generated
	 */
	EReference getAssetAdministrationShellBundle_ConceptDescriptions();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.aas.IdentifierType <em>Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Identifier Type</em>'.
	 * @see de.dfki.cos.basys.aas.IdentifierType
	 * @generated
	 */
	EEnum getIdentifierType();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.aas.ModelingKind <em>Modeling Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modeling Kind</em>'.
	 * @see de.dfki.cos.basys.aas.ModelingKind
	 * @generated
	 */
	EEnum getModelingKind();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.aas.AssetKind <em>Asset Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Asset Kind</em>'.
	 * @see de.dfki.cos.basys.aas.AssetKind
	 * @generated
	 */
	EEnum getAssetKind();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.aas.EntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entity Type</em>'.
	 * @see de.dfki.cos.basys.aas.EntityType
	 * @generated
	 */
	EEnum getEntityType();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.aas.KeyElements <em>Key Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Key Elements</em>'.
	 * @see de.dfki.cos.basys.aas.KeyElements
	 * @generated
	 */
	EEnum getKeyElements();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.aas.KeyType <em>Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Key Type</em>'.
	 * @see de.dfki.cos.basys.aas.KeyType
	 * @generated
	 */
	EEnum getKeyType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IAasFactory getAasFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.IReferable <em>Referable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.IReferable
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getReferable()
		 * @generated
		 */
		EClass REFERABLE = eINSTANCE.getReferable();

		/**
		 * The meta object literal for the '<em><b>Id Short</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERABLE__ID_SHORT = eINSTANCE.getReferable_IdShort();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERABLE__CATEGORY = eINSTANCE.getReferable_Category();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERABLE__DESCRIPTION = eINSTANCE.getReferable_Description();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERABLE__PARENT = eINSTANCE.getReferable_Parent();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.IIdentifiable <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.IIdentifiable
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>Administration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIABLE__ADMINISTRATION = eINSTANCE.getIdentifiable_Administration();

		/**
		 * The meta object literal for the '<em><b>Identification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIABLE__IDENTIFICATION = eINSTANCE.getIdentifiable_Identification();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.impl.Identifier <em>Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.impl.Identifier
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getIdentifier()
		 * @generated
		 */
		EClass IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em><b>Id Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIER__ID_TYPE = eINSTANCE.getIdentifier_IdType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIER__ID = eINSTANCE.getIdentifier_Id();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.IHasKind <em>Has Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.IHasKind
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getHasKind()
		 * @generated
		 */
		EClass HAS_KIND = eINSTANCE.getHasKind();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAS_KIND__KIND = eINSTANCE.getHasKind_Kind();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.impl.AdministrativeInformation <em>Administrative Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.impl.AdministrativeInformation
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getAdministrativeInformation()
		 * @generated
		 */
		EClass ADMINISTRATIVE_INFORMATION = eINSTANCE.getAdministrativeInformation();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATIVE_INFORMATION__VERSION = eINSTANCE.getAdministrativeInformation_Version();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATIVE_INFORMATION__REVISION = eINSTANCE.getAdministrativeInformation_Revision();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.IHasSemantics <em>Has Semantics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.IHasSemantics
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getHasSemantics()
		 * @generated
		 */
		EClass HAS_SEMANTICS = eINSTANCE.getHasSemantics();

		/**
		 * The meta object literal for the '<em><b>Semantic Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_SEMANTICS__SEMANTIC_ID = eINSTANCE.getHasSemantics_SemanticId();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.IQualifiable <em>Qualifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.IQualifiable
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getQualifiable()
		 * @generated
		 */
		EClass QUALIFIABLE = eINSTANCE.getQualifiable();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIABLE__QUALIFIER = eINSTANCE.getQualifiable_Qualifier();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.IConstraint <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.IConstraint
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.impl.Qualifier <em>Qualifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.impl.Qualifier
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getQualifier()
		 * @generated
		 */
		EClass QUALIFIER = eINSTANCE.getQualifier();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFIER__TYPE = eINSTANCE.getQualifier_Type();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFIER__VALUE_TYPE = eINSTANCE.getQualifier_ValueType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFIER__VALUE = eINSTANCE.getQualifier_Value();

		/**
		 * The meta object literal for the '<em><b>Value Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIER__VALUE_ID = eINSTANCE.getQualifier_ValueId();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.impl.Formula <em>Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.impl.Formula
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getFormula()
		 * @generated
		 */
		EClass FORMULA = eINSTANCE.getFormula();

		/**
		 * The meta object literal for the '<em><b>Depends On</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULA__DEPENDS_ON = eINSTANCE.getFormula_DependsOn();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.IHasDataSpecification <em>Has Data Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.IHasDataSpecification
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getHasDataSpecification()
		 * @generated
		 */
		EClass HAS_DATA_SPECIFICATION = eINSTANCE.getHasDataSpecification();

		/**
		 * The meta object literal for the '<em><b>Data Specification</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_DATA_SPECIFICATION__DATA_SPECIFICATION = eINSTANCE.getHasDataSpecification_DataSpecification();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.impl.AssetAdministrationShell <em>Asset Administration Shell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.impl.AssetAdministrationShell
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getAssetAdministrationShell()
		 * @generated
		 */
		EClass ASSET_ADMINISTRATION_SHELL = eINSTANCE.getAssetAdministrationShell();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_ADMINISTRATION_SHELL__DERIVED_FROM = eINSTANCE.getAssetAdministrationShell_DerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_ADMINISTRATION_SHELL__SECURITY = eINSTANCE.getAssetAdministrationShell_Security();

		/**
		 * The meta object literal for the '<em><b>Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_ADMINISTRATION_SHELL__ASSET = eINSTANCE.getAssetAdministrationShell_Asset();

		/**
		 * The meta object literal for the '<em><b>Submodel</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_ADMINISTRATION_SHELL__SUBMODEL = eINSTANCE.getAssetAdministrationShell_Submodel();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_ADMINISTRATION_SHELL__VIEW = eINSTANCE.getAssetAdministrationShell_View();

		/**
		 * The meta object literal for the '<em><b>Concept Dictionary</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_ADMINISTRATION_SHELL__CONCEPT_DICTIONARY = eINSTANCE.getAssetAdministrationShell_ConceptDictionary();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.impl.Asset <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.impl.Asset
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__KIND = eINSTANCE.getAsset_Kind();

		/**
		 * The meta object literal for the '<em><b>Asset Identification Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__ASSET_IDENTIFICATION_MODEL = eINSTANCE.getAsset_AssetIdentificationModel();

		/**
		 * The meta object literal for the '<em><b>Bill Of Material</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__BILL_OF_MATERIAL = eINSTANCE.getAsset_BillOfMaterial();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.impl.Submodel <em>Submodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.impl.Submodel
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getSubmodel()
		 * @generated
		 */
		EClass SUBMODEL = eINSTANCE.getSubmodel();

		/**
		 * The meta object literal for the '<em><b>Submodel Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMODEL__SUBMODEL_ELEMENT = eINSTANCE.getSubmodel_SubmodelElement();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.ISubmodelElement <em>Submodel Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.ISubmodelElement
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getSubmodelElement()
		 * @generated
		 */
		EClass SUBMODEL_ELEMENT = eINSTANCE.getSubmodelElement();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.IDataElement <em>Data Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.IDataElement
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getDataElement()
		 * @generated
		 */
		EClass DATA_ELEMENT = eINSTANCE.getDataElement();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.impl.Property <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.impl.Property
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE_TYPE = eINSTANCE.getProperty_ValueType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '<em><b>Value Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__VALUE_ID = eINSTANCE.getProperty_ValueId();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.impl.MultiLanguageProperty <em>Multi Language Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.impl.MultiLanguageProperty
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getMultiLanguageProperty()
		 * @generated
		 */
		EClass MULTI_LANGUAGE_PROPERTY = eINSTANCE.getMultiLanguageProperty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_LANGUAGE_PROPERTY__VALUE = eINSTANCE.getMultiLanguageProperty_Value();

		/**
		 * The meta object literal for the '<em><b>Value Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_LANGUAGE_PROPERTY__VALUE_ID = eINSTANCE.getMultiLanguageProperty_ValueId();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.impl.ReferenceElement <em>Reference Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.impl.ReferenceElement
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getReferenceElement()
		 * @generated
		 */
		EClass REFERENCE_ELEMENT = eINSTANCE.getReferenceElement();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_ELEMENT__VALUE = eINSTANCE.getReferenceElement_Value();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.impl.Range <em>Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.impl.Range
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getRange()
		 * @generated
		 */
		EClass RANGE = eINSTANCE.getRange();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__VALUE_TYPE = eINSTANCE.getRange_ValueType();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__MIN = eINSTANCE.getRange_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__MAX = eINSTANCE.getRange_Max();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.impl.Blob <em>Blob</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.impl.Blob
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getBlob()
		 * @generated
		 */
		EClass BLOB = eINSTANCE.getBlob();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOB__VALUE = eINSTANCE.getBlob_Value();

		/**
		 * The meta object literal for the '<em><b>Mime Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOB__MIME_TYPE = eINSTANCE.getBlob_MimeType();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.impl.File <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.impl.File
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__VALUE = eINSTANCE.getFile_Value();

		/**
		 * The meta object literal for the '<em><b>Mime Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__MIME_TYPE = eINSTANCE.getFile_MimeType();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.impl.SubmodelElementCollection <em>Submodel Element Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.impl.SubmodelElementCollection
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getSubmodelElementCollection()
		 * @generated
		 */
		EClass SUBMODEL_ELEMENT_COLLECTION = eINSTANCE.getSubmodelElementCollection();

		/**
		 * The meta object literal for the '<em><b>Allow Duplicates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMODEL_ELEMENT_COLLECTION__ALLOW_DUPLICATES = eINSTANCE.getSubmodelElementCollection_AllowDuplicates();

		/**
		 * The meta object literal for the '<em><b>Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMODEL_ELEMENT_COLLECTION__ORDERED = eINSTANCE.getSubmodelElementCollection_Ordered();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMODEL_ELEMENT_COLLECTION__VALUE = eINSTANCE.getSubmodelElementCollection_Value();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.impl.RelationshipElement <em>Relationship Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.impl.RelationshipElement
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getRelationshipElement()
		 * @generated
		 */
		EClass RELATIONSHIP_ELEMENT = eINSTANCE.getRelationshipElement();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_ELEMENT__FIRST = eINSTANCE.getRelationshipElement_First();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_ELEMENT__SECOND = eINSTANCE.getRelationshipElement_Second();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.impl.AnnotatedRelationshipElement <em>Annotated Relationship Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.impl.AnnotatedRelationshipElement
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getAnnotatedRelationshipElement()
		 * @generated
		 */
		EClass ANNOTATED_RELATIONSHIP_ELEMENT = eINSTANCE.getAnnotatedRelationshipElement();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATED_RELATIONSHIP_ELEMENT__ANNOTATION = eINSTANCE.getAnnotatedRelationshipElement_Annotation();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.impl.Operation <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.impl.Operation
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Input Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__INPUT_VARIABLE = eINSTANCE.getOperation_InputVariable();

		/**
		 * The meta object literal for the '<em><b>Output Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__OUTPUT_VARIABLE = eINSTANCE.getOperation_OutputVariable();

		/**
		 * The meta object literal for the '<em><b>Inoutput Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__INOUTPUT_VARIABLE = eINSTANCE.getOperation_InoutputVariable();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.impl.OperationVariable <em>Operation Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.impl.OperationVariable
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getOperationVariable()
		 * @generated
		 */
		EClass OPERATION_VARIABLE = eINSTANCE.getOperationVariable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_VARIABLE__VALUE = eINSTANCE.getOperationVariable_Value();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.impl.Capability <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.impl.Capability
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.impl.Entity <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.impl.Entity
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__STATEMENT = eINSTANCE.getEntity_Statement();

		/**
		 * The meta object literal for the '<em><b>Entity Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__ENTITY_TYPE = eINSTANCE.getEntity_EntityType();

		/**
		 * The meta object literal for the '<em><b>Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ASSET = eINSTANCE.getEntity_Asset();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.IEvent <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.IEvent
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.impl.BasicEvent <em>Basic Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.impl.BasicEvent
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getBasicEvent()
		 * @generated
		 */
		EClass BASIC_EVENT = eINSTANCE.getBasicEvent();

		/**
		 * The meta object literal for the '<em><b>Observed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_EVENT__OBSERVED = eINSTANCE.getBasicEvent_Observed();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.impl.View <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.impl.View
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Contained Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__CONTAINED_ELEMENT = eINSTANCE.getView_ContainedElement();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.impl.ConceptDictionary <em>Concept Dictionary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.impl.ConceptDictionary
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getConceptDictionary()
		 * @generated
		 */
		EClass CONCEPT_DICTIONARY = eINSTANCE.getConceptDictionary();

		/**
		 * The meta object literal for the '<em><b>Concept Description</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT_DICTIONARY__CONCEPT_DESCRIPTION = eINSTANCE.getConceptDictionary_ConceptDescription();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.impl.ConceptDescription <em>Concept Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.impl.ConceptDescription
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getConceptDescription()
		 * @generated
		 */
		EClass CONCEPT_DESCRIPTION = eINSTANCE.getConceptDescription();

		/**
		 * The meta object literal for the '<em><b>Is Case Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT_DESCRIPTION__IS_CASE_OF = eINSTANCE.getConceptDescription_IsCaseOf();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.impl.Reference <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.impl.Reference
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__KEY = eINSTANCE.getReference_Key();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.impl.Key <em>Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.impl.Key
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getKey()
		 * @generated
		 */
		EClass KEY = eINSTANCE.getKey();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY__TYPE = eINSTANCE.getKey_Type();

		/**
		 * The meta object literal for the '<em><b>Local</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY__LOCAL = eINSTANCE.getKey_Local();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY__VALUE = eINSTANCE.getKey_Value();

		/**
		 * The meta object literal for the '<em><b>Id Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY__ID_TYPE = eINSTANCE.getKey_IdType();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.impl.Security <em>Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.impl.Security
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getSecurity()
		 * @generated
		 */
		EClass SECURITY = eINSTANCE.getSecurity();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.impl.AssetAdministrationShellBundle <em>Asset Administration Shell Bundle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.impl.AssetAdministrationShellBundle
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getAssetAdministrationShellBundle()
		 * @generated
		 */
		EClass ASSET_ADMINISTRATION_SHELL_BUNDLE = eINSTANCE.getAssetAdministrationShellBundle();

		/**
		 * The meta object literal for the '<em><b>Administration Shells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_ADMINISTRATION_SHELL_BUNDLE__ADMINISTRATION_SHELLS = eINSTANCE.getAssetAdministrationShellBundle_AdministrationShells();

		/**
		 * The meta object literal for the '<em><b>Submodels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_ADMINISTRATION_SHELL_BUNDLE__SUBMODELS = eINSTANCE.getAssetAdministrationShellBundle_Submodels();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_ADMINISTRATION_SHELL_BUNDLE__ASSETS = eINSTANCE.getAssetAdministrationShellBundle_Assets();

		/**
		 * The meta object literal for the '<em><b>Concept Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_ADMINISTRATION_SHELL_BUNDLE__CONCEPT_DESCRIPTIONS = eINSTANCE.getAssetAdministrationShellBundle_ConceptDescriptions();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.IdentifierType <em>Identifier Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.IdentifierType
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getIdentifierType()
		 * @generated
		 */
		EEnum IDENTIFIER_TYPE = eINSTANCE.getIdentifierType();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.ModelingKind <em>Modeling Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.ModelingKind
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getModelingKind()
		 * @generated
		 */
		EEnum MODELING_KIND = eINSTANCE.getModelingKind();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.AssetKind <em>Asset Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.AssetKind
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getAssetKind()
		 * @generated
		 */
		EEnum ASSET_KIND = eINSTANCE.getAssetKind();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.EntityType <em>Entity Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.EntityType
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getEntityType()
		 * @generated
		 */
		EEnum ENTITY_TYPE = eINSTANCE.getEntityType();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.KeyElements <em>Key Elements</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.KeyElements
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getKeyElements()
		 * @generated
		 */
		EEnum KEY_ELEMENTS = eINSTANCE.getKeyElements();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.aas.KeyType <em>Key Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.aas.KeyType
		 * @see de.dfki.cos.basys.aas.impl.AasPackage#getKeyType()
		 * @generated
		 */
		EEnum KEY_TYPE = eINSTANCE.getKeyType();

	}

} //IAasPackage
