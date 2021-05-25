package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BOContactDetails {
    
WebDriver driver;
    
    public  BOContactDetails(WebDriver driver) {
            
            PageFactory.initElements(driver, this);
            
        }
    
    @FindBy(xpath = "//*[@id=\"firstName\"]")
    WebElement Firstname;
    
    @FindBy(xpath = "//*[@id=\"lastName\"]")
    WebElement Lastname;
    
    @FindBy(xpath = "//*[@id=\"companyName\"]")
    WebElement CompanyName;
    
    @FindBy(xpath = "//*[@id=\"officeNumber\"]")
    WebElement Officenumber;
    
    @FindBy(xpath = "//*[@id=\"officeExt\"]")
    WebElement Phone_Extension;
    
    @FindBy(xpath = "//*[@id=\"mobileNumber\"]")
    WebElement Mobilenumber;
    
    @FindBy(xpath ="//*[@id=\"continue-register\"]")
    WebElement Continue;
    
   
    public void Click_Firstname(String BOLegal_Firstname) {
        Firstname.sendKeys(BOLegal_Firstname);
    }
        
    public void Click_Lastname(String BOLegal_Lastname) {
        Lastname.sendKeys(BOLegal_Lastname);
    }
    
    public void Click_Companyname(String BOCompanyname) {
        CompanyName.sendKeys(BOCompanyname);
    }
        
    public void Click_Officenumber(String BOOfficeNumber) {
        Officenumber.sendKeys(BOOfficeNumber);
    }
    public void Click_Extension(String BOExtension) {
        Phone_Extension.sendKeys(BOExtension);
    }
        
    public void Click_Mobilenumber(String BOMobileNumber) {
        Mobilenumber.sendKeys(BOMobileNumber);
    }
    
    public void Click_Continue() {
        Continue.click();
    }

 

}
