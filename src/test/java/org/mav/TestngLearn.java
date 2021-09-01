package org.mav;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngLearn {
	
	@BeforeClass
	private void beforeClass() {
		System.out.println("@BeforeClass");
	}
	

	@BeforeMethod
	private void beforeMethod() {
		System.out.println("@BeforeMethod");
	}
	

	@AfterMethod
	private void afterMethod() {
		System.out.println("@AfterMethod");
	}
	

	@Test
	private void testing() {
		System.out.println("@Test1");
	}
	
	@BeforeTest
	private void beforeTest() {
		System.out.println("@BeforeTest");
	}
	

	@AfterTest
	private void afterTest() {
		System.out.println("@AfterTest");
	}
	

	@AfterSuite
	private void afterSuite() {
		System.out.println("@AfterSuite");
	}
	

	@BeforeSuite
	private void beforeSuite() {
		System.out.println("@BeforeSuite");
	}
	
	@AfterClass
	private void afterClass() {
		System.out.println("@AfterClass");
	}
	



}
