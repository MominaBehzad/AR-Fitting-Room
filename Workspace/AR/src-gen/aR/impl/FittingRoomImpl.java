/**
 */
package aR.impl;

import aR.ARPackage;
import aR.Accessories;
import aR.Cloth;
import aR.Customer;
import aR.FittingRoom;
import aR.Model;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fitting Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aR.impl.FittingRoomImpl#getCloth <em>Cloth</em>}</li>
 *   <li>{@link aR.impl.FittingRoomImpl#getModel <em>Model</em>}</li>
 *   <li>{@link aR.impl.FittingRoomImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link aR.impl.FittingRoomImpl#getAccessories <em>Accessories</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FittingRoomImpl extends MinimalEObjectImpl.Container implements FittingRoom {
	/**
	 * The cached value of the '{@link #getCloth() <em>Cloth</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloth()
	 * @generated
	 * @ordered
	 */
	protected EList<Cloth> cloth;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> model;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected EList<Customer> customer;

	/**
	 * The cached value of the '{@link #getAccessories() <em>Accessories</em>}' containment reference list.
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
	protected FittingRoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ARPackage.Literals.FITTING_ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cloth> getCloth() {
		if (cloth == null) {
			cloth = new EObjectContainmentEList<Cloth>(Cloth.class, this, ARPackage.FITTING_ROOM__CLOTH);
		}
		return cloth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Model> getModel() {
		if (model == null) {
			model = new EObjectContainmentEList<Model>(Model.class, this, ARPackage.FITTING_ROOM__MODEL);
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Customer> getCustomer() {
		if (customer == null) {
			customer = new EObjectContainmentEList<Customer>(Customer.class, this, ARPackage.FITTING_ROOM__CUSTOMER);
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Accessories> getAccessories() {
		if (accessories == null) {
			accessories = new EObjectContainmentEList<Accessories>(Accessories.class, this,
					ARPackage.FITTING_ROOM__ACCESSORIES);
		}
		return accessories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ARPackage.FITTING_ROOM__CLOTH:
			return ((InternalEList<?>) getCloth()).basicRemove(otherEnd, msgs);
		case ARPackage.FITTING_ROOM__MODEL:
			return ((InternalEList<?>) getModel()).basicRemove(otherEnd, msgs);
		case ARPackage.FITTING_ROOM__CUSTOMER:
			return ((InternalEList<?>) getCustomer()).basicRemove(otherEnd, msgs);
		case ARPackage.FITTING_ROOM__ACCESSORIES:
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
		case ARPackage.FITTING_ROOM__CLOTH:
			return getCloth();
		case ARPackage.FITTING_ROOM__MODEL:
			return getModel();
		case ARPackage.FITTING_ROOM__CUSTOMER:
			return getCustomer();
		case ARPackage.FITTING_ROOM__ACCESSORIES:
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
		case ARPackage.FITTING_ROOM__CLOTH:
			getCloth().clear();
			getCloth().addAll((Collection<? extends Cloth>) newValue);
			return;
		case ARPackage.FITTING_ROOM__MODEL:
			getModel().clear();
			getModel().addAll((Collection<? extends Model>) newValue);
			return;
		case ARPackage.FITTING_ROOM__CUSTOMER:
			getCustomer().clear();
			getCustomer().addAll((Collection<? extends Customer>) newValue);
			return;
		case ARPackage.FITTING_ROOM__ACCESSORIES:
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
		case ARPackage.FITTING_ROOM__CLOTH:
			getCloth().clear();
			return;
		case ARPackage.FITTING_ROOM__MODEL:
			getModel().clear();
			return;
		case ARPackage.FITTING_ROOM__CUSTOMER:
			getCustomer().clear();
			return;
		case ARPackage.FITTING_ROOM__ACCESSORIES:
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
		case ARPackage.FITTING_ROOM__CLOTH:
			return cloth != null && !cloth.isEmpty();
		case ARPackage.FITTING_ROOM__MODEL:
			return model != null && !model.isEmpty();
		case ARPackage.FITTING_ROOM__CUSTOMER:
			return customer != null && !customer.isEmpty();
		case ARPackage.FITTING_ROOM__ACCESSORIES:
			return accessories != null && !accessories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FittingRoomImpl
