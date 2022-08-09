package com.leafTabs.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.leafTabs.ui.base.BaseClass;

public class HomePage extends BaseClass {

	public HomePage()
	{
		
		
	}
	public LeadsPage clickLeads()
	{
		WebElement leadsClick = driver.findElement(By.linkText("Leads"));
		leadsClick.click();
		return new LeadsPage();
		
		
	}
}
