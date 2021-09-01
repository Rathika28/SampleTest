package org.mav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestngMethods {
	@Test
	private void Browser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Testng\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("suguAravind");
		 driver.findElement(By.id("password")).sendKeys("sugu@3005");
		 driver.findElement(By.id("login")).click();
		 Thread.sleep(4000);
		 driver.close();
}
	@Test
	private void Browser1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Testng\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("suguAravind");
		 driver.findElement(By.id("password")).sendKeys("sugu@3005");
		 driver.findElement(By.id("login")).click();
		 Thread.sleep(4000);
		 driver.close();
}

    @Test
	private void Browser2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Testng\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("suguAravind");
		 driver.findElement(By.id("password")).sendKeys("sugu@3005");
		 driver.findElement(By.id("login")).click();
		 Thread.sleep(4000);
		 driver.close();
}
	

	@Test
	private void Browser3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Testng\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("suguAravind");
		 driver.findElement(By.id("password")).sendKeys("sugu@3005");
		 driver.findElement(By.id("login")).click();
		 Thread.sleep(4000);
		 driver.close();
}
	

	@Test
	private void Browser4() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Testng\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("suguAravind");
		 driver.findElement(By.id("password")).sendKeys("sugu@3005");
		 driver.findElement(By.id("login")).click();
		 Thread.sleep(4000);
		 driver.close();
}
	

}
