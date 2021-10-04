package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RediffHomePageFactory {
	
	WebDriver driver;
	public RediffHomePageFactory(WebDriver driver) {
	
		this.driver = driver;		
	}

	/*
	 * By shoppingSearchBox = By.id("srchword"); 
	 * By shoppingSubmitButton = By.xpath("//div[@class='srch_outer']/following-sibling::input"); 
	 * By newsSearchBox = By.id("srchquery_tbox");
	 * By newsSubmitButton = By.xpath("//form[@name='newsrchform']/input[1]");
	 */
	
	@FindBy(id="srchword")
	WebElement shoppingSearchBox;
	
	@FindBy(xpath="//div[@class='srch_outer']/following-sibling::input")
	WebElement shoppingSubmitButton;
	
	
	public WebElement EnterShoppingSearchTerm() {
		return shoppingSearchBox;
	}
	
	public WebElement ShoppingSubmitButton() {
		return shoppingSubmitButton;
	}
	
	
}
