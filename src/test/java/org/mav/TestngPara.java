package org.mav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngPara {
	
	@Parameters({"username", "password"})
	@Test
	private void test(String username,String password) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Testng\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
				
	}
	
	

}
