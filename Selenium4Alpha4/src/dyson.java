import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dyson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\stephen.mcnicholas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*
		 * driver.get("https://www.amazon.co.uk");
		 * driver.findElement(By.cssSelector("a[data-nav-ref*='signin']")).click();
		 * driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(
		 * "stephenmcnicholas@hotmail.com");
		 * driver.findElement(By.xpath("//input[@id='continue']")).click();
		 * driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(
		 * "Seymour1001");
		 * driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		 * driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
		 * System.out.println(driver.findElement(By.xpath(
		 * "//*[@id=\"sc-item-Cff08b3a1-8bdd-492e-8a03-625963057108\"]")).getText());
		 */
		
		/*
		 * driver.get("https://www.google.co.uk");
		 * driver.findElement(By.xpath("//*[@id='L2AGLb']/div")).click();
		 * driver.findElement(By.name("q")).sendKeys("Superstars theme tune");
		 * //driver.findElement(By.xpath("//*[@type='submit']")).click();
		 * driver.findElement(By.xpath(
		 * "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click(
		 * ); driver.findElement(By.xpath(
		 * "//*[@id=\"rso\"]/div[1]/div/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/a/div/div[1]/div[2]"
		 * )).click();
		 */
		
		driver.get("http://www.qaclickacademy.com/interview.php");
		driver.findElement(By.xpath("//*[@id='tablist1-tab1']")).click();
		
		
		
	}

}
