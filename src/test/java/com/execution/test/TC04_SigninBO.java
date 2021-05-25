package com.execution.test;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.page.AddAdvisorDetails;
import com.page.AddMa_Page;
import com.page.BOBusinessAddress;
import com.page.BOContactDetails;
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

public class TC04_SigninBO {
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
		BOContactDetails boContact =new BOContactDetails(driver);
		BOBusinessAddress boAddress =new BOBusinessAddress(driver);
		AddAdvisorDetails addAdvisor= new AddAdvisorDetails(driver);
		
		
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
		
		selectYourRole.selectBO();
		Thread.sleep(10000);
		
		
		
		//code for contact details
		
		String BOLegal_Firstname = testData.get("BOLegal_Firstname");
		String BOOfficeNumber = testData.get("BOOfficeNumber");
		String BOCompanyname = testData.get("BOCompanyname");
		
		
		
		boContact.Click_Firstname(BOLegal_Firstname);
		Thread.sleep(2000);
		boContact.Click_Companyname(BOCompanyname);
		Thread.sleep(2000);
		boContact.Click_Officenumber(BOOfficeNumber);
		Thread.sleep(2000);
	
		boContact.Click_Continue();
		
		
		//code for Business Address
		String BOAddress1 = testData.get("BOAddress1");
		String Address2 = testData.get("Address2");
		String BOCity = testData.get("BOCity");
		String BOProvince = testData.get("BOProvince");
		String BOPostalCode = testData.get("BOPostalCode");
		
		boAddress.Click_Address1(BOAddress1);
		boAddress.Click_City(BOCity);
		boAddress.Click_Province(BOProvince);
		boAddress.Click_PostalCode(BOPostalCode);
		boAddress.Click_Continue();
		
		
		
	     
	      //code for Review
	      Review_Page rp= new Review_Page(driver);
	      rp.Click_submit();
	      driver.manage().deleteAllCookies();
	      driver.close();
	      
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


