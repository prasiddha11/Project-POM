package com.project.bachthree.automation.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;

public class Utilities {
	
	
	public static Properties prop;
	public static FileInputStream input;
	public static String globalFilePath = "./src/main/java/configs/config.properties";
	public static final int IMPLICIT_WAIT_TIME = 10;
	
	
	static List<WebElement> checkboxesElement;
	
	
	public static void initGlobalConfiguration() {
		
		prop = new Properties();
		try {
			input = new FileInputStream(globalFilePath);
			prop.load(input);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static String getBrowserName() {
		
		String browserName = prop.getProperty("browser");
		return browserName;
	}
	
	
	public static String getBaseUrl() {
		
		String baseUrl = prop.getProperty("baseurl");
		return baseUrl;
	}
	
	
	public static void clickAllCheckBoxes() {
		
		Reporter.log("Clicking all checkboxes in this page", true);

		for(WebElement singleCheckBox: checkboxesElement ) {
			
			singleCheckBox.click();
		}
	}
	
	

}
