import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */

/**
 * @author stephen.mcnicholas
 *
 */
public class AutoSuggestivePractice {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\stephen.mcnicholas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); // open page

		System.out.println(driver.findElement(By.cssSelector("input#ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		driver.findElement(By.cssSelector("input#ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		System.out.println(driver.findElement(By.cssSelector("input#ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input#ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());

		// count number of checkboxes on the page
		// find common locator for all checkboxes
		System.out.println("There are " + driver.findElements(By.cssSelector("input[type='checkbox']")).size() + " checkboxes on this page!");

		/*
		 * driver.findElement(By.id("autosuggest")).sendKeys("ind"); Thread.sleep(3000);
		 * List<WebElement> options =
		 * driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		 * 
		 * for(WebElement option :options) {
		 * if(option.getText().equalsIgnoreCase("India")) { option.click(); break; } }
		 */
	}

}
