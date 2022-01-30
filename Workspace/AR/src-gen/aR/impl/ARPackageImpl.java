/**
 */
package aR.impl;

import aR.ARFactory;
import aR.ARPackage;
import aR.Accessories;
import aR.Body;
import aR.Cloth;
import aR.Customer;
import aR.EyeColor;
import aR.Face;
import aR.FittingRoom;
import aR.Gender;
import aR.Hair;
import aR.HairLength;
import aR.HairType;
import aR.Model;
import aR.Pant;
import aR.Shirt;
import aR.Size;
import aR.SkinTone;
import aR.SummerAccessories;
import aR.WinterAccessories;

import aR.util.ARValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ARPackageImpl extends EPackageImpl implements ARPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fittingRoomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clothEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shirtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessoriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass summerAccessoriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass winterAccessoriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sizeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hairLengthEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hairTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eyeColorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum skinToneEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see aR.ARPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ARPackageImpl() {
		super(eNS_URI, ARFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ARPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ARPackage init() {
		if (isInited)
			return (ARPackage) EPackage.Registry.INSTANCE.getEPackage(ARPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredARPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ARPackageImpl theARPackage = registeredARPackage instanceof ARPackageImpl ? (ARPackageImpl) registeredARPackage
				: new ARPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theARPackage.createPackageContents();

		// Initialize created meta-data
		theARPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theARPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return ARValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theARPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ARPackage.eNS_URI, theARPackage);
		return theARPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFittingRoom() {
		return fittingRoomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFittingRoom_Cloth() {
		return (EReference) fittingRoomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFittingRoom_Model() {
		return (EReference) fittingRoomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFittingRoom_Customer() {
		return (EReference) fittingRoomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFittingRoom_Accessories() {
		return (EReference) fittingRoomEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_ModelID() {
		return (EAttribute) modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Cloth() {
		return (EReference) modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Body() {
		return (EReference) modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Hair() {
		return (EReference) modelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Face() {
		return (EReference) modelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Gender() {
		return (EAttribute) modelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Customer() {
		return (EReference) modelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Accessories() {
		return (EReference) modelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModel__AddModel() {
		return modelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModel__DeleteModel() {
		return modelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloth() {
		return clothEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloth_ClothTitle() {
		return (EAttribute) clothEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloth_Color() {
		return (EAttribute) clothEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloth_Size() {
		return (EAttribute) clothEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloth_Model() {
		return (EReference) clothEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCloth__AddCloth() {
		return clothEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCloth__DeleteCloth() {
		return clothEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCloth__IsCorrectSize() {
		return clothEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFace() {
		return faceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFace_EyeColor() {
		return (EAttribute) faceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFace_Tone() {
		return (EAttribute) faceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFace_Name() {
		return (EAttribute) faceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHair() {
		return hairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHair_Length() {
		return (EAttribute) hairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHair_Type() {
		return (EAttribute) hairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHair_Name() {
		return (EAttribute) hairEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBody() {
		return bodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBody_Height() {
		return (EAttribute) bodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBody_Weight() {
		return (EAttribute) bodyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBody_Name() {
		return (EAttribute) bodyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomer() {
		return customerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_Name() {
		return (EAttribute) customerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_Age() {
		return (EAttribute) customerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomer_Model() {
		return (EReference) customerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__AddCustomer() {
		return customerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__DeleteCustomer() {
		return customerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShirt() {
		return shirtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShirt_ShoulderWidth() {
		return (EAttribute) shirtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShirt_Neck() {
		return (EAttribute) shirtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShirt_SleevesLength() {
		return (EAttribute) shirtEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPant() {
		return pantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPant_Length() {
		return (EAttribute) pantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPant_Waist() {
		return (EAttribute) pantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessories() {
		return accessoriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessories_AccessoryId() {
		return (EAttribute) accessoriesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessories_AccessoryName() {
		return (EAttribute) accessoriesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessories_Model() {
		return (EReference) accessoriesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAccessories__AddAccessory() {
		return accessoriesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAccessories__DeleteAccessory() {
		return accessoriesEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSummerAccessories() {
		return summerAccessoriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWinterAccessories() {
		return winterAccessoriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSize() {
		return sizeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGender() {
		return genderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHairLength() {
		return hairLengthEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHairType() {
		return hairTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEyeColor() {
		return eyeColorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSkinTone() {
		return skinToneEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARFactory getARFactory() {
		return (ARFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		fittingRoomEClass = createEClass(FITTING_ROOM);
		createEReference(fittingRoomEClass, FITTING_ROOM__CLOTH);
		createEReference(fittingRoomEClass, FITTING_ROOM__MODEL);
		createEReference(fittingRoomEClass, FITTING_ROOM__CUSTOMER);
		createEReference(fittingRoomEClass, FITTING_ROOM__ACCESSORIES);

		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__MODEL_ID);
		createEReference(modelEClass, MODEL__CLOTH);
		createEReference(modelEClass, MODEL__BODY);
		createEReference(modelEClass, MODEL__HAIR);
		createEReference(modelEClass, MODEL__FACE);
		createEAttribute(modelEClass, MODEL__GENDER);
		createEReference(modelEClass, MODEL__CUSTOMER);
		createEReference(modelEClass, MODEL__ACCESSORIES);
		createEOperation(modelEClass, MODEL___ADD_MODEL);
		createEOperation(modelEClass, MODEL___DELETE_MODEL);

		clothEClass = createEClass(CLOTH);
		createEAttribute(clothEClass, CLOTH__CLOTH_TITLE);
		createEAttribute(clothEClass, CLOTH__COLOR);
		createEAttribute(clothEClass, CLOTH__SIZE);
		createEReference(clothEClass, CLOTH__MODEL);
		createEOperation(clothEClass, CLOTH___ADD_CLOTH);
		createEOperation(clothEClass, CLOTH___DELETE_CLOTH);
		createEOperation(clothEClass, CLOTH___IS_CORRECT_SIZE);

		faceEClass = createEClass(FACE);
		createEAttribute(faceEClass, FACE__EYE_COLOR);
		createEAttribute(faceEClass, FACE__TONE);
		createEAttribute(faceEClass, FACE__NAME);

		hairEClass = createEClass(HAIR);
		createEAttribute(hairEClass, HAIR__LENGTH);
		createEAttribute(hairEClass, HAIR__TYPE);
		createEAttribute(hairEClass, HAIR__NAME);

		bodyEClass = createEClass(BODY);
		createEAttribute(bodyEClass, BODY__HEIGHT);
		createEAttribute(bodyEClass, BODY__WEIGHT);
		createEAttribute(bodyEClass, BODY__NAME);

		customerEClass = createEClass(CUSTOMER);
		createEAttribute(customerEClass, CUSTOMER__NAME);
		createEAttribute(customerEClass, CUSTOMER__AGE);
		createEReference(customerEClass, CUSTOMER__MODEL);
		createEOperation(customerEClass, CUSTOMER___ADD_CUSTOMER);
		createEOperation(customerEClass, CUSTOMER___DELETE_CUSTOMER);

		shirtEClass = createEClass(SHIRT);
		createEAttribute(shirtEClass, SHIRT__SHOULDER_WIDTH);
		createEAttribute(shirtEClass, SHIRT__NECK);
		createEAttribute(shirtEClass, SHIRT__SLEEVES_LENGTH);

		pantEClass = createEClass(PANT);
		createEAttribute(pantEClass, PANT__LENGTH);
		createEAttribute(pantEClass, PANT__WAIST);

		accessoriesEClass = createEClass(ACCESSORIES);
		createEAttribute(accessoriesEClass, ACCESSORIES__ACCESSORY_ID);
		createEAttribute(accessoriesEClass, ACCESSORIES__ACCESSORY_NAME);
		createEReference(accessoriesEClass, ACCESSORIES__MODEL);
		createEOperation(accessoriesEClass, ACCESSORIES___ADD_ACCESSORY);
		createEOperation(accessoriesEClass, ACCESSORIES___DELETE_ACCESSORY);

		summerAccessoriesEClass = createEClass(SUMMER_ACCESSORIES);

		winterAccessoriesEClass = createEClass(WINTER_ACCESSORIES);

		// Create enums
		sizeEEnum = createEEnum(SIZE);
		genderEEnum = createEEnum(GENDER);
		hairLengthEEnum = createEEnum(HAIR_LENGTH);
		hairTypeEEnum = createEEnum(HAIR_TYPE);
		eyeColorEEnum = createEEnum(EYE_COLOR);
		skinToneEEnum = createEEnum(SKIN_TONE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		shirtEClass.getESuperTypes().add(this.getCloth());
		pantEClass.getESuperTypes().add(this.getCloth());
		summerAccessoriesEClass.getESuperTypes().add(this.getAccessories());
		winterAccessoriesEClass.getESuperTypes().add(this.getAccessories());

		// Initialize classes, features, and operations; add parameters
		initEClass(fittingRoomEClass, FittingRoom.class, "FittingRoom", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFittingRoom_Cloth(), this.getCloth(), null, "cloth", null, 0, -1, FittingRoom.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFittingRoom_Model(), this.getModel(), null, "model", null, 0, -1, FittingRoom.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFittingRoom_Customer(), this.getCustomer(), null, "customer", null, 0, -1, FittingRoom.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFittingRoom_Accessories(), this.getAccessories(), null, "accessories", null, 0, -1,
				FittingRoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_ModelID(), ecorePackage.getEString(), "modelID", null, 1, 1, Model.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Cloth(), this.getCloth(), this.getCloth_Model(), "cloth", null, 0, -1, Model.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Body(), this.getBody(), null, "body", null, 1, 1, Model.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getModel_Hair(), this.getHair(), null, "hair", null, 1, 1, Model.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getModel_Face(), this.getFace(), null, "face", null, 1, 1, Model.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getModel_Gender(), this.getGender(), "gender", null, 0, 1, Model.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Customer(), this.getCustomer(), this.getCustomer_Model(), "customer", null, 1, 1,
				Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Accessories(), this.getAccessories(), this.getAccessories_Model(), "accessories", null,
				0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getModel__AddModel(), null, "addModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getModel__DeleteModel(), null, "deleteModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(clothEClass, Cloth.class, "Cloth", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloth_ClothTitle(), ecorePackage.getEString(), "clothTitle", null, 0, 1, Cloth.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloth_Color(), ecorePackage.getEString(), "color", null, 0, 1, Cloth.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloth_Size(), this.getSize(), "size", null, 0, 1, Cloth.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloth_Model(), this.getModel(), this.getModel_Cloth(), "model", null, 1, 1, Cloth.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCloth__AddCloth(), null, "addCloth", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCloth__DeleteCloth(), null, "deleteCloth", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCloth__IsCorrectSize(), ecorePackage.getEBoolean(), "isCorrectSize", 1, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(faceEClass, Face.class, "Face", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFace_EyeColor(), this.getEyeColor(), "eyeColor", null, 0, 1, Face.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFace_Tone(), this.getSkinTone(), "tone", null, 0, 1, Face.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFace_Name(), ecorePackage.getEString(), "name", null, 0, 1, Face.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hairEClass, Hair.class, "Hair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHair_Length(), this.getHairLength(), "length", null, 0, 1, Hair.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHair_Type(), this.getHairType(), "type", null, 0, 1, Hair.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHair_Name(), ecorePackage.getEString(), "name", null, 0, 1, Hair.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bodyEClass, Body.class, "Body", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBody_Height(), ecorePackage.getEFloat(), "height", null, 1, 1, Body.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBody_Weight(), ecorePackage.getEFloat(), "weight", null, 1, 1, Body.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBody_Name(), ecorePackage.getEString(), "name", null, 0, 1, Body.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Customer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_Age(), ecorePackage.getEInt(), "age", null, 1, 1, Customer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomer_Model(), this.getModel(), this.getModel_Customer(), "model", null, 1, 1,
				Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCustomer__AddCustomer(), null, "addCustomer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCustomer__DeleteCustomer(), null, "deleteCustomer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(shirtEClass, Shirt.class, "Shirt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShirt_ShoulderWidth(), ecorePackage.getEFloat(), "shoulderWidth", "0.0", 1, 1, Shirt.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShirt_Neck(), ecorePackage.getEFloat(), "neck", null, 1, 1, Shirt.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShirt_SleevesLength(), ecorePackage.getEFloat(), "sleevesLength", null, 1, 1, Shirt.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pantEClass, Pant.class, "Pant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPant_Length(), ecorePackage.getEFloat(), "length", null, 1, 1, Pant.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPant_Waist(), ecorePackage.getEFloat(), "waist", null, 1, 1, Pant.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessoriesEClass, Accessories.class, "Accessories", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessories_AccessoryId(), ecorePackage.getEString(), "accessoryId", null, 0, 1,
				Accessories.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessories_AccessoryName(), ecorePackage.getEString(), "accessoryName", null, 0, 1,
				Accessories.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAccessories_Model(), this.getModel(), this.getModel_Accessories(), "model", null, 1, 1,
				Accessories.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAccessories__AddAccessory(), null, "addAccessory", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAccessories__DeleteAccessory(), null, "deleteAccessory", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(summerAccessoriesEClass, SummerAccessories.class, "SummerAccessories", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(winterAccessoriesEClass, WinterAccessories.class, "WinterAccessories", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(sizeEEnum, Size.class, "Size");
		addEEnumLiteral(sizeEEnum, Size.SMALL);
		addEEnumLiteral(sizeEEnum, Size.MEDIUM);
		addEEnumLiteral(sizeEEnum, Size.LARGE);
		addEEnumLiteral(sizeEEnum, Size.EXTRA_LARGE);
		addEEnumLiteral(sizeEEnum, Size.EXTRA_SMALL);
		addEEnumLiteral(sizeEEnum, Size.MEDIUM_LARGE);

		initEEnum(genderEEnum, Gender.class, "Gender");
		addEEnumLiteral(genderEEnum, Gender.MALE);
		addEEnumLiteral(genderEEnum, Gender.FEMALE);

		initEEnum(hairLengthEEnum, HairLength.class, "HairLength");
		addEEnumLiteral(hairLengthEEnum, HairLength.SHORT);
		addEEnumLiteral(hairLengthEEnum, HairLength.MEDIUM);
		addEEnumLiteral(hairLengthEEnum, HairLength.LONG);

		initEEnum(hairTypeEEnum, HairType.class, "HairType");
		addEEnumLiteral(hairTypeEEnum, HairType.CURLY);
		addEEnumLiteral(hairTypeEEnum, HairType.STRAIGHT);
		addEEnumLiteral(hairTypeEEnum, HairType.WAVY);
		addEEnumLiteral(hairTypeEEnum, HairType.FRIZZY);

		initEEnum(eyeColorEEnum, EyeColor.class, "EyeColor");
		addEEnumLiteral(eyeColorEEnum, EyeColor.LIGHT_BROWN);
		addEEnumLiteral(eyeColorEEnum, EyeColor.DARK_BROWN);
		addEEnumLiteral(eyeColorEEnum, EyeColor.BLACK);
		addEEnumLiteral(eyeColorEEnum, EyeColor.GREEN);
		addEEnumLiteral(eyeColorEEnum, EyeColor.BLUE);

		initEEnum(skinToneEEnum, SkinTone.class, "SkinTone");
		addEEnumLiteral(skinToneEEnum, SkinTone.VANLIA);
		addEEnumLiteral(skinToneEEnum, SkinTone.BEIGE);
		addEEnumLiteral(skinToneEEnum, SkinTone.ALMOND);
		addEEnumLiteral(skinToneEEnum, SkinTone.GOLDEN);
		addEEnumLiteral(skinToneEEnum, SkinTone.MOCHA);
		addEEnumLiteral(skinToneEEnum, SkinTone.TOFFEE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation(this, source, new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
						"settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validationDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" });
		addAnnotation(modelEClass, source, new String[] { "constraints", "oneShirt onePant" });
		addAnnotation(customerEClass, source, new String[] { "constraints", "suitableAge" });
		addAnnotation(shirtEClass, source, new String[] { "constraints", "oneShirt" });
		addAnnotation(pantEClass, source, new String[] { "constraints", "onePant" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(modelEClass, source, new String[] { "oneShirt", "self.cloth->oclIsTypeOf(Shirt)->size()<=1",
				"onePant", " self.cloth->oclIsTypeOf(Pant)->size()<=1" });
		addAnnotation(getCloth__IsCorrectSize(), source, new String[] { "body",
				"\n\t\t\tif(model.gender=\'Female\')\t\n\t\t\tthen \n\t\t\t    if(model.body.weight>=40 and model.body.weight<=49 and model.body.height>=134 and model.body.height<=154 and size=\'ExtraSmall\')\n\t\t\t    then true\n\t\t\t    else\n\t\t\t    if(model.body.weight>=50 and model.body.weight<=54 and model.body.height>=155 and model.body.height<=164 and size=\'Small\')\n\t\t\t    then true\n\t\t\t    else  \n\t\t\t    if(model.body.weight>=55 and model.body.weight<=64 and model.body.height>=165 and model.body.height<=174 and size=\'Medium\')\n\t\t\t    then true\n\t\t\t    else\n\t\t\t    if(model.body.weight>=65 and model.body.weight<=74 and model.body.height>=175 and model.body.height<=184 and size=\'MediumLarge\')\n\t\t\t    then true\n\t\t\t    else\n\t\t\t    if(model.body.weight>=75 and model.body.weight<=89 and model.body.height>=185 and model.body.height<=194 and size=\'Large\')\n\t\t\t    then true\n\t\t\t    else\n\t\t\t    if(model.body.weight>=90 and model.body.height>=195  and size=\'ExtraLarge\')\n\t\t\t    then true\n\t\t\t    else false\n\t\t\t    endif\n\t\t\t    endif\n\t\t\t    endif\n\t\t\t    endif\n\t\t\t    endif\n\t\t\t    endif\n\t\telse\n\t\tif(model.gender=\'Male\')\t\n\t\t\tthen \n\t\t\t    if(model.body.weight>=45 and model.body.weight<=59 and model.body.height>=150 and model.body.height<=164 and size=\'ExtraSmall\')\n\t\t\t    then true\n\t\t\t    else\n\t\t\t    if(model.body.weight>=60 and model.body.weight<=69 and model.body.height>=165 and model.body.height<=174 and size=\'Small\')\n\t\t\t    then true\n\t\t\t    else  \n\t\t\t    if(model.body.weight>=70 and model.body.weight<=79 and model.body.height>=175 and model.body.height<=184 and size=\'Medium\')\n\t\t\t    then true\n\t\t\t    else\n\t\t\t    if(model.body.weight>=80 and model.body.weight<=89 and model.body.height>=185 and model.body.height<=194 and size=\'MediumLarge\')\n\t\t\t    then true\n\t\t\t    else\n\t\t\t    if(model.body.weight>=90 and model.body.weight<=100 and model.body.height>=195 and model.body.height<=204 and size=\'Large\')\n\t\t\t    then true\n\t\t\t    else\n\t\t\t    if(model.body.weight>100 and model.body.height>=205  and size=\'ExtraLarge\')\n\t\t\t    then true\n\t\t\t    else false\n\t\t\t    endif\n\t\t\t    endif\n\t\t\t    endif\n\t\t\t    endif\n\t\t\t    endif\n\t\t\t    endif\n\t\t\telse false\n\t\t\tendif\n\t\t\tendif" });
		addAnnotation(customerEClass, source, new String[] { "suitableAge", "age >= 15" });
		addAnnotation(shirtEClass, source, new String[] { "oneShirt", "self->size()<=1" });
		addAnnotation(pantEClass, source, new String[] { "onePant", "self->size()<=1" });
	}

} //ARPackageImpl
