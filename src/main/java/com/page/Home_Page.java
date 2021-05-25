package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.BasePage;

public class Home_Page extends BasePage{
	
	public static WebDriver driver;
public Home_Page(WebDriver driver) {
	super();
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//span[text()='Sign in']")
	WebElement clickSignIn;
	@FindBy(xpath = "//div[@class='sign-in-menu signin-box']/ul/li[1]")
	WebElement register_for_advisor_portal;
	
	
public void  Sign_In_Options() throws InterruptedException
{
	
	clickSignIn.click();
	
	Thread.sleep(3000);
}

public void click_register() throws InterruptedException
{
	register_for_advisor_portal.click();
	Thread.sleep(3000);
}
}
