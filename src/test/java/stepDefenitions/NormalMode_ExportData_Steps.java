package stepDefenitions;



import java.io.File;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import com.cucumber.listener.Reporter;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.FileReaderManager;
import pageObjects.WMS1_NormalDataExportPage;
import selenium.FileReadingUtility;
import selenium.PDFFileReaderUtility;



public class NormalMode_ExportData_Steps {
	WebDriver driver;
	TestContext testContext;
	WMS1_NormalDataExportPage wms1_DataExportPage;
	String downloadFilePath = (System.getProperty("user.dir")+ FileReaderManager.getInstance().getConfiFileReader().getdownloadFilePath());
	
	
	public NormalMode_ExportData_Steps(TestContext context)
	{
		
		testContext =context;
		wms1_DataExportPage= testContext.getPageObjectManagers().getWMS1_DataExportPage();
	}
	
	
	
    /**
	 * RegressionTest_01_TestCase_01_Validate CSV export functionality for track 01
	 *
	 */

	@Then("^user click on export button in track One to download CSV plain file$")
	public void user_click_on_export_button_in_track_One_to_download_CSV_plain_file() throws Throwable 
	{
		
		wms1_DataExportPage.clkToDownloadFileIn_Track01_CSVPlainFormat();
      
    	Reporter.addStepLog("User has clicked on CSV plain link for track 01' at WMS1 Dashboard");
		Thread.sleep(2000);
	 }

	


   @Then("^verify that user is successfully able to export data in CSV-plain format for track one$")
   public void verify_that_user_is_successfully_able_to_export_data_in_CSV_plain_format_for_track_one() throws Throwable
	
     {
        //FileReadingUtility.verify_DownloadWithFile_Extension(".csv");
        Reporter.addStepLog("File download with the name of :  " + FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName() +"  (with extension of .csv)" );
       
	}
   

      @Then("^Validate that size of file downloaded in CSV plain format is same as baseline file$")
      public void validate_that_size_of_file_downloaded_in_CSV_plain_format_is_same_as_baseline_file() throws Throwable
      {
    	long  expectedSize =  201149 ;
    	long actualSize    =  FileReadingUtility.getLatestFilefromDir(downloadFilePath).length();
    	//System.out.println("size of file for csv plain 1  " +  FileReadingUtility.getfile(downloadFilePath, ".csv").length());
    	System.out.println("size of file csv plain     2  " + FileReadingUtility.getLatestFilefromDir(downloadFilePath).length());
    	 FileReadingUtility.verify_SizeOfFile(expectedSize,  actualSize);
       	 Reporter.addStepLog("actual size of file with extension .csv and name " +FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName() +  actualSize );
      
      }
	
	/**
	 * RegressionTest_01_TestCase_02_Validate CSV-gZIP export functionality for track 02
	 *
	 */
	
	@Then("^user click on export button in track two to download CSV gZIP file$")
	public void user_click_on_export_button_in_track_two_to_download_CSV_gZIP_file() throws Throwable
	{
		wms1_DataExportPage.clkToDownloadFileIn_Track02_CSVgZIPFormat();
		Thread.sleep(5000);
		Reporter.addStepLog("User has clicked on CSV gZIP link for track 02'at WMS1 Dashboard");
	}

	@Then("^verify that user is successfully able to export data in CSV-gZIP format for track two$")
	public void verify_that_user_is_successfully_able_to_export_data_in_CSV_gZIP_format_for_track_two() throws Throwable
	{
		
       // FileReadingUtility.verify_DownloadWithFile_Extension(".csv.gz");
		Reporter.addStepLog("Latest File download with the name of :  " + FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName() + "  (with extension of .csv.gz)" );
	  
	}
	
