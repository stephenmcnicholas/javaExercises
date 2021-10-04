import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AssignmentWebTables {

	public static void main(String[] args)
	{
		// set chrome driver and initialise chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\stephen.mcnicholas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php"); // open page

		// find table (on left hand side of page)
		WebElement table = driver.findElement(By.xpath("//table[@class='table-display']"));
		
		
		// find number of rows in table incl header, and print (11)
		System.out.println(table.findElements(By.tagName("tr")).size());
		
		
		// find number of columns and print (3)
		WebElement row2 = driver.findElement(By.xpath("//table[@class='table-display']/tbody/tr[3]"));
		List<WebElement> contents = row2.findElements(By.xpath("td"));
		int numColumns = contents.size();
		System.out.println(numColumns);
		
		// print second row of data (not incl header)
		
		for(int i = 0; i < numColumns; i++)
		{
			System.out.println(contents.get(i).getText());
		}
		
	}
}
