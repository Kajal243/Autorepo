package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaLoginPage;
import Utility.Parametrization;

public class ZeodhaPinPageAssart {
	WebDriver driver;
	@BeforeMethod
	public void browser()
	{
		 driver= Browser.openBrowser();
	}
	@Test
	public void clickLoginWithoutDataTest() throws EncryptedDocumentException,IOException
	{
		ZerodhaLoginPage zerodhaLoginPage= new ZerodhaLoginPage(driver);
		zerodhaLoginPage.ClickOnLogin();
	
	String text = zerodhaLoginPage.getErrorText();
	String expectedText = "User ID should be minimum 6 characters.";
	Assert.assertEquals(text,expectedText);
String userName= Parametrization.getData(0,1);
String password = Parametrization.getData(1,1);
zerodhaLoginPage.enterUserID(userName);
zerodhaLoginPage.enterPin(password);
zerodhaLoginPage.ClickOnLogin();
	}

}
