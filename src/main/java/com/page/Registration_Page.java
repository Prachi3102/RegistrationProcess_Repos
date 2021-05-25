package com.page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registration_Page {
WebDriver driver;

 public  Registration_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//*[@id='first-name']")
	WebElement FirstName;
	@FindBy(xpath = "//*[@id='last-name']")
	WebElement LastName;
	@FindBy(xpath = "(//input[contains(@id,'dob-')])[1]")
	WebElement Day;
	@FindBy(xpath = "//select")
	WebElement Month;
	@FindBy(xpath = "(//input[contains(@id,'dob-')])[2]")
	WebElement Year;
	@FindBy(xpath = "//*[@id='email']")
	WebElement Email;
	@FindBy(xpath = "//*[@id='username']")
	WebElement Username;
	@FindBy(xpath = "//*[@id='password']")
	WebElement Password;
	@FindBy(xpath = "//*[@id='password-confirm']")
	WebElement ConfirmPassword;
	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	WebElement ContinueButton;
	@FindBy(xpath = "//button[contains(text(),'Create it anyway')]")
	WebElement CreateButton;
	
	
	public void Click_firstName(String firstname) {
		// TODO Auto-generated method stub
		FirstName.sendKeys(firstname);
		
	}

    public void Click_lastName(String lastname){
    	// TODO Auto-generated method stub
	    LastName.sendKeys(lastname);
    }
    
    public void Click_Day(String day){
    	// TODO Auto-generated method stub
    	Day.sendKeys(day);
    }
    
    public void Click_Month(String month) {
		// TODO Auto-generated method stub
    	//Month.click();


    	//WebElement mySelectElement = driver.findElement(By.id("dob-kmou0171-month-toggle"));
		Select dropdown= new Select(Month);
		//To select an option - selectByVisibleText, selectByIndex, selectByValue
		//selectByVisibleText
		dropdown.selectByValue("march");
	}

    public void Click_Year(String year){
    	// TODO Auto-generated method stub
	    Year.sendKeys(year);
    }
    
    public void Click_Email(String email){
    	// TODO Auto-generated method stub
    	Email.sendKeys(email);
    }
    public void Click_Username(String username){
    	// TODO Auto-generated method stub
    	Username.sendKeys(username);
    }
    public void Click_Password(String password){
    	// TODO Auto-generated method stub
    	Password.sendKeys(password);
    	
    } public void Click_ConfirmPassword(String re_Password){
    	// TODO Auto-generated method stub
    	ConfirmPassword.sendKeys(re_Password);
    	
    }public void Click_ContinueButton(){
	// TODO Auto-generated method stub
    	ContinueButton.click();
    
    }public void Click_Createitanyway_Button(){
    	// TODO Auto-generated method stub
    	CreateButton.click();

	
}

}
	

