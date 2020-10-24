/**
 */
package turtle.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import turtle.Choreography;
import turtle.Color;
import turtle.Farm;
import turtle.Stage;
import turtle.TurtlePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link turtle.impl.StageImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link turtle.impl.StageImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link turtle.impl.StageImpl#getChoreographies <em>Choreographies</em>}</li>
 *   <li>{@link turtle.impl.StageImpl#getFarms <em>Farms</em>}</li>
 *   <li>{@link turtle.impl.StageImpl#getBackgroundColor <em>Background Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StageImpl extends ColouredEntityImpl implements Stage {
	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChoreographies() <em>Choreographies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoreographies()
	 * @generated
	 * @ordered
	 */
	protected EList<Choreography> choreographies;

	/**
	 * The cached value of the '{@link #getFarms() <em>Farms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFarms()
	 * @generated
	 * @ordered
	 */
	protected EList<Farm> farms;

	/**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected Color backgroundColor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TurtlePackage.Literals.STAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlePackage.STAGE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlePackage.STAGE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Choreography> getChoreographies() {
		if (choreographies == null) {
			choreographies = new EObjectContainmentWithInverseEList<Choreography>(Choreography.class, this, TurtlePackage.STAGE__CHOREOGRAPHIES, TurtlePackage.CHOREOGRAPHY__STAGE);
		}
		return choreographies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Farm> getFarms() {
		if (farms == null) {
			farms = new EObjectContainmentWithInverseEList<Farm>(Farm.class, this, TurtlePackage.STAGE__FARMS, TurtlePackage.FARM__STAGES);
		}
		return farms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getBackgroundColor() {
		if (backgroundColor != null && backgroundColor.eIsProxy()) {
			InternalEObject oldBackgroundColor = (InternalEObject)backgroundColor;
			backgroundColor = (Color)eResolveProxy(oldBackgroundColor);
			if (backgroundColor != oldBackgroundColor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TurtlePackage.STAGE__BACKGROUND_COLOR, oldBackgroundColor, backgroundColor));
			}
		}
		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color basicGetBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundColor(Color newBackgroundColor) {
		Color oldBackgroundColor = backgroundColor;
		backgroundColor = newBackgroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlePackage.STAGE__BACKGROUND_COLOR, oldBackgroundColor, backgroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String display() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.toString()).
		append("\n").
		append("Choreographies: ").
		append(choreographies.toString()).
		append("\n").
		append("Farms: ").
		append(farms.toString());
		return sb.toString();
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
			case TurtlePackage.STAGE__CHOREOGRAPHIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChoreographies()).basicAdd(otherEnd, msgs);
			case TurtlePackage.STAGE__FARMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFarms()).basicAdd(otherEnd, msgs);
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
			case TurtlePackage.STAGE__CHOREOGRAPHIES:
				return ((InternalEList<?>)getChoreographies()).basicRemove(otherEnd, msgs);
			case TurtlePackage.STAGE__FARMS:
				return ((InternalEList<?>)getFarms()).basicRemove(otherEnd, msgs);
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
			case TurtlePackage.STAGE__HEIGHT:
				return getHeight();
			case TurtlePackage.STAGE__WIDTH:
				return getWidth();
			case TurtlePackage.STAGE__CHOREOGRAPHIES:
				return getChoreographies();
			case TurtlePackage.STAGE__FARMS:
				return getFarms();
			case TurtlePackage.STAGE__BACKGROUND_COLOR:
				if (resolve) return getBackgroundColor();
				return basicGetBackgroundColor();
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
			case TurtlePackage.STAGE__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case TurtlePackage.STAGE__WIDTH:
				setWidth((Integer)newValue);
				return;
			case TurtlePackage.STAGE__CHOREOGRAPHIES:
				getChoreographies().clear();
				getChoreographies().addAll((Collection<? extends Choreography>)newValue);
				return;
			case TurtlePackage.STAGE__FARMS:
				getFarms().clear();
				getFarms().addAll((Collection<? extends Farm>)newValue);
				return;
			case TurtlePackage.STAGE__BACKGROUND_COLOR:
				setBackgroundColor((Color)newValue);
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
			case TurtlePackage.STAGE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case TurtlePackage.STAGE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case TurtlePackage.STAGE__CHOREOGRAPHIES:
				getChoreographies().clear();
				return;
			case TurtlePackage.STAGE__FARMS:
				getFarms().clear();
				return;
			case TurtlePackage.STAGE__BACKGROUND_COLOR:
				setBackgroundColor((Color)null);
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
			case TurtlePackage.STAGE__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case TurtlePackage.STAGE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case TurtlePackage.STAGE__CHOREOGRAPHIES:
				return choreographies != null && !choreographies.isEmpty();
			case TurtlePackage.STAGE__FARMS:
				return farms != null && !farms.isEmpty();
			case TurtlePackage.STAGE__BACKGROUND_COLOR:
				return backgroundColor != null;
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
			case TurtlePackage.STAGE___DISPLAY:
				return display();
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (height: ");
		result.append(height);
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //StageImpl
