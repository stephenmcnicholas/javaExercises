package practice;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowPopup {

	public static void main(String[] args) throws IOException, InterruptedException {

		String projectPath = System.getProperty("user.dir");
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_contents_settings.popups", 0);
		chromePrefs.put("download.default_directory", projectPath);		
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\stephen.mcnicholas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);  
		driver.get("https://altoconvertpdftojpg.com/");
		driver.findElement(By.xpath("//span[@class='g-form-group-title--desktop']")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\stephen.mcnicholas\\eclipse-workspace\\Practice\\fileUpload1.exe");
		System.out.println("file uploaded");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='medium']")));
		driver.findElement(By.cssSelector("button[class*='medium']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download")));
		driver.findElement(By.linkText("Download")).click();
		File f = new File(projectPath + "\\1.jpg");
		Thread.sleep(2000);
		if(f.exists()) {
			System.out.println("file found");
			if(f.delete()) {
				System.out.println("file deleted");
			}
		}
		else {
			System.out.println("no such file exists");
		}
		driver.quit();
	}
}
