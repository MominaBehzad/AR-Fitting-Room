/**
 */
package aR;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Eye Color</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see aR.ARPackage#getEyeColor()
 * @model
 * @generated
 */
public enum EyeColor implements Enumerator {
	/**
	 * The '<em><b>Light Brown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHT_BROWN_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHT_BROWN(0, "LightBrown", "LightBrown"),

	/**
	 * The '<em><b>Dark Brown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARK_BROWN_VALUE
	 * @generated
	 * @ordered
	 */
	DARK_BROWN(1, "DarkBrown", "DarkBrown"),

	/**
	 * The '<em><b>Black</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLACK_VALUE
	 * @generated
	 * @ordered
	 */
	BLACK(2, "black", "black"),

	/**
	 * The '<em><b>Green</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREEN_VALUE
	 * @generated
	 * @ordered
	 */
	GREEN(3, "green", "green"),

	/**
	 * The '<em><b>Blue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUE_VALUE
	 * @generated
	 * @ordered
	 */
	BLUE(4, "blue", "blue");

	/**
	 * The '<em><b>Light Brown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHT_BROWN
	 * @model name="LightBrown"
	 * @generated
	 * @ordered
	 */
	public static final int LIGHT_BROWN_VALUE = 0;

	/**
	 * The '<em><b>Dark Brown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARK_BROWN
	 * @model name="DarkBrown"
	 * @generated
	 * @ordered
	 */
	public static final int DARK_BROWN_VALUE = 1;

	/**
	 * The '<em><b>Black</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLACK
	 * @model name="black"
	 * @generated
	 * @ordered
	 */
	public static final int BLACK_VALUE = 2;

	/**
	 * The '<em><b>Green</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREEN
	 * @model name="green"
	 * @generated
	 * @ordered
	 */
	public static final int GREEN_VALUE = 3;

	/**
	 * The '<em><b>Blue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUE
	 * @model name="blue"
	 * @generated
	 * @ordered
	 */
	public static final int BLUE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Eye Color</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EyeColor[] VALUES_ARRAY = new EyeColor[] { LIGHT_BROWN, DARK_BROWN, BLACK, GREEN, BLUE, };

	/**
	 * A public read-only list of all the '<em><b>Eye Color</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EyeColor> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Eye Color</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EyeColor get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EyeColor result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Eye Color</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EyeColor getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EyeColor result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Eye Color</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EyeColor get(int value) {
		switch (value) {
		case LIGHT_BROWN_VALUE:
			return LIGHT_BROWN;
		case DARK_BROWN_VALUE:
			return DARK_BROWN;
		case BLACK_VALUE:
			return BLACK;
		case GREEN_VALUE:
			return GREEN;
		case BLUE_VALUE:
			return BLUE;
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
	private EyeColor(int value, String name, String literal) {
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

} //EyeColor
