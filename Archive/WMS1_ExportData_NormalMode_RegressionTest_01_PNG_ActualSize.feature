@ExportData
Feature: Export data for WMS1 dashboard in PNG-ActualSize format at WMS1 dashboard
This feature verifies the successful export of data for in PNG-ActualSize format at different tracks of WMS1 dashboard
 
 @RegressionTest
Scenario: RegressionTest_01_Testcase_01_CSV_plain: Check that user is successfully able to export data in csv-plain format in track_01 for wms1 screen

Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
And  user click on export button in track One to download PNG-ActualSize file
Then verify that user is successfully able to export data in PNG-ActualSize format for track one

@RegressionTest
Scenario: RegressionTest_01_Testcase_02 _CSV_gZIP: Check that user is successfully able to export data in PNG- ActualSize  format in track_02 for wms1 screen

Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
And  user click on export button in track OPMode to download PNG-ActualSize file
Then  verify that user is successfully able to export data in PNG-ActualSize format for OPMode