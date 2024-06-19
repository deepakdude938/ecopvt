
Feature: config report Module

		@Login	
		Scenario: Login to Eco app
		Given User launch the browser
		When  User opens URL "https://staging.ecolibrium.io/" 
		And   User enters Username as "qa12" 
		And   User enters Password as "qa12" 
		And   Click on the Login 
		Then  Page Title should be "SmartSense"
 
  Scenario: Verify user able to add new report 
    Given Add new Report
    And  Add report name as "ActivityReport1" and select report type as "Config Report"
   And  Add below sensors
   |Accenture Test 1|  Accenture Test 2|QA12|
   And Add below parameters
   |Real Power Positive|Flow Totalizer| kW|
   And Select the Graintime by "option-1" which have time "30 min"
   And Select the startTime by "option-0" which have time "00.00"
    And Select the endTime by "option-1" which have time "00.30"
     And Select the triggerTime by "option-1" which have time "01 to 02"
     And Add the emails as below
     |HArshul G|Bhagawat Balaji Dongre Dongre|
     And Select Delivery Frequency by "option-1" which has "Daily" frequency
     And Start Day by "option-0" which is "Yesterday"
     Then Click on Save config button and verify user is navigated to ReportListPage
     When Search the create Report by name as "ActivityReport1" 
     Then Verify the user createdReportName is display in the list as "ActivityReport1"
   

   @Delete
 Scenario: Verify user able to Edit Report
  Given User is on smartSense page and click on ReportMenu and select the List  
  When Search the create Report by name as "ActivityReport1" 
  Then Verify the user createdReportName is display in the list as "ActivityReport1"
  And  Click on checkBox whose report name as "ActivityReport1" and click on EditButton
  And Update the report name as "ActivityReport" and click on updateconfig button
  When User search the Updatedreportname as "ActivityReport"
  Then  Verify the user updatedReportName is display in the list as "ActivityReport"
  And  Click on checkBox whose report name as "ActivityReport" and click on EditButton
  And Select reportType by "option-1" which has TypeOfReport as "Download Report"
  And Select the DayandTime and click on Apply button
  When Userclick on formatxlsx button and click on downloadReportButton
 Then Verify the downloaded file is avaliable in project folder with "smartsense.xlsx" name
  When Userclick on csvFormat button and click on downloadReportButton
 Then Verify the downloaded file is avaliable in project folder with "smartsense.csv" name
  When Userclick on xlxFormat button and click on downloadReportButton
 Then Verify the downloaded file is avaliable in project folder with "smartsense.xls" name
# When User click on sendMail button user will get message and  again click on ReportMenu and select the List
 When User search the Updatedreportname as "ActivityReport"
  And  Click on checkBox whose report name as "ActivityReport" and click on deleteButton
    
 
