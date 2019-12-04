/**
 */
package de.dfki.cos.basys.aas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Key Elements</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dfki.cos.basys.aas.IAasPackage#getKeyElements()
 * @model
 * @generated
 */
public enum KeyElements implements Enumerator {
	/**
	 * The '<em><b>Global Reference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLOBAL_REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	GLOBAL_REFERENCE(0, "GlobalReference", "GlobalReference"),

	/**
	 * The '<em><b>Local Reference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL_REFERENCE(1, "LocalReference", "LocalReference"),

	/**
	 * The '<em><b>Asset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSET_VALUE
	 * @generated
	 * @ordered
	 */
	ASSET(2, "Asset", "Asset"),

	/**
	 * The '<em><b>Asset Administration Shell</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSET_ADMINISTRATION_SHELL_VALUE
	 * @generated
	 * @ordered
	 */
	ASSET_ADMINISTRATION_SHELL(3, "AssetAdministrationShell", "AssetAdministrationShell"),

	/**
	 * The '<em><b>Concept Description</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCEPT_DESCRIPTION_VALUE
	 * @generated
	 * @ordered
	 */
	CONCEPT_DESCRIPTION(4, "ConceptDescription", "ConceptDescription"),

	/**
	 * The '<em><b>Submodel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBMODEL_VALUE
	 * @generated
	 * @ordered
	 */
	SUBMODEL(5, "Submodel", "Submodel"),

	/**
	 * The '<em><b>Access Permission Rule</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_PERMISSION_RULE_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESS_PERMISSION_RULE(6, "AccessPermissionRule", "AccessPermissionRule"),

	/**
	 * The '<em><b>Annotated Relationship Element</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANNOTATED_RELATIONSHIP_ELEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ANNOTATED_RELATIONSHIP_ELEMENT(7, "AnnotatedRelationshipElement", "AnnotatedRelationshipElement"),

	/**
	 * The '<em><b>Basic Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASIC_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	BASIC_EVENT(8, "BasicEvent", "BasicEvent"),

	/**
	 * The '<em><b>Blob</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOB_VALUE
	 * @generated
	 * @ordered
	 */
	BLOB(9, "Blob", "Blob"),

	/**
	 * The '<em><b>Capability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAPABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	CAPABILITY(10, "Capability", "Capability"),

	/**
	 * The '<em><b>Concept Dictionary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCEPT_DICTIONARY_VALUE
	 * @generated
	 * @ordered
	 */
	CONCEPT_DICTIONARY(11, "ConceptDictionary", "ConceptDictionary"),

	/**
	 * The '<em><b>Data Element</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_ELEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_ELEMENT(12, "DataElement", "DataElement"),

	/**
	 * The '<em><b>File</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILE_VALUE
	 * @generated
	 * @ordered
	 */
	FILE(13, "File", "File"),

	/**
	 * The '<em><b>Entity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTITY_VALUE
	 * @generated
	 * @ordered
	 */
	ENTITY(14, "Entity", "Entity"),

	/**
	 * The '<em><b>Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	EVENT(15, "Event", "Event"),

	/**
	 * The '<em><b>Multi Language Property</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_LANGUAGE_PROPERTY_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI_LANGUAGE_PROPERTY(16, "MultiLanguageProperty", "MultiLanguageProperty"),

	/**
	 * The '<em><b>Operation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATION(17, "Operation", "Operation"),

	/**
	 * The '<em><b>Property</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPERTY_VALUE
	 * @generated
	 * @ordered
	 */
	PROPERTY(18, "Property", "Property"),

	/**
	 * The '<em><b>Range</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANGE_VALUE
	 * @generated
	 * @ordered
	 */
	RANGE(19, "Range", "Range"),

	/**
	 * The '<em><b>Reference Element</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCE_ELEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	REFERENCE_ELEMENT(20, "ReferenceElement", "ReferenceElement"),

	/**
	 * The '<em><b>Relationship Element</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATIONSHIP_ELEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	RELATIONSHIP_ELEMENT(21, "RelationshipElement", "RelationshipElement"),

	/**
	 * The '<em><b>Submodel Element</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBMODEL_ELEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	SUBMODEL_ELEMENT(22, "SubmodelElement", "SubmodelElement"),

	/**
	 * The '<em><b>Submodel Element Collection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBMODEL_ELEMENT_COLLECTION_VALUE
	 * @generated
	 * @ordered
	 */
	SUBMODEL_ELEMENT_COLLECTION(23, "SubmodelElementCollection", "SubmodelElementCollection"),

