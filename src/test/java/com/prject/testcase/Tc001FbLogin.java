package com.prject.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;
import com.project.pom.FbLoginPom;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc001FbLogin extends BaseClass {
	
	
	
	
	
	@Test
	
	public void verifylogin() throws Exception
	{
	/*	Thread.sleep(2000);
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("asn@bs");
		Thread.sleep(2000);
		WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys("123456");
		Thread.sleep(2000);
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
	*/
		FbLoginPom log= new FbLoginPom(driver);
		
		log.setemail("hkk@ghh");
		Thread.sleep(2000);
		log.setpass("123879");
		Thread.sleep(2000);
		log.clickbutton();
		
		
		
		
		
	}
	
	
	
	
}
