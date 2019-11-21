/**
 */
package de.dfki.cos.basys.platform.model.aas;

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
 * @see de.dfki.cos.basys.platform.model.aas.AasFactory
 * @model kind="package"
 * @generated
 */
public interface AasPackage extends EPackage {
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
	AasPackage eINSTANCE = de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.aas.HasDataSpecification <em>Has Data Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.aas.HasDataSpecification
	 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getHasDataSpecification()
	 * @generated
	 */
	int HAS_DATA_SPECIFICATION = 1;

	/**
	 * The number of structural features of the '<em>Has Data Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_DATA_SPECIFICATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Has Data Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_DATA_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.aas.impl.AssetAdministrationShellImpl <em>Asset Administration Shell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.aas.impl.AssetAdministrationShellImpl
	 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getAssetAdministrationShell()
	 * @generated
	 */
	int ASSET_ADMINISTRATION_SHELL = 0;

	/**
	 * The feature id for the '<em><b>Administration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__ADMINISTRATION = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__IDENTIFICATION = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__DERIVED_FROM = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__SECURITY = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__ASSET = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Submodel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__SUBMODEL = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL__VIEW = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Asset Administration Shell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL_FEATURE_COUNT = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Asset Administration Shell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_ADMINISTRATION_SHELL_OPERATION_COUNT = HAS_DATA_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.aas.Identifiable <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.aas.Identifiable
	 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 2;

	/**
	 * The feature id for the '<em><b>Administration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__ADMINISTRATION = 0;

	/**
	 * The feature id for the '<em><b>Identification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__IDENTIFICATION = 1;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.aas.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.aas.impl.AssetImpl
	 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 3;

	/**
	 * The feature id for the '<em><b>Administration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ADMINISTRATION = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__IDENTIFICATION = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__KIND = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Asset Identification Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ASSET_IDENTIFICATION_MODEL = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = HAS_DATA_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.aas.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.aas.impl.ViewImpl
	 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 4;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' reference.
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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.aas.HasKind <em>Has Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.aas.HasKind
	 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getHasKind()
	 * @generated
	 */
	int HAS_KIND = 5;

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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.aas.HasSemantics <em>Has Semantics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.aas.HasSemantics
	 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getHasSemantics()
	 * @generated
	 */
	int HAS_SEMANTICS = 6;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' reference.
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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.aas.Referable <em>Referable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.aas.Referable
	 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getReferable()
	 * @generated
	 */
	int REFERABLE = 7;

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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.aas.impl.SubmodelImpl <em>Submodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.aas.impl.SubmodelImpl
	 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getSubmodel()
	 * @generated
	 */
	int SUBMODEL = 8;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL__KIND = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL__SEMANTIC_ID = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Administration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL__ADMINISTRATION = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Identification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL__IDENTIFICATION = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL__QUALIFIER = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Submodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL__SUBMODEL_ELEMENT = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Submodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_FEATURE_COUNT = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Submodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_OPERATION_COUNT = HAS_DATA_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.aas.Qualifiable <em>Qualifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.aas.Qualifiable
	 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getQualifiable()
	 * @generated
	 */
	int QUALIFIABLE = 9;

	/**
	 * The number of structural features of the '<em>Qualifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Qualifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.aas.Constraint <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.aas.Constraint
	 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 11;

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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.aas.impl.QualifierImpl <em>Qualifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.aas.impl.QualifierImpl
	 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getQualifier()
	 * @generated
	 */
	int QUALIFIER = 10;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER__SEMANTIC_ID = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualifier Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER__QUALIFIER_TYPE = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Qualifier Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER__QUALIFIER_VALUE = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Qualifier Value Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER__QUALIFIER_VALUE_ID = CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.aas.impl.SubmodelElementImpl <em>Submodel Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.aas.impl.SubmodelElementImpl
	 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getSubmodelElement()
	 * @generated
	 */
	int SUBMODEL_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT__KIND = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT__SEMANTIC_ID = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT__ID_SHORT = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT__CATEGORY = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT__DESCRIPTION = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT__PARENT = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT__QUALIFIER = HAS_DATA_SPECIFICATION_FEATURE_COUNT + 6;

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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.aas.impl.DataElementImpl <em>Data Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.aas.impl.DataElementImpl
	 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getDataElement()
	 * @generated
	 */
	int DATA_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Submodelelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__SUBMODELELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Data Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.aas.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.aas.impl.PropertyImpl
	 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 14;

