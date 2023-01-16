package baseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utilities.DriverSetup;




public class BaseClass extends AbstractTestNGCucumberTests
{
	public static WebDriver driver;
	public static final String browser = "Chrome";
	public static final String baseUrl = "https://www.phptravels.net/home";
	public static Actions action;
	public static WebDriverWait eWait;
	
	
	@BeforeSuite
	public void configuration() throws Exception
	{
		//Starting the browser
		driver = DriverSetup.setupDriver(browser);
		
		//Instantiating Action class object
		action = new Actions(driver);
		
		
		//Specifying the different waits to be used in the test automation
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		eWait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
	}
	
	@BeforeSuite
	public void openUrl()
	{
		driver.get(baseUrl);
	}
	
	@AfterSuite
	public void closeDriver()
	{
		driver.quit();
	}
	
}
