package allTest;

import static baseClass.BaseClass.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.ThankYouPage;

public class StepDefinitions 
{
	public static HomePage homePage;
	public static ThankYouPage thankYouPage;
	
	@Before
	public void initiateBrowser()
	{
		configuration();
		homePage = new HomePage();
		thankYouPage = new ThankYouPage();
	}
	
	@Given("The website Home Page is already open")
	public void navigationToHomePage() 
	{
	    openUrl();
	    homePage.verifyPage();
	}
	
	@When("User enters the valid {string} for the Your Name, valid {string} for Email Address and valid message for Message field")
	public void enterValidDetails(String name, String Email) 
	{
		homePage.enterName(name);
		homePage.enterEmail(Email);
		homePage.enterMessage("Hello");
	}
	
	@When("User clicks on Submit button")
	public void clickSubmitButton() 
	{
		homePage.submitForm();
	}
	
	@Then("User is redirected to Thank You Page")
	public void navigationToThankYouPage() 
	{
	    thankYouPage.verifyPage();
	    thankYouPage.getSuccessMessage();
	}
	
	@After
	public void closeBrowser()
	{
		closeDriver();
	}
}
