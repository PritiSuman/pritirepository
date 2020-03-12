@HoverToFindNemonics
Feature: WMS1_LaggedMud-borneMeasurement-Yellow_HoverToFindMnemonics_Track2_RegressionTest_12
This feature verifies when curser will be hover on tiles than nemonics of that track will be found
 
Background: User is Logged In
Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard



@RegressionTest1
Scenario: RegressionTest_12_Testcase_01_Normal Mode_HoverToFindMnemonics_LaggedMud-borneMeasurement-Yellow

Then Hover on Total gas of track two to find mnemonics for this
Then mnemonics for Methane is found for track two
Then hover to track two of Ethane to get mnemonics for this
Then hover to track two of Propane to get mnemonics for this
Then hover to track two of IsoButane to get mnemonics for this
Then hover to track two of Total Strokes Since Reset - Mud Pumps to get mnemonics for this



