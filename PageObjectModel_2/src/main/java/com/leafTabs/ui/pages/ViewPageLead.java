package com.leafTabs.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.leafTabs.ui.base.BaseClass;

public class ViewPageLead extends BaseClass{
	
	public ViewPageLead()
	{
		
	}
	public EditPage clickEditLead()
	{
		WebElement clickEditlead = driver.findElement(By.linkText("Edit"));
		clickEditlead.click();
		return new EditPage();
	}

}
