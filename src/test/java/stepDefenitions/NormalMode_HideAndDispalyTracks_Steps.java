package stepDefenitions;

import java.io.File;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.ITestContext;

import com.aventstack.extentreports.ExtentTest;
import com.cucumber.listener.Reporter;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.FileReaderManager;
import managers.WebDriverManager;
import pageObjects.AlertPage;
import pageObjects.HomePage;
import pageObjects.InteliePage;
import pageObjects.LayoutPage;
import pageObjects.LeftRigAndWellFilterPage;
import pageObjects.LoginPage;
import pageObjects.ScreenCaptureUtilityPage;
import pageObjects.TimeAndHourPage;
import pageObjects.WMS1_ChartOptionsPage;
import pageObjects.WMS1_NormalDataExportPage;
import selenium.Wait;


public class NormalMode_HideAndDispalyTracks_Steps {
	
	WebDriver driver;
	TestContext testContext;
	LayoutPage layoutPage;
	ScreenCaptureUtilityPage screenCaptureUtilityPage;
	WMS1_ChartOptionsPage wms1_ChartOptionsPage;
	WMS1_NormalDataExportPage wms1normalmodepage;
	
	
	
	public NormalMode_HideAndDispalyTracks_Steps(TestContext context)
	{
		
		testContext =context;
		layoutPage = testContext.getPageObjectManagers().getLayoutPage();
		screenCaptureUtilityPage = testContext.getPageObjectManagers().getScreenCaptureUtilityPage();
		wms1_ChartOptionsPage = testContext.getPageObjectManagers().getWMS1_ChartOptionsPage();
		wms1normalmodepage = testContext.getPageObjectManagers().getWMS1_DataExportPage();
		
	}
	
	/**
	 * 
	 * Regression Test 04
	 */
	
	
	
	@Then("^user click hide track for track one at normal mode$")
	public void user_click_hide_track_for_track_one_at_normal_mode() throws Throwable 
	{
		//wms1_ChartOptionsPage.validate_Track01Displayed();
		
		wms1_ChartOptionsPage.clkTo_HideChartAtTrack_1();
		Reporter.addStepLog("Click action on Hide Chart Option is performed");
		Thread.sleep(2000);
	
		screenCaptureUtilityPage.takeScreenShotoImprove("track-1_Hidden_Normal_Mode", wms1normalmodepage.track_OPMode );
		Reporter.addStepLog("screen shots taken after track1 is hidden at normal mode");
		String imagePath = (System.getProperty("user.dir")+ "\\src\\images\\baseline\\track-1_Hidden_baseline_Normal.png");
		String imagePath1 = (System.getProperty("user.dir")+ "\\src\\images\\screenshots\\track-1_Hidden_Normal_Mode.png");
		Reporter.addScreenCaptureFromPath(imagePath, "track-1_Hidden_baseline_Normal");
		Reporter.addScreenCaptureFromPath(imagePath1, "track-1_Hidden_Normal_Mode");
		 
	}

	
	@Then("^Normal Track one should be hidden$")
	public void track_one_should_be_hidden() throws Throwable 
	{
		wms1_ChartOptionsPage.validate_Track_01_NotDisplayed();	
		screenCaptureUtilityPage.validateScreenShotWithBaselineImage("track-1_Hidden_baseline_Normal", "track-1_Hidden_Normal_Mode");
		Reporter.addStepLog("screenshot with hidden track1 is matched with baseline image of hidden track1");
	}
	
	
	
	/**
	 * 
	 * Regression Test 07_Testcase01
	 */

	@When("^click on restore button at layout prefernces for normal mode$")
	public void click_on_restore_button_at_layout_prefernces_for_normal_mode() throws Throwable
	{
		layoutPage.Restore_Hidden_TrackBy_Restore_default_Setting();
		Reporter.addStepLog("Restore button clicked and track 1 is restored at its original place");
		Thread.sleep(4000);
		screenCaptureUtilityPage.takeScreenShotoImprove("Track-1-original_restore_normal_Mode", wms1normalmodepage.track_OPMode);
		Reporter.addStepLog("screen shots taken after restore button applied and track1 is displayed at its original place");
		String imagePath  = (System.getProperty("user.dir")+ "\\src\\images\\screenshots\\Track-1-original_restore_normal_mode.png");
		String imagePath1 = (System.getProperty("user.dir")+ "\\src\\images\\baseline\\Track-1-original_baseline_normal_Mode.png");
		Reporter.addScreenCaptureFromPath(imagePath, "Track-1-original_restore_normal_mode");
		Reporter.addScreenCaptureFromPath(imagePath1, "Track-1-original_baseline_normal_Mode");
	}
	
