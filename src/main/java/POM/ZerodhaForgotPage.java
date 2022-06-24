package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaForgotPage {
	@FindBy (xpath="//input[@placeholder='User ID']")  private WebElement Userid;
	@FindBy (xpath="//input[@placeholder='PAN']") private WebElement pan;
	@FindBy (xpath= "//input[@placeholder='E-mail (as on account)']")private WebElement email;
	@FindBy (xpath = "//input[@placeholder='Captcha']")  private WebElement Captcha ;
	@FindBy (xpath="//button[@class='button-orange wide']") private WebElement Reset;
	@FindBy(xpath="//a[@class='text-light forgot-link']")private WebElement forgot;

	public void  ZerodhaPinPage(WebDriver driver)
	{
		PageFactory.initElements( driver, this);
	}
	
	public void EnterUserID(String User )
	{
		Userid.sendKeys(User);
	}
	
	public void EnterPanCardNo(String PanNumber )
	{
		pan.sendKeys(PanNumber);
	}
	
	public void EnterEmailId(String mailid)
	{
		email.sendKeys(mailid);
	}

	public void EnterCaptcha(String captcha)
	{
		Captcha.sendKeys();
	}
	public void ClickOnSubmit()
	{
		Reset.click();
	}
	}
