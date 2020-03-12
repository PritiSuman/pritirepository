@ExportData_NormalMode
Feature: RegressionTest_01_NormaMode_Export data for WMS1 dashboard in PNG actual Size format
This feature validate the export functionality for PNG actual size format in wms1 screen

@RegressionTest
Scenario: RegressionTest_01_Testcase_10__NormaMode_Check that user is successfully able to export data in PNG actual Size format in OP Mode for WMS1 screen

Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
Then user select test well from left filter
And user click on dashboard option at top left of the application
Then select time and date from time and hour filter
And  user click on export button in track OPMOde to download PNG ActualSize file
Then  verify that user is successfully able to export data in PNG ActualSize format 
Then validate that downloaded PNG file is matching with saved PNG file


Scenario: RegressionTest_01_Testcase_10__NormaMode_Check that user is successfully able to export data in PNG actual Size format in LaggedMud-borneMeasurement-Yellow for WMS1 screen

Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
Then user select test well from left filter
And user click on dashboard option at top left of the application
Then select time and date from time and hour filter
And  user click on export button in track LaggedMud-borneMeasurement-Yellow to download PNG ActualSize file
Then  verify that user is successfully able to export data in PNG ActualSize format for LaggedMud-borneMeasurement-Yellow
Then validate that downloaded PNG file is matching with saved PNG file for LaggedMud-borneMeasurement-Yellow
