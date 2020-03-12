package selenium;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import managers.FileReaderManager;

public class Wait {
	
	public static void untilJqueryIsDone(WebDriver driver){
		 untilJqueryIsDone(driver, FileReaderManager.getInstance().getConfiFileReader().getImplicitWait());
		 }
		 
		 public static void untilJqueryIsDone(WebDriver driver, Long timeoutInSeconds){
		 until(driver, (d) ->
		 {
		 Boolean isJqueryCallDone = (Boolean)((JavascriptExecutor) driver).executeScript("return jQuery.active==0");
		 if (!isJqueryCallDone) System.out.println("JQuery call is in Progress");
		 return isJqueryCallDone;
		 }, timeoutInSeconds);
		 }
		 
		 public static void untilPageLoadComplete(WebDriver driver) {
		 untilPageLoadComplete(driver, FileReaderManager.getInstance().getConfiFileReader().getImplicitWait());
		 }
		 
		 public static void untilPageLoadComplete(WebDriver driver, Long timeoutInSeconds){
		 until(driver, (d) ->
		 {
		 Boolean isPageLoaded = (Boolean)((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
		 if (!isPageLoaded) System.out.println("Document is loading");
		 return isPageLoaded;
		 }, timeoutInSeconds);
		 }
		 
		 public static void until(WebDriver driver, Function<WebDriver, Boolean> waitCondition){
		 until(driver, waitCondition, FileReaderManager.getInstance().getConfiFileReader().getImplicitWait());
		 }
		 
		 
		 @SuppressWarnings("deprecation")
		private static void until(WebDriver driver, Function<WebDriver, Boolean> waitCondition, Long timeoutInSeconds){
		 WebDriverWait webDriverWait = new WebDriverWait(driver, timeoutInSeconds);
		 webDriverWait.withTimeout(timeoutInSeconds, TimeUnit.SECONDS);
		 try{
		 webDriverWait.until(waitCondition);
		 }catch (Exception e){
		 System.out.println(e.getMessage());
		 }          
		 }
		 
	
		 
		 public static void untilClickable(WebDriver driver, WebElement element)
		 {
			 WebDriverWait wait = new WebDriverWait(driver, FileReaderManager.getInstance().getConfiFileReader().getImplicitWait());
			 
			wait.until(ExpectedConditions.elementToBeClickable(element));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
				
		 }
		 
		 public static void untilVisible(WebDriver driver, WebElement element)
		 {
			 WebDriverWait wait = new WebDriverWait(driver, FileReaderManager.getInstance().getConfiFileReader().getImplicitWait());
			 
			    wait.until(ExpectedConditions.visibilityOf(element));
			    
				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
				
		 }
		 
		 public static void waitUntilFileDownloads(int totalTimeoutInMillis)
		 
		 {
			 
		 }
		 
 public static void waitUntilElementIsInvisible(WebDriver driver, WebElement element)
		 
		 {
	     WebDriverWait wait = new WebDriverWait(driver, FileReaderManager.getInstance().getConfiFileReader().getImplicitWait());
	 
		 wait.until(ExpectedConditions.invisibilityOf(element));
		
		 }
 
 
 public static void untilVisibilityOfTrack(WebDriver driver, WebElement element)
 {
	 //WebDriverWait wait = new WebDriverWait(driver, FileReaderManager.getInstance().getConfiFileReader().getWaitingTimeForTrack());
	 WebDriverWait wait = new WebDriverWait(driver, 300);
	    wait.until(ExpectedConditions.visibilityOf(element));
	    
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
		
 }
 
 
 
 
 
		 
}
