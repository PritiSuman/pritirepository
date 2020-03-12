@ExportData_ExpandedMode
Feature: WMS1_ExportData_ExpandedMode_RegressionTest_02_PNG_Format
This feature validate the export functionality for PNG actual size format in wms1 screen in expanded mode


@RegressionTest
Scenario: RegressionTest_02_Testcase_01_ExpandedMode_PNG ActualSize- Check that user is successfully able to export data in PNG actual Size format in Expanded OP Mode for WMS1 screen

Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
Then user select test well from left filter
And   user click on dashboard option at top left of the application
Then  select time and date from time and hour filter
Then user click on expand button at track OP Mode
And  user click on export button in track OPMOde to download PNG ActualSize file in expanded mode
Then  verify that user is successfully able to export data in PNG ActualSize format in expanded fromat
Then validate that exported file will match with bseline file in PNG format in expanded mode


@Regression
Scenario: later use
And  user select test well from left filter
And user click on dashboard option at top left of the application
Then select time and date from time and hour filter
