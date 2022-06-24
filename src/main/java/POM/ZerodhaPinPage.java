package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.FindBy;

public class ZerodhaPinPage {
	@FindBy(xpath="//input[@type='password']")private WebElement pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement Submit;
	@FindBy(xpath="//a[@class='text-light forgot-link']")private WebElement forgot;
	@FindBy(xpath="//input[@type='text']") private WebElement SignUp;
	@FindBy (xpath="//input[@placeholder='User ID']")  private WebElement Userid;

	public ZerodhaPinPage(WebDriver driver) {
		PageFactory.initElements( driver, this);
	}
	
public void enterPin(String pinNumber, WebDriver driver)
{
	FluentWait<WebDriver>wait = new  FluentWait<WebDriver>(driver);
	wait.withTimeout(Duration.ofMillis(2000));
	wait.pollingEvery(Duration.ofMillis(50));
	wait.ignoring(Exception.class);
	wait.until(ExpectedConditions.visibilityOf(pin));
	pin.sendKeys(pinNumber);
}
public void clickOnContinue()
{
	Submit.click();
}

public void enterUserID()
{
	Userid.click();
}

	public void ClickInSignUp()
{
	SignUp.click();
	}
}