	@Then("^Validate that size of file downloaded in CSV gZIP format is same as baseline file$")
	public void validate_that_size_of_file_downloaded_in_CSV_gZIP_format_is_same_as_baseline_file() throws Throwable 
	{
		long expectedSize =  9823;
   	    long actualSize   =  FileReadingUtility.getLatestFilefromDir(downloadFilePath).length();
   	  // System.out.println("size of file .csv.gz 1 " +  FileReadingUtility.getfile(downloadFilePath, ".csv.gz").length());
 	   System.out.println("size of file .csv.gz 2 " + FileReadingUtility.getLatestFilefromDir(downloadFilePath).length());
 	  FileReadingUtility.verify_SizeOfFile(expectedSize,  actualSize);
		Reporter.addStepLog("Actual size of file with extension .csv.gzip and name " +FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName()+ " is : " +actualSize );
		
	}

	
	/**
	 * RegressionTest_01_TestCase_03_Validate CSV-ZIP  export functionality for OPMode
	 *
	 */
	

   @When("^user click on export button in track OPMode to download CSV ZIP file$")
   public void user_click_on_export_button_in_track_OPMode_to_download_CSV_ZIP_file() throws Throwable
	{
		wms1_DataExportPage.clkToDownloadFileIn_OPMode_CSVZIPFormat();
		Thread.sleep(5000);
		Reporter.addStepLog("User has clicked on CSV ZIP link for 'OP Mode' at WMS1 Dashboard");
		
	}
   
   @Then("^verify that user is successfully able to export data in CSV-ZIP format for track OPMode$")
   public void verify_that_user_is_successfully_able_to_export_data_in_CSV_ZIP_format_for_track_OPMode() throws Throwable 
	{
		//FileReadingUtility.verify_DownloadWithFile_Extension(".csv.zip");
		
		Reporter.addStepLog("Latest File download with the name  :  "  + FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName()
				+ "  (with extension of '.zip')");
  }
   
   @Then("^Validate that size of file downloaded in CSV ZIP format is same as baseline file$")
	public void validate_that_size_of_file_downloaded_in_CSV_ZIP_format_is_same_as_baseline_file() throws Throwable
    {
	   
	   long expectedSize =  1170 ;
  	   long actualSize =  FileReadingUtility.getLatestFilefromDir(downloadFilePath).length();
  	  // System.out.println("size of file .csv.zip 1" +  FileReadingUtility.getTheNewestFile(downloadFilePath, ".csv.zip"));
 	   System.out.println("size of file .csv.zip  2: " + FileReadingUtility.getLatestFilefromDir(downloadFilePath).length());
 	  FileReadingUtility.verify_SizeOfFile(expectedSize,  actualSize);
	   Reporter.addStepLog(" actual size of file with extension .csv.zip and name " +FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName()+ " is :   " +actualSize  );
	   
	}
   
   /**
	 * RegressionTest_01_TestCase_04_Validate JSON export functionality for track01
	 *
	 */
   @When("^user click on export button in track One to download JSON plain file$")
   public void user_click_on_export_button_in_track_One_to_download_JSON_plain_file() throws Throwable
   {
	   wms1_DataExportPage.clkToDownloadFileIn_Track01_JSONPlainFormat();
	   Thread.sleep(5000);
	   Reporter.addStepLog("User has clicked on JSON Plain link for 'Track01' at WMS1 Dashboard");
   }

   @Then("^verify that user is successfully able to export data in JSON-plain format for track one$")
   public void verify_that_user_is_successfully_able_to_export_data_in_JSON_plain_format_for_track_one() throws Throwable
   {
	//FileReadingUtility.verify_DownloadWithFile_Extension(".json");
	//System.out.println("size of file  .json 1 " +  FileReadingUtility.getfile(downloadFilePath, ".json").length());
	System.out.println("size of file .json 2 " + FileReadingUtility.getLatestFilefromDir(downloadFilePath).length());
		
	 Reporter.addStepLog("actual File download with the name  :  "  + FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName()
				+ "  (with extension of '.json')");  
   }
   
