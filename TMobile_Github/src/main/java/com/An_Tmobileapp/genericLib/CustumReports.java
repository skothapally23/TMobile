package com.An_Tmobileapp.genericLib;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class CustumReports {
	@Test
	public void runReports()
	{
		ExtentReports repo=new ExtentReports();
		ExtentSparkReporter spark= new ExtentSparkReporter("./MyBeautifulReport.html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Canvas Document");
		spark.config().setReportName("Customised Beautiful Report");
		repo.attachReporter(spark);
		
		ExtentTest test1= repo.createTest("Login Testcase" ).assignAuthor("Sravanthi").assignCategory("Regression Test").assignDevice("Windows Chrome 90");
		test1.info("Open the browser");
		test1.info("Enter test url");
		test1.info("Enter Username");
		test1.info("Enter password");
		test1.info("Click  Login Button");
		test1.pass("login Successful");
		
		repo.flush();
		
		ExtentTest test2= repo.createTest("Login Testcase" ).assignAuthor("Sravanthi").assignCategory("Regression Test").assignDevice("Windows Chrome 90");
		test2.info("Open the browser");
		test2.info("Enter test url");
		test2.info("Enter Username");
		test2.info("Enter password");
		test2.info("Click  Login Button");
		test2.pass("login Successful");
		test2.fail("logout");
		
		repo.flush();
		
	}

}
