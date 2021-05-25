package com.execution.test;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.page.AddMa_Page;
import com.page.BusinessAddress_Page;
import com.page.ContactDetails_Page;
import com.page.LegalAgreement;
import com.page.Registration_Page;
import com.page.RepsourceAccountLink_Page;
import com.page.Review_Page;
import com.page.SelectyourRole_Page;
import com.page.Sign_In;
import com.page.VerificationInfo_Page;

import BaseTest.BasePage;
import dataProvider.CSVDataProvider;

public class TC02_SigninAdvisor {
	public static WebDriver driver;
	public static BasePage Base = new BasePage();
	Registration_Page rp = new Registration_Page(driver);
	//RepsourceAccountLink_Page repsourceAccLink =new RepsourceAccountLink_Page(driver);
	//LegalAgreement legalAgree =new LegalAgreement(driver);
	//SelectyourRole_Page selectYourRole =new SelectyourRole_Page(driver);

	@Test(priority = 1, dataProvider = "csvReader", dataProviderClass = CSVDataProvider.class)
	public void Registration_Page(Map<String, String> testData) throws IOException, InterruptedException {
		driver = Base.startdriver();
		driver.get("https://uat.id.manulife.ca/advisor/signin?ui_locales=en-CA");
		String Username = testData.get("Username");
		String Password = testData.get("Password");

		Sign_In signin = new Sign_In(driver);
		RepsourceAccountLink_Page repsourceAccLink =new RepsourceAccountLink_Page(driver);
		LegalAgreement legalAgree =new LegalAgreement(driver);
		SelectyourRole_Page selectYourRole =new SelectyourRole_Page(driver);
		VerificationInfo_Page veriInfo =new VerificationInfo_Page(driver);
		ContactDetails_Page cd =new ContactDetails_Page(driver);
		BusinessAddress_Page address =new BusinessAddress_Page(driver);
		
		signin.Click_username(Username);
		signin.Click_password(Password);
		signin.Click_SigninButton();
		Thread.sleep(5000);
		System.out.println("Signin button clicked");
		
		signin.Click_Reject_Mobile();
		Thread.sleep(5000);
		signin.Click_AP_Go_Button();
		Thread.sleep(4000);
		
		//Code for linking repsource account
		repsourceAccLink.clickAlert();
		Thread.sleep(5000);
		repsourceAccLink.noRepsourceAccount();
		 Thread.sleep(10000);
		repsourceAccLink.continueButton();
		 Thread.sleep(10000);
       


		//Code for linking legal agreement
		legalAgree.Click_agreement();
		Thread.sleep(10000);
		legalAgree.Click_continue();
		Thread.sleep(100000);
		 //driver.manage().deleteAllCookies();
		
		selectYourRole.selectAdvisor();
		Thread.sleep(10000);
		
		//code for Verification information
		veriInfo.selectSellingCode();
		Thread.sleep(10000);
		veriInfo.selectContinue();
		Thread.sleep(10000);
		
		//code for contact details
		String Legal_Firstname = testData.get("Legal_Firstname");
		String OfficeNumber = testData.get("OfficeNumber");
		String Companyname = testData.get("Companyname");
		String MobileNumber = testData.get("MobileNumber");
		
		
		cd.Click_Firstname(Legal_Firstname);
		Thread.sleep(7000);
		cd.Click_Companyname(Companyname);
		Thread.sleep(7000);
		cd.Click_Officenumber(OfficeNumber);
		Thread.sleep(7000);
		cd.Click_Mobilenumber(MobileNumber);
		Thread.sleep(7000);
		cd.Click_Continue();
		
		
		//code for Business Address
		String Address1 = testData.get("Address1");
		String Address2 = testData.get("Address2");
		String City = testData.get("City");
		String Province = testData.get("Province");
		String PostalCode = testData.get("PostalCode");
		
		address.Click_Address1(Address1);
		address.Click_City(City);
		address.Click_Province(Province);
		address.Click_PostalCode(PostalCode);
		address.Click_Continue();
		
		
		 //code for Adding Marketing Assistant
	      AddMa_Page ma= new AddMa_Page(driver);
	      ma.Click_No();
	      ma.Click_submit();
	     
	      //code for Review
	      Review_Page rp= new Review_Page(driver);
	      rp.Click_submit();
	      driver.manage().deleteAllCookies();
	      
	      driver.get("https://uat.id.manulife.ca/advisor/signin?ui_locales=en-CA");
	    }
		
	
		
/*
		Boolean m = driver.findElement(By.xpath("(//button[contains(text(),'Profile')])")).isDisplayed();
		System.out.println(m);
		WebElement element1 = driver.findElement(By.xpath("(//button[contains(text(),'Profile')])"));

		Actions action = new Actions(driver);
		action.moveToElement(element1).click().perform();

		WebElement element2 = driver.findElement(By.xpath("//button//span[contains(text(),'Sign out')]"));
		action.moveToElement(element2).click().perform();

		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		Thread.sleep(5000);
		driver.get("https://uat.id.manulife.ca/advisor/signin?ui_locales=en-CA");
		Thread.sleep(5000);
*/
	}

	/*
	 * @Test(priority = 2) public void close() throws IOException,
	 * InterruptedException { Base.closeDriver(); }
	 */


