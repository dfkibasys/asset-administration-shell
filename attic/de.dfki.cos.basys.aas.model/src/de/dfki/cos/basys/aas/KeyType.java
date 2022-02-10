/**
 */
package de.dfki.cos.basys.aas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Key Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dfki.cos.basys.aas.IAasPackage#getKeyType()
 * @model
 * @generated
 */
public enum KeyType implements Enumerator {
	/**
	 * The '<em><b>IRDI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IRDI_VALUE
	 * @generated
	 * @ordered
	 */
	IRDI(0, "IRDI", "IRDI"),

	/**
	 * The '<em><b>IRI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IRI_VALUE
	 * @generated
	 * @ordered
	 */
	IRI(1, "IRI", "IRI"),

	/**
	 * The '<em><b>Custom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM(2, "Custom", "Custom"),

	/**
	 * The '<em><b>Id Short</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_SHORT_VALUE
	 * @generated
	 * @ordered
	 */
	ID_SHORT(3, "IdShort", "IdShort"),

	/**
	 * The '<em><b>Fragment Id</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRAGMENT_ID_VALUE
	 * @generated
	 * @ordered
	 */
	FRAGMENT_ID(4, "FragmentId", "FragmentId");

	/**
	 * The '<em><b>IRDI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IRDI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IRDI_VALUE = 0;

	/**
	 * The '<em><b>IRI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IRI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IRI_VALUE = 1;

	/**
	 * The '<em><b>Custom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM
	 * @model name="Custom"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_VALUE = 2;

	/**
	 * The '<em><b>Id Short</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_SHORT
	 * @model name="IdShort"
	 * @generated
	 * @ordered
	 */
	public static final int ID_SHORT_VALUE = 3;

	/**
	 * The '<em><b>Fragment Id</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRAGMENT_ID
	 * @model name="FragmentId"
	 * @generated
	 * @ordered
	 */
	public static final int FRAGMENT_ID_VALUE = 4;

	/**
	 * An array of all the '<em><b>Key Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final KeyType[] VALUES_ARRAY =
		new KeyType[] {
			IRDI,
			IRI,
			CUSTOM,
			ID_SHORT,
			FRAGMENT_ID,
		};

	/**
	 * A public read-only list of all the '<em><b>Key Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<KeyType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Key Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static KeyType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KeyType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Key Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static KeyType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KeyType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Key Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static KeyType get(int value) {
		switch (value) {
			case IRDI_VALUE: return IRDI;
			case IRI_VALUE: return IRI;
			case CUSTOM_VALUE: return CUSTOM;
			case ID_SHORT_VALUE: return ID_SHORT;
			case FRAGMENT_ID_VALUE: return FRAGMENT_ID;
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
	private KeyType(int value, String name, String literal) {
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
	
} //KeyType
