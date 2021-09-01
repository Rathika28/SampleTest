package org.mav;

import org.testng.annotations.Test;

public class TestngGroup {
	
	@Test(groups="Smoke")
	private void test1(){
		System.out.println("test1");
		}
	@Test(groups="Sanity")
	private void test2(){
		System.out.println("test2");
		}
	@Test(groups="Smoke")
	private void test3(){
		System.out.println("test3");
		}
	@Test(groups="Sanity")
	private void test4(){
		System.out.println("test4");
		}

    @Test(groups="Regression")
    private void test5(){
	System.out.println("test5");
	}




}
