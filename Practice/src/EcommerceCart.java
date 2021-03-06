import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcommerceCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// set chrome driver and initialise chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\stephen.mcnicholas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// create explicit wait object
		WebDriverWait w = new WebDriverWait(driver, 5);
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/"); // open page
		driver.manage().window().maximize(); // maximise window - changes aspect and objects on page that are clickable

		String[] veggies = { "Cucumber", "Brocolli", "Beans", "Mango", "Apple", "Pumpkin", "Potato" };
		addItems(driver, veggies);

		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[1]/div[3]/div[2]/div[2]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		
		// declare explicit wait only on this item - has no impact on rest of code
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
		
	}

	// addItems is essentially a "utility" class
	public static void addItems(WebDriver driver, String[] veggies) {

		int shoppingListLength = veggies.length;

		// identify cucumber and add to cart
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		int cart = 0;

		for (int i = 0; i < products.size(); i++) // iterate through web element list in the products variable
		{
			String[] name = products.get(i).getText().split("-"); // get the index of each webelement, and then it's
			// text, and store in name variable
			// format name (trim) to get just veggie name (without the 1 Kg text)
			String formattedName = name[0].trim();
			System.out.println("Iteration through list: " + i + ".");

			// convert veggies array into array list for easy search
			List veggiesList = Arrays.asList(veggies);

			// check if arrayList of veggies contains the string currently in the name
			// variable
			if (veggiesList.contains(formattedName)) 
			{
				// click on add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				System.out.println("added to cart: " + formattedName + ".");
				cart++;
				if (cart == shoppingListLength) // if cart contents match shoppinh list length, exit the for loop
				{
					System.out.println("Finished Shopping!");
					String totalPrice = driver
							.findElement(By.xpath("//div[@class='cart-info']/table/tbody/tr[2]/td[3]/strong"))
							.getText();
					System.out.println("Total Price of shopping today is: ?" + totalPrice + ".");
					break;
				}
			}

		}


	}
}
