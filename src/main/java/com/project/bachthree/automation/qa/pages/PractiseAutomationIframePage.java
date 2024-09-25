package com.project.bachthree.automation.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.bachthree.automation.qa.base.BaseClass;

public class PractiseAutomationIframePage extends BaseClass{
	
	@FindBy(name="top-iframe")
	WebElement iframeNameElement;
	
	@FindBy(linkText = "Docs")
	WebElement docsLinkElement;
	
	
	public PractiseAutomationIframePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void goToFrame(WebDriver driver) {
		
		driver.switchTo().frame(iframeNameElement);
	}
	
	
	public void clickDocsLink() {
		
		docsLinkElement.click();
	}
	
	
	
	

}
