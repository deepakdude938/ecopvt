package com.eco.base;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.DriverFactory;
import java.time.Duration;



public class BaseClass {
	public static String reportName1 ;
	public WebDriver driver;
	
	

	public static WebElement applyExplicitWaitsUntilElementClickable(WebElement element, int time) throws MalformedURLException {
		
		WebDriverWait wait = new WebDriverWait( DriverFactory.getDriver(),Duration.ofSeconds(time));
		
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return element;
	}
	
	


}
