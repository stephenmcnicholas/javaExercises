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

public class ValidateTitle extends Base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(ValidateTitle.class.getName());

	@BeforeTest
	public void initialise() throws IOException {
		driver = initialiseDriver(); // call base method to initialise correct driver for chosen browser in prop file
		log.info("1 Driver initialised"); 
		driver.get(prop.getProperty("url")); // go to URL provided
		log.info("2 Navigated to homepage");
	}

	LandingPage l;
	@Test
	public void validatePageText() throws IOException {
		l = new LandingPage(driver); // create landingpage obj
		Assert.assertTrue(l.getTitle().getText().equalsIgnoreCase("Featured Horses"));
		log.info("3. Validated Text on Home Page");
	}

	@Test
	public void validateHeader() throws IOException {
		l = new LandingPage(driver); // create landingpage obj
		Assert.assertTrue(l.getHeader().getText().contains("ACADEMY TO LEARN EVERYTHING ABOUT TESTING"));
		log.info("4. Validated Header Text on Home Page");
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		log.info("5. Closed Browser window");
	}
}
