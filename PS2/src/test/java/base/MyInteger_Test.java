package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	MyInteger integer1 = new MyInteger(2);
	MyInteger integer2 = new MyInteger(7);
	MyInteger integer3 = new MyInteger(12);
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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
	public void testIsEvenInt() {
		assertEquals(integer1.isEven(),true);
		assertEquals(integer2.isEven(),false);
		assertEquals(integer3.isEven(),true);
		fail("failed isEven");
	}

	@Test
	public void testIsOddInt() {
		assertEquals(integer1.isOdd(),false);
		assertEquals(integer2.isOdd(),true);
		assertEquals(integer3.isOdd(),false);
		fail("failed isODD");
	}

	@Test
	public void testIsPrimeInt() {
		assertEquals(integer1.isPrime(),true);
		assertEquals(integer2.isPrime(),true);
		assertEquals(integer3.isPrime(),false);
		fail("failed isPrime");
	}


	

}
