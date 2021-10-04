package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\stephen.mcnicholas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		int numFrames = driver.findElements(By.tagName("iframe")).size(); // get number of frames in the page and print to screen
		System.out.println(numFrames);
		// three different arguments to pass to the .frame method: frameId, WebElement, Index
		//driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame"))); // example to switch to frame using webElement
		driver.switchTo().frame(0); // switch to frame using Index
		driver.findElement(By.id("draggable")).click();
		
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable")); // store web element of source
		WebElement target = driver.findElement(By.id("droppable"));// store web element of target
		a.dragAndDrop(source, target).build().perform(); // use actions method drag and drop and provide source, target
		driver.switchTo().defaultContent(); // revert focus to main window (out of frame context)
		
	}

}
