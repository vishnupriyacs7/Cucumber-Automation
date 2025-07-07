package testing30;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	@Given("the user is already registered to the website")
	public void the_user_is_already_registered_to_the_website() {
	    System.out.println("1");
	    
	}
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		System.out.println("2");
	    
	}
	@When("the user inputs the correct email address")
	public void the_user_inputs_the_correct_email_address() {
		System.out.println("3");
	    
	}
	@When("the user inputs the correct password")
	public void the_user_inputs_the_correct_password() {
		System.out.println("4");	   
	}
	@When("the user clicks the Login button")
	public void the_user_clicks_the_login_button() {
		System.out.println("5");
	   
	}
	@Then("the user should be authenticated")
	public void the_user_should_be_authenticated() {
		System.out.println("6");
	}
	@Then("the user should be redirected to their dashboard")
	public void the_user_should_be_redirected_to_their_dashboard() {
		System.out.println("7");
	}
	@Then("the user should be presented with a success message")
	public void the_user_should_be_presented_with_a_success_message() {
		System.out.println("8");
	}

}
