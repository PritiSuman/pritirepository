package stepDefenitions;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;

import com.cucumber.listener.Reporter;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import managers.FileReaderManager;
import pageObjects.WMS1_RigActivityPage;


public class RigActivity_Step {
	
	WebDriver driver;
	TestContext testContext;
	ITestContext contexts;
	WMS1_RigActivityPage  rigActivityPage;
	
	
	public RigActivity_Step(TestContext context)
	{
		
		testContext =context;
		rigActivityPage = testContext.getPageObjectManagers().getWMS1_RigActivityPage();

		
	}
	
	//RegressionTest 20
	
	@Then("^Validate that Rig state text will match with OP Mode$")
	public void validate_that_Rig_state_text_will_match_with_OP_Mode() throws Throwable 
	{
		Thread.sleep(5000);
		 rigActivityPage.verify_RigTextWithOPModeText();
		
	}

	
	
	

}

