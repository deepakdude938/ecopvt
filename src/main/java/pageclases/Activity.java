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

import dev.failsafe.internal.util.Assert;

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
//	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(xpath="//img[@src='/app/assets/images/report.svg']")
	private WebElement reportMenu;
	
	@FindBy(xpath="//*[text()='Add New Report']")
	private WebElement AddnewReport;
	
	@FindBy(xpath="//*[@id='standard-name']")
	private WebElement ReportNameField;
	
	@FindBy(xpath="//*[@data-title='Config Report']")
	private WebElement ReportType;
	
	@FindBy(xpath="//*[@placeholder='Select Upto 100 Sensor']")
	private WebElement sensors;

	@FindBy(xpath="//*[@placeholder='Select Upto 20 Parameters']")
	private WebElement parameters;
	
	@FindBy(xpath="//div[@class='grain-collapse']")
	private WebElement grain;
	
	@FindBy(xpath="(//*[@class='input-wrap select-wrap'])[2]")
	private WebElement selectStartTime;
	
	@FindBy(xpath="(//*[@class='input-wrap select-wrap'])[3]")
	private WebElement selectEndTime;
	
	@FindBy(xpath="(//*[@class='css-1pcexqc-container selectionbox'])[5]")
	private WebElement selectTriggerTime;
	
	@FindBy(xpath="//*[@placeholder='Search User']")
	private WebElement email;
	
	@FindBy(xpath="(//*[@class='css-1wy0on6 selectionbox_prefix__indicators'])[6]")
	private WebElement deliveryFreq;
	
	@FindBy(xpath="(//*[@class='css-16pqwjk-indicatorContainer selectionbox_prefix__indicator selectionbox_prefix__dropdown-indicator'])[7]")
	private WebElement startDay;
	
	@FindBy(xpath="//button[text()='Save Config']")
	private WebElement saveconfigBtn;
	
	@FindBy(xpath="//div[@class='page-header-wrap']/h2[text()='Report List']")
	private WebElement ReportList;
//......................
	@FindBy(xpath="//input[@name='TableSearchkey']")
	private WebElement searchReportnameFiled;
	
	@FindBy(xpath="(//*[@class='configured-reports-table-cell'])[3]")
	private WebElement displayedReportName;
	
	@FindBy(xpath="//div[@class='edit-alert top-option-item']/span/span")
	private	WebElement EditCheckbox;
	
	@FindBy(xpath = "//button[text()='Update Config']")
	private	WebElement updateonfigBtn;
	
	@FindBy(xpath = "//button[text()='List']")
	private	WebElement Listbtn;
	
	@FindBy(xpath = "//*[text()='Select Date & Time']")
	private WebElement selectDateAndTime;
	

	@FindBy(xpath = "//button[text()='Apply']")
	private WebElement ApplyBtn;
	
	
	@FindBy(xpath = "//img[@src='/app/assets/images/dark-active-excelsheet.svg']")
	private	WebElement Excelformat ;
	
	@FindBy(xpath = "//img[@src='/app/assets/images/dark-active-csv.svg']")
	private	WebElement csvFileformat;
	
	@FindBy(xpath = "//img[@src='/app/assets/images/dark-normal-xls.svg']")
	private	WebElement xlsFileFormat;
	
	@FindBy(xpath = "//button[text()='Download Report']")
	private	WebElement downloadReportBtn;
	
	@FindBy(xpath = "//button[text()='Send Email']")
	private	WebElement emailBtn;
	
	@FindBy(xpath = "//img[@src='/app/assets/images/deleteIconLight.svg']")
	private	WebElement deleteBtn;
	
	
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
////////////////////////////////////////////////////////////////////////////////////////////////
	public void clickonReportMenu() throws Exception {
//		wait.until(ExpectedConditions.visibilityOf(reportMenu));
//		reportMenu.click();
//		Thread.sleep(2000);
		applyExplicitWaitsUntilElementClickable(reportMenu,30).click();
	}
	
	public void clickOnaddNewReport() throws Exception {
		Thread.sleep(5000);
		applyExplicitWaitsUntilElementClickable(AddnewReport,60).click();
	}
	public void enterReportNameField(String reportName) throws Exception {
		
		 super.reportName1 = reportName;
		applyExplicitWaitsUntilElementClickable(ReportNameField,30).sendKeys(reportName);;
	}
	
