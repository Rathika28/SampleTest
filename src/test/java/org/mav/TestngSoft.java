package org.mav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestngSoft {
	
	@Test(expectedExceptions=AssertionError.class)
	private void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\MavenProject1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		boolean contains = title.contains("YouTube");
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(contains);
		driver.findElement(By.id("email")).sendKeys("rathikaammu28");
		sa.assertAll();
		driver.findElement(By.id("pass")).sendKeys("ammucseb");
		

}
}
