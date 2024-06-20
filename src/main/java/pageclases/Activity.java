//package pageclases;
//
//import java.io.File;
//import java.net.MalformedURLException;
//import java.time.Duration;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import com.eco.base.BaseClass;
//import com.eco.base.JavaScriptOperation;
//
//public class Activity extends BaseClass {
//
//	WebDriver ndriver;
//	WebDriverWait wait;
//	JavaScriptOperation js;
//
//	public Activity(WebDriver odriver) {
//		this.ndriver = odriver;
//		PageFactory.initElements(ndriver, this);
//		wait = new WebDriverWait(ndriver, Duration.ofSeconds(30));
//		js=new JavaScriptOperation(ndriver);
//		
//	}
//	
//	
//
//	@FindBy(xpath = "//img[@src='/app/assets/images/activity.svg']")
//	private WebElement activityMenu;
//	
//	@FindBy(xpath="//*[text()='Add New Activity']")
//	private WebElement addNewActivityButton;
//	
//	@FindBy(xpath="//div[contains(@class,'MuiInputBase-root')]/input")
//    private WebElement activityName;
//	
//	@FindBy(name="event_type")
//	private WebElement activityType;
//	
//	@FindBy(xpath="//input[@name='user_search']")
//	private WebElement senserName;
//	
//	@FindBy(xpath="(//div[contains(@class,'selectionbox_prefix__indicator ')])[1]")
//	private WebElement standardName;
//	
//	@FindBy(xpath="//select[@name='item_name']")
//	private WebElement itemName;
//	
//	@FindBy(xpath="(//div[contains(@class,'css-16pqwjk-indicatorContainer selectionbox_prefix__indicator selectionbox_prefix__dropdown-indicator')])[2]")
//	private WebElement actionTaken;
//	
//	@FindBy(xpath="//input[@name='observation_result']")
//	private WebElement observationResult;
//	
//	@FindBy(xpath="//textarea[@class='form-control rounded-0']")
//	private WebElement description;
//	
//	@FindBy(xpath="(//label[@class='label-text']/span[text()='Date of Activity Planned*']//following::div[@class='actiondatepicker'])[1]")
//	private WebElement dateOfActivityPlanned;
//	
//	@FindBy(xpath="(//label[@class='label-text']/span[text()='Date of Activity Executed*']//following::div[@class='actiondatepicker'])[1]")
//	private WebElement dateOfActivityExecuted;
//	
//	@FindBy(xpath="//button[text()='Create Activity']")
//	private WebElement createActivityButton;
//	
//	@FindBy(xpath="//button[text()='Logs']")
//	private WebElement logsbutton;
//	
//	@FindBy(xpath="(//div[@class='rt-tbody']/div[1]//div[@class='rt-td']/div)[1]")
//	private WebElement activityonLogPage;
//	
//	@FindBy(xpath="//button[text()='Update Activity']")
//	private WebElement updateActivityButton;
//	
//	@FindBy(xpath="//button[text()='Summary']")
//	private WebElement summaryButton;
//	
//	@FindBy(xpath="//p[@class='download-text']//img[@class='icon-img dark-img']")
//	private WebElement downloadbutton;
//
//	public void clickOnActivityMenu() {
//		wait.until(ExpectedConditions.visibilityOf(activityMenu));
//		activityMenu.click();
//	}
//	
//	public void clickOnAddNewActivity() {
//		wait.until(ExpectedConditions.visibilityOf(addNewActivityButton));
//		addNewActivityButton.click();
//	}
//	
//	public void enterActivityName(String actName) {
//		wait.until(ExpectedConditions.visibilityOf(activityName));
//		activityName.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
//        JavascriptExecutor jse = ((JavascriptExecutor)ndriver);
//		jse. executeScript("arguments[0]. value='"+actName+"';", activityName);
//	}
//	
//	public void selectActivityType(String actType) {
//		Select selectActivityType=new Select(activityType);
//		selectActivityType.selectByValue(actType);
//	}
//	
//	public void selectSensorName(String senName) {
//		senserName.click();
//		//ndriver.findElement(By.xpath("//div[@class='user-search-suggestion']//ul/li[text()='QA12']")).click();
//		try {
//			Thread.sleep(5000);
//		} catch (Exception e) {
//
//		}
//		ndriver.findElement(By.xpath("//div[@class='user-search-suggestion']//ul/li[text()='"+ senName + "']")).click();
//	}
//	
//	public void selectStandardName(String stanName) {
//		standardName.click();
//		ndriver.findElement(By.xpath("//div[contains(@class,'css-11unzgr selectionbox_prefix__menu-list')]/div[text()='"+stanName +"']")).click();
//	}
//	
//	public void selectItemName(String itemNameValue) {
//	    Select selectItemName=new Select(itemName);
//	    selectItemName.selectByVisibleText(itemNameValue);
//	}
//	
//	public void selectActionTaken(String actionTakenValue) {
//		actionTaken.click();
//		try {
//			Thread.sleep(5000);
//		} catch (Exception e) {
//
//		}
//	    WebElement selectActionTaken=ndriver.findElement(By.xpath("//div[contains(@class,'css-11unzgr selectionbox_prefix__menu-list')]/div[text()='"+actionTakenValue +"']"));
//	    String javascript1 = "arguments[0]. click()";
//	    JavascriptExecutor jsExecutor1 = (JavascriptExecutor) ndriver;
//	    jsExecutor1. executeScript(javascript1, selectActionTaken);
//	}
//	
//	public void enterObservationResult(String obserValue) {
//		observationResult.sendKeys(obserValue);
//	}
//	
//	public void enterDescription(String descriptionText) {
//		description.sendKeys(descriptionText);
//	}
//	
//	public void selectDateOfActivityPlanned(String sdate) {
//		dateOfActivityPlanned.click();
//		try {
//			Thread.sleep(5000);
//		} catch (Exception e) {
//
//		}
//	    ndriver.findElement(By.xpath("(//td[contains(@class,'CalendarDay') and text()='"+sdate+"'])[2]")).click();
//	    ndriver.findElement(By.xpath("//button[text()='Apply']")).click();
//	}
//	
//	public void selectDateOfActivityExecuted(String sdate) {
//		dateOfActivityExecuted.click();
//		try {
//			Thread.sleep(5000);
//		} catch (Exception e) {
//
//		}
//	    ndriver.findElement(By.xpath("(//td[contains(@class,'CalendarDay') and text()='"+sdate+"'])[2]")).click();
//	    ndriver.findElement(By.xpath("//button[text()='Apply']")).click();
//	}
//	
//	public void clickOnCreateActivity() {
//		try {
//			Thread.sleep(5000);
//		} catch (Exception e) {
//
//		}
//	    String javascript = "arguments[0].click()";
//	    JavascriptExecutor jsExecutor = (JavascriptExecutor) ndriver;
//	    jsExecutor. executeScript(javascript, createActivityButton);
//	    //activityName.sendKeys("7");;
//	    //jsExecutor. executeScript(javascript, createActivityButton);
//	    
//	    //createActivityButton.click();
//	}
//	
//	public void clickOnLogsButton() {
//		wait.until(ExpectedConditions.visibilityOf(logsbutton));
//		logsbutton.click();
//	}
//	
//	public void clickOnActivityCreated() {
//		wait.until(ExpectedConditions.visibilityOf(activityonLogPage));
//		activityonLogPage.click();
//	}
//	
//	public void editActivityName(String updateactName) {
//		activityName.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
//		//wait.until(ExpectedConditions.visibilityOf(activityName));
//		activityName.sendKeys(updateactName);
//		//JavascriptExecutor jse = ((JavascriptExecutor)ndriver);
//		//jse. executeScript("arguments[0]. value='"+updateactName+"';", activityName);
//	}
//	
//	public void clickOnUpdateActivityButton() {
//	    String javascript = "arguments[0].click()";
//	    JavascriptExecutor jsExecutor = (JavascriptExecutor) ndriver;
//	    jsExecutor. executeScript(javascript, updateActivityButton);
//	}
//	
//	public void clickOnUpdatedActivityOnLogPage() {
//		wait.until(ExpectedConditions.visibilityOf(activityonLogPage));
//		activityonLogPage.click();
//	}
//	
//	public String verifyActivityNameUpdateOnLogPage() {
//		wait.until(ExpectedConditions.visibilityOf(activityName));
//		return activityName.getAttribute("value");
//	}
//	
//	public void clickOnSummaryButton() {
//		wait.until(ExpectedConditions.visibilityOf(summaryButton));
//		summaryButton.click();
//	}
//	
//	public void clickOnDownloadButton() {
//		wait.until(ExpectedConditions.visibilityOf(downloadbutton));
//		downloadbutton.click();
//	}
//////////////////////////////////////////////////////////////////////////////////////////////////
//
//<<<<<<< HEAD
//	List<List<String>>	data= dataTable.asLists(String.class);
//	System.out.println(data.size());
//	System.out.println(data.get(0).size());
//	
//	for(int i = 0;i<data.get(0).size();i++) {
//		String t = data.get(0).get(i);
//		ndriver.findElement(By.xpath("//div[@class='user-suggestion-contaner']/ul/li[text()='"+t +"']")).click();
//		applyExplicitWaitsUntilElementClickable(sensors,30).click();
//	//	ndriver.findElement(By.xpath("//div[@class='user-suggestion-contaner']/ul/li[text()='"+ data.get(0).get(1)+"']")).click();
//	}
//	
//	}
//	
//	public void selectParameters(io.cucumber.datatable.DataTable dataTable) throws Exception {
//		applyExplicitWaitsUntilElementClickable(parameters,30).click();
//		List<List<String>>	data= dataTable.asLists(String.class);
//		System.out.println(data.size());
//		System.out.println(data.get(0).size());
//		ndriver.findElement(By.xpath("//*[@class='user-suggestion-contaner']/ul/li[text()='"+data.get(0).get(0)+"']")).click();
//		applyExplicitWaitsUntilElementClickable(parameters,30).click();
//		ndriver.findElement(By.xpath("//*[@class='user-suggestion-contaner']/ul/li[text()='"+data.get(0).get(1)+"']")).click();		
//	}
//	
//	public void selectTheGrinTime(String option,String time) throws  Exception {
//		String javascript = "window.scrollBy(0,500)";
//		JavascriptExecutor jsExecutor = (JavascriptExecutor) ndriver;
//	    jsExecutor.executeScript(javascript);
//		
//		applyExplicitWaitsUntilElementClickable(grain,40).click();
////		Thread.sleep(3000);
//		ndriver.findElement(By.xpath("//div[@id='react-select-3-"+option+"' and text()='"+time+"']")).click();
//	}
//	
//	public void selectStarttime(String option,String StartTime) throws Exception {
//		applyExplicitWaitsUntilElementClickable(selectStartTime,40).click();
//		ndriver.findElement(By.xpath("//div[@id='react-select-4-"+option+"' and text()='"+StartTime+"']")).click();
//		
//		}
//	
//	public void selectEndttime(String option,String endTime) throws Exception {
//		applyExplicitWaitsUntilElementClickable(selectEndTime,20).click();
//		ndriver.findElement(By.xpath("//div[@id='react-select-5-"+option+"' and text()='"+endTime+"']")).click();
//		}
//	
//	public void selectTriggertime(String option,String TriggerTime) throws Exception {
//		applyExplicitWaitsUntilElementClickable(selectTriggerTime,20).click();
//		ndriver.findElement(By.xpath("//div[@id='react-select-6-"+option+"' and text()='"+TriggerTime+"']")).click();
//		
//		}
////	
//	public void selectemail(io.cucumber.datatable.DataTable dataTable) throws Exception {
//		applyExplicitWaitsUntilElementClickable(email,30).click();
//		Thread.sleep(2000);
//		List<List<String>>	data= dataTable.asLists(String.class);
//		ndriver.findElement(By.xpath("//div[@class='user-suggestion-contaner']/ul/li[text()='"+data.get(0).get(0)+"']")).click();
//		applyExplicitWaitsUntilElementClickable(email,30).click();
////		Thread.sleep(2000);
//		ndriver.findElement(By.xpath("//div[@class='user-suggestion-contaner']/ul/li[text()='"+data.get(0).get(1)+"']")).click();
//		
//		}
//	
//	public void selectfrequency(String option,String freq) throws Exception {
//		applyExplicitWaitsUntilElementClickable(deliveryFreq,30).click();
//		ndriver.findElement(By.xpath("//*[@id='react-select-7-"+option+"' and text()='"+freq+"']")).click();
//		
//		}
//	public void selectStartDay(String option,String dayname) throws Exception {
//		String javascript = "window.scrollBy(0,400)";
//		JavascriptExecutor jsExecutor = (JavascriptExecutor) ndriver;
//	    jsExecutor.executeScript(javascript);
//		applyExplicitWaitsUntilElementClickable(startDay,50).click();
//		Thread.sleep(2000);
//		ndriver.findElement(By.xpath("//div[@id='react-select-8-"+option+"' and text()='"+dayname+"']")).click();
//		
////		String javascript = "arguments[0].click()";
////	    JavascriptExecutor jsExecutor = (JavascriptExecutor) ndriver;
////	    jsExecutor.executeScript(javascript, startDay);
////	    jsExecutor. executeScript(javascript, ndriver.findElement(By.xpath("//div[@id='react-select-8-"+option+"' and text()='"+dayname+"']")));
//		}
//	
//	public void clickOnSaveConfigbtn() throws Exception {
//		applyExplicitWaitsUntilElementClickable(saveConfigBtn,30).click();
//
//		Thread.sleep(120000); //2 min
//
//
//
//		
//		}
//	
//	public Boolean verifyUserIsOnReportListPage() {
//		Boolean avaliable =wait.until(ExpectedConditions.visibilityOf(reportList)).isDisplayed();
//		System.out.println("user is navigated to report list page");
//		return avaliable;
//		
//	}
//	
//	
//	public void searchTheCreatedReportName(String createdReportName) throws Exception
//	{
//		wait.until(ExpectedConditions.visibilityOf(searchReportNameFiled)).isDisplayed();
//		applyExplicitWaitsUntilElementClickable(searchReportNameFiled,30).click();
//		applyExplicitWaitsUntilElementClickable(searchReportNameFiled,30).clear();
//		applyExplicitWaitsUntilElementClickable(searchReportNameFiled,30).sendKeys(createdReportName,Keys.ENTER);
//		
//	}
//	
//	public boolean verifySearchReportnameIsDisplayed() throws Exception
//	{
//		Thread.sleep(2000);
//		wait.until(ExpectedConditions.visibilityOf(displayedReportName));
//		boolean ReportCreated =displayedReportName.isDisplayed();
//		return ReportCreated ;
//	}
//	public String VerifyTheNameOfCreatedReport()
//	{
//		String createdReportName=displayedReportName.getText();
//		return createdReportName;
//	}
//	public void clickOnReportMenuAndList() throws Exception
//	{
//		applyExplicitWaitsUntilElementClickable(reportMenu,30).click();
//		applyExplicitWaitsUntilElementClickable(listBtn,30).click();
//		
//		
//	}
//	
//	public void clickOnCheckBox(String reportName) throws Exception
//	{
////		String web = "//div[normalize-space()='"+reportname+"' and @class='configured-reports-table-cell']//ancestor::div[@class='rt-tr -odd']//span[@class='checkmark']";
//		reportName1=reportName;
//		ndriver.findElement(By.xpath("//div[normalize-space()='"+reportName1+"' and @class='configured-reports-table-cell']//ancestor::div[@class='rt-tr -odd']//span[@class='checkmark']")).click();
//	}
//	
//	public void clickOnEditBtn() throws Exception
//	{
//		Thread.sleep(3000);
//		applyExplicitWaitsUntilElementClickable(editBtn,30).click();
//		
//	}
//	
//	public void updateReportName(String updateReportName) throws Exception
//	{
//		//applyExplicitWaitsUntilElementClickable(ReportNameField,30).clear();
//		applyExplicitWaitsUntilElementClickable(reportNameField,30).sendKeys(""); // Focus on the textbox
//
//	        // Select all text in the textbox
//		reportNameField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
//
//	        // Send backspace to delete the text
//		reportNameField.sendKeys(Keys.BACK_SPACE);
//		Thread.sleep(2000);
//		applyExplicitWaitsUntilElementClickable(reportNameField,30).sendKeys(updateReportName);;
//	}
//	
//	public void clickOnUpdateConfigBtn() throws Exception
//	{
//		try {
//		applyExplicitWaitsUntilElementClickable(updateConfigBtn,30).click();
//		}
//		catch(Exception e) {
//			js.click(updateConfigBtn);
//		}
//	}
//	
//	public void searchTheUpdatedReportName(String updatedReportName) throws Exception
//	{
//		applyExplicitWaitsUntilElementClickable(searchReportNameFiled,30).click();
//		applyExplicitWaitsUntilElementClickable(searchReportNameFiled,30).sendKeys(updatedReportName,Keys.ENTER);
////		String createdReportName =displayedReportName.getText();
////		return createdReportName;
//	}
//	
//	public String updatedReportnameIsDisplayed() throws MalformedURLException
//	{
//		String updatedName =applyExplicitWaitsUntilElementClickable(displayedReportName,30).getText();
//		return updatedName;
//	}
//	
//	public void selectReportType(String option,String typeOfReport) throws Exception
//	{
//
////		applyExplicitWaitsUntilElementClickable(reportType,30).click();
////		ndriver.findElement(By.xpath("//div[@id='react-select-16-"+option+"' and text()='"+typeOfReport+"']")).click();
//
//		applyExplicitWaitsUntilElementClickable(reportType,30).click();
//		Thread.sleep(2000);
//		ndriver.findElement(By.xpath("//*[normalize-space()='"+typeOfReport+"']")).click();
//		
//	}
//	
//	public void selectDateAndTime() throws Exception
//	{
//
////		Actions action = new Actions(ndriver);
////		applyExplicitWaitsUntilElementClickable(selectDateAndTime,30).click();
//////		Thread.sleep(2000);
////		WebElement firstDate=ndriver.findElement(By.xpath("//table[@class='CalendarMonth_table CalendarMonth_table_1']/tbody//tr/td[text()='10' and  @aria-label='Selected as start date. Monday, June 10, 2024']"));
////		action.moveToElement(firstDate).click().perform();
////		Thread.sleep(1000);
////		WebElement secondate	=ndriver.findElement(By.xpath("//table[@class='CalendarMonth_table CalendarMonth_table_1']/tbody//tr/td[text()='17' and  @aria-label='Choose Monday, June 17, 2024 as your check-out date. It’s available.']"));
////		action.moveToElement(secondate).click().perform();	
////		}
//		
//		applyExplicitWaitsUntilElementClickable(selectDateAndTime,30).click();
//		Thread.sleep(2000);
//		for(int i=0;i<dateOptions.size();i++) {
//			WebElement dateOption = dateOptions.get(i);
//			boolean isdateAbleToSelect=dateOption.isEnabled();
//			dateOption.click();
//			Thread.sleep(1000);
//			String classtext = dateOption.getAttribute("class");
//			if(isdateAbleToSelect && classtext.contains("active")) {
//				
//			}
//			else {
//				System.err.println(dateOption.getText());
//				System.out.println(dateOption.getAttribute("class"));
//				
//				
//			}
//		}
//		applyExplicitWaitsUntilElementClickable(dateOption_7Days,30).click();
//		
//	}
//
//	
//	public void clickOnApplyBtn() throws Exception
//	{
//		applyExplicitWaitsUntilElementClickable(applyBtn,30).click();
//	}
//	
//	public void clickOnXlxsFormat() throws Exception
//	{
//
//		applyExplicitWaitsUntilElementClickable(excelFormat,30).click();
//	}
//	
//	public void clickOnDownloadReport() throws Exception
//	{
//		try {
//		applyExplicitWaitsUntilElementClickable(downloadReportBtn,30).click();
//		}
//		catch(Exception r) {
//			js.click(downloadReportBtn);
//		}
//	}
//	
//	public void verifyCSVReportAvaliableInFolder(String folderName,String reportNameWithExtension)
//	{
///*	String path= System.getProperty("user.dir");
// File filexlsx = new File(path+"\\"+foldername+"\\"+reportNamewithextension);
//	Assert.assertTrue(file.exists(), "File not downloaded successfully");
//*/		
//
//		
//		//		String path ="C:\\Users\\LENOVO\\git\\repository2\\Eco_PVT_LTD\\downlodedReports"
//
//				//			File fileCSV = new File(path+"smartsense.csv");
////			Assert.assertTrue(file.exists(), "File not downloaded successfully");
//	}
//	
//	
//	
//	public void clickOncsvFormat() throws Exception
//	{
//		try {
//		applyExplicitWaitsUntilElementClickable(csvFileFormat,30).click();
//		}
//		catch(Exception r) {
//			js.click(csvFileFormat);
//		}
//
//			
//	}
//	
//	
//	public void clickOnXlxFormat() throws Exception
//	{
//		try {
//			applyExplicitWaitsUntilElementClickable(xlsFileFormat,30).click();
//			}
//			catch(Exception r) {
//				js.click(xlsFileFormat);
//			}
//	}
//	
//	public void clickOnEmailBtn() throws Exception
//	{
//		applyExplicitWaitsUntilElementClickable(emailBtn,30).click();
//		Thread.sleep(1000);
////		ndriver.switchTo().alert().accept();
//	}
//	
//	public void clickOnDeleteBtn() throws Exception
//	{
//		applyExplicitWaitsUntilElementClickable(deleteBtn,30).click();
////		ndriver.switchTo().alert().accept();
//		applyExplicitWaitsUntilElementClickable(okButton, 30).click();
//		
//	}
//
//	public void checkIfFileIsDownloaded(String reportNameWithExtension) throws Exception {
//		String basePath = System.getProperty("user.dir");
//		String path =basePath+"\\downloadfiles";	
//		// C:\Users\Admin\git\Eco\Eco_PVT\download
//		System.out.println(path);
//		Thread.sleep(4000);
//		boolean a = isFileDownloaded(path,reportNameWithExtension);
//		if(!a) {
//			System.err.println("File not downloaded");
//		}
//		else {
//			System.out.println(reportNameWithExtension+" File downloaded");
//		}
//		
//	}
//	
//	public static boolean isFileDownloaded(String downloadDir, String fileName) {
//        File file = new File(downloadDir + File.separator + fileName);
//      String f=  file.getAbsolutePath();
//      System.out.println(f);
//        return file.exists();
//    }
//
//	public void checkSuccessMessageForSendEmail() throws MalformedURLException {
//		
//		
//		String expectedMessage = "";
//		try {
//			applyExplicitWaitsUntilElementClickable(sendEmail,30).click();
//			}
//			catch(Exception r) {
//				js.click(sendEmail);
//			}
//		applyExplicitWaitsUntilElementClickable(successMessage, 30);
//		boolean isMessagedisplayed = isWebElementDisplayed(successMessage);
//		String actualMessage = successMessage.getText();
//		System.out.println(actualMessage);
//		applyExplicitWaitsUntilElementClickable(okButton, 30).click();
//		
//		
//	}
//	
//	public void clickOnExportBtnAndHandlegeneratedPopup() throws Exception
//	{
//			applyExplicitWaitsUntilElementClickable(exportBtn,30).click();
//			ndriver.switchTo().alert().dismiss();
//			applyExplicitWaitsUntilElementClickable(exportBtn,30).click();
//			applyExplicitWaitsUntilElementClickable(inPOpUpsendEmailBtn,30).click();
//			applyExplicitWaitsUntilElementClickable(okButton, 30).click();
//			
//		
//	}
//	
//	
//	public boolean checkNotAvaliableIsDisplay()
//	{
//		boolean display =isWebElementDisplayed(noDataAvaliable);
//		return display;
//	}
//	
//=======
//>>>>>>> 4803e840bfedb007d852c9c2c9e49d68865d1ada
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//
//
//
//}
//
