package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyIntegerTest {
	private static MyInteger myIntOdd;
	private static MyInteger myIntEven;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		myIntEven = new MyInteger(2);
		myIntOdd = new MyInteger(3);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestInstanceIsEven() {
		
		assertTrue(myIntEven.isEven());
		
	}
	@Test
	public void TestInstanceIsOdd() {

		assertFalse(myIntOdd.isEven());

	}

	@Test
	public void TestInstanceIsPrime() {

		MyInteger myInt = new MyInteger(5);
		assertTrue(myInt.isPrime());

	}
	
	@Test
	public void TestInstanceEquals() {

		MyInteger myInt = new MyInteger(3);
		assertFalse(myInt.equals(2));

	}
}
