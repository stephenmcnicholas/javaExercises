package Section12Exercises;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import JavaRevision.StaticVariables;

public class PrintLinksCount {

	public static void main(String[] args) throws InterruptedException {
		
		// demonstrate creating an object of a class in another package, by importing the packagename.classname above
		StaticVariables sv = new StaticVariables("Kat", "Petersfield", 47);
		System.out.println(sv.getAge());
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\stephen.mcnicholas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php"); // open page
		
		// get count of links in page - hint: all links on page with have tagname a (a=anchor)
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		// get count of links in footer only - hint: inspect footer and limit to those from footer only
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());

		// get count of links for 1st col in footer only. hint: limit scope to first column in footer. start with footerDriver
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int numberOfLinks = columnDriver.findElements(By.tagName("a")).size();
		System.out.println(numberOfLinks);
		
		
		
		// click on each link in col and check if pages open (are links working?)
		
		for(int i = 1; i < numberOfLinks; i++) 
		{	
			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER); // create a CTRL+ENTER keystroke, which will be passed to the sendKeys method
			
			// find all link elements in columnDriver, get the ith element and click it
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);			
		}
		Thread.sleep(5000); // wait for all windows to load
		Set<String> windows = driver.getWindowHandles(); // get all the window handles of the open windows 
		Iterator<String> it = windows.iterator(); // use iterator method to iterate over the strings in the windows set 
		
		while(it.hasNext()) // keep looping whilst iterator has a next index
		{
			driver.switchTo().window(it.next()); // switch driver focus to next element in the iteration
			System.out.println(driver.getTitle()); // then get the page title and print it
		}
		
		driver.quit();
	}

}
