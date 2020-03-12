package testRunner;
import java.io.File;




import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.xml.DOMConfigurator;

//import java.io.IOException;

//import org.junit.runner.RunWith;
import org.apache.commons.io.FileUtils;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.runner.RunWith;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;


import cucumber.api.testng.AbstractTestNGCucumberTests;
import managers.FileReaderManager;
//import selenium.FileReadingUtility;
 
 //@RunWith(Cucumber.class)

@CucumberOptions(
features="src/test/resources/functionalTests", 
tags= {"@RegressionTest1"},
glue= {"stepDefenitions"},
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:"},
monochrome = true
)


public class TestRunner extends AbstractTestNGCucumberTests {
	 
	 @BeforeClass
	 public static void beforeClass() throws IOException
	 {
	  
		   String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		   ExtentProperties extentProperties = ExtentProperties.INSTANCE;
		   extentProperties.setReportPath("reports/cucumber-reports/"+timeStamp.replace(":","_").replace(".","_")+".html");
		    
		     //String dirPath = (System.getProperty("user.dir")+ FileReaderManager.getInstance().getConfiFileReader().getdownloadFilePath());
		     //FileReadingUtility.deleteAlltheFilesWithExt(dirPath, ".csv");
	
		
	 
		try {
			FileUtils.cleanDirectory(new File(System.getProperty("user.dir")+ "\\src\\downloadFiles\\actualFiles"));
			FileUtils.cleanDirectory(new File(System.getProperty("user.dir")+ "\\src\\images\\diffImages"));
			FileUtils.cleanDirectory(new File(System.getProperty("user.dir")+ "\\src\\images\\screenshots"));
			FileUtils.cleanDirectory(new File(System.getProperty("user.dir")+ "\\src\\downloadFiles\\diffFiles"));
			 File dir = new File(System.getProperty("user.dir")+ FileReaderManager.getInstance().getConfiFileReader().getdownloadFilePath());
			/* for (File file: dir.listFiles())
				if (file.getName().contains(".json"))
				 file.delete();*/
	 
	
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	 }
	 	 
	
	 
	
 
	@AfterClass
	public static void WriteExtentReport()
	{
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfiFileReader().getReportConfigPath()));
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timeZone"));
		Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
		Reporter.setSystemInfo("Selenium", "3,7,0");
		Reporter.setSystemInfo("Maven", "3.5.2");
		Reporter.setSystemInfo("Java Version", "1.8.0.131");
		
	}
}
	
	


