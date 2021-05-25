package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAdvisorDetails {
WebDriver driver;
    
    public  AddAdvisorDetails(WebDriver driver) {
            
            PageFactory.initElements(driver, this);
            
        }
    
    @FindBy(xpath = "//input[@id='advisorFirstName']")
    WebElement AdvisorFName;
    
    @FindBy(xpath = "//input[@id='advisorLastName']")
    WebElement AdvisorLName;
    
    @FindBy(xpath = "//input[@id='advisorEmail']")
    WebElement AdvisorEmail;
    
    @FindBy(xpath = "//button[@id='continue-register']")
    WebElement Continue;
    
    
    
    public void selectAdvisorFName(String AdvisorFirstName ) {
    	AdvisorFName.sendKeys(AdvisorFirstName);
    }
    
    public void selectAdvisorLName(String AdvisorLastName) {
    	AdvisorLName.sendKeys(AdvisorLastName);
    }
    
    public void selectAdvisorEmail(String AdvisorEmailId) {
    	AdvisorEmail.sendKeys(AdvisorEmailId);
    }
    
    public void selectContinue() {
    	Continue.click();
    }

}


