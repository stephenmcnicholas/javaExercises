package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
	WebDriver driver;
	public RediffLoginPage(WebDriver driver) {
	
		this.driver = driver;		
	}

	By username = By.xpath("//input[@id='login1']");
	By password = By.xpath("//input[@id='password']");
	By signin = By.xpath("//input[@type='submit']");
	By home = By.linkText("rediff.com");
	
	public WebElement EnterEmail() {
		return driver.findElement(username);
	}
	
	public WebElement EnterPassword() {
		return driver.findElement(password);
	}
	
	public WebElement Submit() {
		return driver.findElement(signin);
	}
	
	public WebElement Home() {
		return driver.findElement(home);
	}
	
	
}
