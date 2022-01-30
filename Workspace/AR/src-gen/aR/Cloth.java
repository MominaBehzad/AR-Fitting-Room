/**
 */
package aR;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloth</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aR.Cloth#getClothTitle <em>Cloth Title</em>}</li>
 *   <li>{@link aR.Cloth#getColor <em>Color</em>}</li>
 *   <li>{@link aR.Cloth#getSize <em>Size</em>}</li>
 *   <li>{@link aR.Cloth#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see aR.ARPackage#getCloth()
 * @model abstract="true"
 * @generated
 */
public interface Cloth extends EObject {
	/**
	 * Returns the value of the '<em><b>Cloth Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloth Title</em>' attribute.
	 * @see #setClothTitle(String)
	 * @see aR.ARPackage#getCloth_ClothTitle()
	 * @model
	 * @generated
	 */
	String getClothTitle();

	/**
	 * Sets the value of the '{@link aR.Cloth#getClothTitle <em>Cloth Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloth Title</em>' attribute.
	 * @see #getClothTitle()
	 * @generated
	 */
	void setClothTitle(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see aR.ARPackage#getCloth_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link aR.Cloth#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The literals are from the enumeration {@link aR.Size}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see aR.Size
	 * @see #setSize(Size)
	 * @see aR.ARPackage#getCloth_Size()
	 * @model
	 * @generated
	 */
	Size getSize();

	/**
	 * Sets the value of the '{@link aR.Cloth#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see aR.Size
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Size value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link aR.Model#getCloth <em>Cloth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Model)
	 * @see aR.ARPackage#getCloth_Model()
	 * @see aR.Model#getCloth
	 * @model opposite="cloth" required="true"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link aR.Cloth#getModel <em>Model</em>}' reference.
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
	void addCloth();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deleteCloth();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tif(model.gender=\'Female\')\t\n\t\t\tthen \n\t\t\t    if(model.body.weight&gt;=40 and model.body.weight&lt;=49 and model.body.height&gt;=134 and model.body.height&lt;=154 and size=\'ExtraSmall\')\n\t\t\t    then true\n\t\t\t    else\n\t\t\t    if(model.body.weight&gt;=50 and model.body.weight&lt;=54 and model.body.height&gt;=155 and model.body.height&lt;=164 and size=\'Small\')\n\t\t\t    then true\n\t\t\t    else  \n\t\t\t    if(model.body.weight&gt;=55 and model.body.weight&lt;=64 and model.body.height&gt;=165 and model.body.height&lt;=174 and size=\'Medium\')\n\t\t\t    then true\n\t\t\t    else\n\t\t\t    if(model.body.weight&gt;=65 and model.body.weight&lt;=74 and model.body.height&gt;=175 and model.body.height&lt;=184 and size=\'MediumLarge\')\n\t\t\t    then true\n\t\t\t    else\n\t\t\t    if(model.body.weight&gt;=75 and model.body.weight&lt;=89 and model.body.height&gt;=185 and model.body.height&lt;=194 and size=\'Large\')\n\t\t\t    then true\n\t\t\t    else\n\t\t\t    if(model.body.weight&gt;=90 and model.body.height&gt;=195  and size=\'ExtraLarge\')\n\t\t\t    then true\n\t\t\t    else false\n\t\t\t    endif\n\t\t\t    endif\n\t\t\t    endif\n\t\t\t    endif\n\t\t\t    endif\n\t\t\t    endif\n\t\telse\n\t\tif(model.gender=\'Male\')\t\n\t\t\tthen \n\t\t\t    if(model.body.weight&gt;=45 and model.body.weight&lt;=59 and model.body.height&gt;=150 and model.body.height&lt;=164 and size=\'ExtraSmall\')\n\t\t\t    then true\n\t\t\t    else\n\t\t\t    if(model.body.weight&gt;=60 and model.body.weight&lt;=69 and model.body.height&gt;=165 and model.body.height&lt;=174 and size=\'Small\')\n\t\t\t    then true\n\t\t\t    else  \n\t\t\t    if(model.body.weight&gt;=70 and model.body.weight&lt;=79 and model.body.height&gt;=175 and model.body.height&lt;=184 and size=\'Medium\')\n\t\t\t    then true\n\t\t\t    else\n\t\t\t    if(model.body.weight&gt;=80 and model.body.weight&lt;=89 and model.body.height&gt;=185 and model.body.height&lt;=194 and size=\'MediumLarge\')\n\t\t\t    then true\n\t\t\t    else\n\t\t\t    if(model.body.weight&gt;=90 and model.body.weight&lt;=100 and model.body.height&gt;=195 and model.body.height&lt;=204 and size=\'Large\')\n\t\t\t    then true\n\t\t\t    else\n\t\t\t    if(model.body.weight&gt;100 and model.body.height&gt;=205  and size=\'ExtraLarge\')\n\t\t\t    then true\n\t\t\t    else false\n\t\t\t    endif\n\t\t\t    endif\n\t\t\t    endif\n\t\t\t    endif\n\t\t\t    endif\n\t\t\t    endif\n\t\t\telse false\n\t\t\tendif\n\t\t\tendif'"
	 * @generated
	 */
	boolean isCorrectSize();

} // Cloth