	/**
	 * The feature id for the '<em><b>Submodelelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SUBMODELELEMENT = DATA_ELEMENT__SUBMODELELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE_TYPE = DATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = DATA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = DATA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.aas.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.aas.impl.FileImpl
	 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 15;

	/**
	 * The feature id for the '<em><b>Submodelelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__SUBMODELELEMENT = DATA_ELEMENT__SUBMODELELEMENT;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__MIME_TYPE = DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__VALUE = DATA_ELEMENT_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.aas.impl.BlobImpl <em>Blob</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.aas.impl.BlobImpl
	 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getBlob()
	 * @generated
	 */
	int BLOB = 16;

	/**
	 * The feature id for the '<em><b>Submodelelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB__SUBMODELELEMENT = DATA_ELEMENT__SUBMODELELEMENT;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB__MIME_TYPE = DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB__VALUE = DATA_ELEMENT_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.aas.impl.ReferenceElementImpl <em>Reference Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.aas.impl.ReferenceElementImpl
	 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getReferenceElement()
	 * @generated
	 */
	int REFERENCE_ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>Submodelelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ELEMENT__SUBMODELELEMENT = DATA_ELEMENT__SUBMODELELEMENT;

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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.aas.impl.SubmodelElementCollectionImpl <em>Submodel Element Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.aas.impl.SubmodelElementCollectionImpl
	 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getSubmodelElementCollection()
	 * @generated
	 */
	int SUBMODEL_ELEMENT_COLLECTION = 18;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_COLLECTION__KIND = SUBMODEL_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_COLLECTION__SEMANTIC_ID = SUBMODEL_ELEMENT__SEMANTIC_ID;

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
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODEL_ELEMENT_COLLECTION__QUALIFIER = SUBMODEL_ELEMENT__QUALIFIER;

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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.aas.impl.RelationshipElementImpl <em>Relationship Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.aas.impl.RelationshipElementImpl
	 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getRelationshipElement()
	 * @generated
	 */
	int RELATIONSHIP_ELEMENT = 19;

	/**
	 * The feature id for the '<em><b>Submodel Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT__SUBMODEL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT__FIRST = 1;

	/**
	 * The feature id for the '<em><b>Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT__SECOND = 2;

	/**
	 * The number of structural features of the '<em>Relationship Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Relationship Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.aas.impl.OperationVariableImpl <em>Operation Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.aas.impl.OperationVariableImpl
	 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getOperationVariable()
	 * @generated
	 */
	int OPERATION_VARIABLE = 20;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_VARIABLE__KIND = SUBMODEL_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_VARIABLE__SEMANTIC_ID = SUBMODEL_ELEMENT__SEMANTIC_ID;

