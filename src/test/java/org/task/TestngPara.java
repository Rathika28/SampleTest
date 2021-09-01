package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestngPara {
	@Parameters({"username","password"})
	
	@Test
	private void test(String username,String password) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\JunitLearn\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mail.google.com/");
	driver.findElement(By.name("identifier")).sendKeys(username);
	
	WebElement nxtbutton = driver.findElement(By.className("VfPpkd-vQzf8d"));
	nxtbutton.click();

	driver.findElement(By.id("password")).sendKeys(password);
	

}
}