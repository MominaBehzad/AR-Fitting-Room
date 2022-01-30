/**
 */
package aR;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see aR.ARFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ARPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "aR";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/aR";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "aR";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ARPackage eINSTANCE = aR.impl.ARPackageImpl.init();

	/**
	 * The meta object id for the '{@link aR.impl.FittingRoomImpl <em>Fitting Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aR.impl.FittingRoomImpl
	 * @see aR.impl.ARPackageImpl#getFittingRoom()
	 * @generated
	 */
	int FITTING_ROOM = 0;

	/**
	 * The feature id for the '<em><b>Cloth</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FITTING_ROOM__CLOTH = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FITTING_ROOM__MODEL = 1;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FITTING_ROOM__CUSTOMER = 2;

	/**
	 * The feature id for the '<em><b>Accessories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FITTING_ROOM__ACCESSORIES = 3;

	/**
	 * The number of structural features of the '<em>Fitting Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FITTING_ROOM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Fitting Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FITTING_ROOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aR.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aR.impl.ModelImpl
	 * @see aR.impl.ARPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 1;

	/**
	 * The feature id for the '<em><b>Model ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MODEL_ID = 0;

	/**
	 * The feature id for the '<em><b>Cloth</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CLOTH = 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__BODY = 2;

	/**
	 * The feature id for the '<em><b>Hair</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__HAIR = 3;

	/**
	 * The feature id for the '<em><b>Face</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__FACE = 4;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__GENDER = 5;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CUSTOMER = 6;

	/**
	 * The feature id for the '<em><b>Accessories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ACCESSORIES = 7;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Add Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___ADD_MODEL = 0;

	/**
	 * The operation id for the '<em>Delete Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___DELETE_MODEL = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link aR.impl.ClothImpl <em>Cloth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aR.impl.ClothImpl
	 * @see aR.impl.ARPackageImpl#getCloth()
	 * @generated
	 */
	int CLOTH = 2;

	/**
	 * The feature id for the '<em><b>Cloth Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOTH__CLOTH_TITLE = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOTH__COLOR = 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOTH__SIZE = 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOTH__MODEL = 3;

	/**
	 * The number of structural features of the '<em>Cloth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOTH_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Add Cloth</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOTH___ADD_CLOTH = 0;

	/**
	 * The operation id for the '<em>Delete Cloth</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOTH___DELETE_CLOTH = 1;

	/**
	 * The operation id for the '<em>Is Correct Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOTH___IS_CORRECT_SIZE = 2;

	/**
	 * The number of operations of the '<em>Cloth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOTH_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link aR.impl.FaceImpl <em>Face</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aR.impl.FaceImpl
	 * @see aR.impl.ARPackageImpl#getFace()
	 * @generated
	 */
	int FACE = 3;

	/**
	 * The feature id for the '<em><b>Eye Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE__EYE_COLOR = 0;

	/**
	 * The feature id for the '<em><b>Tone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE__TONE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Face</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Face</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aR.impl.HairImpl <em>Hair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aR.impl.HairImpl
	 * @see aR.impl.ARPackageImpl#getHair()
	 * @generated
	 */
	int HAIR = 4;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAIR__LENGTH = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAIR__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAIR__NAME = 2;

	/**
	 * The number of structural features of the '<em>Hair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAIR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Hair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aR.impl.BodyImpl <em>Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aR.impl.BodyImpl
	 * @see aR.impl.ARPackageImpl#getBody()
	 * @generated
	 */
	int BODY = 5;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__HEIGHT = 0;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__WEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__NAME = 2;

	/**
	 * The number of structural features of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aR.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aR.impl.CustomerImpl
	 * @see aR.impl.ARPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__AGE = 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__MODEL = 2;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Add Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___ADD_CUSTOMER = 0;

	/**
	 * The operation id for the '<em>Delete Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___DELETE_CUSTOMER = 1;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link aR.impl.ShirtImpl <em>Shirt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aR.impl.ShirtImpl
	 * @see aR.impl.ARPackageImpl#getShirt()
	 * @generated
	 */
	int SHIRT = 7;

	/**
	 * The feature id for the '<em><b>Cloth Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIRT__CLOTH_TITLE = CLOTH__CLOTH_TITLE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIRT__COLOR = CLOTH__COLOR;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIRT__SIZE = CLOTH__SIZE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIRT__MODEL = CLOTH__MODEL;

	/**
	 * The feature id for the '<em><b>Shoulder Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIRT__SHOULDER_WIDTH = CLOTH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Neck</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIRT__NECK = CLOTH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sleeves Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIRT__SLEEVES_LENGTH = CLOTH_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Shirt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIRT_FEATURE_COUNT = CLOTH_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Cloth</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIRT___ADD_CLOTH = CLOTH___ADD_CLOTH;

	/**
	 * The operation id for the '<em>Delete Cloth</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIRT___DELETE_CLOTH = CLOTH___DELETE_CLOTH;

	/**
	 * The operation id for the '<em>Is Correct Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIRT___IS_CORRECT_SIZE = CLOTH___IS_CORRECT_SIZE;

	/**
	 * The number of operations of the '<em>Shirt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIRT_OPERATION_COUNT = CLOTH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aR.impl.PantImpl <em>Pant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aR.impl.PantImpl
	 * @see aR.impl.ARPackageImpl#getPant()
	 * @generated
	 */
	int PANT = 8;

	/**
	 * The feature id for the '<em><b>Cloth Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANT__CLOTH_TITLE = CLOTH__CLOTH_TITLE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANT__COLOR = CLOTH__COLOR;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANT__SIZE = CLOTH__SIZE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANT__MODEL = CLOTH__MODEL;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANT__LENGTH = CLOTH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Waist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANT__WAIST = CLOTH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANT_FEATURE_COUNT = CLOTH_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Cloth</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANT___ADD_CLOTH = CLOTH___ADD_CLOTH;

	/**
	 * The operation id for the '<em>Delete Cloth</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANT___DELETE_CLOTH = CLOTH___DELETE_CLOTH;

	/**
	 * The operation id for the '<em>Is Correct Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANT___IS_CORRECT_SIZE = CLOTH___IS_CORRECT_SIZE;

	/**
	 * The number of operations of the '<em>Pant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANT_OPERATION_COUNT = CLOTH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aR.impl.AccessoriesImpl <em>Accessories</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aR.impl.AccessoriesImpl
	 * @see aR.impl.ARPackageImpl#getAccessories()
	 * @generated
	 */
	int ACCESSORIES = 9;

	/**
	 * The feature id for the '<em><b>Accessory Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSORIES__ACCESSORY_ID = 0;

	/**
	 * The feature id for the '<em><b>Accessory Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSORIES__ACCESSORY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSORIES__MODEL = 2;

	/**
	 * The number of structural features of the '<em>Accessories</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSORIES_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Add Accessory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSORIES___ADD_ACCESSORY = 0;

	/**
	 * The operation id for the '<em>Delete Accessory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSORIES___DELETE_ACCESSORY = 1;

	/**
	 * The number of operations of the '<em>Accessories</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSORIES_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link aR.impl.SummerAccessoriesImpl <em>Summer Accessories</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aR.impl.SummerAccessoriesImpl
	 * @see aR.impl.ARPackageImpl#getSummerAccessories()
	 * @generated
	 */
	int SUMMER_ACCESSORIES = 10;

	/**
	 * The feature id for the '<em><b>Accessory Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMER_ACCESSORIES__ACCESSORY_ID = ACCESSORIES__ACCESSORY_ID;

	/**
	 * The feature id for the '<em><b>Accessory Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMER_ACCESSORIES__ACCESSORY_NAME = ACCESSORIES__ACCESSORY_NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMER_ACCESSORIES__MODEL = ACCESSORIES__MODEL;

	/**
	 * The number of structural features of the '<em>Summer Accessories</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMER_ACCESSORIES_FEATURE_COUNT = ACCESSORIES_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Accessory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMER_ACCESSORIES___ADD_ACCESSORY = ACCESSORIES___ADD_ACCESSORY;

	/**
	 * The operation id for the '<em>Delete Accessory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMER_ACCESSORIES___DELETE_ACCESSORY = ACCESSORIES___DELETE_ACCESSORY;

	/**
	 * The number of operations of the '<em>Summer Accessories</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMER_ACCESSORIES_OPERATION_COUNT = ACCESSORIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aR.impl.WinterAccessoriesImpl <em>Winter Accessories</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aR.impl.WinterAccessoriesImpl
	 * @see aR.impl.ARPackageImpl#getWinterAccessories()
	 * @generated
	 */
	int WINTER_ACCESSORIES = 11;

	/**
	 * The feature id for the '<em><b>Accessory Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINTER_ACCESSORIES__ACCESSORY_ID = ACCESSORIES__ACCESSORY_ID;

	/**
	 * The feature id for the '<em><b>Accessory Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINTER_ACCESSORIES__ACCESSORY_NAME = ACCESSORIES__ACCESSORY_NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINTER_ACCESSORIES__MODEL = ACCESSORIES__MODEL;

	/**
	 * The number of structural features of the '<em>Winter Accessories</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINTER_ACCESSORIES_FEATURE_COUNT = ACCESSORIES_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Accessory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINTER_ACCESSORIES___ADD_ACCESSORY = ACCESSORIES___ADD_ACCESSORY;

	/**
	 * The operation id for the '<em>Delete Accessory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINTER_ACCESSORIES___DELETE_ACCESSORY = ACCESSORIES___DELETE_ACCESSORY;

	/**
	 * The number of operations of the '<em>Winter Accessories</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINTER_ACCESSORIES_OPERATION_COUNT = ACCESSORIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aR.Size <em>Size</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aR.Size
	 * @see aR.impl.ARPackageImpl#getSize()
	 * @generated
	 */
	int SIZE = 12;

	/**
	 * The meta object id for the '{@link aR.Gender <em>Gender</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aR.Gender
	 * @see aR.impl.ARPackageImpl#getGender()
	 * @generated
	 */
	int GENDER = 13;

	/**
	 * The meta object id for the '{@link aR.HairLength <em>Hair Length</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aR.HairLength
	 * @see aR.impl.ARPackageImpl#getHairLength()
	 * @generated
	 */
	int HAIR_LENGTH = 14;

	/**
	 * The meta object id for the '{@link aR.HairType <em>Hair Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aR.HairType
	 * @see aR.impl.ARPackageImpl#getHairType()
	 * @generated
	 */
	int HAIR_TYPE = 15;

	/**
	 * The meta object id for the '{@link aR.EyeColor <em>Eye Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aR.EyeColor
	 * @see aR.impl.ARPackageImpl#getEyeColor()
	 * @generated
	 */
	int EYE_COLOR = 16;

	/**
	 * The meta object id for the '{@link aR.SkinTone <em>Skin Tone</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aR.SkinTone
	 * @see aR.impl.ARPackageImpl#getSkinTone()
	 * @generated
	 */
	int SKIN_TONE = 17;

	/**
	 * Returns the meta object for class '{@link aR.FittingRoom <em>Fitting Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fitting Room</em>'.
	 * @see aR.FittingRoom
	 * @generated
	 */
	EClass getFittingRoom();

	/**
	 * Returns the meta object for the containment reference list '{@link aR.FittingRoom#getCloth <em>Cloth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cloth</em>'.
	 * @see aR.FittingRoom#getCloth()
	 * @see #getFittingRoom()
	 * @generated
	 */
	EReference getFittingRoom_Cloth();

	/**
	 * Returns the meta object for the containment reference list '{@link aR.FittingRoom#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model</em>'.
	 * @see aR.FittingRoom#getModel()
	 * @see #getFittingRoom()
	 * @generated
	 */
	EReference getFittingRoom_Model();

	/**
	 * Returns the meta object for the containment reference list '{@link aR.FittingRoom#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Customer</em>'.
	 * @see aR.FittingRoom#getCustomer()
	 * @see #getFittingRoom()
	 * @generated
	 */
	EReference getFittingRoom_Customer();

	/**
	 * Returns the meta object for the containment reference list '{@link aR.FittingRoom#getAccessories <em>Accessories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accessories</em>'.
	 * @see aR.FittingRoom#getAccessories()
	 * @see #getFittingRoom()
	 * @generated
	 */
	EReference getFittingRoom_Accessories();

	/**
	 * Returns the meta object for class '{@link aR.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see aR.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link aR.Model#getModelID <em>Model ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model ID</em>'.
	 * @see aR.Model#getModelID()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_ModelID();

	/**
	 * Returns the meta object for the reference list '{@link aR.Model#getCloth <em>Cloth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cloth</em>'.
	 * @see aR.Model#getCloth()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Cloth();

	/**
	 * Returns the meta object for the containment reference '{@link aR.Model#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see aR.Model#getBody()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Body();

	/**
	 * Returns the meta object for the containment reference '{@link aR.Model#getHair <em>Hair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hair</em>'.
	 * @see aR.Model#getHair()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Hair();

	/**
	 * Returns the meta object for the containment reference '{@link aR.Model#getFace <em>Face</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Face</em>'.
	 * @see aR.Model#getFace()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Face();

	/**
	 * Returns the meta object for the attribute '{@link aR.Model#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see aR.Model#getGender()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Gender();

	/**
	 * Returns the meta object for the reference '{@link aR.Model#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see aR.Model#getCustomer()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Customer();

	/**
	 * Returns the meta object for the reference list '{@link aR.Model#getAccessories <em>Accessories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accessories</em>'.
	 * @see aR.Model#getAccessories()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Accessories();

	/**
	 * Returns the meta object for the '{@link aR.Model#addModel() <em>Add Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Model</em>' operation.
	 * @see aR.Model#addModel()
	 * @generated
	 */
	EOperation getModel__AddModel();

	/**
	 * Returns the meta object for the '{@link aR.Model#deleteModel() <em>Delete Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Model</em>' operation.
	 * @see aR.Model#deleteModel()
	 * @generated
	 */
	EOperation getModel__DeleteModel();

	/**
	 * Returns the meta object for class '{@link aR.Cloth <em>Cloth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloth</em>'.
	 * @see aR.Cloth
	 * @generated
	 */
	EClass getCloth();

	/**
	 * Returns the meta object for the attribute '{@link aR.Cloth#getClothTitle <em>Cloth Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloth Title</em>'.
	 * @see aR.Cloth#getClothTitle()
	 * @see #getCloth()
	 * @generated
	 */
	EAttribute getCloth_ClothTitle();

	/**
	 * Returns the meta object for the attribute '{@link aR.Cloth#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see aR.Cloth#getColor()
	 * @see #getCloth()
	 * @generated
	 */
	EAttribute getCloth_Color();

	/**
	 * Returns the meta object for the attribute '{@link aR.Cloth#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see aR.Cloth#getSize()
	 * @see #getCloth()
	 * @generated
	 */
	EAttribute getCloth_Size();

	/**
	 * Returns the meta object for the reference '{@link aR.Cloth#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see aR.Cloth#getModel()
	 * @see #getCloth()
	 * @generated
	 */
	EReference getCloth_Model();

	/**
	 * Returns the meta object for the '{@link aR.Cloth#addCloth() <em>Add Cloth</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Cloth</em>' operation.
	 * @see aR.Cloth#addCloth()
	 * @generated
	 */
	EOperation getCloth__AddCloth();

	/**
	 * Returns the meta object for the '{@link aR.Cloth#deleteCloth() <em>Delete Cloth</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Cloth</em>' operation.
	 * @see aR.Cloth#deleteCloth()
	 * @generated
	 */
	EOperation getCloth__DeleteCloth();

	/**
	 * Returns the meta object for the '{@link aR.Cloth#isCorrectSize() <em>Is Correct Size</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Correct Size</em>' operation.
	 * @see aR.Cloth#isCorrectSize()
	 * @generated
	 */
	EOperation getCloth__IsCorrectSize();

	/**
	 * Returns the meta object for class '{@link aR.Face <em>Face</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Face</em>'.
	 * @see aR.Face
	 * @generated
	 */
	EClass getFace();

	/**
	 * Returns the meta object for the attribute '{@link aR.Face#getEyeColor <em>Eye Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eye Color</em>'.
	 * @see aR.Face#getEyeColor()
	 * @see #getFace()
	 * @generated
	 */
	EAttribute getFace_EyeColor();

	/**
	 * Returns the meta object for the attribute '{@link aR.Face#getTone <em>Tone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tone</em>'.
	 * @see aR.Face#getTone()
	 * @see #getFace()
	 * @generated
	 */
	EAttribute getFace_Tone();

	/**
	 * Returns the meta object for the attribute '{@link aR.Face#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see aR.Face#getName()
	 * @see #getFace()
	 * @generated
	 */
	EAttribute getFace_Name();

	/**
	 * Returns the meta object for class '{@link aR.Hair <em>Hair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hair</em>'.
	 * @see aR.Hair
	 * @generated
	 */
	EClass getHair();

	/**
	 * Returns the meta object for the attribute '{@link aR.Hair#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see aR.Hair#getLength()
	 * @see #getHair()
	 * @generated
	 */
	EAttribute getHair_Length();

	/**
	 * Returns the meta object for the attribute '{@link aR.Hair#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see aR.Hair#getType()
	 * @see #getHair()
	 * @generated
	 */
	EAttribute getHair_Type();

	/**
	 * Returns the meta object for the attribute '{@link aR.Hair#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see aR.Hair#getName()
	 * @see #getHair()
	 * @generated
	 */
	EAttribute getHair_Name();

	/**
	 * Returns the meta object for class '{@link aR.Body <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body</em>'.
	 * @see aR.Body
	 * @generated
	 */
	EClass getBody();

	/**
	 * Returns the meta object for the attribute '{@link aR.Body#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see aR.Body#getHeight()
	 * @see #getBody()
	 * @generated
	 */
	EAttribute getBody_Height();

	/**
	 * Returns the meta object for the attribute '{@link aR.Body#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see aR.Body#getWeight()
	 * @see #getBody()
	 * @generated
	 */
	EAttribute getBody_Weight();

	/**
	 * Returns the meta object for the attribute '{@link aR.Body#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see aR.Body#getName()
	 * @see #getBody()
	 * @generated
	 */
	EAttribute getBody_Name();

	/**
	 * Returns the meta object for class '{@link aR.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see aR.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link aR.Customer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see aR.Customer#getName()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Name();

	/**
	 * Returns the meta object for the attribute '{@link aR.Customer#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see aR.Customer#getAge()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Age();

	/**
	 * Returns the meta object for the reference '{@link aR.Customer#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see aR.Customer#getModel()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Model();

	/**
	 * Returns the meta object for the '{@link aR.Customer#addCustomer() <em>Add Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Customer</em>' operation.
	 * @see aR.Customer#addCustomer()
	 * @generated
	 */
	EOperation getCustomer__AddCustomer();

	/**
	 * Returns the meta object for the '{@link aR.Customer#deleteCustomer() <em>Delete Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Customer</em>' operation.
	 * @see aR.Customer#deleteCustomer()
	 * @generated
	 */
	EOperation getCustomer__DeleteCustomer();

	/**
	 * Returns the meta object for class '{@link aR.Shirt <em>Shirt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shirt</em>'.
	 * @see aR.Shirt
	 * @generated
	 */
	EClass getShirt();

	/**
	 * Returns the meta object for the attribute '{@link aR.Shirt#getShoulderWidth <em>Shoulder Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shoulder Width</em>'.
	 * @see aR.Shirt#getShoulderWidth()
	 * @see #getShirt()
	 * @generated
	 */
	EAttribute getShirt_ShoulderWidth();

	/**
	 * Returns the meta object for the attribute '{@link aR.Shirt#getNeck <em>Neck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neck</em>'.
	 * @see aR.Shirt#getNeck()
	 * @see #getShirt()
	 * @generated
	 */
	EAttribute getShirt_Neck();

	/**
	 * Returns the meta object for the attribute '{@link aR.Shirt#getSleevesLength <em>Sleeves Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sleeves Length</em>'.
	 * @see aR.Shirt#getSleevesLength()
	 * @see #getShirt()
	 * @generated
	 */
	EAttribute getShirt_SleevesLength();

	/**
	 * Returns the meta object for class '{@link aR.Pant <em>Pant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pant</em>'.
	 * @see aR.Pant
	 * @generated
	 */
	EClass getPant();

	/**
	 * Returns the meta object for the attribute '{@link aR.Pant#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see aR.Pant#getLength()
	 * @see #getPant()
	 * @generated
	 */
	EAttribute getPant_Length();

	/**
	 * Returns the meta object for the attribute '{@link aR.Pant#getWaist <em>Waist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Waist</em>'.
	 * @see aR.Pant#getWaist()
	 * @see #getPant()
	 * @generated
	 */
	EAttribute getPant_Waist();

	/**
	 * Returns the meta object for class '{@link aR.Accessories <em>Accessories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accessories</em>'.
	 * @see aR.Accessories
	 * @generated
	 */
	EClass getAccessories();

	/**
	 * Returns the meta object for the attribute '{@link aR.Accessories#getAccessoryId <em>Accessory Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accessory Id</em>'.
	 * @see aR.Accessories#getAccessoryId()
	 * @see #getAccessories()
	 * @generated
	 */
	EAttribute getAccessories_AccessoryId();

	/**
	 * Returns the meta object for the attribute '{@link aR.Accessories#getAccessoryName <em>Accessory Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accessory Name</em>'.
	 * @see aR.Accessories#getAccessoryName()
	 * @see #getAccessories()
	 * @generated
	 */
	EAttribute getAccessories_AccessoryName();

	/**
	 * Returns the meta object for the reference '{@link aR.Accessories#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see aR.Accessories#getModel()
	 * @see #getAccessories()
	 * @generated
	 */
	EReference getAccessories_Model();

	/**
	 * Returns the meta object for the '{@link aR.Accessories#addAccessory() <em>Add Accessory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Accessory</em>' operation.
	 * @see aR.Accessories#addAccessory()
	 * @generated
	 */
	EOperation getAccessories__AddAccessory();

	/**
	 * Returns the meta object for the '{@link aR.Accessories#deleteAccessory() <em>Delete Accessory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Accessory</em>' operation.
	 * @see aR.Accessories#deleteAccessory()
	 * @generated
	 */
	EOperation getAccessories__DeleteAccessory();

	/**
	 * Returns the meta object for class '{@link aR.SummerAccessories <em>Summer Accessories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Summer Accessories</em>'.
	 * @see aR.SummerAccessories
	 * @generated
	 */
	EClass getSummerAccessories();

	/**
	 * Returns the meta object for class '{@link aR.WinterAccessories <em>Winter Accessories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Winter Accessories</em>'.
	 * @see aR.WinterAccessories
	 * @generated
	 */
	EClass getWinterAccessories();

	/**
	 * Returns the meta object for enum '{@link aR.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Size</em>'.
	 * @see aR.Size
	 * @generated
	 */
	EEnum getSize();

	/**
	 * Returns the meta object for enum '{@link aR.Gender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gender</em>'.
	 * @see aR.Gender
	 * @generated
	 */
	EEnum getGender();

	/**
	 * Returns the meta object for enum '{@link aR.HairLength <em>Hair Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hair Length</em>'.
	 * @see aR.HairLength
	 * @generated
	 */
	EEnum getHairLength();

	/**
	 * Returns the meta object for enum '{@link aR.HairType <em>Hair Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hair Type</em>'.
	 * @see aR.HairType
	 * @generated
	 */
	EEnum getHairType();

	/**
	 * Returns the meta object for enum '{@link aR.EyeColor <em>Eye Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Eye Color</em>'.
	 * @see aR.EyeColor
	 * @generated
	 */
	EEnum getEyeColor();

	/**
	 * Returns the meta object for enum '{@link aR.SkinTone <em>Skin Tone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Skin Tone</em>'.
	 * @see aR.SkinTone
	 * @generated
	 */
	EEnum getSkinTone();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ARFactory getARFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link aR.impl.FittingRoomImpl <em>Fitting Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aR.impl.FittingRoomImpl
		 * @see aR.impl.ARPackageImpl#getFittingRoom()
		 * @generated
		 */
		EClass FITTING_ROOM = eINSTANCE.getFittingRoom();

		/**
		 * The meta object literal for the '<em><b>Cloth</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FITTING_ROOM__CLOTH = eINSTANCE.getFittingRoom_Cloth();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FITTING_ROOM__MODEL = eINSTANCE.getFittingRoom_Model();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FITTING_ROOM__CUSTOMER = eINSTANCE.getFittingRoom_Customer();

		/**
		 * The meta object literal for the '<em><b>Accessories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FITTING_ROOM__ACCESSORIES = eINSTANCE.getFittingRoom_Accessories();

		/**
		 * The meta object literal for the '{@link aR.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aR.impl.ModelImpl
		 * @see aR.impl.ARPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Model ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__MODEL_ID = eINSTANCE.getModel_ModelID();

		/**
		 * The meta object literal for the '<em><b>Cloth</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CLOTH = eINSTANCE.getModel_Cloth();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__BODY = eINSTANCE.getModel_Body();

		/**
		 * The meta object literal for the '<em><b>Hair</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__HAIR = eINSTANCE.getModel_Hair();

		/**
		 * The meta object literal for the '<em><b>Face</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__FACE = eINSTANCE.getModel_Face();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__GENDER = eINSTANCE.getModel_Gender();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CUSTOMER = eINSTANCE.getModel_Customer();

		/**
		 * The meta object literal for the '<em><b>Accessories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ACCESSORIES = eINSTANCE.getModel_Accessories();

		/**
		 * The meta object literal for the '<em><b>Add Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL___ADD_MODEL = eINSTANCE.getModel__AddModel();

		/**
		 * The meta object literal for the '<em><b>Delete Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL___DELETE_MODEL = eINSTANCE.getModel__DeleteModel();

		/**
		 * The meta object literal for the '{@link aR.impl.ClothImpl <em>Cloth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aR.impl.ClothImpl
		 * @see aR.impl.ARPackageImpl#getCloth()
		 * @generated
		 */
		EClass CLOTH = eINSTANCE.getCloth();

		/**
		 * The meta object literal for the '<em><b>Cloth Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOTH__CLOTH_TITLE = eINSTANCE.getCloth_ClothTitle();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOTH__COLOR = eINSTANCE.getCloth_Color();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOTH__SIZE = eINSTANCE.getCloth_Size();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOTH__MODEL = eINSTANCE.getCloth_Model();

		/**
		 * The meta object literal for the '<em><b>Add Cloth</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOTH___ADD_CLOTH = eINSTANCE.getCloth__AddCloth();

		/**
		 * The meta object literal for the '<em><b>Delete Cloth</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOTH___DELETE_CLOTH = eINSTANCE.getCloth__DeleteCloth();

		/**
		 * The meta object literal for the '<em><b>Is Correct Size</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOTH___IS_CORRECT_SIZE = eINSTANCE.getCloth__IsCorrectSize();

		/**
		 * The meta object literal for the '{@link aR.impl.FaceImpl <em>Face</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aR.impl.FaceImpl
		 * @see aR.impl.ARPackageImpl#getFace()
		 * @generated
		 */
		EClass FACE = eINSTANCE.getFace();

		/**
		 * The meta object literal for the '<em><b>Eye Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACE__EYE_COLOR = eINSTANCE.getFace_EyeColor();

		/**
		 * The meta object literal for the '<em><b>Tone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACE__TONE = eINSTANCE.getFace_Tone();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACE__NAME = eINSTANCE.getFace_Name();

		/**
		 * The meta object literal for the '{@link aR.impl.HairImpl <em>Hair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aR.impl.HairImpl
		 * @see aR.impl.ARPackageImpl#getHair()
		 * @generated
		 */
		EClass HAIR = eINSTANCE.getHair();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAIR__LENGTH = eINSTANCE.getHair_Length();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAIR__TYPE = eINSTANCE.getHair_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAIR__NAME = eINSTANCE.getHair_Name();

		/**
		 * The meta object literal for the '{@link aR.impl.BodyImpl <em>Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aR.impl.BodyImpl
		 * @see aR.impl.ARPackageImpl#getBody()
		 * @generated
		 */
		EClass BODY = eINSTANCE.getBody();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__HEIGHT = eINSTANCE.getBody_Height();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__WEIGHT = eINSTANCE.getBody_Weight();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__NAME = eINSTANCE.getBody_Name();

		/**
		 * The meta object literal for the '{@link aR.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aR.impl.CustomerImpl
		 * @see aR.impl.ARPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__NAME = eINSTANCE.getCustomer_Name();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__AGE = eINSTANCE.getCustomer_Age();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__MODEL = eINSTANCE.getCustomer_Model();

		/**
		 * The meta object literal for the '<em><b>Add Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___ADD_CUSTOMER = eINSTANCE.getCustomer__AddCustomer();

		/**
		 * The meta object literal for the '<em><b>Delete Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___DELETE_CUSTOMER = eINSTANCE.getCustomer__DeleteCustomer();

		/**
		 * The meta object literal for the '{@link aR.impl.ShirtImpl <em>Shirt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aR.impl.ShirtImpl
		 * @see aR.impl.ARPackageImpl#getShirt()
		 * @generated
		 */
		EClass SHIRT = eINSTANCE.getShirt();

		/**
		 * The meta object literal for the '<em><b>Shoulder Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIRT__SHOULDER_WIDTH = eINSTANCE.getShirt_ShoulderWidth();

		/**
		 * The meta object literal for the '<em><b>Neck</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIRT__NECK = eINSTANCE.getShirt_Neck();

		/**
		 * The meta object literal for the '<em><b>Sleeves Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIRT__SLEEVES_LENGTH = eINSTANCE.getShirt_SleevesLength();

		/**
		 * The meta object literal for the '{@link aR.impl.PantImpl <em>Pant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aR.impl.PantImpl
		 * @see aR.impl.ARPackageImpl#getPant()
		 * @generated
		 */
		EClass PANT = eINSTANCE.getPant();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PANT__LENGTH = eINSTANCE.getPant_Length();

		/**
		 * The meta object literal for the '<em><b>Waist</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PANT__WAIST = eINSTANCE.getPant_Waist();

		/**
		 * The meta object literal for the '{@link aR.impl.AccessoriesImpl <em>Accessories</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aR.impl.AccessoriesImpl
		 * @see aR.impl.ARPackageImpl#getAccessories()
		 * @generated
		 */
		EClass ACCESSORIES = eINSTANCE.getAccessories();

		/**
		 * The meta object literal for the '<em><b>Accessory Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSORIES__ACCESSORY_ID = eINSTANCE.getAccessories_AccessoryId();

		/**
		 * The meta object literal for the '<em><b>Accessory Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSORIES__ACCESSORY_NAME = eINSTANCE.getAccessories_AccessoryName();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESSORIES__MODEL = eINSTANCE.getAccessories_Model();

		/**
		 * The meta object literal for the '<em><b>Add Accessory</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACCESSORIES___ADD_ACCESSORY = eINSTANCE.getAccessories__AddAccessory();

		/**
		 * The meta object literal for the '<em><b>Delete Accessory</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACCESSORIES___DELETE_ACCESSORY = eINSTANCE.getAccessories__DeleteAccessory();

		/**
		 * The meta object literal for the '{@link aR.impl.SummerAccessoriesImpl <em>Summer Accessories</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aR.impl.SummerAccessoriesImpl
		 * @see aR.impl.ARPackageImpl#getSummerAccessories()
		 * @generated
		 */
		EClass SUMMER_ACCESSORIES = eINSTANCE.getSummerAccessories();

		/**
		 * The meta object literal for the '{@link aR.impl.WinterAccessoriesImpl <em>Winter Accessories</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aR.impl.WinterAccessoriesImpl
		 * @see aR.impl.ARPackageImpl#getWinterAccessories()
		 * @generated
		 */
		EClass WINTER_ACCESSORIES = eINSTANCE.getWinterAccessories();

		/**
		 * The meta object literal for the '{@link aR.Size <em>Size</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aR.Size
		 * @see aR.impl.ARPackageImpl#getSize()
		 * @generated
		 */
		EEnum SIZE = eINSTANCE.getSize();

		/**
		 * The meta object literal for the '{@link aR.Gender <em>Gender</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aR.Gender
		 * @see aR.impl.ARPackageImpl#getGender()
		 * @generated
		 */
		EEnum GENDER = eINSTANCE.getGender();

		/**
		 * The meta object literal for the '{@link aR.HairLength <em>Hair Length</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aR.HairLength
		 * @see aR.impl.ARPackageImpl#getHairLength()
		 * @generated
		 */
		EEnum HAIR_LENGTH = eINSTANCE.getHairLength();

		/**
		 * The meta object literal for the '{@link aR.HairType <em>Hair Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aR.HairType
		 * @see aR.impl.ARPackageImpl#getHairType()
		 * @generated
		 */
		EEnum HAIR_TYPE = eINSTANCE.getHairType();

		/**
		 * The meta object literal for the '{@link aR.EyeColor <em>Eye Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aR.EyeColor
		 * @see aR.impl.ARPackageImpl#getEyeColor()
		 * @generated
		 */
		EEnum EYE_COLOR = eINSTANCE.getEyeColor();

		/**
		 * The meta object literal for the '{@link aR.SkinTone <em>Skin Tone</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aR.SkinTone
		 * @see aR.impl.ARPackageImpl#getSkinTone()
		 * @generated
		 */
		EEnum SKIN_TONE = eINSTANCE.getSkinTone();

	}

} //ARPackage
