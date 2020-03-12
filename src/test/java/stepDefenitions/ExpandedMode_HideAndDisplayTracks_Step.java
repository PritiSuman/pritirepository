package stepDefenitions;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;

import com.cucumber.listener.Reporter;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.WMS1_ExpandPage;
import pageObjects.WMS1_HoverPage;
import pageObjects.WMS1_NormalDataExportPage;
import selenium.Log;
import pageObjects.LayoutPage;
import pageObjects.ScreenCaptureUtilityPage;
import pageObjects.WMS1_ChartOptionsPage;


public class ExpandedMode_HideAndDisplayTracks_Step 
{
	
	WebDriver driver;
	TestContext testContext;
	WMS1_ExpandPage wms1_ExpandPage;
	ScreenCaptureUtilityPage screenCaptureUtilityPage;
	ITestContext contexts;
	LayoutPage layoutPage ;
	WMS1_ChartOptionsPage wms1_ChartOptionsPage;
	WMS1_NormalDataExportPage wms1normalmodepage;
	WMS1_HoverPage wms1_HoverPage;
	
	public ExpandedMode_HideAndDisplayTracks_Step (TestContext context)
	{
		
		testContext =context;
		wms1_ExpandPage = testContext.getPageObjectManagers().getWMS1_ExpandPage();
		screenCaptureUtilityPage=testContext.getPageObjectManagers().getScreenCaptureUtilityPage();
		layoutPage = testContext.getPageObjectManagers().getLayoutPage();
		wms1normalmodepage = testContext.getPageObjectManagers().getWMS1_DataExportPage();
		wms1_HoverPage = testContext.getPageObjectManagers().getWMS1_Page();
		wms1_ChartOptionsPage=testContext.getPageObjectManagers().getWMS1_ChartOptionsPage();
	}
	
	/**
	 * RegressionTest_05_01_Hide track at expanded mode
	 *
	 */
	
	
	
	@Then("^click at expanded mode link for track one$")
	public void click_at_expanded_mode_link_for_track_one() throws Throwable 
	{
		wms1_ExpandPage.clk_btn_Expand_Track1();
	}
	
	@Then("^user click hide track for track one at expanded mode$")
	public void user_click_hide_track_for_track_one_at_expanded_mode() throws Throwable 
	{
		Thread.sleep(1000);
		wms1_ChartOptionsPage.clkTo_HideChartAtTrack_1_ExpandedMode();
		Reporter.addStepLog("Click action on Hide Chart Option is performed");
		Log.info("Click action on Hide Chart Option is performed");
		Thread.sleep(3000);
		screenCaptureUtilityPage.takeScreenShotoImprove("track-1_Hidden_expanded_Mode", wms1normalmodepage.track_OPMode);
		Log.info("Screen shot taken once track1 screen is hidden in expanded mode");
		Reporter.addStepLog("screen shots taken after track1 is hidden at expanded mode");
		String imagePath = (System.getProperty("user.dir")+ "\\src\\images\\screenshots\\track-1_Hidden_expanded_Mode.png");
		String imagePath1 = (System.getProperty("user.dir")+ "\\src\\images\\baseline\\track-1_Hidden_baseline_expanded.png");
		Reporter.addScreenCaptureFromPath(imagePath, "track-1_Hidden_expanded_Mode");
		Log.info("Image of track1 hidden at expanded mode is added to report");
		Reporter.addScreenCaptureFromPath(imagePath1, "track-1_Hidden_baseline_expanded");
		Log.info("Image of baseline track1 is added to report");
	}

	
	
	@Then("^Expanded Track one should be hidden same as normal mode hidden track$")
	public void Expanded_track_one_should_be_hidden_hidden_track() throws Throwable 
	{
		wms1_ChartOptionsPage.validate_Track_01_NotDisplayed();
		Log.info("track1 is not displayed");
		screenCaptureUtilityPage.validateScreenShotWithBaselineImage("track-1_Hidden_baseline_expanded", "track-1_Hidden_expanded_Mode");
		Log.info("Actual screen shot is validated with baseline screenshot of hidden  track1");
		Reporter.addStepLog("screenshot with hidden track1 at expanded mode is matched with baseline image of hidden track1");
	}
	
	
	/**
	 * RegressionTest_07_Test case_01_Hide and restore Track one with pressing restore
	 *
	 */
	   
