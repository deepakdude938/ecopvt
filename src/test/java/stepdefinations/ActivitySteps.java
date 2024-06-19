package stepdefinations;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.eco.base.BaseClass;
import com.fasterxml.jackson.databind.node.BooleanNode;

import drivers.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
   
    @Given("Select the Graintime by {string} which have time {string}")
    public void Select_the_graintime_by_which_have_time(String option, String time) throws Exception {
    	ac.selectTheGrinTime(option, time);
    }
    
    @Given("Select the startTime by {string} which have time {string}")
    public void select_the_start_time_by_which_have_time(String option, String starttime) throws Exception {
     ac.selectStarttime(option, starttime);
}
    
    @Given("Select the endTime by {string} which have time {string}")
    public void select_the_end_time_by_which_have_time(String option, String endtime) throws Exception {
    	ac.selectEndttime(option, endtime);
    }
    @Given("Select the triggerTime by {string} which have time {string}")
    public void select_the_trigger_time_by_which_have_time(String option, String triggerTime) throws Exception {
    	ac.selectTriggertime(option, triggerTime);
    }
    
    @Given("Add the emails as below")
    public void add_the_emails_as_below(io.cucumber.datatable.DataTable datatable) throws Exception {
    	ac.selectemail(datatable);
    }
    
    @Given("Select Delivery Frequency by {string} which has {string} frequency")
    public void select_delivery_frequency_by_which_has_frequency(String option, String freq) throws Exception {
//ac.selectfrequency(option, freq);
}
    @Given("Start Day by {string} which is {string}")
    public void start_day_by_which_is(String option, String dayname) throws Exception {
    	
    	ac.selectStartDay(option, dayname);
    }
    
    
    @Then("Click on Save config button and verify user is navigated to ReportListPage")
    public void click_on_save_config_button_and_verify_user_is_navigated_to_report_list_page() throws Exception {
    	ac.clickOnSaveConfigbtn();
    	 boolean  avaliable =ac.verifyUserIsOnReportListPage();
       System.out.println(avaliable);
       assertTrue(avaliable,"listpage is not avaliable");
    }
    
    
    @When("Search the create Report by name as {string}")
    public void search_the_create_report_by_name_as(String reportName) throws Exception {
    	ac.searchTheCreatedReportName(reportName);
    }
    
    @Then("Verify the user createdReportName is display in the list as {string}")
    public void verify_the_user_created_report_name_is_display_in_the_list_as(String CreatedReportName) throws Exception {
        boolean ReportAvaliable=ac.verifySearchReportnameIsDisplayed();
        assertTrue(ReportAvaliable, "report is not displayed");
        String reportName=ac.VerifyTheNameOfCreatedReport();
        assertEquals(reportName, CreatedReportName);
        System.out.println("user is able to create report succefully");
       
    }
//    ..................................................................
    
    @Given("User is on smartSense page and click on ReportMenu and select the List")
    public void user_is_on_smart_sense_page_and_click_on_report_menu_and_select_the_list() throws Exception {
       ac.clickOnReportMenuAndList();
    }
    
    @Then("Click on checkBox whose report name as {string} and click on EditButton")
    public void click_on_check_box_whose_report_name_as_and_click_on_edit_button(String Reportname) throws Exception {
       ac.clickOnCheckBox(Reportname);
       ac.clickOnEditBtn();
    }
    
    @Then("Update the report name as {string} and click on updateconfig button")
    public void update_the_report_name_as_and_click_on_updateconfig_button(String updateName) throws Exception {
    	BaseClass.reportName1 = updateName;
             ac.updateReportName( updateName);
             ac.clickOnUpdateConfigBtn();
    }
    
    @When("User search the Updatedreportname as {string}")
    public void user_search_the_updatedreportname_as(String withUpdatedName) throws Exception {
              ac.searchTheUpdatedReportName(withUpdatedName);
    }
    
    @Then("Verify the user updatedReportName is display in the list as {string}")
    public void verify_the_user_updated_report_name_is_display_in_the_list_as(String updatedReportName) throws MalformedURLException {
        String reportName= ac.updatedReportnameIsDisplayed();
         assertEquals(reportName, updatedReportName);
    }
    
    @Then("Select reportType by {string} which has TypeOfReport as {string}")
    public void select_report_type_by_which_has_type_of_report_as(String optn, String reportType) throws Exception {
            ac.selectReportType( optn,reportType);
    
    }
    
    @Then("Select the DayandTime and click on Apply button")
    public void select_the_dayand_time_and_click_on_apply_button() throws Exception {
           ac.selectDateAndTime();
           ac.clickOnApplyBtn();
           
    }
    
    @When("Userclick on formatxlsx button and click on downloadReportButton")
    public void userclick_on_formatxlsx_button_and_click_on_download_report_button() throws Exception {
            ac.clickOnXlxsFormat();
            ac.clickOnDownloadReport();
            ac.checkSuccessMessageForSendEmail();
            
    }
    @Then("Verify the downloaded file is avaliable with {string} in project folder")
    public void verify_the_downloaded_file_is_avaliable_with_in_project_folder(String xlsxExtension) throws Exception {
ac.checkIfFileIsDownloaded(xlsxExtension);
    
    }
    @When("Userclick on csvFormat button and click on downloadReportButton")
    public void userclick_on_csv_format_button_and_click_on_download_report_button() throws Exception {
       ac.clickOncsvFormat();
       ac.clickOnDownloadReport();
       ac.checkSuccessMessageForSendEmail();
    
    }
//    @Then("verify the downloaded file is avaliable in project folder as {string}  with {string} name")
//    public void verify_the_downloaded_file_is_avaliable_in_project_folder_as_with_name(String folderName, String reportNameWithExtension) throws Exception {
//      ac.checkIfFileIsDownloaded(reportNameWithExtension);
//    }
    
    @Then("Verify the downloaded file is avaliable in project folder with {string} name")
    public void verify_the_downloaded_file_is_avaliable_in_project_folder_with_name(String reportNameWithExtension) throws Exception {
    	ac.checkIfFileIsDownloaded(reportNameWithExtension);
    	}

    
    @When("Userclick on xlxFormat button and click on downloadReportButton")
    public void userclick_on_xlx_format_button_and_click_on_download_report_button() throws Exception {
    	ac.clickOnXlxFormat();
        ac.clickOnDownloadReport();
        ac.checkSuccessMessageForSendEmail();
    }
    @When("User click on sendMail button user will get message and  again click on ReportMenu and select the List")
    public void user_click_on_send_mail_button_user_will_get_message_and_again_click_on_report_menu_and_select_the_list() throws Exception {
    //	 ac.clickOnEmailBtn();
    	 Thread.sleep(1000);
   // 	 ac.checkSuccessMessageForSendEmail();
    	 ac.clickOnReportMenuAndList();
    
    }
    
    @When("Click on checkBox whose report name as {string} and click on export btn and then  deleteButton")
    public void click_on_check_box_whose_report_name_as_and_click_on_export_btn_and_then_delete_button(String updatedRepoName) throws Exception {
    	Thread.sleep(2000);
    	ac.clickOnCheckBox(updatedRepoName);
    	ac.clickOnExportBtnAndHandlegeneratedPopup();
    	ac.clickOnDeleteBtn();
    
    }
    
    @When("User again search the reportname as {string} then it not avaliable")
     public void user_again_search_the_reportname_as_then_it_not_avaliable(String withUpdatedName) throws Exception {
    	 ac.searchTheUpdatedReportName(withUpdatedName);
    boolean	display = ac.checkNotAvaliableIsDisplay();
    }


    
    
    
    


    
    
   
}
