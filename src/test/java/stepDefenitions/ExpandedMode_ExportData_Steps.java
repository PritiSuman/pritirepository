package stepDefenitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.cucumber.listener.Reporter;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import managers.FileReaderManager;
import pageObjects.AlertPage;
import pageObjects.HomePage;
import pageObjects.InteliePage;
import pageObjects.LeftRigAndWellFilterPage;
import pageObjects.LoginPage;
import pageObjects.TimeAndHourPage;
import pageObjects.WMS1_ExpandedDataExportPage;
import pageObjects.WMS1_NormalDataExportPage;
import selenium.FileReadingUtility;
import selenium.PDFFileReaderUtility;

public class ExpandedMode_ExportData_Steps {
	
	WebDriver driver;
	TestContext testContext;
	WMS1_ExpandedDataExportPage wms1_ExpandedDataExportPage;
	String downloadFilePath = (System.getProperty("user.dir")+ FileReaderManager.getInstance().getConfiFileReader().getdownloadFilePath());
	
	
	public ExpandedMode_ExportData_Steps (TestContext context)
	{
		
		testContext =context;
		wms1_ExpandedDataExportPage = testContext.getPageObjectManagers().getWMS1_ExpandedDataExportPage();
	}
	
	
	
	@Then("^user click on expand button at track OP Mode$")
	public void user_click_on_expand_button_at_track_OP_Mode() throws Throwable 
	{
		wms1_ExpandedDataExportPage.clkTo_OpenExpandedOPMode();
		
		
		
	   
	}
	
	@Then("^user click on expand button at track four$")
	public void user_click_on_expand_button_at_track_three() throws Throwable {
		wms1_ExpandedDataExportPage.clkTo_OpenExpandedTrack03();
	}
	
	 
	   /**
	     * RegressionTest_02_TestCase__01_Validate PNG export functionality for OP mMode in expanded mode
		 *
		 */

	@Then("^user click on export button in track OPMOde to download PNG ActualSize file in expanded mode$")
	public void user_click_on_export_button_in_track_OPMOde_to_download_PNG_ActualSize_file_in_expanded_moce() throws Throwable 
	{
		wms1_ExpandedDataExportPage.clkToDownloadFileIn_Expanded_OPMode_PNGActualSizeFormat();
		Thread.sleep(4000);
	}

	@Then("^verify that user is successfully able to export data in PNG ActualSize format in expanded fromat$")
	public void verify_that_user_is_successfully_able_to_export_data_in_PNG_ActualSize_format_in_expanded_fromat() throws Throwable 
	{
      // FileReadingUtility.verify_DownloadWithFile_Extension(".png");
		
		Reporter.addStepLog("File download with the name of :  "  + FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName()
			+"  (with extension of .png) for track-OPMode");
     
	    
	}
	
	@Then("^validate that exported file will match with bseline file in PNG format in expanded mode$")
	public void validate_that_exported_file_will_match_with_bseline_file_in_PNG_format_in_expanded_mode() throws Throwable
	{
		 long expectedSize =   8170;
	  	 long actualSize =  FileReadingUtility.getLatestFilefromDir(downloadFilePath).length();
	  	 System.out.println(actualSize);
	  	 FileReadingUtility.verify_SizeOfFile(expectedSize,  actualSize);
	  	 Reporter.addStepLog(" actual size of file downloaded in expanded mode with extension .PNG and name " +FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName()+ " is :   " +actualSize );
	}


/**
  * RegressionTest_02_TestCase__02_Validate PDF export functionality for track4 (Mud(Drilling Fluid)ParameterandMeasurement-Brown) in expanded mode
	 *
	 */
	
	@Then("^user click on export button in track four to download PDF ActualSize file in expanded mode$")
	public void user_click_on_export_button_in_track_three_to_download_PDF_ActualSize_file_in_expanded_mode() throws Throwable {
		
		wms1_ExpandedDataExportPage.clkToDownloadFileIn_Expanded_Track3_PDFActualSizeFormat();
		Thread.sleep(4000);
	}

	@Then("^verify that user is successfully able to export data in PDF ActualSize format in expanded mode for track four$")
	public void verify_that_user_is_successfully_able_to_export_data_in_PDF_ActualSize_format_in_expanded_mode_for_track_three() throws Throwable {

       // FileReadingUtility.verify_DownloadWithFile_Extension(".pdf");
		
		Reporter.addStepLog("File download with the name of :  "  + FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName()
				+"  (with extension of .pdf) for Mud(Drilling Fluid)ParameterandMeasurement-Brown");
	}
	
	@Then("^validate that exported file will match with bseline file in pdf format in expanded mode$")
	public void validate_that_exported_file_will_match_with_bseline_file_in_pdf_format_in_expanded_mode() throws Throwable
	{
		/*String actual = FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName();
		String diff = "group4_ActualSize-diff";
		Assert.assertTrue(new PDFFileReaderUtility().arePDFFilesEqual("group 4 (2020-02-17 14_00 to 2020-02-17 14_01)", actual, diff )); 
		System.out.println(actual);*/
		
		   long expectedSize =   35072;
		   long actualSize =  FileReadingUtility.getLatestFilefromDir(downloadFilePath).length();
		   System.out.println(actualSize);
		   FileReadingUtility.verify_SizeOfFile(expectedSize,  actualSize);
		   Reporter.addStepLog(" actual size of file with extension .PDF and name " +FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName()+ " is :   " +actualSize );
		  
		    String actual = FileReadingUtility.getfileWithFileNameFromdirectory ( downloadFilePath, "group 4 (2020-2-17 14_00 to 2020-02-17 14_01)").getName();
			String diff = "group4_Actual-diff";
			System.out.println(actual);
			Assert.assertTrue(new PDFFileReaderUtility().arePDFFilesEqual("group 4 (2020-2-17 14_00 to 2020-02-17 14_01)", actual, diff)); 
			Reporter.addStepLog("Files are equal");
	}
		
		
	    
	}




