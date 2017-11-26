package com.imooc.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		assertEquals(6, new Calculator().add(3, 3));
	}

	@Test
	public void testSub() {
		assertEquals(0, new Calculator().sub(3, 3));
	}
	
	@Test
	public void testMul() {
		assertEquals(9, new Calculator().mul(3, 3));
	}
	
	@Test
	public void testDiv() {
		assertEquals(1, new Calculator().div(3, 3));
	}
}
