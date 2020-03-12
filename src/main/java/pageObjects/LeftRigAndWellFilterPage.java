package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import selenium.Log;
import selenium.Wait;

public class LeftRigAndWellFilterPage {
	
	 WebDriver driver;
		public LeftRigAndWellFilterPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);

}
		
		@FindBy(how = How.XPATH, using = "//*[contains(@class, 'selectorContainer')] /descendant::i[@class='fas fa-caret-down']")
		private WebElement arrow_LeftFilterSearch;	
		
		
		@FindBy(how = How.XPATH, using = "//input[(@class='no-box-shadow') and contains(@placeholder, 'Search wells or rigs')]")
		private WebElement txtbx_LeftFilterSearch;	
		
		
		@FindBy(how = How.XPATH, using ="//*[@class= 'selectorContainer']/descendant::span[contains(text(), 'rt_norm_gc_743_1min')]")
		private WebElement txbxWith_WellName;
		
		
		@FindBy(how = How.XPATH, using = "//*[contains(@class, 'react-grid-item react-draggable react-resizable')]/descendant::div[contains(@class, 'widget-565 widget-container widget-type__Grid sc-gTAwTn fVvNQu')]")
		private WebElement track_01;
		
		
		@FindBy(how = How.XPATH, using = "//div[contains(@class, 'WellSelector__StyledSelector')]/descendant::li/span[contains(text(), 'test_wcj22_15mins')]")
		private WebElement dropdownValueOfWellandRig;
		
		
		@FindBy(how = How.XPATH, using = "//div[contains(@class, 'WellSelector__StyledSelector')]/descendant::li/span[contains(text(), 'GC 743 DC223 ST00BP01')]")
		private WebElement dropdownValueOfWellandRigforOPMode;
		
		
		
		
		
		public void clk_arrow_leftFilterSearch(WebElement element)
		{
			for(int i=0; i<=2;i++){
				  try{
					  Wait.untilVisible(driver, element);
					  element.click();
					  
				     break;
				  }
				  catch(Exception e){
				     Log.info(e.getMessage());
				  }
				}
			
		}
		
		public void type_WellRigNameInLeftFilter(WebElement element, String wellName)
		{
			
			element.sendKeys(wellName);
		}
		
	
		
		
		public void select_dropdown_RigWellFromFilter()
		{
		
		
		for(int i=0; i<=2;i++){
			try{
		
			
			clk_arrow_leftFilterSearch(arrow_LeftFilterSearch);
		
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",  dropdownValueOfWellandRig);
			
			 dropdownValueOfWellandRig.click();
		
		
		break;
		 }
		  catch(Exception e)
		{
			  System.out.println("type_txbx_SelectTheTeam : " +e.getMessage());
		  //Reporter.addStepLog("error Caught for " +e.getMessage());
		  }
		}
		
}
}