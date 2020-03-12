package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.listener.Reporter;

import selenium.Log;
import selenium.Wait;

public class WMS1_ExpandedDataExportPage {
	
	Actions action;
	 WebDriver driver;
	 WMS1_NormalDataExportPage  wms1normalmodepage;
	 
	 
	public WMS1_ExpandedDataExportPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-568 widget-container widget-type__operation-mode sc')]/descendant::a[contains(@class, 'btn-widget-action svg-expand_chart svg-expand_chart-dims')]")
	public WebElement btn_Expand_OPMOde;
	
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-608 widget-container widget-type')]/descendant::a")
	public WebElement btn_Expand_Track03;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-content operation-mode-widget operation-mode-container')]")
	 public WebElement track_OPMode_Expanded;
	
	
	@FindBy(how = How.XPATH, using = "//*[@class='widget-content Grid-widget']")
	public WebElement track03_Expanded;
	
	
	public void clk_btn_expand(WebElement element)
	{
		 
		for(int i=0; i<=2;i++){
			  try{
				  
				  Wait.untilClickable(driver, element);
				  JavascriptExecutor jse = (JavascriptExecutor)driver;
				  jse.executeScript("arguments[0].click();", element); 
				  			  
				  
			     break;
			  }
			  catch(Exception e){
			     Log.info(e.getMessage());
			     System.out.println("clk_btn_expand: " + e.getMessage());
			  }
	}
	}
	
	public void hoverTo_TrackExpandedMode(WebElement element)
	{
		
		for(int i=0; i<=2;i++){
			  try{
				  
				  Wait.untilVisibilityOfTrack(driver, element);
				  Log.info("Wait is applied until" + element.getText() + "not visible");
				  action =  new Actions(driver);
				  action.moveToElement(element).build().perform();
				  Log.info("mouse is hover to " + element.getText() );
				  
				  
			     break;
			  }
			  catch(Exception e){
			     Log.info(e.getMessage());
			     System.out.println("hoverTo_Track expanded mode: " + e.getMessage());
			  }
			}
		
		
	}
	
	public void clkTo_OpenExpandedOPMode()
	{
	wms1normalmodepage = new WMS1_NormalDataExportPage(driver);
		
		for(int i=0; i<=2;i++){
			  try{
				  wms1normalmodepage.hoverTo_Track(wms1normalmodepage.track_OPMode);
				  clk_btn_expand(btn_Expand_OPMOde);
				  
			     break;
			  }
			  catch(Exception e){
			     Log.info(e.getMessage());
			     System.out.println(" hover and clcik to  expanded mode: " + e.getMessage());
			  }
			}
		
		
	}
	
	public void clkTo_OpenExpandedTrack03()
	{
	wms1normalmodepage = new WMS1_NormalDataExportPage(driver);
		
		for(int i=0; i<=2;i++){
			  try{
				  wms1normalmodepage.hoverTo_Track(wms1normalmodepage.track_03);
				  clk_btn_expand(btn_Expand_Track03);
				  
			     break;
			  }
			  catch(Exception e){
			     Log.info(e.getMessage());
			     System.out.println(" hover and clcik to  expanded mode: " + e.getMessage());
			  }
			}
	}
		
		
	
	
	public void clkToDownloadFileIn_Expanded_OPMode_PNGActualSizeFormat()
	
	{
		wms1normalmodepage = new WMS1_NormalDataExportPage(driver);
		for(int i=0; i<=1;i++){
			  try{
	
		hoverTo_TrackExpandedMode(track_OPMode_Expanded);		  
		 wms1normalmodepage.clkTo_Arrow(wms1normalmodepage.link_Arrow_OPMode);
		 wms1normalmodepage.clkTo_File(wms1normalmodepage.link_PNG_ActualSize);
		 Thread.sleep(2000);
		 break;
		 
			  }
			  catch(Exception e){
			  Reporter.addStepLog("Tracopmode is taking too long to get visible " +e.getMessage());
			  }
			}
	}
	
	public void clkToDownloadFileIn_Expanded_OPMode_PDFActualSizeFormat()
	{
		wms1normalmodepage = new WMS1_NormalDataExportPage(driver);
		for(int i=0; i<=1;i++){
			  try{
	
		hoverTo_TrackExpandedMode(track_OPMode_Expanded);		  
		 wms1normalmodepage.clkTo_Arrow(wms1normalmodepage.link_Arrow_OPMode);
		 wms1normalmodepage.clkTo_File(wms1normalmodepage.link_PDF_ActualSize);
		 Thread.sleep(2000);
		 
		 break;
		 
			  }
			  catch(Exception e){
			  Reporter.addStepLog("Tracopmode is taking too long to get visible " +e.getMessage());
			  }
			}
	}
	
	
	public void clkToDownloadFileIn_Expanded_Track3_PDFActualSizeFormat()
	{
		wms1normalmodepage = new WMS1_NormalDataExportPage(driver);
		for(int i=0; i<=1;i++){
			  try{
	
		hoverTo_TrackExpandedMode(track03_Expanded);		  
		 wms1normalmodepage.clkTo_Arrow(wms1normalmodepage.link_Arrow_Track03);
		 wms1normalmodepage.clkTo_File(wms1normalmodepage.link_PDF_ActualSize);
		 Thread.sleep(2000);
		 break;
		 
			  }
			  catch(Exception e){
			  Reporter.addStepLog("Track-03 is taking too long to get visible " +e.getMessage());
			  }
			}
	}
	
	
	
	
}
	

