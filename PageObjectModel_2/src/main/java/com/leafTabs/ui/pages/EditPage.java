package com.leafTabs.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.leafTabs.ui.base.BaseClass;

public class EditPage extends BaseClass {
	public EditPage()
	{
		
	}
	public EditPage clearCompanyName()
	{
		WebElement clrCoName = driver.findElement(By.id("updateLeadForm_companyName"));
		clrCoName.clear();
		return this;
	}
	public EditPage updateCompanyName(String companyName) {
		
		WebElement updateCoName = driver.findElement(By.id("updateLeadForm_companyName"));
		updateCoName.sendKeys(companyName);
		return this;
	}
	public FinalViewLeadPage clickUpdate() {
		driver.findElement(By.name("submitButton")).click();
		return new FinalViewLeadPage();
		
	}
	

}
