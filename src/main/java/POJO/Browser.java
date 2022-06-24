package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Browser {
	public static WebDriver openBrowser()
	
	{
		System.setProperty("webdriver.chrome.driver","E:\\velocity\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");  
		driver.manage().window().maximize();
		return driver;
		
		
	}
public static WebDriver openBrowser(String url)
	
	{
		System.setProperty("webdriver.chrome.driver","E:\\velocity\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);  
		driver.manage().window().maximize();
		return driver;
		//"https://demo.guru99.com/test/web-table-element.php/"
		
	}

	
}

	
	
