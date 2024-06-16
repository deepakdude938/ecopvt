package stepdefinations;

import drivers.DriverFactory;
import io.cucumber.java.en.When;
import pageclases.Example;

public class ExampleStep {
	
	Example exp  = new Example(DriverFactory.getDriver()); 
	
	@When("Example Testing")
	public void tryToCompleteExample() {
		exp.ClickOnButton();
	}

}
