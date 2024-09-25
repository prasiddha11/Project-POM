package com.project.bachthree.automation.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.project.bachthree.automation.qa.base.BaseClass;

public class TotalQAHomepage extends BaseClass{
	
	

	@FindBy(xpath="//input[@type='checkbox']")
	static List<WebElement> checkboxesElement;

	
	
	public static void clickAllCheckBoxes() {
		
		Reporter.log("Clicking all checkboxes in this page", true);

		for(WebElement singleCheckBox: checkboxesElement ) {
			
			singleCheckBox.click();
		}
	}
	
	public TotalQAHomepage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
}
