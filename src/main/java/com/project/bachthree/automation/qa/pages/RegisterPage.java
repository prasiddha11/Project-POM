package com.project.bachthree.automation.qa.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.bachthree.automation.qa.base.BaseClass;

public class RegisterPage extends BaseClass{

	private String secretFilePath = "./src/main/java/configs/secrets.properties";
	Properties prop;
	FileInputStream credentials;
	
	@FindBy(xpath="//input[@name='vfb-5']")
	WebElement firstNameElement;
	
	@FindBy(xpath="//input[@name='vfb-7']")
	WebElement lastNameElement;
	
	@FindBy(xpath="//input[@value='Male']")
	WebElement radioBtnMale;
	

	public RegisterPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void loadSecretInformation() {
		
		prop = new Properties();
		try {
			credentials = new FileInputStream(secretFilePath);
			prop.load(credentials);
		} catch (FileNotFoundException e) {
						e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void setFirstName() {
		
		firstNameElement.sendKeys(getFirstName());
	}
	
	public void setLastName() {
		
		lastNameElement.sendKeys(getLastName());
	}
	
	public String getFirstName() {
		
		loadSecretInformation();
		String firstName = prop.getProperty("firstname");
		return firstName;
	}
	
	
	
	public String getLastName() {
		
		loadSecretInformation();
		String lastName = prop.getProperty("lastname");
		return lastName;
	}
	
	public void chooseMaleOption() {
		
		radioBtnMale.click();
	}
	
	
}
