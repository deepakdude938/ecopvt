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
	
	@When("Add widget and Verify after refresh preview widget is dispayed compulsory")
	public void add_widget_and_verify_after_refresh_preview_widget_is_dispayed_compulsory() throws Exception {
		  dash.addWidget();
	}

	@When("Clone dispayed the widget it gets clone succefully after that delete clone widget")
	public void clone_dispayed_the_widget_it_gets_clone_succefully_after_that_delete_clone_widget() throws Exception {
dash.cloneTheWidgetAndDeleteClone();
	}
	@When("Add new widget")
	public void add_new_widget() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Then("Verify user able to add new widget then clone it and delete clone widget successfully")
	public void verify_user_able_to_add_new_widget_then_clone_it_and_delete_clone_widget_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("User is on Smartsense page and dashboard")
	public void user_is_on_smartsense_page_and_dashboard() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Save the changes")
	public void save_the_changes() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Download the widget data as img and pdf")
	public void download_the_widget_data_as_img_and_pdf() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Setting up the dashboard with unified date picker and update it")
	public void setting_up_the_dashboard_with_unified_date_picker_and_update_it() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
