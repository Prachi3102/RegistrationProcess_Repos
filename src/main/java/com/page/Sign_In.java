package com.page;

 

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 

public class Sign_In {
    public static WebDriver driver;
    
public  Sign_In(WebDriver driver) {
        
        PageFactory.initElements(driver, this);
        
    }
    
    @FindBy(xpath = "//*[@id='username']")
    WebElement username;
    @FindBy(xpath = "//*[@id='password']")
    WebElement password;
    @FindBy(xpath = "*//button[contains(text(),'Sign in')]")
    WebElement SigninButton;
    
    @FindBy(xpath= "(//button)[5]")
    WebElement Reject_Mobile;
    
    @FindBy(xpath= "//*[@aria-label='Connect to Advisor Portal']") 
    WebElement AP_Go_Button;
    
    @FindBy(xpath= "//*[@aria-label='Connect to Sell Health Plans']") 
    WebElement SC_Go_Button;
    
    
    
    
    

 

    public void Click_username(String Username){
        // TODO Auto-generated method stub
        username.sendKeys(Username);
    }
    
    public void Click_password(String Password){
        // TODO Auto-generated method stub
        password.sendKeys(Password);
    }
    
  
    public void Click_SigninButton(){
        // TODO Auto-generated method stub
        SigninButton.click();
    }
    
    public void Click_Reject_Mobile() throws InterruptedException{
        // TODO Auto-generated method stub
        try {
        Thread.sleep(2000);
        if(Reject_Mobile.isDisplayed()) {
        Boolean b=Reject_Mobile.isDisplayed();
        Reject_Mobile.click();
        System.out.println(b);}}
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

 

    public void Click_AP_Go_Button() {
        // TODO Auto-generated method stub
        try {
        AP_Go_Button.click();}
        catch(Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", AP_Go_Button);
        }
        
    }
    
    public void Click_SC_Go_Button() {
        // TODO Auto-generated method stub
        SC_Go_Button.click();
        
    }
}