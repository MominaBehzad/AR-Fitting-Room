/**
 */
package aR;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fitting Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aR.FittingRoom#getCloth <em>Cloth</em>}</li>
 *   <li>{@link aR.FittingRoom#getModel <em>Model</em>}</li>
 *   <li>{@link aR.FittingRoom#getCustomer <em>Customer</em>}</li>
 *   <li>{@link aR.FittingRoom#getAccessories <em>Accessories</em>}</li>
 * </ul>
 *
 * @see aR.ARPackage#getFittingRoom()
 * @model
 * @generated
 */
public interface FittingRoom extends EObject {
	/**
	 * Returns the value of the '<em><b>Cloth</b></em>' containment reference list.
	 * The list contents are of type {@link aR.Cloth}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloth</em>' containment reference list.
	 * @see aR.ARPackage#getFittingRoom_Cloth()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cloth> getCloth();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference list.
	 * The list contents are of type {@link aR.Model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference list.
	 * @see aR.ARPackage#getFittingRoom_Model()
	 * @model containment="true"
	 * @generated
	 */
	EList<Model> getModel();

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' containment reference list.
	 * The list contents are of type {@link aR.Customer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' containment reference list.
	 * @see aR.ARPackage#getFittingRoom_Customer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Customer> getCustomer();

	/**
	 * Returns the value of the '<em><b>Accessories</b></em>' containment reference list.
	 * The list contents are of type {@link aR.Accessories}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessories</em>' containment reference list.
	 * @see aR.ARPackage#getFittingRoom_Accessories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Accessories> getAccessories();

} // FittingRoom