   @Then("^Validate that size of file downloaded in JSON plain format is same as baseline file$")
   public void validate_that_size_of_file_downloaded_in_JSON_plain_format_is_same_as_baseline_file() throws Throwable 
   {
	   long expectedSize =  341306;
  	   long actualSize =  FileReadingUtility.getLatestFilefromDir(downloadFilePath).length();
  	 System.out.println(actualSize);
  	 FileReadingUtility.verify_SizeOfFile(expectedSize,  actualSize);
  	   Reporter.addStepLog(" actual size of file with extension .json and name " +FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName()+ " is :   " +actualSize );
      
   }
   
   

     /**
	 * RegressionTest_01_TestCase_05_Validate JSON export functionality for Track02
	 *
	 */

   @When("^user click on export button in track two to download JSON gZIP file$")
   public void user_click_on_export_button_in_track_two_to_download_JSON_gZIP_file() throws Throwable 
   {
	   wms1_DataExportPage.clkToDownloadFileIn_Track02_JSONPgZIPFormat();
	   Thread.sleep(5000);
	   Reporter.addStepLog("User has clicked on JSON gZIP link for 'Track02' at WMS1 Dashboard");
   }

   @Then("^verify that user is successfully able to export data in JSON-gZIP format for track two$")
   public void verify_that_user_is_successfully_able_to_export_data_in_JSON_gZIP_format_for_track_two() throws Throwable
   {
	   //FileReadingUtility.verify_DownloadWithFile_Extension(".json.gz");
	  // System.out.println("size of file .json.gz 1 " +  FileReadingUtility.getfile(downloadFilePath, ".json.gz").length());
 	   System.out.println("size of file .json.gz 2 " + FileReadingUtility.getLatestFilefromDir(downloadFilePath).length());
		Reporter.addStepLog("actual File download with the name  :  "  + FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName()
					+ "  (with extension of '.json.gz')");  
	   }
   
   

   @Then("^Validate that size of file downloaded in JSON gZIP format is same as baseline file$")
   public void validate_that_size_of_file_downloaded_in_JSON_gZIP_format_is_same_as_baseline_file() throws Throwable
   {
	   long expectedSize =  10116;
  	   long actualSize =  FileReadingUtility.getLatestFilefromDir(downloadFilePath).length();
  	 FileReadingUtility.verify_SizeOfFile(expectedSize,  actualSize);
  	   Reporter.addStepLog(" actual size of file with extension .json.gz and name " +FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName()+ " is :   " +actualSize  );
      
   }
   
  
   

   /**
	 * RegressionTest_01_TestCase_06_Validate JSON export functionality for OPMode
	 *
	 */
   @When("^user click on export button in track OPMode to download JSON ZIP file$")
   public void user_click_on_export_button_in_track_OPMode_to_download_JSON_ZIP_file() throws Throwable 
   {
	   wms1_DataExportPage.clkToDownloadFileIn_OPMode_JSONPZIPFormat();
	   Thread.sleep(5000);
	   Reporter.addStepLog("User has clicked on JSON ZIP link for 'OPMode' at WMS1 Dashboard");
	   
   }

   @Then("^verify that user is successfully able to export data in JSON-ZIP format for track OPMode$")
   public void verify_that_user_is_successfully_able_to_export_data_in_JSON_ZIP_format_for_track_OPMode() throws Throwable 
   {
	   //FileReadingUtility.verify_DownloadWithFile_Extension(".json.zip");
	  // System.out.println("size of file .json.zip 1 " +  FileReadingUtility.getfile(downloadFilePath, ".json.zip").length());
 	   System.out.println("size of file .json.zip 2 " + FileReadingUtility.getLatestFilefromDir(downloadFilePath).length());
		
		Reporter.addStepLog("File download with the name of :  "  + FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName()
					+ "  (with extension of '.json.zip') at OPMOde track");  
   }
   

   @Then("^Validate that size of file downloaded in JSON ZIP format is same as baseline file$")
   public void validate_that_size_of_file_downloaded_in_JSON_ZIP_format_is_same_as_baseline_file() throws Throwable 
   {
	   long expectedSize =  1203;
  	   long actualSize =  FileReadingUtility.getLatestFilefromDir(downloadFilePath).length();
  	 System.out.println(actualSize);
  	 FileReadingUtility.verify_SizeOfFile(expectedSize,  actualSize);
  	   Reporter.addStepLog(" actual size of file with extension .json.zip and name " +FileReadingUtility.getfile(downloadFilePath, ".json.zip").getName()+ " is :   " +actualSize );
	   
   }
   
   
 
   
   
