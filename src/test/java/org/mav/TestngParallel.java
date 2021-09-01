package org.mav;

import org.testng.annotations.Test;

public class TestngParallel {
	

	@Test
	private void test1() {
		System.out.println("test1"+" "+Thread.currentThread().getId());
	}
	
	@Test
	private void test2() {
		System.out.println("test2"+" "+Thread.currentThread().getId());
	}
	
	@Test
	private void test3() {
		System.out.println("test3"+" "+Thread.currentThread().getId());
	}
	
	@Test
	private void test4() {
		System.out.println("test4"+" "+Thread.currentThread().getId());
	}


}
