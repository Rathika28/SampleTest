package org.mav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngHard1 {
	@Test
	private void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\MavenProject1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		boolean contains = title.contains("YouTube");
		Assert.assertFalse(contains);
		driver.findElement(By.id("email")).sendKeys("rathikaammu");
		

}
}
