package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactDetails_Page {
    
WebDriver driver;
    
    public  ContactDetails_Page(WebDriver driver) {
            
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
    
   
    public void Click_Firstname(String Legal_Firstname) {
        Firstname.sendKeys(Legal_Firstname);
    }
        
    public void Click_Lastname(String Legal_Lastname) {
        Lastname.sendKeys(Legal_Lastname);
    }
    
    public void Click_Companyname(String Companyname) {
        CompanyName.sendKeys(Companyname);
    }
        
    public void Click_Officenumber(String OfficeNumber) {
        Officenumber.sendKeys(OfficeNumber);
    }
    public void Click_Extension(String Extension) {
        Phone_Extension.sendKeys(Extension);
    }
        
    public void Click_Mobilenumber(String MobileNumber) {
        Mobilenumber.sendKeys(MobileNumber);
    }
    
    public void Click_Continue() {
        Continue.click();
    }

 

}
