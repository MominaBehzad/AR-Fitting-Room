/**
 */
package aR.util;

import aR.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see aR.ARPackage
 * @generated
 */
public class ARValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ARValidator INSTANCE = new ARValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "aR";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return ARPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case ARPackage.FITTING_ROOM:
			return validateFittingRoom((FittingRoom) value, diagnostics, context);
		case ARPackage.MODEL:
			return validateModel((Model) value, diagnostics, context);
		case ARPackage.CLOTH:
			return validateCloth((Cloth) value, diagnostics, context);
		case ARPackage.FACE:
			return validateFace((Face) value, diagnostics, context);
		case ARPackage.HAIR:
			return validateHair((Hair) value, diagnostics, context);
		case ARPackage.BODY:
			return validateBody((Body) value, diagnostics, context);
		case ARPackage.CUSTOMER:
			return validateCustomer((Customer) value, diagnostics, context);
		case ARPackage.SHIRT:
			return validateShirt((Shirt) value, diagnostics, context);
		case ARPackage.PANT:
			return validatePant((Pant) value, diagnostics, context);
		case ARPackage.ACCESSORIES:
			return validateAccessories((Accessories) value, diagnostics, context);
		case ARPackage.SUMMER_ACCESSORIES:
			return validateSummerAccessories((SummerAccessories) value, diagnostics, context);
		case ARPackage.WINTER_ACCESSORIES:
			return validateWinterAccessories((WinterAccessories) value, diagnostics, context);
		case ARPackage.SIZE:
			return validateSize((Size) value, diagnostics, context);
		case ARPackage.GENDER:
			return validateGender((Gender) value, diagnostics, context);
		case ARPackage.HAIR_LENGTH:
			return validateHairLength((HairLength) value, diagnostics, context);
		case ARPackage.HAIR_TYPE:
			return validateHairType((HairType) value, diagnostics, context);
		case ARPackage.EYE_COLOR:
			return validateEyeColor((EyeColor) value, diagnostics, context);
		case ARPackage.SKIN_TONE:
			return validateSkinTone((SkinTone) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFittingRoom(FittingRoom fittingRoom, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fittingRoom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(model, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateModel_oneShirt(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateModel_onePant(model, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the oneShirt constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MODEL__ONE_SHIRT__EEXPRESSION = "self.cloth->oclIsTypeOf(Shirt)->size()<=1";

	/**
	 * Validates the oneShirt constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel_oneShirt(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(ARPackage.Literals.MODEL, model, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "oneShirt", MODEL__ONE_SHIRT__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the onePant constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MODEL__ONE_PANT__EEXPRESSION = " self.cloth->oclIsTypeOf(Pant)->size()<=1";

	/**
	 * Validates the onePant constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel_onePant(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(ARPackage.Literals.MODEL, model, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "onePant", MODEL__ONE_PANT__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloth(Cloth cloth, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cloth, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFace(Face face, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(face, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHair(Hair hair, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hair, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBody(Body body, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(body, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomer(Customer customer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(customer, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCustomer_suitableAge(customer, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the suitableAge constraint of '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CUSTOMER__SUITABLE_AGE__EEXPRESSION = "age >= 15";

	/**
	 * Validates the suitableAge constraint of '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomer_suitableAge(Customer customer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(ARPackage.Literals.CUSTOMER, customer, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "suitableAge", CUSTOMER__SUITABLE_AGE__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShirt(Shirt shirt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(shirt, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(shirt, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(shirt, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(shirt, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(shirt, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(shirt, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(shirt, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(shirt, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(shirt, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateShirt_oneShirt(shirt, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the oneShirt constraint of '<em>Shirt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SHIRT__ONE_SHIRT__EEXPRESSION = "self->size()<=1";

	/**
	 * Validates the oneShirt constraint of '<em>Shirt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShirt_oneShirt(Shirt shirt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(ARPackage.Literals.SHIRT, shirt, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "oneShirt", SHIRT__ONE_SHIRT__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePant(Pant pant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pant, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(pant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(pant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(pant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(pant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(pant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(pant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(pant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(pant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePant_onePant(pant, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the onePant constraint of '<em>Pant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PANT__ONE_PANT__EEXPRESSION = "self->size()<=1";

	/**
	 * Validates the onePant constraint of '<em>Pant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePant_onePant(Pant pant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(ARPackage.Literals.PANT, pant, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "onePant", PANT__ONE_PANT__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessories(Accessories accessories, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(accessories, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSummerAccessories(SummerAccessories summerAccessories, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(summerAccessories, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWinterAccessories(WinterAccessories winterAccessories, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(winterAccessories, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSize(Size size, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGender(Gender gender, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHairLength(HairLength hairLength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHairType(HairType hairType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEyeColor(EyeColor eyeColor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSkinTone(SkinTone skinTone, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ARValidator
