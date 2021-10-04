package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPageFactory {
	
	WebDriver driver;
	public RediffLoginPageFactory(WebDriver driver) {
	
		this.driver = driver;	
		PageFactory.initElements(driver, this); // initialises pageFactory objects with local WebDriver object
	}

	// @FindBy is POM alt to the above code
	@FindBy(xpath="//input[@id='login1']")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement signin;
	
	@FindBy(linkText="rediff.com")
	WebElement home;
	
	
	public WebElement EnterEmail() {
		return username;
	}
	
	public WebElement EnterPassword() {
		return password;
	}
	
	public WebElement Submit() {
		return signin;
	}
	
	public WebElement Home() {
		return home;
	}
	
	
}
