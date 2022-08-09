package com.leafTabs.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.leafTabs.ui.base.BaseClass;

public class LeadsPage extends BaseClass {
	public LeadsPage()
	{
		
	}
public FindLeadPage clickFindLeadPage() {
		
		WebElement findLead = driver.findElement(By.linkText("Find Leads"));
		findLead.click();
		return new FindLeadPage();
		
		
	}
		
		
	}


