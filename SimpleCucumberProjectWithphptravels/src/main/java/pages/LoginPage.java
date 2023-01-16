package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import baseClass.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(xpath = "//div[@class='alert alert-success signup']")
	WebElement successMessage;
	
	public LoginPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getSuccessMessage()
	{
		eWait.until(ExpectedConditions.visibilityOf(successMessage));
		System.out.println(successMessage.getText());
	}
	
	public void verifyPage()
	{
		assertEquals(driver.getTitle(),"Login - PHPTRAVELS");
	}
}
