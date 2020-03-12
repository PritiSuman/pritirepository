@HoverToFindNemonics
Feature: WMS1_Mud(Drilling Fluid)ParameterandMeasurement-Brown_HoverToFindMnemonics_Track3_RegressionTest_13
This feature verifies when curser will be hover on tiles than nemonics of that track will be found
 
Background: User is Logged In
Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard


@RegressionTest1
Scenario: RegressionTest_13_Testcase_01_Normal Mode_HoverToFindMnemonics_Mud(Drilling Fluid)ParameterandMeasurement-Brown

Then Hover on Pressure WellHead of track three to find mnemonics for this
Then mnemonics for Pressure Standpipe is found for track three
Then hover to track three of Pressure Chokeline to get mnemonics for this
Then hover to track three of Pressure Killline to get mnemonics for this
Then hover to track three of Flow in Mud to get mnemonics for this
Then hover to track three of Flow out Mud to get mnemonics for this