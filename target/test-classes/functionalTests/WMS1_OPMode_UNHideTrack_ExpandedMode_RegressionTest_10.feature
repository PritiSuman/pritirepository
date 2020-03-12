@HideTrack&DisplayTrack
Feature: WMS1_BoreHoleParameterRed_HideTrack_ExpandedMode_RegressionTest_10
This feature verifies the functionality of Unhide track1 at expanded mode for appy and default setting


Background: User is Logged In
Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
And   user select test well from left filter
And   user click on dashboard option at top left of the application
Then  select time and date from time and hour filter
Then user should be on WMS one screen with test well selected with certain time interval


@RegressionTest
Scenario: RegressionTest_10_Testcase_01_Click on restore button of layout preferences once OP Mode is hidden

When click at expanded mode link for OP Mode
And  user click hide track for OP Mode at expanded mode
Then click on restore button at layout prefernces for expanded Mode
Then Track OPMode should be visible at its original place for restore default setting for expanded Mode

@RegressionTest56
Scenario: RegressionTest_10_Testcase_02_Click on apply button of layout preferences once OP mode is hidden

When click at expanded mode link for OP Mode
And user click hide track for OPMode at expanded mode
When click on Layout Prferences with clicking on check box of OP Mode and press apply for expanded mode
Then OP Mode should be visible at its original place after pressing apply button for expanded Mode
