package org.mav;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngData extends BaseClass {
	@Test(dataProvider="SampleData")
	private void data(String username,String password) {
		launchurl("https://adactinhotelapp.com/");
		AdactinLoginPage a=new AdactinLoginPage();
		enterText(a.getUsername(),username);
		enterText(a.getPassword(),password);
		btnclick(a.getLogin());
	}


    @DataProvider(name="SampleData")
     private Object[][] data() {
    	return new Object[][] {
    		{"rathikaammu28","ammucseb"},
    		{"surya123","1234"},
    		{"nathiya123","99966"}
    	
    };
	
}
}