package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import selenium.Wait;

public class WMS1_NormalSendEmailPage {
	
	
	 Actions action;
	 WebDriver driver;
	 WMS1_NormalDataExportPage  wms1normalmodepage;
	public WMS1_NormalSendEmailPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-565 widget-container widget-type__Grid sc')]/descendant::div[@class ]/span/i")
	public WebElement link_SendEmail_Track01;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-568 widget-container widget-type__operation-mode sc')]/descendant::div[contains(@class, 'widget-actions')]/span/i")
	public WebElement link_SendEmail_OPMode;
	
	
	@FindBy(how = How.XPATH, using = "//span[contains(@class, 'Select-arrow')]/span")
	public WebElement arrow_SelectTheTeam;
	
	
	@FindBy(how = How.XPATH, using= "//div[@class='Select-menu-outer']//div[text()='BP - Admin']")
	public WebElement selectTeam_DropdownValue;
	
	

	@FindBy(name = "subject")
	public WebElement txbx_EmailSubject;
	
	
	@FindBy(name = "attachment-name")
	public WebElement txbx_AttachmentName;
	

	@FindBy(how = How.XPATH, using = "//div[@class='live-richtext-editor rdw-editor-main']/descendant::span/span")
	public WebElement txbx_EmailBodyToClear;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='live-richtext-editor rdw-editor-main']/descendant::span/span")
	public WebElement txbx_EmailBody;
	
	
	@FindBy(name= "attachment-type-pdf")
	public WebElement chkbx_attachmentTypePDF;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='icon rectangle-portrait']")
	public WebElement chkbx_A4Portraitat;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='icon rectangle-landscape']")
	public WebElement chkbx_A4Landscape;
		
	
	//@FindBy(name= "attachment-type-png")
	@FindBy(how = How.XPATH, using = "//input[contains(@type,'checkbox') and contains(@name, 'attachment-type-png')]")
	public WebElement chkbx_attachmentTypePNG;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='modal-content']/descendant::button[@class='btn btn-primary']")
	public WebElement btn_Send;
	
	
	public void clk_link_SendEmail_Track01()
	{
		   wms1normalmodepage = new WMS1_NormalDataExportPage(driver);
		for(int i=0; i<=2;i++){
			  try{
				  // hover to track 01 so that send email functionality is visible
				  wms1normalmodepage.hoverTo_Track(wms1normalmodepage.track_01);
				  
				  // wait for send email functionality to clickable and then click on it
				  Wait.untilClickable(driver, link_SendEmail_Track01);
				  JavascriptExecutor jse = (JavascriptExecutor)driver;
				  jse.executeScript("arguments[0].click();", link_SendEmail_Track01); 
				 			  
			     break;
			  }
			  catch(Exception e)
			  {
		
			  System.out.println("clk_link_SendEmail_Track01 : " +e.getMessage());
		  //Reporter.addStepLog("error Caught for " +e.getMessage());
		  }
		}
	}
	
	
	public void dropdown_SelectTheTeams()
	{
		for(int i=0; i<=2;i++){
			try{
		
			
				arrow_SelectTheTeam.click();
		
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", selectTeam_DropdownValue);
			
			selectTeam_DropdownValue.click();
		
		
		break;
		
		 }
		  catch(Exception e)
		{
			  System.out.println("type_txbx_SelectTheTeam : " +e.getMessage());
		  //Reporter.addStepLog("error Caught for " +e.getMessage());
		  }
		}
	}
	
	public void type_EmailSubject(String emailSubject)
	{
		try {
		txbx_EmailSubject.sendKeys(emailSubject);
	}
	  catch(Exception e)
	{
		  System.out.println("type_EmailSubject : " +e.getMessage());
	  //Reporter.addStepLog("error Caught for " +e.getMessage());
	  }
	}
	
	public void type_attachmentName(String attachmentName)
	{
		for(int i=0; i<=2;i++){
			try{	
				txbx_AttachmentName.sendKeys(attachmentName);;
		
		
		   break;
		 }
		  catch(Exception e)
		{
			  System.out.println("type_attachmentName : " +e.getMessage());
		  //Reporter.addStepLog("error Caught for " +e.getMessage());
		  }
		}
		
	}
	
	public void clear_EmailBody() 
	{
		for (int i=0; i<=2; i++)
		{
			try {
				txbx_EmailBodyToClear.clear();
				
				break;
			}
			catch(Exception e)
			{
				System.out.println("type_EmailBody : " +e.getMessage());
			}
		}
		
	}
	
	public void type_EmailBody(String emailBody)
	{
		for(int i=0; i<=2;i++){
			try{	
				txbx_EmailBody.sendKeys(emailBody);
		
		
		   break;
		 }
		  catch(Exception e)
		{
			  System.out.println("type_EmailBody : " +e.getMessage());
		  //Reporter.addStepLog("error Caught for " +e.getMessage());
		  }
		}
		
	}
	
	public void clk_chkbx_attachmentTypePDF()
	{
		for(int i=0; i<=2;i++){
			try{
				chkbx_attachmentTypePDF.click();	
		 //JavascriptExecutor jse = (JavascriptExecutor)driver;
		  //jse.executeScript("arguments[0].click();",chkbx_attachmentTypePDF); 

		   break;
		 }
		  catch(Exception e)
		{
		   System.out.println("clk_chkbx_attachmentTypePDF : " +e.getMessage());
		  //Reporter.addStepLog("error Caught for " +e.getMessage());
		  }
		}
	}
	
	public void clk_chkbx_A4Portraitat()
	{
		for(int i=0; i<=2;i++){
			try{
				chkbx_A4Portraitat.click();
		 //JavascriptExecutor jse = (JavascriptExecutor)driver;
		  //jse.executeScript("arguments[0].click();",chkbx_A4Portraitat); 

		   break;
		 }
		  catch(Exception e)
		{
			  System.out.println("clk_chkbx_A4Portraitat : " +e.getMessage());
		  //Reporter.addStepLog("error Caught for " +e.getMessage());
		  }
		}
		
	}
	
	public void clk_chkbx_A4Landscape()
	{
		for(int i=0; i<=2;i++){
			try{
				chkbx_A4Landscape.click();
		 //JavascriptExecutor jse = (JavascriptExecutor)driver;
		  //jse.executeScript("arguments[0].click();",chkbx_A4Landscape); 

		   break;
		 }
		  catch(Exception e)
		{
			  System.out.println("clk_chkbx_A4Landscape : " +e.getMessage());
		  //Reporter.addStepLog("error Caught for " +e.getMessage());
		  }
		}
		
	}
	
	public void clk_chkbx_attachmentTypePNG()
	{

		for(int i=0; i<=2;i++){
			try{
		 Wait.untilClickable(driver, chkbx_attachmentTypePNG);
		 chkbx_attachmentTypePNG.click();
		
		 //JavascriptExecutor jse = (JavascriptExecutor)driver;
		 //jse.executeScript("arguments[0].click();",chkbx_attachmentTypePNG); 

		   break;
		 }
		  catch(Exception e)
		{
			  System.out.println("clk_chkbx_attachmentTypePNG : " +e.getMessage());
		  //Reporter.addStepLog("error Caught for " +e.getMessage());
		  }
		}
		}
	
	
	public void submit_btn_Send()
	{
		for(int i=0; i<=2;i++){
			try{
				
		// JavascriptExecutor jse = (JavascriptExecutor)driver;
		  //jse.executeScript("arguments[0].click();",btn_Send); 
				btn_Send.click();
				Thread.sleep(1000);

		   break;
		 }
		  catch(Exception e)
		{
			  System.out.println("send : " +e.getMessage());
		  //Reporter.addStepLog("error Caught for " +e.getMessage());
		  }
		}
		}
		
		
	
	public void sendEmailWith_A4Portrait_PNG_Attachment(String teamName, String emailSubject, String attachmentName, String emailBody)
	{
		
		type_EmailSubject( emailSubject);
		type_attachmentName(attachmentName);
		type_EmailBody(emailBody);
		clk_chkbx_attachmentTypePDF();
		clk_chkbx_A4Portraitat();
		clk_chkbx_attachmentTypePNG();
		submit_btn_Send();
		
	}
	
	
	public void sendEmailWith_A4Landscape_Attachment(String teamName, String emailSubject, String attachmentName, String emailBody)
	{
		
		type_EmailSubject( emailSubject);
		type_attachmentName(attachmentName);
		type_EmailBody(emailBody);
		clk_chkbx_attachmentTypePDF();
		clk_chkbx_A4Landscape();
		submit_btn_Send();
		
	}
	
	
	public void sendEmailWith_PNG_Attachment(String teamName, String emailSubject, String attachmentName, String emailBody)
	{
		
		type_EmailSubject( emailSubject);
		type_attachmentName(attachmentName);
		type_EmailBody(emailBody);
		clk_chkbx_attachmentTypePNG();
		submit_btn_Send();
		
	}
	
	
	
	
	
	
	
	
	
	
	


}
