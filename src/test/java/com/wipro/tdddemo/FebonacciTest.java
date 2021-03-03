package com.wipro.tdddemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FebonacciTest {
	
	private Febonacci feb = new Febonacci();

	@Test
	void testCanCreateClass() {
		Assertions.assertNotNull(feb);
	}
	
	@Test
	void testBasic() {
		Assertions.assertNotNull(feb.compute(1));
		Assertions.assertEquals(0, feb.compute(0));
		Assertions.assertEquals(1, feb.compute(1));
	}
	
	@Test
	void testAdvance() {
		Assertions.assertEquals(1, feb.compute(2));
		Assertions.assertEquals(2, feb.compute(3));
		Assertions.assertEquals(3, feb.compute(4));
		Assertions.assertEquals(21, feb.compute(8));
	}

}
