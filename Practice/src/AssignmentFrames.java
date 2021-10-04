import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentFrames {

	public static void main(String[] args)
	{
		// set chrome driver and initialise chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\stephen.mcnicholas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/"); // open page
		driver.findElement(By.cssSelector("a[href='/nested_frames']")).click(); // find "nested frames" link and click
		driver.switchTo().frame(0); // switch to 1st of 2 outer frames
		driver.switchTo().frame(1); // switch to 2nd of 3 inner frames
		//find web element in the middle frame and print middle text in output
		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText()); 
		
	}
}
