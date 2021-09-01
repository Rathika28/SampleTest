package org.mav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngCross {
	
	@Parameters({"Browser"})
	@Test
	private void Browser(String browser) throws InterruptedException {
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Testng\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("suguAravind");
		 driver.findElement(By.id("password")).sendKeys("sugu@3005");
		 driver.findElement(By.id("login")).click();
		 Thread.sleep(4000);
		
}
	}
	
    @Parameters({"Browser1"})
	@Test
	private void Browser1(String browser1) throws InterruptedException {
    	if(browser1.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Testng\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("suguAravind");
		 driver.findElement(By.id("password")).sendKeys("sugu@3005");
		 driver.findElement(By.id("login")).click();
		 Thread.sleep(4000);
		 driver.close();
		 WebElement findElement1 = driver.findElement(By.id("username"));
			findElement.sendKeys("suguAravind");
			 driver.findElement(By.id("password")).sendKeys("sugu@3005");
			 driver.findElement(By.id("login")).click();
			 Thread.sleep(4000);
			 driver.close();
}

    }
    
}
