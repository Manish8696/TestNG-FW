package com.inetBankingV1.utilies;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting implements ITestListener
{
public ExtentSparkReporter htmlReporter;
public ExtentReports reports;
public ExtentTest test;

public void configureReport() {
	
	htmlReporter = new ExtentSparkReporter ("ExtentReport.html");
	reports = new ExtentReports();
	reports.attachReporter(htmlReporter);
	
	//add system infomation
	reports.setSystemInfo("Machine:", "hp");
	reports.setSystemInfo("OS :", "Window 10");
	reports.setSystemInfo("browser :", "chrome");
	reports.setSystemInfo("user name :", "Manish");
	
	// config to change feel
	htmlReporter.config().setDocumentTitle("Extent Listener Report Demo");
	htmlReporter.config().setReportName("this is my first report");
	htmlReporter.config().setTheme(Theme.DARK);
}

public void onStart(ITestContext Result) {
	
	configureReport();
	System.out.println("On Start method invoked...");
	}
public void onFinish (ITestContext Result) {
	System.out.println("on Finishing method invoked....");
	reports.flush();
}
public void onTestFailure (ITestResult Result) {
	System.out.println("name of test method failed : "+ Result.getName());
	test=reports.createTest(Result.getName());
	test.log(Status.FAIL, MarkupHelper.createLabel("name of the failed test case is :" + Result.getName(), ExtentColor.RED));
}
public void onTestSkipped (ITestResult Result) {
	System.out.println("name of test method skipped : "+ Result.getName());
	test=reports.createTest(Result.getName());
	test.log(Status.SKIP, MarkupHelper.createLabel("name of the skipped test case is :" + Result.getName(), ExtentColor.YELLOW));

}
public void onTestStart (ITestResult Result) {
	System.out.println("name of test method started : "+ Result.getName());

}
public void onTestSuccess (ITestResult Result) {
	System.out.println("name of test method success : "+ Result.getName());
	test=reports.createTest(Result.getName());
	test.log(Status.PASS, MarkupHelper.createLabel("name of the success test case is :" + Result.getName(), ExtentColor.GREEN));

}
public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
	
}

}
