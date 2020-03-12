@HideTrack&DisplayTrack
Feature: WMS1_OPMode_HideTrack_ExpandedMode_RegressionTest_09
This feature verifies the functionality of hide track1 at expanded mode


 
Background: User is Logged In
Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
And   user select test well from left filter
And   user click on dashboard option at top left of the application
Then  select time and date from time and hour filter
Then user should be on WMS one screen with test well selected with certain time interval


@RegressionTest55
Scenario: RegressionTest_05_Testcase_01_Click on hide track link at expanded mode of OP Mode

When click at expanded mode link for OP Mode
And user click hide track for OP Mode at expanded mode
Then Expanded OP Mode should be hidden same as normal mode hidden track
 

 