package pageclases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScreenDesignPage {

	WebDriver ndriver;
	WebDriverWait wait;

	@FindBy(xpath= "//img[@src='/app/assets/images/screen-design.svg']")
	private WebElement ScreenDesignButton;

	@FindBy(xpath= "//*[@class='border']")
	private WebElement AddNewTemplateButton;

	@FindBy(xpath= "(//*[contains(@class,'partner-login-label')])[2]")
	private WebElement ClientSpecificOnboardingCheckbox;

	@FindBy(xpath= "//button[normalize-space()='Continue']")
	private WebElement ContinueButtonforCSO;

	@FindBy(xpath= "//label[normalize-space()='Service Based Dashboard']")
	private WebElement ServiceBasedDashboardCheckbox;

	@FindBy(xpath= "//button[normalize-space()='Continue']")
	private WebElement ContinueButtonforSBD;

	@FindBy(xpath= "//input[@placeholder='Search...']")
	private WebElement SearchforSustainability;

	@FindBy(xpath= "//label[normalize-space()='Sustainability']")
	private WebElement SustainabilityCheckbox;

	@FindBy(xpath= "//button[normalize-space()='Continue']")
	private WebElement ContinueButtonforSusService;

	@FindBy(xpath= "//input[@placeholder='Search...']")
	private WebElement SearchforClient;

	@FindBy(xpath= "(//*[contains(@class,'partner-login-')])[9]")
	private WebElement ClientSelectCheckbox;

	@FindBy(xpath= "//button[normalize-space()='Continue']")
	private WebElement ContinuebuttonforClient;

	@FindBy(xpath= "//label[normalize-space()='ANGAT']")
	private WebElement SelectPlant;

	@FindBy(xpath= "//button[normalize-space()='Continue']")
	private WebElement ContinuebuttonforPlant;

	@FindBy(xpath= "//input[@placeholder='Enter Name']")
	private WebElement EnterServiceName;

	@FindBy(xpath= "//textarea[@placeholder='Enter Description']")
	private WebElement EnterDescription;

	@FindBy(xpath= "//button[normalize-space()='Continue']")
	private WebElement ContinueButtonForAddSusTemplate ;

	@FindBy(xpath= "//input[@placeholder='Search by Name']")
	private WebElement SearchByName;

	@FindBy(xpath= "(//*[contains(@class,'checkmark')])[1]")
	private WebElement SelectTheparticularServiceTemplateCheckbox;

	@FindBy(xpath= "//*[contains(@class,'rt-td')][4]")
	private WebElement ClickOntheParticularServiceTemplate;

	@FindBy(xpath= "//span[@class='float-button-text']")
	private WebElement OptionsButton;
	
//UPDATE
	@FindBy(xpath= "//a[normalize-space()='Client Specific Templates']")
	private WebElement ClientSpecificTemplateButton;

	@FindBy(xpath= "//a[normalize-space()='Service Based Dashboard']")
	private WebElement ServiceBasedDashboardButton;

	@FindBy(xpath= "(//*[contains(@class,'icon-img light-img')])[1]")
	private WebElement EditTemplateButton;
	
 //DELETE
		@FindBy(xpath= "(//*[contains(@class,'icon-img light-img')])[2]")
		private WebElement ServiceDeleteButton;
		
		@FindBy(xpath= "")
		private WebElement ServiceBasedDashboardButtone;

	public ScreenDesignPage(WebDriver odriver)
	{
		this.ndriver=odriver;
		PageFactory.initElements(ndriver, this);
		wait=new WebDriverWait(ndriver, Duration.ofSeconds(30));
	}



	public boolean ScreenDesignModuleAvailablity() throws InterruptedException 
	{
		wait.until(ExpectedConditions.visibilityOf(ScreenDesignButton));
		//Thread.sleep(3000);
		boolean SDisdisplay = ScreenDesignButton.isDisplayed();
		return SDisdisplay;
	}


	public void ClickonScreenDesignButton() throws InterruptedException 
	{
		wait.until(ExpectedConditions.elementToBeClickable(ScreenDesignButton));
		//Thread.sleep(3000);
		ScreenDesignButton.click();
	}

	public void ClickOnAddNewTemplateButton() throws InterruptedException 
	{
		wait.until(ExpectedConditions.elementToBeClickable(AddNewTemplateButton));
		//Thread.sleep(3000);
		AddNewTemplateButton.click();
	}

	public void SelectClientSpecificOnboardingCheckboxAndClickOnContinueButton() throws InterruptedException 
	{
		wait.until(ExpectedConditions.elementToBeClickable(ClientSpecificOnboardingCheckbox));
		//Thread.sleep(3000);
		ClientSpecificOnboardingCheckbox.click();
		//Thread.sleep(3000);
		ContinueButtonforCSO.click();

	}
	public void SelectTheServiceBasedDashboardCheckboxAndClickOnContinueButton() throws InterruptedException 
	{
		wait.until(ExpectedConditions.elementToBeClickable(ServiceBasedDashboardCheckbox));
		//Thread.sleep(3000);
		ServiceBasedDashboardCheckbox.click();
		//Thread.sleep(3000);
		ContinueButtonforSBD.click();

	}
	public void SearchforServiceAndClickOnServiceAndClickOnContinueButton(String service) throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(SearchforSustainability));
		Thread.sleep(3000);
		SearchforSustainability.clear();
		//Thread.sleep(2000);
		SearchforSustainability.sendKeys(service);

		wait.until(ExpectedConditions.elementToBeClickable(SustainabilityCheckbox));
		//Thread.sleep(3000);
		SustainabilityCheckbox.click();
		//Thread.sleep(3000);
		ContinueButtonforSusService.click();	
	}
	public void SearchForClientAndClickOnClientAndClickOnContinueButton(String Client) throws InterruptedException 
	{
		wait.until(ExpectedConditions.visibilityOf(SearchforClient));
		//Thread.sleep(3000);
		SearchforClient.clear();
		//Thread.sleep(3000);
		SearchforClient.sendKeys(Client);

		wait.until(ExpectedConditions.elementToBeClickable(ClientSelectCheckbox));
		//Thread.sleep(3000);
		ClientSelectCheckbox.click();
		//Thread.sleep(3000);
		ContinuebuttonforClient.click();	
	}
	public void SearchForPlantAndClickOnPlantAndClickOnContinueButton(String Plant) throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(SelectPlant));
		//Thread.sleep(3000);
		SelectPlant.click();
		//Thread.sleep(3000);
		ContinuebuttonforPlant.click();

	}
	public void EnterServiceName(String Sname) throws InterruptedException 
	{
		wait.until(ExpectedConditions.elementToBeClickable(EnterServiceName));
		//Thread.sleep(3000);
		EnterServiceName.click();
		//Thread.sleep(3000);
		EnterServiceName.clear();
		//Thread.sleep(3000);
		EnterServiceName.sendKeys(Sname);
	}
	public void EnterServiceDescriptionAndClickOnContiuneButton(String Description) throws InterruptedException 
	{
		wait.until(ExpectedConditions.elementToBeClickable(EnterDescription));
		//Thread.sleep(3000);
		EnterDescription.click();
		EnterDescription.clear();
		//Thread.sleep(3000);
		EnterDescription.sendKeys(Description);
		//Thread.sleep(2000);
		ContinueButtonForAddSusTemplate.click();
	}

	public String GetURLofTemplateListPage() throws InterruptedException 
	{
		Thread.sleep(4000);
		String TemplateListpageUrl = ndriver.getCurrentUrl();
		return TemplateListpageUrl;
	}

	public void SearchTheCreatedServiceTemplate(String SearchTheTemplate) throws InterruptedException 
	{
		wait.until(ExpectedConditions.visibilityOf(SearchByName));
		//Thread.sleep(3000);
		SearchByName.clear();
		SearchByName.sendKeys(SearchTheTemplate);
	}
	public void SelectTheCreatedServiceTemplateCheckboxAndClickOnTheCreatedServiceTemplate() throws InterruptedException 
	{
		wait.until(ExpectedConditions.elementToBeClickable(SelectTheparticularServiceTemplateCheckbox));
		//Thread.sleep(3000);
		SelectTheparticularServiceTemplateCheckbox.click();
		//Thread.sleep(3000);
		ClickOntheParticularServiceTemplate.click();
	}
	public boolean VerifyOptionButtion() throws InterruptedException 
	{
		wait.until(ExpectedConditions.visibilityOf(OptionsButton));
		//Thread.sleep(3000);
		boolean isdisplay = OptionsButton.isDisplayed();
		return isdisplay;
	}

