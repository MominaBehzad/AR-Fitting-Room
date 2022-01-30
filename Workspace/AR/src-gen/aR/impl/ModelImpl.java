/**
 */
package aR.impl;

import aR.ARPackage;
import aR.Accessories;
import aR.Body;
import aR.Cloth;
import aR.Customer;
import aR.Face;
import aR.Gender;
import aR.Hair;
import aR.Model;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aR.impl.ModelImpl#getModelID <em>Model ID</em>}</li>
 *   <li>{@link aR.impl.ModelImpl#getCloth <em>Cloth</em>}</li>
 *   <li>{@link aR.impl.ModelImpl#getBody <em>Body</em>}</li>
 *   <li>{@link aR.impl.ModelImpl#getHair <em>Hair</em>}</li>
 *   <li>{@link aR.impl.ModelImpl#getFace <em>Face</em>}</li>
 *   <li>{@link aR.impl.ModelImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link aR.impl.ModelImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link aR.impl.ModelImpl#getAccessories <em>Accessories</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The default value of the '{@link #getModelID() <em>Model ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelID()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelID() <em>Model ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelID()
	 * @generated
	 * @ordered
	 */
	protected String modelID = MODEL_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCloth() <em>Cloth</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloth()
	 * @generated
	 * @ordered
	 */
	protected EList<Cloth> cloth;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected Body body;

	/**
	 * The cached value of the '{@link #getHair() <em>Hair</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHair()
	 * @generated
	 * @ordered
	 */
	protected Hair hair;

	/**
	 * The cached value of the '{@link #getFace() <em>Face</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFace()
	 * @generated
	 * @ordered
	 */
	protected Face face;

	/**
	 * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected static final Gender GENDER_EDEFAULT = Gender.MALE;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected Gender gender = GENDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

	/**
	 * The cached value of the '{@link #getAccessories() <em>Accessories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessories()
	 * @generated
	 * @ordered
	 */
	protected EList<Accessories> accessories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ARPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelID() {
		return modelID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelID(String newModelID) {
		String oldModelID = modelID;
		modelID = newModelID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ARPackage.MODEL__MODEL_ID, oldModelID, modelID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cloth> getCloth() {
		if (cloth == null) {
			cloth = new EObjectWithInverseResolvingEList<Cloth>(Cloth.class, this, ARPackage.MODEL__CLOTH,
					ARPackage.CLOTH__MODEL);
		}
		return cloth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Body getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Body newBody, NotificationChain msgs) {
		Body oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ARPackage.MODEL__BODY,
					oldBody, newBody);
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
	public void setBody(Body newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject) body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ARPackage.MODEL__BODY,
						null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject) newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ARPackage.MODEL__BODY,
						null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ARPackage.MODEL__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hair getHair() {
		return hair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHair(Hair newHair, NotificationChain msgs) {
		Hair oldHair = hair;
		hair = newHair;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ARPackage.MODEL__HAIR,
					oldHair, newHair);
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
	public void setHair(Hair newHair) {
		if (newHair != hair) {
			NotificationChain msgs = null;
			if (hair != null)
				msgs = ((InternalEObject) hair).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ARPackage.MODEL__HAIR,
						null, msgs);
			if (newHair != null)
				msgs = ((InternalEObject) newHair).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ARPackage.MODEL__HAIR,
						null, msgs);
			msgs = basicSetHair(newHair, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ARPackage.MODEL__HAIR, newHair, newHair));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Face getFace() {
		return face;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFace(Face newFace, NotificationChain msgs) {
		Face oldFace = face;
		face = newFace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ARPackage.MODEL__FACE,
					oldFace, newFace);
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
	public void setFace(Face newFace) {
		if (newFace != face) {
			NotificationChain msgs = null;
			if (face != null)
				msgs = ((InternalEObject) face).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ARPackage.MODEL__FACE,
						null, msgs);
			if (newFace != null)
				msgs = ((InternalEObject) newFace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ARPackage.MODEL__FACE,
						null, msgs);
			msgs = basicSetFace(newFace, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ARPackage.MODEL__FACE, newFace, newFace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGender(Gender newGender) {
		Gender oldGender = gender;
		gender = newGender == null ? GENDER_EDEFAULT : newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ARPackage.MODEL__GENDER, oldGender, gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCustomer() {
		if (customer != null && customer.eIsProxy()) {
			InternalEObject oldCustomer = (InternalEObject) customer;
			customer = (Customer) eResolveProxy(oldCustomer);
			if (customer != oldCustomer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ARPackage.MODEL__CUSTOMER, oldCustomer,
							customer));
			}
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomer(Customer newCustomer, NotificationChain msgs) {
		Customer oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ARPackage.MODEL__CUSTOMER,
					oldCustomer, newCustomer);
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
	public void setCustomer(Customer newCustomer) {
		if (newCustomer != customer) {
			NotificationChain msgs = null;
			if (customer != null)
				msgs = ((InternalEObject) customer).eInverseRemove(this, ARPackage.CUSTOMER__MODEL, Customer.class,
						msgs);
			if (newCustomer != null)
				msgs = ((InternalEObject) newCustomer).eInverseAdd(this, ARPackage.CUSTOMER__MODEL, Customer.class,
						msgs);
			msgs = basicSetCustomer(newCustomer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ARPackage.MODEL__CUSTOMER, newCustomer, newCustomer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Accessories> getAccessories() {
		if (accessories == null) {
			accessories = new EObjectWithInverseResolvingEList<Accessories>(Accessories.class, this,
					ARPackage.MODEL__ACCESSORIES, ARPackage.ACCESSORIES__MODEL);
		}
		return accessories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addModel() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteModel() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ARPackage.MODEL__CLOTH:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCloth()).basicAdd(otherEnd, msgs);
		case ARPackage.MODEL__CUSTOMER:
			if (customer != null)
				msgs = ((InternalEObject) customer).eInverseRemove(this, ARPackage.CUSTOMER__MODEL, Customer.class,
						msgs);
			return basicSetCustomer((Customer) otherEnd, msgs);
		case ARPackage.MODEL__ACCESSORIES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAccessories()).basicAdd(otherEnd, msgs);
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
		case ARPackage.MODEL__CLOTH:
			return ((InternalEList<?>) getCloth()).basicRemove(otherEnd, msgs);
		case ARPackage.MODEL__BODY:
			return basicSetBody(null, msgs);
		case ARPackage.MODEL__HAIR:
			return basicSetHair(null, msgs);
		case ARPackage.MODEL__FACE:
			return basicSetFace(null, msgs);
		case ARPackage.MODEL__CUSTOMER:
			return basicSetCustomer(null, msgs);
		case ARPackage.MODEL__ACCESSORIES:
			return ((InternalEList<?>) getAccessories()).basicRemove(otherEnd, msgs);
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
		case ARPackage.MODEL__MODEL_ID:
			return getModelID();
		case ARPackage.MODEL__CLOTH:
			return getCloth();
		case ARPackage.MODEL__BODY:
			return getBody();
		case ARPackage.MODEL__HAIR:
			return getHair();
		case ARPackage.MODEL__FACE:
			return getFace();
		case ARPackage.MODEL__GENDER:
			return getGender();
		case ARPackage.MODEL__CUSTOMER:
			if (resolve)
				return getCustomer();
			return basicGetCustomer();
		case ARPackage.MODEL__ACCESSORIES:
			return getAccessories();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ARPackage.MODEL__MODEL_ID:
			setModelID((String) newValue);
			return;
		case ARPackage.MODEL__CLOTH:
			getCloth().clear();
			getCloth().addAll((Collection<? extends Cloth>) newValue);
			return;
		case ARPackage.MODEL__BODY:
			setBody((Body) newValue);
			return;
		case ARPackage.MODEL__HAIR:
			setHair((Hair) newValue);
			return;
		case ARPackage.MODEL__FACE:
			setFace((Face) newValue);
			return;
		case ARPackage.MODEL__GENDER:
			setGender((Gender) newValue);
			return;
		case ARPackage.MODEL__CUSTOMER:
			setCustomer((Customer) newValue);
			return;
		case ARPackage.MODEL__ACCESSORIES:
			getAccessories().clear();
			getAccessories().addAll((Collection<? extends Accessories>) newValue);
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
		case ARPackage.MODEL__MODEL_ID:
			setModelID(MODEL_ID_EDEFAULT);
			return;
		case ARPackage.MODEL__CLOTH:
			getCloth().clear();
			return;
		case ARPackage.MODEL__BODY:
			setBody((Body) null);
			return;
		case ARPackage.MODEL__HAIR:
			setHair((Hair) null);
			return;
		case ARPackage.MODEL__FACE:
			setFace((Face) null);
			return;
		case ARPackage.MODEL__GENDER:
			setGender(GENDER_EDEFAULT);
			return;
		case ARPackage.MODEL__CUSTOMER:
			setCustomer((Customer) null);
			return;
		case ARPackage.MODEL__ACCESSORIES:
			getAccessories().clear();
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
		case ARPackage.MODEL__MODEL_ID:
			return MODEL_ID_EDEFAULT == null ? modelID != null : !MODEL_ID_EDEFAULT.equals(modelID);
		case ARPackage.MODEL__CLOTH:
			return cloth != null && !cloth.isEmpty();
		case ARPackage.MODEL__BODY:
			return body != null;
		case ARPackage.MODEL__HAIR:
			return hair != null;
		case ARPackage.MODEL__FACE:
			return face != null;
		case ARPackage.MODEL__GENDER:
			return gender != GENDER_EDEFAULT;
		case ARPackage.MODEL__CUSTOMER:
			return customer != null;
		case ARPackage.MODEL__ACCESSORIES:
			return accessories != null && !accessories.isEmpty();
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
		case ARPackage.MODEL___ADD_MODEL:
			addModel();
			return null;
		case ARPackage.MODEL___DELETE_MODEL:
			deleteModel();
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
		result.append(" (modelID: ");
		result.append(modelID);
		result.append(", gender: ");
		result.append(gender);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
