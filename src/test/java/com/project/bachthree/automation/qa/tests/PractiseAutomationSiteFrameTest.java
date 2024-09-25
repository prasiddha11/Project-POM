package com.project.bachthree.automation.qa.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.project.bachthree.automation.qa.base.BaseClass;
import com.project.bachthree.automation.qa.pages.PractiseAutomationIframePage;

public class PractiseAutomationSiteFrameTest extends BaseClass{
	
	@Test
	public void verifyIframeWithinSameWindow() throws InterruptedException {
		
		PractiseAutomationIframePage iframeTest = new PractiseAutomationIframePage(driver);
		//iframeTest.goToFrame(driver);
		//iframeTest.clickDocsLink();
		
		Reporter.log("Iframe testcase Done", true);
	//	Thread.sleep(2000);
		
		
		
		
	}

}
