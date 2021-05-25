package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseTest.BasePage;

public class RepsourceAccountLink_Page extends BasePage {

	public static WebDriver driver;

	 public  RepsourceAccountLink_Page(WebDriver driver) {
		 super();
			PageFactory.initElements(driver, this);
			
		}
        
		@FindBy(xpath = "//img[@id='site-wide-close-button']")
		WebElement Alert;
		@FindBy(xpath = "//label[@class='switch_2_right_option2']")
		WebElement RepsourceNo;
		
		@FindBy(xpath = "//button[@id='continue-register']")
		WebElement Continue;
		
public void  clickAlert() {
		
			
			Alert.click();
		}
		public void  noRepsourceAccount() {
			
			
			RepsourceNo.click();
		}
			
			public void  continueButton() {
			
				
				Continue.click();
		 
		
		       		}
}

