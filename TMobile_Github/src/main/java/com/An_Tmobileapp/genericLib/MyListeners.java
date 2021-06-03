package com.An_Tmobileapp.genericLib;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName()+"STARTED", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getName()+"PASSED", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log(result.getName()+"FAILED", true);
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.getFullScreenshot("./screenshots/" + result.getName()+".png");
	}
	@Override
	public void onStart(ITestContext context) {
		Reporter.log(context.getName()+"TestRunner STARTED", true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log(context.getName()+"Test Runner completed", true);
	}


	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName()+"Skipped", true);
	}


	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	

}
