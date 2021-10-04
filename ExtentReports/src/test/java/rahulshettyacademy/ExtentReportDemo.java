package rahulshettyacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {
	
	ExtentReports extent = new ExtentReports(); // this is the Main reporting class
	
	@BeforeTest
	public void config()
	{
		//ExtentReports, ExtentSparkReporter -> these are key classes for extent reports
		String path = System.getProperty("user.dir")+"\\reports\\index.html"; // user.dir gets path to the current proj dir, then append subdir onto that. 
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Stephen's Web Automation Results");
		reporter.config().setDocumentTitle("Stephen's test results");
				
		extent.attachReporter(reporter);  // we attach the "helper" reporter object to the main class
		extent.setSystemInfo("Tester", "Stephen McNicholas"); // sets some info for the main report class
		
	}
	
	@Test
	public void initialDemo() 
	{
		ExtentTest test = extent.createTest("Initial Demo Test"); // creating test notifies the extent reporting object that a test is being executed
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\stephen.mcnicholas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		driver.close();
		test.fail("results do not match");
		
		extent.flush(); // notifies test is complete and no more monitoring is necessary. Updates status with pass/fail
		
	}
}
