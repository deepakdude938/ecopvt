
  
Feature: Test the User Profile Modeule

@Sanity
Scenario: The user profile button is clickable
	Given User launch the browser
	When User opens URL "https://staging.ecolibrium.io/" 
	And User enters Username as "qa12" 
	And User enters Password as "qa12" 
	And Click on the Login 
	Then Page Title should be "SmartSense"
	Then User cliks on user name button 
	And User wait for 1 seconds
  When User click on the user profile button
  And Get user "Unedited" details 
  Then User cliks on Edit profile details button
	And User Update Name As "New Test"
#	And User Update Email As "Test@testMail.com" 
	And User Update Contact Number As "9876543210"
	Then User clicks on Number Format dropdown 
  And User verify "Number Format" bellow options should be displayed 
  |India - en-IN|
  |US/UK - en-US|
  And User selects "US/UK - en-US" value from dropdown 
  Then User clicks on Delivery Mode dropdown 
  And User verify "Delivery Mode" bellow options should be displayed 
  |SMS|
  |Whatsapp|
  And User selects "Whatsapp" velue from dropdown
  Then User clicks on Dashboard Layout dropdown 
  And User verify "Dashboard Layout" bellow options should be displayed 
  |Vertical|
  |Horizontal|
  And User selects "Vertical" velue from dropdown
  Then User clicks on update profile details button
  And User wait for 2 seconds
  And Get user "Edited" details  
  And User verify Edited details should be displayed as bellow
  |New Test|
  |mrinal.patil@ecolibrium.io|
  |9876543210|
  |US/UK - en-US|
  |Whatsapp|
  |Vertical|
  And User wait for 1 seconds
  #When User click on the user profile button
 Then User cliks on Edit profile details button
  Then User update edited fields 
    Then User clicks on update profile details button
  And User wait for 2 seconds
   And Get user "Edited" details  
  And User verify Edited details should be displayed as bellow
  |qa 12|
  |mrinal.patil@ecolibrium.io|
  |9421511511|
  |US/UK - en-US|
  |Whatsapp|
  |Vertical|
  