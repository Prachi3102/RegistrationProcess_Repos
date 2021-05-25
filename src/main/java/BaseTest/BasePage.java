package BaseTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePage {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static final long DEFAULT_WAIT_TIME = 30;
	
	public static WebDriver startdriver() throws IOException
	
	{
		if(driver == null) {
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("incognito");
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	
			System.setProperty("webdriver.chrome.driver","C:\\Users\\lnuprac\\Downloads\\chromedriver.exe");
			//System.setProperty("webdriver.edge.driver","C:\\SeleniumDrivers\\msedgedriver.exe");
			//driver = new ChromeDriver();
			//EdgeDriver options= new Edgeoption();
			//ChromeOptions options = new ChromeOptions();
			//options.setPageLoadStrategy(PageLoadStrategy.NONE);
			// Instantiate the chrome driver
			//driver = new ChromeDriver(options);
			driver = new ChromeDriver(capabilities);
			
			//driver = new EdgeDriver();
			wait = new WebDriverWait(driver,DEFAULT_WAIT_TIME);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://advisor-uat.apps.cac.pcf.manulife.com/landing");
			// driver.get("https://uat.id.manulife.ca/advisor/signin?ui_locales=en-CA");
		}
		 return driver;
	}
	public static void closeDriver() {
		driver.quit();
		driver = null;

		}
	
	@BeforeMethod(alwaysRun = true)
	public WebDriver driverLaunch() throws IOException {
		driver=startdriver();	
		return driver;}

	@AfterMethod(alwaysRun = true)
	public void Close()
	{
		
		closeDriver();
	}
}
