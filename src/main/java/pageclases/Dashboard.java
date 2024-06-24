package pageclases;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.eco.base.BaseClass;
import com.eco.base.JavaScriptOperation;

//import com.eco.base.BaseClass;
//import com.eco.base.JavaScriptOperation;

public class Dashboard extends BaseClass {
	WebDriver ndriver;
	WebDriverWait wait;
	JavaScriptOperation js;
	Select sel;
	JavascriptExecutor jse;
	Actions acn;
	public Dashboard(WebDriver odriver) {
		this.ndriver = odriver;
		PageFactory.initElements(ndriver, this);
		wait = new WebDriverWait(ndriver, Duration.ofSeconds(30));
		js=new JavaScriptOperation(ndriver);

	}

	@FindBy(xpath="//p[@class='active' and text()='Operational Excellence']")
	private WebElement operationalExcellence;

	@FindBy(xpath="//button[@class='add-wrap _add-wrap']")
	private WebElement addDashBoard ;

	@FindBy(xpath="//input[@id='dashboard-name']")
	private WebElement enterNameFiled ;

	@FindBy(xpath="//button[normalize-space()='Create']")
	private WebElement createBtn ;

	@FindBy(xpath="//div[@class='Toastify__toast Toastify__toast--success successToast notification']")
	private WebElement createNotificatn ;

	@FindBy(xpath="//div[@class='dashboard-list-litem _active']")
	private WebElement ellipsisVerticalIcon ;

	@FindBy(xpath="//i[@class='fas fa-ellipsis-v']")
	private WebElement VerticalIcon ;

	//	@FindBy(xpath="(//button[@class='menu-item'])[1]")
	//	private WebElement addWidgetMenu ;

	@FindBy(xpath="//button[normalize-space()='Add Widget']")
	private WebElement addWidget ;

	@FindBy(xpath="//button[normalize-space()='+ Add New Widget']")
	private WebElement addNewWidget ;

	@FindBy(xpath="//i[@class='fas fa-chart-pie']")
	private WebElement piechartWidgetApp ;

	@FindBy(xpath="//button[normalize-space()='Add']")
	private WebElement addBtn ;

	@FindBy(xpath="//input[@placeholder='Enter Widget Name']")
	private WebElement widgetNameField ;

	@FindBy(xpath="//textarea[@name='widget_description']")
	private WebElement widgetDescription ;

	@FindBy(xpath="//input[@name='from']")
	private WebElement fromField ;

	@FindBy(xpath="//input[@class='form-control-sm form-control']")
	private WebElement alias ;

	@FindBy(xpath="(//div[@class='css-o3h76h-control selectionbox_prefix__control'])[1]")
	private WebElement location;

	@FindBy(xpath="(//div[@class='css-1pcexqc-container selectionbox'])[2]")
	private WebElement parameter ;

	@FindBy(xpath="//input[@type='color']")
	private WebElement color ;

	@FindBy(xpath="//div[@class='d-flex flex-column color-pallette']//div[1]//div[3]")
	private WebElement selectColor;

	@FindBy(xpath="//span[normalize-space()='Refresh Preview']")
	private WebElement refreshPreview ;

	@FindBy(xpath="//*[name()='g' and contains(@class,'recharts-l')]")
	private WebElement widgetDisplay ;

	@FindBy(xpath="//span[@class='recharts-legend-item-text']")
	private WebElement aliasText ; 

    @FindBy(xpath="//a[@class='trigger level-0']")
	private WebElement appEllipsisVerticalIcon ; 

	@FindBy(xpath="(//div[contains(text(),'Action')])[1]")
	private WebElement  action;

	@FindBy(xpath="(//a[@class='trigger level-0'])[2]")
	private WebElement  copyPieAction;

	@FindBy(xpath="(//a[normalize-space()='Clone'])[1]")
	private WebElement clone ;

	@FindBy(xpath="(//a[@class='trigger level-0'])[2]")
	private WebElement copiedEllipsisVerticalIcon ; 

	@FindBy(xpath="//div[text()=' Pie Chart - Copy']")
	private WebElement piechartCopyText ;

	@FindBy(xpath="(//a[@class='dropdown-item' and text()='Delete'])[2]")
	private WebElement  deleteCopyPie;

	@FindBy(xpath="//button[text()='Ok']")
	private WebElement okBtn ;

	@FindBy(xpath="//div[@class='dropdown-menu level-1 _show']/a[text()='TV Mode']")
	private WebElement tvMode ;

