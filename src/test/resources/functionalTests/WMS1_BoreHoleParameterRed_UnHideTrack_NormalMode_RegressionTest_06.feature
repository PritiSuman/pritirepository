@HideTrack&DisplayTrack
Feature: WMS1_BoreHoleParameterRed_UnHideTrack_NormalMode_RegressionTest_06
This feature verifies the functionality of Unhide track for BoreHoleParameterRed track for apply and restore default setting


 
Background: User is Logged In
Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
And   user select test well from left filter
And   user click on dashboard option at top left of the application
Then  select time and date from time and hour filter to check hide and dispaly functionality
Then user should be on WMS one screen with test well selected with certain time interval

@RegressionTest1
Scenario: RegressionTest_06_Testcase_01_validate that when clicked on restore button of layout preferences, track will be again displayed at its original place


When  user click hide track for track one at normal mode
When  click on restore button at layout prefernces for normal mode
Then  Track one should be visible at its original place for restore default setting at normal mode

@RegressionTest1
Scenario: RegressionTest_06_Testcase_02_validate that when clicked on apply button of layout preferences, track will be again displayed at its original place

When  user click hide track for track one at normal mode
When  click on Layout Prferences with clicking on group one and press apply for normal mode
Then  Track one should be visible at its original place after pressing apply button at normal mode

