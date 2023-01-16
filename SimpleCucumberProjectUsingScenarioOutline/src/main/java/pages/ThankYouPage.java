package pages;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import baseClass.BaseClass;

public class ThankYouPage extends BaseClass{
	
	@FindBy(xpath = "//*[@id='center_col']/descendant::*")
	List<WebElement> successMessage;
	
	public ThankYouPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getSuccessMessage()
	{
		eWait.until(ExpectedConditions.visibilityOfAllElements(successMessage));
		System.out.println(successMessage.get(0).getText());
		System.out.println(successMessage.get(1).getText());
	}
	
	public void verifyPage()
	{
		assertEquals(driver.getTitle(),"Thank You - myContactForm.com");
	}
}
