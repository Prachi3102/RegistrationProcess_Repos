package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectyourRole_Page {

WebDriver driver;
    
    public  SelectyourRole_Page(WebDriver driver) {
            
            PageFactory.initElements(driver, this);
            
        }
    
    @FindBy(xpath = "//button[@id='getStartedADV']")
    WebElement Advisor;
    
    @FindBy(xpath = "//*[@id=\"getStartedMA\"]")
    WebElement MA;
    
    @FindBy(xpath = "//*[@id=\"getStartedOFFICE\"]")
    WebElement BO;
    
    
    
    public void selectAdvisor() {
    	Advisor.click();
    }
    
    public void selectMA() {
    	MA.click();
    }
    
    public void selectBO() {
    	BO.click();
    }
    
	
	/*Advisor- //*[@id="getStartedADV"]
	MA- //*[@id="getStartedMA"]
	BO- //*[@id="getStartedOFFICE"]
	GC- //*[@id="getStartedGC"]
	ME- //*[@id="getStartedHO"]
*/
    }
