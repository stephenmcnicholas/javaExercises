import java.time.Duration;
import java.util.List;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AssignmentAutocompleteDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// set chrome driver and initialise chrome driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\stephen.mcnicholas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.qaclickacademy.com/practice.php"); // open page
		
		// enter first three letters of desired country e.g. "uni" for "United Kingdom"
		WebElement editBox = driver.findElement(By.cssSelector("[id='autocomplete']"));
		editBox.sendKeys("uni");
		Thread.sleep(2000);
		//move mouse to desired country from dropdown options, and click 
		
		// verify country is updated in the edit box. 
		
		 // create explicit wait object
		WebDriverWait w = new WebDriverWait(driver, 5);
		
		List<WebElement> dropDownOptions = w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@class='ui-menu-item']")));
		for(WebElement element: dropDownOptions) 
		{
			if(element.getText().contains("United Kingdom")) 
			{
				element.click();
				break;
			}
		}	   
		Thread.sleep(2000);
		String editBoxText = driver.findElement(By.xpath("//input[@id='autocomplete']")).getText();
		System.out.println("Text in Autocomplete box now reads: " + editBoxText);
		Thread.sleep(2000);
		Assert.assertEquals(editBoxText, "United Kingdom (UK)"); // assert is failing, because getText above is returning empty string. Dont know why as of 3/6/21
		
		
		
						
	}

}
