package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;
import selenium.Log;

public class InteliePage {
	
	WebDriver driver;
	
	public InteliePage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	public void navigateTo_IntelieWelcomePage()
	{
		driver.get(FileReaderManager.getInstance().getConfiFileReader().getApplicationURL());
		Log.info("navigate to Intelie Live Welcome page");
	}
}
