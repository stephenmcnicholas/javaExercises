package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features", // give path to features package if you want to run ALL feature files in the package, or specific feature file 
		glue = "stepdefinition")            // provide package name of StepDefinion class files, ensuring both stepdefinition and features packages are in the same filepath  

public class TestRunner {
	
}
