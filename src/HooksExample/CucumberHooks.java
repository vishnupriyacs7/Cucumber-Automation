package HooksExample;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberHooks {
	@BeforeAll
    public static void beforeAll() {
    	   System.out.println("beforeall");
    }

    // Global hook to run after all scenarios
    @AfterAll
    public static void afterAll() {
    	System.out.println("afterall");
    }

    // Scenario hook to run before each scenario
    @Before
    public static void beforeScenario() {
        System.out.println("Running setup before each scenario...");
    }

    // Scenario hook to run after each scenario
    @After
    public void afterScenario() throws InterruptedException {
        System.out.println("Running cleanup after each scenario...");
    }

    // Step hook to run before each step
    @BeforeStep
    public void beforeStep() {
        System.out.println("Running actions before each step...");
    }

    // Step hook to run after each step
    @AfterStep
    public void afterStep() {
        System.out.println("Running actions after each step...");
    }
    
    @Given("I am on the login page")
	public void i_am_on_the_login_page() {
	    System.out.println("Navigated to login page");
	}
	@When("I enter valid username and password")
	public void i_enter_valid_username_and_password() {
		System.out.println("Entered valid credentials and submitted");
	}
	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() {		  
		        System.out.println("Login successful");
	}
	
	@When("I enter invalid username and password")
	public void i_enter_invalid_username_and_password() {
		    System.out.println("Entered invalid credentials and submitted");
	}
	
	@Then("I should see an error message")
	public void i_should_see_an_error_message() {
	        System.out.println("Error message displayed: ");
	}

}
