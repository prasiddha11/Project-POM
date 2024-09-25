package com.project.bachthree.automation.qa.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.project.bachthree.automation.qa.base.BaseClass;
import com.project.bachthree.automation.qa.pages.FormStoneCheckBoxPage;

public class FormStoneChechBoxTest extends BaseClass{
	
	@Test(description="formStone testcases")
	public void verifyAllClicksOnCheckBoxes() throws InterruptedException {
		
		FormStoneCheckBoxPage checkboxPage = new FormStoneCheckBoxPage(driver);
		checkboxPage.clickAllCheckBoxes();
		//Reporter.log("All Checkboxes Clicked", true);
		Thread.sleep(2000);
		
		Reporter.log("Formstone testcase Done!", true);
	}

}
