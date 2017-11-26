package com.imooc.util;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class JunitAnnotationTest {

	@Test(expected=ArithmeticException.class) // declare expected exception
	public void test() {
		assertEquals(1, new Calculator().div(3, 0));
	}

	@Test(timeout=2000) // limit the period of the test, the unit is ms, can be used for performance testing
	public void testWhile() {
		for (int i = 0; ; i++)
			System.out.println( i + " run forever");
	}
	
	@Ignore
	@Test
	public void testIgnoreAnnotation() {
		System.out.println("ignore annotation");
	}
}
