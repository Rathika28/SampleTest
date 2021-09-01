package org.mav;

import org.testng.annotations.Test;

public class TestngParallel1 {
	

	@Test
	private void test5() {
		System.out.println("test5"+" "+Thread.currentThread().getId());
	}
	
	@Test
	private void test6() {
		System.out.println("test6"+" "+Thread.currentThread().getId());
	}
	
	@Test
	private void test7() {
		System.out.println("test7"+" "+Thread.currentThread().getId());
	}
	
	@Test
	private void test8() {
		System.out.println("test8"+" "+Thread.currentThread().getId());
	}


}
