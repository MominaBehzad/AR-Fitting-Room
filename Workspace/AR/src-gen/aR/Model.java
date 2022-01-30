/**
 */
package aR;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aR.Model#getModelID <em>Model ID</em>}</li>
 *   <li>{@link aR.Model#getCloth <em>Cloth</em>}</li>
 *   <li>{@link aR.Model#getBody <em>Body</em>}</li>
 *   <li>{@link aR.Model#getHair <em>Hair</em>}</li>
 *   <li>{@link aR.Model#getFace <em>Face</em>}</li>
 *   <li>{@link aR.Model#getGender <em>Gender</em>}</li>
 *   <li>{@link aR.Model#getCustomer <em>Customer</em>}</li>
 *   <li>{@link aR.Model#getAccessories <em>Accessories</em>}</li>
 * </ul>
 *
 * @see aR.ARPackage#getModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='oneShirt onePant'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot oneShirt='self.cloth-&gt;oclIsTypeOf(Shirt)-&gt;size()&lt;=1' onePant=' self.cloth-&gt;oclIsTypeOf(Pant)-&gt;size()&lt;=1'"
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Model ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model ID</em>' attribute.
	 * @see #setModelID(String)
	 * @see aR.ARPackage#getModel_ModelID()
	 * @model required="true"
	 * @generated
	 */
	String getModelID();

	/**
	 * Sets the value of the '{@link aR.Model#getModelID <em>Model ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model ID</em>' attribute.
	 * @see #getModelID()
	 * @generated
	 */
	void setModelID(String value);

	/**
	 * Returns the value of the '<em><b>Cloth</b></em>' reference list.
	 * The list contents are of type {@link aR.Cloth}.
	 * It is bidirectional and its opposite is '{@link aR.Cloth#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloth</em>' reference list.
	 * @see aR.ARPackage#getModel_Cloth()
	 * @see aR.Cloth#getModel
	 * @model opposite="model"
	 * @generated
	 */
	EList<Cloth> getCloth();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Body)
	 * @see aR.ARPackage#getModel_Body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Body getBody();

	/**
	 * Sets the value of the '{@link aR.Model#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Body value);

	/**
	 * Returns the value of the '<em><b>Hair</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hair</em>' containment reference.
	 * @see #setHair(Hair)
	 * @see aR.ARPackage#getModel_Hair()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Hair getHair();

	/**
	 * Sets the value of the '{@link aR.Model#getHair <em>Hair</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hair</em>' containment reference.
	 * @see #getHair()
	 * @generated
	 */
	void setHair(Hair value);

	/**
	 * Returns the value of the '<em><b>Face</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Face</em>' containment reference.
	 * @see #setFace(Face)
	 * @see aR.ARPackage#getModel_Face()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Face getFace();

	/**
	 * Sets the value of the '{@link aR.Model#getFace <em>Face</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Face</em>' containment reference.
	 * @see #getFace()
	 * @generated
	 */
	void setFace(Face value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * The literals are from the enumeration {@link aR.Gender}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see aR.Gender
	 * @see #setGender(Gender)
	 * @see aR.ARPackage#getModel_Gender()
	 * @model
	 * @generated
	 */
	Gender getGender();

	/**
	 * Sets the value of the '{@link aR.Model#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see aR.Gender
	 * @see #getGender()
	 * @generated
	 */
	void setGender(Gender value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link aR.Customer#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see aR.ARPackage#getModel_Customer()
	 * @see aR.Customer#getModel
	 * @model opposite="model" required="true"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link aR.Model#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * Returns the value of the '<em><b>Accessories</b></em>' reference list.
	 * The list contents are of type {@link aR.Accessories}.
	 * It is bidirectional and its opposite is '{@link aR.Accessories#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessories</em>' reference list.
	 * @see aR.ARPackage#getModel_Accessories()
	 * @see aR.Accessories#getModel
	 * @model opposite="model"
	 * @generated
	 */
	EList<Accessories> getAccessories();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deleteModel();

} // Model
