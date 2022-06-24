package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;


public class ZerodhaLoginPage {

		@FindBy(xpath="//input[@type='password']")private WebElement pin;
		@FindBy(xpath="//button[@type='submit']")private WebElement Submit;
		@FindBy(xpath="//a[@class='text-light forgot-link']")private WebElement forgot;
		@FindBy(xpath="//input[@type='text']") private WebElement SignUp;
		@FindBy(xpath="//input[@id='userid']") private WebElement UserID;
		@FindBy(xpath="//span[text()='User ID should be minimum 6 characters.']") private WebElement UserIDError;
		public   ZerodhaLoginPage(WebDriver driver)
		{
			PageFactory.initElements( driver, this);
		}
		
		public void enterUserID(String user)
		{
			UserID.sendKeys(user);
		}
		public void enterPin(String pinNumber)
		{
			pin.sendKeys(pinNumber);
		}
		
		public void clickOnForgot() {
			forgot.click();
		}
		public void clickOnSignUp() {
		SignUp.click();		
	}

		public void ClickOnLogin() {
			Submit.click();
			
		}

		public String getErrorText() {
			String a=UserIDError.getText();
			return a;
		}

	}

	

	
	
