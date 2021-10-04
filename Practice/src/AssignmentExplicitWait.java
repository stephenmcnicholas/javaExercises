import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// set chrome driver and initialise chrome driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\stephen.mcnicholas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cleartrip.com/"); // open page
		Thread.sleep(1000);
		// driver.manage().window().maximize(); //maximise window - changes aspect and
		// objects on page that are clickable

		// select 2 adults from static dropdown (select tag)
		Select adultDropDown = new Select(driver.findElement(By.xpath("//select[@id='Adults']")));
		Thread.sleep(1000);

		adultDropDown.selectByIndex(1);
		Thread.sleep(1000);

		// select 2 children from static dropdown (select tag)
		Select childDropDown = new Select(driver.findElement(By.xpath("//select[@id='Childrens']")));
		Thread.sleep(1000);
		childDropDown.selectByValue("2");
		Thread.sleep(1000);

		// click on Depart On box
		driver.findElement(By.xpath("//input[@title='Depart date']")).click();
		Thread.sleep(1000);

		// select todays date from calendar window that opens
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		Thread.sleep(1000);

		// click on more options link
		driver.findElement(By.cssSelector("a[id='MoreOptionsLink']")).click();
		Thread.sleep(1000);

		// enter "BA" in preferred airline box
		driver.findElement(By.cssSelector("input[name='airline']")).sendKeys("BA");
		Thread.sleep(1000);

		// click on search flights button
		driver.findElement(By.id("SearchBtn")).click();

		// get error message text and print to console
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
				
				
	}

}
