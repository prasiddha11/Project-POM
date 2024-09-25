package com.project.bachthree.automation.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.bachthree.automation.qa.base.BaseClass;

public class IframePage extends BaseClass{
	
	@FindBy(name="top-iframe")
	WebElement iframeElement;
	
	@FindBy(linkText = "Docs")
	WebElement docsLink;
	
	
	public IframePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void switchToIframe(WebDriver driver) {
		
		driver.switchTo().frame(iframeElement);
	}
	
	public void clickDocsUnderIframe() {
		
		docsLink.click();
	}

}
