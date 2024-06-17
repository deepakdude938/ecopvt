package drivers;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {
	static WebDriver driver;
	public WebDriver initBrowser(String browsername) 
	{
		if(browsername.equals("Chrome")) 
		{driver = new ChromeDriver();
//			String basePath = System.getProperty("user.dir");
//			String path =basePath+"Eco_PVT\\downloadfiles";
//			HashMap<String, Object> chromePrefs = new HashMap<>();
//			chromePrefs.put("profile.default_content_settings.popups", 0);
//			chromePrefs.put("download.default_directory", path);
//			ChromeOptions options = new ChromeOptions();
//			options.setExperimentalOption("prefs", chromePrefs);

//			driver = new ChromeDriver(options);
			
			
				
		}
		else if(browsername.equals("Edge"))
		{
			driver = new EdgeDriver();
		}

		return driver;
	}


	public static WebDriver getDriver() 
	{
		return driver;
	}
}
