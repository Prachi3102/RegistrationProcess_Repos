package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BOBusinessAddress {
WebDriver driver;
    
    public  BOBusinessAddress(WebDriver driver) {
            
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
    
    public void Click_Address1(String BOAddress1) {
    	address1.sendKeys(BOAddress1);
    }
    
    public void Click_Address2(String BOAddress2) {
    	address2.sendKeys(BOAddress2);
    }
    
    
    public void Click_City(String BOCity) {
    	city.sendKeys(BOCity);
    }
    
    public void Click_Province(String BOProvince) {
    	province.sendKeys(BOProvince);
    }
    
    public void Click_PostalCode(String BOPostalCode) {
    	postalCode.sendKeys(BOPostalCode);
    }
    public void Click_Continue() {
    	continue1.click();;
    }
    
  
  
 
        

}