	@Then("^Track one should be visible at its original place for restore default setting at normal mode$")
	public void track_one_should_be_visible_at_its_original_place_for_restore_default_setting_at_normal_mode() throws Throwable 
	  {
		wms1_ChartOptionsPage.validate_Track_01_Displayed();	
		screenCaptureUtilityPage.validateScreenShotWithBaselineImage("Track-1-original_baseline_Restore_normal_Mode", "Track-1-original_restore_normal_mode");
		Reporter.addStepLog("screenshot with restored track1 is matched with baseline image of restored track apply clicking restor default setting");
		
	  }

		
	/**
	 * 
	 * Regression Test 06_testcase_02
	 */

	
	@When("^click on Layout Prferences with clicking on group one and press apply for normal mode$")
	public void click_on_Layout_Prferences_with_clicking_on_group_one_and_press_apply_for_normal_mode() throws Throwable
	{
		layoutPage.Restore_Hidden_TrackBy_Check_Group_AndAppy_Btn();
		Reporter.addStepLog("Apply button clicked and track 1 is restored at its original place");
		Thread.sleep(3000);
		//screenCaptureUtilityPage.takeElementsScreenshot("Track-1-original_Apply_normal_Mode",wms1_ChartOptionsPage.Wms1_entire_Page , wms1normalmodepage.track_OPMode);
		screenCaptureUtilityPage.takeScreenShotoImprove("Track-1-original_Apply_normal_Mode", wms1normalmodepage.track_OPMode);
		Reporter.addStepLog("screen shots taken after Apply button is applied and track1 is displayed at its original place");
		String imagePath  = (System.getProperty("user.dir")+ "\\src\\images\\screenshots\\Track-1-original_Apply_normal_Mode.png");
		String imagePath1 = (System.getProperty("user.dir")+ "\\src\\images\\baseline\\Track-1-original_baseline_normal_Mode.png");
		Reporter.addScreenCaptureFromPath(imagePath1, "Track-1-original_baseline_normal_Mode");
		Reporter.addScreenCaptureFromPath(imagePath, "Track-1-original_Apply_normal_Mode");
	}
	
	

   @Then("^Track one should be visible at its original place after pressing apply button at normal mode$")
   public void track_one_should_be_visible_at_its_original_place_after_pressing_apply_button_at_normal_mode() throws Throwable
   {
		wms1_ChartOptionsPage.validate_Track_01_Displayed();
	   screenCaptureUtilityPage.validateScreenShotWithBaselineImage("Track-1-original_baseline_Apply_normal_Mode", "Track-1-original_Apply_normal_Mode");
	   Reporter.addStepLog("screenshot with restored track1 is matched with baseline image of restored track when apply button is pressed");
	
   }
   
   /**
	 * 
	 * Regression Test 08
	 */
   
   

   @When("^user click hide track for OPMode at normal mode$")
   public void user_click_hide_track_for_OPMode_at_normal_mode() throws Throwable 
   {
	
	   
	Thread.sleep(3000);
	
	wms1_ChartOptionsPage.clkTo_HideChartAtTrack_OPMode();
    Reporter.addStepLog("Click action on Hide Chart Option is performed");
	//screenCaptureUtilityPage.takeScreenShot("OPMode_Hidden_Normal_Mode", wms1normalmodepage.track_OPMode);
	Reporter.addStepLog("screen shots taken after track1 is hidden at normal mode");
	String imagePath = (System.getProperty("user.dir")+ "\\src\\images\\baseline\\track-1_Hidden_baseline_Normal.png");
	String imagePath1 = (System.getProperty("user.dir")+ "\\src\\images\\screenshots\\track-1_Hidden_Normal_Mode.png");
	Reporter.addScreenCaptureFromPath(imagePath, "track-1_Hidden_baseline_Normal");
	Reporter.addScreenCaptureFromPath(imagePath1, "track-1_Hidden_Normal_Mode");
	
	
   }

   @Then("^Normal OP Mode should be hidden$")
    public void normal_OP_Mode_should_be_hidden() throws Throwable 
   {
	   
	  // wms1_ChartOptionsPage.validate_TrackDisplayed();
	   
	   screenCaptureUtilityPage.validateScreenShotWithBaselineImage("track-1_Hidden_baseline_Normal", "track-1_Hidden_Normal_Mode");
	Reporter.addStepLog("screenshot with hidden track1 is matched with baseline image of hidden track1");
   }
		
	
	
	}
	







