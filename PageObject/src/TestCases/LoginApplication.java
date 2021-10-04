package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.RediffHomePage;
import objectRepository.RediffHomePageFactory;
import objectRepository.RediffLoginPage;
import objectRepository.RediffLoginPageFactory;

public class LoginApplication {

	@Test
	public void Login() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\stephen.mcnicholas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		// for login page, use Page Factory Model, not standard POM style 
		RediffLoginPageFactory rd = new RediffLoginPageFactory(driver);
		rd.EnterEmail().sendKeys("stephen@email.com");
		rd.EnterPassword().sendKeys("pass123");
		rd.Submit().click();
		rd.Home().click();
		//driver.close();
		
		
		// use standard RediffHomePage POM style 
		RediffHomePage hp = new RediffHomePage(driver);
		hp.EnterShoppingSearchTerm().sendKeys("Brooks Ghost 13");
		hp.ShoppingSubmitButton().click();
		
		
		
	}
}
