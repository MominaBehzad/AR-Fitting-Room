/**
 */
package aR;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Face</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aR.Face#getEyeColor <em>Eye Color</em>}</li>
 *   <li>{@link aR.Face#getTone <em>Tone</em>}</li>
 *   <li>{@link aR.Face#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see aR.ARPackage#getFace()
 * @model
 * @generated
 */
public interface Face extends EObject {
	/**
	 * Returns the value of the '<em><b>Eye Color</b></em>' attribute.
	 * The literals are from the enumeration {@link aR.EyeColor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eye Color</em>' attribute.
	 * @see aR.EyeColor
	 * @see #setEyeColor(EyeColor)
	 * @see aR.ARPackage#getFace_EyeColor()
	 * @model
	 * @generated
	 */
	EyeColor getEyeColor();

	/**
	 * Sets the value of the '{@link aR.Face#getEyeColor <em>Eye Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eye Color</em>' attribute.
	 * @see aR.EyeColor
	 * @see #getEyeColor()
	 * @generated
	 */
	void setEyeColor(EyeColor value);

	/**
	 * Returns the value of the '<em><b>Tone</b></em>' attribute.
	 * The literals are from the enumeration {@link aR.SkinTone}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tone</em>' attribute.
	 * @see aR.SkinTone
	 * @see #setTone(SkinTone)
	 * @see aR.ARPackage#getFace_Tone()
	 * @model
	 * @generated
	 */
	SkinTone getTone();

	/**
	 * Sets the value of the '{@link aR.Face#getTone <em>Tone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tone</em>' attribute.
	 * @see aR.SkinTone
	 * @see #getTone()
	 * @generated
	 */
	void setTone(SkinTone value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see aR.ARPackage#getFace_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link aR.Face#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Face
