package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusinessAddress_Page {
WebDriver driver;
    
    public  BusinessAddress_Page(WebDriver driver) {
            
            PageFactory.initElements(driver, this);
            
        }
    
    @FindBy(xpath = "//input[@id='address1']")
    WebElement address1;
    
    @FindBy(xpath = "//input[@id='address2']")
    WebElement address2;
    
    @FindBy(xpath = "//input[@id='city']")
    WebElement city;
    
    @FindBy(xpath = "//select[@id='province']")
    WebElement province;
    
    @FindBy(xpath = "//input[@id='postalCode']")
    WebElement postalCode;
    
    @FindBy(xpath = "//button[@id='continue-register']")
    WebElement continue1;
    
    public void Click_Address1(String Address1) {
    	address1.sendKeys(Address1);
    }
    
    public void Click_Address2(String Address2) {
    	address2.sendKeys(Address2);
    }
    
    
    public void Click_City(String City) {
    	city.sendKeys(City);
    }
    
    public void Click_Province(String Province) {
    	province.sendKeys(Province);
    }
    
    public void Click_PostalCode(String PostalCode) {
    	postalCode.sendKeys(PostalCode);
    }
    public void Click_Continue() {
    	continue1.click();;
    }
    
  
  
 
        

}
