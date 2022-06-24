package POM;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZeodhaPinPageAssart {
	
	@FindBy (xpath="//input[@type='password']") private WebElement pin;
	@FindBy (xpath="//button[@type='submit']")  private WebElement Submit;
	@FindBy (xpath="//a=[a[text()=\"Don't have an account? Signup now!\"]") private WebElement SignUp;
	@FindBy (xpath="//a[text()='Forgot 2FA?\']")private WebElement forgot;
public ZeodhaPinPageAssart(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void EntryPin(String pinNumber,WebDriver driver)
{
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(2000));
	wait.until(ExpectedConditions.visibilityOf(pin));
	pin.sendKeys(pinNumber);
}
public void clickOnLogin()
{
	Submit.click();

}
public void ClickOnSignUp()
{
	SignUp.click();
	}
public void ClickOnForgot()
{
	forgot.click();
	}

}
