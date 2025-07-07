package DataDrivenCucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Sd {
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
	    System.out.println("Home Page");
	}
	@When("User Navigate to LogIn Page")
	public void user_navigate_to_log_in_page() {
		 System.out.println("Login Page");
	}
	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_user_name_and_password(String user,String password) {
		 System.out.println(user + " "+ password);
	}
	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
		 System.out.println("success");
	}
	@When("User LogOut from the Application")
	public void user_log_out_from_the_application() {
	    System.out.println("logout");
	}
	@Then("Message displayed LogOut Successfully")
	public void message_displayed_log_out_successfully() {
		System.out.println("logout successfully");
	}


}
