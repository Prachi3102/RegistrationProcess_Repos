package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerificationInfo_Page {
WebDriver driver;
    
    public  VerificationInfo_Page(WebDriver driver) {
            
            PageFactory.initElements(driver, this);
            
        }
    
    @FindBy(xpath = "//label[text()='No']")
    WebElement No;
    
    @FindBy(xpath = "//button[@id='continue-register']")
    WebElement Continue;
    
    public void selectSellingCode() {
    	No.click();
    }
    
    public void selectContinue() {
    	Continue.click();
    }
    

}
