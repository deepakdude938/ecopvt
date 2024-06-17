
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
    And  Add report name as "ActivityReport1" and select report type as "Config Report"
   And  Add below sensors
   |Accenture Test 1|  Accenture Test 2|QA12|
   And Add below parameters
   |Real Power Positive|Flow Totalizer| kW|
   And select the Graintime by "option-1" which have time "30 min"
   And select the startTime by "option-0" which have time "00.00"
    And select the endTime by "option-1" which have time "00.30"
     And select the triggerTime by "option-1" which have time "01 to 02"
     And add the emails as below
     |HArshul G|Bhagawat Balaji Dongre Dongre|
     And select Delivery Frequency by "option-1" which has "Daily" frequency
     And start Day by "option-0" which is "Yesterday"
     And click on Save config button
     Then verify user is navigated to ReportListPage
   

   
   
   
   
   
    

 #Scenario: Edit Report