	  @ When("^click on restore button at layout prefernces for expanded Mode$")
	   public void click_on_restore_button_at_layout_prefernces_for_expanded_Mode() throws Throwable 
	   {
		    layoutPage.Restore_Hidden_TrackBy_Restore_default_Setting();
		    Log.info("Track hidden in expended mode is restored by clicking on restore default setting");
			Reporter.addStepLog("Restore button clicked and track 1 is restored at its original place");
			Thread.sleep(4000);
			screenCaptureUtilityPage.takeScreenShotoImprove("Track-1-original_restore_expanded_Mode", wms1normalmodepage.track_OPMode);
			Log.info("Actual screen shot is validated with baseline screenshot of track1 when restored after default restore setting");
			Reporter.addStepLog("screen shots taken after restore button applied and track1 is displayed at its original place for expanded mode");
			String imagePath  = (System.getProperty("user.dir")+ "\\src\\images\\baseline\\Track-1-original_baseline_Restore_normal_Mode.png");
			Reporter.addScreenCaptureFromPath(imagePath, "Track-1-original_baseline_Apply_normal_Mode");
	   }

	   @Then("^Track one should be visible at its original place for restore default setting for expanded Mode$")
	   public void track_one_should_be_visible_at_its_original_place_for_restore_default_setting_for_expanded_Mode() throws Throwable {
		  
			screenCaptureUtilityPage.validateScreenShotWithBaselineImage("Track-1-original_baseline_Restore_Expanded_Mode", "Track-1-original_restore_expanded_Mode");
			Reporter.addStepLog("screenshot with restored track1 is matched with baseline image of restored track apply clicking restor default setting");
	   }
	   
	   
	   /**
		 * RegressionTest_07_TestCase_02_Hide and restore Track one with pressing apply button
		 *
		 */

	   @When("^click on Layout Prferences with clicking on group one and press apply for expanded mode$")
	   public void click_on_Layout_Prferences_with_clicking_on_group_one_and_press_apply_for_expanded_mode() throws Throwable {
		   layoutPage.Restore_Hidden_TrackBy_Check_Group_AndAppy_Btn();
			Reporter.addStepLog("Apply button clicked and track 1 is restored at its original place");
			Thread.sleep(4000);
			screenCaptureUtilityPage.takeScreenShotoImprove("Track-1-original_Apply_expanded_Mode", wms1normalmodepage.track_OPMode);
			Reporter.addStepLog("screen shots taken after Apply button is applied and track1 is displayed at its original place");
			String imagePath  = (System.getProperty("user.dir")+ "\\src\\images\\screenshots\\Track-1-original_Apply_expanded_Mode.png");
			Reporter.addScreenCaptureFromPath(imagePath, "Track-1-original_Apply_expanded_Mode");
	   }

	   @Then("^Track one should be visible at its original place after pressing apply button for expanded Mode$")
	   public void track_one_should_be_visible_at_its_original_place_after_pressing_apply_button_for_expanded_Mode() throws Throwable {
		   screenCaptureUtilityPage.validateScreenShotWithBaselineImage("Track-1-original_baseline_Apply_expanded_Mode", "Track-1-original_Apply_expanded_Mode");
		   Reporter.addStepLog("screenshot with restored track1 is matched with baseline image of restored track when apply button is pressed");
	   }
	   
	   
	   /**
		 * 
		 * Regression Test 08_Hide Op Mode
		 */
	   
	   @When("^click at expanded mode link for OP Mode$")
	   public void click_at_expanded_mode_link_for_OP_Mode() throws Throwable
	   {
		   wms1_ExpandPage.clk_btn_Expand_OPMode();
		   Log.info("Click action performed on the expand button of track OP mode");
	   }

	   @When("^user click hide track for OP Mode at expanded mode$")
	   public void user_click_hide_track_for_OP_Mode_at_expanded_mode() throws Throwable 
	   {

		   wms1_ChartOptionsPage.clkTo_HideChartAtTrack_OPMode();
		   Reporter.addStepLog("Click action on Hide Chart Option ofmOP Mode is performed");
			Log.info("Click action on Hide Chart Option of OP Mode  is performed");
			Thread.sleep(3000);
			screenCaptureUtilityPage.takeScreenShotoImprove("opmodeode_Hidden_expanded_Mode", wms1normalmodepage.track_OPMode);
			Log.info("Screen shot taken once OPMode screen is hidden in expanded mode");
			Reporter.addStepLog("screen shots taken after OPMode is hidden at expanded mode");
			/*String imagePath = (System.getProperty("user.dir")+ "\\src\\images\\screenshots\\opmode_Hidden_expanded_Mode.png");
			String imagePath1 = (System.getProperty("user.dir")+ "\\src\\images\\baseline\\opmode_Hidden_baseline_expanded.png");
			Reporter.addScreenCaptureFromPath(imagePath, "opmode_Hidden_expanded_Mode");
			Log.info("Image of OPMode hidden at expanded mode is added to report");
			Reporter.addScreenCaptureFromPath(imagePath1, "opmode_Hidden_baseline_expanded");
			Log.info("Image of baseline OPMode is added to report");*/
	   }

	   @Then("^Expanded OP Mode should be hidden same as normal mode hidden track$")
	   public void expanded_OP_Mode_should_be_hidden_same_as_normal_mode_hidden_track() throws Throwable 
	   {
	       
	   }


}
