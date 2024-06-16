package pageclases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SmartSenseLoginPage {

	WebDriver ndriver;
	WebDriverWait wait;

	@FindBy(xpath= "//*[@name='username']")
	private WebElement Username;

	@FindBy(xpath= "//*[@name='password']")
	private WebElement Password;

	@FindBy(xpath= "//*[@class='login-btn']")
	private WebElement Loginbutton;


	public SmartSenseLoginPage(WebDriver odriver)
	{
		this.ndriver=odriver;
		PageFactory.initElements(ndriver, this);
		wait=new WebDriverWait(ndriver, Duration.ofSeconds(30));
	}

	public void Enterusername(String username) 
	{
		Username.sendKeys(username);
	}

	public void Enterpassword(String password) 
	{
		Password.sendKeys(password);
	}

	public void clickonLoginButton() 
	{
		Loginbutton.click();

	}
	public String GetTitileOfPage() 
	{
		String Loginpagetitle = ndriver.getTitle();
		return Loginpagetitle;
	}
}
