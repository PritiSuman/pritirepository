@HideTrack&DisplayTrack
Feature: WMS1_BoreHoleParameterRed_HideTrack_NormalMode_RegressionTest_04
This feature verifies the functionality of hide track for BoreHoleParameterRed track


 
Background: User is Logged In
Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
And   user select test well from left filter
And   user click on dashboard option at top left of the application
Then  select time and date from time and hour filter to check hide and dispaly functionality
Then user should be on WMS one screen with test well selected with certain time interval

 
@RegressionTest1
Scenario: RegressionTest_04_Testcase_01_validate that when clicked on hide chart link for track1


When  user click hide track for track one at normal mode
Then  Normal Track one should be hidden

