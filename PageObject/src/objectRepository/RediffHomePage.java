package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {
	
	WebDriver driver;
	public RediffHomePage(WebDriver driver) {
	
		this.driver = driver;		
	}

	By shoppingSearchBox = By.id("srchword");
	By shoppingSubmitButton = By.xpath("//div[@class='srch_outer']/following-sibling::input");
	By newsSearchBox = By.id("srchquery_tbox");
	By newsSubmitButton = By.xpath("//form[@name='newsrchform']/input[1]");
	
	public WebElement EnterShoppingSearchTerm() {
		return driver.findElement(shoppingSearchBox);
	}
	
	public WebElement ShoppingSubmitButton() {
		return driver.findElement(shoppingSubmitButton);
	}
	
	
}
