package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaHomePage;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.Parametrization;

public class ZerodhaHomePageTest {
		WebDriver driver;
		@BeforeMethod
		public void browser() {
			driver=Browser.openBrowser();
		}
		@Test(priority=-1)
		public void loginToZerodhaPinTest() throws EncryptedDocumentException, IOException, InterruptedException {
			ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
			String userName = Parametrization.getData(0, 1);
			String password = Parametrization.getData(1, 1);
			zerodhaLoginPage.enterUserID(userName);
			zerodhaLoginPage.enterPin(password);
			zerodhaLoginPage.ClickOnLogin();
		Thread.sleep(5000);
		ZerodhaPinPage zerodhaPinPage = new ZerodhaPinPage(driver);
		String pin = Parametrization.getData(2, 1);
		System.out.println(pin);
		zerodhaPinPage.enterPin(pin,driver);
		zerodhaPinPage.clickOnContinue();
		Thread.sleep(5000);
		ZerodhaHomePage zerodhaHomePage = new ZerodhaHomePage(driver);
		String StockName ="TATACOFFEE";
		zerodhaHomePage.EnterStockName(StockName);
		Actions action = new Actions(driver);
		WebElement Stock=driver.findElement(By.xpath("//span[text()='TATACOFFEE']"));
		action.moveToElement(Stock);
		action.perform();
		WebElement Buy =driver.findElement(By.xpath("//button[@data-balloon=\"Buy\"]"));
		action.moveToElement(Buy);
		action.perform();
		Thread.sleep(3000);
		action.click();
		action.perform();
		//Thread.sleep(3000);
		zerodhaHomePage.ClickOnBSE();

		zerodhaHomePage.ClickOnIntraday();
		zerodhaHomePage.ClickOnQty();
		zerodhaHomePage.ClickOnMarket();
		zerodhaHomePage.ClickOnbuy();




		}

		}


