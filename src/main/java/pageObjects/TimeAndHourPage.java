package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.listener.Reporter;

import selenium.Wait;

public class TimeAndHourPage {
	WebDriver driver;
	public TimeAndHourPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = ".//*[@class='ToggleDashboardOptions__ToggleDashboardOptionsButton-vr6vk3-0 dzyHMo']/descendant::div[@class='btn btn-default fixed-size']/i[@class='fas fa-ellipsis-h']")
	private WebElement btn_ShowDashboardOptions;
	
	
	@FindBy(how = How.XPATH, using = "//*[@class='ToggleDashboardOptions__ToggleDashboardOptionsButton-vr6vk3-0 dzyHMo']/descendant::div[@class='btn btn-default fixed-size pressed']/i[@class='fas fa-times-circle']")
	private WebElement btn_closeShowDashboardOptions;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class= 'span-dropdown btn-group show-calendar sc-jqCOkK gTWoZx']/descendant::button[contains(@class,'dropdown-toggle btn btn-link fixed-size')]")
	private WebElement dd_TimeAndDate;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='sc-kvZOFW kqNbrw']/descendant::li/a[contains(@role, 'menuitem') and contains(text(), 'Last hour')]")
	private WebElement btn_LastHour;
	
	@FindBy(how = How.XPATH, using = "//div[@class='sc-kvZOFW kqNbrw']/descendant::li/a[contains(@role, 'menuitem') and contains(text(), 'Last 2 hours')]")
	private WebElement btn_LastTwoHour;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='sc-kvZOFW kqNbrw']/descendant::li/a[contains(@role, 'menuitem') and contains(text(), 'Last 4 hours')]")
	private WebElement btn_LastFourHour;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='sc-kvZOFW kqNbrw']/descendant::li[4]/a[contains(text(), 'last 6 hours')]")
	private WebElement btn_LastSixHour;
	
	@FindBy(how = How.XPATH, using = "//div[@class='sc-kvZOFW kqNbrw']/descendant::li[5]/a[contains(text(), 'last 24 hours')]")
	private WebElement btn_LastTwentyFourHour;
	
	@FindBy(how = How.XPATH, using = "//div[@class='sc-kvZOFW kqNbrw']/descendant::li[6]/a[contains(text(), 'Yesterday')]")
	private WebElement btn_Yesterday;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='sc-kvZOFW kqNbrw']/descendant::li[7]/a[contains(text(), 'Last 7 days')]")
	private WebElement btn_LastSevenDays;
	
	@FindBy(how = How.XPATH, using = "//div[@class='sc-kvZOFW kqNbrw']/descendant::li[8]/a[contains(text(), 'This week')]")
	private WebElement btn_ThisWeek;
	
	
	@FindBy(how = How.XPATH, using = ".//*[@class='sc-hqyNC fdvtMi']/descendant::div/input[contains(@name,'timespan-expression') and contains(@value,'')]")
	private WebElement input_TimeSpan;
	
	
	@FindBy(how = How.XPATH, using = ".//*[@class='sc-hqyNC fdvtMi']/descendant::div/input[contains(@name,'timespan-expression') and contains(@value,'last hour')]")
	private WebElement input_TimeSpanWithLastHour;
	
	
	
	@FindBy(how = How.XPATH, using = ".//*[@class='sc-hqyNC fdvtMi']/descendant::span[contains(text(), 'Restore Default')]")
	private WebElement btn_Restore;
	
	
	@FindBy(how = How.XPATH, using = ".//*[@class='sc-hqyNC fdvtMi']/descendant::input[contains(@class, 'btn-primary sc-jbKcbu fjjkGp')]")
	private WebElement btn_Apply;
	
	
	@FindBy(how = How.XPATH, using = ".//*[@class='sc-hqyNC fdvtMi']/descendant::span[contains(text(), 'Advance')]")
	
	private WebElement btn_Advance;
	
	
	public void clkToDisplyDashboardOptions()
	{
		for(int i=0; i<=1;i++){
			  try{
				  JavascriptExecutor jse = (JavascriptExecutor)driver;
				  jse.executeScript("arguments[0].click();",btn_ShowDashboardOptions); 
			
		 break;
		 
			  }
			  catch(Exception e){
				  System.out.println("clkToDisplyDashboardOptions : " +e.getMessage());
			  //Reporter.addStepLog("error Caught for " +e.getMessage());
			  }
			}
	}
	
	public void clkToClose_DisplyedDashboardOptions()
	{
		for(int i=0; i<=1;i++){
			  try{
				  JavascriptExecutor jse = (JavascriptExecutor)driver;
				  jse.executeScript("arguments[0].click();",btn_closeShowDashboardOptions); 
			
		 break;
		 
			  }
			  catch(Exception e){
				  System.out.println("clkToCloseDisplyDashboardOptions : " +e.getMessage());
			  //Reporter.addStepLog("error Caught for " +e.getMessage());
			  }
			}
	}
	
	
		public void typeTxbx_TimeSpan()
		{
			for(int i=0; i<=1;i++){
				  try{
					  input_TimeSpan.sendKeys("2020-02-17 14:00 to 2020-02-17 14:01");
				
			 break;
			 
				  }
				  catch(Exception e){
				  //Reporter.addStepLog("error Caught for " +e.getMessage());
				  }
				}
		}
		
		public void typeTxbx_TimeSpanToChose(String time)
		{
			for(int i=0; i<=1;i++){
				  try{
					  input_TimeSpan.sendKeys(time);
				
			 break;
			 
				  }
				  catch(Exception e){
				  //Reporter.addStepLog("error Caught for " +e.getMessage());
				  }
				}
		}
		
		public void clear_txbxTimeAndSpan()
		{
			for(int i=0; i<=2;i++){
				  try{
					  Wait.untilVisible(driver, input_TimeSpan);
					  Thread.sleep(100);
					  input_TimeSpan.clear(); 
					  
				 break;
			 
				  }
				  catch(Exception e){
				  System.out.println("clear time and span : " +e.getMessage());
				  }
				}
		}
		
		public void clk_ArrowTimeandHour()
		{
			for(int i=0; i<=1;i++){
				  try{
					  JavascriptExecutor jse = (JavascriptExecutor)driver;
					  jse.executeScript("arguments[0].click();",dd_TimeAndDate); 
					  
				
			 break;
			 
				  }
				  catch(Exception e){
				  //Reporter.addStepLog("error Caught for " +e.getMessage());
					  System.out.println("clk_ArrowTimeandHour : " +e.getMessage());
				  }
				}
		}
		
		
		public void clk_BtnAdvance()
		{
			for(int i=0; i<=1;i++){
				  try{
					  JavascriptExecutor jse = (JavascriptExecutor)driver;
					  jse.executeScript("arguments[0].click();", btn_Advance); 
					  
				
			 break;
			 
				  }
				  catch(Exception e){
				  //Reporter.addStepLog("error Caught for " +e.getMessage());
					  System.out.println("sdd_BtnAdvance : " +e.getMessage());
				  }
				}
		}
		
		
		public void clk_BtnApply()
		{
			for(int i=0; i<=1;i++){
				  try{
					  JavascriptExecutor jse = (JavascriptExecutor)driver;
					  jse.executeScript("arguments[0].click();", btn_Apply); 
					  
				
			 break;
			 
				  }
				  catch(Exception e){
				  //Reporter.addStepLog("error Caught for " +e.getMessage());
					  System.out.println("clk_BtnApply : " +e.getMessage());
				  }
				}
		}
		
		public void sdd_TimeAndHour()
		{
			{
				  try{
					  
					  clk_ArrowTimeandHour();
					  clk_BtnAdvance();
					  //Wait.untilVisible(driver, input_TimeSpanWithLastHour);
					  Thread.sleep(500);
					  clear_txbxTimeAndSpan();
					  Thread.sleep(300);
					  typeTxbx_TimeSpan();
					  clk_BtnApply();
					  
					  
					  
			
				  }
				  catch(Exception e){
				  System.out.println("sdd_TimeAndHour : " +e.getMessage());
				  }
			}
			
				}
			
			public void sdd_TimeAndHourToChose(String time)
			{
				{
					  try{
						  
						  clk_ArrowTimeandHour();
						  clk_BtnAdvance();
						  //Wait.untilVisible(driver, input_TimeSpanWithLastHour);
						  Thread.sleep(500);
						  clear_txbxTimeAndSpan();
						  typeTxbx_TimeSpanToChose(time);
						  clk_BtnApply();
						  
						  
						  
				
					  }
					  catch(Exception e){
					  System.out.println("sdd_TimeAndHour : " +e.getMessage());
					  }
					}
				
			
		
			
			
			}
		
	

}
