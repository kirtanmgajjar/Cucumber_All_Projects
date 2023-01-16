package pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import baseClass.BaseClass;

public class HomePage extends BaseClass
{
	@FindBy(id="ACCOUNT")
	WebElement accountButton;
	
	@FindBy(linkText = "Customer Signup")
	WebElement customerSignupButton;
	
	public HomePage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickAccountButton()
	{
		//assertTrue(accountButton.isEnabled());
		eWait.until(ExpectedConditions.elementToBeClickable(accountButton));
		accountButton.click();
	}
	
	public void selectSignup()
	{
		assertTrue(customerSignupButton.isEnabled());
		customerSignupButton.click();
	}
	
	public void verifyPage()
	{
		assertEquals(driver.getTitle(),"PHPTRAVELS | Travel Technology Partner - PHPTRAVELS");
	}
}
