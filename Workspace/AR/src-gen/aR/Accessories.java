/**
 */
package aR;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accessories</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aR.Accessories#getAccessoryId <em>Accessory Id</em>}</li>
 *   <li>{@link aR.Accessories#getAccessoryName <em>Accessory Name</em>}</li>
 *   <li>{@link aR.Accessories#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see aR.ARPackage#getAccessories()
 * @model abstract="true"
 * @generated
 */
public interface Accessories extends EObject {
	/**
	 * Returns the value of the '<em><b>Accessory Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessory Id</em>' attribute.
	 * @see #setAccessoryId(String)
	 * @see aR.ARPackage#getAccessories_AccessoryId()
	 * @model
	 * @generated
	 */
	String getAccessoryId();

	/**
	 * Sets the value of the '{@link aR.Accessories#getAccessoryId <em>Accessory Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accessory Id</em>' attribute.
	 * @see #getAccessoryId()
	 * @generated
	 */
	void setAccessoryId(String value);

	/**
	 * Returns the value of the '<em><b>Accessory Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessory Name</em>' attribute.
	 * @see #setAccessoryName(String)
	 * @see aR.ARPackage#getAccessories_AccessoryName()
	 * @model
	 * @generated
	 */
	String getAccessoryName();

	/**
	 * Sets the value of the '{@link aR.Accessories#getAccessoryName <em>Accessory Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accessory Name</em>' attribute.
	 * @see #getAccessoryName()
	 * @generated
	 */
	void setAccessoryName(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link aR.Model#getAccessories <em>Accessories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Model)
	 * @see aR.ARPackage#getAccessories_Model()
	 * @see aR.Model#getAccessories
	 * @model opposite="accessories" required="true"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link aR.Accessories#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addAccessory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deleteAccessory();

} // Accessories
