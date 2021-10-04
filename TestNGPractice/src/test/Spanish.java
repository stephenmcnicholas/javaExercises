package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Spanish {
	
	@Test(groups={"core"})
	public void GreetingSpa() {
		System.out.println("hola");
	}
	
	@Test(groups={"core"})
	public void QuestionSpa() {
		System.out.println("¿Como esta?");
	}
	@Test(groups={"core"}, dataProvider="getData") // pass dataProvider object (defined below) to test
	public void Login(String username, String password) { // we expect 2 values per iteration of test (based on second arg in multidimensional Object
		System.out.println(username); 
		System.out.println(password);
	}
	
	@BeforeMethod // scope is limited to this class
	public void LanguageQueue() {
		System.out.print("SPANISH: ");
	}
	
	@DataProvider()
	public Object[][] getData() {
		// multiple combinations of usernames and pwds
		// define multi-dimensional array, specifying number of times to run the test, and number of values in each run
		Object[][] data = new Object[3][2]; // first arg is number of combinations, second arg is number of values in each comb
		data[0][0] = "stephen.mcnicholas"; // initialise the values in the array
		data[0][1] = "password01";
		data[1][0] = "finnbar.mcnicholas";
		data[1][1] = "password02";
		data[2][0] = "clara.mcnicholas";
		data[2][1] = "password03";
		return data;
	}
	
}
	