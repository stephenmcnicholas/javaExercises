package practice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\stephen.mcnicholas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		 
		// Selenium doesn't offer inbuilt scrolling features, you need to use Javacript
		// first cast your driver to the Javascript executor, so your driver can execute javascripts
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)"); // value in pixels, trial and error
		Thread.sleep(3000);
		js.executeScript("document.querySelector(\".tableFixHead\").scrollBy(0,250)"); // to scroll within a table, find the element of the table and select using the querySelector 
		
		int sumValues = 0;
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		for(int i = 0; i < values.size(); i++) 
		{
			int value = Integer.parseInt(values.get(i).getText()); // values are returned as text, so needs to be converted to int
			//System.out.println(value);
			sumValues = sumValues + value;
		}
		//System.out.println(sumValues);
		int amount = Integer.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim());
		System.out.println(amount);
		
		Assert.assertEquals(sumValues, amount);
		
	}
}
