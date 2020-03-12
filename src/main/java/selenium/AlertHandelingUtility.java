package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandelingUtility {
	
	static  WebDriver driver;
	public AlertHandelingUtility(WebDriver driver) {
		AlertHandelingUtility.driver = driver;
	}
	
	public static boolean isAlertPresent() {
		
	

	    boolean presentFlag = false;

	    try {
	    	WebDriverWait wait = new WebDriverWait(driver, 2);
	        wait.until(ExpectedConditions.alertIsPresent());
	        // Check the presence of alert
	        Alert alert = driver.switchTo().alert();
	        // Alert present; set the flag
	        presentFlag = true;
	        // if present consume the alert
	        alert.accept();
	        //( Now, click on ok or cancel button )

	    } catch (NoAlertPresentException ex) {
	        // Alert not present
	        ex.printStackTrace();
	    }

	    return presentFlag;
	}

	
	public static void checkAlert() {
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, 2);
	        wait.until(ExpectedConditions.alertIsPresent());
	        Alert alert = driver.switchTo().alert();
	        alert.accept();
	    } catch (Exception e) {
	        //exception handling
	    }
	}
	
	public static void clkToJavaScriptAlert() {
		for (int i=1; i<=0; i++)
		{
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, 2);
	        wait.until(ExpectedConditions.alertIsPresent());

	        Alert javascriptconfirm = driver.switchTo().alert();
	        javascriptconfirm.accept();
	        break;
	    } catch (Exception e) {
	        System.out.println("alert:" +e.getMessage());
	    }
	}
	}
	

}
