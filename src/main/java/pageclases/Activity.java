package pageclases;

import java.io.File;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.eco.base.BaseClass;
import com.eco.base.JavaScriptOperation;

public class Activity extends BaseClass {

	WebDriver ndriver;
	WebDriverWait wait;
	JavaScriptOperation js;

	public Activity(WebDriver odriver) {
		this.ndriver = odriver;
		PageFactory.initElements(ndriver, this);
		wait = new WebDriverWait(ndriver, Duration.ofSeconds(30));
		js=new JavaScriptOperation(ndriver);
		
	}
	
	

	@FindBy(xpath = "//img[@src='/app/assets/images/activity.svg']")
	private WebElement activityMenu;
	
	@FindBy(xpath="//*[text()='Add New Activity']")
	private WebElement addNewActivityButton;
	
	@FindBy(xpath="//div[contains(@class,'MuiInputBase-root')]/input")
    private WebElement activityName;
	
	@FindBy(name="event_type")
	private WebElement activityType;
	
	@FindBy(xpath="//input[@name='user_search']")
	private WebElement senserName;
	
	@FindBy(xpath="(//div[contains(@class,'selectionbox_prefix__indicator ')])[1]")
	private WebElement standardName;
	
	@FindBy(xpath="//select[@name='item_name']")
	private WebElement itemName;
	
	@FindBy(xpath="(//div[contains(@class,'css-16pqwjk-indicatorContainer selectionbox_prefix__indicator selectionbox_prefix__dropdown-indicator')])[2]")
	private WebElement actionTaken;
	
	@FindBy(xpath="//input[@name='observation_result']")
	private WebElement observationResult;
	
	@FindBy(xpath="//textarea[@class='form-control rounded-0']")
	private WebElement description;
	
	@FindBy(xpath="(//label[@class='label-text']/span[text()='Date of Activity Planned*']//following::div[@class='actiondatepicker'])[1]")
	private WebElement dateOfActivityPlanned;
	
	@FindBy(xpath="(//label[@class='label-text']/span[text()='Date of Activity Executed*']//following::div[@class='actiondatepicker'])[1]")
	private WebElement dateOfActivityExecuted;
	
	@FindBy(xpath="//button[text()='Create Activity']")
	private WebElement createActivityButton;
	
	@FindBy(xpath="//button[text()='Logs']")
	private WebElement logsbutton;
	
	@FindBy(xpath="(//div[@class='rt-tbody']/div[1]//div[@class='rt-td']/div)[1]")
	private WebElement activityonLogPage;
	
	@FindBy(xpath="//button[text()='Update Activity']")
	private WebElement updateActivityButton;
	
	@FindBy(xpath="//button[text()='Summary']")
	private WebElement summaryButton;
	
	@FindBy(xpath="//p[@class='download-text']//img[@class='icon-img dark-img']")
	private WebElement downloadbutton;

	public void clickOnActivityMenu() {
		wait.until(ExpectedConditions.visibilityOf(activityMenu));
		activityMenu.click();
	}
	
	public void clickOnAddNewActivity() {
		wait.until(ExpectedConditions.visibilityOf(addNewActivityButton));
		addNewActivityButton.click();
	}
	
	public void enterActivityName(String actName) {
		wait.until(ExpectedConditions.visibilityOf(activityName));
		activityName.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
        JavascriptExecutor jse = ((JavascriptExecutor)ndriver);
		jse. executeScript("arguments[0]. value='"+actName+"';", activityName);
	}
	
	public void selectActivityType(String actType) {
		Select selectActivityType=new Select(activityType);
		selectActivityType.selectByValue(actType);
	}
	
	public void selectSensorName(String senName) {
		senserName.click();
		//ndriver.findElement(By.xpath("//div[@class='user-search-suggestion']//ul/li[text()='QA12']")).click();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
		ndriver.findElement(By.xpath("//div[@class='user-search-suggestion']//ul/li[text()='"+ senName + "']")).click();
	}
	
