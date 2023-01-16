package allTest;

import static baseClass.BaseClass.*;

import java.util.List;

import io.cucumber.datatable.DataTable;
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
	
	@When("User enters the valid data for the Your Name, Email Address and Message fields")
	public void enterValidDetails(DataTable dataTable) 
	{
		List<List<String>> list = dataTable.asLists();
		homePage.enterName(list.get(0).get(1));
		homePage.enterEmail(list.get(1).get(1));
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