	/**
	 * The '<em><b>View</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIEW_VALUE
	 * @generated
	 * @ordered
	 */
	VIEW(24, "View", "View");

	/**
	 * The '<em><b>Global Reference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLOBAL_REFERENCE
	 * @model name="GlobalReference"
	 * @generated
	 * @ordered
	 */
	public static final int GLOBAL_REFERENCE_VALUE = 0;

	/**
	 * The '<em><b>Local Reference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_REFERENCE
	 * @model name="LocalReference"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_REFERENCE_VALUE = 1;

	/**
	 * The '<em><b>Asset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSET
	 * @model name="Asset"
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_VALUE = 2;

	/**
	 * The '<em><b>Asset Administration Shell</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSET_ADMINISTRATION_SHELL
	 * @model name="AssetAdministrationShell"
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_ADMINISTRATION_SHELL_VALUE = 3;

	/**
	 * The '<em><b>Concept Description</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCEPT_DESCRIPTION
	 * @model name="ConceptDescription"
	 * @generated
	 * @ordered
	 */
	public static final int CONCEPT_DESCRIPTION_VALUE = 4;

	/**
	 * The '<em><b>Submodel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBMODEL
	 * @model name="Submodel"
	 * @generated
	 * @ordered
	 */
	public static final int SUBMODEL_VALUE = 5;

	/**
	 * The '<em><b>Access Permission Rule</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_PERMISSION_RULE
	 * @model name="AccessPermissionRule"
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMISSION_RULE_VALUE = 6;

	/**
	 * The '<em><b>Annotated Relationship Element</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANNOTATED_RELATIONSHIP_ELEMENT
	 * @model name="AnnotatedRelationshipElement"
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATED_RELATIONSHIP_ELEMENT_VALUE = 7;

	/**
	 * The '<em><b>Basic Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASIC_EVENT
	 * @model name="BasicEvent"
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_EVENT_VALUE = 8;

	/**
	 * The '<em><b>Blob</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOB
	 * @model name="Blob"
	 * @generated
	 * @ordered
	 */
	public static final int BLOB_VALUE = 9;

	/**
	 * The '<em><b>Capability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAPABILITY
	 * @model name="Capability"
	 * @generated
	 * @ordered
	 */
	public static final int CAPABILITY_VALUE = 10;

	/**
	 * The '<em><b>Concept Dictionary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCEPT_DICTIONARY
	 * @model name="ConceptDictionary"
	 * @generated
	 * @ordered
	 */
	public static final int CONCEPT_DICTIONARY_VALUE = 11;

	/**
	 * The '<em><b>Data Element</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_ELEMENT
	 * @model name="DataElement"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_ELEMENT_VALUE = 12;

	/**
	 * The '<em><b>File</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILE
	 * @model name="File"
	 * @generated
	 * @ordered
	 */
	public static final int FILE_VALUE = 13;

	/**
	 * The '<em><b>Entity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTITY
	 * @model name="Entity"
	 * @generated
	 * @ordered
	 */
	public static final int ENTITY_VALUE = 14;

	/**
	 * The '<em><b>Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT
	 * @model name="Event"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_VALUE = 15;

	/**
	 * The '<em><b>Multi Language Property</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_LANGUAGE_PROPERTY
	 * @model name="MultiLanguageProperty"
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_LANGUAGE_PROPERTY_VALUE = 16;

	/**
	 * The '<em><b>Operation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION
	 * @model name="Operation"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_VALUE = 17;

	/**
	 * The '<em><b>Property</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPERTY
	 * @model name="Property"
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_VALUE = 18;

	/**
	 * The '<em><b>Range</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANGE
	 * @model name="Range"
	 * @generated
	 * @ordered
	 */
	public static final int RANGE_VALUE = 19;

