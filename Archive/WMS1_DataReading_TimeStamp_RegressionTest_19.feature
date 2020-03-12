@DataComparision
Feature: RegressionTest_19_Visual Testing at differnt time stamp


Scenario: RegressionTest_19_Testcase_01_Normal Mode_ Check that PNG File downloaded at track OP Mode for time for test data is matches with baseline file

Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
And  user select test well from left filter
And user click on dashboard option at top left of the application
And select time and date from time and hour filter
And  user click on export button in track one to download PNG ActualSize file
Then verify that user is successfully able to export data in PNG ActualSize format for Track one
Then Validate that PNG file downloaded will match with saved PNG file for chosen Time for track one



Scenario: RegressionTest_19_Testcase_02_Normal Mode_ Check that PDF Actua Size File downloaded at track OP Mode for time for test data is matches with baseline file

Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
And  user select test well from left filter
And user click on dashboard option at top left of the application
And select time and date from time and hour filter
And  user click on export button in track two to download PDF ActualSize file
Then verify that user is successfully able to export data in PDF ActualSize format for Track two
Then Validate that PDF file downloaded will match with saved PDF file for chosen Time for track two



Scenario: RegressionTest_19_Testcase_03_Normal Mode_ Check that PDF portrait orientation File downloaded at track OP Mode for time for test data is matches with baseline file

Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
And  user select test well from left filter
And user click on dashboard option at top left of the application
And select time and date from time and hour filter
And  user click on export button in track OPMode to download PDF portrait orientation
Then verify that user is successfully able to export data in PDF portrait orientation for Track OPMode
Then Validate that PDF portrait orientation file in downloaded will match with saved PDF file for chosen Time for track OPMode



