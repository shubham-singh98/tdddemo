package com.wipro.tdddemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.security.InvalidParameterException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WiproMathTest {
	
	private WiproMath math = new WiproMath();
	
	@Test
	public void testAdd() {
		assertEquals(math.add(2,3),5.0);
		assertEquals(math.add(0,0),0.0);
	}
	@Test
	public void testAddNull() {
		Assertions.assertThrows(InvalidParameterException.class, () -> { math.add(1,null); });
		Assertions.assertThrows(InvalidParameterException.class, () -> { math.add(null,1); });
	}

	@Test
	public void testSubstract() {
		assertEquals(math.substract(3,2),1.0);
		assertEquals(math.substract(2,3),-1.0);
	}

	@Test
	public void testSubNull() {
		Assertions.assertThrows(InvalidParameterException.class, () -> { math.substract(1,null); });
		Assertions.assertThrows(InvalidParameterException.class, () -> { math.substract(null,1); });
	}
	
	@Test
	public void testMultiplyNull() {
		Assertions.assertThrows(InvalidParameterException.class, () -> { math.mult(1,null); });
		Assertions.assertThrows(InvalidParameterException.class, () -> { math.mult(null,1); });
		Assertions.assertEquals(math.mult(3,2),6.0);
		Assertions.assertEquals(math.mult(3,3),9.0);
	}
}
