import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\stephen.mcnicholas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		
		/*
		 * driver.get("http://facebook.com");
		 * driver.findElement(By.xpath("//button[text()='Accept All']")).click();
		 * driver.findElement(By.xpath(
		 * "/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"
		 * )).sendKeys("stephenmcnicholas@hotmail.com");
		 * //driver.findElement(By.id("email")).sendKeys("stephenmcnicholas@hotmail.com"
		 * ); driver.findElement(By.name("pass")).sendKeys("Seymour1001");
		 * //driver.findElement(By.xpath(
		 * "/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a"
		 * )).click(); driver.findElement(By.xpath(
		 * "/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"
		 * )).click();
		 */
		 
		 
		 driver.get("https://login.salesforce.com/?locale=uk");
		  driver.findElement(By.cssSelector("#username")).sendKeys("hellopwd");
		  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("hellopwd");
		 driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		 System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		 
	}
}
