package stepdefinations;

import java.io.File;
import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import drivers.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageclases.Activity;


public class ActivitySteps {
	

	
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
//    
    @Given("Add new Report")
    public void add_new_report() throws Exception {
    	Thread.sleep(2000);
    	ac.clickonReportMenu();
    	ac.clickOnaddNewReport();
    }
    @Given("Add report name as {string} and select report type as {string}")
    public void add_report_name_as_and_select_report_type_as(String reportname, String reportType) throws Exception {
    	ac.enterReportNameField(reportname);
//    	ac.selectReportType(reportType);
    }
   
    @Given("Add below sensors")
    public void add_below_sensors(io.cucumber.datatable.DataTable dataTable) throws Exception {
    
    ac.selectSensors(dataTable);
    	
    }
    
    @Given("Add below parameters")
    public void add_below_parameters(io.cucumber.datatable.DataTable dataTable) throws Exception {
    	ac.selectParameters(dataTable);
       
    }
   
    @Given("select the Graintime by {string} which have time {string}")
    public void select_the_graintime_by_which_have_time(String option, String time) throws Exception {
    	ac.selectTheGrinTime(option, time);
    }
    
    @Given("select the startTime by {string} which have time {string}")
    public void select_the_start_time_by_which_have_time(String option, String starttime) throws Exception {
     ac.selectStarttime(option, starttime);
}
    
    @Given("select the endTime by {string} which have time {string}")
    public void select_the_end_time_by_which_have_time(String option, String endtime) throws Exception {
    	ac.selectEndttime(option, endtime);
    }
    @Given("select the triggerTime by {string} which have time {string}")
    public void select_the_trigger_time_by_which_have_time(String option, String triggerTime) throws Exception {
    	ac.selectTriggertime(option, triggerTime);
    }
    
    @Given("add the emails as below")
    public void add_the_emails_as_below(io.cucumber.datatable.DataTable datatable) throws Exception {
    	ac.selectemail(datatable);
    }
    
    @Given("select Delivery Frequency by {string} which has {string} frequency")
    public void select_delivery_frequency_by_which_has_frequency(String option, String freq) throws Exception {
//ac.selectfrequency(option, freq);
}
    @Given("start Day by {string} which is {string}")
    public void start_day_by_which_is(String option, String dayname) throws Exception {
    	
    	ac.selectStartDay(option, dayname);
    }
    @Given("click on Save config button")
    public void click_on_save_config_button() throws Exception {
       ac.clickOnSaveConfigbtn();
    }
    
    @Then("verify user is navigated to ReportListPage")
    public void verify_user_is_navigated_to_report_list_page() {
//       ac.verifyReportListIsAvaliable();
    	
    
    	
    }


    
    
   
}
