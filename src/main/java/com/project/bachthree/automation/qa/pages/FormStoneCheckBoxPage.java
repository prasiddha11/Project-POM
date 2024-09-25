package com.project.bachthree.automation.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class FormStoneCheckBoxPage {
	
	@FindBy(xpath="(//form[@class='form demo_form'])[1]/child::fieldset//div[@class='fs-checkbox-flag']")
	List<WebElement> checkboxesElement;

	
	
	public void clickAllCheckBoxes() {
		
		Reporter.log("Clicking all checkboxes in this page", true);

		for(WebElement singleCheckBox: checkboxesElement ) {
			
			singleCheckBox.click();
		}
	}
	
	
	public FormStoneCheckBoxPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}

}
