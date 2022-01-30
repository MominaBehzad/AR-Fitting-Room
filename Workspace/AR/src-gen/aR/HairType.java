/**
 */
package aR;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Hair Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see aR.ARPackage#getHairType()
 * @model
 * @generated
 */
public enum HairType implements Enumerator {
	/**
	 * The '<em><b>Curly</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURLY_VALUE
	 * @generated
	 * @ordered
	 */
	CURLY(0, "Curly", "Curly"),

	/**
	 * The '<em><b>Straight</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRAIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	STRAIGHT(1, "Straight", "Straight"),

	/**
	 * The '<em><b>Wavy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAVY_VALUE
	 * @generated
	 * @ordered
	 */
	WAVY(2, "wavy", "wavy"),

	/**
	 * The '<em><b>Frizzy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRIZZY_VALUE
	 * @generated
	 * @ordered
	 */
	FRIZZY(3, "frizzy", "frizzy");

	/**
	 * The '<em><b>Curly</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURLY
	 * @model name="Curly"
	 * @generated
	 * @ordered
	 */
	public static final int CURLY_VALUE = 0;

	/**
	 * The '<em><b>Straight</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRAIGHT
	 * @model name="Straight"
	 * @generated
	 * @ordered
	 */
	public static final int STRAIGHT_VALUE = 1;

	/**
	 * The '<em><b>Wavy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAVY
	 * @model name="wavy"
	 * @generated
	 * @ordered
	 */
	public static final int WAVY_VALUE = 2;

	/**
	 * The '<em><b>Frizzy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRIZZY
	 * @model name="frizzy"
	 * @generated
	 * @ordered
	 */
	public static final int FRIZZY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Hair Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HairType[] VALUES_ARRAY = new HairType[] { CURLY, STRAIGHT, WAVY, FRIZZY, };

	/**
	 * A public read-only list of all the '<em><b>Hair Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HairType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Hair Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HairType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HairType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hair Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HairType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HairType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hair Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HairType get(int value) {
		switch (value) {
		case CURLY_VALUE:
			return CURLY;
		case STRAIGHT_VALUE:
			return STRAIGHT;
		case WAVY_VALUE:
			return WAVY;
		case FRIZZY_VALUE:
			return FRIZZY;
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
	private HairType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

} //HairType
