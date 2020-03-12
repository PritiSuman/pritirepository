@HoverToFindNemonics
Feature: WMS1_BoreHole Parameter-Red_HoverToFindMnemonics_RegressionTest_11
This feature verifies when curser will be hover on tiles than nemonics of that track will be found
 
Background: User is Logged In
Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard


@RegressionTest1
Scenario: RegressionTest_11_Testcase_01_Normal Mode_HoverToFindMnemonics_BoreHole Parameter-Red

Then Hover on DepthHoleMeasure of track one
Then mnemonics for depth hole meeasure is found for track one
Then hover to track one of Depth Bit Measured to get mnemonics for this
Then hover to track one of Depth Bit vertical to get mnemonics for this
Then hover to track one of Depth hole vertical to get mnemonics for this



