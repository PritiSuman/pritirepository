package stepDefenitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;

import com.cucumber.listener.Reporter;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import managers.FileReaderManager;
import pageObjects.LayoutPage;
import pageObjects.ScreenCaptureUtilityPage;
import pageObjects.TimeAndHourPage;
import pageObjects.WMS1_HoverPage;

public class HoverToFindMnemonics_Step {
	
	WebDriver driver;
	TestContext testContext;
	LayoutPage layoutPage;
	TimeAndHourPage timeAndHourPage;
	 WMS1_HoverPage  wms1_Page;
	ScreenCaptureUtilityPage screenCaptureUtilityPage;
	ITestContext contexts;
	
	String downloadFilePath = (System.getProperty("user.dir")+ FileReaderManager.getInstance().getConfiFileReader().getdownloadFilePath());
	
	public HoverToFindMnemonics_Step(TestContext context)
	{
		
		testContext =context;
		layoutPage = testContext.getPageObjectManagers().getLayoutPage();
		timeAndHourPage = testContext.getPageObjectManagers().getTimeAndHourPage();
		screenCaptureUtilityPage = testContext.getPageObjectManagers().getScreenCaptureUtilityPage();
		 wms1_Page = testContext.getPageObjectManagers().getWMS1_Page();
		
		
		
	}
	
