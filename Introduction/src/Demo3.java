import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//selenium code
		
		// Create Driver object for Chrome
		
		// we will strictly implement methods of webdriver
		
		//invoke .exe file first
		System.setProperty("webdriver.ie.driver", "C:\\Users\\stephen.mcnicholas\\Downloads\\iedriver64\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("http://petersfieldinfantschool.co.uk");
		System.out.println(driver.getTitle());
	}

}
