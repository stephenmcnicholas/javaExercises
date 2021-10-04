package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver driver;
	
	By email = By.id("user_email");
	By passwd = By.id("user_password");
	By login = By.cssSelector("input[value='Log In']");
	By forgotPasswd = By.cssSelector("[href*='password/new']");
	By alertMessage = By.xpath("//div[@class='main-hero']/h1");	
	
	public WebElement emailField() {
		return driver.findElement(email);
	}
	public WebElement passwordField() {
		return driver.findElement(passwd);
	}
	public WebElement loginButton() {
		return driver.findElement(login);
	}
	public WebElement alertMessage() {
		return driver.findElement(alertMessage);
	}
	public ForgotPasswd forgotPasswd() {
		driver.findElement(forgotPasswd).click();
		return new ForgotPasswd(driver);
	}
	
}
