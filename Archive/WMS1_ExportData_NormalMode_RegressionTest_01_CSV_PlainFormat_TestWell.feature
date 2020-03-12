@ExportData
Feature: Export data for WMS1 dashboard in PNG-ActualSize format and comapre with original saved file
This feature verifies the successful export of data for track three and comapre it against saved file
 

Scenario: RegressionTest_01_Testcase_01_Test Well_ Check that user is successfully able to export data in csv-plain format in track_01 for wms1 screen

Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
And  user select test well from left filter
And  user click on export button in track One to download CSV plain file
Then verify that user is successfully able to export data in CSV-plain format for track one


Scenario: RegressionTest_01_Testcase_10_ Check that user is successfully able to export data in PNG-ActualSize amd compare against orginal saved file
Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
And  user select test well from left filter

And  user click on export button in track two to download CSV gZIP file
Then  verify that user is successfully able to export data in CSV-gZIP format for track two


Scenario: RegressionTest_01_Testcase_03_Test Well_ Check that user is successfully able to export data in csv ZIP format in track_03 for wms1 screen

Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
And  user select test well from left filter
And user click on dashboard option at top left of the application
Then select time and date from time and hour filter
And  user click on export button in track three to download PNG ActualSize file
Then  verify that user is successfully able to export data in PNG ActualSize format for track three and compare with original saved file



Scenario: RegressionTest_01_Testcase_04_Test Well_ Check that user is successfully able to export data in csv zip format in OP Mode for wms1 screen

Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
And  user select test well from left filter

And  user click on export button in track OPMode to download CSV ZIP file
Then  verify that user is successfully able to export data in CSV-ZIP format for track OPMode


Scenario: RegressionTest_01_Testcase_01_Test Well_ Check that user is successfully able to export data in csv-plain format in track_01 for wms1 screen

Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
And  user select test well from left filter
And  user click on export button in track One to download CSV plain file
Then verify that user is successfully able to export data in CSV-plain format for track one
And  click on export arrow to close the dropdown of file download
And  user click on export button in track OPMode to download CSV ZIP file
And  accept the alert which popup to allow mutiple download of file
Then  verify that user is successfully able to export data in CSV-ZIP format for track OPMode

