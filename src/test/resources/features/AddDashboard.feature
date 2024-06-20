Feature: create dashboard Module

		@Login	
		Scenario: Login to Eco app
		Given User launch the browser
		When  User opens URL "https://staging.ecolibrium.io/" 
		And   User enters Username as "qa12" 
		And   User enters Password as "qa12" 
		And   Click on the Login 
		Then  Page Title should be "SmartSense"

  Scenario: Create dashboard and add widget successfully
  Given User is on Smartsense page and add dashboard as "d1"
  When Add widget and Verify after refresh preview widget is dispayed compulsory
  When Clone dispayed the widget it gets clone succefully after that delete clone widget
  When Add new widget
  Then Verify user able to add new widget then clone it and delete clone widget successfully
  
  Scenario: Edit dashboard
   Given User is on Smartsense page and dashboard
  When Add widget and Verify after refresh preview widget is dispayed compulsory
  When Clone dispayed the widget it gets clone succefully after that delete clone widget
  And Save the changes
  Then Download the widget data as img and pdf
  And Setting up the dashboard with unified date picker and update it
  
  