//------------------------------------------------------------------------------------------------------------------------------------------------

	public void ClickOnTheClientSpecificTemplateButton() 
	{
		ClientSpecificTemplateButton.click();
	}

	public void ClickOnTheServiceBasedDashboardButton() 
	{
		ServiceBasedDashboardButton.click();
	}

	public void SelectTheCreatedServiceTemplateCheckboxAndClickOnTheEditTemplateButton() throws InterruptedException 
	{
		//wait.until(ExpectedConditions.elementToBeClickable(SelectTheparticularServiceTemplateCheckbox));
		Thread.sleep(3000);
		SelectTheparticularServiceTemplateCheckbox.click();
		Thread.sleep(3000);
		EditTemplateButton.click();	
	}
	
	public void ClickOnTheContinueButtonForCSOAndClickOnTheContinueButtonForSBDAndClickOnTheContinueButtonForSustainabilityAndClickOnTheContinueButtonForClientAndClickOnTheContinueButtonForPlant() throws InterruptedException 
	{
		Thread.sleep(2000);
		ContinueButtonforCSO.click();
		Thread.sleep(2000);
		ContinueButtonforSBD.click();
		Thread.sleep(2000);
		ContinueButtonforSusService.click();
		Thread.sleep(2000);
		ContinuebuttonforClient.click();
		Thread.sleep(2000);
		ContinuebuttonforPlant.click();	
	}
	public void UpdateServiceName(String UpdateSname) throws InterruptedException 
	{
		//wait.until(ExpectedConditions.elementToBeClickable(EnterServiceName));
		Thread.sleep(2000);
		EnterServiceName.click();
		Thread.sleep(2000);
		EnterServiceName.clear();
		Thread.sleep(2000);
		EnterServiceName.sendKeys(UpdateSname);
	}

	public void UpdateServiceDescriptionAndClickOnContiuneButton(String UpdateDescription) throws InterruptedException 
	{
		wait.until(ExpectedConditions.elementToBeClickable(EnterDescription));
		Thread.sleep(2000);
		EnterDescription.click();
		EnterDescription.clear();
		Thread.sleep(2000);
		EnterDescription.sendKeys(UpdateDescription);
		Thread.sleep(2000);
		ContinueButtonForAddSusTemplate.click();
		
	}
	
	public void VerifyTheUpdatedTemplateAvailability(String updatedService) throws InterruptedException 
	{
			//wait.until(ExpectedConditions.visibilityOf(SearchByName));
			Thread.sleep(3000);
			SearchByName.clear();
			SearchByName.sendKeys(updatedService);
			Thread.sleep(3000);
			SelectTheparticularServiceTemplateCheckbox.click();
			
    }
	public boolean VerifyUpdatedTemplateIsDisplayed() throws InterruptedException 
	{
	   Thread.sleep(3000);
	 boolean IsDisplayed = ClickOntheParticularServiceTemplate.isDisplayed();
	 return IsDisplayed;
	}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void SelectTheUpdatedServiceTemplateCheckboxAndClickOnTheDeleteTemplateButton() throws InterruptedException 
	{
		//wait.until(ExpectedConditions.elementToBeClickable(SelectTheparticularServiceTemplateCheckbox));
		Thread.sleep(3000);
		SelectTheparticularServiceTemplateCheckbox.click();
		Thread.sleep(3000);
		ServiceDeleteButton.click();	
	}
	
	
}






