package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\features\\AddDashboard.feature"},
		glue= {"stepdefinations"},
		dryRun= false,
		monochrome=true,
//				tags={"@tag2" "@Login"},
//		plugin = {"pretty"}
		
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)









public class SmartSenseRunner extends AbstractTestNGCucumberTests
{
	/* This class will be Empty*/

}
