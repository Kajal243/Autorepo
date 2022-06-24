package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import POJO.Browser;

public class Table {
	
	public static void main(String url)
	{
		WebDriver driver=Browser.openBrowser("https://demo.guru99.com/test/web-table-element.php");
	WebElement stock = driver.findElement(By.xpath("//table//tbody//tr[14]//td[4]"));
	String name = stock.getText();
	System.out.println(name);
	}

}