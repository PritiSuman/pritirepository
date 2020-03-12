package pageObjects;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import selenium.Log;
import selenium.Wait;
import selenium.ScreenCaptureUtility;


public class LayoutPage {
	
	WebDriver driver;
	WMS1_NormalDataExportPage wms1normalmodepage;
	public LayoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how = How.XPATH, using = "//*[@class ='dashboard-options dropdown-container']/descendant::button[contains(@class, 'has-icon has-caret dropdown-toggle btn btn-default')]")
	public WebElement btn_Options;
	
	
	@FindBy(how = How.XPATH, using = "//*[@class= 'dropdown-menu dropdown-menu-right']/descendant::i[contains(@class, 'svg-icon-layout-dims svg-icon')]")
	public WebElement link_LayoutPrefernces;
	
	
	@FindBy(how = How.XPATH, using = "//*[@class= 'modal-body']/descendant::label[3]/input[@name='widget_565']")
	public WebElement chkbx_group_1;
	
	
	@FindBy(how = How.XPATH, using = "//*[@class= 'modal-footer']/descendant::button[@class= 'btn btn-default']")
	public WebElement btn_Restore_Default_Setting;
	
	
	@FindBy(how = How.XPATH, using = "//*[@class= 'modal-footer']/descendant::input[@class= 'btn btn-primary']")
	public WebElement btn_Apply;
	
	
	@FindBy(how = How.XPATH, using = "//*[@class='modal-footer']/descendant::input[contains(@value, 'Restore')]")
	public WebElement btn_Restore;
	
		
	
	
	
	
	public void clk_btn_Options()
	{
		for(int i=0; i<=2;i++)
		{
		try{
				  Wait.untilClickable(driver, btn_Options);
				  JavascriptExecutor jse = (JavascriptExecutor)driver;
				  jse.executeScript("arguments[0].click();", btn_Options); 
				
				   break;
			  }
			  catch(Exception e)
			  {
			     
			     System.out.println("btn_Options: " + e.getMessage());
			  }
		  }
	}
	
	public void clk_link_LayoutPrefernces()
	{
		for(int i=0; i<=2;i++)
		{
		try{
				  Wait.untilClickable(driver, link_LayoutPrefernces);
				  JavascriptExecutor jse = (JavascriptExecutor)driver;
				  jse.executeScript("arguments[0].click();", link_LayoutPrefernces); 
				
				   break;
			  }
			  catch(Exception e)
			  {
			     
			     System.out.println("link_LayoutPrefernces: " + e.getMessage());
			  }
		  }
	}
	
	
	public void clk_chkbx_group_1()
	{
		for(int i=0; i<=2;i++)
		{
		try{
				  Wait.untilClickable(driver, chkbx_group_1);
				  JavascriptExecutor jse = (JavascriptExecutor)driver;
				  jse.executeScript("arguments[0].click();", chkbx_group_1); 
				
				   break;
			  }
			  catch(Exception e)
			  {
			     
			     System.out.println("chkbx_group_1: " + e.getMessage());
			  }
		  }
	}
	
	public void clk_btn_Restore_Default_Setting()
	{
		for(int i=0; i<=2;i++)
		{
		try{
				  Wait.untilClickable(driver, btn_Restore_Default_Setting);
				  JavascriptExecutor jse = (JavascriptExecutor)driver;
				  jse.executeScript("arguments[0].click();", btn_Restore_Default_Setting); 
				
				   break;
			  }
			  catch(Exception e)
			  {
			     
			     System.out.println("chkbx_group_1: " + e.getMessage());
			  }
		  }
	}
	
	public void clk_btn_Apply()
	{
		for(int i=0; i<=2;i++)
		{
		try{
				  Wait.untilClickable(driver, btn_Apply);
				  JavascriptExecutor jse = (JavascriptExecutor)driver;
				  jse.executeScript("arguments[0].click();", btn_Apply); 
				
				   break;
			  }
			  catch(Exception e)
			  {
			     
			     System.out.println("btn_Apply: " + e.getMessage());
			  }
		  }
	}
	
	
	public void clk_btn_Restore()
	{
		for(int i=0; i<=2;i++)
		{
		try{
				  Wait.untilClickable(driver, btn_Restore);
				  JavascriptExecutor jse = (JavascriptExecutor)driver;
				  jse.executeScript("arguments[0].click();", btn_Restore); 
				
				   break;
			  }
			  catch(Exception e)
			  {
			     
			     System.out.println("btn_Restore : " + e.getMessage());
			  }
		  }
	}
	
	
	
	
	
	
	public void Restore_Hidden_TrackBy_Restore_default_Setting()
	{
		clk_btn_Options();
		clk_link_LayoutPrefernces();
		clk_btn_Restore_Default_Setting();
		clk_btn_Restore();
		
		
	}
	
	public void Restore_Hidden_TrackBy_Check_Group_AndAppy_Btn()
	{
		clk_btn_Options();
		clk_link_LayoutPrefernces();
		clk_chkbx_group_1();
		clk_btn_Apply();
		
		
		
	}
	
	
	//}
	  

		

	
		
	}
		
	
	


