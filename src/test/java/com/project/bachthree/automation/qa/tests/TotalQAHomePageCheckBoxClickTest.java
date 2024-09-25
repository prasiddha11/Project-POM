package com.project.bachthree.automation.qa.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.project.bachthree.automation.qa.base.BaseClass;
import com.project.bachthree.automation.qa.pages.TotalQAHomepage;

public class TotalQAHomePageCheckBoxClickTest extends BaseClass{
	
	
	@Test(description="TotalQA testcase")
	public void verifyAllClicksOnCheckBoxes() throws InterruptedException {
		
		TotalQAHomepage homePage = new TotalQAHomepage(driver);
		//homePage.clickAllCheckBoxes();
		//Reporter.log("All Checkboxes Clicked", true);
		Reporter.log("Totalqa Testcase Done!", true);
	}

}
