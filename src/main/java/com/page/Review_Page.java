
	package com.page;

	 

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	 

	public class Review_Page {
	    
	    
	WebDriver driver;
	    
	    public  Review_Page(WebDriver driver) {
	            
	            PageFactory.initElements(driver, this);
	            
	        }
	  
	    @FindBy(xpath = "//*[@id=\"continue-register\"]")
	    WebElement Submit;
	    
	    public void Click_submit() {
	        Submit.click();
	    }

	 

	}


