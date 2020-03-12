@ExportData_NormalMode
Feature: RegressionTest_01_ Export data for WMS1 dashboard in JSON format 
This feature verfies the successful export of data in JSON format for Live well at differnt well
 
@RegressionTest1
Scenario: RegressionTest_01__NormaMode_Testcase_04_JSON_Palin: Check that user is successfully able to export data in JSON-plain format in BoreHole Parameter-Red for wms1 screen

Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
And   user select test well from left filter
And   user click on dashboard option at top left of the application
Then  select time and date from time and hour filter
And  user click on export button in track One to download JSON plain file
Then verify that user is successfully able to export data in JSON-plain format for track one
Then Validate that size of file downloaded in JSON plain format is same as baseline file

@RegressionTest1
Scenario: RegressionTest_01_Testcase_05 _NormaMode_JSON_gZIP: Check that user is successfully able to export data in JSON- gZIP  format in LaggedMud-borneMeasurement-Yellow for wms1 screen

Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
And   user select test well from left filter
And   user click on dashboard option at top left of the application
Then  select time and date from time and hour filter
And  user click on export button in track two to download JSON gZIP file
Then  verify that user is successfully able to export data in JSON-gZIP format for track two
Then Validate that size of file downloaded in JSON gZIP format is same as baseline file

@RegressionTest
Scenario: RegressionTest_01_Testcase_06__NormaMode_JSON_ZIP: Check that user is successfully able to export data in JSON ZIP format in OP Mode for wms1 screen

Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
And   user select test well from left filter
And   user click on dashboard option at top left of the application
Then  select time and date from time and hour filter
And  user click on export button in track OPMode to download JSON ZIP file
Then  verify that user is successfully able to export data in JSON-ZIP format for track OPMode
Then Validate that size of file downloaded in JSON ZIP format is same as baseline file
