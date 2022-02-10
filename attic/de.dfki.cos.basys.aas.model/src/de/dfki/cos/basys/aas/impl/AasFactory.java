/**
 */
package de.dfki.cos.basys.aas.impl;

import de.dfki.cos.basys.aas.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AasFactory extends EFactoryImpl implements IAasFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IAasFactory init() {
		try {
			IAasFactory theAasFactory = (IAasFactory)EPackage.Registry.INSTANCE.getEFactory(IAasPackage.eNS_URI);
			if (theAasFactory != null) {
				return theAasFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AasFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AasFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IAasPackage.IDENTIFIER: return (EObject)createIdentifier();
			case IAasPackage.ADMINISTRATIVE_INFORMATION: return (EObject)createAdministrativeInformation();
			case IAasPackage.QUALIFIER: return (EObject)createQualifier();
			case IAasPackage.FORMULA: return (EObject)createFormula();
			case IAasPackage.ASSET_ADMINISTRATION_SHELL: return (EObject)createAssetAdministrationShell();
			case IAasPackage.ASSET: return (EObject)createAsset();
			case IAasPackage.SUBMODEL: return (EObject)createSubmodel();
			case IAasPackage.PROPERTY: return (EObject)createProperty();
			case IAasPackage.MULTI_LANGUAGE_PROPERTY: return (EObject)createMultiLanguageProperty();
			case IAasPackage.REFERENCE_ELEMENT: return (EObject)createReferenceElement();
			case IAasPackage.RANGE: return (EObject)createRange();
			case IAasPackage.BLOB: return (EObject)createBlob();
			case IAasPackage.FILE: return (EObject)createFile();
			case IAasPackage.SUBMODEL_ELEMENT_COLLECTION: return (EObject)createSubmodelElementCollection();
			case IAasPackage.RELATIONSHIP_ELEMENT: return (EObject)createRelationshipElement();
			case IAasPackage.ANNOTATED_RELATIONSHIP_ELEMENT: return (EObject)createAnnotatedRelationshipElement();
			case IAasPackage.OPERATION: return (EObject)createOperation();
			case IAasPackage.OPERATION_VARIABLE: return (EObject)createOperationVariable();
			case IAasPackage.CAPABILITY: return (EObject)createCapability();
			case IAasPackage.ENTITY: return (EObject)createEntity();
			case IAasPackage.BASIC_EVENT: return (EObject)createBasicEvent();
			case IAasPackage.VIEW: return (EObject)createView();
			case IAasPackage.CONCEPT_DICTIONARY: return (EObject)createConceptDictionary();
			case IAasPackage.CONCEPT_DESCRIPTION: return (EObject)createConceptDescription();
			case IAasPackage.REFERENCE: return (EObject)createReference();
			case IAasPackage.KEY: return (EObject)createKey();
			case IAasPackage.SECURITY: return (EObject)createSecurity();
			case IAasPackage.ASSET_ADMINISTRATION_SHELL_BUNDLE: return (EObject)createAssetAdministrationShellBundle();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case IAasPackage.IDENTIFIER_TYPE:
				return createIdentifierTypeFromString(eDataType, initialValue);
			case IAasPackage.MODELING_KIND:
				return createModelingKindFromString(eDataType, initialValue);
			case IAasPackage.ASSET_KIND:
				return createAssetKindFromString(eDataType, initialValue);
			case IAasPackage.ENTITY_TYPE:
				return createEntityTypeFromString(eDataType, initialValue);
			case IAasPackage.KEY_ELEMENTS:
				return createKeyElementsFromString(eDataType, initialValue);
			case IAasPackage.KEY_TYPE:
				return createKeyTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case IAasPackage.IDENTIFIER_TYPE:
				return convertIdentifierTypeToString(eDataType, instanceValue);
			case IAasPackage.MODELING_KIND:
				return convertModelingKindToString(eDataType, instanceValue);
			case IAasPackage.ASSET_KIND:
				return convertAssetKindToString(eDataType, instanceValue);
			case IAasPackage.ENTITY_TYPE:
				return convertEntityTypeToString(eDataType, instanceValue);
			case IAasPackage.KEY_ELEMENTS:
				return convertKeyElementsToString(eDataType, instanceValue);
			case IAasPackage.KEY_TYPE:
				return convertKeyTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IIdentifier createIdentifier() {
		Identifier identifier = new Identifier();
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IAdministrativeInformation createAdministrativeInformation() {
		AdministrativeInformation administrativeInformation = new AdministrativeInformation();
		return administrativeInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IQualifier createQualifier() {
		Qualifier qualifier = new Qualifier();
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IFormula createFormula() {
		Formula formula = new Formula();
		return formula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IAssetAdministrationShell createAssetAdministrationShell() {
		AssetAdministrationShell assetAdministrationShell = new AssetAdministrationShell();
		return assetAdministrationShell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IAsset createAsset() {
		Asset asset = new Asset();
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISubmodel createSubmodel() {
		Submodel submodel = new Submodel();
		return submodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IProperty createProperty() {
		Property property = new Property();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IMultiLanguageProperty createMultiLanguageProperty() {
		MultiLanguageProperty multiLanguageProperty = new MultiLanguageProperty();
		return multiLanguageProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IReferenceElement createReferenceElement() {
		ReferenceElement referenceElement = new ReferenceElement();
		return referenceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IRange createRange() {
		Range range = new Range();
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBlob createBlob() {
		Blob blob = new Blob();
		return blob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IFile createFile() {
		File file = new File();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISubmodelElementCollection createSubmodelElementCollection() {
		SubmodelElementCollection submodelElementCollection = new SubmodelElementCollection();
		return submodelElementCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IRelationshipElement createRelationshipElement() {
		RelationshipElement relationshipElement = new RelationshipElement();
		return relationshipElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IAnnotatedRelationshipElement createAnnotatedRelationshipElement() {
		AnnotatedRelationshipElement annotatedRelationshipElement = new AnnotatedRelationshipElement();
		return annotatedRelationshipElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IOperation createOperation() {
		Operation operation = new Operation();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IOperationVariable createOperationVariable() {
		OperationVariable operationVariable = new OperationVariable();
		return operationVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ICapability createCapability() {
		Capability capability = new Capability();
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IEntity createEntity() {
		Entity entity = new Entity();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBasicEvent createBasicEvent() {
		BasicEvent basicEvent = new BasicEvent();
		return basicEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IView createView() {
		View view = new View();
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IConceptDictionary createConceptDictionary() {
		ConceptDictionary conceptDictionary = new ConceptDictionary();
		return conceptDictionary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IConceptDescription createConceptDescription() {
		ConceptDescription conceptDescription = new ConceptDescription();
		return conceptDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IReference createReference() {
		Reference reference = new Reference();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IKey createKey() {
		Key key = new Key();
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISecurity createSecurity() {
		Security security = new Security();
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IAssetAdministrationShellBundle createAssetAdministrationShellBundle() {
		AssetAdministrationShellBundle assetAdministrationShellBundle = new AssetAdministrationShellBundle();
		return assetAdministrationShellBundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierType createIdentifierTypeFromString(EDataType eDataType, String initialValue) {
		IdentifierType result = IdentifierType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentifierTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingKind createModelingKindFromString(EDataType eDataType, String initialValue) {
		ModelingKind result = ModelingKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelingKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetKind createAssetKindFromString(EDataType eDataType, String initialValue) {
		AssetKind result = AssetKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssetKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType createEntityTypeFromString(EDataType eDataType, String initialValue) {
		EntityType result = EntityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyElements createKeyElementsFromString(EDataType eDataType, String initialValue) {
		KeyElements result = KeyElements.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeyElementsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyType createKeyTypeFromString(EDataType eDataType, String initialValue) {
		KeyType result = KeyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IAasPackage getAasPackage() {
		return (IAasPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IAasPackage getPackage() {
		return IAasPackage.eINSTANCE;
	}

} //AasFactory