	/**
	 * The feature id for the '<em><b>Id Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_VARIABLE__ID_SHORT = SUBMODEL_ELEMENT__ID_SHORT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_VARIABLE__CATEGORY = SUBMODEL_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_VARIABLE__DESCRIPTION = SUBMODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_VARIABLE__PARENT = SUBMODEL_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_VARIABLE__QUALIFIER = SUBMODEL_ELEMENT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_VARIABLE__VALUE = SUBMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_VARIABLE_FEATURE_COUNT = SUBMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operation Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_VARIABLE_OPERATION_COUNT = SUBMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.aas.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.aas.impl.OperationImpl
	 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 21;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__KIND = SUBMODEL_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SEMANTIC_ID = SUBMODEL_ELEMENT__SEMANTIC_ID;

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
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__QUALIFIER = SUBMODEL_ELEMENT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IN = SUBMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OUT = SUBMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = SUBMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = SUBMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.aas.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.aas.impl.EventImpl
	 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 22;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__KIND = SUBMODEL_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Semantic Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__SEMANTIC_ID = SUBMODEL_ELEMENT__SEMANTIC_ID;

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
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__QUALIFIER = SUBMODEL_ELEMENT__QUALIFIER;

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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.aas.impl.SecurityImpl <em>Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.aas.impl.SecurityImpl
	 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getSecurity()
	 * @generated
	 */
	int SECURITY = 23;

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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.aas.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.aas.impl.ReferenceImpl
	 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 24;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.aas.impl.IdentifierImpl <em>Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.aas.impl.IdentifierImpl
	 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 25;

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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.aas.impl.AdministrativeInformationImpl <em>Administrative Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.aas.impl.AdministrativeInformationImpl
	 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getAdministrativeInformation()
	 * @generated
	 */
	int ADMINISTRATIVE_INFORMATION = 26;

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
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.aas.Kind <em>Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.aas.Kind
	 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getKind()
	 * @generated
	 */
	int KIND = 27;

