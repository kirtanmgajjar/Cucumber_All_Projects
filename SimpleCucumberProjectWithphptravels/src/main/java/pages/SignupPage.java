package pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import baseClass.BaseClass;

public class SignupPage extends BaseClass
{
	
	@FindBy(name="first_name")
	WebElement firstNameTextbox;
	
	@FindBy(name="last_name")
	WebElement lastNameTextbox;
	
	@FindBy(name="phone")
	WebElement phoneTextbox;
	
	@FindBy(name="email")
	WebElement emailTextbox;
	
	@FindBy(name="password")
	WebElement passwordTextbox;
	
	@FindBy(id="button")
	WebElement signupButton;
	
	public SignupPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterFirstName(String name)
	{
		assertTrue(firstNameTextbox.isEnabled());
		firstNameTextbox.sendKeys(name);
	}
	
	public void enterLastName(String name)
	{
		assertTrue(lastNameTextbox.isEnabled());
		lastNameTextbox.sendKeys(name);
	}
	
	public void enterPhone(String phone)
	{
		assertTrue(phoneTextbox.isEnabled());
		phoneTextbox.sendKeys(phone);
	}
	
	public void enterEmail(String email)
	{
		assertTrue(emailTextbox.isEnabled());
		emailTextbox.sendKeys(email);
	}
	
	public void enterPassword(String password)
	{
		assertTrue(passwordTextbox.isEnabled());
		passwordTextbox.sendKeys(password);
	}
	
	public void clickSignupButton()
	{
		assertTrue(signupButton.isDisplayed());
		eWait.until(ExpectedConditions.elementToBeClickable(signupButton));
		signupButton.click();
	}
	
	public void verifyPage()
	{
		assertEquals(driver.getTitle(),"Signup - PHPTRAVELS");
	}
}
