package org.mav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngData1 extends BaseClass {
	
	@Test(dataProvider="SampleData")
	private void data(String username,String password,int index) {
		launchurl("https://adactinhotelapp.com/");
		AdactinLoginPage a=new AdactinLoginPage();
		enterText(a.getUsername(),username);
		enterText(a.getPassword(),password);
		btnclick(a.getLogin());
		selectionByIndex(driver.findElement(By.id("location")), index);
		
	}
	@DataProvider(name="SampleData")
	private Object[][]data(){
		return new Object[][] {
			{"purushoth123","2N3WPK",2},
			{"surya123","1234",2},
			{"nathiya123","6789",2}
			
			};
		
	}
	

	

}
