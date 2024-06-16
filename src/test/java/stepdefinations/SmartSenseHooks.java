package stepdefinations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import drivers.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SmartSenseHooks {
	WebDriver driver;
	DriverFactory df;

	@Before
	public void LaunchBrowser() throws IOException {

		Properties prop = new Properties();
		String path = System.getProperty("user.dir")+"//src//test//resources//config.properties";
		FileInputStream fis = new FileInputStream(path);         
		prop.load(fis);
		String browsername = prop.getProperty("Browser");
		df = new DriverFactory();
		driver = df.initBrowser(browsername);
        driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	
	@After
	public void tearDown() 
	{
//		driver.quit();
	}
}

