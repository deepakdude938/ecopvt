package pageclases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Example {
	
	public Example(WebDriver driver ) {

		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (xpath =  "")
	WebElement tryThis ; 
	
	
	public  void  ClickOnButton () {
	
		tryThis.click();
	}
}
