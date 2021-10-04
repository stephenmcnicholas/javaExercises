package practice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HTTPSCertifications {

	public static void main(String[] args) throws InterruptedException {

		
		// create general chrome profile, with desired capabilities, e.g. accepting Insecure certs
		DesiredCapabilities dc = DesiredCapabilities.chrome(); // create desired capabilities object 
		//dc.acceptInsecureCerts(); // one way to apply capabilities to the object
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);	// another way to apply capabilities to the object is to use 
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		// this means your chrome driver will then automatically accept SSL popups 
		ChromeOptions c = new ChromeOptions(); // create Chrome Options object and
		c.merge(dc); // merge capabilities from chrome profile above, into your own local chrome options profile  
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\stephen.mcnicholas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c); //then provide that local chrome profile into the webdriver constructor 
		driver.get("https://www.path2usa.com/travel-companions");
			
		driver.manage().window().maximize(); // maximises window (to ensure all objects are visible, as some pages show diff objects on minimised window)
		driver.manage().deleteAllCookies(); // does what it says
		driver.manage().deleteCookieNamed("abcd"); // delete specific cookie
		
	}

}
