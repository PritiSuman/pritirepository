package selenium;

import java.awt.image.BufferedImage;



import java.io.File;
import java.io.IOException;
import java.awt.image.DataBuffer;
import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.cucumber.listener.Reporter;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.Coords;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenCaptureUtility 
{

	

	public boolean areImagesEqual(String baseline, String screenshots) throws InterruptedException
	{
		
		  Thread.sleep(3000);
		  
		BufferedImage imgBaseline = null;
		BufferedImage imgScreenshots = null;
		try {
		imgBaseline = ImageIO.read(new File(System.getProperty("user.dir")+ "\\src\\images\\baseline\\" + baseline + ".png"));
		
		imgScreenshots = ImageIO.read(new File(System.getProperty("user.dir")+ "\\src\\images\\screenshots\\" + screenshots + ".png"));
		//new File(System.getProperty("user.dir")+ "\\src\\downloadFiles\\diffFiles")
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
			
			ImageDiff diff = new ImageDiffer().makeDiff(imgBaseline, imgScreenshots).withDiffSizeTrigger(100);
			
			boolean isDifferent = diff.hasDiff();
			
			if (isDifferent)
			{
				BufferedImage diffImage= diff.getMarkedImage();
				
				try
				{
				ImageIO.write(diffImage,  "png", new File(System.getProperty("user.dir")+ "\\src\\images\\diffImages\\" + baseline + ".png"));
				String imagepath = (System.getProperty("user.dir")+ "\\src\\images\\diffImages\\" +baseline + ".png");
				Reporter.addScreenCaptureFromPath(imagepath, baseline);
				} catch (IOException e1) {}
					
		}
		
		
		return !isDifferent;
		
		}
	
	// take page screen shot method
	
   public void takePageScreenShot(WebDriver driver, String name) throws InterruptedException 
	
	{
	
	  Thread.sleep(3000);
		Screenshot screen = new AShot().takeScreenshot(driver);
		BufferedImage b1 = screen.getImage();
		
		File file = new File(System.getProperty("user.dir")+ "\\src\\images\\screenshots\\" + name + ".png");
		try {
			ImageIO.write(b1, "png", file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
 

   

		

	// take page screen shot with improve feature to scroll down page
	public void takePageScreenShotimpr(WebDriver driver, String name) throws InterruptedException 
	
	{
		
		  Thread.sleep(3000);
		Screenshot screen = new AShot().shootingStrategy(ShootingStrategies.viewportNonRetina(0, 200, 0)).takeScreenshot(driver);
		BufferedImage b1 = screen.getImage();
		
		File file = new File(System.getProperty("user.dir")+ "\\src\\images\\screenshots\\" + name + ".png");
		try {
			ImageIO.write(b1, "png", file);
		} catch (IOException e) {
			Log.error("Class Utils | Method takeScreenshot | Exception occured while capturing ScreenShot : "+e.getMessage());
			
			e.printStackTrace();
			
		}
		
	}
	
	// Take screen shot for a element on page
	
	public void takeElementsScreenshot(WebDriver driver, String name, WebElement element ) throws InterruptedException
	{
		
		  Thread.sleep(30000);
		Screenshot screen = new AShot().shootingStrategy(ShootingStrategies.viewportNonRetina(0, 50000, 0)).coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver, element); //.takeScreenshot(driver);
		  //Screenshot screen = new AShot().
		  BufferedImage b1 = screen.getImage();
		
		File file = new File(System.getProperty("user.dir")+ "\\src\\images\\screenshots\\" + name + ".png");
		try {
			ImageIO.write(b1, "png", file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
	

// Take screen shot for baseline with improve feature
	public void prepareBaseLineImagesImpr(WebDriver driver, String name) throws InterruptedException {
		  Thread.sleep(3000);
		Screenshot screen = new AShot().shootingStrategy(ShootingStrategies.viewportPasting( 1000)).takeScreenshot(driver);
		BufferedImage b1 = screen.getImage();
		
		File file = new File(System.getProperty("user.dir")+ "\\src\\images\\baseline\\" + name + ".png");
		try {
			ImageIO.write(b1, "png", file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	  // Take page screen shot and save at baseline folder
	public void prepareBaseLineImages(WebDriver driver, String name) throws InterruptedException {
		
		  Thread.sleep(3000);
		Screenshot screen = new AShot().takeScreenshot(driver);
		BufferedImage b1 = screen.getImage();
		
		
		File file = new File(System.getProperty("user.dir")+ "\\src\\images\\baseline\\" + name + ".png");
		try {
			ImageIO.write(b1, "png", file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	// take page screen shot with'TakesScreenshot' method to save in baseline
	
	public static void takeSnapShotBaseline(WebDriver webdriver,String name) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(System.getProperty("user.dir")+ "\\src\\images\\baseline\\" + name + ".png");

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

}
	
	// take page screen shot with'TakesScreenshot' method to save in screenshot
	
	public static void takeSnapShotImage(WebDriver webdriver,String name) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(System.getProperty("user.dir")+ "\\src\\images\\actualImages\\" + name + ".png");

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

}


	
	
}
