/**
 */
package aR;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aR.Pant#getLength <em>Length</em>}</li>
 *   <li>{@link aR.Pant#getWaist <em>Waist</em>}</li>
 * </ul>
 *
 * @see aR.ARPackage#getPant()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='onePant'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot onePant='self-&gt;size()&lt;=1'"
 * @generated
 */
public interface Pant extends Cloth {

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(float)
	 * @see aR.ARPackage#getPant_Length()
	 * @model required="true"
	 * @generated
	 */
	float getLength();

	/**
	 * Sets the value of the '{@link aR.Pant#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(float value);

	/**
	 * Returns the value of the '<em><b>Waist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waist</em>' attribute.
	 * @see #setWaist(float)
	 * @see aR.ARPackage#getPant_Waist()
	 * @model required="true"
	 * @generated
	 */
	float getWaist();

	/**
	 * Sets the value of the '{@link aR.Pant#getWaist <em>Waist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Waist</em>' attribute.
	 * @see #getWaist()
	 * @generated
	 */
	void setWaist(float value);
} // Pant
