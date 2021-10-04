package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class German {
	
	@Test(timeOut=4000)
	public void GreetingGer() {
		System.out.println("guten tag!");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods= {"GreetingGer"})
	public void QuestionGer() {
		System.out.println("Wie gehts?");
	}
	
	@BeforeSuite(groups={"core"})
	public void Introduction() {
		System.out.println("ENTER STAGE LEFT: ");
	}
	
	@AfterMethod
	public void LanguageQueue() {
		System.out.println(" << This was GERMAN");
	}
	
	
}
	