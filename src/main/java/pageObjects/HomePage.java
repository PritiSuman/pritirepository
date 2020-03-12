package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.listener.Reporter;

import selenium.AlertHandelingUtility;
import selenium.Log;
import selenium.Wait;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(how = How.XPATH, using = "//ul[@id = 'main-navigation']/descendant::span[contains(@class, 'nav-link') and contains(text(), 'Dashboards')]")
	private WebElement btn_Dashboard;
	
	
	@FindBy(how = How.XPATH, using = "//ul[@id = 'main-navigation']/descendant::span[contains(@class, 'nav-link') and contains(text(), 'Home')]")
	private WebElement btn_Home;
	
	
	@FindBy(how = How.XPATH, using = "//*[@class='search no-box-shadow']")
	private WebElement txtbx_DashboardSearch;
	
	
	@FindBy(how = How.XPATH, using = ".//*[@class='no-padding']/descendant::span[contains(text(), 'WMS_01 - General Activity')]")
	private WebElement link_WMS1Dashboard;
	
	
	public void clkOn_Dashboard()
	{
		
		for(int i=0; i<=2;i++){
			  try{
				  AlertHandelingUtility.checkAlert();
				  btn_Dashboard.click();
				  Log.info("click action performed on dashboard button at home page");
			     break;
			  }
			  catch(Exception e){
			     System.out.println(e.getMessage());
			     Log.info("Error caught for while clicking on dashbaord as: " +e.getMessage());
			  }
			}
		
		
	}
	
	public void type_DashboardSearch()
	{
		for(int i=0; i<=1;i++){
			  try{
		//AlertHandelingUtility.isAlertPresent();
		txtbx_DashboardSearch.sendKeys("WMS_01 - General Activity");
		Log.info("serach for 'wms1-General activity' in search box of dashboard");
	    break;
			  }
			  catch(Exception e){
			     System.out.println("type_DashboardSearch:  " +e.getMessage());
			     Log.info("error caught for type search box as : " +e.getMessage());
			  }
			}
		
	}
	
	public void clkOn_WMS1DashboardName()
	{
		for(int i=0; i<=1;i++){
			  try{
				  Wait.untilClickable(driver, link_WMS1Dashboard);
				  Log.info("Wait is applied until wms1 dashboard is not clickable");
				  JavascriptExecutor jse = (JavascriptExecutor)driver;
				  jse.executeScript("arguments[0].click();", link_WMS1Dashboard); 
				  Log.info("click action performed on WMS1 dashboard");
				  AlertHandelingUtility.isAlertPresent();
				  Log.info("Alert is accepted");
				  //JavascriptExecutor js = ( (JavascriptExecutor)driver);
					//js.executeScript("window.scrollBy(0, -250)",   "");
					//link_WMS1Dashboard.click();
			     break;
			  }
			  catch(Exception e){
			     System.out.println("clkOn_WMS1DashboardName  :" +e.getMessage());
			     Log.info("Error caught while clicking on wms1 dashboard as: " +e.getMessage());
			  }
			}
		
	}
	
	public void goTo_WMS1Dashboard()
	{
		
		try {
			
		AlertHandelingUtility.checkAlert();	
		clkOn_Dashboard();
		AlertHandelingUtility.checkAlert();
		type_DashboardSearch();
		AlertHandelingUtility.checkAlert();
		clkOn_WMS1DashboardName();
	
		 }
		  catch(Exception e){
		  Reporter.addStepLog( e.getMessage());
		  System.out.println("goTo_WMS1Dashboard  :" +e.getMessage());
		  }
		}
				
	}
	
	


