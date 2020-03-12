@DarkTheme
Feature: WMS1_ThemeChnages_VisualisationOfInformation_RegressionTest_21
This feature verifies when curser will be hover on tiles than nemonics of that track will be found
 
Background: User is Logged In
Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard

And   user click on dashboard option at top left of the application
Then  select time and date from time and hour filter
Then  user should be on WMS one screen with test well selected with certain time interval

@RegressionTest
Scenario: RegressionTest_14_Testcase_01_Normal Mode_HoverToFindmnemonics_

Then Hover on RPM-Surface of track four to find mnemonics for this
Then mnemonics for Torque-Surface is found for track four
Then hover to track four of Hookload to get mnemonics for this
Then hover to track four of Weight On Bit to get mnemonics for this
Then hover to track four of Block Position to get mnemonics for this
Then hover to track four of Rate Of pentration Instantanenous to get mnemonics for this