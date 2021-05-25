package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MAContactDetails {
    
WebDriver driver;
    
    public  MAContactDetails(WebDriver driver) {
            
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
    
   
    public void Click_Firstname(String MALegal_Firstname) {
        Firstname.sendKeys(MALegal_Firstname);
    }
        
    public void Click_Lastname(String MALegal_Lastname) {
        Lastname.sendKeys(MALegal_Lastname);
    }
    
    public void Click_Companyname(String MACompanyname) {
        CompanyName.sendKeys(MACompanyname);
    }
        
    public void Click_Officenumber(String MAOfficeNumber) {
        Officenumber.sendKeys(MAOfficeNumber);
    }
    public void Click_Extension(String MAExtension) {
        Phone_Extension.sendKeys(MAExtension);
    }
        
    public void Click_Mobilenumber(String MAMobileNumber) {
        Mobilenumber.sendKeys(MAMobileNumber);
    }
    
    public void Click_Continue() {
        Continue.click();
    }

 

}
