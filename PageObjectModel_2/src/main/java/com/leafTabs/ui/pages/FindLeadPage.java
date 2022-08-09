package com.leafTabs.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.leafTabs.ui.base.BaseClass;

public class FindLeadPage extends BaseClass {
	public FindLeadPage()
	{
		
	}
	public FindLeadPage clickPhoneNo() {
		WebElement clickPhNo = driver.findElement(By.xpath("//span[text()='Phone']"));
		clickPhNo.click();
		return this;

	}
	public FindLeadPage enterPhoneNumber(String phoneNumber) {
		WebElement enterPhNo = driver.findElement(By.xpath("//input[@name='phoneNumber']"));
		enterPhNo.sendKeys(phoneNumber);
		return this;

	}
	public FindLeadPage clickFindLead() throws InterruptedException {
		Thread.sleep(5000);
		WebElement clickfindLead = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		clickfindLead.click();
		return this;
		
	}
	public ViewPageLead clickFirstColumn() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		return new ViewPageLead();
		
	}
	
	
	

}
