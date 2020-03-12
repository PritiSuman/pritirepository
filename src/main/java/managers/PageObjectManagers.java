package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.AlertPage;
import pageObjects.HomePage;
import pageObjects.InteliePage;
import pageObjects.LayoutPage;
import pageObjects.LeftRigAndWellFilterPage;
import pageObjects.LoginPage;
import pageObjects.WMS1_RigActivityPage;
import pageObjects.ScreenCaptureUtilityPage;
import pageObjects.TimeAndHourPage;
import pageObjects.WMS1_ChartOptionsPage;
import pageObjects.WMS1_ExpandPage;
import pageObjects.WMS1_ExpandedDataExportPage;
import pageObjects.WMS1_NormalDataExportPage;
import pageObjects.WMS1_NormalSendEmailPage;
import pageObjects.WMS1_HoverPage;

public class PageObjectManagers {
	
	private WebDriver driver;
	private LoginPage loginPage;
	private InteliePage inteliePage;
	private HomePage homePage;
	private AlertPage alertPage;
	private WMS1_NormalDataExportPage wms1_DataExportPage;
	private LeftRigAndWellFilterPage leftRigAndWellFilterPage;
	private TimeAndHourPage timeAndHourPage;
	private WMS1_ExpandedDataExportPage wms1_ExpandedDataExportPage;
	private WMS1_NormalSendEmailPage wms1_NormalSendEmailPage;
	private LayoutPage layoutPage;
	private ScreenCaptureUtilityPage screenCaptureUtilityPage;
	private WMS1_ExpandPage wms1_ExpandPage;
	private WMS1_HoverPage wms1_Page;
	private WMS1_RigActivityPage wms1_RigActivityPage;
	private WMS1_ChartOptionsPage wms1_ChartOptionsPage;
	
	public  PageObjectManagers(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public LoginPage getLoginPage()
	{
		return (loginPage == null) ?  loginPage = new LoginPage(driver): loginPage;
	}
	
	public InteliePage getInteliePage()
	{
		return (inteliePage == null)? inteliePage = new InteliePage(driver): inteliePage;
	}
	
	public HomePage getHomePage()
	{
		return (homePage == null)? homePage = new HomePage(driver): homePage;
	}
	
	public AlertPage getAlertPage()
	{
		return (alertPage == null)? alertPage = new AlertPage(driver): alertPage;
	}
	
	public WMS1_NormalDataExportPage getWMS1_DataExportPage()
	{
		return (wms1_DataExportPage == null)? wms1_DataExportPage = new WMS1_NormalDataExportPage(driver): wms1_DataExportPage;
	}
	
	public WMS1_ExpandedDataExportPage getWMS1_ExpandedDataExportPage()
	{
		return (wms1_ExpandedDataExportPage == null)? wms1_ExpandedDataExportPage = new WMS1_ExpandedDataExportPage(driver): wms1_ExpandedDataExportPage;
	}
	
	public LeftRigAndWellFilterPage getLeftRigAndWellFilterPage()
	{
		return (leftRigAndWellFilterPage == null)? leftRigAndWellFilterPage = new LeftRigAndWellFilterPage(driver): leftRigAndWellFilterPage;
	}
	
	public TimeAndHourPage getTimeAndHourPage()
	{
		return (timeAndHourPage == null)? timeAndHourPage = new TimeAndHourPage(driver): timeAndHourPage;
	}
	
	public WMS1_NormalSendEmailPage getWMS1_NormalSendEmailPage()
	{
		return (wms1_NormalSendEmailPage == null)? wms1_NormalSendEmailPage = new WMS1_NormalSendEmailPage(driver): wms1_NormalSendEmailPage;
	}
	
	public LayoutPage getLayoutPage()
	{
		return (layoutPage == null)? layoutPage = new LayoutPage(driver): layoutPage;
	}
	
	public ScreenCaptureUtilityPage getScreenCaptureUtilityPage()
	{
		return (screenCaptureUtilityPage == null)? screenCaptureUtilityPage = new ScreenCaptureUtilityPage(driver): screenCaptureUtilityPage;
	}
	
	public WMS1_ExpandPage getWMS1_ExpandPage()
	{
		return (wms1_ExpandPage == null)? wms1_ExpandPage = new WMS1_ExpandPage(driver): wms1_ExpandPage;
	}

	public WMS1_HoverPage getWMS1_Page()
	{
		return ( wms1_Page == null)?  wms1_Page = new WMS1_HoverPage(driver):  wms1_Page;
	}

	public WMS1_RigActivityPage getWMS1_RigActivityPage()
	{
		return ( wms1_RigActivityPage == null)?  wms1_RigActivityPage = new WMS1_RigActivityPage(driver):  wms1_RigActivityPage;
	}
	
	public WMS1_ChartOptionsPage getWMS1_ChartOptionsPage()
	{
		return ( wms1_ChartOptionsPage == null)?  wms1_ChartOptionsPage = new WMS1_ChartOptionsPage(driver):  wms1_ChartOptionsPage;
	}
	
	

	
}
