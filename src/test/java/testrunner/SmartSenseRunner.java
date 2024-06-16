package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\features\\AddNewReport.feature"},
		glue= {"stepdefinations"},
		dryRun= false,
		monochrome=true,
		plugin = {"pretty"}
		)









public class SmartSenseRunner extends AbstractTestNGCucumberTests
{
	/* This class will be Empty*/

}