	@FindBy(xpath="//div[@class='add-widget-app-name' and text()='Sensor Health']")
	private WebElement  sensorHealth;

	@FindBy(xpath="//span[text()='Pie Chart']")
	private WebElement piechartname  ;

	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement plusIcon  ;

	@FindBy(xpath="//button[normalize-space()='Edit Dashboard']")
	private WebElement editDashboard  ;

	@FindBy(xpath="//div[contains(text(),'Anomaly Detection')]")
	private WebElement anomallyDetectionApp  ;

	@FindBy(xpath="//select[@placeholder='Enter Period']")
	private WebElement period ;

	@FindBy(xpath="//select[@placeholder='Data Frequency']")
	private WebElement  dataFrequency ;

	@FindBy(xpath="(//input[@class='form-control'])[3]")
	private WebElement  threshouldPercent ;

	@FindBy(xpath="(//input[@class='form-control'])[4]")
	private WebElement trainingWeek  ;

	@FindBy(xpath = "(//div[@class='css-o3h76h-control selectionbox_prefix__control'])[1]")
	private WebElement selectBox1;

	@FindBy(xpath="(//div[@class='css-o3h76h-control selectionbox_prefix__control'])[2]")
	private WebElement selectBox2;

	@FindBy(xpath="(//span[@class='checkmark'])[3]")
	private WebElement  toggleCheckBox ;

	@FindBy(xpath="//button[normalize-space()='Save changes']")
	private WebElement  saveChanges ;

	@FindBy(xpath="//button[contains(@class,'menu-item false')]")
	private WebElement   download;

	@FindBy(xpath="//button[normalize-space()='Settings']")
	private WebElement  setting ;

	@FindBy(xpath="//label[normalize-space()='Unified Date Picker']//span[contains(@class,'checkmark')]")
	private WebElement  unifiedDatePicker ;

	@FindBy(xpath="//button[normalize-space()='Update']")
	private WebElement  updateBtn ;




	boolean widgetDisplayed;
	public boolean createDashboard(String dashBoardName) throws Exception
	{
		applyExplicitWaitsUntilElementClickable(operationalExcellence,30).click();
		try {
			applyExplicitWaitsUntilElementClickable(addDashBoard,30).click();
		}
		catch(Exception e) {
			js.click(addDashBoard);
		}
		//		

		applyExplicitWaitsUntilElementClickable(enterNameFiled,30).click();
		applyExplicitWaitsUntilElementClickable(enterNameFiled,30).sendKeys(dashBoardName);
		applyExplicitWaitsUntilElementClickable(createBtn,30).click();
		Thread.sleep(2000);


		boolean messgAvaliable=	isWebElementDisplayed(createNotificatn);
		if(messgAvaliable)
		{

			System.out.println(dashBoardName+ "  dashboard is created succefully ");

		}
		else {
			System.out.println(dashBoardName+ "  dashboard is not created succefully ");
		}

		return messgAvaliable;


	}


