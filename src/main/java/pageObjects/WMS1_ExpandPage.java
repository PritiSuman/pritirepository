package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import selenium.Wait;

public class WMS1_ExpandPage {
	

	Actions action;
	 WebDriver driver;
	 WMS1_NormalDataExportPage  wms1normalmodepage;
	 
	 
	public WMS1_ExpandPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-565 widget-container widget-type')]/descendant::a[contains(@class, 'btn-widget-action svg-expand_chart svg-expand')]")
	public WebElement btn_Expand_Track1;
	
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-568')]/descendant::a[contains(@class, 'btn-widget-action svg-expand_chart svg-expand')]")
	public WebElement btn_Expand_OPMode;
	
	
	

	public void clk_btn_Expand_OPMode()
	{
		wms1normalmodepage = new WMS1_NormalDataExportPage(driver);
		 for(int i=0; i<=2;i++){
			  try{
				  wms1normalmodepage.hoverTo_Track(wms1normalmodepage.track_OPMode);
				  
				  Wait.untilClickable(driver, btn_Expand_OPMode);
				  JavascriptExecutor jse = (JavascriptExecutor)driver;
				  jse.executeScript("arguments[0].click();", btn_Expand_OPMode); 
				  			  
				  
			     break;
			  }
			  catch(Exception e){
			     System.out.println("btn_Expand_OPMode: " + e.getMessage());
			  }
		 }
	}
	
	
	public void  clk_btn_Expand_Track1()
	{
		wms1normalmodepage = new WMS1_NormalDataExportPage(driver);
		 for(int i=0; i<=2;i++){
			  try{
				  wms1normalmodepage.hoverTo_Track(wms1normalmodepage.track_01);
				  
				  Wait.untilClickable(driver, btn_Expand_Track1);
				  JavascriptExecutor jse = (JavascriptExecutor)driver;
				  jse.executeScript("arguments[0].click();", btn_Expand_Track1); 
				  			  
				  
			     break;
			  }
			  catch(Exception e){
			     System.out.println("btn_Expand_Track1: " + e.getMessage());
			  }
		 }
	}
	
	
	
}