	/**
	 * The meta object id for the '{@link de.dfki.cos.basys.platform.model.aas.IdentifierType <em>Identifier Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.cos.basys.platform.model.aas.IdentifierType
	 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getIdentifierType()
	 * @generated
	 */
	int IDENTIFIER_TYPE = 28;


	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.aas.AssetAdministrationShell <em>Asset Administration Shell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Administration Shell</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.AssetAdministrationShell
	 * @generated
	 */
	EClass getAssetAdministrationShell();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.platform.model.aas.AssetAdministrationShell#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Derived From</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.AssetAdministrationShell#getDerivedFrom()
	 * @see #getAssetAdministrationShell()
	 * @generated
	 */
	EReference getAssetAdministrationShell_DerivedFrom();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.cos.basys.platform.model.aas.AssetAdministrationShell#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.AssetAdministrationShell#getSecurity()
	 * @see #getAssetAdministrationShell()
	 * @generated
	 */
	EReference getAssetAdministrationShell_Security();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.cos.basys.platform.model.aas.AssetAdministrationShell#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Asset</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.AssetAdministrationShell#getAsset()
	 * @see #getAssetAdministrationShell()
	 * @generated
	 */
	EReference getAssetAdministrationShell_Asset();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.aas.AssetAdministrationShell#getSubmodel <em>Submodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Submodel</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.AssetAdministrationShell#getSubmodel()
	 * @see #getAssetAdministrationShell()
	 * @generated
	 */
	EReference getAssetAdministrationShell_Submodel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.aas.AssetAdministrationShell#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.AssetAdministrationShell#getView()
	 * @see #getAssetAdministrationShell()
	 * @generated
	 */
	EReference getAssetAdministrationShell_View();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.aas.HasDataSpecification <em>Has Data Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Data Specification</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.HasDataSpecification
	 * @generated
	 */
	EClass getHasDataSpecification();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.aas.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.platform.model.aas.Identifiable#getAdministration <em>Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Administration</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Identifiable#getAdministration()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EReference getIdentifiable_Administration();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.platform.model.aas.Identifiable#getIdentification <em>Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Identification</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Identifiable#getIdentification()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EReference getIdentifiable_Identification();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.aas.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.platform.model.aas.Asset#getAssetIdentificationModel <em>Asset Identification Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset Identification Model</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Asset#getAssetIdentificationModel()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_AssetIdentificationModel();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.aas.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.cos.basys.platform.model.aas.View#getContainedElement <em>Contained Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contained Element</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.View#getContainedElement()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_ContainedElement();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.aas.HasKind <em>Has Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Kind</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.HasKind
	 * @generated
	 */
	EClass getHasKind();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.aas.HasKind#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.HasKind#getKind()
	 * @see #getHasKind()
	 * @generated
	 */
	EAttribute getHasKind_Kind();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.aas.HasSemantics <em>Has Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Semantics</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.HasSemantics
	 * @generated
	 */
	EClass getHasSemantics();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.platform.model.aas.HasSemantics#getSemanticId <em>Semantic Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Semantic Id</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.HasSemantics#getSemanticId()
	 * @see #getHasSemantics()
	 * @generated
	 */
	EReference getHasSemantics_SemanticId();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.aas.Referable <em>Referable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referable</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Referable
	 * @generated
	 */
	EClass getReferable();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.aas.Referable#getIdShort <em>Id Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Short</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Referable#getIdShort()
	 * @see #getReferable()
	 * @generated
	 */
	EAttribute getReferable_IdShort();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.aas.Referable#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Referable#getCategory()
	 * @see #getReferable()
	 * @generated
	 */
	EAttribute getReferable_Category();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.aas.Referable#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Referable#getDescription()
	 * @see #getReferable()
	 * @generated
	 */
	EAttribute getReferable_Description();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.platform.model.aas.Referable#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Referable#getParent()
	 * @see #getReferable()
	 * @generated
	 */
	EReference getReferable_Parent();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.aas.Submodel <em>Submodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submodel</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Submodel
	 * @generated
	 */
	EClass getSubmodel();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.cos.basys.platform.model.aas.Submodel#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qualifier</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Submodel#getQualifier()
	 * @see #getSubmodel()
	 * @generated
	 */
	EReference getSubmodel_Qualifier();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.aas.Submodel#getSubmodelElement <em>Submodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Submodel Element</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Submodel#getSubmodelElement()
	 * @see #getSubmodel()
	 * @generated
	 */
	EReference getSubmodel_SubmodelElement();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.aas.Qualifiable <em>Qualifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualifiable</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Qualifiable
	 * @generated
	 */
	EClass getQualifiable();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.aas.Qualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualifier</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Qualifier
	 * @generated
	 */
	EClass getQualifier();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.aas.Qualifier#getQualifierType <em>Qualifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier Type</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Qualifier#getQualifierType()
	 * @see #getQualifier()
	 * @generated
	 */
	EAttribute getQualifier_QualifierType();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.aas.Qualifier#getQualifierValue <em>Qualifier Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier Value</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Qualifier#getQualifierValue()
	 * @see #getQualifier()
	 * @generated
	 */
	EAttribute getQualifier_QualifierValue();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.aas.Qualifier#getQualifierValueId <em>Qualifier Value Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier Value Id</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Qualifier#getQualifierValueId()
	 * @see #getQualifier()
	 * @generated
	 */
	EAttribute getQualifier_QualifierValueId();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.aas.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.aas.SubmodelElement <em>Submodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submodel Element</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.SubmodelElement
	 * @generated
	 */
	EClass getSubmodelElement();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.cos.basys.platform.model.aas.SubmodelElement#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qualifier</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.SubmodelElement#getQualifier()
	 * @see #getSubmodelElement()
	 * @generated
	 */
	EReference getSubmodelElement_Qualifier();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.aas.DataElement <em>Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Element</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.DataElement
	 * @generated
	 */
	EClass getDataElement();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.platform.model.aas.DataElement#getSubmodelelement <em>Submodelelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Submodelelement</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.DataElement#getSubmodelelement()
	 * @see #getDataElement()
	 * @generated
	 */
	EReference getDataElement_Submodelelement();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.aas.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.aas.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.aas.Property#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Property#getValueType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_ValueType();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.aas.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.aas.File#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.File#getMimeType()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_MimeType();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.aas.File#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.File#getValue()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Value();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.aas.Blob <em>Blob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blob</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Blob
	 * @generated
	 */
	EClass getBlob();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.aas.Blob#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Blob#getMimeType()
	 * @see #getBlob()
	 * @generated
	 */
	EAttribute getBlob_MimeType();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.aas.Blob#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Blob#getValue()
	 * @see #getBlob()
	 * @generated
	 */
	EAttribute getBlob_Value();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.aas.ReferenceElement <em>Reference Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Element</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.ReferenceElement
	 * @generated
	 */
	EClass getReferenceElement();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.platform.model.aas.ReferenceElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.ReferenceElement#getValue()
	 * @see #getReferenceElement()
	 * @generated
	 */
	EReference getReferenceElement_Value();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.aas.SubmodelElementCollection <em>Submodel Element Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submodel Element Collection</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.SubmodelElementCollection
	 * @generated
	 */
	EClass getSubmodelElementCollection();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.aas.SubmodelElementCollection#isAllowDuplicates <em>Allow Duplicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Duplicates</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.SubmodelElementCollection#isAllowDuplicates()
	 * @see #getSubmodelElementCollection()
	 * @generated
	 */
	EAttribute getSubmodelElementCollection_AllowDuplicates();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.aas.SubmodelElementCollection#isOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordered</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.SubmodelElementCollection#isOrdered()
	 * @see #getSubmodelElementCollection()
	 * @generated
	 */
	EAttribute getSubmodelElementCollection_Ordered();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.cos.basys.platform.model.aas.SubmodelElementCollection#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.SubmodelElementCollection#getValue()
	 * @see #getSubmodelElementCollection()
	 * @generated
	 */
	EReference getSubmodelElementCollection_Value();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.aas.RelationshipElement <em>Relationship Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Element</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.RelationshipElement
	 * @generated
	 */
	EClass getRelationshipElement();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.platform.model.aas.RelationshipElement#getSubmodelElement <em>Submodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Submodel Element</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.RelationshipElement#getSubmodelElement()
	 * @see #getRelationshipElement()
	 * @generated
	 */
	EReference getRelationshipElement_SubmodelElement();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.platform.model.aas.RelationshipElement#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.RelationshipElement#getFirst()
	 * @see #getRelationshipElement()
	 * @generated
	 */
	EReference getRelationshipElement_First();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.platform.model.aas.RelationshipElement#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Second</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.RelationshipElement#getSecond()
	 * @see #getRelationshipElement()
	 * @generated
	 */
	EReference getRelationshipElement_Second();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.aas.OperationVariable <em>Operation Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Variable</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.OperationVariable
	 * @generated
	 */
	EClass getOperationVariable();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.cos.basys.platform.model.aas.OperationVariable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.OperationVariable#getValue()
	 * @see #getOperationVariable()
	 * @generated
	 */
	EReference getOperationVariable_Value();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.aas.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.cos.basys.platform.model.aas.Operation#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Operation#getIn()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_In();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.cos.basys.platform.model.aas.Operation#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Operation#getOut()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Out();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.aas.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.aas.Security <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Security
	 * @generated
	 */
	EClass getSecurity();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.aas.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.aas.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Identifier
	 * @generated
	 */
	EClass getIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.aas.Identifier#getIdType <em>Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Type</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Identifier#getIdType()
	 * @see #getIdentifier()
	 * @generated
	 */
	EAttribute getIdentifier_IdType();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.aas.Identifier#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Identifier#getId()
	 * @see #getIdentifier()
	 * @generated
	 */
	EAttribute getIdentifier_Id();