	public boolean addWidget(String widgetName) throws Exception
	{  acn = new  Actions(ndriver);
       jse= (JavascriptExecutor)ndriver;
		if(widgetName.equalsIgnoreCase("Pie Chart"))
		{
			applyExplicitWaitsUntilElementClickable(operationalExcellence,30).click();
			applyExplicitWaitsUntilElementClickable(ellipsisVerticalIcon,30).click();
			applyExplicitWaitsUntilElementClickable(plusIcon,50).click();
			Thread.sleep(1000);


			applyExplicitWaitsUntilElementClickable(piechartWidgetApp,30).click();
			applyExplicitWaitsUntilElementClickable(addBtn,30).click();
			applyExplicitWaitsUntilElementClickable(widgetNameField,30).sendKeys(widgetName);                
			applyExplicitWaitsUntilElementClickable(widgetDescription,30).sendKeys(widgetName);

			applyExplicitWaitsUntilElementClickable(fromField,30).sendKeys("10");

			jse = (JavascriptExecutor) ndriver;
			jse.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(1000);
			applyExplicitWaitsUntilElementClickable(alias,30).click();
			applyExplicitWaitsUntilElementClickable(alias,30).sendKeys("abc");
			//		Thread.sleep(1000);
			applyExplicitWaitsUntilElementClickable(location,30).click();
			Thread.sleep(1000);
			ndriver.findElement(By.xpath("//div[@id='react-select-2-option-0-0']")).click();    //here program stop
			Thread.sleep(1000);
			applyExplicitWaitsUntilElementClickable(parameter,30).click();
			Thread.sleep(1000);
			ndriver.findElement(By.xpath("//div[@id='react-select-3-option-55']")).click();

			applyExplicitWaitsUntilElementClickable(color,30).click();
			String colorValue =selectColor.getCssValue("color");
			applyExplicitWaitsUntilElementClickable(selectColor,30).click();


			Thread.sleep(1000);

			
			acn.moveToElement(refreshPreview).click().perform();
			//		applyExplicitWaitsUntilElementClickable(refreshPreview,30).click();
			Thread.sleep(2000);
			widgetDisplayed=isWebElementDisplayed(widgetDisplay);
			if(widgetDisplayed)
			{
				if(widgetDisplay.getCssValue("color").equals(colorValue) &&  aliasText.getText().equals("abc"))
				{
					System.out.println(  "piechart  succefully display with correct colour");
				}

				else {
					System.out.println("piechart not succefully display with correct colour");
				}
			}
			applyExplicitWaitsUntilElementClickable(addWidget,30).click();
		

		}

		else if(widgetName.equalsIgnoreCase("Sensor Health"))
		{
						applyExplicitWaitsUntilElementClickable(operationalExcellence,30).click();
						applyExplicitWaitsUntilElementClickable(ellipsisVerticalIcon,30).click();
						applyExplicitWaitsUntilElementClickable(plusIcon,50).click();
						Thread.sleep(1000);

//			applyExplicitWaitsUntilElementClickable(operationalExcellence,50).click();
//			Thread.sleep(1000);
//			applyExplicitWaitsUntilElementClickable(VerticalIcon,50).click();
//			Thread.sleep(1000);
			applyExplicitWaitsUntilElementClickable(addWidget,30).click();
			applyExplicitWaitsUntilElementClickable(sensorHealth,30).click();
			applyExplicitWaitsUntilElementClickable(addBtn,30).click();


			applyExplicitWaitsUntilElementClickable(widgetNameField,30).sendKeys(widgetName);
			applyExplicitWaitsUntilElementClickable(widgetDescription,30).sendKeys(widgetName);  //get the text of sensor or copy it 



			applyExplicitWaitsUntilElementClickable(refreshPreview,30).click();
			Thread.sleep(1000);
			applyExplicitWaitsUntilElementClickable(addWidget,30).click();

		}
		else if(widgetName.equalsIgnoreCase("Anomaly Detection"))
		{
     
			applyExplicitWaitsUntilElementClickable(addNewWidget,30).click();                             
			applyExplicitWaitsUntilElementClickable(anomallyDetectionApp,30).click();                             
			applyExplicitWaitsUntilElementClickable(addBtn,30).click();                             
			applyExplicitWaitsUntilElementClickable(widgetNameField,30).sendKeys(widgetName);                        
			applyExplicitWaitsUntilElementClickable(widgetDescription,30).sendKeys(widgetName);                        

            jse = (JavascriptExecutor) ndriver;
			jse.executeScript("window.scrollBy(0,400)");
			//select the period as week	
			Select sel = new Select(period) ; 
			sel.selectByVisibleText("Week");

			//select freq = 60 min
			sel = new Select(dataFrequency) ; 
			sel.selectByVisibleText("60 min");

			applyExplicitWaitsUntilElementClickable(threshouldPercent,30).click();                             //enter threshould
			applyExplicitWaitsUntilElementClickable(threshouldPercent,30).sendKeys("50");                           //50


			applyExplicitWaitsUntilElementClickable(trainingWeek,30).click();                             //trainigWeek
			applyExplicitWaitsUntilElementClickable(trainingWeek,30).sendKeys("2");                            //2

			jse.executeScript("window.scrollBy(0,1000)");
			//select qa12	
			applyExplicitWaitsUntilElementClickable(selectBox1,30).click(); 
			//here  we apply loop to select qa2...option-2....last no...3.4.5
			Thread.sleep(2000);
            ndriver.findElement(By.xpath("//div[@id='react-select-2-option-2']")).click();            

			// //select kVA	
			applyExplicitWaitsUntilElementClickable(selectBox2,30).click(); 
			Thread.sleep(2000);
             ndriver.findElement(By.xpath("//div[text()='KVA']")).click();  


			applyExplicitWaitsUntilElementClickable(toggleCheckBox,30).click();                       //togglebtn click
            acn.moveToElement(refreshPreview).perform();
			applyExplicitWaitsUntilElementClickable(refreshPreview,30).click();
			Thread.sleep(1000);


			applyExplicitWaitsUntilElementClickable(addWidget,30).click();
		}

		return widgetDisplayed;

	}



