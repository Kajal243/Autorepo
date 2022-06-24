package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.ScreenShot;

public class TestListeners extends BaseTest implements ITestListener {
	// WebDriver driver;

	public void onTestStart(ITestResult result)
	{
		System.out.println(result.getName() +"Test has Started");
	}
 public void onTestFailure(ITestResult result) {
	 try {
 ScreenShot.takeScreenshot(driver,result.getName());
} catch (IOException e)
	 {
	e.printStackTrace();
	 }
 }
public void onTestSuccess(ITestResult result)
{
	System.out.println(result.getName() + "Test Success");
}
public void onTestSkipped(ITestResult result)
{
	System.out.println(result.getName() + "Test Skip");

}
}
