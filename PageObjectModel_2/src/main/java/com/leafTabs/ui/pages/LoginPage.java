package com.leafTabs.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.leafTabs.ui.base.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage()
	{
		
	}
	
	public LoginPage typeUserName(String username)
	{
		WebElement uName = driver.findElement(By.id("username"));
		uName.sendKeys(username);
		return this;
		
	}
	public LoginPage typePassword(String password) {
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys(password);
		return this;
		
		
		
	}
	public WelcomePage clickLogin()
	{
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		return new WelcomePage();
		
	}

}
