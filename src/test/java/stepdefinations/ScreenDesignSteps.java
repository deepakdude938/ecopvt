package stepdefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import drivers.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageclases.ScreenDesignPage;


public class ScreenDesignSteps {

	WebDriver driver;
	ScreenDesignPage Screen= new ScreenDesignPage(DriverFactory.getDriver());

	@Given("User has access to Screen Design module")
	public void user_has_access_to_screen_design_module() throws InterruptedException 
	{
		boolean verify = Screen.ScreenDesignModuleAvailablity();
		Assert.assertTrue(verify);
	}

	@When("User click on the Screen Design module")
	public void user_click_on_the_screen_design_module() throws InterruptedException {
		Screen.ClickonScreenDesignButton();
	}

	@When("User click on the Add New Template button")
	public void user_click_on_the_add_new_template_button() throws InterruptedException {
		Screen.ClickOnAddNewTemplateButton();
	}

	@When("User Select the Client Specific Onboarding Checkbox And Click on the Continue button")
	public void user_select_the_client_specific_onboarding_checkbox_and_click_on_the_continue_button() throws InterruptedException {
		Screen.SelectClientSpecificOnboardingCheckboxAndClickOnContinueButton();
	}

	@When("User Select the Service Based Dashboard Checkbox option And Click on the Continue button")
	public void user_select_the_service_based_dashboard_checkbox_option_and_click_on_the_continue_button() throws InterruptedException {
		Screen.SelectTheServiceBasedDashboardCheckboxAndClickOnContinueButton();
	}

	@When("User Search the Service as {string} And Select the Sustainability checkbox And Click on the Continue button")
	public void user_search_the_service_as_and_select_the_sustainability_checkbox_and_click_on_the_continue_button(String Service) throws InterruptedException {
		Screen.SearchforServiceAndClickOnServiceAndClickOnContinueButton(Service);
	}

	@When("User Search the Client as {string} And Select the Ecolibrium Energy Client checkbox And click on the continue button")
	public void user_search_the_client_as_and_select_the_ecolibrium_energy_client_checkbox_and_click_on_the_continue_button(String Client) throws InterruptedException {
		Screen.SearchForClientAndClickOnClientAndClickOnContinueButton(Client);
	}

	@When("User Select the Plant as {string} And click on the continue button")
	public void user_select_the_plant_as_and_click_on_the_continue_button(String Plant) throws InterruptedException {
		Screen.SearchForPlantAndClickOnPlantAndClickOnContinueButton(Plant);
	}

	@When("User Enter Service Name as {string}")
	public void user_enter_service_name_as(String Sname) throws InterruptedException {
		Screen.EnterServiceName(Sname);
	}

	@When("Enter Description as {string} And click on the continue button")
	public void enter_description_as_and_click_on_the_continue_button(String Description) throws InterruptedException {
		Screen.EnterServiceDescriptionAndClickOnContiuneButton(Description);
	}

	@Then("Service template list page URl should contains {string}")
	public void service_template_list_page_u_rl_should_contains(String CURL) throws InterruptedException {
		String CurrentUrl = Screen.GetURLofTemplateListPage();
		boolean isPresent= CurrentUrl.contains(CURL);
		Assert.assertTrue(isPresent);
	}

	@When("User Search the service template as {string}")
	public void user_search_the_service_template_as(String SearchService) throws InterruptedException {
        Screen.SearchTheCreatedServiceTemplate(SearchService);
	}

	@When("User Select the Automation Test template checkbox And click on the Automation Test template")
	public void select_the_automation_test_template_checkbox_and_click_on_the_automation_test_template() throws InterruptedException {
      Screen.SelectTheCreatedServiceTemplateCheckboxAndClickOnTheCreatedServiceTemplate();
	}

	@Then("Options button should be Displayed")
	public void options_button_should_be_displayed() throws InterruptedException {
      boolean OptionDisplayed = Screen.VerifyOptionButtion();
      Assert.assertTrue(OptionDisplayed);
	}
//UPDATE----------------------------------------------------------------------------------------------------------------------------------------------------------

@When("User click on the Client Specific Template")
public void user_click_on_the_client_specific_template() {
    Screen.ClickOnTheClientSpecificTemplateButton();
}
@When("User Click on the Service Based Dashboard")
public void user_click_on_the_service_based_dashboard() {
    Screen.ClickOnTheServiceBasedDashboardButton();
}
@When("User Select the Automation Test template checkbox And click on the edit button")
public void user_select_the_automation_test_template_checkbox_and_click_on_the_edit_button() throws InterruptedException {
    Screen.SelectTheCreatedServiceTemplateCheckboxAndClickOnTheEditTemplateButton();
}
@When("User click on the Continue button And User click on the Continue button And User click on the Continue button And User click on the Continue button And User click on the continue button")
public void user_click_on_the_continue_button_and_user_click_on_the_continue_button_and_user_click_on_the_continue_button_and_user_click_on_the_continue_button_and_user_click_on_the_continue_button() throws InterruptedException {
   Screen.ClickOnTheContinueButtonForCSOAndClickOnTheContinueButtonForSBDAndClickOnTheContinueButtonForSustainabilityAndClickOnTheContinueButtonForClientAndClickOnTheContinueButtonForPlant();
}
@When("User Update the Service Name as {string}")
public void user_update_the_service_name_as(String UpdateServiceName) throws InterruptedException {
    Screen.UpdateServiceName(UpdateServiceName);
}
@When("User Update Description as {string} And click on the continue button")
public void user_update_description_as_and_click_on_the_continue_button(String UpdateDescription) throws InterruptedException {
  Screen.UpdateServiceDescriptionAndClickOnContiuneButton(UpdateDescription);
}
@Then("User should be able to see the updated template as {string}")
public void user_should_be_able_to_see_the_updated_template_as(String VerifyupdatedService) throws InterruptedException {
   
	Screen.VerifyTheUpdatedTemplateAvailability(VerifyupdatedService);	
	
    boolean verify = Screen.VerifyUpdatedTemplateIsDisplayed();
    Assert.assertTrue(verify);
}
//DELETE---------------------------------------------------------------------------------------------------------------------------------------------------------------

@When("User Select the Automation Updated template checkbox And click on the delete button")
public void user_select_the_automation_updated_template_checkbox_and_click_on_the_delete_button() throws InterruptedException {
    Screen.SelectTheUpdatedServiceTemplateCheckboxAndClickOnTheDeleteTemplateButton();
}
@Then("Are you sure you want to delete Service popup should be visible")
public void are_you_sure_you_want_to_delete_service_popup_should_be_visible() {
    
}
@When("User click on the Ok button")
public void user_click_on_the_ok_button() {
    
}
@Then("Service deleted popup should be visible")
public void service_deleted_popup_should_be_visible() {
    
}


}
