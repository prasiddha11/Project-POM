package com.project.bachthree.automation.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener{
	
	
	public  void onTestStart(ITestResult result) {
	    System.out.println("Test Started..");
	  }

	public  void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed!");
	}
	
	public  void onTestSkipped(ITestResult result) {
	    System.out.println("Test Skipped!");
	  }
	
	public  void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	    System.out.println("Test Failed!");
	  }
	
	public  void onStart(ITestContext context) {
	    
		System.out.println("Test Execution is started..");
	  }
	
	public  void onFinish(ITestContext context) {
		System.out.println("Test completed!");
	}
	
	
}
