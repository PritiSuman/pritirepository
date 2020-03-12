package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.cucumber.listener.Reporter;

import selenium.Log;
import selenium.Wait;

public class WMS1_RigActivityPage {
	
	Actions action;
	 WebDriver driver;
	 WMS1_NormalDataExportPage  wms1normalmodepage;
	 String rigtextWithlegend;
	 String rigtextWithOPMode;
	 
	 
	public WMS1_RigActivityPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how = How.XPATH, using = ".//ul[contains(@class, 'dashboard-menu dashboard-menu-view')]/descendant::div[contains(@class, 'opmode')]")
	public WebElement display_RigActivityAtTop;
	
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-568 widget-container')]/descendant::div[contains(@class, 'widget-axis operation-mode-legend vertical operation-mode-widget chart-legend')]")
    public WebElement legendbox_OPMode;
	
	
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-568')]/descendant::div[contains(@class, 'operation-mode-multiple-charts vertical')]")
	public WebElement vertical_chart_OPMODE;
	
	
	
	
	public void hoverTo_display_RigActivityAtTop()
	{
		wms1normalmodepage = new  WMS1_NormalDataExportPage(driver);
		for(int i=0; i<=2;i++){
			  try{
				  
				 Wait.untilVisibilityOfTrack(driver, wms1normalmodepage.track_OPMode);
				  Log.info("Wait is applied until" + display_RigActivityAtTop.getText() + "not visible");
				   action =  new Actions(driver);
				  action.moveToElement(display_RigActivityAtTop).build().perform();
				  Thread.sleep(1000);
				  
				  
			     break;
			  }
			  catch(Exception e){
			     Log.info(e.getMessage());
			     System.out.println("OP Mode is taking more time than expected time to display: " + e.getMessage());
			     Log.info("OP Mode taking more time than expected time to display");
			     Reporter.addStepLog("OP Modeis taking more time than expected time to display");
			  }
			}
	}




public void hoverTo_ChartOPMODE()
{
	wms1normalmodepage = new  WMS1_NormalDataExportPage(driver);
	for(int i=0; i<=2;i++){
		  try{
			  
			 Wait.untilVisibilityOfTrack(driver, wms1normalmodepage.track_OPMode);
			  Log.info("Wait is applied until" + vertical_chart_OPMODE.getText() + "not visible");
			   action =  new Actions(driver);
			  action.moveToElement(vertical_chart_OPMODE).build().perform();
			  Thread.sleep(2000);
			  
			  
		     break;
		  }
		  catch(Exception e){
		     Log.info(e.getMessage());
		     System.out.println("OP Mode is taking more time than expected time to display: " + e.getMessage());
		     Log.info("OP Mode is taking more time than expected time to display");
		     Reporter.addStepLog("OP Mode is taking more time than expected time to display");
		  }
		}
}

public boolean isRigTextmatchesWithOPModeText()
{
	boolean flag = false;
	hoverTo_display_RigActivityAtTop();
	rigtextWithOPMode = display_RigActivityAtTop.getAttribute("title");
	//rigtextWithOPMode = "priti";
	
	for(int i=0; i<=1;)
	{
	rigtextWithlegend = legendbox_OPMode.getText();
		
	 break;
	 
     }

System.out.println("rigtextWithOPMode : " +rigtextWithOPMode);
System.out.println("rigtextWithlegend : " +rigtextWithlegend);

if (rigtextWithlegend.contains(rigtextWithOPMode))
{
	Reporter.addStepLog("RigActivityText Matches with OPModeRig text" );
	Reporter.addStepLog("RigActivityTextAtTop : " +rigtextWithOPMode  + "and " +  "OpModeText" +rigtextWithlegend);
	
	return true;
	
	
}
else
{
	Reporter.addStepLog("RigActivityText does not Matches with OPModeRig text");
    return flag;
}
}

public void verify_RigTextWithOPModeText()
{
	
	Assert.assertTrue(isRigTextmatchesWithOPModeText(), "rigtext at top is not matching with rig text at op mode");
}


}









