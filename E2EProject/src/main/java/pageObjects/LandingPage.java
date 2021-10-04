package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	
	public WebDriver driver;
	
	private By signin = By.cssSelector("a[href*='sign_in']");
	private By title = By.xpath("//div[@class='text-center']/h2");
	private By navigationBar = By.cssSelector(".nav.navbar-nav.navbar-right");
	private By popup = By.xpath("//button[text()='NO THANKS']");
	private By header = By.cssSelector("div[class*='video-banner'] h3");
	
	//constructor
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public LoginPage getLogin() {
		driver.findElement(signin).click();
		return new LoginPage(driver);
		
	}
	public WebElement getTitle() {
		return driver.findElement(title);
	}	
	public WebElement getHeader() {
		return driver.findElement(header);
	}
	public WebElement getNavigationBar() {
		return driver.findElement(navigationBar);
	}
	public WebElement popup() {
		return driver.findElement(popup);
	}
	public int popupSize() {
		return driver.findElements(popup).size();
	}

}
