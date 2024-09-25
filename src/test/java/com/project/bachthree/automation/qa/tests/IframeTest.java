package com.project.bachthree.automation.qa.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.project.bachthree.automation.qa.base.BaseClass;
import com.project.bachthree.automation.qa.pages.IframePage;

public class IframeTest extends BaseClass{
	
	@Test(description="Register test case")
	public void verifyRegisterTest() throws InterruptedException {
		
		IframePage iframe = new IframePage(driver);
		//iframe.switchToIframe(driver);
		//iframe.clickDocsUnderIframe();
		Reporter.log("Iframe automation test Case Done", true);
	}

}
