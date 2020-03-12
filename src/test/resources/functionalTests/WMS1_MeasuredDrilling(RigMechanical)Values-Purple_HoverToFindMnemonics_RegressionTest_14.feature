@HoverToFindNemonics
Feature: WMS1_MeasuredDrilling(RigMechanical)Values-Purple_HoverToFindMnemonics_RateOfPentrationInstantenous_RegressionTest_14
This feature verifies when curser will be hover on tiles than nemonics of that track will be found
 
Background: User is Logged In
Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard


@RegressionTest1
Scenario: RegressionTest_14_Testcase_01_Normal Mode_HoverToFindmnemonics_MeasuredDrilling(RigMechanical)Values-Purple

Then Hover on RPM-Surface of track four to find mnemonics for this
Then mnemonics for Torque-Surface is found for track four
Then hover to track four of Hookload to get mnemonics for this
Then hover to track four of Weight On Bit to get mnemonics for this
Then hover to track four of Block Position to get mnemonics for this
Then hover to track four of Rate Of pentration Instantanenous to get mnemonics for this