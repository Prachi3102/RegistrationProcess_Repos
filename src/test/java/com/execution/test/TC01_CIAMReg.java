package com.execution.test;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.page.Home_Page;
import com.page.Registration_Page;

import BaseTest.BasePage;
import dataProvider.CSVDataProvider;

public class TC01_CIAMReg {
	public static WebDriver driver;
	public static BasePage Base = new BasePage();
	CSVDataProvider csvUtil = new CSVDataProvider();

	@Test(priority = 1, dataProvider = "csvReader", dataProviderClass = CSVDataProvider.class)
	public void Registration_Page(Map<String, String> testData) throws IOException, InterruptedException {
		driver = Base.startdriver();
		driver.get("https://advisor-uat.apps.cac.pcf.manulife.com/landing");
		Home_Page hp = new Home_Page(driver);
		hp.Sign_In_Options();
		Thread.sleep(2000);
		hp.click_register();

		Registration_Page rp = new Registration_Page(driver);

		String Firstname = testData.get("Firstname");
		String Lastname = testData.get("Lastname");
		String Day = testData.get("Day");
		String Month = testData.get("Month");
		String year = testData.get("Year");
		String Email = testData.get("Email");
		String Username = testData.get("Username");
		String Password = testData.get("Password");
		String Re_Password = testData.get("Re-Password");

		rp.Click_firstName(Lastname);
		rp.Click_lastName(Lastname);
		rp.Click_Day(Day);
		rp.Click_Month(Month);
		rp.Click_Year(year);
		rp.Click_Email(Email);
		rp.Click_Username(Username);
		rp.Click_Password(Password);
		rp.Click_ConfirmPassword(Re_Password);
		rp.Click_ContinueButton();
		rp.Click_Createitanyway_Button();

		driver.get("https://advisor-uat.apps.cac.pcf.manulife.com/landing");
	}

	@Test(priority = 2)
	public void close() throws IOException, InterruptedException {
		Base.closeDriver();

	}

}
