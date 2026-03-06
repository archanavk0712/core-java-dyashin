package com.dyashin.junittesting;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {

	Calculator c = null;

	@Before
	public void setup() {
		c=new Calculator();
	}
	
	@Test
	public void testAdd() {
		assertEquals(5, c.add(2, 3));
	}

	@After
	public void after() {
		
	}

}
