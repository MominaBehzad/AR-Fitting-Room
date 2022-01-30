/**
 */
package aR;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Skin Tone</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see aR.ARPackage#getSkinTone()
 * @model
 * @generated
 */
public enum SkinTone implements Enumerator {
	/**
	 * The '<em><b>Vanlia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VANLIA_VALUE
	 * @generated
	 * @ordered
	 */
	VANLIA(0, "Vanlia", "Vanlia"),

	/**
	 * The '<em><b>Beige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEIGE_VALUE
	 * @generated
	 * @ordered
	 */
	BEIGE(1, "Beige", "Beige"),

	/**
	 * The '<em><b>Almond</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALMOND_VALUE
	 * @generated
	 * @ordered
	 */
	ALMOND(2, "Almond", "Almond"),

	/**
	 * The '<em><b>Golden</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOLDEN_VALUE
	 * @generated
	 * @ordered
	 */
	GOLDEN(3, "Golden", "Golden"),

	/**
	 * The '<em><b>Mocha</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOCHA_VALUE
	 * @generated
	 * @ordered
	 */
	MOCHA(4, "Mocha", "Mocha"),

	/**
	 * The '<em><b>Toffee</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOFFEE_VALUE
	 * @generated
	 * @ordered
	 */
	TOFFEE(5, "Toffee", "Toffee");

	/**
	 * The '<em><b>Vanlia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VANLIA
	 * @model name="Vanlia"
	 * @generated
	 * @ordered
	 */
	public static final int VANLIA_VALUE = 0;

	/**
	 * The '<em><b>Beige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEIGE
	 * @model name="Beige"
	 * @generated
	 * @ordered
	 */
	public static final int BEIGE_VALUE = 1;

	/**
	 * The '<em><b>Almond</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALMOND
	 * @model name="Almond"
	 * @generated
	 * @ordered
	 */
	public static final int ALMOND_VALUE = 2;

	/**
	 * The '<em><b>Golden</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOLDEN
	 * @model name="Golden"
	 * @generated
	 * @ordered
	 */
	public static final int GOLDEN_VALUE = 3;

	/**
	 * The '<em><b>Mocha</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOCHA
	 * @model name="Mocha"
	 * @generated
	 * @ordered
	 */
	public static final int MOCHA_VALUE = 4;

	/**
	 * The '<em><b>Toffee</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOFFEE
	 * @model name="Toffee"
	 * @generated
	 * @ordered
	 */
	public static final int TOFFEE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Skin Tone</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SkinTone[] VALUES_ARRAY = new SkinTone[] { VANLIA, BEIGE, ALMOND, GOLDEN, MOCHA, TOFFEE, };

	/**
	 * A public read-only list of all the '<em><b>Skin Tone</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SkinTone> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Skin Tone</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SkinTone get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SkinTone result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Skin Tone</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SkinTone getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SkinTone result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Skin Tone</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SkinTone get(int value) {
		switch (value) {
		case VANLIA_VALUE:
			return VANLIA;
		case BEIGE_VALUE:
			return BEIGE;
		case ALMOND_VALUE:
			return ALMOND;
		case GOLDEN_VALUE:
			return GOLDEN;
		case MOCHA_VALUE:
			return MOCHA;
		case TOFFEE_VALUE:
			return TOFFEE;
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
	private SkinTone(int value, String name, String literal) {
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

} //SkinTone
