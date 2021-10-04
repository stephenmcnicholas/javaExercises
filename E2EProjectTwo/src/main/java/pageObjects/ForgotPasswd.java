package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswd {

	public WebDriver driver;
	By email = By.cssSelector("[id='user_email']");
	By sendInstructions = By.cssSelector("[type='submit']");
	
	public ForgotPasswd(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public WebElement emailField() {
		return driver.findElement(email);
	}
	
	public WebElement sendInstructions() {
		return driver.findElement(sendInstructions);
	}
	
}
