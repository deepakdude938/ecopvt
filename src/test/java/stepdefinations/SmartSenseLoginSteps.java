package stepdefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import drivers.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageclases.SmartSenseLoginPage;

public class SmartSenseLoginSteps{
	WebDriver driver;
	SmartSenseLoginPage Smart= new SmartSenseLoginPage(DriverFactory.getDriver());

	@Given("User launch the browser")
	public void the_user_launch_the_browser() {

		System.out.println("User Sucessfully launch the Chrome Browser");
	}

	@When("User opens URL {string}")
	public void user_opens_url(String Url) {
		driver = DriverFactory.getDriver();
		driver.get(Url);
	}
	

	@When("User enters Username as {string}")
	public void user_enters_username_as(String UserName) {

		Smart=new SmartSenseLoginPage(DriverFactory.getDriver());
		Smart.Enterusername(UserName);
	}

	@When("User enters Password as {string}")
	public void user_enters_password_as(String Pwd) {
		Smart.Enterpassword(Pwd);
	}

	@When("Click on the Login")
	public void click_on_the_login() {
		Smart.clickonLoginButton();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String Title) {

		String homepagetitle = Smart.GetTitileOfPage();
		boolean isPresent = homepagetitle.contains(Title);
		Assert.assertTrue(isPresent);
	}

}
