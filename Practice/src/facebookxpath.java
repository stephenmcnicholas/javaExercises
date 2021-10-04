import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\stephen.mcnicholas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		
		
		
		  driver.findElement(By.xpath("//*[@data-cookiebanner=\"accept_button\"]")).click(); 
		  driver.findElement(By.xpath("//*[@id='email']")).sendKeys("stephenmcnicholas@hotmail.com");
		  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Seymour1001");
		  driver.findElement(By.xpath("//*[@name='login']")).click();
		 
		/*
		 * driver.findElement(By.cssSelector("button[data-cookiebanner='accept_button']"
		 * )).click();
		 * driver.findElement(By.cssSelector("input[name='email']")).sendKeys(
		 * "stephenmcnicholas@hotmail.com");
		 * driver.findElement(By.cssSelector("input[name='pass']")).sendKeys(
		 * "Seymour1001"); driver.findElement(By.cssSelector("[name='login']")).click();
		 */
		
		
	}

}