//	public void selectReportType(String typeOfReport) throws Exception {
//		applyExplicitWaitsUntilElementClickable(ReportType,30).click();
//		
//	}
	public void selectSensors(io.cucumber.datatable.DataTable dataTable ) throws Exception
	{
		
		applyExplicitWaitsUntilElementClickable(sensors,30).click();

	List<List<String>>	data= dataTable.asLists(String.class);
	System.out.println(data.size());
	System.out.println(data.get(0).size());
	
	for(int i = 0;i<data.get(0).size();i++) {
		String t = data.get(0).get(i);
		ndriver.findElement(By.xpath("//div[@class='user-suggestion-contaner']/ul/li[text()='"+t +"']")).click();
		applyExplicitWaitsUntilElementClickable(sensors,30).click();
	//	ndriver.findElement(By.xpath("//div[@class='user-suggestion-contaner']/ul/li[text()='"+ data.get(0).get(1)+"']")).click();
	}
	
	}
	
	public void selectParameters(io.cucumber.datatable.DataTable dataTable) throws Exception {
		applyExplicitWaitsUntilElementClickable(parameters,30).click();
		List<List<String>>	data= dataTable.asLists(String.class);
		System.out.println(data.size());
		System.out.println(data.get(0).size());
		ndriver.findElement(By.xpath("//*[@class='user-suggestion-contaner']/ul/li[text()='"+data.get(0).get(0)+"']")).click();
		applyExplicitWaitsUntilElementClickable(parameters,30).click();
		ndriver.findElement(By.xpath("//*[@class='user-suggestion-contaner']/ul/li[text()='"+data.get(0).get(1)+"']")).click();		
	}
	
	public void selectTheGrinTime(String option,String time) throws  Exception {
		String javascript = "window.scrollBy(0,400)";
		JavascriptExecutor jsExecutor = (JavascriptExecutor) ndriver;
	    jsExecutor.executeScript(javascript);
		
		applyExplicitWaitsUntilElementClickable(grain,40).click();
		Thread.sleep(2000);
		ndriver.findElement(By.xpath("//div[@id='react-select-3-"+option+"' and text()='"+time+"']")).click();
	}
	
	public void selectStarttime(String option,String StartTime) throws Exception {
		applyExplicitWaitsUntilElementClickable(selectStartTime,40).click();
		ndriver.findElement(By.xpath("//div[@id='react-select-4-"+option+"' and text()='"+StartTime+"']")).click();
		
		}
	
	public void selectEndttime(String option,String endTime) throws Exception {
		applyExplicitWaitsUntilElementClickable(selectEndTime,20).click();
		ndriver.findElement(By.xpath("//div[@id='react-select-5-"+option+"' and text()='"+endTime+"']")).click();
		}
	
	public void selectTriggertime(String option,String TriggerTime) throws Exception {
		applyExplicitWaitsUntilElementClickable(selectTriggerTime,20).click();
		ndriver.findElement(By.xpath("//div[@id='react-select-6-"+option+"' and text()='"+TriggerTime+"']")).click();
		
		}
