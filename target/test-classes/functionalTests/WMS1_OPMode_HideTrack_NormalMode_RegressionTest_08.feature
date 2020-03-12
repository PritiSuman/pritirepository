@HideTrack&DisplayTrack
Feature: WMS1_OPMode_HideTrack_NormalMode_RegressionTest_08
This feature verifies the functionality of hide track for OP Mode


 
Background: User is Logged In
Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
And   user select test well from left filter
And   user click on dashboard option at top left of the application
Then  select time and date from time and hour filter to check hide and dispaly functionality
Then user should be on WMS one screen with test well selected with certain time interval

 
@RegressionTest1111
Scenario: RegressionTest_04_Testcase_01_validate that when clicked on hide chart link for OPMode, OPMode track will hidden


When  user click hide track for OPMode at normal mode
Then  Normal OP Mode should be hidden




