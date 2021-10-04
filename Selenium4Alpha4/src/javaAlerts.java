import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// set chrome driver and initialise chrome driver 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\stephen.mcnicholas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		String text = "Stephen"; //set text variable to Stephen 
		driver.get("https://rahulshettyacademy.com/AutomationPractice"); // open page
		driver.manage().window().maximize(); //maximise window - changes aspect and objects on page that are clickable
				
		//enter string into alertbox 
		driver.findElement(By.cssSelector("#name")).sendKeys(text);
		
		//Thread.sleep(1000); //optional 1sec wait
		//click on alert button to open popup alert
		driver.findElement(By.id("alertbtn")).click();
		
		Thread.sleep(1000); //optional 1sec wait
		//switch driver context from html to alerts, and accept
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		Thread.sleep(1000); //optional 1sec wait
		driver.switchTo().alert().accept();
		
		Thread.sleep(1000); //optional 1sec wait
		
		//click on confirm button (contains both accept and cancel buttons) and click cancel (dismiss method)
		
		driver.findElement(By.id("confirmbtn")).click(); // click "confirm" button on page
		Thread.sleep(1000); //optional 1sec wait
		System.out.println(driver.switchTo().alert().getText()); //get text from confirm alert and print to console 
				
		Thread.sleep(1000); //optional 1sec wait
		driver.switchTo().alert().dismiss(); //click cancel on confirm alert
		
		
	}

}

