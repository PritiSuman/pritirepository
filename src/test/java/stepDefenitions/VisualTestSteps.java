package stepDefenitions;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.TestContext;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import managers.FileReaderManager;
import pageObjects.AlertPage;
import pageObjects.HomePage;
import pageObjects.InteliePage;
import pageObjects.LeftRigAndWellFilterPage;
import pageObjects.LoginPage;
import pageObjects.TimeAndHourPage;
import pageObjects.WMS1_NormalDataExportPage;



public class VisualTestSteps {
	
	WebDriver driver;
	TestContext testContext;
	LoginPage loginPage;
	InteliePage inteliePage;
	HomePage homePage;
	AlertPage alertPage;
	WMS1_NormalDataExportPage wms1_DataExportPage;
	LeftRigAndWellFilterPage leftRigAndWellFilterPage;
	TimeAndHourPage timeAndHourPage;
	String downloadFilePath = (System.getProperty("user.dir")+ FileReaderManager.getInstance().getConfiFileReader().getdownloadFilePath());
	ExtentTest test;
	ExtentReports report;
	ITestContext contexts;

	
	public VisualTestSteps(TestContext context)
	{
		
		testContext =context;
		inteliePage = testContext.getPageObjectManagers().getInteliePage();
		loginPage = testContext.getPageObjectManagers().getLoginPage();
		homePage = testContext.getPageObjectManagers().getHomePage();
		alertPage = testContext.getPageObjectManagers().getAlertPage();
		wms1_DataExportPage= testContext.getPageObjectManagers().getWMS1_DataExportPage();
		leftRigAndWellFilterPage = testContext.getPageObjectManagers().getLeftRigAndWellFilterPage();
		timeAndHourPage = testContext.getPageObjectManagers().getTimeAndHourPage();
		
		
		
	}
	
	
	 
	@BeforeClass
	public void beforeClass()
	{
		report = new ExtentReports(System.getProperty("user.dir")+ "\\report\\cucumber-report\\VisualReport.html");
		
		try {
		FileUtils.cleanDirectory(new File(System.getProperty("user.dir")+ "\\src\\images\\diffImages"));
		FileUtils.cleanDirectory(new File(System.getProperty("user.dir")+ "\\src\\images\\screenshots"));
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
	
	
	@BeforeMethod
	public void beforeMethod(Method method)
	{
		//test = report.startTest(method.getName());
	}
	
	@DataProvider(name = "urls")
	 public static Object[][] urls()
	 {
		 return new Object[][]
				 {
			 {"2020-01-28 13:00 to 2020-01-14 13:10", "wms1"},
			 {"",  ""}
				 };
	        }
	
		
	@Test(dataProvider = "urls")
	public void regression(String url, String name, Method method, ITestContext context) throws Exception
	{
		context.getCurrentXmlTest().addParameter("image", name);
		
		test = report.startTest(method.getName() + " || " + url );
		inteliePage.navigateTo_IntelieWelcomePage();
		//sUserName = FileReaderManager.getInstance().getConfiFileReader().getUserName();
		//sPassword = FileReaderManager.getInstance().getConfiFileReader().getPassword();
		loginPage.loginTo_IntelieLiveApplication("priti.suman1", "Harshu@1234");
		homePage.goTo_WMS1Dashboard();
		Reporter.addStepLog("User has been navigated to WMS1 Dashboard");
		alertPage.clickTo_chkbx_HideForEver();
		Reporter.addStepLog("User has clicked on alert 'Hide Forever'");
		alertPage.clickTo_btn_OkGotIt();
		Reporter.addStepLog("User has clicked on alert 'Ok GotIt'");
		//leftRigAndWellFilterPage.select_RigWellFromLeftFilter("rt_norm_gc_743_1min");
		timeAndHourPage.clkToDisplyDashboardOptions();
		timeAndHourPage.sdd_TimeAndHour();
		Thread.sleep(500);
		//wms1_DataExportPage.clkToDownloadFileIn_Track03_PNGActualSizeFormat();
		
		try {
			new selenium.ScreenCaptureUtility().takePageScreenShotimpr(driver, name);
		
		   Assert.assertTrue(new selenium.ScreenCaptureUtility().areImagesEqual(name, name));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	@AfterMethod()
	public void afterMethod(ITestResult result, ITestContext contexts)
	{
		String image = contexts.getCurrentXmlTest().getParameter("image");
		if (result.getStatus() ==ITestResult.SUCCESS)
		{
			test.log(LogStatus.PASS, "Test passes");
		}
		if (result.getStatus() ==ITestResult.FAILURE)
		{
			String diff = test.addScreenCapture("../src/images/diffImages/" + image + ".png");
			
			test.log(LogStatus.FAIL, "Test failed", "screenshot: \n"+diff);
			test.log(LogStatus.FAIL, result.getThrowable());
		}
		
		if (result.getStatus() ==ITestResult.SKIP)
		{
			test.log(LogStatus.SKIP, "Test skipped");
			
		}
		
	}
	
	@AfterClass
	public void afterClass()
	{
		driver.close();
		report.endTest(test);
		report.flush();
	}


}
