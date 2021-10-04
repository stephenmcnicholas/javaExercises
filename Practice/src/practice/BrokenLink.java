package practice;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLink {

	public static void main(String[] args) throws InterruptedException, IOException {

		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\stephen.mcnicholas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.get("https://rahulshettyacademy.com/AutomationPractice");

		// find broken URLs
		// get all URLs in page, check status codes of each (Java methods will call URLs to do this)
		
		WebElement footer =	driver.findElement(By.cssSelector("div[id='gf-BIG']")); //find element that corresponds to the footer

		List<WebElement> links =  footer.findElements(By.tagName("a")); // find all elements with tag a (anchor) within the footer element and put into list
		System.out.println("There are " + links.size() + " links in the footer"); 
		
		SoftAssert a = new SoftAssert();
		
		for(WebElement element: links) //loop through all elements 
		{
			String url = element.getAttribute("href"); // get url from each element
			String value = element.getText();
			HttpURLConnection connection = (HttpURLConnection)new URL(url).openConnection(); // use URL open connection method, cast to HttpURLConnection object. this opens url on browser
			connection.setRequestMethod("HEAD"); // sets type of connection as a HEAD connection. 
			connection.connect(); // invokes the method
			int code = connection.getResponseCode();
			
			//Assert.assertTrue(code < 400, "\tError: broken link: " + code + " code"); // HARD assertion. Will STOP test on first failure
			a.assertTrue(code < 400, "\tError: broken link: " + code + " code"); // SOFT assertion. Will STORE failures, but continue until assertAll, which will either pass or fail in aggregate
			
			
		}
		a.assertAll(); // 
	}

}
