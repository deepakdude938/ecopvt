package stepdefinations;

import org.openqa.selenium.WebDriver;

import drivers.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageclases.Dashboard;

public class DashboardSteps {
	
	public WebDriver driver = DriverFactory.getDriver();
	public Dashboard dash = new Dashboard(DriverFactory.getDriver());
	
	
	@Given("User is on Smartsense page and add dashboard as {string}")
	public void user_is_on_smartsense_page_and_add_dashboard_as(String dashboardName) throws Exception {
           dash.createDashboard(dashboardName);
	}
	@When("User Add widget as {string} then Verify after refresh preview widget is dispayed compulsory")
	public void user_add_widget_as_then_verify_after_refresh_preview_widget_is_dispayed_compulsory(String widgetName) throws Exception {
            dash.addWidget(widgetName);
	}
	@When("Clone dispayed the widget it gets clone succefully after that delete that clone widget")
	public void clone_dispayed_the_widget_it_gets_clone_succefully_after_that_delete_that_clone_widget() throws Exception {
        dash.cloneTheWidgetAndDeleteClone();
	       
	}
	@When("User again Add widget as {string} then Verify after refresh preview widget is dispayed compulsory")
	public void user_again_add_widget_as_then_verify_after_refresh_preview_widget_is_dispayed_compulsory(String widgetName) throws Exception {
//         dash.addWidget(widgetName);
	}
	@Given("User is on Smartsense page and Edit dashboard")
	public void user_is_on_smartsense_page_and_edit_dashboard() throws Exception {
//            dash.editDashboard();
	}
	@When("Edit with by Add new widget as {string} Verify after refresh preview widget is dispayed compulsory")
	public void edit_with_by_add_new_widget_as_verify_after_refresh_preview_widget_is_dispayed_compulsory(String widgetName) throws Exception {
//          dash.addWidget(widgetName);
	}
	
	@When("Save the changes")
	public void save_the_changes() throws Exception {
//         dash.clickOnSaveChanges();
	}
	@When("User Download the widget data as img")
	public void user_download_the_widget_data_as_img() throws Exception {
//       dash.downloadWidgetDataAsImg();
	}
	
	@Then("Verify downloaded file of data is avaliable in project folder with {string} name")
	public void verify_downloaded_file_of_data_is_avaliable_in_project_folder_with_name(String filenameWithExtension) throws Exception {
//	   dash.checkIfFileIsDownloaded(filenameWithExtension);
	}
	
	
	@When("User Download the widget data as pdf")
	public void user_download_the_widget_data_as_pdf() throws Exception {
//         dash.downloadWidgetDataAsPdf();
	}
	@Then("Finally user Setting up the dashboard with unified date picker and update it")
	public void finally_user_setting_up_the_dashboard_with_unified_date_picker_and_update_it() throws Exception {
//                  dash.settingOfDashboard();
	}

}