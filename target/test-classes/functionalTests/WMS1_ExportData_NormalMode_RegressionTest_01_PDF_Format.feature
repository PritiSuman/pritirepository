@ExportData_NormalMode
Feature: RegressionTest_01_NormaMode_Export data for WMS1 dashboard in PDF format 
This feature verifies the successful export of data for in csv format at different tracks of WMS1 dashboard in normal mode
 



@RegressionTest12
Scenario: RegressionTest_01_Testcase_11_Normal Mode_ Check that PDF portrait orientation File downloaded at track OP Mode for time for test data is matches with baseline file

Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
Then user select test well from left filter
And user click on dashboard option at top left of the application
And select time and date from time and hour filter
And  user click on export button in track OPMode to download PDF portrait orientation
Then verify that user is successfully able to export data in PDF portrait orientation for Track OPMode
Then Validate that PDF portrait orientation file in downloaded will match with saved PDF file for chosen Time for track OPMode


@RegressionTest1
Scenario: RegressionTest_01_Testcase_12_Normal Mode_ Check that PDF Landscape orientation File downloaded at MeasuredDrilling(RigMechanical)Values-Purple with test data is matches with baseline file

Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
Then user select test well from left filter
And user click on dashboard option at top left of the application
And select time and date from time and hour filter
And  user click on export button in track three to download PDF Landscape orientation
Then verify that user is successfully able to export data in PDF Landscape orientation for Track three
Then Validate that PDF Landscape orientation file in downloaded will match with saved PDF file for chosen Time for track three




@RegressionTest1
Scenario: RegressionTest_01_Testcase_13_Normal Mode_ Check that PDF Actual Size File downloaded at LaggedMud-borneMeasurement-Yellow at time for test data is matches with baseline file

Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
And  user select test well from left filter
And user click on dashboard option at top left of the application
And select time and date from time and hour filter
And  user click on export button track two to download PDF Actual Size file
Then verify that user is successfully able to export data in PDF-ActualSize format for trac ktwo
Then Validate that PDF file downloaded will match with saved PDF file for chosen Time for track two



