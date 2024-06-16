Feature: ScreenDesign Module

Background: This steps will be common for all the following scenarios
Given User launch the browser
When  User opens URL "https://staging.ecolibrium.io/" 
And   User enters Username as "qa12" 
And   User enters Password as "qa12" 
And   Click on the Login 
Then  Page Title should be "SmartSense"


Scenario: Sucessfully Adition of sustainablity template
When  User click on the Screen Design module
And   User click on the Add New Template button
And   User Select the Client Specific Onboarding Checkbox And Click on the Continue button
And   User Select the Service Based Dashboard Checkbox option And Click on the Continue button
And   User Search the Service as "Sustainability" And Select the Sustainability checkbox And Click on the Continue button
And   User Search the Client as "Ecolibrium Energy" And Select the Ecolibrium Energy Client checkbox And click on the continue button
And   User Select the Plant as "ANGAT" And click on the continue button
And   User Enter Service Name as "Automation Test" 
And   Enter Description as "Automation Desc" And click on the continue button
Then  Service template list page URl should contains "Service"
When  User Search the service template as "Automation Test"
And   User Select the Automation Test template checkbox And click on the Automation Test template
Then  Options button should be Displayed 

Scenario: Sucessfully updation of sustainablity template
When  User click on the Screen Design module
And   User click on the Client Specific Template
And   User Click on the Service Based Dashboard 
Then  Service template list page URl should contains "Service"
When  User Search the service template as "Automation Test"
And   User Select the Automation Test template checkbox And click on the edit button
And   User click on the Continue button And User click on the Continue button And User click on the Continue button And User click on the Continue button And User click on the continue button
And   User Update the Service Name as "Automation Updated" 
And   User Update Description as "Automation Desc Updated" And click on the continue button
Then  User should be able to see the updated template as "Automation Updated"

Scenario: Sucessfully Deletion of sustainablity template
When  User click on the Screen Design module
And   User click on the Client Specific Template
And   User Click on the Service Based Dashboard 
Then  Service template list page URl should contains "Service"
When  User Search the service template as "Automation Updated"
And   User Select the Automation Updated template checkbox And click on the delete button
Then  Are you sure you want to delete Service popup should be visible
When  User click on the Ok button
Then  Service deleted popup should be visible