	/**
	 * Returns the meta object for class '{@link de.dfki.cos.basys.platform.model.aas.AdministrativeInformation <em>Administrative Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrative Information</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.AdministrativeInformation
	 * @generated
	 */
	EClass getAdministrativeInformation();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.aas.AdministrativeInformation#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.AdministrativeInformation#getVersion()
	 * @see #getAdministrativeInformation()
	 * @generated
	 */
	EAttribute getAdministrativeInformation_Version();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.cos.basys.platform.model.aas.AdministrativeInformation#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.AdministrativeInformation#getRevision()
	 * @see #getAdministrativeInformation()
	 * @generated
	 */
	EAttribute getAdministrativeInformation_Revision();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.platform.model.aas.Kind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Kind</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.Kind
	 * @generated
	 */
	EEnum getKind();

	/**
	 * Returns the meta object for enum '{@link de.dfki.cos.basys.platform.model.aas.IdentifierType <em>Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Identifier Type</em>'.
	 * @see de.dfki.cos.basys.platform.model.aas.IdentifierType
	 * @generated
	 */
	EEnum getIdentifierType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AasFactory getAasFactory();

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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.aas.impl.AssetAdministrationShellImpl <em>Asset Administration Shell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.aas.impl.AssetAdministrationShellImpl
		 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getAssetAdministrationShell()
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
		 * The meta object literal for the '<em><b>Asset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_ADMINISTRATION_SHELL__ASSET = eINSTANCE.getAssetAdministrationShell_Asset();

