package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class French {
	
	
	@BeforeTest(enabled=false) // scope is for the test tag containing this class in XML
	public void GreetingFre() {
		System.out.println("SPIN UP ENV!!!!");
		System.out.println("bonjour");
	}
	@Parameters({"URL"})
	@Test
	public void QuestionFre(String urlname) {
		System.out.println("C'est va?");
		System.out.println(urlname);
	}
	@Test(groups={"core"})
	public void FarewellFre() {
		System.out.println("au revoir");
	}
	
	@AfterSuite // scope is for the entire test suite in XML 
	public void Introduction() {
		System.out.println("EXIT PURSUED BY A BEAR: ");
	}
	
	
}
	