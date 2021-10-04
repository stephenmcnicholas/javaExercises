package practice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\stephen.mcnicholas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("ez-accept-all")).click();
		driver.findElement(By.name("travel_date")).click();
		
		
		// find month 
		String bookingMonth = "Nov";
		String bookingDay = "30";
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains(bookingMonth)) // enter loop while the switch isnt showing Aug
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click(); // click the next month button and go round the loop again
		}
		
		
		
		// determine by inspecting page what is the common date attribute, and stick them into a list
		List<WebElement> dates = driver.findElements(By.className("day"));
		int count = driver.findElements(By.className("day")).size(); //get size of the list
		for(int i = 0; i < count; i++) // interate through list
		{
			// get date for each item in list, one by one
			String text = driver.findElements(By.className("day")).get(i).getText();
			if(text.equals(bookingDay)) // check if date in current loop matches your expected value
			{
				driver.findElements(By.className("day")).get(i).click();//if so click the element
				break;//quit for loop once the element has been clicked. 
			}
			
		}
		
		
		
	}

}
