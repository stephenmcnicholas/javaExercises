package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	
	public WebDriver driver;
	public Properties prop;
	public WebDriver initialiseDriver() throws IOException { 
	
		// System.getProperty("user.dir"); //returns project path (up to and incl E2EProject
		//FileInputStream fis = new FileInputStream("C:\\Users\\stephen.mcnicholas\\eclipse-workspace\\E2EProject\\src\\main\\java\\resources\\data.properties");
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties");
		prop = new Properties();
		prop.load(fis);
		//String browser = prop.getProperty("browser"); // pulls property from data.properties file - uncomment this if running from testNG 
		String browser = System.getProperty("browser"); // pulls property from system properties (which is being populated by jenkins via maven) uncomment if running with maven args or jenkins
		
		if(browser.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\java\\resources\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			if(browser.contains("headless")) 
			{
				options.addArguments("headless");	
			}				
			driver=new ChromeDriver(options);
		}
		else if(browser.contains("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\main\\java\\resources\\geckodriver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.contains("IE"))
		{
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\src\\main\\java\\resources\\iedriver64\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else
		{
			System.out.println("No matching browser argument");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}	
	
	public String getScreenshotPath(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver; // takes driver and test case name from failed test
		File source = ts.getScreenshotAs(OutputType.FILE); // returns screenshot as a file object, named source
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png"; // where to store screenshot file, and what to call it
		FileUtils.copyFile(source, new File(destinationFile)); // copies screenshot to destination specified above 
		return destinationFile;
	}
}