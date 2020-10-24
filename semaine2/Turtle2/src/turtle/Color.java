/**
 */
package turtle;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link turtle.Color#getRed <em>Red</em>}</li>
 *   <li>{@link turtle.Color#getBlue <em>Blue</em>}</li>
 *   <li>{@link turtle.Color#getGreen <em>Green</em>}</li>
 *   <li>{@link turtle.Color#getAlpha <em>Alpha</em>}</li>
 * </ul>
 *
 * @see turtle.TurtlePackage#getColor()
 * @model
 * @generated
 */
public interface Color extends EObject {
	/**
	 * Returns the value of the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red</em>' attribute.
	 * @see #setRed(byte)
	 * @see turtle.TurtlePackage#getColor_Red()
	 * @model required="true"
	 * @generated
	 */
	byte getRed();

	/**
	 * Sets the value of the '{@link turtle.Color#getRed <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red</em>' attribute.
	 * @see #getRed()
	 * @generated
	 */
	void setRed(byte value);

	/**
	 * Returns the value of the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blue</em>' attribute.
	 * @see #setBlue(byte)
	 * @see turtle.TurtlePackage#getColor_Blue()
	 * @model required="true"
	 * @generated
	 */
	byte getBlue();

	/**
	 * Sets the value of the '{@link turtle.Color#getBlue <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blue</em>' attribute.
	 * @see #getBlue()
	 * @generated
	 */
	void setBlue(byte value);

	/**
	 * Returns the value of the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Green</em>' attribute.
	 * @see #setGreen(byte)
	 * @see turtle.TurtlePackage#getColor_Green()
	 * @model required="true"
	 * @generated
	 */
	byte getGreen();

	/**
	 * Sets the value of the '{@link turtle.Color#getGreen <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Green</em>' attribute.
	 * @see #getGreen()
	 * @generated
	 */
	void setGreen(byte value);

	/**
	 * Returns the value of the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha</em>' attribute.
	 * @see #setAlpha(byte)
	 * @see turtle.TurtlePackage#getColor_Alpha()
	 * @model
	 * @generated
	 */
	byte getAlpha();

	/**
	 * Sets the value of the '{@link turtle.Color#getAlpha <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha</em>' attribute.
	 * @see #getAlpha()
	 * @generated
	 */
	void setAlpha(byte value);

} // Color
