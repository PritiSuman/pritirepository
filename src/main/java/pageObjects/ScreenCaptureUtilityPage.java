package pageObjects;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import selenium.ScreenCaptureUtility;
import selenium.Wait;

public class ScreenCaptureUtilityPage {
	
	WebDriver driver;
	
	public ScreenCaptureUtilityPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	
	public void takeScreenShotoImprove(String name, WebElement element)
	{
		Wait.untilVisibilityOfTrack(driver, element);
		
		try{
		
			new ScreenCaptureUtility().takePageScreenShotimpr(driver, name);
		}
		
		  catch(Exception e)
		  {
		     
		     System.out.println("takeScreenShotofHiddenTrack1: " + e.getMessage());
		  }
	  }
	
	
	
	
	public void takeScreenShot(String name)
	{
		
		try{
		
			new ScreenCaptureUtility().takePageScreenShot(driver, name);
		}
		
		  catch(Exception e)
		  {
		     
		     System.out.println("takeScreenShotofHiddenTrack1: " + e.getMessage());
		  }
	  }
	
	
	  

    public void validateScreenShotWithBaselineImage(String name1, String name2) throws Throwable
    {
	Assert.assertTrue(new ScreenCaptureUtility().areImagesEqual(name1, name2));
     }

    
    public void takeElementsScreenshot( String name, WebElement element1, WebElement element2) throws InterruptedException
	{
    	Wait.untilVisibilityOfTrack(driver, element2);
		  Thread.sleep(30000);
		Screenshot screen = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver, element1); //.takeScreenshot(driver);
		BufferedImage b1 = screen.getImage();
		
		File file = new File(System.getProperty("user.dir")+ "\\src\\images\\screenshots\\" + name + ".png");
		try {
			ImageIO.write(b1, "png", file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}

}
