package Automation.E2EProjectTwo;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.Base;

public class ValidateNavBar extends Base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(ValidateNavBar.class.getName());
	
	@BeforeTest
	public void initialise() throws IOException {
		driver = initialiseDriver(); // call base method to initialise correct driver for chosen browser in prop file
		log.info("Initialised Driver");
		driver.get(prop.getProperty("url")); // go to URL provided
		log.info("Navigated to homepage");
	}

	@Test
	public void validateNavigationBar() {
		LandingPage l = new LandingPage(driver); // create landingpage obj
		// compare browser text with expected value - fail with error if mismatch
		Assert.assertTrue(l.getNavigationBar().isDisplayed());
		log.info("Validated navigation bar is present");
	}

	@AfterTest
	public void teardown() {
		driver.close();
		log.info("Closed browser window");
	}
}
