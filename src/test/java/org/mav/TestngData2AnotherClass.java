package org.mav;

import org.testng.annotations.Test;

public class TestngData2AnotherClass extends TestngData2{
	@Test(dataProvider="SampleData",dataProviderClass=TestngData2.class)
	private void data(String username,String password) {
		System.out.println(username);
		System.out.println(password);
	}
}
