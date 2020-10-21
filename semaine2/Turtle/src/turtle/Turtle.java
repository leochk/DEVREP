/**
 */
package turtle;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turtle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link turtle.Turtle#getFarm <em>Farm</em>}</li>
 *   <li>{@link turtle.Turtle#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see turtle.TurtlePackage#getTurtle()
 * @model
 * @generated
 */
public interface Turtle extends EObject {
	/**
	 * Returns the value of the '<em><b>Farm</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link turtle.Farm#getTurtles <em>Turtles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Farm</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Farm</em>' container reference.
	 * @see turtle.TurtlePackage#getTurtle_Farm()
	 * @see turtle.Farm#getTurtles
	 * @model opposite="turtles" required="true" transient="false" changeable="false"
	 * @generated
	 */
	Farm getFarm();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see turtle.TurtlePackage#getTurtle_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link turtle.Turtle#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Turtle
