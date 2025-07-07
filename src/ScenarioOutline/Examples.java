package ScenarioOutline;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Examples {
	

	@Given("User is on Home Page")
	public void user_is_on_home_page() {
	   System.out.println("homepage");
	}
	@When("User Navigate to LogIn Page")
	public void user_navigate_to_log_in_page() {
		 System.out.println("login");
	}
	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		 System.out.println(username + " , " + password);
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
		 System.out.println("logout successfully");	}


}
