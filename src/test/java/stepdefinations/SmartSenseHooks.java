package stepdefinations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.eco.base.BaseClass;

import drivers.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SmartSenseHooks extends BaseClass{
	WebDriver driver;
	DriverFactory df;

	@Before("@Login")
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

	
	@After("@Delete")
	public void tearDown() 
	{
		String basePath = System.getProperty("user.dir");
		String path =basePath+"\\downloadfiles";	
    	deleteFolder(new File(path));
	}
}

