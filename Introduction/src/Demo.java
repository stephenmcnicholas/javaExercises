import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//selenium code
		
		// Create Driver object for Chrome
		
		// we will strictly implement methods of webdriver
		
		//invoke .exe file first
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\stephen.mcnicholas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		/*
		 * driver.get("http://petersfieldinfantschool.co.uk");
		 * System.out.println(driver.getTitle());
		 * System.out.println(driver.getCurrentUrl());
		 * System.out.println(driver.getPageSource());
		 */ 
		 //driver.get("http://www.bbc.co.uk"); driver.navigate().back();
		 //driver.navigate().forward(); 
		 //driver.close(); driver.quit();
		 
		
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("This is my first code");
		//driver.close(); driver.quit();
		
		
	}

}
