/**
 */
package turtle.tests;

import junit.textui.TestRunner;

import turtle.Stage;
import turtle.TurtleFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Stage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link turtle.Stage#display() <em>Display</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class StageTest extends ColouredEntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StageTest.class);
	}

	/**
	 * Constructs a new Stage test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Stage test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Stage getFixture() {
		return (Stage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TurtleFactory.eINSTANCE.createStage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link turtle.Stage#display() <em>Display</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see turtle.Stage#display()
	 * @generated
	 */
	public void testDisplay() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //StageTest
