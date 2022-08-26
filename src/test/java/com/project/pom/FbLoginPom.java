package com.project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPom {

	
	
public FbLoginPom( WebDriver driver) {
	
  PageFactory.initElements(driver, this);
}	
@FindBy(how=How.XPATH , using="//input[@name='email']")
private	WebElement email;
@FindBy(how=How.XPATH, using="//input[@name='pass']")
private WebElement pass;
@FindBy(how=How.XPATH, using="//button[@name='login']")
private WebElement login;
	

public void setemail(String email_value) {
	email.sendKeys(email_value);
}

public void setpass(String pass_value)
{
pass.sendKeys(pass_value);	
}
public void clickbutton() {
	login.click();
}
	
}
