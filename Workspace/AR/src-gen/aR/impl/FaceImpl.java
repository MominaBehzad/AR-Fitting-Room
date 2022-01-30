/**
 */
package aR.impl;

import aR.ARPackage;
import aR.EyeColor;
import aR.Face;
import aR.SkinTone;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Face</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aR.impl.FaceImpl#getEyeColor <em>Eye Color</em>}</li>
 *   <li>{@link aR.impl.FaceImpl#getTone <em>Tone</em>}</li>
 *   <li>{@link aR.impl.FaceImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FaceImpl extends MinimalEObjectImpl.Container implements Face {
	/**
	 * The default value of the '{@link #getEyeColor() <em>Eye Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEyeColor()
	 * @generated
	 * @ordered
	 */
	protected static final EyeColor EYE_COLOR_EDEFAULT = EyeColor.LIGHT_BROWN;

	/**
	 * The cached value of the '{@link #getEyeColor() <em>Eye Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEyeColor()
	 * @generated
	 * @ordered
	 */
	protected EyeColor eyeColor = EYE_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTone() <em>Tone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTone()
	 * @generated
	 * @ordered
	 */
	protected static final SkinTone TONE_EDEFAULT = SkinTone.VANLIA;

	/**
	 * The cached value of the '{@link #getTone() <em>Tone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTone()
	 * @generated
	 * @ordered
	 */
	protected SkinTone tone = TONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ARPackage.Literals.FACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EyeColor getEyeColor() {
		return eyeColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEyeColor(EyeColor newEyeColor) {
		EyeColor oldEyeColor = eyeColor;
		eyeColor = newEyeColor == null ? EYE_COLOR_EDEFAULT : newEyeColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ARPackage.FACE__EYE_COLOR, oldEyeColor, eyeColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkinTone getTone() {
		return tone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTone(SkinTone newTone) {
		SkinTone oldTone = tone;
		tone = newTone == null ? TONE_EDEFAULT : newTone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ARPackage.FACE__TONE, oldTone, tone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ARPackage.FACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ARPackage.FACE__EYE_COLOR:
			return getEyeColor();
		case ARPackage.FACE__TONE:
			return getTone();
		case ARPackage.FACE__NAME:
			return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ARPackage.FACE__EYE_COLOR:
			setEyeColor((EyeColor) newValue);
			return;
		case ARPackage.FACE__TONE:
			setTone((SkinTone) newValue);
			return;
		case ARPackage.FACE__NAME:
			setName((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ARPackage.FACE__EYE_COLOR:
			setEyeColor(EYE_COLOR_EDEFAULT);
			return;
		case ARPackage.FACE__TONE:
			setTone(TONE_EDEFAULT);
			return;
		case ARPackage.FACE__NAME:
			setName(NAME_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ARPackage.FACE__EYE_COLOR:
			return eyeColor != EYE_COLOR_EDEFAULT;
		case ARPackage.FACE__TONE:
			return tone != TONE_EDEFAULT;
		case ARPackage.FACE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (eyeColor: ");
		result.append(eyeColor);
		result.append(", tone: ");
		result.append(tone);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FaceImpl
