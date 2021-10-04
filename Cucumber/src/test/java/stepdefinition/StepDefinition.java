package stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinition {

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
        System.out.println("user navigated to landing page");
    	//throw new PendingException();
    }

    @When("User logs into application with username {string} and password {string}")
    public void user_logs_into_application_with_username_and_password(String string, String string2) {
        //throw new io.cucumber.java.PendingException();
    	System.out.println("username is: " + string);
    	System.out.println("password is: " + string2);
    }
    
    @Then("^Homepage is populated$")
    public void homepage_is_populated() throws Throwable {
        System.out.println("homepage is populated");
        //throw new PendingException();
    }

    @Then("Cards {string} displayed")
    public void cards_displayed(String string) {
        
    	if(string.equals("are")) {
    		System.out.println("Cards ARE displayed");
    	}
    	else if(string.equals("are not")) {
    		System.out.println("Cards are NOT displayed");
    	}
    	else {
    		System.out.println("error with THEN condition");
    	}
    	// Write code here that turns the phrase above into concrete actions
		/*
		 * if(string=="are") { System.out.println("cards are displayed"); } else
		 * if(string=="are not") { System.out.println("cards are NOT displayed"); } else
		 * { System.out.println("error in outcome definition"); }
		 */
        //throw new io.cucumber.java.PendingException();
    }

    
}