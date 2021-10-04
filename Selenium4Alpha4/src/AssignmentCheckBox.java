import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentCheckBox {

	public static void main(String[] args)
	{
		// set chrome driver and initialise chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\stephen.mcnicholas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php"); // open page

		// select any checkbox
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		
		// grab label value of that checkbox 
		String labelText = driver.findElement(By.xpath("//input[@id='checkBoxOption1']/parent::label")).getText();
		labelText = labelText.trim();
		System.out.println(labelText);
		
		// select dropDown option that matches the label in the checkbox
		Select dropDown = new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		dropDown.selectByVisibleText(labelText);
		
		// enter label text from checkbox into editbox
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(labelText);
		
		// click alert, check popup message, verify if checkbox label is present in popup message
		driver.findElement(By.id("alertbtn")).click();
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		
		if(alertText.contains(labelText)) 
		{
			System.out.println("Success! Alert Text: '" + alertText + "' contains Label Text: '" + labelText + "'");
		}
		else
		{
			System.out.println("Error! Alert Text: '" + alertText + "' does NOT contain Label Text: '" + labelText + "'");
		}
		
	}
}
