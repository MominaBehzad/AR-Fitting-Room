/**
 */
package aR.impl;

import aR.ARPackage;
import aR.Shirt;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shirt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aR.impl.ShirtImpl#getShoulderWidth <em>Shoulder Width</em>}</li>
 *   <li>{@link aR.impl.ShirtImpl#getNeck <em>Neck</em>}</li>
 *   <li>{@link aR.impl.ShirtImpl#getSleevesLength <em>Sleeves Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShirtImpl extends ClothImpl implements Shirt {
	/**
	 * The default value of the '{@link #getShoulderWidth() <em>Shoulder Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShoulderWidth()
	 * @generated
	 * @ordered
	 */
	protected static final float SHOULDER_WIDTH_EDEFAULT = 0.0F;
	/**
	 * The cached value of the '{@link #getShoulderWidth() <em>Shoulder Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShoulderWidth()
	 * @generated
	 * @ordered
	 */
	protected float shoulderWidth = SHOULDER_WIDTH_EDEFAULT;
	/**
	 * The default value of the '{@link #getNeck() <em>Neck</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeck()
	 * @generated
	 * @ordered
	 */
	protected static final float NECK_EDEFAULT = 0.0F;
	/**
	 * The cached value of the '{@link #getNeck() <em>Neck</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeck()
	 * @generated
	 * @ordered
	 */
	protected float neck = NECK_EDEFAULT;
	/**
	 * The default value of the '{@link #getSleevesLength() <em>Sleeves Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSleevesLength()
	 * @generated
	 * @ordered
	 */
	protected static final float SLEEVES_LENGTH_EDEFAULT = 0.0F;
	/**
	 * The cached value of the '{@link #getSleevesLength() <em>Sleeves Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSleevesLength()
	 * @generated
	 * @ordered
	 */
	protected float sleevesLength = SLEEVES_LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShirtImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ARPackage.Literals.SHIRT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getShoulderWidth() {
		return shoulderWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShoulderWidth(float newShoulderWidth) {
		float oldShoulderWidth = shoulderWidth;
		shoulderWidth = newShoulderWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ARPackage.SHIRT__SHOULDER_WIDTH, oldShoulderWidth,
					shoulderWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNeck() {
		return neck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeck(float newNeck) {
		float oldNeck = neck;
		neck = newNeck;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ARPackage.SHIRT__NECK, oldNeck, neck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSleevesLength() {
		return sleevesLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSleevesLength(float newSleevesLength) {
		float oldSleevesLength = sleevesLength;
		sleevesLength = newSleevesLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ARPackage.SHIRT__SLEEVES_LENGTH, oldSleevesLength,
					sleevesLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ARPackage.SHIRT__SHOULDER_WIDTH:
			return getShoulderWidth();
		case ARPackage.SHIRT__NECK:
			return getNeck();
		case ARPackage.SHIRT__SLEEVES_LENGTH:
			return getSleevesLength();
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
		case ARPackage.SHIRT__SHOULDER_WIDTH:
			setShoulderWidth((Float) newValue);
			return;
		case ARPackage.SHIRT__NECK:
			setNeck((Float) newValue);
			return;
		case ARPackage.SHIRT__SLEEVES_LENGTH:
			setSleevesLength((Float) newValue);
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
		case ARPackage.SHIRT__SHOULDER_WIDTH:
			setShoulderWidth(SHOULDER_WIDTH_EDEFAULT);
			return;
		case ARPackage.SHIRT__NECK:
			setNeck(NECK_EDEFAULT);
			return;
		case ARPackage.SHIRT__SLEEVES_LENGTH:
			setSleevesLength(SLEEVES_LENGTH_EDEFAULT);
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
		case ARPackage.SHIRT__SHOULDER_WIDTH:
			return shoulderWidth != SHOULDER_WIDTH_EDEFAULT;
		case ARPackage.SHIRT__NECK:
			return neck != NECK_EDEFAULT;
		case ARPackage.SHIRT__SLEEVES_LENGTH:
			return sleevesLength != SLEEVES_LENGTH_EDEFAULT;
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
		result.append(" (shoulderWidth: ");
		result.append(shoulderWidth);
		result.append(", neck: ");
		result.append(neck);
		result.append(", sleevesLength: ");
		result.append(sleevesLength);
		result.append(')');
		return result.toString();
	}

} //ShirtImpl
