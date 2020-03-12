@SendEmail_NormalMode
Feature: RegressionTest_03_OP_NormaMode_SendEmail for WMS1 dashboard with attachment of PNG files
This feature validate the send email functionality of OP Normal mode 

@RegressionTest
Scenario: RegressionTest_03_Testcase_01__NormaMode_Check that user is successfully able to send data via emaiol in PNG actual Size format in OP Mode for WMS1 screen

Given user is successfully login to Intelie Live application with valid credential of "userName" and "Password"
When  user navigate to WMS One dashboard
And   user select test well from left filter
And   user click on dashboard option at top left of the application
Then  select time and date from time and hour filter
And   user click on send email functionality at OP mode
And   select field select the team  with valid value "selectTheTeam" 
And   provide valid subject for email subject and attachment name  as "emailSubject" and  "attachmentName" 
Then  write email body "emailBody"
And   select PNG as attachment
Then  click on send option
Then  Validate that email is sent successfully