package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class English {
	
	// can define multiple tests from single class
	@Test // must use this annotation to invoke testNG
	public void GreetingEng() { //testNG tests must be wrapped in methods
		System.out.println("hello");
	}
	
	@AfterTest 
	public void FarewellEng() {
		System.out.println("goodbye");
		System.out.println("TEAR DOWN ENV");
	}
	@Parameters({"URL", "username"})
	@Test 
	public void ParamOverrideTest(String germanUrl, String login) {
		System.out.println("wensite is: " + germanUrl);
		System.out.println("Login is " + login);
	}
	
	
	
}
	