package pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import baseClass.BaseClass;

public class HomePage extends BaseClass
{
	@FindBy(name="q[1]")
	WebElement nameTextbox;
	
	@FindBy(id = "email")
	WebElement emailTextbox;
	
	@FindBy(name="q[2]")
	WebElement messageTextbox;
	
	@FindBy(name = "submit")
	WebElement submitButton;
	
	public HomePage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterName(String name)
	{
		assertTrue(nameTextbox.isEnabled());
		nameTextbox.sendKeys(name);
	}
	
	public void enterEmail(String email)
	{
		assertTrue(emailTextbox.isEnabled());
		emailTextbox.sendKeys(email);
	}
	
	public void enterMessage(String message)
	{
		assertTrue(messageTextbox.isEnabled());
		messageTextbox.sendKeys(message);
	}
	
	public void submitForm()
	{
		assertTrue(submitButton.isEnabled());
		submitButton.click();
	}
	
	public void verifyPage()
	{
		assertEquals(driver.getTitle(),"Basic Contact Form - myContactForm.com");
	}
}
