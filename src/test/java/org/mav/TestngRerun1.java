package org.mav;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngRerun1 extends AutomaticRerunBind {
	

	@Test(retryAnalyzer=AutomaticRerun.class)
	public void tc1() {
		System.out.println("test1");
		Assert.assertTrue(false);
	}
	@Test
	public void tc2() {
		System.out.println("test2");
	}
	@Test
	public void tc3() {
		System.out.println("test3");
	}
	@Test
	public void tc4() {
		System.out.println("test4");
	}


}



