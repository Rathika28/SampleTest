package org.mav;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngData2 extends BaseClass{

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
	private Object[][]data() throws NumberFormatException, IOException{
		return new Object[][] {
			
			{excelRead("D:\\GREENS2\\TRAINNING\\Practice2.xlsx", "abcd", 0, 0),excelRead("D:\\GREENS2\\TRAINNING\\Practice2.xlsx", "abcd", 0, 1),Integer.parseInt(excelRead("D:\\GREENS2\\TRAINNING\\Practice2.xlsx", "abcd", 0, 2))},
   
			{"suguAravind","sugu@3005"}
			
			};
			
		
		
		}
		
	}
	


	
	
	
	




	


