package com.project.bachthree.automation.qa.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.bachthree.automation.qa.base.BaseClass;

public class PacificHuntWindowHandlePage extends BaseClass{
	
	Properties prop;
	FileInputStream credentials;
	private String secretPath = "./src/main/java/configs/secrets.properties";
	
	
	@FindBy(xpath="//div[@class='S9gUrf-YoZ4jf']")
	WebElement googleSignInElement;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement emailElement;
	
	@FindBy(xpath="//div[@class='S9gUrf-YoZ4jf']//iframe")
	WebElement googleIframe;
	
	
	
	public PacificHuntWindowHandlePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void clickSignInwithGoogle() {
		
		googleSignInElement.click();
	}
	
	public void credentialInitialization() {
		
		prop = new Properties();
		try {
			credentials = new FileInputStream(secretPath);
			prop.load(credentials);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	public String getEmail() {
		
		credentialInitialization();
		String email = prop.getProperty("pacific_email");
		
		return email;
	}
	
	public void setEmail() {
		
		emailElement.sendKeys(getEmail());
		
	}
	
	
	public void goNext() {
		
		emailElement.sendKeys(Keys.ENTER);
		
	}
	
	
	
	public void switchToFrame(WebDriver driver) {
		
		driver.switchTo().frame(googleIframe);
	}

}
