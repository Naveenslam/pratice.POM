package com.leafTabs.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.leafTabs.ui.base.BaseClass;

public class WelcomePage extends BaseClass {
	
	public WelcomePage()
	{
		
	}
	public HomePage clickCRMSFALink()
	{
		WebElement loginButton = driver.findElement(By.linkText("CRM/SFA"));
		loginButton.click();
		return new HomePage();
		
	}
	public LoginPage clickLogout()
	
	
	{
		WebElement clickLogout = driver.findElement(By.className("decorativeSubmit"));
		clickLogout.click();
		return new LoginPage();
		
		
	}

}