   /**
	 * RegressionTest_01_TestCase_07_Validate Excel export functionality for Track 01
	 *
	 */
   
   @When("^user click on export button in track One to download Excel plain file$")
   public void user_click_on_export_button_in_track_One_to_download_Excel_plain_file() throws Throwable
   {
	   wms1_DataExportPage.clkToDownloadFileIn_Track01_ExcelPlainFormat();
	   Thread.sleep(5000);
	   Reporter.addStepLog("User has clicked on Excel Plain link for 'Track01' at WMS1 Dashboard");
      
   }

   @Then("^verify that user is successfully able to export data in Excel-plain format for track one$")
   public void verify_that_user_is_successfully_able_to_export_data_in_Excel_plain_format_for_track_one() throws Throwable
   {
	   //FileReadingUtility.verify_DownloadWithFile_Extension(".xlsx");
	  // System.out.println("size of file  .xlsx 1 " +  FileReadingUtility.getfile(downloadFilePath, ".xlsx").length());
 	   System.out.println("size of file .xlsx 2 " + FileReadingUtility.getLatestFilefromDir(downloadFilePath).length());
		
		Reporter.addStepLog("File download with the name of :  "  + FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName()
					+ "  (with extension of '.xlsx') at track1");  
  } 
   
   @Then("^Validate that size of file downloaded in Excel plain format is same as baseline file$")
   public void validate_that_size_of_file_downloaded_in_Excel_plain_format_is_same_as_baseline_file() throws Throwable 
   {
	   long expectedSize =  125509 ;
  	   long actualSize =  FileReadingUtility.getLatestFilefromDir(downloadFilePath).length();
  	   System.out.println(actualSize);
  	   FileReadingUtility.verify_SizeOfFile(expectedSize,  actualSize);
  	   Reporter.addStepLog(" actual size of file with extension .xlsx and name " +FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName() +":" +actualSize);
   }
   
   
   /**
  	 * RegressionTest_01_TestCase_08_Validate Excel export functionality for Track 02
  	 *
  	 */

   @When("^user click on export button in track two to download Excel gZIP file$")
   public void user_click_on_export_button_in_track_two_to_download_Excel_gZIP_file() throws Throwable 
   {
	   wms1_DataExportPage.clkToDownloadFileIn_Track02_ExcelgZIPFormat();
	   Thread.sleep(5000);
	   Reporter.addStepLog("User has clicked on Excel gZIP link for 'Track02' at WMS1 Dashboard");
   }

   @Then("^verify that user is successfully able to export data in Excel-gZIP format for track two$")
   public void verify_that_user_is_successfully_able_to_export_data_in_Excel_gZIP_format_for_track_two() throws Throwable
   {
	   //FileReadingUtility.verify_DownloadWithFile_Extension(".xlsx.gz");
	  // System.out.println("size of file .xlsx.gz 1 " +  FileReadingUtility.getfile(downloadFilePath, ".xlsx.gz").length());
 	   System.out.println("size of file .xlsx.gz 2 " + FileReadingUtility.getLatestFilefromDir(downloadFilePath).length());
		
		Reporter.addStepLog("File download with the name of :  "  + FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName() +"with extension of .xlsx.gz) for track 02");
      
   }
   @Then("^Validate that size of file downloaded in Excel gZIP format is same as baseline file$")
   public void validate_that_size_of_file_downloaded_in_Excel_gZIP_format_is_same_as_baseline_file() throws Throwable
   {
	   long expectedSize =  66234 ;
  	   long actualSize =  FileReadingUtility.getLatestFilefromDir(downloadFilePath).length();
  	   System.out.println(actualSize);
  	   FileReadingUtility.verify_SizeOfFile(expectedSize,  actualSize);
  	   Reporter.addStepLog(" actual size of file with extension .xlsx.gz and name " +FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName()+ " is :   " +actualSize );
   }
   
