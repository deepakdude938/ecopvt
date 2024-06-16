
Feature: config report Module
Background: This steps will be common for all the following scenarios
Given User launch the browser
When  User opens URL "https://staging.ecolibrium.io/" 
And   User enters Username as "qa12" 
And   User enters Password as "qa12" 
And   Click on the Login 
Then  Page Title should be "SmartSense"

  @tag1
  Scenario: verify user able to add new report 
    Given Add new Report
    And  Add report name as "ActivityReport" and select report type as "Config Report"
   And  Add below sensors
   |Accenture Test 1|  Accenture Test 2| 
   
   
    

 #Scenario: Edit Report
