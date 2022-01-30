/**
 */
package aR;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aR.Hair#getLength <em>Length</em>}</li>
 *   <li>{@link aR.Hair#getType <em>Type</em>}</li>
 *   <li>{@link aR.Hair#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see aR.ARPackage#getHair()
 * @model
 * @generated
 */
public interface Hair extends EObject {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * The literals are from the enumeration {@link aR.HairLength}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see aR.HairLength
	 * @see #setLength(HairLength)
	 * @see aR.ARPackage#getHair_Length()
	 * @model
	 * @generated
	 */
	HairLength getLength();

	/**
	 * Sets the value of the '{@link aR.Hair#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see aR.HairLength
	 * @see #getLength()
	 * @generated
	 */
	void setLength(HairLength value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link aR.HairType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see aR.HairType
	 * @see #setType(HairType)
	 * @see aR.ARPackage#getHair_Type()
	 * @model
	 * @generated
	 */
	HairType getType();

	/**
	 * Sets the value of the '{@link aR.Hair#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see aR.HairType
	 * @see #getType()
	 * @generated
	 */
	void setType(HairType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see aR.ARPackage#getHair_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link aR.Hair#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Hair