   /**
  	 * RegressionTest_01_TestCase_09_Validate Excel export functionality for OPMode
  	 *
  	 */

   @When("^user click on export button in track OPMode to download Excel ZIP file$")
   public void user_click_on_export_button_in_track_OPMode_to_download_Excel_ZIP_file() throws Throwable 
   {
	   wms1_DataExportPage.clkToDownloadFileIn_OPMode_ExcelZIPFormat();
	   Thread.sleep(5000);
	   Reporter.addStepLog("User has clicked on Excel ZIP link for 'OPMode' at WMS1 Dashboard");
   }

   @Then("^verify that user is successfully able to export data in Excel-ZIP format for track OPMode$")
   public void verify_that_user_is_successfully_able_to_export_data_in_Excel_ZIP_format_for_track_OPMode() throws Throwable 
   {
	  // FileReadingUtility.verify_DownloadWithFile_Extension(".xlsx.zip");
	   //System.out.println("size of file .xlsx.zip 1 " +  FileReadingUtility.getfile(downloadFilePath, ".xlsx.zip").length());
 	   System.out.println("size of file .xlsx.zip 2 " + FileReadingUtility.getLatestFilefromDir(downloadFilePath).length());
		
		Reporter.addStepLog("File download with the name of :  "  + FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName()
				+"  (with extension of .xlsx.zip) for OPMode");
      
   }
   
   @Then("^Validate that size of file downloaded in Excel-ZIP format is same as baseline file$")
   public void validate_that_size_of_file_downloaded_in_Excel_ZIP_format_is_same_as_baseline_file() throws Throwable
   {
	   long expectedSize =  9112;
  	   long actualSize =  FileReadingUtility.getLatestFilefromDir(downloadFilePath).length();
  	   System.out.println(actualSize);
  	   FileReadingUtility.verify_SizeOfFile(expectedSize,  actualSize);
  	    	  
  	   Reporter.addStepLog(" actual size of file with extension .xlsx.zip and name " +FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName()+ " is :   " +actualSize);
   }
   
   /**
 	 * RegressionTest_01_TestCase__10_Validate PNG export functionality for OP mMode
 	 *
 	 */

 
   @Then("^user click on export button in track OPMOde to download PNG ActualSize file$")
   public void user_click_on_export_button_in_track_OPMOde_to_download_PNG_ActualSize_file() throws Throwable
   {
	   wms1_DataExportPage.clkToDownloadFileIn_OPMode_PNGActualSizeFormat();
	   Thread.sleep(5000);
	   Reporter.addStepLog("User has clicked on PNG actual size link for 'OPMode' at WMS1 Dashboard");
       
   }

   @Then("^verify that user is successfully able to export data in PNG ActualSize format$")
   
   public void verify_that_user_is_successfully_able_to_export_data_in_PNG_ActualSize_format() throws Throwable 
   {
	   //FileReadingUtility.verify_DownloadWithFile_Extension(".png");
	   //System.out.println("size of file .png 1 " +  FileReadingUtility.getfile(downloadFilePath, ".png").length());
 	   System.out.println("size of file .png 2 " + FileReadingUtility.getLatestFilefromDir(downloadFilePath).length());
		
		Reporter.addStepLog("File download with the name of :  "  + FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName()
				+"  (with extension of .png) for OPMode");
     
   }
   
   @Then("^validate that downloaded PNG file is matching with saved PNG file$")
   public void validate_that_downloaded_PNG_file_is_matching_with_saved_PNG_file() throws Throwable {
	     
	   long expectedSize =   16466;
  	   long actualSize =  FileReadingUtility.getLatestFilefromDir(downloadFilePath).length();
  	   System.out.println(actualSize);
  	   FileReadingUtility.verify_SizeOfFile(expectedSize,  actualSize);
  	   Reporter.addStepLog(" actual size of file with extension .PNG and name " +FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName()+ " is :   " +actualSize );
   }


   
   
