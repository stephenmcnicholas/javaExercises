package practice;

import java.awt.Component;
import java.awt.Window;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaStreamsPractice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\stephen.mcnicholas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// use java streams to verify if the items in the table on the "offers" page (accessed via Top Deals link) are ordered alphabetically when the header row is clicked
		
		// click column
		// capture web elements from column into a listA
		// capture text from all elements
		// sort on original listA to make listB
		// compare listA to listB (i.e. listA should be already sorted)
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> webElementList = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		
		List<String> originalList = webElementList.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> newList = originalList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(newList.equals(originalList));
		
		// challenge: find the price of Rice
		// scan name column and if text returns rice, print price of vegetable
		// can create a custom method to pass to the java stream 
		List<String> price;
		do 
		{
			List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr/td[1]"));
			price = rows.stream().filter(s->s.getText().contains("Rice")).map(s->getItemPrice(s)).collect(Collectors.toList());
			
			price.forEach(a->System.out.println(a));
			if(price.size()<1) {
				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
			}
		}
		while(price.size()<1);	
		
		// validate if search field on page is working correctly. i.e. does it return all values matching the search criteria
		// find search box and send string to it (e.g. "Rice")
		// save all results to a list, filter list based on the string
		// assert if original list matches filtered list 
		
		driver.findElement(By.id("search-field")).sendKeys("ch");
		List<WebElement> veggies = driver.findElements(By.xpath("//tbody/tr/td[1]")); // this is raw list of results returned by the webpage upon searching - should contain only those items containing "ch"
		List<WebElement> filteredList = veggies.stream().filter(s->s.getText().contains("Ch")).collect(Collectors.toList());		// this is a list filtered for the text "ch"
		filteredList.forEach(a->System.out.println(a.getText()));
		Assert.assertTrue(veggies.equals(filteredList));
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}

	private static String getItemPrice(WebElement s) { // pass webelement into method
		String foundPrice = s.findElement(By.xpath("following-sibling::td[1]")).getText(); // from initial webelement, traverse to sibling element where price is stored and return text of that element
		return foundPrice;
	}

}
