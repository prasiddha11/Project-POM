package com.project.bachthree.automation.qa.tests;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.project.bachthree.automation.qa.base.BaseClass;
import com.project.bachthree.automation.qa.pages.RegisterPage;

public class RegisterTest extends BaseClass {
	
	@Test(description="Register test case")
	public void verifyRegisterTest() throws InterruptedException {
		
		RegisterPage register = new RegisterPage(driver);
		register.setFirstName();
		Thread.sleep(2000);
		register.setLastName();
		register.chooseMaleOption();
		Thread.sleep(2000);
		Reporter.log("register testcase Done!", true);
	}

}
