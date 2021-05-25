package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MABusinessAddress{
WebDriver driver;
    
    public  MABusinessAddress(WebDriver driver) {
            
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
    
    public void Click_Address1(String MAAddress1) {
    	address1.sendKeys(MAAddress1);
    }
    
    public void Click_Address2(String MAAddress2) {
    	address2.sendKeys(MAAddress2);
    }
    
    
    public void Click_City(String MACity) {
    	city.sendKeys(MACity);
    }
    
    public void Click_Province(String MAProvince) {
    	province.sendKeys(MAProvince);
    }
    
    public void Click_PostalCode(String MAPostalCode) {
    	postalCode.sendKeys(MAPostalCode);
    }
    public void Click_Continue() {
    	continue1.click();;
    }
    
  
  
 
        

}
