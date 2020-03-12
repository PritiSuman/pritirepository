@ExportData_ExpandedMode
Feature: WMS1_ExportData_ExpandedMode_RegressionTest02_PDF_Format
This feature validate the export functionality for PNG actual size format in wms1 screen in expanded mode

@RegressionTest1
Scenario: RegressionTest_02_Testcase_02__ExpandedMode_PDF format Check that user is successfully able to export data in PDF actual Size format in track Mud(Drilling Fluid)ParameterandMeasurement-Brown for WMS1 screen

Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
And   user select test well from left filter
And   user click on dashboard option at top left of the application
Then  select time and date from time and hour filter
Then  user click on expand button at track four
And   user click on export button in track four to download PDF ActualSize file in expanded mode
Then  verify that user is successfully able to export data in PDF ActualSize format in expanded mode for track four
Then validate that exported file will match with bseline file in pdf format in expanded mode


