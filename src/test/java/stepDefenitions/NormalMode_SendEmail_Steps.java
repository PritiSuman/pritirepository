package stepDefenitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.cucumber.listener.Reporter;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.FileReaderManager;
import pageObjects.AlertPage;
import pageObjects.HomePage;
import pageObjects.InteliePage;
import pageObjects.LeftRigAndWellFilterPage;
import pageObjects.LoginPage;
import pageObjects.TimeAndHourPage;
import pageObjects.WMS1_ExpandedDataExportPage;
import pageObjects.WMS1_NormalDataExportPage;
import pageObjects.WMS1_NormalSendEmailPage;
import selenium.FileReadingUtility;
import selenium.PDFFileReaderUtility;


public class NormalMode_SendEmail_Steps {
	
	WebDriver driver;
	TestContext testContext;
	WMS1_NormalSendEmailPage wms1_NormalSendEmailPage;
	
	
	public NormalMode_SendEmail_Steps (TestContext context)
	{
		
		testContext =context;
		wms1_NormalSendEmailPage = testContext.getPageObjectManagers().getWMS1_NormalSendEmailPage();
		
		
	}
	
	

	/**
	 * RegressionTest_03_TestCase_01_Send email with PDF-portrait and PNG as attachment
	 *
	 */
	

@Then("^user click on send email functionality at OP mode$")
public void user_click_on_send_email_functionality_at_OP_mode() throws Throwable 
{
	wms1_NormalSendEmailPage.clk_link_SendEmail_Track01();
	Reporter.addStepLog("Click action is performed on  send email link");
}


@Then("^select field select the team  with valid value \"([^\"]*)\"$")
public void select_field_select_the_team_with_valid_value(String teamName) throws Throwable
{
	wms1_NormalSendEmailPage.dropdown_SelectTheTeams();
   
}

@Then("^provide valid subject for email subject and attachment name  as \"([^\"]*)\" and  \"([^\"]*)\"$")
public void provide_valid_subject_for_email_subject_and_attachment_name_as_and(String emailSubject, String attachmentName) throws Throwable
{
	emailSubject = "--TestAutomationEmail";
	attachmentName = "--testautomationAttachment";
	wms1_NormalSendEmailPage.type_EmailSubject(emailSubject);
	wms1_NormalSendEmailPage.type_attachmentName(attachmentName);
}

@Then("^write email body \"([^\"]*)\"$")
public void write_email_body(String emailBody) throws Throwable 
{
	emailBody = "-- This is a test email to test functionality of send email in WMS1 dashboard";
	//wms1_NormalSendEmailPage.txbx_EmailBodyToClear.clear();
	wms1_NormalSendEmailPage.type_EmailBody(emailBody);
}

@Then("^select PDF Portrait as attachment$")
public void select_PDF_Portrait_as_attachment() throws Throwable
{
	wms1_NormalSendEmailPage.clk_chkbx_attachmentTypePDF();
	wms1_NormalSendEmailPage.clk_chkbx_A4Portraitat();
    
}

@Then("^select PNG as attachment$")
public void select_PNG_as_attachment() throws Throwable
{
	wms1_NormalSendEmailPage.clk_chkbx_attachmentTypePNG();;
}

@Then("^click on send option$")
public void click_on_send_option() throws Throwable 
{
	wms1_NormalSendEmailPage.submit_btn_Send();
}

@Then("^Validate that email is sent successfully$")
public void validate_that_email_is_sent_successfully() throws Throwable {
    
}

	



}