	/**
	 * The '<em><b>Reference Element</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCE_ELEMENT
	 * @model name="ReferenceElement"
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCE_ELEMENT_VALUE = 20;

	/**
	 * The '<em><b>Relationship Element</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATIONSHIP_ELEMENT
	 * @model name="RelationshipElement"
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONSHIP_ELEMENT_VALUE = 21;

	/**
	 * The '<em><b>Submodel Element</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBMODEL_ELEMENT
	 * @model name="SubmodelElement"
	 * @generated
	 * @ordered
	 */
	public static final int SUBMODEL_ELEMENT_VALUE = 22;

	/**
	 * The '<em><b>Submodel Element Collection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBMODEL_ELEMENT_COLLECTION
	 * @model name="SubmodelElementCollection"
	 * @generated
	 * @ordered
	 */
	public static final int SUBMODEL_ELEMENT_COLLECTION_VALUE = 23;

	/**
	 * The '<em><b>View</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIEW
	 * @model name="View"
	 * @generated
	 * @ordered
	 */
	public static final int VIEW_VALUE = 24;

	/**
	 * An array of all the '<em><b>Key Elements</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final KeyElements[] VALUES_ARRAY =
		new KeyElements[] {
			GLOBAL_REFERENCE,
			LOCAL_REFERENCE,
			ASSET,
			ASSET_ADMINISTRATION_SHELL,
			CONCEPT_DESCRIPTION,
			SUBMODEL,
			ACCESS_PERMISSION_RULE,
			ANNOTATED_RELATIONSHIP_ELEMENT,
			BASIC_EVENT,
			BLOB,
			CAPABILITY,
			CONCEPT_DICTIONARY,
			DATA_ELEMENT,
			FILE,
			ENTITY,
			EVENT,
			MULTI_LANGUAGE_PROPERTY,
			OPERATION,
			PROPERTY,
			RANGE,
			REFERENCE_ELEMENT,
			RELATIONSHIP_ELEMENT,
			SUBMODEL_ELEMENT,
			SUBMODEL_ELEMENT_COLLECTION,
			VIEW,
		};

	/**
	 * A public read-only list of all the '<em><b>Key Elements</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<KeyElements> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Key Elements</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static KeyElements get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KeyElements result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Key Elements</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static KeyElements getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KeyElements result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Key Elements</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static KeyElements get(int value) {
		switch (value) {
			case GLOBAL_REFERENCE_VALUE: return GLOBAL_REFERENCE;
			case LOCAL_REFERENCE_VALUE: return LOCAL_REFERENCE;
			case ASSET_VALUE: return ASSET;
			case ASSET_ADMINISTRATION_SHELL_VALUE: return ASSET_ADMINISTRATION_SHELL;
			case CONCEPT_DESCRIPTION_VALUE: return CONCEPT_DESCRIPTION;
			case SUBMODEL_VALUE: return SUBMODEL;
			case ACCESS_PERMISSION_RULE_VALUE: return ACCESS_PERMISSION_RULE;
			case ANNOTATED_RELATIONSHIP_ELEMENT_VALUE: return ANNOTATED_RELATIONSHIP_ELEMENT;
			case BASIC_EVENT_VALUE: return BASIC_EVENT;
			case BLOB_VALUE: return BLOB;
			case CAPABILITY_VALUE: return CAPABILITY;
			case CONCEPT_DICTIONARY_VALUE: return CONCEPT_DICTIONARY;
			case DATA_ELEMENT_VALUE: return DATA_ELEMENT;
			case FILE_VALUE: return FILE;
			case ENTITY_VALUE: return ENTITY;
			case EVENT_VALUE: return EVENT;
			case MULTI_LANGUAGE_PROPERTY_VALUE: return MULTI_LANGUAGE_PROPERTY;
			case OPERATION_VALUE: return OPERATION;
			case PROPERTY_VALUE: return PROPERTY;
			case RANGE_VALUE: return RANGE;
			case REFERENCE_ELEMENT_VALUE: return REFERENCE_ELEMENT;
			case RELATIONSHIP_ELEMENT_VALUE: return RELATIONSHIP_ELEMENT;
			case SUBMODEL_ELEMENT_VALUE: return SUBMODEL_ELEMENT;
			case SUBMODEL_ELEMENT_COLLECTION_VALUE: return SUBMODEL_ELEMENT_COLLECTION;
			case VIEW_VALUE: return VIEW;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private KeyElements(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //KeyElements
