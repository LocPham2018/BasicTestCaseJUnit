package testCase;

import static org.junit.Assert.*;

import org.junit.Test;

import operations.BasicMath;

public class TestCase {

	@Test
	public void testAdd() {
		assertEquals(7, BasicMath.add(2, 5));
	}
	
	@Test
	public void testSubtract() {
		assertEquals(-1, BasicMath.subtract(4, 5));
	}
	
	@Test
	public void testMultiply() {
		assertEquals(55, BasicMath.multiply(5, 11));
	}
	
	@Test
	public void testDivide() {
		assertEquals(6, BasicMath.divide(18, 3));
	}
	
	@Test
	public void testDivideWithRemainder() {
		assertEquals(4, BasicMath.divide(13, 3));
	}
	
	@Test
	public void testException() {
		try {
			BasicMath.divide(2, 0);
			fail("Cannot divide by 0.");
		} catch (Exception e) {
			// TODO: handle exception
	        assertEquals(e.getMessage(), "/ by zero");
		}
	}

}
