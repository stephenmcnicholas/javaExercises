import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\stephen.mcnicholas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); // open page
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click(); //click FROM button
		driver.findElement(By.xpath("//a[@value='BLR']")).click(); // click BLR in FROM options
		WebDriverWait wait = new WebDriverWait(driver,30); // create wait object
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@value='MAA'])[2]"))); // wait until TO options are visible
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); // click MAA from TO options
		
		
	
		
	}

}
