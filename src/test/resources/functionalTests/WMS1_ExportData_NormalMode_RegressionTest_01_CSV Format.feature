@ExportData_NormalMode
Feature: RegressionTest_01_NormalMode_Export data for WMS1 dashboard in CSV format 
This feature verifies the successful export of data for in csv format at different tracks of WMS1 dashboard in normal mode


 @RegressionTest1
Scenario: RegressionTest_01_Testcase_01_NormaMode_CSV_plain: Check that user is successfully able to export data in csv-plain format for BoreHole Parameter-Red of wms1 screen

Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
And   user select test well from left filter
And   user click on dashboard option at top left of the application
Then  select time and date from time and hour filter
And  user click on export button in track One to download CSV plain file
Then verify that user is successfully able to export data in CSV-plain format for track one
Then Validate that size of file downloaded in CSV plain format is same as baseline file

@RegressionTest1
Scenario: RegressionTest_01_Testcase_02_NormaMode_CSV_gZIP: Check that user is successfully able to export data in csv- gZIP  format in LaggedMud-borneMeasurement-Yellow for wms1 screen

Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
And   user select test well from left filter
And   user click on dashboard option at top left of the application
Then  select time and date from time and hour filter
And  user click on export button in track two to download CSV gZIP file
Then  verify that user is successfully able to export data in CSV-gZIP format for track two
Then Validate that size of file downloaded in CSV gZIP format is same as baseline file


@RegressionTest
Scenario: RegressionTest_01_Testcase_03_NormaMode _CSV_ZIP: Check that user is successfully able to export data in csv zip format in OP Mode for wms1 screen

Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
And   user select test well from left filter
And   user click on dashboard option at top left of the application
Then  select time and date from time and hour filter
And   user click on export button in track OPMode to download CSV ZIP file
Then  verify that user is successfully able to export data in CSV-ZIP format for track OPMode
Then  Validate that size of file downloaded in CSV ZIP format is same as baseline file




 



























