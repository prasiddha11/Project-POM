package com.project.bachthree.automation.qa.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.project.bachthree.automation.qa.base.BaseClass;
import com.project.bachthree.automation.qa.pages.PacificHuntWindowHandlePage;

public class WindowHanldeTest extends BaseClass{
	
	
	@Test(description="Window handle testng")
	public void verifyWindowHandleTest() throws InterruptedException {
		
		PacificHuntWindowHandlePage loginPage = new PacificHuntWindowHandlePage(driver);
		
		String parentId = driver.getWindowHandle();
		//System.out.println("parentWindowId:"+ parentId);
		
		/*
		 * loginPage.clickSignInwithGoogle(); Thread.sleep(2000);
		 */
		
		Set<String> allwindowsIds = driver.getWindowHandles();
		//System.out.println("all windows ids:"+ allwindowsIds);
		
		
		Reporter.log("Window handle test case Done!", true);
		/*
		 * List<String> allLists = new ArrayList(allwindowsIds);
		 * 
		 * for(String eachid : allLists) {
		 * 
		 * 
		 * 
		 * String title = driver.switchTo().window(eachid).getTitle();
		 * //System.out.println("titles are:"+title);
		 * if(title.equals("Sign in - Google Accounts")) {
		 * 
		 * loginPage.setEmail(); Thread.sleep(2000); loginPage.goNext(); } }
		 * 
		 * 
		 * Thread.sleep(2000);
		 */
		
	}

}
