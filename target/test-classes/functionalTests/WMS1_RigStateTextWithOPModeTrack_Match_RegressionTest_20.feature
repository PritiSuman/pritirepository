@HoverToFindNemonics
Feature: WMS1_RigStateTextWithOPModeTrack_Match_RegressionTest_20
This feature verifies Rig State text with OP Mode
 
Background: User is Logged In
Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
And   user select test well from left filter
Then  user should be on WMS one screen with test well selected with certain time interval

@RegressionTest1
Scenario: RegressionTest_01_Testcase_01_Rig Text match with OP Mode

Then Validate that Rig state text will match with OP Mode