package dataProviders;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import enums.DriverType;
import enums.EnvironmentType;

public class ConfigFileReader {
	
	private Properties properties;
    private final String propertyFilePath = "configs//Configuration.properties";
    
    public ConfigFileReader()
    {
    	
    	BufferedReader reader;
    	
    	try
    	{
    		reader = new BufferedReader (new FileReader(propertyFilePath));
    		properties = new Properties();
    		
    		try
    		{
    			properties.load(reader);
    			reader.close();
    		}catch (IOException e)
    		
    		{
    			e.printStackTrace();
    		}
    	}catch(FileNotFoundException e)
    	{
    		e.printStackTrace();
    		throw new RuntimeException("Comfiguration.properties not found at  " + propertyFilePath);
    	}
    }
    
    
    
    public String getDriverPath()
    {
    	String driverPath = properties.getProperty("driverPath");
    	if(driverPath != null) 
		return driverPath;
    	
   	else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
     }
    
    
    
    public long getImplicitWait()
    {
    	String implicitlyWait = properties.getProperty("implicitlyWait");
    	if(implicitlyWait != null) {
        try 
    	{
           return Long.parseLong(implicitlyWait);
           
    	} catch (NumberFormatException e)
        {
         throw new RuntimeException("Not able to parse value :  " +implicitlyWait + "in to Long");
        }	
    }
    	return 30;
    }
    
    
    
    public String getApplicationURL()
    {
    	String url = properties.getProperty("url");
    	if(url != null) 
    		return url;
        	
       	else throw new RuntimeException("url not specified in the Configuration.properties file.");
    	
    }
    
    
    public DriverType getBrowser()
    {
    	String browserName = properties.getProperty("browser");
         if(browserName == null || browserName.equals("chrome")) return DriverType.CHROME;
         else if(browserName.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
         else if (browserName.equals("irxplorer")) return DriverType.INTERNETEXPLORER;
         else throw new RuntimeException("BrowserName Key Value in Configuration.properties is not matched : " +browserName);
    }
    
    

    public EnvironmentType getEnvironment()
    {
    	String environmentName = properties.getProperty("test");
         if(environmentName == null || environmentName.equals("test")) return EnvironmentType.TEST;
         else if(environmentName.equalsIgnoreCase("staging")) return EnvironmentType.STAGING;
         else if (environmentName.equals("irxplorer")) return  EnvironmentType.PRODUCTION;
         else throw new RuntimeException("Environment Type Key Value in Configuration.properties is not matched : " +environmentName);
    }
    
    public Boolean getBrowserWindowSize()
    {
    	String windowSize = properties.getProperty("windoMaximize");
    	if(windowSize !=null) return Boolean.valueOf(windowSize);
		return true;
    }
    
    
    public String getReportConfigPath()
    {
    	String reportConfigPath =properties.getProperty("reportConfigPath");
    	if (reportConfigPath!=null)return reportConfigPath;
    	else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfiPath");
    }
    
    public String getUserName()
    {
    	String userName =properties.getProperty("userName");
    	if (userName!=null)return userName;
    	else throw new RuntimeException("user Name is not specified in Configuration.properties file");
    	
    }
    
    
    public String getPassword()
    {
    	String password =properties.getProperty("password");
    	if (password!=null)return password;
    	else throw new RuntimeException("password is not specified in Configuration.properties file");
    	
    }
    
    public String getdownloadFilePath()
    {
    	String dowbloadFilePath =properties.getProperty("dowbloadFilePath");
    	if (dowbloadFilePath!=null)return dowbloadFilePath;
    	else throw new RuntimeException("dowbloadFilePath is not specified in Configuration.properties file");
    	
    }
    
    public String getemailPassword()
    {
    	String emailPassword =properties.getProperty("emailPassword");
    	if (emailPassword!=null)return emailPassword;
    	else throw new RuntimeException("emailPassword is not specified in Configuration.properties file");
    	
    }
    
    public long getWaitingTimeForTrack()
    {
    	String waitForTrack = properties.getProperty("waitForTrack");
    	if(waitForTrack != null) {
        try 
    	{
           return Long.parseLong(waitForTrack);
           
    	} catch (NumberFormatException e)
        {
         throw new RuntimeException("Not able to parse value :  " +waitForTrack + "in to Long");
        }	
    }
    	return 60;
    }
    


}
