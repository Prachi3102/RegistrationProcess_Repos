
	package com.page;

	 

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	 

	public class AddMa_Page {
	WebDriver driver;
	    
	    public  AddMa_Page(WebDriver driver) {
	            
	            PageFactory.initElements(driver, this);
	            
	        }
	    @FindBy(xpath= "//label[contains(text(),'No')]")
	    WebElement MA_No;
	    
	    @FindBy(xpath= "//label[contains(text(),'Yes')]")
	    WebElement MA_Yes;
	    
	    @FindBy(xpath = "//*[@id='continue-register']")
	    WebElement Submit;
	    
	    public void Click_No() {
	        MA_No.click();
	    }
	    
	    public void Click_Yes() {
	        MA_Yes.click();
	    }
	    
	    public void Click_submit() {
	        Submit.click();
	    }

	 


	}
	 