	//RegressionTest_11
	
	

@Then("^Hover on DepthHoleMeasure of track one$")
public void hover_on_DepthHoleMeasure_of_track_one() throws Throwable 
{
	 wms1_Page.hoverToFindNemonicsDepthHoleMeasureOfTrack1();
	 Thread.sleep(2000);
}


@Then("^mnemonics for depth hole meeasure is found for track one$")
public void nemonics_for_depth_hole_meeasure_is_found_for_track_one() throws Throwable
{
	String actualtitle = wms1_Page.nemonics_DepthHoleMeasure_Track1.getAttribute("title");
	String expectedtitle = "BP_DEP_H_TDM";
	System.out.println(actualtitle);
	Assert.assertEquals(expectedtitle, actualtitle);
	Reporter.addStepLog("Mnemonicas for track1- depth hole measure is find as : " + actualtitle);
   
}

@Then("^hover to track one of Depth Bit Measured to get mnemonics for this$")
public void hover_to_track_one_of_Depth_Bit_Measured_to_get_nemonics_for_this() throws Throwable 
{
	wms1_Page.hoverToFindNemonicsDepthBitMeasureOfTrack1();
	Thread.sleep(2000);
    String actualtitle = wms1_Page.nemonics_DepthBitMeasure_Track1.getAttribute("title");
	String expectedtitle = "BP_DEP_BIT_MD";
	System.out.println(actualtitle);
	Assert.assertEquals(expectedtitle, actualtitle);
	Reporter.addStepLog("Mnemonicas for track1- depth bit measure is find as : " + actualtitle); 
}

@Then("^hover to track one of Depth Bit vertical to get mnemonics for this$")
public void hover_to_track_one_of_Depth_Bit_vertical_to_get_nemonics_for_this() throws Throwable 
{
	wms1_Page.hoverToFindNemonicsDepthBitVerticalOfTrack1();
	Thread.sleep(2000);
    String actualtitle = wms1_Page.nemonics_DepthBitVertical_Track1.getAttribute("title");
	String expectedtitle = "BP_DEP_BIT_TVD";
	System.out.println(actualtitle);
	Assert.assertEquals(expectedtitle, actualtitle);
	Reporter.addStepLog("Mnemonicas for track1- depth bit vertical is find as : " + actualtitle);
}

@Then("^hover to track one of Depth hole vertical to get mnemonics for this$")
public void hover_to_track_one_of_Depth_hole_vertical_to_get_nemonics_for_this() throws Throwable 
{
	wms1_Page.hoverToFindNemonicsDepthHoleVerticalOfTrack1();
	Thread.sleep(2000);
    String actualtitle = wms1_Page.nemonics_DepthHoleVertical_Track1.getAttribute("title");
	String expectedtitle = "BP_DEP_H_TVD";
	System.out.println(actualtitle);
	Assert.assertEquals(expectedtitle, actualtitle);
	Reporter.addStepLog("Mnemonicas for track1- depth bit vertical is find as : " + actualtitle);
}

/**
 * RegressionTest_12
 * 
 */



@Then("^Hover on Total gas of track two to find mnemonics for this$")
public void hover_on_Total_gas_of_track_two() throws Throwable 
{
	wms1_Page.hoverToFindNemonicsTotalGasOfTrack2();
	Thread.sleep(3000);
    String actualtitle = wms1_Page.nemonics_totalGas_Track2.getAttribute("title");
	String expectedtitle = "BP_GAS_AVG";
	System.out.println(actualtitle);
	Assert.assertEquals(expectedtitle, actualtitle);
	Reporter.addStepLog("Mnemonicas for track2- TotalGas is find as : " + actualtitle);
}
    


@Then("^mnemonics for Methane is found for track two$")
public void nemonics_for_Methane_is_found_for_track_two() throws Throwable 
{
	wms1_Page.hoverToFindNemonicsMethaneOfTrack2();
	Thread.sleep(3000);
    String actualtitle = wms1_Page.nemonics_Methane_Track2.getAttribute("title");
	String expectedtitle = "BP_GAS_C1";
	System.out.println(actualtitle);
	Assert.assertEquals(expectedtitle, actualtitle);
	Reporter.addStepLog("Mnemonicas for track2- Methane is find as : " + actualtitle);

}

@Then("^hover to track two of Ethane to get mnemonics for this$")
public void hover_to_track_two_of_Ethane_to_get_nemonics_for_this() throws Throwable
{
	wms1_Page.hoverToFindNemonicsEthaneOfTrack2();
	Thread.sleep(1000);
    String actualtitle = wms1_Page.nemonics_Ethane_Track2.getAttribute("title");
	String expectedtitle = "BP_GAS_C2";
	System.out.println(actualtitle);
	Assert.assertEquals(expectedtitle, actualtitle);
	Reporter.addStepLog("Mnemonicas for track2- Ethane is find as : " + actualtitle);

}

@Then("^hover to track two of Propane to get mnemonics for this$")
public void hover_to_track_two_of_Prppane_to_get_nemonics_for_this() throws Throwable 
{
	wms1_Page.hoverToFindNemonicsPropaneOfTrack2();
    String actualtitle = wms1_Page.nemonics_Propane_Track2.getAttribute("title");
	String expectedtitle = "BP_GAS_C3";
	System.out.println(actualtitle);
	Assert.assertEquals(expectedtitle, actualtitle);
	Reporter.addStepLog("Mnemonicas for track2- Propane is find as : " + actualtitle);

   
}

@Then("^hover to track two of IsoButane to get mnemonics for this$")
public void hover_to_track_two_of_IsoButane_to_get_nemonics_for_this() throws Throwable 
{
	wms1_Page.hoverToFindNemonicsISoButaneOfTrack2();
    String actualtitle = wms1_Page.nemonics_ISoButane_Track2.getAttribute("title");
	String expectedtitle = "BP_GAS_C4_ISO";
	System.out.println(actualtitle);
	Assert.assertEquals(expectedtitle, actualtitle);
	Reporter.addStepLog("Mnemonicas for track2- IsoButane is find as : " + actualtitle);
}

@Then("^hover to track two of Total Strokes Since Reset - Mud Pumps to get mnemonics for this$")
public void hover_to_track_two_of_Total_Strokes_Since_Reset_Mud_Pumps_to_get_nemonics_for_this() throws Throwable 
{
	wms1_Page.hoverToFindNemonicsTotalStrokeSincePumresetMudOfTrack2();
    String actualtitle = wms1_Page.nemonics_TotalStrokeSinceResetMudPumps_Track2.getAttribute("title");
	String expectedtitle = "BP_PMP_STK_COUNT";
	System.out.println(actualtitle);
	Assert.assertEquals(expectedtitle, actualtitle);
	Reporter.addStepLog("Mnemonicas for track2- TotalStrokeSinceResetMudPumps is find as : " + actualtitle);
}


/**
 * RegressionTest_13
 * 
 */



@Then("^Hover on Pressure WellHead of track three to find mnemonics for this$")
public void hover_on_Pressure_WellHead_of_track_three_to_find_mnemonics_for_this() throws Throwable 
{
	wms1_Page.hoverToFindNemonicsToPressureWellHeadTrack3();
    String actualtitle = wms1_Page.nemonics_PressureWellhead_Track3.getAttribute("title");
	String expectedtitle = "BP_PRESS_WHEAD";
	System.out.println(actualtitle);
	Assert.assertEquals(expectedtitle, actualtitle);
	Reporter.addStepLog("Mnemonicas for track3- TotalStrokeSinceResetMudPumps is find as : " + actualtitle);  
}

@Then("^mnemonics for Pressure Standpipe is found for track three$")
public void mnemonics_for_Pressure_Standpipe_is_found_for_track_three() throws Throwable 
{
	wms1_Page.hoverToFindNemonicsToPressureStandPipeTrack3();
    String actualtitle = wms1_Page.nemonics_PressureStandPipe_Track3.getAttribute("title");
	String expectedtitle = "BP_PRESS_SPP_AVG";
	System.out.println(actualtitle);
	Assert.assertEquals(expectedtitle, actualtitle);
	Reporter.addStepLog("Mnemonicas for track3- PressureStandPipe is find as : " + actualtitle);
}

@Then("^hover to track three of Pressure Chokeline to get mnemonics for this$")
public void hover_to_track_three_of_Pressure_Chokeline_to_get_mnemonics_for_this() throws Throwable 
{
	wms1_Page.hoverToFindNemonicsToPressureChokeLineTrack3();
    String actualtitle = wms1_Page.nemonics_PressureChokeLine_Track3.getAttribute("title");
	String expectedtitle = "BP_PRESS_CHOKE";
	System.out.println(actualtitle);
	Assert.assertEquals(expectedtitle, actualtitle);
	Reporter.addStepLog("Mnemonicas for track3- PressureChokeLine is find as : " + actualtitle);
}

@Then("^hover to track three of Pressure Killline to get mnemonics for this$")
public void hover_to_track_three_of_Pressure_Killline_to_get_mnemonics_for_this() throws Throwable 
{
	wms1_Page.hoverToFindNemonicsToPressureKillLineTrack3();
    String actualtitle = wms1_Page.nemonics_PressureKilLine_Track3.getAttribute("title");
	String expectedtitle = "BP_PRESS_KILL";
	System.out.println(actualtitle);
	Assert.assertEquals(expectedtitle, actualtitle);
	Reporter.addStepLog("Mnemonicas for track3- PressureKilLine is find as : " + actualtitle);
}

@Then("^hover to track three of Flow in Mud to get mnemonics for this$")
public void hover_to_track_three_of_Flow_in_Mud_to_get_mnemonics_for_this() throws Throwable
{
	wms1_Page.hoverToFindNemonicsToFlowInMudTrack3();
    String actualtitle = wms1_Page.nemonics_FlowInMud_Track3.getAttribute("title");
	String expectedtitle = "BP_MUD_MFI_AVG";
	System.out.println(actualtitle);
	Assert.assertEquals(expectedtitle, actualtitle);
	Reporter.addStepLog("Mnemonicas for track3- FlowInMud is find as : " + actualtitle);
    
}

@Then("^hover to track three of Flow out Mud to get mnemonics for this$")
public void hover_to_track_three_of_Flow_out_Mud_to_get_mnemonics_for_this() throws Throwable 
{
	
	wms1_Page.hoverToFindNemonicsToFlowOutMudTrack3();
    String actualtitle = wms1_Page.nemonics_FlowOutMud_Track3.getAttribute("title");
	String expectedtitle = "BP_MUD_MFO_AVG";
	System.out.println(actualtitle);
	Assert.assertEquals(expectedtitle, actualtitle);
	Reporter.addStepLog("Mnemonicas for track3- FlowOutMud is find as : " + actualtitle);
   
}


/**
 * RegressionTest_14
 * 
 */

@Then("^Hover on RPM-Surface of track four to find mnemonics for this$")
public void hover_on_Pressure_RPM_Surface_of_track_four_to_find_mnemonics_for_this() throws Throwable 
{
	wms1_Page.hoverToFindNemonicsToRPMSurfaceTrack4();
    String actualtitle = wms1_Page.nemonics_RPMSurface_Track4.getAttribute("title");
	String expectedtitle = "BP_RPM_SURF_AVG";
	System.out.println(actualtitle);
	Assert.assertEquals(expectedtitle, actualtitle);
	Reporter.addStepLog("Mnemonicas for track4- RPMSurface is find as : " + actualtitle);
}

@Then("^mnemonics for Torque-Surface is found for track four$")
public void mnemonics_for_Torque_Surface_is_found_for_track_four() throws Throwable
{
	wms1_Page.hoverToFindNemonicsToTorqueSurfaceTrack4();
    String actualtitle = wms1_Page.nemonics_TorqueSurface_Track4.getAttribute("title");
	String expectedtitle = "BP_TQ_SURF_AVG";
	System.out.println(actualtitle);
	Assert.assertEquals(expectedtitle, actualtitle);
	Reporter.addStepLog("Mnemonicas for track4- TorqueSurface is find as : " + actualtitle);  
}

@Then("^hover to track four of Hookload to get mnemonics for this$")
public void hover_to_track_four_of_Pressure_Chokeline_to_get_mnemonics_for_this() throws Throwable 
{
	wms1_Page.hoverToFindNemonicsToHookLoadTrack4();
    String actualtitle = wms1_Page.nemonics_HookLoad_Track4.getAttribute("title");
	String expectedtitle = "BP_HKL_AVG";
	System.out.println(actualtitle);
	Assert.assertEquals(expectedtitle, actualtitle);
	Reporter.addStepLog("Mnemonicas for track4- HookLoad is find as : " + actualtitle);  
}

@Then("^hover to track four of Weight On Bit to get mnemonics for this$")
public void hover_to_track_four_of_Weight_On_Bit_to_get_mnemonics_for_this() throws Throwable
{
	wms1_Page.hoverToFindNemonicsToWeightOnBitTrack4();
    String actualtitle = wms1_Page.nemonics_WeightOnBit_Track4.getAttribute("title");
	String expectedtitle = "BP_WOB_AVG";
	System.out.println(actualtitle);
	Assert.assertEquals(expectedtitle, actualtitle);
	Reporter.addStepLog("Mnemonicas for track4- Weight On Bit is find as : " + actualtitle);  
    
}

@Then("^hover to track four of Block Position to get mnemonics for this$")
public void hover_to_track_four_of_Block_Position_to_get_mnemonics_for_this() throws Throwable 
{
	wms1_Page.hoverToFindNemonicsToBlockPositionTrack4();
    String actualtitle = wms1_Page.nemonics_BlockPosition_Track4.getAttribute("title");
	String expectedtitle = "BP_BLK_POS";
	System.out.println(actualtitle);
	Assert.assertEquals(expectedtitle, actualtitle);
	Reporter.addStepLog("Mnemonicas for track4- Block Position is find as : " + actualtitle);
    
}

@Then("^hover to track four of Rate Of pentration Instantanenous to get mnemonics for this$")
public void hover_to_track_four_of_Rate_Of_pentration_Instantanenous_to_get_mnemonics_for_this() throws Throwable 
{
	wms1_Page.hoverToFindNemonicsToRateOfPenetrationInstantaneousTrack4();
    String actualtitle = wms1_Page.nemonics_RateOfPentrationInstantaneous_Track4.getAttribute("title");
	String expectedtitle = "BP_ROP_INST";
	System.out.println(actualtitle);
	Assert.assertEquals(expectedtitle, actualtitle);
	Reporter.addStepLog("Mnemonicas for track4- Pentration Instantaneous is find as : " + actualtitle);
}



}
