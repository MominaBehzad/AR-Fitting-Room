/**
 */
package aR;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shirt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aR.Shirt#getShoulderWidth <em>Shoulder Width</em>}</li>
 *   <li>{@link aR.Shirt#getNeck <em>Neck</em>}</li>
 *   <li>{@link aR.Shirt#getSleevesLength <em>Sleeves Length</em>}</li>
 * </ul>
 *
 * @see aR.ARPackage#getShirt()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='oneShirt'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot oneShirt='self-&gt;size()&lt;=1'"
 * @generated
 */
public interface Shirt extends Cloth {

	/**
	 * Returns the value of the '<em><b>Shoulder Width</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shoulder Width</em>' attribute.
	 * @see #setShoulderWidth(float)
	 * @see aR.ARPackage#getShirt_ShoulderWidth()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	float getShoulderWidth();

	/**
	 * Sets the value of the '{@link aR.Shirt#getShoulderWidth <em>Shoulder Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shoulder Width</em>' attribute.
	 * @see #getShoulderWidth()
	 * @generated
	 */
	void setShoulderWidth(float value);

	/**
	 * Returns the value of the '<em><b>Neck</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neck</em>' attribute.
	 * @see #setNeck(float)
	 * @see aR.ARPackage#getShirt_Neck()
	 * @model required="true"
	 * @generated
	 */
	float getNeck();

	/**
	 * Sets the value of the '{@link aR.Shirt#getNeck <em>Neck</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neck</em>' attribute.
	 * @see #getNeck()
	 * @generated
	 */
	void setNeck(float value);

	/**
	 * Returns the value of the '<em><b>Sleeves Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sleeves Length</em>' attribute.
	 * @see #setSleevesLength(float)
	 * @see aR.ARPackage#getShirt_SleevesLength()
	 * @model required="true"
	 * @generated
	 */
	float getSleevesLength();

	/**
	 * Sets the value of the '{@link aR.Shirt#getSleevesLength <em>Sleeves Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sleeves Length</em>' attribute.
	 * @see #getSleevesLength()
	 * @generated
	 */
	void setSleevesLength(float value);
} // Shirt
