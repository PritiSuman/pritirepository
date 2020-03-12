package pageObjects;

import java.awt.Robot;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.listener.Reporter;

import selenium.Log;
import selenium.Wait;

public class WMS1_HoverPage {
	
	Actions action;
	 WebDriver driver;
	 WMS1_NormalDataExportPage  wms1normalmodepage;
	public WMS1_HoverPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Track01
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-565 widget-container')]/descendant::div[contains(@title, 'BP_DEP_H_TDM')]")
	public WebElement nemonics_DepthHoleMeasure_Track1;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-565 widget-container')]/descendant::div[contains(@title, 'BP_DEP_H_TVD')]")
	public WebElement nemonics_DepthHoleVertical_Track1;
	
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-565 widget-container')]/descendant::div[contains(@title, 'BP_DEP_BIT_MD')]")
	public WebElement nemonics_DepthBitMeasure_Track1;
	
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-565 widget-container')]/descendant::div[contains(@title, 'BP_DEP_BIT_TVD')]")
	public WebElement nemonics_DepthBitVertical_Track1;
	
	//Track2
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-566 widget-container')]/descendant::div[contains(@title, 'BP_GAS_AVG')]")
	public WebElement nemonics_totalGas_Track2;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-566 widget-container')]/descendant::div[contains(@title, 'BP_GAS_C1')]")
	public WebElement nemonics_Methane_Track2;
	
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-566 widget-container')]/descendant::div[contains(@title, 'BP_GAS_C2')]")
	public WebElement nemonics_Ethane_Track2;
	
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-566 widget-container')]/descendant::div[contains(@title, 'BP_GAS_C3')]")
	public WebElement nemonics_Propane_Track2;
	
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-566 widget-container')]/descendant::div[contains(@title, 'BP_GAS_C4')]")
	public WebElement nemonics_ISoButane_Track2;
	
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-566 widget-container')]/descendant::div[contains(@title, 'BP_PMP_STK_COUNT')]")
	public WebElement nemonics_TotalStrokeSinceResetMudPumps_Track2;
	
	//Track03
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-608 widget-container')]/descendant::div[contains(@title, 'BP_PRESS_WHEAD')]")
	public WebElement nemonics_PressureWellhead_Track3;
	
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-608 widget-container')]/descendant::div[contains(@title, 'BP_PRESS_SPP_AVG')]")
	public WebElement nemonics_PressureStandPipe_Track3;
	
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-608 widget-container')]/descendant::div[contains(@title, 'BP_PRESS_CHOKE')]")
	public WebElement nemonics_PressureChokeLine_Track3;
	
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-608 widget-container')]/descendant::div[contains(@title, 'BP_PRESS_KILL')]")
	public WebElement nemonics_PressureKilLine_Track3;
	
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-608 widget-container')]/descendant::div[contains(@title, 'BP_MUD_MFI_AVG')]")
	public WebElement nemonics_FlowInMud_Track3;
	
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-608 widget-container')]/descendant::div[contains(@title, 'BP_MUD_MFO_AVG')]")
	public WebElement nemonics_FlowOutMud_Track3;
	
