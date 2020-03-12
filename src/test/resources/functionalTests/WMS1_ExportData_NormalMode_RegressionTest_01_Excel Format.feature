@ExportData_NormalMode
Feature: RegressionTest_01_NormalMode_Export data for WMS1 dashboard in Excel format 
This feature verifies the successful export of data for in csv format at different tracks of WMS1 dashboard
 
 @RegressionTest1
Scenario: RegressionTest_01_Testcase_07_NormaMode_Excel_plain: Check that user is successfully able to export data in Excel-plain format in BoreHole Parameter-Red for wms1 screen

Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
And   user select test well from left filter
And   user click on dashboard option at top left of the application
Then  select time and date from time and hour filter for two mins
And   user click on export button in track One to download Excel plain file
Then  verify that user is successfully able to export data in Excel-plain format for track one
Then Validate that size of file downloaded in Excel plain format is same as baseline file

@RegressionTest1
Scenario: RegressionTest_01_Testcase_08 _NormaMode_Excel_gZIP: Check that user is successfully able to export data in Excel- gZIP  format in LaggedMud-borneMeasurement-Yellow for wms1 screen

Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
And   user select test well from left filter
And   user click on dashboard option at top left of the application
Then  select time and date from time and hour filter for two mins
And   user click on export button in track two to download Excel gZIP file
Then  verify that user is successfully able to export data in Excel-gZIP format for track two
Then  Validate that size of file downloaded in Excel gZIP format is same as baseline file


@RegressionTest
Scenario: RegressionTest_01_Testcase_09_NormaMode _Excel_ZIP: Check that user is successfully able to export data in Excel zip format in OP Mode for wms1 screen

Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
And   user select test well from left filter
And   user click on dashboard option at top left of the application
Then  select time and date from time and hour filter for two mins
And   user click on export button in track OPMode to download Excel ZIP file
Then  verify that user is successfully able to export data in Excel-ZIP format for track OPMode
Then  Validate that size of file downloaded in Excel-ZIP format is same as baseline file






