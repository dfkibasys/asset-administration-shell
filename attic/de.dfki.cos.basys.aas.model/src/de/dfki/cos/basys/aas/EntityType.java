/**
 */
package de.dfki.cos.basys.aas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Entity Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dfki.cos.basys.aas.IAasPackage#getEntityType()
 * @model
 * @generated
 */
public enum EntityType implements Enumerator {
	/**
	 * The '<em><b>Co Managed Entity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CO_MANAGED_ENTITY_VALUE
	 * @generated
	 * @ordered
	 */
	CO_MANAGED_ENTITY(0, "CoManagedEntity", "CoManagedEntity"),

	/**
	 * The '<em><b>Self Managed Entity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELF_MANAGED_ENTITY_VALUE
	 * @generated
	 * @ordered
	 */
	SELF_MANAGED_ENTITY(1, "SelfManagedEntity", "SelfManagedEntity");

	/**
	 * The '<em><b>Co Managed Entity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CO_MANAGED_ENTITY
	 * @model name="CoManagedEntity"
	 * @generated
	 * @ordered
	 */
	public static final int CO_MANAGED_ENTITY_VALUE = 0;

	/**
	 * The '<em><b>Self Managed Entity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELF_MANAGED_ENTITY
	 * @model name="SelfManagedEntity"
	 * @generated
	 * @ordered
	 */
	public static final int SELF_MANAGED_ENTITY_VALUE = 1;

	/**
	 * An array of all the '<em><b>Entity Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EntityType[] VALUES_ARRAY =
		new EntityType[] {
			CO_MANAGED_ENTITY,
			SELF_MANAGED_ENTITY,
		};

	/**
	 * A public read-only list of all the '<em><b>Entity Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EntityType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Entity Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EntityType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EntityType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Entity Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EntityType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EntityType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Entity Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EntityType get(int value) {
		switch (value) {
			case CO_MANAGED_ENTITY_VALUE: return CO_MANAGED_ENTITY;
			case SELF_MANAGED_ENTITY_VALUE: return SELF_MANAGED_ENTITY;
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
	private EntityType(int value, String name, String literal) {
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
	
} //EntityType
