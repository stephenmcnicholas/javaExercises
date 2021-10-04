import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentWindowHandling {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// set chrome driver and initialise chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\stephen.mcnicholas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/"); // open page
		// find "Multiple windows" link and click
		driver.findElement(By.cssSelector("a[href=\"/windows\"]")).click();
		// find "click here" link and click to open new window
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
		//get window handles and store parent and child pages
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentPage = it.next();
		String childPage = it.next();
		// capture "new window" text from child window and print to screen
		driver.switchTo().window(childPage);
		String childText = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		System.out.println(childText);
		// navigate back to parent window
		driver.switchTo().window(parentPage);
		// capture parent window text and print to screen
		String parentText = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		System.out.println(parentText);							
	}
}