  /* /**
	 * RegressionTest_01_TestCase__11_Validate PDF export functionality for OP mMode
	 *
	 */

  /* @Given("^user click on export button OP Mode to download PDF Actual Size$")
   public void user_click_on_export_button_OP_Mode_One_to_download_PDF_Actual_Size() throws Throwable
   {
	   wms1_DataExportPage.clkToDownloadFileIn_OPMode_PDFActualSizeFormat();
	  
	   Reporter.addStepLog("User has clicked on PDF actual size link for 'OPMode' at WMS1 Dashboard") ;
	   
   }

@Then("^verify that user is successfully able to export data in PDF-ActualSize format for OPMode$")
public void verify_that_user_is_successfully_able_to_export_data_in_PDF_ActualSize_format_for_OPMode() throws Throwable
{
	FileReadingUtility.verify_DownloadWithFile_Extension(".pdf");
	//System.out.println("size of file .pdf 1 " +  FileReadingUtility.getfile(downloadFilePath, ".pdf").length());
	   System.out.println("size of file .pdf 2 " + FileReadingUtility.getLatestFilefromDir(downloadFilePath).length());
	
	Reporter.addStepLog("File download with the name of :  "  + FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName()
			+"  (with extension of .pdf) for OPMode"); 
}

@Then("^Validate that PDF file downloaded will match with saved PDF file for chosen Time for track OPMode$")
public void validate_that_PDF_file_downloaded_will_match_with_saved_PDF_file_for_chosen_Time_for_track_OPMode() throws Throwable
{
	String actual = FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName();
	System.out.println(actual);
}
*/

/**
 * RegressionTest_01_TestCase__11_Validate PDF export functionality for OP mMode
 *
 */

@When("^user click on export button in track OPMode to download PDF portrait orientation$")
public void user_click_on_export_button_in_track_OPMode_to_download_PDF_portrait_orientation() throws Throwable
{
	   wms1_DataExportPage.clkToDownloadFileIn_OPMode_PDFPortraitSizeFormat();
	   Thread.sleep(5000);
	   Reporter.addStepLog("User has clicked on PDF portrait size link for 'OPMode' at WMS1 Dashboard") ;
    
}

@Then("^verify that user is successfully able to export data in PDF portrait orientation for Track OPMode$")
public void verify_that_user_is_successfully_able_to_export_data_in_PDF_portrait_orientation_for_Track_OPMode() throws Throwable 
{
//FileReadingUtility.verify_DownloadWithFile_Extension(".pdf");
//System.out.println("size of file .pdf 1 " +  FileReadingUtility.getfile(downloadFilePath, ".pdf").length());
 System.out.println("size of file .pdf 2 " + FileReadingUtility.getLatestFilefromDir(downloadFilePath).length());
	
	Reporter.addStepLog("File download with the name of :  "  + FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName()
			+"  (with extension of .pdf) for OPMode"); 
}
   



@Then("^Validate that PDF portrait orientation file in downloaded will match with saved PDF file for chosen Time for track OPMode$")
public void validate_that_PDF_portrait_orientation_file_in_downloaded_will_match_with_saved_PDF_file_for_chosen_Time_for_track_OPMode() throws Throwable 
{
	/*String actual = FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName();
	System.out.println(actual);
	String diff = "OPMode_Portrait-diff";
	System.out.println(actual);
	Assert.assertTrue(new PDFFileReaderUtility().arePDFFilesEqual("OP MODE (2020-02-17 14_00 to 2020-02-17 14_01)", actual, diff)); 
	Reporter.addStepLog("Files are equal");*/
	

	   long expectedSize =   25649;
	   long actualSize =  FileReadingUtility.getLatestFilefromDir(downloadFilePath).length();
	   System.out.println(actualSize);
	   FileReadingUtility.verify_SizeOfFile(expectedSize,  actualSize);
	   Reporter.addStepLog(" actual size of file with extension .PDF and name " +FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName()+ " is :   " +actualSize );
}
	


/**
 * RegressionTest_01_TestCase__12_Validate PDF export functionality for track MeasuredDrilling(RigMechanical)Values-Purple
 *
 */


@Then("^user click on export button in track three to download PDF Landscape orientation$")
public void user_click_on_export_button_in_track_three_to_download_PDF_Landscape_orientation() throws Throwable {
	 wms1_DataExportPage.clkToDownloadFileIn_Track04_PDFLandScapeSizeFormat();
		
	   Thread.sleep(5000);
}

@Then("^verify that user is successfully able to export data in PDF Landscape orientation for Track three$")
public void verify_that_user_is_successfully_able_to_export_data_in_PDF_Landscape_orientation_for_Track_three() throws Throwable {
	Reporter.addStepLog("File download with the name of :  "  + FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName()
			+"  (with extension of .pdf) for track four");
}

@Then("^Validate that PDF Landscape orientation file in downloaded will match with saved PDF file for chosen Time for track three$")
public void validate_that_PDF_Landscape_orientation_file_in_downloaded_will_match_with_saved_PDF_file_for_chosen_Time_for_track_three() throws Throwable {
	   long expectedSize =   44413;
	   long actualSize =  FileReadingUtility.getLatestFilefromDir(downloadFilePath).length();
	   System.out.println(actualSize);
	   FileReadingUtility.verify_SizeOfFile(expectedSize,  actualSize);
	   Reporter.addStepLog(" actual size of file with extension .PDF and name " +FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName()+ " is :   " +actualSize );
	String actual = FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName();
	String diff = "group3_Landscape-diff";
	System.out.println(actual);
	Assert.assertTrue(new PDFFileReaderUtility().arePDFFilesEqual("group3 (2020-02-17 14_00 to 2020-02-17 14_01)", actual, diff)); 
	Reporter.addStepLog("Files are equal");
}



/**
 * RegressionTest_01_TestCase__13_Validate PDF export functionality for trackLaggedMud-borneMeasurement-Yellow-
 *
 */

@When("^user click on export button track two to download PDF Actual Size file$")
public void user_click_on_export_button_track_two_to_download_PDF_Actual_Size_file() throws Throwable 
{
	 wms1_DataExportPage.clkToDownloadFileIn_Track02_PDFActualSizeFormat();
		
	   Thread.sleep(5000);
}

@Then("^verify that user is successfully able to export data in PDF-ActualSize format for trac ktwo$")
public void verify_that_user_is_successfully_able_to_export_data_in_PDF_ActualSize_format_for_trac_ktwo() throws Throwable
{
	//FileReadingUtility.verify_DownloadWithFile_Extension(".pdf");
	//System.out.println("size of file .pdf 1 " +  FileReadingUtility.getfile(downloadFilePath, ".pdf").length());
	   System.out.println("size of file .pdf 2 " + FileReadingUtility.getLatestFilefromDir(downloadFilePath).length());
	
	Reporter.addStepLog("File download with the name of :  "  + FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName()
			+"  (with extension of .pdf) for track2"); 
   
}

@Then("^Validate that PDF file downloaded will match with saved PDF file for chosen Time for track two$")
public void validate_that_PDF_file_downloaded_will_match_with_saved_PDF_file_for_chosen_Time_for_track_two() throws Throwable 
{
	//String actual = FileReadingUtility.getfile(downloadFilePath, ".pdf").getName();
	String actual = FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName();
	String diff = "group2_Actual-diff";
	System.out.println(actual);
	Assert.assertTrue(new PDFFileReaderUtility().arePDFFilesEqual("group2 (2020-02-17 14_00 to 2020-02-17 14_01)", actual, diff)); 
	Reporter.addStepLog("Files are equal");
	
	   long expectedSize =   71621;
	   long actualSize =  FileReadingUtility.getLatestFilefromDir(downloadFilePath).length();
	   System.out.println(actualSize);
	   FileReadingUtility.verify_SizeOfFile(expectedSize,  actualSize);
	   Reporter.addStepLog(" actual size of file with extension .PDF and name " +FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName()+ " is :   " +actualSize );
}
	
	





   


   
}