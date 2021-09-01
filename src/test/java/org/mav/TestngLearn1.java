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

public class TestngLearn1 {
	
	@BeforeClass
	private void beforeclass(){
	   System.out.println("@BeforeClass");
	}
	
	@BeforeMethod
	private void beforemethod(){
	   System.out.println("@BeforeMethod");
	}
	
	@AfterMethod
	private void Aftermethod(){
	   System.out.println("@AfterMethod");
	}
	
	@Test(priority=-25)
	private void Testing(){
	   System.out.println("@Test1");
	}
	
	@BeforeTest
	private void beforetest(){
	   System.out.println("@BeforeTest");
	}
	
	@AfterTest
	private void aftertest(){
	   System.out.println("@AfterTest");
	}
	
	@AfterSuite
	private void aftersuite(){
	   System.out.println("@AfterSuite");
	}
	
	@BeforeSuite
	private void beforesuite(){
	   System.out.println("@BeforeSuite");
	}
	
	@Test(priority=10)
	private void Testing1(){
	   System.out.println("@Test11");
	}
	
	@Test(priority=20, enabled=false)
	private void Testing2(){
	   System.out.println("@Test22");
	}
	

	@Test(priority=37,invocationCount=3)
	private void Testing3(){
	   System.out.println("@Test33");
	}
	

	@Test(priority=-100)
	private void Testing4(){
	   System.out.println("@Test44");
	}
	
	
}