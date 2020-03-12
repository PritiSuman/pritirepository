package managers;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import enums.DriverType;
import enums.EnvironmentType;

public class WebDriverManager {
	
	private WebDriver driver;
	private static DriverType driverType;
	private static EnvironmentType environmentType;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	
	public  WebDriverManager()
	{
		driverType = FileReaderManager.getInstance().getConfiFileReader().getBrowser();
		environmentType = FileReaderManager.getInstance().getConfiFileReader().getEnvironment();
	}
	
	
	public WebDriver getDriver()
	{
		if (driver == null) driver =createDriver();
		return driver;
	}
	
	private WebDriver createDriver()
	{
		switch (environmentType)
		{
		case TEST : driver = createTestDriver();
		break;
		case STAGING : driver = createStagingDriver();
		break;
		case PRODUCTION : driver = createProductionDriver();
		break;
		
		}
		
		return driver;
	}
	
	
	private WebDriver createStagingDriver()
	{
		
	throw new RuntimeException("StagingEnvironment is not yet implemented");   

    }
	
	private WebDriver createProductionDriver()
	{
		
	throw new RuntimeException("ProductionEnvironment is not yet implemented");   

    }
	
	private WebDriver createTestDriver()
	{
		switch (driverType) {
		case FIREFOX :
			driver = new FirefoxDriver();
		    break;
		case CHROME :
			System.setProperty(CHROME_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfiFileReader().getDriverPath());
			HashMap<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_settings.popups", 0);
			prefs.put("download.prompt_for_download", false);
		
			prefs.put("download.default_directory", System.getProperty("user.dir") + FileReaderManager.getInstance().getConfiFileReader().getdownloadFilePath() );
		   
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			//options.addArguments("--test-type");
			//options.addArguments("--disable-extensions");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	        capabilities.setCapability(CapabilityType.APPLICATION_NAME, true);
			driver = new ChromeDriver(options);
			
			break;
			
		case INTERNETEXPLORER :
			driver = new InternetExplorerDriver();
			break;
			
		}
		
		if (FileReaderManager.getInstance().getConfiFileReader().getBrowserWindowSize())driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfiFileReader().getImplicitWait(), TimeUnit.SECONDS);
	
	return driver;
		
	}
	
	public void closeDriver()
	{
		driver.close();
		driver.quit();
	}
}

	
	
