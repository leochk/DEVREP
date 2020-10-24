/**
 */
package turtle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Farm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link turtle.Farm#getTurtles <em>Turtles</em>}</li>
 *   <li>{@link turtle.Farm#getStages <em>Stages</em>}</li>
 *   <li>{@link turtle.Farm#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see turtle.TurtlePackage#getFarm()
 * @model
 * @generated
 */
public interface Farm extends EObject {
	/**
	 * Returns the value of the '<em><b>Turtles</b></em>' containment reference list.
	 * The list contents are of type {@link turtle.Turtle}.
	 * It is bidirectional and its opposite is '{@link turtle.Turtle#getFarm <em>Farm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Turtles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Turtles</em>' containment reference list.
	 * @see turtle.TurtlePackage#getFarm_Turtles()
	 * @see turtle.Turtle#getFarm
	 * @model opposite="farm" containment="true"
	 * @generated
	 */
	EList<Turtle> getTurtles();

	/**
	 * Returns the value of the '<em><b>Stages</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link turtle.Stage#getFarms <em>Farms</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stages</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stages</em>' container reference.
	 * @see turtle.TurtlePackage#getFarm_Stages()
	 * @see turtle.Stage#getFarms
	 * @model opposite="farms" transient="false" changeable="false"
	 * @generated
	 */
	Stage getStages();

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
	 * @see turtle.TurtlePackage#getFarm_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link turtle.Farm#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Farm
