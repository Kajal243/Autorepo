package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class trypage {


private static final WebElement ErrorgetText = null;
@FindBy (xpath="//input[@id='userid']") private WebElement UserName;
@FindBy (xpath="//input[@id='password']") private WebElement Password;
@FindBy (xpath="//button[@type='submit']") private WebElement Submit;
@FindBy (xpath= "//a[@class='text-light forgot-link']") private WebElement Forgot;

public void ZerodhaPageLogin( WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void EnterUserId()
{
UserName.sendKeys();
}


public void EnterPassword()
{
	Password.sendKeys();
}

public void ClickSubmitButton()
{
Submit.sendKeys();
}

public void ClickOnForgot()
{
Forgot.click();
}

public String ErrorgetText()
{
String a=ErrorgetText.getText();
return a;
}
}

