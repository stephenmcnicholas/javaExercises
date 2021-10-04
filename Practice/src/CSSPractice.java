import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\stephen.mcnicholas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=uk");
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("myUserName");
		driver.findElement(By.cssSelector("[id='password']")).sendKeys("myPassword");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		
	}

}
