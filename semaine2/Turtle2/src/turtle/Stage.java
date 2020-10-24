/**
 */
package turtle;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link turtle.Stage#getHeight <em>Height</em>}</li>
 *   <li>{@link turtle.Stage#getWidth <em>Width</em>}</li>
 *   <li>{@link turtle.Stage#getChoreographies <em>Choreographies</em>}</li>
 *   <li>{@link turtle.Stage#getFarms <em>Farms</em>}</li>
 *   <li>{@link turtle.Stage#getBackgroundColor <em>Background Color</em>}</li>
 * </ul>
 *
 * @see turtle.TurtlePackage#getStage()
 * @model
 * @generated
 */
public interface Stage extends ColouredEntity {
	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see turtle.TurtlePackage#getStage_Height()
	 * @model required="true"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link turtle.Stage#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see turtle.TurtlePackage#getStage_Width()
	 * @model required="true"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link turtle.Stage#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Choreographies</b></em>' containment reference list.
	 * The list contents are of type {@link turtle.Choreography}.
	 * It is bidirectional and its opposite is '{@link turtle.Choreography#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choreographies</em>' containment reference list.
	 * @see turtle.TurtlePackage#getStage_Choreographies()
	 * @see turtle.Choreography#getStage
	 * @model opposite="stage" containment="true" required="true"
	 * @generated
	 */
	EList<Choreography> getChoreographies();

	/**
	 * Returns the value of the '<em><b>Farms</b></em>' containment reference list.
	 * The list contents are of type {@link turtle.Farm}.
	 * It is bidirectional and its opposite is '{@link turtle.Farm#getStages <em>Stages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Farms</em>' containment reference list.
	 * @see turtle.TurtlePackage#getStage_Farms()
	 * @see turtle.Farm#getStages
	 * @model opposite="stages" containment="true" required="true"
	 * @generated
	 */
	EList<Farm> getFarms();

	/**
	 * Returns the value of the '<em><b>Background Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Color</em>' reference.
	 * @see #setBackgroundColor(Color)
	 * @see turtle.TurtlePackage#getStage_BackgroundColor()
	 * @model
	 * @generated
	 */
	Color getBackgroundColor();

	/**
	 * Sets the value of the '{@link turtle.Stage#getBackgroundColor <em>Background Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Color</em>' reference.
	 * @see #getBackgroundColor()
	 * @generated
	 */
	void setBackgroundColor(Color value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String display();

} // Stage
