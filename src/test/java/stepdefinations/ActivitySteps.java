package stepdefinations;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.eco.base.BaseClass;

import drivers.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import pageclases.Activity;
import pageclases.Activity;


public class ActivitySteps  extends BaseClass {
	

	
	public WebDriver driver = DriverFactory.getDriver();
	public Activity ac = new Activity(DriverFactory.getDriver());
	//private static String downloadPath = "\\Downloads";
	private static String downloadPath = "C:\\Users\\MrinalPatil\\Downloads";
	
	
	public boolean isFileDownloaded(String downloadPath, String fileName) {
		boolean flag = false;
	    File dir = new File(downloadPath);
	    File[] dir_contents = dir.listFiles();
	  	    
	    for (int i = 0; i < dir_contents.length; i++) {
	        if (dir_contents[i].getName().contains(fileName))
	            return flag=true;
	            }

	    return flag;
	}

	@Then("User Click On Activity Menu")
	public void user_Click_On_Activity_Menu() {
		ac.clickOnActivityMenu();
	}
	

    
    @When("User Click on Add New Activity button")
    public void user_Click_on_Add_New_Activity_button() {
    	ac.clickOnAddNewActivity();
    }
    		

    @And("User enter {string} in Activity Name text field")
    public void user_enter_in_Activity_Name_text_field(String actiName) {
    	ac.enterActivityName(actiName);
    }
    
    @And("User select {string} value from Activity Type dropdown")
    public void user_select_value_from_Activity_Type_dropdown(String activType) {
    	ac.selectActivityType(activType);
    }
    
    @And("User select {string} value from Sensor Name dropdown")
    public void user_select_value_from_Sensor_Name_dropdown(String senserNameVal) {
    	ac.selectSensorName(senserNameVal);
    }
    
    @And("User select {string} value from Standard Name dropdown")
    public void user_select_value_from_Standard_Name_dropdown(String standardNameValue) {
    	ac.selectStandardName(standardNameValue);
    }
    
    @And("User select {string} value from Item Name dropdown")
    public void user_select_value_from_Item_Name_dropdown(String itemNameValue) {
    	ac.selectItemName(itemNameValue);
    }
    
    @And("User select {string} value from Action Taken dropdown")
    public void User_select_value_from_Action_Taken_dropdown(String actionTakenValue) {
    	ac.selectActionTaken(actionTakenValue);
    }
    
    @And("User enter {string} value in Description Text field")
    public void user_enter_value_in_Description_Text_field(String descriptionValue) {
    	ac.enterDescription(descriptionValue);
    }
    
    @And("User select {string} for Date of Activity Planned")
    public void user_select_for_Date_of_Activity_Planned(String date) {
    	ac.selectDateOfActivityPlanned(date);
    }
    
    @And("User enter {string} value in Observation Result Text field")
    public void user_enter_value_in_Observation_Result_Text_field(String observationValue) {
    	ac.enterObservationResult(observationValue);
    }

    @And("User select {string} for Date of Activity Executed")
    public void user_select_for_Date_of_Activity_Executed(String date) {
    	ac.selectDateOfActivityExecuted(date);
    }
    
    @And("click on Create Activity button")
    public void click_on_Create_Activity_button() {
    	ac.clickOnCreateActivity();
    }
    
    @Then("click on Activity Menu")
    public void click_on_activity_menu() {
    	ac.clickOnActivityMenu();
    }
    @Then("click on Logs button")
    public void click_on_logs_button() {
     ac.clickOnLogsButton();
    }
    
    @Then("Click on Activity created on log page")
    public void click_on_Activity_created_on_log_page() {
    	ac.clickOnActivityCreated();
    }

    @And("Edit Activity Name with {string} on log page")
    public void edit_Activity_Name_with_on_log_page(String updateAct) {
    	ac.editActivityName(updateAct);
    }
    
    @And("Click on Update Activity on log page")
    public void click_on_Update_Activity_on_log_page() {
    	ac.clickOnUpdateActivityButton();
    }
    
    @Then("Click on Activity updated on log page")
    	public void click_on_Activity_updated_on_log_page() {
    	ac.clickOnUpdatedActivityOnLogPage();
    }
    
    @And("Verify Activity Name {string} updated on log page")
    public void verify_Activity_Name_updated_on_log_page(String updatedActivityName) {
    	String updatedAcName=ac.verifyActivityNameUpdateOnLogPage();
    	Assert.assertEquals(updatedAcName, updatedActivityName);
    }
    
    @Then("click on Activity Menu Again")
    public void click_on_Activity_Menu_Again() {
    	ac.clickOnActivityMenu();
    }
    
    @And("click on Summary button")
    public void click_on_Summary_button() {
    	ac.clickOnSummaryButton();
    	//Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".xls"), "Failed to download document which has extension .xls");
    }
    
    @Then("click on export button for download summary")
    public void click_on_export_button_for_download_summary() {
    	ac.clickOnDownloadButton();
    }
    
    @And("verify excel file downloaded of summary")
    public void verify_excel_file_downloaded_of_summary() {
	    //driver.findElement(By.linkText("mailmerge.xls")).click();
    	try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
	    Assert.assertTrue(isFileDownloaded(downloadPath, "EventActivitySummaryReport"), "Failed to download Expected document");
    }



    
    
    
    


    
    
   
}
