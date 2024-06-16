package pageclases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserModulePage {

	WebDriver ndriver;
	
	@FindBy(xpath= "//*[@class=\"userName\"]")
	private WebElement Username;

	@FindBy(xpath= "//*[@/html/body/div/div/div/div[1]/nav/ul/li/div/button[1]/span]")
	private WebElement MyProfile;
	
	public UserModulePage(WebDriver odriver)
	{
		this.ndriver=odriver;
		PageFactory.initElements(ndriver, this);
	}

	public void username()
	{
		Username.click();
	}

	public void myprofile() 
	{
		MyProfile.click();
	}

	
	
}
