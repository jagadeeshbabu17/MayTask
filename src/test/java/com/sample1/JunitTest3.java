package com.sample1;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest3 {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");

	}

	// @Before
	// public void beforeMethod1() {
	// System.out.println("before method1");
	// }

	@Before
	public void beforeMethod2() {
		Date date = new Date();
		System.out.println(date);
	}

	@Test
	public void tc1() {
		System.out.println("TEST1 Case");
	}

	@Test
	public void tc2() {
		System.out.println("TEST2 Case");
	}

	@Test
	public void tc3() {
		System.out.println("TEST3 Case");
	}

	@Test
	public void tc4() {
		System.out.println("TEST4 Case");
	}

	@Test
	public void tc5() {
		System.out.println("TEST5 Case");
	}

	// @After
	// public void afterMethod1() {
	// System.out.println("After method1");
	// }
	@After
	public void afterMethod2() {
		Date date = new Date();
		System.out.println(date);
	//	System.out.println("After method2");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");

	}

}
