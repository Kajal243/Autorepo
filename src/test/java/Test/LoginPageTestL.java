package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaLoginPage;
import Utility.Parametrization;
@Listeners(TestListeners.class)
public class LoginPageTestL extends BaseTest{

	@BeforeMethod
	public void Browser()
	{
		driver = Browser.openBrowser();
	}
@Test
	public void loginwithvalidcredentialstest()throws EncryptedDocumentException, IOException
	{
	ZerodhaLoginPage a = new ZerodhaLoginPage(driver);
		String userName= Parametrization.getData(0,1);
		String password = Parametrization.getData(1,1);
		System.out.println(userName);
		a.enterUserID(userName);
		a.enterPin(password);
		a.ClickOnLogin();
				}
	@Test
	public void forgotPasswordLinkTest()
	{
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnForgot();
		}
	@Test 
	public void clickOnSignuplinkTest()
	{
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnSignUp();
	}
	
}


