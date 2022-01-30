/**
 */
package aR.impl;

import aR.ARPackage;
import aR.Cloth;
import aR.Model;
import aR.Size;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloth</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aR.impl.ClothImpl#getClothTitle <em>Cloth Title</em>}</li>
 *   <li>{@link aR.impl.ClothImpl#getColor <em>Color</em>}</li>
 *   <li>{@link aR.impl.ClothImpl#getSize <em>Size</em>}</li>
 *   <li>{@link aR.impl.ClothImpl#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ClothImpl extends MinimalEObjectImpl.Container implements Cloth {
	/**
	 * The default value of the '{@link #getClothTitle() <em>Cloth Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClothTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOTH_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClothTitle() <em>Cloth Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClothTitle()
	 * @generated
	 * @ordered
	 */
	protected String clothTitle = CLOTH_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final Size SIZE_EDEFAULT = Size.SMALL;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Size size = SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Model model;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClothImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ARPackage.Literals.CLOTH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClothTitle() {
		return clothTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClothTitle(String newClothTitle) {
		String oldClothTitle = clothTitle;
		clothTitle = newClothTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ARPackage.CLOTH__CLOTH_TITLE, oldClothTitle,
					clothTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ARPackage.CLOTH__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Size newSize) {
		Size oldSize = size;
		size = newSize == null ? SIZE_EDEFAULT : newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ARPackage.CLOTH__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject) model;
			model = (Model) eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ARPackage.CLOTH__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(Model newModel, NotificationChain msgs) {
		Model oldModel = model;
		model = newModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ARPackage.CLOTH__MODEL,
					oldModel, newModel);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Model newModel) {
		if (newModel != model) {
			NotificationChain msgs = null;
			if (model != null)
				msgs = ((InternalEObject) model).eInverseRemove(this, ARPackage.MODEL__CLOTH, Model.class, msgs);
			if (newModel != null)
				msgs = ((InternalEObject) newModel).eInverseAdd(this, ARPackage.MODEL__CLOTH, Model.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ARPackage.CLOTH__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addCloth() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteCloth() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached invocation delegate for the '{@link #isCorrectSize() <em>Is Correct Size</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCorrectSize()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_CORRECT_SIZE__EINVOCATION_DELEGATE = ((EOperation.Internal) ARPackage.Literals.CLOTH___IS_CORRECT_SIZE)
			.getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCorrectSize() {
		try {
			return (Boolean) IS_CORRECT_SIZE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		} catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ARPackage.CLOTH__MODEL:
			if (model != null)
				msgs = ((InternalEObject) model).eInverseRemove(this, ARPackage.MODEL__CLOTH, Model.class, msgs);
			return basicSetModel((Model) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ARPackage.CLOTH__MODEL:
			return basicSetModel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ARPackage.CLOTH__CLOTH_TITLE:
			return getClothTitle();
		case ARPackage.CLOTH__COLOR:
			return getColor();
		case ARPackage.CLOTH__SIZE:
			return getSize();
		case ARPackage.CLOTH__MODEL:
			if (resolve)
				return getModel();
			return basicGetModel();
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
		case ARPackage.CLOTH__CLOTH_TITLE:
			setClothTitle((String) newValue);
			return;
		case ARPackage.CLOTH__COLOR:
			setColor((String) newValue);
			return;
		case ARPackage.CLOTH__SIZE:
			setSize((Size) newValue);
			return;
		case ARPackage.CLOTH__MODEL:
			setModel((Model) newValue);
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
		case ARPackage.CLOTH__CLOTH_TITLE:
			setClothTitle(CLOTH_TITLE_EDEFAULT);
			return;
		case ARPackage.CLOTH__COLOR:
			setColor(COLOR_EDEFAULT);
			return;
		case ARPackage.CLOTH__SIZE:
			setSize(SIZE_EDEFAULT);
			return;
		case ARPackage.CLOTH__MODEL:
			setModel((Model) null);
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
		case ARPackage.CLOTH__CLOTH_TITLE:
			return CLOTH_TITLE_EDEFAULT == null ? clothTitle != null : !CLOTH_TITLE_EDEFAULT.equals(clothTitle);
		case ARPackage.CLOTH__COLOR:
			return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
		case ARPackage.CLOTH__SIZE:
			return size != SIZE_EDEFAULT;
		case ARPackage.CLOTH__MODEL:
			return model != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case ARPackage.CLOTH___ADD_CLOTH:
			addCloth();
			return null;
		case ARPackage.CLOTH___DELETE_CLOTH:
			deleteCloth();
			return null;
		case ARPackage.CLOTH___IS_CORRECT_SIZE:
			return isCorrectSize();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (clothTitle: ");
		result.append(clothTitle);
		result.append(", color: ");
		result.append(color);
		result.append(", size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //ClothImpl
