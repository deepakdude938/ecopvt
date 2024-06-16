package com.eco.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptOperation {
	
	
	private static WebDriver driver;
		private static JavascriptExecutor javascriptExecutor;

		public JavaScriptOperation(WebDriver driver) {
			this.driver = driver;

		}

		public static void click(WebElement element) {
			
			javascriptExecutor = (JavascriptExecutor) driver;
			javascriptExecutor.executeScript("arguments[0].click()", element);
		}
		
		
		public void sendKeys(WebElement element,String value) {
			javascriptExecutor = (JavascriptExecutor) driver;
			javascriptExecutor.executeScript("arguments[0].value='"+value+"';", element);
		}

}
