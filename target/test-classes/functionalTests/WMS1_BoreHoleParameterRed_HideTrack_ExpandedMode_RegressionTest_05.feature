@HideTrack&DisplayTrack
Feature: WMS1_BoreHoleParameterRed_HideTrack_ExpandedMode_RegressionTest_05
This feature verifies the functionality of hide track1 at expanded mode


 
Background: User is Logged In
Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
And   user select test well from left filter
And   user click on dashboard option at top left of the application
Then  select time and date from time and hour filter to check hide and dispaly functionality
Then user should be on WMS one screen with test well selected with certain time interval


@RegressionTest1
Scenario: RegressionTest_05_Testcase_01_Click on hide track link at expanded mode of Track1
When click at expanded mode link for track one
And user click hide track for track one at expanded mode
Then Expanded Track one should be hidden same as normal mode hidden track
 
