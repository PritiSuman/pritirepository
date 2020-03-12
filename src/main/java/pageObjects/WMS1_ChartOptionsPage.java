package pageObjects;

import java.util.NoSuchElementException;


import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.cucumber.listener.Reporter;

//import junit.framework.Assert;
import selenium.Log;
import selenium.Wait;

public class WMS1_ChartOptionsPage {
	

	WebDriver driver;
	WMS1_NormalDataExportPage wms1normalmodepage;
	public WMS1_ChartOptionsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-565 widget-container widget-type')]/descendant::i[contains(@class, 'fa fa-ellipsis-h action')]")
	public WebElement btn_ChartOption_Track1;
	
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-568 widget-container widget-type')]/descendant::i[contains(@class, 'fa fa-ellipsis-h action')]")
	public WebElement btn_ChartOption_OPMode;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'live-dropdown__content react-draggable sc')]/descendant::i")
	public WebElement btn_HideChartOption_Track1;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'live-dropdown__content react-draggable sc')]/descendant::i[contains(@class, 'fa fa-eye-slash')]")
	public WebElement btn_HideChartOption_OPMode;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'dashboard-content') ]/descendant::div[contains(@class, 'react-grid')]")
	public WebElement Wms1_entire_Page;
	
	
	
	
	
	public void clk_btn_ChartOption_OPMode()
	{
			for(int i=0; i<=2;i++)
			{
			try{
					  Wait.untilClickable(driver, btn_ChartOption_OPMode);
					  JavascriptExecutor jse = (JavascriptExecutor)driver;
					  jse.executeScript("arguments[0].click();", btn_ChartOption_OPMode); 
					
					   break;
				  }
				  catch(Exception e)
				  {
				     
				     System.out.println("clk_btn_ChartOption: " + e.getMessage());
				  }
			  }
			  
		
		  }
	public void clk_btn_ChartOption_Track1()
	{
			for(int i=0; i<=2;i++)
			{
			try{
					  Wait.untilClickable(driver, btn_ChartOption_Track1);
					  JavascriptExecutor jse = (JavascriptExecutor)driver;
					  jse.executeScript("arguments[0].click();", btn_ChartOption_Track1); 
					
					   break;
				  }
				  catch(Exception e)
				  {
				     
				     System.out.println("clk_btn_ChartOption: " + e.getMessage());
				  }
			  }
			  
		
		  }
	
	
	public void clk_btn_HideChartOption_OPMode()
	{
			for(int i=0; i<=2;i++)
			{
			try{
					  Wait.untilClickable(driver, btn_HideChartOption_OPMode);
					  JavascriptExecutor jse = (JavascriptExecutor)driver;
					  jse.executeScript("arguments[0].click();",   btn_HideChartOption_OPMode);
					
					  //btn_HideChartOption.click();
					
					   break;
				  }
				  catch(Exception e)
				  {
				     
				     System.out.println("clk_btn_HideChartOption: " + e.getMessage());
				  }
			  }
			  
		
		  }
	
	public void clk_btn_HideChartOption_Track1()
	{
			for(int i=0; i<=2;i++)
			{
			try{
					  Wait.untilClickable(driver, btn_HideChartOption_OPMode);
					  JavascriptExecutor jse = (JavascriptExecutor)driver;
					  jse.executeScript("arguments[0].click();",   btn_HideChartOption_OPMode);
					
					  //btn_HideChartOption.click();
					
					   break;
				  }
				  catch(Exception e)
				  {
				     
				     System.out.println("clk_btn_HideChartOption: " + e.getMessage());
				  }
			  }
			  
		
		  }
	

	public void clkTo_HideChartAtTrack_1()
	{
		//for(int i=0; i<=2;i++)
		//{
		try{
		wms1normalmodepage = new WMS1_NormalDataExportPage(driver);
		wms1normalmodepage.hoverTo_Track(wms1normalmodepage.track_01);
		Log.info("Mouse is hovered to track 1 to get dropwdown for chart option to be visisble");
		clk_btn_ChartOption_Track1();
		Log.info("Click action is performed on chart option button");
		clk_btn_HideChartOption_Track1();
		Log.info("Click action is performed on Hide chart option button");
		//Wait.waitUntilElementIsInvisible(driver,wms1normalmodepage.track_01 );
		 // break;
		  }
		  catch(Exception e)
		  {
		     
		     System.out.println("clkTo_HideChartAtTrack_1: " + e.getMessage());
		  }
	  }
	
	
	public void clkTo_HideChartAtTrack_1_ExpandedMode()
	{
		//for(int i=0; i<=2;i++)
		//{
		try{
		wms1normalmodepage = new WMS1_NormalDataExportPage(driver);
		wms1normalmodepage.hoverTo_Track(wms1normalmodepage.track_01);
		System.out.println("1");
		Log.info("Mouse is hovered to track 1 to get dropwdown for chart option to be visisble");
		clk_btn_ChartOption_Track1();
		System.out.println("2");
		Log.info("Click action is performed on chart option button");
		clk_btn_HideChartOption_Track1();
		System.out.println("3");
		Log.info("Click action is performed on Hide chart option button");
		//Wait.waitUntilElementIsInvisible(driver,wms1normalmodepage.track_01 );
		 // break;
		  }
		  catch(Exception e)
		  {
		     
		     System.out.println("clkTo_HideChartAtTrack_1: " + e.getMessage());
		  }
	  }
	
	
	public void clkTo_HideChartAtTrack_OPMode()
	{
		//for(int i=0; i<=2;i++)
		//{
		try{
		wms1normalmodepage = new WMS1_NormalDataExportPage(driver);
		wms1normalmodepage.hoverTo_Track(wms1normalmodepage.track_OPMode);
		Log.info("Mouse is hovered to track OPMode to get dropwdown for chart option to be visisble");
		clk_btn_ChartOption_OPMode();
		Log.info("Click action is performed on chart option button");
		clk_btn_HideChartOption_OPMode();
		Log.info("Click action is performed on Hide chart option button");
		//Wait.waitUntilElementIsInvisible(driver,wms1normalmodepage.track_01 );
		 // break;
		  }
		  catch(Exception e)
		  {
		     
		     System.out.println("clkTo_HideChart at OP Mode: " + e.getMessage());
		  }
	  }
	
	
	
	public boolean istrack_01_Not_displayed()
	
	{
		boolean flag = true;
		try { 
		
		
					if(	 wms1normalmodepage.track_01.isDisplayed())
		{
			 System.out.println("element is displayed");
	 			 flag =false;
			 }
		else
		{
			System.out.println("Element is InVisible");
			
		}
	}
		  catch(Exception e){
		     Log.info(e.getMessage());
		     System.out.println("track is not displayed: " + e.getMessage());
		    Reporter.addStepLog("track01 is not displayed");
		  
		  }
		  
		return flag;
		
		
	 	
	}
	
	



	
	public void validate_Track_01_NotDisplayed()
	{
		Assert.assertTrue(istrack_01_Not_displayed(), "track is dispalyed");
	}
	
	
public boolean istrack_01_displayed()
	
	{
		boolean flag = false;
		try { 
		
		
					if(	 wms1normalmodepage.track_01.isDisplayed())
		{
			 System.out.println("element is displayed");
	 			 flag =true;
			 }
		else
		{
			System.out.println("Element is InVisible");
			
		}
	}
		  catch(Exception e){
		     Log.info(e.getMessage());
		     System.out.println("track is not displayed: " + e.getMessage());
		    Reporter.addStepLog("track01 is not displayed");
		  
		  }
		  
		return flag;
		
		
	 	
	}
	
	



	
	public void validate_Track_01_Displayed()
	{
		Assert.assertTrue(istrack_01_displayed(), "track is  not dispalyed");
	}
	
	
	

}
