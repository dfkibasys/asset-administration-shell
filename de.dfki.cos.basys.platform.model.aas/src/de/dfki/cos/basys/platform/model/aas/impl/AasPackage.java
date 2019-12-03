/**
 */
package de.dfki.cos.basys.platform.model.aas.impl;

import de.dfki.cos.basys.platform.model.aas.AssetKind;
import de.dfki.cos.basys.platform.model.aas.EntityType;
import de.dfki.cos.basys.platform.model.aas.IAasFactory;
import de.dfki.cos.basys.platform.model.aas.IAasPackage;
import de.dfki.cos.basys.platform.model.aas.IAdministrativeInformation;
import de.dfki.cos.basys.platform.model.aas.IAnnotatedRelationshipElement;
import de.dfki.cos.basys.platform.model.aas.IAsset;
import de.dfki.cos.basys.platform.model.aas.IAssetAdministrationShell;
import de.dfki.cos.basys.platform.model.aas.IAssetAdministrationShellBundle;
import de.dfki.cos.basys.platform.model.aas.IBasicEvent;
import de.dfki.cos.basys.platform.model.aas.IBlob;
import de.dfki.cos.basys.platform.model.aas.ICapability;
import de.dfki.cos.basys.platform.model.aas.IConceptDescription;
import de.dfki.cos.basys.platform.model.aas.IConceptDictionary;
import de.dfki.cos.basys.platform.model.aas.IConstraint;
import de.dfki.cos.basys.platform.model.aas.IDataElement;
import de.dfki.cos.basys.platform.model.aas.IEntity;
import de.dfki.cos.basys.platform.model.aas.IEvent;
import de.dfki.cos.basys.platform.model.aas.IFile;
import de.dfki.cos.basys.platform.model.aas.IFormula;
import de.dfki.cos.basys.platform.model.aas.IHasDataSpecification;
import de.dfki.cos.basys.platform.model.aas.IHasKind;
import de.dfki.cos.basys.platform.model.aas.IHasSemantics;
import de.dfki.cos.basys.platform.model.aas.IIdentifiable;
import de.dfki.cos.basys.platform.model.aas.IIdentifier;
import de.dfki.cos.basys.platform.model.aas.IKey;
import de.dfki.cos.basys.platform.model.aas.IMultiLanguageProperty;
import de.dfki.cos.basys.platform.model.aas.IOperation;
import de.dfki.cos.basys.platform.model.aas.IOperationVariable;
import de.dfki.cos.basys.platform.model.aas.IProperty;
import de.dfki.cos.basys.platform.model.aas.IQualifiable;
import de.dfki.cos.basys.platform.model.aas.IQualifier;
import de.dfki.cos.basys.platform.model.aas.IRange;
import de.dfki.cos.basys.platform.model.aas.IReferable;
import de.dfki.cos.basys.platform.model.aas.IReference;
import de.dfki.cos.basys.platform.model.aas.IReferenceElement;
import de.dfki.cos.basys.platform.model.aas.IRelationshipElement;
import de.dfki.cos.basys.platform.model.aas.ISecurity;
import de.dfki.cos.basys.platform.model.aas.ISubmodel;
import de.dfki.cos.basys.platform.model.aas.ISubmodelElement;
import de.dfki.cos.basys.platform.model.aas.ISubmodelElementCollection;
import de.dfki.cos.basys.platform.model.aas.IView;
import de.dfki.cos.basys.platform.model.aas.IdentifierType;
import de.dfki.cos.basys.platform.model.aas.KeyElements;
import de.dfki.cos.basys.platform.model.aas.KeyType;
import de.dfki.cos.basys.platform.model.aas.ModelingKind;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AasPackage extends EPackageImpl implements IAasPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass administrativeInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasSemanticsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasDataSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetAdministrationShellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass submodelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass submodelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiLanguagePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass submodelElementCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotatedRelationshipElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptDictionaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetAdministrationShellBundleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum identifierTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelingKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assetKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum keyElementsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum keyTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AasPackage() {
		super(eNS_URI, IAasFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link IAasPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IAasPackage init() {
		if (isInited) return (IAasPackage)EPackage.Registry.INSTANCE.getEPackage(IAasPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAasPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AasPackage theAasPackage = registeredAasPackage instanceof AasPackage ? (AasPackage)registeredAasPackage : new AasPackage();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAasPackage.createPackageContents();

		// Initialize created meta-data
		theAasPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAasPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IAasPackage.eNS_URI, theAasPackage);
		return theAasPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferable() {
		return referableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferable_IdShort() {
		return (EAttribute)referableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferable_Category() {
		return (EAttribute)referableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferable_Description() {
		return (EAttribute)referableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferable_Parent() {
		return (EReference)referableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifiable() {
		return identifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentifiable_Administration() {
		return (EReference)identifiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentifiable_Identification() {
		return (EReference)identifiableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifier() {
		return identifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifier_IdType() {
		return (EAttribute)identifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifier_Id() {
		return (EAttribute)identifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHasKind() {
		return hasKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHasKind_Kind() {
		return (EAttribute)hasKindEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdministrativeInformation() {
		return administrativeInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdministrativeInformation_Version() {
		return (EAttribute)administrativeInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdministrativeInformation_Revision() {
		return (EAttribute)administrativeInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHasSemantics() {
		return hasSemanticsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHasSemantics_SemanticId() {
		return (EReference)hasSemanticsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQualifiable() {
		return qualifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQualifiable_Qualifier() {
		return (EReference)qualifiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQualifier() {
		return qualifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQualifier_Type() {
		return (EAttribute)qualifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQualifier_ValueType() {
		return (EAttribute)qualifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQualifier_Value() {
		return (EAttribute)qualifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQualifier_ValueId() {
		return (EReference)qualifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFormula() {
		return formulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFormula_DependsOn() {
		return (EReference)formulaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHasDataSpecification() {
		return hasDataSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHasDataSpecification_DataSpecification() {
		return (EReference)hasDataSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssetAdministrationShell() {
		return assetAdministrationShellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssetAdministrationShell_DerivedFrom() {
		return (EReference)assetAdministrationShellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssetAdministrationShell_Security() {
		return (EReference)assetAdministrationShellEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssetAdministrationShell_Asset() {
		return (EReference)assetAdministrationShellEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssetAdministrationShell_Submodel() {
		return (EReference)assetAdministrationShellEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssetAdministrationShell_View() {
		return (EReference)assetAdministrationShellEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssetAdministrationShell_ConceptDictionary() {
		return (EReference)assetAdministrationShellEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAsset() {
		return assetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsset_Kind() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAsset_AssetIdentificationModel() {
		return (EReference)assetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAsset_BillOfMaterial() {
		return (EReference)assetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubmodel() {
		return submodelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubmodel_SubmodelElement() {
		return (EReference)submodelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubmodelElement() {
		return submodelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataElement() {
		return dataElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_ValueType() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_Value() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProperty_ValueId() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiLanguageProperty() {
		return multiLanguagePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiLanguageProperty_Value() {
		return (EAttribute)multiLanguagePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMultiLanguageProperty_ValueId() {
		return (EReference)multiLanguagePropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceElement() {
		return referenceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceElement_Value() {
		return (EReference)referenceElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRange() {
		return rangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRange_ValueType() {
		return (EAttribute)rangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRange_Min() {
		return (EAttribute)rangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRange_Max() {
		return (EAttribute)rangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlob() {
		return blobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlob_Value() {
		return (EAttribute)blobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlob_MimeType() {
		return (EAttribute)blobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFile_Value() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFile_MimeType() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubmodelElementCollection() {
		return submodelElementCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubmodelElementCollection_AllowDuplicates() {
		return (EAttribute)submodelElementCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubmodelElementCollection_Ordered() {
		return (EAttribute)submodelElementCollectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubmodelElementCollection_Value() {
		return (EReference)submodelElementCollectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationshipElement() {
		return relationshipElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationshipElement_First() {
		return (EReference)relationshipElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationshipElement_Second() {
		return (EReference)relationshipElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotatedRelationshipElement() {
		return annotatedRelationshipElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotatedRelationshipElement_Annotation() {
		return (EReference)annotatedRelationshipElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperation_InputVariable() {
		return (EReference)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperation_OutputVariable() {
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperation_InoutputVariable() {
		return (EReference)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationVariable() {
		return operationVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationVariable_Value() {
		return (EReference)operationVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCapability() {
		return capabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntity_Statement() {
		return (EReference)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntity_EntityType() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntity_Asset() {
		return (EReference)entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasicEvent() {
		return basicEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBasicEvent_Observed() {
		return (EReference)basicEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getView_ContainedElement() {
		return (EReference)viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConceptDictionary() {
		return conceptDictionaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConceptDictionary_ConceptDescription() {
		return (EReference)conceptDictionaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConceptDescription() {
		return conceptDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConceptDescription_IsCaseOf() {
		return (EReference)conceptDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReference_Key() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKey() {
		return keyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKey_Type() {
		return (EAttribute)keyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKey_Local() {
		return (EAttribute)keyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKey_Value() {
		return (EAttribute)keyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKey_IdType() {
		return (EAttribute)keyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecurity() {
		return securityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssetAdministrationShellBundle() {
		return assetAdministrationShellBundleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssetAdministrationShellBundle_AdministrationShells() {
		return (EReference)assetAdministrationShellBundleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssetAdministrationShellBundle_Submodels() {
		return (EReference)assetAdministrationShellBundleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssetAdministrationShellBundle_Assets() {
		return (EReference)assetAdministrationShellBundleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssetAdministrationShellBundle_ConceptDescriptions() {
		return (EReference)assetAdministrationShellBundleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIdentifierType() {
		return identifierTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getModelingKind() {
		return modelingKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAssetKind() {
		return assetKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEntityType() {
		return entityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getKeyElements() {
		return keyElementsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getKeyType() {
		return keyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IAasFactory getAasFactory() {
		return (IAasFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		referableEClass = createEClass(REFERABLE);
		createEAttribute(referableEClass, REFERABLE__ID_SHORT);
		createEAttribute(referableEClass, REFERABLE__CATEGORY);
		createEAttribute(referableEClass, REFERABLE__DESCRIPTION);
		createEReference(referableEClass, REFERABLE__PARENT);

		identifiableEClass = createEClass(IDENTIFIABLE);
		createEReference(identifiableEClass, IDENTIFIABLE__ADMINISTRATION);
		createEReference(identifiableEClass, IDENTIFIABLE__IDENTIFICATION);

		identifierEClass = createEClass(IDENTIFIER);
		createEAttribute(identifierEClass, IDENTIFIER__ID_TYPE);
		createEAttribute(identifierEClass, IDENTIFIER__ID);

		hasKindEClass = createEClass(HAS_KIND);
		createEAttribute(hasKindEClass, HAS_KIND__KIND);

		administrativeInformationEClass = createEClass(ADMINISTRATIVE_INFORMATION);
		createEAttribute(administrativeInformationEClass, ADMINISTRATIVE_INFORMATION__VERSION);
		createEAttribute(administrativeInformationEClass, ADMINISTRATIVE_INFORMATION__REVISION);

		hasSemanticsEClass = createEClass(HAS_SEMANTICS);
		createEReference(hasSemanticsEClass, HAS_SEMANTICS__SEMANTIC_ID);

		qualifiableEClass = createEClass(QUALIFIABLE);
		createEReference(qualifiableEClass, QUALIFIABLE__QUALIFIER);

		constraintEClass = createEClass(CONSTRAINT);

		qualifierEClass = createEClass(QUALIFIER);
		createEAttribute(qualifierEClass, QUALIFIER__TYPE);
		createEAttribute(qualifierEClass, QUALIFIER__VALUE_TYPE);
		createEAttribute(qualifierEClass, QUALIFIER__VALUE);
		createEReference(qualifierEClass, QUALIFIER__VALUE_ID);

		formulaEClass = createEClass(FORMULA);
		createEReference(formulaEClass, FORMULA__DEPENDS_ON);

		hasDataSpecificationEClass = createEClass(HAS_DATA_SPECIFICATION);
		createEReference(hasDataSpecificationEClass, HAS_DATA_SPECIFICATION__DATA_SPECIFICATION);

		assetAdministrationShellEClass = createEClass(ASSET_ADMINISTRATION_SHELL);
		createEReference(assetAdministrationShellEClass, ASSET_ADMINISTRATION_SHELL__DERIVED_FROM);
		createEReference(assetAdministrationShellEClass, ASSET_ADMINISTRATION_SHELL__SECURITY);
		createEReference(assetAdministrationShellEClass, ASSET_ADMINISTRATION_SHELL__ASSET);
		createEReference(assetAdministrationShellEClass, ASSET_ADMINISTRATION_SHELL__SUBMODEL);
		createEReference(assetAdministrationShellEClass, ASSET_ADMINISTRATION_SHELL__VIEW);
		createEReference(assetAdministrationShellEClass, ASSET_ADMINISTRATION_SHELL__CONCEPT_DICTIONARY);

		assetEClass = createEClass(ASSET);
		createEAttribute(assetEClass, ASSET__KIND);
		createEReference(assetEClass, ASSET__ASSET_IDENTIFICATION_MODEL);
		createEReference(assetEClass, ASSET__BILL_OF_MATERIAL);

		submodelEClass = createEClass(SUBMODEL);
		createEReference(submodelEClass, SUBMODEL__SUBMODEL_ELEMENT);

		submodelElementEClass = createEClass(SUBMODEL_ELEMENT);

		dataElementEClass = createEClass(DATA_ELEMENT);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__VALUE_TYPE);
		createEAttribute(propertyEClass, PROPERTY__VALUE);
		createEReference(propertyEClass, PROPERTY__VALUE_ID);

		multiLanguagePropertyEClass = createEClass(MULTI_LANGUAGE_PROPERTY);
		createEAttribute(multiLanguagePropertyEClass, MULTI_LANGUAGE_PROPERTY__VALUE);
		createEReference(multiLanguagePropertyEClass, MULTI_LANGUAGE_PROPERTY__VALUE_ID);

		referenceElementEClass = createEClass(REFERENCE_ELEMENT);
		createEReference(referenceElementEClass, REFERENCE_ELEMENT__VALUE);

		rangeEClass = createEClass(RANGE);
		createEAttribute(rangeEClass, RANGE__VALUE_TYPE);
		createEAttribute(rangeEClass, RANGE__MIN);
		createEAttribute(rangeEClass, RANGE__MAX);

		blobEClass = createEClass(BLOB);
		createEAttribute(blobEClass, BLOB__VALUE);
		createEAttribute(blobEClass, BLOB__MIME_TYPE);

		fileEClass = createEClass(FILE);
		createEAttribute(fileEClass, FILE__VALUE);
		createEAttribute(fileEClass, FILE__MIME_TYPE);

		submodelElementCollectionEClass = createEClass(SUBMODEL_ELEMENT_COLLECTION);
		createEAttribute(submodelElementCollectionEClass, SUBMODEL_ELEMENT_COLLECTION__ALLOW_DUPLICATES);
		createEAttribute(submodelElementCollectionEClass, SUBMODEL_ELEMENT_COLLECTION__ORDERED);
		createEReference(submodelElementCollectionEClass, SUBMODEL_ELEMENT_COLLECTION__VALUE);

		relationshipElementEClass = createEClass(RELATIONSHIP_ELEMENT);
		createEReference(relationshipElementEClass, RELATIONSHIP_ELEMENT__FIRST);
		createEReference(relationshipElementEClass, RELATIONSHIP_ELEMENT__SECOND);

		annotatedRelationshipElementEClass = createEClass(ANNOTATED_RELATIONSHIP_ELEMENT);
		createEReference(annotatedRelationshipElementEClass, ANNOTATED_RELATIONSHIP_ELEMENT__ANNOTATION);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__INPUT_VARIABLE);
		createEReference(operationEClass, OPERATION__OUTPUT_VARIABLE);
		createEReference(operationEClass, OPERATION__INOUTPUT_VARIABLE);

		operationVariableEClass = createEClass(OPERATION_VARIABLE);
		createEReference(operationVariableEClass, OPERATION_VARIABLE__VALUE);

		capabilityEClass = createEClass(CAPABILITY);

		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__STATEMENT);
		createEAttribute(entityEClass, ENTITY__ENTITY_TYPE);
		createEReference(entityEClass, ENTITY__ASSET);

		eventEClass = createEClass(EVENT);

		basicEventEClass = createEClass(BASIC_EVENT);
		createEReference(basicEventEClass, BASIC_EVENT__OBSERVED);

		viewEClass = createEClass(VIEW);
		createEReference(viewEClass, VIEW__CONTAINED_ELEMENT);

		conceptDictionaryEClass = createEClass(CONCEPT_DICTIONARY);
		createEReference(conceptDictionaryEClass, CONCEPT_DICTIONARY__CONCEPT_DESCRIPTION);

		conceptDescriptionEClass = createEClass(CONCEPT_DESCRIPTION);
		createEReference(conceptDescriptionEClass, CONCEPT_DESCRIPTION__IS_CASE_OF);

		referenceEClass = createEClass(REFERENCE);
		createEReference(referenceEClass, REFERENCE__KEY);

		keyEClass = createEClass(KEY);
		createEAttribute(keyEClass, KEY__TYPE);
		createEAttribute(keyEClass, KEY__LOCAL);
		createEAttribute(keyEClass, KEY__VALUE);
		createEAttribute(keyEClass, KEY__ID_TYPE);

		securityEClass = createEClass(SECURITY);

		assetAdministrationShellBundleEClass = createEClass(ASSET_ADMINISTRATION_SHELL_BUNDLE);
		createEReference(assetAdministrationShellBundleEClass, ASSET_ADMINISTRATION_SHELL_BUNDLE__ADMINISTRATION_SHELLS);
		createEReference(assetAdministrationShellBundleEClass, ASSET_ADMINISTRATION_SHELL_BUNDLE__SUBMODELS);
		createEReference(assetAdministrationShellBundleEClass, ASSET_ADMINISTRATION_SHELL_BUNDLE__ASSETS);
		createEReference(assetAdministrationShellBundleEClass, ASSET_ADMINISTRATION_SHELL_BUNDLE__CONCEPT_DESCRIPTIONS);

		// Create enums
		identifierTypeEEnum = createEEnum(IDENTIFIER_TYPE);
		modelingKindEEnum = createEEnum(MODELING_KIND);
		assetKindEEnum = createEEnum(ASSET_KIND);
		entityTypeEEnum = createEEnum(ENTITY_TYPE);
		keyElementsEEnum = createEEnum(KEY_ELEMENTS);
		keyTypeEEnum = createEEnum(KEY_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		identifiableEClass.getESuperTypes().add(this.getReferable());
		administrativeInformationEClass.getESuperTypes().add(this.getHasDataSpecification());
		qualifierEClass.getESuperTypes().add(this.getConstraint());
		qualifierEClass.getESuperTypes().add(this.getHasSemantics());
		formulaEClass.getESuperTypes().add(this.getConstraint());
		assetAdministrationShellEClass.getESuperTypes().add(this.getHasDataSpecification());
		assetAdministrationShellEClass.getESuperTypes().add(this.getIdentifiable());
		assetEClass.getESuperTypes().add(this.getHasDataSpecification());
		assetEClass.getESuperTypes().add(this.getIdentifiable());
		submodelEClass.getESuperTypes().add(this.getHasDataSpecification());
		submodelEClass.getESuperTypes().add(this.getHasSemantics());
		submodelEClass.getESuperTypes().add(this.getIdentifiable());
		submodelEClass.getESuperTypes().add(this.getQualifiable());
		submodelEClass.getESuperTypes().add(this.getHasKind());
		submodelElementEClass.getESuperTypes().add(this.getHasDataSpecification());
		submodelElementEClass.getESuperTypes().add(this.getReferable());
		submodelElementEClass.getESuperTypes().add(this.getQualifiable());
		submodelElementEClass.getESuperTypes().add(this.getHasSemantics());
		submodelElementEClass.getESuperTypes().add(this.getHasKind());
		dataElementEClass.getESuperTypes().add(this.getSubmodelElement());
		propertyEClass.getESuperTypes().add(this.getDataElement());
		multiLanguagePropertyEClass.getESuperTypes().add(this.getDataElement());
		referenceElementEClass.getESuperTypes().add(this.getDataElement());
		rangeEClass.getESuperTypes().add(this.getDataElement());
		blobEClass.getESuperTypes().add(this.getDataElement());
		fileEClass.getESuperTypes().add(this.getDataElement());
		submodelElementCollectionEClass.getESuperTypes().add(this.getSubmodelElement());
		relationshipElementEClass.getESuperTypes().add(this.getSubmodelElement());
		operationEClass.getESuperTypes().add(this.getSubmodelElement());
		capabilityEClass.getESuperTypes().add(this.getSubmodelElement());
		entityEClass.getESuperTypes().add(this.getSubmodelElement());
		eventEClass.getESuperTypes().add(this.getSubmodelElement());
		basicEventEClass.getESuperTypes().add(this.getEvent());
		viewEClass.getESuperTypes().add(this.getHasDataSpecification());
		viewEClass.getESuperTypes().add(this.getHasSemantics());
		viewEClass.getESuperTypes().add(this.getReferable());
		conceptDescriptionEClass.getESuperTypes().add(this.getHasDataSpecification());
		conceptDescriptionEClass.getESuperTypes().add(this.getIdentifiable());

		// Initialize classes, features, and operations; add parameters
		initEClass(referableEClass, IReferable.class, "Referable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferable_IdShort(), ecorePackage.getEString(), "idShort", null, 1, 1, IReferable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferable_Category(), ecorePackage.getEString(), "category", null, 0, 1, IReferable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferable_Description(), ecorePackage.getEString(), "description", null, 0, 1, IReferable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferable_Parent(), this.getReferable(), null, "parent", null, 0, 1, IReferable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiableEClass, IIdentifiable.class, "Identifiable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIdentifiable_Administration(), this.getAdministrativeInformation(), null, "administration", null, 0, 1, IIdentifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentifiable_Identification(), this.getIdentifier(), null, "identification", null, 1, 1, IIdentifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifierEClass, IIdentifier.class, "Identifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifier_IdType(), this.getIdentifierType(), "idType", null, 0, 1, IIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifier_Id(), ecorePackage.getEString(), "id", null, 0, 1, IIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hasKindEClass, IHasKind.class, "HasKind", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHasKind_Kind(), this.getModelingKind(), "kind", null, 0, 1, IHasKind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(administrativeInformationEClass, IAdministrativeInformation.class, "AdministrativeInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdministrativeInformation_Version(), ecorePackage.getEString(), "version", null, 0, 1, IAdministrativeInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdministrativeInformation_Revision(), ecorePackage.getEString(), "revision", null, 0, 1, IAdministrativeInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hasSemanticsEClass, IHasSemantics.class, "HasSemantics", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHasSemantics_SemanticId(), this.getReference(), null, "semanticId", null, 0, 1, IHasSemantics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualifiableEClass, IQualifiable.class, "Qualifiable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQualifiable_Qualifier(), this.getConstraint(), null, "qualifier", null, 0, 1, IQualifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, IConstraint.class, "Constraint", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(qualifierEClass, IQualifier.class, "Qualifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQualifier_Type(), ecorePackage.getEString(), "type", null, 1, 1, IQualifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQualifier_ValueType(), ecorePackage.getEString(), "valueType", null, 1, 1, IQualifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQualifier_Value(), ecorePackage.getEString(), "value", null, 0, 1, IQualifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualifier_ValueId(), this.getReference(), null, "valueId", null, 0, 1, IQualifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formulaEClass, IFormula.class, "Formula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormula_DependsOn(), this.getReference(), null, "dependsOn", null, 0, -1, IFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hasDataSpecificationEClass, IHasDataSpecification.class, "HasDataSpecification", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHasDataSpecification_DataSpecification(), this.getReference(), null, "dataSpecification", null, 0, -1, IHasDataSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assetAdministrationShellEClass, IAssetAdministrationShell.class, "AssetAdministrationShell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssetAdministrationShell_DerivedFrom(), this.getAssetAdministrationShell(), null, "derivedFrom", null, 0, 1, IAssetAdministrationShell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssetAdministrationShell_Security(), this.getSecurity(), null, "security", null, 0, 1, IAssetAdministrationShell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssetAdministrationShell_Asset(), this.getAsset(), null, "asset", null, 1, 1, IAssetAdministrationShell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssetAdministrationShell_Submodel(), this.getSubmodel(), null, "submodel", null, 0, -1, IAssetAdministrationShell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssetAdministrationShell_View(), this.getView(), null, "view", null, 0, -1, IAssetAdministrationShell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssetAdministrationShell_ConceptDictionary(), this.getConceptDictionary(), null, "conceptDictionary", null, 0, -1, IAssetAdministrationShell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assetEClass, IAsset.class, "Asset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsset_Kind(), this.getAssetKind(), "kind", null, 1, 1, IAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsset_AssetIdentificationModel(), this.getSubmodel(), null, "assetIdentificationModel", null, 0, 1, IAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsset_BillOfMaterial(), this.getSubmodel(), null, "billOfMaterial", null, 0, 1, IAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(submodelEClass, ISubmodel.class, "Submodel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubmodel_SubmodelElement(), this.getSubmodelElement(), null, "submodelElement", null, 0, -1, ISubmodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(submodelElementEClass, ISubmodelElement.class, "SubmodelElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataElementEClass, IDataElement.class, "DataElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyEClass, IProperty.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_ValueType(), ecorePackage.getEString(), "valueType", null, 1, 1, IProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Value(), theXMLTypePackage.getAnySimpleType(), "value", null, 0, 1, IProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_ValueId(), this.getReference(), null, "valueId", null, 0, 1, IProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiLanguagePropertyEClass, IMultiLanguageProperty.class, "MultiLanguageProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiLanguageProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, IMultiLanguageProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiLanguageProperty_ValueId(), this.getReference(), null, "valueId", null, 0, 1, IMultiLanguageProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceElementEClass, IReferenceElement.class, "ReferenceElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceElement_Value(), this.getReference(), null, "value", null, 0, 1, IReferenceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangeEClass, IRange.class, "Range", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRange_ValueType(), ecorePackage.getEString(), "valueType", null, 1, 1, IRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRange_Min(), ecorePackage.getEString(), "min", null, 0, 1, IRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRange_Max(), ecorePackage.getEString(), "max", null, 0, 1, IRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blobEClass, IBlob.class, "Blob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlob_Value(), ecorePackage.getEString(), "value", null, 0, 1, IBlob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlob_MimeType(), ecorePackage.getEString(), "mimeType", null, 1, 1, IBlob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileEClass, IFile.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFile_Value(), ecorePackage.getEString(), "value", null, 0, 1, IFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_MimeType(), ecorePackage.getEString(), "mimeType", null, 1, 1, IFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(submodelElementCollectionEClass, ISubmodelElementCollection.class, "SubmodelElementCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubmodelElementCollection_AllowDuplicates(), theXMLTypePackage.getBoolean(), "allowDuplicates", null, 0, 1, ISubmodelElementCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubmodelElementCollection_Ordered(), theXMLTypePackage.getBoolean(), "ordered", null, 0, 1, ISubmodelElementCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubmodelElementCollection_Value(), this.getSubmodelElement(), null, "value", null, 0, -1, ISubmodelElementCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipElementEClass, IRelationshipElement.class, "RelationshipElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationshipElement_First(), this.getReferable(), null, "first", null, 1, 1, IRelationshipElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipElement_Second(), this.getReferable(), null, "second", null, 1, 1, IRelationshipElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotatedRelationshipElementEClass, IAnnotatedRelationshipElement.class, "AnnotatedRelationshipElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotatedRelationshipElement_Annotation(), this.getDataElement(), null, "annotation", null, 0, -1, IAnnotatedRelationshipElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, IOperation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_InputVariable(), this.getOperationVariable(), null, "inputVariable", null, 0, -1, IOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_OutputVariable(), this.getOperationVariable(), null, "outputVariable", null, 0, -1, IOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_InoutputVariable(), this.getOperationVariable(), null, "inoutputVariable", null, 0, -1, IOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationVariableEClass, IOperationVariable.class, "OperationVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationVariable_Value(), this.getSubmodelElement(), null, "value", null, 1, 1, IOperationVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityEClass, ICapability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityEClass, IEntity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity_Statement(), this.getSubmodelElement(), null, "statement", null, 0, 1, IEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_EntityType(), this.getEntityType(), "entityType", null, 1, 1, IEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Asset(), this.getAsset(), null, "asset", null, 0, 1, IEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, IEvent.class, "Event", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(basicEventEClass, IBasicEvent.class, "BasicEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasicEvent_Observed(), this.getReferable(), null, "observed", null, 1, 1, IBasicEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewEClass, IView.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getView_ContainedElement(), this.getReferable(), null, "containedElement", null, 0, -1, IView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conceptDictionaryEClass, IConceptDictionary.class, "ConceptDictionary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConceptDictionary_ConceptDescription(), this.getConceptDescription(), null, "conceptDescription", null, 0, -1, IConceptDictionary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conceptDescriptionEClass, IConceptDescription.class, "ConceptDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConceptDescription_IsCaseOf(), this.getReference(), null, "isCaseOf", null, 0, -1, IConceptDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceEClass, IReference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReference_Key(), this.getKey(), null, "key", null, 1, -1, IReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyEClass, IKey.class, "Key", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKey_Type(), this.getKeyElements(), "type", null, 1, 1, IKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKey_Local(), ecorePackage.getEBoolean(), "local", null, 1, 1, IKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKey_Value(), ecorePackage.getEString(), "value", null, 1, 1, IKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKey_IdType(), this.getKeyType(), "idType", null, 0, 1, IKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityEClass, ISecurity.class, "Security", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assetAdministrationShellBundleEClass, IAssetAdministrationShellBundle.class, "AssetAdministrationShellBundle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssetAdministrationShellBundle_AdministrationShells(), this.getAssetAdministrationShell(), null, "administrationShells", null, 0, -1, IAssetAdministrationShellBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssetAdministrationShellBundle_Submodels(), this.getSubmodel(), null, "submodels", null, 0, -1, IAssetAdministrationShellBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssetAdministrationShellBundle_Assets(), this.getAsset(), null, "assets", null, 0, -1, IAssetAdministrationShellBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssetAdministrationShellBundle_ConceptDescriptions(), this.getConceptDescription(), null, "conceptDescriptions", null, 0, -1, IAssetAdministrationShellBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(identifierTypeEEnum, IdentifierType.class, "IdentifierType");
		addEEnumLiteral(identifierTypeEEnum, IdentifierType.IRDI);
		addEEnumLiteral(identifierTypeEEnum, IdentifierType.IRI);
		addEEnumLiteral(identifierTypeEEnum, IdentifierType.CUSTOM);

		initEEnum(modelingKindEEnum, ModelingKind.class, "ModelingKind");
		addEEnumLiteral(modelingKindEEnum, ModelingKind.TEMPLATE);
		addEEnumLiteral(modelingKindEEnum, ModelingKind.INSTANCE);

		initEEnum(assetKindEEnum, AssetKind.class, "AssetKind");
		addEEnumLiteral(assetKindEEnum, AssetKind.TYPE);
		addEEnumLiteral(assetKindEEnum, AssetKind.INSTANCE);

		initEEnum(entityTypeEEnum, EntityType.class, "EntityType");
		addEEnumLiteral(entityTypeEEnum, EntityType.CO_MANAGED_ENTITY);
		addEEnumLiteral(entityTypeEEnum, EntityType.SELF_MANAGED_ENTITY);

		initEEnum(keyElementsEEnum, KeyElements.class, "KeyElements");
		addEEnumLiteral(keyElementsEEnum, KeyElements.GLOBAL_REFERENCE);
		addEEnumLiteral(keyElementsEEnum, KeyElements.LOCAL_REFERENCE);
		addEEnumLiteral(keyElementsEEnum, KeyElements.ASSET);
		addEEnumLiteral(keyElementsEEnum, KeyElements.ASSET_ADMINISTRATION_SHELL);
		addEEnumLiteral(keyElementsEEnum, KeyElements.CONCEPT_DESCRIPTION);
		addEEnumLiteral(keyElementsEEnum, KeyElements.SUBMODEL);
		addEEnumLiteral(keyElementsEEnum, KeyElements.ACCESS_PERMISSION_RULE);
		addEEnumLiteral(keyElementsEEnum, KeyElements.ANNOTATED_RELATIONSHIP_ELEMENT);
		addEEnumLiteral(keyElementsEEnum, KeyElements.BASIC_EVENT);
		addEEnumLiteral(keyElementsEEnum, KeyElements.BLOB);
		addEEnumLiteral(keyElementsEEnum, KeyElements.CAPABILITY);
		addEEnumLiteral(keyElementsEEnum, KeyElements.CONCEPT_DICTIONARY);
		addEEnumLiteral(keyElementsEEnum, KeyElements.DATA_ELEMENT);
		addEEnumLiteral(keyElementsEEnum, KeyElements.FILE);
		addEEnumLiteral(keyElementsEEnum, KeyElements.ENTITY);
		addEEnumLiteral(keyElementsEEnum, KeyElements.EVENT);
		addEEnumLiteral(keyElementsEEnum, KeyElements.MULTI_LANGUAGE_PROPERTY);
		addEEnumLiteral(keyElementsEEnum, KeyElements.OPERATION);
		addEEnumLiteral(keyElementsEEnum, KeyElements.PROPERTY);
		addEEnumLiteral(keyElementsEEnum, KeyElements.RANGE);
		addEEnumLiteral(keyElementsEEnum, KeyElements.REFERENCE_ELEMENT);
		addEEnumLiteral(keyElementsEEnum, KeyElements.RELATIONSHIP_ELEMENT);
		addEEnumLiteral(keyElementsEEnum, KeyElements.SUBMODEL_ELEMENT);
		addEEnumLiteral(keyElementsEEnum, KeyElements.SUBMODEL_ELEMENT_COLLECTION);
		addEEnumLiteral(keyElementsEEnum, KeyElements.VIEW);

		initEEnum(keyTypeEEnum, KeyType.class, "KeyType");
		addEEnumLiteral(keyTypeEEnum, KeyType.IRDI);
		addEEnumLiteral(keyTypeEEnum, KeyType.IRI);
		addEEnumLiteral(keyTypeEEnum, KeyType.CUSTOM);
		addEEnumLiteral(keyTypeEEnum, KeyType.ID_SHORT);
		addEEnumLiteral(keyTypeEEnum, KeyType.FRAGMENT_ID);

		// Create resource
		createResource(eNS_URI);
	}

} //AasPackage