//	
	public void selectemail(io.cucumber.datatable.DataTable dataTable) throws Exception {
		applyExplicitWaitsUntilElementClickable(email,30).click();
		Thread.sleep(2000);
		List<List<String>>	data= dataTable.asLists(String.class);
		ndriver.findElement(By.xpath("//div[@class='user-suggestion-contaner']/ul/li[text()='"+data.get(0).get(0)+"']")).click();
		applyExplicitWaitsUntilElementClickable(email,30).click();
//		Thread.sleep(2000);
		ndriver.findElement(By.xpath("//div[@class='user-suggestion-contaner']/ul/li[text()='"+data.get(0).get(1)+"']")).click();
		
		}
	
	public void selectfrequency(String option,String freq) throws Exception {
		applyExplicitWaitsUntilElementClickable(deliveryFreq,30).click();
		ndriver.findElement(By.xpath("//*[@id='react-select-7-"+option+"' and text()='"+freq+"']")).click();
		
		}
	public void selectStartDay(String option,String dayname) throws Exception {
		String javascript = "window.scrollBy(0,400)";
		JavascriptExecutor jsExecutor = (JavascriptExecutor) ndriver;
	    jsExecutor.executeScript(javascript);
		applyExplicitWaitsUntilElementClickable(startDay,50).click();
		Thread.sleep(2000);
		ndriver.findElement(By.xpath("//div[@id='react-select-8-"+option+"' and text()='"+dayname+"']")).click();
		
//		String javascript = "arguments[0].click()";
//	    JavascriptExecutor jsExecutor = (JavascriptExecutor) ndriver;
//	    jsExecutor.executeScript(javascript, startDay);
//	    jsExecutor. executeScript(javascript, ndriver.findElement(By.xpath("//div[@id='react-select-8-"+option+"' and text()='"+dayname+"']")));
		}
	
	public void clickOnSaveConfigbtn() throws Exception {
		applyExplicitWaitsUntilElementClickable(saveconfigBtn,30).click();
	//	Thread.sleep(300000); //5 min//
		
		}
	
	public Boolean verifyUserIsOnReportListPage() {
		Boolean avaliable =wait.until(ExpectedConditions.visibilityOf(ReportList)).isDisplayed();
		System.out.println("user is navigated to report list page");
		return avaliable;
		
	}
	
	
	public void searchTheCreatedReportName(String createdreportName) throws Exception
	{
		applyExplicitWaitsUntilElementClickable(searchReportnameFiled,30).click();
		applyExplicitWaitsUntilElementClickable(searchReportnameFiled,30).sendKeys(createdreportName,Keys.ENTER);
//		String createdReportName =displayedReportName.getText();
//		return createdReportName;
		
	}
	
	public boolean verifySearchReportnameIsDisplayed()
	{
		wait.until(ExpectedConditions.visibilityOf(displayedReportName));
		boolean ReportCreated =displayedReportName.isDisplayed();
		return ReportCreated ;
	}
	public String VerifyTheNameOfCreatedReport()
	{
		String createdReportName=displayedReportName.getText();
		return createdReportName;
	}
	public void clickOnReportMenuAndList() throws Exception
	{
		applyExplicitWaitsUntilElementClickable(reportMenu,30).click();
		applyExplicitWaitsUntilElementClickable(Listbtn,30).click();
		
		
	}
	
	public void clickOnCheckBox(String reportName)
	{
//		String web = "//div[normalize-space()='"+reportname+"' and @class='configured-reports-table-cell']//ancestor::div[@class='rt-tr -odd']//span[@class='checkmark']";
		
		ndriver.findElement(By.xpath("//div[normalize-space()='"+reportName1+"' and @class='configured-reports-table-cell']//ancestor::div[@class='rt-tr -odd']//span[@class='checkmark']")).click();
	}
	
	public void clickOnEditBtn() throws Exception
	{
		Thread.sleep(3000);
		applyExplicitWaitsUntilElementClickable(EditCheckbox,30).click();
		
	}
	
	public void updateReportName(String updateReportName) throws Exception
	{
		//applyExplicitWaitsUntilElementClickable(ReportNameField,30).clear();
		applyExplicitWaitsUntilElementClickable(ReportNameField,30).sendKeys(""); // Focus on the textbox

	        // Select all text in the textbox
		ReportNameField.sendKeys(Keys.chord(Keys.CONTROL, "a"));

	        // Send backspace to delete the text
		ReportNameField.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		applyExplicitWaitsUntilElementClickable(ReportNameField,30).sendKeys(updateReportName);;
	}
	
	public void clickOnUpdateConfigBtn() throws Exception
	{
		try {
		applyExplicitWaitsUntilElementClickable(updateonfigBtn,30).click();
		}
		catch(Exception e) {
			js.click(updateonfigBtn);
		}
	}
	
	public void searchTheUpdatedReportName(String updatedreportName) throws Exception
	{
		applyExplicitWaitsUntilElementClickable(searchReportnameFiled,30).click();
		applyExplicitWaitsUntilElementClickable(searchReportnameFiled,30).sendKeys(updatedreportName,Keys.ENTER);
//		String createdReportName =displayedReportName.getText();
//		return createdReportName;
	}
	
	public String updatedReportnameIsDisplayed() throws MalformedURLException
	{
		String updatedName =applyExplicitWaitsUntilElementClickable(displayedReportName,30).getText();
		return updatedName;
	}
	
	public void selectReportType(String option,String typeOfReport) throws Exception
	{
		applyExplicitWaitsUntilElementClickable(ReportType,30).click();
		ndriver.findElement(By.xpath("//div[@id='react-select-16-"+option+"' and text()='"+typeOfReport+"']")).click();
		
	}
	
	public void selectDateAndTime() throws Exception
	{
		applyExplicitWaitsUntilElementClickable(selectDateAndTime,30).click();
		Thread.sleep(2000);
		ndriver.findElement(By.xpath("//table[@class='CalendarMonth_table CalendarMonth_table_1']"
				+ "/tbody//tr/td[@aria-label='Selected as start date. Sunday, June 9, 2024']")).click();
		ndriver.findElement(By.xpath("//table[@class='CalendarMonth_table CalendarMonth_table_1']"
				+ "/tbody//tr/td[@aria-label='Selected as end date. Monday, June 17, 2024']")).click();
	}
	
	public void clickOnApplyBtn() throws Exception
	{
		applyExplicitWaitsUntilElementClickable(ApplyBtn,30).click();
	}
	
	public void clickOnXlxsFormat() throws Exception
	{

		applyExplicitWaitsUntilElementClickable(Excelformat,30).click();
	}
	
	public void clickOnDownloadReport() throws Exception
	{
		applyExplicitWaitsUntilElementClickable(downloadReportBtn,30).click();
	}
	
	public void verifyCSVReportAvaliableInFolder(String folderName,String reportNameWithExtension)
	{
/*	String path= System.getProperty("user.dir");
 File filexlsx = new File(path+"\\"+foldername+"\\"+reportNamewithextension);
	Assert.assertTrue(file.exists(), "File not downloaded successfully");
*/		

		
		//		String path ="C:\\Users\\LENOVO\\git\\repository2\\Eco_PVT_LTD\\downlodedReports"

				//			File fileCSV = new File(path+"smartsense.csv");
//			Assert.assertTrue(file.exists(), "File not downloaded successfully");
	}
	
	
	
	public void clickOncsvFormat() throws Exception
	{
		applyExplicitWaitsUntilElementClickable(csvFileformat,30).click();
	}
	
	
	public void clickOnXlxFormat() throws Exception
	{
		applyExplicitWaitsUntilElementClickable(xlsFileFormat,30).click();
	}
	
	public void clickOnEmailBtn() throws Exception
	{
		applyExplicitWaitsUntilElementClickable(emailBtn,30).click();
		Thread.sleep(1000);
		ndriver.switchTo().alert().accept();
	}
	
	public void clickOnDeleteBtn() throws Exception
	{
		applyExplicitWaitsUntilElementClickable(deleteBtn,30).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



}

