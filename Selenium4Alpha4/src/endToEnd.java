import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class endToEnd {

	public static void main(String[] args) throws InterruptedException {
		// set chrome driver and initialise chrome driver 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\stephen.mcnicholas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com"); // open page
		driver.manage().window().maximize(); //maximise window - changes aspect and objects on page that are clickable
		
		//click FROM button
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click(); //click FROM button
		// select Delhi in FROM box
		driver.findElement(By.xpath("//a[@value='DEL']")).click(); // click DEL in FROM options
		Thread.sleep(2000);
		// select Chennai in TO box
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']  //a[@value='MAA']")).click();
		
		// select family and friends checkbox
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		// on current date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		// validate other calendar is disabled (it's one way only)
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) 
		{
			System.out.println("Enabled");
			Assert.assertFalse(false);
		}
		else {
			Assert.assertFalse(true);
		}
				
		// check default is 1 Adult
		//driver.findElement(By.xpath("//div[@id='divpaxinfo']"))
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText(), "1 Adult");
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		
		// select 3 adults
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_Adult']")));
		dropdown.selectByIndex(3);
		
		// verify 4 adults and print
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText(), "4 Adult");
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		
		// click search
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		
		
	}

}
