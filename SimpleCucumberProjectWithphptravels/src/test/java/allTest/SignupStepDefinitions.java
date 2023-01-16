package allTest;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.SignupPage;

public class SignupStepDefinitions 
{
	public static HomePage homePage = new HomePage();
	public static SignupPage signupPage = new SignupPage();
	public static LoginPage loginPage = new LoginPage();
	
	
	@Given("The website Home Page is already open")
	public void navigationToHomePage() 
	{
	    homePage.verifyPage();
	}
	
	@When("User clicks on Account and selects Customer Signup")
	public void navigationToSignupPage() 
	{
		homePage.clickAccountButton();
		homePage.selectSignup();
		signupPage.verifyPage();
	}
	
	@When("User enters the valid data for the fields on the Signup Page")
	public void enterValidDetails(DataTable dataTable) 
	{
		List<List<String>> list = dataTable.asLists();
		signupPage.enterFirstName(list.get(1).get(1));
		signupPage.enterLastName(list.get(2).get(1));
		signupPage.enterPhone(list.get(3).get(1));
		signupPage.enterEmail(list.get(4).get(1));
		signupPage.enterPassword(list.get(5).get(1));
	}
	
	@When("User clicks on Signup button")
	public void clickSignupButton() 
	{
	    signupPage.clickSignupButton();
	}
	
	@Then("User is redirected to Login Page")
	public void navigationToLoginPage() 
	{
		loginPage.verifyPage();
	    loginPage.getSuccessMessage();
	}
}
