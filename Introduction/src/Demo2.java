import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//selenium code
		
		// Create Driver object for Chrome
		
		// we will strictly implement methods of webdriver
		
		//invoke .exe file first
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\stephen.mcnicholas\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://petersfieldinfantschool.co.uk");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
	}

}
