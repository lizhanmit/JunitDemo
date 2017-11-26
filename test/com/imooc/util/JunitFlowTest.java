package com.imooc.util;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 1. @BeforeClass 修饰的方法在所有方法前调用执行，静态的，内存中只有一个实例，适合加载配置文件。
 * 2. @AfterClass 修饰的方法通常用来清理资源，e.g.close database connection。
 * 3. @Before 和 @After 在每个测试方法前后各执行一次。
 *
 */
public class JunitFlowTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
	}

	@Test
	public void test1() {
		System.out.println("test 1");
	}

	@Test
	public void test2() {
		System.out.println("test 2");
	}
}
