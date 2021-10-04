package Automation.E2EProjectTwo;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPasswd;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

// this is a test script class, so should avoid hardcoding any page objects in this class
// instead create page objects in the LandingPage class, which can be reused by many tests
 
public class HomePage extends Base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(HomePage.class.getName());
	
	@BeforeTest
	public void initialise() throws IOException {
		driver = initialiseDriver(); // call base method to initialise correct driver for chosen browser in prop file
		log.info("1. Driver is initialised");
	}

	@Test(dataProvider = "getData")
	public void validateUserLogins(String username, String password, String accessStatus) throws IOException {

		driver.get(prop.getProperty("url")); // go to URL provided
			log.info("2. Navigated to homepage");
		LandingPage l = new LandingPage(driver); // create landingpage obj
		LoginPage lp = l.getLogin(); // get login via landingpage method and click it, and return landing page object
			log.info("3. Navigated to login page");
		lp.emailField().sendKeys(username); // arguments should be parameterised by dataprovider.
		lp.passwordField().sendKeys(password); // find passwd field and enter password
		lp.loginButton().click(); 				// find login button page obj and click it
			log.info("4. " + accessStatus);
		ForgotPasswd fp = lp.forgotPasswd();  // find forgotpassword link, click it and return forgotcpasswd page object
		fp.emailField().sendKeys(username); // find email field page object and enter username
		fp.sendInstructions().click(); // find sendInstructions page object and click it
	}

	@DataProvider
	public Object[][] getData() {
		// row = how many different iterations of tests we want to run
		// col = data to be provided for each test iteration
		Object[][] data = new Object[2][3]; // e.g. Object[2][3] means 2 iterations of test, and 3 values per test
											// (starts at 0 index)
		// 1st test iteration
		data[0][0] = "unrestrictedUser@email.com";
		data[0][1] = "passwd123";
		data[0][2] = "Unrestricted User";
		// 2nd test iteration
		data[1][0] = "RestrictedUser@email.com";
		data[1][1] = "passwd456";
		data[1][2] = "Restricted User";
		return data;
	}

	@AfterTest
	public void teardown() {
		driver.close();
		log.info("5. Closed browser window");
	}

}
