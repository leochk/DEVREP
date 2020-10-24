/**
 */
package turtle;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Pen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link turtle.SetPen#getState <em>State</em>}</li>
 * </ul>
 *
 * @see turtle.TurtlePackage#getSetPen()
 * @model
 * @generated
 */
public interface SetPen extends Action {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link turtle.PenState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see turtle.PenState
	 * @see #setState(PenState)
	 * @see turtle.TurtlePackage#getSetPen_State()
	 * @model
	 * @generated
	 */
	PenState getState();

	/**
	 * Sets the value of the '{@link turtle.SetPen#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see turtle.PenState
	 * @see #getState()
	 * @generated
	 */
	void setState(PenState value);

} // SetPen
