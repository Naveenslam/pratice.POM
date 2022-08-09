package com.leafTabs.ui.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafTabs.ui.base.BaseClass;
import com.leafTabs.ui.pages.LoginPage;

public class EditLead extends BaseClass {
    
	@BeforeTest
	public void setData() {
      
	excelFileName ="tc003";
	}
	
	@Test(dataProvider="testData")
	public void test(String username, String password, String phoneNumber,String companyName) throws InterruptedException {
		LoginPage page=new LoginPage();
		
		page
		.typeUserName(username)
		.typePassword(password)
		.clickLogin()
		.clickCRMSFALink()
		.clickLeads()
		.clickFindLeadPage()
		.clickPhoneNo()
		.enterPhoneNumber(phoneNumber)
		.clickFindLead()
		.clickFirstColumn()
		.clickEditLead()
		.clearCompanyName()
		.updateCompanyName(companyName)
		.clickUpdate()
		.finalviewPage();
	}
	
	
}
