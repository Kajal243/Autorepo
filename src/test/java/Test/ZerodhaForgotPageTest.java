package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaLoginPage;
import Utility.Parametrization;

public class ZerodhaForgotPageTest {
	WebDriver driver;
			@BeforeMethod
			public void browser() {
			driver= Browser.openBrowser();}
			@Test
			public void ForgotPageLogin() throws EncryptedDocumentException, IOException
			
			{
				ZerodhaLoginPage zerodhaForgotPage = new ZerodhaLoginPage(driver);
				String userName = Parametrization.getData(0, 1);
				//String password = Parametrization.getData(1, 1);
				String pan = Parametrization.getData(4, 4);
				String email = Parametrization.getData(6, 6);

				zerodhaForgotPage.enterUserID(userName);
				//zerodhaForgotPage.pan(PanNumber);
				//Object email;
				zerodhaForgotPage.EnterEmailId(email);	
			}
}