		/**
		 * The meta object literal for the '<em><b>Submodel</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.aas.HasDataSpecification <em>Has Data Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.aas.HasDataSpecification
		 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getHasDataSpecification()
		 * @generated
		 */
		EClass HAS_DATA_SPECIFICATION = eINSTANCE.getHasDataSpecification();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.aas.Identifiable <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.aas.Identifiable
		 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>Administration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIABLE__ADMINISTRATION = eINSTANCE.getIdentifiable_Administration();

		/**
		 * The meta object literal for the '<em><b>Identification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIABLE__IDENTIFICATION = eINSTANCE.getIdentifiable_Identification();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.aas.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.aas.impl.AssetImpl
		 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '<em><b>Asset Identification Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__ASSET_IDENTIFICATION_MODEL = eINSTANCE.getAsset_AssetIdentificationModel();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.aas.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.aas.impl.ViewImpl
		 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getView()
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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.aas.HasKind <em>Has Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.aas.HasKind
		 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getHasKind()
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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.aas.HasSemantics <em>Has Semantics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.aas.HasSemantics
		 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getHasSemantics()
		 * @generated
		 */
		EClass HAS_SEMANTICS = eINSTANCE.getHasSemantics();

		/**
		 * The meta object literal for the '<em><b>Semantic Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_SEMANTICS__SEMANTIC_ID = eINSTANCE.getHasSemantics_SemanticId();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.aas.Referable <em>Referable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.aas.Referable
		 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getReferable()
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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.aas.impl.SubmodelImpl <em>Submodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.aas.impl.SubmodelImpl
		 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getSubmodel()
		 * @generated
		 */
		EClass SUBMODEL = eINSTANCE.getSubmodel();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMODEL__QUALIFIER = eINSTANCE.getSubmodel_Qualifier();

		/**
		 * The meta object literal for the '<em><b>Submodel Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMODEL__SUBMODEL_ELEMENT = eINSTANCE.getSubmodel_SubmodelElement();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.aas.Qualifiable <em>Qualifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.aas.Qualifiable
		 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getQualifiable()
		 * @generated
		 */
		EClass QUALIFIABLE = eINSTANCE.getQualifiable();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.aas.impl.QualifierImpl <em>Qualifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.aas.impl.QualifierImpl
		 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getQualifier()
		 * @generated
		 */
		EClass QUALIFIER = eINSTANCE.getQualifier();