	//Track 04
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-569 widget-container')]/descendant::div[contains(@title, 'BP_RPM_SURF_AVG')]")
	public WebElement nemonics_RPMSurface_Track4;
	
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-569 widget-container')]/descendant::div[contains(@title, 'BP_TQ_SURF_AVG')]")
	public WebElement nemonics_TorqueSurface_Track4;
	
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-569 widget-container')]/descendant::div[contains(@title, 'BP_HKL_AVG')]")
	public WebElement nemonics_HookLoad_Track4;
	
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-569 widget-container')]/descendant::div[contains(@title, 'BP_WOB_AVG')]")
	public WebElement nemonics_WeightOnBit_Track4;
	
	
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-569 widget-container')]/descendant::div[contains(@title, 'BP_BLK_POS')]")
	public WebElement nemonics_BlockPosition_Track4;
	
	

	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'widget-569 widget-container')]/descendant::div[contains(@title, 'BP_ROP_INST')]")
	public WebElement nemonics_RateOfPentrationInstantaneous_Track4;
	
	
	//MethodTrack01
	public void hoverToFindNemonicsDepthHoleMeasureOfTrack1()
	{
		wms1normalmodepage = new  WMS1_NormalDataExportPage(driver);
		for(int i=0; i<=2;i++){
			  try{
				  
				  Wait.untilVisible(driver, wms1normalmodepage.track_01);
				  Log.info("Wait is applied until" + nemonics_DepthHoleMeasure_Track1.getText() + "not visible");
				  action =  new Actions(driver);
				   Point coordinate = nemonics_DepthHoleMeasure_Track1.getLocation();
					  System.out.println( "Coordinate of DepthHole Measure" +coordinate);
					  Robot robot = new Robot();
					  robot.mouseMove(coordinate.getX()+4, coordinate.getY()+120);
					   action.moveToElement(nemonics_DepthHoleMeasure_Track1).build().perform();
				
				  Thread.sleep(4000);
				  
				  
			     break;
			  }
			  catch(Exception e){
			     Log.info(e.getMessage());
			     System.out.println("Track 1 is taking more time than expected time to display: " + e.getMessage());
			     Log.info("Track 1 is taking more time than expected time to display");
			     Reporter.addStepLog("Track 1 is taking more time than expected time to display");
			  }
			}
	}
		
		
		public void hoverToFindNemonicsDepthHoleVerticalOfTrack1()
		{
			wms1normalmodepage = new  WMS1_NormalDataExportPage(driver);
			for(int i=0; i<=2;i++){
				  try{
					  
					  Wait.untilVisible(driver, wms1normalmodepage.track_01);
					  Log.info("Wait is applied until" + nemonics_DepthHoleVertical_Track1.getText() + "not visible");
					  action =  new Actions(driver);
					   Point coordinate = nemonics_DepthHoleVertical_Track1.getLocation();
						  System.out.println( "Coordinate of DepthHoleVertical_Track1" +coordinate);
						  Robot robot = new Robot();
						  robot.mouseMove(coordinate.getX()+4, coordinate.getY()+120);
					  action.moveToElement(nemonics_DepthHoleVertical_Track1).build().perform();
					  Thread.sleep(2000);
					  
					  
				     break;
				  }
				  catch(Exception e){
				     Log.info(e.getMessage());
				     System.out.println("Track 1 is taking more time than expected time to display: " + e.getMessage());
				     Log.info("Track 1 is taking more time than expected time to display");
				     Reporter.addStepLog("Track 1 is taking more time than expected time to display");
				  }
				}
			
		
	}
	
		
		public void hoverToFindNemonicsDepthBitMeasureOfTrack1()
		{
			wms1normalmodepage = new  WMS1_NormalDataExportPage(driver);
			for(int i=0; i<=2;i++){
				  try{
					  
					  Wait.untilVisible(driver, wms1normalmodepage.track_01);
					  Log.info("Wait is applied until" + nemonics_DepthBitMeasure_Track1.getText() + "not visible");
					  action =  new Actions(driver);
					   Point coordinate = nemonics_DepthBitMeasure_Track1.getLocation();
						  System.out.println( "Coordinate of DepthBitMeasure_Track1" +coordinate);
						  Robot robot = new Robot();
						  robot.mouseMove(coordinate.getX()+4, coordinate.getY()+120);
					  action.moveToElement(nemonics_DepthBitMeasure_Track1).build().perform();
					  Thread.sleep(1000);
					  
					  
				     break;
				  }
				  catch(Exception e){
				     Log.info(e.getMessage());
				     System.out.println("Track 1 is taking more time than expected time to display: " + e.getMessage());
				     Log.info("Track 1 is taking more time than expected time to display");
				     Reporter.addStepLog("Track 1 is taking more time than expected time to display");
				  }
				}
			
		}
		
		public void hoverToFindNemonicsDepthBitVerticalOfTrack1()
		{
			wms1normalmodepage = new  WMS1_NormalDataExportPage(driver);
			for(int i=0; i<=2;i++){
				  try{
					  
					  Wait.untilVisible(driver, wms1normalmodepage.track_01);
					  Log.info("Wait is applied until" + nemonics_DepthBitVertical_Track1.getText() + "not visible");
					  action =  new Actions(driver);
					   Point coordinate = nemonics_DepthBitVertical_Track1.getLocation();
						  System.out.println( "Coordinate of DepthBitVertical_Track1" +coordinate);
						  Robot robot = new Robot();
						  robot.mouseMove(coordinate.getX()+4, coordinate.getY()+120);
					  action.moveToElement(nemonics_DepthBitVertical_Track1).build().perform();
					  Thread.sleep(1000);
					  
					  
				     break;
				  }
				  catch(Exception e){
				     Log.info(e.getMessage());
				     System.out.println("Track 1 is taking more time than expected time to display: " + e.getMessage());
				     Log.info("Track 1 is taking more time than expected time to display");
				     Reporter.addStepLog("Track 1 is taking more time than expected time to display");
				  }
				}
			
		}
		
		//Track02
		
		
		public void hoverToFindNemonicsTotalGasOfTrack2()
		{
			wms1normalmodepage = new  WMS1_NormalDataExportPage(driver);
			for(int i=0; i<=2;i++){
				  try{
					  
					  Wait.untilVisible(driver, wms1normalmodepage.track_01);
					  Log.info("Wait is applied until" + nemonics_totalGas_Track2.getText() + "not visible");
					  Point coordinate = nemonics_totalGas_Track2.getLocation();
					  System.out.println( "Coordinate of Gas Avg" +coordinate);
					  //action =  new Actions(driver);
					  Robot robot = new Robot();
					
					  robot.mouseMove(coordinate.getX()+7, coordinate.getY()+120);
					  action.moveToElement(nemonics_totalGas_Track2).build().perform();
					  Thread.sleep(3000);
					  
					  
				     break;
				  }
				  catch(Exception e){
				     Log.info(e.getMessage());
				     System.out.println("Track 2 is taking more time than expected time to display: " + e.getMessage());
				     Log.info("Track 2 is taking more time than expected time to display");
				     Reporter.addStepLog("Track 2 is taking more time than expected time to display");
				  }
				}
		}
		
		public void hoverToFindNemonicsEthaneOfTrack2()
		{
			wms1normalmodepage = new  WMS1_NormalDataExportPage(driver);
			for(int i=0; i<=2;i++){
				  try{
					  
					  Wait.untilVisible(driver, wms1normalmodepage.track_01);
					  Log.info("Wait is applied until" + nemonics_Ethane_Track2.getText() + "not visible");
					   action =  new Actions(driver);
					   Point coordinate = nemonics_Ethane_Track2.getLocation();
						  System.out.println( "Coordinate of Gas Ethane" +coordinate);
						  Robot robot = new Robot();
						  robot.mouseMove(coordinate.getX()+4, coordinate.getY()+120);
						   action.moveToElement(nemonics_Ethane_Track2).build().perform();
					  Thread.sleep(2000);
					  
					  
				     break;
				  }
				  catch(Exception e){
				     Log.info(e.getMessage());
				     System.out.println("Track 2 is taking more time than expected time to display: " + e.getMessage());
				     Log.info("Track 2 is taking more time than expected time to display");
				     Reporter.addStepLog("Track 2 is taking more time than expected time to display");
				  }
				}
			
			
		}
		
		
		public void hoverToFindNemonicsMethaneOfTrack2()
		{
			wms1normalmodepage = new  WMS1_NormalDataExportPage(driver);
			for(int i=0; i<=2;i++){
				  try{
					  
					  Wait.untilVisible(driver, wms1normalmodepage.track_01);
					  Log.info("Wait is applied until" + nemonics_Methane_Track2.getText() + "not visible");
					   action =  new Actions(driver);
					   Point coordinate = nemonics_Methane_Track2.getLocation();
						  System.out.println( "Coordinate of Gas Methane" +coordinate);
						  Robot robot = new Robot();
						  robot.mouseMove(coordinate.getX()+4, coordinate.getY()+120);
					  action.moveToElement(nemonics_Methane_Track2).build().perform();
					  Thread.sleep(2000);
					  
					  
				     break;
				  }
				  catch(Exception e){
				     Log.info(e.getMessage());
				     System.out.println("Track 2 is taking more time than expected time to display: " + e.getMessage());
				     Log.info("Track 2 is taking more time than expected time to display");
				     Reporter.addStepLog("Track 2 is taking more time than expected time to display");
				  }
				}
			
		}
		
		
		public void hoverToFindNemonicsPropaneOfTrack2()
		{
			wms1normalmodepage = new  WMS1_NormalDataExportPage(driver);
			for(int i=0; i<=2;i++){
				  try{
					  
					  Wait.untilVisible(driver, wms1normalmodepage.track_01);
					  Log.info("Wait is applied until" + nemonics_Propane_Track2.getText() + "not visible");
					   action =  new Actions(driver);
					   Robot robot = new Robot();

					      Point coordinate = nemonics_Propane_Track2.getLocation();
						  System.out.println( "Coordinate of Gas Propane" +coordinate);
						 
						  robot.mouseMove(coordinate.getX()+4, coordinate.getY()+120);
					  action.moveToElement(nemonics_Propane_Track2).build().perform();
					  Thread.sleep(1000);
					  
					  
				     break;
				  }
				  catch(Exception e){
				     Log.info(e.getMessage());
				     System.out.println("Track 2 is taking more time than expected time to display: " + e.getMessage());
				     Log.info("Track 2 is taking more time than expected time to display");
				     Reporter.addStepLog("Track 2 is taking more time than expected time to display");
				  }
				}
		}
		
		
		public void hoverToFindNemonicsISoButaneOfTrack2()
		{
			wms1normalmodepage = new  WMS1_NormalDataExportPage(driver);
			for(int i=0; i<=2;i++){
				  try{
					  
					  Wait.untilVisible(driver, wms1normalmodepage.track_01);
					  Log.info("Wait is applied until" + nemonics_ISoButane_Track2.getText() + "not visible");
					  action =  new Actions(driver);
					   Robot robot = new Robot();

					      Point coordinate = nemonics_ISoButane_Track2.getLocation();
						  System.out.println( "Coordinate of Gas ISoButane" +coordinate);
						 
						  robot.mouseMove(coordinate.getX()+4, coordinate.getY()+120);
					   
					  action.moveToElement(nemonics_ISoButane_Track2).build().perform();
					  Thread.sleep(1000);
					  
					  
				     break;
				  }
				  catch(Exception e){
				     Log.info(e.getMessage());
				     System.out.println("Track 2 is taking more time than expected time to display: " + e.getMessage());
				     Log.info("Track 2 is taking more time than expected time to display");
				     Reporter.addStepLog("Track 2 is taking more time than expected time to display");
				  }
				}
		}
		
		
		public void hoverToFindNemonicsTotalStrokeSincePumresetMudOfTrack2()
		{
			wms1normalmodepage = new  WMS1_NormalDataExportPage(driver);
			for(int i=0; i<=2;i++){
				  try{
					  
					  Wait.untilVisible(driver, wms1normalmodepage.track_01);
					  Log.info("Wait is applied until" + nemonics_TotalStrokeSinceResetMudPumps_Track2.getText() + "not visible");
					  action =  new Actions(driver);
					   Robot robot = new Robot();

					      Point coordinate = nemonics_TotalStrokeSinceResetMudPumps_Track2.getLocation();
						  System.out.println( "Coordinate of Gas TotalStrokeSinceResetMudPumps_Track2" +coordinate);
						 
						  robot.mouseMove(coordinate.getX()+4, coordinate.getY()+120);
					  action.moveToElement(nemonics_TotalStrokeSinceResetMudPumps_Track2).build().perform();
					  Thread.sleep(1000);
					  
					  
				     break;
				  }
				  catch(Exception e){
				     Log.info(e.getMessage());
				     System.out.println("Track 2 is taking more time than expected time to display: " + e.getMessage());
				     Log.info("Track 2 is taking more time than expected time to display");
				     Reporter.addStepLog("Track 2 is taking more time than expected time to display");
				  }
				}
		}
		
		
		//Track03
		
		public void hoverToFindNemonicsToPressureWellHeadTrack3()
		{
			wms1normalmodepage = new  WMS1_NormalDataExportPage(driver);
			for(int i=0; i<=2;i++){
				  try{
					  
					  Wait.untilVisible(driver, wms1normalmodepage.track_03);
					  Log.info("Wait is applied until" + nemonics_PressureWellhead_Track3.getText() + "not visible");
					  action =  new Actions(driver);
					   Point coordinate = nemonics_PressureWellhead_Track3.getLocation();
						  System.out.println( "Coordinate of PressureWellhead_Track3" +coordinate);
						  Robot robot = new Robot();
						  robot.mouseMove(coordinate.getX()+4, coordinate.getY()+120);
					  action.moveToElement(nemonics_PressureWellhead_Track3).build().perform();
					  Thread.sleep(1000);
					  
					  
				     break;
				  }
				  catch(Exception e){
				     Log.info(e.getMessage());
				     System.out.println("Track 3 is taking more time than expected time to display: " + e.getMessage());
				     Log.info("Track 3 is taking more time than expected time to display");
				     Reporter.addStepLog("Track 3 is taking more time than expected time to display");
				  }
				}
		}
		
		
		public void hoverToFindNemonicsToPressureStandPipeTrack3()
		{
			wms1normalmodepage = new  WMS1_NormalDataExportPage(driver);
			for(int i=0; i<=2;i++){
				  try{
					  
					  Wait.untilVisible(driver, wms1normalmodepage.track_03);
					  Log.info("Wait is applied until" + nemonics_PressureStandPipe_Track3.getText() + "not visible");
					  action =  new Actions(driver);
					   Point coordinate = nemonics_PressureStandPipe_Track3.getLocation();
						  System.out.println( "Coordinate of PressureStandPipe_Track3" +coordinate);
						  Robot robot = new Robot();
						  robot.mouseMove(coordinate.getX()+4, coordinate.getY()+120);
					  action.moveToElement(nemonics_PressureStandPipe_Track3).build().perform();
					  Thread.sleep(1000);
					  
					  
				     break;
				  }
				  catch(Exception e){
				     Log.info(e.getMessage());
				     System.out.println("Track 3 is taking more time than expected time to display: " + e.getMessage());
				     Log.info("Track 3 is taking more time than expected time to display");
				     Reporter.addStepLog("Track 3 is taking more time than expected time to display");
				  }
				}
		}
		
		
		public void hoverToFindNemonicsToPressureChokeLineTrack3()
		{
			wms1normalmodepage = new  WMS1_NormalDataExportPage(driver);
			for(int i=0; i<=2;i++){
				  try{
					  
					  Wait.untilVisible(driver, wms1normalmodepage.track_03);
					  Log.info("Wait is applied until" + nemonics_PressureChokeLine_Track3.getText() + "not visible");
					  action =  new Actions(driver);
					   Point coordinate = nemonics_PressureChokeLine_Track3.getLocation();
						  System.out.println( "Coordinate of PressureChokeLine_Track3" +coordinate);
						  Robot robot = new Robot();
						  robot.mouseMove(coordinate.getX()+4, coordinate.getY()+120);
					  action.moveToElement(nemonics_PressureChokeLine_Track3).build().perform();
					  Thread.sleep(1000);
					  
					  
				     break;
				  }
				  catch(Exception e){
				     Log.info(e.getMessage());
				     System.out.println("Track 3 is taking more time than expected time to display: " + e.getMessage());
				     Log.info("Track 3 is taking more time than expected time to display");
				     Reporter.addStepLog("Track 3 is taking more time than expected time to display");
				  }
				}
		}
		
		
		public void hoverToFindNemonicsToPressureKillLineTrack3()
		{
			wms1normalmodepage = new  WMS1_NormalDataExportPage(driver);
			for(int i=0; i<=2;i++){
				  try{
					  
					  Wait.untilVisible(driver, wms1normalmodepage.track_03);
					  Log.info("Wait is applied until" + nemonics_PressureKilLine_Track3.getText() + "not visible");
					  action =  new Actions(driver);
					   Point coordinate = nemonics_PressureKilLine_Track3.getLocation();
						  System.out.println( "Coordinate of PressureKilLine_Track3" +coordinate);
						  Robot robot = new Robot();
						  robot.mouseMove(coordinate.getX()+4, coordinate.getY()+120);
					  action.moveToElement(nemonics_PressureKilLine_Track3).build().perform();
					  Thread.sleep(1000);
					  
					  
				     break;
				  }
				  catch(Exception e){
				     Log.info(e.getMessage());
				     System.out.println("Track 3 is taking more time than expected time to display: " + e.getMessage());
				     Log.info("Track 3 is taking more time than expected time to display");
				     Reporter.addStepLog("Track 3 is taking more time than expected time to display");
				  }
				}
		}
		
		public void hoverToFindNemonicsToFlowInMudTrack3()
		{
			wms1normalmodepage = new  WMS1_NormalDataExportPage(driver);
			for(int i=0; i<=2;i++){
				  try{
					  
					  Wait.untilVisible(driver, wms1normalmodepage.track_03);
					  Log.info("Wait is applied until" + nemonics_FlowInMud_Track3.getText() + "not visible");
					  action =  new Actions(driver);
					   Point coordinate = nemonics_FlowInMud_Track3.getLocation();
						  System.out.println( "Coordinate of FlowInMud_Track3" +coordinate);
						  Robot robot = new Robot();
						  robot.mouseMove(coordinate.getX()+4, coordinate.getY()+120);
					  action.moveToElement(nemonics_FlowInMud_Track3).build().perform();
					  Thread.sleep(1000);
					  
					  
				     break;
				  }
				  catch(Exception e){
				     Log.info(e.getMessage());
				     System.out.println("Track 3 is taking more time than expected time to display: " + e.getMessage());
				     Log.info("Track 3 is taking more time than expected time to display");
				     Reporter.addStepLog("Track 3 is taking more time than expected time to display");
				  }
				}
		}
		
		
		public void hoverToFindNemonicsToFlowOutMudTrack3()
		{
			wms1normalmodepage = new  WMS1_NormalDataExportPage(driver);
			for(int i=0; i<=2;i++){
				  try{
					  
					  Wait.untilVisible(driver, wms1normalmodepage.track_03);
					  Log.info("Wait is applied until" + nemonics_FlowOutMud_Track3.getText() + "not visible");
					  action =  new Actions(driver);
					   Point coordinate = nemonics_FlowOutMud_Track3.getLocation();
						  System.out.println( "Coordinate of FlowoutMud_Track3" +coordinate);
						  Robot robot = new Robot();
						  robot.mouseMove(coordinate.getX()+4, coordinate.getY()+120);
					 
					  action.moveToElement(nemonics_FlowOutMud_Track3).build().perform();
					  Thread.sleep(1000);
					  
					  
				     break;
				  }
				  catch(Exception e){
				     Log.info(e.getMessage());
				     System.out.println("Track 3 is taking more time than expected time to display: " + e.getMessage());
				     Log.info("Track 3 is taking more time than expected time to display");
				     Reporter.addStepLog("Track 3 is taking more time than expected time to display");
				  }
				}
		}
		
		
		//Track04
		
		
		public void hoverToFindNemonicsToRPMSurfaceTrack4()
		{
			wms1normalmodepage = new  WMS1_NormalDataExportPage(driver);
			for(int i=0; i<=2;i++){
				  try{
					  
					  Wait.untilVisible(driver, wms1normalmodepage.track_03);
					  Log.info("Wait is applied until" + nemonics_RPMSurface_Track4.getText() + "not visible");
					  action =  new Actions(driver);
					   Point coordinate = nemonics_RPMSurface_Track4.getLocation();
						  System.out.println( "Coordinate of RPMSurface_Track4" +coordinate);
						  Robot robot = new Robot();
						  robot.mouseMove(coordinate.getX()+4, coordinate.getY()+120);
					  action.moveToElement(nemonics_RPMSurface_Track4).build().perform();
					  Thread.sleep(1000);
					  
					  
				     break;
				  }
				  catch(Exception e){
				     Log.info(e.getMessage());
				     System.out.println("Track 4 is taking more time than expected time to display: " + e.getMessage());
				     Log.info("Track 4 is taking more time than expected time to display");
				     Reporter.addStepLog("Track 4 is taking more time than expected time to display");
				  }
				}
		}
		
		
		public void hoverToFindNemonicsToTorqueSurfaceTrack4()
		{
			wms1normalmodepage = new  WMS1_NormalDataExportPage(driver);
			for(int i=0; i<=2;i++){
				  try{
					  
					  Wait.untilVisible(driver, wms1normalmodepage.track_04);
					  Log.info("Wait is applied until" + nemonics_TorqueSurface_Track4.getText() + "not visible");
					  action =  new Actions(driver);
					   Point coordinate = nemonics_TorqueSurface_Track4.getLocation();
						  System.out.println( "Coordinate of TorqueSurface_Track4" +coordinate);
						  Robot robot = new Robot();
						  robot.mouseMove(coordinate.getX()+4, coordinate.getY()+120);
					  action.moveToElement(nemonics_TorqueSurface_Track4).build().perform();
					  Thread.sleep(1000);
					  
					  
				     break;
				  }
				  catch(Exception e){
				     Log.info(e.getMessage());
				     System.out.println("Track 4 is taking more time than expected time to display: " + e.getMessage());
				     Log.info("Track 4 is taking more time than expected time to display");
				     Reporter.addStepLog("Track 4 is taking more time than expected time to display");
				  }
				}
		}
		
		public void hoverToFindNemonicsToHookLoadTrack4()
		{
			wms1normalmodepage = new  WMS1_NormalDataExportPage(driver);
			for(int i=0; i<=2;i++){
				  try{
					  
					  Wait.untilVisible(driver, wms1normalmodepage.track_04);
					  Log.info("Wait is applied until" + nemonics_HookLoad_Track4.getText() + "not visible");
					  action =  new Actions(driver);
					   Point coordinate = nemonics_HookLoad_Track4.getLocation();
						  System.out.println( "Coordinate of HookLoad_Track4" +coordinate);
						  Robot robot = new Robot();
						  robot.mouseMove(coordinate.getX()+4, coordinate.getY()+120);
					  action.moveToElement(nemonics_HookLoad_Track4).build().perform();
					  Thread.sleep(1000);
					  
					  
				     break;
				  }
				  catch(Exception e){
				     Log.info(e.getMessage());
				     System.out.println("Track 4 is taking more time than expected time to display: " + e.getMessage());
				     Log.info("Track 4 is taking more time than expected time to display");
				     Reporter.addStepLog("Track 4 is taking more time than expected time to display");
				  }
				}
		}
		
		
		public void hoverToFindNemonicsToWeightOnBitTrack4()
		{
			wms1normalmodepage = new  WMS1_NormalDataExportPage(driver);
			for(int i=0; i<=2;i++){
				  try{
					  
					  Wait.untilVisible(driver, wms1normalmodepage.track_04);
					  Log.info("Wait is applied until" + nemonics_WeightOnBit_Track4.getText() + "not visible");
					  action =  new Actions(driver);
					   Point coordinate = nemonics_WeightOnBit_Track4.getLocation();
						  System.out.println( "Coordinate of WeightOnBit_Track4" +coordinate);
						  Robot robot = new Robot();
						  robot.mouseMove(coordinate.getX()+4, coordinate.getY()+120);
					  action.moveToElement(nemonics_WeightOnBit_Track4).build().perform();
					  Thread.sleep(1000);
					  
					  
				     break;
				  }
				  catch(Exception e){
				     Log.info(e.getMessage());
				     System.out.println("Track 4 is taking more time than expected time to display: " + e.getMessage());
				     Log.info("Track 4 is taking more time than expected time to display");
				     Reporter.addStepLog("Track 4 is taking more time than expected time to display");
				  }
				}
		}
		
		
		public void hoverToFindNemonicsToBlockPositionTrack4()
		{
			wms1normalmodepage = new  WMS1_NormalDataExportPage(driver);
			for(int i=0; i<=2;i++){
				  try{
					  
					  Wait.untilVisible(driver, wms1normalmodepage.track_04);
					  Log.info("Wait is applied until" + nemonics_BlockPosition_Track4.getText() + "not visible");
					  action =  new Actions(driver);
					   Point coordinate = nemonics_BlockPosition_Track4.getLocation();
						  System.out.println( "Coordinate of BlockPosition_Track4" +coordinate);
						  Robot robot = new Robot();
						  robot.mouseMove(coordinate.getX()+4, coordinate.getY()+120);
					  action.moveToElement(nemonics_BlockPosition_Track4).build().perform();
					  Thread.sleep(1000);
					  
					  
				     break;
				  }
				  catch(Exception e){
				     Log.info(e.getMessage());
				     System.out.println("Track 4 is taking more time than expected time to display: " + e.getMessage());
				     Log.info("Track 4 is taking more time than expected time to display");
				     Reporter.addStepLog("Track 4 is taking more time than expected time to display");
				  }
				}
		}
		
		
		public void hoverToFindNemonicsToRateOfPenetrationInstantaneousTrack4()
		{
			wms1normalmodepage = new  WMS1_NormalDataExportPage(driver);
			for(int i=0; i<=2;i++){
				  try{
					  
					  Wait.untilVisible(driver, wms1normalmodepage.track_04);
					  Log.info("Wait is applied until" + nemonics_RateOfPentrationInstantaneous_Track4.getText() + "not visible");
					  action =  new Actions(driver);
					   Point coordinate = nemonics_RateOfPentrationInstantaneous_Track4.getLocation();
						  System.out.println( "Coordinate of  RateOfPentrationInstantaneous_Track4" +coordinate);
						  Robot robot = new Robot();
						  robot.mouseMove(coordinate.getX()+4, coordinate.getY()+120);
					  action.moveToElement(nemonics_RateOfPentrationInstantaneous_Track4).build().perform();
					  Thread.sleep(1000);
					  
					  
				     break;
				  }
				  catch(Exception e){
				     Log.info(e.getMessage());
				     System.out.println("Track 4 is taking more time than expected time to display: " + e.getMessage());
				     Log.info("Track 4 is taking more time than expected time to display");
				     Reporter.addStepLog("Track 4 is taking more time than expected time to display");
				  }
				}
		}
}