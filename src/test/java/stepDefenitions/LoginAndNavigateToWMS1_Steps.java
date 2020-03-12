package stepDefenitions;

import java.io.File;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


import com.cucumber.listener.Reporter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.TestContext;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.FileReaderManager;
import pageObjects.AlertPage;
import pageObjects.HomePage;
import pageObjects.InteliePage;
import pageObjects.LeftRigAndWellFilterPage;
import pageObjects.LoginPage;
import pageObjects.TimeAndHourPage;
import pageObjects.WMS1_NormalDataExportPage;
import selenium.AlertHandelingUtility;
import selenium.Log;

public class LoginAndNavigateToWMS1_Steps {
	
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
	ITestResult result;
	ITestContext contexts;
	
	
	public LoginAndNavigateToWMS1_Steps(TestContext context)
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
	
	 
	 
	 @BeforeMethod
	 public  void beforemethod()
	 {
	   DOMConfigurator.configure("log4j.xml");
	   
		
	 }
	 
	 @BeforeClass
	 public  void beforeClass()
	 {
	   DOMConfigurator.configure("log4j.xml");
	   
		
	 }
	 
	 
	
	 @Before
	 public void beforeScenario(Scenario scenario)
	 {
		 DOMConfigurator.configure("log4j.xml");
		 Reporter.assignAuthor("Automation Lead - Priti Suman");
		 
		 Log.startTestCase("========================" +scenario.getName().replaceAll(" ", " - ") + "======================");
		 System.out.println("==========================" + scenario.getName().replaceAll(" ", " - ") + "===================");
		
		 
		 
	 }
	
	 @After(order = 1)
	 public void afterScneario(Scenario scenario)
	 {	
		 if (scenario.isFailed())
		 {
			 String screenshotName = scenario.getName().replaceAll(" ", " - ");
			 
			 try
			 {
				
				 
					 
				 // this takes screenshot from the driver at save it to specified location
				 byte[] sourcePath = ((TakesScreenshot)testContext.getWebDriverManager().getDriver()).getScreenshotAs(OutputType.BYTES);
				
				 //scenario.embed(sourcePath, "image/png");
				 // Building up the destination path for the screenshot to save
				 
				 File destinationPath = new File(System.getProperty("user.dir") +  "reports/cucmber-reports/screenshots/" + screenshotName + ".png");
			     //copy taken screenshots from source location to destination location
				 //Files.copy(sourcePath, destinationPath);
				 
				 //this attach the specified screenshot to the test
				 
				  Reporter.addScreenCaptureFromPath(destinationPath.toString());
				  
				 
						
			 }catch (IOException e)
			 {
			 System.out.println(e.getMessage());
		 }
		}
	    }
	 
	 @After(order = 0)
	 public void AfterSteps(Scenario scenario) throws Throwable
	 {
		 System.out.println("=====================" + scenario.getName().replaceAll(" ", " - ") + "=====================");
		 Log.endTestCase("=====================" + scenario.getName().replaceAll(" ", " - ")+ "=====================");
		 Thread.sleep(1000);
		 testContext.getWebDriverManager().closeDriver();
	 }
	 
	 
	 	
	@Given("^user is successfully login to Intelie Live application with valid credential of \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_is_successfully_login_to_Intelie_Live_application_with_valid_crdential_of_and(String sUserName, String sPassword) throws Throwable {
		
		
		inteliePage.navigateTo_IntelieWelcomePage();
		sUserName = FileReaderManager.getInstance().getConfiFileReader().getUserName();
		sPassword = FileReaderManager.getInstance().getConfiFileReader().getPassword();
		loginPage.loginTo_IntelieLiveApplication(sUserName, sPassword);
			
	}
	
	@When("^user navigate to WMS One dashboard$")
	public void user_navigate_to_WMS_One_dashboard() throws Throwable {
		
		homePage.goTo_WMS1Dashboard();
		Reporter.addStepLog("User has been navigated to WMS1 Dashboard");
		alertPage.clickTo_chkbx_HideForEver();
		Reporter.addStepLog("User has clicked on alert 'Hide Forever'");
		alertPage.clickTo_btn_OkGotIt();
		Reporter.addStepLog("User has clicked on alert 'Ok GotIt'");
		
		
	   
	}
	

    @When("^user select test well from left filter$")
    public void user_select_test_well_from_left_filter() throws Throwable 
   {
    //leftRigAndWellFilterPage.select_RigWellFromLeftFilter("rt_norm_gc_743_1min");
    	leftRigAndWellFilterPage.select_dropdown_RigWellFromFilter();
    Reporter.addStepLog("User has selected test well 'ctest_wcj22_15mins' from left filter");
   }
    
    
    @Then("^accept the alert which popup to allow mutiple download of file$")
    public void accept_the_alert_which_popup_to_allow_mutiple_download_of_file() throws Throwable
    {
    	for(int i=0; i<=2;i++){
			  try{
       AlertHandelingUtility.clkToJavaScriptAlert();
       break;
			  }
			  catch(Exception e){
			     Log.info(e.getMessage());
			     System.out.println("clkTo_Arrow to close: " + e.getMessage());
			  }
		 }
    }
    
    @When("^user click on dashboard option at top left of the application$")
    public void user_click_on_dashboard_o_ption_at_top_left_of_the_application() throws Throwable 
    {
    	timeAndHourPage.clkToDisplyDashboardOptions();
    	Log.info("click action performed on display dashbaord option");
    	
    }

    @Then("^select time and date from time and hour filter$")
    public void select_time_and_date_from_time_and_hour_filter() throws Throwable 
    {
    	timeAndHourPage.sdd_TimeAndHourToChose("2020-2-17 14:00 to 2020-02-17 14:01");
    	Log.info("Well test_wcj22_15min is selected from test well");
    	
    	
    }
    
    @Then("^select time and date from time and hour filter for two mins$")
    public void select_time_and_date_from_time_and_hour_filter_for_two_mins() throws Throwable 
    {
    	timeAndHourPage.sdd_TimeAndHourToChose("2020-2-17 14:00 to 2020-02-17 14:02");
    	Log.info("Well test_wcj22_15min is selected from test well");
    	
    	
    }
    
    @Then("^select time and date from time and hour filter to check hide and dispaly functionality$")
    public void select_time_and_date_from_time_and_hour_filter_to_check_hide_and_dispaly_functionality() throws Throwable {
    	timeAndHourPage.sdd_TimeAndHourToChose("2020-2-01 14:00 to 2020-02-01 14:02");
    }
    @Then("^click on export arrow to close the dropdown of file download$")
    public void click_on_export_arrow_to_close_the_dropdown_of_file_download() throws Throwable 
    {
    	
    	wms1_DataExportPage.clk_track01_ExportArrow();
    }
    	

	@Then("^user should be on WMS one screen with test well selected with certain time interval$")
	public void user_should_be_on_WMS_one_screen_with_test_well_selected_with_certain_time_interval() throws Throwable
	{
	    Reporter.addStepLog("User is on WMS1 dashboard with test well and time inteval selected as '2020-02-05 14:00 to 2020-02-05 14:10'");
	}
}
