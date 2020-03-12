package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.cucumber.listener.Reporter;

import selenium.Log;
import selenium.Wait;

public class WMS1_NormalDataExportPage {
	
	 Actions action;
	 WebDriver driver;
	public WMS1_NormalDataExportPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-565 widget-container widget-type__Grid sc-gTAwTn fVvNQu')]/descendant::div[contains(@class, 'widget-actions__download-button sc-kcUqzr gDiQOL sc-epnACN kVbLZT')]")
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-565 widget-container widget-type__Grid sc')]/descendant::div[contains(@class, 'widget-actions__download-button sc')]/span/i")
	public WebElement link_Arrow_Track01;
	
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-566 widget-container widget-type__Grid sc')]/descendant::div[contains(@class, 'widget-actions__download-button sc')]/span/i")
	  	public WebElement link_Arrow_Track02;
	
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-608 widget-container widget-type__Grid sc')]/descendant::div[contains(@class, 'widget-actions__download-button sc')]/span/i")
	 public WebElement link_Arrow_Track03;
	
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-569 widget-container widget-type__Grid sc')]/descendant::div[contains(@class, 'widget-actions__download-button sc')]/span/i")
	public WebElement link_Arrow_Track04;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-568 widget-container widget-type__operation-mode sc')]/descendant::div[contains(@class, 'widget-actions__download-button sc')]/span/i")
	 public WebElement link_Arrow_OPMode;
	
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'react-grid-item react-draggable react-resizable')]/descendant::div[contains(@class, 'widget-565 widget-container widget-type__Grid sc')]")
	public WebElement track_01;
	
	    
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'react-grid-item react-draggable react-resizable')]/descendant::div[contains(@class, 'widget-566 widget-container widget-type__Grid sc')]")
	private WebElement track_02;
	

	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'react-grid-item react-draggable react-resizable')]/descendant::div[contains(@class, 'widget-608 widget-container widget-type__Grid sc')]")
	public WebElement track_03;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'react-grid-item react-draggable react-resizable')]/descendant::div[contains(@class, 'widget-569 widget-container widget-type__Grid sc')]")
	public WebElement track_04;
	
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'react-grid-item react-draggable react-resizable')]/descendant::div[contains(@class, 'widget-567 widget-container widget-type__Grid sc')]")
	public WebElement track_04_Image;
	
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'react-grid-item react-draggable react-resizable')]/descendant::div[contains(@class, 'widget-568 widget-container widget-type__operation-mode sc')]")
	public WebElement track_OPMode;
	
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'react-grid-item react-draggable react-resizable')]/descendant::div[contains(@class, 'widget-571 widget-container widget-type__Grid sc-')]")
	public WebElement planView;
	
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'react-grid-item react-draggable react-resizable')]/descendant::div[contains(@class, 'widget-566 widget-container widget-type__Grid sc')]")
	public WebElement verticalSection;
	
	
	
	@FindBy(how = How.XPATH, using = "//*[@class='sc-bsbRJL gUrXcz']/descendant::span[2]/a")
	public WebElement link_CSV_Plain;
	
	
	@FindBy(how = How.XPATH, using = "//*[@class='sc-bsbRJL gUrXcz']/descendant::span[3]/a")
	public WebElement link_CSV_gZIP;
	
	
	@FindBy(how = How.XPATH, using = "//*[@class='sc-bsbRJL gUrXcz']/descendant::span[4]/a")
	public WebElement link_CSV_ZIP;
	
	@FindBy(how = How.XPATH, using = "//*[@class='sc-bsbRJL gUrXcz']/descendant::span[6]/a")
	public WebElement link_JSON_Plain;
	
	@FindBy(how = How.XPATH, using = "//*[@class='sc-bsbRJL gUrXcz']/descendant::span[7]/a")
	public WebElement link_JSON_gZIP;
	
	@FindBy(how = How.XPATH, using = "//*[@class='sc-bsbRJL gUrXcz']/descendant::span[8]/a")
	public WebElement link_JSON_ZIP;
	
	@FindBy(how = How.XPATH, using = "//*[@class='sc-bsbRJL gUrXcz']/descendant::span[10]/a")
	public WebElement link_Excel_Plain;
	
	@FindBy(how = How.XPATH, using = "//*[@class='sc-bsbRJL gUrXcz']/descendant::span[11]/a")
	public WebElement link_Excel_gZIP;
	
	@FindBy(how = How.XPATH, using = "//*[@class='sc-bsbRJL gUrXcz']/descendant::span[12]/a")
	public WebElement link_Excel_ZIP;
	
	@FindBy(how = How.XPATH, using = "//*[@class='sc-bsbRJL gUrXcz']/descendant::span[1]/a")
	public WebElement link_PNG_ActualSize;
	
	
	@FindBy(how = How.XPATH, using = "//*[@class='widgetexport-pdf-options']/descendant::a[3]")
	public WebElement link_PDF_ActualSize;
	
	
	@FindBy(how = How.XPATH, using = "//*[@class='widgetexport-pdf-options']/descendant::a[1]")
	public WebElement link_PDF_Portrait;
	
	
	@FindBy(how = How.XPATH, using = "//*[@class='widgetexport-pdf-options']/descendant::a[2]")
	public WebElement link_PDF_Landscape;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-msg')]/descendant::span[contains(@title, 'No data found')]")
	public WebElement trackWithNoData;
	
	
	
	
	
	public void clk_track01_ExportArrow()
	{
		 for(int i=0; i<=2;i++){
			  try{
				  
				  Wait.untilVisibilityOfTrack(driver, link_Arrow_Track01);
				  JavascriptExecutor jse = (JavascriptExecutor)driver;
				  jse.executeScript("arguments[0].click();", link_Arrow_Track01); 
				  			  
				  
			     break;
			  }
			  catch(Exception e){
			     System.out.println("clkTo_Arrow to close: " + e.getMessage());
			  }
		 }
	}
	
	
	
	public void clk_track02()
	{
		 for(int i=0; i<=2;i++){
			  try{
				  
				  JavascriptExecutor jse = (JavascriptExecutor)driver;
				  jse.executeScript("arguments[0].click();",track_02); 
				 		  
				  
			     break;
			  }
			  catch(Exception e){
			  
			     System.out.println("clkTo_Arrow: " + e.getMessage());
			  }
		  }
		
		
	}
	
	
	public void hoverTo_Track(WebElement element)
	{
		
		
		
		
		for(int i=0; i<=2;i++){
			  try{
				  
				  Wait.untilVisibilityOfTrack(driver, element);
				  Log.info("Wait is applied until" + element.getText() + "not visible");
				   action =  new Actions(driver);
				  action.moveToElement(element).build().perform();
				  
				  
			     break;
			  }
			  catch(Exception e){
				  Reporter.addStepLog("Track is taking more time than normal time to appear");
			     Log.info("Track is taking more time than normal time to appear");
			     System.out.println("Track is taking more time than normal time to appear : " + e.getMessage());
			  }
			}
		
		
	}
	
	public void clkTo_Arrow(WebElement element)
	{
	
		
				  for(int i=0; i<=2;i++){
					  try{
						  Wait.untilClickable(driver, element);
						  JavascriptExecutor jse = (JavascriptExecutor)driver;
						  jse.executeScript("arguments[0].click();", element); 
						  //jse.executeScript("window.scrollTo(0," +element.getLocation().y+")");
						  //element.click();
						
						
						  
						  
					     break;
					  }
					  catch(Exception e){
					     
					     System.out.println("clkTo_Arrow: " + e.getMessage());
					  }
				  }
				  
			
			  }
		
		
		
	
	
	public void clkTo_File(WebElement element)
	{
		for(int i=0; i<=2;i++){
			  try{
				  Wait.untilClickable(driver, element);
				  JavascriptExecutor jse = (JavascriptExecutor)driver;
				  jse.executeScript("arguments[0].click();", element); 
			     break;
			  }
			  catch(Exception e){
			     System.out.println("clkToFile" +e.getMessage());
			  }
			}
	
	}
	
	
	public void clkToDownloadFileIn_Track01_CSVPlainFormat()
	{
		for(int i=0; i<=1;i++){
			  try{
		hoverTo_Track(track_01);
		clkTo_Arrow(link_Arrow_Track01);
		clkTo_File(link_CSV_Plain);
		Thread.sleep(2000);
		 break;
			  }
			  catch(Exception e){
			     System.out.println("clkto downloadfile Track01 " +e.getMessage());
			  }
			}
	

		
	}
	
	public void clkToDownloadFileIn_Track01_CSVgZIPFormat()
	{
		
		//hoverTo_Track(track_01);
		//clkTo_Arrow(link_Arrow_Track01);
		clkTo_File(link_CSV_gZIP);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Log.info("Download couldnot completed");
			e.printStackTrace();
		}
		
	}
	
	public void clkToDownloadFileIn_Track01_CSVZIPFormat()
	{
		//hoverTo_Track(track_01);
		//clkTo_Arrow(link_Arrow_Track01);
		clkTo_File(link_CSV_gZIP);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Log.info("Download couldnot completed");
			e.printStackTrace();
		}
		
	}
	
	
	public void clkToDownloadFileIn_Track02_CSVPlainFormat()
	{
		hoverTo_Track(track_02);
		clkTo_Arrow(link_Arrow_Track02);
		clkTo_File(link_CSV_Plain);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Log.info("Download couldnot completed");
			e.printStackTrace();
		}
		
	}
	
	public void clkToDownloadFileIn_Track02_CSVgZIPFormat()
	{
		
		for(int i=0; i<=1;i++){
			  try{

		hoverTo_Track(track_02);
		clkTo_Arrow(link_Arrow_Track02);
		clkTo_File(link_CSV_gZIP);
		 break;
			  }
			  catch(Exception e){
			     System.out.println("clkto downloadfile " +e.getMessage());
			  }
			}
		
		
		/*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Log.info("Download couldnot completed");
			e.printStackTrace();
		}*/
		
	}
	
	public void clkToDownloadFileIn_Track02_CSVZIPFormat()
	{
		hoverTo_Track(track_02);
		clkTo_Arrow(link_Arrow_Track02);
		clkTo_File(link_CSV_ZIP);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Log.info("Download couldnot completed");
			e.printStackTrace();
		}
	}
	
	
	public void clkToDownloadFileIn_Track03_CSVPlainFormat()
	{
		hoverTo_Track(track_03);
		clkTo_Arrow(link_Arrow_Track03);
		clkTo_File(link_CSV_Plain);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Log.info("Download couldnot completed");
			e.printStackTrace();
		}
		
	}
	
	
	public void clkToDownloadFileIn_Track03_CSVgZIPFormat()
	{
		hoverTo_Track(track_03);
		clkTo_Arrow(link_Arrow_Track03);
		clkTo_File(link_CSV_gZIP);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Log.info("Download couldnot completed");
			e.printStackTrace();
		}
		
	}
		
	
	public void clkToDownloadFileIn_Track03_CSVZIPFormat()
	{
		for(int i=0; i<=1;i++){
			  try{

		hoverTo_Track(track_03);
		clkTo_Arrow(link_Arrow_Track03);
		clkTo_File(link_CSV_ZIP);
		 break;
			  }
			  catch(Exception e){
			     System.out.println("clkto downloadfile track03-ZIP " +e.getMessage());
			  }
			}
		
		
		
		/*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Log.info("Download couldnot completed");
			e.printStackTrace();
		}*/
		
	}
	
	

	public void clkToDownloadFileIn_Track04_CSVPlainFormat()
	{
		hoverTo_Track(track_04);
		clkTo_Arrow(link_Arrow_Track04);
		clkTo_File(link_CSV_Plain);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Log.info("Download couldnot completed");
			e.printStackTrace();
		}
		
	}
	
	
	public void clkToDownloadFileIn_Track04_CSVgZIPFormat()
	{
		
		
		try {
			hoverTo_Track(track_04);
			clkTo_Arrow(link_Arrow_Track04);
			Thread.sleep(500);
			clkTo_File(link_CSV_gZIP);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Log.info("Download couldnot completed");
			e.printStackTrace();
		}
		
	}
		
	
	public void clkToDownloadFileIn_Track04_CSVZIPFormat()
	{
		
		
		try {
			hoverTo_Track(track_04);
			clkTo_Arrow(link_Arrow_Track04);
			Thread.sleep(500);
			clkTo_File(link_CSV_ZIP);
			Thread.sleep(500);
		} catch (InterruptedException e) {
			Log.info("Download couldnot completed");
			e.printStackTrace();
		}
		
	}
	
	

	public void clkToDownloadFileIn_OPMode_CSVPlainFormat()
	{

		for(int i=0; i<=1;i++){
			  try{
		hoverTo_Track(track_OPMode);
		clkTo_Arrow(link_Arrow_OPMode);
		Thread.sleep(500);
		clkTo_File(link_CSV_Plain);
		Thread.sleep(2000);
		 break;
			  }
			  catch(Exception e){
			     System.out.println("clkto downloadfile track03-ZIP " +e.getMessage());
			  }
			}
		
	}
	
	
	public void clkToDownloadFileIn_OPMode_CSVgZIPFormat()
	{
		
		
		try {
			
			hoverTo_Track(track_OPMode);
			clkTo_Arrow(link_Arrow_OPMode);
			Thread.sleep(500);
			clkTo_File(link_CSV_gZIP);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Log.info("Download couldnot completed");
			e.printStackTrace();
		}
		
	}
		
	
	public void clkToDownloadFileIn_OPMode_CSVZIPFormat()
	{
		for(int i=0; i<=1;i++){
			  try{
				  if (track_OPMode.isDisplayed())
				  {
		hoverTo_Track(track_OPMode);
		clkTo_Arrow(link_Arrow_OPMode);
		clkTo_File(link_CSV_ZIP);
		Thread.sleep(2000);
				  }
				  break;
			  }
			  catch(Exception e){
				 Log.info("Track op mode is taking extra time to be dispalyed");
			     System.out.println("clkto downloadfile trackOPMode-ZIP " +e.getMessage());
			     System.out.println("Track op mode is taking extra time to be dispalyed ");
			  }
			  }
			}
		
		
		/*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Log.info("Download couldnot completed");
			e.printStackTrace();
		}*/
		
	
	
	public void clkToDownloadFileIn_Track01_JSONPlainFormat()
	{
		for(int i=0; i<=1;i++){
			  try{
		hoverTo_Track(track_01);
		clkTo_Arrow(link_Arrow_Track01);
		Thread.sleep(500);
		
		clkTo_File(link_JSON_Plain);
		Thread.sleep(2000);
		 break;
			  }
			  catch(Exception e){
			     Reporter.addStepLog("clkto downloadfile track01-JSONPlain " +e.getMessage());
			  }
			}
		
		
		/*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Log.info("Download couldnot completed");
			e.printStackTrace();
		}*/
		
	}
	
	public void clkToDownloadFileIn_Track02_JSONPgZIPFormat()
	{
		for(int i=0; i<=1;i++){
			  try{
		hoverTo_Track(track_02);
		clkTo_Arrow(link_Arrow_Track02);
		Thread.sleep(500);
		
		clkTo_File(link_JSON_gZIP);
		Thread.sleep(2000);
		 break;
			  }
			  catch(Exception e){
			     Reporter.addStepLog("clkto downloadfile track02-JSONgZIP " +e.getMessage());
			  }
			}
	}
	
	public void clkToDownloadFileIn_OPMode_JSONPZIPFormat()
	{
		for(int i=0; i<=1;i++){
			  try{
		hoverTo_Track(track_OPMode);
		clkTo_Arrow(link_Arrow_OPMode);
		Thread.sleep(500);
		
		clkTo_File(link_JSON_ZIP);
		Thread.sleep(2000);
		 break;
		 
			  }
			  catch(Exception e){
			  Reporter.addStepLog("clkto downloadfile OPMode-JSONZIP " +e.getMessage());
			  }
			}
	}
	
	public void clkToDownloadFileIn_Track01_ExcelPlainFormat()
	{
		for(int i=0; i<=1;i++){
			  try{
		hoverTo_Track(track_01);
		clkTo_Arrow(link_Arrow_Track01);
		Thread.sleep(500);
		clkTo_File(link_Excel_Plain);
		Thread.sleep(2000);
		 break;
			  }
			  catch(Exception e){
			     System.out.println("clkto downloadfile track01-JSONPlain " +e.getMessage());
			  }
			}
		
		
		/*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Log.info("Download couldnot completed");
			e.printStackTrace();
		}*/
		
	}
	
	public void clkToDownloadFileIn_Track02_ExcelgZIPFormat()
	{
		for(int i=0; i<=1;i++){
			  try{
		hoverTo_Track(track_02);
		clkTo_Arrow(link_Arrow_Track02);
		Thread.sleep(500);
		clkTo_File(link_Excel_gZIP);
		Thread.sleep(2000);
		 break;
			  }
			  catch(Exception e){
			    
			  }
			}
	}
	
	public void clkToDownloadFileIn_OPMode_ExcelZIPFormat()
	{
		for(int i=0; i<=1;i++){
			  try{
		hoverTo_Track(track_OPMode);
		clkTo_Arrow(link_Arrow_OPMode);
		Thread.sleep(500);
		clkTo_File(link_Excel_ZIP);
		Thread.sleep(2000);
		 break;
		 
			  }
			  catch(Exception e){
			  
			  }
			}
	}
	
	public void clkToDownloadFileIn_Track01_PNGActualSizeFormat()
	{
		for(int i=0; i<=1;i++){
			  try{
		hoverTo_Track(track_01);
		clkTo_Arrow(link_Arrow_Track01);
		clkTo_File(link_PNG_ActualSize);
		Thread.sleep(2000);
		 break;
		 
			  }
			  catch(Exception e){
				  System.out.println("clkto downloadfile Track01-PNGActual " +e.getMessage());
			  }
			}
	}
	
	public void clkToDownloadFileIn_OPMode_PNGActualSizeFormat()
	{
		for(int i=0; i<=1;i++){
			  try{
		hoverTo_Track(track_OPMode);
		clkTo_Arrow(link_Arrow_OPMode);
		clkTo_File(link_PNG_ActualSize);
		Thread.sleep(2000);
		 break;
		 
			  }
			  catch(Exception e){
				  System.out.println("clkto downloadfile OPMode-PNG Actual " +e.getMessage());
			  }
			}
	}
	
	public void clkToDownloadFileIn_Track03_PNGActualSizeFormat()
	{
		for(int i=0; i<=1;i++){
			  try{
		hoverTo_Track(track_03);
		clkTo_Arrow(link_Arrow_Track03);
		clkTo_File(link_PNG_ActualSize);
		Thread.sleep(2000);
		 break;
		 
			  }
			  catch(Exception e){
				  System.out.println("Track03 is taking too long to get visible " +e.getMessage());
			  }
			}
	}
	
	
	

	public void clkToDownloadFileIn_Track01_PDFActualSizeFormat()
	{
		for(int i=0; i<=1;i++){
			  try{
		hoverTo_Track(track_01);
		clkTo_Arrow(link_Arrow_Track01);
		clkTo_File(link_PDF_ActualSize);
		Thread.sleep(2000);
		 break;
		 
			  }
			  catch(Exception e){
				  System.out.println("Track01 is taking too long to get visible " +e.getMessage());
			  }
			}
	}
	

	public void clkToDownloadFileIn_Track02_PDFActualSizeFormat()
	{
		for(int i=0; i<=1;i++){
			  try{
		hoverTo_Track(track_02);
		clkTo_Arrow(link_Arrow_Track02);
		clkTo_File(link_PDF_ActualSize);
		Thread.sleep(2000);
		 break;
		 
			  }
			  catch(Exception e){
				  System.out.println("Track02 is taking too long to get visible " +e.getMessage());
			  }
			}
	}
	
	
	
	public void clkToDownloadFileIn_OPMode_PDFActualSizeFormat()
	{
		for(int i=0; i<=1;i++){
			  try{
		hoverTo_Track(track_OPMode);
		clkTo_Arrow(link_Arrow_OPMode);
		clkTo_File(link_PDF_ActualSize);
		Thread.sleep(2000);
		 break;
		 
			  }
			  catch(Exception e){
				  System.out.println("OPMode is taking too long to get visible " +e.getMessage());
			  }
			}
	}
	
	public void clkToDownloadFileIn_OPMode_PDFPortraitSizeFormat()
	{
		for(int i=0; i<=1;i++){
			  try{
		hoverTo_Track(track_OPMode);
		clkTo_Arrow(link_Arrow_OPMode);
		clkTo_File(link_PDF_Portrait);
		Thread.sleep(2000);
		 break;
		 
			  }
			  catch(Exception e){
				  System.out.println("OPMode is taking too long to get visible " +e.getMessage());
			  }
			}
	}
	
	public void clkToDownloadFileIn_OPMode_PDFLandScapeSizeFormat()
	{
		for(int i=0; i<=1;i++){
			  try{
		hoverTo_Track(track_OPMode);
		clkTo_Arrow(link_Arrow_OPMode);
		clkTo_File(link_PDF_Landscape);
		Thread.sleep(2000);
		 break;
		 
			  }
			  catch(Exception e){
				  System.out.println("OPMode is taking too long to get visible " +e.getMessage());
			  }
			}
	}
	
	
	public void clkToDownloadFileIn_Track03_PDFLandScapeSizeFormat()
	{
		for(int i=0; i<=1;i++){
			  try{
		hoverTo_Track(track_03);
		clkTo_Arrow(link_Arrow_Track03);
		clkTo_File(link_PDF_Landscape);
		Thread.sleep(2000);
		 break;
		 
			  }
			  catch(Exception e){
				  System.out.println("Track03 is taking too long to get visible " +e.getMessage());
			  }
			}
	}
	
	
	public void clkToDownloadFileIn_Track04_PDFLandScapeSizeFormat()
	{
		for(int i=0; i<=1;i++){
			  try{
		hoverTo_Track(track_04);
		clkTo_Arrow(link_Arrow_Track04);
		clkTo_File(link_PDF_Landscape);
		Thread.sleep(2000);
		 break;
		 
			  }
			  catch(Exception e){
				  System.out.println("Track03 is taking too long to get visible " +e.getMessage());
			  }
			}
	}
	
	




		
	}
	
		

