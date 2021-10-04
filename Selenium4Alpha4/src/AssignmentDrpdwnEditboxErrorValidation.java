import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentDrpdwnEditboxErrorValidation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// set chrome driver and initialise chrome driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\stephen.mcnicholas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html"); // open page
		driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
		
		//WebDriverWait w = new WebDriverWait(driver, 5); // explicit wait example
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results")));
		
		
		//fluent wait example. Need to implement your own custom methods with custom wait to simulate visibility of element method, below 
		Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		
		WebElement foo = w.until(new Function<WebDriver, WebElement>()
		{
		
			public WebElement apply(WebDriver driver) 
			{
				if( driver.findElement(By.cssSelector("#results")).isDisplayed()) 
				{
					return driver.findElement(By.cssSelector("#results"));
				}
				else 
				{
					return null;
				}
			}
		});
		
		
		System.out.println(driver.findElement(By.cssSelector("#results")).getText());
						
	}

}