	public void selectStandardName(String stanName) {
		standardName.click();
		ndriver.findElement(By.xpath("//div[contains(@class,'css-11unzgr selectionbox_prefix__menu-list')]/div[text()='"+stanName +"']")).click();
	}
	
	public void selectItemName(String itemNameValue) {
	    Select selectItemName=new Select(itemName);
	    selectItemName.selectByVisibleText(itemNameValue);
	}
	
	public void selectActionTaken(String actionTakenValue) {
		actionTaken.click();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
	    WebElement selectActionTaken=ndriver.findElement(By.xpath("//div[contains(@class,'css-11unzgr selectionbox_prefix__menu-list')]/div[text()='"+actionTakenValue +"']"));
	    String javascript1 = "arguments[0]. click()";
	    JavascriptExecutor jsExecutor1 = (JavascriptExecutor) ndriver;
	    jsExecutor1. executeScript(javascript1, selectActionTaken);
	}
	
	public void enterObservationResult(String obserValue) {
		observationResult.sendKeys(obserValue);
	}
	
	public void enterDescription(String descriptionText) {
		description.sendKeys(descriptionText);
	}
	
	public void selectDateOfActivityPlanned(String sdate) {
		dateOfActivityPlanned.click();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
	    ndriver.findElement(By.xpath("(//td[contains(@class,'CalendarDay') and text()='"+sdate+"'])[2]")).click();
	    ndriver.findElement(By.xpath("//button[text()='Apply']")).click();
	}
	
	public void selectDateOfActivityExecuted(String sdate) {
		dateOfActivityExecuted.click();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
	    ndriver.findElement(By.xpath("(//td[contains(@class,'CalendarDay') and text()='"+sdate+"'])[2]")).click();
	    ndriver.findElement(By.xpath("//button[text()='Apply']")).click();
	}
	
	public void clickOnCreateActivity() {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
	    String javascript = "arguments[0].click()";
	    JavascriptExecutor jsExecutor = (JavascriptExecutor) ndriver;
	    jsExecutor. executeScript(javascript, createActivityButton);
	    //activityName.sendKeys("7");;
	    //jsExecutor. executeScript(javascript, createActivityButton);
	    
	    //createActivityButton.click();
	}
	
	public void clickOnLogsButton() {
		wait.until(ExpectedConditions.visibilityOf(logsbutton));
		logsbutton.click();
	}
	
	public void clickOnActivityCreated() {
		wait.until(ExpectedConditions.visibilityOf(activityonLogPage));
		activityonLogPage.click();
	}
	
	public void editActivityName(String updateactName) {
		activityName.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		//wait.until(ExpectedConditions.visibilityOf(activityName));
		activityName.sendKeys(updateactName);
		//JavascriptExecutor jse = ((JavascriptExecutor)ndriver);
		//jse. executeScript("arguments[0]. value='"+updateactName+"';", activityName);
	}
	
	public void clickOnUpdateActivityButton() {
	    String javascript = "arguments[0].click()";
	    JavascriptExecutor jsExecutor = (JavascriptExecutor) ndriver;
	    jsExecutor. executeScript(javascript, updateActivityButton);
	}
	
	public void clickOnUpdatedActivityOnLogPage() {
		wait.until(ExpectedConditions.visibilityOf(activityonLogPage));
		activityonLogPage.click();
	}
	
	public String verifyActivityNameUpdateOnLogPage() {
		wait.until(ExpectedConditions.visibilityOf(activityName));
		return activityName.getAttribute("value");
	}
	
	public void clickOnSummaryButton() {
		wait.until(ExpectedConditions.visibilityOf(summaryButton));
		summaryButton.click();
	}
	
	public void clickOnDownloadButton() {
		wait.until(ExpectedConditions.visibilityOf(downloadbutton));
		downloadbutton.click();
	}

//		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



}