		/**
		 * The meta object literal for the '<em><b>Qualifier Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFIER__QUALIFIER_TYPE = eINSTANCE.getQualifier_QualifierType();

		/**
		 * The meta object literal for the '<em><b>Qualifier Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFIER__QUALIFIER_VALUE = eINSTANCE.getQualifier_QualifierValue();

		/**
		 * The meta object literal for the '<em><b>Qualifier Value Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFIER__QUALIFIER_VALUE_ID = eINSTANCE.getQualifier_QualifierValueId();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.aas.Constraint <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.aas.Constraint
		 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.aas.impl.SubmodelElementImpl <em>Submodel Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.aas.impl.SubmodelElementImpl
		 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getSubmodelElement()
		 * @generated
		 */
		EClass SUBMODEL_ELEMENT = eINSTANCE.getSubmodelElement();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMODEL_ELEMENT__QUALIFIER = eINSTANCE.getSubmodelElement_Qualifier();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.aas.impl.DataElementImpl <em>Data Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.aas.impl.DataElementImpl
		 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getDataElement()
		 * @generated
		 */
		EClass DATA_ELEMENT = eINSTANCE.getDataElement();

		/**
		 * The meta object literal for the '<em><b>Submodelelement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ELEMENT__SUBMODELELEMENT = eINSTANCE.getDataElement_Submodelelement();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.aas.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.aas.impl.PropertyImpl
		 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE_TYPE = eINSTANCE.getProperty_ValueType();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.aas.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.aas.impl.FileImpl
		 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Mime Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__MIME_TYPE = eINSTANCE.getFile_MimeType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__VALUE = eINSTANCE.getFile_Value();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.aas.impl.BlobImpl <em>Blob</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.aas.impl.BlobImpl
		 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getBlob()
		 * @generated
		 */
		EClass BLOB = eINSTANCE.getBlob();

		/**
		 * The meta object literal for the '<em><b>Mime Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOB__MIME_TYPE = eINSTANCE.getBlob_MimeType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOB__VALUE = eINSTANCE.getBlob_Value();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.aas.impl.ReferenceElementImpl <em>Reference Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.aas.impl.ReferenceElementImpl
		 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getReferenceElement()
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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.aas.impl.SubmodelElementCollectionImpl <em>Submodel Element Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.aas.impl.SubmodelElementCollectionImpl
		 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getSubmodelElementCollection()
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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.aas.impl.RelationshipElementImpl <em>Relationship Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.aas.impl.RelationshipElementImpl
		 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getRelationshipElement()
		 * @generated
		 */
		EClass RELATIONSHIP_ELEMENT = eINSTANCE.getRelationshipElement();

		/**
		 * The meta object literal for the '<em><b>Submodel Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_ELEMENT__SUBMODEL_ELEMENT = eINSTANCE.getRelationshipElement_SubmodelElement();

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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.aas.impl.OperationVariableImpl <em>Operation Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.aas.impl.OperationVariableImpl
		 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getOperationVariable()
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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.aas.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.aas.impl.OperationImpl
		 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__IN = eINSTANCE.getOperation_In();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__OUT = eINSTANCE.getOperation_Out();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.aas.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.aas.impl.EventImpl
		 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.aas.impl.SecurityImpl <em>Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.aas.impl.SecurityImpl
		 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getSecurity()
		 * @generated
		 */
		EClass SECURITY = eINSTANCE.getSecurity();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.aas.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.aas.impl.ReferenceImpl
		 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.aas.impl.IdentifierImpl <em>Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.aas.impl.IdentifierImpl
		 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getIdentifier()
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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.aas.impl.AdministrativeInformationImpl <em>Administrative Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.aas.impl.AdministrativeInformationImpl
		 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getAdministrativeInformation()
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
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.aas.Kind <em>Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.aas.Kind
		 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getKind()
		 * @generated
		 */
		EEnum KIND = eINSTANCE.getKind();

		/**
		 * The meta object literal for the '{@link de.dfki.cos.basys.platform.model.aas.IdentifierType <em>Identifier Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.cos.basys.platform.model.aas.IdentifierType
		 * @see de.dfki.cos.basys.platform.model.aas.impl.AasPackageImpl#getIdentifierType()
		 * @generated
		 */
		EEnum IDENTIFIER_TYPE = eINSTANCE.getIdentifierType();

	}

} //AasPackage
