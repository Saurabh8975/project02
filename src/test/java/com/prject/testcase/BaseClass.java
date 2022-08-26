package com.prject.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
	@BeforeClass
	
	public void browsersetup() throws Exception  {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
	}
	
@AfterClass
	
	public void tearDown() {
		driver.close();
	}
	
	
	
}
