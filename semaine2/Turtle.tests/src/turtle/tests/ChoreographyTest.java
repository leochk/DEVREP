/**
 */
package turtle.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import turtle.Choreography;
import turtle.TurtleFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Choreography</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChoreographyTest extends TestCase {

	/**
	 * The fixture for this Choreography test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Choreography fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChoreographyTest.class);
	}

	/**
	 * Constructs a new Choreography test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoreographyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Choreography test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Choreography fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Choreography test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Choreography getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TurtleFactory.eINSTANCE.createChoreography());
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

} //ChoreographyTest