	public void cloneTheWidgetAndDeleteClone() throws Exception
	{ jse= (JavascriptExecutor)ndriver;
		applyExplicitWaitsUntilElementClickable(appEllipsisVerticalIcon,30).click();
	
		applyExplicitWaitsUntilElementClickable(action,30).click();
		Thread.sleep(1000);

		applyExplicitWaitsUntilElementClickable(clone,30).click();
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,1000)");
//		acn.moveToElement(piechartCopyText).perform();
//		Thread.sleep(1000);
		boolean s = isWebElementDisplayed(piechartCopyText);
		if(s)
		{
			System.out.println("widget clone succefully");
		}
		else {
			System.out.println("widget not clone succefully");

		}
		Thread.sleep(2000);
		applyExplicitWaitsUntilElementClickable(copiedEllipsisVerticalIcon,30).click();
		applyExplicitWaitsUntilElementClickable(copyPieAction, 30).click();  
		applyExplicitWaitsUntilElementClickable(deleteCopyPie, 30).click();           // check xpath is common of delete for all app
		Thread.sleep(2000);
		applyExplicitWaitsUntilElementClickable(okBtn, 30).click();                   //check xpath is common of ok for all  app


	}
	//check tvMode



	public void editDashboard() throws Exception
	{
		applyExplicitWaitsUntilElementClickable(operationalExcellence,30).click();
		applyExplicitWaitsUntilElementClickable(VerticalIcon,30).click();
		applyExplicitWaitsUntilElementClickable(editDashboard,30).click(); 

	}

	public void clickOnSaveChanges() throws Exception
	{
		applyExplicitWaitsUntilElementClickable(saveChanges,30).click();          //save changes
	}


	public void downloadWidgetDataAsImg() throws Exception
	{ 
		applyExplicitWaitsUntilElementClickable(operationalExcellence,30).click();
		applyExplicitWaitsUntilElementClickable(VerticalIcon,30).click();
		Thread.sleep(1000);
		applyExplicitWaitsUntilElementClickable(download,30).click();                               //download
		ndriver.findElement(By.xpath("//span[normalize-space()='Image']")).click();                     //image
		Thread.sleep(1000);
		applyExplicitWaitsUntilElementClickable(okBtn,30).click();                                 //ok  btn
		Thread.sleep(2000);

	}


	public void downloadWidgetDataAsPdf() throws Exception
	{
		applyExplicitWaitsUntilElementClickable(operationalExcellence,30).click();
		applyExplicitWaitsUntilElementClickable(VerticalIcon,30).click();
		Thread.sleep(1000);
		applyExplicitWaitsUntilElementClickable(download,30).click();                               //download
		ndriver.findElement(By.xpath("//span[normalize-space()='pdf']")).click();                       //pdf
		Thread.sleep(1000);
		applyExplicitWaitsUntilElementClickable(okBtn,30).click();                                   //ok  btn
		Thread.sleep(2000);
	}

	public void checkIfFileIsDownloaded(String dataFileNameWithExtension) throws Exception {
		String basePath = System.getProperty("user.dir");
		String path =basePath+"\\downloadfiles";	
		// C:\Users\Admin\git\Eco\Eco_PVT\download
		System.out.println(path);
		Thread.sleep(4000);
		boolean a = isFileDownloaded(path,dataFileNameWithExtension);
		if(!a) {
			System.err.println("File not downloaded");
		}
		else {
			System.out.println(dataFileNameWithExtension+" File downloaded");
		}

	}
	public static boolean isFileDownloaded(String downloadDir, String fileName) {
		File file = new File(downloadDir + File.separator + fileName);
		String f=  file.getAbsolutePath();
		System.out.println(f);
		return file.exists();
	}

	public void settingOfDashboard() throws Exception
	{
		applyExplicitWaitsUntilElementClickable(operationalExcellence,30).click();
		applyExplicitWaitsUntilElementClickable(VerticalIcon,30).click();
		Thread.sleep(1000);
		applyExplicitWaitsUntilElementClickable(setting,30).click();                               //setting
		applyExplicitWaitsUntilElementClickable(unifiedDatePicker,30).click();                     //unified picker
		applyExplicitWaitsUntilElementClickable(updateBtn,30).click();                              //update


	}






}


