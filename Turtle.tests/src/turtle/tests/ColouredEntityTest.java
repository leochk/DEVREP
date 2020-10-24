/**
 */
package turtle.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import turtle.ColouredEntity;
import turtle.TurtleFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Coloured Entity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ColouredEntityTest extends TestCase {

	/**
	 * The fixture for this Coloured Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColouredEntity fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ColouredEntityTest.class);
	}

	/**
	 * Constructs a new Coloured Entity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColouredEntityTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Coloured Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ColouredEntity fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Coloured Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColouredEntity getFixture() {
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
		setFixture(TurtleFactory.eINSTANCE.createColouredEntity());
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

} //ColouredEntityTest
