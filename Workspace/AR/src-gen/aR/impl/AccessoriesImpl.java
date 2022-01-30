/**
 */
package aR.impl;

import aR.ARPackage;
import aR.Accessories;
import aR.Model;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accessories</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aR.impl.AccessoriesImpl#getAccessoryId <em>Accessory Id</em>}</li>
 *   <li>{@link aR.impl.AccessoriesImpl#getAccessoryName <em>Accessory Name</em>}</li>
 *   <li>{@link aR.impl.AccessoriesImpl#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AccessoriesImpl extends MinimalEObjectImpl.Container implements Accessories {
	/**
	 * The default value of the '{@link #getAccessoryId() <em>Accessory Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessoryId()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESSORY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessoryId() <em>Accessory Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessoryId()
	 * @generated
	 * @ordered
	 */
	protected String accessoryId = ACCESSORY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessoryName() <em>Accessory Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessoryName()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESSORY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessoryName() <em>Accessory Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessoryName()
	 * @generated
	 * @ordered
	 */
	protected String accessoryName = ACCESSORY_NAME_EDEFAULT;

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
	protected AccessoriesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ARPackage.Literals.ACCESSORIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessoryId() {
		return accessoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessoryId(String newAccessoryId) {
		String oldAccessoryId = accessoryId;
		accessoryId = newAccessoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ARPackage.ACCESSORIES__ACCESSORY_ID, oldAccessoryId,
					accessoryId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessoryName() {
		return accessoryName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessoryName(String newAccessoryName) {
		String oldAccessoryName = accessoryName;
		accessoryName = newAccessoryName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ARPackage.ACCESSORIES__ACCESSORY_NAME,
					oldAccessoryName, accessoryName));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ARPackage.ACCESSORIES__MODEL, oldModel,
							model));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ARPackage.ACCESSORIES__MODEL,
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
				msgs = ((InternalEObject) model).eInverseRemove(this, ARPackage.MODEL__ACCESSORIES, Model.class, msgs);
			if (newModel != null)
				msgs = ((InternalEObject) newModel).eInverseAdd(this, ARPackage.MODEL__ACCESSORIES, Model.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ARPackage.ACCESSORIES__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAccessory() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteAccessory() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ARPackage.ACCESSORIES__MODEL:
			if (model != null)
				msgs = ((InternalEObject) model).eInverseRemove(this, ARPackage.MODEL__ACCESSORIES, Model.class, msgs);
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
		case ARPackage.ACCESSORIES__MODEL:
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
		case ARPackage.ACCESSORIES__ACCESSORY_ID:
			return getAccessoryId();
		case ARPackage.ACCESSORIES__ACCESSORY_NAME:
			return getAccessoryName();
		case ARPackage.ACCESSORIES__MODEL:
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
		case ARPackage.ACCESSORIES__ACCESSORY_ID:
			setAccessoryId((String) newValue);
			return;
		case ARPackage.ACCESSORIES__ACCESSORY_NAME:
			setAccessoryName((String) newValue);
			return;
		case ARPackage.ACCESSORIES__MODEL:
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
		case ARPackage.ACCESSORIES__ACCESSORY_ID:
			setAccessoryId(ACCESSORY_ID_EDEFAULT);
			return;
		case ARPackage.ACCESSORIES__ACCESSORY_NAME:
			setAccessoryName(ACCESSORY_NAME_EDEFAULT);
			return;
		case ARPackage.ACCESSORIES__MODEL:
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
		case ARPackage.ACCESSORIES__ACCESSORY_ID:
			return ACCESSORY_ID_EDEFAULT == null ? accessoryId != null : !ACCESSORY_ID_EDEFAULT.equals(accessoryId);
		case ARPackage.ACCESSORIES__ACCESSORY_NAME:
			return ACCESSORY_NAME_EDEFAULT == null ? accessoryName != null
					: !ACCESSORY_NAME_EDEFAULT.equals(accessoryName);
		case ARPackage.ACCESSORIES__MODEL:
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
		case ARPackage.ACCESSORIES___ADD_ACCESSORY:
			addAccessory();
			return null;
		case ARPackage.ACCESSORIES___DELETE_ACCESSORY:
			deleteAccessory();
			return null;
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
		result.append(" (accessoryId: ");
		result.append(accessoryId);
		result.append(", accessoryName: ");
		result.append(accessoryName);
		result.append(')');
		return result.toString();
	}

} //AccessoriesImpl
