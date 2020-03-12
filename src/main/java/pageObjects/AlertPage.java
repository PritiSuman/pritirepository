package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.listener.Reporter;

import selenium.Log;
import selenium.Wait;

public class AlertPage {
	
	WebDriver driver;
	public AlertPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how = How.XPATH, using = "//label[@class='checkbox pull-right']")
	private WebElement chkbx_HideForEver;
	
	
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary pull-left']")
	private WebElement btn_OkGotIt;
	
	public void clickTo_chkbx_HideForEver()
	{

		//for(int i=0; i<=2;i++){
			  try{
				  
		Wait.untilVisible(driver, chkbx_HideForEver);
		Log.info("Wait is applied until check box HideForEver is not visible");
		chkbx_HideForEver.click();
		Log.info("Click action performed on check box of 'hide forever'");
		//Wait.untilJqueryIsDone(driver);
		// break;
		 
			  }
			  catch(Exception e){
			   System.out.println("clickTo_chkbx_HideForEver : " +e.getMessage());
			   Log.info("clickTo_chkbx_HideForEver : " +e.getMessage());
			  }
		//	}
		
	}

	
	public void clickTo_btn_OkGotIt()
	{
		//for(int i=0; i<=2;i++){
			  try{
		Wait.untilVisible(driver, btn_OkGotIt);
		btn_OkGotIt.click();
		//Wait.untilJqueryIsDone(driver);
		 //break;
		 
			  }
			  catch(Exception e){
				  Log.info("btn_OkGotIt " +e.getMessage());
			  System.out.println("clickTo_btn_OkGotI : " +e.getMessage());
			  
			  }
			//}
		
		
	}
}
