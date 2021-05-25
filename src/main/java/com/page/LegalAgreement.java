package com.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LegalAgreement {
WebDriver driver;
    
    public  LegalAgreement(WebDriver driver) {
            
            PageFactory.initElements(driver, this);
            
        }
        
       // @FindBy(xpath = "//label[contains(text(),'I agree to the terms and conditions')]")
     @FindBy(xpath = "//label[@for='termsConditionsagree-1']")
        WebElement agreement;
        
        @FindBy(xpath = "//*[@id='continue-register']")
        WebElement continue1;

 

        public void Click_agreement(){
            // TODO Auto-generated method stub
        	  /*JavascriptExecutor js = (JavascriptExecutor) driver;
        	  js.executeScript("window.scrollTo(0, document.body.scrollHeight)");*/
        	/*Actions action = new Actions(driver);
    		action.moveToElement(agreement).click().perform();*/
        	  agreement.click();
        }
        
        public void Click_continue(){
            // TODO Auto-generated method stub
            continue1.click();
        }
}
